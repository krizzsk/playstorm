package com.smaato.sdk.nativead.model.p386ub;

import android.util.JsonReader;
import com.smaato.sdk.core.UbErrorReporting;
import com.smaato.sdk.core.log.LogDomain;
import com.smaato.sdk.core.log.Logger;
import com.smaato.sdk.core.p378ad.AdLoader;
import com.smaato.sdk.core.p378ad.AdLoaderException;
import com.smaato.sdk.core.p380ub.AdMarkup;
import com.smaato.sdk.core.p380ub.UbCache;
import com.smaato.sdk.core.p380ub.UbId;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.p382fi.Consumer;
import com.smaato.sdk.nativead.NativeAdRequest;
import com.smaato.sdk.nativead.NativeAdResponse;
import com.smaato.sdk.nativead.model.utils.IconImagesLoader;
import com.smaato.sdk.nativead.model.utils.NativeMultiFormatJsonAdapter;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/* renamed from: com.smaato.sdk.nativead.model.ub.UBRemoteSource */
public class UBRemoteSource {
    private final IconImagesLoader iconImagesLoader;
    private final NativeMultiFormatJsonAdapter jsonAdapter = new NativeMultiFormatJsonAdapter();
    private final Logger logger;
    private final String publisherId;
    private final UbCache ubCache;
    private final UbErrorReporting ubErrorReporting;

    public UBRemoteSource(UbCache ubCache2, UbErrorReporting ubErrorReporting2, IconImagesLoader iconImagesLoader2, Logger logger2, String str) {
        this.iconImagesLoader = iconImagesLoader2;
        this.logger = logger2;
        this.publisherId = str;
        this.ubCache = ubCache2;
        this.ubErrorReporting = ubErrorReporting2;
    }

    public NativeAdResponse loadAdFromUBCache(NativeAdRequest nativeAdRequest, UbId ubId) throws AdLoaderException {
        AdMarkup adMarkup = this.ubCache.get(ubId);
        if (adMarkup != null) {
            NativeAdResponse build = getUBNativeAdResponse(nativeAdRequest, adMarkup.markup()).buildUpon().expiration(adMarkup.expiresAt()).sessionId(adMarkup.sessionId()).impressionCountingType(adMarkup.impressionCountingType()).build();
            if (build.expiration() != null && !build.expiration().isExpired()) {
                return build;
            }
            AdLoaderException adLoaderException = new AdLoaderException(AdLoader.Error.TTL_EXPIRED, new UbCacheException("Cached UB Ad Response has been already expired."));
            Objects.onNotNull(this.ubErrorReporting, new Consumer(UbErrorReporting.Param.builder().setAdSpaceId(nativeAdRequest.adSpaceId()).setPublisherId(this.publisherId).setSessionId(build.sessionId()).build()) {
                public final /* synthetic */ UbErrorReporting.Param f$1;

                {
                    this.f$1 = r2;
                }

                public final void accept(Object obj) {
                    ((UbErrorReporting) obj).report(AdLoaderException.this.getErrorType(), this.f$1);
                }
            });
            throw adLoaderException;
        }
        AdLoaderException adLoaderException2 = new AdLoaderException(AdLoader.Error.NO_AD, new UbCacheException("Cached Ad Response is not found."));
        Objects.onNotNull(this.ubErrorReporting, new Consumer(UbErrorReporting.Param.builder().setAdSpaceId(nativeAdRequest.adSpaceId()).setPublisherId(this.publisherId).build()) {
            public final /* synthetic */ UbErrorReporting.Param f$1;

            {
                this.f$1 = r2;
            }

            public final void accept(Object obj) {
                ((UbErrorReporting) obj).report(AdLoaderException.this.getErrorType(), this.f$1);
            }
        });
        throw adLoaderException2;
    }

    public NativeAdResponse getUBNativeAdResponse(NativeAdRequest nativeAdRequest, String str) throws AdLoaderException {
        try {
            NativeAdResponse fromJson = this.jsonAdapter.fromJson(new JsonReader(new InputStreamReader(new ByteArrayInputStream(str.getBytes()))));
            if (fromJson != null) {
                return !nativeAdRequest.shouldReturnUrlsForImageAssets() ? this.iconImagesLoader.loadIconAndImages(fromJson) : fromJson;
            }
            throw new AdLoaderException(AdLoader.Error.INVALID_RESPONSE, new ParsingException("ad response is null", new Throwable()));
        } catch (IOException e) {
            String format = String.format("Invalid JSON content: %s", new Object[]{str});
            this.logger.error(LogDomain.UNIFIED_BIDDING, e, format, new Object[0]);
            throw new AdLoaderException(AdLoader.Error.INVALID_RESPONSE, new ParsingException(format, e));
        } catch (NumberFormatException e2) {
            String format2 = String.format("Invalid JSON content: %s", new Object[]{str});
            this.logger.error(LogDomain.UNIFIED_BIDDING, e2, format2, new Object[0]);
            throw new AdLoaderException(AdLoader.Error.INVALID_RESPONSE, new ParsingException(format2, e2));
        } catch (Exception e3) {
            this.logger.error(LogDomain.UNIFIED_BIDDING, e3, "Cannot build RichMediaAdResponse due to validation error", new Object[0]);
            throw new AdLoaderException(AdLoader.Error.INVALID_RESPONSE, new ParsingException("Cannot build RichMediaAdResponse due to validation error", e3));
        }
    }

    /* renamed from: com.smaato.sdk.nativead.model.ub.UBRemoteSource$ParsingException */
    public static class ParsingException extends Exception {
        ParsingException(String str, Throwable th) {
            super(str, th);
        }
    }

    /* renamed from: com.smaato.sdk.nativead.model.ub.UBRemoteSource$UbCacheException */
    static final class UbCacheException extends Exception {
        public UbCacheException(String str) {
            super(str);
        }
    }
}

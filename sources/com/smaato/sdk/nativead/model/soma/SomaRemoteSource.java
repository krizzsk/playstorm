package com.smaato.sdk.nativead.model.soma;

import android.util.JsonReader;
import com.smaato.sdk.core.api.ImpressionCountingType;
import com.smaato.sdk.core.log.LogDomain;
import com.smaato.sdk.core.log.Logger;
import com.smaato.sdk.core.network.Headers;
import com.smaato.sdk.core.network.HttpClient;
import com.smaato.sdk.core.network.Request;
import com.smaato.sdk.core.network.Response;
import com.smaato.sdk.core.network.SomaException;
import com.smaato.sdk.nativead.NativeAdRequest;
import com.smaato.sdk.nativead.NativeAdResponse;
import com.smaato.sdk.nativead.model.utils.IconImagesLoader;
import com.smaato.sdk.nativead.model.utils.NativeMultiFormatJsonAdapter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

public class SomaRemoteSource {
    private final IconImagesLoader iconImagesLoader;
    private final NativeMultiFormatJsonAdapter jsonAdapter = new NativeMultiFormatJsonAdapter();
    private final Logger logger;
    private final String somaApiUrl;
    private final HttpClient somaHttpClient;

    public SomaRemoteSource(HttpClient httpClient, String str, IconImagesLoader iconImagesLoader2, Logger logger2) {
        this.somaHttpClient = httpClient.buildUpon().addInterceptor(new NativeAdInterceptor()).build();
        this.somaApiUrl = str;
        this.logger = logger2;
        this.iconImagesLoader = iconImagesLoader2;
    }

    public NativeAdResponse loadAd(NativeAdRequest nativeAdRequest) throws IOException {
        Request request = Request.get(this.somaApiUrl);
        return getNativeAdResponse(nativeAdRequest, request.buildUpon().uri(request.uri().buildUpon().appendQueryParameter("adspace", nativeAdRequest.adSpaceId()).appendQueryParameter("privacyIcon", nativeAdRequest.shouldFetchPrivacy() ? "true" : "false").appendQueryParameter("mnsv", nativeAdRequest.mediationAdapterVersion()).appendQueryParameter("mnn", nativeAdRequest.mediationNetworkName()).appendQueryParameter("mnv", nativeAdRequest.mediationNetworkSdkVersion()).build()).build());
    }

    private NativeAdResponse getNativeAdResponse(NativeAdRequest nativeAdRequest, Request request) throws IOException {
        Response execute = this.somaHttpClient.newCall(request).execute();
        try {
            NativeAdResponse fromJson = this.jsonAdapter.fromJson(new JsonReader(new InputStreamReader(execute.body().source())));
            if (fromJson != null) {
                NativeAdResponse build = fromJson.buildUpon().ttl(Long.valueOf(getTtl(execute.headers()))).impressionCountingType(retrieveImpressionType(execute)).build();
                if (!nativeAdRequest.shouldReturnUrlsForImageAssets()) {
                    build = this.iconImagesLoader.loadIconAndImages(build);
                }
                execute.close();
                return build;
            }
            execute.close();
            throw new SomaException(SomaException.Type.NO_CONTENT, "ad response is null");
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    private long getTtl(Headers headers) {
        List<String> values = headers.values("X-SMT-Expires");
        if (values.isEmpty()) {
            return Long.MAX_VALUE;
        }
        try {
            long parseLong = Long.parseLong(values.get(0));
            List<String> values2 = headers.values("Date");
            if (values2.isEmpty()) {
                return parseLong - System.currentTimeMillis();
            }
            Long decodeHeaderDate = decodeHeaderDate(values2.get(0));
            return parseLong - (decodeHeaderDate == null ? System.currentTimeMillis() : decodeHeaderDate.longValue());
        } catch (NumberFormatException e) {
            this.logger.error(LogDomain.NETWORK, "Error when parsing TTL in header", e);
            return 0;
        }
    }

    private Long decodeHeaderDate(String str) {
        if (str == null) {
            return null;
        }
        try {
            Date parse = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss zzz", new Locale("en", "US", "POSIX")).parse(str);
            if (parse != null) {
                return Long.valueOf(parse.getTime());
            }
            return null;
        } catch (ParseException e) {
            this.logger.error(LogDomain.NATIVE, "date parse error", e);
            return null;
        }
    }

    private ImpressionCountingType retrieveImpressionType(Response response) {
        if (getImpressionTypeHeaderValue(response) != null) {
            return ImpressionCountingType.VIEWABLE;
        }
        this.logger.debug(LogDomain.API, "No X-SMT-Impression-Measurement header in ad response. Using standard impression type.", new Object[0]);
        return ImpressionCountingType.STANDARD;
    }

    private String getImpressionTypeHeaderValue(Response response) {
        List<String> values = response.headers().values("X-SMT-Impression-Measurement");
        if (values.isEmpty()) {
            return null;
        }
        return values.get(0);
    }
}

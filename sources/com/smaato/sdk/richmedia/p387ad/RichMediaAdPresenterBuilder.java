package com.smaato.sdk.richmedia.p387ad;

import com.smaato.sdk.core.api.ApiAdResponse;
import com.smaato.sdk.core.api.SomaApiContext;
import com.smaato.sdk.core.flow.Action1;
import com.smaato.sdk.core.flow.Flow;
import com.smaato.sdk.core.flow.Function1;
import com.smaato.sdk.core.log.LogDomain;
import com.smaato.sdk.core.log.Logger;
import com.smaato.sdk.core.p378ad.AdPresenter;
import com.smaato.sdk.core.p378ad.AdPresenterBuilder;
import com.smaato.sdk.core.p378ad.AdPresenterBuilderException;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.p382fi.Function;
import com.smaato.sdk.richmedia.p387ad.LoadedWebViewCache;
import com.smaato.sdk.richmedia.p387ad.RichMediaAdObject;
import com.smaato.sdk.richmedia.widget.RichMediaWebView;
import java.util.concurrent.Callable;

/* renamed from: com.smaato.sdk.richmedia.ad.RichMediaAdPresenterBuilder */
abstract class RichMediaAdPresenterBuilder<Presenter extends AdPresenter> implements AdPresenterBuilder {
    private final Logger logger;
    private final Function<RichMediaAdInteractor, Presenter> presenterProviderFunction;
    private final Function<RichMediaAdObject, RichMediaAdInteractor> richMediaAdInteractorProviderFunction;
    private final RichMediaAdResponseParser richMediaAdResponseParser;
    private final WebViewRenderer richMediaRenderer;
    private final LoadedWebViewCache webViewCache;

    /* JADX WARNING: type inference failed for: r3v0, types: [java.lang.Object, com.smaato.sdk.core.util.fi.Function<com.smaato.sdk.richmedia.ad.RichMediaAdObject, com.smaato.sdk.richmedia.ad.RichMediaAdInteractor>] */
    /* JADX WARNING: type inference failed for: r4v0, types: [java.lang.Object, com.smaato.sdk.core.util.fi.Function<com.smaato.sdk.richmedia.ad.RichMediaAdInteractor, Presenter>] */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    RichMediaAdPresenterBuilder(com.smaato.sdk.core.log.Logger r1, com.smaato.sdk.richmedia.p387ad.RichMediaAdResponseParser r2, com.smaato.sdk.core.util.p382fi.Function<com.smaato.sdk.richmedia.p387ad.RichMediaAdObject, com.smaato.sdk.richmedia.p387ad.RichMediaAdInteractor> r3, com.smaato.sdk.core.util.p382fi.Function<com.smaato.sdk.richmedia.p387ad.RichMediaAdInteractor, Presenter> r4, com.smaato.sdk.richmedia.p387ad.WebViewRenderer r5, com.smaato.sdk.richmedia.p387ad.LoadedWebViewCache r6) {
        /*
            r0 = this;
            r0.<init>()
            java.lang.Object r1 = com.smaato.sdk.core.util.Objects.requireNonNull(r1)
            com.smaato.sdk.core.log.Logger r1 = (com.smaato.sdk.core.log.Logger) r1
            r0.logger = r1
            java.lang.Object r1 = com.smaato.sdk.core.util.Objects.requireNonNull(r2)
            com.smaato.sdk.richmedia.ad.RichMediaAdResponseParser r1 = (com.smaato.sdk.richmedia.p387ad.RichMediaAdResponseParser) r1
            r0.richMediaAdResponseParser = r1
            java.lang.Object r1 = com.smaato.sdk.core.util.Objects.requireNonNull(r3)
            com.smaato.sdk.core.util.fi.Function r1 = (com.smaato.sdk.core.util.p382fi.Function) r1
            r0.richMediaAdInteractorProviderFunction = r1
            java.lang.Object r1 = com.smaato.sdk.core.util.Objects.requireNonNull(r4)
            com.smaato.sdk.core.util.fi.Function r1 = (com.smaato.sdk.core.util.p382fi.Function) r1
            r0.presenterProviderFunction = r1
            java.lang.Object r1 = com.smaato.sdk.core.util.Objects.requireNonNull(r5)
            com.smaato.sdk.richmedia.ad.WebViewRenderer r1 = (com.smaato.sdk.richmedia.p387ad.WebViewRenderer) r1
            r0.richMediaRenderer = r1
            java.lang.Object r1 = com.smaato.sdk.core.util.Objects.requireNonNull(r6)
            com.smaato.sdk.richmedia.ad.LoadedWebViewCache r1 = (com.smaato.sdk.richmedia.p387ad.LoadedWebViewCache) r1
            r0.webViewCache = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.smaato.sdk.richmedia.p387ad.RichMediaAdPresenterBuilder.<init>(com.smaato.sdk.core.log.Logger, com.smaato.sdk.richmedia.ad.RichMediaAdResponseParser, com.smaato.sdk.core.util.fi.Function, com.smaato.sdk.core.util.fi.Function, com.smaato.sdk.richmedia.ad.WebViewRenderer, com.smaato.sdk.richmedia.ad.LoadedWebViewCache):void");
    }

    public void buildAdPresenter(SomaApiContext somaApiContext, AdPresenterBuilder.Listener listener) {
        Objects.requireNonNull(somaApiContext);
        parseResponse(somaApiContext.getApiAdResponse()).flatMap(new Function1(somaApiContext) {
            public final /* synthetic */ SomaApiContext f$1;

            {
                this.f$1 = r2;
            }

            public final Object apply(Object obj) {
                return RichMediaAdPresenterBuilder.this.lambda$buildAdPresenter$0$RichMediaAdPresenterBuilder(this.f$1, (RichMediaAdResponse) obj);
            }
        }).subscribe(new Action1(listener) {
            public final /* synthetic */ AdPresenterBuilder.Listener f$1;

            {
                this.f$1 = r2;
            }

            public final void invoke(Object obj) {
                RichMediaAdPresenterBuilder.this.lambda$buildAdPresenter$1$RichMediaAdPresenterBuilder(this.f$1, (AdPresenter) obj);
            }
        }, (Action1<? super Throwable>) new Action1(listener) {
            public final /* synthetic */ AdPresenterBuilder.Listener f$1;

            {
                this.f$1 = r2;
            }

            public final void invoke(Object obj) {
                RichMediaAdPresenterBuilder.this.lambda$buildAdPresenter$2$RichMediaAdPresenterBuilder(this.f$1, (Throwable) obj);
            }
        });
    }

    public /* synthetic */ void lambda$buildAdPresenter$1$RichMediaAdPresenterBuilder(AdPresenterBuilder.Listener listener, AdPresenter adPresenter) throws Throwable {
        listener.onAdPresenterBuildSuccess(this, adPresenter);
    }

    public /* synthetic */ void lambda$buildAdPresenter$2$RichMediaAdPresenterBuilder(AdPresenterBuilder.Listener listener, Throwable th) throws Throwable {
        AdPresenterBuilderException adPresenterBuilderException;
        if (th instanceof AdPresenterBuilderException) {
            adPresenterBuilderException = (AdPresenterBuilderException) th;
        } else {
            adPresenterBuilderException = new AdPresenterBuilderException(AdPresenterBuilder.Error.GENERIC, (Exception) th);
        }
        listener.onAdPresenterBuildError(this, adPresenterBuilderException);
    }

    private Flow<RichMediaAdResponse> parseResponse(ApiAdResponse apiAdResponse) {
        return Flow.fromCallable(new Callable(apiAdResponse) {
            public final /* synthetic */ ApiAdResponse f$1;

            {
                this.f$1 = r2;
            }

            public final Object call() {
                return RichMediaAdPresenterBuilder.this.lambda$parseResponse$3$RichMediaAdPresenterBuilder(this.f$1);
            }
        }).switchIfError(C11231x856c3162.INSTANCE).doOnError(new Action1(apiAdResponse) {
            public final /* synthetic */ ApiAdResponse f$1;

            {
                this.f$1 = r2;
            }

            public final void invoke(Object obj) {
                RichMediaAdPresenterBuilder.this.lambda$parseResponse$5$RichMediaAdPresenterBuilder(this.f$1, (Throwable) obj);
            }
        });
    }

    public /* synthetic */ RichMediaAdResponse lambda$parseResponse$3$RichMediaAdPresenterBuilder(ApiAdResponse apiAdResponse) throws Exception {
        return this.richMediaAdResponseParser.parseResponse(new String(apiAdResponse.getBody(), apiAdResponse.getCharset()), apiAdResponse.getImpressionCountingType());
    }

    public /* synthetic */ void lambda$parseResponse$5$RichMediaAdPresenterBuilder(ApiAdResponse apiAdResponse, Throwable th) throws Throwable {
        this.logger.error(LogDomain.AD, th, "Invalid AdResponse: %s", apiAdResponse);
    }

    /* access modifiers changed from: private */
    /* renamed from: prepareAdPresenter */
    public Flow<Presenter> lambda$buildAdPresenter$0$RichMediaAdPresenterBuilder(RichMediaAdResponse richMediaAdResponse, SomaApiContext somaApiContext) {
        return this.richMediaRenderer.render(richMediaAdResponse.getContent(), somaApiContext.getApiAdRequest()).map(new Function1(somaApiContext, richMediaAdResponse) {
            public final /* synthetic */ SomaApiContext f$1;
            public final /* synthetic */ RichMediaAdResponse f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final Object apply(Object obj) {
                return RichMediaAdPresenterBuilder.this.lambda$prepareAdPresenter$6$RichMediaAdPresenterBuilder(this.f$1, this.f$2, (RichMediaWebView) obj);
            }
        }).map(new Function1() {
            public final Object apply(Object obj) {
                return RichMediaAdPresenterBuilder.this.lambda$prepareAdPresenter$7$RichMediaAdPresenterBuilder((RichMediaAdObject) obj);
            }
        }).switchIfError(C11228x5f3f1f6b.INSTANCE).doOnError(new Action1() {
            public final void invoke(Object obj) {
                RichMediaAdPresenterBuilder.this.lambda$prepareAdPresenter$9$RichMediaAdPresenterBuilder((Throwable) obj);
            }
        });
    }

    public /* synthetic */ RichMediaAdObject lambda$prepareAdPresenter$6$RichMediaAdPresenterBuilder(SomaApiContext somaApiContext, RichMediaAdResponse richMediaAdResponse, RichMediaWebView richMediaWebView) throws Throwable {
        String sessionId = somaApiContext.getApiAdResponse().getSessionId();
        RichMediaAdObject build = new RichMediaAdObject.Builder().setSomaApiContext(somaApiContext).setWidth(richMediaAdResponse.getWidth()).setHeight(richMediaAdResponse.getHeight()).setContent(richMediaAdResponse.getContent()).setClickTrackingUrls(richMediaAdResponse.getClickTrackingUrls()).setImpressionTrackingUrls(richMediaAdResponse.getImpressionTrackingUrls()).setExtensions(richMediaAdResponse.getExtensions()).setWebViewKey(sessionId).setImpressionCountingType(richMediaAdResponse.getImpressionCountingType()).build();
        this.webViewCache.save(sessionId, LoadedWebViewCache.Item.create(richMediaWebView, build));
        return build;
    }

    public /* synthetic */ AdPresenter lambda$prepareAdPresenter$7$RichMediaAdPresenterBuilder(RichMediaAdObject richMediaAdObject) throws Throwable {
        return (AdPresenter) this.presenterProviderFunction.apply(this.richMediaAdInteractorProviderFunction.apply(richMediaAdObject));
    }

    public /* synthetic */ void lambda$prepareAdPresenter$9$RichMediaAdPresenterBuilder(Throwable th) throws Throwable {
        this.logger.error(LogDomain.AD, th, "Failed to build AdPresenter", new Object[0]);
    }
}

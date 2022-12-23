package com.smaato.sdk.richmedia.p387ad;

import android.content.Context;
import com.smaato.sdk.core.api.ApiAdRequest;
import com.smaato.sdk.core.api.ApiParams;
import com.smaato.sdk.core.flow.Action1;
import com.smaato.sdk.core.flow.Emitter;
import com.smaato.sdk.core.flow.Flow;
import com.smaato.sdk.core.flow.Schedulers;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.richmedia.mraid.RichMediaWebViewFactory;
import com.smaato.sdk.richmedia.mraid.dataprovider.MraidEnvironmentProperties;
import com.smaato.sdk.richmedia.widget.RichMediaWebView;
import com.smaato.sdk.richmedia.widget.RichMediaWebViewCallbackAdapter;
import java.io.IOException;

/* renamed from: com.smaato.sdk.richmedia.ad.WebViewRendererImpl */
final class WebViewRendererImpl implements WebViewRenderer {
    private final ApiParams apiParams;
    private final Context context;
    private final Schedulers executors;
    private final RichMediaWebViewFactory webViewFactory;

    WebViewRendererImpl(Context context2, Schedulers schedulers, RichMediaWebViewFactory richMediaWebViewFactory, ApiParams apiParams2) {
        this.context = (Context) Objects.requireNonNull(context2);
        this.executors = (Schedulers) Objects.requireNonNull(schedulers);
        this.webViewFactory = (RichMediaWebViewFactory) Objects.requireNonNull(richMediaWebViewFactory);
        this.apiParams = apiParams2;
    }

    public Flow<RichMediaWebView> render(String str, ApiAdRequest apiAdRequest) {
        return Flow.create(new Action1(str) {
            public final /* synthetic */ String f$1;

            {
                this.f$1 = r2;
            }

            public final void invoke(Object obj) {
                WebViewRendererImpl.this.lambda$render$0$WebViewRendererImpl(this.f$1, (Emitter) obj);
            }
        }).subscribeOn(this.executors.main());
    }

    public /* synthetic */ void lambda$render$0$WebViewRendererImpl(String str, final Emitter emitter) throws Throwable {
        MraidEnvironmentProperties build = new MraidEnvironmentProperties.Builder(this.context.getPackageName(), this.apiParams).build();
        final RichMediaWebView create = this.webViewFactory.create(this.context);
        create.loadData(str, build);
        create.setCallback(new RichMediaWebViewCallbackAdapter() {
            public void onWebViewLoaded() {
                create.setCallback((RichMediaWebView.Callback) null);
                emitter.onNext(create);
            }

            public void onError() {
                create.setCallback((RichMediaWebView.Callback) null);
                emitter.onError(new IOException("Failed to render HTML into the WebView"));
            }
        });
    }
}

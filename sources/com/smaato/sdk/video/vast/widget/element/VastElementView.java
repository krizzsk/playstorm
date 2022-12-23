package com.smaato.sdk.video.vast.widget.element;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.StubOnGestureListener;
import com.smaato.sdk.core.util.Threads;
import com.smaato.sdk.core.util.p382fi.Consumer;
import com.smaato.sdk.core.webview.BaseWebView;
import com.smaato.sdk.core.webview.BaseWebViewClient;
import com.smaato.sdk.core.webview.WebViewClientCallbackAdapter;

public class VastElementView extends BaseWebView {
    /* access modifiers changed from: private */
    public Runnable clickTask;
    /* access modifiers changed from: private */
    public final Handler delayHandler = Threads.newUiHandler();
    private boolean isLoaded = false;
    /* access modifiers changed from: private */
    public VastElementPresenter presenter;
    /* access modifiers changed from: private */
    public boolean webViewClicked = false;
    private final BaseWebViewClient webViewClient = new BaseWebViewClient();
    private final BaseWebViewClient.WebViewClientCallback webViewClientCallback = new WebViewClientCallbackAdapter() {
        public boolean shouldOverrideUrlLoading(String str) {
            if (VastElementView.this.webViewClicked) {
                if (VastElementView.this.clickTask != null) {
                    VastElementView.this.delayHandler.removeCallbacks(VastElementView.this.clickTask);
                    Runnable unused = VastElementView.this.clickTask = null;
                }
                VastElementView.this.onWebViewClicked(str);
                boolean unused2 = VastElementView.this.webViewClicked = false;
                return true;
            } else if (VastElementView.this.presenter == null || !VastElementView.this.presenter.isValidUrl(str)) {
                return true;
            } else {
                return false;
            }
        }

        public void onPageFinishedLoading(String str) {
            VastElementView.this.onContentLoaded();
        }

        public void onHttpError(WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
            VastElementView.this.onContentLoadingError(String.format("VastElementView WebViewClientHTTP HTTP Error. Request: %s; Error Response: %s", new Object[]{webResourceRequest, webResourceResponse}));
        }

        public void onGeneralError(int i, String str, String str2) {
            VastElementView.this.onContentLoadingError(String.format("VastElementView WebViewClientHTTP General Error. code: %s; description: %s; url: %s", new Object[]{Integer.valueOf(i), str, str2}));
        }

        public void onRenderProcessGone() {
            Objects.onNotNull(VastElementView.this.presenter, $$Lambda$E90SmWMjzssnZ_rzw1WO3aCUDk.INSTANCE);
        }
    };

    public VastElementView(Context context) {
        super(context);
        init();
    }

    public VastElementView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init();
    }

    private void init() {
        disableScrollingAndZoom();
        getSettings().setJavaScriptEnabled(true);
        this.webViewClient.setWebViewClientCallback(this.webViewClientCallback);
        setWebViewClient(this.webViewClient);
        setBackgroundColor(0);
        initClickDetector();
    }

    private void initClickDetector() {
        setOnTouchListener(new View.OnTouchListener(new GestureDetector(getContext(), new StubOnGestureListener() {
            public boolean onSingleTapUp(MotionEvent motionEvent) {
                boolean unused = VastElementView.this.webViewClicked = true;
                VastElementView.this.clickWithDelay();
                return true;
            }
        })) {
            public final /* synthetic */ GestureDetector f$0;

            {
                this.f$0 = r1;
            }

            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return this.f$0.onTouchEvent(motionEvent);
            }
        });
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Objects.onNotNull(this.presenter, new Consumer() {
            public final void accept(Object obj) {
                VastElementView.this.lambda$onAttachedToWindow$1$VastElementView((VastElementPresenter) obj);
            }
        });
    }

    public /* synthetic */ void lambda$onAttachedToWindow$1$VastElementView(VastElementPresenter vastElementPresenter) {
        vastElementPresenter.attachView(this);
    }

    /* access modifiers changed from: protected */
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Objects.onNotNull(this.presenter, $$Lambda$3Byxabq5gXMIvgW7YAGdm8FLRAk.INSTANCE);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Objects.onNotNull(this.presenter, $$Lambda$Wo29_FbsJyHmihEgfg7YrSdOlk.INSTANCE);
        this.isLoaded = false;
    }

    public void setSize(int i, int i2) {
        Threads.runOnUi(new Runnable(i, i2) {
            public final /* synthetic */ int f$1;
            public final /* synthetic */ int f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void run() {
                VastElementView.this.lambda$setSize$2$VastElementView(this.f$1, this.f$2);
            }
        });
    }

    public /* synthetic */ void lambda$setSize$2$VastElementView(int i, int i2) {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        layoutParams.width = i;
        layoutParams.height = i2;
        setLayoutParams(layoutParams);
    }

    /* access modifiers changed from: private */
    public void clickWithDelay() {
        if (this.clickTask == null) {
            $$Lambda$VastElementView$zTyMB98OscV20lj7ZndaxAjz74 r0 = new Runnable() {
                public final void run() {
                    VastElementView.this.lambda$clickWithDelay$3$VastElementView();
                }
            };
            this.clickTask = r0;
            this.delayHandler.postDelayed(r0, 100);
        }
    }

    public /* synthetic */ void lambda$clickWithDelay$3$VastElementView() {
        onWebViewClicked((String) null);
        this.clickTask = null;
    }

    public void setPresenter(VastElementPresenter vastElementPresenter) {
        this.presenter = vastElementPresenter;
    }

    public void load(String str) {
        Threads.runOnUi(new Runnable(str) {
            public final /* synthetic */ String f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                VastElementView.this.lambda$load$4$VastElementView(this.f$1);
            }
        });
    }

    public /* synthetic */ void lambda$load$4$VastElementView(String str) {
        if (!this.isLoaded) {
            Objects.onNotNull(this.presenter, $$Lambda$V722nDEY5huhN81wli5TVgQa388.INSTANCE);
            loadHtml(str);
        }
    }

    /* access modifiers changed from: protected */
    public void onWebViewClicked(String str) {
        Objects.onNotNull(this.presenter, new Consumer(str) {
            public final /* synthetic */ String f$0;

            {
                this.f$0 = r1;
            }

            public final void accept(Object obj) {
                ((VastElementPresenter) obj).onClicked(this.f$0);
            }
        });
    }

    /* access modifiers changed from: protected */
    public void onContentLoaded() {
        if (!this.isLoaded) {
            this.isLoaded = true;
            Objects.onNotNull(this.presenter, $$Lambda$l282i90sTPHwuuRhgN3TLQFYyI.INSTANCE);
        }
    }

    /* access modifiers changed from: protected */
    public void onContentLoadingError(String str) {
        Objects.onNotNull(this.presenter, new Consumer(str) {
            public final /* synthetic */ String f$0;

            {
                this.f$0 = r1;
            }

            public final void accept(Object obj) {
                ((VastElementPresenter) obj).onError(new VastElementLoadingException(this.f$0));
            }
        });
    }

    private void disableScrollingAndZoom() {
        setHorizontalScrollBarEnabled(false);
        setHorizontalScrollbarOverlay(false);
        setVerticalScrollBarEnabled(false);
        setVerticalScrollbarOverlay(false);
        getSettings().setSupportZoom(false);
        setScrollBarStyle(0);
    }
}

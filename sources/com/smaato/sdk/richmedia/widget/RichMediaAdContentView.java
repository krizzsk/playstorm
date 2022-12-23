package com.smaato.sdk.richmedia.widget;

import android.content.Context;
import android.os.Handler;
import android.view.View;
import android.webkit.URLUtil;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import com.smaato.sdk.core.log.LogDomain;
import com.smaato.sdk.core.log.Logger;
import com.smaato.sdk.core.p381ui.AdContentView;
import com.smaato.sdk.core.p381ui.ProgressView;
import com.smaato.sdk.core.p381ui.WatermarkImageButton;
import com.smaato.sdk.core.util.TextUtils;
import com.smaato.sdk.core.util.Threads;
import com.smaato.sdk.core.util.UIUtils;
import com.smaato.sdk.core.util.ViewUtils;
import com.smaato.sdk.core.util.Whatever;
import com.smaato.sdk.core.util.p382fi.BiConsumer;
import com.smaato.sdk.core.util.p382fi.Consumer;
import com.smaato.sdk.richmedia.C11182R;
import com.smaato.sdk.richmedia.mraid.RichMediaWebViewFactory;
import com.smaato.sdk.richmedia.mraid.Views;
import com.smaato.sdk.richmedia.mraid.dataprovider.MraidEnvironmentProperties;
import com.smaato.sdk.richmedia.mraid.dataprovider.MraidExpandProperties;
import com.smaato.sdk.richmedia.mraid.mvp.BaseView;
import com.smaato.sdk.richmedia.mraid.presenter.MraidPresenter;
import com.smaato.sdk.richmedia.mraid.presenter.ResizeParams;
import com.smaato.sdk.richmedia.p387ad.RichMediaAdObject;
import com.smaato.sdk.richmedia.widget.ExpandManager;
import com.smaato.sdk.richmedia.widget.ResizeManager;
import com.smaato.sdk.richmedia.widget.RichMediaAdContentView;
import com.smaato.sdk.richmedia.widget.RichMediaWebView;
import java.util.Objects;

public final class RichMediaAdContentView extends AdContentView implements BaseView {
    private final FrameLayout content;
    private ExpandManager expandManager;
    /* access modifiers changed from: private */
    public final Logger logger;
    /* access modifiers changed from: private */
    public final MraidPresenter mraidPresenter;
    private ResizeManager resizeManager;
    private final String richMediaCreative;
    /* access modifiers changed from: private */
    public final Callback richMediaViewCallback;
    /* access modifiers changed from: private */
    public RichMediaWebView twoPartWebView;
    /* access modifiers changed from: private */
    public final RichMediaWebView webView;
    private final RichMediaWebViewFactory webViewFactory;

    public interface Callback {
        void onAdCollapsed(RichMediaAdContentView richMediaAdContentView);

        void onAdExpanded(RichMediaAdContentView richMediaAdContentView);

        void onAdResized(RichMediaAdContentView richMediaAdContentView);

        void onAdViolation(String str, String str2);

        void onHidden(RichMediaAdContentView richMediaAdContentView);

        void onPlayVideo(RichMediaAdContentView richMediaAdContentView, String str);

        void onRenderProcessGone(RichMediaAdContentView richMediaAdContentView);

        void onUnloadView(RichMediaAdContentView richMediaAdContentView);

        void onUrlClicked(RichMediaAdContentView richMediaAdContentView, String str);

        void onWebViewLoaded(RichMediaAdContentView richMediaAdContentView);

        void registerFriendlyObstruction(View view);

        void removeFriendlyObstruction(View view);

        void updateAdView(RichMediaWebView richMediaWebView);
    }

    private RichMediaAdContentView(Logger logger2, Context context, String str, Callback callback, RichMediaWebViewFactory richMediaWebViewFactory, RichMediaWebView richMediaWebView, MraidPresenter mraidPresenter2, int i, int i2) {
        super(context);
        this.logger = logger2;
        this.richMediaCreative = str;
        this.richMediaViewCallback = callback;
        this.webViewFactory = richMediaWebViewFactory;
        this.mraidPresenter = mraidPresenter2;
        this.webView = richMediaWebView;
        i = i > 0 ? UIUtils.dpToPx(context, (float) i) : i;
        i2 = i2 > 0 ? UIUtils.dpToPx(context, (float) i2) : i2;
        FrameLayout frameLayout = new FrameLayout(context);
        this.content = frameLayout;
        addView(frameLayout, AdContentView.generateDefaultLayoutParams(i, i2));
        richMediaWebView.setCallback(createRichMediaWebViewCallback());
        richMediaWebView.setId(C11182R.C11184id.webView);
        frameLayout.addView(richMediaWebView, new FrameLayout.LayoutParams(-1, -1));
        frameLayout.addView(new WatermarkImageButton(getContext()));
        setLayoutParams(new FrameLayout.LayoutParams(i, i2, 17));
        mraidPresenter2.setOnExpandCallback(new BiConsumer(richMediaWebView) {
            public final /* synthetic */ RichMediaWebView f$1;

            {
                this.f$1 = r2;
            }

            public final void accept(Object obj, Object obj2) {
                RichMediaAdContentView.this.lambda$new$0$RichMediaAdContentView(this.f$1, (String) obj, (MraidExpandProperties) obj2);
            }
        });
        mraidPresenter2.setOnOpenCallback(new Consumer(richMediaWebView, callback) {
            public final /* synthetic */ RichMediaWebView f$1;
            public final /* synthetic */ RichMediaAdContentView.Callback f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void accept(Object obj) {
                RichMediaAdContentView.this.lambda$new$1$RichMediaAdContentView(this.f$1, this.f$2, (String) obj);
            }
        });
        mraidPresenter2.setOnPlayVideoCallback(new Consumer(richMediaWebView, callback) {
            public final /* synthetic */ RichMediaWebView f$1;
            public final /* synthetic */ RichMediaAdContentView.Callback f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void accept(Object obj) {
                RichMediaAdContentView.this.lambda$new$2$RichMediaAdContentView(this.f$1, this.f$2, (String) obj);
            }
        });
        mraidPresenter2.setOnUnloadCallback(new Consumer(callback) {
            public final /* synthetic */ RichMediaAdContentView.Callback f$1;

            {
                this.f$1 = r2;
            }

            public final void accept(Object obj) {
                RichMediaAdContentView.this.lambda$new$3$RichMediaAdContentView(this.f$1, (Whatever) obj);
            }
        });
        mraidPresenter2.setResizeCallback(new Consumer(richMediaWebView) {
            public final /* synthetic */ RichMediaWebView f$1;

            {
                this.f$1 = r2;
            }

            public final void accept(Object obj) {
                RichMediaAdContentView.this.lambda$new$4$RichMediaAdContentView(this.f$1, (ResizeParams) obj);
            }
        });
        mraidPresenter2.setOnCollapseCallback(new Consumer() {
            public final void accept(Object obj) {
                RichMediaAdContentView.this.lambda$new$5$RichMediaAdContentView((Whatever) obj);
            }
        });
        mraidPresenter2.setOnHideCallback(new Consumer(callback) {
            public final /* synthetic */ RichMediaAdContentView.Callback f$1;

            {
                this.f$1 = r2;
            }

            public final void accept(Object obj) {
                RichMediaAdContentView.this.lambda$new$6$RichMediaAdContentView(this.f$1, (Whatever) obj);
            }
        });
        Objects.requireNonNull(callback);
        mraidPresenter2.setAdViolationCallback(new BiConsumer() {
            public final void accept(Object obj, Object obj2) {
                RichMediaAdContentView.Callback.this.onAdViolation((String) obj, (String) obj2);
            }
        });
    }

    public /* synthetic */ void lambda$new$0$RichMediaAdContentView(RichMediaWebView richMediaWebView, String str, MraidExpandProperties mraidExpandProperties) {
        richMediaWebView.resetClickedFlag();
        expand(str);
    }

    public /* synthetic */ void lambda$new$1$RichMediaAdContentView(RichMediaWebView richMediaWebView, Callback callback, String str) {
        richMediaWebView.resetClickedFlag();
        callback.onUrlClicked(this, str);
    }

    public /* synthetic */ void lambda$new$2$RichMediaAdContentView(RichMediaWebView richMediaWebView, Callback callback, String str) {
        richMediaWebView.resetClickedFlag();
        callback.onPlayVideo(this, str);
    }

    public /* synthetic */ void lambda$new$3$RichMediaAdContentView(Callback callback, Whatever whatever) {
        callback.onUnloadView(this);
    }

    public /* synthetic */ void lambda$new$4$RichMediaAdContentView(RichMediaWebView richMediaWebView, ResizeParams resizeParams) {
        richMediaWebView.resetClickedFlag();
        resize(resizeParams);
    }

    public /* synthetic */ void lambda$new$5$RichMediaAdContentView(Whatever whatever) {
        restoreDefaultSize();
    }

    public /* synthetic */ void lambda$new$6$RichMediaAdContentView(Callback callback, Whatever whatever) {
        callback.onHidden(this);
    }

    public static RichMediaAdContentView create(Logger logger2, Context context, RichMediaAdObject richMediaAdObject, Callback callback, RichMediaWebViewFactory richMediaWebViewFactory, RichMediaWebView richMediaWebView, MraidPresenter mraidPresenter2) {
        com.smaato.sdk.core.util.Objects.requireNonNull(richMediaAdObject);
        return new RichMediaAdContentView((Logger) com.smaato.sdk.core.util.Objects.requireNonNull(logger2), (Context) com.smaato.sdk.core.util.Objects.requireNonNull(context), (String) com.smaato.sdk.core.util.Objects.requireNonNull(richMediaAdObject.getContent()), (Callback) com.smaato.sdk.core.util.Objects.requireNonNull(callback), (RichMediaWebViewFactory) com.smaato.sdk.core.util.Objects.requireNonNull(richMediaWebViewFactory), (RichMediaWebView) com.smaato.sdk.core.util.Objects.requireNonNull(richMediaWebView), (MraidPresenter) com.smaato.sdk.core.util.Objects.requireNonNull(mraidPresenter2), richMediaAdObject.getWidth(), richMediaAdObject.getHeight());
    }

    public static RichMediaAdContentView create(Logger logger2, Context context, String str, Callback callback, RichMediaWebViewFactory richMediaWebViewFactory, RichMediaWebView richMediaWebView, MraidPresenter mraidPresenter2) {
        return new RichMediaAdContentView((Logger) com.smaato.sdk.core.util.Objects.requireNonNull(logger2), (Context) com.smaato.sdk.core.util.Objects.requireNonNull(context), (String) com.smaato.sdk.core.util.Objects.requireNonNull(str), (Callback) com.smaato.sdk.core.util.Objects.requireNonNull(callback), (RichMediaWebViewFactory) com.smaato.sdk.core.util.Objects.requireNonNull(richMediaWebViewFactory), (RichMediaWebView) com.smaato.sdk.core.util.Objects.requireNonNull(richMediaWebView), (MraidPresenter) com.smaato.sdk.core.util.Objects.requireNonNull(mraidPresenter2), -1, -1);
    }

    public void startWebViewLoading(MraidEnvironmentProperties mraidEnvironmentProperties) {
        Threads.ensureMainThread();
        this.webView.loadData(this.richMediaCreative, mraidEnvironmentProperties);
    }

    public void showProgressIndicator(boolean z) {
        Threads.ensureMainThread();
        if (z) {
            this.content.addView(new ProgressView(getContext()));
            return;
        }
        this.content.removeView((ProgressView) this.content.findViewById(C11182R.C11184id.smaato_sdk_core_progress_view_id));
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.mraidPresenter.attachView(this);
        this.richMediaViewCallback.onWebViewLoaded(this);
        this.mraidPresenter.onHtmlLoaded();
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.mraidPresenter.detachView();
    }

    public void destroy() {
        Threads.ensureMainThread();
        restoreDefaultSize();
        com.smaato.sdk.core.util.Objects.onNotNull(this.twoPartWebView, $$Lambda$yTIGBfm0jm_ViFU6QKdQMNCjZXU.INSTANCE);
        this.mraidPresenter.destroy();
        Handler newUiHandler = Threads.newUiHandler();
        RichMediaWebView richMediaWebView = this.webView;
        Objects.requireNonNull(richMediaWebView);
        newUiHandler.postDelayed(new Runnable() {
            public final void run() {
                RichMediaWebView.this.destroy();
            }
        }, 1000);
    }

    public RichMediaWebView getWebView() {
        return this.webView;
    }

    private void expand(String str) {
        if (this.expandManager == null) {
            final boolean z = !TextUtils.isEmpty(str) && URLUtil.isNetworkUrl(str);
            if (z) {
                final FrameLayout frameLayout = new FrameLayout(getContext());
                WatermarkImageButton watermarkImageButton = new WatermarkImageButton(getContext());
                RichMediaWebView create = this.webViewFactory.create(getContext());
                this.twoPartWebView = create;
                frameLayout.addView(create);
                frameLayout.addView(watermarkImageButton);
                this.twoPartWebView.setCallback(new RichMediaWebViewCallbackAdapter() {
                    private boolean violation;

                    public void onWebViewLoaded() {
                        if (this.violation) {
                            RichMediaAdContentView.this.mraidPresenter.onFailedToExpand();
                            return;
                        }
                        RichMediaAdContentView.this.performExpand(frameLayout, z);
                        RichMediaAdContentView.this.richMediaViewCallback.updateAdView(RichMediaAdContentView.this.twoPartWebView);
                    }

                    public void onAdViolation(String str, String str2) {
                        this.violation = true;
                        RichMediaAdContentView.this.richMediaViewCallback.onAdViolation(str, str2);
                    }

                    public void onRenderProcessGone() {
                        RichMediaAdContentView.this.mraidPresenter.onFailedToExpand();
                    }
                });
                this.twoPartWebView.loadUrlContent(str);
                return;
            }
            performExpand(this.content, z);
        }
    }

    /* access modifiers changed from: private */
    public void performExpand(View view, final boolean z) {
        ExpandManager expandManager2 = new ExpandManager();
        this.expandManager = expandManager2;
        expandManager2.expand(view, new ExpandManager.Listener() {
            public void onExpanded(ImageButton imageButton) {
                RichMediaAdContentView.this.mraidPresenter.onWasExpanded();
                RichMediaAdContentView.this.richMediaViewCallback.onAdExpanded(RichMediaAdContentView.this);
            }

            public void onFailedToExpand() {
                RichMediaAdContentView.this.logger.error(LogDomain.RICH_MEDIA, "Failed to expand creative", new Object[0]);
                RichMediaAdContentView.this.mraidPresenter.onFailedToExpand();
            }

            public void onCloseClicked(ImageButton imageButton) {
                RichMediaAdContentView.this.mraidPresenter.handleClose();
                RichMediaAdContentView.this.richMediaViewCallback.removeFriendlyObstruction(imageButton);
                if (z) {
                    RichMediaAdContentView.this.richMediaViewCallback.updateAdView(RichMediaAdContentView.this.webView);
                }
            }
        });
    }

    private void resize(ResizeParams resizeParams) {
        if (this.resizeManager == null) {
            ResizeManager resizeManager2 = new ResizeManager(this.logger, this.content, resizeParams.maxSizeRectInPx);
            this.resizeManager = resizeManager2;
            resizeManager2.setListener(new ResizeManager.Listener() {
                public void onResized(ImageButton imageButton) {
                    RichMediaAdContentView.this.mraidPresenter.onWasResized();
                    RichMediaAdContentView.this.richMediaViewCallback.onAdResized(RichMediaAdContentView.this);
                }

                public void onCloseClicked(ImageButton imageButton) {
                    RichMediaAdContentView.this.mraidPresenter.handleClose();
                    RichMediaAdContentView.this.richMediaViewCallback.removeFriendlyObstruction(imageButton);
                }

                public void onResizeFailed(String str) {
                    RichMediaAdContentView.this.mraidPresenter.onFailedToResize(str);
                }
            });
        }
        this.resizeManager.resize(resizeParams.resizeRectInPx);
    }

    private void restoreDefaultSize() {
        if ((this.resizeManager == null && this.expandManager == null) ? false : true) {
            ViewUtils.removeFromParent(this.content);
            addView(this.content);
            Views.addOnPreDrawListener(this.content, new Runnable() {
                public final void run() {
                    RichMediaAdContentView.this.lambda$restoreDefaultSize$7$RichMediaAdContentView();
                }
            });
        }
        com.smaato.sdk.core.util.Objects.onNotNull(this.resizeManager, new Consumer() {
            public final void accept(Object obj) {
                RichMediaAdContentView.this.lambda$restoreDefaultSize$8$RichMediaAdContentView((ResizeManager) obj);
            }
        });
        com.smaato.sdk.core.util.Objects.onNotNull(this.expandManager, new Consumer() {
            public final void accept(Object obj) {
                RichMediaAdContentView.this.lambda$restoreDefaultSize$9$RichMediaAdContentView((ExpandManager) obj);
            }
        });
    }

    public /* synthetic */ void lambda$restoreDefaultSize$7$RichMediaAdContentView() {
        this.mraidPresenter.onWasClosed();
        this.richMediaViewCallback.onAdCollapsed(this);
    }

    public /* synthetic */ void lambda$restoreDefaultSize$8$RichMediaAdContentView(ResizeManager resizeManager2) {
        resizeManager2.collapse();
        this.resizeManager = null;
    }

    public /* synthetic */ void lambda$restoreDefaultSize$9$RichMediaAdContentView(ExpandManager expandManager2) {
        expandManager2.collapse();
        this.expandManager = null;
    }

    private RichMediaWebView.Callback createRichMediaWebViewCallback() {
        return new RichMediaWebViewCallbackAdapter() {
            public void onWebViewLoaded() {
                RichMediaAdContentView.this.richMediaViewCallback.onWebViewLoaded(RichMediaAdContentView.this);
                RichMediaAdContentView.this.mraidPresenter.onHtmlLoaded();
            }

            public void onUrlClicked(String str) {
                RichMediaAdContentView.this.richMediaViewCallback.onUrlClicked(RichMediaAdContentView.this, str);
            }

            public void handleMraidUrl(String str, boolean z) {
                RichMediaAdContentView.this.mraidPresenter.handleMraidUrl(str, z);
            }

            public void onAdViolation(String str, String str2) {
                RichMediaAdContentView.this.richMediaViewCallback.onAdViolation(str, str2);
            }

            public void onRenderProcessGone() {
                RichMediaAdContentView.this.richMediaViewCallback.onRenderProcessGone(RichMediaAdContentView.this);
            }
        };
    }
}

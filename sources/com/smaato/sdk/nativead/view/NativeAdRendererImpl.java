package com.smaato.sdk.nativead.view;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import android.widget.ImageView;
import com.smaato.sdk.core.AndroidsInjector;
import com.smaato.sdk.core.FormatType;
import com.smaato.sdk.core.api.ImpressionCountingType;
import com.smaato.sdk.core.util.diinjection.Inject;
import com.smaato.sdk.core.util.diinjection.Named;
import com.smaato.sdk.core.util.p382fi.BiConsumer;
import com.smaato.sdk.nativead.NativeAdAssets;
import com.smaato.sdk.nativead.NativeAdRenderer;
import com.smaato.sdk.nativead.NativeAdView;
import com.smaato.sdk.nativead.viewmodel.NativeAdViewModel;
import com.smaato.sdk.richmedia.mraid.MraidConfigurator;
import com.smaato.sdk.richmedia.mraid.RichMediaWebViewFactory;
import com.smaato.sdk.richmedia.widget.RichMediaAdContentView;
import com.smaato.sdk.richmedia.widget.RichMediaWebView;
import java.util.Arrays;
import java.util.Objects;

public class NativeAdRendererImpl implements NativeAdRenderer {
    @Inject
    @Named("RichMediaModuleInterface")
    private static MraidConfigurator mraidConfigurator;
    @Inject
    private static RichMediaWebViewFactory richMediaWebViewFactory;
    private final FormatType formatType;
    private final ImpressionCountingType impressionCountingType;
    private final String mraidWrappedVast;
    private final NativeAdAssets nativeAdAssets;
    /* access modifiers changed from: private */
    public final NativeAdViewModel nativeAdViewModel;

    public NativeAdRendererImpl(NativeAdAssets nativeAdAssets2, NativeAdViewModel nativeAdViewModel2, String str, ImpressionCountingType impressionCountingType2, FormatType formatType2) {
        this.nativeAdAssets = nativeAdAssets2;
        this.nativeAdViewModel = nativeAdViewModel2;
        this.mraidWrappedVast = str;
        this.impressionCountingType = impressionCountingType2;
        this.formatType = formatType2;
        AndroidsInjector.injectStatic(NativeAdRendererImpl.class);
    }

    public NativeAdAssets getAssets() {
        return this.nativeAdAssets;
    }

    public void renderInView(NativeAdView nativeAdView) {
        View videoView;
        View richMediaView;
        BiConsumer<Uri, ImageView> imageLoader = this.nativeAdViewModel.getImageLoader();
        RendererHelper.renderText(nativeAdView.titleView(), this.nativeAdAssets.title());
        RendererHelper.renderText(nativeAdView.textView(), this.nativeAdAssets.text());
        RendererHelper.renderText(nativeAdView.sponsoredView(), this.nativeAdAssets.sponsored());
        RendererHelper.renderText(nativeAdView.ctaView(), this.nativeAdAssets.cta());
        RendererHelper.renderRating(nativeAdView.ratingView(), this.nativeAdAssets.rating());
        RendererHelper.renderImage(imageLoader, nativeAdView.iconView(), this.nativeAdAssets.icon());
        if (!this.nativeAdAssets.images().isEmpty()) {
            RendererHelper.renderImage(imageLoader, nativeAdView.mediaView(), this.nativeAdAssets.images());
        }
        if (!(this.nativeAdAssets.mraidJs() == null || this.nativeAdAssets.mraidJs().isEmpty() || (richMediaView = nativeAdView.richMediaView()) == null)) {
            RendererHelper.renderRichMedia(richMediaView, createRichMediaAdContentView(richMediaView, this.nativeAdAssets.mraidJs()));
        }
        String str = this.mraidWrappedVast;
        if (!(str == null || str.isEmpty() || (videoView = nativeAdView.videoView()) == null)) {
            RendererHelper.renderRichMedia(videoView, createRichMediaAdContentView(videoView, this.mraidWrappedVast));
        }
        View privacyView = nativeAdView.privacyView();
        NativeAdViewModel nativeAdViewModel2 = this.nativeAdViewModel;
        Objects.requireNonNull(nativeAdViewModel2);
        RendererHelper.renderPrivacyIcon(privacyView, (Runnable) new Runnable() {
            public final void run() {
                NativeAdViewModel.this.launchPrivacyUrl();
            }
        });
    }

    public void registerForImpression(View view) {
        new ViewVisibilityObserver(this.nativeAdViewModel).observe(view, this.impressionCountingType, this.formatType);
        this.nativeAdViewModel.onRegisterForImpression(view);
    }

    public void registerForClicks(View... viewArr) {
        registerForClicks((Iterable<? extends View>) Arrays.asList(viewArr));
    }

    public void registerForClicks(Iterable<? extends View> iterable) {
        for (View view : iterable) {
            view.setClickable(true);
            view.setOnClickListener(new View.OnClickListener() {
                public final void onClick(View view) {
                    NativeAdRendererImpl.this.lambda$registerForClicks$0$NativeAdRendererImpl(view);
                }
            });
        }
    }

    public /* synthetic */ void lambda$registerForClicks$0$NativeAdRendererImpl(View view) {
        this.nativeAdViewModel.onAdClicked();
    }

    private RichMediaAdContentView createRichMediaAdContentView(View view, String str) {
        Context context = view.getContext();
        return mraidConfigurator.createViewForNative(context, str, richMediaWebViewFactory.create(context), createRichMediaCallback());
    }

    private RichMediaAdContentView.Callback createRichMediaCallback() {
        return new RichMediaAdContentView.Callback() {
            public void onAdCollapsed(RichMediaAdContentView richMediaAdContentView) {
            }

            public void onAdExpanded(RichMediaAdContentView richMediaAdContentView) {
            }

            public void onAdResized(RichMediaAdContentView richMediaAdContentView) {
            }

            public void onAdViolation(String str, String str2) {
            }

            public void onHidden(RichMediaAdContentView richMediaAdContentView) {
            }

            public void onPlayVideo(RichMediaAdContentView richMediaAdContentView, String str) {
            }

            public void onRenderProcessGone(RichMediaAdContentView richMediaAdContentView) {
            }

            public void onUnloadView(RichMediaAdContentView richMediaAdContentView) {
            }

            public void onWebViewLoaded(RichMediaAdContentView richMediaAdContentView) {
            }

            public void registerFriendlyObstruction(View view) {
            }

            public void removeFriendlyObstruction(View view) {
            }

            public void onUrlClicked(RichMediaAdContentView richMediaAdContentView, String str) {
                NativeAdRendererImpl.this.nativeAdViewModel.onAdClicked();
            }

            public void updateAdView(RichMediaWebView richMediaWebView) {
                NativeAdRendererImpl.this.nativeAdViewModel.onUpdateAdView(richMediaWebView);
            }
        };
    }
}

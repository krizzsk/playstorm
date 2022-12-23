package com.smaato.sdk.nativead.view;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import com.smaato.sdk.core.AndroidsInjector;
import com.smaato.sdk.core.log.LogDomain;
import com.smaato.sdk.core.log.Logger;
import com.smaato.sdk.core.util.diinjection.Inject;
import com.smaato.sdk.core.util.p382fi.BiConsumer;
import com.smaato.sdk.nativead.C11137R;
import com.smaato.sdk.nativead.NativeAdAssets;
import com.smaato.sdk.richmedia.mraid.dataprovider.MraidEnvironmentProperties;
import com.smaato.sdk.richmedia.widget.RichMediaAdContentView;
import java.util.List;

abstract class RendererHelper {
    @Inject
    private static Logger logger;

    private RendererHelper() {
    }

    static void renderText(TextView textView, String str) {
        if (textView != null) {
            if (str == null) {
                str = "";
            }
            textView.setText(str);
        }
    }

    static void renderRating(View view, Double d) {
        if (view != null && d != null) {
            if (view instanceof RatingBar) {
                ((RatingBar) view).setRating(d.floatValue());
            } else {
                logWarning("Attempted to set rating to non RatingBar view.");
            }
        }
    }

    static void renderImage(BiConsumer<Uri, ImageView> biConsumer, View view, NativeAdAssets.Image image) {
        if (view != null && image != null) {
            if (view instanceof ImageView) {
                Drawable drawable = image.drawable();
                if (drawable != null) {
                    ((ImageView) view).setImageDrawable(drawable);
                } else {
                    biConsumer.accept(image.uri(), (ImageView) view);
                }
            } else {
                logWarning("Attempted to set image to non ImageView view.");
            }
        }
    }

    static void renderImage(BiConsumer<Uri, ImageView> biConsumer, View view, List<NativeAdAssets.Image> list) {
        if (view != null) {
            if (list.size() > 1) {
                logWarning("Multiple images rendering does not supported yet.");
            }
            if (!list.isEmpty()) {
                renderImage(biConsumer, view, list.get(0));
            }
        }
    }

    public static void renderRichMedia(View view, RichMediaAdContentView richMediaAdContentView) {
        if (view instanceof FrameLayout) {
            view.post(new Runnable(view, richMediaAdContentView, view.getContext()) {
                public final /* synthetic */ View f$0;
                public final /* synthetic */ RichMediaAdContentView f$1;
                public final /* synthetic */ Context f$2;

                {
                    this.f$0 = r1;
                    this.f$1 = r2;
                    this.f$2 = r3;
                }

                public final void run() {
                    RendererHelper.lambda$renderRichMedia$0(this.f$0, this.f$1, this.f$2);
                }
            });
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Cannot render rich media ad in view of type ");
        sb.append(view != null ? view.getClass().getSimpleName() : "null");
        throw new IllegalArgumentException(sb.toString());
    }

    static /* synthetic */ void lambda$renderRichMedia$0(View view, RichMediaAdContentView richMediaAdContentView, Context context) {
        ((FrameLayout) view).addView(richMediaAdContentView);
        richMediaAdContentView.startWebViewLoading(new MraidEnvironmentProperties.Builder(context.getPackageName()).build());
    }

    static void renderPrivacyIcon(View view, Runnable runnable) {
        if (view instanceof ImageView) {
            renderPrivacyIcon((ImageView) view, runnable);
        } else if (view instanceof ViewGroup) {
            ImageButton imageButton = new ImageButton(view.getContext());
            renderPrivacyIcon((ImageView) imageButton, runnable);
            ((ViewGroup) view).addView(imageButton);
        } else {
            logWarning(String.format("Attempted to render privacy icon on unknown view (%s).", new Object[]{view}));
        }
    }

    private static void renderPrivacyIcon(ImageView imageView, Runnable runnable) {
        imageView.setBackgroundColor(0);
        imageView.setImageResource(C11137R.C11138drawable.smaato_sdk_native_ic_privacy);
        imageView.setOnClickListener(new View.OnClickListener(runnable) {
            public final /* synthetic */ Runnable f$0;

            {
                this.f$0 = r1;
            }

            public final void onClick(View view) {
                this.f$0.run();
            }
        });
        imageView.setClickable(true);
    }

    private static void logWarning(String str) {
        if (logger == null) {
            AndroidsInjector.injectStatic(RendererHelper.class);
        }
        logger.warning(LogDomain.NATIVE, str, new Object[0]);
    }
}

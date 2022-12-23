package com.p374my.target.nativeads.views;

import android.animation.StateListAnimator;
import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.util.StateSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.view.ViewCompat;
import com.p374my.target.C10059y8;

/* renamed from: com.my.target.nativeads.views.NativeAdCardView */
public class NativeAdCardView extends LinearLayout implements PromoCardView {
    private static final int CTA_ID = C10059y8.m29841c();
    private static final int MARGIN_DP = 12;
    private static final int STANDARD_BLUE = -16748844;
    /* access modifiers changed from: private */
    public View.OnClickListener cardClickListener;
    private final RelativeLayout containerLayout;
    private final Button ctaButton;
    private final TextView descriptionView;
    private final View.OnClickListener elementClickListener = new View.OnClickListener() {
        public void onClick(View view) {
            if (NativeAdCardView.this.cardClickListener != null) {
                NativeAdCardView.this.cardClickListener.onClick(NativeAdCardView.this);
            }
        }
    };
    private final MediaAdView mediaAdView;
    private final LinearLayout textContainerLayout;
    private final TextView titleView;
    private final C10059y8 uiUtils;

    public NativeAdCardView(Context context) {
        super(context);
        MediaAdView mediaAdView2 = new MediaAdView(context);
        this.mediaAdView = mediaAdView2;
        TextView textView = new TextView(context);
        this.titleView = textView;
        TextView textView2 = new TextView(context);
        this.descriptionView = textView2;
        this.containerLayout = new RelativeLayout(context);
        Button button = new Button(context);
        this.ctaButton = button;
        this.uiUtils = C10059y8.m29843c(context);
        this.textContainerLayout = new LinearLayout(context);
        C10059y8.m29840b(this, "card_view");
        C10059y8.m29840b(mediaAdView2, "card_media_view");
        C10059y8.m29840b(textView, "card_title_text");
        C10059y8.m29840b(textView2, "card_description_text");
        C10059y8.m29840b(button, "card_cta_text");
        initView();
    }

    private void initView() {
        setOrientation(1);
        setPadding(this.uiUtils.mo65778b(8), this.uiUtils.mo65778b(8), this.uiUtils.mo65778b(8), this.uiUtils.mo65778b(8));
        setClickable(true);
        C10059y8.m29829a((View) this, 0, -3806472);
        C10059y8.m29832a(this.containerLayout, 0, -3806472, -3355444, this.uiUtils.mo65778b(1), 0);
        Button button = this.ctaButton;
        int i = CTA_ID;
        button.setId(i);
        this.ctaButton.setMaxEms(10);
        this.ctaButton.setLines(1);
        this.ctaButton.setEllipsize(TextUtils.TruncateAt.END);
        this.ctaButton.setPadding(this.uiUtils.mo65778b(10), 0, this.uiUtils.mo65778b(10), 0);
        this.ctaButton.setTextSize(2, 12.0f);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, this.uiUtils.mo65778b(30));
        layoutParams.addRule(11, -1);
        layoutParams.addRule(15, -1);
        layoutParams.setMargins(this.uiUtils.mo65778b(12), this.uiUtils.mo65778b(12), this.uiUtils.mo65778b(12), this.uiUtils.mo65778b(12));
        this.ctaButton.setLayoutParams(layoutParams);
        this.ctaButton.setTransformationMethod((TransformationMethod) null);
        if (Build.VERSION.SDK_INT >= 21) {
            this.ctaButton.setStateListAnimator((StateListAnimator) null);
        }
        this.ctaButton.setTextColor(STANDARD_BLUE);
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{0, 0});
        gradientDrawable.setStroke(this.uiUtils.mo65778b(1), STANDARD_BLUE);
        gradientDrawable.setCornerRadius((float) this.uiUtils.mo65778b(1));
        GradientDrawable gradientDrawable2 = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{-3806472, -3806472});
        gradientDrawable2.setStroke(this.uiUtils.mo65778b(1), STANDARD_BLUE);
        gradientDrawable2.setCornerRadius((float) this.uiUtils.mo65778b(1));
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{16842919}, gradientDrawable2);
        stateListDrawable.addState(StateSet.WILD_CARD, gradientDrawable);
        this.ctaButton.setBackgroundDrawable(stateListDrawable);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams2.addRule(0, i);
        this.textContainerLayout.setLayoutParams(layoutParams2);
        this.textContainerLayout.setGravity(16);
        this.textContainerLayout.setOrientation(1);
        this.titleView.setTextColor(ViewCompat.MEASURED_STATE_MASK);
        this.titleView.setTextSize(2, 14.0f);
        this.titleView.setTypeface((Typeface) null, 1);
        this.titleView.setLines(2);
        this.titleView.setEllipsize(TextUtils.TruncateAt.END);
        this.titleView.setPadding(this.uiUtils.mo65778b(12), this.uiUtils.mo65778b(6), this.uiUtils.mo65778b(1), this.uiUtils.mo65778b(1));
        this.descriptionView.setTextColor(ViewCompat.MEASURED_STATE_MASK);
        this.descriptionView.setTextSize(2, 12.0f);
        this.descriptionView.setLines(1);
        this.descriptionView.setEllipsize(TextUtils.TruncateAt.END);
        this.descriptionView.setPadding(this.uiUtils.mo65778b(12), this.uiUtils.mo65778b(1), this.uiUtils.mo65778b(1), this.uiUtils.mo65778b(12));
        addView(this.mediaAdView);
        addView(this.containerLayout);
        this.containerLayout.addView(this.ctaButton);
        this.containerLayout.addView(this.textContainerLayout);
        this.textContainerLayout.addView(this.titleView);
        this.textContainerLayout.addView(this.descriptionView);
    }

    public Button getCtaButtonView() {
        return this.ctaButton;
    }

    public TextView getDescriptionTextView() {
        return this.descriptionView;
    }

    public MediaAdView getMediaAdView() {
        return this.mediaAdView;
    }

    public TextView getTitleTextView() {
        return this.titleView;
    }

    public View getView() {
        return this;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        return x > ((float) this.mediaAdView.getLeft()) && x < ((float) this.mediaAdView.getRight()) && y > ((float) this.mediaAdView.getTop()) && y < ((float) this.mediaAdView.getBottom());
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.cardClickListener = onClickListener;
        super.setOnClickListener(onClickListener);
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            getChildAt(i).setOnClickListener(this.elementClickListener);
        }
    }
}

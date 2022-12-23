package com.p374my.target.nativeads.views;

import android.content.Context;
import android.graphics.Color;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.p374my.target.C10059y8;
import com.p374my.target.C9804k6;
import com.p374my.target.common.views.StarsRatingView;
import com.p374my.target.nativeads.banners.NativeAppwallBanner;

/* renamed from: com.my.target.nativeads.views.AppwallAdTeaserView */
public class AppwallAdTeaserView extends RelativeLayout {
    private NativeAppwallBanner banner;
    private final C9804k6 bannerIcon;
    private final ShapeDrawable coinsBgShape;
    private final TextView coinsCountView;
    private final C9804k6 coinsIconView;
    private final LinearLayout coinsLayout;
    private final TextView descrView;
    private final C9804k6 notificationView;
    private final C9804k6 openImageView;
    private final StarsRatingView starsRatingView;
    private final C9804k6 statusIconView;
    private final int textColor = Color.rgb(36, 36, 36);
    private final TextView titleView;
    private final C10059y8 uiUtils;
    private boolean viewed = false;
    private final TextView votesCountView;

    public AppwallAdTeaserView(Context context) {
        super(context);
        this.bannerIcon = new C9804k6(context);
        this.coinsLayout = new LinearLayout(context);
        this.coinsCountView = new TextView(context);
        this.coinsIconView = new C9804k6(context);
        this.openImageView = new C9804k6(context);
        this.statusIconView = new C9804k6(context);
        this.titleView = new TextView(context);
        this.descrView = new TextView(context);
        this.starsRatingView = new StarsRatingView(context);
        this.votesCountView = new TextView(context);
        this.notificationView = new C9804k6(context);
        C10059y8 c = C10059y8.m29843c(context);
        this.uiUtils = c;
        float b = (float) c.mo65778b(6);
        this.coinsBgShape = new ShapeDrawable(new RoundRectShape(new float[]{b, b, b, b, b, b, b, b}, (RectF) null, (float[]) null));
        initView();
    }

    private void initView() {
        int b = this.uiUtils.mo65778b(18);
        int b2 = this.uiUtils.mo65778b(14);
        int b3 = this.uiUtils.mo65778b(53);
        int c = C10059y8.m29841c();
        int c2 = C10059y8.m29841c();
        int c3 = C10059y8.m29841c();
        setBackgroundColor(-1);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(b3 + b2 + b2, b3 + b + b);
        this.bannerIcon.setPadding(b2, b, b2, b);
        addView(this.bannerIcon, layoutParams);
        int b4 = this.uiUtils.mo65778b(20);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(b4, b4);
        layoutParams2.leftMargin = this.uiUtils.mo65778b(57);
        layoutParams2.topMargin = this.uiUtils.mo65778b(10);
        this.notificationView.setLayoutParams(layoutParams2);
        addView(this.notificationView);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(b3, b3);
        layoutParams3.addRule(11);
        layoutParams3.rightMargin = b2;
        layoutParams3.topMargin = b;
        this.coinsLayout.setBackgroundDrawable(this.coinsBgShape);
        this.coinsLayout.setOrientation(1);
        addView(this.coinsLayout, layoutParams3);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, -2);
        this.coinsCountView.setTypeface(Typeface.SANS_SERIF);
        this.coinsCountView.setPadding(0, this.uiUtils.mo65778b(10), 0, this.uiUtils.mo65778b(2));
        this.coinsCountView.setTextSize(2, 13.0f);
        this.coinsCountView.setGravity(49);
        this.coinsLayout.addView(this.coinsCountView, layoutParams4);
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(this.uiUtils.mo65778b(20), this.uiUtils.mo65778b(20));
        layoutParams5.gravity = 1;
        this.coinsLayout.addView(this.coinsIconView, layoutParams5);
        RelativeLayout.LayoutParams layoutParams6 = new RelativeLayout.LayoutParams(this.uiUtils.mo65778b(19), -2);
        layoutParams6.addRule(15);
        layoutParams6.addRule(11);
        layoutParams6.rightMargin = this.uiUtils.mo65778b(30);
        addView(this.openImageView, layoutParams6);
        RelativeLayout.LayoutParams layoutParams7 = new RelativeLayout.LayoutParams(b3, b3);
        layoutParams7.addRule(10);
        layoutParams7.addRule(11);
        addView(this.statusIconView, layoutParams7);
        this.titleView.setTypeface(Typeface.SANS_SERIF);
        this.titleView.setTextSize(2, 18.0f);
        this.titleView.setTextColor(this.textColor);
        this.titleView.setPadding(0, 0, this.uiUtils.mo65778b(67), 0);
        this.titleView.setId(c3);
        RelativeLayout.LayoutParams layoutParams8 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams8.leftMargin = this.uiUtils.mo65778b(91);
        layoutParams8.rightMargin = this.uiUtils.mo65778b(15);
        layoutParams8.topMargin = this.uiUtils.mo65778b(13);
        this.titleView.setLayoutParams(layoutParams8);
        addView(this.titleView);
        this.descrView.setTypeface(Typeface.SANS_SERIF);
        this.descrView.setTextSize(2, 13.0f);
        this.descrView.setTextColor(this.textColor);
        RelativeLayout.LayoutParams layoutParams9 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams9.leftMargin = this.uiUtils.mo65778b(91);
        layoutParams9.addRule(3, c3);
        this.descrView.setId(c);
        this.descrView.setLayoutParams(layoutParams9);
        addView(this.descrView);
        RelativeLayout.LayoutParams layoutParams10 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams10.addRule(3, c);
        layoutParams10.leftMargin = this.uiUtils.mo65778b(91);
        layoutParams10.topMargin = this.uiUtils.mo65778b(5);
        this.starsRatingView.setPadding(0, 0, 0, this.uiUtils.mo65778b(20));
        this.starsRatingView.setStarsPadding((float) this.uiUtils.mo65778b(2));
        this.starsRatingView.setStarSize(this.uiUtils.mo65778b(12));
        this.starsRatingView.setId(c2);
        addView(this.starsRatingView, layoutParams10);
        RelativeLayout.LayoutParams layoutParams11 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams11.addRule(1, c2);
        layoutParams11.addRule(3, c);
        layoutParams11.leftMargin = this.uiUtils.mo65778b(9);
        this.votesCountView.setTypeface(Typeface.SANS_SERIF);
        this.votesCountView.setPadding(0, this.uiUtils.mo65778b(2), 0, 0);
        this.votesCountView.setTextSize(2, 13.0f);
        this.votesCountView.setTextColor(this.textColor);
        this.votesCountView.setGravity(16);
        addView(this.votesCountView, layoutParams11);
    }

    public NativeAppwallBanner getBanner() {
        return this.banner;
    }

    public ImageView getBannerIconImageView() {
        return this.bannerIcon;
    }

    public TextView getCoinsCountTextView() {
        return this.coinsCountView;
    }

    public ImageView getCoinsIconImageView() {
        return this.coinsIconView;
    }

    public TextView getDescriptionTextView() {
        return this.descrView;
    }

    public ImageView getNotificationImageView() {
        return this.notificationView;
    }

    public ImageView getOpenImageView() {
        return this.openImageView;
    }

    public StarsRatingView getStarsRatingView() {
        return this.starsRatingView;
    }

    public ImageView getStatusIconImageView() {
        return this.statusIconView;
    }

    public TextView getTitleTextView() {
        return this.titleView;
    }

    public TextView getVotesCountTextView() {
        return this.votesCountView;
    }

    public boolean isViewed() {
        return this.viewed;
    }

    public void removeNotification() {
        removeView(this.notificationView);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x00ce  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00d9  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00ef  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0128  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setNativeAppwallBanner(com.p374my.target.nativeads.banners.NativeAppwallBanner r9) {
        /*
            r8 = this;
            r8.banner = r9
            com.my.target.k6 r0 = r8.bannerIcon
            com.my.target.common.models.ImageData r1 = r9.getIcon()
            r0.setImageData(r1)
            com.my.target.common.models.ImageData r0 = r9.getBubbleIcon()
            com.my.target.k6 r1 = r8.notificationView
            r1.setImageData(r0)
            java.lang.String r1 = r9.getDescription()
            java.lang.String r2 = r9.getTitle()
            android.widget.TextView r3 = r8.titleView
            r3.setText(r2)
            android.widget.TextView r2 = r8.descrView
            r2.setText(r1)
            boolean r1 = r9.isHasNotification()
            r2 = 8
            r3 = 0
            if (r1 == 0) goto L_0x003a
            com.my.target.k6 r1 = r8.notificationView
            r1.setVisibility(r3)
            com.my.target.k6 r1 = r8.notificationView
            r1.setImageData(r0)
            goto L_0x003f
        L_0x003a:
            com.my.target.k6 r0 = r8.notificationView
            r0.setVisibility(r2)
        L_0x003f:
            int r0 = r9.getCoins()
            java.lang.String r1 = "%d"
            r4 = 1
            if (r0 <= 0) goto L_0x008b
            android.widget.LinearLayout r0 = r8.coinsLayout
            r0.setVisibility(r3)
            com.my.target.k6 r0 = r8.coinsIconView
            com.my.target.common.models.ImageData r5 = r9.getCoinsIcon()
            r0.setImageData(r5)
            android.widget.TextView r0 = r8.coinsCountView
            java.util.Locale r5 = java.util.Locale.getDefault()
            java.lang.Object[] r6 = new java.lang.Object[r4]
            int r7 = r9.getCoins()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r6[r3] = r7
            java.lang.String r5 = java.lang.String.format(r5, r1, r6)
            r0.setText(r5)
            android.widget.TextView r0 = r8.coinsCountView
            int r5 = r9.getCoinsIconTextColor()
            r0.setTextColor(r5)
            android.graphics.drawable.ShapeDrawable r0 = r8.coinsBgShape
            android.graphics.Paint r0 = r0.getPaint()
            int r5 = r9.getCoinsIconBgColor()
            r0.setColor(r5)
        L_0x0085:
            com.my.target.k6 r0 = r8.openImageView
            r0.setVisibility(r2)
            goto L_0x00ab
        L_0x008b:
            boolean r0 = r9.isAppInstalled()
            if (r0 == 0) goto L_0x00a5
            android.widget.LinearLayout r0 = r8.coinsLayout
            r0.setVisibility(r2)
            com.my.target.k6 r0 = r8.openImageView
            r0.setVisibility(r3)
            com.my.target.k6 r0 = r8.openImageView
            com.my.target.common.models.ImageData r5 = r9.getGotoAppIcon()
            r0.setImageData(r5)
            goto L_0x00ab
        L_0x00a5:
            android.widget.LinearLayout r0 = r8.coinsLayout
            r0.setVisibility(r2)
            goto L_0x0085
        L_0x00ab:
            com.my.target.common.models.ImageData r0 = r9.getStatusIcon()
            com.my.target.k6 r5 = r8.statusIconView
            if (r0 == 0) goto L_0x00bc
            r5.setVisibility(r3)
            com.my.target.k6 r5 = r8.statusIconView
            r5.setImageData(r0)
            goto L_0x00bf
        L_0x00bc:
            r5.setVisibility(r2)
        L_0x00bf:
            int r5 = r9.getCoins()
            r6 = 20
            if (r5 != 0) goto L_0x00d9
            boolean r5 = r9.isAppInstalled()
            if (r5 == 0) goto L_0x00ce
            goto L_0x00d9
        L_0x00ce:
            if (r0 == 0) goto L_0x00e6
            android.widget.TextView r0 = r8.descrView
            com.my.target.y8 r5 = r8.uiUtils
            int r5 = r5.mo65778b((int) r6)
            goto L_0x00e3
        L_0x00d9:
            android.widget.TextView r0 = r8.descrView
            com.my.target.y8 r5 = r8.uiUtils
            r7 = 70
            int r5 = r5.mo65778b((int) r7)
        L_0x00e3:
            r0.setPadding(r3, r3, r5, r3)
        L_0x00e6:
            float r0 = r9.getRating()
            r5 = 0
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 <= 0) goto L_0x0128
            com.my.target.common.views.StarsRatingView r0 = r8.starsRatingView
            float r5 = r9.getRating()
            r0.setRating(r5)
            com.my.target.common.views.StarsRatingView r0 = r8.starsRatingView
            r0.setVisibility(r3)
            int r0 = r9.getVotes()
            if (r0 <= 0) goto L_0x0122
            android.widget.TextView r0 = r8.votesCountView
            java.util.Locale r2 = java.util.Locale.getDefault()
            java.lang.Object[] r4 = new java.lang.Object[r4]
            int r9 = r9.getVotes()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r4[r3] = r9
            java.lang.String r9 = java.lang.String.format(r2, r1, r4)
            r0.setText(r9)
            android.widget.TextView r9 = r8.votesCountView
            r9.setVisibility(r3)
            goto L_0x014d
        L_0x0122:
            android.widget.TextView r9 = r8.votesCountView
            r9.setVisibility(r2)
            goto L_0x014d
        L_0x0128:
            com.my.target.common.views.StarsRatingView r9 = r8.starsRatingView
            r9.setVisibility(r2)
            android.widget.TextView r9 = r8.votesCountView
            r9.setVisibility(r2)
            android.widget.TextView r9 = r8.descrView
            int r0 = r9.getPaddingLeft()
            android.widget.TextView r1 = r8.descrView
            int r1 = r1.getPaddingTop()
            android.widget.TextView r2 = r8.descrView
            int r2 = r2.getPaddingRight()
            com.my.target.y8 r3 = r8.uiUtils
            int r3 = r3.mo65778b((int) r6)
            r9.setPadding(r0, r1, r2, r3)
        L_0x014d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p374my.target.nativeads.views.AppwallAdTeaserView.setNativeAppwallBanner(com.my.target.nativeads.banners.NativeAppwallBanner):void");
    }

    public void setViewed(boolean z) {
        this.viewed = z;
    }
}

package com.p374my.target.nativeads.views;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.StateSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.view.ViewCompat;
import com.p374my.target.C10023w8;
import com.p374my.target.C10059y8;
import com.p374my.target.C9594R;
import com.p374my.target.C9629b6;
import com.p374my.target.C9672e0;
import com.p374my.target.common.views.StarsRatingView;
import com.p374my.target.nativeads.banners.NativePromoBanner;
import com.p374my.target.nativeads.banners.NativePromoCard;
import com.p374my.target.nativeads.factories.NativeViewsFactory;
import com.p374my.target.nativeads.views.PromoCardRecyclerView;
import java.util.List;

/* renamed from: com.my.target.nativeads.views.NativeAdView */
public class NativeAdView extends ViewGroup {
    private static final int STANDARD_BLUE = -16748844;
    private final TextView advertTextView;
    private final int advertisingLabelLeftMargin;
    private final TextView ageTextView;
    private PromoCardRecyclerView.PromoCardAdapter cardAdapter;
    private final LinearLayout centerLayout;
    private final Button ctaButton;
    private final int ctaHeight;
    private final TextView descriptionTextView;
    private final TextView disclaimerTextView;
    private final IconAdView iconAdView;
    private final int iconDimensions;
    private final int innerMargins;
    private MediaAdView mediaAdView;
    private PromoCardRecyclerView promoCardRecyclerView;
    private final int ratingHeight;
    private final LinearLayout ratingLayout;
    private final StarsRatingView ratingView;
    private final int smallMargin;
    private final TextView titleTextView;
    private final LinearLayout topLayout;
    private final TextView urlTextView;
    private final boolean useExtendedCard;
    private final TextView votesTextView;

    public NativeAdView(Context context) {
        this(context, (AttributeSet) null);
    }

    public NativeAdView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NativeAdView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, false);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NativeAdView(Context context, AttributeSet attributeSet, int i, boolean z) {
        super(context, attributeSet, i);
        View view;
        Context context2 = context;
        boolean z2 = z;
        this.useExtendedCard = z2;
        C9629b6 b6Var = new C9629b6(context2);
        this.ageTextView = b6Var;
        TextView textView = new TextView(context2);
        this.advertTextView = textView;
        IconAdView iconAdView2 = NativeViewsFactory.getIconAdView(context);
        this.iconAdView = iconAdView2;
        TextView textView2 = new TextView(context2);
        this.titleTextView = textView2;
        TextView textView3 = new TextView(context2);
        this.urlTextView = textView3;
        TextView textView4 = new TextView(context2);
        this.descriptionTextView = textView4;
        StarsRatingView starsRatingView = new StarsRatingView(context2);
        this.ratingView = starsRatingView;
        TextView textView5 = new TextView(context2);
        this.votesTextView = textView5;
        TextView textView6 = new TextView(context2);
        this.disclaimerTextView = textView6;
        Button button = new Button(context2);
        this.ctaButton = button;
        C10059y8 c = C10059y8.m29843c(context);
        LinearLayout linearLayout = new LinearLayout(context2);
        this.centerLayout = linearLayout;
        LinearLayout linearLayout2 = new LinearLayout(context2);
        this.topLayout = linearLayout2;
        LinearLayout linearLayout3 = linearLayout2;
        LinearLayout linearLayout4 = new LinearLayout(context2);
        this.ratingLayout = linearLayout4;
        setId(C9594R.C9595id.nativeads_ad_view);
        textView.setId(C9594R.C9595id.nativeads_advertising);
        textView2.setId(C9594R.C9595id.nativeads_title);
        textView4.setId(C9594R.C9595id.nativeads_description);
        starsRatingView.setId(C9594R.C9595id.nativeads_rating);
        textView3.setId(C9594R.C9595id.nativeads_domain);
        textView6.setId(C9594R.C9595id.nativeads_disclaimer);
        button.setId(C9594R.C9595id.nativeads_call_to_action);
        iconAdView2.setId(C9594R.C9595id.nativeads_icon);
        b6Var.setId(C9594R.C9595id.nativeads_age_restrictions);
        textView5.setId(C9594R.C9595id.nativeads_votes);
        starsRatingView.setId(C9594R.C9595id.nativeads_rating);
        C10059y8.m29840b(textView5, "votes_text");
        TextView textView7 = textView6;
        int b = c.mo65778b(4);
        TextView textView8 = textView4;
        setPadding(b, b, b, c.mo65778b(8));
        this.smallMargin = c.mo65778b(8);
        this.advertisingLabelLeftMargin = c.mo65778b(9);
        this.iconDimensions = c.mo65778b(54);
        this.ratingHeight = c.mo65778b(12);
        int b2 = c.mo65778b(10);
        this.ctaHeight = c.mo65778b(40);
        this.innerMargins = c.mo65778b(4);
        b6Var.setId(C9594R.C9595id.nativeads_age_restrictions);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(0);
        TextView textView9 = textView5;
        gradientDrawable.setStroke(1, -13421773);
        int b3 = c.mo65778b(2);
        b6Var.setBackgroundDrawable(gradientDrawable);
        b6Var.setGravity(17);
        b6Var.setPadding(b3, 0, 0, 0);
        button.setPadding(b2, 0, b2, 0);
        button.setMaxEms(8);
        button.setLines(1);
        button.setEllipsize(TextUtils.TruncateAt.END);
        button.setTransformationMethod((TransformationMethod) null);
        C10059y8.m29829a((View) this, -1, -3806472);
        GradientDrawable gradientDrawable2 = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{0, 0});
        gradientDrawable2.setStroke(c.mo65777a(1.5f), STANDARD_BLUE);
        gradientDrawable2.setCornerRadius((float) c.mo65778b(1));
        GradientDrawable gradientDrawable3 = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{-3806472, -3806472});
        gradientDrawable3.setStroke(c.mo65777a(1.5f), STANDARD_BLUE);
        gradientDrawable3.setCornerRadius((float) c.mo65778b(1));
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{16842919}, gradientDrawable3);
        stateListDrawable.addState(StateSet.WILD_CARD, gradientDrawable2);
        button.setBackgroundDrawable(stateListDrawable);
        setClickable(true);
        Context context3 = getContext();
        if (z2) {
            PromoCardRecyclerView promoCardRecyclerView2 = NativeViewsFactory.getPromoCardRecyclerView(context3);
            this.promoCardRecyclerView = promoCardRecyclerView2;
            promoCardRecyclerView2.setId(C9594R.C9595id.nativeads_media_view);
            view = this.promoCardRecyclerView;
        } else {
            MediaAdView mediaAdView2 = NativeViewsFactory.getMediaAdView(context3);
            this.mediaAdView = mediaAdView2;
            mediaAdView2.setId(C9594R.C9595id.nativeads_media_view);
            view = this.mediaAdView;
        }
        addView(view);
        addView(iconAdView2);
        addView(button);
        addView(linearLayout);
        LinearLayout linearLayout5 = linearLayout3;
        addView(linearLayout5);
        linearLayout5.addView(b6Var);
        linearLayout5.addView(textView);
        linearLayout.addView(textView2);
        linearLayout.addView(textView3);
        linearLayout.addView(linearLayout4);
        linearLayout4.addView(starsRatingView);
        linearLayout4.addView(textView9);
        addView(textView8);
        addView(textView7);
        updateDefaultParams();
        C10023w8.m29663e();
    }

    private void setText(String str, TextView textView) {
        int i;
        if (!TextUtils.isEmpty(str)) {
            textView.setText(str);
            i = 0;
        } else {
            i = 8;
        }
        textView.setVisibility(i);
    }

    private void updateDefaultParams() {
        this.ageTextView.setTextColor(-6710887);
        this.ageTextView.setBackgroundColor(0);
        this.ageTextView.setLines(1);
        this.ageTextView.setEllipsize(TextUtils.TruncateAt.END);
        this.ageTextView.setTextSize(2, 10.0f);
        this.advertTextView.setTextSize(2, 12.0f);
        this.advertTextView.setTextColor(-6710887);
        this.advertTextView.setLines(1);
        this.advertTextView.setEllipsize(TextUtils.TruncateAt.END);
        this.advertTextView.setPadding(this.advertisingLabelLeftMargin, 0, 0, 0);
        this.titleTextView.setTextColor(ViewCompat.MEASURED_STATE_MASK);
        this.titleTextView.setTextSize(2, 16.0f);
        this.titleTextView.setTypeface((Typeface) null, 1);
        this.titleTextView.setLines(1);
        this.titleTextView.setEllipsize(TextUtils.TruncateAt.END);
        this.urlTextView.setTextColor(-6710887);
        this.urlTextView.setTextSize(2, 14.0f);
        this.urlTextView.setLines(1);
        this.urlTextView.setIncludeFontPadding(false);
        this.urlTextView.setEllipsize(TextUtils.TruncateAt.END);
        this.descriptionTextView.setTextColor(ViewCompat.MEASURED_STATE_MASK);
        this.descriptionTextView.setTextSize(2, 15.0f);
        this.descriptionTextView.setMaxLines(3);
        this.descriptionTextView.setEllipsize(TextUtils.TruncateAt.END);
        this.votesTextView.setTextColor(-6710887);
        this.votesTextView.setTextSize(2, 12.0f);
        this.votesTextView.setLines(1);
        this.votesTextView.setEllipsize(TextUtils.TruncateAt.END);
        this.votesTextView.setPadding(this.innerMargins, 0, 0, 0);
        this.disclaimerTextView.setTextColor(-6710887);
        this.disclaimerTextView.setTextSize(2, 12.0f);
        this.disclaimerTextView.setMaxLines(2);
        this.disclaimerTextView.setEllipsize(TextUtils.TruncateAt.END);
        this.ctaButton.setTextColor(STANDARD_BLUE);
        this.ctaButton.setLines(1);
        this.ctaButton.setTextSize(2, 16.0f);
        this.ctaButton.setEllipsize(TextUtils.TruncateAt.END);
        this.ratingView.setStarSize(this.ratingHeight);
        this.centerLayout.setOrientation(1);
        this.topLayout.setOrientation(0);
        this.topLayout.setGravity(16);
        this.ratingLayout.setOrientation(0);
        this.ratingLayout.setGravity(16);
    }

    private PromoCardRecyclerView.PromoCardAdapter useAdapter(List<NativePromoCard> list) {
        if (this.cardAdapter == null) {
            this.cardAdapter = new PromoCardRecyclerView.PromoCardAdapter() {
                public PromoCardView getPromoCardView() {
                    return NativeViewsFactory.getNativeAdCardView(NativeAdView.this.getContext());
                }
            };
        }
        this.cardAdapter.setCards(list);
        return this.cardAdapter;
    }

    public TextView getAdvertisingTextView() {
        return this.advertTextView;
    }

    public TextView getAgeRestrictionTextView() {
        return this.ageTextView;
    }

    public Button getCtaButtonView() {
        return this.ctaButton;
    }

    public TextView getDescriptionTextView() {
        return this.descriptionTextView;
    }

    public TextView getDisclaimerTextView() {
        return this.disclaimerTextView;
    }

    public TextView getDomainOrCategoryTextView() {
        return this.urlTextView;
    }

    public IconAdView getIconImageView() {
        return this.iconAdView;
    }

    public MediaAdView getMediaAdView() {
        return this.mediaAdView;
    }

    public PromoCardRecyclerView getPromoCardRecyclerView() {
        return this.promoCardRecyclerView;
    }

    public StarsRatingView getStarsRatingView() {
        return this.ratingView;
    }

    public TextView getTitleTextView() {
        return this.titleTextView;
    }

    public TextView getVotesTextView() {
        return this.votesTextView;
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        PromoCardRecyclerView promoCardRecyclerView2;
        int paddingLeft = getPaddingLeft();
        C10059y8.m29844c(this.topLayout, getPaddingTop(), paddingLeft);
        int a = C10059y8.m29826a(this.iconAdView.getMeasuredHeight(), this.centerLayout.getMeasuredHeight());
        int bottom = this.topLayout.getBottom() + this.innerMargins;
        C10059y8.m29844c(this.iconAdView, ((a - this.iconAdView.getMeasuredHeight()) / 2) + bottom, paddingLeft);
        int a2 = C10059y8.m29826a(this.iconAdView.getRight() + this.innerMargins, paddingLeft);
        C10059y8.m29844c(this.centerLayout, ((a - this.centerLayout.getMeasuredHeight()) / 2) + bottom, a2);
        int i5 = bottom + a;
        int i6 = this.smallMargin + i5;
        if (!this.useExtendedCard || (promoCardRecyclerView2 = this.promoCardRecyclerView) == null) {
            C10059y8.m29844c(this.mediaAdView, i6, paddingLeft);
            int a3 = C10059y8.m29826a(this.descriptionTextView.getMeasuredHeight(), this.ctaButton.getMeasuredHeight());
            MediaAdView mediaAdView2 = this.mediaAdView;
            if (mediaAdView2 != null) {
                i6 = mediaAdView2.getBottom();
            }
            int paddingBottom = i6 + getPaddingBottom();
            C10059y8.m29844c(this.descriptionTextView, ((a3 - this.descriptionTextView.getMeasuredHeight()) / 2) + paddingBottom, paddingLeft);
            C10059y8.m29838b(this.ctaButton, ((a3 - this.ctaButton.getMeasuredHeight()) / 2) + paddingBottom, getMeasuredWidth() - getPaddingRight());
            C10059y8.m29844c(this.disclaimerTextView, paddingBottom + a3 + this.smallMargin, paddingLeft);
            return;
        }
        C10059y8.m29844c(promoCardRecyclerView2, i5 + this.innerMargins, paddingLeft);
    }

    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        PromoCardRecyclerView promoCardRecyclerView2;
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int paddingTop = (size2 - getPaddingTop()) - getPaddingBottom();
        C10059y8.m29830a(this.topLayout, paddingLeft - this.advertisingLabelLeftMargin, paddingTop, Integer.MIN_VALUE);
        this.iconAdView.measure(View.MeasureSpec.makeMeasureSpec(this.iconDimensions, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(this.iconDimensions, Integer.MIN_VALUE));
        C10059y8.m29830a(this.centerLayout, (paddingLeft - this.iconAdView.getMeasuredWidth()) - this.innerMargins, (paddingTop - this.topLayout.getMeasuredHeight()) - this.smallMargin, Integer.MIN_VALUE);
        int i5 = 0;
        if (!this.useExtendedCard || (promoCardRecyclerView2 = this.promoCardRecyclerView) == null) {
            MediaAdView mediaAdView2 = this.mediaAdView;
            if (mediaAdView2 != null) {
                mediaAdView2.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824), View.MeasureSpec.makeMeasureSpec(paddingTop, Integer.MIN_VALUE));
                this.ctaButton.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(this.ctaHeight, 1073741824));
                C10059y8.m29830a(this.descriptionTextView, (paddingLeft - this.ctaButton.getMeasuredWidth()) - this.innerMargins, paddingTop, Integer.MIN_VALUE);
                C10059y8.m29830a(this.disclaimerTextView, paddingLeft, paddingTop, Integer.MIN_VALUE);
                size2 = this.topLayout.getMeasuredHeight() + this.innerMargins + C10059y8.m29826a(this.centerLayout.getMeasuredHeight(), this.iconAdView.getMeasuredHeight()) + this.mediaAdView.getMeasuredHeight() + this.smallMargin + getPaddingBottom() + C10059y8.m29826a(this.descriptionTextView.getMeasuredHeight(), this.ctaButton.getMeasuredHeight()) + getPaddingTop() + getPaddingBottom();
                if (this.disclaimerTextView.getVisibility() == 0) {
                    i5 = this.disclaimerTextView.getMeasuredHeight();
                }
                if (i5 > 0) {
                    i3 = size2 + i5;
                    i4 = this.smallMargin;
                }
            }
            setMeasuredDimension(size, size2);
        }
        promoCardRecyclerView2.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824), View.MeasureSpec.makeMeasureSpec(paddingTop, Integer.MIN_VALUE));
        i3 = this.topLayout.getMeasuredHeight() + this.innerMargins + C10059y8.m29826a(this.centerLayout.getMeasuredHeight(), this.iconAdView.getMeasuredHeight()) + this.promoCardRecyclerView.getMeasuredHeight() + getPaddingTop();
        i4 = getPaddingBottom();
        size2 = i3 + i4;
        setMeasuredDimension(size, size2);
    }

    public void setupView(NativePromoBanner nativePromoBanner) {
        if (nativePromoBanner != null) {
            C9672e0.m27882a("Setup banner");
            if (nativePromoBanner.getIcon() != null) {
                this.iconAdView.setVisibility(0);
            } else {
                this.iconAdView.setVisibility(8);
            }
            if (!this.useExtendedCard || this.promoCardRecyclerView == null) {
                setText(nativePromoBanner.getCtaText(), this.ctaButton);
            } else {
                this.ctaButton.setVisibility(8);
                this.disclaimerTextView.setVisibility(8);
                this.promoCardRecyclerView.setPromoCardAdapter(useAdapter(nativePromoBanner.getCards()));
            }
            if ("web".equals(nativePromoBanner.getNavigationType())) {
                if (!this.useExtendedCard) {
                    this.ratingView.setVisibility(8);
                    this.votesTextView.setVisibility(8);
                    setText(nativePromoBanner.getDomain(), this.urlTextView);
                }
            } else if ("store".equals(nativePromoBanner.getNavigationType())) {
                String category = nativePromoBanner.getCategory();
                String subCategory = nativePromoBanner.getSubCategory();
                String str = "";
                if (!TextUtils.isEmpty(category)) {
                    str = str + category;
                    if (!TextUtils.isEmpty(subCategory)) {
                        str = str + ", ";
                    }
                }
                if (!TextUtils.isEmpty(subCategory)) {
                    str = str + subCategory;
                }
                C10059y8.m29840b(this.urlTextView, "category_text");
                setText(str, this.urlTextView);
                if (nativePromoBanner.getRating() > 0.0f && nativePromoBanner.getRating() <= 5.0f) {
                    this.ratingView.setVisibility(0);
                    if (nativePromoBanner.getVotes() > 0) {
                        setText(String.valueOf(nativePromoBanner.getVotes()), this.votesTextView);
                    } else {
                        this.votesTextView.setVisibility(8);
                    }
                    this.ratingView.setRating(nativePromoBanner.getRating());
                }
            }
            setText(nativePromoBanner.getDisclaimer(), this.disclaimerTextView);
            setText(nativePromoBanner.getTitle(), this.titleTextView);
            setText(nativePromoBanner.getDescription(), this.descriptionTextView);
            setText(nativePromoBanner.getAdvertisingLabel(), this.advertTextView);
            setText(nativePromoBanner.getAgeRestrictions(), this.ageTextView);
        }
    }
}

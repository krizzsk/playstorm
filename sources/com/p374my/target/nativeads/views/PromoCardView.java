package com.p374my.target.nativeads.views;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/* renamed from: com.my.target.nativeads.views.PromoCardView */
public interface PromoCardView {
    Button getCtaButtonView();

    TextView getDescriptionTextView();

    MediaAdView getMediaAdView();

    TextView getTitleTextView();

    View getView();
}

package com.smaato.sdk.nativead;

import android.view.View;
import android.widget.TextView;

public interface NativeAdView {
    TextView ctaView();

    View iconView();

    View mediaView();

    View privacyView();

    View ratingView();

    View richMediaView();

    TextView sponsoredView();

    TextView textView();

    TextView titleView();

    View videoView();
}

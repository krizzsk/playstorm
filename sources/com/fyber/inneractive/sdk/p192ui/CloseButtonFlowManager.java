package com.fyber.inneractive.sdk.p192ui;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.fyber.inneractive.sdk.C4167R;
import com.fyber.inneractive.sdk.activities.InneractiveFullscreenAdActivity;

/* renamed from: com.fyber.inneractive.sdk.ui.CloseButtonFlowManager */
public class CloseButtonFlowManager {

    /* renamed from: a */
    public final View f14110a;

    /* renamed from: b */
    public final TextView f14111b;

    /* renamed from: c */
    public final View f14112c;

    /* renamed from: d */
    public final ImageView f14113d;

    /* renamed from: e */
    public final FrameLayout f14114e;

    /* renamed from: com.fyber.inneractive.sdk.ui.CloseButtonFlowManager$a */
    public class C5302a implements View.OnClickListener {

        /* renamed from: a */
        public final /* synthetic */ InneractiveFullscreenAdActivity f14115a;

        public C5302a(CloseButtonFlowManager closeButtonFlowManager, InneractiveFullscreenAdActivity inneractiveFullscreenAdActivity) {
            this.f14115a = inneractiveFullscreenAdActivity;
        }

        public void onClick(View view) {
            this.f14115a.dismissAd(true);
        }
    }

    public CloseButtonFlowManager(InneractiveFullscreenAdActivity inneractiveFullscreenAdActivity) {
        View findViewById = inneractiveFullscreenAdActivity.findViewById(C4167R.C4169id.ia_fl_close_button);
        this.f14110a = findViewById;
        this.f14111b = (TextView) inneractiveFullscreenAdActivity.findViewById(C4167R.C4169id.ia_tv_close_button);
        View findViewById2 = inneractiveFullscreenAdActivity.findViewById(C4167R.C4169id.ia_clickable_close_button);
        this.f14112c = findViewById2;
        this.f14113d = (ImageView) inneractiveFullscreenAdActivity.findViewById(C4167R.C4169id.ia_iv_close_button);
        this.f14114e = (FrameLayout) inneractiveFullscreenAdActivity.findViewById(C4167R.C4169id.close_button_container);
        findViewById.setVisibility(8);
        findViewById2.setOnClickListener(new C5302a(this, inneractiveFullscreenAdActivity));
    }
}

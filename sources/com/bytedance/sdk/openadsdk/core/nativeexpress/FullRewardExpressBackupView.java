package com.bytedance.sdk.openadsdk.core.nativeexpress;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.C2618b;
import com.bytedance.sdk.component.utils.C2975l;
import com.bytedance.sdk.component.utils.C2984t;
import com.bytedance.sdk.openadsdk.core.p151e.C3481j;
import com.bytedance.sdk.openadsdk.core.p151e.C3498n;
import com.bytedance.sdk.openadsdk.utils.C4014u;
import com.bytedance.sdk.openadsdk.utils.C4020v;

public class FullRewardExpressBackupView extends BackupView {

    /* renamed from: a */
    private View f9032a;

    /* renamed from: m */
    private NativeExpressView f9033m;

    /* renamed from: n */
    private FrameLayout f9034n;

    public FullRewardExpressBackupView(Context context) {
        super(context);
        this.f9018b = context;
    }

    /* renamed from: a */
    public void mo20104a(C3498n nVar, NativeExpressView nativeExpressView) {
        C2975l.m8384b("FullRewardExpressBackupView", "show backup view");
        if (nVar != null) {
            setBackgroundColor(-1);
            this.f9019c = nVar;
            this.f9033m = nativeExpressView;
            if (C4014u.m13219e(this.f9019c) == 7) {
                this.f9022f = "rewarded_video";
            } else {
                this.f9022f = "fullscreen_interstitial_ad";
            }
            m11274b();
            this.f9033m.addView(this, new ViewGroup.LayoutParams(-2, -2));
        }
    }

    /* renamed from: b */
    private void m11274b() {
        this.f9023g = C4020v.m13315e(this.f9018b, (float) this.f9033m.getExpectExpressWidth());
        this.f9024h = C4020v.m13315e(this.f9018b, (float) this.f9033m.getExpectExpressWidth());
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(this.f9023g, this.f9024h);
        }
        layoutParams.width = this.f9023g;
        layoutParams.height = this.f9024h;
        if (layoutParams instanceof FrameLayout.LayoutParams) {
            ((FrameLayout.LayoutParams) layoutParams).gravity = 17;
        }
        setLayoutParams(layoutParams);
        this.f9019c.mo19750v();
        m11275c();
    }

    /* renamed from: c */
    private void m11275c() {
        View inflate = LayoutInflater.from(this.f9018b).inflate(C2984t.m8433f(this.f9018b, "tt_backup_full_reward"), this, true);
        this.f9032a = inflate;
        FrameLayout frameLayout = (FrameLayout) inflate.findViewById(C2984t.m8432e(this.f9018b, "tt_bu_video_container"));
        this.f9034n = frameLayout;
        frameLayout.removeAllViews();
    }

    public FrameLayout getVideoContainer() {
        return this.f9034n;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo19260a(View view, int i, C3481j jVar) {
        NativeExpressView nativeExpressView = this.f9033m;
        if (nativeExpressView != null) {
            nativeExpressView.mo16722a(view, i, (C2618b) jVar);
        }
    }

    public View getBackupContainerBackgroundView() {
        return this.f9032a;
    }
}

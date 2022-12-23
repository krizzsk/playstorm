package com.bytedance.sdk.openadsdk.core.video.nativevideo;

import android.view.View;
import com.bytedance.sdk.openadsdk.core.C3578m;
import com.bytedance.sdk.openadsdk.core.nativeexpress.C3624o;
import com.bytedance.sdk.openadsdk.p176i.C3854d;
import com.bytedance.sdk.openadsdk.utils.C4014u;
import com.bytedance.sdk.openadsdk.utils.C4020v;

public class NativeDrawVideoTsView extends NativeVideoTsView implements View.OnClickListener {

    /* renamed from: q */
    private boolean f9390q;

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo20094b() {
        if (!this.f9408e || !C3624o.m11478b(this.f9415l)) {
            this.f9407d = false;
        }
        this.f9415l = "draw_ad";
        C3578m.m11241h().mo19963o(String.valueOf(C4014u.m13223f(this.f9404a)));
        super.mo20094b();
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo20095c() {
        if (this.f9390q) {
            super.mo20095c();
        }
    }

    public void setCanInterruptVideoPlay(boolean z) {
        this.f9390q = z;
    }

    /* access modifiers changed from: protected */
    public void onWindowVisibilityChanged(int i) {
        if (this.f9412i == null || this.f9412i.getVisibility() != 0) {
            super.onWindowVisibilityChanged(i);
        } else {
            m11864e();
        }
    }

    public void onWindowFocusChanged(boolean z) {
        if (this.f9412i == null || this.f9412i.getVisibility() != 0) {
            super.onWindowFocusChanged(z);
        } else {
            m11864e();
        }
    }

    /* renamed from: d */
    private void m11863d() {
        C4020v.m13282a((View) this.f9410g, 0);
        C4020v.m13282a((View) this.f9411h, 0);
        C4020v.m13282a((View) this.f9413j, 8);
    }

    /* renamed from: e */
    private void m11864e() {
        mo20299g();
        if (this.f9410g != null) {
            if (this.f9410g.getVisibility() != 0) {
                C3854d.m12660a().mo20704a(this.f9404a.mo19607J().mo16358h(), this.f9411h);
            } else {
                return;
            }
        }
        m11863d();
    }

    public void onClick(View view) {
        if (this.f9412i != null && this.f9412i.getVisibility() == 0) {
            C4020v.m13316e((View) this.f9410g);
        }
        mo20095c();
    }
}

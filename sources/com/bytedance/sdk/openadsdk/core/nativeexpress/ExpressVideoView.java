package com.bytedance.sdk.openadsdk.core.nativeexpress;

import android.content.Context;
import android.view.View;
import com.bykv.p068vk.openvk.component.video.api.p086d.C2524b;
import com.bytedance.sdk.openadsdk.core.p151e.C3498n;
import com.bytedance.sdk.openadsdk.core.video.nativevideo.NativeVideoTsView;
import com.bytedance.sdk.openadsdk.p130b.C3167j;
import com.bytedance.sdk.openadsdk.p176i.C3854d;
import com.bytedance.sdk.openadsdk.utils.C4020v;

public class ExpressVideoView extends NativeVideoTsView implements View.OnClickListener {

    /* renamed from: q */
    private boolean f9031q = false;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo20093a(boolean z) {
    }

    public ExpressVideoView(Context context, C3498n nVar, String str, C3167j jVar) {
        super(context, nVar, false, str, false, false, jVar);
        if ("draw_ad".equals(str)) {
            this.f9031q = true;
        }
        setOnClickListener(this);
        setNeedNativeVideoPlayBtnVisible(false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo20094b() {
        if (!this.f9408e || !C3624o.m11478b(this.f9415l)) {
            this.f9407d = false;
        }
        super.mo20094b();
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo20095c() {
        if (this.f9031q) {
            super.mo20095c();
        }
    }

    public void setCanInterruptVideoPlay(boolean z) {
        this.f9031q = z;
    }

    public void setShouldCheckNetChange(boolean z) {
        if (this.f9405b != null) {
            this.f9405b.mo16447e(z);
        }
    }

    /* renamed from: d */
    public void mo20096d() {
        if (this.f9413j != null) {
            C4020v.m13282a((View) this.f9413j, 8);
        }
    }

    /* access modifiers changed from: protected */
    public void onWindowVisibilityChanged(int i) {
        if (this.f9412i == null || this.f9412i.getVisibility() != 0) {
            super.onWindowVisibilityChanged(i);
        } else {
            m11268o();
        }
    }

    public void onWindowFocusChanged(boolean z) {
        if (this.f9412i == null || this.f9412i.getVisibility() != 0) {
            super.onWindowFocusChanged(z);
        } else {
            m11268o();
        }
    }

    /* renamed from: n */
    private void m11267n() {
        C4020v.m13282a((View) this.f9410g, 0);
        C4020v.m13282a((View) this.f9411h, 0);
        C4020v.m13282a((View) this.f9413j, 8);
    }

    /* renamed from: o */
    private void m11268o() {
        mo20299g();
        if (this.f9410g != null) {
            if (this.f9410g.getVisibility() != 0) {
                C3854d.m12660a().mo20704a(this.f9404a.mo19607J().mo16358h(), this.f9411h);
            } else {
                return;
            }
        }
        m11267n();
    }

    public void onClick(View view) {
        if (this.f9412i != null && this.f9412i.getVisibility() == 0) {
            C4020v.m13316e((View) this.f9410g);
        }
        mo20095c();
    }

    public void setShowAdInteractionView(boolean z) {
        C2524b o;
        if (this.f9405b != null && (o = this.f9405b.mo16457o()) != null) {
            o.mo16426a(z);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo20097e() {
        mo20299g();
        C4020v.m13282a((View) this.f9410g, 0);
    }
}

package com.bytedance.sdk.openadsdk.component.reward.view;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.C2618b;
import com.bytedance.sdk.component.adexpress.p095b.C2622c;
import com.bytedance.sdk.component.adexpress.p095b.C2623d;
import com.bytedance.sdk.component.adexpress.p095b.C2635m;
import com.bytedance.sdk.component.utils.C2975l;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.core.nativeexpress.C3617j;
import com.bytedance.sdk.openadsdk.core.nativeexpress.C3624o;
import com.bytedance.sdk.openadsdk.core.nativeexpress.FullRewardExpressBackupView;
import com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView;
import com.bytedance.sdk.openadsdk.core.p151e.C3498n;
import com.bytedance.sdk.openadsdk.utils.C4020v;

public class FullRewardExpressView extends NativeExpressView {

    /* renamed from: c */
    public static float f8113c = 100.0f;

    /* renamed from: a */
    C3617j f8114a;

    /* renamed from: b */
    FullRewardExpressBackupView f8115b;

    public FullRewardExpressView(Context context, C3498n nVar, AdSlot adSlot, String str, boolean z) {
        super(context, nVar, adSlot, str, z);
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public void mo19268g() {
        this.f9083m = true;
        this.f9081k = new FrameLayout(this.f9076f);
        addView(this.f9081k, new FrameLayout.LayoutParams(-1, -1));
        super.mo19268g();
        if (getWebView() != null) {
            getWebView().setBackgroundColor(0);
        }
        m10085h();
    }

    /* renamed from: h */
    private void m10085h() {
        setBackupListener(new C2622c() {
            /* renamed from: a */
            public boolean mo16718a(ViewGroup viewGroup, int i) {
                try {
                    ((NativeExpressView) viewGroup).mo20128m();
                    FullRewardExpressView.this.f8115b = new FullRewardExpressBackupView(viewGroup.getContext());
                    FullRewardExpressView.this.f8115b.mo20104a(FullRewardExpressView.this.f9079i, (NativeExpressView) viewGroup);
                    return true;
                } catch (Exception unused) {
                    return false;
                }
            }
        });
    }

    /* renamed from: a */
    public void mo16808a(C2623d<? extends View> dVar, C2635m mVar) {
        if (dVar instanceof C3624o) {
            C3624o oVar = (C3624o) dVar;
            if (oVar.mo20199p() != null) {
                oVar.mo20199p().mo20427a((C3617j) this);
            }
        }
        if (mVar != null && mVar.mo16786a()) {
            m10082a(mVar);
        }
        super.mo16808a(dVar, mVar);
    }

    public void setExpressVideoListenerProxy(C3617j jVar) {
        this.f8114a = jVar;
    }

    /* renamed from: a */
    private void m10082a(final C2635m mVar) {
        if (mVar != null) {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                m10084b(mVar);
            } else {
                new Handler(Looper.getMainLooper()).post(new Runnable() {
                    public void run() {
                        FullRewardExpressView.this.m10084b(mVar);
                    }
                });
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m10084b(C2635m mVar) {
        if (mVar != null) {
            double d = mVar.mo16795d();
            double e = mVar.mo16798e();
            double f = mVar.mo16800f();
            double g = mVar.mo16802g();
            int b = (int) C4020v.m13297b(this.f9076f, (float) d);
            int b2 = (int) C4020v.m13297b(this.f9076f, (float) e);
            int b3 = (int) C4020v.m13297b(this.f9076f, (float) f);
            int b4 = (int) C4020v.m13297b(this.f9076f, (float) g);
            C2975l.m8384b("ExpressView", "videoWidth:" + f);
            C2975l.m8384b("ExpressView", "videoHeight:" + g);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f9081k.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = new FrameLayout.LayoutParams(b3, b4);
            }
            layoutParams.width = b3;
            layoutParams.height = b4;
            layoutParams.topMargin = b2;
            layoutParams.leftMargin = b;
            this.f9081k.setLayoutParams(layoutParams);
            this.f9081k.removeAllViews();
        }
    }

    /* renamed from: a */
    public void mo18495a(boolean z) {
        C2975l.m8384b("FullRewardExpressView", "onMuteVideo,mute:" + z);
        C3617j jVar = this.f8114a;
        if (jVar != null) {
            jVar.mo18495a(z);
        }
        setSoundMute(z);
    }

    /* renamed from: a */
    public void mo18493a() {
        C2975l.m8384b("FullRewardExpressView", "onSkipVideo");
        C3617j jVar = this.f8114a;
        if (jVar != null) {
            jVar.mo18493a();
        }
    }

    /* renamed from: b */
    public void mo18496b() {
        C3617j jVar = this.f8114a;
        if (jVar != null) {
            jVar.mo18496b();
        }
    }

    /* renamed from: a */
    public void mo18494a(int i) {
        C2975l.m8384b("FullRewardExpressView", "onChangeVideoState,stateType:" + i);
        C3617j jVar = this.f8114a;
        if (jVar != null) {
            jVar.mo18494a(i);
        }
    }

    /* renamed from: c */
    public long mo18498c() {
        C2975l.m8384b("FullRewardExpressView", "onGetCurrentPlayTime");
        C3617j jVar = this.f8114a;
        if (jVar != null) {
            return jVar.mo18498c();
        }
        return 0;
    }

    /* renamed from: d */
    public int mo18499d() {
        C2975l.m8384b("FullRewardExpressView", "onGetVideoState");
        C3617j jVar = this.f8114a;
        if (jVar != null) {
            return jVar.mo18499d();
        }
        return 0;
    }

    /* renamed from: e */
    public void mo18500e() {
        C3617j jVar = this.f8114a;
        if (jVar != null) {
            jVar.mo18500e();
        }
    }

    /* renamed from: a */
    public void mo16722a(View view, int i, C2618b bVar) {
        if (i == -1 || bVar == null || i != 3) {
            super.mo16722a(view, i, bVar);
        } else {
            mo18500e();
        }
    }

    public FrameLayout getVideoFrameLayout() {
        if (mo20129n()) {
            return this.f8115b.getVideoContainer();
        }
        return this.f9081k;
    }

    public View getBackupContainerBackgroundView() {
        if (mo20129n()) {
            return this.f8115b.getBackupContainerBackgroundView();
        }
        return null;
    }

    /* renamed from: b */
    public void mo18497b(int i) {
        C3617j jVar = this.f8114a;
        if (jVar != null) {
            jVar.mo18497b(i);
        }
    }
}

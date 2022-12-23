package com.bytedance.sdk.openadsdk.component;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.os.RemoteException;
import com.bytedance.sdk.component.p125f.C2952e;
import com.bytedance.sdk.component.p125f.C2955g;
import com.bytedance.sdk.component.utils.C2959b;
import com.bytedance.sdk.component.utils.C2975l;
import com.bytedance.sdk.openadsdk.IListenerManager;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.TTAppOpenAd;
import com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity;
import com.bytedance.sdk.openadsdk.core.C3578m;
import com.bytedance.sdk.openadsdk.core.C3645t;
import com.bytedance.sdk.openadsdk.core.p151e.C3498n;
import com.bytedance.sdk.openadsdk.multipro.C3953b;
import com.bytedance.sdk.openadsdk.multipro.aidl.C3917a;
import com.bytedance.sdk.openadsdk.multipro.aidl.p181a.C3923b;
import com.bytedance.sdk.openadsdk.multipro.aidl.p182b.C3931a;
import com.bytedance.sdk.openadsdk.utils.C4002l;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.bytedance.sdk.openadsdk.component.b */
/* compiled from: TTAppOpenAdImpl */
public class C3259b implements TTAppOpenAd {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Context f7715a;

    /* renamed from: b */
    private final C3498n f7716b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public TTAppOpenAd.AppOpenAdInteractionListener f7717c;

    /* renamed from: d */
    private final AtomicBoolean f7718d = new AtomicBoolean(false);
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final String f7719e;

    /* renamed from: f */
    private final boolean f7720f;

    public C3259b(Context context, C3498n nVar, boolean z) {
        this.f7715a = context;
        this.f7716b = nVar;
        this.f7720f = z;
        this.f7719e = C4002l.m13120a();
    }

    public void setOpenAdInteractionListener(TTAppOpenAd.AppOpenAdInteractionListener appOpenAdInteractionListener) {
        this.f7717c = appOpenAdInteractionListener;
        m9505a();
    }

    /* renamed from: a */
    private void m9505a() {
        if (C3953b.m12901c()) {
            C2952e.m8317c(new C2955g("AppOpenAd_registerMultiProcessListener") {
                public void run() {
                    C3917a a = C3917a.m12866a(C3259b.this.f7715a);
                    if (C3259b.this.f7717c != null) {
                        C2975l.m8384b("MultiProcess", "start registerAppOpenListener ! ");
                        IListenerManager asInterface = C3923b.asInterface(a.mo20811a(7));
                        if (asInterface != null) {
                            try {
                                asInterface.registerAppOpenAdListener(C3259b.this.f7719e, new C3931a(C3259b.this.f7717c));
                                TTAppOpenAd.AppOpenAdInteractionListener unused = C3259b.this.f7717c = null;
                                C2975l.m8384b("MultiProcess", "end registerAppOpenAdListener ! ");
                            } catch (RemoteException e) {
                                e.printStackTrace();
                            }
                        }
                    }
                }
            }, 5);
        }
    }

    public void showAppOpenAd(Activity activity) {
        Context context;
        if (activity != null && activity.isFinishing()) {
            activity = null;
        }
        int i = 1;
        if (!this.f7718d.getAndSet(true)) {
            if (Looper.getMainLooper() == Looper.myLooper()) {
                if (activity != null) {
                    context = activity;
                } else {
                    context = this.f7715a;
                }
                if (context == null) {
                    context = C3578m.m11231a();
                }
                int i2 = 0;
                try {
                    i2 = activity.getWindowManager().getDefaultDisplay().getRotation();
                } catch (Exception unused) {
                }
                Intent intent = new Intent(context, TTAppOpenAdActivity.class);
                intent.putExtra("orientation_angle", i2);
                if (!this.f7720f) {
                    i = 2;
                }
                intent.putExtra("ad_source", i);
                if (C3953b.m12901c()) {
                    intent.putExtra(TTAdConstant.MULTI_PROCESS_MATERIALMETA, this.f7716b.mo19674ar().toString());
                    intent.putExtra(TTAdConstant.MULTI_PROCESS_META_MD5, this.f7719e);
                } else {
                    C3645t.m11590a().mo20230h();
                    C3645t.m11590a().mo20220a(this.f7716b);
                    C3645t.m11590a().mo20217a(this.f7717c);
                    this.f7717c = null;
                }
                C2959b.m8339a(context, intent, new C2959b.C2960a() {
                    /* renamed from: a */
                    public void mo17887a() {
                        C2975l.m8384b("TTAppOpenAdImpl", "app open ad startActivitySuccess");
                    }

                    /* renamed from: a */
                    public void mo17888a(Throwable th) {
                        C2975l.m8384b("TTAppOpenAdImpl", "app open ad startActivityFail");
                    }
                });
                return;
            }
            C2975l.m8391e("TTAppOpenAdImpl", "showTTAppOpenAd error: not main looper");
            throw new IllegalStateException("Cannot be called in a child thread ---- TTAppOpenAdImpl.showAppOpenAd");
        }
    }
}

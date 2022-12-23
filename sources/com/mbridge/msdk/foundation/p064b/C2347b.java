package com.mbridge.msdk.foundation.p064b;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.mbridge.msdk.foundation.controller.C2350a;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.p064b.p065a.C2340a;
import com.mbridge.msdk.foundation.same.report.C8542e;
import com.mbridge.msdk.foundation.tools.C8608u;
import com.mbridge.msdk.foundation.tools.C8613y;
import com.mbridge.msdk.p054c.C2278a;
import com.mbridge.msdk.p054c.C2283b;
import com.mbridge.msdk.widget.FeedBackButton;
import com.mbridge.msdk.widget.dialog.MBFeedBackDialog;
import java.lang.ref.WeakReference;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;

/* renamed from: com.mbridge.msdk.foundation.b.b */
/* compiled from: FeedbackManager */
public final class C2347b {

    /* renamed from: a */
    public static int f4896a = -2;

    /* renamed from: b */
    public static int f4897b = -2;

    /* renamed from: c */
    public static volatile boolean f4898c = false;

    /* renamed from: d */
    private final ConcurrentHashMap<String, C2340a> f4899d;

    /* renamed from: e */
    private final RelativeLayout.LayoutParams f4900e;

    /* renamed from: f */
    private C2278a f4901f;

    /* renamed from: com.mbridge.msdk.foundation.b.b$a */
    /* compiled from: FeedbackManager */
    static class C2349a {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public static final C2347b f4902a = new C2347b();
    }

    private C2347b() {
        this.f4899d = new ConcurrentHashMap<>();
        this.f4900e = new RelativeLayout.LayoutParams(f4896a, f4897b);
    }

    /* renamed from: a */
    public static C2347b m5579a() {
        return C2349a.f4902a;
    }

    /* renamed from: a */
    public final Activity mo15760a(Context context) {
        Activity activity;
        Context c = C2350a.m5601e().mo15787c();
        Activity activity2 = null;
        try {
            Activity activity3 = c instanceof Activity ? (Activity) c : null;
            try {
                if ((context instanceof Activity) && (Build.VERSION.SDK_INT < 17 || !((Activity) context).isDestroyed())) {
                    activity3 = (Activity) context;
                }
                WeakReference<Activity> a = C2350a.m5601e().mo15776a();
                if (a != null && (activity = (Activity) a.get()) != null && !activity.isFinishing() && (Build.VERSION.SDK_INT < 17 || !activity.isDestroyed())) {
                    activity3 = activity;
                }
                if (activity3 == null || activity3.isFinishing()) {
                    return null;
                }
                if (Build.VERSION.SDK_INT < 17 || !activity3.isDestroyed()) {
                    return activity3;
                }
                return null;
            } catch (Exception e) {
                e = e;
                activity2 = activity3;
                e.printStackTrace();
                return activity2;
            }
        } catch (Exception e2) {
            e = e2;
            e.printStackTrace();
            return activity2;
        }
    }

    /* renamed from: a */
    private boolean m5580a(Context context, MBFeedBackDialog mBFeedBackDialog) {
        Activity a = mo15760a(context);
        if (a == null || mBFeedBackDialog == null) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 17 && a.isDestroyed()) {
            return false;
        }
        try {
            if (mBFeedBackDialog.isShowing() || a.isFinishing()) {
                return false;
            }
            mBFeedBackDialog.show();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: a */
    public final boolean mo15770a(String str, Context context, MBFeedBackDialog mBFeedBackDialog) {
        if (mBFeedBackDialog != null) {
            return m5580a(context, mBFeedBackDialog);
        }
        C8608u.m24882b("", "mbAlertDialog  is null");
        return false;
    }

    /* renamed from: a */
    public final void mo15765a(String str, int i, ViewGroup viewGroup) {
        C2340a a = mo15761a(str);
        if (a.mo15748c() != null) {
            a.mo15741a(i);
            if (i == 0) {
                mo15766a(str, C2350a.m5601e().mo15792g(), viewGroup, (ViewGroup.LayoutParams) null, (C2339a) null);
            }
        }
    }

    /* renamed from: a */
    public final void mo15763a(String str, int i, int i2, int i3, float f, float f2, float f3, String str2, String str3, float f4, JSONArray jSONArray) {
        C2340a a = mo15761a(str);
        Context g = C2350a.m5601e().mo15792g();
        a.mo15742a(C8613y.m24929b(g, f), C8613y.m24929b(g, f2), C8613y.m24929b(g, (float) i), C8613y.m24929b(g, (float) i2), C8613y.m24929b(g, (float) i3), f3, str2, str3, f4, jSONArray);
    }

    /* renamed from: b */
    public final boolean mo15773b() {
        C2278a b = C2283b.m5275a().mo15563b(C2350a.m5601e().mo15793h());
        this.f4901f = b;
        if (b == null) {
            this.f4901f = C2283b.m5275a().mo15562b();
        }
        return this.f4901f.mo15475an() != 0;
    }

    /* renamed from: a */
    public final void mo15767a(String str, C2339a aVar) {
        C2340a a = mo15761a(str);
        if (aVar != null) {
            a.mo15743a(new C2340a.C2346a(str, aVar));
        }
    }

    /* JADX WARNING: type inference failed for: r4v2, types: [android.view.View] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo15766a(java.lang.String r3, android.content.Context r4, android.view.ViewGroup r5, android.view.ViewGroup.LayoutParams r6, com.mbridge.msdk.foundation.p064b.C2339a r7) {
        /*
            r2 = this;
            boolean r0 = r2.mo15773b()
            if (r0 != 0) goto L_0x0007
            return
        L_0x0007:
            com.mbridge.msdk.foundation.b.a.a r0 = r2.mo15761a((java.lang.String) r3)
            if (r7 == 0) goto L_0x0015
            com.mbridge.msdk.foundation.b.a.a$a r1 = new com.mbridge.msdk.foundation.b.a.a$a
            r1.<init>(r3, r7)
            r0.mo15743a((com.mbridge.msdk.foundation.p064b.p065a.C2340a.C2346a) r1)
        L_0x0015:
            com.mbridge.msdk.widget.FeedBackButton r3 = r0.mo15748c()
            if (r3 == 0) goto L_0x0057
            if (r6 != 0) goto L_0x0032
            com.mbridge.msdk.foundation.controller.a r6 = com.mbridge.msdk.foundation.controller.C2350a.m5601e()
            android.content.Context r6 = r6.mo15792g()
            r7 = 1092616192(0x41200000, float:10.0)
            int r6 = com.mbridge.msdk.foundation.tools.C8613y.m24929b((android.content.Context) r6, (float) r7)
            android.widget.RelativeLayout$LayoutParams r7 = r2.f4900e
            r7.setMargins(r6, r6, r6, r6)
            android.widget.RelativeLayout$LayoutParams r6 = r2.f4900e
        L_0x0032:
            android.view.ViewParent r7 = r3.getParent()
            android.view.ViewGroup r7 = (android.view.ViewGroup) r7
            if (r7 == 0) goto L_0x003d
            r7.removeView(r3)
        L_0x003d:
            android.app.Activity r4 = r2.mo15760a((android.content.Context) r4)
            if (r4 == 0) goto L_0x004f
            if (r5 != 0) goto L_0x004f
            r5 = 16908290(0x1020002, float:2.3877235E-38)
            android.view.View r4 = r4.findViewById(r5)
            r5 = r4
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
        L_0x004f:
            if (r5 == 0) goto L_0x0057
            r5.removeView(r3)
            r5.addView(r3, r6)
        L_0x0057:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.p064b.C2347b.mo15766a(java.lang.String, android.content.Context, android.view.ViewGroup, android.view.ViewGroup$LayoutParams, com.mbridge.msdk.foundation.b.a):void");
    }

    /* renamed from: a */
    public final void mo15762a(String str, int i) {
        C2340a a = mo15761a(str);
        if (i == 1) {
            a.mo15746b();
        } else {
            a.mo15740a();
        }
    }

    /* renamed from: a */
    public final void mo15768a(String str, CampaignEx campaignEx) {
        mo15761a(str).mo15744a(campaignEx);
    }

    /* renamed from: b */
    public final void mo15772b(String str, int i) {
        mo15761a(str).mo15747b(i);
    }

    /* renamed from: c */
    public final void mo15775c(String str, int i) {
        mo15761a(str).mo15749c(i);
    }

    /* renamed from: a */
    public final C2340a mo15761a(String str) {
        C2340a aVar;
        if (TextUtils.isEmpty(str)) {
            str = C2350a.m5601e().mo15793h();
        }
        if (!this.f4899d.containsKey(str)) {
            aVar = new C2340a(str);
            this.f4899d.put(str, aVar);
        } else {
            aVar = this.f4899d.get(str);
        }
        if (aVar != null) {
            return aVar;
        }
        C2340a aVar2 = new C2340a(str);
        this.f4899d.put(str, aVar2);
        return aVar2;
    }

    /* renamed from: a */
    public final void mo15769a(String str, FeedBackButton feedBackButton) {
        mo15761a(str).mo15745a(feedBackButton);
    }

    /* renamed from: b */
    public final FeedBackButton mo15771b(String str) {
        return mo15761a(str).mo15748c();
    }

    /* renamed from: a */
    public final void mo15764a(String str, int i, int i2, String str2) {
        String str3;
        String str4;
        C2340a a = mo15761a(str);
        CampaignEx e = a.mo15751e();
        if (e != null) {
            str3 = e.getCampaignUnitId();
        } else {
            str3 = "";
        }
        int f = a.mo15752f();
        int g = a.mo15753g();
        if (!TextUtils.isEmpty(str2)) {
            str4 = str2;
        } else {
            str4 = "";
        }
        C8542e.m24706a(e, str3, f, g, str4, i, e != null ? e.getAdType() : 0, i2);
    }

    /* renamed from: c */
    public final void mo15774c(String str) {
        C2340a aVar = null;
        try {
            String h = TextUtils.isEmpty(str) ? C2350a.m5601e().mo15793h() : str;
            if (this.f4899d.containsKey(h)) {
                aVar = this.f4899d.get(h);
            }
            if (aVar != null) {
                aVar.mo15750d();
            }
            this.f4899d.remove(str);
            f4898c = false;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

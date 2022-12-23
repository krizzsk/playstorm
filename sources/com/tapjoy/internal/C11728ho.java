package com.tapjoy.internal;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.WindowManager;
import android.widget.FrameLayout;
import com.tapjoy.TJContentActivity;
import com.tapjoy.TapjoyErrorMessage;
import com.tapjoy.TapjoyLog;
import com.tapjoy.internal.C11799ja;

/* renamed from: com.tapjoy.internal.ho */
public class C11728ho extends C11734hq {

    /* renamed from: h */
    private static final String f28529h = C11728ho.class.getSimpleName();
    /* access modifiers changed from: private */

    /* renamed from: i */
    public static C11728ho f28530i;

    /* renamed from: a */
    final String f28531a;

    /* renamed from: b */
    final C11760ie f28532b;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public final C11714hj f28533j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public C11476c f28534k;

    /* renamed from: l */
    private boolean f28535l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public long f28536m;

    /* renamed from: n */
    private Context f28537n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public boolean f28538o = false;

    /* renamed from: a */
    public static void m34075a() {
        C11728ho hoVar = f28530i;
        if (hoVar != null) {
            hoVar.m34085e();
        }
    }

    public C11728ho(C11714hj hjVar, String str, C11760ie ieVar, Context context) {
        this.f28533j = hjVar;
        this.f28531a = str;
        this.f28532b = ieVar;
        this.f28537n = context;
    }

    /* renamed from: b */
    public final void mo72592b() {
        C11760ie ieVar = this.f28532b;
        if (ieVar.f28642a != null) {
            ieVar.f28642a.mo72696b();
        }
        if (ieVar.f28643b != null) {
            ieVar.f28643b.mo72696b();
        }
        ieVar.f28644c.mo72696b();
        if (ieVar.f28646e != null) {
            ieVar.f28646e.mo72696b();
        }
        if (ieVar.f28647f != null) {
            ieVar.f28647f.mo72696b();
        }
        if (ieVar.f28654m != null && ieVar.f28654m.f28656a != null) {
            ieVar.f28654m.f28656a.mo72696b();
        }
    }

    /* renamed from: c */
    public final boolean mo72593c() {
        C11760ie ieVar = this.f28532b;
        if (ieVar.f28644c == null || ieVar.f28644c.f28665b == null) {
            return false;
        }
        if (ieVar.f28654m != null && ieVar.f28654m.f28656a != null && ieVar.f28654m.f28656a.f28665b == null) {
            return false;
        }
        if (ieVar.f28643b == null || ieVar.f28647f == null || ieVar.f28643b.f28665b == null || ieVar.f28647f.f28665b == null) {
            return (ieVar.f28642a == null || ieVar.f28646e == null || ieVar.f28642a.f28665b == null || ieVar.f28646e.f28665b == null) ? false : true;
        }
        return true;
    }

    /* renamed from: a */
    public final void mo72591a(final C11716hk hkVar, final C11652fy fyVar) {
        Activity a = C11410a.m33201a(this.f28537n);
        if (a != null && !a.isFinishing()) {
            try {
                m34076a(a, hkVar, fyVar);
                Class<C11760ie> cls = C11760ie.class;
                Object[] objArr = new Object[1];
                return;
            } catch (WindowManager.BadTokenException unused) {
            }
        }
        Activity a2 = C11700hb.m33954a();
        try {
            TJContentActivity.start(C11714hj.m33999a().f28484e, new TJContentActivity.AbstractContentProducer() {
                public final void show(Activity activity) {
                    try {
                        C11728ho.this.m34076a(activity, hkVar, fyVar);
                    } catch (WindowManager.BadTokenException unused) {
                        C11710hg.m33981b("Failed to show the content for \"{}\" caused by invalid activity", C11728ho.this.f28531a);
                        hkVar.mo71658a(C11728ho.this.f28531a, C11728ho.this.f28553f, (C11693gv) null);
                    }
                }

                public final void dismiss(Activity activity) {
                    C11728ho.this.m34085e();
                }
            }, (a2 == null || (a2.getWindow().getAttributes().flags & 1024) == 0) ? false : true);
            Class<C11760ie> cls2 = C11760ie.class;
            Object[] objArr2 = new Object[1];
        } catch (ActivityNotFoundException unused2) {
            if (a2 != null && !a2.isFinishing()) {
                try {
                    m34076a(a2, hkVar, fyVar);
                    Class<C11760ie> cls3 = C11760ie.class;
                    Object[] objArr3 = new Object[1];
                    return;
                } catch (WindowManager.BadTokenException unused3) {
                    C11710hg.m33981b("Failed to show the content for \"{}\" caused by no registration of TJContentActivity", this.f28531a);
                    hkVar.mo71658a(this.f28531a, this.f28553f, (C11693gv) null);
                }
            }
            C11710hg.m33981b("Failed to show the content for \"{}\" caused by no registration of TJContentActivity", this.f28531a);
            hkVar.mo71658a(this.f28531a, this.f28553f, (C11693gv) null);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m34076a(final Activity activity, final C11716hk hkVar, C11652fy fyVar) {
        if (this.f28535l) {
            TapjoyLog.m33195e(f28529h, new TapjoyErrorMessage(TapjoyErrorMessage.ErrorType.INTEGRATION_ERROR, "Content is already displayed"));
            return;
        }
        this.f28535l = true;
        f28530i = this;
        this.f28554g = fyVar.f28331a;
        C11476c cVar = new C11476c(activity);
        this.f28534k = cVar;
        cVar.setOnCancelListener(new DialogInterface.OnCancelListener() {
            public final void onCancel(DialogInterface dialogInterface) {
                hkVar.mo71661d(C11728ho.this.f28531a);
            }
        });
        this.f28534k.setOnDismissListener(new DialogInterface.OnDismissListener() {
            public final void onDismiss(DialogInterface dialogInterface) {
                String obj;
                C11728ho unused = C11728ho.f28530i = null;
                C11734hq.m34095a((Context) activity, C11728ho.this.f28532b.f28648g);
                C11728ho.this.f28533j.mo72620a(C11728ho.this.f28532b.f28652k, SystemClock.elapsedRealtime() - C11728ho.this.f28536m);
                if (!C11728ho.this.f28551d) {
                    hkVar.mo71658a(C11728ho.this.f28531a, C11728ho.this.f28553f, C11728ho.this.f28532b.f28649h);
                }
                if (C11728ho.this.f28538o && C11728ho.this.f28532b.f28652k != null && C11728ho.this.f28532b.f28652k.containsKey("action_id") && (obj = C11728ho.this.f28532b.f28652k.get("action_id").toString()) != null && obj.length() > 0) {
                    C11714hj c = C11728ho.this.f28533j;
                    if (c.f28481b != null) {
                        C11736hs hsVar = c.f28481b;
                        String a = C11736hs.m34103a();
                        String a2 = hsVar.f28560b.mo72813a();
                        String a3 = hsVar.f28559a.mo72813a();
                        if (a3 == null || !a.equals(a3)) {
                            hsVar.f28559a.mo72814a(a);
                            a2 = "";
                        }
                        if (!(a2.length() == 0)) {
                            obj = !a2.contains(obj) ? a2.concat(",".concat(String.valueOf(obj))) : a2;
                        }
                        hsVar.f28560b.mo72814a(obj);
                    }
                }
                Activity activity = activity;
                if (activity instanceof TJContentActivity) {
                    activity.finish();
                }
            }
        });
        this.f28534k.setCanceledOnTouchOutside(false);
        C11797iz izVar = new C11797iz(activity, this.f28532b, new C11799ja(activity, this.f28532b, new C11799ja.C11800a() {
            /* renamed from: a */
            public final void mo72662a() {
                C11728ho.this.f28534k.cancel();
            }

            /* renamed from: a */
            public final void mo72663a(C11754ic icVar) {
                C11650fw fwVar;
                if (!(!(C11728ho.this.f28554g instanceof C11650fw) || (fwVar = (C11650fw) C11728ho.this.f28554g) == null || fwVar.f28329b == null)) {
                    fwVar.f28329b.mo72513a();
                }
                C11728ho.this.f28533j.mo72621a(C11728ho.this.f28532b.f28652k, icVar.f28623b);
                C11734hq.m34095a((Context) activity, icVar.f28625d);
                if (!TextUtils.isEmpty(icVar.f28626e)) {
                    C11728ho.this.f28552e.mo71894a(activity, icVar.f28626e, C11690gs.m33927b(icVar.f28627f));
                    C11728ho.this.f28551d = true;
                }
                hkVar.mo71657a(C11728ho.this.f28531a, icVar.f28628g);
                if (icVar.f28624c) {
                    C11728ho.this.f28534k.dismiss();
                }
            }

            /* renamed from: b */
            public final void mo72664b() {
                C11728ho hoVar = C11728ho.this;
                boolean unused = hoVar.f28538o = !hoVar.f28538o;
            }
        }));
        FrameLayout frameLayout = new FrameLayout(activity);
        frameLayout.addView(izVar, new FrameLayout.LayoutParams(-2, -2, 17));
        this.f28534k.setContentView(frameLayout);
        try {
            this.f28534k.show();
            this.f28534k.mo72266a();
            if ((activity.getWindow().getAttributes().flags & 1024) != 0) {
                this.f28534k.getWindow().setFlags(1024, 1024);
            }
            this.f28536m = SystemClock.elapsedRealtime();
            this.f28533j.mo72619a(this.f28532b.f28652k);
            fyVar.mo72523b();
            C11644fs fsVar = this.f28554g;
            if (fsVar != null) {
                fsVar.mo72516b();
            }
            hkVar.mo71660c(this.f28531a);
        } catch (WindowManager.BadTokenException e) {
            throw e;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public void m34085e() {
        C11476c cVar = this.f28534k;
        if (cVar != null) {
            cVar.dismiss();
        }
    }
}

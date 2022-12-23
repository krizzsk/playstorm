package com.p374my.target;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.URLUtil;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.my.target.x8 */
public class C10039x8 {

    /* renamed from: a */
    public static final C10039x8 f24955a = new C10039x8();

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m29715a(C9626b3 b3Var, Context context) {
        mo65718a(b3Var);
        String a = mo65717a(b3Var.mo63604b(), b3Var.mo63605c());
        if (a != null) {
            C9752i3.m28221d().mo64164b(a, (String) null, context);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m29716a(String str, Context context) {
        String a = mo65716a(str);
        if (a != null) {
            C9752i3.m28221d().mo64164b(a, (String) null, context);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m29717a(List list, Context context) {
        C9752i3 d = C9752i3.m28221d();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C9626b3 b3Var = (C9626b3) it.next();
            mo65718a(b3Var);
            String a = mo65717a(b3Var.mo63604b(), b3Var.mo63605c());
            if (a != null) {
                d.mo64164b(a, (String) null, context);
            }
        }
    }

    /* renamed from: c */
    public static void m29718c(C9626b3 b3Var, Context context) {
        f24955a.mo65719b(b3Var, context);
    }

    /* renamed from: c */
    public static void m29719c(String str, Context context) {
        f24955a.mo65720b(str, context);
    }

    /* renamed from: c */
    public static void m29720c(List<C9626b3> list, Context context) {
        f24955a.mo65721b(list, context);
    }

    /* renamed from: a */
    public String mo65716a(String str) {
        return mo65717a(str, true);
    }

    /* renamed from: a */
    public String mo65717a(String str, boolean z) {
        if (z) {
            str = C10082z8.m29919a(str);
        }
        if (URLUtil.isNetworkUrl(str)) {
            return str;
        }
        C9672e0.m27882a("invalid stat url: " + str);
        return null;
    }

    /* renamed from: a */
    public final void mo65718a(C9626b3 b3Var) {
        String str;
        if (b3Var instanceof C9601a3) {
            str = "tracking progress stat value:" + ((C9601a3) b3Var).mo63450e() + " url:" + b3Var.mo63604b();
        } else if (b3Var instanceof C10067z2) {
            C10067z2 z2Var = (C10067z2) b3Var;
            str = "tracking ovv stat percent:" + z2Var.f23750d + " value:" + z2Var.mo65859e() + " ovv:" + z2Var.mo65860f() + " url:" + b3Var.mo63604b();
        } else if (b3Var instanceof C10045y2) {
            C10045y2 y2Var = (C10045y2) b3Var;
            str = "tracking mrc stat percent: percent " + y2Var.f23750d + " duration:" + y2Var.f24969e + " url:" + b3Var.mo63604b();
        } else {
            str = "tracking stat type:" + b3Var.mo63602a() + " url:" + b3Var.mo63604b();
        }
        C9672e0.m27882a(str);
    }

    /* renamed from: b */
    public void mo65719b(C9626b3 b3Var, Context context) {
        if (b3Var != null) {
            C9693f0.m27981b(new Runnable(b3Var, context.getApplicationContext()) {
                public final /* synthetic */ C9626b3 f$1;
                public final /* synthetic */ Context f$2;

                {
                    this.f$1 = r2;
                    this.f$2 = r3;
                }

                public final void run() {
                    C10039x8.this.m29715a(this.f$1, this.f$2);
                }
            });
        }
    }

    /* renamed from: b */
    public void mo65720b(String str, Context context) {
        if (!TextUtils.isEmpty(str)) {
            C9693f0.m27981b(new Runnable(str, context.getApplicationContext()) {
                public final /* synthetic */ String f$1;
                public final /* synthetic */ Context f$2;

                {
                    this.f$1 = r2;
                    this.f$2 = r3;
                }

                public final void run() {
                    C10039x8.this.m29716a(this.f$1, this.f$2);
                }
            });
        }
    }

    /* renamed from: b */
    public void mo65721b(List<C9626b3> list, Context context) {
        if (list != null && list.size() > 0) {
            C9693f0.m27981b(new Runnable(list, context.getApplicationContext()) {
                public final /* synthetic */ List f$1;
                public final /* synthetic */ Context f$2;

                {
                    this.f$1 = r2;
                    this.f$2 = r3;
                }

                public final void run() {
                    C10039x8.this.m29717a(this.f$1, this.f$2);
                }
            });
        }
    }
}

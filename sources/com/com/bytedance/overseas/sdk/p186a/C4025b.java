package com.com.bytedance.overseas.sdk.p186a;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.C2975l;
import com.bytedance.sdk.openadsdk.core.C3578m;
import com.bytedance.sdk.openadsdk.core.C3766y;
import com.bytedance.sdk.openadsdk.core.p151e.C3472c;
import com.bytedance.sdk.openadsdk.core.p151e.C3498n;
import com.bytedance.sdk.openadsdk.p130b.C3156e;
import com.bytedance.sdk.openadsdk.p130b.C3177p;
import com.bytedance.sdk.openadsdk.utils.C4014u;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.com.bytedance.overseas.sdk.a.b */
/* compiled from: GPDownLoader */
public class C4025b implements C4026c {

    /* renamed from: a */
    protected C3472c f10280a;

    /* renamed from: b */
    protected C3498n f10281b;

    /* renamed from: c */
    protected String f10282c;

    /* renamed from: d */
    protected boolean f10283d = false;

    /* renamed from: e */
    protected final AtomicBoolean f10284e = new AtomicBoolean(false);

    /* renamed from: f */
    private WeakReference<Context> f10285f;

    /* renamed from: g */
    private boolean f10286g = false;

    public C4025b(Context context, C3498n nVar, String str) {
        this.f10285f = new WeakReference<>(context);
        this.f10281b = nVar;
        this.f10280a = nVar.mo19657aa();
        this.f10282c = str;
        C2975l.m8387c("GPDownLoader", "====tag===" + str);
        if (C3578m.m11231a() == null) {
            C3578m.m11233a(context);
        }
    }

    /* renamed from: a */
    public void mo20931a(boolean z) {
        this.f10286g = z;
    }

    /* renamed from: a */
    public boolean mo20932a(Context context, String str) {
        return m13330b(context, str);
    }

    /* renamed from: b */
    public static boolean m13330b(Context context, String str) {
        Intent launchIntentForPackage;
        if (!(context == null || str == null || TextUtils.isEmpty(str))) {
            C2975l.m8387c("GPDownLoader", "gotoGooglePlay :market://details?id=" + str);
            Intent intent = new Intent("android.intent.action.VIEW");
            Uri parse = Uri.parse("market://details?id=" + str);
            intent.setData(parse);
            for (ResolveInfo next : context.getPackageManager().queryIntentActivities(intent, 65536)) {
                if (next.activityInfo.packageName.equals("com.android.vending") && (launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage("com.android.vending")) != null) {
                    launchIntentForPackage.setComponent(new ComponentName(next.activityInfo.packageName, next.activityInfo.name));
                    launchIntentForPackage.setData(parse);
                    if (!(context instanceof Activity)) {
                        launchIntentForPackage.setFlags(268435456);
                    }
                    context.startActivity(launchIntentForPackage);
                    return true;
                }
            }
            try {
                Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/details?id=" + str));
                intent2.setFlags(268435456);
                context.startActivity(intent2);
                return true;
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public Context mo20933c() {
        WeakReference<Context> weakReference = this.f10285f;
        return (weakReference == null || weakReference.get() == null) ? C3578m.m11231a() : (Context) this.f10285f.get();
    }

    /* renamed from: d */
    public void mo20934d() {
        if (mo20933c() != null) {
            if (mo20930b()) {
                this.f10284e.set(true);
            } else if (!mo20929a() && !mo20935e() && this.f10281b.mo19657aa() == null && this.f10281b.mo19612O() != null) {
                C3766y.m12380a(mo20933c(), this.f10281b.mo19612O(), this.f10281b, C4014u.m13176a(this.f10282c), this.f10282c, true);
            }
        }
    }

    /* renamed from: b */
    public boolean mo20930b() {
        if (this.f10281b.mo19658ab() == null) {
            return false;
        }
        String a = this.f10281b.mo19658ab().mo19534a();
        if (!TextUtils.isEmpty(a)) {
            Uri parse = Uri.parse(a);
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(parse);
            if (C4014u.m13194a(mo20933c(), intent)) {
                if (!(mo20933c() instanceof Activity)) {
                    intent.addFlags(268435456);
                }
                try {
                    C3156e.m9200d(C3578m.m11231a(), this.f10281b, this.f10282c, "open_url_app", (Map<String, Object>) null);
                    mo20933c().startActivity(intent);
                    C3177p.m9301a().mo18797a(this.f10281b, this.f10282c);
                    return true;
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        }
        if (this.f10283d && !this.f10284e.get()) {
            return false;
        }
        this.f10283d = true;
        C3156e.m9200d(mo20933c(), this.f10281b, this.f10282c, "open_fallback_url", (Map<String, Object>) null);
        return false;
    }

    /* renamed from: e */
    public boolean mo20935e() {
        this.f10284e.set(true);
        if (this.f10280a == null || !mo20932a(mo20933c(), this.f10280a.mo19498c())) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public boolean mo20929a() {
        Intent a;
        if (this.f10280a == null) {
            return false;
        }
        C3498n nVar = this.f10281b;
        if (nVar != null && nVar.mo19675as() == 0) {
            return false;
        }
        String c = this.f10280a.mo19498c();
        if (TextUtils.isEmpty(c) || !C4014u.m13202b(mo20933c(), c) || (a = C4014u.m13179a(mo20933c(), c)) == null) {
            return false;
        }
        a.putExtra("START_ONLY_FOR_ANDROID", true);
        try {
            mo20933c().startActivity(a);
            C3156e.m9200d(mo20933c(), this.f10281b, this.f10282c, "click_open", (Map<String, Object>) null);
            return true;
        } catch (Throwable th) {
            th.printStackTrace();
            return false;
        }
    }
}

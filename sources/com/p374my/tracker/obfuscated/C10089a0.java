package com.p374my.tracker.obfuscated;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import com.p374my.tracker.ads.AdEvent;
import com.p374my.tracker.miniapps.MiniAppEvent;
import com.p374my.tracker.obfuscated.C10126m;
import com.p374my.tracker.plugins.MyTrackerPluginConfig;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* renamed from: com.my.tracker.obfuscated.a0 */
public final class C10089a0 {

    /* renamed from: a */
    final AtomicBoolean f25110a = new AtomicBoolean();

    /* renamed from: b */
    final C10178v0 f25111b;

    /* renamed from: c */
    final Application f25112c;

    /* renamed from: d */
    final C10126m f25113d;

    /* renamed from: e */
    final C10086a f25114e;

    /* renamed from: f */
    final C10106e f25115f;

    /* renamed from: g */
    final C10114i f25116g;

    /* renamed from: h */
    final C10160p0 f25117h;

    /* renamed from: i */
    final C10166r0 f25118i;

    /* renamed from: j */
    C10115i0 f25119j;

    /* renamed from: com.my.tracker.obfuscated.a0$a */
    final class C10090a implements C10126m.C10127a {
        C10090a() {
        }

        /* renamed from: a */
        public void mo66066a() {
            C10089a0.this.f25114e.mo66041e();
        }

        /* renamed from: a */
        public void mo66067a(String str) {
            C10089a0.this.f25115f.mo66160b(str);
        }
    }

    C10089a0(C10178v0 v0Var, Application application) {
        this.f25111b = v0Var;
        this.f25112c = application;
        C10175u0.m30446c("MyTracker created, version: 3.0.6");
        C10126m a = C10126m.m30172a(v0Var, (C10126m.C10127a) new C10090a(), (Context) application);
        this.f25113d = a;
        C10166r0 a2 = C10166r0.m30412a(a, v0Var.mo66396a(), application);
        this.f25118i = a2;
        this.f25114e = C10086a.m29933a(a, v0Var, a2, application);
        this.f25115f = C10106e.m30062a(v0Var, (Context) application);
        this.f25116g = C10114i.m30082a(a);
        this.f25117h = C10160p0.m30378a(a, (Context) application);
    }

    /* renamed from: a */
    public static C10089a0 m29945a(String str, C10178v0 v0Var, Application application) {
        v0Var.mo66403a(str);
        return new C10089a0(v0Var, application);
    }

    /* renamed from: a */
    public String mo66050a(Intent intent) {
        return this.f25116g.mo66168a(intent);
    }

    /* renamed from: a */
    public void mo66051a() {
        if (!mo66065b()) {
            this.f25113d.mo66228a();
        }
    }

    /* renamed from: a */
    public void mo66052a(int i, Intent intent) {
        if (!mo66065b()) {
            if (!this.f25111b.mo66426m()) {
                C10175u0.m30440a("MyTracker: autotrackingPurchase is disabled, you should enable it before using onActivityResult(*) method");
            } else {
                this.f25117h.mo66358a(i, intent);
            }
        }
    }

    /* renamed from: a */
    public void mo66053a(int i, List<Object> list) {
        if (!mo66065b()) {
            if (!this.f25111b.mo66426m()) {
                C10175u0.m30440a("MyTracker: autotrackingPurchase is disabled, you should enable it before using onPurchasesUpdated(*) method");
            } else {
                this.f25117h.mo66359a(i, list);
            }
        }
    }

    /* renamed from: a */
    public void mo66054a(int i, Map<String, String> map) {
        if (!mo66065b()) {
            this.f25113d.mo66231a(i, map);
        }
    }

    /* renamed from: a */
    public void mo66055a(Activity activity) {
        if (!mo66065b()) {
            this.f25114e.mo66040d(activity);
        }
    }

    /* renamed from: a */
    public void mo66056a(AdEvent adEvent) {
        if (!mo66065b()) {
            this.f25113d.mo66234a(adEvent);
        }
    }

    /* renamed from: a */
    public void mo66057a(MiniAppEvent miniAppEvent) {
        if (!mo66065b()) {
            this.f25113d.mo66235a(miniAppEvent);
        }
    }

    /* renamed from: a */
    public void mo66058a(String str, String str2, Map<String, String> map) {
        if (!mo66065b()) {
            this.f25113d.mo66241a(str, str2, map);
        }
    }

    /* renamed from: a */
    public void mo66059a(String str, Map<String, String> map) {
        if (!mo66065b()) {
            this.f25113d.mo66242a(str, map);
        }
    }

    /* renamed from: a */
    public void mo66060a(List<MyTrackerPluginConfig> list) {
        if (!this.f25110a.compareAndSet(false, true)) {
            C10175u0.m30440a("MyTracker: tracker has already been initialized");
            return;
        }
        C10175u0.m30446c("MyTracker is initialized with id: " + this.f25111b.mo66418f());
        C10183z.m30504b(this.f25112c);
        this.f25113d.mo66254d();
        C10179w.m30492a(this.f25111b, this.f25113d, this.f25118i, (Context) this.f25112c);
        C10162q.m30389a(this.f25113d, this.f25115f, (Context) this.f25112c);
        C10176v.m30447a(this.f25113d, this.f25115f, this.f25112c);
        this.f25114e.mo66036a();
        this.f25117h.mo66357a();
        if (!list.isEmpty()) {
            C10115i0 a = C10115i0.m30084a(this.f25113d, this.f25112c);
            this.f25119j = a;
            a.mo66169a(list);
        }
    }

    /* renamed from: a */
    public void mo66061a(Map<String, String> map) {
        if (!mo66065b()) {
            this.f25113d.mo66253c(map);
        }
    }

    /* renamed from: a */
    public void mo66062a(JSONObject jSONObject, JSONObject jSONObject2, String str, Map<String, String> map) {
        if (!mo66065b()) {
            if (this.f25111b.mo66426m()) {
                C10175u0.m30440a("MyTracker: autotrackingPurchase is enabled, you mustn't use trackPurchase(*) method");
            } else {
                this.f25117h.mo66361a(jSONObject, jSONObject2, str, map);
            }
        }
    }

    /* renamed from: b */
    public void mo66063b(String str, String str2, Map<String, String> map) {
        if (!mo66065b()) {
            this.f25113d.mo66249b(str, str2, map);
        }
    }

    /* renamed from: b */
    public void mo66064b(Map<String, String> map) {
        if (!mo66065b()) {
            this.f25113d.mo66255d(map);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo66065b() {
        boolean z = !this.f25110a.get();
        if (z) {
            C10175u0.m30444b("MyTracker error: tracker hasn't been initialized");
        }
        return z;
    }
}

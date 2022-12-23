package com.p374my.tracker.obfuscated;

import android.content.Context;
import android.text.TextUtils;
import com.p374my.tracker.ads.AdEvent;
import com.p374my.tracker.miniapps.MiniAppEvent;
import com.p374my.tracker.obfuscated.C10118j0;
import com.p374my.tracker.obfuscated.C10126m;
import com.p374my.tracker.obfuscated.C10170t;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.my.tracker.obfuscated.m */
public final class C10126m {

    /* renamed from: a */
    final Map<Integer, Long> f25246a = new HashMap();

    /* renamed from: b */
    final C10178v0 f25247b;

    /* renamed from: c */
    final Context f25248c;

    /* renamed from: d */
    final C10127a f25249d;

    /* renamed from: e */
    C10105d0 f25250e;

    /* renamed from: f */
    long f25251f = 0;

    /* renamed from: com.my.tracker.obfuscated.m$a */
    public interface C10127a {
        /* renamed from: a */
        void mo66066a();

        /* renamed from: a */
        void mo66067a(String str);
    }

    /* renamed from: com.my.tracker.obfuscated.m$b */
    public interface C10128b {
        /* renamed from: a */
        void mo65989a(List<C10164q0> list);
    }

    private C10126m(C10178v0 v0Var, C10127a aVar, Context context) {
        this.f25247b = v0Var;
        this.f25249d = aVar;
        this.f25248c = context.getApplicationContext();
    }

    /* renamed from: a */
    public static C10126m m30172a(C10178v0 v0Var, C10127a aVar, Context context) {
        return new C10126m(v0Var, aVar, context);
    }

    /* renamed from: a */
    private static Map<String, String> m30173a(Map<String, String> map) {
        if (map == null || map.isEmpty()) {
            return null;
        }
        return new HashMap(map);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m30174a(int i, byte[] bArr, boolean z, boolean z2, long j, Runnable runnable) {
        if (!m30193a(this.f25250e) && this.f25250e.mo66131a(i, bArr, z, z2, j)) {
            mo66245b();
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m30175a(long j) {
        if (!m30193a(this.f25250e)) {
            boolean d = this.f25250e.mo66156d(j, C10121k0.m30104a(this.f25248c).mo66209m());
            if (this.f25250e.mo66132a(j)) {
                d = true;
            }
            if (d) {
                mo66251c();
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m30176a(long j, float f) {
        if (!m30193a(this.f25250e) && !m30192a(25, j)) {
            long j2 = (long) (f * 1000.0f);
            this.f25250e.mo66133a(j2, C10173t0.m30435b(j));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m30177a(long j, float f, float f2, float f3) {
        if (!m30193a(this.f25250e) && !m30192a(27, j)) {
            long b = C10173t0.m30435b(j);
            this.f25250e.mo66134a((long) (f * 1000.0f), (long) (f2 * 1000.0f), (long) (f3 * 1000.0f), b);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m30178a(long j, String str, C10118j0.C10119a aVar, long j2) {
        if (!m30193a(this.f25250e) && this.f25250e.mo66135a(j, str, aVar, j2)) {
            C10121k0.m30104a(this.f25248c).mo66187b(j2);
            this.f25251f = j2;
            mo66245b();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m30179a(AdEvent adEvent, long j) {
        if (!m30193a(this.f25250e) && this.f25250e.mo66136a(adEvent, j)) {
            mo66245b();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m30180a(MiniAppEvent miniAppEvent, long j) {
        if (!m30193a(this.f25250e) && !m30194a(miniAppEvent.name) && !m30201b(miniAppEvent.eventParams) && this.f25250e.mo66137a(miniAppEvent, j)) {
            mo66245b();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m30181a(C10128b bVar, List list) {
        if (m30193a(this.f25250e)) {
            bVar.mo65989a(Collections.EMPTY_LIST);
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            this.f25250e.mo66127a((C10164q0) it.next());
        }
        bVar.mo65989a(list);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m30182a(String str, String str2, long j) {
        if (!m30193a(this.f25250e) && this.f25250e.mo66139a(str, str2, j)) {
            mo66245b();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m30183a(String str, String str2, long j, long j2, long j3) {
        if (!m30193a(this.f25250e) && this.f25250e.mo66140a(str, str2, j, j2, j3)) {
            mo66245b();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m30184a(String str, String str2, long j, Runnable runnable) {
        if (!m30193a(this.f25250e)) {
            if (this.f25250e.mo66150b(str, str2, j)) {
                mo66245b();
            }
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m30185a(String str, String str2, String str3, String str4, String str5, long j) {
        long j2 = j;
        if (!m30193a(this.f25250e) && this.f25250e.mo66141a(str, str2, str3, str4, str5, j)) {
            C10121k0.m30104a(this.f25248c).mo66187b(j2);
            this.f25251f = j2;
            mo66245b();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m30186a(List list) {
        if (!m30193a(this.f25250e)) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C10164q0 q0Var = (C10164q0) it.next();
                this.f25250e.mo66138a(q0Var, (Map<String, String>) null);
                this.f25250e.mo66147b(q0Var);
            }
            mo66245b();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m30187a(Map map, int i, long j) {
        if (!m30193a(this.f25250e) && !m30201b((Map<String, String>) map) && this.f25250e.mo66129a(i, (Map<String, String>) map, j)) {
            mo66245b();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m30188a(Map map, long j) {
        if (!m30193a(this.f25250e) && !m30201b((Map<String, String>) map) && this.f25250e.mo66144a((Map<String, String>) map, j)) {
            mo66245b();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m30189a(Map map, String str, long j) {
        if (!m30193a(this.f25250e) && !m30201b((Map<String, String>) map) && !m30194a(str) && this.f25250e.mo66143a(str, (Map<String, String>) map, j)) {
            mo66245b();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m30190a(Map map, String str, String str2, long j) {
        if (!m30193a(this.f25250e) && !m30201b((Map<String, String>) map) && this.f25250e.mo66142a(str, str2, (Map<String, String>) map, j)) {
            mo66245b();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m30191a(Map map, JSONObject jSONObject, String str, long j, JSONObject jSONObject2, Map map2) {
        if (!m30193a(this.f25250e) && !m30201b((Map<String, String>) map)) {
            if (this.f25250e.mo66138a(C10164q0.m30401a(jSONObject, str, j).mo66370a(jSONObject2), (Map<String, String>) map2)) {
                mo66245b();
            }
        }
    }

    /* renamed from: a */
    private boolean m30192a(int i, long j) {
        Long l = this.f25246a.get(Integer.valueOf(i));
        if (l == null || j - l.longValue() >= 800) {
            this.f25246a.put(Integer.valueOf(i), Long.valueOf(j));
            return false;
        }
        C10175u0.m30440a(String.format(Locale.ENGLISH, "EventTracker: event with type %d was throttled", new Object[]{Integer.valueOf(i)}));
        return true;
    }

    /* renamed from: a */
    static boolean m30193a(C10105d0 d0Var) {
        if (d0Var != null) {
            return false;
        }
        C10175u0.m30444b("EventTracker error: repository is null");
        return true;
    }

    /* renamed from: a */
    static boolean m30194a(String str) {
        if (str == null || str.length() <= 255) {
            return false;
        }
        C10175u0.m30444b("EventTracker error: length of the string " + str + " is more than " + 255 + ", event ignored");
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m30195b(long j, float f) {
        if (!m30193a(this.f25250e) && !m30192a(28, j)) {
            long j2 = (long) (f * 1000.0f);
            this.f25250e.mo66148b(j2, C10173t0.m30435b(j));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m30196b(long j, float f, float f2, float f3) {
        if (!m30193a(this.f25250e) && !m30192a(26, j)) {
            long b = C10173t0.m30435b(j);
            this.f25250e.mo66149b((long) (f * 1000.0f), (long) (f2 * 1000.0f), (long) (f3 * 1000.0f), b);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m30197b(C10128b bVar) {
        bVar.mo65989a(m30193a(this.f25250e) ? Collections.EMPTY_LIST : this.f25250e.mo66145b());
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m30198b(String str, String str2, long j, long j2, long j3) {
        if (!m30193a(this.f25250e) && this.f25250e.mo66151b(str, str2, j, j2, j3)) {
            mo66245b();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m30199b(Map map, long j) {
        if (!m30193a(this.f25250e) && !m30201b((Map<String, String>) map) && this.f25250e.mo66153b((Map<String, String>) map, j)) {
            mo66245b();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m30200b(Map map, String str, String str2, long j) {
        if (!m30193a(this.f25250e) && !m30201b((Map<String, String>) map) && this.f25250e.mo66152b(str, str2, (Map<String, String>) map, j)) {
            mo66245b();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:4:0x0010  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static boolean m30201b(java.util.Map<java.lang.String, java.lang.String> r2) {
        /*
            if (r2 == 0) goto L_0x0030
            java.util.Set r2 = r2.entrySet()
            java.util.Iterator r2 = r2.iterator()
        L_0x000a:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0030
            java.lang.Object r0 = r2.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getKey()
            java.lang.String r1 = (java.lang.String) r1
            boolean r1 = m30194a((java.lang.String) r1)
            if (r1 != 0) goto L_0x002e
            java.lang.Object r0 = r0.getValue()
            java.lang.String r0 = (java.lang.String) r0
            boolean r0 = m30194a((java.lang.String) r0)
            if (r0 == 0) goto L_0x000a
        L_0x002e:
            r2 = 1
            return r2
        L_0x0030:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p374my.tracker.obfuscated.C10126m.m30201b(java.util.Map):boolean");
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ void m30202c(long j, float f) {
        if (!m30193a(this.f25250e) && !m30192a(29, j)) {
            long j2 = (long) (f * 1000.0f);
            this.f25250e.mo66155c(j2, C10173t0.m30435b(j));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public /* synthetic */ void m30203e() {
        if (!m30193a(this.f25250e)) {
            mo66251c();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public /* synthetic */ void m30204f() {
        if (this.f25250e != null) {
            C10175u0.m30444b("EventTracker error: tracker has already been initialized");
            return;
        }
        C10105d0 a = C10105d0.m30029a(this.f25247b, this.f25248c);
        this.f25250e = a;
        if (!m30193a(a)) {
            this.f25251f = C10121k0.m30104a(this.f25248c).mo66203j();
            mo66245b();
        }
    }

    /* renamed from: a */
    public void mo66228a() {
        C10104d.m30023a(new Runnable() {
            public final void run() {
                C10126m.this.m30203e();
            }
        });
    }

    /* renamed from: a */
    public void mo66229a(float f) {
        C10104d.m30023a(new Runnable(System.currentTimeMillis(), f) {
            public final /* synthetic */ long f$1;
            public final /* synthetic */ float f$2;

            {
                this.f$1 = r2;
                this.f$2 = r4;
            }

            public final void run() {
                C10126m.this.m30176a(this.f$1, this.f$2);
            }
        });
    }

    /* renamed from: a */
    public void mo66230a(float f, float f2, float f3) {
        C10104d.m30023a(new Runnable(System.currentTimeMillis(), f, f2, f3) {
            public final /* synthetic */ long f$1;
            public final /* synthetic */ float f$2;
            public final /* synthetic */ float f$3;
            public final /* synthetic */ float f$4;

            {
                this.f$1 = r2;
                this.f$2 = r4;
                this.f$3 = r5;
                this.f$4 = r6;
            }

            public final void run() {
                C10126m.this.m30177a(this.f$1, this.f$2, this.f$3, this.f$4);
            }
        });
    }

    /* renamed from: a */
    public void mo66231a(int i, Map<String, String> map) {
        C10104d.m30023a(new Runnable(m30173a(map), i, C10173t0.m30433a()) {
            public final /* synthetic */ Map f$1;
            public final /* synthetic */ int f$2;
            public final /* synthetic */ long f$3;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
            }

            public final void run() {
                C10126m.this.m30187a(this.f$1, this.f$2, this.f$3);
            }
        });
    }

    /* renamed from: a */
    public void mo66232a(int i, byte[] bArr, boolean z, boolean z2, Runnable runnable) {
        C10104d.m30023a(new Runnable(i, bArr, z, z2, C10173t0.m30433a(), runnable) {
            public final /* synthetic */ int f$1;
            public final /* synthetic */ byte[] f$2;
            public final /* synthetic */ boolean f$3;
            public final /* synthetic */ boolean f$4;
            public final /* synthetic */ long f$5;
            public final /* synthetic */ Runnable f$6;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
                this.f$4 = r5;
                this.f$5 = r6;
                this.f$6 = r8;
            }

            public final void run() {
                C10126m.this.m30174a(this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, this.f$6);
            }
        });
    }

    /* renamed from: a */
    public void mo66233a(long j, String str, C10118j0.C10119a aVar) {
        C10104d.m30023a(new Runnable(j, str, aVar, C10173t0.m30433a()) {
            public final /* synthetic */ long f$1;
            public final /* synthetic */ String f$2;
            public final /* synthetic */ C10118j0.C10119a f$3;
            public final /* synthetic */ long f$4;

            {
                this.f$1 = r2;
                this.f$2 = r4;
                this.f$3 = r5;
                this.f$4 = r6;
            }

            public final void run() {
                C10126m.this.m30178a(this.f$1, this.f$2, this.f$3, this.f$4);
            }
        });
    }

    /* renamed from: a */
    public void mo66234a(AdEvent adEvent) {
        C10104d.m30023a(new Runnable(adEvent, C10173t0.m30433a()) {
            public final /* synthetic */ AdEvent f$1;
            public final /* synthetic */ long f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void run() {
                C10126m.this.m30179a(this.f$1, this.f$2);
            }
        });
    }

    /* renamed from: a */
    public void mo66235a(MiniAppEvent miniAppEvent) {
        C10104d.m30023a(new Runnable(miniAppEvent, C10173t0.m30433a()) {
            public final /* synthetic */ MiniAppEvent f$1;
            public final /* synthetic */ long f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void run() {
                C10126m.this.m30180a(this.f$1, this.f$2);
            }
        });
    }

    /* renamed from: a */
    public void mo66236a(C10128b bVar) {
        C10104d.m30023a(new Runnable(bVar) {
            public final /* synthetic */ C10126m.C10128b f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                C10126m.this.m30197b(this.f$1);
            }
        });
    }

    /* renamed from: a */
    public void mo66237a(String str, String str2) {
        C10104d.m30023a(new Runnable(str, str2, C10173t0.m30433a()) {
            public final /* synthetic */ String f$1;
            public final /* synthetic */ String f$2;
            public final /* synthetic */ long f$3;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
            }

            public final void run() {
                C10126m.this.m30182a(this.f$1, this.f$2, this.f$3);
            }
        });
    }

    /* renamed from: a */
    public void mo66238a(String str, String str2, long j, long j2) {
        C10104d.m30023a(new Runnable(str, str2, j, j2, C10173t0.m30433a()) {
            public final /* synthetic */ String f$1;
            public final /* synthetic */ String f$2;
            public final /* synthetic */ long f$3;
            public final /* synthetic */ long f$4;
            public final /* synthetic */ long f$5;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
                this.f$4 = r6;
                this.f$5 = r8;
            }

            public final void run() {
                C10126m.this.m30183a(this.f$1, this.f$2, this.f$3, this.f$4, this.f$5);
            }
        });
    }

    /* renamed from: a */
    public void mo66239a(String str, String str2, Runnable runnable) {
        C10104d.m30023a(new Runnable(str, str2, C10173t0.m30433a(), runnable) {
            public final /* synthetic */ String f$1;
            public final /* synthetic */ String f$2;
            public final /* synthetic */ long f$3;
            public final /* synthetic */ Runnable f$4;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
                this.f$4 = r6;
            }

            public final void run() {
                C10126m.this.m30184a(this.f$1, this.f$2, this.f$3, this.f$4);
            }
        });
    }

    /* renamed from: a */
    public void mo66240a(String str, String str2, String str3, String str4, String str5) {
        C10104d.m30023a(new Runnable(str, str2, str3, str4, str5, C10173t0.m30433a()) {
            public final /* synthetic */ String f$1;
            public final /* synthetic */ String f$2;
            public final /* synthetic */ String f$3;
            public final /* synthetic */ String f$4;
            public final /* synthetic */ String f$5;
            public final /* synthetic */ long f$6;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
                this.f$4 = r5;
                this.f$5 = r6;
                this.f$6 = r7;
            }

            public final void run() {
                C10126m.this.m30185a(this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, this.f$6);
            }
        });
    }

    /* renamed from: a */
    public void mo66241a(String str, String str2, Map<String, String> map) {
        C10104d.m30023a(new Runnable(m30173a(map), str, str2, C10173t0.m30433a()) {
            public final /* synthetic */ Map f$1;
            public final /* synthetic */ String f$2;
            public final /* synthetic */ String f$3;
            public final /* synthetic */ long f$4;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
                this.f$4 = r5;
            }

            public final void run() {
                C10126m.this.m30190a(this.f$1, this.f$2, this.f$3, this.f$4);
            }
        });
    }

    /* renamed from: a */
    public void mo66242a(String str, Map<String, String> map) {
        C10104d.m30023a(new Runnable(m30173a(map), str, C10173t0.m30433a()) {
            public final /* synthetic */ Map f$1;
            public final /* synthetic */ String f$2;
            public final /* synthetic */ long f$3;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
            }

            public final void run() {
                C10126m.this.m30189a(this.f$1, this.f$2, this.f$3);
            }
        });
    }

    /* renamed from: a */
    public void mo66243a(List<C10164q0> list, C10128b bVar) {
        C10104d.m30023a(new Runnable(bVar, list) {
            public final /* synthetic */ C10126m.C10128b f$1;
            public final /* synthetic */ List f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void run() {
                C10126m.this.m30181a(this.f$1, this.f$2);
            }
        });
    }

    /* renamed from: a */
    public void mo66244a(JSONObject jSONObject, JSONObject jSONObject2, String str, Map<String, String> map) {
        C10104d.m30023a(new Runnable(m30173a(map), jSONObject2, str, C10173t0.m30433a(), jSONObject, map) {
            public final /* synthetic */ Map f$1;
            public final /* synthetic */ JSONObject f$2;
            public final /* synthetic */ String f$3;
            public final /* synthetic */ long f$4;
            public final /* synthetic */ JSONObject f$5;
            public final /* synthetic */ Map f$6;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
                this.f$4 = r5;
                this.f$5 = r7;
                this.f$6 = r8;
            }

            public final void run() {
                C10126m.this.m30191a(this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, this.f$6);
            }
        });
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo66245b() {
        int e;
        C10105d0 d0Var = this.f25250e;
        if (d0Var != null) {
            if (d0Var.mo66126a() != 0 || ((e = this.f25247b.mo66416e()) > 0 && C10173t0.m30433a() - this.f25251f <= ((long) e))) {
                mo66251c();
            }
        }
    }

    /* renamed from: b */
    public void mo66246b(float f) {
        C10104d.m30023a(new Runnable(System.currentTimeMillis(), f) {
            public final /* synthetic */ long f$1;
            public final /* synthetic */ float f$2;

            {
                this.f$1 = r2;
                this.f$2 = r4;
            }

            public final void run() {
                C10126m.this.m30195b(this.f$1, this.f$2);
            }
        });
    }

    /* renamed from: b */
    public void mo66247b(float f, float f2, float f3) {
        C10104d.m30023a(new Runnable(System.currentTimeMillis(), f, f2, f3) {
            public final /* synthetic */ long f$1;
            public final /* synthetic */ float f$2;
            public final /* synthetic */ float f$3;
            public final /* synthetic */ float f$4;

            {
                this.f$1 = r2;
                this.f$2 = r4;
                this.f$3 = r5;
                this.f$4 = r6;
            }

            public final void run() {
                C10126m.this.m30196b(this.f$1, this.f$2, this.f$3, this.f$4);
            }
        });
    }

    /* renamed from: b */
    public void mo66248b(String str, String str2, long j, long j2) {
        C10104d.m30023a(new Runnable(str, str2, j, j2, C10173t0.m30433a()) {
            public final /* synthetic */ String f$1;
            public final /* synthetic */ String f$2;
            public final /* synthetic */ long f$3;
            public final /* synthetic */ long f$4;
            public final /* synthetic */ long f$5;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
                this.f$4 = r6;
                this.f$5 = r8;
            }

            public final void run() {
                C10126m.this.m30198b(this.f$1, this.f$2, this.f$3, this.f$4, this.f$5);
            }
        });
    }

    /* renamed from: b */
    public void mo66249b(String str, String str2, Map<String, String> map) {
        C10104d.m30023a(new Runnable(m30173a(map), str, str2, C10173t0.m30433a()) {
            public final /* synthetic */ Map f$1;
            public final /* synthetic */ String f$2;
            public final /* synthetic */ String f$3;
            public final /* synthetic */ long f$4;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
                this.f$4 = r5;
            }

            public final void run() {
                C10126m.this.m30200b(this.f$1, this.f$2, this.f$3, this.f$4);
            }
        });
    }

    /* renamed from: b */
    public void mo66250b(List<C10164q0> list) {
        C10104d.m30023a(new Runnable(list) {
            public final /* synthetic */ List f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                C10126m.this.m30186a(this.f$1);
            }
        });
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo66251c() {
        if (this.f25250e != null) {
            this.f25249d.mo66066a();
            C10170t.C10172b<String> c = this.f25250e.mo66154c();
            if (c != null) {
                String a = c.mo66384a();
                if (!TextUtils.isEmpty(a)) {
                    this.f25249d.mo66067a(a);
                }
            }
        }
    }

    /* renamed from: c */
    public void mo66252c(float f) {
        C10104d.m30023a(new Runnable(System.currentTimeMillis(), f) {
            public final /* synthetic */ long f$1;
            public final /* synthetic */ float f$2;

            {
                this.f$1 = r2;
                this.f$2 = r4;
            }

            public final void run() {
                C10126m.this.m30202c(this.f$1, this.f$2);
            }
        });
    }

    /* renamed from: c */
    public void mo66253c(Map<String, String> map) {
        C10104d.m30023a(new Runnable(m30173a(map), C10173t0.m30433a()) {
            public final /* synthetic */ Map f$1;
            public final /* synthetic */ long f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void run() {
                C10126m.this.m30188a(this.f$1, this.f$2);
            }
        });
    }

    /* renamed from: d */
    public void mo66254d() {
        C10104d.m30023a(new Runnable() {
            public final void run() {
                C10126m.this.m30204f();
            }
        });
    }

    /* renamed from: d */
    public void mo66255d(Map<String, String> map) {
        C10104d.m30023a(new Runnable(m30173a(map), C10173t0.m30433a()) {
            public final /* synthetic */ Map f$1;
            public final /* synthetic */ long f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void run() {
                C10126m.this.m30199b(this.f$1, this.f$2);
            }
        });
    }

    /* renamed from: g */
    public void mo66256g() {
        C10104d.m30023a(new Runnable(C10173t0.m30433a()) {
            public final /* synthetic */ long f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                C10126m.this.m30175a(this.f$1);
            }
        });
    }
}

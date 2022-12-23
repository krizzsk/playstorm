package com.apm.insight.runtime.p024a;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import com.apm.insight.C1240h;
import com.apm.insight.p023l.C1286b;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.apm.insight.runtime.a.b */
public class C1343b {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static boolean f1361a = true;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static boolean f1362b = false;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static boolean f1363c = false;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static int f1364d = 1;

    /* renamed from: e */
    private static boolean f1365e = false;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static long f1366f = -1;

    /* renamed from: z */
    private static volatile C1343b f1367z;

    /* renamed from: A */
    private int f1368A = 50;
    /* access modifiers changed from: private */

    /* renamed from: B */
    public int f1369B;

    /* renamed from: g */
    private Application f1370g;

    /* renamed from: h */
    private Context f1371h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public List<String> f1372i = new ArrayList();
    /* access modifiers changed from: private */

    /* renamed from: j */
    public List<Long> f1373j = new ArrayList();
    /* access modifiers changed from: private */

    /* renamed from: k */
    public List<String> f1374k = new ArrayList();
    /* access modifiers changed from: private */

    /* renamed from: l */
    public List<Long> f1375l = new ArrayList();

    /* renamed from: m */
    private LinkedList<C1345a> f1376m = new LinkedList<>();
    /* access modifiers changed from: private */

    /* renamed from: n */
    public String f1377n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public long f1378o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public String f1379p;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public long f1380q;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public String f1381r;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public long f1382s;
    /* access modifiers changed from: private */

    /* renamed from: t */
    public String f1383t;
    /* access modifiers changed from: private */

    /* renamed from: u */
    public long f1384u;
    /* access modifiers changed from: private */

    /* renamed from: v */
    public String f1385v;
    /* access modifiers changed from: private */

    /* renamed from: w */
    public long f1386w;
    /* access modifiers changed from: private */

    /* renamed from: x */
    public boolean f1387x = false;
    /* access modifiers changed from: private */

    /* renamed from: y */
    public long f1388y = -1;

    /* renamed from: com.apm.insight.runtime.a.b$a */
    private static class C1345a {

        /* renamed from: a */
        String f1390a;

        /* renamed from: b */
        String f1391b;

        /* renamed from: c */
        long f1392c;

        C1345a(String str, String str2, long j) {
            this.f1391b = str2;
            this.f1392c = j;
            this.f1390a = str;
        }

        public String toString() {
            return C1286b.m1730a().format(new Date(this.f1392c)) + " : " + this.f1390a + ' ' + this.f1391b;
        }
    }

    private C1343b(Application application) {
        this.f1371h = application;
        this.f1370g = application;
        try {
            m2098m();
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    private C1345a m2060a(String str, String str2, long j) {
        C1345a aVar;
        if (this.f1376m.size() >= this.f1368A) {
            aVar = this.f1376m.poll();
            if (aVar != null) {
                this.f1376m.add(aVar);
            }
        } else {
            aVar = null;
        }
        if (aVar != null) {
            return aVar;
        }
        C1345a aVar2 = new C1345a(str, str2, j);
        this.f1376m.add(aVar2);
        return aVar2;
    }

    /* renamed from: a */
    private JSONObject m2063a(String str, long j) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("name", str);
            jSONObject.put("time", j);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    /* renamed from: a */
    public static void m2064a() {
        f1365e = true;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m2066a(String str, long j, String str2) {
        try {
            C1345a a = m2060a(str, str2, j);
            a.f1391b = str2;
            a.f1390a = str;
            a.f1392c = j;
        } catch (Throwable unused) {
        }
    }

    /* renamed from: b */
    public static int m2069b() {
        int i = f1364d;
        return i == 1 ? f1365e ? 2 : 1 : i;
    }

    /* renamed from: c */
    public static long m2074c() {
        return f1366f;
    }

    /* renamed from: d */
    public static C1343b m2080d() {
        if (f1367z == null) {
            synchronized (C1343b.class) {
                if (f1367z == null) {
                    f1367z = new C1343b(C1240h.m1559h());
                }
            }
        }
        return f1367z;
    }

    /* renamed from: g */
    static /* synthetic */ int m2088g(C1343b bVar) {
        int i = bVar.f1369B;
        bVar.f1369B = i + 1;
        return i;
    }

    /* renamed from: l */
    static /* synthetic */ int m2095l(C1343b bVar) {
        int i = bVar.f1369B;
        bVar.f1369B = i - 1;
        return i;
    }

    /* renamed from: m */
    private void m2098m() {
        if (Build.VERSION.SDK_INT >= 14 && this.f1370g != null) {
            this.f1370g.registerActivityLifecycleCallbacks(new Application.ActivityLifecycleCallbacks() {
                public void onActivityCreated(Activity activity, Bundle bundle) {
                    String unused = C1343b.this.f1377n = activity.getClass().getName();
                    long unused2 = C1343b.this.f1378o = System.currentTimeMillis();
                    boolean unused3 = C1343b.f1362b = bundle != null;
                    boolean unused4 = C1343b.f1363c = true;
                    C1343b.this.f1372i.add(C1343b.this.f1377n);
                    C1343b.this.f1373j.add(Long.valueOf(C1343b.this.f1378o));
                    C1343b bVar = C1343b.this;
                    bVar.m2066a(bVar.f1377n, C1343b.this.f1378o, "onCreate");
                }

                public void onActivityDestroyed(Activity activity) {
                    String name = activity.getClass().getName();
                    int indexOf = C1343b.this.f1372i.indexOf(name);
                    if (indexOf > -1 && indexOf < C1343b.this.f1372i.size()) {
                        C1343b.this.f1372i.remove(indexOf);
                        C1343b.this.f1373j.remove(indexOf);
                    }
                    C1343b.this.f1374k.add(name);
                    long currentTimeMillis = System.currentTimeMillis();
                    C1343b.this.f1375l.add(Long.valueOf(currentTimeMillis));
                    C1343b.this.m2066a(name, currentTimeMillis, "onDestroy");
                }

                public void onActivityPaused(Activity activity) {
                    String unused = C1343b.this.f1383t = activity.getClass().getName();
                    long unused2 = C1343b.this.f1384u = System.currentTimeMillis();
                    C1343b.m2095l(C1343b.this);
                    if (C1343b.this.f1369B != 0) {
                        if (C1343b.this.f1369B < 0) {
                            int unused3 = C1343b.this.f1369B = 0;
                        }
                        C1343b bVar = C1343b.this;
                        bVar.m2066a(bVar.f1383t, C1343b.this.f1384u, "onPause");
                    }
                    boolean unused4 = C1343b.this.f1387x = false;
                    boolean unused5 = C1343b.f1363c = false;
                    long unused6 = C1343b.this.f1388y = SystemClock.uptimeMillis();
                    C1343b bVar2 = C1343b.this;
                    bVar2.m2066a(bVar2.f1383t, C1343b.this.f1384u, "onPause");
                }

                public void onActivityResumed(Activity activity) {
                    String unused = C1343b.this.f1381r = activity.getClass().getName();
                    long unused2 = C1343b.this.f1382s = System.currentTimeMillis();
                    C1343b.m2088g(C1343b.this);
                    if (!C1343b.this.f1387x) {
                        if (C1343b.f1361a) {
                            boolean unused3 = C1343b.f1361a = false;
                            int unused4 = C1343b.f1364d = 1;
                            long unused5 = C1343b.f1366f = C1343b.this.f1382s;
                        }
                        if (C1343b.this.f1381r.equals(C1343b.this.f1383t)) {
                            if (C1343b.f1363c && !C1343b.f1362b) {
                                int unused6 = C1343b.f1364d = 4;
                                long unused7 = C1343b.f1366f = C1343b.this.f1382s;
                                return;
                            } else if (!C1343b.f1363c) {
                                int unused8 = C1343b.f1364d = 3;
                                long unused9 = C1343b.f1366f = C1343b.this.f1382s;
                                return;
                            }
                        } else {
                            return;
                        }
                    }
                    boolean unused10 = C1343b.this.f1387x = true;
                    C1343b bVar = C1343b.this;
                    bVar.m2066a(bVar.f1381r, C1343b.this.f1382s, "onResume");
                }

                public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
                }

                public void onActivityStarted(Activity activity) {
                    String unused = C1343b.this.f1379p = activity.getClass().getName();
                    long unused2 = C1343b.this.f1380q = System.currentTimeMillis();
                    C1343b bVar = C1343b.this;
                    bVar.m2066a(bVar.f1379p, C1343b.this.f1380q, "onStart");
                }

                public void onActivityStopped(Activity activity) {
                    String unused = C1343b.this.f1385v = activity.getClass().getName();
                    long unused2 = C1343b.this.f1386w = System.currentTimeMillis();
                    C1343b bVar = C1343b.this;
                    bVar.m2066a(bVar.f1385v, C1343b.this.f1386w, "onStop");
                }
            });
        }
    }

    /* renamed from: n */
    private JSONArray m2100n() {
        JSONArray jSONArray = new JSONArray();
        List<String> list = this.f1372i;
        if (list != null && !list.isEmpty()) {
            int i = 0;
            while (i < this.f1372i.size()) {
                try {
                    jSONArray.put(m2063a(this.f1372i.get(i), this.f1373j.get(i).longValue()));
                    i++;
                } catch (Throwable unused) {
                }
            }
        }
        return jSONArray;
    }

    /* renamed from: o */
    private JSONArray m2102o() {
        JSONArray jSONArray = new JSONArray();
        List<String> list = this.f1374k;
        if (list != null && !list.isEmpty()) {
            int i = 0;
            while (i < this.f1374k.size()) {
                try {
                    jSONArray.put(m2063a(this.f1374k.get(i), this.f1375l.get(i).longValue()));
                    i++;
                } catch (Throwable unused) {
                }
            }
        }
        return jSONArray;
    }

    /* renamed from: e */
    public long mo12449e() {
        return SystemClock.uptimeMillis() - this.f1388y;
    }

    /* renamed from: f */
    public boolean mo12450f() {
        return this.f1387x;
    }

    /* renamed from: g */
    public JSONObject mo12451g() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("last_create_activity", m2063a(this.f1377n, this.f1378o));
            jSONObject.put("last_start_activity", m2063a(this.f1379p, this.f1380q));
            jSONObject.put("last_resume_activity", m2063a(this.f1381r, this.f1382s));
            jSONObject.put("last_pause_activity", m2063a(this.f1383t, this.f1384u));
            jSONObject.put("last_stop_activity", m2063a(this.f1385v, this.f1386w));
            jSONObject.put("alive_activities", m2100n());
            jSONObject.put("finish_activities", m2102o());
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    /* renamed from: h */
    public String mo12452h() {
        return String.valueOf(this.f1381r);
    }

    /* renamed from: i */
    public JSONArray mo12453i() {
        JSONArray jSONArray = new JSONArray();
        Iterator it = new ArrayList(this.f1376m).iterator();
        while (it.hasNext()) {
            jSONArray.put(((C1345a) it.next()).toString());
        }
        return jSONArray;
    }
}

package com.apm.insight.p011b;

import android.os.Looper;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import com.apm.insight.runtime.C1367g;
import com.apm.insight.runtime.C1393u;
import com.facebook.internal.security.CertificateUtil;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.apm.insight.b.h */
public class C1188h {

    /* renamed from: b */
    public static boolean f985b = false;
    /* access modifiers changed from: private */

    /* renamed from: t */
    public static int f986t = 2;

    /* renamed from: a */
    C1194c f987a;

    /* renamed from: c */
    private int f988c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public volatile int f989d;

    /* renamed from: e */
    private int f990e;

    /* renamed from: f */
    private int f991f;

    /* renamed from: g */
    private C1197f f992g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public C1193b f993h;

    /* renamed from: i */
    private long f994i;

    /* renamed from: j */
    private long f995j;

    /* renamed from: k */
    private int f996k;

    /* renamed from: l */
    private long f997l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public String f998m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public String f999n;

    /* renamed from: o */
    private C1185e f1000o;

    /* renamed from: p */
    private volatile boolean f1001p;

    /* renamed from: q */
    private boolean f1002q;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public final C1393u f1003r;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public volatile boolean f1004s;
    /* access modifiers changed from: private */

    /* renamed from: u */
    public Runnable f1005u;

    /* renamed from: com.apm.insight.b.h$a */
    private static class C1192a {

        /* renamed from: a */
        long f1014a;

        /* renamed from: b */
        long f1015b;

        /* renamed from: c */
        long f1016c;

        /* renamed from: d */
        boolean f1017d;

        /* renamed from: e */
        int f1018e;

        /* renamed from: f */
        StackTraceElement[] f1019f;

        private C1192a() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo12204a() {
            this.f1014a = -1;
            this.f1015b = -1;
            this.f1016c = -1;
            this.f1018e = -1;
            this.f1019f = null;
        }
    }

    /* renamed from: com.apm.insight.b.h$b */
    private static class C1193b {

        /* renamed from: a */
        final int f1020a;

        /* renamed from: b */
        C1192a f1021b;

        /* renamed from: c */
        final List<C1192a> f1022c;

        /* renamed from: d */
        private int f1023d = 0;

        public C1193b(int i) {
            this.f1020a = i;
            this.f1022c = new ArrayList(i);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C1192a mo12205a() {
            C1192a aVar = this.f1021b;
            if (aVar == null) {
                return new C1192a();
            }
            this.f1021b = null;
            return aVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo12206a(C1192a aVar) {
            int i;
            int size = this.f1022c.size();
            int i2 = this.f1020a;
            if (size < i2) {
                this.f1022c.add(aVar);
                i = this.f1022c.size();
            } else {
                int i3 = this.f1023d % i2;
                this.f1023d = i3;
                C1192a aVar2 = this.f1022c.set(i3, aVar);
                aVar2.mo12204a();
                this.f1021b = aVar2;
                i = this.f1023d + 1;
            }
            this.f1023d = i;
        }
    }

    /* renamed from: com.apm.insight.b.h$c */
    public interface C1194c {
    }

    /* renamed from: com.apm.insight.b.h$d */
    public static class C1195d {

        /* renamed from: a */
        long f1024a;

        /* renamed from: b */
        long f1025b;

        /* renamed from: c */
        long f1026c;

        /* renamed from: d */
        long f1027d;

        /* renamed from: e */
        long f1028e;
    }

    /* renamed from: com.apm.insight.b.h$e */
    public static class C1196e {

        /* renamed from: a */
        public long f1029a;

        /* renamed from: b */
        long f1030b;

        /* renamed from: c */
        long f1031c;

        /* renamed from: d */
        int f1032d;

        /* renamed from: e */
        int f1033e;

        /* renamed from: f */
        long f1034f;

        /* renamed from: g */
        long f1035g;

        /* renamed from: h */
        String f1036h;

        /* renamed from: i */
        public String f1037i;

        /* renamed from: j */
        String f1038j;

        /* renamed from: k */
        C1195d f1039k;

        /* renamed from: a */
        private void m1332a(JSONObject jSONObject) {
            jSONObject.put("block_uuid", this.f1038j);
            jSONObject.put("sblock_uuid", this.f1038j);
            jSONObject.put("belong_frame", this.f1039k != null);
            C1195d dVar = this.f1039k;
            if (dVar != null) {
                jSONObject.put("vsyncDelayTime", this.f1031c - (dVar.f1024a / 1000000));
                jSONObject.put("doFrameTime", (this.f1039k.f1025b / 1000000) - this.f1031c);
                jSONObject.put("inputHandlingTime", (this.f1039k.f1026c / 1000000) - (this.f1039k.f1025b / 1000000));
                jSONObject.put("animationsTime", (this.f1039k.f1027d / 1000000) - (this.f1039k.f1026c / 1000000));
                jSONObject.put("performTraversalsTime", (this.f1039k.f1028e / 1000000) - (this.f1039k.f1027d / 1000000));
                jSONObject.put("drawTime", this.f1030b - (this.f1039k.f1028e / 1000000));
            }
        }

        /* renamed from: a */
        public JSONObject mo12207a() {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("msg", C1188h.m1307a(this.f1036h));
                jSONObject.put("cpuDuration", this.f1035g);
                jSONObject.put("duration", this.f1034f);
                jSONObject.put("type", this.f1032d);
                jSONObject.put("count", this.f1033e);
                jSONObject.put("messageCount", this.f1033e);
                jSONObject.put("lastDuration", this.f1030b - this.f1031c);
                jSONObject.put("start", this.f1029a);
                jSONObject.put("end", this.f1030b);
                m1332a(jSONObject);
            } catch (JSONException e) {
                e.printStackTrace();
            }
            return jSONObject;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo12208b() {
            this.f1032d = -1;
            this.f1033e = -1;
            this.f1034f = -1;
            this.f1036h = null;
            this.f1038j = null;
            this.f1039k = null;
            this.f1037i = null;
        }
    }

    /* renamed from: com.apm.insight.b.h$f */
    private static class C1197f {

        /* renamed from: a */
        int f1040a;

        /* renamed from: b */
        int f1041b;

        /* renamed from: c */
        C1196e f1042c;

        /* renamed from: d */
        List<C1196e> f1043d = new ArrayList();

        C1197f(int i) {
            this.f1040a = i;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C1196e mo12209a(int i) {
            C1196e eVar = this.f1042c;
            if (eVar != null) {
                eVar.f1032d = i;
                C1196e eVar2 = this.f1042c;
                this.f1042c = null;
                return eVar2;
            }
            C1196e eVar3 = new C1196e();
            eVar3.f1032d = i;
            return eVar3;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public List<C1196e> mo12210a() {
            ArrayList arrayList = new ArrayList();
            int i = 0;
            if (this.f1043d.size() == this.f1040a) {
                for (int i2 = this.f1041b; i2 < this.f1043d.size(); i2++) {
                    arrayList.add(this.f1043d.get(i2));
                }
                while (i < this.f1041b - 1) {
                    arrayList.add(this.f1043d.get(i));
                    i++;
                }
            } else {
                while (i < this.f1043d.size()) {
                    arrayList.add(this.f1043d.get(i));
                    i++;
                }
            }
            return arrayList;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo12211a(C1196e eVar) {
            int i;
            int size = this.f1043d.size();
            int i2 = this.f1040a;
            if (size < i2) {
                this.f1043d.add(eVar);
                i = this.f1043d.size();
            } else {
                int i3 = this.f1041b % i2;
                this.f1041b = i3;
                C1196e eVar2 = this.f1043d.set(i3, eVar);
                eVar2.mo12208b();
                this.f1042c = eVar2;
                i = this.f1041b + 1;
            }
            this.f1041b = i;
        }
    }

    public C1188h(int i) {
        this(i, false);
    }

    public C1188h(int i, boolean z) {
        this.f988c = 0;
        this.f989d = 0;
        this.f990e = 100;
        this.f991f = 200;
        this.f994i = -1;
        this.f995j = -1;
        this.f996k = -1;
        this.f997l = -1;
        this.f1001p = false;
        this.f1002q = false;
        this.f1004s = false;
        this.f1005u = new Runnable() {

            /* renamed from: b */
            private long f1008b = 0;

            /* renamed from: c */
            private long f1009c;

            /* renamed from: d */
            private int f1010d = -1;

            /* renamed from: e */
            private int f1011e = 0;

            /* renamed from: f */
            private int f1012f = 0;

            public void run() {
                long uptimeMillis = SystemClock.uptimeMillis();
                C1192a a = C1188h.this.f993h.mo12205a();
                if (this.f1010d == C1188h.this.f989d) {
                    this.f1011e++;
                } else {
                    this.f1011e = 0;
                    this.f1012f = 0;
                    this.f1009c = uptimeMillis;
                }
                this.f1010d = C1188h.this.f989d;
                int i = this.f1011e;
                if (i > 0 && i - this.f1012f >= C1188h.f986t && this.f1008b != 0 && uptimeMillis - this.f1009c > 700 && C1188h.this.f1004s) {
                    a.f1019f = Looper.getMainLooper().getThread().getStackTrace();
                    this.f1012f = this.f1011e;
                }
                a.f1017d = C1188h.this.f1004s;
                a.f1016c = (uptimeMillis - this.f1008b) - 300;
                a.f1014a = uptimeMillis;
                long uptimeMillis2 = SystemClock.uptimeMillis();
                this.f1008b = uptimeMillis2;
                a.f1015b = uptimeMillis2 - uptimeMillis;
                a.f1018e = C1188h.this.f989d;
                C1188h.this.f1003r.mo12527a(C1188h.this.f1005u, 300);
                C1188h.this.f993h.mo12206a(a);
            }
        };
        this.f987a = new C1194c() {
        };
        if (z || f985b) {
            C1393u uVar = new C1393u("looper_monitor");
            this.f1003r = uVar;
            uVar.mo12528b();
            this.f993h = new C1193b(300);
            this.f1003r.mo12527a(this.f1005u, 300);
            return;
        }
        this.f1003r = null;
    }

    /* renamed from: a */
    private static long m1304a(int i) {
        if (i < 0) {
            return 0;
        }
        try {
            return C1367g.m2193a(i);
        } catch (Throwable unused) {
            return 0;
        }
    }

    /* renamed from: a */
    public static String m1307a(String str) {
        if (TextUtils.isEmpty(str)) {
            return "unknown message";
        }
        try {
            String[] split = str.split(CertificateUtil.DELIMITER);
            String str2 = split.length == 2 ? split[1] : "";
            if (!str.contains("{") || !str.contains("}")) {
                String str3 = str;
            } else {
                String str4 = str.split("\\{")[0];
                try {
                    str = str4 + str.split("\\}")[1];
                } catch (Throwable unused) {
                    return str4;
                }
            }
            if (str.contains("@")) {
                String[] split2 = str.split("@");
                if (split2.length > 1) {
                    str = split2[0];
                }
            }
            if (str.contains("(") && str.contains(")") && !str.endsWith(" null")) {
                String[] split3 = str.split("\\(");
                if (split3.length > 1) {
                    str = split3[1];
                }
                str = str.replace(")", "");
            }
            if (str.startsWith(" ")) {
                str = str.replace(" ", "");
            }
            return str + str2;
        } catch (Throwable unused2) {
            return str;
        }
    }

    /* renamed from: a */
    private void m1308a(int i, long j, String str) {
        m1309a(i, j, str, true);
    }

    /* renamed from: a */
    private void m1309a(int i, long j, String str, boolean z) {
        this.f1002q = true;
        C1196e a = this.f992g.mo12209a(i);
        a.f1034f = j - this.f994i;
        if (z) {
            long currentThreadTimeMillis = SystemClock.currentThreadTimeMillis();
            a.f1035g = currentThreadTimeMillis - this.f997l;
            this.f997l = currentThreadTimeMillis;
        } else {
            a.f1035g = -1;
        }
        a.f1033e = this.f988c;
        a.f1036h = str;
        a.f1037i = this.f998m;
        a.f1029a = this.f994i;
        a.f1030b = j;
        a.f1031c = this.f995j;
        this.f992g.mo12211a(a);
        this.f988c = 0;
        this.f994i = j;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m1311a(boolean z, long j) {
        boolean z2;
        String str;
        int i;
        C1188h hVar;
        int i2 = this.f989d + 1;
        this.f989d = i2;
        this.f989d = i2 & 65535;
        this.f1002q = false;
        if (this.f994i < 0) {
            this.f994i = j;
        }
        if (this.f995j < 0) {
            this.f995j = j;
        }
        if (this.f996k < 0) {
            this.f996k = Process.myTid();
            this.f997l = SystemClock.currentThreadTimeMillis();
        }
        int i3 = this.f991f;
        if (j - this.f994i > ((long) i3)) {
            long j2 = this.f995j;
            if (j - j2 > ((long) i3)) {
                int i4 = this.f988c;
                if (z) {
                    if (i4 == 0) {
                        m1308a(1, j, "no message running");
                    } else {
                        m1308a(9, j2, this.f998m);
                        i = 1;
                        z2 = false;
                        str = "no message running";
                    }
                } else if (i4 == 0) {
                    i = 8;
                    str = this.f999n;
                    z2 = true;
                } else {
                    hVar = this;
                    hVar.m1309a(9, j2, this.f998m, false);
                    i = 8;
                    str = this.f999n;
                    z2 = true;
                    hVar.m1309a(i, j, str, z2);
                }
                hVar = this;
                hVar.m1309a(i, j, str, z2);
            } else {
                m1308a(9, j, this.f999n);
            }
        }
        this.f995j = j;
    }

    /* renamed from: e */
    private void m1319e() {
        this.f990e = 100;
        this.f991f = 300;
    }

    /* renamed from: f */
    static /* synthetic */ int m1320f(C1188h hVar) {
        int i = hVar.f988c;
        hVar.f988c = i + 1;
        return i;
    }

    /* renamed from: a */
    public C1196e mo12199a(long j) {
        C1196e eVar = new C1196e();
        eVar.f1036h = this.f999n;
        eVar.f1037i = this.f998m;
        eVar.f1034f = j - this.f995j;
        eVar.f1035g = m1304a(this.f996k) - this.f997l;
        eVar.f1033e = this.f988c;
        return eVar;
    }

    /* renamed from: a */
    public void mo12200a() {
        if (!this.f1001p) {
            this.f1001p = true;
            m1319e();
            this.f992g = new C1197f(this.f990e);
            this.f1000o = new C1185e() {
                /* renamed from: a */
                public void mo12193a(String str) {
                    boolean unused = C1188h.this.f1004s = true;
                    String unused2 = C1188h.this.f999n = str;
                    super.mo12193a(str);
                    C1188h.this.m1311a(true, C1185e.f976a);
                }

                /* renamed from: a */
                public boolean mo12194a() {
                    return true;
                }

                /* renamed from: b */
                public void mo12195b(String str) {
                    super.mo12195b(str);
                    C1188h.m1320f(C1188h.this);
                    C1188h.this.m1311a(false, C1185e.f976a);
                    C1188h hVar = C1188h.this;
                    String unused = hVar.f998m = hVar.f999n;
                    String unused2 = C1188h.this.f999n = "no message running";
                    boolean unused3 = C1188h.this.f1004s = false;
                }
            };
            C1198i.m1338a();
            C1198i.m1339a(this.f1000o);
            C1204k.m1349a(C1204k.m1350a());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo12201b() {
        mo12200a();
    }

    /* renamed from: c */
    public JSONArray mo12202c() {
        JSONArray jSONArray = new JSONArray();
        try {
            List<C1196e> a = this.f992g.mo12210a();
            if (a == null) {
                return jSONArray;
            }
            int i = 0;
            for (C1196e next : a) {
                if (next != null) {
                    i++;
                    jSONArray.put(next.mo12207a().put("id", i));
                }
            }
            return jSONArray;
        } catch (Throwable unused) {
        }
    }
}

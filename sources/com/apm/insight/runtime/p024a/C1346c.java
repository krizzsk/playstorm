package com.apm.insight.runtime.p024a;

import android.content.Context;
import android.os.Process;
import android.os.SystemClock;
import com.apm.insight.AttachUserData;
import com.apm.insight.C1240h;
import com.apm.insight.CrashType;
import com.apm.insight.ICommonParams;
import com.apm.insight.entity.C1217a;
import com.apm.insight.p023l.C1285a;
import com.apm.insight.p023l.C1297h;
import com.apm.insight.p023l.C1318w;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.apm.insight.runtime.a.c */
public abstract class C1346c {

    /* renamed from: a */
    protected CrashType f1393a;

    /* renamed from: b */
    protected Context f1394b;

    /* renamed from: c */
    protected ICommonParams f1395c = C1240h.m1542a().mo12491c();

    /* renamed from: d */
    protected C1343b f1396d;

    /* renamed from: e */
    protected C1348d f1397e;

    /* renamed from: com.apm.insight.runtime.a.c$a */
    public interface C1347a {
        /* renamed from: a */
        C1217a mo12307a(int i, C1217a aVar);

        /* renamed from: a */
        C1217a mo12308a(int i, C1217a aVar, boolean z);

        /* renamed from: a */
        void mo12309a(Throwable th);
    }

    C1346c(CrashType crashType, Context context, C1343b bVar, C1348d dVar) {
        this.f1393a = crashType;
        this.f1394b = context;
        this.f1396d = bVar;
        this.f1397e = dVar;
    }

    /* renamed from: i */
    private void m2111i(C1217a aVar) {
        List<AttachUserData> a = C1240h.m1552b().mo12165a(this.f1393a);
        HashMap hashMap = new HashMap();
        JSONObject optJSONObject = aVar.mo12265h().optJSONObject("custom");
        if (optJSONObject == null) {
            optJSONObject = new JSONObject();
            aVar.mo12251a("custom", (Object) optJSONObject);
        }
        if (a != null) {
            for (int i = 0; i < a.size(); i++) {
                try {
                    AttachUserData attachUserData = a.get(i);
                    long uptimeMillis = SystemClock.uptimeMillis();
                    C1217a.m1411a(optJSONObject, attachUserData.getUserData(this.f1393a));
                    hashMap.put("custom_cost_" + attachUserData.getClass().getName() + "_" + hashMap.size(), Long.valueOf(SystemClock.uptimeMillis() - uptimeMillis));
                } catch (Throwable th) {
                    C1217a.m1410a(optJSONObject, th);
                }
            }
        }
        try {
            optJSONObject.put("fd_count", C1297h.m1759a());
        } catch (Throwable unused) {
        }
        List<AttachUserData> b = C1240h.m1552b().mo12172b(this.f1393a);
        if (b != null) {
            JSONObject optJSONObject2 = aVar.mo12265h().optJSONObject("custom_long");
            if (optJSONObject2 == null) {
                optJSONObject2 = new JSONObject();
                aVar.mo12251a("custom_long", (Object) optJSONObject2);
            }
            for (int i2 = 0; i2 < b.size(); i2++) {
                try {
                    AttachUserData attachUserData2 = b.get(i2);
                    long uptimeMillis2 = SystemClock.uptimeMillis();
                    C1217a.m1411a(optJSONObject2, attachUserData2.getUserData(this.f1393a));
                    hashMap.put("custom_cost_" + attachUserData2.getClass().getName() + "_" + hashMap.size(), Long.valueOf(SystemClock.uptimeMillis() - uptimeMillis2));
                } catch (Throwable th2) {
                    C1217a.m1410a(optJSONObject2, th2);
                }
            }
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            try {
                optJSONObject.put((String) entry.getKey(), entry.getValue());
            } catch (Throwable unused2) {
            }
        }
    }

    /* renamed from: a */
    public C1217a mo12462a(int i, C1217a aVar) {
        if (aVar == null) {
            aVar = new C1217a();
        }
        if (i == 0) {
            mo12465b(aVar);
        } else if (i == 1) {
            mo12466c(aVar);
            m2111i(aVar);
        } else if (i == 2) {
            mo12470e(aVar);
        } else if (i == 4) {
            mo12471f(aVar);
        } else if (i == 5) {
            mo12468d(aVar);
        }
        return aVar;
    }

    /* renamed from: a */
    public C1217a mo12447a(C1217a aVar) {
        return aVar;
    }

    /* renamed from: a */
    public C1217a mo12463a(C1217a aVar, C1347a aVar2, boolean z) {
        if (aVar == null) {
            aVar = new C1217a();
        }
        C1217a aVar3 = aVar;
        for (int i = 0; i < mo12464b(); i++) {
            long uptimeMillis = SystemClock.uptimeMillis();
            if (aVar2 != null) {
                try {
                    aVar3 = aVar2.mo12307a(i, aVar3);
                } catch (Throwable th) {
                    aVar2.mo12309a(th);
                }
            }
            try {
                aVar3 = mo12462a(i, aVar3);
            } catch (Throwable th2) {
                if (aVar2 != null) {
                    aVar2.mo12309a(th2);
                }
            }
            if (aVar2 != null) {
                try {
                    boolean z2 = true;
                    if (i != mo12464b() - 1) {
                        z2 = false;
                    }
                    aVar3 = aVar2.mo12308a(i, aVar3, z2);
                } catch (Throwable th3) {
                    aVar2.mo12309a(th3);
                }
                if (z) {
                    if (i != 0) {
                        aVar.mo12259c(aVar3.mo12265h());
                    } else {
                        aVar = aVar3;
                    }
                    aVar3 = new C1217a();
                }
            }
            aVar.mo12253b("step_cost_" + i, String.valueOf(SystemClock.uptimeMillis() - uptimeMillis));
        }
        return mo12447a(aVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo12448a() {
        return false;
    }

    /* renamed from: b */
    public int mo12464b() {
        return 6;
    }

    /* renamed from: b */
    public C1217a mo12465b(C1217a aVar) {
        aVar.mo12242a(C1240h.m1567p(), C1240h.m1568q());
        if (C1240h.m1564m()) {
            aVar.mo12251a("is_mp", (Object) 1);
        }
        try {
            aVar.mo12249a(this.f1395c.getPluginInfo());
        } catch (Throwable unused) {
        }
        aVar.mo12254b((Map<Integer, String>) C1240h.m1566o());
        aVar.mo12251a("process_name", (Object) C1285a.m1725c(C1240h.m1558g()));
        return aVar;
    }

    /* renamed from: c */
    public C1217a mo12466c(C1217a aVar) {
        C1343b bVar;
        if (!C1285a.m1724b(C1240h.m1558g())) {
            aVar.mo12251a("remote_process", (Object) 1);
        }
        aVar.mo12251a("pid", (Object) Integer.valueOf(Process.myPid()));
        aVar.mo12243a(C1240h.m1561j());
        if (mo12467c() && (bVar = this.f1396d) != null) {
            aVar.mo12245a(bVar);
        }
        try {
            aVar.mo12248a(this.f1395c.getPatchInfo());
        } catch (Throwable unused) {
        }
        String k = C1240h.m1562k();
        if (k != null) {
            aVar.mo12251a("business", (Object) k);
        }
        aVar.mo12251a("is_background", (Object) Boolean.valueOf(!C1285a.m1722a(this.f1394b)));
        return aVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public boolean mo12467c() {
        return true;
    }

    /* renamed from: d */
    public C1217a mo12468d(C1217a aVar) {
        if (mo12469d()) {
            aVar.mo12255b(C1318w.m1928a(this.f1394b));
        }
        return aVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public boolean mo12469d() {
        return true;
    }

    /* renamed from: e */
    public C1217a mo12470e(C1217a aVar) {
        C1348d dVar = this.f1397e;
        aVar.mo12251a("battery", (Object) Integer.valueOf(dVar == null ? 0 : dVar.mo12474a()));
        aVar.mo12257c((Map<? extends String, ? extends String>) C1240h.m1552b().mo12166a());
        return aVar;
    }

    /* renamed from: f */
    public C1217a mo12471f(C1217a aVar) {
        if (mo12448a()) {
            mo12473h(aVar);
        }
        return aVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo12472g(C1217a aVar) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public void mo12473h(C1217a aVar) {
    }
}

package com.apm.insight.runtime.p024a;

import android.content.Context;
import com.apm.insight.C1176b;
import com.apm.insight.C1240h;
import com.apm.insight.CrashType;
import com.apm.insight.entity.C1217a;
import com.apm.insight.entity.Header;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;

/* renamed from: com.apm.insight.runtime.a.f */
public class C1352f {

    /* renamed from: a */
    private static volatile C1352f f1402a;

    /* renamed from: b */
    private Context f1403b;

    /* renamed from: c */
    private Map<CrashType, C1346c> f1404c = new HashMap();

    /* renamed from: d */
    private C1343b f1405d;

    /* renamed from: e */
    private C1348d f1406e;

    /* renamed from: com.apm.insight.runtime.a.f$1 */
    static /* synthetic */ class C13531 {

        /* renamed from: a */
        static final /* synthetic */ int[] f1407a;

        /* JADX WARNING: Can't wrap try/catch for region: R(18:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|18) */
        /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.apm.insight.CrashType[] r0 = com.apm.insight.CrashType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f1407a = r0
                com.apm.insight.CrashType r1 = com.apm.insight.CrashType.JAVA     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f1407a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.apm.insight.CrashType r1 = com.apm.insight.CrashType.LAUNCH     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f1407a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.apm.insight.CrashType r1 = com.apm.insight.CrashType.NATIVE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f1407a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.apm.insight.CrashType r1 = com.apm.insight.CrashType.ANR     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f1407a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.apm.insight.CrashType r1 = com.apm.insight.CrashType.DART     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f1407a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.apm.insight.CrashType r1 = com.apm.insight.CrashType.CUSTOM_JAVA     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f1407a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.apm.insight.CrashType r1 = com.apm.insight.CrashType.BLOCK     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f1407a     // Catch:{ NoSuchFieldError -> 0x0060 }
                com.apm.insight.CrashType r1 = com.apm.insight.CrashType.ENSURE     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.apm.insight.runtime.p024a.C1352f.C13531.<clinit>():void");
        }
    }

    private C1352f(Context context) {
        this.f1403b = context;
        try {
            this.f1405d = C1343b.m2080d();
            this.f1406e = new C1348d(this.f1403b);
        } catch (Throwable th) {
            C1176b.m1249a().mo12218a("NPTH_CATCH", th);
        }
    }

    /* renamed from: a */
    private C1346c m2137a(CrashType crashType) {
        C1346c cVar = this.f1404c.get(crashType);
        if (cVar != null) {
            return cVar;
        }
        switch (C13531.f1407a[crashType.ordinal()]) {
            case 1:
                cVar = new C1357j(this.f1403b, this.f1405d, this.f1406e);
                break;
            case 2:
                cVar = new C1358k(this.f1403b, this.f1405d, this.f1406e);
                break;
            case 3:
                cVar = new C1359l(this.f1403b, this.f1405d, this.f1406e);
                break;
            case 4:
                cVar = new C1342a(this.f1403b, this.f1405d, this.f1406e);
                break;
            case 5:
                cVar = new C1355h(this.f1403b, this.f1405d, this.f1406e);
                break;
            case 6:
                cVar = new C1354g(this.f1403b, this.f1405d, this.f1406e);
                break;
            case 7:
                cVar = new C1351e(this.f1403b, this.f1405d, this.f1406e);
                break;
            case 8:
                cVar = new C1356i(this.f1403b, this.f1405d, this.f1406e);
                break;
        }
        if (cVar != null) {
            this.f1404c.put(crashType, cVar);
        }
        return cVar;
    }

    /* renamed from: a */
    public static C1352f m2138a() {
        if (f1402a == null) {
            Context g = C1240h.m1558g();
            if (g != null) {
                f1402a = new C1352f(g);
            } else {
                throw new IllegalArgumentException("NpthBus not init");
            }
        }
        return f1402a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0003, code lost:
        r3 = m2137a(r3);
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.apm.insight.entity.C1217a mo12477a(com.apm.insight.CrashType r3, com.apm.insight.entity.C1217a r4) {
        /*
            r2 = this;
            if (r3 != 0) goto L_0x0003
            return r4
        L_0x0003:
            com.apm.insight.runtime.a.c r3 = r2.m2137a(r3)
            if (r3 == 0) goto L_0x0010
            r0 = 0
            r1 = 0
            com.apm.insight.entity.a r3 = r3.mo12463a(r4, r0, r1)
            return r3
        L_0x0010:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apm.insight.runtime.p024a.C1352f.mo12477a(com.apm.insight.CrashType, com.apm.insight.entity.a):com.apm.insight.entity.a");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0003, code lost:
        r1 = m2137a(r1);
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.apm.insight.entity.C1217a mo12478a(com.apm.insight.CrashType r1, com.apm.insight.entity.C1217a r2, com.apm.insight.runtime.p024a.C1346c.C1347a r3, boolean r4) {
        /*
            r0 = this;
            if (r1 != 0) goto L_0x0003
            return r2
        L_0x0003:
            com.apm.insight.runtime.a.c r1 = r0.m2137a(r1)
            if (r1 == 0) goto L_0x000e
            com.apm.insight.entity.a r1 = r1.mo12463a(r2, r3, r4)
            return r1
        L_0x000e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apm.insight.runtime.p024a.C1352f.mo12478a(com.apm.insight.CrashType, com.apm.insight.entity.a, com.apm.insight.runtime.a.c$a, boolean):com.apm.insight.entity.a");
    }

    /* renamed from: a */
    public C1217a mo12479a(List<C1217a> list, JSONArray jSONArray) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        C1217a aVar = new C1217a();
        JSONArray jSONArray2 = new JSONArray();
        for (C1217a h : list) {
            jSONArray2.put(h.mo12265h());
        }
        aVar.mo12251a("data", (Object) jSONArray2);
        aVar.mo12251a("all_data", (Object) jSONArray);
        Header a = Header.m1383a(this.f1403b);
        Header.m1385a(a);
        a.mo12238c();
        a.mo12239d();
        a.mo12240e();
        Header.m1388b(a);
        aVar.mo12244a(a);
        return aVar;
    }
}

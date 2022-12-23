package com.apm.insight.p022k;

import com.apm.insight.CrashType;
import java.util.concurrent.ConcurrentLinkedQueue;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.apm.insight.k.c */
public abstract class C1265c {

    /* renamed from: a */
    private static ConcurrentLinkedQueue<C1265c> f1223a = new ConcurrentLinkedQueue<>();

    /* renamed from: com.apm.insight.k.c$1 */
    static /* synthetic */ class C12661 {

        /* renamed from: a */
        static final /* synthetic */ int[] f1224a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.apm.insight.CrashType[] r0 = com.apm.insight.CrashType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f1224a = r0
                com.apm.insight.CrashType r1 = com.apm.insight.CrashType.JAVA     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f1224a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.apm.insight.CrashType r1 = com.apm.insight.CrashType.LAUNCH     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f1224a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.apm.insight.CrashType r1 = com.apm.insight.CrashType.NATIVE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.apm.insight.p022k.C1265c.C12661.<clinit>():void");
        }
    }

    /* renamed from: com.apm.insight.k.c$a */
    public static class C1267a {

        /* renamed from: a */
        private JSONObject f1225a;

        /* renamed from: b */
        private JSONObject f1226b;

        /* renamed from: c */
        private CrashType f1227c;

        C1267a(JSONObject jSONObject, CrashType crashType) {
            this.f1227c = crashType;
            if (crashType == CrashType.LAUNCH) {
                this.f1225a = ((JSONArray) jSONObject.opt("data")).optJSONObject(0);
            } else {
                this.f1225a = jSONObject;
            }
            this.f1226b = jSONObject.optJSONObject("header");
        }

        /* renamed from: a */
        public String mo12327a() {
            return this.f1225a.optString("crash_thread_name", (String) null);
        }

        /* renamed from: b */
        public long mo12328b() {
            return (long) this.f1225a.optInt("app_start_time", -1);
        }

        /* renamed from: c */
        public String mo12329c() {
            int i = C12661.f1224a[this.f1227c.ordinal()];
            if (i == 1) {
                return this.f1225a.optString("data", (String) null);
            }
            if (i == 2) {
                return this.f1225a.optString("stack", (String) null);
            }
            if (i != 3) {
                return null;
            }
            return this.f1225a.optString("data", (String) null);
        }
    }

    /* renamed from: a */
    static void m1643a(CrashType crashType, JSONObject jSONObject) {
        ConcurrentLinkedQueue<C1265c> concurrentLinkedQueue = f1223a;
        if (concurrentLinkedQueue != null && !concurrentLinkedQueue.isEmpty()) {
            C1267a aVar = new C1267a(jSONObject, crashType);
            while (!f1223a.isEmpty()) {
                C1265c poll = f1223a.poll();
                if (poll != null) {
                    poll.mo12326a(crashType, aVar);
                }
            }
            f1223a = null;
        }
    }

    /* renamed from: a */
    public abstract void mo12326a(CrashType crashType, C1267a aVar);
}

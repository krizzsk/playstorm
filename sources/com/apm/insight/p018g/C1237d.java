package com.apm.insight.p018g;

import android.content.Context;
import android.os.Process;
import android.os.SystemClock;
import com.adjust.sdk.Constants;
import com.apm.insight.C1176b;
import com.apm.insight.C1240h;
import com.apm.insight.CrashType;
import com.apm.insight.Npth;
import com.apm.insight.entity.C1217a;
import com.apm.insight.nativecrash.NativeImpl;
import com.apm.insight.p011b.C1187g;
import com.apm.insight.p011b.C1204k;
import com.apm.insight.p012c.C1207b;
import com.apm.insight.p023l.C1285a;
import com.apm.insight.p023l.C1298i;
import com.apm.insight.p023l.C1308o;
import com.apm.insight.p023l.C1312r;
import com.apm.insight.p023l.C1316v;
import com.apm.insight.runtime.C1341a;
import com.apm.insight.runtime.C1374k;
import com.apm.insight.runtime.p024a.C1343b;
import com.apm.insight.runtime.p024a.C1346c;
import com.apm.insight.runtime.p024a.C1352f;
import java.io.File;
import java.io.IOException;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.apm.insight.g.d */
public class C1237d implements C1236c {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public Context f1138a;

    public C1237d(Context context) {
        this.f1138a = context;
    }

    /* renamed from: a */
    public static int m1534a() {
        return 6;
    }

    /* renamed from: a */
    public void mo12305a(long j, Thread thread, Throwable th, String str, File file, String str2, boolean z) {
        final String str3 = str;
        final File file2 = new File(C1308o.m1830a(this.f1138a), str3);
        C1231a.m1508a().mo12295a(file2.getName());
        file2.mkdirs();
        C1298i.m1791f(file2);
        final boolean c = C1316v.m1924c(th);
        final Throwable th2 = th;
        final long j2 = j;
        final String str4 = str2;
        final boolean z2 = z;
        final Thread thread2 = thread;
        C1217a a = C1352f.m2138a().mo12478a(CrashType.JAVA, (C1217a) null, new C1346c.C1347a() {

            /* renamed from: a */
            long f1139a = 0;

            /* renamed from: a */
            public C1217a mo12307a(int i, C1217a aVar) {
                String valueOf;
                String str;
                Object b;
                String str2;
                this.f1139a = SystemClock.uptimeMillis();
                if (i != 0) {
                    if (i == 1) {
                        Thread thread = thread2;
                        aVar.mo12251a("crash_thread_name", (Object) thread != null ? thread.getName() : "");
                        aVar.mo12251a("tid", (Object) Integer.valueOf(Process.myTid()));
                        String str3 = "true";
                        aVar.mo12246a("crash_after_crash", Npth.hasCrashWhenJavaCrash() ? str3 : "false");
                        if (!NativeImpl.m1963d()) {
                            str3 = "false";
                        }
                        aVar.mo12246a("crash_after_native", str3);
                        C1231a.m1508a().mo12296a(thread2, th2, false, aVar);
                    } else if (i != 2) {
                        if (i == 3) {
                            JSONObject b2 = C1316v.m1919b(Thread.currentThread().getName());
                            if (b2 != null) {
                                aVar.mo12251a("all_thread_stacks", (Object) b2);
                            }
                            b = C1374k.m2204b(C1240h.m1557f());
                            str2 = "logcat";
                        } else if (i != 4) {
                            if (i == 5) {
                                b = str3;
                                str2 = "crash_uuid";
                            }
                        } else if (!c) {
                            C1285a.m1718a(C1237d.this.f1138a, aVar.mo12265h());
                        }
                        aVar.mo12251a(str2, b);
                    } else {
                        if (c) {
                            C1285a.m1718a(C1237d.this.f1138a, aVar.mo12265h());
                        }
                        JSONArray c = C1187g.m1300b().mo12202c();
                        long uptimeMillis = SystemClock.uptimeMillis();
                        JSONObject a = C1187g.m1300b().mo12199a(uptimeMillis).mo12207a();
                        JSONArray a2 = C1204k.m1351a(100, uptimeMillis);
                        aVar.mo12251a("history_message", (Object) c);
                        aVar.mo12251a("current_message", (Object) a);
                        aVar.mo12251a("pending_messages", (Object) a2);
                        aVar.mo12246a("disable_looper_monitor", String.valueOf(C1341a.m2047d()));
                        valueOf = String.valueOf(C1207b.m1360a());
                        str = "npth_force_apm_crash";
                    }
                    return aVar;
                }
                aVar.mo12251a("data", (Object) C1316v.m1903a(th2));
                aVar.mo12251a("isOOM", (Object) Boolean.valueOf(c));
                aVar.mo12251a("isJava", (Object) 1);
                aVar.mo12251a("crash_time", (Object) Long.valueOf(j2));
                aVar.mo12251a("launch_mode", (Object) Integer.valueOf(C1343b.m2069b()));
                aVar.mo12251a("launch_time", (Object) Long.valueOf(C1343b.m2074c()));
                String str4 = str4;
                if (str4 != null) {
                    aVar.mo12251a("crash_md5", (Object) str4);
                    aVar.mo12246a("crash_md5", str4);
                    boolean z = z2;
                    if (z) {
                        valueOf = String.valueOf(z);
                        str = "has_ignore";
                    }
                }
                return aVar;
                aVar.mo12246a(str, valueOf);
                return aVar;
            }

            /* renamed from: a */
            public C1217a mo12308a(int i, C1217a aVar, boolean z) {
                if (C1312r.m1882a(C1312r.m1883b(i))) {
                    return aVar;
                }
                try {
                    File file = file2;
                    C1298i.m1772a(new File(file, file2.getName() + "." + i), aVar.mo12265h(), false);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                return aVar;
            }

            /* renamed from: a */
            public void mo12309a(Throwable th) {
            }
        }, true);
        long currentTimeMillis = System.currentTimeMillis() - j;
        try {
            a.mo12246a("crash_type", Constants.NORMAL);
            a.mo12253b("crash_cost", String.valueOf(currentTimeMillis));
            a.mo12246a("crash_cost", String.valueOf(currentTimeMillis / 1000));
        } catch (Throwable th3) {
            C1176b.m1249a().mo12218a("NPTH_CATCH", th3);
        }
        if (!C1312r.m1882a(4)) {
            boolean a2 = C1312r.m1882a(2048);
        }
    }

    /* renamed from: a */
    public boolean mo12306a(Throwable th) {
        return true;
    }
}

package com.apm.insight.p011b;

import android.content.Context;
import android.os.SystemClock;
import com.apm.insight.C1176b;
import com.apm.insight.C1240h;
import com.apm.insight.CrashType;
import com.apm.insight.ICrashCallback;
import com.apm.insight.nativecrash.NativeImpl;
import com.apm.insight.p023l.C1285a;
import com.apm.insight.p023l.C1298i;
import com.apm.insight.p023l.C1301l;
import com.apm.insight.runtime.C1341a;
import com.apm.insight.runtime.C1379o;
import com.apm.insight.runtime.p024a.C1343b;
import com.facebook.internal.security.CertificateUtil;
import com.tapjoy.TapjoyConstants;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.apm.insight.b.b */
public class C1178b {

    /* renamed from: a */
    static volatile boolean f930a = true;

    /* renamed from: f */
    private static volatile boolean f931f;

    /* renamed from: A */
    private long f932A = 0;

    /* renamed from: B */
    private final Runnable f933B = new Runnable() {
        public void run() {
            try {
                C1178b.this.mo12181a(200, 25);
            } catch (Throwable th) {
                C1176b.m1249a().mo12218a("NPTH_CATCH", th);
            }
        }
    };

    /* renamed from: C */
    private int f934C = 0;

    /* renamed from: D */
    private List<Pattern> f935D = null;

    /* renamed from: E */
    private File f936E = null;

    /* renamed from: b */
    Pattern f937b = null;

    /* renamed from: c */
    private C1181c f938c;

    /* renamed from: d */
    private final Context f939d;

    /* renamed from: e */
    private volatile boolean f940e;

    /* renamed from: g */
    private long f941g = -1;

    /* renamed from: h */
    private File f942h = null;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public boolean f943i = true;

    /* renamed from: j */
    private JSONObject f944j;

    /* renamed from: k */
    private JSONObject f945k;

    /* renamed from: l */
    private String f946l = "unknown";

    /* renamed from: m */
    private String f947m = "unknown";

    /* renamed from: n */
    private String f948n = "unknown";

    /* renamed from: o */
    private String f949o = "npth_inner_default";

    /* renamed from: p */
    private JSONArray f950p;

    /* renamed from: q */
    private JSONObject f951q;

    /* renamed from: r */
    private int f952r = 0;

    /* renamed from: s */
    private long f953s = -1;

    /* renamed from: t */
    private JSONArray f954t;

    /* renamed from: u */
    private JSONArray f955u;

    /* renamed from: v */
    private JSONObject f956v;

    /* renamed from: w */
    private boolean f957w;

    /* renamed from: x */
    private final Object f958x = new Object();

    /* renamed from: y */
    private volatile boolean f959y;

    /* renamed from: z */
    private long f960z = -1;

    public C1178b(Context context) {
        this.f939d = context;
    }

    /* renamed from: a */
    private static String m1253a(float f) {
        return f <= 0.0f ? "0%" : f <= 0.1f ? "0% - 10%" : f <= 0.3f ? "10% - 30%" : f <= 0.6f ? "30% - 60%" : f <= 0.9f ? "60% - 90%" : "90% - 100%";
    }

    /* renamed from: a */
    private static String m1254a(float f, float f2) {
        return f2 > 0.0f ? m1253a(f / f2) : f > 0.0f ? "100%" : "0%";
    }

    /* renamed from: a */
    private JSONObject m1255a(String str, JSONArray jSONArray) {
        JSONObject jSONObject = new JSONObject();
        JSONArray a = C1301l.m1799a(256, 128, jSONArray);
        if (a.length() != jSONArray.length()) {
            this.f952r++;
        }
        try {
            jSONObject.put("thread_name", str);
            jSONObject.put("thread_stack", a);
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:112:0x0226, code lost:
        if (r3 != 5) goto L_0x028e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x020f  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x0265  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x0273  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x027f  */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x028b  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x0293  */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x02e2  */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x02eb A[LOOP:3: B:99:0x020c->B:154:0x02eb, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:180:0x037e  */
    /* JADX WARNING: Removed duplicated region for block: B:215:0x040d A[EDGE_INSN: B:215:0x040d->B:202:0x040d ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:217:0x03f2 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:221:0x0083 A[EDGE_INSN: B:221:0x0083->B:18:0x0083 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:222:0x03b6 A[EDGE_INSN: B:222:0x03b6->B:190:0x03b6 ?: BREAK  , SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m1256a(java.lang.String r30, org.json.JSONObject r31) {
        /*
            r29 = this;
            r0 = r29
            r1 = r31
            android.os.SystemClock.uptimeMillis()
            java.lang.String r2 = "\n"
            r3 = r30
            java.lang.String[] r2 = r3.split(r2)
            r3 = 3
            float[] r4 = new float[r3]
            r4 = {-1082130432, -1082130432, -1082130432} // fill-array
            java.util.HashMap r5 = new java.util.HashMap
            r5.<init>()
            java.util.HashMap r6 = new java.util.HashMap
            r6.<init>()
            java.util.HashMap r7 = new java.util.HashMap
            r7.<init>()
            java.util.HashMap r8 = new java.util.HashMap
            r8.<init>()
            java.util.HashMap r9 = new java.util.HashMap
            r9.<init>()
            int r10 = r2.length
            java.lang.String r11 = "unknown"
            r15 = r11
            r16 = r15
            r13 = 0
            r14 = 0
            r17 = 0
        L_0x0038:
            java.lang.String r12 = "total"
            if (r13 >= r10) goto L_0x0407
            r3 = r2[r13]
            boolean r18 = android.text.TextUtils.isEmpty(r3)
            if (r18 == 0) goto L_0x0053
            r18 = r2
            r25 = r7
            r26 = r8
            r27 = r9
            r19 = r10
            r22 = r11
            r7 = 3
            goto L_0x03f2
        L_0x0053:
            r18 = r2
            java.lang.String r2 = ""
            r19 = r10
            r10 = 1
            if (r14 == 0) goto L_0x03c9
            if (r14 == r10) goto L_0x02ff
            r10 = 2
            if (r14 == r10) goto L_0x02f3
            r10 = 3
            if (r14 == r10) goto L_0x0071
            r25 = r7
            r26 = r8
            r27 = r9
            r7 = r10
            r22 = r11
            r23 = r14
            goto L_0x03ec
        L_0x0071:
            java.lang.String r10 = "\\s"
            java.lang.String[] r10 = r3.split(r10)
            r22 = r11
            int r11 = r10.length
            r23 = r14
            r14 = 2
            if (r11 >= r14) goto L_0x0087
            r25 = r7
        L_0x0081:
            r26 = r8
        L_0x0083:
            r27 = r9
            goto L_0x03b6
        L_0x0087:
            r11 = 0
            r14 = r10[r11]
            java.lang.String r11 = "CPU"
            boolean r11 = r11.equalsIgnoreCase(r14)
            if (r11 == 0) goto L_0x00dd
            r11 = 1
            r14 = r10[r11]
            java.lang.String r11 = "usage"
            boolean r11 = r11.equalsIgnoreCase(r14)
            if (r11 == 0) goto L_0x00dd
            java.lang.String r2 = "ago"
            boolean r2 = r3.contains(r2)
            if (r2 == 0) goto L_0x00a7
            r17 = 1
        L_0x00a7:
            boolean r2 = r5.isEmpty()
            if (r2 == 0) goto L_0x00d2
            boolean r2 = r6.isEmpty()
            if (r2 == 0) goto L_0x00d2
            boolean r2 = r7.isEmpty()
            if (r2 == 0) goto L_0x00d2
            boolean r2 = r9.isEmpty()
            if (r2 == 0) goto L_0x00d2
            boolean r2 = r8.isEmpty()
            if (r2 != 0) goto L_0x00c6
            goto L_0x00d2
        L_0x00c6:
            r25 = r7
            r26 = r8
            r27 = r9
            r14 = r23
            r0 = 4
            r7 = 3
            goto L_0x03ef
        L_0x00d2:
            r25 = r7
            r26 = r8
            r27 = r9
            r0 = 4
            r7 = 3
            r14 = 4
            goto L_0x03ef
        L_0x00dd:
            boolean r11 = r5.isEmpty()
            if (r11 != 0) goto L_0x00fc
            boolean r11 = r6.isEmpty()
            if (r11 != 0) goto L_0x00fc
            boolean r11 = r7.isEmpty()
            if (r11 != 0) goto L_0x00fc
            boolean r11 = r9.isEmpty()
            if (r11 != 0) goto L_0x00fc
            boolean r11 = r8.isEmpty()
            if (r11 != 0) goto L_0x00fc
            goto L_0x00d2
        L_0x00fc:
            boolean r11 = r5.isEmpty()
            if (r11 == 0) goto L_0x0113
            r11 = 1
            r14 = r10[r11]
            java.lang.String r11 = "TOTAL:"
            boolean r11 = r14.equalsIgnoreCase(r11)
            if (r11 == 0) goto L_0x0113
            r11 = r2
            r0 = r5
            r25 = r7
            goto L_0x01ab
        L_0x0113:
            android.content.Context r11 = r0.f939d
            java.lang.String r11 = r11.getPackageName()
            boolean r11 = r3.contains(r11)
            if (r11 == 0) goto L_0x0174
            r11 = r2
            r3 = 0
        L_0x0121:
            int r14 = r10.length
            if (r3 >= r14) goto L_0x016d
            r14 = r10[r3]
            r24 = r11
            android.content.Context r11 = r0.f939d
            java.lang.String r11 = r11.getPackageName()
            boolean r11 = r14.contains(r11)
            if (r11 == 0) goto L_0x0160
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r14 = r10[r3]
            r0 = r10[r3]
            r25 = r7
            r7 = 47
            int r0 = r0.indexOf(r7)
            r7 = 1
            int r0 = r0 + r7
            r21 = r10[r3]
            int r21 = r21.length()
            int r1 = r21 + -1
            java.lang.String r0 = r14.substring(r0, r1)
            r11.append(r0)
            r0 = 95
            r11.append(r0)
            java.lang.String r11 = r11.toString()
            goto L_0x0164
        L_0x0160:
            r25 = r7
            r11 = r24
        L_0x0164:
            int r3 = r3 + 1
            r0 = r29
            r1 = r31
            r7 = r25
            goto L_0x0121
        L_0x016d:
            r25 = r7
            r24 = r11
            r0 = r25
            goto L_0x01ab
        L_0x0174:
            r25 = r7
            boolean r0 = r6.isEmpty()
            if (r0 == 0) goto L_0x0187
            java.lang.String r0 = "system_server:"
            boolean r0 = r3.contains(r0)
            if (r0 == 0) goto L_0x0187
            r11 = r2
            r0 = r6
            goto L_0x01ab
        L_0x0187:
            boolean r0 = r9.isEmpty()
            if (r0 == 0) goto L_0x0198
            java.lang.String r0 = "kswapd"
            boolean r0 = r3.contains(r0)
            if (r0 == 0) goto L_0x0198
            r11 = r2
            r0 = r9
            goto L_0x01ab
        L_0x0198:
            boolean r0 = r8.isEmpty()
            if (r0 == 0) goto L_0x01a9
            java.lang.String r0 = "dex2oat"
            boolean r0 = r3.contains(r0)
            if (r0 == 0) goto L_0x01a9
            r11 = r2
            r0 = r8
            goto L_0x01ab
        L_0x01a9:
            r11 = r2
            r0 = 0
        L_0x01ab:
            if (r0 == 0) goto L_0x0081
            r1 = 0
        L_0x01ae:
            r3 = r10[r1]
            java.lang.String r7 = "%"
            boolean r3 = r3.contains(r7)
            if (r3 != 0) goto L_0x01bd
            int r1 = r1 + 1
            int r3 = r10.length
            if (r1 < r3) goto L_0x01ae
        L_0x01bd:
            r14 = r10[r1]     // Catch:{ all -> 0x01ef }
            java.lang.String r14 = r14.replace(r7, r2)     // Catch:{ all -> 0x01ef }
            java.lang.Float r14 = java.lang.Float.valueOf(r14)     // Catch:{ all -> 0x01ef }
            float r14 = r14.floatValue()     // Catch:{ all -> 0x01ef }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x01ef }
            r3.<init>()     // Catch:{ all -> 0x01ef }
            r3.append(r11)     // Catch:{ all -> 0x01ef }
            r3.append(r12)     // Catch:{ all -> 0x01ef }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x01ef }
            if (r0 != r5) goto L_0x01df
            r26 = r8
            goto L_0x01e7
        L_0x01df:
            r26 = r8
            int r8 = com.apm.insight.p023l.C1291d.m1748e()     // Catch:{ all -> 0x01f1 }
            float r8 = (float) r8     // Catch:{ all -> 0x01f1 }
            float r14 = r14 / r8
        L_0x01e7:
            java.lang.Float r8 = java.lang.Float.valueOf(r14)     // Catch:{ all -> 0x01f1 }
            r0.put(r3, r8)     // Catch:{ all -> 0x01f1 }
            goto L_0x0209
        L_0x01ef:
            r26 = r8
        L_0x01f1:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r11)
            r3.append(r12)
            java.lang.String r3 = r3.toString()
            r8 = -1082130432(0xffffffffbf800000, float:-1.0)
            java.lang.Float r14 = java.lang.Float.valueOf(r8)
            r0.put(r3, r14)
        L_0x0209:
            int r1 = r1 + 3
            r3 = 0
        L_0x020c:
            int r8 = r10.length
            if (r1 >= r8) goto L_0x0083
            java.lang.String r8 = "kernel"
            java.lang.String r14 = "softirq"
            r27 = r9
            if (r3 == 0) goto L_0x023f
            r9 = 1
            if (r3 == r9) goto L_0x0239
            r9 = 2
            if (r3 == r9) goto L_0x0234
            r8 = 3
            if (r3 == r8) goto L_0x022f
            r8 = 4
            if (r3 == r8) goto L_0x022a
            r8 = 5
            r28 = r3
            if (r3 == r8) goto L_0x0283
            goto L_0x028e
        L_0x022a:
            r28 = r3
            r20 = 5
            goto L_0x0277
        L_0x022f:
            r28 = r3
            r20 = 5
            goto L_0x0269
        L_0x0234:
            r28 = r3
            r20 = 5
            goto L_0x025b
        L_0x0239:
            r9 = 2
            r20 = 5
            r28 = r3
            goto L_0x0251
        L_0x023f:
            r20 = 5
            r9 = r10[r1]
            r28 = r3
            java.lang.String r3 = "user"
            boolean r3 = r3.equalsIgnoreCase(r9)
            if (r3 == 0) goto L_0x0251
            java.lang.String r8 = "user"
            r3 = 1
            goto L_0x0291
        L_0x0251:
            r3 = r10[r1]
            boolean r3 = r8.equalsIgnoreCase(r3)
            if (r3 == 0) goto L_0x025b
            r3 = 2
            goto L_0x0291
        L_0x025b:
            r3 = r10[r1]
            java.lang.String r8 = "iowait"
            boolean r3 = r8.equalsIgnoreCase(r3)
            if (r3 == 0) goto L_0x0269
            java.lang.String r8 = "iowait"
            r3 = 3
            goto L_0x0291
        L_0x0269:
            r3 = r10[r1]
            java.lang.String r8 = "irq"
            boolean r3 = r8.equalsIgnoreCase(r3)
            if (r3 == 0) goto L_0x0277
            java.lang.String r8 = "irq"
            r3 = 4
            goto L_0x0291
        L_0x0277:
            r3 = r10[r1]
            boolean r3 = r14.equalsIgnoreCase(r3)
            if (r3 == 0) goto L_0x0283
            r8 = r14
            r3 = r20
            goto L_0x0291
        L_0x0283:
            r3 = r10[r1]
            boolean r3 = r14.equalsIgnoreCase(r3)
            if (r3 == 0) goto L_0x028e
            r3 = 6
            r8 = r14
            goto L_0x0291
        L_0x028e:
            r3 = r28
            r8 = 0
        L_0x0291:
            if (r8 == 0) goto L_0x02e2
            int r9 = r1 + -1
            r9 = r10[r9]     // Catch:{ all -> 0x02c7 }
            java.lang.String r9 = r9.replace(r7, r2)     // Catch:{ all -> 0x02c7 }
            java.lang.Float r9 = java.lang.Float.valueOf(r9)     // Catch:{ all -> 0x02c7 }
            float r9 = r9.floatValue()     // Catch:{ all -> 0x02c7 }
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch:{ all -> 0x02c7 }
            r14.<init>()     // Catch:{ all -> 0x02c7 }
            r14.append(r11)     // Catch:{ all -> 0x02c7 }
            r14.append(r8)     // Catch:{ all -> 0x02c7 }
            java.lang.String r14 = r14.toString()     // Catch:{ all -> 0x02c7 }
            if (r0 != r5) goto L_0x02b7
            r20 = r7
            goto L_0x02bf
        L_0x02b7:
            r20 = r7
            int r7 = com.apm.insight.p023l.C1291d.m1748e()     // Catch:{ all -> 0x02c9 }
            float r7 = (float) r7     // Catch:{ all -> 0x02c9 }
            float r9 = r9 / r7
        L_0x02bf:
            java.lang.Float r7 = java.lang.Float.valueOf(r9)     // Catch:{ all -> 0x02c9 }
            r0.put(r14, r7)     // Catch:{ all -> 0x02c9 }
            goto L_0x02e4
        L_0x02c7:
            r20 = r7
        L_0x02c9:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r11)
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            r8 = -1082130432(0xffffffffbf800000, float:-1.0)
            java.lang.Float r9 = java.lang.Float.valueOf(r8)
            r0.put(r7, r9)
            goto L_0x02e6
        L_0x02e2:
            r20 = r7
        L_0x02e4:
            r8 = -1082130432(0xffffffffbf800000, float:-1.0)
        L_0x02e6:
            r7 = 6
            if (r3 < r7) goto L_0x02eb
            goto L_0x03b6
        L_0x02eb:
            int r1 = r1 + 3
            r7 = r20
            r9 = r27
            goto L_0x020c
        L_0x02f3:
            r25 = r7
            r26 = r8
            r27 = r9
            r22 = r11
            r23 = r14
            goto L_0x0383
        L_0x02ff:
            r25 = r7
            r26 = r8
            r27 = r9
            r22 = r11
            r23 = r14
            java.lang.String r3 = r3.trim()
            java.lang.String r0 = r3.toLowerCase()
            java.lang.String r1 = "shortmsg"
            boolean r1 = r0.startsWith(r1)
            r7 = 58
            if (r1 == 0) goto L_0x0324
            int r1 = r3.indexOf(r7)
            r3.substring(r1)
            r10 = 0
            goto L_0x0334
        L_0x0324:
            java.lang.String r1 = "reason:"
            boolean r1 = r0.startsWith(r1)
            if (r1 == 0) goto L_0x03b8
            int r1 = r3.indexOf(r7)
            r3.substring(r1)
            r10 = 1
        L_0x0334:
            java.lang.String r1 = "input dispatch"
            boolean r1 = r0.contains(r1)
            java.lang.String r7 = "executing service"
            if (r1 == 0) goto L_0x0343
            java.lang.String r0 = "Input dispatching timed out"
        L_0x0340:
            r16 = r0
            goto L_0x037c
        L_0x0343:
            java.lang.String r1 = "broadcast of intent"
            boolean r1 = r0.contains(r1)
            if (r1 == 0) goto L_0x034e
            java.lang.String r0 = "Broadcast of Intent"
            goto L_0x0340
        L_0x034e:
            boolean r1 = r0.contains(r7)
            if (r1 == 0) goto L_0x036f
            java.lang.String r0 = "null"
            boolean r0 = r0.equalsIgnoreCase(r15)
            if (r0 == 0) goto L_0x036c
            java.lang.String r0 = "service "
            int r0 = r3.indexOf(r0)
            int r0 = r0 + 8
            java.lang.String r0 = r3.substring(r0)
            java.lang.String r15 = r0.trim()
        L_0x036c:
            r16 = r7
            goto L_0x037c
        L_0x036f:
            java.lang.String r1 = "service.startforeground"
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L_0x037a
            java.lang.String r0 = "not call Service.startForeground"
            goto L_0x0340
        L_0x037a:
            r16 = r22
        L_0x037c:
            if (r10 == 0) goto L_0x0383
            r0 = 4
            r7 = 3
            r14 = 2
            goto L_0x03ef
        L_0x0383:
            java.lang.String r0 = r3.trim()
            java.lang.String r1 = "Load:"
            boolean r3 = r0.startsWith(r1)
            if (r3 == 0) goto L_0x03b6
            java.lang.String r0 = r0.replace(r1, r2)
            java.lang.String r0 = r0.trim()
            java.lang.String r1 = "/"
            java.lang.String[] r0 = r0.split(r1)
            int r1 = r0.length
            r7 = 3
            if (r7 != r1) goto L_0x03b4
            r1 = 0
        L_0x03a2:
            int r2 = r0.length
            if (r1 >= r2) goto L_0x03b4
            r2 = r0[r1]
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            float r2 = r2.floatValue()
            r4[r1] = r2
            int r1 = r1 + 1
            goto L_0x03a2
        L_0x03b4:
            r14 = r7
            goto L_0x03ee
        L_0x03b6:
            r7 = 3
            goto L_0x03ec
        L_0x03b8:
            r7 = 3
            java.lang.String r1 = "appfreeze"
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L_0x03ec
            r0 = 10
            java.lang.String r1 = "AppFreeze"
            r14 = r0
            r16 = r1
            goto L_0x03ee
        L_0x03c9:
            r25 = r7
            r26 = r8
            r27 = r9
            r22 = r11
            r23 = r14
            r7 = 3
            java.lang.String r0 = r3.trim()
            java.lang.String r1 = "tag:"
            boolean r3 = r0.startsWith(r1)
            if (r3 == 0) goto L_0x03ec
            java.lang.String r0 = r0.replace(r1, r2)
            java.lang.String r0 = r0.trim()
            r15 = r0
            r0 = 4
            r14 = 1
            goto L_0x03ef
        L_0x03ec:
            r14 = r23
        L_0x03ee:
            r0 = 4
        L_0x03ef:
            if (r14 < r0) goto L_0x03f2
            goto L_0x040d
        L_0x03f2:
            int r13 = r13 + 1
            r0 = r29
            r1 = r31
            r3 = r7
            r2 = r18
            r10 = r19
            r11 = r22
            r7 = r25
            r8 = r26
            r9 = r27
            goto L_0x0038
        L_0x0407:
            r25 = r7
            r26 = r8
            r27 = r9
        L_0x040d:
            r0 = r16
            java.lang.String r1 = "anr_tag"
            r2 = r31
            r2.put(r1, r15)
            java.lang.String r1 = java.lang.String.valueOf(r17)
            java.lang.String r3 = "anr_has_ago"
            r2.put(r3, r1)
            java.lang.String r1 = "anr_reason"
            r2.put(r1, r0)
            java.lang.String r0 = "app"
            r1 = r25
            m1257a(r1, r2, r0)
            m1257a(r5, r2, r12)
            boolean r0 = r6.isEmpty()
            java.lang.String r1 = "npth_anr_systemserver_total"
            java.lang.String r3 = "not found"
            if (r0 == 0) goto L_0x043c
            r2.put(r1, r3)
            goto L_0x044b
        L_0x043c:
            java.lang.Float r0 = com.apm.insight.p023l.C1312r.m1879a((java.util.Map<? super java.lang.String, java.lang.Float>) r6)
            float r0 = r0.floatValue()
            java.lang.String r0 = m1262b((float) r0)
            r2.put(r1, r0)
        L_0x044b:
            boolean r0 = r27.isEmpty()
            java.lang.String r1 = "npth_anr_kswapd_total"
            if (r0 == 0) goto L_0x0457
            r2.put(r1, r3)
            goto L_0x0466
        L_0x0457:
            java.lang.Float r0 = com.apm.insight.p023l.C1312r.m1879a((java.util.Map<? super java.lang.String, java.lang.Float>) r27)
            float r0 = r0.floatValue()
            java.lang.String r0 = m1262b((float) r0)
            r2.put(r1, r0)
        L_0x0466:
            boolean r0 = r26.isEmpty()
            java.lang.String r1 = "npth_anr_dex2oat_total"
            if (r0 == 0) goto L_0x0472
            r2.put(r1, r3)
            goto L_0x0481
        L_0x0472:
            java.lang.Float r0 = com.apm.insight.p023l.C1312r.m1879a((java.util.Map<? super java.lang.String, java.lang.Float>) r26)
            float r0 = r0.floatValue()
            java.lang.String r0 = m1262b((float) r0)
            r2.put(r1, r0)
        L_0x0481:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apm.insight.p011b.C1178b.m1256a(java.lang.String, org.json.JSONObject):void");
    }

    /* renamed from: a */
    private static void m1257a(HashMap<String, Float> hashMap, JSONObject jSONObject, String str) {
        String str2;
        String a;
        String str3 = "npth_anr_" + str;
        if (hashMap.isEmpty()) {
            str2 = str3 + "_total";
            a = "not found";
        } else {
            float f = 0.0f;
            float f2 = 0.0f;
            float f3 = 0.0f;
            float f4 = 0.0f;
            float f5 = 0.0f;
            for (Map.Entry next : hashMap.entrySet()) {
                String str4 = (String) next.getKey();
                if (str4.endsWith("user")) {
                    f += ((Float) next.getValue()).floatValue();
                } else if (str4.endsWith("kernel")) {
                    f2 += ((Float) next.getValue()).floatValue();
                } else if (str4.endsWith("iowait")) {
                    f3 += ((Float) next.getValue()).floatValue();
                } else if (str4.endsWith("irq")) {
                    f4 += ((Float) next.getValue()).floatValue();
                } else if (str4.endsWith("softirq")) {
                    f5 += ((Float) next.getValue()).floatValue();
                }
            }
            float f6 = f + f2 + f3 + f4 + f5;
            jSONObject.put(str3 + "_total", m1262b(f6));
            jSONObject.put(str3 + "_kernel_user_ratio", m1254a(f2, f6));
            str2 = str3 + "_iowait_user_ratio";
            a = m1254a(f3, f6);
        }
        jSONObject.put(str2, a);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0194, code lost:
        if (android.text.TextUtils.isEmpty(r0) != false) goto L_0x01b0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0127  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x015c  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0180  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0187  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m1258a(org.json.JSONArray r17) {
        /*
            r16 = this;
            r1 = r16
            r2 = r17
            if (r2 != 0) goto L_0x0007
            return
        L_0x0007:
            r3 = 0
            r1.f944j = r3
            r1.f951q = r3
            r4 = 0
            r1.f952r = r4
            org.json.JSONArray r5 = new org.json.JSONArray
            r5.<init>()
            org.json.JSONArray r6 = new org.json.JSONArray
            r6.<init>()
            org.json.JSONArray r0 = new org.json.JSONArray
            r0.<init>()
            java.lang.String r7 = "unknown"
            r1.f946l = r7
            r1.f947m = r7
            r1.f948n = r7
            r7 = 3
            int[] r7 = new int[r7]
            r7 = {0, 0, 0} // fill-array
            r8 = r0
            r0 = r3
            r9 = r4
            r10 = r9
        L_0x0030:
            int r11 = r17.length()
            if (r9 >= r11) goto L_0x01b9
            java.lang.String r11 = r2.optString(r9)
            boolean r12 = android.text.TextUtils.isEmpty(r11)
            java.lang.String r13 = "NPTH_CATCH"
            r14 = 40
            java.lang.String r15 = "main"
            r3 = 1
            if (r12 == 0) goto L_0x00ca
            int r11 = r8.length()
            if (r11 <= 0) goto L_0x00bb
            boolean r11 = android.text.TextUtils.isEmpty(r0)
            if (r11 != 0) goto L_0x00bb
            org.json.JSONObject r11 = r1.f944j
            if (r11 != 0) goto L_0x0064
            boolean r11 = r15.equals(r0)
            if (r11 == 0) goto L_0x0064
            org.json.JSONObject r11 = r1.m1267c((org.json.JSONArray) r8)
            r1.f944j = r11
            goto L_0x006b
        L_0x0064:
            org.json.JSONObject r11 = r1.m1255a((java.lang.String) r0, (org.json.JSONArray) r8)
            r5.put(r11)
        L_0x006b:
            boolean r11 = r15.equals(r0)     // Catch:{ all -> 0x007d }
            if (r11 != 0) goto L_0x007d
            int r11 = r0.indexOf(r14)     // Catch:{ all -> 0x007d }
            java.lang.String r11 = r0.substring(r4, r11)     // Catch:{ all -> 0x007d }
            java.lang.String r0 = r11.trim()     // Catch:{ all -> 0x007d }
        L_0x007d:
            r11 = r0
            boolean r0 = r1.m1261a((java.lang.String) r11)
            if (r0 != 0) goto L_0x00bb
            int[] r0 = r1.m1265b((org.json.JSONArray) r8)     // Catch:{ IllegalArgumentException -> 0x0089, all -> 0x0092 }
            goto L_0x0093
        L_0x0089:
            r0 = move-exception
            r12 = r0
            com.apm.insight.c r0 = com.apm.insight.C1176b.m1249a()
            r0.mo12218a((java.lang.String) r13, (java.lang.Throwable) r12)
        L_0x0092:
            r0 = 0
        L_0x0093:
            if (r0 != 0) goto L_0x0096
            goto L_0x00bb
        L_0x0096:
            r12 = r0[r4]
            r13 = r7[r4]
            if (r12 <= r13) goto L_0x00a2
            r12 = r0[r4]
            r7[r4] = r12
            r1.f946l = r11
        L_0x00a2:
            r12 = r0[r3]
            r13 = r7[r3]
            if (r12 <= r13) goto L_0x00ae
            r12 = r0[r3]
            r7[r3] = r12
            r1.f947m = r11
        L_0x00ae:
            r3 = 2
            r12 = r0[r3]
            r13 = r7[r3]
            if (r12 <= r13) goto L_0x00bb
            r0 = r0[r3]
            r7[r3] = r0
            r1.f948n = r11
        L_0x00bb:
            int r0 = r8.length()
            if (r0 <= 0) goto L_0x00c7
            org.json.JSONArray r0 = new org.json.JSONArray
            r0.<init>()
            r8 = r0
        L_0x00c7:
            r0 = 0
            goto L_0x01b3
        L_0x00ca:
            if (r10 == 0) goto L_0x0197
            if (r10 == r3) goto L_0x00d0
            goto L_0x01b3
        L_0x00d0:
            java.lang.String r12 = " prio="
            boolean r12 = r11.contains(r12)
            if (r12 == 0) goto L_0x0190
            int r12 = r8.length()
            if (r12 <= 0) goto L_0x014c
            boolean r12 = android.text.TextUtils.isEmpty(r0)
            if (r12 != 0) goto L_0x014c
            org.json.JSONObject r12 = r1.f944j
            if (r12 != 0) goto L_0x00f5
            boolean r12 = r15.equals(r0)
            if (r12 == 0) goto L_0x00f5
            org.json.JSONObject r12 = r1.m1267c((org.json.JSONArray) r8)
            r1.f944j = r12
            goto L_0x00fc
        L_0x00f5:
            org.json.JSONObject r12 = r1.m1255a((java.lang.String) r0, (org.json.JSONArray) r8)
            r5.put(r12)
        L_0x00fc:
            boolean r12 = r15.equals(r0)     // Catch:{ all -> 0x010e }
            if (r12 != 0) goto L_0x010e
            int r12 = r0.indexOf(r14)     // Catch:{ all -> 0x010e }
            java.lang.String r12 = r0.substring(r4, r12)     // Catch:{ all -> 0x010e }
            java.lang.String r0 = r12.trim()     // Catch:{ all -> 0x010e }
        L_0x010e:
            r12 = r0
            boolean r0 = r1.m1261a((java.lang.String) r12)
            if (r0 != 0) goto L_0x014c
            int[] r0 = r1.m1265b((org.json.JSONArray) r8)     // Catch:{ IllegalArgumentException -> 0x011a, all -> 0x0123 }
            goto L_0x0124
        L_0x011a:
            r0 = move-exception
            r14 = r0
            com.apm.insight.c r0 = com.apm.insight.C1176b.m1249a()
            r0.mo12218a((java.lang.String) r13, (java.lang.Throwable) r14)
        L_0x0123:
            r0 = 0
        L_0x0124:
            if (r0 != 0) goto L_0x0127
            goto L_0x014c
        L_0x0127:
            r13 = r0[r4]
            r14 = r7[r4]
            if (r13 <= r14) goto L_0x0133
            r13 = r0[r4]
            r7[r4] = r13
            r1.f946l = r12
        L_0x0133:
            r13 = r0[r3]
            r14 = r7[r3]
            if (r13 <= r14) goto L_0x013f
            r13 = r0[r3]
            r7[r3] = r13
            r1.f947m = r12
        L_0x013f:
            r13 = 2
            r14 = r0[r13]
            r4 = r7[r13]
            if (r14 <= r4) goto L_0x014c
            r0 = r0[r13]
            r7[r13] = r0
            r1.f948n = r12
        L_0x014c:
            r0 = 34
            int r4 = r11.indexOf(r0, r3)
            java.lang.String r4 = r11.substring(r3, r4)
            boolean r12 = r15.equals(r4)
            if (r12 != 0) goto L_0x0180
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r4)
            java.lang.String r4 = "  ("
            r12.append(r4)
            r4 = 2
            int r0 = r11.indexOf(r0, r4)
            int r0 = r0 + r3
            java.lang.String r0 = r11.substring(r0)
            r12.append(r0)
            java.lang.String r0 = " )"
            r12.append(r0)
            java.lang.String r0 = r12.toString()
            goto L_0x0181
        L_0x0180:
            r0 = r4
        L_0x0181:
            int r3 = r8.length()
            if (r3 <= 0) goto L_0x018c
            org.json.JSONArray r8 = new org.json.JSONArray
            r8.<init>()
        L_0x018c:
            r8.put(r11)
            goto L_0x01b3
        L_0x0190:
            boolean r3 = android.text.TextUtils.isEmpty(r0)
            if (r3 == 0) goto L_0x018c
            goto L_0x01b0
        L_0x0197:
            java.lang.String r4 = "DALVIK THREADS"
            boolean r4 = r11.startsWith(r4)
            if (r4 != 0) goto L_0x01af
            java.lang.String r4 = "suspend"
            boolean r4 = r11.startsWith(r4)
            if (r4 != 0) goto L_0x01af
            java.lang.String r4 = "\""
            boolean r4 = r11.startsWith(r4)
            if (r4 == 0) goto L_0x01b0
        L_0x01af:
            r10 = r3
        L_0x01b0:
            r6.put(r11)
        L_0x01b3:
            int r9 = r9 + 1
            r3 = 0
            r4 = 0
            goto L_0x0030
        L_0x01b9:
            int r0 = r5.length()
            if (r0 <= 0) goto L_0x01dd
            r1.f950p = r6
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ JSONException -> 0x01d9 }
            r0.<init>()     // Catch:{ JSONException -> 0x01d9 }
            r1.f951q = r0     // Catch:{ JSONException -> 0x01d9 }
            java.lang.String r2 = "thread_all_count"
            int r3 = r5.length()     // Catch:{ JSONException -> 0x01d9 }
            r0.put(r2, r3)     // Catch:{ JSONException -> 0x01d9 }
            org.json.JSONObject r0 = r1.f951q     // Catch:{ JSONException -> 0x01d9 }
            java.lang.String r2 = "thread_stacks"
            r0.put(r2, r5)     // Catch:{ JSONException -> 0x01d9 }
            goto L_0x01dd
        L_0x01d9:
            r0 = move-exception
            r0.printStackTrace()
        L_0x01dd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apm.insight.p011b.C1178b.m1258a(org.json.JSONArray):void");
    }

    /* renamed from: a */
    private boolean m1259a(long j) {
        if (this.f959y) {
            this.f959y = false;
            m1263b(j);
        }
        return false;
    }

    /* renamed from: a */
    private boolean m1261a(String str) {
        if (this.f935D == null) {
            JSONArray c = C1341a.m2045c();
            if (c != null) {
                this.f935D = new LinkedList();
                this.f949o = c.optString(0);
                for (int i = 1; i < c.length(); i++) {
                    try {
                        this.f935D.add(Pattern.compile(c.optString(i)));
                    } catch (Throwable unused) {
                    }
                }
            }
            if (this.f935D == null) {
                LinkedList linkedList = new LinkedList();
                this.f935D = linkedList;
                linkedList.add(Pattern.compile("^main$"));
                this.f935D.add(Pattern.compile("^default_npth_thread$"));
                this.f935D.add(Pattern.compile("^RenderThread$"));
                this.f935D.add(Pattern.compile("^Jit thread pool worker thread.*$"));
            }
        }
        for (Pattern matcher : this.f935D) {
            if (matcher.matcher(str).matches()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    private static String m1262b(float f) {
        return m1253a(f / 100.0f);
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x005b */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x005f A[Catch:{ IOException -> 0x00df, all -> 0x00d7, all -> 0x00ea }] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x00e3 A[Catch:{ IOException -> 0x00df, all -> 0x00d7, all -> 0x00ea }] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m1263b(long r13) {
        /*
            r12 = this;
            long r0 = r12.f932A
            long r2 = r12.f960z
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            java.lang.String r1 = "anr_trace"
            java.lang.String r2 = "\n"
            java.lang.String r3 = ".txt"
            r4 = 95
            r5 = 58
            r6 = 21
            r7 = 0
            r8 = 1
            java.lang.String r9 = "NPTH_CATCH"
            if (r0 == 0) goto L_0x00f7
            long r10 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x005b }
            r12.f953s = r10     // Catch:{ all -> 0x005b }
            com.apm.insight.b.h r0 = com.apm.insight.p011b.C1187g.m1300b()     // Catch:{ all -> 0x005b }
            org.json.JSONArray r0 = r0.mo12202c()     // Catch:{ all -> 0x005b }
            r12.f955u = r0     // Catch:{ all -> 0x005b }
            r0 = 100
            org.json.JSONArray r0 = com.apm.insight.p011b.C1204k.m1351a((int) r0, (long) r13)     // Catch:{ all -> 0x005b }
            r12.f954t = r0     // Catch:{ all -> 0x005b }
            com.apm.insight.b.h r0 = com.apm.insight.p011b.C1187g.m1300b()     // Catch:{ all -> 0x005b }
            com.apm.insight.b.h$e r13 = r0.mo12199a((long) r13)     // Catch:{ all -> 0x005b }
            org.json.JSONObject r13 = r13.mo12207a()     // Catch:{ all -> 0x005b }
            r12.f945k = r13     // Catch:{ all -> 0x005b }
            org.json.JSONObject r13 = new org.json.JSONObject     // Catch:{ all -> 0x005b }
            r13.<init>()     // Catch:{ all -> 0x005b }
            r12.f956v = r13     // Catch:{ all -> 0x005b }
            android.content.Context r14 = r12.f939d     // Catch:{ all -> 0x005b }
            com.apm.insight.p023l.C1285a.m1718a((android.content.Context) r14, (org.json.JSONObject) r13)     // Catch:{ all -> 0x005b }
            boolean r13 = r12.m1268g()     // Catch:{ all -> 0x005b }
            r12.f957w = r13     // Catch:{ all -> 0x005b }
            boolean r13 = com.apm.insight.Npth.hasCrash()     // Catch:{ all -> 0x005b }
            if (r13 != 0) goto L_0x0058
            r13 = r8
            goto L_0x0059
        L_0x0058:
            r13 = r7
        L_0x0059:
            r12.f943i = r13     // Catch:{ all -> 0x005b }
        L_0x005b:
            int r13 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x00ea }
            if (r13 < r6) goto L_0x00df
            long r13 = r12.f953s     // Catch:{ all -> 0x00ea }
            r12.f941g = r13     // Catch:{ all -> 0x00ea }
            java.lang.String r13 = com.apm.insight.p023l.C1308o.m1838b()     // Catch:{ all -> 0x00ea }
            java.io.File r14 = new java.io.File     // Catch:{ all -> 0x00ea }
            java.io.File r0 = new java.io.File     // Catch:{ all -> 0x00ea }
            android.content.Context r6 = r12.f939d     // Catch:{ all -> 0x00ea }
            java.io.File r6 = com.apm.insight.p023l.C1308o.m1849f((android.content.Context) r6)     // Catch:{ all -> 0x00ea }
            r0.<init>(r6, r13)     // Catch:{ all -> 0x00ea }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ea }
            r6.<init>()     // Catch:{ all -> 0x00ea }
            java.lang.String r10 = "trace_"
            r6.append(r10)     // Catch:{ all -> 0x00ea }
            android.content.Context r10 = r12.f939d     // Catch:{ all -> 0x00ea }
            java.lang.String r10 = com.apm.insight.p023l.C1285a.m1725c(r10)     // Catch:{ all -> 0x00ea }
            java.lang.String r4 = r10.replace(r5, r4)     // Catch:{ all -> 0x00ea }
            r6.append(r4)     // Catch:{ all -> 0x00ea }
            r6.append(r3)     // Catch:{ all -> 0x00ea }
            java.lang.String r3 = r6.toString()     // Catch:{ all -> 0x00ea }
            r14.<init>(r0, r3)     // Catch:{ all -> 0x00ea }
            java.io.File r0 = r14.getParentFile()     // Catch:{ all -> 0x00ea }
            r0.mkdirs()     // Catch:{ all -> 0x00ea }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ea }
            r0.<init>()     // Catch:{ all -> 0x00ea }
            java.text.DateFormat r3 = com.apm.insight.p023l.C1286b.m1730a()     // Catch:{ all -> 0x00ea }
            java.util.Date r4 = new java.util.Date     // Catch:{ all -> 0x00ea }
            long r5 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x00ea }
            r4.<init>(r5)     // Catch:{ all -> 0x00ea }
            java.lang.String r3 = r3.format(r4)     // Catch:{ all -> 0x00ea }
            r0.append(r3)     // Catch:{ all -> 0x00ea }
            r0.append(r2)     // Catch:{ all -> 0x00ea }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x00ea }
            com.apm.insight.p023l.C1298i.m1769a((java.io.File) r14, (java.lang.String) r0, (boolean) r7)     // Catch:{ all -> 0x00ea }
            com.apm.insight.runtime.C1387r.m2274a((java.lang.String) r1, (java.lang.String) r13)     // Catch:{ all -> 0x00ea }
            java.lang.String r13 = r14.getAbsolutePath()     // Catch:{ all -> 0x00ea }
            com.apm.insight.nativecrash.NativeImpl.m1973i(r13)     // Catch:{ all -> 0x00ea }
            java.lang.String r13 = r14.getAbsolutePath()     // Catch:{ IOException -> 0x00df, all -> 0x00d7 }
            org.json.JSONArray r13 = com.apm.insight.p023l.C1298i.m1780b((java.lang.String) r13)     // Catch:{ IOException -> 0x00df, all -> 0x00d7 }
            r12.f950p = r13     // Catch:{ IOException -> 0x00df, all -> 0x00d7 }
            r12.m1258a((org.json.JSONArray) r13)     // Catch:{ IOException -> 0x00df, all -> 0x00d7 }
            goto L_0x00df
        L_0x00d7:
            r13 = move-exception
            com.apm.insight.c r14 = com.apm.insight.C1176b.m1249a()     // Catch:{ all -> 0x00ea }
            r14.mo12218a((java.lang.String) r9, (java.lang.Throwable) r13)     // Catch:{ all -> 0x00ea }
        L_0x00df:
            org.json.JSONObject r13 = r12.f944j     // Catch:{ all -> 0x00ea }
            if (r13 != 0) goto L_0x00f2
            org.json.JSONObject r13 = com.apm.insight.p011b.C1183d.m1289a((boolean) r8)     // Catch:{ all -> 0x00ea }
            r12.f944j = r13     // Catch:{ all -> 0x00ea }
            goto L_0x00f2
        L_0x00ea:
            r13 = move-exception
            com.apm.insight.c r14 = com.apm.insight.C1176b.m1249a()
            r14.mo12218a((java.lang.String) r9, (java.lang.Throwable) r13)
        L_0x00f2:
            com.apm.insight.p023l.C1295f.m1752a()
            goto L_0x018e
        L_0x00f7:
            long r13 = r12.f953s     // Catch:{ all -> 0x0186 }
            r12.f941g = r13     // Catch:{ all -> 0x0186 }
            int r13 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x0186 }
            if (r13 < r6) goto L_0x017b
            java.lang.String r13 = com.apm.insight.p023l.C1308o.m1838b()     // Catch:{ all -> 0x0186 }
            java.io.File r14 = new java.io.File     // Catch:{ all -> 0x0186 }
            java.io.File r0 = new java.io.File     // Catch:{ all -> 0x0186 }
            android.content.Context r6 = r12.f939d     // Catch:{ all -> 0x0186 }
            java.io.File r6 = com.apm.insight.p023l.C1308o.m1849f((android.content.Context) r6)     // Catch:{ all -> 0x0186 }
            r0.<init>(r6, r13)     // Catch:{ all -> 0x0186 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0186 }
            r6.<init>()     // Catch:{ all -> 0x0186 }
            java.lang.String r10 = "trace"
            r6.append(r10)     // Catch:{ all -> 0x0186 }
            android.content.Context r10 = r12.f939d     // Catch:{ all -> 0x0186 }
            java.lang.String r10 = com.apm.insight.p023l.C1285a.m1725c(r10)     // Catch:{ all -> 0x0186 }
            java.lang.String r4 = r10.replace(r5, r4)     // Catch:{ all -> 0x0186 }
            r6.append(r4)     // Catch:{ all -> 0x0186 }
            r6.append(r3)     // Catch:{ all -> 0x0186 }
            java.lang.String r3 = r6.toString()     // Catch:{ all -> 0x0186 }
            r14.<init>(r0, r3)     // Catch:{ all -> 0x0186 }
            java.io.File r0 = r14.getParentFile()     // Catch:{ all -> 0x0186 }
            r0.mkdirs()     // Catch:{ all -> 0x0186 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0186 }
            r0.<init>()     // Catch:{ all -> 0x0186 }
            java.text.DateFormat r3 = com.apm.insight.p023l.C1286b.m1730a()     // Catch:{ all -> 0x0186 }
            java.util.Date r4 = new java.util.Date     // Catch:{ all -> 0x0186 }
            long r5 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0186 }
            r4.<init>(r5)     // Catch:{ all -> 0x0186 }
            java.lang.String r3 = r3.format(r4)     // Catch:{ all -> 0x0186 }
            r0.append(r3)     // Catch:{ all -> 0x0186 }
            r0.append(r2)     // Catch:{ all -> 0x0186 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0186 }
            com.apm.insight.p023l.C1298i.m1769a((java.io.File) r14, (java.lang.String) r0, (boolean) r7)     // Catch:{ all -> 0x0186 }
            com.apm.insight.runtime.C1387r.m2274a((java.lang.String) r1, (java.lang.String) r13)     // Catch:{ all -> 0x0186 }
            java.lang.String r13 = r14.getAbsolutePath()     // Catch:{ all -> 0x0186 }
            com.apm.insight.nativecrash.NativeImpl.m1973i(r13)     // Catch:{ all -> 0x0186 }
            java.lang.String r13 = r14.getAbsolutePath()     // Catch:{ IOException -> 0x017b, all -> 0x0173 }
            org.json.JSONArray r13 = com.apm.insight.p023l.C1298i.m1780b((java.lang.String) r13)     // Catch:{ IOException -> 0x017b, all -> 0x0173 }
            r12.f950p = r13     // Catch:{ IOException -> 0x017b, all -> 0x0173 }
            r12.m1258a((org.json.JSONArray) r13)     // Catch:{ IOException -> 0x017b, all -> 0x0173 }
            goto L_0x017b
        L_0x0173:
            r13 = move-exception
            com.apm.insight.c r14 = com.apm.insight.C1176b.m1249a()     // Catch:{ all -> 0x0186 }
            r14.mo12218a((java.lang.String) r9, (java.lang.Throwable) r13)     // Catch:{ all -> 0x0186 }
        L_0x017b:
            org.json.JSONObject r13 = r12.f944j     // Catch:{ all -> 0x0186 }
            if (r13 != 0) goto L_0x018e
            org.json.JSONObject r13 = com.apm.insight.p011b.C1183d.m1289a((boolean) r8)     // Catch:{ all -> 0x0186 }
            r12.f944j = r13     // Catch:{ all -> 0x0186 }
            goto L_0x018e
        L_0x0186:
            r13 = move-exception
            com.apm.insight.c r14 = com.apm.insight.C1176b.m1249a()
            r14.mo12218a((java.lang.String) r9, (java.lang.Throwable) r13)
        L_0x018e:
            long r13 = r12.f960z
            r12.f932A = r13
            r0 = -1
            r12.f960z = r0
            int r13 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r13 != 0) goto L_0x019f
            r13 = 1
            long r0 = r0 - r13
            r12.f932A = r0
        L_0x019f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apm.insight.p011b.C1178b.m1263b(long):void");
    }

    /* renamed from: b */
    private static void m1264b(String str) {
        for (ICrashCallback onCrash : C1379o.m2222a().mo12488e()) {
            try {
                onCrash.onCrash(CrashType.ANR, str, (Thread) null);
            } catch (Throwable th) {
                C1176b.m1249a().mo12218a("NPTH_CATCH", th);
            }
        }
    }

    /* renamed from: b */
    private int[] m1265b(JSONArray jSONArray) {
        int i = 0;
        while (i < jSONArray.length()) {
            String optString = jSONArray.optString(i);
            int indexOf = (optString == null || optString.isEmpty()) ? -1 : optString.indexOf("utm=");
            if (indexOf > 0) {
                if (this.f937b == null) {
                    this.f937b = Pattern.compile("[^0-9]+");
                }
                String[] split = this.f937b.split(optString.substring(indexOf));
                if (split == null || split.length < 2) {
                    return null;
                }
                try {
                    int intValue = Integer.decode(split[1]).intValue();
                    int intValue2 = Integer.decode(split[2]).intValue();
                    return new int[]{intValue, intValue2, intValue + intValue2};
                } catch (Throwable unused) {
                    throw new IllegalArgumentException("Err stack line: " + optString);
                }
            } else {
                i++;
            }
        }
        return null;
    }

    /* renamed from: c */
    private String m1266c(long j) {
        long j2 = j - C1240h.m1561j();
        return j2 < 30000 ? "0 - 30s" : j2 < 60000 ? "30s - 1min" : j2 < 120000 ? "1min - 2min" : j2 < 300000 ? "2min - 5min" : j2 < 600000 ? "5min - 10min" : j2 < TapjoyConstants.SESSION_ID_INACTIVITY_TIME ? "10min - 30min" : j2 < 3600000 ? "30min - 1h" : "1h - ";
    }

    /* renamed from: c */
    private JSONObject m1267c(JSONArray jSONArray) {
        JSONObject jSONObject = new JSONObject();
        JSONArray a = C1301l.m1799a(256, 128, jSONArray);
        if (a.length() != jSONArray.length()) {
            this.f952r++;
        }
        try {
            jSONObject.put("thread_number", 1);
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < a.length(); i++) {
                sb.append(a.getString(i));
                sb.append(10);
            }
            jSONObject.put("mainStackFromTrace", sb.toString());
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    /* renamed from: g */
    private boolean m1268g() {
        boolean z = !C1285a.m1722a(this.f939d);
        if (!z || C1343b.m2080d().mo12449e() > 2000) {
            return z;
        }
        return false;
    }

    /* renamed from: h */
    private File m1269h() {
        if (this.f936E == null) {
            File filesDir = this.f939d.getFilesDir();
            this.f936E = new File(filesDir, "has_anr_signal_" + C1285a.m1725c(this.f939d).replaceAll(CertificateUtil.DELIMITER, "_"));
        }
        return this.f936E;
    }

    /* renamed from: i */
    private boolean m1270i() {
        return C1341a.m2052i();
    }

    /* renamed from: a */
    public void mo12180a() {
        if (!this.f940e) {
            this.f938c = new C1181c(this);
            this.f941g = C1240h.m1561j();
            this.f940e = true;
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:155:0x0445 */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x03ee A[SYNTHETIC, Splitter:B:145:0x03ee] */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x0417 A[Catch:{ all -> 0x0494 }] */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x046c A[Catch:{ all -> 0x0478 }] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x009b  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo12181a(int r26, int r27) {
        /*
            r25 = this;
            r1 = r25
            boolean r0 = com.apm.insight.p011b.C1186f.m1297a()
            long r2 = android.os.SystemClock.uptimeMillis()
            boolean r4 = r1.m1259a((long) r2)
            android.content.Context r5 = r1.f939d
            r6 = 1
            java.lang.String r5 = com.apm.insight.p011b.C1183d.m1287a((android.content.Context) r5, (int) r6)
            long r7 = java.lang.System.currentTimeMillis()
            java.lang.String r9 = "normal"
            boolean r10 = android.text.TextUtils.isEmpty(r5)
            r11 = 0
            if (r10 == 0) goto L_0x0026
            if (r4 == 0) goto L_0x0026
            r10 = r6
            goto L_0x0027
        L_0x0026:
            r10 = r11
        L_0x0027:
            java.lang.String r12 = "unknown"
            java.lang.String r13 = "unknown"
            java.lang.String r14 = "unknown"
            r15 = 20000(0x4e20, double:9.8813E-320)
            if (r4 != 0) goto L_0x004b
            boolean r4 = android.text.TextUtils.isEmpty(r5)
            if (r4 != 0) goto L_0x0038
            goto L_0x004b
        L_0x0038:
            r23 = r11
            r6 = r14
            r4 = 0
            r15 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r14 = r13
            r11 = 0
            r13 = r12
            r12 = r9
            r9 = r23
            goto L_0x00c2
        L_0x004b:
            java.lang.Object r4 = r1.f958x
            monitor-enter(r4)
            if (r10 != 0) goto L_0x0052
            r7 = 1
            goto L_0x0053
        L_0x0052:
            r7 = r11
        L_0x0053:
            monitor-exit(r4)     // Catch:{ all -> 0x049f }
            org.json.JSONObject r4 = r1.f944j
            if (r4 == 0) goto L_0x006d
            long r12 = java.lang.System.currentTimeMillis()
            r8 = r7
            long r6 = r1.f941g
            long r12 = r12 - r6
            int r4 = (r12 > r15 ? 1 : (r12 == r15 ? 0 : -1))
            if (r4 > 0) goto L_0x006e
            if (r10 == 0) goto L_0x0069
            java.lang.String r4 = "trace_only"
            goto L_0x006b
        L_0x0069:
            java.lang.String r4 = "trace_last"
        L_0x006b:
            r9 = r4
            goto L_0x0079
        L_0x006d:
            r8 = r7
        L_0x006e:
            boolean r4 = r1.f959y
            if (r4 == 0) goto L_0x0076
            r1.f959y = r11
            java.lang.String r9 = "trace_after"
        L_0x0076:
            r1.m1263b((long) r2)
        L_0x0079:
            org.json.JSONObject r4 = r1.f944j
            java.lang.String r12 = r1.f946l
            java.lang.String r13 = r1.f947m
            java.lang.String r14 = r1.f948n
            org.json.JSONArray r6 = r1.f950p
            org.json.JSONArray r7 = r1.f955u
            org.json.JSONArray r15 = r1.f954t
            org.json.JSONObject r11 = r1.f956v
            r19 = r4
            org.json.JSONObject r4 = r1.f945k
            r20 = r4
            boolean r4 = r1.f957w
            r21 = r6
            r22 = r7
            long r6 = r1.f953s
            r23 = r4
            if (r10 != 0) goto L_0x00b5
            r4 = 0
            r1.f944j = r4
            r1.f950p = r4
            r1.f954t = r4
            r1.f945k = r4
            r1.f955u = r4
            java.lang.String r4 = "unknown"
            r1.f946l = r4
            java.lang.String r4 = "unknown"
            r1.f947m = r4
            java.lang.String r4 = "unknown"
            r1.f948n = r4
            r4 = 0
            r1.f952r = r4
        L_0x00b5:
            r4 = r21
            r21 = r22
            r24 = r9
            r9 = r8
            r7 = r6
            r6 = r14
            r14 = r13
            r13 = r12
            r12 = r24
        L_0x00c2:
            if (r10 != 0) goto L_0x0122
            boolean r22 = android.text.TextUtils.isEmpty(r5)
            if (r22 == 0) goto L_0x0122
            org.json.JSONObject r0 = r1.f944j
            if (r0 == 0) goto L_0x0100
            long r2 = java.lang.System.currentTimeMillis()
            long r4 = r1.f941g
            long r2 = r2 - r4
            r4 = 20000(0x4e20, double:9.8813E-320)
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x0100
            r2 = 0
            r1.f944j = r2
            r1.f950p = r2
            r1.f954t = r2
            r1.f945k = r2
            r1.f955u = r2
            java.lang.String r0 = "unknown"
            r1.f946l = r0
            java.lang.String r0 = "unknown"
            r1.f947m = r0
            java.lang.String r0 = "unknown"
            r1.f948n = r0
            r2 = 0
            r1.f952r = r2
            java.io.File r0 = r1.f942h
            if (r0 == 0) goto L_0x00fc
            com.apm.insight.p023l.C1298i.m1777a((java.io.File) r0)
        L_0x00fc:
            r3 = 0
            r1.f942h = r3
            return r2
        L_0x0100:
            org.json.JSONObject r0 = r1.f944j
            if (r0 == 0) goto L_0x0120
            long r2 = java.lang.System.currentTimeMillis()
            long r4 = r1.f941g
            long r2 = r2 - r4
            r4 = 2000(0x7d0, double:9.88E-321)
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x0120
            boolean r0 = com.apm.insight.nativecrash.NativeImpl.m1969g()
            if (r0 == 0) goto L_0x011e
            java.io.File r0 = r25.m1269h()
            com.apm.insight.p023l.C1298i.m1777a((java.io.File) r0)
        L_0x011e:
            r2 = 0
            return r2
        L_0x0120:
            r2 = 0
            return r2
        L_0x0122:
            if (r19 != 0) goto L_0x016b
            if (r15 != 0) goto L_0x0158
            com.apm.insight.b.h r17 = com.apm.insight.p011b.C1187g.m1300b()     // Catch:{ all -> 0x0153 }
            org.json.JSONArray r17 = r17.mo12202c()     // Catch:{ all -> 0x0153 }
            r18 = r11
            r11 = 100
            org.json.JSONArray r15 = com.apm.insight.p011b.C1204k.m1351a((int) r11, (long) r2)     // Catch:{ all -> 0x0150 }
            com.apm.insight.b.h r11 = com.apm.insight.p011b.C1187g.m1300b()     // Catch:{ all -> 0x0150 }
            com.apm.insight.b.h$e r2 = r11.mo12199a((long) r2)     // Catch:{ all -> 0x0150 }
            org.json.JSONObject r20 = r2.mo12207a()     // Catch:{ all -> 0x0150 }
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ all -> 0x0150 }
            r2.<init>()     // Catch:{ all -> 0x0150 }
            android.content.Context r3 = r1.f939d     // Catch:{ all -> 0x014e }
            com.apm.insight.p023l.C1285a.m1718a((android.content.Context) r3, (org.json.JSONObject) r2)     // Catch:{ all -> 0x014e }
            r11 = r2
            goto L_0x015c
        L_0x014e:
            r11 = r2
            goto L_0x0162
        L_0x0150:
            r11 = r18
            goto L_0x0162
        L_0x0153:
            r18 = r11
            r17 = r21
            goto L_0x0162
        L_0x0158:
            r18 = r11
            r17 = r21
        L_0x015c:
            boolean r2 = f930a     // Catch:{ all -> 0x0162 }
            org.json.JSONObject r19 = com.apm.insight.p011b.C1183d.m1289a((boolean) r2)     // Catch:{ all -> 0x0162 }
        L_0x0162:
            r2 = r17
            r3 = r19
            r17 = r9
            r9 = r20
            goto L_0x0175
        L_0x016b:
            r18 = r11
            r17 = r9
            r3 = r19
            r9 = r20
            r2 = r21
        L_0x0175:
            if (r3 == 0) goto L_0x049e
            int r18 = r3.length()
            if (r18 <= 0) goto L_0x049e
            r18 = r5
            java.lang.String r5 = "pid"
            r19 = r0
            int r0 = android.os.Process.myPid()     // Catch:{ all -> 0x0494 }
            r3.put(r5, r0)     // Catch:{ all -> 0x0494 }
            java.lang.String r0 = "package"
            android.content.Context r5 = r1.f939d     // Catch:{ all -> 0x0494 }
            java.lang.String r5 = r5.getPackageName()     // Catch:{ all -> 0x0494 }
            r3.put(r0, r5)     // Catch:{ all -> 0x0494 }
            java.lang.String r0 = "is_remote_process"
            r5 = 0
            r3.put(r0, r5)     // Catch:{ all -> 0x0494 }
            java.lang.String r0 = "is_new_stack"
            r5 = 10
            r3.put(r0, r5)     // Catch:{ all -> 0x0494 }
            com.apm.insight.entity.a r0 = new com.apm.insight.entity.a     // Catch:{ all -> 0x0494 }
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch:{ all -> 0x0494 }
            r5.<init>()     // Catch:{ all -> 0x0494 }
            r0.<init>(r5)     // Catch:{ all -> 0x0494 }
            java.lang.String r5 = "data"
            r20 = r6
            java.lang.String r6 = r3.toString()     // Catch:{ all -> 0x0494 }
            r0.mo12251a((java.lang.String) r5, (java.lang.Object) r6)     // Catch:{ all -> 0x0494 }
            java.lang.String r5 = "is_anr"
            r26 = r3
            r6 = 1
            java.lang.Integer r3 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x0494 }
            r0.mo12251a((java.lang.String) r5, (java.lang.Object) r3)     // Catch:{ all -> 0x0494 }
            java.lang.String r3 = "anrType"
            r0.mo12251a((java.lang.String) r3, (java.lang.Object) r12)     // Catch:{ all -> 0x0494 }
            java.lang.String r3 = "history_message"
            r0.mo12251a((java.lang.String) r3, (java.lang.Object) r2)     // Catch:{ all -> 0x0494 }
            java.lang.String r2 = "current_message"
            r0.mo12251a((java.lang.String) r2, (java.lang.Object) r9)     // Catch:{ all -> 0x0494 }
            java.lang.String r2 = "pending_messages"
            r0.mo12251a((java.lang.String) r2, (java.lang.Object) r15)     // Catch:{ all -> 0x0494 }
            java.lang.String r2 = "anr_time"
            long r21 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0494 }
            java.lang.Long r3 = java.lang.Long.valueOf(r21)     // Catch:{ all -> 0x0494 }
            r0.mo12251a((java.lang.String) r2, (java.lang.Object) r3)     // Catch:{ all -> 0x0494 }
            java.lang.String r2 = "crash_time"
            java.lang.Long r3 = java.lang.Long.valueOf(r7)     // Catch:{ all -> 0x0494 }
            r0.mo12251a((java.lang.String) r2, (java.lang.Object) r3)     // Catch:{ all -> 0x0494 }
            com.apm.insight.p012c.C1207b.m1361b()     // Catch:{ all -> 0x0494 }
            r0.mo12259c((org.json.JSONObject) r11)     // Catch:{ all -> 0x0494 }
            java.lang.String r2 = "anr_info"
            if (r10 == 0) goto L_0x01fa
            java.lang.String r3 = "没有抓到ANR_INFO, 原因可能是:\n1. 用户以极快的手速在ANR弹窗出现时点击了关闭应用.\n2. 用户难以忍受卡顿而强行关闭了应用.\n3. 某无良系统在ANR时不给任何通知直接强杀应用进程组.\n\n该ANR只会在以下情况上报:\n1. 收到ANR信号(SIGQUIT).\n2. 应用处于前台或2秒前在前台.\n3. 主进程发生.\n4. 进程确实被杀."
            goto L_0x01fc
        L_0x01fa:
            r3 = r18
        L_0x01fc:
            r0.mo12251a((java.lang.String) r2, (java.lang.Object) r3)     // Catch:{ all -> 0x0494 }
            if (r4 == 0) goto L_0x0206
            java.lang.String r2 = "dump_trace"
            r0.mo12251a((java.lang.String) r2, (java.lang.Object) r4)     // Catch:{ all -> 0x0494 }
        L_0x0206:
            java.lang.String r2 = "all_thread_stacks"
            if (r10 != 0) goto L_0x021c
            org.json.JSONObject r3 = r1.f951q     // Catch:{ all -> 0x0494 }
            if (r3 == 0) goto L_0x0216
            org.json.JSONObject r3 = r1.f951q     // Catch:{ all -> 0x0494 }
            int r3 = r3.length()     // Catch:{ all -> 0x0494 }
            if (r3 != 0) goto L_0x021c
        L_0x0216:
            r3 = 0
            org.json.JSONObject r4 = com.apm.insight.p023l.C1316v.m1919b((java.lang.String) r3)     // Catch:{ all -> 0x0494 }
            goto L_0x021e
        L_0x021c:
            org.json.JSONObject r4 = r1.f951q     // Catch:{ all -> 0x0494 }
        L_0x021e:
            r0.mo12251a((java.lang.String) r2, (java.lang.Object) r4)     // Catch:{ all -> 0x0494 }
            com.apm.insight.runtime.a.f r2 = com.apm.insight.runtime.p024a.C1352f.m2138a()     // Catch:{ all -> 0x0494 }
            com.apm.insight.CrashType r3 = com.apm.insight.CrashType.ANR     // Catch:{ all -> 0x0494 }
            com.apm.insight.entity.a r2 = r2.mo12477a((com.apm.insight.CrashType) r3, (com.apm.insight.entity.C1217a) r0)     // Catch:{ all -> 0x0494 }
            java.lang.String r0 = "is_background"
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r23)     // Catch:{ all -> 0x0494 }
            r2.mo12251a((java.lang.String) r0, (java.lang.Object) r3)     // Catch:{ all -> 0x0494 }
            java.lang.String r0 = "logcat"
            java.lang.String r3 = com.apm.insight.C1240h.m1557f()     // Catch:{ all -> 0x0494 }
            org.json.JSONArray r3 = com.apm.insight.runtime.C1374k.m2204b(r3)     // Catch:{ all -> 0x0494 }
            r2.mo12251a((java.lang.String) r0, (java.lang.Object) r3)     // Catch:{ all -> 0x0494 }
            java.lang.String r0 = "has_dump"
            java.lang.String r3 = "true"
            r2.mo12251a((java.lang.String) r0, (java.lang.Object) r3)     // Catch:{ all -> 0x0494 }
            java.lang.String r0 = "crash_uuid"
            com.apm.insight.CrashType r3 = com.apm.insight.CrashType.ANR     // Catch:{ all -> 0x0494 }
            r4 = 0
            java.lang.String r3 = com.apm.insight.C1240h.m1543a(r7, r3, r4, r4)     // Catch:{ all -> 0x0494 }
            r2.mo12251a((java.lang.String) r0, (java.lang.Object) r3)     // Catch:{ all -> 0x0494 }
            java.lang.String r0 = "jiffy"
            long r3 = com.apm.insight.runtime.C1385q.C1386a.m2267a()     // Catch:{ all -> 0x0494 }
            java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch:{ all -> 0x0494 }
            r2.mo12251a((java.lang.String) r0, (java.lang.Object) r3)     // Catch:{ all -> 0x0494 }
            org.json.JSONObject r0 = r2.mo12265h()     // Catch:{ all -> 0x0494 }
            java.lang.String r3 = "filters"
            org.json.JSONObject r0 = r0.optJSONObject(r3)     // Catch:{ all -> 0x0494 }
            org.json.JSONObject r3 = r2.mo12265h()     // Catch:{ all -> 0x0494 }
            com.apm.insight.entity.C1221d.m1459b(r3)     // Catch:{ all -> 0x0494 }
            if (r0 != 0) goto L_0x0284
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ all -> 0x0280 }
            r3.<init>()     // Catch:{ all -> 0x0280 }
            java.lang.String r0 = "filters"
            r2.mo12251a((java.lang.String) r0, (java.lang.Object) r3)     // Catch:{ all -> 0x027f }
            goto L_0x0285
        L_0x027f:
            r0 = r3
        L_0x0280:
            r4 = r18
            goto L_0x03eb
        L_0x0284:
            r3 = r0
        L_0x0285:
            java.lang.String r0 = "anrType"
            r3.put(r0, r12)     // Catch:{ all -> 0x03e8 }
            java.lang.String r0 = "max_utm_thread"
            r3.put(r0, r13)     // Catch:{ all -> 0x03e8 }
            java.lang.String r0 = "max_stm_thread"
            r3.put(r0, r14)     // Catch:{ all -> 0x03e8 }
            java.lang.String r0 = "max_utm_stm_thread"
            r14 = r20
            r3.put(r0, r14)     // Catch:{ all -> 0x03e8 }
            java.lang.String r0 = "max_utm_thread_version"
            java.lang.String r4 = r1.f949o     // Catch:{ all -> 0x03e8 }
            r3.put(r0, r4)     // Catch:{ all -> 0x03e8 }
            java.lang.String r0 = "crash_length"
            java.lang.String r4 = r1.m1266c((long) r7)     // Catch:{ all -> 0x03e8 }
            r3.put(r0, r4)     // Catch:{ all -> 0x03e8 }
            java.lang.String r0 = "disable_looper_monitor"
            boolean r4 = com.apm.insight.runtime.C1341a.m2047d()     // Catch:{ all -> 0x03e8 }
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ all -> 0x03e8 }
            r3.put(r0, r4)     // Catch:{ all -> 0x03e8 }
            java.lang.String r0 = "npth_force_apm_crash"
            boolean r4 = com.apm.insight.p012c.C1207b.m1361b()     // Catch:{ all -> 0x03e8 }
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ all -> 0x03e8 }
            r3.put(r0, r4)     // Catch:{ all -> 0x03e8 }
            java.lang.String r0 = "sdk_version"
            java.lang.String r4 = "1.3.8.nourl-alpha.0"
            r3.put(r0, r4)     // Catch:{ all -> 0x03e8 }
            java.lang.String r0 = "has_logcat"
            boolean r4 = r2.mo12252a()     // Catch:{ all -> 0x03e8 }
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ all -> 0x03e8 }
            r3.put(r0, r4)     // Catch:{ all -> 0x03e8 }
            java.lang.String r0 = "memory_leak"
            boolean r4 = r2.mo12263f()     // Catch:{ all -> 0x03e8 }
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ all -> 0x03e8 }
            r3.put(r0, r4)     // Catch:{ all -> 0x03e8 }
            java.lang.String r0 = "fd_leak"
            boolean r4 = r2.mo12260d()     // Catch:{ all -> 0x03e8 }
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ all -> 0x03e8 }
            r3.put(r0, r4)     // Catch:{ all -> 0x03e8 }
            java.lang.String r0 = "threads_leak"
            boolean r4 = r2.mo12262e()     // Catch:{ all -> 0x03e8 }
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ all -> 0x03e8 }
            r3.put(r0, r4)     // Catch:{ all -> 0x03e8 }
            java.lang.String r0 = "is_64_devices"
            boolean r4 = com.apm.insight.entity.Header.m1386a()     // Catch:{ all -> 0x03e8 }
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ all -> 0x03e8 }
            r3.put(r0, r4)     // Catch:{ all -> 0x03e8 }
            java.lang.String r0 = "is_64_runtime"
            boolean r4 = com.apm.insight.nativecrash.NativeImpl.m1965e()     // Catch:{ all -> 0x03e8 }
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ all -> 0x03e8 }
            r3.put(r0, r4)     // Catch:{ all -> 0x03e8 }
            java.lang.String r0 = "is_x86_devices"
            boolean r4 = com.apm.insight.entity.Header.m1389b()     // Catch:{ all -> 0x03e8 }
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ all -> 0x03e8 }
            r3.put(r0, r4)     // Catch:{ all -> 0x03e8 }
            java.lang.String r0 = "has_meminfo_file"
            boolean r4 = r2.mo12264g()     // Catch:{ all -> 0x03e8 }
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ all -> 0x03e8 }
            r3.put(r0, r4)     // Catch:{ all -> 0x03e8 }
            java.lang.String r0 = "is_root"
            boolean r4 = com.apm.insight.nativecrash.C1323b.m1992m()     // Catch:{ all -> 0x03e8 }
            if (r4 == 0) goto L_0x033f
            java.lang.String r4 = "true"
            goto L_0x0341
        L_0x033f:
            java.lang.String r4 = "false"
        L_0x0341:
            r3.put(r0, r4)     // Catch:{ all -> 0x03e8 }
            java.lang.String r0 = "anr_normal_trace"
            boolean r4 = r1.f959y     // Catch:{ all -> 0x03e8 }
            if (r4 != 0) goto L_0x034b
            goto L_0x034c
        L_0x034b:
            r6 = 0
        L_0x034c:
            java.lang.String r4 = java.lang.String.valueOf(r6)     // Catch:{ all -> 0x03e8 }
            r3.put(r0, r4)     // Catch:{ all -> 0x03e8 }
            java.lang.String r0 = "anr_no_run"
            java.lang.String r4 = java.lang.String.valueOf(r19)     // Catch:{ all -> 0x03e8 }
            r3.put(r0, r4)     // Catch:{ all -> 0x03e8 }
            java.lang.String r0 = "crash_after_crash"
            boolean r4 = com.apm.insight.Npth.hasCrash()     // Catch:{ all -> 0x03e8 }
            if (r4 == 0) goto L_0x0367
            java.lang.String r4 = "true"
            goto L_0x0369
        L_0x0367:
            java.lang.String r4 = "false"
        L_0x0369:
            r3.put(r0, r4)     // Catch:{ all -> 0x03e8 }
            java.lang.String r0 = "from_file"
            boolean r4 = com.apm.insight.p011b.C1183d.m1291a()     // Catch:{ all -> 0x03e8 }
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ all -> 0x03e8 }
            r3.put(r0, r4)     // Catch:{ all -> 0x03e8 }
            java.lang.String r0 = "has_dump"
            java.lang.String r4 = "true"
            r3.put(r0, r4)     // Catch:{ all -> 0x03e8 }
            java.lang.String r0 = "from_kill"
            java.lang.String r4 = java.lang.String.valueOf(r10)     // Catch:{ all -> 0x03e8 }
            r3.put(r0, r4)     // Catch:{ all -> 0x03e8 }
            java.lang.String r0 = "last_resume_activity"
            com.apm.insight.runtime.a.b r4 = com.apm.insight.runtime.p024a.C1343b.m2080d()     // Catch:{ all -> 0x03e8 }
            java.lang.String r4 = r4.mo12452h()     // Catch:{ all -> 0x03e8 }
            r3.put(r0, r4)     // Catch:{ all -> 0x03e8 }
            int r0 = r1.f952r     // Catch:{ all -> 0x03e8 }
            if (r0 <= 0) goto L_0x03a5
            java.lang.String r0 = "may_have_stack_overflow"
            int r4 = r1.f952r     // Catch:{ all -> 0x027f }
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ all -> 0x027f }
            r3.put(r0, r4)     // Catch:{ all -> 0x027f }
        L_0x03a5:
            if (r10 != 0) goto L_0x03b9
            r4 = r18
            r1.m1256a((java.lang.String) r4, (org.json.JSONObject) r3)     // Catch:{ all -> 0x03ad }
            goto L_0x03ec
        L_0x03ad:
            r0 = move-exception
            r5 = r0
            com.apm.insight.c r0 = com.apm.insight.C1176b.m1249a()     // Catch:{ all -> 0x03ea }
            java.lang.String r6 = "NPTH_CATCH"
            r0.mo12218a((java.lang.String) r6, (java.lang.Throwable) r5)     // Catch:{ all -> 0x03ea }
            goto L_0x03ec
        L_0x03b9:
            r4 = r18
            boolean r0 = r25.m1270i()     // Catch:{ all -> 0x03ea }
            if (r0 != 0) goto L_0x03ec
            java.lang.String r0 = "aid"
            com.apm.insight.entity.Header r5 = r2.mo12266i()     // Catch:{ all -> 0x03ea }
            org.json.JSONObject r5 = r5.mo12241f()     // Catch:{ all -> 0x03ea }
            java.lang.String r6 = "aid"
            java.lang.Object r5 = r5.opt(r6)     // Catch:{ all -> 0x03ea }
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ all -> 0x03ea }
            r3.put(r0, r5)     // Catch:{ all -> 0x03ea }
            com.apm.insight.entity.Header r0 = r2.mo12266i()     // Catch:{ all -> 0x03ea }
            org.json.JSONObject r0 = r0.mo12241f()     // Catch:{ all -> 0x03ea }
            java.lang.String r5 = "aid"
            r6 = 2010(0x7da, float:2.817E-42)
            r0.put(r5, r6)     // Catch:{ all -> 0x03ea }
            goto L_0x03ec
        L_0x03e8:
            r4 = r18
        L_0x03ea:
            r0 = r3
        L_0x03eb:
            r3 = r0
        L_0x03ec:
            if (r10 == 0) goto L_0x0417
            java.lang.String r0 = com.apm.insight.p022k.C1270e.m1672c()     // Catch:{ all -> 0x0494 }
            java.io.File r3 = new java.io.File     // Catch:{ all -> 0x0494 }
            android.content.Context r4 = r1.f939d     // Catch:{ all -> 0x0494 }
            java.io.File r4 = com.apm.insight.p023l.C1308o.m1830a((android.content.Context) r4)     // Catch:{ all -> 0x0494 }
            com.apm.insight.CrashType r5 = com.apm.insight.CrashType.ANR     // Catch:{ all -> 0x0494 }
            r6 = 0
            java.lang.String r5 = com.apm.insight.C1240h.m1543a(r7, r5, r6, r6)     // Catch:{ all -> 0x0494 }
            r3.<init>(r4, r5)     // Catch:{ all -> 0x0494 }
            r1.f942h = r3     // Catch:{ all -> 0x0494 }
            java.lang.String r4 = r3.getName()     // Catch:{ all -> 0x0494 }
            org.json.JSONObject r2 = r2.mo12265h()     // Catch:{ all -> 0x0494 }
            boolean r5 = com.apm.insight.p022k.C1270e.m1669b()     // Catch:{ all -> 0x0494 }
            com.apm.insight.p023l.C1298i.m1765a(r3, r4, r0, r2, r5)     // Catch:{ all -> 0x0494 }
            goto L_0x049e
        L_0x0417:
            java.io.File r0 = r1.f942h     // Catch:{ all -> 0x0494 }
            if (r0 == 0) goto L_0x0423
            java.io.File r0 = r1.f942h     // Catch:{ all -> 0x0494 }
            com.apm.insight.p023l.C1298i.m1777a((java.io.File) r0)     // Catch:{ all -> 0x0494 }
            r5 = 0
            r1.f942h = r5     // Catch:{ all -> 0x0494 }
        L_0x0423:
            com.apm.insight.a.a r0 = com.apm.insight.p010a.C1172a.m1244a()     // Catch:{ all -> 0x0494 }
            com.apm.insight.CrashType r5 = com.apm.insight.CrashType.ANR     // Catch:{ all -> 0x0494 }
            java.lang.String r6 = com.apm.insight.C1240h.m1556e()     // Catch:{ all -> 0x0494 }
            r0.mo12175a((com.apm.insight.CrashType) r5, (long) r7, (java.lang.String) r6)     // Catch:{ all -> 0x0494 }
            java.io.File r0 = com.apm.insight.p023l.C1295f.m1757f()     // Catch:{ all -> 0x0445 }
            long r5 = r0.length()     // Catch:{ all -> 0x0445 }
            r9 = 1024(0x400, double:5.06E-321)
            int r0 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r0 <= 0) goto L_0x0445
            java.lang.String r0 = "has_system_traces"
            java.lang.String r5 = "true"
            r2.mo12246a((java.lang.String) r0, (java.lang.String) r5)     // Catch:{ all -> 0x0445 }
        L_0x0445:
            java.lang.String r0 = com.apm.insight.C1240h.m1557f()     // Catch:{ all -> 0x0478 }
            java.io.File r0 = com.apm.insight.p023l.C1308o.m1848e((java.lang.String) r0)     // Catch:{ all -> 0x0478 }
            java.lang.String r5 = com.apm.insight.C1240h.m1557f()     // Catch:{ all -> 0x0478 }
            java.io.File r5 = com.apm.insight.p023l.C1308o.m1851f((java.lang.String) r5)     // Catch:{ all -> 0x0478 }
            org.json.JSONArray r0 = com.apm.insight.nativecrash.C1330c.m2020a(r0, r5)     // Catch:{ all -> 0x0478 }
            java.lang.String r5 = "leak_threads_count"
            int r6 = r0.length()     // Catch:{ all -> 0x0478 }
            java.lang.String r6 = java.lang.String.valueOf(r6)     // Catch:{ all -> 0x0478 }
            r3.put(r5, r6)     // Catch:{ all -> 0x0478 }
            int r3 = r0.length()     // Catch:{ all -> 0x0478 }
            if (r3 <= 0) goto L_0x0478
            java.lang.String r3 = com.apm.insight.C1240h.m1557f()     // Catch:{ all -> 0x0478 }
            java.io.File r3 = com.apm.insight.p023l.C1308o.m1854g((java.lang.String) r3)     // Catch:{ all -> 0x0478 }
            r5 = 0
            com.apm.insight.p023l.C1298i.m1771a((java.io.File) r3, (org.json.JSONArray) r0, (boolean) r5)     // Catch:{ all -> 0x0478 }
        L_0x0478:
            java.lang.String r0 = "mainStackFromTrace"
            r3 = r26
            java.lang.String r0 = r3.optString(r0)     // Catch:{ all -> 0x0494 }
            org.json.JSONArray r0 = com.apm.insight.entity.C1218b.m1447a((java.lang.String) r0)     // Catch:{ all -> 0x0494 }
            org.json.JSONObject r2 = r2.mo12265h()     // Catch:{ all -> 0x0494 }
            com.apm.insight.b.b$2 r3 = new com.apm.insight.b.b$2     // Catch:{ all -> 0x0494 }
            r3.<init>(r7)     // Catch:{ all -> 0x0494 }
            com.apm.insight.entity.C1218b.m1451a((org.json.JSONObject) r2, (org.json.JSONArray) r0, (com.apm.insight.entity.C1218b.C1219a) r3)     // Catch:{ all -> 0x0494 }
            m1264b((java.lang.String) r4)     // Catch:{ all -> 0x0494 }
            goto L_0x049e
        L_0x0494:
            r0 = move-exception
            com.apm.insight.c r2 = com.apm.insight.C1176b.m1249a()
            java.lang.String r3 = "NPTH_CATCH"
            r2.mo12218a((java.lang.String) r3, (java.lang.Throwable) r0)
        L_0x049e:
            return r17
        L_0x049f:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x049f }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apm.insight.p011b.C1178b.mo12181a(int, int):boolean");
    }

    /* renamed from: b */
    public void mo12182b() {
        if (this.f940e) {
            this.f940e = false;
            C1181c cVar = this.f938c;
            if (cVar != null) {
                cVar.mo12190b();
            }
            this.f938c = null;
        }
    }

    /* renamed from: c */
    public void mo12183c() {
        C1181c cVar = this.f938c;
        if (cVar != null) {
            cVar.mo12189a();
        }
    }

    /* renamed from: d */
    public void mo12184d() {
        if (!f931f) {
            synchronized (this.f958x) {
                if (!f931f) {
                    this.f933B.run();
                }
            }
        }
    }

    /* renamed from: e */
    public void mo12185e() {
        if (NativeImpl.m1969g()) {
            try {
                C1298i.m1769a(m1269h(), String.valueOf(this.f934C + 1), false);
            } catch (Throwable th) {
                C1176b.m1249a().mo12218a("NPTH_CATCH", th);
            }
        }
        this.f960z = SystemClock.uptimeMillis();
        this.f959y = true;
    }

    /* renamed from: f */
    public void mo12186f() {
        File h = m1269h();
        try {
            int intValue = Integer.decode(C1298i.m1785c(h.getAbsolutePath())).intValue();
            this.f934C = intValue;
            if (intValue >= 2) {
                NativeImpl.m1951a(false);
            } else {
                NativeImpl.m1951a(true);
            }
        } catch (IOException unused) {
            NativeImpl.m1951a(true);
        } catch (Throwable unused2) {
            C1298i.m1777a(h);
        }
    }
}

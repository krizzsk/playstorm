package com.bytedance.sdk.component.p120e.p123c;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.sdk.component.p104b.p105a.C2816k;
import com.bytedance.sdk.component.p120e.p124d.C2933b;
import java.net.InetAddress;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bytedance.sdk.component.e.c.e */
/* compiled from: TNCManager */
public class C2928e {

    /* renamed from: a */
    Handler f6644a = new Handler(Looper.getMainLooper()) {
        public void handleMessage(Message message) {
            if (message.what == 10000) {
                C2928e.this.m8237b(message.arg1 != 0);
            }
        }
    };

    /* renamed from: b */
    private long f6645b = 0;

    /* renamed from: c */
    private C2921a f6646c;

    /* renamed from: d */
    private boolean f6647d;

    /* renamed from: e */
    private C2925b f6648e;

    /* renamed from: f */
    private boolean f6649f = false;

    /* renamed from: g */
    private Context f6650g;

    /* renamed from: h */
    private C2927d f6651h;

    /* renamed from: i */
    private int f6652i = 0;

    /* renamed from: j */
    private long f6653j = 19700101000L;

    /* renamed from: k */
    private int f6654k = 0;

    /* renamed from: l */
    private HashMap<String, Integer> f6655l = new HashMap<>();

    /* renamed from: m */
    private HashMap<String, Integer> f6656m = new HashMap<>();

    /* renamed from: n */
    private int f6657n = 0;

    /* renamed from: o */
    private HashMap<String, Integer> f6658o = new HashMap<>();

    /* renamed from: p */
    private HashMap<String, Integer> f6659p = new HashMap<>();

    /* renamed from: q */
    private boolean f6660q = true;

    /* renamed from: r */
    private Map<String, Integer> f6661r = new HashMap();

    /* renamed from: s */
    private int f6662s;

    private C2928e() {
    }

    public C2928e(int i) {
        this.f6662s = i;
    }

    /* renamed from: a */
    private String m8231a(C2816k kVar) {
        if (kVar == null || kVar.mo17583b() == null || kVar.mo17583b().mo17556a() == null) {
            return "";
        }
        try {
            return InetAddress.getByName(kVar.mo17583b().mo17556a().getHost()).getHostAddress();
        } catch (Exception unused) {
            return "";
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x00a4 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00a5  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m8232a(com.bytedance.sdk.component.p104b.p105a.C2820m r12, java.lang.String r13) {
        /*
            r11 = this;
            if (r12 != 0) goto L_0x0003
            return
        L_0x0003:
            boolean r0 = r11.f6660q
            if (r0 != 0) goto L_0x0008
            return
        L_0x0008:
            r0 = 0
            java.lang.String r1 = "tnc-cmd"
            java.lang.String r12 = r12.mo17495a(r1, r0)
            r0 = r12
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            java.lang.String r1 = "TNCManager"
            if (r0 == 0) goto L_0x002f
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r0 = "handleTncProbe, no probeProto, "
        L_0x0021:
            r12.append(r0)
            r12.append(r13)
            java.lang.String r12 = r12.toString()
            com.bytedance.sdk.component.p120e.p124d.C2933b.m8266b(r1, r12)
            return
        L_0x002f:
            java.lang.String r0 = "@"
            java.lang.String[] r12 = r12.split(r0)
            if (r12 == 0) goto L_0x0108
            int r2 = r12.length
            r3 = 2
            if (r2 == r3) goto L_0x003d
            goto L_0x0108
        L_0x003d:
            r2 = 1
            r3 = 0
            r5 = 0
            r6 = r12[r5]     // Catch:{ all -> 0x0050 }
            int r6 = java.lang.Integer.parseInt(r6)     // Catch:{ all -> 0x0050 }
            r12 = r12[r2]     // Catch:{ all -> 0x004e }
            long r7 = java.lang.Long.parseLong(r12)     // Catch:{ all -> 0x004e }
            goto L_0x006a
        L_0x004e:
            r12 = move-exception
            goto L_0x0052
        L_0x0050:
            r12 = move-exception
            r6 = r5
        L_0x0052:
            r12.printStackTrace()
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r7 = "handleTncProbe, probeProto except, "
            r12.append(r7)
            r12.append(r13)
            java.lang.String r12 = r12.toString()
            com.bytedance.sdk.component.p120e.p124d.C2933b.m8266b(r1, r12)
            r7 = r3
        L_0x006a:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r9 = "handleTncProbe, local: "
            r12.append(r9)
            int r9 = r11.f6652i
            r12.append(r9)
            r12.append(r0)
            long r9 = r11.f6653j
            r12.append(r9)
            java.lang.String r9 = " svr: "
            r12.append(r9)
            r12.append(r6)
            r12.append(r0)
            r12.append(r7)
            java.lang.String r0 = " "
            r12.append(r0)
            r12.append(r13)
            java.lang.String r12 = r12.toString()
            com.bytedance.sdk.component.p120e.p124d.C2933b.m8266b(r1, r12)
            long r9 = r11.f6653j
            int r12 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r12 > 0) goto L_0x00a5
            return
        L_0x00a5:
            r11.f6652i = r6
            r11.f6653j = r7
            android.content.Context r12 = r11.f6650g
            java.lang.String r9 = r11.mo17827a()
            android.content.SharedPreferences r12 = r12.getSharedPreferences(r9, r5)
            android.content.SharedPreferences$Editor r12 = r12.edit()
            java.lang.String r5 = "tnc_probe_cmd"
            android.content.SharedPreferences$Editor r12 = r12.putInt(r5, r6)
            java.lang.String r5 = "tnc_probe_version"
            android.content.SharedPreferences$Editor r12 = r12.putLong(r5, r7)
            r12.apply()
            int r12 = r11.f6652i
            r5 = 10000(0x2710, float:1.4013E-41)
            if (r12 != r5) goto L_0x0107
            com.bytedance.sdk.component.e.c.c r12 = r11.mo17838f()
            if (r12 != 0) goto L_0x00d3
            return
        L_0x00d3:
            java.util.Random r5 = new java.util.Random
            long r6 = java.lang.System.currentTimeMillis()
            r5.<init>(r6)
            int r6 = r12.f6635l
            if (r6 <= 0) goto L_0x00ea
            int r12 = r12.f6635l
            int r12 = r5.nextInt(r12)
            long r3 = (long) r12
            r5 = 1000(0x3e8, double:4.94E-321)
            long r3 = r3 * r5
        L_0x00ea:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r5 = "handleTncProbe, updateConfig delay: "
            r12.append(r5)
            r12.append(r3)
            r12.append(r0)
            r12.append(r13)
            java.lang.String r12 = r12.toString()
            com.bytedance.sdk.component.p120e.p124d.C2933b.m8266b(r1, r12)
            r11.m8234a((boolean) r2, (long) r3)
        L_0x0107:
            return
        L_0x0108:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r0 = "handleTncProbe, probeProto err, "
            goto L_0x0021
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.p120e.p123c.C2928e.m8232a(com.bytedance.sdk.component.b.a.m, java.lang.String):void");
    }

    /* renamed from: a */
    private void m8234a(boolean z, long j) {
        if (!this.f6644a.hasMessages(10000)) {
            Message obtainMessage = this.f6644a.obtainMessage();
            obtainMessage.what = 10000;
            obtainMessage.arg1 = z ? 1 : 0;
            if (j > 0) {
                this.f6644a.sendMessageDelayed(obtainMessage, j);
            } else {
                this.f6644a.sendMessage(obtainMessage);
            }
        }
    }

    /* renamed from: a */
    private boolean m8235a(int i) {
        return i >= 200 && i < 400;
    }

    /* renamed from: b */
    private void m8236b(String str) {
        Map<String, String> g;
        if (TextUtils.isEmpty(str) || (g = mo17839g()) == null || !g.containsValue(str)) {
            return;
        }
        if (this.f6661r.get(str) == null) {
            this.f6661r.put(str, 1);
            return;
        }
        this.f6661r.put(str, Integer.valueOf(this.f6661r.get(str).intValue() + 1));
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m8237b(boolean z) {
        C2926c f = mo17838f();
        if (f != null) {
            C2933b.m8266b("TNCManager", "doUpdateRemote, " + z);
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (z || this.f6645b + (((long) f.f6634k) * 1000) <= elapsedRealtime) {
                this.f6645b = elapsedRealtime;
                C2931g.m8259a().mo17843a(this.f6662s, this.f6650g).mo17806c();
                return;
            }
            C2933b.m8266b("TNCManager", "doUpdateRemote, time limit");
        }
    }

    /* renamed from: b */
    private boolean m8238b(int i) {
        if (i < 100 || i >= 1000) {
            return true;
        }
        C2926c f = mo17838f();
        if (f == null || TextUtils.isEmpty(f.f6636m)) {
            return false;
        }
        String str = f.f6636m;
        StringBuilder sb = new StringBuilder();
        sb.append("");
        sb.append(i);
        return str.contains(sb.toString());
    }

    /* renamed from: c */
    private void m8239c(String str) {
        if (!TextUtils.isEmpty(str) && this.f6661r.containsKey(str)) {
            this.f6661r.put(str, 0);
        }
    }

    /* renamed from: d */
    private boolean m8240d(String str) {
        Map<String, String> g = mo17839g();
        if (g == null) {
            return false;
        }
        String str2 = g.get(str);
        if (TextUtils.isEmpty(str2) || this.f6661r.get(str2) == null || this.f6661r.get(str2).intValue() < 3) {
            return false;
        }
        C2933b.m8266b("TNCManager", "handleHostMapping, TNC host faild num over limit: " + str);
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0026, code lost:
        r0 = 'J';
        r1 = '7';
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000b, code lost:
        switch(r1) {
            case 55: goto L_0x000f;
            case 56: goto L_0x0026;
            case 57: goto L_0x0026;
            default: goto L_0x000e;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000f, code lost:
        r2 = r2.toCharArray();
        r0 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0015, code lost:
        if (r0 >= r2.length) goto L_0x0020;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0017, code lost:
        r2[r0] = (char) (r2[r0] ^ r0);
        r0 = r0 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0025, code lost:
        return new java.lang.String(r2);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String e1655274989197dc(java.lang.String r2) {
        /*
        L_0x0000:
            r0 = 73
            r1 = 96
        L_0x0004:
            switch(r0) {
                case 72: goto L_0x0026;
                case 73: goto L_0x0008;
                case 74: goto L_0x000b;
                default: goto L_0x0007;
            }
        L_0x0007:
            goto L_0x002b
        L_0x0008:
            switch(r1) {
                case 94: goto L_0x0000;
                case 95: goto L_0x0026;
                case 96: goto L_0x0026;
                default: goto L_0x000b;
            }
        L_0x000b:
            switch(r1) {
                case 55: goto L_0x000f;
                case 56: goto L_0x0026;
                case 57: goto L_0x0026;
                default: goto L_0x000e;
            }
        L_0x000e:
            goto L_0x0000
        L_0x000f:
            char[] r2 = r2.toCharArray()
            r0 = 0
        L_0x0014:
            int r1 = r2.length
            if (r0 >= r1) goto L_0x0020
            char r1 = r2[r0]
            r1 = r1 ^ r0
            char r1 = (char) r1
            r2[r0] = r1
            int r0 = r0 + 1
            goto L_0x0014
        L_0x0020:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r2)
            return r0
        L_0x0026:
            r0 = 74
            r1 = 55
            goto L_0x0004
        L_0x002b:
            r0 = 72
            goto L_0x0004
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.p120e.p123c.C2928e.e1655274989197dc(java.lang.String):java.lang.String");
    }

    /* renamed from: i */
    private void m8241i() {
        SharedPreferences sharedPreferences = this.f6650g.getSharedPreferences(mo17827a(), 0);
        this.f6652i = sharedPreferences.getInt("tnc_probe_cmd", 0);
        this.f6653j = sharedPreferences.getLong("tnc_probe_version", 19700101000L);
    }

    /* renamed from: j */
    private void m8242j() {
        C2933b.m8266b("TNCManager", "resetTNCControlState");
        this.f6654k = 0;
        this.f6655l.clear();
        this.f6656m.clear();
        this.f6657n = 0;
        this.f6658o.clear();
        this.f6659p.clear();
    }

    /* renamed from: a */
    public String mo17827a() {
        return "ttnet_tnc_config" + this.f6662s;
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0080  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String mo17828a(java.lang.String r7) {
        /*
            r6 = this;
            r0 = r7
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x00fc
            java.lang.String r0 = "/network/get_network"
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            boolean r0 = r7.contains(r0)
            if (r0 != 0) goto L_0x00fc
            java.lang.String r0 = "/get_domains/v4"
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            boolean r0 = r7.contains(r0)
            if (r0 != 0) goto L_0x00fc
            java.lang.String r0 = "/ies/speed"
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            boolean r0 = r7.contains(r0)
            if (r0 == 0) goto L_0x0029
            goto L_0x00fc
        L_0x0029:
            r0 = 0
            java.net.URL r1 = new java.net.URL     // Catch:{ all -> 0x003a }
            r1.<init>(r7)     // Catch:{ all -> 0x003a }
            java.lang.String r2 = r1.getProtocol()     // Catch:{ all -> 0x003a }
            java.lang.String r0 = r1.getHost()     // Catch:{ all -> 0x0038 }
            goto L_0x003f
        L_0x0038:
            r1 = move-exception
            goto L_0x003c
        L_0x003a:
            r1 = move-exception
            r2 = r0
        L_0x003c:
            r1.printStackTrace()
        L_0x003f:
            r1 = r2
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x00fc
            java.lang.String r1 = "http"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x0058
            java.lang.String r1 = "https"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x00fc
        L_0x0058:
            r1 = r0
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L_0x0063
            goto L_0x00fc
        L_0x0063:
            boolean r1 = r6.m8240d(r0)
            java.lang.String r3 = "TNCManager"
            if (r1 == 0) goto L_0x0080
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "handleHostMapping, TNC host faild num over limit: "
        L_0x0072:
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
        L_0x007c:
            com.bytedance.sdk.component.p120e.p124d.C2933b.m8266b(r3, r0)
            return r7
        L_0x0080:
            java.util.Map r1 = r6.mo17839g()
            if (r1 == 0) goto L_0x00f3
            boolean r4 = r1.containsKey(r0)
            if (r4 != 0) goto L_0x008d
            goto L_0x00f3
        L_0x008d:
            java.lang.Object r1 = r1.get(r0)
            java.lang.String r1 = (java.lang.String) r1
            r4 = r1
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 == 0) goto L_0x009d
            return r7
        L_0x009d:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "handleHostMapping, match, origin: "
            r4.append(r5)
            r4.append(r7)
            java.lang.String r4 = r4.toString()
            com.bytedance.sdk.component.p120e.p124d.C2933b.m8266b(r3, r4)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r2)
            java.lang.String r5 = "://"
            r4.append(r5)
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r2)
            r4.append(r5)
            r4.append(r1)
            java.lang.String r1 = r4.toString()
            boolean r2 = r7.startsWith(r0)
            if (r2 == 0) goto L_0x00e1
            java.lang.String r7 = r7.replaceFirst(r0, r1)
        L_0x00e1:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "handleHostMapping, target: "
            r0.append(r1)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            goto L_0x007c
        L_0x00f3:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "handleHostMapping, nomatch: "
            goto L_0x0072
        L_0x00fc:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.p120e.p123c.C2928e.mo17828a(java.lang.String):java.lang.String");
    }

    /* renamed from: a */
    public synchronized void mo17829a(Context context, boolean z) {
        if (!this.f6649f) {
            this.f6650g = context;
            this.f6660q = z;
            this.f6651h = new C2927d(context, z, this.f6662s);
            if (z) {
                m8241i();
            }
            C2933b.m8266b("TNCManager", "initTnc, isMainProc: " + z + " probeCmd: " + this.f6652i + " probeVersion: " + this.f6653j);
            this.f6646c = C2931g.m8259a().mo17843a(this.f6662s, this.f6650g);
            this.f6649f = true;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0198, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x019d, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void mo17830a(com.bytedance.sdk.component.p104b.p105a.C2816k r8, com.bytedance.sdk.component.p104b.p105a.C2820m r9) {
        /*
            r7 = this;
            monitor-enter(r7)
            if (r8 == 0) goto L_0x019c
            if (r9 != 0) goto L_0x0007
            goto L_0x019c
        L_0x0007:
            boolean r0 = r7.f6660q     // Catch:{ all -> 0x0199 }
            if (r0 != 0) goto L_0x000d
            monitor-exit(r7)
            return
        L_0x000d:
            android.content.Context r0 = r7.f6650g     // Catch:{ all -> 0x0199 }
            boolean r0 = com.bytedance.sdk.component.p120e.p124d.C2940e.m8276a(r0)     // Catch:{ all -> 0x0199 }
            if (r0 != 0) goto L_0x0017
            monitor-exit(r7)
            return
        L_0x0017:
            r0 = 0
            com.bytedance.sdk.component.b.a.f r1 = r8.mo17583b()     // Catch:{ Exception -> 0x0020 }
            java.net.URL r0 = r1.mo17556a()     // Catch:{ Exception -> 0x0020 }
        L_0x0020:
            if (r0 != 0) goto L_0x0024
            monitor-exit(r7)
            return
        L_0x0024:
            java.lang.String r1 = r0.getProtocol()     // Catch:{ all -> 0x0199 }
            java.lang.String r2 = r0.getHost()     // Catch:{ all -> 0x0199 }
            java.lang.String r0 = r0.getPath()     // Catch:{ all -> 0x0199 }
            java.lang.String r8 = r7.m8231a((com.bytedance.sdk.component.p104b.p105a.C2816k) r8)     // Catch:{ all -> 0x0199 }
            int r3 = r9.mo17497c()     // Catch:{ all -> 0x0199 }
            java.lang.String r4 = "http"
            boolean r4 = r4.equals(r1)     // Catch:{ all -> 0x0199 }
            if (r4 != 0) goto L_0x004a
            java.lang.String r4 = "https"
            boolean r4 = r4.equals(r1)     // Catch:{ all -> 0x0199 }
            if (r4 != 0) goto L_0x004a
            monitor-exit(r7)
            return
        L_0x004a:
            r4 = r8
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4     // Catch:{ all -> 0x0199 }
            boolean r4 = android.text.TextUtils.isEmpty(r4)     // Catch:{ all -> 0x0199 }
            if (r4 == 0) goto L_0x0055
            monitor-exit(r7)
            return
        L_0x0055:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0199 }
            r4.<init>()     // Catch:{ all -> 0x0199 }
            java.lang.String r5 = "TNCManager"
            java.lang.String r6 = "onResponse, url: "
            r4.append(r6)     // Catch:{ all -> 0x0199 }
            r4.append(r1)     // Catch:{ all -> 0x0199 }
            java.lang.String r6 = "://"
            r4.append(r6)     // Catch:{ all -> 0x0199 }
            r4.append(r2)     // Catch:{ all -> 0x0199 }
            java.lang.String r6 = "#"
            r4.append(r6)     // Catch:{ all -> 0x0199 }
            r4.append(r8)     // Catch:{ all -> 0x0199 }
            java.lang.String r6 = "#"
            r4.append(r6)     // Catch:{ all -> 0x0199 }
            r4.append(r3)     // Catch:{ all -> 0x0199 }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x0199 }
            com.bytedance.sdk.component.p120e.p124d.C2933b.m8266b(r5, r4)     // Catch:{ all -> 0x0199 }
            com.bytedance.sdk.component.e.c.c r4 = r7.mo17838f()     // Catch:{ all -> 0x0199 }
            if (r4 == 0) goto L_0x0090
            boolean r5 = r4.f6625b     // Catch:{ all -> 0x0199 }
            if (r5 == 0) goto L_0x0090
            r7.m8232a((com.bytedance.sdk.component.p104b.p105a.C2820m) r9, (java.lang.String) r2)     // Catch:{ all -> 0x0199 }
        L_0x0090:
            if (r4 != 0) goto L_0x0094
            monitor-exit(r7)
            return
        L_0x0094:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x0199 }
            r9.<init>()     // Catch:{ all -> 0x0199 }
            java.lang.String r5 = "TNCManager"
            java.lang.String r6 = "onResponse, url matched: "
            r9.append(r6)     // Catch:{ all -> 0x0199 }
            r9.append(r1)     // Catch:{ all -> 0x0199 }
            java.lang.String r6 = "://"
            r9.append(r6)     // Catch:{ all -> 0x0199 }
            r9.append(r2)     // Catch:{ all -> 0x0199 }
            java.lang.String r6 = "#"
            r9.append(r6)     // Catch:{ all -> 0x0199 }
            r9.append(r8)     // Catch:{ all -> 0x0199 }
            java.lang.String r6 = "#"
            r9.append(r6)     // Catch:{ all -> 0x0199 }
            r9.append(r3)     // Catch:{ all -> 0x0199 }
            java.lang.String r6 = " "
            r9.append(r6)     // Catch:{ all -> 0x0199 }
            int r6 = r7.f6654k     // Catch:{ all -> 0x0199 }
            r9.append(r6)     // Catch:{ all -> 0x0199 }
            java.lang.String r6 = "#"
            r9.append(r6)     // Catch:{ all -> 0x0199 }
            java.util.HashMap<java.lang.String, java.lang.Integer> r6 = r7.f6655l     // Catch:{ all -> 0x0199 }
            int r6 = r6.size()     // Catch:{ all -> 0x0199 }
            r9.append(r6)     // Catch:{ all -> 0x0199 }
            java.lang.String r6 = "#"
            r9.append(r6)     // Catch:{ all -> 0x0199 }
            java.util.HashMap<java.lang.String, java.lang.Integer> r6 = r7.f6656m     // Catch:{ all -> 0x0199 }
            int r6 = r6.size()     // Catch:{ all -> 0x0199 }
            r9.append(r6)     // Catch:{ all -> 0x0199 }
            java.lang.String r6 = " "
            r9.append(r6)     // Catch:{ all -> 0x0199 }
            int r6 = r7.f6657n     // Catch:{ all -> 0x0199 }
            r9.append(r6)     // Catch:{ all -> 0x0199 }
            java.lang.String r6 = "#"
            r9.append(r6)     // Catch:{ all -> 0x0199 }
            java.util.HashMap<java.lang.String, java.lang.Integer> r6 = r7.f6658o     // Catch:{ all -> 0x0199 }
            int r6 = r6.size()     // Catch:{ all -> 0x0199 }
            r9.append(r6)     // Catch:{ all -> 0x0199 }
            java.lang.String r6 = "#"
            r9.append(r6)     // Catch:{ all -> 0x0199 }
            java.util.HashMap<java.lang.String, java.lang.Integer> r6 = r7.f6659p     // Catch:{ all -> 0x0199 }
            int r6 = r6.size()     // Catch:{ all -> 0x0199 }
            r9.append(r6)     // Catch:{ all -> 0x0199 }
            java.lang.String r9 = r9.toString()     // Catch:{ all -> 0x0199 }
            com.bytedance.sdk.component.p120e.p124d.C2933b.m8266b(r5, r9)     // Catch:{ all -> 0x0199 }
            if (r3 <= 0) goto L_0x0197
            boolean r9 = r7.m8235a((int) r3)     // Catch:{ all -> 0x0199 }
            if (r9 == 0) goto L_0x0125
            int r8 = r7.f6654k     // Catch:{ all -> 0x0199 }
            if (r8 > 0) goto L_0x011e
            int r8 = r7.f6657n     // Catch:{ all -> 0x0199 }
            if (r8 <= 0) goto L_0x0121
        L_0x011e:
            r7.m8242j()     // Catch:{ all -> 0x0199 }
        L_0x0121:
            r7.m8239c(r2)     // Catch:{ all -> 0x0199 }
            goto L_0x0197
        L_0x0125:
            boolean r9 = r7.m8238b((int) r3)     // Catch:{ all -> 0x0199 }
            if (r9 != 0) goto L_0x0197
            int r9 = r7.f6657n     // Catch:{ all -> 0x0199 }
            int r9 = r9 + 1
            r7.f6657n = r9     // Catch:{ all -> 0x0199 }
            java.util.HashMap<java.lang.String, java.lang.Integer> r9 = r7.f6658o     // Catch:{ all -> 0x0199 }
            r5 = 0
            java.lang.Integer r6 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x0199 }
            r9.put(r0, r6)     // Catch:{ all -> 0x0199 }
            java.util.HashMap<java.lang.String, java.lang.Integer> r9 = r7.f6659p     // Catch:{ all -> 0x0199 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x0199 }
            r9.put(r8, r0)     // Catch:{ all -> 0x0199 }
            int r9 = r7.f6657n     // Catch:{ all -> 0x0199 }
            int r0 = r4.f6631h     // Catch:{ all -> 0x0199 }
            if (r9 < r0) goto L_0x0194
            java.util.HashMap<java.lang.String, java.lang.Integer> r9 = r7.f6658o     // Catch:{ all -> 0x0199 }
            int r9 = r9.size()     // Catch:{ all -> 0x0199 }
            int r0 = r4.f6632i     // Catch:{ all -> 0x0199 }
            if (r9 < r0) goto L_0x0194
            java.util.HashMap<java.lang.String, java.lang.Integer> r9 = r7.f6659p     // Catch:{ all -> 0x0199 }
            int r9 = r9.size()     // Catch:{ all -> 0x0199 }
            int r0 = r4.f6633j     // Catch:{ all -> 0x0199 }
            if (r9 < r0) goto L_0x0194
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x0199 }
            r9.<init>()     // Catch:{ all -> 0x0199 }
            java.lang.String r0 = "TNCManager"
            java.lang.String r4 = "onResponse, url doUpdate: "
            r9.append(r4)     // Catch:{ all -> 0x0199 }
            r9.append(r1)     // Catch:{ all -> 0x0199 }
            java.lang.String r1 = "://"
            r9.append(r1)     // Catch:{ all -> 0x0199 }
            r9.append(r2)     // Catch:{ all -> 0x0199 }
            java.lang.String r1 = "#"
            r9.append(r1)     // Catch:{ all -> 0x0199 }
            r9.append(r8)     // Catch:{ all -> 0x0199 }
            java.lang.String r8 = "#"
            r9.append(r8)     // Catch:{ all -> 0x0199 }
            r9.append(r3)     // Catch:{ all -> 0x0199 }
            java.lang.String r8 = r9.toString()     // Catch:{ all -> 0x0199 }
            com.bytedance.sdk.component.p120e.p124d.C2933b.m8266b(r0, r8)     // Catch:{ all -> 0x0199 }
            r8 = 0
            r7.m8234a((boolean) r5, (long) r8)     // Catch:{ all -> 0x0199 }
            r7.m8242j()     // Catch:{ all -> 0x0199 }
        L_0x0194:
            r7.m8236b((java.lang.String) r2)     // Catch:{ all -> 0x0199 }
        L_0x0197:
            monitor-exit(r7)
            return
        L_0x0199:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
        L_0x019c:
            monitor-exit(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.p120e.p123c.C2928e.mo17830a(com.bytedance.sdk.component.b.a.k, com.bytedance.sdk.component.b.a.m):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0130, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void mo17831a(com.bytedance.sdk.component.p104b.p105a.C2816k r7, java.lang.Exception r8) {
        /*
            r6 = this;
            monitor-enter(r6)
            if (r7 == 0) goto L_0x012f
            com.bytedance.sdk.component.b.a.f r0 = r7.mo17583b()     // Catch:{ all -> 0x012c }
            if (r0 == 0) goto L_0x012f
            if (r8 != 0) goto L_0x000d
            goto L_0x012f
        L_0x000d:
            boolean r8 = r6.f6660q     // Catch:{ all -> 0x012c }
            if (r8 != 0) goto L_0x0013
            monitor-exit(r6)
            return
        L_0x0013:
            android.content.Context r8 = r6.f6650g     // Catch:{ all -> 0x012c }
            boolean r8 = com.bytedance.sdk.component.p120e.p124d.C2940e.m8276a(r8)     // Catch:{ all -> 0x012c }
            if (r8 != 0) goto L_0x001d
            monitor-exit(r6)
            return
        L_0x001d:
            r8 = 0
            com.bytedance.sdk.component.b.a.f r0 = r7.mo17583b()     // Catch:{ Exception -> 0x0026 }
            java.net.URL r8 = r0.mo17556a()     // Catch:{ Exception -> 0x0026 }
        L_0x0026:
            if (r8 != 0) goto L_0x002a
            monitor-exit(r6)
            return
        L_0x002a:
            java.lang.String r0 = r8.getProtocol()     // Catch:{ all -> 0x012c }
            java.lang.String r1 = r8.getHost()     // Catch:{ all -> 0x012c }
            java.lang.String r8 = r8.getPath()     // Catch:{ all -> 0x012c }
            java.lang.String r7 = r6.m8231a((com.bytedance.sdk.component.p104b.p105a.C2816k) r7)     // Catch:{ all -> 0x012c }
            java.lang.String r2 = "http"
            boolean r2 = r2.equals(r0)     // Catch:{ all -> 0x012c }
            if (r2 != 0) goto L_0x004c
            java.lang.String r2 = "https"
            boolean r2 = r2.equals(r0)     // Catch:{ all -> 0x012c }
            if (r2 != 0) goto L_0x004c
            monitor-exit(r6)
            return
        L_0x004c:
            com.bytedance.sdk.component.e.c.c r2 = r6.mo17838f()     // Catch:{ all -> 0x012c }
            if (r2 != 0) goto L_0x0054
            monitor-exit(r6)
            return
        L_0x0054:
            java.lang.String r3 = "TNCManager"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x012c }
            r4.<init>()     // Catch:{ all -> 0x012c }
            java.lang.String r5 = "onError, url matched: "
            r4.append(r5)     // Catch:{ all -> 0x012c }
            r4.append(r0)     // Catch:{ all -> 0x012c }
            java.lang.String r5 = "://"
            r4.append(r5)     // Catch:{ all -> 0x012c }
            r4.append(r1)     // Catch:{ all -> 0x012c }
            java.lang.String r5 = "#"
            r4.append(r5)     // Catch:{ all -> 0x012c }
            r4.append(r7)     // Catch:{ all -> 0x012c }
            java.lang.String r5 = "# "
            r4.append(r5)     // Catch:{ all -> 0x012c }
            int r5 = r6.f6654k     // Catch:{ all -> 0x012c }
            r4.append(r5)     // Catch:{ all -> 0x012c }
            java.lang.String r5 = "#"
            r4.append(r5)     // Catch:{ all -> 0x012c }
            java.util.HashMap<java.lang.String, java.lang.Integer> r5 = r6.f6655l     // Catch:{ all -> 0x012c }
            int r5 = r5.size()     // Catch:{ all -> 0x012c }
            r4.append(r5)     // Catch:{ all -> 0x012c }
            java.lang.String r5 = "#"
            r4.append(r5)     // Catch:{ all -> 0x012c }
            java.util.HashMap<java.lang.String, java.lang.Integer> r5 = r6.f6656m     // Catch:{ all -> 0x012c }
            int r5 = r5.size()     // Catch:{ all -> 0x012c }
            r4.append(r5)     // Catch:{ all -> 0x012c }
            java.lang.String r5 = " "
            r4.append(r5)     // Catch:{ all -> 0x012c }
            int r5 = r6.f6657n     // Catch:{ all -> 0x012c }
            r4.append(r5)     // Catch:{ all -> 0x012c }
            java.lang.String r5 = "#"
            r4.append(r5)     // Catch:{ all -> 0x012c }
            java.util.HashMap<java.lang.String, java.lang.Integer> r5 = r6.f6658o     // Catch:{ all -> 0x012c }
            int r5 = r5.size()     // Catch:{ all -> 0x012c }
            r4.append(r5)     // Catch:{ all -> 0x012c }
            java.lang.String r5 = "#"
            r4.append(r5)     // Catch:{ all -> 0x012c }
            java.util.HashMap<java.lang.String, java.lang.Integer> r5 = r6.f6659p     // Catch:{ all -> 0x012c }
            int r5 = r5.size()     // Catch:{ all -> 0x012c }
            r4.append(r5)     // Catch:{ all -> 0x012c }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x012c }
            com.bytedance.sdk.component.p120e.p124d.C2933b.m8266b(r3, r4)     // Catch:{ all -> 0x012c }
            int r3 = r6.f6654k     // Catch:{ all -> 0x012c }
            int r3 = r3 + 1
            r6.f6654k = r3     // Catch:{ all -> 0x012c }
            java.util.HashMap<java.lang.String, java.lang.Integer> r3 = r6.f6655l     // Catch:{ all -> 0x012c }
            r4 = 0
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x012c }
            r3.put(r8, r5)     // Catch:{ all -> 0x012c }
            java.util.HashMap<java.lang.String, java.lang.Integer> r8 = r6.f6656m     // Catch:{ all -> 0x012c }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x012c }
            r8.put(r7, r3)     // Catch:{ all -> 0x012c }
            int r8 = r6.f6654k     // Catch:{ all -> 0x012c }
            int r3 = r2.f6628e     // Catch:{ all -> 0x012c }
            if (r8 < r3) goto L_0x0127
            java.util.HashMap<java.lang.String, java.lang.Integer> r8 = r6.f6655l     // Catch:{ all -> 0x012c }
            int r8 = r8.size()     // Catch:{ all -> 0x012c }
            int r3 = r2.f6629f     // Catch:{ all -> 0x012c }
            if (r8 < r3) goto L_0x0127
            java.util.HashMap<java.lang.String, java.lang.Integer> r8 = r6.f6656m     // Catch:{ all -> 0x012c }
            int r8 = r8.size()     // Catch:{ all -> 0x012c }
            int r2 = r2.f6630g     // Catch:{ all -> 0x012c }
            if (r8 < r2) goto L_0x0127
            java.lang.String r8 = "TNCManager"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x012c }
            r2.<init>()     // Catch:{ all -> 0x012c }
            java.lang.String r3 = "onError, url doUpate: "
            r2.append(r3)     // Catch:{ all -> 0x012c }
            r2.append(r0)     // Catch:{ all -> 0x012c }
            java.lang.String r0 = "://"
            r2.append(r0)     // Catch:{ all -> 0x012c }
            r2.append(r1)     // Catch:{ all -> 0x012c }
            java.lang.String r0 = "#"
            r2.append(r0)     // Catch:{ all -> 0x012c }
            r2.append(r7)     // Catch:{ all -> 0x012c }
            java.lang.String r7 = r2.toString()     // Catch:{ all -> 0x012c }
            com.bytedance.sdk.component.p120e.p124d.C2933b.m8266b(r8, r7)     // Catch:{ all -> 0x012c }
            r7 = 0
            r6.m8234a((boolean) r4, (long) r7)     // Catch:{ all -> 0x012c }
            r6.m8242j()     // Catch:{ all -> 0x012c }
        L_0x0127:
            r6.m8236b((java.lang.String) r1)     // Catch:{ all -> 0x012c }
            monitor-exit(r6)
            return
        L_0x012c:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
        L_0x012f:
            monitor-exit(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.p120e.p123c.C2928e.mo17831a(com.bytedance.sdk.component.b.a.k, java.lang.Exception):void");
    }

    /* renamed from: a */
    public void mo17832a(C2925b bVar) {
        this.f6648e = bVar;
    }

    /* renamed from: a */
    public void mo17833a(boolean z) {
        this.f6647d = z;
    }

    /* renamed from: b */
    public C2921a mo17834b() {
        return this.f6646c;
    }

    /* renamed from: c */
    public boolean mo17835c() {
        return this.f6647d;
    }

    /* renamed from: d */
    public C2925b mo17836d() {
        return this.f6648e;
    }

    /* renamed from: e */
    public void mo17837e() {
        this.f6661r.clear();
    }

    /* renamed from: f */
    public C2926c mo17838f() {
        C2927d dVar = this.f6651h;
        if (dVar != null) {
            return dVar.mo17826c();
        }
        return null;
    }

    /* renamed from: g */
    public Map<String, String> mo17839g() {
        C2926c f = mo17838f();
        if (f != null) {
            return f.f6627d;
        }
        return null;
    }

    /* renamed from: h */
    public C2927d mo17840h() {
        return this.f6651h;
    }
}

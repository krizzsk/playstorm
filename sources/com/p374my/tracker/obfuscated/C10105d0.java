package com.p374my.tracker.obfuscated;

import android.content.Context;
import android.text.TextUtils;
import com.p374my.tracker.obfuscated.C10093b0;
import com.p374my.tracker.obfuscated.C10118j0;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.TreeSet;
import org.json.JSONObject;

/* renamed from: com.my.tracker.obfuscated.d0 */
public final class C10105d0 {

    /* renamed from: n */
    static final DecimalFormat f25160n;

    /* renamed from: a */
    final Context f25161a;

    /* renamed from: b */
    final C10093b0 f25162b;

    /* renamed from: c */
    final C10178v0 f25163c;

    /* renamed from: d */
    final C10151n f25164d;

    /* renamed from: e */
    final int f25165e;

    /* renamed from: f */
    final int f25166f;

    /* renamed from: g */
    final int f25167g;

    /* renamed from: h */
    final int f25168h;

    /* renamed from: i */
    ByteArrayOutputStream f25169i = new ByteArrayOutputStream(65536);

    /* renamed from: j */
    ByteArrayOutputStream f25170j = new ByteArrayOutputStream(16384);

    /* renamed from: k */
    ByteArrayOutputStream f25171k = new ByteArrayOutputStream(4096);

    /* renamed from: l */
    long f25172l;

    /* renamed from: m */
    long f25173m;

    static {
        DecimalFormat decimalFormat = new DecimalFormat("0.0#####");
        f25160n = decimalFormat;
        decimalFormat.setDecimalFormatSymbols(DecimalFormatSymbols.getInstance(Locale.ROOT));
    }

    private C10105d0(C10093b0 b0Var, C10178v0 v0Var, int i, int i2, int i3, int i4, Context context) {
        this.f25161a = context.getApplicationContext();
        this.f25164d = C10151n.m30344a(v0Var);
        this.f25162b = b0Var;
        this.f25163c = v0Var;
        this.f25165e = i;
        this.f25166f = i2;
        this.f25167g = i3;
        this.f25168h = i4;
        Long b = b0Var.mo66087b("timestamp_base");
        this.f25172l = b == null ? 0 : b.longValue();
        this.f25173m = b0Var.mo66099g();
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x0065 A[Catch:{ all -> 0x005f, all -> 0x0069 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static int m30026a(com.p374my.tracker.obfuscated.C10093b0 r9, java.io.ByteArrayOutputStream r10, java.io.ByteArrayOutputStream r11, java.io.OutputStream r12) {
        /*
            r0 = 0
            r1 = 0
            java.lang.String r2 = "default_session"
            com.my.tracker.obfuscated.b0$e r2 = r9.mo66078a((java.lang.String) r2)     // Catch:{ all -> 0x0087 }
        L_0x0008:
            boolean r3 = r2.mo66102a()     // Catch:{ all -> 0x0084 }
            if (r3 == 0) goto L_0x0090
            r10.reset()     // Catch:{ all -> 0x0084 }
            long r3 = r2.mo66114b()     // Catch:{ all -> 0x0084 }
            java.lang.String r5 = r2.mo66115c()     // Catch:{ all -> 0x0084 }
            com.my.tracker.obfuscated.b0$f r3 = r9.mo66098f(r3)     // Catch:{ all -> 0x0061 }
        L_0x001d:
            boolean r4 = r3.mo66102a()     // Catch:{ all -> 0x005f }
            r6 = 2
            if (r4 == 0) goto L_0x0040
            r11.reset()     // Catch:{ all -> 0x005f }
            long r7 = r3.mo66119c()     // Catch:{ all -> 0x005f }
            r4 = 1
            com.p374my.tracker.obfuscated.C10158o0.m30362a((int) r4, (long) r7, (java.io.OutputStream) r11)     // Catch:{ all -> 0x005f }
            boolean r7 = r3.mo66120d()     // Catch:{ all -> 0x005f }
            if (r7 != 0) goto L_0x003c
            long r7 = r3.mo66118b()     // Catch:{ all -> 0x005f }
            com.p374my.tracker.obfuscated.C10158o0.m30362a((int) r6, (long) r7, (java.io.OutputStream) r11)     // Catch:{ all -> 0x005f }
        L_0x003c:
            com.p374my.tracker.obfuscated.C10158o0.m30363a((int) r4, (java.io.ByteArrayOutputStream) r11, (java.io.OutputStream) r10)     // Catch:{ all -> 0x005f }
            goto L_0x001d
        L_0x0040:
            r3.close()     // Catch:{ all -> 0x0069 }
            int r3 = r10.size()     // Catch:{ all -> 0x0069 }
            if (r3 != 0) goto L_0x004a
            goto L_0x0008
        L_0x004a:
            long r3 = r2.mo66117e()     // Catch:{ all -> 0x0069 }
            r7 = 0
            int r7 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r7 <= 0) goto L_0x0057
            com.p374my.tracker.obfuscated.C10158o0.m30362a((int) r6, (long) r3, (java.io.OutputStream) r10)     // Catch:{ all -> 0x0069 }
        L_0x0057:
            r3 = 42
            com.p374my.tracker.obfuscated.C10158o0.m30363a((int) r3, (java.io.ByteArrayOutputStream) r10, (java.io.OutputStream) r12)     // Catch:{ all -> 0x0069 }
            int r1 = r1 + 1
            goto L_0x0008
        L_0x005f:
            r4 = move-exception
            goto L_0x0063
        L_0x0061:
            r4 = move-exception
            r3 = r0
        L_0x0063:
            if (r3 == 0) goto L_0x0068
            r3.close()     // Catch:{ all -> 0x0069 }
        L_0x0068:
            throw r4     // Catch:{ all -> 0x0069 }
        L_0x0069:
            r3 = move-exception
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0084 }
            r4.<init>()     // Catch:{ all -> 0x0084 }
            java.lang.String r6 = "MyTrackerRepository error: failed to read session "
            r4.append(r6)     // Catch:{ all -> 0x0084 }
            r4.append(r5)     // Catch:{ all -> 0x0084 }
            java.lang.String r5 = ": "
            r4.append(r5)     // Catch:{ all -> 0x0084 }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x0084 }
            com.p374my.tracker.obfuscated.C10175u0.m30445b(r4, r3)     // Catch:{ all -> 0x0084 }
            goto L_0x0008
        L_0x0084:
            r9 = move-exception
            r0 = r2
            goto L_0x0088
        L_0x0087:
            r9 = move-exception
        L_0x0088:
            java.lang.String r10 = "MyTrackerRepository error: failed to read sessions: "
            com.p374my.tracker.obfuscated.C10175u0.m30445b(r10, r9)     // Catch:{ all -> 0x00ad }
            if (r0 == 0) goto L_0x0093
            r2 = r0
        L_0x0090:
            r2.close()
        L_0x0093:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "MyTrackerRepository: "
            r9.append(r10)
            r9.append(r1)
            java.lang.String r10 = " sessions are prepared to sending"
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            com.p374my.tracker.obfuscated.C10175u0.m30440a((java.lang.String) r9)
            return r1
        L_0x00ad:
            r9 = move-exception
            if (r0 == 0) goto L_0x00b3
            r0.close()
        L_0x00b3:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p374my.tracker.obfuscated.C10105d0.m30026a(com.my.tracker.obfuscated.b0, java.io.ByteArrayOutputStream, java.io.ByteArrayOutputStream, java.io.OutputStream):int");
    }

    /* JADX WARNING: Removed duplicated region for block: B:60:0x00e5 A[Catch:{ all -> 0x00df, all -> 0x00e9 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static int m30027a(com.p374my.tracker.obfuscated.C10093b0 r11, java.io.ByteArrayOutputStream r12, java.io.OutputStream r13) {
        /*
            r0 = 0
            r1 = 0
            com.my.tracker.obfuscated.b0$b r2 = r11.mo66097f()     // Catch:{ all -> 0x0104 }
            r3 = r1
        L_0x0007:
            boolean r4 = r2.mo66102a()     // Catch:{ all -> 0x0100 }
            if (r4 == 0) goto L_0x010e
            r12.reset()     // Catch:{ all -> 0x0100 }
            long r4 = r2.mo66108e()     // Catch:{ all -> 0x0100 }
            int r4 = (int) r4     // Catch:{ all -> 0x0100 }
            long r5 = r2.mo66106c()     // Catch:{ all -> 0x0100 }
            byte[] r7 = r2.mo66105b()     // Catch:{ all -> 0x0100 }
            com.my.tracker.obfuscated.b0$c r5 = r11.mo66089c(r5)     // Catch:{ all -> 0x00e1 }
            r6 = r1
        L_0x0022:
            boolean r8 = r5.mo66102a()     // Catch:{ all -> 0x00df }
            if (r8 == 0) goto L_0x0033
            r8 = 2
            long r9 = r5.mo66109b()     // Catch:{ all -> 0x00df }
            com.p374my.tracker.obfuscated.C10158o0.m30362a((int) r8, (long) r9, (java.io.OutputStream) r12)     // Catch:{ all -> 0x00df }
            int r6 = r6 + 1
            goto L_0x0022
        L_0x0033:
            if (r6 != 0) goto L_0x0052
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x00df }
            r6.<init>()     // Catch:{ all -> 0x00df }
            java.lang.String r7 = "MyTrackerRepository error: no timestamps for event "
            r6.append(r7)     // Catch:{ all -> 0x00df }
            r6.append(r4)     // Catch:{ all -> 0x00df }
            java.lang.String r7 = ", event ignored"
            r6.append(r7)     // Catch:{ all -> 0x00df }
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x00df }
            com.p374my.tracker.obfuscated.C10175u0.m30444b(r6)     // Catch:{ all -> 0x00df }
            r5.close()     // Catch:{ all -> 0x00e9 }
            goto L_0x0007
        L_0x0052:
            r5.close()     // Catch:{ all -> 0x00e9 }
            r5 = 1
            com.p374my.tracker.obfuscated.C10158o0.m30372b(r5, r4, r12)     // Catch:{ all -> 0x00e9 }
            long r5 = r2.mo66107d()     // Catch:{ all -> 0x00e9 }
            r8 = 0
            int r8 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r8 <= 0) goto L_0x0067
            r8 = 3
            com.p374my.tracker.obfuscated.C10158o0.m30362a((int) r8, (long) r5, (java.io.OutputStream) r12)     // Catch:{ all -> 0x00e9 }
        L_0x0067:
            int r5 = r7.length     // Catch:{ all -> 0x00e9 }
            if (r5 <= 0) goto L_0x00d6
            switch(r4) {
                case 1: goto L_0x00bc;
                case 2: goto L_0x00b9;
                case 3: goto L_0x00b6;
                case 4: goto L_0x006d;
                case 5: goto L_0x00b3;
                case 6: goto L_0x00b0;
                case 7: goto L_0x00ad;
                case 8: goto L_0x00aa;
                case 9: goto L_0x00a7;
                case 10: goto L_0x00a4;
                case 11: goto L_0x006d;
                case 12: goto L_0x006d;
                case 13: goto L_0x00a1;
                case 14: goto L_0x009e;
                case 15: goto L_0x009b;
                case 16: goto L_0x006d;
                case 17: goto L_0x0098;
                case 18: goto L_0x0095;
                case 19: goto L_0x0092;
                case 20: goto L_0x008f;
                case 21: goto L_0x008c;
                case 22: goto L_0x0089;
                case 23: goto L_0x0086;
                case 24: goto L_0x0083;
                case 25: goto L_0x0080;
                case 26: goto L_0x007d;
                case 27: goto L_0x007a;
                case 28: goto L_0x0077;
                case 29: goto L_0x0074;
                case 30: goto L_0x006d;
                case 31: goto L_0x0071;
                default: goto L_0x006d;
            }     // Catch:{ all -> 0x00e9 }
        L_0x006d:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x00e9 }
            goto L_0x00c2
        L_0x0071:
            r5 = 39
            goto L_0x00be
        L_0x0074:
            r5 = 37
            goto L_0x00be
        L_0x0077:
            r5 = 36
            goto L_0x00be
        L_0x007a:
            r5 = 35
            goto L_0x00be
        L_0x007d:
            r5 = 34
            goto L_0x00be
        L_0x0080:
            r5 = 33
            goto L_0x00be
        L_0x0083:
            r5 = 32
            goto L_0x00be
        L_0x0086:
            r5 = 31
            goto L_0x00be
        L_0x0089:
            r5 = 30
            goto L_0x00be
        L_0x008c:
            r5 = 29
            goto L_0x00be
        L_0x008f:
            r5 = 28
            goto L_0x00be
        L_0x0092:
            r5 = 27
            goto L_0x00be
        L_0x0095:
            r5 = 26
            goto L_0x00be
        L_0x0098:
            r5 = 25
            goto L_0x00be
        L_0x009b:
            r5 = 16
            goto L_0x00be
        L_0x009e:
            r5 = 14
            goto L_0x00be
        L_0x00a1:
            r5 = 21
            goto L_0x00be
        L_0x00a4:
            r5 = 23
            goto L_0x00be
        L_0x00a7:
            r5 = 20
            goto L_0x00be
        L_0x00aa:
            r5 = 19
            goto L_0x00be
        L_0x00ad:
            r5 = 18
            goto L_0x00be
        L_0x00b0:
            r5 = 22
            goto L_0x00be
        L_0x00b3:
            r5 = 17
            goto L_0x00be
        L_0x00b6:
            r5 = 11
            goto L_0x00be
        L_0x00b9:
            r5 = 13
            goto L_0x00be
        L_0x00bc:
            r5 = 12
        L_0x00be:
            com.p374my.tracker.obfuscated.C10158o0.m30366a((int) r5, (byte[]) r7, (java.io.OutputStream) r12)     // Catch:{ all -> 0x00e9 }
            goto L_0x00d6
        L_0x00c2:
            r5.<init>()     // Catch:{ all -> 0x00e9 }
            java.lang.String r6 = "MyTrackerRepository error: unrecognized eventType "
            r5.append(r6)     // Catch:{ all -> 0x00e9 }
            r5.append(r4)     // Catch:{ all -> 0x00e9 }
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x00e9 }
            com.p374my.tracker.obfuscated.C10175u0.m30444b(r5)     // Catch:{ all -> 0x00e9 }
            goto L_0x0007
        L_0x00d6:
            r5 = 41
            com.p374my.tracker.obfuscated.C10158o0.m30363a((int) r5, (java.io.ByteArrayOutputStream) r12, (java.io.OutputStream) r13)     // Catch:{ all -> 0x00e9 }
            int r3 = r3 + 1
            goto L_0x0007
        L_0x00df:
            r6 = move-exception
            goto L_0x00e3
        L_0x00e1:
            r6 = move-exception
            r5 = r0
        L_0x00e3:
            if (r5 == 0) goto L_0x00e8
            r5.close()     // Catch:{ all -> 0x00e9 }
        L_0x00e8:
            throw r6     // Catch:{ all -> 0x00e9 }
        L_0x00e9:
            r5 = move-exception
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0100 }
            r6.<init>()     // Catch:{ all -> 0x0100 }
            java.lang.String r7 = "MyTrackerRepository error: failed to read event "
            r6.append(r7)     // Catch:{ all -> 0x0100 }
            r6.append(r4)     // Catch:{ all -> 0x0100 }
            java.lang.String r4 = r6.toString()     // Catch:{ all -> 0x0100 }
            com.p374my.tracker.obfuscated.C10175u0.m30445b(r4, r5)     // Catch:{ all -> 0x0100 }
            goto L_0x0007
        L_0x0100:
            r11 = move-exception
            r0 = r2
            r1 = r3
            goto L_0x0105
        L_0x0104:
            r11 = move-exception
        L_0x0105:
            java.lang.String r12 = "MyTrackerRepository error: failed to read events: "
            com.p374my.tracker.obfuscated.C10175u0.m30445b(r12, r11)     // Catch:{ all -> 0x012c }
            if (r0 == 0) goto L_0x0112
            r2 = r0
            r3 = r1
        L_0x010e:
            r2.close()
            r1 = r3
        L_0x0112:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "MyTrackerRepository: "
            r11.append(r12)
            r11.append(r1)
            java.lang.String r12 = " events are prepared to sending"
            r11.append(r12)
            java.lang.String r11 = r11.toString()
            com.p374my.tracker.obfuscated.C10175u0.m30440a((java.lang.String) r11)
            return r1
        L_0x012c:
            r11 = move-exception
            if (r0 == 0) goto L_0x0132
            r0.close()
        L_0x0132:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p374my.tracker.obfuscated.C10105d0.m30027a(com.my.tracker.obfuscated.b0, java.io.ByteArrayOutputStream, java.io.OutputStream):int");
    }

    /* renamed from: a */
    static C10105d0 m30028a(C10178v0 v0Var, int i, int i2, int i3, int i4, Context context) {
        C10093b0 a = C10093b0.m29970a(v0Var.mo66418f(), context);
        if (a == null) {
            C10175u0.m30444b("MyTrackerRepository error: database is null");
            return null;
        }
        try {
            return new C10105d0(a, v0Var, i, i2, i3, i4, context);
        } catch (Throwable th) {
            C10175u0.m30445b("MyTrackerRepository error: failed to create MyTrackerRepository instance", th);
            return null;
        }
    }

    /* renamed from: a */
    public static C10105d0 m30029a(C10178v0 v0Var, Context context) {
        return m30028a(v0Var, 1000, 500, 500, 100, context);
    }

    /* renamed from: a */
    static void m30030a(int i, Map<String, String> map, ByteArrayOutputStream byteArrayOutputStream, OutputStream outputStream) {
        if (map != null && !map.isEmpty()) {
            Iterator it = new TreeSet(map.keySet()).iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                byteArrayOutputStream.reset();
                for (int i2 : C10152n0.f25426v) {
                    if (i2 == 1) {
                        C10158o0.m30365a(1, str, (OutputStream) byteArrayOutputStream);
                    } else if (i2 == 2) {
                        C10158o0.m30365a(2, map.get(str), (OutputStream) byteArrayOutputStream);
                    }
                }
                if (byteArrayOutputStream.size() > 0) {
                    C10158o0.m30363a(i, byteArrayOutputStream, outputStream);
                }
            }
        }
    }

    /* renamed from: a */
    public long mo66126a() {
        return this.f25173m;
    }

    /* renamed from: a */
    public void mo66127a(C10164q0 q0Var) {
        String jSONObject = q0Var.mo66374d().toString();
        String a = q0Var.mo66371a();
        try {
            if (this.f25162b.mo66100h() >= ((long) this.f25168h)) {
                C10175u0.m30440a("MyTrackerRepository: max count of raw purchases is reached");
                C10175u0.m30440a("MyTrackerRepository: raw purchase with data: " + jSONObject + ", signature " + a + " isn't inserted");
                return;
            }
            long a2 = this.f25162b.mo66077a(jSONObject, a, q0Var.mo66376f());
            if (a2 >= 0) {
                C10175u0.m30440a("MyTrackerRepository: raw purchase was inserted; id: " + a2 + ", data: " + jSONObject + ", signature: " + a);
                q0Var.mo66369a(a2);
            }
        } catch (Throwable th) {
            C10175u0.m30445b("MyTrackerRepository error: can't insert raw purchase with data: " + jSONObject + ", signature " + a, th);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo66128a(int i, String str, String str2, Map<String, String> map, long j) {
        try {
            this.f25169i.reset();
            for (int i2 : C10152n0.f25411g) {
                if (i2 == 1) {
                    m30030a(i2, map, this.f25170j, (OutputStream) this.f25169i);
                } else if (i2 == 2) {
                    C10158o0.m30365a(i2, str, (OutputStream) this.f25169i);
                } else if (i2 == 3) {
                    C10158o0.m30365a(i2, str2, (OutputStream) this.f25169i);
                }
            }
            return mo66130a(i, this.f25169i.toByteArray(), j);
        } catch (Throwable th) {
            C10175u0.m30445b("MyTrackerRepository error: event serialization failed, type: " + i, th);
            return false;
        }
    }

    /* renamed from: a */
    public boolean mo66129a(int i, Map<String, String> map, long j) {
        try {
            this.f25169i.reset();
            for (int i2 : C10152n0.f25406b) {
                if (i2 == 1) {
                    m30030a(i2, map, this.f25170j, (OutputStream) this.f25169i);
                } else if (i2 == 2) {
                    C10158o0.m30372b(i2, i, this.f25169i);
                }
            }
            return mo66130a(13, this.f25169i.toByteArray(), j);
        } catch (Throwable th) {
            C10175u0.m30445b("MyTrackerRepository error: event serialization failed, type: 13", th);
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo66130a(int i, byte[] bArr, long j) {
        try {
            return mo66131a(i, bArr, false, true, j);
        } catch (Throwable th) {
            C10175u0.m30445b("MyTrackerRepository error: event serialization failed, type: " + i, th);
            return false;
        }
    }

    /* renamed from: a */
    public boolean mo66131a(int i, byte[] bArr, boolean z, boolean z2, long j) {
        long j2;
        C10093b0.C10094a aVar;
        int i2 = i;
        byte[] bArr2 = bArr;
        boolean z3 = z;
        long j3 = j;
        try {
            long j4 = C10093b0.f25125v;
            if (z2) {
                aVar = null;
                C10093b0.C10095b b = this.f25162b.mo66086b((long) i2, bArr2);
                if (b.mo66102a()) {
                    j4 = b.mo66106c();
                    j2 = b.mo66107d();
                } else {
                    j2 = 0;
                }
                b.close();
            } else {
                j2 = 0;
            }
            if (j4 == C10093b0.f25125v) {
                C10175u0.m30440a("MyTrackerRepository: insert " + i2 + " event");
                j4 = this.f25162b.mo66073a(i2, bArr2, z3);
                if (j4 != C10093b0.f25125v && z3) {
                    this.f25173m++;
                }
            } else {
                C10175u0.m30440a("MyTrackerRepository: aggregate " + i2 + " event");
            }
            if (j4 == C10093b0.f25125v) {
                C10175u0.m30444b("MyTrackerRepository error: event insertion failed, type: " + i2);
                return false;
            }
            if (this.f25172l == 0) {
                mo66146b(j3);
            }
            this.f25162b.mo66091c(j4, j3 - this.f25172l);
            long b2 = this.f25162b.mo66084b(j4);
            C10175u0.m30440a("MyTrackerRepository: event timestamps count: " + b2);
            long j5 = (long) this.f25165e;
            if (b2 <= j5) {
                return true;
            }
            long a = this.f25162b.mo66074a(j4, b2 - j5);
            this.f25162b.mo66094d(j4, j2 + a);
            C10175u0.m30440a("MyTrackerRepository: maximum count of event timestamps is exceeded, remove oldest timestamps, count: " + a);
            return true;
        } catch (Throwable th) {
            C10175u0.m30445b("MyTrackerRepository error: event insertion failed, type: " + i2, th);
            return false;
        }
    }

    /* renamed from: a */
    public boolean mo66132a(long j) {
        return mo66130a(3, new byte[0], j);
    }

    /* renamed from: a */
    public boolean mo66133a(long j, long j2) {
        try {
            this.f25169i.reset();
            for (int i : C10152n0.f25421q) {
                if (i == 2) {
                    C10158o0.m30362a(i, j, (OutputStream) this.f25169i);
                }
            }
            return mo66131a(25, this.f25169i.toByteArray(), false, true, j2);
        } catch (Throwable th) {
            C10175u0.m30445b("MyTrackerRepository error: event serialization failed, type: 25", th);
            return false;
        }
    }

    /* renamed from: a */
    public boolean mo66134a(long j, long j2, long j3, long j4) {
        try {
            this.f25169i.reset();
            for (int i : C10152n0.f25423s) {
                if (i == 2) {
                    long j5 = j2;
                    long j6 = j3;
                    C10158o0.m30362a(i, j, (OutputStream) this.f25169i);
                } else if (i == 3) {
                    long j7 = j3;
                    C10158o0.m30362a(i, j2, (OutputStream) this.f25169i);
                    long j8 = j;
                } else if (i != 4) {
                    long j9 = j;
                    long j10 = j2;
                    long j11 = j3;
                } else {
                    C10158o0.m30362a(i, j3, (OutputStream) this.f25169i);
                    long j12 = j;
                    long j13 = j2;
                }
            }
            return mo66131a(27, this.f25169i.toByteArray(), false, true, j4);
        } catch (Throwable th) {
            C10175u0.m30445b("MyTrackerRepository error: event serialization failed, type: 27", th);
            return false;
        }
    }

    /* renamed from: a */
    public boolean mo66135a(long j, String str, C10118j0.C10119a aVar, long j2) {
        String str2;
        C10118j0.C10119a aVar2 = aVar;
        try {
            this.f25169i.reset();
            for (int i : C10152n0.f25407c) {
                if (i == 1) {
                    String str3 = str;
                    C10158o0.m30362a(i, j, (OutputStream) this.f25169i);
                } else if (i != 2) {
                    long j3 = j;
                    String str4 = str;
                } else {
                    this.f25170j.reset();
                    for (int i2 : C10152n0.f25408d) {
                        if (i2 != 1) {
                            if (i2 != 2) {
                                if (i2 != 3) {
                                    if (i2 == 4) {
                                        if (aVar2 != null) {
                                            str2 = aVar2.f25230c;
                                        }
                                    }
                                } else if (aVar2 != null) {
                                    str2 = aVar2.f25229b;
                                }
                                C10158o0.m30365a(i2, str2, (OutputStream) this.f25170j);
                            } else if (aVar2 != null) {
                                C10158o0.m30372b(i2, aVar2.f25228a, this.f25170j);
                            }
                        } else if (!TextUtils.isEmpty(str)) {
                            C10158o0.m30365a(i2, str, (OutputStream) this.f25170j);
                        }
                        String str5 = str;
                    }
                    String str6 = str;
                    if (this.f25170j.size() > 0) {
                        C10158o0.m30363a(i, this.f25170j, (OutputStream) this.f25169i);
                    }
                    long j4 = j;
                }
            }
            return mo66131a(1, this.f25169i.toByteArray(), true, false, j2);
        } catch (Throwable th) {
            C10175u0.m30445b("MyTrackerRepository error: event serialization failed, type: 1", th);
            return false;
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo66136a(com.p374my.tracker.ads.AdEvent r9, long r10) {
        /*
            r8 = this;
            r0 = 0
            java.io.ByteArrayOutputStream r1 = r8.f25169i     // Catch:{ all -> 0x0055 }
            r1.reset()     // Catch:{ all -> 0x0055 }
            int[] r1 = com.p374my.tracker.obfuscated.C10152n0.f25416l     // Catch:{ all -> 0x0055 }
            int r2 = r1.length     // Catch:{ all -> 0x0055 }
            r3 = r0
        L_0x000a:
            if (r3 >= r2) goto L_0x0044
            r4 = r1[r3]     // Catch:{ all -> 0x0055 }
            r5 = 19
            switch(r4) {
                case 1: goto L_0x003a;
                case 2: goto L_0x0029;
                case 3: goto L_0x0022;
                case 4: goto L_0x001f;
                case 5: goto L_0x001c;
                case 6: goto L_0x0019;
                case 7: goto L_0x0014;
                default: goto L_0x0013;
            }     // Catch:{ all -> 0x0055 }
        L_0x0013:
            goto L_0x0041
        L_0x0014:
            java.lang.String r5 = r9.adFormat     // Catch:{ all -> 0x0055 }
        L_0x0016:
            java.io.ByteArrayOutputStream r6 = r8.f25169i     // Catch:{ all -> 0x0055 }
            goto L_0x0036
        L_0x0019:
            java.lang.String r5 = r9.adId     // Catch:{ all -> 0x0055 }
            goto L_0x0016
        L_0x001c:
            java.lang.String r5 = r9.placementId     // Catch:{ all -> 0x0055 }
            goto L_0x0016
        L_0x001f:
            java.lang.String r5 = r9.source     // Catch:{ all -> 0x0055 }
            goto L_0x0016
        L_0x0022:
            int r6 = r9.eventType     // Catch:{ all -> 0x0055 }
            if (r6 != r5) goto L_0x0041
            java.lang.String r5 = r9.currency     // Catch:{ all -> 0x0055 }
            goto L_0x0016
        L_0x0029:
            int r6 = r9.eventType     // Catch:{ all -> 0x0055 }
            if (r6 != r5) goto L_0x0041
            java.text.DecimalFormat r5 = f25160n     // Catch:{ all -> 0x0055 }
            double r6 = r9.revenue     // Catch:{ all -> 0x0055 }
            java.lang.String r5 = r5.format(r6)     // Catch:{ all -> 0x0055 }
            goto L_0x0016
        L_0x0036:
            com.p374my.tracker.obfuscated.C10158o0.m30365a((int) r4, (java.lang.String) r5, (java.io.OutputStream) r6)     // Catch:{ all -> 0x0055 }
            goto L_0x0041
        L_0x003a:
            int r5 = r9.network     // Catch:{ all -> 0x0055 }
            java.io.ByteArrayOutputStream r6 = r8.f25169i     // Catch:{ all -> 0x0055 }
            com.p374my.tracker.obfuscated.C10158o0.m30372b(r4, r5, r6)     // Catch:{ all -> 0x0055 }
        L_0x0041:
            int r3 = r3 + 1
            goto L_0x000a
        L_0x0044:
            int r2 = r9.eventType     // Catch:{ all -> 0x0055 }
            java.io.ByteArrayOutputStream r1 = r8.f25169i     // Catch:{ all -> 0x0055 }
            byte[] r3 = r1.toByteArray()     // Catch:{ all -> 0x0055 }
            r4 = 1
            r5 = 1
            r1 = r8
            r6 = r10
            boolean r9 = r1.mo66131a((int) r2, (byte[]) r3, (boolean) r4, (boolean) r5, (long) r6)     // Catch:{ all -> 0x0055 }
            return r9
        L_0x0055:
            r10 = move-exception
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r1 = "MyTrackerRepository error: event serialization failed, type: "
            r11.append(r1)
            int r9 = r9.eventType
            r11.append(r9)
            java.lang.String r9 = r11.toString()
            com.p374my.tracker.obfuscated.C10175u0.m30445b(r9, r10)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p374my.tracker.obfuscated.C10105d0.mo66136a(com.my.tracker.ads.AdEvent, long):boolean");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x001d A[Catch:{ all -> 0x0085 }] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x005c A[Catch:{ all -> 0x0085 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo66137a(com.p374my.tracker.miniapps.MiniAppEvent r12, long r13) {
        /*
            r11 = this;
            int r7 = r12.eventType
            r8 = 0
            java.io.ByteArrayOutputStream r0 = r11.f25169i     // Catch:{ all -> 0x0085 }
            r0.reset()     // Catch:{ all -> 0x0085 }
            r0 = 20
            if (r7 == r0) goto L_0x0013
            r1 = 21
            if (r7 != r1) goto L_0x0011
            goto L_0x0013
        L_0x0011:
            r3 = r8
            goto L_0x0015
        L_0x0013:
            r1 = 1
            r3 = r1
        L_0x0015:
            int[] r1 = com.p374my.tracker.obfuscated.C10152n0.f25420p     // Catch:{ all -> 0x0085 }
            int r2 = r1.length     // Catch:{ all -> 0x0085 }
            r4 = r8
        L_0x0019:
            r5 = 24
            if (r4 >= r2) goto L_0x0054
            r6 = r1[r4]     // Catch:{ all -> 0x0085 }
            switch(r6) {
                case 1: goto L_0x0046;
                case 2: goto L_0x003f;
                case 3: goto L_0x003c;
                case 4: goto L_0x0037;
                case 5: goto L_0x002a;
                case 6: goto L_0x0023;
                default: goto L_0x0022;
            }     // Catch:{ all -> 0x0085 }
        L_0x0022:
            goto L_0x0051
        L_0x0023:
            if (r7 != r5) goto L_0x0051
            java.lang.String r5 = r12.name     // Catch:{ all -> 0x0085 }
        L_0x0027:
            java.io.ByteArrayOutputStream r9 = r11.f25169i     // Catch:{ all -> 0x0085 }
            goto L_0x0042
        L_0x002a:
            if (r7 == r5) goto L_0x0034
            r5 = 22
            if (r7 == r5) goto L_0x0034
            r5 = 23
            if (r7 != r5) goto L_0x0051
        L_0x0034:
            java.lang.String r5 = r12.customUserId     // Catch:{ all -> 0x0085 }
            goto L_0x0027
        L_0x0037:
            if (r7 != r0) goto L_0x0051
            java.lang.String r5 = r12.query     // Catch:{ all -> 0x0085 }
            goto L_0x0027
        L_0x003c:
            java.lang.String r5 = r12.platformUserId     // Catch:{ all -> 0x0085 }
            goto L_0x0027
        L_0x003f:
            java.lang.String r5 = r12.miniAppId     // Catch:{ all -> 0x0085 }
            goto L_0x0027
        L_0x0042:
            com.p374my.tracker.obfuscated.C10158o0.m30365a((int) r6, (java.lang.String) r5, (java.io.OutputStream) r9)     // Catch:{ all -> 0x0085 }
            goto L_0x0051
        L_0x0046:
            if (r7 != r5) goto L_0x0051
            java.util.Map<java.lang.String, java.lang.String> r5 = r12.eventParams     // Catch:{ all -> 0x0085 }
            java.io.ByteArrayOutputStream r9 = r11.f25170j     // Catch:{ all -> 0x0085 }
            java.io.ByteArrayOutputStream r10 = r11.f25169i     // Catch:{ all -> 0x0085 }
            m30030a((int) r6, (java.util.Map<java.lang.String, java.lang.String>) r5, (java.io.ByteArrayOutputStream) r9, (java.io.OutputStream) r10)     // Catch:{ all -> 0x0085 }
        L_0x0051:
            int r4 = r4 + 1
            goto L_0x0019
        L_0x0054:
            java.io.ByteArrayOutputStream r12 = r11.f25169i     // Catch:{ all -> 0x0085 }
            byte[] r2 = r12.toByteArray()     // Catch:{ all -> 0x0085 }
            if (r7 != r5) goto L_0x007c
            com.my.tracker.obfuscated.b0 r12 = r11.f25162b     // Catch:{ all -> 0x0085 }
            long r0 = (long) r7     // Catch:{ all -> 0x0085 }
            long r4 = r12.mo66092d(r0)     // Catch:{ all -> 0x0085 }
            int r12 = r11.f25166f     // Catch:{ all -> 0x0085 }
            long r9 = (long) r12     // Catch:{ all -> 0x0085 }
            int r12 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r12 < 0) goto L_0x007c
            com.my.tracker.obfuscated.b0 r12 = r11.f25162b     // Catch:{ all -> 0x0085 }
            long r0 = r12.mo66075a((long) r0, (byte[]) r2)     // Catch:{ all -> 0x0085 }
            r4 = 0
            int r12 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r12 != 0) goto L_0x007c
            java.lang.String r12 = "MyTrackerRepository: maximum count of mini-app custom events is exceeded, event has been skipped"
            com.p374my.tracker.obfuscated.C10175u0.m30440a((java.lang.String) r12)     // Catch:{ all -> 0x0085 }
            return r8
        L_0x007c:
            r4 = 1
            r0 = r11
            r1 = r7
            r5 = r13
            boolean r12 = r0.mo66131a((int) r1, (byte[]) r2, (boolean) r3, (boolean) r4, (long) r5)     // Catch:{ all -> 0x0085 }
            return r12
        L_0x0085:
            r12 = move-exception
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r14 = "MyTrackerRepository error: event serialization failed, type: "
            r13.append(r14)
            r13.append(r7)
            java.lang.String r13 = r13.toString()
            com.p374my.tracker.obfuscated.C10175u0.m30445b(r13, r12)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p374my.tracker.obfuscated.C10105d0.mo66137a(com.my.tracker.miniapps.MiniAppEvent, long):boolean");
    }

    /* renamed from: a */
    public boolean mo66138a(C10164q0 q0Var, Map<String, String> map) {
        String str;
        String str2;
        String str3;
        try {
            this.f25169i.reset();
            JSONObject e = q0Var.mo66375e();
            str = null;
            if (e != null) {
                str2 = e.toString();
                try {
                    str = f25160n.format(Double.parseDouble(e.optString("price_amount_micros")) / 1000000.0d);
                } catch (Throwable th) {
                    C10175u0.m30441a("MyTrackerRepository error: wrong price in micros in sku details: ", th);
                }
                str3 = e.optString("price_currency_code");
            } else {
                str3 = null;
                str2 = null;
            }
        } catch (Throwable th2) {
            C10175u0.m30445b("MyTrackerRepository error: event serialization failed, type: 10", th2);
            return false;
        }
        for (int i : C10152n0.f25418n) {
            int i2 = 1;
            if (i != 1) {
                if (i == 2) {
                    this.f25170j.reset();
                    int[] iArr = C10152n0.f25419o;
                    int length = iArr.length;
                    int i3 = 0;
                    while (i3 < length) {
                        int i4 = iArr[i3];
                        if (i4 == i2) {
                            try {
                                C10158o0.m30365a(i4, q0Var.mo66374d().toString(), (OutputStream) this.f25170j);
                            } catch (Throwable th3) {
                                C10175u0.m30445b("MyTrackerRepository error: can't convert purchaseData json to string", th3);
                            }
                        } else if (i4 == 2) {
                            C10158o0.m30365a(i4, q0Var.mo66371a(), (OutputStream) this.f25170j);
                        } else if (i4 == 3) {
                            C10158o0.m30365a(i4, str2, (OutputStream) this.f25170j);
                        }
                        i3++;
                        i2 = 1;
                    }
                    if (this.f25170j.size() > 0) {
                        C10158o0.m30363a(i, this.f25170j, (OutputStream) this.f25169i);
                    }
                } else if (i == 4) {
                    C10158o0.m30365a(i, str, (OutputStream) this.f25169i);
                } else if (i == 5) {
                    C10158o0.m30365a(i, str3, (OutputStream) this.f25169i);
                }
                Map<String, String> map2 = map;
            } else {
                m30030a(i, map, this.f25170j, (OutputStream) this.f25169i);
            }
        }
        return mo66131a(10, this.f25169i.toByteArray(), true, false, q0Var.mo66376f());
    }

    /* renamed from: a */
    public boolean mo66139a(String str, String str2, long j) {
        try {
            this.f25169i.reset();
            for (int i : C10152n0.f25417m) {
                if (i == 1) {
                    C10158o0.m30365a(i, str, (OutputStream) this.f25169i);
                } else if (i == 2) {
                    if (!TextUtils.isEmpty(str2)) {
                        C10158o0.m30365a(i, str2, (OutputStream) this.f25169i);
                    }
                }
            }
            return mo66131a(15, this.f25169i.toByteArray(), true, true, j);
        } catch (Throwable th) {
            C10175u0.m30445b("MyTrackerRepository error: event serialization failed, type: 15", th);
            return false;
        }
    }

    /* renamed from: a */
    public boolean mo66140a(String str, String str2, long j, long j2, long j3) {
        try {
            this.f25169i.reset();
            for (int i : C10152n0.f25413i) {
                if (i == 1) {
                    String str3 = str2;
                    long j4 = j;
                    long j5 = j2;
                    String str4 = str;
                    C10158o0.m30365a(i, str, (OutputStream) this.f25169i);
                } else if (i == 2) {
                    long j6 = j;
                    long j7 = j2;
                    if (!TextUtils.isEmpty(str2)) {
                        String str5 = str2;
                        C10158o0.m30365a(i, str2, (OutputStream) this.f25169i);
                    } else {
                        String str6 = str2;
                    }
                    String str7 = str;
                } else if (i != 3) {
                    if (i != 4) {
                        String str8 = str;
                        String str9 = str2;
                        long j8 = j;
                    } else {
                        C10158o0.m30362a(i, j, (OutputStream) this.f25169i);
                        String str10 = str;
                        String str11 = str2;
                    }
                    long j9 = j2;
                } else {
                    long j10 = j;
                    C10158o0.m30362a(i, j2, (OutputStream) this.f25169i);
                    String str12 = str;
                    String str13 = str2;
                }
            }
            return mo66131a(14, this.f25169i.toByteArray(), true, false, j3);
        } catch (Throwable th) {
            C10175u0.m30445b("MyTrackerRepository error: event serialization failed, type: 14", th);
            return false;
        }
    }

    /* renamed from: a */
    public boolean mo66141a(String str, String str2, String str3, String str4, String str5, long j) {
        try {
            this.f25169i.reset();
            for (int i : C10152n0.f25409e) {
                if (i == 1) {
                    String str6 = str;
                    String str7 = str2;
                    String str8 = str4;
                    String str9 = str5;
                    C10158o0.m30365a(i, str3, (OutputStream) this.f25169i);
                } else if (i != 2) {
                    if (i == 3) {
                        String str10 = str2;
                        String str11 = str5;
                        String str12 = str;
                        C10158o0.m30365a(i, str, (OutputStream) this.f25169i);
                    } else if (i == 4) {
                        String str13 = str5;
                        String str14 = str2;
                        C10158o0.m30365a(i, str2, (OutputStream) this.f25169i);
                        String str15 = str;
                    } else if (i != 5) {
                        String str16 = str;
                        String str17 = str2;
                        String str18 = str3;
                        String str19 = str4;
                        String str20 = str5;
                    } else {
                        this.f25170j.reset();
                        for (int i2 : C10152n0.f25410f) {
                            if (i2 == 1) {
                                if (!TextUtils.isEmpty(str5)) {
                                    C10158o0.m30365a(i2, str5, (OutputStream) this.f25170j);
                                }
                            }
                            String str21 = str5;
                        }
                        String str22 = str5;
                        if (this.f25170j.size() > 0) {
                            C10158o0.m30363a(i, this.f25170j, (OutputStream) this.f25169i);
                        }
                        String str23 = str;
                        String str24 = str2;
                    }
                    String str25 = str3;
                    String str26 = str4;
                } else {
                    String str27 = str;
                    String str28 = str2;
                    String str29 = str5;
                    C10158o0.m30365a(i, str4, (OutputStream) this.f25169i);
                    String str30 = str3;
                }
            }
            return mo66131a(5, this.f25169i.toByteArray(), true, false, j);
        } catch (Throwable th) {
            C10175u0.m30445b("MyTrackerRepository error: event serialization failed, type: 5", th);
            return false;
        }
    }

    /* renamed from: a */
    public boolean mo66142a(String str, String str2, Map<String, String> map, long j) {
        return mo66128a(7, str, str2, map, j);
    }

    /* renamed from: a */
    public boolean mo66143a(String str, Map<String, String> map, long j) {
        try {
            this.f25169i.reset();
            for (int i : C10152n0.f25415k) {
                if (i == 1) {
                    m30030a(i, map, this.f25170j, (OutputStream) this.f25169i);
                } else if (i == 2) {
                    C10158o0.m30365a(i, str, (OutputStream) this.f25169i);
                }
            }
            byte[] byteArray = this.f25169i.toByteArray();
            if (this.f25162b.mo66092d(6) >= ((long) this.f25166f)) {
                long j2 = 0;
                if (this.f25162b.mo66075a(6, byteArray) == 0) {
                    C10175u0.m30440a("MyTrackerRepository: maximum count of custom events is exceeded, event has been skipped");
                    Long b = this.f25162b.mo66087b("custom_events_skipped_count");
                    if (b != null) {
                        j2 = b.longValue();
                    }
                    long j3 = j2 + 1;
                    C10175u0.m30440a("MyTrackerRepository: skipped custom events count: " + j3);
                    this.f25162b.mo66083a("custom_events_skipped_count", Long.valueOf(j3));
                    return false;
                }
            }
            return mo66131a(6, byteArray, false, true, j);
        } catch (Throwable th) {
            C10175u0.m30445b("MyTrackerRepository error: event serialization failed, type: 6", th);
        }
    }

    /* renamed from: a */
    public boolean mo66144a(Map<String, String> map, long j) {
        try {
            this.f25169i.reset();
            for (int i : C10152n0.f25405a) {
                if (i == 1) {
                    m30030a(i, map, this.f25170j, (OutputStream) this.f25169i);
                }
            }
            return mo66130a(9, this.f25169i.toByteArray(), j);
        } catch (Throwable th) {
            C10175u0.m30445b("MyTrackerRepository error: event serialization failed, type: 9", th);
            return false;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0036, code lost:
        if (r1 == null) goto L_0x003b;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List<com.p374my.tracker.obfuscated.C10164q0> mo66145b() {
        /*
            r6 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
            com.my.tracker.obfuscated.b0 r2 = r6.f25162b     // Catch:{ all -> 0x0030 }
            com.my.tracker.obfuscated.b0$d r1 = r2.mo66101i()     // Catch:{ all -> 0x0030 }
        L_0x000c:
            boolean r2 = r1.mo66102a()     // Catch:{ all -> 0x0030 }
            if (r2 == 0) goto L_0x0038
            java.lang.String r2 = r1.mo66110b()     // Catch:{ all -> 0x0030 }
            java.lang.String r3 = r1.mo66112d()     // Catch:{ all -> 0x0030 }
            long r4 = r1.mo66113e()     // Catch:{ all -> 0x0030 }
            com.my.tracker.obfuscated.q0 r2 = com.p374my.tracker.obfuscated.C10164q0.m30400a((java.lang.String) r2, (java.lang.String) r3, (long) r4)     // Catch:{ all -> 0x0030 }
            if (r2 == 0) goto L_0x000c
            long r3 = r1.mo66111c()     // Catch:{ all -> 0x0030 }
            com.my.tracker.obfuscated.q0 r2 = r2.mo66369a((long) r3)     // Catch:{ all -> 0x0030 }
            r0.add(r2)     // Catch:{ all -> 0x0030 }
            goto L_0x000c
        L_0x0030:
            r2 = move-exception
            java.lang.String r3 = "MyTrackerRepository error: error while reading purchases"
            com.p374my.tracker.obfuscated.C10175u0.m30445b(r3, r2)     // Catch:{ all -> 0x003c }
            if (r1 == 0) goto L_0x003b
        L_0x0038:
            r1.close()
        L_0x003b:
            return r0
        L_0x003c:
            r0 = move-exception
            if (r1 == 0) goto L_0x0042
            r1.close()
        L_0x0042:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p374my.tracker.obfuscated.C10105d0.mo66145b():java.util.List");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo66146b(long j) {
        try {
            this.f25162b.mo66083a("timestamp_base", Long.valueOf(j));
            this.f25172l = j;
        } catch (Throwable th) {
            C10175u0.m30445b("MyTrackerRepository error: ", th);
        }
    }

    /* renamed from: b */
    public void mo66147b(C10164q0 q0Var) {
        Long b = q0Var.mo66372b();
        if (b != null) {
            try {
                this.f25162b.mo66080a(b.longValue());
            } catch (Throwable th) {
                C10175u0.m30445b("MyTrackerRepository error: error while removing raw purchase with id " + b, th);
            }
        }
    }

    /* renamed from: b */
    public boolean mo66148b(long j, long j2) {
        try {
            this.f25169i.reset();
            for (int i : C10152n0.f25424t) {
                if (i == 2) {
                    C10158o0.m30362a(i, j, (OutputStream) this.f25169i);
                }
            }
            return mo66131a(28, this.f25169i.toByteArray(), false, true, j2);
        } catch (Throwable th) {
            C10175u0.m30445b("MyTrackerRepository error: event serialization failed, type: 28", th);
            return false;
        }
    }

    /* renamed from: b */
    public boolean mo66149b(long j, long j2, long j3, long j4) {
        try {
            this.f25169i.reset();
            for (int i : C10152n0.f25422r) {
                if (i == 2) {
                    long j5 = j2;
                    long j6 = j3;
                    C10158o0.m30362a(i, j, (OutputStream) this.f25169i);
                } else if (i == 3) {
                    long j7 = j3;
                    C10158o0.m30362a(i, j2, (OutputStream) this.f25169i);
                    long j8 = j;
                } else if (i != 4) {
                    long j9 = j;
                    long j10 = j2;
                    long j11 = j3;
                } else {
                    C10158o0.m30362a(i, j3, (OutputStream) this.f25169i);
                    long j12 = j;
                    long j13 = j2;
                }
            }
            return mo66131a(26, this.f25169i.toByteArray(), false, true, j4);
        } catch (Throwable th) {
            C10175u0.m30445b("MyTrackerRepository error: event serialization failed, type: 26", th);
            return false;
        }
    }

    /* renamed from: b */
    public boolean mo66150b(String str, String str2, long j) {
        try {
            this.f25169i.reset();
            for (int i : C10152n0.f25412h) {
                if (i == 1) {
                    C10158o0.m30365a(i, str, (OutputStream) this.f25169i);
                } else if (i == 2) {
                    if (!TextUtils.isEmpty(str2)) {
                        C10158o0.m30365a(i, str2, (OutputStream) this.f25169i);
                    }
                }
            }
            return mo66131a(2, this.f25169i.toByteArray(), true, false, j);
        } catch (Throwable th) {
            C10175u0.m30445b("MyTrackerRepository error: event serialization failed, type: 2", th);
            return false;
        }
    }

    /* renamed from: b */
    public boolean mo66151b(String str, String str2, long j, long j2, long j3) {
        try {
            this.f25169i.reset();
            for (int i : C10152n0.f25414j) {
                if (i == 1) {
                    String str3 = str2;
                    long j4 = j;
                    long j5 = j2;
                    String str4 = str;
                    C10158o0.m30365a(i, str, (OutputStream) this.f25169i);
                } else if (i == 2) {
                    long j6 = j;
                    long j7 = j2;
                    if (!TextUtils.isEmpty(str2)) {
                        String str5 = str2;
                        C10158o0.m30365a(i, str2, (OutputStream) this.f25169i);
                    } else {
                        String str6 = str2;
                    }
                    String str7 = str;
                } else if (i != 3) {
                    if (i != 4) {
                        String str8 = str;
                        String str9 = str2;
                        long j8 = j;
                    } else {
                        C10158o0.m30362a(i, j, (OutputStream) this.f25169i);
                        String str10 = str;
                        String str11 = str2;
                    }
                    long j9 = j2;
                } else {
                    long j10 = j;
                    C10158o0.m30362a(i, j2, (OutputStream) this.f25169i);
                    String str12 = str;
                    String str13 = str2;
                }
            }
            return mo66131a(31, this.f25169i.toByteArray(), true, false, j3);
        } catch (Throwable th) {
            C10175u0.m30445b("MyTrackerRepository error: event serialization failed, type: 31", th);
            return false;
        }
    }

    /* renamed from: b */
    public boolean mo66152b(String str, String str2, Map<String, String> map, long j) {
        return mo66128a(8, str, str2, map, j);
    }

    /* renamed from: b */
    public boolean mo66153b(Map<String, String> map, long j) {
        try {
            this.f25169i.reset();
            for (int i : C10152n0.f25406b) {
                if (i == 1) {
                    m30030a(i, map, this.f25170j, (OutputStream) this.f25169i);
                }
            }
            return mo66130a(13, this.f25169i.toByteArray(), j);
        } catch (Throwable th) {
            C10175u0.m30445b("MyTrackerRepository error: event serialization failed, type: 13", th);
            return false;
        }
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.my.tracker.obfuscated.t$b<java.lang.String>, com.my.tracker.obfuscated.b0$a, java.lang.Long] */
    /* JADX WARNING: type inference failed for: r2v4 */
    /* JADX WARNING: type inference failed for: r2v5 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x009b A[Catch:{ all -> 0x005d, all -> 0x0119 }] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00c2 A[Catch:{ all -> 0x0109, all -> 0x0116 }] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0110 A[Catch:{ all -> 0x0109, all -> 0x0116 }] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x012a  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x013b  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x014c  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.p374my.tracker.obfuscated.C10170t.C10172b<java.lang.String> mo66154c() {
        /*
            r8 = this;
            java.lang.String r0 = "custom_events_skipped_count"
            android.content.Context r1 = r8.f25161a
            boolean r1 = com.p374my.tracker.obfuscated.C10170t.m30426a((android.content.Context) r1)
            r2 = 0
            if (r1 != 0) goto L_0x0011
            java.lang.String r0 = "MyTrackerRepository: no network connection"
            com.p374my.tracker.obfuscated.C10175u0.m30440a((java.lang.String) r0)
            return r2
        L_0x0011:
            java.io.ByteArrayOutputStream r1 = r8.f25169i     // Catch:{ all -> 0x0119 }
            r1.reset()     // Catch:{ all -> 0x0119 }
            java.io.ByteArrayOutputStream r1 = r8.f25170j     // Catch:{ all -> 0x0119 }
            r1.reset()     // Catch:{ all -> 0x0119 }
            java.io.ByteArrayOutputStream r1 = r8.f25171k     // Catch:{ all -> 0x0119 }
            r1.reset()     // Catch:{ all -> 0x0119 }
            java.io.ByteArrayOutputStream r1 = r8.f25169i     // Catch:{ all -> 0x0119 }
            java.io.ByteArrayOutputStream r3 = r8.f25170j     // Catch:{ all -> 0x0119 }
            com.my.tracker.obfuscated.m0 r1 = com.p374my.tracker.obfuscated.C10129m0.m30237a((java.io.ByteArrayOutputStream) r1, (java.io.ByteArrayOutputStream) r3)     // Catch:{ all -> 0x0119 }
            com.my.tracker.obfuscated.b0 r3 = r8.f25162b     // Catch:{ all -> 0x0119 }
            java.io.ByteArrayOutputStream r4 = r8.f25170j     // Catch:{ all -> 0x0119 }
            java.io.ByteArrayOutputStream r5 = r8.f25169i     // Catch:{ all -> 0x0119 }
            int r3 = m30027a((com.p374my.tracker.obfuscated.C10093b0) r3, (java.io.ByteArrayOutputStream) r4, (java.io.OutputStream) r5)     // Catch:{ all -> 0x0119 }
            com.my.tracker.obfuscated.b0 r4 = r8.f25162b     // Catch:{ all -> 0x0119 }
            java.io.ByteArrayOutputStream r5 = r8.f25170j     // Catch:{ all -> 0x0119 }
            java.io.ByteArrayOutputStream r6 = r8.f25171k     // Catch:{ all -> 0x0119 }
            java.io.ByteArrayOutputStream r7 = r8.f25169i     // Catch:{ all -> 0x0119 }
            int r4 = m30026a((com.p374my.tracker.obfuscated.C10093b0) r4, (java.io.ByteArrayOutputStream) r5, (java.io.ByteArrayOutputStream) r6, (java.io.OutputStream) r7)     // Catch:{ all -> 0x0119 }
            int r3 = r3 + r4
            if (r3 > 0) goto L_0x0047
            java.lang.String r0 = "MyTrackerRepository: no events to send"
            com.p374my.tracker.obfuscated.C10175u0.m30440a((java.lang.String) r0)     // Catch:{ all -> 0x0119 }
            return r2
        L_0x0047:
            java.io.ByteArrayOutputStream r3 = r8.f25169i     // Catch:{ all -> 0x0119 }
            byte[] r3 = r3.toByteArray()     // Catch:{ all -> 0x0119 }
            r1.mo66274a((byte[]) r3)     // Catch:{ all -> 0x0119 }
            com.my.tracker.obfuscated.v0 r3 = r8.f25163c     // Catch:{ all -> 0x0119 }
            com.my.tracker.MyTrackerConfig$InstalledPackagesProvider r3 = r3.mo66420g()     // Catch:{ all -> 0x0119 }
            if (r3 == 0) goto L_0x0062
            java.util.List r3 = r3.getInstalledPackages()     // Catch:{ all -> 0x005d }
            goto L_0x0063
        L_0x005d:
            java.lang.String r3 = "MyTrackerRepository error: exception at InstalledPackagesProvider::getInstalledPackages()"
            com.p374my.tracker.obfuscated.C10175u0.m30444b(r3)     // Catch:{ all -> 0x0119 }
        L_0x0062:
            r3 = r2
        L_0x0063:
            com.my.tracker.obfuscated.n r4 = r8.f25164d     // Catch:{ all -> 0x0119 }
            com.my.tracker.obfuscated.v0 r5 = r8.f25163c     // Catch:{ all -> 0x0119 }
            boolean r5 = r5.mo66427n()     // Catch:{ all -> 0x0119 }
            com.my.tracker.obfuscated.v0 r6 = r8.f25163c     // Catch:{ all -> 0x0119 }
            boolean r6 = r6.mo66429p()     // Catch:{ all -> 0x0119 }
            r4.mo66346a(r3, r5, r6)     // Catch:{ all -> 0x0119 }
            com.my.tracker.obfuscated.n r3 = r8.f25164d     // Catch:{ all -> 0x0119 }
            android.content.Context r4 = r8.f25161a     // Catch:{ all -> 0x0119 }
            r3.mo66344a((android.content.Context) r4)     // Catch:{ all -> 0x0119 }
            com.my.tracker.obfuscated.n r3 = r8.f25164d     // Catch:{ all -> 0x0119 }
            android.content.Context r4 = r8.f25161a     // Catch:{ all -> 0x0119 }
            r3.mo66345a(r1, r4)     // Catch:{ all -> 0x0119 }
            com.my.tracker.obfuscated.v0 r3 = r8.f25163c     // Catch:{ all -> 0x0119 }
            r3.mo66402a((com.p374my.tracker.obfuscated.C10129m0) r1)     // Catch:{ all -> 0x0119 }
            long r3 = r8.f25172l     // Catch:{ all -> 0x0119 }
            r1.mo66299e((long) r3)     // Catch:{ all -> 0x0119 }
            long r3 = com.p374my.tracker.obfuscated.C10173t0.m30433a()     // Catch:{ all -> 0x0119 }
            r1.mo66304f((long) r3)     // Catch:{ all -> 0x0119 }
            com.my.tracker.obfuscated.b0 r3 = r8.f25162b     // Catch:{ all -> 0x0119 }
            java.lang.Long r3 = r3.mo66087b((java.lang.String) r0)     // Catch:{ all -> 0x0119 }
            if (r3 == 0) goto L_0x00a2
            int r3 = r3.intValue()     // Catch:{ all -> 0x0119 }
            r1.mo66312h((int) r3)     // Catch:{ all -> 0x0119 }
        L_0x00a2:
            java.lang.String r3 = "MyTrackerRepository: send events"
            com.p374my.tracker.obfuscated.C10175u0.m30440a((java.lang.String) r3)     // Catch:{ all -> 0x0119 }
            com.my.tracker.obfuscated.v0 r3 = r8.f25163c     // Catch:{ all -> 0x0119 }
            com.my.tracker.MyTrackerConfig$OkHttpClientProvider r3 = r3.mo66423j()     // Catch:{ all -> 0x0119 }
            r4 = 1
            com.my.tracker.obfuscated.t r1 = com.p374my.tracker.obfuscated.C10170t.m30425a(r1, r3, r4)     // Catch:{ all -> 0x0119 }
            com.my.tracker.obfuscated.v0 r3 = r8.f25163c     // Catch:{ all -> 0x0119 }
            java.lang.String r3 = r3.mo66424k()     // Catch:{ all -> 0x0119 }
            com.my.tracker.obfuscated.t$b r1 = r1.mo66167a((java.lang.String) r3)     // Catch:{ all -> 0x0119 }
            boolean r3 = r1.mo66385b()     // Catch:{ all -> 0x0116 }
            if (r3 == 0) goto L_0x0110
            java.lang.String r3 = "MyTrackerRepository: events were sent successfully"
            com.p374my.tracker.obfuscated.C10175u0.m30440a((java.lang.String) r3)     // Catch:{ all -> 0x0116 }
            com.my.tracker.obfuscated.n r3 = r8.f25164d     // Catch:{ all -> 0x0116 }
            android.content.Context r4 = r8.f25161a     // Catch:{ all -> 0x0116 }
            r3.mo66347b(r4)     // Catch:{ all -> 0x0116 }
            com.my.tracker.obfuscated.b0 r3 = r8.f25162b     // Catch:{ all -> 0x0116 }
            r3.mo66090c()     // Catch:{ all -> 0x0116 }
            com.my.tracker.obfuscated.b0 r3 = r8.f25162b     // Catch:{ all -> 0x0116 }
            r3.mo66088b()     // Catch:{ all -> 0x0116 }
            com.my.tracker.obfuscated.b0 r3 = r8.f25162b     // Catch:{ all -> 0x0116 }
            r3.mo66096e()     // Catch:{ all -> 0x0116 }
            com.my.tracker.obfuscated.b0 r3 = r8.f25162b     // Catch:{ all -> 0x0116 }
            r3.mo66093d()     // Catch:{ all -> 0x0116 }
            com.my.tracker.obfuscated.b0 r3 = r8.f25162b     // Catch:{ all -> 0x0116 }
            r3.mo66079a()     // Catch:{ all -> 0x0116 }
            com.my.tracker.obfuscated.b0 r3 = r8.f25162b     // Catch:{ all -> 0x0116 }
            r3.mo66083a((java.lang.String) r0, (java.lang.Long) r2)     // Catch:{ all -> 0x0116 }
            r3 = 0
            r8.f25173m = r3     // Catch:{ all -> 0x0116 }
            com.my.tracker.obfuscated.b0 r0 = r8.f25162b     // Catch:{ all -> 0x0109 }
            java.lang.String r5 = "default_session"
            com.my.tracker.obfuscated.b0$e r2 = r0.mo66078a((java.lang.String) r5)     // Catch:{ all -> 0x0109 }
            boolean r0 = r2.mo66102a()     // Catch:{ all -> 0x0109 }
            if (r0 == 0) goto L_0x0102
            long r3 = r2.mo66116d()     // Catch:{ all -> 0x0109 }
        L_0x0102:
            r8.mo66146b((long) r3)     // Catch:{ all -> 0x0109 }
            r2.close()     // Catch:{ all -> 0x0116 }
            goto L_0x0120
        L_0x0109:
            r0 = move-exception
            if (r2 == 0) goto L_0x010f
            r2.close()     // Catch:{ all -> 0x0116 }
        L_0x010f:
            throw r0     // Catch:{ all -> 0x0116 }
        L_0x0110:
            java.lang.String r0 = "MyTrackerRepository: failed to send events"
            com.p374my.tracker.obfuscated.C10175u0.m30440a((java.lang.String) r0)     // Catch:{ all -> 0x0116 }
            goto L_0x0120
        L_0x0116:
            r0 = move-exception
            r2 = r1
            goto L_0x011a
        L_0x0119:
            r0 = move-exception
        L_0x011a:
            java.lang.String r1 = "MyTrackerRepository error: can't send events: "
            com.p374my.tracker.obfuscated.C10175u0.m30445b(r1, r0)
            r1 = r2
        L_0x0120:
            java.io.ByteArrayOutputStream r0 = r8.f25169i
            int r0 = r0.size()
            r2 = 65536(0x10000, float:9.18355E-41)
            if (r0 <= r2) goto L_0x0131
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r0.<init>(r2)
            r8.f25169i = r0
        L_0x0131:
            java.io.ByteArrayOutputStream r0 = r8.f25170j
            int r0 = r0.size()
            r2 = 16384(0x4000, float:2.2959E-41)
            if (r0 <= r2) goto L_0x0142
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r0.<init>(r2)
            r8.f25170j = r0
        L_0x0142:
            java.io.ByteArrayOutputStream r0 = r8.f25171k
            int r0 = r0.size()
            r2 = 4096(0x1000, float:5.74E-42)
            if (r0 <= r2) goto L_0x0153
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r0.<init>(r2)
            r8.f25171k = r0
        L_0x0153:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p374my.tracker.obfuscated.C10105d0.mo66154c():com.my.tracker.obfuscated.t$b");
    }

    /* renamed from: c */
    public boolean mo66155c(long j, long j2) {
        try {
            this.f25169i.reset();
            for (int i : C10152n0.f25425u) {
                if (i == 2) {
                    C10158o0.m30362a(i, j, (OutputStream) this.f25169i);
                }
            }
            return mo66131a(29, this.f25169i.toByteArray(), false, true, j2);
        } catch (Throwable th) {
            C10175u0.m30445b("MyTrackerRepository error: event serialization failed, type: 29", th);
            return false;
        }
    }

    /* renamed from: d */
    public boolean mo66156d(long j, long j2) {
        long j3;
        C10093b0.C10098e eVar = null;
        try {
            eVar = this.f25162b.mo66078a("default_session");
            long j4 = 0;
            if (eVar.mo66102a()) {
                long b = eVar.mo66114b();
                long d = eVar.mo66116d();
                long e = eVar.mo66117e();
                if (this.f25172l == 0) {
                    mo66146b(d);
                }
                C10175u0.m30440a("MyTrackerRepository: finish previous session");
                if (j2 == 0) {
                    j3 = b;
                    this.f25162b.mo66082a(b, d - this.f25172l, true, 0);
                } else {
                    j3 = b;
                    C10093b0 b0Var = this.f25162b;
                    long j5 = this.f25172l;
                    long j6 = d - j5;
                    b0Var.mo66082a(j3, j6, false, j2 - j5);
                }
                long j7 = j3;
                long e2 = this.f25162b.mo66095e(j7);
                C10175u0.m30440a("MyTrackerRepository: session timestamps count: " + e2);
                long j8 = (long) this.f25167g;
                if (e2 > j8) {
                    j4 = this.f25162b.mo66085b(j7, e2 - j8);
                    C10175u0.m30440a("MyTrackerRepository: maximum count of session timestamps is exceeded, remove oldest timestamps, count: " + j4);
                }
                C10175u0.m30440a("MyTrackerRepository: start new session");
                this.f25162b.mo66081a(j7, j, e + j4);
            } else {
                C10175u0.m30440a("MyTrackerRepository: insert session");
                if (this.f25162b.mo66076a("default_session", j) == C10093b0.f25125v) {
                    C10175u0.m30444b("MyTrackerRepository error: session insertion failed ");
                    eVar.close();
                    return false;
                } else if (this.f25172l == 0) {
                    mo66146b(j);
                }
            }
            eVar.close();
            return true;
        } catch (Throwable th) {
            Throwable th2 = th;
            if (eVar != null) {
                eVar.close();
            }
            throw th2;
        }
    }
}

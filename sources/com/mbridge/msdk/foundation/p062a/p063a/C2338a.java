package com.mbridge.msdk.foundation.p062a.p063a;

import android.content.Context;
import android.content.SharedPreferences;
import com.mbridge.msdk.foundation.controller.C2350a;
import com.mbridge.msdk.foundation.controller.C2358b;
import com.mbridge.msdk.foundation.same.p300b.C8420c;
import com.mbridge.msdk.foundation.same.p300b.C8422e;
import com.mbridge.msdk.foundation.tools.C8608u;
import com.mbridge.msdk.foundation.tools.FastKV;

/* renamed from: com.mbridge.msdk.foundation.a.a.a */
/* compiled from: SharedPerferenceManager */
public class C2338a {

    /* renamed from: a */
    public static final String f4859a = C2338a.class.getSimpleName();

    /* renamed from: e */
    private static C2338a f4860e;

    /* renamed from: b */
    SharedPreferences f4861b;

    /* renamed from: c */
    FastKV f4862c;

    /* renamed from: d */
    private final boolean f4863d = C2358b.m5644a().mo15829d();

    private C2338a() {
    }

    /* renamed from: a */
    public static synchronized C2338a m5535a() {
        C2338a aVar;
        synchronized (C2338a.class) {
            if (f4860e == null) {
                f4860e = new C2338a();
            }
            aVar = f4860e;
        }
        return aVar;
    }

    /* renamed from: a */
    public final void mo15733a(String str, String str2) {
        try {
            Context g = C2350a.m5601e().mo15792g();
            if (g != null) {
                if (this.f4863d) {
                    if (this.f4862c == null) {
                        try {
                            this.f4862c = new FastKV.Builder(C8422e.m24335b(C8420c.MBRIDGE_700_CONFIG), "mbridge").build();
                        } catch (Exception unused) {
                            this.f4862c = null;
                        }
                    }
                }
                if (this.f4862c != null) {
                    try {
                        this.f4862c.putString(str, str2);
                    } catch (Exception unused2) {
                    }
                } else {
                    if (this.f4861b == null && g != null) {
                        this.f4861b = g.getSharedPreferences("mbridge", 0);
                    }
                    SharedPreferences.Editor edit = this.f4861b.edit();
                    edit.putString(str, str2);
                    edit.apply();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public final void mo15731a(String str, int i) {
        try {
            Context g = C2350a.m5601e().mo15792g();
            if (g != null) {
                if (this.f4863d) {
                    if (this.f4862c == null) {
                        try {
                            this.f4862c = new FastKV.Builder(C8422e.m24335b(C8420c.MBRIDGE_700_CONFIG), "mbridge").build();
                        } catch (Exception unused) {
                            this.f4862c = null;
                        }
                    }
                }
                if (this.f4862c != null) {
                    try {
                        this.f4862c.putInt(str, i);
                    } catch (Exception unused2) {
                    }
                } else {
                    if (this.f4861b == null && g != null) {
                        this.f4861b = g.getSharedPreferences("mbridge", 0);
                    }
                    SharedPreferences.Editor edit = this.f4861b.edit();
                    edit.putInt(str, i);
                    edit.apply();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public final void mo15732a(String str, long j) {
        try {
            Context g = C2350a.m5601e().mo15792g();
            if (g == null) {
                C8608u.m24884d(f4859a, "context is null in put");
                return;
            }
            if (this.f4863d) {
                if (this.f4862c == null) {
                    try {
                        this.f4862c = new FastKV.Builder(C8422e.m24335b(C8420c.MBRIDGE_700_CONFIG), "mbridge").build();
                    } catch (Exception unused) {
                        this.f4862c = null;
                    }
                }
            }
            if (this.f4862c != null) {
                try {
                    this.f4862c.putLong(str, j);
                } catch (Exception unused2) {
                }
            } else {
                if (this.f4861b == null && g != null) {
                    this.f4861b = g.getSharedPreferences("mbridge", 0);
                }
                SharedPreferences.Editor edit = this.f4861b.edit();
                edit.putLong(str, j);
                edit.apply();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:23|24|25) */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x004a, code lost:
        return 0L;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0046 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Long mo15730a(java.lang.String r7) {
        /*
            r6 = this;
            r0 = 0
            com.mbridge.msdk.foundation.controller.a r2 = com.mbridge.msdk.foundation.controller.C2350a.m5601e()     // Catch:{ Exception -> 0x0063 }
            android.content.Context r2 = r2.mo15792g()     // Catch:{ Exception -> 0x0063 }
            if (r2 != 0) goto L_0x0018
            java.lang.String r7 = f4859a     // Catch:{ Exception -> 0x0063 }
            java.lang.String r2 = "context is null in get"
            com.mbridge.msdk.foundation.tools.C8608u.m24884d(r7, r2)     // Catch:{ Exception -> 0x0063 }
            java.lang.Long r7 = java.lang.Long.valueOf(r0)     // Catch:{ Exception -> 0x0063 }
            return r7
        L_0x0018:
            boolean r3 = r6.f4863d     // Catch:{ Exception -> 0x0063 }
            java.lang.String r4 = "mbridge"
            if (r3 == 0) goto L_0x0037
            com.mbridge.msdk.foundation.tools.FastKV r3 = r6.f4862c     // Catch:{ Exception -> 0x0063 }
            if (r3 != 0) goto L_0x0037
            com.mbridge.msdk.foundation.tools.FastKV$Builder r3 = new com.mbridge.msdk.foundation.tools.FastKV$Builder     // Catch:{ Exception -> 0x0034 }
            com.mbridge.msdk.foundation.same.b.c r5 = com.mbridge.msdk.foundation.same.p300b.C8420c.MBRIDGE_700_CONFIG     // Catch:{ Exception -> 0x0034 }
            java.lang.String r5 = com.mbridge.msdk.foundation.same.p300b.C8422e.m24335b(r5)     // Catch:{ Exception -> 0x0034 }
            r3.<init>(r5, r4)     // Catch:{ Exception -> 0x0034 }
            com.mbridge.msdk.foundation.tools.FastKV r3 = r3.build()     // Catch:{ Exception -> 0x0034 }
            r6.f4862c = r3     // Catch:{ Exception -> 0x0034 }
            goto L_0x0037
        L_0x0034:
            r3 = 0
            r6.f4862c = r3     // Catch:{ Exception -> 0x0063 }
        L_0x0037:
            com.mbridge.msdk.foundation.tools.FastKV r3 = r6.f4862c     // Catch:{ Exception -> 0x0063 }
            if (r3 == 0) goto L_0x004b
            com.mbridge.msdk.foundation.tools.FastKV r2 = r6.f4862c     // Catch:{ Exception -> 0x0046 }
            long r2 = r2.getLong(r7, r0)     // Catch:{ Exception -> 0x0046 }
            java.lang.Long r7 = java.lang.Long.valueOf(r2)     // Catch:{ Exception -> 0x0046 }
            return r7
        L_0x0046:
            java.lang.Long r7 = java.lang.Long.valueOf(r0)     // Catch:{ Exception -> 0x0063 }
            return r7
        L_0x004b:
            android.content.SharedPreferences r3 = r6.f4861b     // Catch:{ Exception -> 0x0063 }
            if (r3 != 0) goto L_0x0058
            if (r2 == 0) goto L_0x0058
            r3 = 0
            android.content.SharedPreferences r2 = r2.getSharedPreferences(r4, r3)     // Catch:{ Exception -> 0x0063 }
            r6.f4861b = r2     // Catch:{ Exception -> 0x0063 }
        L_0x0058:
            android.content.SharedPreferences r2 = r6.f4861b     // Catch:{ Exception -> 0x0063 }
            long r2 = r2.getLong(r7, r0)     // Catch:{ Exception -> 0x0063 }
            java.lang.Long r7 = java.lang.Long.valueOf(r2)     // Catch:{ Exception -> 0x0063 }
            return r7
        L_0x0063:
            r7 = move-exception
            r7.printStackTrace()
            java.lang.Long r7 = java.lang.Long.valueOf(r0)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.p062a.p063a.C2338a.mo15730a(java.lang.String):java.lang.Long");
    }

    /* renamed from: b */
    public final int mo15734b(String str, int i) {
        try {
            Context g = C2350a.m5601e().mo15792g();
            if (g == null) {
                return i;
            }
            if (this.f4863d) {
                if (this.f4862c == null) {
                    try {
                        this.f4862c = new FastKV.Builder(C8422e.m24335b(C8420c.MBRIDGE_700_CONFIG), "mbridge").build();
                    } catch (Exception unused) {
                        this.f4862c = null;
                    }
                }
            }
            if (this.f4862c != null) {
                try {
                    return this.f4862c.getInt(str, i);
                } catch (Exception unused2) {
                    return i;
                }
            } else {
                if (this.f4861b == null) {
                    this.f4861b = g.getSharedPreferences("mbridge", 0);
                }
                return this.f4861b.getInt(str, i);
            }
        } catch (Exception e) {
            e.printStackTrace();
            return i;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:11|12|13|14) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0028 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo15735b(java.lang.String r6) {
        /*
            r5 = this;
            r0 = 0
            com.mbridge.msdk.foundation.controller.a r1 = com.mbridge.msdk.foundation.controller.C2350a.m5601e()     // Catch:{ Exception -> 0x004c }
            android.content.Context r1 = r1.mo15792g()     // Catch:{ Exception -> 0x004c }
            if (r1 != 0) goto L_0x000c
            return r0
        L_0x000c:
            boolean r2 = r5.f4863d     // Catch:{ Exception -> 0x004c }
            java.lang.String r3 = "mbridge"
            if (r2 == 0) goto L_0x002a
            com.mbridge.msdk.foundation.tools.FastKV r2 = r5.f4862c     // Catch:{ Exception -> 0x004c }
            if (r2 != 0) goto L_0x002a
            com.mbridge.msdk.foundation.tools.FastKV$Builder r2 = new com.mbridge.msdk.foundation.tools.FastKV$Builder     // Catch:{ Exception -> 0x0028 }
            com.mbridge.msdk.foundation.same.b.c r4 = com.mbridge.msdk.foundation.same.p300b.C8420c.MBRIDGE_700_CONFIG     // Catch:{ Exception -> 0x0028 }
            java.lang.String r4 = com.mbridge.msdk.foundation.same.p300b.C8422e.m24335b(r4)     // Catch:{ Exception -> 0x0028 }
            r2.<init>(r4, r3)     // Catch:{ Exception -> 0x0028 }
            com.mbridge.msdk.foundation.tools.FastKV r2 = r2.build()     // Catch:{ Exception -> 0x0028 }
            r5.f4862c = r2     // Catch:{ Exception -> 0x0028 }
            goto L_0x002a
        L_0x0028:
            r5.f4862c = r0     // Catch:{ Exception -> 0x004c }
        L_0x002a:
            com.mbridge.msdk.foundation.tools.FastKV r2 = r5.f4862c     // Catch:{ Exception -> 0x004c }
            java.lang.String r4 = ""
            if (r2 == 0) goto L_0x0038
            com.mbridge.msdk.foundation.tools.FastKV r0 = r5.f4862c     // Catch:{ Exception -> 0x0037 }
            java.lang.String r6 = r0.getString(r6, r4)     // Catch:{ Exception -> 0x0037 }
            return r6
        L_0x0037:
            return r4
        L_0x0038:
            android.content.SharedPreferences r2 = r5.f4861b     // Catch:{ Exception -> 0x004c }
            if (r2 != 0) goto L_0x0045
            if (r1 == 0) goto L_0x0045
            r2 = 0
            android.content.SharedPreferences r1 = r1.getSharedPreferences(r3, r2)     // Catch:{ Exception -> 0x004c }
            r5.f4861b = r1     // Catch:{ Exception -> 0x004c }
        L_0x0045:
            android.content.SharedPreferences r1 = r5.f4861b     // Catch:{ Exception -> 0x004c }
            java.lang.String r6 = r1.getString(r6, r4)     // Catch:{ Exception -> 0x004c }
            return r6
        L_0x004c:
            r6 = move-exception
            r6.printStackTrace()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.p062a.p063a.C2338a.mo15735b(java.lang.String):java.lang.String");
    }

    /* renamed from: c */
    public final void mo15736c(String str) {
        Context g = C2350a.m5601e().mo15792g();
        if (g != null) {
            if (this.f4863d && this.f4862c == null) {
                try {
                    this.f4862c = new FastKV.Builder(C8422e.m24335b(C8420c.MBRIDGE_700_CONFIG), "mbridge").build();
                } catch (Exception unused) {
                    this.f4862c = null;
                }
            }
            FastKV fastKV = this.f4862c;
            if (fastKV != null) {
                try {
                    fastKV.remove(str);
                } catch (Exception unused2) {
                }
            } else {
                if (this.f4861b == null && g != null) {
                    this.f4861b = g.getSharedPreferences("mbridge", 0);
                }
                this.f4861b.edit().remove(str).apply();
            }
        }
    }
}

package com.inmobi.media;

import android.content.Context;
import android.provider.Settings;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import java.security.MessageDigest;

/* renamed from: com.inmobi.media.iq */
/* compiled from: UidHelper */
public class C6269iq {

    /* renamed from: a */
    private static final String f15877a = C6269iq.class.getSimpleName();

    /* renamed from: b */
    private static C6268ip f15878b;

    /* renamed from: com.inmobi.media.iq$a */
    /* compiled from: UidHelper */
    static class C6270a {

        /* renamed from: a */
        static final C6269iq f15879a = new C6269iq((byte) 0);
    }

    /* synthetic */ C6269iq(byte b) {
        this();
    }

    /* renamed from: a */
    public static C6269iq m18729a() {
        return C6270a.f15879a;
    }

    private C6269iq() {
    }

    /* renamed from: b */
    public void mo35476b() {
        try {
            m18733i();
            mo35477c();
        } catch (Exception unused) {
        }
    }

    /* renamed from: c */
    public void mo35477c() {
        try {
            C6268ip e = mo35478e();
            if (e != null) {
                String b = e.mo35475b();
                if (b != null) {
                    C6238hu.m18605a((byte) 2, f15877a, "Publisher device Id is ".concat(String.valueOf(b)));
                    return;
                }
                return;
            }
            String d = m18731d();
            String str = f15877a;
            C6238hu.m18605a((byte) 2, str, "Publisher device Id is " + m18730a(d, "SHA-1"));
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    static String m18730a(String str, String str2) {
        if (str == null) {
            return "TEST_EMULATOR";
        }
        try {
            if ("".equals(str.trim())) {
                return "TEST_EMULATOR";
            }
            MessageDigest instance = MessageDigest.getInstance(str2);
            instance.update(str.getBytes());
            byte[] digest = instance.digest();
            StringBuilder sb = new StringBuilder();
            for (byte b : digest) {
                sb.append(Integer.toString((b & 255) + 256, 16).substring(1));
            }
            return sb.toString();
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: d */
    static String m18731d() {
        Context c = C6227ho.m18551c();
        if (c == null) {
            return "";
        }
        try {
            String string = Settings.Secure.getString(c.getContentResolver(), "android_id");
            return string == null ? Settings.System.getString(c.getContentResolver(), "android_id") : string;
        } catch (Exception unused) {
            return "";
        }
    }

    /* renamed from: e */
    public C6268ip mo35478e() {
        return f15878b;
    }

    /* renamed from: f */
    public void mo35479f() {
        if (f15878b == null) {
            return;
        }
        if (C6258ig.m18689b()) {
            f15878b.f15875a = null;
        } else if (f15878b.mo35475b() == null) {
            C6227ho.m18543a((Runnable) new Runnable() {
                public final void run() {
                    C6269iq.this.m18733i();
                }
            });
        }
    }

    /* renamed from: h */
    private static boolean m18732h() {
        try {
            AdvertisingIdClient.class.getName();
            return true;
        } catch (NoClassDefFoundError unused) {
            return false;
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m18733i() {
        /*
            r3 = this;
            android.content.Context r0 = com.inmobi.media.C6227ho.m18551c()     // Catch:{ Exception -> 0x0033 }
            if (r0 == 0) goto L_0x0033
            com.inmobi.media.ip r1 = new com.inmobi.media.ip     // Catch:{ Exception -> 0x0033 }
            r1.<init>()     // Catch:{ Exception -> 0x0033 }
            boolean r2 = m18732h()     // Catch:{ Exception -> 0x0033 }
            if (r2 == 0) goto L_0x0033
            com.google.android.gms.ads.identifier.AdvertisingIdClient$Info r0 = com.google.android.gms.ads.identifier.AdvertisingIdClient.getAdvertisingIdInfo(r0)     // Catch:{  }
            java.lang.String r2 = r0.getId()     // Catch:{  }
            r1.f15875a = r2     // Catch:{  }
            boolean r0 = r0.isLimitAdTrackingEnabled()     // Catch:{  }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{  }
            r1.mo35474a(r0)     // Catch:{  }
            f15878b = r1     // Catch:{  }
            boolean r0 = com.inmobi.media.C6258ig.m18689b()     // Catch:{  }
            if (r0 == 0) goto L_0x0033
            com.inmobi.media.ip r0 = f15878b     // Catch:{  }
            r1 = 0
            r0.f15875a = r1     // Catch:{  }
        L_0x0033:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C6269iq.m18733i():void");
    }

    /* renamed from: g */
    public Boolean mo35480g() {
        C6268ip e = m18729a().mo35478e();
        if (e == null) {
            return null;
        }
        return e.mo35473a();
    }
}

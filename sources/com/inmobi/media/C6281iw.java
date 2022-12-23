package com.inmobi.media;

import android.os.SystemClock;
import com.inmobi.media.C6145fs;
import com.inmobi.media.C6171ge;
import com.inmobi.media.C6273it;
import java.util.UUID;

/* renamed from: com.inmobi.media.iw */
/* compiled from: SignalsComponent */
public class C6281iw {

    /* renamed from: a */
    private static final String f15901a = C6281iw.class.getSimpleName();

    /* renamed from: b */
    private C6273it f15902b;

    /* renamed from: c */
    private boolean f15903c;

    /* renamed from: com.inmobi.media.iw$a */
    /* compiled from: SignalsComponent */
    static class C6282a {

        /* renamed from: a */
        static final C6281iw f15904a = new C6281iw((byte) 0);
    }

    /* synthetic */ C6281iw(byte b) {
        this();
    }

    private C6281iw() {
    }

    /* renamed from: a */
    public static C6281iw m18775a() {
        return C6282a.f15904a;
    }

    /* renamed from: b */
    public final synchronized void mo35494b() {
        C6145fs.m18321a("signals", C6227ho.m18559f(), (C6145fs.C6148c) null);
        C6259ih a = C6259ih.m18712a();
        a.f15865d = m18777e().sessionEnabled;
        if (!a.f15865d) {
            a.f15862a = null;
            a.f15863b = 0;
            a.f15864c = 0;
        }
        C6279iv a2 = C6279iv.m18765a();
        C6281iw iwVar = C6282a.f15904a;
        if (m18777e().sessionEnabled) {
            C6259ih.m18712a().f15862a = UUID.randomUUID().toString();
            C6259ih.m18712a().f15863b = System.currentTimeMillis();
            C6259ih.m18712a().f15864c = 0;
            a2.f15899f = SystemClock.elapsedRealtime();
            a2.f15894a = 0;
            a2.f15895b = 0;
            a2.f15896c = 0;
            a2.f15897d = 0;
            a2.f15898e = 0;
            a2.f15899f = 0;
        }
        if (m18780h()) {
            m18781i();
        }
        if (m18779g()) {
            C6275iu.m18752a().mo35484b();
        }
    }

    /* renamed from: c */
    public final synchronized void mo35495c() {
        C6279iv.m18765a();
        C6279iv.m18766b();
        if (this.f15903c) {
            this.f15903c = false;
            if (this.f15902b != null) {
                C6273it itVar = this.f15902b;
                boolean unused = itVar.f15883a.f15884a = true;
                C6273it.C6274a aVar = itVar.f15883a;
                C6281iw iwVar = C6282a.f15904a;
                aVar.sendEmptyMessageDelayed(2, (long) (m18777e().stopRequestTimeout * 1000));
            }
        }
        C6275iu a = C6275iu.m18752a();
        if (C6275iu.m18756c()) {
            if (a.f15887a != null) {
                a.f15887a.removeUpdates(a);
            }
            if (a.f15888b != null) {
                a.f15888b.disconnect();
            }
        }
        a.f15888b = null;
    }

    /* renamed from: d */
    public static C6271ir m18776d() {
        return new C6271ir(((C6171ge) C6145fs.m18321a("signals", C6227ho.m18559f(), (C6145fs.C6148c) null)).mo35330f());
    }

    /* renamed from: a */
    public static C6171ge.C6174b m18774a(String str) {
        return ((C6171ge) C6145fs.m18321a("signals", str, (C6145fs.C6148c) null)).ice;
    }

    /* renamed from: e */
    public static C6171ge.C6174b m18777e() {
        return ((C6171ge) C6145fs.m18321a("signals", C6227ho.m18559f(), (C6145fs.C6148c) null)).ice;
    }

    /* renamed from: f */
    public static C6171ge.C6175c m18778f() {
        return ((C6171ge) C6145fs.m18321a("signals", C6227ho.m18559f(), (C6145fs.C6148c) null)).unifiedIdServiceConfig;
    }

    /* renamed from: i */
    private synchronized void m18781i() {
        if (!this.f15903c) {
            this.f15903c = true;
            if (this.f15902b == null) {
                this.f15902b = new C6273it();
            }
            this.f15902b.mo35482a();
        }
    }

    /* renamed from: g */
    static boolean m18779g() {
        String m = C6227ho.m18568m();
        C6293jd c = C6295jf.m18826c();
        String e = c != null ? c.mo35519e() : null;
        return (m == null || m18774a(m).locationEnabled) && (e == null || c.mo35515a()) && (!(c != null && c.mo35518d()) || m18774a(e).locationEnabled);
    }

    /* renamed from: h */
    public static boolean m18780h() {
        String m = C6227ho.m18568m();
        C6293jd c = C6295jf.m18826c();
        String e = c != null ? c.mo35519e() : null;
        return (m == null || m18774a(m).f15622w.vwe) && (e == null || c.mo35516b()) && (!(c != null && c.mo35518d()) || m18774a(e).f15622w.vwe);
    }
}

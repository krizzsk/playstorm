package com.mbridge.msdk.foundation.same.p300b;

import android.util.Log;
import com.mbridge.msdk.foundation.controller.C2350a;
import com.mbridge.msdk.foundation.tools.C8608u;
import com.mbridge.msdk.foundation.tools.C8610w;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.mbridge.msdk.foundation.same.b.e */
/* compiled from: MBridgeDirManager */
public final class C8422e {

    /* renamed from: c */
    private static C8422e f20382c;

    /* renamed from: a */
    private C8419b f20383a;

    /* renamed from: b */
    private ArrayList<C8423a> f20384b = new ArrayList<>();

    private C8422e(C8419b bVar) {
        this.f20383a = bVar;
    }

    /* renamed from: a */
    public static synchronized void m24333a(C8419b bVar) {
        synchronized (C8422e.class) {
            if (f20382c == null) {
                f20382c = new C8422e(bVar);
            }
        }
    }

    /* renamed from: a */
    public static synchronized C8422e m24331a() {
        C8422e eVar;
        synchronized (C8422e.class) {
            if (f20382c == null && C2350a.m5601e().mo15792g() != null) {
                C8610w.m24892a(C2350a.m5601e().mo15792g());
            }
            if (f20382c == null) {
                Log.e("MBridgeDirManager", "mDirectoryManager == null");
            }
            eVar = f20382c;
        }
        return eVar;
    }

    /* renamed from: a */
    public static File m24332a(C8420c cVar) {
        try {
            if (m24331a() == null || m24331a().f20384b == null || m24331a().f20384b.size() <= 0) {
                return null;
            }
            Iterator<C8423a> it = m24331a().f20384b.iterator();
            while (it.hasNext()) {
                C8423a next = it.next();
                if (next.f20385a.equals(cVar)) {
                    return next.f20386b;
                }
            }
            return null;
        } catch (Throwable th) {
            C8608u.m24881a("MBridgeDirManager", th.getMessage(), th);
            return null;
        }
    }

    /* renamed from: b */
    public static String m24335b(C8420c cVar) {
        File a = m24332a(cVar);
        if (a != null) {
            return a.getAbsolutePath();
        }
        return null;
    }

    /* renamed from: b */
    public final boolean mo57502b() {
        return m24334a(this.f20383a.mo57499a());
    }

    /* renamed from: a */
    private boolean m24334a(C8418a aVar) {
        String str;
        C8418a c = aVar.mo57497c();
        if (c == null) {
            str = aVar.mo57496b();
        } else {
            File a = m24332a(c.mo57491a());
            if (a == null) {
                return false;
            }
            str = a.getAbsolutePath() + File.separator + aVar.mo57496b();
        }
        File file = new File(str);
        if (!(!file.exists() ? file.mkdirs() : true)) {
            return false;
        }
        this.f20384b.add(new C8423a(aVar.mo57491a(), file));
        List<C8418a> d = aVar.mo57498d();
        if (d != null) {
            for (C8418a a2 : d) {
                if (!m24334a(a2)) {
                    return false;
                }
            }
        }
        return true;
    }

    /* renamed from: com.mbridge.msdk.foundation.same.b.e$a */
    /* compiled from: MBridgeDirManager */
    private static final class C8423a {

        /* renamed from: a */
        public C8420c f20385a;

        /* renamed from: b */
        public File f20386b;

        public C8423a(C8420c cVar, File file) {
            this.f20385a = cVar;
            this.f20386b = file;
        }
    }
}

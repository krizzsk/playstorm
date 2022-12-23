package com.inmobi.media;

import androidx.browser.trusted.sharing.ShareTarget;
import com.inmobi.media.C6171ge;
import com.inmobi.unifiedId.InMobiUnifiedIdInterface;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

/* renamed from: com.inmobi.media.jm */
/* compiled from: UnifiedIDNetworkInterface */
public final class C6312jm {

    /* renamed from: a */
    static Set<InMobiUnifiedIdInterface> f15969a = new LinkedHashSet();

    /* renamed from: b */
    static C6314jo f15970b;

    /* renamed from: c */
    private static final Object f15971c = new Object();

    private C6312jm() {
    }

    /* renamed from: a */
    public static void m18878a() {
        synchronized (f15971c) {
            if (m18881c()) {
                f15970b.mo35339b();
            }
        }
        m18883e();
    }

    /* renamed from: e */
    private static void m18883e() {
        C6281iw.m18775a();
        C6171ge.C6175c f = C6281iw.m18778f();
        synchronized (f15971c) {
            String str = f.url;
            C6281iw.m18775a();
            f15970b = new C6314jo(ShareTarget.METHOD_POST, str, C6281iw.m18776d(), C6227ho.m18559f(), f.maxRetries, f.retryInterval, f.timeout);
            C6202gt gtVar = new C6202gt(new C6313jn(f15970b, f15969a), f15970b, JSONObject.class);
            C6218hh.m18506a().mo35424a("UnifiedIdNetworkCallRequested", (Map<String, Object>) new HashMap());
            gtVar.mo35379a();
        }
    }

    /* renamed from: a */
    public static void m18879a(InMobiUnifiedIdInterface inMobiUnifiedIdInterface) {
        if (inMobiUnifiedIdInterface != null) {
            f15969a.add(inMobiUnifiedIdInterface);
        }
        if (!m18881c()) {
            m18883e();
        }
    }

    /* renamed from: b */
    public static void m18880b() {
        synchronized (f15971c) {
            if (f15970b != null) {
                f15970b.mo35339b();
                f15970b = null;
            }
            f15969a.clear();
        }
    }

    /* renamed from: c */
    public static boolean m18881c() {
        boolean z;
        synchronized (f15971c) {
            z = f15970b != null && !f15970b.f15728a.get();
        }
        return z;
    }

    /* renamed from: d */
    protected static void m18882d() {
        synchronized (f15971c) {
            f15970b = null;
        }
    }
}

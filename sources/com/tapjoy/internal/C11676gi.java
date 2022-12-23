package com.tapjoy.internal;

import android.os.SystemClock;
import com.facebook.login.LoginLogger;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import javax.annotation.Nullable;

/* renamed from: com.tapjoy.internal.gi */
public abstract class C11676gi {
    @Nullable

    /* renamed from: a */
    static Set<String> f28405a = null;

    /* renamed from: b */
    private static final ThreadLocal<Map<String, C11678a>> f28406b = new ThreadLocal<Map<String, C11678a>>() {
        /* access modifiers changed from: protected */
        public final /* synthetic */ Object initialValue() {
            return new HashMap();
        }
    };

    /* renamed from: c */
    private static C11676gi f28407c;

    /* renamed from: d */
    private static volatile boolean f28408d = false;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo72560a();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo72561a(long j);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo72562a(long j, String str, @Nullable String str2, @Nullable Map<String, Long> map);

    /* renamed from: a */
    public static void m33879a(C11680gk gkVar) {
        if (f28407c == null) {
            f28407c = gkVar;
            if (f28408d) {
                gkVar.mo72561a(C11841u.m34410b());
            }
        }
    }

    /* renamed from: a */
    public static void m33884a(boolean z) {
        if (f28408d != z) {
            f28408d = z;
            C11676gi giVar = f28407c;
            if (giVar == null) {
                return;
            }
            if (z) {
                giVar.mo72561a(C11841u.m34410b());
            } else {
                giVar.mo72560a();
            }
        }
    }

    /* renamed from: a */
    public static void m33883a(Collection<String> collection) {
        if (collection == null || collection.isEmpty()) {
            f28405a = null;
        } else {
            f28405a = new HashSet(collection);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static void m33886b(String str, @Nullable String str2, @Nullable Map<String, Long> map) {
        C11676gi giVar;
        Set<String> set = f28405a;
        if ((set == null || !set.contains(str)) && f28408d && (giVar = f28407c) != null) {
            giVar.mo72562a(C11841u.m34410b(), str, str2, map);
        }
    }

    /* renamed from: a */
    public static void m33882a(String str, @Nullable TreeMap<String, Object> treeMap, @Nullable Map<String, Long> map) {
        m33886b(str, treeMap != null ? C11443bb.m33243a((Object) treeMap) : null, map);
    }

    /* renamed from: a */
    public static C11678a m33878a(String str) {
        C11678a a = new C11678a(str).mo72564a();
        f28406b.get().put(str, a);
        return a;
    }

    /* renamed from: b */
    public static C11678a m33885b(String str) {
        C11678a aVar = (C11678a) f28406b.get().remove(str);
        return aVar != null ? aVar.mo72569b() : new C11678a(str);
    }

    /* renamed from: c */
    public static C11678a m33887c(String str) {
        return (C11678a) f28406b.get().get(str);
    }

    /* renamed from: d */
    public static C11678a m33888d(String str) {
        return (C11678a) f28406b.get().remove(str);
    }

    /* renamed from: a */
    public static void m33880a(String str, C11678a aVar) {
        if (aVar == null) {
            Object[] objArr = new Object[1];
        } else if (str.equals(aVar.f28409a)) {
            f28406b.get().put(str, aVar);
        } else {
            Object[] objArr2 = new Object[2];
            String str2 = aVar.f28409a;
        }
    }

    /* renamed from: e */
    public static C11678a m33889e(String str) {
        return new C11678a(str);
    }

    /* renamed from: com.tapjoy.internal.gi$a */
    public static final class C11678a {

        /* renamed from: a */
        final String f28409a;

        /* renamed from: b */
        private final TreeMap<String, Object> f28410b = new TreeMap<>();

        /* renamed from: c */
        private final Map<String, Long> f28411c = new HashMap();

        /* renamed from: d */
        private volatile long f28412d;

        C11678a(String str) {
            this.f28409a = str;
        }

        /* renamed from: a */
        public final C11678a mo72564a() {
            try {
                this.f28412d = SystemClock.elapsedRealtime();
            } catch (NullPointerException unused) {
                this.f28412d = -1;
            }
            return this;
        }

        /* renamed from: b */
        public final C11678a mo72569b() {
            long j = this.f28412d;
            if (j != -1) {
                try {
                    mo72566a("spent_time", SystemClock.elapsedRealtime() - j);
                } catch (NullPointerException unused) {
                }
            }
            return this;
        }

        /* renamed from: a */
        public final C11678a mo72567a(String str, Object obj) {
            this.f28410b.put(str, obj);
            return this;
        }

        /* renamed from: a */
        public final C11678a mo72568a(Map<String, Object> map) {
            if (map != null) {
                this.f28410b.putAll(map);
            }
            return this;
        }

        /* renamed from: a */
        public final C11678a mo72565a(String str) {
            this.f28410b.put(LoginLogger.EVENT_EXTRAS_FAILURE, str);
            return this;
        }

        /* renamed from: b */
        public final C11678a mo72570b(String str) {
            this.f28410b.put("misuse", str);
            return this;
        }

        /* renamed from: a */
        public final C11678a mo72566a(String str, long j) {
            this.f28411c.put(str, Long.valueOf(j));
            return this;
        }

        /* renamed from: b */
        public final C11678a mo72571b(Map<String, Long> map) {
            if (map != null) {
                this.f28411c.putAll(map);
            }
            return this;
        }

        /* renamed from: c */
        public final void mo72572c() {
            String str = this.f28409a;
            Map<String, Long> map = null;
            String a = this.f28410b.size() > 0 ? C11443bb.m33243a((Object) this.f28410b) : null;
            if (this.f28411c.size() > 0) {
                map = this.f28411c;
            }
            C11676gi.m33886b(str, a, map);
        }
    }
}

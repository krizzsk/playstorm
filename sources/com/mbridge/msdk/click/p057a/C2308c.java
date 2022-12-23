package com.mbridge.msdk.click.p057a;

import com.mbridge.msdk.foundation.same.p299a.C8416c;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashMap;

/* renamed from: com.mbridge.msdk.click.a.c */
/* compiled from: WaitRetryLruMemoryCache */
public final class C2308c implements C8416c<String, C2307b> {

    /* renamed from: a */
    private final LinkedHashMap<String, C2307b> f4761a;

    /* renamed from: b */
    private final int f4762b;

    /* renamed from: c */
    private int f4763c;

    public C2308c(int i) {
        if (i > 0) {
            this.f4762b = i;
            this.f4761a = new LinkedHashMap<>(0, 0.75f, true);
            return;
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }

    /* renamed from: a */
    public final C2307b mo15677b(String str) {
        if (str != null) {
            synchronized (this) {
                C2307b bVar = this.f4761a.get(str);
                if (bVar != null) {
                    return bVar;
                }
                return null;
            }
        }
        throw new NullPointerException("key == null");
    }

    /* renamed from: a */
    public final boolean mo15675a(String str, C2307b bVar) {
        if (str == null || bVar == null) {
            throw new NullPointerException("key == null || value == null");
        }
        synchronized (this) {
            this.f4763c++;
            if (((C2307b) this.f4761a.put(str, bVar)) != null) {
                this.f4763c--;
            }
        }
        m5435a(this.f4762b);
        return true;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:17|18|19|20) */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x006b, code lost:
        throw new java.lang.IllegalStateException(getClass().getName() + ".sizeOf() is reporting inconsistent results!");
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x0049 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m5435a(int r3) {
        /*
            r2 = this;
        L_0x0000:
            monitor-enter(r2)
            int r0 = r2.f4763c     // Catch:{ all -> 0x006c }
            if (r0 < 0) goto L_0x004d
            java.util.LinkedHashMap<java.lang.String, com.mbridge.msdk.click.a.b> r0 = r2.f4761a     // Catch:{ all -> 0x006c }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x006c }
            if (r0 == 0) goto L_0x0011
            int r0 = r2.f4763c     // Catch:{ all -> 0x006c }
            if (r0 != 0) goto L_0x004d
        L_0x0011:
            int r0 = r2.f4763c     // Catch:{ all -> 0x006c }
            if (r0 <= r3) goto L_0x004b
            java.util.LinkedHashMap<java.lang.String, com.mbridge.msdk.click.a.b> r0 = r2.f4761a     // Catch:{ all -> 0x006c }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x006c }
            if (r0 == 0) goto L_0x001e
            goto L_0x004b
        L_0x001e:
            java.util.LinkedHashMap<java.lang.String, com.mbridge.msdk.click.a.b> r0 = r2.f4761a     // Catch:{ all -> 0x006c }
            java.util.Set r0 = r0.entrySet()     // Catch:{ all -> 0x006c }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x006c }
            java.lang.Object r0 = r0.next()     // Catch:{ all -> 0x006c }
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch:{ all -> 0x006c }
            if (r0 != 0) goto L_0x0032
            monitor-exit(r2)     // Catch:{ all -> 0x006c }
            goto L_0x004c
        L_0x0032:
            java.lang.Object r1 = r0.getKey()     // Catch:{ all -> 0x006c }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x006c }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x006c }
            com.mbridge.msdk.click.a.b r0 = (com.mbridge.msdk.click.p057a.C2307b) r0     // Catch:{ all -> 0x006c }
            java.util.LinkedHashMap<java.lang.String, com.mbridge.msdk.click.a.b> r0 = r2.f4761a     // Catch:{ all -> 0x0049 }
            r0.remove(r1)     // Catch:{ all -> 0x0049 }
            int r0 = r2.f4763c     // Catch:{ all -> 0x0049 }
            int r0 = r0 + -1
            r2.f4763c = r0     // Catch:{ all -> 0x0049 }
        L_0x0049:
            monitor-exit(r2)     // Catch:{ all -> 0x006c }
            goto L_0x0000
        L_0x004b:
            monitor-exit(r2)     // Catch:{ all -> 0x006c }
        L_0x004c:
            return
        L_0x004d:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException     // Catch:{ all -> 0x006c }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x006c }
            r0.<init>()     // Catch:{ all -> 0x006c }
            java.lang.Class r1 = r2.getClass()     // Catch:{ all -> 0x006c }
            java.lang.String r1 = r1.getName()     // Catch:{ all -> 0x006c }
            r0.append(r1)     // Catch:{ all -> 0x006c }
            java.lang.String r1 = ".sizeOf() is reporting inconsistent results!"
            r0.append(r1)     // Catch:{ all -> 0x006c }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x006c }
            r3.<init>(r0)     // Catch:{ all -> 0x006c }
            throw r3     // Catch:{ all -> 0x006c }
        L_0x006c:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x006c }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.click.p057a.C2308c.m5435a(int):void");
    }

    /* renamed from: b */
    public final void mo15674a(String str) {
        if (str != null) {
            synchronized (this) {
                if (((C2307b) this.f4761a.remove(str)) != null) {
                    this.f4763c--;
                }
            }
            return;
        }
        throw new NullPointerException("key == null");
    }

    /* renamed from: a */
    public final Collection<String> mo15673a() {
        HashSet hashSet;
        synchronized (this) {
            hashSet = new HashSet(this.f4761a.keySet());
        }
        return hashSet;
    }

    /* renamed from: b */
    public final void mo15678b() {
        m5435a(-1);
    }

    public final synchronized String toString() {
        return String.format("LruCache[maxSize=%d]", new Object[]{Integer.valueOf(this.f4762b)});
    }
}

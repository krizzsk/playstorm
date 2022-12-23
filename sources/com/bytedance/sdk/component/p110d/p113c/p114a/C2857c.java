package com.bytedance.sdk.component.p110d.p113c.p114a;

import android.util.Log;
import java.lang.ref.SoftReference;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: com.bytedance.sdk.component.d.c.a.c */
/* compiled from: SoftLruCache */
public class C2857c<K, V> {

    /* renamed from: a */
    private final LinkedHashMap<K, SoftReference<V>> f6444a;

    /* renamed from: b */
    private int f6445b;

    /* renamed from: c */
    private int f6446c;

    /* renamed from: d */
    private int f6447d;

    /* renamed from: e */
    private int f6448e;

    /* renamed from: f */
    private int f6449f;

    /* renamed from: g */
    private int f6450g;

    /* renamed from: h */
    private int f6451h;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo17674a(boolean z, K k, V v, V v2) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public int mo17663b(K k, V v) {
        return 1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public V mo17675b(K k) {
        return null;
    }

    public C2857c(int i) {
        if (i > 0) {
            this.f6446c = i;
            this.f6444a = new LinkedHashMap<>(0, 0.75f, true);
            return;
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002a, code lost:
        r2 = mo17675b(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002e, code lost:
        if (r2 != null) goto L_0x0031;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0030, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0031, code lost:
        monitor-enter(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        r4.f6448e++;
        r1 = (java.lang.ref.SoftReference) r4.f6444a.put(r5, new java.lang.ref.SoftReference(r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0045, code lost:
        if (r1 == null) goto L_0x004b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0047, code lost:
        r0 = r1.get();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x004b, code lost:
        if (r0 == null) goto L_0x0053;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x004d, code lost:
        r4.f6444a.put(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0053, code lost:
        r4.f6445b += m7912c(r5, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x005c, code lost:
        monitor-exit(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x005d, code lost:
        if (r0 == null) goto L_0x0064;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x005f, code lost:
        mo17674a(false, r5, r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0063, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0064, code lost:
        mo17673a(r4.f6446c);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0069, code lost:
        return r2;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final V mo17671a(K r5) {
        /*
            r4 = this;
            if (r5 == 0) goto L_0x0070
            monitor-enter(r4)
            java.util.LinkedHashMap<K, java.lang.ref.SoftReference<V>> r0 = r4.f6444a     // Catch:{ all -> 0x006d }
            java.lang.Object r0 = r0.get(r5)     // Catch:{ all -> 0x006d }
            java.lang.ref.SoftReference r0 = (java.lang.ref.SoftReference) r0     // Catch:{ all -> 0x006d }
            r1 = 0
            if (r0 == 0) goto L_0x0022
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x006d }
            if (r0 == 0) goto L_0x001c
            int r5 = r4.f6450g     // Catch:{ all -> 0x006d }
            int r5 = r5 + 1
            r4.f6450g = r5     // Catch:{ all -> 0x006d }
            monitor-exit(r4)     // Catch:{ all -> 0x006d }
            return r0
        L_0x001c:
            java.util.LinkedHashMap<K, java.lang.ref.SoftReference<V>> r2 = r4.f6444a     // Catch:{ all -> 0x006d }
            r2.remove(r5)     // Catch:{ all -> 0x006d }
            goto L_0x0023
        L_0x0022:
            r0 = r1
        L_0x0023:
            int r2 = r4.f6451h     // Catch:{ all -> 0x006d }
            int r2 = r2 + 1
            r4.f6451h = r2     // Catch:{ all -> 0x006d }
            monitor-exit(r4)     // Catch:{ all -> 0x006d }
            java.lang.Object r2 = r4.mo17675b(r5)
            if (r2 != 0) goto L_0x0031
            return r1
        L_0x0031:
            monitor-enter(r4)
            int r1 = r4.f6448e     // Catch:{ all -> 0x006a }
            int r1 = r1 + 1
            r4.f6448e = r1     // Catch:{ all -> 0x006a }
            java.util.LinkedHashMap<K, java.lang.ref.SoftReference<V>> r1 = r4.f6444a     // Catch:{ all -> 0x006a }
            java.lang.ref.SoftReference r3 = new java.lang.ref.SoftReference     // Catch:{ all -> 0x006a }
            r3.<init>(r2)     // Catch:{ all -> 0x006a }
            java.lang.Object r1 = r1.put(r5, r3)     // Catch:{ all -> 0x006a }
            java.lang.ref.SoftReference r1 = (java.lang.ref.SoftReference) r1     // Catch:{ all -> 0x006a }
            if (r1 == 0) goto L_0x004b
            java.lang.Object r0 = r1.get()     // Catch:{ all -> 0x006a }
        L_0x004b:
            if (r0 == 0) goto L_0x0053
            java.util.LinkedHashMap<K, java.lang.ref.SoftReference<V>> r3 = r4.f6444a     // Catch:{ all -> 0x006a }
            r3.put(r5, r1)     // Catch:{ all -> 0x006a }
            goto L_0x005c
        L_0x0053:
            int r1 = r4.f6445b     // Catch:{ all -> 0x006a }
            int r3 = r4.m7912c(r5, r2)     // Catch:{ all -> 0x006a }
            int r1 = r1 + r3
            r4.f6445b = r1     // Catch:{ all -> 0x006a }
        L_0x005c:
            monitor-exit(r4)     // Catch:{ all -> 0x006a }
            if (r0 == 0) goto L_0x0064
            r1 = 0
            r4.mo17674a(r1, r5, r2, r0)
            return r0
        L_0x0064:
            int r5 = r4.f6446c
            r4.mo17673a((int) r5)
            return r2
        L_0x006a:
            r5 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x006a }
            throw r5
        L_0x006d:
            r5 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x006d }
            throw r5
        L_0x0070:
            java.lang.NullPointerException r5 = new java.lang.NullPointerException
            java.lang.String r0 = "key == null"
            r5.<init>(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.p110d.p113c.p114a.C2857c.mo17671a(java.lang.Object):java.lang.Object");
    }

    /* renamed from: a */
    public final V mo17672a(K k, V v) {
        if (k == null || v == null) {
            throw new NullPointerException("key == null || value == null");
        }
        V v2 = null;
        synchronized (this) {
            this.f6447d++;
            this.f6445b += m7912c(k, v);
            SoftReference softReference = (SoftReference) this.f6444a.put(k, new SoftReference(v));
            if (!(softReference == null || (v2 = softReference.get()) == null)) {
                this.f6445b -= m7912c(k, v2);
            }
        }
        if (v2 != null) {
            mo17674a(false, k, v2, v);
        }
        mo17673a(this.f6446c);
        return v2;
    }

    /* renamed from: a */
    public void mo17673a(int i) {
        Object key;
        Object obj;
        while (true) {
            synchronized (this) {
                if (this.f6445b >= 0) {
                    if (this.f6444a.isEmpty() && this.f6445b != 0) {
                        break;
                    } else if (this.f6445b > i) {
                        Map.Entry next = this.f6444a.entrySet().iterator().next();
                        if (next != null) {
                            key = next.getKey();
                            SoftReference softReference = (SoftReference) next.getValue();
                            this.f6444a.remove(key);
                            if (softReference != null) {
                                obj = softReference.get();
                                this.f6445b -= m7912c(key, obj);
                            } else {
                                obj = null;
                            }
                            this.f6449f++;
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                } else {
                    break;
                }
            }
            mo17674a(true, key, obj, (Object) null);
        }
        Log.e("LruCache", "oom maybe occured, clear cache. size= " + this.f6445b + ", maxSize: " + i);
        this.f6445b = 0;
        this.f6444a.clear();
    }

    /* renamed from: c */
    private int m7912c(K k, V v) {
        int b = mo17663b(k, v);
        if (b >= 0) {
            return b;
        }
        throw new IllegalStateException("Negative size: " + k + "=" + v);
    }

    public final synchronized String toString() {
        int i;
        i = this.f6450g + this.f6451h;
        return String.format("LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", new Object[]{Integer.valueOf(this.f6446c), Integer.valueOf(this.f6450g), Integer.valueOf(this.f6451h), Integer.valueOf(i != 0 ? (this.f6450g * 100) / i : 0)});
    }
}

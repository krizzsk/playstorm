package com.mbridge.msdk.foundation.same.p299a;

import android.graphics.Bitmap;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashMap;

/* renamed from: com.mbridge.msdk.foundation.same.a.a */
/* compiled from: LruMemoryCache */
public final class C8414a implements C8416c<String, Bitmap> {

    /* renamed from: a */
    private final LinkedHashMap<String, Bitmap> f20345a;

    /* renamed from: b */
    private final int f20346b;

    /* renamed from: c */
    private int f20347c;

    /* renamed from: a */
    public final /* synthetic */ void mo15674a(Object obj) {
        String str = (String) obj;
        if (str != null) {
            synchronized (this) {
                Bitmap bitmap = (Bitmap) this.f20345a.remove(str);
                if (bitmap != null) {
                    this.f20347c -= m24287b(str, bitmap);
                }
            }
            return;
        }
        throw new NullPointerException("key == null");
    }

    public C8414a(int i) {
        if (i > 0) {
            this.f20346b = i;
            this.f20345a = new LinkedHashMap<>(0, 0.75f, true);
            return;
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0016, code lost:
        return null;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.Bitmap mo15677b(java.lang.String r2) {
        /*
            r1 = this;
            if (r2 == 0) goto L_0x001b
            monitor-enter(r1)
            java.util.LinkedHashMap<java.lang.String, android.graphics.Bitmap> r0 = r1.f20345a     // Catch:{ all -> 0x0018 }
            java.lang.Object r2 = r0.get(r2)     // Catch:{ all -> 0x0018 }
            android.graphics.Bitmap r2 = (android.graphics.Bitmap) r2     // Catch:{ all -> 0x0018 }
            if (r2 == 0) goto L_0x0015
            boolean r0 = r2.isRecycled()     // Catch:{ all -> 0x0018 }
            if (r0 != 0) goto L_0x0015
            monitor-exit(r1)     // Catch:{ all -> 0x0018 }
            return r2
        L_0x0015:
            monitor-exit(r1)     // Catch:{ all -> 0x0018 }
            r2 = 0
            return r2
        L_0x0018:
            r2 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0018 }
            throw r2
        L_0x001b:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r0 = "key == null"
            r2.<init>(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.same.p299a.C8414a.mo15677b(java.lang.String):android.graphics.Bitmap");
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public boolean mo15675a(String str, Bitmap bitmap) {
        if (str == null || bitmap == null) {
            throw new NullPointerException("key == null || value == null");
        }
        synchronized (this) {
            this.f20347c += m24287b(str, bitmap);
            Bitmap bitmap2 = (Bitmap) this.f20345a.put(str, bitmap);
            if (bitmap2 != null) {
                this.f20347c -= m24287b(str, bitmap2);
            }
        }
        m24285a(this.f20346b);
        return true;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:17|18|19|20) */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0074, code lost:
        throw new java.lang.IllegalStateException(getClass().getName() + ".sizeOf() is reporting inconsistent results!");
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x0052 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m24285a(int r4) {
        /*
            r3 = this;
        L_0x0000:
            monitor-enter(r3)
            int r0 = r3.f20347c     // Catch:{ all -> 0x0075 }
            if (r0 < 0) goto L_0x0056
            java.util.LinkedHashMap<java.lang.String, android.graphics.Bitmap> r0 = r3.f20345a     // Catch:{ all -> 0x0075 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0075 }
            if (r0 == 0) goto L_0x0011
            int r0 = r3.f20347c     // Catch:{ all -> 0x0075 }
            if (r0 != 0) goto L_0x0056
        L_0x0011:
            int r0 = r3.f20347c     // Catch:{ all -> 0x0075 }
            if (r0 <= r4) goto L_0x0054
            java.util.LinkedHashMap<java.lang.String, android.graphics.Bitmap> r0 = r3.f20345a     // Catch:{ all -> 0x0075 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0075 }
            if (r0 == 0) goto L_0x001e
            goto L_0x0054
        L_0x001e:
            java.util.LinkedHashMap<java.lang.String, android.graphics.Bitmap> r0 = r3.f20345a     // Catch:{ all -> 0x0075 }
            java.util.Set r0 = r0.entrySet()     // Catch:{ all -> 0x0075 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x0075 }
            java.lang.Object r0 = r0.next()     // Catch:{ all -> 0x0075 }
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch:{ all -> 0x0075 }
            if (r0 != 0) goto L_0x0032
            monitor-exit(r3)     // Catch:{ all -> 0x0075 }
            goto L_0x0055
        L_0x0032:
            java.lang.Object r1 = r0.getKey()     // Catch:{ all -> 0x0075 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x0075 }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x0075 }
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0     // Catch:{ all -> 0x0075 }
            int r0 = r3.m24287b(r1, r0)     // Catch:{ all -> 0x0052 }
            java.util.LinkedHashMap<java.lang.String, android.graphics.Bitmap> r2 = r3.f20345a     // Catch:{ all -> 0x0052 }
            java.lang.Object r1 = r2.remove(r1)     // Catch:{ all -> 0x0052 }
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1     // Catch:{ all -> 0x0052 }
            r1.recycle()     // Catch:{ all -> 0x0052 }
            int r1 = r3.f20347c     // Catch:{ all -> 0x0052 }
            int r1 = r1 - r0
            r3.f20347c = r1     // Catch:{ all -> 0x0052 }
        L_0x0052:
            monitor-exit(r3)     // Catch:{ all -> 0x0075 }
            goto L_0x0000
        L_0x0054:
            monitor-exit(r3)     // Catch:{ all -> 0x0075 }
        L_0x0055:
            return
        L_0x0056:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0075 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0075 }
            r0.<init>()     // Catch:{ all -> 0x0075 }
            java.lang.Class r1 = r3.getClass()     // Catch:{ all -> 0x0075 }
            java.lang.String r1 = r1.getName()     // Catch:{ all -> 0x0075 }
            r0.append(r1)     // Catch:{ all -> 0x0075 }
            java.lang.String r1 = ".sizeOf() is reporting inconsistent results!"
            r0.append(r1)     // Catch:{ all -> 0x0075 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0075 }
            r4.<init>(r0)     // Catch:{ all -> 0x0075 }
            throw r4     // Catch:{ all -> 0x0075 }
        L_0x0075:
            r4 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0075 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.same.p299a.C8414a.m24285a(int):void");
    }

    /* renamed from: a */
    public final Collection<String> mo15673a() {
        HashSet hashSet;
        synchronized (this) {
            hashSet = new HashSet(this.f20345a.keySet());
        }
        return hashSet;
    }

    /* renamed from: b */
    public final void mo15678b() {
        m24285a(-1);
    }

    /* renamed from: b */
    private int m24287b(String str, Bitmap bitmap) {
        return bitmap.getRowBytes() * bitmap.getHeight();
    }

    public final synchronized String toString() {
        return String.format("LruCache[maxSize=%d]", new Object[]{Integer.valueOf(this.f20346b)});
    }
}

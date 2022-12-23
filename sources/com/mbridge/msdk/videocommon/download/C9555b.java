package com.mbridge.msdk.videocommon.download;

import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.C8608u;
import com.mbridge.msdk.videocommon.download.C9563g;
import java.util.Iterator;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.mbridge.msdk.videocommon.download.b */
/* compiled from: DownLoadH5SourceListener */
public final class C9555b implements C9563g.C9570c {

    /* renamed from: a */
    private static String f23503a = "DownLoadH5SourceListener";

    /* renamed from: b */
    private ConcurrentMap<String, C9555b> f23504b;

    /* renamed from: c */
    private C9578j f23505c;

    /* renamed from: d */
    private CopyOnWriteArrayList<C9563g.C9571d> f23506d;

    /* renamed from: e */
    private String f23507e;

    /* renamed from: a */
    public final void mo63220a() {
    }

    public C9555b(ConcurrentMap<String, C9555b> concurrentMap, C9578j jVar, C9563g.C9571d dVar, String str) {
        CopyOnWriteArrayList<C9563g.C9571d> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
        this.f23506d = copyOnWriteArrayList;
        this.f23504b = concurrentMap;
        this.f23505c = jVar;
        copyOnWriteArrayList.add(dVar);
        this.f23507e = str;
    }

    /* renamed from: a */
    public final void mo63221a(C9563g.C9571d dVar) {
        this.f23506d.add(dVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x009a  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo63223a(java.lang.String r2, byte[] r3, java.lang.String r4) {
        /*
            r1 = this;
            java.util.concurrent.ConcurrentMap<java.lang.String, com.mbridge.msdk.videocommon.download.b> r2 = r1.f23504b     // Catch:{ Exception -> 0x0075 }
            if (r2 != 0) goto L_0x0024
            java.util.concurrent.CopyOnWriteArrayList<com.mbridge.msdk.videocommon.download.g$d> r2 = r1.f23506d     // Catch:{ Exception -> 0x0075 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ Exception -> 0x0075 }
        L_0x000a:
            boolean r3 = r2.hasNext()     // Catch:{ Exception -> 0x0075 }
            if (r3 == 0) goto L_0x0023
            java.lang.Object r3 = r2.next()     // Catch:{ Exception -> 0x0075 }
            com.mbridge.msdk.videocommon.download.g$d r3 = (com.mbridge.msdk.videocommon.download.C9563g.C9571d) r3     // Catch:{ Exception -> 0x0075 }
            if (r3 == 0) goto L_0x000a
            java.lang.String r0 = "mResDownloadingMap  is null"
            r3.mo57996a(r4, r0)     // Catch:{ Exception -> 0x0075 }
            java.util.concurrent.CopyOnWriteArrayList<com.mbridge.msdk.videocommon.download.g$d> r0 = r1.f23506d     // Catch:{ Exception -> 0x0075 }
            r0.remove(r3)     // Catch:{ Exception -> 0x0075 }
            goto L_0x000a
        L_0x0023:
            return
        L_0x0024:
            java.util.concurrent.ConcurrentMap<java.lang.String, com.mbridge.msdk.videocommon.download.b> r2 = r1.f23504b     // Catch:{ Exception -> 0x0075 }
            boolean r2 = r2.containsKey(r4)     // Catch:{ Exception -> 0x0075 }
            if (r2 == 0) goto L_0x0031
            java.util.concurrent.ConcurrentMap<java.lang.String, com.mbridge.msdk.videocommon.download.b> r2 = r1.f23504b     // Catch:{ Exception -> 0x0075 }
            r2.remove(r4)     // Catch:{ Exception -> 0x0075 }
        L_0x0031:
            if (r3 == 0) goto L_0x0072
            int r2 = r3.length     // Catch:{ Exception -> 0x0075 }
            if (r2 <= 0) goto L_0x0072
            com.mbridge.msdk.videocommon.download.j r2 = r1.f23505c     // Catch:{ Exception -> 0x0075 }
            java.lang.String r2 = r2.mo63257a(r4, r3)     // Catch:{ Exception -> 0x0075 }
            boolean r3 = android.text.TextUtils.isEmpty(r2)     // Catch:{ Exception -> 0x0075 }
            if (r3 == 0) goto L_0x0060
            java.util.concurrent.CopyOnWriteArrayList<com.mbridge.msdk.videocommon.download.g$d> r2 = r1.f23506d     // Catch:{ Exception -> 0x0075 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ Exception -> 0x0075 }
        L_0x0048:
            boolean r3 = r2.hasNext()     // Catch:{ Exception -> 0x0075 }
            if (r3 == 0) goto L_0x005f
            java.lang.Object r3 = r2.next()     // Catch:{ Exception -> 0x0075 }
            com.mbridge.msdk.videocommon.download.g$d r3 = (com.mbridge.msdk.videocommon.download.C9563g.C9571d) r3     // Catch:{ Exception -> 0x0075 }
            if (r3 == 0) goto L_0x0048
            r3.mo57995a(r4)     // Catch:{ Exception -> 0x0075 }
            java.util.concurrent.CopyOnWriteArrayList<com.mbridge.msdk.videocommon.download.g$d> r0 = r1.f23506d     // Catch:{ Exception -> 0x0075 }
            r0.remove(r3)     // Catch:{ Exception -> 0x0075 }
            goto L_0x0048
        L_0x005f:
            return
        L_0x0060:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0075 }
            r3.<init>()     // Catch:{ Exception -> 0x0075 }
            java.lang.String r0 = "data save failed:"
            r3.append(r0)     // Catch:{ Exception -> 0x0075 }
            r3.append(r2)     // Catch:{ Exception -> 0x0075 }
            java.lang.String r2 = r3.toString()     // Catch:{ Exception -> 0x0075 }
            goto L_0x008e
        L_0x0072:
            java.lang.String r2 = "response data is error"
            goto L_0x008e
        L_0x0075:
            r2 = move-exception
            boolean r3 = com.mbridge.msdk.MBridgeConstans.DEBUG
            if (r3 == 0) goto L_0x007d
            r2.printStackTrace()
        L_0x007d:
            java.lang.String r2 = r2.getMessage()     // Catch:{ all -> 0x0082 }
            goto L_0x008e
        L_0x0082:
            r2 = move-exception
            java.lang.String r3 = f23503a
            java.lang.String r0 = r2.getMessage()
            com.mbridge.msdk.foundation.tools.C8608u.m24881a(r3, r0, r2)
            java.lang.String r2 = ""
        L_0x008e:
            java.util.concurrent.CopyOnWriteArrayList<com.mbridge.msdk.videocommon.download.g$d> r3 = r1.f23506d
            java.util.Iterator r3 = r3.iterator()
        L_0x0094:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x00a6
            java.lang.Object r0 = r3.next()
            com.mbridge.msdk.videocommon.download.g$d r0 = (com.mbridge.msdk.videocommon.download.C9563g.C9571d) r0
            if (r0 == 0) goto L_0x0094
            r0.mo57996a(r4, r2)
            goto L_0x0094
        L_0x00a6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.videocommon.download.C9555b.mo63223a(java.lang.String, byte[], java.lang.String):void");
    }

    /* renamed from: a */
    public final void mo63222a(String str) {
        try {
            if (this.f23504b == null) {
                Iterator<C9563g.C9571d> it = this.f23506d.iterator();
                while (it.hasNext()) {
                    C9563g.C9571d next = it.next();
                    if (next != null) {
                        next.mo57996a(this.f23507e, "mResDownloadingMap  is null");
                        this.f23506d.remove(next);
                    }
                }
                return;
            }
            if (this.f23504b.containsKey(this.f23507e)) {
                this.f23504b.remove(this.f23507e);
            }
            Iterator<C9563g.C9571d> it2 = this.f23506d.iterator();
            while (it2.hasNext()) {
                C9563g.C9571d next2 = it2.next();
                if (next2 != null) {
                    next2.mo57996a(this.f23507e, str);
                    this.f23506d.remove(next2);
                }
            }
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
            str = e.getMessage();
        } catch (Throwable th) {
            C8608u.m24881a(f23503a, th.getMessage(), th);
        }
    }
}

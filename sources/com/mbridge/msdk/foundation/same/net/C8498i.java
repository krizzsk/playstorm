package com.mbridge.msdk.foundation.same.net;

import com.mbridge.msdk.foundation.same.net.p305a.C8452a;
import com.mbridge.msdk.foundation.same.net.p309e.C8478b;
import com.mbridge.msdk.foundation.same.net.p309e.C8479c;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.mbridge.msdk.foundation.same.net.i */
/* compiled from: Request */
public abstract class C8498i<T> implements Comparable<C8498i<T>> {

    /* renamed from: c */
    private static final String f20576c = C8498i.class.getSimpleName();

    /* renamed from: a */
    protected ConcurrentHashMap<String, String> f20577a = new ConcurrentHashMap<>();

    /* renamed from: b */
    protected C8476e<T> f20578b = null;

    /* renamed from: d */
    private final int f20579d;

    /* renamed from: e */
    private final String f20580e;

    /* renamed from: f */
    private Integer f20581f;

    /* renamed from: g */
    private C8499j f20582g;

    /* renamed from: h */
    private boolean f20583h = false;

    /* renamed from: i */
    private C8502l f20584i;

    /* renamed from: j */
    private int f20585j = 2;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract C8501k<T> mo57571a(C8479c cVar);

    /* renamed from: e */
    public byte[] mo57578e() {
        return null;
    }

    public /* synthetic */ int compareTo(Object obj) {
        C8498i iVar = (C8498i) obj;
        int g = mo57573g();
        int g2 = iVar.mo57573g();
        return g == g2 ? this.f20581f.intValue() - iVar.f20581f.intValue() : g2 - g;
    }

    public C8498i(int i, String str, C8476e<T> eVar) {
        this.f20580e = str;
        this.f20579d = i;
        this.f20578b = eVar;
        this.f20584i = new C8453b();
    }

    public C8498i(int i, String str) {
        this.f20580e = str;
        this.f20579d = i;
        this.f20584i = new C8453b();
    }

    /* renamed from: a */
    public final int mo57610a() {
        return this.f20579d;
    }

    /* renamed from: a */
    public final void mo57616a(C8476e<T> eVar) {
        this.f20578b = eVar;
    }

    /* renamed from: a */
    public final C8498i<?> mo57613a(C8502l lVar) {
        this.f20584i = lVar;
        return this;
    }

    /* renamed from: a */
    public final void mo57618a(String str) {
        C8499j jVar = this.f20582g;
        if (jVar != null) {
            jVar.mo57639b(this);
        }
    }

    /* renamed from: a */
    public final C8498i<?> mo57612a(C8499j jVar) {
        this.f20582g = jVar;
        return this;
    }

    /* renamed from: a */
    public final C8498i<?> mo57611a(int i) {
        this.f20581f = Integer.valueOf(i);
        return this;
    }

    /* renamed from: b */
    public final String mo57620b() {
        return this.f20580e;
    }

    /* renamed from: c */
    public final boolean mo57622c() {
        return this.f20583h;
    }

    /* renamed from: d */
    public final Map<String, String> mo57624d() {
        return this.f20577a;
    }

    /* renamed from: f */
    public final void mo57625f() {
        mo57619a("Charset", "UTF-8");
        mo57619a("Connection", "close");
    }

    /* renamed from: a */
    public byte[] mo57572a(C8478b bVar, C8455c cVar) throws IOException, C8452a {
        return bVar.mo57584c() != null ? m24534a(bVar) : new byte[0];
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x005f A[SYNTHETIC, Splitter:B:37:0x005f] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0067 A[Catch:{ IOException -> 0x0063 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private byte[] m24534a(com.mbridge.msdk.foundation.same.net.p309e.C8478b r6) throws java.io.IOException, com.mbridge.msdk.foundation.same.net.p305a.C8452a {
        /*
            r5 = this;
            r0 = 0
            java.io.InputStream r1 = r6.mo57584c()     // Catch:{ all -> 0x005b }
            java.util.List r6 = r6.mo57583b()     // Catch:{ all -> 0x0056 }
            boolean r6 = com.mbridge.msdk.foundation.same.net.p310f.C8482b.m24486b(r6)     // Catch:{ all -> 0x0056 }
            if (r6 == 0) goto L_0x0019
            boolean r6 = r1 instanceof java.util.zip.GZIPInputStream     // Catch:{ all -> 0x0056 }
            if (r6 != 0) goto L_0x0019
            java.util.zip.GZIPInputStream r6 = new java.util.zip.GZIPInputStream     // Catch:{ all -> 0x0056 }
            r6.<init>(r1)     // Catch:{ all -> 0x0056 }
            r1 = r6
        L_0x0019:
            if (r1 == 0) goto L_0x004f
            java.io.ByteArrayOutputStream r6 = new java.io.ByteArrayOutputStream     // Catch:{ all -> 0x0056 }
            r6.<init>()     // Catch:{ all -> 0x0056 }
            r0 = 1024(0x400, float:1.435E-42)
            byte[] r0 = new byte[r0]     // Catch:{ all -> 0x004a }
        L_0x0024:
            int r2 = r1.read(r0)     // Catch:{ all -> 0x004a }
            r3 = -1
            if (r2 == r3) goto L_0x0030
            r3 = 0
            r6.write(r0, r3, r2)     // Catch:{ all -> 0x004a }
            goto L_0x0024
        L_0x0030:
            byte[] r0 = r6.toByteArray()     // Catch:{ all -> 0x004a }
            if (r1 == 0) goto L_0x003c
            r1.close()     // Catch:{ IOException -> 0x003a }
            goto L_0x003c
        L_0x003a:
            r6 = move-exception
            goto L_0x0040
        L_0x003c:
            r6.close()     // Catch:{ IOException -> 0x003a }
            goto L_0x0049
        L_0x0040:
            java.lang.String r1 = f20576c
            java.lang.String r6 = r6.getMessage()
            com.mbridge.msdk.foundation.tools.C8608u.m24884d(r1, r6)
        L_0x0049:
            return r0
        L_0x004a:
            r0 = move-exception
            r4 = r1
            r1 = r6
            r6 = r0
            goto L_0x0059
        L_0x004f:
            com.mbridge.msdk.foundation.same.net.a.a r6 = new com.mbridge.msdk.foundation.same.net.a.a     // Catch:{ all -> 0x0056 }
            r2 = 7
            r6.<init>(r2, r0)     // Catch:{ all -> 0x0056 }
            throw r6     // Catch:{ all -> 0x0056 }
        L_0x0056:
            r6 = move-exception
            r4 = r1
            r1 = r0
        L_0x0059:
            r0 = r4
            goto L_0x005d
        L_0x005b:
            r6 = move-exception
            r1 = r0
        L_0x005d:
            if (r0 == 0) goto L_0x0065
            r0.close()     // Catch:{ IOException -> 0x0063 }
            goto L_0x0065
        L_0x0063:
            r0 = move-exception
            goto L_0x006b
        L_0x0065:
            if (r1 == 0) goto L_0x0074
            r1.close()     // Catch:{ IOException -> 0x0063 }
            goto L_0x0074
        L_0x006b:
            java.lang.String r1 = f20576c
            java.lang.String r0 = r0.getMessage()
            com.mbridge.msdk.foundation.tools.C8608u.m24884d(r1, r0)
        L_0x0074:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.same.net.C8498i.m24534a(com.mbridge.msdk.foundation.same.net.e.b):byte[]");
    }

    /* renamed from: g */
    public int mo57573g() {
        return this.f20585j;
    }

    /* renamed from: b */
    public final void mo57621b(int i) {
        if (i >= 1 && i <= 4) {
            this.f20585j = i;
        }
    }

    /* renamed from: h */
    public final int mo57626h() {
        try {
            return this.f20584i.mo57543b();
        } catch (Exception unused) {
            return 10;
        }
    }

    /* renamed from: i */
    public final int mo57627i() {
        try {
            return this.f20584i.mo57545d();
        } catch (Exception unused) {
            return 10;
        }
    }

    /* renamed from: j */
    public final int mo57628j() {
        try {
            return this.f20584i.mo57546e();
        } catch (Exception unused) {
            return 10;
        }
    }

    /* renamed from: k */
    public final int mo57629k() {
        try {
            return this.f20584i.mo57547f();
        } catch (Exception unused) {
            return 10;
        }
    }

    /* renamed from: l */
    public final int mo57630l() {
        try {
            return this.f20584i.mo57548g();
        } catch (Exception unused) {
            return 0;
        }
    }

    /* renamed from: m */
    public final C8502l mo57631m() {
        return this.f20584i;
    }

    /* renamed from: a */
    public final void mo57617a(C8501k<T> kVar) {
        C8476e<T> eVar = this.f20578b;
        if (eVar != null) {
            eVar.mo57520a(kVar);
        }
    }

    /* renamed from: a */
    public final void mo57615a(C8452a aVar) {
        C8476e<T> eVar = this.f20578b;
        if (eVar != null) {
            eVar.mo57519a(aVar);
        }
    }

    /* renamed from: n */
    public final void mo57632n() {
        C8476e<T> eVar = this.f20578b;
        if (eVar != null) {
            eVar.mo57577c();
        }
    }

    /* renamed from: o */
    public final void mo57633o() {
        C8476e<T> eVar = this.f20578b;
        if (eVar != null) {
            eVar.mo57576a();
        }
    }

    /* renamed from: p */
    public final void mo57634p() {
        C8476e<T> eVar = this.f20578b;
        if (eVar != null) {
            eVar.mo57521b();
        }
    }

    /* renamed from: q */
    public final void mo57635q() {
        C8476e<T> eVar = this.f20578b;
        if (eVar != null) {
            eVar.mo57580e();
        }
    }

    /* renamed from: r */
    public final void mo57636r() {
        C8476e<T> eVar = this.f20578b;
        if (eVar != null) {
            eVar.mo57579d();
        }
    }

    /* renamed from: a */
    public final void mo57614a(long j, long j2) {
        C8476e<T> eVar = this.f20578b;
        if (eVar != null) {
            eVar.mo57518a(j, j2);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f20583h ? "[X] " : "[ ] ");
        sb.append(this.f20580e);
        sb.append(" ");
        sb.append(mo57573g());
        sb.append(" ");
        sb.append(this.f20581f);
        return sb.toString();
    }

    /* renamed from: a */
    public final void mo57619a(String str, String str2) {
        this.f20577a.remove(str);
        this.f20577a.put(str, str2);
    }
}

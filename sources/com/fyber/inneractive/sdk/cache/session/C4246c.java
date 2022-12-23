package com.fyber.inneractive.sdk.cache.session;

import com.fyber.inneractive.sdk.cache.session.enums.C4250a;
import com.fyber.inneractive.sdk.cache.session.enums.C4251b;

/* renamed from: com.fyber.inneractive.sdk.cache.session.c */
public class C4246c implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C4250a f10495a;

    /* renamed from: b */
    public final /* synthetic */ C4251b f10496b;

    /* renamed from: c */
    public final /* synthetic */ C4247d f10497c;

    public C4246c(C4247d dVar, C4250a aVar, C4251b bVar) {
        this.f10497c = dVar;
        this.f10495a = aVar;
        this.f10496b = bVar;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(11:2|3|(2:5|(2:7|(1:(2:10|(1:12)(1:13))(1:14))(1:15)))(1:16)|17|18|19|20|21|22|(1:24)|25) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x005c */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0062  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r7 = this;
            com.fyber.inneractive.sdk.cache.session.d r0 = r7.f10497c
            java.lang.Object r0 = r0.f10500c
            monitor-enter(r0)
            com.fyber.inneractive.sdk.cache.session.enums.a r1 = r7.f10495a     // Catch:{ all -> 0x0067 }
            com.fyber.inneractive.sdk.cache.session.enums.a r2 = com.fyber.inneractive.sdk.cache.session.enums.C4250a.NEW_SESSION     // Catch:{ all -> 0x0067 }
            if (r1 == r2) goto L_0x003a
            com.fyber.inneractive.sdk.cache.session.d r2 = r7.f10497c     // Catch:{ all -> 0x0067 }
            com.fyber.inneractive.sdk.cache.session.f r2 = r2.f10498a     // Catch:{ all -> 0x0067 }
            com.fyber.inneractive.sdk.cache.session.enums.b r3 = r7.f10496b     // Catch:{ all -> 0x0067 }
            java.util.HashMap<com.fyber.inneractive.sdk.cache.session.enums.b, com.fyber.inneractive.sdk.cache.session.e> r2 = r2.f10523a     // Catch:{ all -> 0x0067 }
            java.lang.Object r2 = r2.get(r3)     // Catch:{ all -> 0x0067 }
            com.fyber.inneractive.sdk.cache.session.e r2 = (com.fyber.inneractive.sdk.cache.session.C4249e) r2     // Catch:{ all -> 0x0067 }
            if (r2 == 0) goto L_0x0043
            int r1 = r1.ordinal()     // Catch:{ all -> 0x0067 }
            r3 = 1
            if (r1 == 0) goto L_0x0034
            if (r1 == r3) goto L_0x002e
            r4 = 2
            if (r1 == r4) goto L_0x0028
            goto L_0x0043
        L_0x0028:
            int r1 = r2.f10505c     // Catch:{ all -> 0x0067 }
            int r1 = r1 + r3
            r2.f10505c = r1     // Catch:{ all -> 0x0067 }
            goto L_0x0043
        L_0x002e:
            int r1 = r2.f10504b     // Catch:{ all -> 0x0067 }
            int r1 = r1 + r3
            r2.f10504b = r1     // Catch:{ all -> 0x0067 }
            goto L_0x0043
        L_0x0034:
            int r1 = r2.f10503a     // Catch:{ all -> 0x0067 }
            int r1 = r1 + r3
            r2.f10503a = r1     // Catch:{ all -> 0x0067 }
            goto L_0x0043
        L_0x003a:
            com.fyber.inneractive.sdk.cache.session.d r1 = r7.f10497c     // Catch:{ all -> 0x0067 }
            com.fyber.inneractive.sdk.cache.session.f r2 = new com.fyber.inneractive.sdk.cache.session.f     // Catch:{ all -> 0x0067 }
            r2.<init>()     // Catch:{ all -> 0x0067 }
            r1.f10498a = r2     // Catch:{ all -> 0x0067 }
        L_0x0043:
            com.fyber.inneractive.sdk.cache.session.d r1 = r7.f10497c     // Catch:{ all -> 0x0067 }
            org.json.JSONObject r1 = com.fyber.inneractive.sdk.cache.session.C4247d.m13418a((com.fyber.inneractive.sdk.cache.session.C4247d) r1)     // Catch:{ all -> 0x0067 }
            r2 = 0
            java.lang.String r3 = "session_details.json"
            android.app.Application r4 = com.fyber.inneractive.sdk.util.C5350l.f14216a     // Catch:{ UnsupportedEncodingException -> 0x005c }
            java.lang.String r5 = r1.toString()     // Catch:{ UnsupportedEncodingException -> 0x005c }
            java.lang.String r6 = "UTF-8"
            byte[] r5 = r5.getBytes(r6)     // Catch:{ UnsupportedEncodingException -> 0x005c }
            boolean r2 = com.fyber.inneractive.sdk.util.C5350l.m16758a(r3, r4, r5)     // Catch:{ UnsupportedEncodingException -> 0x005c }
        L_0x005c:
            com.fyber.inneractive.sdk.cache.session.d r3 = r7.f10497c     // Catch:{ all -> 0x0067 }
            com.fyber.inneractive.sdk.cache.session.d$a r4 = r3.f10502e     // Catch:{ all -> 0x0067 }
            if (r4 == 0) goto L_0x0065
            r4.mo24253a(r3, r2, r1)     // Catch:{ all -> 0x0067 }
        L_0x0065:
            monitor-exit(r0)     // Catch:{ all -> 0x0067 }
            return
        L_0x0067:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0067 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.cache.session.C4246c.run():void");
    }
}

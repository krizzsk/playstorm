package com.inmobi.media;

import com.inmobi.commons.utils.json.Constructor;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.inmobi.media.gd */
/* compiled from: RootConfig */
public class C6166gd extends C6144fr {
    private static final long DEFAULT_EXPIRY = 86400;
    private static final String DEFAULT_FALLBACK_URL = "https://config.inmobi.com/config-server/v1/config/secure.cfg";
    private static final int DEFAULT_MAX_RETRIES = 3;
    private static final int DEFAULT_RETRY_INTERVAL = 60;
    private static final String DEFAULT_URL = "";
    private static final int DEFAULT_WAIT_TIME = 3;
    private static final Object sAcquisitionLock = new Object();
    private List<C6168a> components = new ArrayList();
    private C6169b gdpr = new C6169b();
    C6170c latestSdkInfo = new C6170c();
    private int maxRetries = 3;
    private boolean monetizationDisabled = false;
    private int retryInterval = 60;
    int waitTime = 3;

    /* renamed from: com.inmobi.media.gd$a */
    /* compiled from: RootConfig */
    public static final class C6168a {
        /* access modifiers changed from: package-private */
        public long expiry;
        /* access modifiers changed from: package-private */
        public String fallbackUrl = C6166gd.DEFAULT_FALLBACK_URL;
        /* access modifiers changed from: package-private */
        public String type;
        /* access modifiers changed from: package-private */
        public String url;
    }

    /* renamed from: com.inmobi.media.gd$b */
    /* compiled from: RootConfig */
    public static final class C6169b {
        boolean transmitRequest = true;
    }

    /* renamed from: com.inmobi.media.gd$c */
    /* compiled from: RootConfig */
    public static final class C6170c {
        String url = C6228hp.m18579e();
        String version = C6228hp.m18574b();
    }

    /* renamed from: b */
    public String mo35325b() {
        return "root";
    }

    /* renamed from: a */
    public static C6262ij<C6166gd> m18372a() {
        return new C6262ij().mo35466a(new C6267io("components", C6166gd.class), (C6266in) new C6264il(new Constructor<List<C6168a>>() {
            public final /* synthetic */ Object construct() {
                return new ArrayList();
            }
        }, C6168a.class));
    }

    C6166gd(String str) {
        super(str);
    }

    /* renamed from: a */
    public boolean mo35348a(C6166gd gdVar) {
        return ((mo35331g() == null && gdVar.mo35331g() == null) || (mo35331g() != null && mo35331g().equals(gdVar.mo35331g()))) && gdVar.maxRetries == this.maxRetries && gdVar.retryInterval == this.retryInterval && gdVar.waitTime == this.waitTime && gdVar.monetizationDisabled == this.monetizationDisabled;
    }

    /* renamed from: c */
    public JSONObject mo35326c() {
        return m18372a().mo35468a(this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00a1, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00a3, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00a7, code lost:
        if (r8.gdpr == null) goto L_0x00ab;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00a9, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00ab, code lost:
        return false;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo35327d() {
        /*
            r8 = this;
            java.util.List<com.inmobi.media.gd$a> r0 = r8.components
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            int r0 = r8.maxRetries
            if (r0 < 0) goto L_0x00af
            int r0 = r8.retryInterval
            if (r0 < 0) goto L_0x00af
            int r0 = r8.waitTime
            if (r0 >= 0) goto L_0x0014
            goto L_0x00af
        L_0x0014:
            com.inmobi.media.gd$c r0 = r8.latestSdkInfo
            java.lang.String r0 = r0.version
            java.lang.String r0 = r0.trim()
            int r0 = r0.length()
            if (r0 == 0) goto L_0x00af
            com.inmobi.media.gd$c r0 = r8.latestSdkInfo
            java.lang.String r0 = r0.url
            java.lang.String r2 = "http://"
            boolean r0 = r0.startsWith(r2)
            if (r0 != 0) goto L_0x003c
            com.inmobi.media.gd$c r0 = r8.latestSdkInfo
            java.lang.String r0 = r0.url
            java.lang.String r2 = "https://"
            boolean r0 = r0.startsWith(r2)
            if (r0 != 0) goto L_0x003c
            goto L_0x00af
        L_0x003c:
            java.lang.Object r0 = sAcquisitionLock
            monitor-enter(r0)
            r2 = r1
        L_0x0040:
            java.util.List<com.inmobi.media.gd$a> r3 = r8.components     // Catch:{ all -> 0x00ac }
            int r3 = r3.size()     // Catch:{ all -> 0x00ac }
            if (r2 >= r3) goto L_0x00a4
            java.util.List<com.inmobi.media.gd$a> r3 = r8.components     // Catch:{ all -> 0x00ac }
            java.lang.Object r3 = r3.get(r2)     // Catch:{ all -> 0x00ac }
            com.inmobi.media.gd$a r3 = (com.inmobi.media.C6166gd.C6168a) r3     // Catch:{ all -> 0x00ac }
            java.lang.String r4 = r3.type     // Catch:{ all -> 0x00ac }
            if (r4 == 0) goto L_0x00a2
            long r4 = r3.expiry     // Catch:{ all -> 0x00ac }
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch:{ all -> 0x00ac }
            if (r4 != 0) goto L_0x005d
            goto L_0x00a2
        L_0x005d:
            java.lang.String r4 = r3.type     // Catch:{ all -> 0x00ac }
            java.lang.String r4 = r4.trim()     // Catch:{ all -> 0x00ac }
            int r4 = r4.length()     // Catch:{ all -> 0x00ac }
            if (r4 != 0) goto L_0x006b
            monitor-exit(r0)     // Catch:{ all -> 0x00ac }
            return r1
        L_0x006b:
            long r4 = r3.expiry     // Catch:{ all -> 0x00ac }
            r6 = 0
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 < 0) goto L_0x00a0
            long r4 = r3.expiry     // Catch:{ all -> 0x00ac }
            r6 = 864000(0xd2f00, double:4.268727E-318)
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 <= 0) goto L_0x007d
            goto L_0x00a0
        L_0x007d:
            java.lang.String r4 = r3.url     // Catch:{ all -> 0x00ac }
            boolean r4 = m18373c(r4)     // Catch:{ all -> 0x00ac }
            if (r4 == 0) goto L_0x0087
            monitor-exit(r0)     // Catch:{ all -> 0x00ac }
            return r1
        L_0x0087:
            java.lang.String r4 = "root"
            java.lang.String r5 = r3.type     // Catch:{ all -> 0x00ac }
            boolean r4 = r4.equals(r5)     // Catch:{ all -> 0x00ac }
            if (r4 == 0) goto L_0x009d
            java.lang.String r3 = r3.fallbackUrl     // Catch:{ all -> 0x00ac }
            boolean r3 = m18373c(r3)     // Catch:{ all -> 0x00ac }
            if (r3 == 0) goto L_0x009d
            monitor-exit(r0)     // Catch:{ all -> 0x00ac }
            return r1
        L_0x009d:
            int r2 = r2 + 1
            goto L_0x0040
        L_0x00a0:
            monitor-exit(r0)     // Catch:{ all -> 0x00ac }
            return r1
        L_0x00a2:
            monitor-exit(r0)     // Catch:{ all -> 0x00ac }
            return r1
        L_0x00a4:
            monitor-exit(r0)     // Catch:{ all -> 0x00ac }
            com.inmobi.media.gd$b r0 = r8.gdpr
            if (r0 == 0) goto L_0x00ab
            r0 = 1
            return r0
        L_0x00ab:
            return r1
        L_0x00ac:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00ac }
            throw r1
        L_0x00af:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C6166gd.mo35327d():boolean");
    }

    /* renamed from: c */
    private static boolean m18373c(String str) {
        if (str == null || str.trim().length() == 0) {
            return true;
        }
        return !str.startsWith("http://") && !str.startsWith("https://");
    }

    /* renamed from: a */
    public long mo35347a(String str) {
        synchronized (sAcquisitionLock) {
            for (int i = 0; i < this.components.size(); i++) {
                C6168a aVar = this.components.get(i);
                if (str.equals(aVar.type)) {
                    long b = aVar.expiry;
                    return b;
                }
            }
            return DEFAULT_EXPIRY;
        }
    }

    /* renamed from: e */
    public int mo35350e() {
        return this.maxRetries;
    }

    /* renamed from: h */
    public int mo35351h() {
        return this.retryInterval;
    }

    /* renamed from: i */
    public boolean mo35352i() {
        return this.monetizationDisabled;
    }

    /* renamed from: j */
    public boolean mo35353j() {
        C6169b bVar = this.gdpr;
        return bVar == null || bVar.transmitRequest;
    }

    /* renamed from: b */
    public String mo35349b(String str) {
        synchronized (sAcquisitionLock) {
            for (int i = 0; i < this.components.size(); i++) {
                C6168a aVar = this.components.get(i);
                if (str.equals(aVar.type)) {
                    String c = aVar.url;
                    return c;
                }
            }
            return "";
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public final String mo35354k() {
        synchronized (sAcquisitionLock) {
            for (C6168a next : this.components) {
                if ("root".equals(next.type)) {
                    String d = next.fallbackUrl;
                    return d;
                }
            }
            return DEFAULT_FALLBACK_URL;
        }
    }
}

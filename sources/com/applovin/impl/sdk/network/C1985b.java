package com.applovin.impl.sdk.network;

import androidx.core.util.Consumer;
import com.applovin.impl.sdk.C1959m;
import com.applovin.impl.sdk.C2092v;
import com.applovin.impl.sdk.network.C1994e;
import com.applovin.impl.sdk.p049d.C1871f;
import com.applovin.impl.sdk.utils.C2040h;
import com.applovin.impl.sdk.utils.C2080m;
import com.applovin.impl.sdk.utils.C2088r;
import com.applovin.impl.sdk.utils.C2089s;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.sdk.AppLovinErrorCodes;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import org.xml.sax.SAXException;

/* renamed from: com.applovin.impl.sdk.network.b */
public class C1985b {

    /* renamed from: a */
    private static final List<String> f3773a = Arrays.asList(new String[]{"5.0/i", "4.0/ad", "1.0/mediate"});
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C1959m f3774b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C2092v f3775c;

    /* renamed from: d */
    private final C1994e f3776d;

    /* renamed from: com.applovin.impl.sdk.network.b$a */
    public static class C1987a {

        /* renamed from: a */
        private long f3777a;

        /* renamed from: b */
        private long f3778b;

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void m4561a(long j) {
            this.f3777a = j;
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public void m4563b(long j) {
            this.f3778b = j;
        }

        /* renamed from: a */
        public long mo14475a() {
            return this.f3777a;
        }

        /* renamed from: b */
        public long mo14476b() {
            return this.f3778b;
        }
    }

    /* renamed from: com.applovin.impl.sdk.network.b$b */
    private class C1988b<T> implements Consumer<C1994e.C2000c> {

        /* renamed from: b */
        private final String f3780b;

        /* renamed from: c */
        private final C1990c<T> f3781c;

        /* renamed from: d */
        private final String f3782d;

        /* renamed from: e */
        private final T f3783e;

        /* renamed from: f */
        private final boolean f3784f;

        /* renamed from: g */
        private final long f3785g;

        /* renamed from: h */
        private final C1987a f3786h;

        /* renamed from: i */
        private final C1989c<T> f3787i;

        private C1988b(String str, C1990c<T> cVar, String str2, T t, boolean z, long j, C1987a aVar, C1989c<T> cVar2) {
            this.f3780b = str;
            this.f3781c = cVar;
            this.f3782d = str2;
            this.f3783e = t;
            this.f3784f = z;
            this.f3785g = j;
            this.f3786h = aVar;
            this.f3787i = cVar2;
        }

        /* renamed from: a */
        public void accept(C1994e.C2000c cVar) {
            Throwable th;
            C1989c<T> cVar2;
            Object obj = null;
            int i = 0;
            try {
                i = cVar.mo14532a();
                if (i > 0) {
                    long currentTimeMillis = System.currentTimeMillis() - this.f3785g;
                    if (i < 200 || i >= 400) {
                        cVar2 = this.f3787i;
                    } else {
                        if (this.f3786h != null) {
                            this.f3786h.m4561a(currentTimeMillis);
                        }
                        C1985b.this.m4557a(this.f3782d, this.f3780b, i, this.f3785g);
                        String b = cVar.mo14533b();
                        if (Utils.isDspDemoApp(C1985b.this.f3774b.mo14297L())) {
                            String str = "";
                            String str2 = b != null ? b : str;
                            if (this.f3781c.mo14485e() != null) {
                                str = this.f3781c.mo14485e().toString();
                            }
                            C1985b.this.f3774b.mo14334ag().mo14263a(str2, this.f3780b, str);
                        }
                        if (b != null) {
                            if (C2092v.m5047a()) {
                                C1985b.this.f3775c.mo14787a("ConnectionManager", b);
                            }
                            if (this.f3786h != null) {
                                this.f3786h.m4563b((long) b.length());
                            }
                            if (this.f3784f) {
                                String a = C2080m.m4988a(b, C1985b.this.f3774b.mo14374z());
                                if (a == null) {
                                    HashMap hashMap = new HashMap(2);
                                    hashMap.put("request", StringUtils.getHostAndPath(this.f3780b));
                                    hashMap.put("response", b);
                                    C1985b.this.f3774b.mo14371w().trackEvent("rdf", hashMap);
                                }
                                b = a;
                            }
                            try {
                                this.f3787i.mo13364a(C1985b.this.m4552a(b, this.f3783e), i);
                                return;
                            } catch (Throwable th2) {
                                String str3 = "Unable to parse response from " + C1985b.this.m4554a(this.f3780b);
                                if (C2092v.m5047a()) {
                                    C1985b.this.f3775c.mo14790b("ConnectionManager", str3, th2);
                                }
                                C1985b.this.f3774b.mo14304T().mo14128a(C1871f.f3444i);
                                this.f3787i.mo13362a(AppLovinErrorCodes.INVALID_RESPONSE, str3, null);
                                return;
                            }
                        } else {
                            this.f3787i.mo13364a(this.f3783e, i);
                            return;
                        }
                    }
                } else {
                    C1985b.this.m4558a(this.f3782d, this.f3780b, i, this.f3785g, (Throwable) null);
                    cVar2 = this.f3787i;
                }
                cVar2.mo13362a(i, (String) null, null);
                return;
            } catch (MalformedURLException e) {
                int i2 = i;
                if (this.f3783e != null) {
                    C1985b.this.m4558a(this.f3782d, this.f3780b, i2, this.f3785g, (Throwable) e);
                    this.f3787i.mo13362a(-901, e.getMessage(), null);
                    return;
                }
                C1985b.this.m4557a(this.f3782d, this.f3780b, i2, this.f3785g);
                this.f3787i.mo13364a(this.f3783e, -901);
                return;
            } catch (Throwable unused) {
            }
            C1985b.this.m4558a(this.f3782d, this.f3780b, i, this.f3785g, th);
            this.f3787i.mo13362a(i, th.getMessage(), obj);
        }
    }

    /* renamed from: com.applovin.impl.sdk.network.b$c */
    public interface C1989c<T> {
        /* renamed from: a */
        void mo13362a(int i, String str, T t);

        /* renamed from: a */
        void mo13364a(T t, int i);
    }

    public C1985b(C1959m mVar) {
        this.f3774b = mVar;
        this.f3775c = mVar.mo14286A();
        C1994e eVar = new C1994e(mVar);
        this.f3776d = eVar;
        eVar.mo14517a();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public int m4549a(Throwable th) {
        if (th instanceof UnknownHostException) {
            return -1009;
        }
        if (th instanceof SocketTimeoutException) {
            return -1001;
        }
        if (th instanceof IOException) {
            return -100;
        }
        return th instanceof JSONException ? -104 : -1;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public <T> T m4552a(String str, T t) throws JSONException, SAXException, ClassCastException {
        if (t == null) {
            return str;
        }
        if (str != null && str.length() >= 3) {
            if (t instanceof JSONObject) {
                return new JSONObject(str);
            }
            if (t instanceof C2088r) {
                return C2089s.m5032a(str, this.f3774b);
            }
            if (t instanceof String) {
                return str;
            }
            if (C2092v.m5047a()) {
                C2092v vVar = this.f3775c;
                vVar.mo14793e("ConnectionManager", "Failed to process response of type '" + t.getClass().getName() + "'");
            }
        }
        return t;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public String m4554a(String str) {
        return "#" + str.hashCode() + " \"" + StringUtils.getHostAndPath(str) + "\"";
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m4557a(String str, String str2, int i, long j) {
        if (C2092v.m5047a()) {
            C2092v vVar = this.f3775c;
            vVar.mo14791c("ConnectionManager", "Successful " + str + " returned " + i + " in " + (((float) (System.currentTimeMillis() - j)) / 1000.0f) + " s over " + C2040h.m4908f(this.f3774b) + " to " + m4554a(str2));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m4558a(String str, String str2, int i, long j, Throwable th) {
        if (C2092v.m5047a()) {
            C2092v vVar = this.f3775c;
            vVar.mo14790b("ConnectionManager", "Failed " + str + " returned " + i + " in " + (((float) (System.currentTimeMillis() - j)) / 1000.0f) + " s over " + C2040h.m4908f(this.f3774b) + " to " + m4554a(str2), th);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:75:0x01f3 A[Catch:{ all -> 0x01cb, all -> 0x0295 }] */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0231 A[Catch:{ all -> 0x01cb, all -> 0x0295 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public <T> void mo14474a(com.applovin.impl.sdk.network.C1990c<T> r23, com.applovin.impl.sdk.network.C1985b.C1987a r24, com.applovin.impl.sdk.network.C1985b.C1989c<T> r25) {
        /*
            r22 = this;
            r13 = r22
            r14 = r25
            if (r23 == 0) goto L_0x02c9
            java.lang.String r0 = r23.mo14478a()
            java.lang.String r15 = r23.mo14481b()
            if (r0 == 0) goto L_0x02c1
            if (r15 == 0) goto L_0x02b9
            if (r14 == 0) goto L_0x02b1
            java.lang.String r1 = r0.toLowerCase()
            java.lang.String r2 = "http"
            boolean r1 = r1.startsWith(r2)
            r12 = 0
            java.lang.String r2 = "ConnectionManager"
            if (r1 != 0) goto L_0x0048
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "Requested postback submission to non HTTP endpoint "
            r1.append(r3)
            r1.append(r0)
            java.lang.String r0 = "; skipping..."
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            boolean r1 = com.applovin.impl.sdk.C2092v.m5047a()
            if (r1 == 0) goto L_0x0042
            com.applovin.impl.sdk.C2092v.m5053i(r2, r0)
        L_0x0042:
            r1 = -900(0xfffffffffffffc7c, float:NaN)
            r14.mo13362a(r1, r0, r12)
            return
        L_0x0048:
            com.applovin.impl.sdk.m r1 = r13.f3774b
            com.applovin.impl.sdk.c.b<java.lang.Boolean> r3 = com.applovin.impl.sdk.p048c.C1857b.f3192cQ
            java.lang.Object r1 = r1.mo14311a(r3)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L_0x0077
            java.lang.String r1 = "https://"
            boolean r3 = r0.contains(r1)
            if (r3 != 0) goto L_0x0077
            boolean r3 = com.applovin.impl.sdk.C2092v.m5047a()
            if (r3 == 0) goto L_0x0071
            com.applovin.impl.sdk.m r3 = r13.f3774b
            com.applovin.impl.sdk.v r3 = r3.mo14286A()
            java.lang.String r4 = "Plaintext HTTP operation requested; upgrading to HTTPS due to universal SSL setting..."
            r3.mo14792d(r2, r4)
        L_0x0071:
            java.lang.String r3 = "http://"
            java.lang.String r0 = r0.replace(r3, r1)
        L_0x0077:
            java.util.HashMap r1 = new java.util.HashMap
            r3 = 2
            r1.<init>(r3)
            boolean r7 = r23.mo14496n()
            com.applovin.impl.sdk.m r3 = r13.f3774b
            long r3 = com.applovin.impl.sdk.utils.Utils.getServerAdjustedUnixTimestampMillis(r3)
            java.util.Map r5 = r23.mo14483c()
            if (r5 == 0) goto L_0x0097
            java.util.Map r5 = r23.mo14483c()
            boolean r5 = r5.isEmpty()
            if (r5 == 0) goto L_0x009d
        L_0x0097:
            int r5 = r23.mo14491i()
            if (r5 < 0) goto L_0x0100
        L_0x009d:
            java.util.Map r5 = r23.mo14483c()
            com.applovin.impl.sdk.m r6 = r13.f3774b
            com.applovin.impl.sdk.c.b<java.lang.Boolean> r8 = com.applovin.impl.sdk.p048c.C1857b.f3259df
            java.lang.Object r6 = r6.mo14311a(r8)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            if (r5 == 0) goto L_0x00c6
            int r8 = r23.mo14491i()
            if (r8 < 0) goto L_0x00c6
            int r8 = r23.mo14491i()
            if (r8 <= 0) goto L_0x00c6
            int r8 = r23.mo14491i()
            java.lang.String r8 = java.lang.String.valueOf(r8)
            java.lang.String r9 = "current_retry_attempt"
            r5.put(r9, r8)
        L_0x00c6:
            boolean r6 = r6.booleanValue()
            if (r7 == 0) goto L_0x00fc
            com.applovin.impl.sdk.m r8 = r13.f3774b
            com.applovin.impl.sdk.c.b<java.lang.Boolean> r9 = com.applovin.impl.sdk.p048c.C1857b.f3260dg
            java.lang.Object r8 = r8.mo14311a(r9)
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            java.lang.String r5 = com.applovin.impl.sdk.utils.Utils.encodeUrlMap(r5, r6, r8)
            com.applovin.impl.sdk.m r6 = r13.f3774b
            java.lang.String r6 = r6.mo14374z()
            java.lang.String r6 = com.applovin.impl.sdk.utils.C2080m.m4989a((java.lang.String) r5, (java.lang.String) r6, (long) r3)
            boolean r8 = com.applovin.impl.sdk.utils.StringUtils.isValidString(r5)
            if (r8 == 0) goto L_0x00f5
            if (r6 != 0) goto L_0x00f5
            java.lang.String r8 = "query"
            r1.put(r8, r5)
        L_0x00f5:
            java.lang.String r5 = "p"
            java.lang.String r0 = com.applovin.impl.sdk.utils.StringUtils.appendQueryParameter(r0, r5, r6)
            goto L_0x0100
        L_0x00fc:
            java.lang.String r0 = com.applovin.impl.sdk.utils.StringUtils.appendQueryParameters(r0, r5, r6)
        L_0x0100:
            r11 = r0
            long r16 = java.lang.System.currentTimeMillis()
            java.lang.String r0 = com.applovin.impl.sdk.utils.StringUtils.getHostAndPath(r11)     // Catch:{ all -> 0x0295 }
            java.util.List<java.lang.String> r5 = f3773a     // Catch:{ all -> 0x0295 }
            java.lang.Boolean r0 = com.applovin.impl.sdk.utils.StringUtils.endsWith(r0, r5)     // Catch:{ all -> 0x0295 }
            boolean r5 = com.applovin.impl.sdk.C2092v.m5047a()     // Catch:{ all -> 0x0295 }
            if (r5 == 0) goto L_0x0150
            com.applovin.impl.sdk.v r5 = r13.f3775c     // Catch:{ all -> 0x0295 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0295 }
            r6.<init>()     // Catch:{ all -> 0x0295 }
            java.lang.String r8 = "Sending "
            r6.append(r8)     // Catch:{ all -> 0x0295 }
            r6.append(r15)     // Catch:{ all -> 0x0295 }
            java.lang.String r8 = " request to id=#"
            r6.append(r8)     // Catch:{ all -> 0x0295 }
            int r8 = r11.hashCode()     // Catch:{ all -> 0x0295 }
            r6.append(r8)     // Catch:{ all -> 0x0295 }
            java.lang.String r8 = " \""
            r6.append(r8)     // Catch:{ all -> 0x0295 }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x0295 }
            if (r0 == 0) goto L_0x013d
            r0 = r11
            goto L_0x0141
        L_0x013d:
            java.lang.String r0 = com.applovin.impl.sdk.utils.StringUtils.getHostAndPath(r11)     // Catch:{ all -> 0x0295 }
        L_0x0141:
            r6.append(r0)     // Catch:{ all -> 0x0295 }
            java.lang.String r0 = "\"..."
            r6.append(r0)     // Catch:{ all -> 0x0295 }
            java.lang.String r0 = r6.toString()     // Catch:{ all -> 0x0295 }
            r5.mo14791c(r2, r0)     // Catch:{ all -> 0x0295 }
        L_0x0150:
            com.applovin.impl.sdk.network.e$b$a r0 = new com.applovin.impl.sdk.network.e$b$a     // Catch:{ all -> 0x0295 }
            r0.<init>()     // Catch:{ all -> 0x0295 }
            com.applovin.impl.sdk.network.e$b$a r0 = r0.mo14525a((java.lang.String) r11)     // Catch:{ all -> 0x0295 }
            com.applovin.impl.sdk.network.e$b$a r0 = r0.mo14531b((java.lang.String) r15)     // Catch:{ all -> 0x0295 }
            java.util.Map r5 = r23.mo14484d()     // Catch:{ all -> 0x0295 }
            com.applovin.impl.sdk.network.e$b$a r0 = r0.mo14527a((java.util.Map<java.lang.String, java.lang.String>) r5)     // Catch:{ all -> 0x0295 }
            int r5 = r23.mo14492j()     // Catch:{ all -> 0x0295 }
            com.applovin.impl.sdk.network.e$b$a r10 = r0.mo14523a((int) r5)     // Catch:{ all -> 0x0295 }
            org.json.JSONObject r0 = r23.mo14485e()     // Catch:{ all -> 0x0295 }
            if (r0 == 0) goto L_0x0238
            if (r7 == 0) goto L_0x0197
            org.json.JSONObject r0 = r23.mo14485e()     // Catch:{ all -> 0x0295 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0295 }
            com.applovin.impl.sdk.m r5 = r13.f3774b     // Catch:{ all -> 0x0295 }
            java.lang.String r5 = r5.mo14374z()     // Catch:{ all -> 0x0295 }
            java.lang.String r0 = com.applovin.impl.sdk.utils.C2080m.m4989a((java.lang.String) r0, (java.lang.String) r5, (long) r3)     // Catch:{ all -> 0x0295 }
            if (r0 != 0) goto L_0x019f
            java.lang.String r3 = "body"
            org.json.JSONObject r4 = r23.mo14485e()     // Catch:{ all -> 0x0295 }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x0295 }
            r1.put(r3, r4)     // Catch:{ all -> 0x0295 }
            goto L_0x019f
        L_0x0197:
            org.json.JSONObject r0 = r23.mo14485e()     // Catch:{ all -> 0x0295 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0295 }
        L_0x019f:
            r3 = r0
            boolean r0 = r23.mo14497o()     // Catch:{ all -> 0x0295 }
            java.lang.String r4 = "UTF-8"
            if (r0 == 0) goto L_0x01ec
            if (r3 == 0) goto L_0x01ec
            int r0 = r3.length()     // Catch:{ all -> 0x0295 }
            com.applovin.impl.sdk.m r5 = r13.f3774b     // Catch:{ all -> 0x0295 }
            com.applovin.impl.sdk.c.b<java.lang.Integer> r6 = com.applovin.impl.sdk.p048c.C1857b.f3323et     // Catch:{ all -> 0x0295 }
            java.lang.Object r5 = r5.mo14311a(r6)     // Catch:{ all -> 0x0295 }
            java.lang.Integer r5 = (java.lang.Integer) r5     // Catch:{ all -> 0x0295 }
            int r5 = r5.intValue()     // Catch:{ all -> 0x0295 }
            if (r0 <= r5) goto L_0x01ec
            java.nio.charset.Charset r0 = java.nio.charset.Charset.forName(r4)     // Catch:{ all -> 0x01cb }
            byte[] r0 = r3.getBytes(r0)     // Catch:{ all -> 0x01cb }
            byte[] r0 = com.applovin.impl.sdk.utils.Utils.gzip(r0)     // Catch:{ all -> 0x01cb }
            goto L_0x01ed
        L_0x01cb:
            r0 = move-exception
            boolean r5 = com.applovin.impl.sdk.C2092v.m5047a()     // Catch:{ all -> 0x0295 }
            if (r5 == 0) goto L_0x01ec
            com.applovin.impl.sdk.v r5 = r13.f3775c     // Catch:{ all -> 0x0295 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0295 }
            r6.<init>()     // Catch:{ all -> 0x0295 }
            java.lang.String r8 = "Failed to gzip POST body for request "
            r6.append(r8)     // Catch:{ all -> 0x0295 }
            java.lang.String r8 = r13.m4554a((java.lang.String) r11)     // Catch:{ all -> 0x0295 }
            r6.append(r8)     // Catch:{ all -> 0x0295 }
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x0295 }
            r5.mo14790b(r2, r6, r0)     // Catch:{ all -> 0x0295 }
        L_0x01ec:
            r0 = r12
        L_0x01ed:
            boolean r5 = com.applovin.impl.sdk.C2092v.m5047a()     // Catch:{ all -> 0x0295 }
            if (r5 == 0) goto L_0x0215
            com.applovin.impl.sdk.v r5 = r13.f3775c     // Catch:{ all -> 0x0295 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0295 }
            r6.<init>()     // Catch:{ all -> 0x0295 }
            java.lang.String r8 = "Request to "
            r6.append(r8)     // Catch:{ all -> 0x0295 }
            java.lang.String r8 = r13.m4554a((java.lang.String) r11)     // Catch:{ all -> 0x0295 }
            r6.append(r8)     // Catch:{ all -> 0x0295 }
            java.lang.String r8 = " is "
            r6.append(r8)     // Catch:{ all -> 0x0295 }
            r6.append(r3)     // Catch:{ all -> 0x0295 }
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x0295 }
            r5.mo14789b(r2, r6)     // Catch:{ all -> 0x0295 }
        L_0x0215:
            java.lang.String r2 = "Content-Type"
            java.lang.String r5 = "application/json; charset=utf-8"
            r10.mo14526a(r2, r5)     // Catch:{ all -> 0x0295 }
            boolean r2 = r23.mo14497o()     // Catch:{ all -> 0x0295 }
            if (r2 == 0) goto L_0x022f
            if (r0 == 0) goto L_0x022f
            java.lang.String r2 = "Content-Encoding"
            java.lang.String r3 = "gzip"
            r10.mo14526a(r2, r3)     // Catch:{ all -> 0x0295 }
            r10.mo14529a((byte[]) r0)     // Catch:{ all -> 0x0295 }
            goto L_0x0238
        L_0x022f:
            if (r3 == 0) goto L_0x0238
            byte[] r0 = r3.getBytes(r4)     // Catch:{ all -> 0x0295 }
            r10.mo14529a((byte[]) r0)     // Catch:{ all -> 0x0295 }
        L_0x0238:
            boolean r0 = r1.isEmpty()     // Catch:{ all -> 0x0295 }
            if (r0 != 0) goto L_0x0252
            java.lang.String r0 = "request"
            java.lang.String r2 = com.applovin.impl.sdk.utils.StringUtils.getHostAndPath(r11)     // Catch:{ all -> 0x0295 }
            r1.put(r0, r2)     // Catch:{ all -> 0x0295 }
            com.applovin.impl.sdk.m r0 = r13.f3774b     // Catch:{ all -> 0x0295 }
            com.applovin.sdk.AppLovinEventService r0 = r0.mo14371w()     // Catch:{ all -> 0x0295 }
            java.lang.String r2 = "ref"
            r0.trackEvent(r2, r1)     // Catch:{ all -> 0x0295 }
        L_0x0252:
            com.applovin.impl.sdk.network.e r0 = r13.f3776d     // Catch:{ all -> 0x0295 }
            com.applovin.impl.sdk.network.b$b r8 = new com.applovin.impl.sdk.network.b$b     // Catch:{ all -> 0x0295 }
            java.lang.Object r6 = r23.mo14488g()     // Catch:{ all -> 0x0295 }
            r18 = 0
            r1 = r8
            r2 = r22
            r3 = r11
            r4 = r23
            r5 = r15
            r19 = r8
            r8 = r16
            r20 = r10
            r10 = r24
            r21 = r11
            r11 = r25
            r14 = r12
            r12 = r18
            r1.<init>(r3, r4, r5, r6, r7, r8, r10, r11)     // Catch:{ all -> 0x0293 }
            r2 = r19
            r1 = r20
            com.applovin.impl.sdk.network.e$b$a r1 = r1.mo14524a((androidx.core.util.Consumer<com.applovin.impl.sdk.network.C1994e.C2000c>) r2)     // Catch:{ all -> 0x0293 }
            com.applovin.impl.sdk.m r2 = r13.f3774b     // Catch:{ all -> 0x0293 }
            com.applovin.impl.sdk.e.o r2 = r2.mo14303S()     // Catch:{ all -> 0x0293 }
            java.util.concurrent.Executor r2 = r2.mo14211b()     // Catch:{ all -> 0x0293 }
            com.applovin.impl.sdk.network.e$b$a r1 = r1.mo14528a((java.util.concurrent.Executor) r2)     // Catch:{ all -> 0x0293 }
            com.applovin.impl.sdk.network.e$b r1 = r1.mo14530a()     // Catch:{ all -> 0x0293 }
            r0.mo14518a(r1)     // Catch:{ all -> 0x0293 }
            goto L_0x02b0
        L_0x0293:
            r0 = move-exception
            goto L_0x0299
        L_0x0295:
            r0 = move-exception
            r21 = r11
            r14 = r12
        L_0x0299:
            r4 = 0
            r1 = r22
            r2 = r15
            r3 = r21
            r5 = r16
            r7 = r0
            r1.m4558a((java.lang.String) r2, (java.lang.String) r3, (int) r4, (long) r5, (java.lang.Throwable) r7)
            r1 = 0
            java.lang.String r0 = r0.getMessage()
            r2 = r25
            r3 = r14
            r2.mo13362a(r1, r0, r3)
        L_0x02b0:
            return
        L_0x02b1:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "No callback specified"
            r0.<init>(r1)
            throw r0
        L_0x02b9:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "No method specified"
            r0.<init>(r1)
            throw r0
        L_0x02c1:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "No endpoint specified"
            r0.<init>(r1)
            throw r0
        L_0x02c9:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "No request specified"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.sdk.network.C1985b.mo14474a(com.applovin.impl.sdk.network.c, com.applovin.impl.sdk.network.b$a, com.applovin.impl.sdk.network.b$c):void");
    }
}

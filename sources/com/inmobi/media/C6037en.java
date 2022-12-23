package com.inmobi.media;

import android.content.Context;
import android.os.SystemClock;
import androidx.browser.trusted.sharing.ShareTarget;
import com.google.common.net.HttpHeaders;
import com.inmobi.media.C6125fq;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.inmobi.media.en */
/* compiled from: OmidServiceJsFetcher */
public class C6037en {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final String f15359a = C6037en.class.getSimpleName();

    /* renamed from: a */
    public static void m18053a(final C6125fq.C6137h hVar) {
        String str = hVar.url;
        final int i = hVar.maxRetries;
        final int i2 = hVar.retryInterval;
        if (str != null) {
            final C6206gx gxVar = new C6206gx(ShareTarget.METHOD_GET, str);
            HashMap hashMap = new HashMap();
            hashMap.put(HttpHeaders.ACCEPT_ENCODING, "gzip");
            gxVar.f15720t = false;
            gxVar.f15715o = false;
            gxVar.mo35385a((Map<String, String>) hashMap);
            new Thread(new Runnable() {
                public final void run() {
                    if (C6037en.m18054b(C6125fq.C6137h.this)) {
                        int i = 0;
                        while (i <= i) {
                            String unused = C6037en.f15359a;
                            long elapsedRealtime = SystemClock.elapsedRealtime();
                            C6207gy a = new C6210ha(gxVar).mo35400a();
                            try {
                                C6279iv.m18765a().mo35491a(gxVar.mo35394g());
                                C6279iv.m18765a().mo35492b(a.mo35399d());
                                C6279iv.m18765a().mo35493c(SystemClock.elapsedRealtime() - elapsedRealtime);
                            } catch (Exception unused2) {
                                String unused3 = C6037en.f15359a;
                            }
                            Context c = C6227ho.m18551c();
                            if (a.mo35396a()) {
                                String unused4 = C6037en.f15359a;
                                i++;
                                if (i <= i) {
                                    try {
                                        Thread.sleep((long) (i2 * 1000));
                                    } catch (InterruptedException unused5) {
                                        String unused6 = C6037en.f15359a;
                                    }
                                } else {
                                    return;
                                }
                            } else if (c != null) {
                                C6241hx hxVar = new C6241hx(c, "omid_js_store");
                                List list = a.f15724c.get("Content-Encoding");
                                if (list == null || !((String) list.get(0)).equals("gzip")) {
                                    hxVar.mo35455b("omid_js_string", a.mo35397b());
                                    String unused7 = C6037en.f15359a;
                                    return;
                                }
                                String unused8 = C6037en.f15359a;
                                byte[] a2 = C6239hv.m18618a(a.mo35398c());
                                if (a2 != null) {
                                    try {
                                        hxVar.mo35455b("omid_js_string", new String(a2, "UTF-8"));
                                        String unused9 = C6037en.f15359a;
                                        return;
                                    } catch (UnsupportedEncodingException unused10) {
                                        String unused11 = C6037en.f15359a;
                                        String unused12 = C6037en.f15359a;
                                        return;
                                    }
                                } else {
                                    return;
                                }
                            }
                        }
                    }
                }
            }).start();
        }
    }

    /* renamed from: b */
    static /* synthetic */ boolean m18054b(C6125fq.C6137h hVar) {
        Context c = C6227ho.m18551c();
        if (c == null) {
            return false;
        }
        return (System.currentTimeMillis() / 1000) - new C6241hx(c, "omid_js_store").mo35447a() > hVar.expiry;
    }
}

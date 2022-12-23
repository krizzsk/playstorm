package com.inmobi.media;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.inmobi.ads.rendering.InMobiAdActivity;
import java.io.UnsupportedEncodingException;
import java.net.URISyntaxException;
import java.net.URLEncoder;

/* renamed from: com.inmobi.media.m */
/* compiled from: LandingPageHandler */
public class C6317m {

    /* renamed from: c */
    private static final String f15974c = C6317m.class.getSimpleName();

    /* renamed from: a */
    public C6225hm f15975a;

    /* renamed from: b */
    public Context f15976b;

    /* renamed from: d */
    private final String f15977d = "inmobinativebrowser";

    /* renamed from: e */
    private final String f15978e = "inmobideeplink";

    /* renamed from: f */
    private final String f15979f = "url";

    /* renamed from: g */
    private final String f15980g = "primaryUrl";

    /* renamed from: h */
    private final String f15981h = "fallbackUrl";

    /* renamed from: i */
    private final String f15982i = "primaryTrackingUrl";

    /* renamed from: j */
    private final String f15983j = "fallbackTrackingUrl";

    /* renamed from: k */
    private String f15984k = "CustomExpand handling failed";

    /* renamed from: l */
    private C6226hn f15985l;

    /* renamed from: m */
    private C6060f f15986m;

    public C6317m(Context context, C6226hn hnVar, C6060f fVar, C6225hm hmVar) {
        this.f15976b = context;
        this.f15985l = hnVar;
        this.f15986m = fVar;
        this.f15975a = hmVar;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0081, code lost:
        if (r0.equals("EX_NATIVE") != false) goto L_0x008f;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo35547a(java.lang.String r7, java.lang.String r8, java.lang.String r9) {
        /*
            r6 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r9)
            r1 = 0
            if (r0 == 0) goto L_0x000b
            r6.mo35544a(r7, r8)
            return r1
        L_0x000b:
            android.net.Uri r0 = android.net.Uri.parse(r9)
            java.lang.String r2 = r0.getScheme()
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 == 0) goto L_0x001d
            r6.mo35544a(r7, r8)
            return r1
        L_0x001d:
            java.lang.String r2 = r0.getScheme()
            java.lang.String r3 = "inmobinativebrowser"
            boolean r2 = r2.equals(r3)
            r3 = 1
            if (r2 == 0) goto L_0x002e
            r6.mo35548b(r7, r8, r9)
            return r3
        L_0x002e:
            java.lang.String r2 = r0.getScheme()
            java.lang.String r4 = "inmobideeplink"
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L_0x003e
            r6.mo35549c(r7, r8, r9)
            return r3
        L_0x003e:
            com.inmobi.media.C6223hk.m18526a()
            android.content.Context r2 = r6.f15976b
            boolean r2 = com.inmobi.media.C6223hk.m18528a(r2, r9)
            if (r2 == 0) goto L_0x004d
            r6.mo35551e(r7, r8, r9)
            return r3
        L_0x004d:
            boolean r0 = com.inmobi.media.C6236hs.m18598a((android.net.Uri) r0)
            if (r0 == 0) goto L_0x00b1
            com.inmobi.media.hn r0 = r6.f15985l
            boolean r0 = r0.f15771a
            if (r0 == 0) goto L_0x005a
            return r1
        L_0x005a:
            com.inmobi.media.hn r0 = r6.f15985l
            java.lang.String r0 = r0.f15772b
            r2 = -1
            int r4 = r0.hashCode()
            switch(r4) {
                case -2032180703: goto L_0x0084;
                case -702637789: goto L_0x007b;
                case 112775115: goto L_0x0071;
                case 409244785: goto L_0x0067;
                default: goto L_0x0066;
            }
        L_0x0066:
            goto L_0x008e
        L_0x0067:
            java.lang.String r1 = "IN_NATIVE"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x008e
            r1 = 2
            goto L_0x008f
        L_0x0071:
            java.lang.String r1 = "IN_CUSTOM"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x008e
            r1 = r3
            goto L_0x008f
        L_0x007b:
            java.lang.String r4 = "EX_NATIVE"
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L_0x008e
            goto L_0x008f
        L_0x0084:
            java.lang.String r1 = "DEFAULT"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x008e
            r1 = 3
            goto L_0x008f
        L_0x008e:
            r1 = r2
        L_0x008f:
            if (r1 == 0) goto L_0x009d
            if (r1 == r3) goto L_0x0098
            boolean r7 = r6.m18903f(r7, r8, r9)
            return r7
        L_0x0098:
            boolean r7 = r6.mo35546a(r9)
            return r7
        L_0x009d:
            com.inmobi.media.C6224hl.m18530a()
            android.content.Context r0 = r6.f15976b
            boolean r0 = com.inmobi.media.C6224hl.m18531a(r0, r9)
            if (r0 != 0) goto L_0x00ad
            boolean r7 = r6.mo35550d(r7, r8, r9)
            return r7
        L_0x00ad:
            r6.mo35551e(r7, r8, r9)
            return r3
        L_0x00b1:
            com.inmobi.media.C6224hl.m18530a()
            android.content.Context r0 = r6.f15976b
            boolean r0 = com.inmobi.media.C6224hl.m18531a(r0, r9)
            if (r0 == 0) goto L_0x00c0
            r6.mo35551e(r7, r8, r9)
            return r3
        L_0x00c0:
            android.net.Uri r9 = android.net.Uri.parse(r9)
            boolean r9 = com.inmobi.media.C6236hs.m18598a((android.net.Uri) r9)
            if (r9 != 0) goto L_0x00cf
            r4 = 1000(0x3e8, double:4.94E-321)
            java.lang.Thread.sleep(r4)     // Catch:{ InterruptedException -> 0x00cf }
        L_0x00cf:
            r6.mo35544a(r7, r8)
            com.inmobi.media.hn r7 = r6.f15985l
            boolean r7 = r7.f15771a
            if (r7 != 0) goto L_0x00d9
            return r3
        L_0x00d9:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C6317m.mo35547a(java.lang.String, java.lang.String, java.lang.String):boolean");
    }

    /* renamed from: b */
    public final void mo35548b(String str, String str2, String str3) {
        String queryParameter = Uri.parse(str3).getQueryParameter("url");
        if (TextUtils.isEmpty(queryParameter)) {
            this.f15975a.mo35431a(str2, "Invalid URL", str);
            return;
        }
        C6224hl.m18530a();
        if (C6224hl.m18531a(this.f15976b, queryParameter)) {
            mo35551e(str, str2, str3);
        } else {
            this.f15975a.mo35431a(str2, "Invalid URL", str);
        }
    }

    /* renamed from: c */
    public final boolean mo35549c(String str, String str2, String str3) {
        Uri parse = Uri.parse(str3);
        if (m18901b(parse.getQueryParameter("primaryUrl"), parse.getQueryParameter("primaryTrackingUrl"))) {
            mo35551e(str, str2, str3);
            return true;
        } else if (m18901b(parse.getQueryParameter("fallbackUrl"), parse.getQueryParameter("fallbackTrackingUrl"))) {
            mo35551e(str, str2, str3);
            return true;
        } else {
            this.f15975a.mo35431a(str2, "Invalid URL", str);
            return false;
        }
    }

    /* renamed from: f */
    private boolean m18903f(String str, String str2, String str3) {
        try {
            return mo35550d(str, str2, str3);
        } catch (Exception unused) {
            this.f15975a.mo35431a(str2, "Unexpected error", "open");
            C6238hu.m18605a((byte) 1, "InMobi", "Failed to open URL; SDK encountered unexpected error");
            return false;
        }
    }

    /* renamed from: b */
    private boolean m18901b(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        C6224hl.m18530a();
        if (!C6224hl.m18531a(this.f15976b, str)) {
            return false;
        }
        m18900b(str2);
        return true;
    }

    /* renamed from: b */
    private static void m18900b(String str) {
        if (!TextUtils.isEmpty(str)) {
            C5874bk.m17607a().mo34847a(str, true);
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:16|17|18) */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        com.inmobi.media.C6236hs.m18601b(r4.f15976b, r7);
        r4.f15975a.mo35432b(r5, r6, r7);
        r4.f15975a.mo35429a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0043, code lost:
        return false;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x0034 */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo35550d(java.lang.String r5, java.lang.String r6, java.lang.String r7) {
        /*
            r4 = this;
            r0 = 0
            if (r7 == 0) goto L_0x0044
            java.lang.String r1 = "http"
            boolean r1 = r7.startsWith(r1)
            if (r1 == 0) goto L_0x0012
            boolean r1 = android.webkit.URLUtil.isValidUrl(r7)
            if (r1 != 0) goto L_0x0012
            goto L_0x0044
        L_0x0012:
            android.content.Context r1 = r4.f15976b
            java.lang.String r1 = com.inmobi.media.C6209h.m18477a(r1)
            com.inmobi.media.hn r2 = r4.f15985l     // Catch:{ Exception -> 0x0034 }
            boolean r2 = r2.f15773c     // Catch:{ Exception -> 0x0034 }
            if (r1 == 0) goto L_0x002f
            if (r2 != 0) goto L_0x0021
            goto L_0x002f
        L_0x0021:
            com.inmobi.media.co r1 = new com.inmobi.media.co     // Catch:{ Exception -> 0x0034 }
            android.content.Context r2 = r4.f15976b     // Catch:{ Exception -> 0x0034 }
            com.inmobi.media.f r3 = r4.f15986m     // Catch:{ Exception -> 0x0034 }
            r1.<init>(r7, r2, r3)     // Catch:{ Exception -> 0x0034 }
            r1.mo34925b()     // Catch:{ Exception -> 0x0034 }
            r5 = 1
            return r5
        L_0x002f:
            boolean r5 = r4.mo35546a(r7)     // Catch:{ Exception -> 0x0034 }
            return r5
        L_0x0034:
            android.content.Context r1 = r4.f15976b     // Catch:{ URISyntaxException -> 0x0043 }
            com.inmobi.media.C6236hs.m18601b(r1, r7)     // Catch:{ URISyntaxException -> 0x0043 }
            com.inmobi.media.hm r1 = r4.f15975a     // Catch:{ URISyntaxException -> 0x0043 }
            r1.mo35432b(r5, r6, r7)     // Catch:{ URISyntaxException -> 0x0043 }
            com.inmobi.media.hm r5 = r4.f15975a     // Catch:{ URISyntaxException -> 0x0043 }
            r5.mo35429a()     // Catch:{ URISyntaxException -> 0x0043 }
        L_0x0043:
            return r0
        L_0x0044:
            com.inmobi.media.hm r7 = r4.f15975a
            java.lang.String r1 = "Invalid URL"
            r7.mo35431a(r6, r1, r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C6317m.mo35550d(java.lang.String, java.lang.String, java.lang.String):boolean");
    }

    /* renamed from: a */
    public final boolean mo35546a(String str) {
        if (str.isEmpty()) {
            return false;
        }
        C6223hk.m18526a();
        if (C6223hk.m18528a(this.f15976b, str) || !C6236hs.m18598a(Uri.parse(str))) {
            return false;
        }
        Intent intent = new Intent(this.f15976b, InMobiAdActivity.class);
        intent.putExtra("com.inmobi.ads.rendering.InMobiAdActivity.EXTRA_AD_ACTIVITY_TYPE", 100);
        intent.putExtra("com.inmobi.ads.rendering.InMobiAdActivity.IN_APP_BROWSER_URL", str);
        this.f15975a.mo35430a(intent);
        this.f15975a.mo35432b((String) null, (String) null, str);
        return true;
    }

    /* renamed from: a */
    public final void mo35545a(String str, String str2, String str3, String str4) {
        while (true) {
            try {
                C6236hs.m18601b(this.f15976b, str3);
                mo35551e(str, str2, str3);
                return;
            } catch (URISyntaxException unused) {
                this.f15975a.mo35431a(str2, "Cannot resolve URI (" + m18902c(str3) + ")", str);
                if (str4 == null) {
                    return;
                }
            } catch (ActivityNotFoundException unused2) {
                this.f15975a.mo35431a(str2, "Cannot resolve URI (" + m18902c(str3) + ")", str);
                if (str4 == null) {
                    return;
                }
            } catch (Exception unused3) {
                this.f15975a.mo35431a(str2, "Unexpected error", str);
                C6238hu.m18605a((byte) 1, f15974c, "Could not open URL; SDK encountered an unexpected error");
                return;
            }
            str3 = str4;
            str4 = null;
        }
    }

    /* renamed from: c */
    private static String m18902c(String str) {
        try {
            return URLEncoder.encode(str, "UTF-8");
        } catch (UnsupportedEncodingException unused) {
            return str;
        }
    }

    /* renamed from: e */
    public final void mo35551e(String str, String str2, String str3) {
        this.f15975a.mo35429a();
        this.f15975a.mo35432b(str, str2, str3);
    }

    /* renamed from: a */
    public final void mo35544a(String str, String str2) {
        this.f15975a.mo35431a(str2, "Invalid URL", str);
    }
}

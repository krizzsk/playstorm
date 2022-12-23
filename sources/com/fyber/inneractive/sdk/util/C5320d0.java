package com.fyber.inneractive.sdk.util;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import androidx.core.net.MailTo;
import com.fyber.inneractive.sdk.activities.InneractiveInternalBrowserActivity;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.fyber.inneractive.sdk.util.d0 */
public class C5320d0 extends C5350l {

    /* renamed from: com.fyber.inneractive.sdk.util.d0$a */
    public static final class C5321a {

        /* renamed from: a */
        public final C5323c f14158a;

        /* renamed from: b */
        public final Throwable f14159b;

        /* renamed from: c */
        public final String f14160c;

        public C5321a(C5323c cVar, Throwable th, String str) {
            this.f14158a = cVar;
            this.f14159b = th;
            this.f14160c = str;
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.util.d0$b */
    public static final class C5322b extends Exception {
        public C5322b(String str) {
            super(str);
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.util.d0$c */
    public enum C5323c {
        FAILED,
        OPENED_IN_INTERNAL_BROWSER,
        OPEN_IN_EXTERNAL_APPLICATION,
        OPEN_IN_EXTERNAL_BROWSER,
        OPENED_USING_CHROME_NAVIGATE
    }

    /* renamed from: com.fyber.inneractive.sdk.util.d0$d */
    public enum C5324d {
        DO_NOT_OPEN_IN_INTERNAL_BROWSER,
        OPEN_EVERYTHING
    }

    /* renamed from: a */
    public static String m16718a(Context context) {
        try {
            return context.getClass().getName();
        } catch (Throwable unused) {
            return "failed";
        }
    }

    /* renamed from: d */
    public static boolean m16720d(String str) {
        return str.startsWith("http%3A%2F%2F") || str.startsWith("https%3A%2F%2F");
    }

    /* renamed from: e */
    public static boolean m16721e(String str) {
        if (!str.startsWith("tel:") && !str.startsWith("voicemail:") && !str.startsWith("sms:") && !str.startsWith(MailTo.MAILTO_SCHEME) && !str.startsWith("geo:") && !str.startsWith("google.streetview:")) {
            try {
                new URL(str);
                return false;
            } catch (MalformedURLException unused) {
                IAlog.m16703e("Failed to open Url: %s", str);
            }
        }
        return true;
    }

    /* renamed from: f */
    public static boolean m16722f(String str) {
        if (str != null && (!C5368r.m16780a() || IAConfigManager.f10525J.f10553r)) {
            if (!(!str.startsWith("http://") && !str.startsWith("http%3A%2F%2F"))) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:131|132) */
    /* JADX WARNING: Can't wrap try/catch for region: R(4:76|77|78|79) */
    /* JADX WARNING: Code restructure failed: missing block: B:132:?, code lost:
        r0.startActivity(m16715a(r16, r17));
        r2 = new com.fyber.inneractive.sdk.util.C5320d0.C5321a(com.fyber.inneractive.sdk.util.C5320d0.C5323c.f14164d, (java.lang.Throwable) null, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:?, code lost:
        return new com.fyber.inneractive.sdk.util.C5320d0.C5321a(com.fyber.inneractive.sdk.util.C5320d0.C5323c.f14164d, (java.lang.Throwable) null, r1);
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:131:0x02cc */
    /* JADX WARNING: Missing exception handler attribute for start block: B:136:0x02ed */
    /* JADX WARNING: Missing exception handler attribute for start block: B:156:0x033f */
    /* JADX WARNING: Missing exception handler attribute for start block: B:78:0x0192 */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x0299 A[SYNTHETIC, Splitter:B:120:0x0299] */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x02dc A[SYNTHETIC, Splitter:B:133:0x02dc] */
    /* JADX WARNING: Removed duplicated region for block: B:165:0x0377  */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x0384 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00bc  */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:150:0x0322=Splitter:B:150:0x0322, B:120:0x0299=Splitter:B:120:0x0299, B:136:0x02ed=Splitter:B:136:0x02ed} */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.fyber.inneractive.sdk.util.C5320d0.C5321a m16717a(android.content.Context r16, java.lang.String r17, boolean r18, com.fyber.inneractive.sdk.util.C5320d0.C5324d r19, java.lang.String r20) {
        /*
            r0 = r16
            r1 = r17
            r2 = r19
            r3 = r20
            java.lang.String r4 = m16718a(r16)
            r5 = 0
            r6 = 0
            r7 = 1
            android.net.Uri r8 = android.net.Uri.parse(r17)     // Catch:{ Exception -> 0x0014 }
            goto L_0x001e
        L_0x0014:
            java.lang.Object[] r8 = new java.lang.Object[r7]
            r8[r6] = r1
            java.lang.String r9 = "IAJavaUtil: getValidUri: Invalid url %s"
            com.fyber.inneractive.sdk.util.IAlog.m16699a(r9, r8)
            r8 = r5
        L_0x001e:
            if (r8 == 0) goto L_0x0385
            java.lang.String r9 = r8.getScheme()
            java.lang.String r10 = "smartlink"
            boolean r9 = r10.equalsIgnoreCase(r9)
            r10 = 2
            java.lang.String r11 = "%s %s"
            java.lang.String r12 = "android.intent.action.VIEW"
            if (r9 == 0) goto L_0x0137
            java.util.PriorityQueue r1 = new java.util.PriorityQueue
            r1.<init>()
            java.lang.String r2 = "primaryUrl"
            java.lang.String r2 = r8.getQueryParameter(r2)
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 != 0) goto L_0x004e
            android.net.Uri r3 = android.net.Uri.parse(r2)
            boolean r3 = com.fyber.inneractive.sdk.util.C5363p.m16775a(r0, r3)
            if (r3 == 0) goto L_0x004e
            r3 = r7
            goto L_0x004f
        L_0x004e:
            r3 = r6
        L_0x004f:
            if (r3 == 0) goto L_0x0069
            java.lang.String r3 = "primaryTrackingUrl"
            java.util.List r3 = r8.getQueryParameters(r3)
            com.fyber.inneractive.sdk.util.s0$a r9 = com.fyber.inneractive.sdk.util.C5371s0.C5372a.Primary
            android.net.Uri r2 = android.net.Uri.parse(r2)     // Catch:{ Exception -> 0x005e }
            goto L_0x005f
        L_0x005e:
            r2 = r5
        L_0x005f:
            if (r2 == 0) goto L_0x0069
            com.fyber.inneractive.sdk.util.s0 r13 = new com.fyber.inneractive.sdk.util.s0
            r13.<init>(r9, r2, r3)
            r1.offer(r13)
        L_0x0069:
            java.lang.String r2 = "fallbackUrl"
            java.lang.String r2 = r8.getQueryParameter(r2)
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 != 0) goto L_0x0081
            android.net.Uri r3 = android.net.Uri.parse(r2)
            boolean r3 = com.fyber.inneractive.sdk.util.C5363p.m16775a(r0, r3)
            if (r3 == 0) goto L_0x0081
            r3 = r7
            goto L_0x0082
        L_0x0081:
            r3 = r6
        L_0x0082:
            if (r3 == 0) goto L_0x009c
            java.lang.String r3 = "fallbackTrackingUrl"
            java.util.List r3 = r8.getQueryParameters(r3)
            com.fyber.inneractive.sdk.util.s0$a r8 = com.fyber.inneractive.sdk.util.C5371s0.C5372a.FallBack
            android.net.Uri r2 = android.net.Uri.parse(r2)     // Catch:{ Exception -> 0x0091 }
            goto L_0x0092
        L_0x0091:
            r2 = r5
        L_0x0092:
            if (r2 == 0) goto L_0x009c
            com.fyber.inneractive.sdk.util.s0 r9 = new com.fyber.inneractive.sdk.util.s0
            r9.<init>(r8, r2, r3)
            r1.offer(r9)
        L_0x009c:
            int r2 = r1.size()
            if (r2 <= 0) goto L_0x00a4
            r2 = r7
            goto L_0x00a5
        L_0x00a4:
            r2 = r6
        L_0x00a5:
            if (r2 == 0) goto L_0x0128
        L_0x00a7:
            java.lang.Object r2 = r1.poll()
            com.fyber.inneractive.sdk.util.s0 r2 = (com.fyber.inneractive.sdk.util.C5371s0) r2
            if (r2 == 0) goto L_0x00b7
            android.net.Uri r3 = r2.f14241b
            boolean r3 = com.fyber.inneractive.sdk.util.C5363p.m16775a(r0, r3)
            if (r3 == 0) goto L_0x00a7
        L_0x00b7:
            if (r2 != 0) goto L_0x00bc
            com.fyber.inneractive.sdk.util.d0$c r0 = com.fyber.inneractive.sdk.util.C5320d0.C5323c.FAILED
            goto L_0x0111
        L_0x00bc:
            android.content.Intent r1 = new android.content.Intent
            android.net.Uri r3 = r2.f14241b
            r1.<init>(r12, r3)
            boolean r0 = m16719a((android.content.Context) r0, (android.content.Intent) r1)
            if (r0 == 0) goto L_0x010a
            java.util.List<java.lang.String> r1 = r2.f14242c
            java.util.Iterator r1 = r1.iterator()
        L_0x00cf:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x010a
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 != 0) goto L_0x00ee
            int r3 = com.fyber.inneractive.sdk.util.IAlog.f14137a
            java.lang.Object[] r3 = new java.lang.Object[r10]
            java.lang.String r8 = "SMART_LINK"
            r3[r6] = r8
            r3[r7] = r2
            com.fyber.inneractive.sdk.util.IAlog.m16697a(r7, r5, r11, r3)
        L_0x00ee:
            long r8 = java.lang.System.currentTimeMillis()
            com.fyber.inneractive.sdk.network.h0 r3 = new com.fyber.inneractive.sdk.network.h0
            com.fyber.inneractive.sdk.util.o r12 = new com.fyber.inneractive.sdk.util.o
            r12.<init>(r2, r8)
            r3.<init>(r12, r2)
            com.fyber.inneractive.sdk.config.IAConfigManager r2 = com.fyber.inneractive.sdk.config.IAConfigManager.f10525J
            com.fyber.inneractive.sdk.network.w r2 = r2.f10555t
            java.util.concurrent.BlockingQueue<com.fyber.inneractive.sdk.network.b0<?>> r2 = r2.f11387a
            r2.offer(r3)
            com.fyber.inneractive.sdk.network.m0 r2 = com.fyber.inneractive.sdk.network.C4559m0.QUEUED
            r3.f11228f = r2
            goto L_0x00cf
        L_0x010a:
            if (r0 == 0) goto L_0x010f
            com.fyber.inneractive.sdk.util.d0$c r0 = com.fyber.inneractive.sdk.util.C5320d0.C5323c.OPEN_IN_EXTERNAL_BROWSER
            goto L_0x0111
        L_0x010f:
            com.fyber.inneractive.sdk.util.d0$c r0 = com.fyber.inneractive.sdk.util.C5320d0.C5323c.FAILED
        L_0x0111:
            com.fyber.inneractive.sdk.util.d0$c r1 = com.fyber.inneractive.sdk.util.C5320d0.C5323c.FAILED
            if (r0 != r1) goto L_0x0122
            com.fyber.inneractive.sdk.util.d0$a r0 = new com.fyber.inneractive.sdk.util.d0$a
            com.fyber.inneractive.sdk.util.d0$b r2 = new com.fyber.inneractive.sdk.util.d0$b
            java.lang.String r3 = "IADeeplinkUtil.tryHandleDeepLinkWithExternalApp has failed"
            r2.<init>(r3)
            r0.<init>(r1, r2, r4)
            return r0
        L_0x0122:
            com.fyber.inneractive.sdk.util.d0$a r1 = new com.fyber.inneractive.sdk.util.d0$a
            r1.<init>(r0, r5, r4)
            return r1
        L_0x0128:
            com.fyber.inneractive.sdk.util.d0$a r0 = new com.fyber.inneractive.sdk.util.d0$a
            com.fyber.inneractive.sdk.util.d0$c r1 = com.fyber.inneractive.sdk.util.C5320d0.C5323c.FAILED
            com.fyber.inneractive.sdk.util.d0$b r2 = new com.fyber.inneractive.sdk.util.d0$b
            java.lang.String r3 = "!fyberDeepLink.isValid()"
            r2.<init>(r3)
            r0.<init>(r1, r2, r4)
            return r0
        L_0x0137:
            java.lang.String r9 = r8.getScheme()
            java.lang.String r13 = "intent"
            boolean r9 = r13.equalsIgnoreCase(r9)
            if (r9 == 0) goto L_0x01c1
            java.lang.String r1 = m16718a(r16)
            java.lang.String r2 = r8.toString()     // Catch:{ URISyntaxException -> 0x01ae }
            android.content.Intent r2 = android.content.Intent.parseUri(r2, r7)     // Catch:{ URISyntaxException -> 0x01ae }
            boolean r3 = m16719a((android.content.Context) r0, (android.content.Intent) r2)     // Catch:{ URISyntaxException -> 0x01ae }
            if (r3 == 0) goto L_0x016a
            int r0 = com.fyber.inneractive.sdk.util.IAlog.f14137a     // Catch:{ URISyntaxException -> 0x01ae }
            java.lang.Object[] r0 = new java.lang.Object[r10]     // Catch:{ URISyntaxException -> 0x01ae }
            java.lang.String r2 = "DEEPLINK"
            r0[r6] = r2     // Catch:{ URISyntaxException -> 0x01ae }
            r0[r7] = r8     // Catch:{ URISyntaxException -> 0x01ae }
            com.fyber.inneractive.sdk.util.IAlog.m16697a(r7, r5, r11, r0)     // Catch:{ URISyntaxException -> 0x01ae }
            com.fyber.inneractive.sdk.util.d0$a r0 = new com.fyber.inneractive.sdk.util.d0$a     // Catch:{ URISyntaxException -> 0x01ae }
            com.fyber.inneractive.sdk.util.d0$c r2 = com.fyber.inneractive.sdk.util.C5320d0.C5323c.OPEN_IN_EXTERNAL_APPLICATION     // Catch:{ URISyntaxException -> 0x01ae }
            r0.<init>(r2, r5, r1)     // Catch:{ URISyntaxException -> 0x01ae }
            goto L_0x01c0
        L_0x016a:
            java.lang.String r3 = "browser_fallback_url"
            java.lang.String r2 = r2.getStringExtra(r3)     // Catch:{ URISyntaxException -> 0x01ae }
            boolean r3 = android.text.TextUtils.isEmpty(r2)     // Catch:{ URISyntaxException -> 0x01ae }
            if (r3 != 0) goto L_0x019f
            android.content.Intent r3 = m16715a((android.content.Context) r0, (java.lang.String) r2)     // Catch:{ ActivityNotFoundException -> 0x0192 }
            r0.startActivity(r3)     // Catch:{ ActivityNotFoundException -> 0x0192 }
            int r0 = com.fyber.inneractive.sdk.util.IAlog.f14137a     // Catch:{ ActivityNotFoundException -> 0x0192 }
            java.lang.Object[] r0 = new java.lang.Object[r10]     // Catch:{ ActivityNotFoundException -> 0x0192 }
            java.lang.String r3 = "Intent opened successfully, url:"
            r0[r6] = r3     // Catch:{ ActivityNotFoundException -> 0x0192 }
            r0[r7] = r2     // Catch:{ ActivityNotFoundException -> 0x0192 }
            com.fyber.inneractive.sdk.util.IAlog.m16697a(r7, r5, r11, r0)     // Catch:{ ActivityNotFoundException -> 0x0192 }
            com.fyber.inneractive.sdk.util.d0$a r0 = new com.fyber.inneractive.sdk.util.d0$a     // Catch:{ ActivityNotFoundException -> 0x0192 }
            com.fyber.inneractive.sdk.util.d0$c r3 = com.fyber.inneractive.sdk.util.C5320d0.C5323c.OPEN_IN_EXTERNAL_BROWSER     // Catch:{ ActivityNotFoundException -> 0x0192 }
            r0.<init>(r3, r5, r1)     // Catch:{ ActivityNotFoundException -> 0x0192 }
            goto L_0x01c0
        L_0x0192:
            int r0 = com.fyber.inneractive.sdk.util.IAlog.f14137a     // Catch:{ URISyntaxException -> 0x01ae }
            java.lang.Object[] r0 = new java.lang.Object[r10]     // Catch:{ URISyntaxException -> 0x01ae }
            java.lang.String r3 = "Intent failed, url:"
            r0[r6] = r3     // Catch:{ URISyntaxException -> 0x01ae }
            r0[r7] = r2     // Catch:{ URISyntaxException -> 0x01ae }
            com.fyber.inneractive.sdk.util.IAlog.m16697a(r7, r5, r11, r0)     // Catch:{ URISyntaxException -> 0x01ae }
        L_0x019f:
            com.fyber.inneractive.sdk.util.d0$a r0 = new com.fyber.inneractive.sdk.util.d0$a     // Catch:{ URISyntaxException -> 0x01ae }
            com.fyber.inneractive.sdk.util.d0$c r2 = com.fyber.inneractive.sdk.util.C5320d0.C5323c.FAILED     // Catch:{ URISyntaxException -> 0x01ae }
            com.fyber.inneractive.sdk.util.d0$b r3 = new com.fyber.inneractive.sdk.util.d0$b     // Catch:{ URISyntaxException -> 0x01ae }
            java.lang.String r4 = "tryToOpenExternalApp has failed (intent scheme)"
            r3.<init>(r4)     // Catch:{ URISyntaxException -> 0x01ae }
            r0.<init>(r2, r3, r1)     // Catch:{ URISyntaxException -> 0x01ae }
            goto L_0x01c0
        L_0x01ae:
            r0 = move-exception
            java.lang.String r2 = r0.getLocalizedMessage()
            java.lang.Object[] r3 = new java.lang.Object[r6]
            com.fyber.inneractive.sdk.util.IAlog.m16699a(r2, r3)
            com.fyber.inneractive.sdk.util.d0$a r2 = new com.fyber.inneractive.sdk.util.d0$a
            com.fyber.inneractive.sdk.util.d0$c r3 = com.fyber.inneractive.sdk.util.C5320d0.C5323c.FAILED
            r2.<init>(r3, r0, r1)
            r0 = r2
        L_0x01c0:
            return r0
        L_0x01c1:
            android.content.pm.PackageManager r9 = r16.getPackageManager()
            android.content.Intent r10 = new android.content.Intent
            r10.<init>(r12, r8)
            r11 = 32
            java.util.List r9 = r9.queryIntentActivities(r10, r11)
            r10 = 268435456(0x10000000, float:2.5243549E-29)
            if (r9 == 0) goto L_0x0258
            int r13 = r9.size()
            if (r13 <= 0) goto L_0x0258
            android.content.pm.PackageManager r13 = r16.getPackageManager()
            android.content.Intent r14 = new android.content.Intent
            java.lang.String r15 = "http://www.fyber.com"
            android.net.Uri r15 = android.net.Uri.parse(r15)
            r14.<init>(r12, r15)
            java.util.List r11 = r13.queryIntentActivities(r14, r11)
            java.util.TreeSet r13 = new java.util.TreeSet
            java.util.Comparator<android.content.pm.ResolveInfo> r14 = com.fyber.inneractive.sdk.util.C5350l.f14217b
            r13.<init>(r14)
            r13.addAll(r11)
            r9.removeAll(r13)
            int r11 = r9.size()
            if (r11 <= 0) goto L_0x021e
            java.lang.Object r9 = r9.get(r6)
            android.content.pm.ResolveInfo r9 = (android.content.pm.ResolveInfo) r9
            if (r9 == 0) goto L_0x021e
            android.content.Intent r11 = new android.content.Intent
            r11.<init>(r12, r8)
            android.content.pm.ActivityInfo r8 = r9.activityInfo
            java.lang.String r9 = r8.packageName
            java.lang.String r8 = r8.name
            r11.setClassName(r9, r8)
            boolean r8 = r0 instanceof android.app.Activity
            if (r8 != 0) goto L_0x021f
            r11.setFlags(r10)
            goto L_0x021f
        L_0x021e:
            r11 = r5
        L_0x021f:
            if (r11 == 0) goto L_0x0258
            r0.startActivity(r11)     // Catch:{ Exception -> 0x022c }
            com.fyber.inneractive.sdk.util.d0$a r0 = new com.fyber.inneractive.sdk.util.d0$a     // Catch:{ Exception -> 0x022c }
            com.fyber.inneractive.sdk.util.d0$c r1 = com.fyber.inneractive.sdk.util.C5320d0.C5323c.OPEN_IN_EXTERNAL_APPLICATION     // Catch:{ Exception -> 0x022c }
            r0.<init>(r1, r5, r4)     // Catch:{ Exception -> 0x022c }
            return r0
        L_0x022c:
            r0 = move-exception
            java.lang.String r1 = r0.getLocalizedMessage()
            java.lang.Object[] r2 = new java.lang.Object[r6]
            com.fyber.inneractive.sdk.util.IAlog.m16699a(r1, r2)
            com.fyber.inneractive.sdk.util.d0$a r1 = new com.fyber.inneractive.sdk.util.d0$a
            com.fyber.inneractive.sdk.util.d0$c r2 = com.fyber.inneractive.sdk.util.C5320d0.C5323c.FAILED
            com.fyber.inneractive.sdk.util.d0$b r3 = new com.fyber.inneractive.sdk.util.d0$b
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "deep linkk failed to open with message - "
            r5.append(r6)
            java.lang.String r0 = r0.getMessage()
            r5.append(r0)
            java.lang.String r0 = r5.toString()
            r3.<init>(r0)
            r1.<init>(r2, r3, r4)
            return r1
        L_0x0258:
            com.fyber.inneractive.sdk.util.d0$d r8 = com.fyber.inneractive.sdk.util.C5320d0.C5324d.DO_NOT_OPEN_IN_INTERNAL_BROWSER
            if (r2 != r8) goto L_0x026b
            com.fyber.inneractive.sdk.util.d0$a r0 = new com.fyber.inneractive.sdk.util.d0$a
            com.fyber.inneractive.sdk.util.d0$c r1 = com.fyber.inneractive.sdk.util.C5320d0.C5323c.FAILED
            com.fyber.inneractive.sdk.util.d0$b r2 = new com.fyber.inneractive.sdk.util.d0$b
            java.lang.String r3 = "Redirect from internal browser didn't success "
            r2.<init>(r3)
            r0.<init>(r1, r2, r4)
            return r0
        L_0x026b:
            if (r18 == 0) goto L_0x0288
            boolean r9 = android.text.TextUtils.isEmpty(r17)
            if (r9 != 0) goto L_0x0283
            java.util.Locale r9 = java.util.Locale.US
            java.lang.String r9 = r1.toLowerCase(r9)
            java.lang.String r11 = "http"
            boolean r9 = r9.startsWith(r11)
            if (r9 == 0) goto L_0x0283
            r9 = r7
            goto L_0x0284
        L_0x0283:
            r9 = r6
        L_0x0284:
            if (r9 != 0) goto L_0x0288
            r9 = r6
            goto L_0x028a
        L_0x0288:
            r9 = r18
        L_0x028a:
            java.lang.String r11 = m16718a(r16)
            java.lang.String r13 = "IAJavaUtil - valid url found: '%s' opening browser"
            java.lang.Object[] r14 = new java.lang.Object[r7]     // Catch:{ all -> 0x0360 }
            r14[r6] = r1     // Catch:{ all -> 0x0360 }
            com.fyber.inneractive.sdk.util.IAlog.m16699a(r13, r14)     // Catch:{ all -> 0x0360 }
            if (r9 == 0) goto L_0x02dc
            boolean r9 = m16721e(r17)     // Catch:{ ActivityNotFoundException -> 0x02cc }
            if (r9 != 0) goto L_0x02a7
            boolean r9 = m16720d(r17)     // Catch:{ ActivityNotFoundException -> 0x02cc }
            if (r9 != 0) goto L_0x02a7
            r9 = r7
            goto L_0x02a8
        L_0x02a7:
            r9 = r6
        L_0x02a8:
            if (r9 == 0) goto L_0x02bc
            if (r2 == r8) goto L_0x02bc
            android.content.Intent r2 = m16716a(r0, r1, r3)     // Catch:{ ActivityNotFoundException -> 0x02cc }
            r0.startActivity(r2)     // Catch:{ ActivityNotFoundException -> 0x02cc }
            com.fyber.inneractive.sdk.util.d0$a r2 = new com.fyber.inneractive.sdk.util.d0$a     // Catch:{ ActivityNotFoundException -> 0x02cc }
            com.fyber.inneractive.sdk.util.d0$c r3 = com.fyber.inneractive.sdk.util.C5320d0.C5323c.OPENED_IN_INTERNAL_BROWSER     // Catch:{ ActivityNotFoundException -> 0x02cc }
            r2.<init>(r3, r5, r11)     // Catch:{ ActivityNotFoundException -> 0x02cc }
            goto L_0x0371
        L_0x02bc:
            com.fyber.inneractive.sdk.util.d0$a r2 = new com.fyber.inneractive.sdk.util.d0$a     // Catch:{ ActivityNotFoundException -> 0x02cc }
            com.fyber.inneractive.sdk.util.d0$c r3 = com.fyber.inneractive.sdk.util.C5320d0.C5323c.FAILED     // Catch:{ ActivityNotFoundException -> 0x02cc }
            com.fyber.inneractive.sdk.util.d0$b r8 = new com.fyber.inneractive.sdk.util.d0$b     // Catch:{ ActivityNotFoundException -> 0x02cc }
            java.lang.String r9 = "canOpenInExternalBrowser has decided it cant be opened and shouldUseInternalBrowser was set to false"
            r8.<init>(r9)     // Catch:{ ActivityNotFoundException -> 0x02cc }
            r2.<init>(r3, r8, r11)     // Catch:{ ActivityNotFoundException -> 0x02cc }
            goto L_0x0371
        L_0x02cc:
            android.content.Intent r2 = m16715a((android.content.Context) r16, (java.lang.String) r17)     // Catch:{ all -> 0x0360 }
            r0.startActivity(r2)     // Catch:{ all -> 0x0360 }
            com.fyber.inneractive.sdk.util.d0$a r2 = new com.fyber.inneractive.sdk.util.d0$a     // Catch:{ all -> 0x0360 }
            com.fyber.inneractive.sdk.util.d0$c r0 = com.fyber.inneractive.sdk.util.C5320d0.C5323c.OPEN_IN_EXTERNAL_BROWSER     // Catch:{ all -> 0x0360 }
            r2.<init>(r0, r5, r11)     // Catch:{ all -> 0x0360 }
            goto L_0x0371
        L_0x02dc:
            android.content.Intent r8 = m16715a((android.content.Context) r16, (java.lang.String) r17)     // Catch:{ ActivityNotFoundException -> 0x0320, all -> 0x02ed }
            r0.startActivity(r8)     // Catch:{ ActivityNotFoundException -> 0x0320, all -> 0x02ed }
            com.fyber.inneractive.sdk.util.d0$a r8 = new com.fyber.inneractive.sdk.util.d0$a     // Catch:{ ActivityNotFoundException -> 0x0320, all -> 0x02ed }
            com.fyber.inneractive.sdk.util.d0$c r9 = com.fyber.inneractive.sdk.util.C5320d0.C5323c.OPEN_IN_EXTERNAL_BROWSER     // Catch:{ ActivityNotFoundException -> 0x0320, all -> 0x02ed }
            r8.<init>(r9, r5, r11)     // Catch:{ ActivityNotFoundException -> 0x0320, all -> 0x02ed }
            r2 = r8
            goto L_0x0371
        L_0x02ed:
            boolean r8 = m16721e(r17)     // Catch:{ all -> 0x0360 }
            if (r8 != 0) goto L_0x02fb
            boolean r8 = m16720d(r17)     // Catch:{ all -> 0x0360 }
            if (r8 != 0) goto L_0x02fb
            r8 = r7
            goto L_0x02fc
        L_0x02fb:
            r8 = r6
        L_0x02fc:
            if (r8 == 0) goto L_0x0311
            com.fyber.inneractive.sdk.util.d0$d r8 = com.fyber.inneractive.sdk.util.C5320d0.C5324d.DO_NOT_OPEN_IN_INTERNAL_BROWSER     // Catch:{ all -> 0x0360 }
            if (r2 == r8) goto L_0x0311
            android.content.Intent r2 = m16716a(r0, r1, r3)     // Catch:{ all -> 0x0360 }
            r0.startActivity(r2)     // Catch:{ all -> 0x0360 }
            com.fyber.inneractive.sdk.util.d0$a r2 = new com.fyber.inneractive.sdk.util.d0$a     // Catch:{ all -> 0x0360 }
            com.fyber.inneractive.sdk.util.d0$c r0 = com.fyber.inneractive.sdk.util.C5320d0.C5323c.OPENED_IN_INTERNAL_BROWSER     // Catch:{ all -> 0x0360 }
            r2.<init>(r0, r5, r11)     // Catch:{ all -> 0x0360 }
            goto L_0x0371
        L_0x0311:
            com.fyber.inneractive.sdk.util.d0$a r2 = new com.fyber.inneractive.sdk.util.d0$a     // Catch:{ all -> 0x0360 }
            com.fyber.inneractive.sdk.util.d0$c r0 = com.fyber.inneractive.sdk.util.C5320d0.C5323c.FAILED     // Catch:{ all -> 0x0360 }
            com.fyber.inneractive.sdk.util.d0$b r3 = new com.fyber.inneractive.sdk.util.d0$b     // Catch:{ all -> 0x0360 }
            java.lang.String r5 = "canOpenInExternalBrowser has decided it cant be opened and shouldUseInternalBrowser was set to true"
            r3.<init>(r5)     // Catch:{ all -> 0x0360 }
            r2.<init>(r0, r3, r11)     // Catch:{ all -> 0x0360 }
            goto L_0x0371
        L_0x0320:
            java.lang.String r2 = "googlechrome://navigate?url=%s"
            java.lang.Object[] r3 = new java.lang.Object[r7]     // Catch:{ all -> 0x033f }
            r3[r6] = r1     // Catch:{ all -> 0x033f }
            java.lang.String r2 = java.lang.String.format(r2, r3)     // Catch:{ all -> 0x033f }
            android.net.Uri r2 = android.net.Uri.parse(r2)     // Catch:{ all -> 0x033f }
            android.content.Intent r3 = new android.content.Intent     // Catch:{ all -> 0x033f }
            r3.<init>(r12, r2)     // Catch:{ all -> 0x033f }
            boolean r2 = r0 instanceof android.app.Activity     // Catch:{ all -> 0x033f }
            if (r2 != 0) goto L_0x033a
            r3.addFlags(r10)     // Catch:{ all -> 0x033f }
        L_0x033a:
            r0.startActivity(r3)     // Catch:{ all -> 0x033f }
            r0 = r7
            goto L_0x0347
        L_0x033f:
            java.lang.Object[] r0 = new java.lang.Object[r6]     // Catch:{ all -> 0x0360 }
            java.lang.String r2 = "Failed opening chrome for a special uri."
            com.fyber.inneractive.sdk.util.IAlog.m16703e(r2, r0)     // Catch:{ all -> 0x0360 }
            r0 = r6
        L_0x0347:
            if (r0 == 0) goto L_0x0351
            com.fyber.inneractive.sdk.util.d0$a r2 = new com.fyber.inneractive.sdk.util.d0$a     // Catch:{ all -> 0x0360 }
            com.fyber.inneractive.sdk.util.d0$c r0 = com.fyber.inneractive.sdk.util.C5320d0.C5323c.OPENED_USING_CHROME_NAVIGATE     // Catch:{ all -> 0x0360 }
            r2.<init>(r0, r5, r11)     // Catch:{ all -> 0x0360 }
            goto L_0x0371
        L_0x0351:
            com.fyber.inneractive.sdk.util.d0$a r2 = new com.fyber.inneractive.sdk.util.d0$a     // Catch:{ all -> 0x0360 }
            com.fyber.inneractive.sdk.util.d0$c r0 = com.fyber.inneractive.sdk.util.C5320d0.C5323c.FAILED     // Catch:{ all -> 0x0360 }
            com.fyber.inneractive.sdk.util.d0$b r3 = new com.fyber.inneractive.sdk.util.d0$b     // Catch:{ all -> 0x0360 }
            java.lang.String r5 = "tryOpeningChromeGracefully has failed and couldn't open the url"
            r3.<init>(r5)     // Catch:{ all -> 0x0360 }
            r2.<init>(r0, r3, r11)     // Catch:{ all -> 0x0360 }
            goto L_0x0371
        L_0x0360:
            r0 = move-exception
            java.lang.Object[] r2 = new java.lang.Object[r7]
            r2[r6] = r1
            java.lang.String r1 = "IAJavaUtil - could not open a browser for url: %s"
            com.fyber.inneractive.sdk.util.IAlog.m16699a(r1, r2)
            com.fyber.inneractive.sdk.util.d0$a r2 = new com.fyber.inneractive.sdk.util.d0$a
            com.fyber.inneractive.sdk.util.d0$c r1 = com.fyber.inneractive.sdk.util.C5320d0.C5323c.FAILED
            r2.<init>(r1, r0, r11)
        L_0x0371:
            com.fyber.inneractive.sdk.util.d0$c r0 = r2.f14158a
            com.fyber.inneractive.sdk.util.d0$c r1 = com.fyber.inneractive.sdk.util.C5320d0.C5323c.FAILED
            if (r0 == r1) goto L_0x0384
            com.fyber.inneractive.sdk.util.d0$a r1 = new com.fyber.inneractive.sdk.util.d0$a
            com.fyber.inneractive.sdk.util.d0$b r2 = new com.fyber.inneractive.sdk.util.d0$b
            java.lang.String r3 = "Used fallback for opening the click"
            r2.<init>(r3)
            r1.<init>(r0, r2, r4)
            return r1
        L_0x0384:
            return r2
        L_0x0385:
            com.fyber.inneractive.sdk.util.d0$a r0 = new com.fyber.inneractive.sdk.util.d0$a
            com.fyber.inneractive.sdk.util.d0$c r1 = com.fyber.inneractive.sdk.util.C5320d0.C5323c.FAILED
            com.fyber.inneractive.sdk.util.d0$b r2 = new com.fyber.inneractive.sdk.util.d0$b
            java.lang.String r3 = "all methods has been exhausted, illegal uri"
            r2.<init>(r3)
            r0.<init>(r1, r2, r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.util.C5320d0.m16717a(android.content.Context, java.lang.String, boolean, com.fyber.inneractive.sdk.util.d0$d, java.lang.String):com.fyber.inneractive.sdk.util.d0$a");
    }

    /* renamed from: a */
    public static Intent m16715a(Context context, String str) {
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
        if (!(context instanceof Activity)) {
            intent.setFlags(268435456);
        }
        return intent;
    }

    /* renamed from: a */
    public static Intent m16716a(Context context, String str, String str2) {
        Intent intent = new Intent(context, InneractiveInternalBrowserActivity.class);
        intent.putExtra(InneractiveInternalBrowserActivity.URL_EXTRA, str);
        intent.putExtra("spotId", str2);
        if (!(context instanceof Activity)) {
            intent.setFlags(268435456);
        }
        return intent;
    }

    /* renamed from: a */
    public static boolean m16719a(Context context, Intent intent) {
        if (!(context == null || intent == null)) {
            List<ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 0);
            ArrayList arrayList = new ArrayList();
            for (ResolveInfo next : queryIntentActivities) {
                if (next.activityInfo.exported) {
                    arrayList.add(next);
                }
            }
            if (arrayList.isEmpty()) {
                return false;
            }
            if (!(context instanceof Activity)) {
                intent.addFlags(268435456);
            }
            try {
                context.startActivity(intent);
                return true;
            } catch (ActivityNotFoundException unused) {
            }
        }
        return false;
    }
}

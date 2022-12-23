package com.inmobi.media;

import android.content.ComponentName;
import android.content.Context;
import androidx.browser.customtabs.CustomTabsClient;
import androidx.browser.customtabs.CustomTabsServiceConnection;

/* renamed from: com.inmobi.media.g */
/* compiled from: CustomTabHelper */
public class C6158g {
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static final String f15613d = C6158g.class.getSimpleName();

    /* renamed from: a */
    public CustomTabsClient f15614a;

    /* renamed from: b */
    public CustomTabsServiceConnection f15615b;

    /* renamed from: c */
    public C6161a f15616c;

    /* renamed from: com.inmobi.media.g$a */
    /* compiled from: CustomTabHelper */
    public interface C6161a {
        /* renamed from: a */
        void mo34923a();

        /* renamed from: a */
        void mo34924a(int i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:?, code lost:
        com.inmobi.media.C6236hs.m18601b(r2, r4.toString());
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x001e */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m18362a(android.content.Context r2, androidx.browser.customtabs.CustomTabsIntent r3, android.net.Uri r4, com.inmobi.media.C6060f r5) {
        /*
            java.lang.String r0 = com.inmobi.media.C6209h.m18477a(r2)
            if (r0 != 0) goto L_0x000e
            java.lang.String r3 = r4.toString()     // Catch:{ Exception -> 0x001e }
            r5.mo35211a(r3)     // Catch:{ Exception -> 0x001e }
            return
        L_0x000e:
            android.content.Intent r5 = r3.intent     // Catch:{ Exception -> 0x001e }
            r1 = 268435456(0x10000000, float:2.5243549E-29)
            r5.setFlags(r1)     // Catch:{ Exception -> 0x001e }
            android.content.Intent r5 = r3.intent     // Catch:{ Exception -> 0x001e }
            r5.setPackage(r0)     // Catch:{ Exception -> 0x001e }
            r3.launchUrl(r2, r4)     // Catch:{ Exception -> 0x001e }
            return
        L_0x001e:
            java.lang.String r3 = r4.toString()     // Catch:{ Exception -> 0x0025 }
            com.inmobi.media.C6236hs.m18601b(r2, r3)     // Catch:{ Exception -> 0x0025 }
        L_0x0025:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C6158g.m18362a(android.content.Context, androidx.browser.customtabs.CustomTabsIntent, android.net.Uri, com.inmobi.media.f):void");
    }

    /* renamed from: a */
    public final void mo35342a(Context context) {
        String a;
        if (this.f15614a == null && context != null && (a = C6209h.m18477a(context)) != null) {
            C61602 r1 = new CustomTabsServiceConnection() {
                public final void onCustomTabsServiceConnected(ComponentName componentName, CustomTabsClient customTabsClient) {
                    CustomTabsClient unused = C6158g.this.f15614a = customTabsClient;
                    if (C6158g.this.f15616c != null) {
                        C6158g.this.f15616c.mo34923a();
                    }
                }

                public final void onServiceDisconnected(ComponentName componentName) {
                    CustomTabsClient unused = C6158g.this.f15614a = null;
                    if (C6158g.this.f15616c != null) {
                        C6161a unused2 = C6158g.this.f15616c;
                    }
                }

                public final void onBindingDied(ComponentName componentName) {
                    CustomTabsClient unused = C6158g.this.f15614a = null;
                    if (C6158g.this.f15616c != null) {
                        C6161a unused2 = C6158g.this.f15616c;
                    }
                }
            };
            this.f15615b = r1;
            CustomTabsClient.bindCustomTabsService(context, a, r1);
        }
    }
}

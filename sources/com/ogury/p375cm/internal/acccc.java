package com.ogury.p375cm.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.PurchasesUpdatedListener;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;

/* renamed from: com.ogury.cm.internal.acccc */
public final class acccc {

    /* renamed from: a */
    public static final acccc f25869a = new acccc();

    /* renamed from: b */
    private static baaab f25870b;

    /* renamed from: c */
    private static BillingClient f25871c;

    /* renamed from: d */
    private static boolean f25872d;

    private acccc() {
    }

    /* renamed from: a */
    public static void m30877a() {
        f25870b = new baaca();
    }

    /* renamed from: a */
    private static void m30878a(Context context, String str) {
        Log.w("FairChoice", str);
        baaba baaba = baaba.f25874a;
        baaba.m30885a(context);
    }

    /* renamed from: b */
    public static baabc m30879b(Context context) {
        bbabc.m30943b(context, "context");
        baabc baabc = baabc.f25899a;
        SharedPreferences sharedPreferences = context.getApplicationContext().getSharedPreferences("cacheBilling", 0);
        bbabc.m30940a((Object) sharedPreferences, "context.applicationConte…ME, Context.MODE_PRIVATE)");
        baabc.m30899a(sharedPreferences);
        return baabc;
    }

    /* renamed from: c */
    private static String m30880c(Context context) {
        bbabc.m30943b(context, "context");
        try {
            Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
            if (!bundle.containsKey("com.google.android.play.billingclient.version")) {
                return "";
            }
            String string = bundle.getString("com.google.android.play.billingclient.version");
            bbabc.m30940a((Object) string, "bundle.getString(\"com.go…y.billingclient.version\")");
            return string;
        } catch (Exception unused) {
            return "";
        }
    }

    /* renamed from: a */
    public final synchronized BillingClient mo66642a(Context context, PurchasesUpdatedListener purchasesUpdatedListener) {
        BillingClient billingClient;
        bbabc.m30943b(context, "context");
        bbabc.m30943b(purchasesUpdatedListener, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        if (!f25872d) {
            BillingClient build = BillingClient.newBuilder(context).enablePendingPurchases().setListener(purchasesUpdatedListener).build();
            bbabc.m30940a((Object) build, "BillingClient.newBuilder…istener(listener).build()");
            f25871c = build;
        }
        billingClient = f25871c;
        if (billingClient == null) {
            bbabc.m30941a("billingClient");
        }
        return billingClient;
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x0080 A[Catch:{ Exception -> 0x00f9, all -> 0x00e2 }, LOOP:0: B:34:0x0080->B:45:0x009d, LOOP_START, PHI: r1 r5 
      PHI: (r1v7 int) = (r1v5 int), (r1v9 int) binds: [B:33:0x007e, B:45:0x009d] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r5v3 int) = (r5v2 int), (r5v4 int) binds: [B:33:0x007e, B:45:0x009d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00a2 A[Catch:{ Exception -> 0x00f9, all -> 0x00e2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00a7 A[Catch:{ Exception -> 0x00f9, all -> 0x00e2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0111 A[Catch:{ Exception -> 0x00f9, all -> 0x00e2 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized com.ogury.p375cm.internal.baaab mo66643a(android.content.Context r11) {
        /*
            r10 = this;
            monitor-enter(r10)
            java.lang.String r0 = "context"
            com.ogury.p375cm.internal.bbabc.m30943b(r11, r0)     // Catch:{ all -> 0x0118 }
            com.ogury.cm.internal.baaab r0 = f25870b     // Catch:{ all -> 0x0118 }
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x000e
            r0 = r1
            goto L_0x000f
        L_0x000e:
            r0 = r2
        L_0x000f:
            if (r0 != 0) goto L_0x010d
            java.lang.String r0 = m30880c(r11)     // Catch:{ Exception -> 0x00f9, all -> 0x00e2 }
            r3 = r0
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3     // Catch:{ Exception -> 0x00f9, all -> 0x00e2 }
            int r3 = r3.length()     // Catch:{ Exception -> 0x00f9, all -> 0x00e2 }
            if (r3 <= 0) goto L_0x0020
            r3 = r1
            goto L_0x0021
        L_0x0020:
            r3 = r2
        L_0x0021:
            if (r3 == 0) goto L_0x00df
            com.ogury.cm.internal.abaaa$aaaaa r3 = com.ogury.p375cm.internal.abaaa.f25686a     // Catch:{ Exception -> 0x00f9, all -> 0x00e2 }
            java.lang.String r3 = "versionName"
            com.ogury.p375cm.internal.bbabc.m30943b(r0, r3)     // Catch:{ Exception -> 0x00f9, all -> 0x00e2 }
            r4 = r0
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4     // Catch:{ Exception -> 0x00f9, all -> 0x00e2 }
            java.lang.String r0 = "."
            java.lang.String[] r5 = new java.lang.String[]{r0}     // Catch:{ Exception -> 0x00f9, all -> 0x00e2 }
            r6 = 0
            r7 = 0
            r8 = 6
            r9 = 0
            java.util.List r0 = com.ogury.p375cm.internal.bbcbc.m30988a((java.lang.CharSequence) r4, (java.lang.String[]) r5, (boolean) r6, (int) r7, (int) r8, (java.lang.Object) r9)     // Catch:{ Exception -> 0x00f9, all -> 0x00e2 }
            r3 = r0
            java.util.Collection r3 = (java.util.Collection) r3     // Catch:{ Exception -> 0x00f9, all -> 0x00e2 }
            boolean r3 = r3.isEmpty()     // Catch:{ Exception -> 0x00f9, all -> 0x00e2 }
            r3 = r3 ^ r1
            if (r3 == 0) goto L_0x00b2
            java.lang.Object r0 = r0.get(r2)     // Catch:{ Exception -> 0x00f9, all -> 0x00e2 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x00f9, all -> 0x00e2 }
            java.lang.String r3 = "receiver$0"
            com.ogury.p375cm.internal.bbabc.m30943b(r0, r3)     // Catch:{ Exception -> 0x00f9, all -> 0x00e2 }
            java.lang.String r3 = "receiver$0"
            com.ogury.p375cm.internal.bbabc.m30943b(r0, r3)     // Catch:{ Exception -> 0x00f9, all -> 0x00e2 }
            int r3 = r0.length()     // Catch:{ Exception -> 0x00f9, all -> 0x00e2 }
            r4 = 0
            if (r3 != 0) goto L_0x005d
            goto L_0x00ac
        L_0x005d:
            char r5 = r0.charAt(r2)     // Catch:{ Exception -> 0x00f9, all -> 0x00e2 }
            r6 = 48
            r7 = -2147483647(0xffffffff80000001, float:-1.4E-45)
            if (r5 >= r6) goto L_0x007a
            if (r3 != r1) goto L_0x006b
            goto L_0x00ac
        L_0x006b:
            r6 = 45
            if (r5 != r6) goto L_0x0073
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r1
            goto L_0x007b
        L_0x0073:
            r6 = 43
            if (r5 != r6) goto L_0x00ac
            r5 = r1
            r6 = r2
            goto L_0x007c
        L_0x007a:
            r5 = r2
        L_0x007b:
            r6 = r5
        L_0x007c:
            int r3 = r3 - r1
            r1 = r2
            if (r5 > r3) goto L_0x00a0
        L_0x0080:
            char r8 = r0.charAt(r5)     // Catch:{ Exception -> 0x00f9, all -> 0x00e2 }
            r9 = 10
            int r8 = java.lang.Character.digit(r8, r9)     // Catch:{ Exception -> 0x00f9, all -> 0x00e2 }
            if (r8 >= 0) goto L_0x008d
            goto L_0x00ac
        L_0x008d:
            r9 = -214748364(0xfffffffff3333334, float:-1.4197688E31)
            if (r1 >= r9) goto L_0x0093
            goto L_0x00ac
        L_0x0093:
            int r1 = r1 * 10
            int r9 = r7 + r8
            if (r1 >= r9) goto L_0x009a
            goto L_0x00ac
        L_0x009a:
            int r1 = r1 - r8
            if (r5 == r3) goto L_0x00a0
            int r5 = r5 + 1
            goto L_0x0080
        L_0x00a0:
            if (r6 == 0) goto L_0x00a7
            java.lang.Integer r4 = java.lang.Integer.valueOf(r1)     // Catch:{ Exception -> 0x00f9, all -> 0x00e2 }
            goto L_0x00ac
        L_0x00a7:
            int r0 = -r1
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)     // Catch:{ Exception -> 0x00f9, all -> 0x00e2 }
        L_0x00ac:
            if (r4 == 0) goto L_0x00b2
            int r2 = r4.intValue()     // Catch:{ Exception -> 0x00f9, all -> 0x00e2 }
        L_0x00b2:
            r0 = 2
            if (r2 == r0) goto L_0x00d5
            r0 = 3
            if (r2 != r0) goto L_0x00b9
            goto L_0x00d5
        L_0x00b9:
            if (r2 != 0) goto L_0x00c1
            java.lang.String r0 = "Ogury FairChoice not available - Unreadable Android Billing Library version"
        L_0x00bd:
            m30878a((android.content.Context) r11, (java.lang.String) r0)     // Catch:{ Exception -> 0x00f9, all -> 0x00e2 }
            goto L_0x010d
        L_0x00c1:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00f9, all -> 0x00e2 }
            java.lang.String r1 = "Ogury FairChoice not available - Android Billing Library v"
            r0.<init>(r1)     // Catch:{ Exception -> 0x00f9, all -> 0x00e2 }
            r0.append(r2)     // Catch:{ Exception -> 0x00f9, all -> 0x00e2 }
            java.lang.String r1 = " is not supported)"
            r0.append(r1)     // Catch:{ Exception -> 0x00f9, all -> 0x00e2 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x00f9, all -> 0x00e2 }
            goto L_0x00bd
        L_0x00d5:
            com.ogury.cm.internal.baabb r0 = new com.ogury.cm.internal.baabb     // Catch:{ Exception -> 0x00f9, all -> 0x00e2 }
            r0.<init>()     // Catch:{ Exception -> 0x00f9, all -> 0x00e2 }
            com.ogury.cm.internal.baaab r0 = (com.ogury.p375cm.internal.baaab) r0     // Catch:{ Exception -> 0x00f9, all -> 0x00e2 }
            f25870b = r0     // Catch:{ Exception -> 0x00f9, all -> 0x00e2 }
            goto L_0x010d
        L_0x00df:
            java.lang.String r0 = "Ogury FairChoice not available - Missing Google Play Billing library"
            goto L_0x00bd
        L_0x00e2:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0118 }
            java.lang.String r2 = "Ogury FairChoice not available - "
            r1.<init>(r2)     // Catch:{ all -> 0x0118 }
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x0118 }
            r1.append(r0)     // Catch:{ all -> 0x0118 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0118 }
        L_0x00f5:
            m30878a((android.content.Context) r11, (java.lang.String) r0)     // Catch:{ all -> 0x0118 }
            goto L_0x010d
        L_0x00f9:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0118 }
            java.lang.String r2 = "Ogury FairChoice not available - "
            r1.<init>(r2)     // Catch:{ all -> 0x0118 }
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x0118 }
            r1.append(r0)     // Catch:{ all -> 0x0118 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0118 }
            goto L_0x00f5
        L_0x010d:
            com.ogury.cm.internal.baaab r11 = f25870b     // Catch:{ all -> 0x0118 }
            if (r11 != 0) goto L_0x0116
            java.lang.String r0 = "billingLibrary"
            com.ogury.p375cm.internal.bbabc.m30941a((java.lang.String) r0)     // Catch:{ all -> 0x0118 }
        L_0x0116:
            monitor-exit(r10)
            return r11
        L_0x0118:
            r11 = move-exception
            monitor-exit(r10)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ogury.p375cm.internal.acccc.mo66643a(android.content.Context):com.ogury.cm.internal.baaab");
    }
}

package com.mbridge.msdk.foundation.tools;

import android.content.Context;
import android.content.res.Resources;

/* renamed from: com.mbridge.msdk.foundation.tools.o */
/* compiled from: ResourceUtil */
public final class C8594o {
    /* renamed from: a */
    public static Resources m24813a(Context context) {
        if (context != null) {
            try {
                return context.getResources();
            } catch (Exception e) {
                C8608u.m24884d("ResourceUtil", "Resource error:" + e.getMessage());
            }
        }
        return null;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:3|4) */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0041, code lost:
        com.mbridge.msdk.foundation.tools.C8608u.m24884d("ResourceUtil", "Resource not found resName:" + r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0055, code lost:
        return -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:?, code lost:
        com.mbridge.msdk.foundation.tools.C8608u.m24884d("ResourceUtil", "MBSDKContext.getInstance() is null resName:" + r6);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x000e */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m24812a(android.content.Context r5, java.lang.String r6, java.lang.String r7) {
        /*
            java.lang.String r0 = "ResourceUtil"
            r1 = -1
            java.lang.String r2 = ""
            com.mbridge.msdk.foundation.controller.a r3 = com.mbridge.msdk.foundation.controller.C2350a.m5601e()     // Catch:{ Exception -> 0x000e }
            java.lang.String r2 = r3.mo15783b()     // Catch:{ Exception -> 0x000e }
            goto L_0x0022
        L_0x000e:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0041 }
            r3.<init>()     // Catch:{ Exception -> 0x0041 }
            java.lang.String r4 = "MBSDKContext.getInstance() is null resName:"
            r3.append(r4)     // Catch:{ Exception -> 0x0041 }
            r3.append(r6)     // Catch:{ Exception -> 0x0041 }
            java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x0041 }
            com.mbridge.msdk.foundation.tools.C8608u.m24884d(r0, r3)     // Catch:{ Exception -> 0x0041 }
        L_0x0022:
            boolean r3 = com.mbridge.msdk.foundation.tools.C8556ac.m24737a(r2)     // Catch:{ Exception -> 0x0041 }
            if (r3 == 0) goto L_0x002e
            if (r5 == 0) goto L_0x002e
            java.lang.String r2 = r5.getPackageName()     // Catch:{ Exception -> 0x0041 }
        L_0x002e:
            boolean r3 = com.mbridge.msdk.foundation.tools.C8556ac.m24737a(r2)     // Catch:{ Exception -> 0x0041 }
            if (r3 == 0) goto L_0x0035
            return r1
        L_0x0035:
            if (r5 == 0) goto L_0x0040
            android.content.res.Resources r5 = r5.getResources()     // Catch:{ Exception -> 0x0041 }
            int r5 = r5.getIdentifier(r6, r7, r2)     // Catch:{ Exception -> 0x0041 }
            return r5
        L_0x0040:
            return r1
        L_0x0041:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r7 = "Resource not found resName:"
            r5.append(r7)
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            com.mbridge.msdk.foundation.tools.C8608u.m24884d(r0, r5)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.tools.C8594o.m24812a(android.content.Context, java.lang.String, java.lang.String):int");
    }
}

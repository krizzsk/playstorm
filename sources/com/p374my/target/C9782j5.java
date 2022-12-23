package com.p374my.target;

import android.content.ContentResolver;
import android.content.Context;
import android.provider.Settings;
import android.text.TextUtils;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.tapjoy.TapjoyConstants;

/* renamed from: com.my.target.j5 */
public class C9782j5 extends C9736h5 {

    /* renamed from: a */
    public boolean f24134a = false;

    /* renamed from: a */
    public static boolean m28405a(String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        return !str.matches("^[0]+(-[0]+)+$");
    }

    /* renamed from: a */
    public final void mo64472a(Context context) {
        ContentResolver contentResolver = context.getContentResolver();
        if (contentResolver != null) {
            String string = Settings.Secure.getString(contentResolver, "android_id");
            if (!TextUtils.isEmpty(string)) {
                addParam("android_id", string);
            }
        }
    }

    /* renamed from: b */
    public final void mo64473b(Context context) {
        C9672e0.m27882a("send google AId");
        String str = null;
        try {
            str = AdvertisingIdClient.getAdvertisingIdInfo(context).getId();
            C9672e0.m27882a("google AId: " + str);
            boolean isLimitAdTrackingEnabled = AdvertisingIdClient.getAdvertisingIdInfo(context).isLimitAdTrackingEnabled() ^ true;
            StringBuilder sb = new StringBuilder();
            sb.append("ad tracking enabled: ");
            sb.append(!isLimitAdTrackingEnabled);
            C9672e0.m27882a(sb.toString());
            addParam(TapjoyConstants.TJC_ADVERTISING_ID, str);
            addParam("advertising_tracking_enabled", (isLimitAdTrackingEnabled ? 1 : 0) + "");
        } catch (Throwable th) {
            C9672e0.m27882a("failed to send google AId, " + th.getMessage());
        }
        if (!m28405a(str)) {
            mo64472a(context);
        }
    }

    public synchronized void collectData(Context context) {
        if (C9693f0.m27982b()) {
            C9672e0.m27882a("You must not call collectData method from main thread");
        } else if (!this.f24134a) {
            mo64473b(context);
            this.f24134a = true;
        }
    }
}

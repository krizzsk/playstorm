package com.p374my.target;

import android.content.Context;
import com.p374my.target.common.CustomParams;
import com.p374my.target.common.MyTargetConfig;
import com.p374my.target.common.MyTargetManager;
import com.p374my.target.common.MyTargetPrivacy;
import com.p374my.target.common.MyTargetVersion;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.my.target.e */
public abstract class C9670e {

    /* renamed from: com.my.target.e$a */
    public static class C9671a extends C9670e {

        /* renamed from: a */
        public static String f23793a = "https://m.mradx.net/mobile/";

        /* renamed from: a */
        public C9915q1 mo63916a(C9596a aVar, Context context) {
            int cachePolicy = aVar.getCachePolicy();
            boolean z = false;
            C10023w8.m29657a(cachePolicy == 0 || cachePolicy == 1);
            if (cachePolicy == 0 || cachePolicy == 2) {
                z = true;
            }
            C10023w8.m29659b(z);
            return C9915q1.m29022a(f23793a + aVar.getSlotId() + "/", C9764i8.m28304a(mo63918c(aVar, context)));
        }

        /* renamed from: b */
        public int mo63917b(C9596a aVar, Context context) {
            return C10023w8.m29655a();
        }

        /* renamed from: c */
        public Map<String, String> mo63918c(C9596a aVar, Context context) {
            String str;
            HashMap hashMap = new HashMap();
            hashMap.put("formats", aVar.getFormat());
            hashMap.put("adman_ver", MyTargetVersion.VERSION);
            hashMap.put("sdk_ver_int", MyTargetVersion.VERSION_INT);
            MyTargetPrivacy currentPrivacy = MyTargetPrivacy.currentPrivacy();
            Boolean bool = currentPrivacy.userConsent;
            String str2 = "0";
            if (bool != null) {
                hashMap.put("user_consent", bool.booleanValue() ? "1" : str2);
            }
            Boolean bool2 = currentPrivacy.ccpaUserConsent;
            if (bool2 != null) {
                hashMap.put("ccpa_user_consent", bool2.booleanValue() ? "1" : str2);
            }
            Boolean bool3 = currentPrivacy.iabUserConsent;
            if (bool3 != null) {
                if (bool3.booleanValue()) {
                    str2 = "1";
                }
                hashMap.put("iab_user_consent", str2);
            }
            if (currentPrivacy.userAgeRestricted) {
                hashMap.put("user_age_restricted", "1");
            }
            if (aVar.getCachePolicy() == 0 || aVar.getCachePolicy() == 2) {
                hashMap.put("preloadvideo", "1");
            }
            int bannersCount = aVar.getBannersCount();
            if (bannersCount > 0) {
                hashMap.put("count", Integer.toString(bannersCount));
            }
            String bidId = aVar.getBidId();
            if (bidId != null) {
                hashMap.put("bid_id", bidId);
            }
            CustomParams customParams = aVar.getCustomParams();
            if (currentPrivacy.isConsent()) {
                customParams.putDataTo(hashMap);
            } else {
                customParams.putCustomDataToMap(hashMap);
            }
            C9754i5 c = C9754i5.m28266c();
            c.mo64274a(currentPrivacy.isConsent());
            MyTargetConfig sdkConfig = MyTargetManager.getSdkConfig();
            try {
                C9714g5 b = c.mo64275b();
                b.mo64097a(sdkConfig.isTrackingEnvironmentEnabled);
                b.mo64099b(sdkConfig.isTrackingLocationEnabled);
                c.collectData(context);
            } catch (Throwable th) {
                C9672e0.m27882a("Error collecting data: " + th);
            }
            c.putDataTo(hashMap);
            String lang = customParams.getLang();
            if (lang != null) {
                hashMap.put("lang", lang);
            }
            int b2 = mo63917b(aVar, context);
            if (b2 >= 0) {
                hashMap.put("sdk_flags", String.valueOf(b2));
            }
            String[] strArr = sdkConfig.testDevices;
            String str3 = (String) hashMap.get("instance_id");
            if (str3 == null) {
                return hashMap;
            }
            if (strArr == null || !C9704f8.m28040a(strArr, str3)) {
                str = "Device instanceId is " + str3 + ". Use this value in adInstance.withTestDevices() to enable test mode on this device.";
            } else {
                hashMap.put("test_mode", "1");
                str = "Test mode is enabled on current device";
            }
            C9672e0.m27882a(str);
            return hashMap;
        }
    }

    /* renamed from: a */
    public static C9670e m27877a() {
        return new C9671a();
    }

    /* renamed from: a */
    public abstract C9915q1 mo63916a(C9596a aVar, Context context);
}

package com.fyber.marketplace.fairbid.impl;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.config.C4273e;
import com.fyber.inneractive.sdk.config.C4315k;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.global.C4309s;
import com.fyber.inneractive.sdk.p189dv.C4364g;
import com.fyber.inneractive.sdk.serverapi.C5298a;
import com.fyber.inneractive.sdk.serverapi.C5300b;
import com.fyber.inneractive.sdk.serverapi.C5301c;
import com.fyber.inneractive.sdk.util.C5349k0;
import com.fyber.inneractive.sdk.util.C5350l;
import com.fyber.inneractive.sdk.util.C5390z;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.marketplace.fairbid.bridge.MarketplaceAuctionParameters;
import com.tapjoy.TapjoyConstants;
import java.util.HashMap;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.fyber.marketplace.fairbid.impl.b */
public class C5442b implements MarketplaceAuctionParameters {

    /* renamed from: a */
    public HashMap<String, C4309s> f14418a = new HashMap<>();

    /* renamed from: b */
    public final HashMap<String, C4364g> f14419b = new HashMap<>();

    /* renamed from: c */
    public final C5301c f14420c;

    /* renamed from: d */
    public String f14421d;

    /* renamed from: com.fyber.marketplace.fairbid.impl.b$a */
    public enum C5443a {
        KEY_AVAILABLE_DISK_SPACE("available_disk", "dsk_a", Integer.class),
        KEY_HEADSET("headset", "headset", Boolean.class),
        KEY_BATTERY_CONNECTED("battery_charging", "btry_c", Boolean.class),
        KEY_BATTERY_LEVEL("battery_level", "btry_l", Integer.class),
        KEY_BLUETOOTH_CONNECTED("bluetooth_connected", "bt_con", Boolean.class),
        KEY_ANDROID_LEVEL("d_api", "d_api", Integer.class),
        KEY_AIRPLANE_MODE("apnm", "apnm", Boolean.class),
        KEY_DO_NOT_DISTURB("dnd", "dnd", Boolean.class),
        KEY_IS_MUTED("is_muted", "is_muted", Boolean.class),
        KEY_TOTAL_DISK_SPACE(TapjoyConstants.TJC_TOTAL_DISK_SPACE, "dsk_t", Integer.class),
        KEY_TIME_OF_DAY("time_difference", "tod", Integer.class),
        KEY_LOW_POWER_MODE("low_power_mode", "low_power_mode", Boolean.class),
        KEY_DARK_MODE("dark_mode", "dark_mode", Boolean.class),
        KEY_LAST_DOMAIN_SHOWED("last_adomain", "ldomain", String.class),
        KEY_LAST_BUNDLE_SHOWED("last_bundle", "lbundle", String.class);
        

        /* renamed from: a */
        public String f14438a;

        /* renamed from: b */
        public String f14439b;

        /* renamed from: c */
        public Object f14440c;

        /* access modifiers changed from: public */
        C5443a(String str, String str2, Object obj) {
            this.f14438a = str;
            this.f14439b = str2;
            this.f14440c = obj;
        }
    }

    public C5442b(C5301c cVar) {
        this.f14420c = cVar;
    }

    /* renamed from: a */
    public final JSONObject mo26664a(HashMap<String, String> hashMap, C5443a... aVarArr) {
        JSONObject jSONObject = new JSONObject();
        for (C5443a aVar : aVarArr) {
            String str = hashMap.get(aVar.f14439b);
            if (!TextUtils.isEmpty(str)) {
                try {
                    Object a = m16898a(str, aVar.f14440c);
                    if (a != null) {
                        jSONObject.put(aVar.f14438a, a);
                    }
                } catch (JSONException unused) {
                }
            }
        }
        return jSONObject;
    }

    public String getAdvertisingId() {
        if (C4315k.m13547b()) {
            return null;
        }
        ((C5300b) this.f14420c).getClass();
        int i = C4273e.f10606a;
        String property = System.getProperty("ia.testEnvironmentConfiguration.device");
        return TextUtils.isEmpty(property) ? C4315k.m13546a() : property;
    }

    public String getAmazonAdvertisingId() {
        if (!C4315k.m13547b()) {
            return null;
        }
        ((C5300b) this.f14420c).getClass();
        int i = C4273e.f10606a;
        String property = System.getProperty("ia.testEnvironmentConfiguration.device");
        return TextUtils.isEmpty(property) ? C4315k.m13546a() : property;
    }

    public String getAppVersion() {
        return ((C5300b) this.f14420c).mo26409k();
    }

    public String getBundleId() {
        ((C5300b) this.f14420c).getClass();
        return C5350l.f14216a.getPackageName();
    }

    public String getCarrier() {
        return ((C5300b) this.f14420c).mo26396a();
    }

    public String getDeviceModel() {
        return ((C5300b) this.f14420c).mo26400b();
    }

    public C4309s getFeatureProvider(String str) {
        return this.f14418a.get(str);
    }

    public int getHeight() {
        ((C5300b) this.f14420c).getClass();
        return C5350l.m16765c(C5350l.m16767d());
    }

    public String getHorizontalAccuracy() {
        return ((C5300b) this.f14420c).mo26401c();
    }

    public List<String> getInputLanguages() {
        ((C5300b) this.f14420c).getClass();
        return IAConfigManager.f10525J.f10552q;
    }

    public String getLanguage() {
        ((C5300b) this.f14420c).getClass();
        return IAConfigManager.f10525J.f10551p;
    }

    public String getLatitudeLongitude() {
        String d = ((C5300b) this.f14420c).mo26402d();
        String e = ((C5300b) this.f14420c).mo26403e();
        if (d != null) {
            return d;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(",");
        sb.append(e);
        return sb.toString() != null ? e : "";
    }

    public JSONObject getMarketplaceEntry() {
        HashMap hashMap = new HashMap();
        ((C5300b) this.f14420c).mo26399a(hashMap, this.f14421d);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("client_params", mo26664a((HashMap<String, String>) hashMap, C5443a.KEY_TIME_OF_DAY));
        } catch (Exception unused) {
        }
        try {
            jSONObject.put("device_params", mo26664a((HashMap<String, String>) hashMap, C5443a.KEY_AVAILABLE_DISK_SPACE, C5443a.KEY_DO_NOT_DISTURB, C5443a.KEY_AIRPLANE_MODE, C5443a.KEY_ANDROID_LEVEL, C5443a.KEY_IS_MUTED, C5443a.KEY_HEADSET, C5443a.KEY_BATTERY_CONNECTED, C5443a.KEY_BATTERY_LEVEL, C5443a.KEY_BLUETOOTH_CONNECTED, C5443a.KEY_LOW_POWER_MODE, C5443a.KEY_DARK_MODE, C5443a.KEY_TOTAL_DISK_SPACE));
        } catch (Exception unused2) {
        }
        try {
            jSONObject.put("content_params", mo26664a((HashMap<String, String>) hashMap, C5443a.KEY_LAST_BUNDLE_SHOWED, C5443a.KEY_LAST_DOMAIN_SHOWED));
        } catch (Exception unused3) {
        }
        C4309s sVar = new C4309s();
        this.f14418a.put(this.f14421d, sVar);
        sVar.mo24341a(this.f14421d);
        JSONArray d = sVar.mo24343d();
        if (d != null && d.length() > 0) {
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("experiments", d);
            } catch (Exception unused4) {
            }
            try {
                jSONObject.put("sdk_experiments", jSONObject2);
            } catch (Exception unused5) {
            }
        }
        C5301c cVar = this.f14420c;
        String str = this.f14421d;
        ((C5300b) cVar).getClass();
        C4364g a = IAConfigManager.f10525J.f10531E.mo24399a(C5298a.m16649a(str));
        String str2 = this.f14421d;
        if (a != null) {
            this.f14419b.put(str2, a);
            try {
                jSONObject.put("gdem_signal", a.f10769a.getQuery());
            } catch (JSONException unused6) {
            }
        }
        try {
            jSONObject.put("version", ((C5300b) this.f14420c).mo26398a("2.2.0"));
        } catch (JSONException unused7) {
        }
        IAlog.m16699a("getMarketplaceEntry:Json object - %s", jSONObject.toString());
        return jSONObject;
    }

    public String getMobileCountryCode() {
        return ((C5300b) this.f14420c).mo26406h();
    }

    public String getMobileNetworkCode() {
        return ((C5300b) this.f14420c).mo26407i();
    }

    public String getNetwork() {
        ((C5300b) this.f14420c).getClass();
        return C5349k0.m16751f().f14215a;
    }

    public List<Integer> getSupportedApis() {
        ((C5300b) this.f14420c).getClass();
        return C5300b.f14104d;
    }

    public List<String> getSupportedMimes() {
        ((C5300b) this.f14420c).getClass();
        return C5300b.f14106f;
    }

    public List<Integer> getSupportedProtocols() {
        ((C5300b) this.f14420c).getClass();
        return C5300b.f14105e;
    }

    public int getSupportedTypesBitwise() {
        this.f14420c.getClass();
        return 372;
    }

    public String getTimeAccuracy() {
        return ((C5300b) this.f14420c).mo26404f();
    }

    public String getVerticalAccuracy() {
        return ((C5300b) this.f14420c).mo26405g();
    }

    public int getWidth() {
        ((C5300b) this.f14420c).getClass();
        return C5350l.m16765c(C5350l.m16769e());
    }

    public C4364g getWrapperQueryInfo(String str) {
        C4364g gVar = this.f14419b.get(this.f14421d);
        this.f14419b.remove(this.f14421d);
        return gVar;
    }

    public boolean hasAmazonAdvertisingId() {
        return C4315k.m13547b();
    }

    public Boolean isLimitTrackingEnabled() {
        ((C5300b) this.f14420c).getClass();
        return Boolean.valueOf(C4315k.m13548c());
    }

    /* renamed from: a */
    public static Object m16898a(String str, Object obj) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String obj2 = obj.toString();
        if (TextUtils.equals(obj2, Integer.class.toString())) {
            try {
                return Integer.valueOf(str);
            } catch (NumberFormatException unused) {
                return null;
            }
        } else if (TextUtils.equals(obj2, String.class.toString())) {
            return str;
        } else {
            if (TextUtils.equals(obj2, Boolean.class.toString())) {
                if (str.equalsIgnoreCase("1")) {
                    return Boolean.TRUE;
                }
                if (str.equalsIgnoreCase("0")) {
                    return Boolean.FALSE;
                }
            }
            return null;
        }
    }

    /* renamed from: a */
    public void mo26665a(String str) {
        this.f14421d = str;
        if (IAConfigManager.f10525J.f10554s) {
            C5300b bVar = (C5300b) this.f14420c;
            bVar.getClass();
            bVar.f14108b = C5390z.C5391a.f14278a.mo26493a();
        }
    }
}

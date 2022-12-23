package com.applovin.impl.sdk.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.preference.PreferenceManager;
import android.security.NetworkSecurityPolicy;
import android.text.TextUtils;
import com.applovin.impl.sdk.C1959m;
import com.applovin.impl.sdk.C2092v;
import com.applovin.impl.sdk.p048c.C1857b;
import com.applovin.impl.sdk.p048c.C1858c;
import com.applovin.impl.sdk.p048c.C1859d;
import com.applovin.impl.sdk.p048c.C1860e;
import com.tapjoy.TapjoyConstants;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.sdk.utils.h */
public class C2040h {

    /* renamed from: a */
    private static final int[] f3966a = {7, 4, 2, 1, 11};

    /* renamed from: b */
    private static final int[] f3967b = {5, 6, 12, 10, 3, 9, 8, 14};

    /* renamed from: c */
    private static final int[] f3968c = {15, 13};

    /* renamed from: d */
    private static final int[] f3969d = {20};

    /* renamed from: a */
    public static String m4892a(InputStream inputStream, C1959m mVar) throws IOException {
        if (inputStream == null) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[((Integer) mVar.mo14311a(C1857b.f3198cW)).intValue()];
        while (true) {
            int read = inputStream.read(bArr);
            if (read <= 0) {
                return byteArrayOutputStream.toString("UTF-8");
            }
            byteArrayOutputStream.write(bArr, 0, read);
        }
    }

    /* renamed from: a */
    public static String m4893a(String str, C1959m mVar) {
        return m4894a((String) mVar.mo14311a(C1857b.f3090aT), str, mVar);
    }

    /* renamed from: a */
    public static String m4894a(String str, String str2, C1959m mVar) {
        if (str == null || str.length() < 4) {
            throw new IllegalArgumentException("Invalid domain specified");
        } else if (str2 == null) {
            throw new IllegalArgumentException("No endpoint specified");
        } else if (mVar != null) {
            return str + str2;
        } else {
            throw new IllegalArgumentException("No sdk specified");
        }
    }

    /* renamed from: a */
    public static JSONObject m4895a(JSONObject jSONObject) throws JSONException {
        return (JSONObject) jSONObject.getJSONArray("results").get(0);
    }

    /* renamed from: a */
    public static void m4896a(int i, C1959m mVar) {
        if (i == 401 && C2092v.m5047a()) {
            C2092v.m5053i("AppLovinSdk", "SDK key \"" + mVar.mo14374z() + "\" is rejected by AppLovin. Please make sure the SDK key is correct.");
        } else if (i == 418) {
            mVar.mo14296K().mo14063a((C1857b<?>) C1857b.f3066W, (Object) true);
            mVar.mo14296K().mo14062a();
        } else {
            if (i < 400 || i >= 500) {
                if (i != -1 || !((Boolean) mVar.mo14311a(C1857b.f3068Y)).booleanValue()) {
                    return;
                }
            } else if (!((Boolean) mVar.mo14311a(C1857b.f3068Y)).booleanValue()) {
                return;
            }
            mVar.mo14358k();
        }
    }

    /* renamed from: a */
    public static void m4897a(JSONObject jSONObject, boolean z, C1959m mVar) {
        mVar.mo14334ag().mo14264a(jSONObject, z);
    }

    /* renamed from: a */
    public static boolean m4898a() {
        return m4901a((String) null);
    }

    /* renamed from: a */
    private static boolean m4899a(int i, int[] iArr) {
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m4900a(Context context) {
        if (context.getSystemService("connectivity") == null) {
            return true;
        }
        NetworkInfo b = m4902b(context);
        if (b != null) {
            return b.isConnected();
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m4901a(String str) {
        if (C2039g.m4886e()) {
            return (!C2039g.m4887f() || TextUtils.isEmpty(str)) ? NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted() : NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
        }
        return true;
    }

    /* renamed from: b */
    private static NetworkInfo m4902b(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (connectivityManager != null) {
            return connectivityManager.getActiveNetworkInfo();
        }
        return null;
    }

    /* renamed from: b */
    public static String m4903b(String str, C1959m mVar) {
        return m4894a((String) mVar.mo14311a(C1857b.f3091aU), str, mVar);
    }

    /* renamed from: c */
    public static void m4904c(JSONObject jSONObject, C1959m mVar) {
        String string = JsonUtils.getString(jSONObject, "persisted_data", (String) null);
        if (StringUtils.isValidString(string)) {
            mVar.mo14318a(C1859d.f3365z, string);
            if (C2092v.m5047a()) {
                mVar.mo14286A().mo14791c("ConnectionUtils", "Updated persisted data");
            }
        }
    }

    /* renamed from: d */
    public static void m4905d(JSONObject jSONObject, C1959m mVar) {
        if (jSONObject == null) {
            throw new IllegalArgumentException("No response specified");
        } else if (mVar != null) {
            try {
                if (jSONObject.has("settings")) {
                    C1858c K = mVar.mo14296K();
                    if (!jSONObject.isNull("settings")) {
                        K.mo14064a(jSONObject.getJSONObject("settings"));
                        K.mo14062a();
                    }
                }
            } catch (JSONException e) {
                if (C2092v.m5047a()) {
                    mVar.mo14286A().mo14790b("ConnectionUtils", "Unable to parse settings out of API response", e);
                }
            }
        } else {
            throw new IllegalArgumentException("No sdk specified");
        }
    }

    /* renamed from: e */
    public static Map<String, String> m4906e(C1959m mVar) {
        String str;
        HashMap hashMap = new HashMap();
        String str2 = (String) mVar.mo14311a(C1857b.f3069Z);
        if (StringUtils.isValidString(str2)) {
            str = "device_token";
        } else {
            if (!((Boolean) mVar.mo14311a(C1857b.f3319ep)).booleanValue()) {
                str2 = mVar.mo14374z();
                str = TapjoyConstants.TJC_API_KEY;
            }
            hashMap.putAll(Utils.stringifyObjectMap(mVar.mo14306V().mo14607i()));
            return hashMap;
        }
        hashMap.put(str, str2);
        hashMap.putAll(Utils.stringifyObjectMap(mVar.mo14306V().mo14607i()));
        return hashMap;
    }

    /* renamed from: e */
    public static void m4907e(JSONObject jSONObject, C1959m mVar) {
        JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONObject, "filesystem_values", (JSONObject) null);
        if (jSONObject2 != null) {
            SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(mVar.mo14297L()).edit();
            Iterator<String> keys = jSONObject2.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                Object object = JsonUtils.getObject(jSONObject2, next, (Object) null);
                if (object != null) {
                    C1860e.m4045a(next, object, (SharedPreferences) null, edit);
                }
            }
            edit.apply();
        }
    }

    /* renamed from: f */
    public static String m4908f(C1959m mVar) {
        NetworkInfo b = m4902b(mVar.mo14297L());
        if (b == null) {
            return "unknown";
        }
        int type = b.getType();
        int subtype = b.getSubtype();
        return type == 1 ? TapjoyConstants.TJC_CONNECTION_TYPE_WIFI : type == 0 ? m4899a(subtype, f3966a) ? "2g" : m4899a(subtype, f3967b) ? "3g" : m4899a(subtype, f3968c) ? "4g" : m4899a(subtype, f3969d) ? "5g" : TapjoyConstants.TJC_CONNECTION_TYPE_MOBILE : "unknown";
    }

    /* renamed from: f */
    public static void m4909f(JSONObject jSONObject, C1959m mVar) {
        JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONObject, "variables", (JSONObject) null);
        if (jSONObject2 != null) {
            mVar.mo14373y().updateVariables(jSONObject2);
        }
    }

    /* renamed from: g */
    public static String m4910g(C1959m mVar) {
        return m4894a((String) mVar.mo14311a(C1857b.f3088aR), ((Boolean) mVar.mo14311a(C1857b.f3258de)).booleanValue() ? "5.0/ad" : "4.0/ad", mVar);
    }

    /* renamed from: h */
    public static String m4911h(C1959m mVar) {
        return m4894a((String) mVar.mo14311a(C1857b.f3089aS), ((Boolean) mVar.mo14311a(C1857b.f3258de)).booleanValue() ? "5.0/ad" : "4.0/ad", mVar);
    }

    /* renamed from: i */
    public static String m4912i(C1959m mVar) {
        return m4894a((String) mVar.mo14311a(C1857b.f3088aR), "4.0/ad", mVar);
    }

    /* renamed from: j */
    public static String m4913j(C1959m mVar) {
        return m4894a((String) mVar.mo14311a(C1857b.f3089aS), "4.0/ad", mVar);
    }

    /* renamed from: k */
    public static String m4914k(C1959m mVar) {
        return m4894a((String) mVar.mo14311a(C1857b.f3094aX), "1.0/variable_config", mVar);
    }

    /* renamed from: l */
    public static String m4915l(C1959m mVar) {
        return m4894a((String) mVar.mo14311a(C1857b.f3095aY), "1.0/variable_config", mVar);
    }
}

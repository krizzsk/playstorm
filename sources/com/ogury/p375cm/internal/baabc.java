package com.ogury.p375cm.internal;

import android.content.SharedPreferences;
import com.android.billingclient.api.Purchase;
import com.applovin.sdk.AppLovinEventTypes;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import java.util.HashSet;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.ogury.cm.internal.baabc */
public final class baabc {

    /* renamed from: a */
    public static final baabc f25899a = new baabc();

    /* renamed from: b */
    private static SharedPreferences f25900b;

    private baabc() {
    }

    /* renamed from: a */
    public static String m30898a() {
        SharedPreferences sharedPreferences = f25900b;
        if (sharedPreferences == null) {
            bbabc.m30941a("sharedPref");
        }
        return sharedPreferences.getString("activePurchases", (String) null);
    }

    /* renamed from: a */
    public static void m30899a(SharedPreferences sharedPreferences) {
        bbabc.m30943b(sharedPreferences, "sharedPreferences");
        f25900b = sharedPreferences;
    }

    /* renamed from: a */
    public static void m30900a(baacb baacb) {
        bbabc.m30943b(baacb, AppLovinEventTypes.USER_VIEWED_PRODUCT);
        SharedPreferences sharedPreferences = f25900b;
        if (sharedPreferences == null) {
            bbabc.m30941a("sharedPref");
        }
        SharedPreferences.Editor edit = sharedPreferences.edit();
        bbabc.m30940a((Object) edit, "sharedPref.edit()");
        edit.putString("activeProduct", baacb.mo66664b());
        edit.apply();
    }

    /* renamed from: a */
    public static void m30901a(HashSet<Purchase> hashSet) {
        JSONArray jSONArray = new JSONArray();
        for (Purchase purchase : hashSet) {
            if (!(purchase.getSku() == null || purchase.getPurchaseToken() == null)) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(InAppPurchaseMetaData.KEY_PRODUCT_ID, purchase.getSku());
                jSONObject.put(SDKConstants.PARAM_PURCHASE_TOKEN, purchase.getPurchaseToken());
                jSONArray.put(jSONObject);
            }
        }
        SharedPreferences sharedPreferences = f25900b;
        if (sharedPreferences == null) {
            bbabc.m30941a("sharedPref");
        }
        SharedPreferences.Editor edit = sharedPreferences.edit();
        bbabc.m30940a((Object) edit, "sharedPref.edit()");
        if (jSONArray.length() > 0) {
            edit.putString("activePurchases", jSONArray.toString());
        } else {
            edit = edit.remove("activePurchases");
        }
        edit.apply();
    }

    /* renamed from: b */
    public static String m30902b() {
        SharedPreferences sharedPreferences = f25900b;
        if (sharedPreferences == null) {
            bbabc.m30941a("sharedPref");
        }
        String string = sharedPreferences.getString("activeProduct", "");
        bbabc.m30940a((Object) string, "sharedPref.getString(ACTIVE_PRODUCT, \"\")");
        return string;
    }
}

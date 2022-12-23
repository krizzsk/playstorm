package com.tapjoy.internal;

import android.text.TextUtils;
import com.tapjoy.TJAdUnitConstants;
import com.tapjoy.TJAdUnitJSBridge;
import com.tapjoy.TapjoyCache;
import com.tapjoy.TapjoyCachedAssetData;
import com.tapjoy.TapjoyLog;
import com.tapjoy.TapjoyUtil;
import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.tapjoy.internal.es */
public final class C11578es {

    /* renamed from: b */
    public static String f27986b = "";

    /* renamed from: a */
    public TJAdUnitJSBridge f27987a;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public C11488cl f27988c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public C11489cm f27989d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public C11498cv f27990e = new C11498cv("Tapjoy", "12.10.0");
    /* access modifiers changed from: private */

    /* renamed from: f */
    public C11502cz f27991f;

    public C11578es(TJAdUnitJSBridge tJAdUnitJSBridge) {
        C11524dq.m33447a("Tapjoy", "Name is null or empty");
        C11524dq.m33447a("12.10.0", "Version is null or empty");
        this.f27987a = tJAdUnitJSBridge;
    }

    /* renamed from: a */
    public final boolean mo72381a(JSONObject jSONObject) {
        if (this.f27987a.f27277b == null) {
            TapjoyLog.m33194d("TJOMViewabilityAgent", "Can not init -- WebView is null");
            return false;
        } else if (this.f27987a.f27276a == null) {
            TapjoyLog.m33194d("TJOMViewabilityAgent", "Can not init -- TJAdUnit is null");
            return false;
        } else if (this.f27987a.f27276a.getVideoView() == null) {
            TapjoyLog.m33194d("TJOMViewabilityAgent", "Can not init -- VideoView is null");
            return false;
        } else if (jSONObject == null) {
            TapjoyLog.m33194d("TJOMViewabilityAgent", "Can not init -- json parameter is null");
            return false;
        } else if (!jSONObject.has(TJAdUnitConstants.String.OM_JAVASCRIPT_URL)) {
            TapjoyLog.m33194d("TJOMViewabilityAgent", "Can not init -- unable to parse om javascript url from json");
            return false;
        } else {
            try {
                jSONObject.getJSONArray(TJAdUnitConstants.String.VENDORS);
                return true;
            } catch (JSONException unused) {
                TapjoyLog.m33194d("TJOMViewabilityAgent", "Can not init -- unable to parse vendors from json");
                return false;
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static List<C11499cw> m33592b(JSONArray jSONArray) {
        C11499cw cwVar;
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                String optString = jSONObject.optString(TJAdUnitConstants.String.VENDOR_JS_URL, (String) null);
                if (optString == null) {
                    TapjoyLog.m33194d("TJOMViewabilityAgent", "Vendor JS URL not found. Skipping.");
                } else {
                    try {
                        URL url = new URL(optString);
                        String optString2 = jSONObject.optString(TJAdUnitConstants.String.VENDOR_NAME, (String) null);
                        String optString3 = jSONObject.optString(TJAdUnitConstants.String.VENDOR_PARAMETERS, (String) null);
                        if (optString3 == null || optString2 == null) {
                            C11524dq.m33446a((Object) url, "ResourceURL is null");
                            cwVar = new C11499cw((String) null, url, (String) null);
                        } else {
                            C11524dq.m33447a(optString2, "VendorKey is null or empty");
                            C11524dq.m33446a((Object) url, "ResourceURL is null");
                            C11524dq.m33447a(optString3, "VerificationParameters is null or empty");
                            cwVar = new C11499cw(optString2, url, optString3);
                        }
                        arrayList.add(cwVar);
                    } catch (Exception unused) {
                        TapjoyLog.m33194d("TJOMViewabilityAgent", "Malformed vendor JS URL. Skipping ".concat(String.valueOf(optString)));
                    }
                }
            } catch (JSONException unused2) {
                TapjoyLog.m33194d("TJOMViewabilityAgent", "Malformed vendor object. Skipping.");
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    public static void m33593b(JSONObject jSONObject) {
        if (TextUtils.isEmpty(f27986b)) {
            String optString = jSONObject.optString(TJAdUnitConstants.String.OM_JAVASCRIPT_URL, (String) null);
            if (optString == null) {
                TapjoyLog.m33194d("TJOMViewabilityAgent", "Open Mediation JavaScript name not found in json.");
                return;
            }
            try {
                TapjoyCachedAssetData cachedDataForURL = TapjoyCache.getInstance().getCachedDataForURL(optString);
                String str = "";
                if (cachedDataForURL == null) {
                    TapjoyCache.getInstance().cacheAssetFromURL(optString, str, 30).get();
                    cachedDataForURL = TapjoyCache.getInstance().getCachedDataForURL(optString);
                }
                if (cachedDataForURL != null) {
                    str = TapjoyUtil.getFileContents(new File(cachedDataForURL.getLocalFilePath()));
                }
                f27986b = str;
            } catch (Exception unused) {
                TapjoyLog.m33194d("TJOMViewabilityAgent", "Failed downloading Open Mediation JavaScript");
            }
        }
    }
}

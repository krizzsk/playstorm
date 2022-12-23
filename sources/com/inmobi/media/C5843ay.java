package com.inmobi.media;

import android.text.TextUtils;
import com.inmobi.media.C6125fq;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.inmobi.media.ay */
/* compiled from: AdFactory */
public final class C5843ay {

    /* renamed from: a */
    private static final String f14744a = C5838au.class.getSimpleName();

    /* renamed from: a */
    private static void m17440a(C5838au auVar, JSONObject jSONObject) {
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject("pubContent");
            if (!jSONObject2.isNull("rootContainer")) {
                JSONObject jSONObject3 = jSONObject2.getJSONObject("rootContainer");
                JSONArray jSONArray = new JSONArray();
                for (String a : m17446e(jSONObject3)) {
                    m17442a(jSONArray, a, (byte) 2);
                }
                for (String a2 : m17447f(jSONObject3)) {
                    m17442a(jSONArray, a2, (byte) 1);
                }
                boolean d = m17445d(jSONObject3);
                auVar.assetUrls = jSONArray;
                auVar.mIsPreloadWebView = d;
            }
        } catch (Exception e) {
            C6181gg.m18398a().mo35357a(new C6217hg(e));
        }
    }

    /* renamed from: a */
    public static C5838au m17437a(C5838au auVar, C6125fq fqVar) throws JSONException, C5899br {
        if (!"inmobiJson".equals(auVar.mo34736i())) {
            return auVar;
        }
        JSONObject jSONObject = new JSONObject(auVar.mo34737j());
        String c = m17444c(jSONObject.getJSONObject("rootContainer"));
        if (c.trim().length() == 0) {
            return auVar;
        }
        C6000ds a = new C5994dp(fqVar.vastVideo).mo35102a(c);
        JSONArray jSONArray = auVar.assetUrls;
        if (a.f15264f == 0) {
            String b = a.mo35108b();
            if (b == null || b.isEmpty()) {
                throw new C5899br(401);
            }
            m17442a(jSONArray, b, (byte) 0);
            List<String> a2 = m17439a(jSONObject, fqVar.vastVideo);
            a2.size();
            for (String a3 : a2) {
                m17442a(jSONArray, a3, (byte) 0);
            }
            for (String a4 : m17438a(jSONObject)) {
                m17442a(jSONArray, a4, (byte) 2);
            }
            for (String a5 : m17443b(jSONObject)) {
                m17442a(jSONArray, a5, (byte) 1);
            }
            return new C5893bl(auVar, jSONArray, a.mo35108b(), a.f15260b, a.f15261c, a.f15262d, a.f15263e);
        }
        throw new C5899br(a.f15264f);
    }

    /* renamed from: a */
    private static void m17442a(JSONArray jSONArray, String str, byte b) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("type", b);
        jSONObject.put("url", str);
        jSONArray.put(jSONObject);
    }

    /* renamed from: a */
    private static List<String> m17439a(JSONObject jSONObject, C6125fq.C6140k kVar) {
        C6000ds a;
        ArrayList arrayList = new ArrayList();
        try {
            JSONArray jSONArray = jSONObject.getJSONArray("pages");
            for (int i = 0; i < jSONArray.length(); i++) {
                if (!jSONArray.getJSONObject(i).isNull("rootContainer")) {
                    String c = m17444c(jSONArray.getJSONObject(i).getJSONObject("rootContainer"));
                    if (!(c.trim().length() == 0 || (a = new C5994dp(kVar).mo35102a(c)) == null)) {
                        if (a.f15264f == 0) {
                            String b = a.mo35108b();
                            if (b != null && !b.isEmpty()) {
                                arrayList.add(b);
                            }
                        }
                    }
                }
            }
        } catch (JSONException unused) {
        }
        return arrayList;
    }

    /* renamed from: a */
    private static List<String> m17438a(JSONObject jSONObject) {
        ArrayList arrayList = new ArrayList();
        try {
            JSONArray jSONArray = jSONObject.getJSONArray("pages");
            for (int i = 0; i < jSONArray.length(); i++) {
                if (!jSONArray.getJSONObject(i).isNull("rootContainer")) {
                    arrayList.addAll(m17446e(jSONArray.getJSONObject(i).getJSONObject("rootContainer")));
                }
            }
        } catch (JSONException unused) {
        }
        return arrayList;
    }

    /* renamed from: b */
    private static List<String> m17443b(JSONObject jSONObject) {
        ArrayList arrayList = new ArrayList();
        try {
            JSONArray jSONArray = jSONObject.getJSONArray("pages");
            for (int i = 0; i < jSONArray.length(); i++) {
                if (!jSONArray.getJSONObject(i).isNull("rootContainer")) {
                    arrayList.addAll(m17447f(jSONArray.getJSONObject(i).getJSONObject("rootContainer")));
                }
            }
        } catch (JSONException unused) {
        }
        return arrayList;
    }

    /* renamed from: c */
    private static String m17444c(JSONObject jSONObject) {
        try {
            JSONArray jSONArray = jSONObject.getJSONArray("assetValue");
            if (jSONArray.length() == 0) {
                return "";
            }
            String string = jSONObject.getString("assetType");
            if ("video".equalsIgnoreCase(string)) {
                return jSONArray.getString(0);
            }
            if (!TtmlNode.RUBY_CONTAINER.equalsIgnoreCase(string)) {
                return "";
            }
            String str = "";
            for (int i = 0; i < jSONArray.length(); i++) {
                str = m17444c(jSONArray.getJSONObject(i));
                if (str.trim().length() != 0) {
                    break;
                }
            }
            return str;
        } catch (JSONException e) {
            C6181gg.m18398a().mo35357a(new C6217hg(e));
            return "";
        }
    }

    /* renamed from: d */
    private static boolean m17445d(JSONObject jSONObject) {
        try {
            JSONArray jSONArray = jSONObject.getJSONArray("assetValue");
            if (jSONArray.length() == 0) {
                return false;
            }
            String string = jSONObject.getString("assetType");
            if ("webview".equalsIgnoreCase(string)) {
                if (jSONObject.isNull("preload") || !jSONObject.getBoolean("preload")) {
                    return false;
                }
                return true;
            } else if (!TtmlNode.RUBY_CONTAINER.equalsIgnoreCase(string)) {
                return false;
            } else {
                int i = 0;
                boolean z = false;
                while (i < jSONArray.length() && !(z = m17445d(jSONArray.getJSONObject(i)))) {
                    i++;
                }
                return z;
            }
        } catch (JSONException e) {
            C6181gg.m18398a().mo35357a(new C6217hg(e));
            return false;
        }
    }

    /* renamed from: e */
    private static List<String> m17446e(JSONObject jSONObject) {
        ArrayList arrayList = new ArrayList();
        try {
            JSONArray jSONArray = jSONObject.getJSONArray("assetValue");
            if (jSONArray.length() == 0) {
                return arrayList;
            }
            String string = jSONObject.getString("assetType");
            if ("image".equalsIgnoreCase(string)) {
                if (!jSONObject.isNull("preload") && jSONObject.getBoolean("preload")) {
                    arrayList.add(jSONArray.getString(0));
                }
                return arrayList;
            }
            if (TtmlNode.RUBY_CONTAINER.equalsIgnoreCase(string)) {
                for (int i = 0; i < jSONArray.length(); i++) {
                    arrayList.addAll(m17446e(jSONArray.getJSONObject(i)));
                }
            }
            return arrayList;
        } catch (JSONException unused) {
        }
    }

    /* renamed from: f */
    private static List<String> m17447f(JSONObject jSONObject) {
        ArrayList arrayList = new ArrayList();
        try {
            JSONArray jSONArray = jSONObject.getJSONArray("assetValue");
            if (jSONArray.length() == 0) {
                return arrayList;
            }
            String string = jSONObject.getString("assetType");
            if ("gif".equalsIgnoreCase(string)) {
                arrayList.add(jSONArray.getString(0));
                return arrayList;
            }
            if (TtmlNode.RUBY_CONTAINER.equalsIgnoreCase(string)) {
                for (int i = 0; i < jSONArray.length(); i++) {
                    arrayList.addAll(m17447f(jSONArray.getJSONObject(i)));
                }
            }
            return arrayList;
        } catch (JSONException unused) {
        }
    }

    /* renamed from: a */
    public static void m17441a(C5838au auVar, JSONObject jSONObject, String str, long j) throws JSONException, IllegalStateException {
        long j2;
        if ("unknown".equals(auVar.markupType) || TextUtils.isEmpty(auVar.impressionId)) {
            throw new IllegalStateException("Invalid Ad");
        }
        long optLong = jSONObject.optLong("expiry", TimeUnit.MILLISECONDS.toSeconds(j));
        if (optLong <= 0) {
            j2 = -1;
        } else {
            j2 = TimeUnit.SECONDS.toMillis(optLong);
        }
        auVar.mAdContent = jSONObject;
        auVar.mAdType = str;
        auVar.mInsertionTimestampInMillis = System.currentTimeMillis();
        auVar.mExpiryDurationInMillis = j2;
        if ("inmobiJson".equals(auVar.mo34736i())) {
            m17440a(auVar, jSONObject);
        }
    }
}

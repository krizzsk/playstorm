package com.mbridge.msdk.mbsignalcommon.mraid;

import android.net.Uri;
import android.text.TextUtils;
import android.webkit.WebView;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.C8595p;
import com.mbridge.msdk.mbsignalcommon.mraid.C8808a;
import com.mbridge.msdk.mbsignalcommon.windvane.C8818a;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* renamed from: com.mbridge.msdk.mbsignalcommon.mraid.c */
/* compiled from: MraidUriUtil */
public final class C8811c {

    /* renamed from: a */
    private static volatile ConcurrentHashMap<String, String> f21416a = new ConcurrentHashMap<>();

    /* renamed from: b */
    private static ArrayList<String> f21417b = new ArrayList<>();

    /* renamed from: a */
    public static C8818a m25636a(WindVaneWebView windVaneWebView, String str) {
        Set<String> set;
        Uri parse = Uri.parse(str);
        String scheme = parse.getScheme();
        if (TextUtils.isEmpty(scheme) || !scheme.contains(CampaignEx.JSON_KEY_MRAID)) {
            return null;
        }
        C8818a aVar = new C8818a();
        aVar.f21447d = C8595p.m24815b("n+ztLkxpVTzBLkxgHN==");
        aVar.f21448e = parse.getHost();
        int i = 0;
        if (f21417b.size() == 0) {
            for (Method name : C8810b.class.getDeclaredMethods()) {
                f21417b.add(name.getName());
            }
        }
        if (f21417b.contains(aVar.f21448e) || windVaneWebView == null) {
            String encodedQuery = parse.getEncodedQuery();
            if (encodedQuery == null) {
                set = Collections.emptySet();
            } else {
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                do {
                    int indexOf = encodedQuery.indexOf(38, i);
                    if (indexOf == -1) {
                        indexOf = encodedQuery.length();
                    }
                    int indexOf2 = encodedQuery.indexOf(61, i);
                    if (indexOf2 > indexOf || indexOf2 == -1) {
                        indexOf2 = indexOf;
                    }
                    linkedHashSet.add(Uri.decode(encodedQuery.substring(i, indexOf2)));
                    i = indexOf + 1;
                } while (i < encodedQuery.length());
                set = Collections.unmodifiableSet(linkedHashSet);
            }
            try {
                JSONObject jSONObject = new JSONObject();
                for (String str2 : set) {
                    jSONObject.put(str2, parse.getQueryParameter(str2));
                }
                aVar.f21449f = jSONObject.toString();
            } catch (Exception e) {
                e.printStackTrace();
            }
            return aVar;
        }
        String campaignId = windVaneWebView.getCampaignId();
        String str3 = aVar.f21448e;
        if (!TextUtils.isEmpty(campaignId)) {
            if (f21416a.containsKey(campaignId)) {
                String str4 = f21416a.get(campaignId);
                if (!TextUtils.isEmpty(str3) && !str4.contains(str3)) {
                    if (str4.length() > 0) {
                        str4 = str4.concat(",");
                    }
                    f21416a.put(campaignId, str4.concat(str3));
                }
            } else {
                f21416a.put(campaignId, str3);
            }
        }
        C8808a.C8809a.f21415a.mo58255a((WebView) windVaneWebView, aVar.f21448e);
        C8808a.C8809a.f21415a.mo58256a((WebView) windVaneWebView, aVar.f21448e, "Specified command is not implemented");
        return null;
    }

    /* renamed from: a */
    public static String m25637a(String str) {
        if (f21416a.containsKey(str)) {
            return f21416a.get(str);
        }
        return null;
    }

    /* renamed from: b */
    public static void m25638b(String str) {
        if (!TextUtils.isEmpty(str)) {
            f21416a.remove(str);
        }
    }
}

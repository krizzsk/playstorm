package com.mbridge.msdk.foundation.same.net.p311g;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.mbridge.msdk.foundation.same.net.p307c.C8456a;
import com.mbridge.msdk.foundation.tools.C8608u;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.text.Typography;

/* renamed from: com.mbridge.msdk.foundation.same.net.g.d */
/* compiled from: CommonRequestParams */
public final class C8494d {

    /* renamed from: a */
    public static String f20560a = CampaignUnit.JSON_KEY_SESSION_ID;

    /* renamed from: b */
    public static String f20561b = "d";

    /* renamed from: c */
    public static String f20562c = "e";

    /* renamed from: d */
    public static String f20563d = InneractiveMediationDefs.GENDER_FEMALE;

    /* renamed from: e */
    public static String f20564e = "g";

    /* renamed from: f */
    public static String f20565f = "h";

    /* renamed from: g */
    public static String f20566g = "i";

    /* renamed from: h */
    private static final String f20567h = C8494d.class.getSimpleName();

    /* renamed from: i */
    private Map<String, String> f20568i = new LinkedHashMap();

    /* renamed from: j */
    private Map<String, C8456a> f20569j = new LinkedHashMap();

    /* renamed from: a */
    public final void mo57606a(String str, String str2) {
        if (!TextUtils.isEmpty(str) && str2 != null) {
            this.f20568i.put(str, str2);
        }
    }

    /* renamed from: a */
    public final String mo57604a() {
        StringBuilder sb = new StringBuilder();
        try {
            for (Map.Entry next : this.f20568i.entrySet()) {
                if (sb.length() > 0) {
                    sb.append(Typography.amp);
                }
                sb.append(URLEncoder.encode((String) next.getKey(), "UTF-8"));
                sb.append("=");
                sb.append(URLEncoder.encode((String) next.getValue(), "UTF-8"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return sb.toString();
    }

    /* renamed from: a */
    public final void mo57605a(String str) {
        this.f20568i.remove(str);
        this.f20569j.remove(str);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(28);
        try {
            for (Map.Entry next : this.f20568i.entrySet()) {
                if (sb.length() > 0) {
                    sb.append(Typography.amp);
                }
                sb.append(URLEncoder.encode((String) next.getKey(), "UTF-8"));
                sb.append('=');
                sb.append(URLEncoder.encode((String) next.getValue(), "UTF-8"));
            }
            for (Map.Entry next2 : this.f20569j.entrySet()) {
                if (sb.length() > 0) {
                    sb.append(Typography.amp);
                }
                sb.append(URLEncoder.encode((String) next2.getKey(), "UTF-8"));
                sb.append('=');
                sb.append(URLEncoder.encode("FILE_NAME_" + ((C8456a) next2.getValue()).mo57557a().getName(), "UTF-8"));
            }
        } catch (UnsupportedEncodingException e) {
            C8608u.m24884d(f20567h, e.getMessage());
        }
        return sb.toString();
    }

    /* renamed from: b */
    public final Map<String, String> mo57607b() {
        return this.f20568i;
    }
}

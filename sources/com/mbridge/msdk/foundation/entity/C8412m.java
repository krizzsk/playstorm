package com.mbridge.msdk.foundation.entity;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.controller.authoritycontroller.C2357a;
import com.mbridge.msdk.foundation.same.C8413a;
import com.mbridge.msdk.foundation.tools.C8596q;
import com.mbridge.msdk.foundation.tools.C8608u;
import com.mbridge.msdk.foundation.tools.C8613y;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.mbridge.msdk.foundation.entity.m */
/* compiled from: VideoReportData */
public final class C8412m {

    /* renamed from: a */
    public static int f20281a = 1;

    /* renamed from: b */
    public static int f20282b;

    /* renamed from: A */
    private String f20283A;

    /* renamed from: B */
    private String f20284B;

    /* renamed from: C */
    private String f20285C;

    /* renamed from: D */
    private String f20286D;

    /* renamed from: E */
    private String f20287E;

    /* renamed from: F */
    private String f20288F;

    /* renamed from: G */
    private String f20289G;

    /* renamed from: H */
    private int f20290H = 0;

    /* renamed from: I */
    private int f20291I;

    /* renamed from: c */
    private String f20292c;

    /* renamed from: d */
    private String f20293d;

    /* renamed from: e */
    private String f20294e;

    /* renamed from: f */
    private String f20295f;

    /* renamed from: g */
    private int f20296g;

    /* renamed from: h */
    private String f20297h;

    /* renamed from: i */
    private int f20298i;

    /* renamed from: j */
    private int f20299j;

    /* renamed from: k */
    private int f20300k;

    /* renamed from: l */
    private String f20301l;

    /* renamed from: m */
    private String f20302m;

    /* renamed from: n */
    private int f20303n;

    /* renamed from: o */
    private int f20304o;

    /* renamed from: p */
    private String f20305p;

    /* renamed from: q */
    private long f20306q;

    /* renamed from: r */
    private int f20307r = 0;

    /* renamed from: s */
    private String f20308s;

    /* renamed from: t */
    private String f20309t;

    /* renamed from: u */
    private String f20310u;

    /* renamed from: v */
    private String f20311v;

    /* renamed from: w */
    private String f20312w;

    /* renamed from: x */
    private String f20313x;

    /* renamed from: y */
    private String f20314y;

    /* renamed from: z */
    private String f20315z;

    /* renamed from: a */
    public final String mo57438a() {
        return this.f20292c;
    }

    /* renamed from: a */
    public final void mo57440a(String str) {
        this.f20292c = str;
    }

    /* renamed from: b */
    public final String mo57441b() {
        return this.f20293d;
    }

    /* renamed from: b */
    public final void mo57443b(String str) {
        this.f20293d = str;
    }

    /* renamed from: c */
    public final String mo57444c() {
        return this.f20294e;
    }

    /* renamed from: c */
    public final void mo57446c(String str) {
        this.f20294e = URLEncoder.encode(str);
    }

    /* renamed from: d */
    public final String mo57447d() {
        return this.f20288F;
    }

    /* renamed from: d */
    public final void mo57449d(String str) {
        try {
            if (!TextUtils.isEmpty(str)) {
                this.f20288F = URLEncoder.encode(str, "utf-8");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: e */
    public final String mo57450e() {
        return this.f20287E;
    }

    /* renamed from: e */
    public final void mo57451e(String str) {
        try {
            if (!TextUtils.isEmpty(str)) {
                this.f20287E = URLEncoder.encode(str, "utf-8");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: f */
    public final String mo57452f() {
        return this.f20286D;
    }

    /* renamed from: f */
    public final void mo57453f(String str) {
        try {
            if (!TextUtils.isEmpty(str)) {
                this.f20286D = URLEncoder.encode(str, "utf-8");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: g */
    public final String mo57454g() {
        return this.f20285C;
    }

    /* renamed from: g */
    public final void mo57455g(String str) {
        this.f20285C = str;
    }

    /* renamed from: h */
    public final String mo57456h() {
        return this.f20289G;
    }

    /* renamed from: h */
    public final void mo57457h(String str) {
        this.f20289G = str;
    }

    /* renamed from: i */
    public final String mo57458i() {
        return this.f20312w;
    }

    /* renamed from: i */
    public final void mo57459i(String str) {
        try {
            if (!TextUtils.isEmpty(str)) {
                this.f20312w = URLEncoder.encode(str, "utf-8");
            }
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: j */
    public final void mo57461j(String str) {
        this.f20314y = str;
    }

    /* renamed from: a */
    public final void mo57439a(int i) {
        this.f20290H = i;
    }

    /* renamed from: j */
    public final int mo57460j() {
        return this.f20291I;
    }

    /* renamed from: b */
    public final void mo57442b(int i) {
        this.f20291I = i;
    }

    public C8412m(String str, int i, int i2, int i3, int i4, String str2, String str3, int i5, String str4, int i6, String str5) {
        this.f20295f = str;
        this.f20296g = i;
        this.f20297h = str5;
        this.f20298i = i2;
        this.f20299j = i3;
        this.f20300k = i4;
        try {
            if (!TextUtils.isEmpty(str2)) {
                this.f20301l = URLEncoder.encode(str2, "utf-8");
            }
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        this.f20302m = str3;
        this.f20304o = i5;
        this.f20305p = str4;
        this.f20306q = (long) i6;
    }

    public C8412m() {
    }

    public C8412m(String str, int i, String str2, String str3, String str4) {
        this.f20295f = str;
        this.f20297h = str4;
        this.f20296g = i;
        try {
            if (!TextUtils.isEmpty(str2)) {
                this.f20301l = URLEncoder.encode(str2, "utf-8");
            }
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        this.f20302m = str3;
    }

    public C8412m(String str, int i, int i2, String str2, int i3, String str3, int i4, String str4) {
        this.f20295f = str;
        this.f20296g = i;
        this.f20297h = str4;
        this.f20300k = i2;
        try {
            if (!TextUtils.isEmpty(str2)) {
                this.f20301l = URLEncoder.encode(str2, "utf-8");
            }
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        this.f20304o = i3;
        this.f20305p = str3;
        this.f20306q = (long) i4;
    }

    public C8412m(Context context, CampaignEx campaignEx, int i, String str, long j, int i2) {
        if (i2 == 1) {
            this.f20295f = "2000022";
        } else if (i2 == 287 || i2 == 94) {
            this.f20295f = "2000022";
        } else if (i2 == 95) {
            this.f20295f = "2000025";
        }
        int n = C8596q.m24849n(context);
        this.f20296g = n;
        this.f20297h = C8596q.m24818a(context, n);
        this.f20300k = campaignEx.getVideoLength();
        try {
            this.f20301l = URLEncoder.encode(campaignEx.getNoticeUrl() == null ? campaignEx.getClickURL() : campaignEx.getNoticeUrl(), "utf-8");
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.f20304o = i;
        this.f20305p = str;
        this.f20306q = j == 0 ? (long) campaignEx.getVideoSize() : j;
    }

    public C8412m(String str, String str2, String str3, String str4, String str5, String str6, int i, String str7) {
        this.f20295f = str;
        this.f20315z = str2;
        this.f20313x = str3;
        this.f20283A = str4;
        this.f20310u = str5;
        this.f20311v = str6;
        this.f20296g = i;
        this.f20297h = str7;
    }

    public C8412m(String str) {
        this.f20284B = str;
    }

    public C8412m(String str, int i, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.f20295f = str;
        this.f20304o = i;
        this.f20305p = str2;
        try {
            if (!TextUtils.isEmpty(str3)) {
                this.f20286D = URLEncoder.encode(str3, "utf-8");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.f20311v = str4;
        this.f20310u = str5;
        this.f20302m = str6;
        this.f20285C = str7;
        if (Integer.valueOf(str2).intValue() > C8413a.f20331m) {
            this.f20304o = 2;
        }
    }

    public C8412m(String str, String str2, String str3, String str4, String str5, int i) {
        this.f20295f = str;
        this.f20311v = str2;
        this.f20308s = str3;
        this.f20309t = str4;
        this.f20310u = str5;
        this.f20296g = i;
    }

    public C8412m(String str, String str2, String str3, String str4, String str5, int i, int i2, String str6) {
        this.f20295f = str;
        this.f20311v = str2;
        this.f20308s = str3;
        this.f20309t = str4;
        this.f20310u = str5;
        this.f20296g = i;
        this.f20302m = str6;
        this.f20303n = i2;
    }

    /* renamed from: k */
    public final String mo57462k() {
        return this.f20308s;
    }

    /* renamed from: k */
    public final void mo57463k(String str) {
        this.f20308s = str;
    }

    /* renamed from: l */
    public final String mo57464l() {
        return this.f20309t;
    }

    /* renamed from: l */
    public final void mo57465l(String str) {
        this.f20309t = str;
    }

    /* renamed from: m */
    public final String mo57466m() {
        return this.f20310u;
    }

    /* renamed from: m */
    public final void mo57467m(String str) {
        this.f20310u = str;
    }

    /* renamed from: n */
    public final String mo57468n() {
        return this.f20311v;
    }

    /* renamed from: n */
    public final void mo57469n(String str) {
        this.f20311v = str;
    }

    /* renamed from: o */
    public final String mo57470o() {
        return this.f20295f;
    }

    /* renamed from: o */
    public final void mo57471o(String str) {
        this.f20295f = str;
    }

    /* renamed from: p */
    public final int mo57472p() {
        return this.f20299j;
    }

    /* renamed from: q */
    public final int mo57474q() {
        return this.f20300k;
    }

    /* renamed from: r */
    public final String mo57476r() {
        return this.f20301l;
    }

    /* renamed from: s */
    public final String mo57478s() {
        return this.f20302m;
    }

    /* renamed from: p */
    public final void mo57473p(String str) {
        this.f20302m = str;
    }

    /* renamed from: t */
    public final String mo57479t() {
        return this.f20305p;
    }

    /* renamed from: q */
    public final void mo57475q(String str) {
        this.f20305p = str;
    }

    /* renamed from: u */
    public final long mo57481u() {
        return this.f20306q;
    }

    /* renamed from: v */
    public final int mo57482v() {
        return this.f20296g;
    }

    /* renamed from: c */
    public final void mo57445c(int i) {
        this.f20296g = i;
    }

    /* renamed from: w */
    public final String mo57483w() {
        return this.f20297h;
    }

    /* renamed from: r */
    public final void mo57477r(String str) {
        this.f20297h = str;
    }

    /* renamed from: x */
    public final int mo57484x() {
        return this.f20298i;
    }

    /* renamed from: y */
    public final int mo57485y() {
        return this.f20304o;
    }

    /* renamed from: d */
    public final void mo57448d(int i) {
        this.f20304o = i;
    }

    /* renamed from: a */
    public static String m24224a(List<C8412m> list) {
        if (list == null || list.size() <= 0) {
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (C8412m next : list) {
            if (C2357a.m5633a().mo15819a(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
                stringBuffer.append("key=" + next.f20295f + "&");
                stringBuffer.append("network_type=" + next.f20296g + "&");
                stringBuffer.append("network_str=" + next.f20297h + "&");
                stringBuffer.append("reason=" + next.f20302m + "&");
                stringBuffer.append("cid=" + next.f20311v + "&");
                stringBuffer.append("video_url=" + next.f20287E + "&");
                stringBuffer.append("rid=" + next.f20308s + "&");
                stringBuffer.append("rid_n=" + next.f20309t + "&");
                stringBuffer.append("unit_id=" + next.f20310u + "&");
                StringBuilder sb = new StringBuilder();
                sb.append("offer_url=");
                sb.append(next.f20301l);
                stringBuffer.append(sb.toString());
                stringBuffer.append("\n");
            } else {
                stringBuffer.append("key=" + next.f20295f + "&");
                stringBuffer.append("reason=" + next.f20302m + "&");
                stringBuffer.append("cid=" + next.f20311v + "&");
                stringBuffer.append("video_url=" + next.f20287E + "&");
                stringBuffer.append("rid=" + next.f20308s + "&");
                stringBuffer.append("rid_n=" + next.f20309t + "&");
                stringBuffer.append("unit_id=" + next.f20310u + "&");
                StringBuilder sb2 = new StringBuilder();
                sb2.append("offer_url=");
                sb2.append(next.f20301l);
                stringBuffer.append(sb2.toString());
                stringBuffer.append("\n");
            }
        }
        return stringBuffer.toString();
    }

    /* renamed from: b */
    public static String m24226b(List<C8412m> list) {
        if (list == null || list.size() <= 0) {
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer();
        Iterator<C8412m> it = list.iterator();
        while (it.hasNext()) {
            C8412m next = it.next();
            Iterator<C8412m> it2 = it;
            if (C2357a.m5633a().mo15819a(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
                stringBuffer.append("key=" + next.f20295f + "&");
                stringBuffer.append("network_type=" + next.f20296g + "&");
                stringBuffer.append("network_str=" + next.f20297h + "&");
                stringBuffer.append("result=" + next.f20304o + "&");
                stringBuffer.append("duration=" + next.f20305p + "&");
                stringBuffer.append("video_size=" + next.f20306q + "&");
                stringBuffer.append("video_length=" + next.f20300k + "&");
                stringBuffer.append("reason=" + next.f20302m + "&");
                stringBuffer.append("cid=" + next.f20311v + "&");
                stringBuffer.append("video_url=" + next.f20287E + "&");
                stringBuffer.append("rid=" + next.f20308s + "&");
                stringBuffer.append("rid_n=" + next.f20309t + "&");
                stringBuffer.append("unit_id=" + next.f20310u + "&");
                stringBuffer.append("offer_url=" + next.f20301l + "&");
            } else {
                stringBuffer.append("key=" + next.f20295f + "&");
                stringBuffer.append("result=" + next.f20304o + "&");
                stringBuffer.append("duration=" + next.f20305p + "&");
                stringBuffer.append("video_size=" + next.f20306q + "&");
                stringBuffer.append("video_length=" + next.f20300k + "&");
                stringBuffer.append("reason=" + next.f20302m + "&");
                stringBuffer.append("cid=" + next.f20311v + "&");
                stringBuffer.append("video_url=" + next.f20287E + "&");
                stringBuffer.append("rid=" + next.f20308s + "&");
                stringBuffer.append("rid_n=" + next.f20309t + "&");
                stringBuffer.append("unit_id=" + next.f20310u + "&");
                stringBuffer.append("offer_url=" + next.f20301l + "&");
            }
            if (next.f20292c != null) {
                stringBuffer.append("resource_type=" + next.f20292c + "&");
            }
            if (next.f20294e != null) {
                stringBuffer.append("creative=" + next.f20294e + "&");
            }
            stringBuffer.append("\n");
            it = it2;
        }
        return stringBuffer.toString();
    }

    /* renamed from: a */
    public static String m24223a(C8412m mVar) {
        if (mVar == null) {
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("key=" + mVar.f20295f + "&");
        stringBuffer.append("cid=" + mVar.f20311v + "&");
        stringBuffer.append("unit_id=" + mVar.f20310u + "&");
        stringBuffer.append("network_type=" + mVar.f20296g + "&");
        stringBuffer.append("rid=" + mVar.f20308s + "&");
        stringBuffer.append("rid_n=" + mVar.f20309t + "&");
        StringBuilder sb = new StringBuilder();
        sb.append("reason=");
        sb.append(mVar.f20302m);
        stringBuffer.append(sb.toString());
        stringBuffer.append("\n");
        return stringBuffer.toString();
    }

    /* renamed from: b */
    public static String m24225b(C8412m mVar) {
        if (mVar == null) {
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("key=" + mVar.f20295f + "&");
        stringBuffer.append("cid=" + mVar.f20311v + "&");
        stringBuffer.append("unit_id=" + mVar.f20310u + "&");
        stringBuffer.append("network_type=" + mVar.f20296g + "&");
        stringBuffer.append("mraid_type=" + mVar.f20290H + "&");
        stringBuffer.append("rid_n=" + mVar.f20309t + "&");
        StringBuilder sb = new StringBuilder();
        sb.append("rid=");
        sb.append(mVar.f20308s);
        stringBuffer.append(sb.toString());
        stringBuffer.append("\n");
        return stringBuffer.toString();
    }

    /* renamed from: c */
    public static String m24227c(C8412m mVar) {
        if (mVar == null) {
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("key=" + mVar.f20295f + "&");
        stringBuffer.append("result=" + mVar.f20304o + "&");
        stringBuffer.append("duration=" + mVar.f20305p + "&");
        stringBuffer.append("cid=" + mVar.f20311v + "&");
        stringBuffer.append("reason=" + mVar.f20302m + "&");
        stringBuffer.append("ad_type=" + mVar.f20289G + "&");
        stringBuffer.append("unit_id=" + mVar.f20310u + "&");
        stringBuffer.append("devid=" + mVar.f20293d + "&");
        stringBuffer.append("mraid_type=" + mVar.f20290H + "&");
        stringBuffer.append("network_type=" + mVar.f20296g + "&");
        if (!TextUtils.isEmpty(mVar.f20286D)) {
            stringBuffer.append("endcard_url=" + mVar.f20286D + "&");
        }
        if (!TextUtils.isEmpty(mVar.f20285C)) {
            stringBuffer.append("type=" + mVar.f20285C + "&");
        }
        if (mVar.f20292c != null) {
            stringBuffer.append("resource_type=" + mVar.f20292c + "&");
        }
        stringBuffer.append("rid_n=" + mVar.f20309t + "&");
        StringBuilder sb = new StringBuilder();
        sb.append("rid=");
        sb.append(mVar.f20308s);
        stringBuffer.append(sb.toString());
        stringBuffer.append("\n");
        return stringBuffer.toString();
    }

    /* renamed from: d */
    public static String m24229d(C8412m mVar) {
        if (mVar == null) {
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("key=" + mVar.f20295f + "&");
        stringBuffer.append("result=" + mVar.f20304o + "&");
        stringBuffer.append("duration=" + mVar.f20305p + "&");
        stringBuffer.append("cid=" + mVar.f20311v + "&");
        stringBuffer.append("unit_id=" + mVar.f20310u + "&");
        stringBuffer.append("reason=" + mVar.f20302m + "&");
        stringBuffer.append("ad_type=" + mVar.f20289G + "&");
        stringBuffer.append("rid=" + mVar.f20308s + "&");
        stringBuffer.append("rid_n=" + mVar.f20309t + "&");
        stringBuffer.append("network_type=" + mVar.f20296g + "&");
        stringBuffer.append("mraid_type=" + mVar.f20290H + "&");
        stringBuffer.append("devid=" + mVar.f20293d + "&");
        if (mVar.f20292c != null) {
            stringBuffer.append("resource_type=" + mVar.f20292c + "&");
        }
        if (!TextUtils.isEmpty(mVar.f20286D)) {
            stringBuffer.append("endcard_url=" + mVar.f20286D + "&");
        }
        stringBuffer.append("type=" + mVar.f20285C);
        return stringBuffer.toString();
    }

    /* renamed from: c */
    public static String m24228c(List<C8412m> list) {
        if (list == null || list.size() <= 0) {
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (C8412m next : list) {
            stringBuffer.append("key=" + next.f20295f + "&");
            stringBuffer.append("result=" + next.f20304o + "&");
            stringBuffer.append("duration=" + next.f20305p + "&");
            stringBuffer.append("endcard_url=" + next.f20286D + "&");
            stringBuffer.append("cid=" + next.f20311v + "&");
            stringBuffer.append("unit_id=" + next.f20310u + "&");
            stringBuffer.append("reason=" + next.f20302m + "&");
            stringBuffer.append("ad_type=" + next.f20289G + "&");
            stringBuffer.append("rid=" + next.f20308s + "&");
            stringBuffer.append("rid_n=" + next.f20309t + "&");
            stringBuffer.append("type=" + next.f20285C + "&");
            StringBuilder sb = new StringBuilder();
            sb.append("adspace_t=");
            sb.append(next.f20291I);
            stringBuffer.append(sb.toString());
            stringBuffer.append("\n");
        }
        return stringBuffer.toString();
    }

    /* renamed from: d */
    public static String m24230d(List<C8412m> list) {
        if (list == null || list.size() <= 0) {
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (C8412m next : list) {
            if (C2357a.m5633a().mo15819a(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
                stringBuffer.append("key=" + next.f20295f + "&");
                stringBuffer.append("network_type=" + next.f20296g + "&");
                stringBuffer.append("result=" + next.f20304o + "&");
                stringBuffer.append("cid=" + next.f20311v + "&");
                stringBuffer.append("template_url=" + next.f20312w + "&");
                stringBuffer.append("reason=" + next.f20302m + "&");
                stringBuffer.append("rid=" + next.f20308s + "&");
                stringBuffer.append("rid_n=" + next.f20309t + "&");
                stringBuffer.append("unit_id=" + next.f20310u + "&");
                stringBuffer.append("\n");
            } else {
                stringBuffer.append("key=" + next.f20295f + "&");
                stringBuffer.append("result=" + next.f20304o + "&");
                stringBuffer.append("cid=" + next.f20311v + "&");
                stringBuffer.append("template_url=" + next.f20312w + "&");
                stringBuffer.append("reason=" + next.f20302m + "&");
                stringBuffer.append("rid=" + next.f20308s + "&");
                stringBuffer.append("rid_n=" + next.f20309t + "&");
                stringBuffer.append("unit_id=" + next.f20310u + "&");
                stringBuffer.append("\n");
            }
        }
        return stringBuffer.toString();
    }

    /* renamed from: e */
    public static String m24232e(List<C8412m> list) {
        if (list == null || list.size() <= 0) {
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (C8412m next : list) {
            if (C2357a.m5633a().mo15819a(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
                stringBuffer.append("key=" + next.f20295f + "&");
                stringBuffer.append("network_type=" + next.f20296g + "&");
                stringBuffer.append("cid=" + next.f20311v + "&");
                stringBuffer.append("image_url=" + next.f20288F + "&");
                stringBuffer.append("reason=" + next.f20302m + "&");
                stringBuffer.append("rid=" + next.f20308s + "&");
                stringBuffer.append("rid_n=" + next.f20309t + "&");
                stringBuffer.append("unit_id=" + next.f20310u + "&");
                stringBuffer.append("\n");
            } else {
                stringBuffer.append("key=" + next.f20295f + "&");
                stringBuffer.append("cid=" + next.f20311v + "&");
                stringBuffer.append("image_url=" + next.f20288F + "&");
                stringBuffer.append("reason=" + next.f20302m + "&");
                stringBuffer.append("rid=" + next.f20308s + "&");
                stringBuffer.append("rid_n=" + next.f20309t + "&");
                stringBuffer.append("unit_id=" + next.f20310u + "&");
                stringBuffer.append("\n");
            }
        }
        return stringBuffer.toString();
    }

    /* renamed from: e */
    public static String m24231e(C8412m mVar) {
        if (mVar == null) {
            return null;
        }
        try {
            StringBuffer stringBuffer = new StringBuffer();
            if (C2357a.m5633a().mo15819a(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
                stringBuffer.append("key=" + mVar.f20295f + "&");
                stringBuffer.append("error=" + C8613y.m24938c(mVar.f20314y) + "&");
                stringBuffer.append("template_url=" + C8613y.m24938c(mVar.f20312w) + "&");
                stringBuffer.append("unit_id=" + C8613y.m24938c(mVar.f20310u) + "&");
                stringBuffer.append("cid=" + C8613y.m24938c(mVar.f20311v) + "&");
                stringBuffer.append("network_str=" + mVar.f20297h + "&");
                StringBuilder sb = new StringBuilder();
                sb.append("network_type=");
                sb.append(mVar.f20296g);
                stringBuffer.append(sb.toString());
            } else {
                stringBuffer.append("key=" + mVar.f20295f + "&");
                stringBuffer.append("error=" + C8613y.m24938c(mVar.f20314y) + "&");
                stringBuffer.append("template_url=" + C8613y.m24938c(mVar.f20312w) + "&");
                stringBuffer.append("unit_id=" + C8613y.m24938c(mVar.f20310u) + "&");
                stringBuffer.append("cid=" + C8613y.m24938c(mVar.f20311v) + "&");
            }
            return stringBuffer.toString();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: f */
    public static String m24233f(C8412m mVar) {
        if (mVar == null) {
            return null;
        }
        try {
            StringBuffer stringBuffer = new StringBuffer();
            if (C2357a.m5633a().mo15819a(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
                stringBuffer.append("key=" + mVar.f20295f + "&");
                stringBuffer.append("event=" + C8613y.m24938c(mVar.f20315z) + "&");
                stringBuffer.append("template=" + C8613y.m24938c(mVar.f20313x) + "&");
                stringBuffer.append("layout=" + C8613y.m24938c(mVar.f20283A) + "&");
                stringBuffer.append("unit_id=" + C8613y.m24938c(mVar.f20310u) + "&");
                stringBuffer.append("cid=" + C8613y.m24938c(mVar.f20311v) + "&");
                stringBuffer.append("network_str=" + mVar.f20297h + "&");
                StringBuilder sb = new StringBuilder();
                sb.append("network_type=");
                sb.append(mVar.f20296g);
                stringBuffer.append(sb.toString());
            } else {
                stringBuffer.append("key=" + mVar.f20295f + "&");
                stringBuffer.append("event=" + C8613y.m24938c(mVar.f20315z) + "&");
                stringBuffer.append("template=" + C8613y.m24938c(mVar.f20313x) + "&");
                stringBuffer.append("layout=" + C8613y.m24938c(mVar.f20283A) + "&");
                stringBuffer.append("unit_id=" + C8613y.m24938c(mVar.f20310u) + "&");
                stringBuffer.append("cid=" + C8613y.m24938c(mVar.f20311v) + "&");
            }
            return stringBuffer.toString();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: f */
    public static String m24234f(List<C8412m> list) {
        if (list == null) {
            return null;
        }
        try {
            if (list.size() <= 0) {
                return null;
            }
            StringBuffer stringBuffer = new StringBuffer();
            for (C8412m mVar : list) {
                stringBuffer.append(mVar.f20284B);
                stringBuffer.append("\n");
            }
            return stringBuffer.toString();
        } catch (Throwable th) {
            C8608u.m24881a("VideoReportData", th.getMessage(), th);
            return null;
        }
    }

    /* renamed from: g */
    public static String m24235g(C8412m mVar) {
        if (mVar == null) {
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("key=" + mVar.f20295f + "&");
        stringBuffer.append("cid=" + mVar.f20311v + "&");
        stringBuffer.append("rid=" + mVar.f20308s + "&");
        stringBuffer.append("rid_n=" + mVar.f20309t + "&");
        stringBuffer.append("unit_id=" + mVar.f20310u + "&");
        stringBuffer.append("network_type=" + mVar.f20296g + "&");
        stringBuffer.append("mraid_type=" + mVar.f20290H + "&");
        stringBuffer.append("platform=1");
        return stringBuffer.toString();
    }

    /* renamed from: h */
    public static String m24236h(C8412m mVar) {
        if (mVar == null) {
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("key=" + mVar.f20295f + "&");
        stringBuffer.append("cid=" + mVar.f20311v + "&");
        stringBuffer.append("rid=" + mVar.f20308s + "&");
        stringBuffer.append("rid_n=" + mVar.f20309t + "&");
        stringBuffer.append("unit_id=" + mVar.f20310u + "&");
        stringBuffer.append("reason=" + mVar.f20302m + "&");
        stringBuffer.append("case=" + mVar.f20303n + "&");
        StringBuilder sb = new StringBuilder();
        sb.append("network_type=");
        sb.append(mVar.f20296g);
        stringBuffer.append(sb.toString());
        return stringBuffer.toString();
    }

    public final String toString() {
        return "RewardReportData [key=" + this.f20295f + ", networkType=" + this.f20296g + ", isCompleteView=" + this.f20298i + ", watchedMillis=" + this.f20299j + ", videoLength=" + this.f20300k + ", offerUrl=" + this.f20301l + ", reason=" + this.f20302m + ", result=" + this.f20304o + ", duration=" + this.f20305p + ", videoSize=" + this.f20306q + "]";
    }
}

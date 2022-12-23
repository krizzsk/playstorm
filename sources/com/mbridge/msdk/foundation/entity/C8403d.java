package com.mbridge.msdk.foundation.entity;

import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.controller.C2350a;
import com.mbridge.msdk.foundation.controller.authoritycontroller.C2357a;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.mbridge.msdk.foundation.entity.d */
/* compiled from: ClickTime */
public final class C8403d {

    /* renamed from: a */
    private String f20204a;

    /* renamed from: b */
    private String f20205b;

    /* renamed from: c */
    private String f20206c;

    /* renamed from: d */
    private String f20207d;

    /* renamed from: e */
    private String f20208e;

    /* renamed from: f */
    private int f20209f;

    /* renamed from: g */
    private String f20210g;

    /* renamed from: h */
    private String f20211h;

    /* renamed from: i */
    private String f20212i;

    /* renamed from: j */
    private int f20213j;

    /* renamed from: k */
    private int f20214k;

    /* renamed from: l */
    private String f20215l;

    /* renamed from: m */
    private int f20216m;

    /* renamed from: n */
    private int f20217n;

    /* renamed from: o */
    private String f20218o;

    /* renamed from: p */
    private int f20219p;

    /* renamed from: q */
    private String f20220q;

    /* renamed from: r */
    private int f20221r;

    public C8403d() {
    }

    public C8403d(String str, String str2, String str3, String str4, String str5, int i, String str6, String str7, String str8, int i2, int i3, String str9, int i4, int i5, String str10, int i6, int i7, String str11) {
        this.f20204a = str;
        this.f20205b = str2;
        this.f20206c = str3;
        this.f20207d = str4;
        this.f20208e = str5;
        this.f20209f = i;
        this.f20210g = str6;
        this.f20211h = str7;
        this.f20212i = str8;
        this.f20213j = i2;
        this.f20214k = i3;
        this.f20215l = str9;
        this.f20216m = i4;
        this.f20217n = i5;
        this.f20218o = str10;
        this.f20219p = i6;
        this.f20220q = str11;
        this.f20221r = i7;
    }

    /* renamed from: a */
    public final void mo57318a(int i) {
        this.f20219p = i;
    }

    /* renamed from: a */
    public final void mo57319a(String str) {
        this.f20220q = str;
    }

    /* renamed from: b */
    public final void mo57321b(String str) {
        this.f20215l = str;
    }

    /* renamed from: b */
    public final void mo57320b(int i) {
        this.f20216m = i;
    }

    /* renamed from: c */
    public final void mo57322c(int i) {
        this.f20217n = i;
    }

    /* renamed from: c */
    public final void mo57323c(String str) {
        this.f20218o = str;
    }

    /* renamed from: d */
    public final void mo57324d(int i) {
        this.f20214k = i;
    }

    /* renamed from: d */
    public final void mo57325d(String str) {
        this.f20210g = str;
    }

    /* renamed from: e */
    public final void mo57326e(int i) {
        this.f20209f = i;
    }

    /* renamed from: e */
    public final void mo57327e(String str) {
        this.f20211h = str;
    }

    /* renamed from: f */
    public final void mo57329f(String str) {
        this.f20212i = str;
    }

    /* renamed from: f */
    public final void mo57328f(int i) {
        this.f20213j = i;
    }

    /* renamed from: g */
    public final void mo57330g(String str) {
        this.f20208e = str;
    }

    /* renamed from: h */
    public final void mo57331h(String str) {
        this.f20206c = str;
    }

    /* renamed from: i */
    public final void mo57332i(String str) {
        this.f20207d = str;
    }

    /* renamed from: j */
    public final void mo57333j(String str) {
        this.f20204a = str;
    }

    /* renamed from: k */
    public final void mo57334k(String str) {
        this.f20205b = str;
    }

    /* renamed from: a */
    public static String m24103a(List<C8403d> list) {
        if (list == null || list.size() <= 0) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        Iterator<C8403d> it = list.iterator();
        while (it.hasNext()) {
            C8403d next = it.next();
            String str = next.f20215l;
            if (!TextUtils.isEmpty(str)) {
                String str2 = C2350a.f4905c.get(str);
                StringBuilder sb2 = new StringBuilder();
                sb2.append("u_stid=");
                if (str2 == null) {
                    str2 = "";
                }
                sb2.append(str2);
                sb2.append("&");
                sb.append(sb2.toString());
            }
            Iterator<C8403d> it2 = it;
            String str3 = "\n";
            String str4 = "&click_time=";
            String str5 = "&link_type=";
            String str6 = "&landing_type=";
            if (C2357a.m5633a().mo15819a(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
                sb.append("rid=" + next.f20204a);
                sb.append("&rid_n=" + next.f20205b);
                sb.append("&network_type=" + next.f20219p);
                sb.append("&network_str=" + next.f20220q);
                sb.append("&cid=" + next.f20206c);
                sb.append("&click_type=" + next.f20214k);
                sb.append("&type=" + next.f20213j);
                sb.append("&click_duration=" + next.f20207d);
                sb.append("&key=2000013");
                sb.append("&unit_id=" + next.f20215l);
                sb.append("&last_url=" + next.f20208e);
                sb.append("&content=" + next.f20212i);
                sb.append("&code=" + next.f20209f);
                sb.append("&exception=" + next.f20210g);
                sb.append("&header=" + next.f20211h);
                sb.append(str6 + next.f20216m);
                sb.append(str5 + next.f20217n);
                sb.append(str4 + next.f20218o + str3);
            } else {
                sb.append("rid=" + next.f20204a);
                sb.append("&rid_n=" + next.f20205b);
                sb.append("&cid=" + next.f20206c);
                sb.append("&click_type=" + next.f20214k);
                sb.append("&type=" + next.f20213j);
                sb.append("&click_duration=" + next.f20207d);
                sb.append("&key=2000013");
                sb.append("&unit_id=" + next.f20215l);
                sb.append("&last_url=" + next.f20208e);
                sb.append("&content=" + next.f20212i);
                sb.append("&code=" + next.f20209f);
                sb.append("&exception=" + next.f20210g);
                sb.append("&header=" + next.f20211h);
                sb.append(str6 + next.f20216m);
                sb.append(str5 + next.f20217n);
                sb.append(str4 + next.f20218o + str3);
            }
            it = it2;
        }
        return sb.toString();
    }

    /* renamed from: a */
    public static String m24102a(C8403d dVar) {
        C8403d dVar2 = dVar;
        if (dVar2 == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        String str = dVar2.f20208e;
        String str2 = "\n";
        String str3 = "&click_time=";
        String str4 = "&link_type=";
        if (C2357a.m5633a().mo15819a(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
            sb.append("rid=" + dVar2.f20204a);
            sb.append("&rid_n=" + dVar2.f20205b);
            sb.append("&network_type=" + dVar2.f20219p);
            sb.append("&network_str=" + dVar2.f20220q);
            sb.append("&click_type=" + dVar2.f20214k);
            sb.append("&type=" + dVar2.f20213j);
            sb.append("&cid=" + dVar2.f20206c);
            sb.append("&click_duration=" + dVar2.f20207d);
            sb.append("&key=2000012");
            sb.append("&unit_id=" + dVar2.f20215l);
            sb.append("&last_url=" + str);
            sb.append("&code=" + dVar2.f20209f);
            sb.append("&exception=" + dVar2.f20210g);
            sb.append("&landing_type=" + dVar2.f20216m);
            sb.append(str4 + dVar2.f20217n);
            sb.append(str3 + dVar2.f20218o + str2);
        } else {
            sb.append("rid=" + dVar2.f20204a);
            sb.append("&rid_n=" + dVar2.f20205b);
            sb.append("&click_type=" + dVar2.f20214k);
            sb.append("&type=" + dVar2.f20213j);
            sb.append("&cid=" + dVar2.f20206c);
            sb.append("&click_duration=" + dVar2.f20207d);
            sb.append("&key=2000012");
            sb.append("&unit_id=" + dVar2.f20215l);
            sb.append("&last_url=" + str);
            sb.append("&code=" + dVar2.f20209f);
            sb.append("&exception=" + dVar2.f20210g);
            sb.append("&landing_type=" + dVar2.f20216m);
            sb.append(str4 + dVar2.f20217n);
            sb.append(str3 + dVar2.f20218o + str2);
        }
        return sb.toString();
    }

    public final String toString() {
        return "ClickTime [campaignId=" + this.f20206c + ", click_duration=" + this.f20207d + ", lastUrl=" + this.f20208e + ", code=" + this.f20209f + ", excepiton=" + this.f20210g + ", header=" + this.f20211h + ", content=" + this.f20212i + ", type=" + this.f20213j + ", click_type=" + this.f20214k + "]";
    }
}

package com.mbridge.msdk.videocommon.p373d;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.controller.C2350a;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.RewardPlus;
import com.mbridge.msdk.foundation.p066db.C2376g;
import com.mbridge.msdk.videocommon.p371b.C9540b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.mbridge.msdk.videocommon.d.c */
/* compiled from: RewardUnitSetting */
public final class C9551c {

    /* renamed from: H */
    private static C2376g f23419H;

    /* renamed from: a */
    public static String f23420a;

    /* renamed from: A */
    private int f23421A = 70;

    /* renamed from: B */
    private int f23422B = 0;

    /* renamed from: C */
    private int f23423C = -1;

    /* renamed from: D */
    private int f23424D = -1;

    /* renamed from: E */
    private int f23425E = -1;

    /* renamed from: F */
    private int f23426F;

    /* renamed from: G */
    private int f23427G = 20;

    /* renamed from: I */
    private int f23428I;

    /* renamed from: J */
    private int f23429J = 0;

    /* renamed from: K */
    private int f23430K = 1;

    /* renamed from: L */
    private String f23431L = "";

    /* renamed from: M */
    private int f23432M = 1;

    /* renamed from: N */
    private String f23433N = "";

    /* renamed from: O */
    private int f23434O = 1;

    /* renamed from: P */
    private String f23435P = "Virtual Item";

    /* renamed from: Q */
    private String f23436Q = "";

    /* renamed from: R */
    private int f23437R = 0;

    /* renamed from: S */
    private int f23438S = 1;

    /* renamed from: T */
    private int f23439T = 60;

    /* renamed from: b */
    private String f23440b;

    /* renamed from: c */
    private String f23441c;

    /* renamed from: d */
    private List<C9540b> f23442d;

    /* renamed from: e */
    private long f23443e;

    /* renamed from: f */
    private int f23444f = -1;

    /* renamed from: g */
    private int f23445g = 0;

    /* renamed from: h */
    private int f23446h = 0;

    /* renamed from: i */
    private int f23447i = 1;

    /* renamed from: j */
    private int f23448j = 1;

    /* renamed from: k */
    private int f23449k = 1;

    /* renamed from: l */
    private int f23450l = 1;

    /* renamed from: m */
    private int f23451m = 5;

    /* renamed from: n */
    private int f23452n = 1;

    /* renamed from: o */
    private int f23453o = 3;

    /* renamed from: p */
    private int f23454p = 80;

    /* renamed from: q */
    private int f23455q = 100;

    /* renamed from: r */
    private int f23456r = 0;

    /* renamed from: s */
    private double f23457s = 1.0d;

    /* renamed from: t */
    private int f23458t = -1;

    /* renamed from: u */
    private ArrayList<Integer> f23459u;

    /* renamed from: v */
    private int f23460v = 3;

    /* renamed from: w */
    private int f23461w = 1;

    /* renamed from: x */
    private int f23462x = 10;

    /* renamed from: y */
    private int f23463y = 60;

    /* renamed from: z */
    private int f23464z = 0;

    /* renamed from: a */
    public final int mo63136a() {
        return this.f23462x;
    }

    /* renamed from: b */
    public final int mo63141b() {
        return this.f23463y;
    }

    /* renamed from: a */
    public final void mo63139a(ArrayList<Integer> arrayList) {
        this.f23459u = arrayList;
    }

    /* renamed from: c */
    public final int mo63144c() {
        return this.f23464z;
    }

    /* renamed from: a */
    public final void mo63137a(int i) {
        this.f23464z = i;
    }

    /* renamed from: d */
    public final int mo63146d() {
        return this.f23422B;
    }

    /* renamed from: b */
    public final void mo63142b(int i) {
        this.f23422B = i;
    }

    /* renamed from: e */
    public final int mo63148e() {
        return this.f23423C;
    }

    /* renamed from: c */
    public final void mo63145c(int i) {
        this.f23423C = i;
    }

    /* renamed from: f */
    public final int mo63150f() {
        return this.f23424D;
    }

    /* renamed from: d */
    public final void mo63147d(int i) {
        this.f23424D = i;
    }

    /* renamed from: g */
    public final int mo63152g() {
        return this.f23425E;
    }

    /* renamed from: e */
    public final void mo63149e(int i) {
        this.f23425E = i;
    }

    /* renamed from: h */
    public final int mo63154h() {
        return this.f23444f;
    }

    /* renamed from: i */
    public final int mo63156i() {
        return this.f23446h;
    }

    /* renamed from: j */
    public final String mo63158j() {
        return this.f23436Q;
    }

    /* renamed from: d */
    private void m27317d(String str) {
        this.f23436Q = str;
        C2350a.f4905c.put(this.f23440b, str);
    }

    /* renamed from: k */
    public final int mo63160k() {
        return this.f23432M;
    }

    /* renamed from: y */
    private void m27319y(int i) {
        if (i <= 0) {
            this.f23432M = 1;
        } else {
            this.f23432M = i;
        }
    }

    /* renamed from: l */
    public final String mo63162l() {
        return this.f23435P;
    }

    /* renamed from: e */
    private void m27318e(String str) {
        if (TextUtils.isEmpty(str)) {
            this.f23435P = this.f23431L;
        } else {
            this.f23435P = str;
        }
    }

    /* renamed from: m */
    public final int mo63164m() {
        return this.f23427G;
    }

    /* renamed from: n */
    public final int mo63166n() {
        return this.f23426F;
    }

    /* renamed from: f */
    public final void mo63151f(int i) {
        this.f23426F = i;
    }

    /* renamed from: o */
    public final int mo63168o() {
        return this.f23428I;
    }

    /* renamed from: g */
    public final void mo63153g(int i) {
        this.f23428I = i;
    }

    /* renamed from: h */
    public final void mo63155h(int i) {
        this.f23453o = i;
    }

    /* renamed from: i */
    public final void mo63157i(int i) {
        this.f23454p = i;
    }

    /* renamed from: p */
    public final int mo63170p() {
        return this.f23455q;
    }

    /* renamed from: j */
    public final void mo63159j(int i) {
        this.f23455q = i;
    }

    /* renamed from: q */
    public final int mo63172q() {
        return this.f23456r;
    }

    /* renamed from: k */
    public final void mo63161k(int i) {
        this.f23456r = i;
    }

    /* renamed from: r */
    public final int mo63174r() {
        return this.f23448j;
    }

    /* renamed from: l */
    public final void mo63163l(int i) {
        this.f23448j = i;
    }

    /* renamed from: s */
    public final int mo63176s() {
        return this.f23449k;
    }

    /* renamed from: m */
    public final void mo63165m(int i) {
        this.f23449k = i;
    }

    /* renamed from: n */
    public final void mo63167n(int i) {
        this.f23450l = i;
    }

    /* renamed from: t */
    public final int mo63178t() {
        return this.f23451m;
    }

    /* renamed from: o */
    public final void mo63169o(int i) {
        this.f23451m = i;
    }

    /* renamed from: u */
    public final int mo63180u() {
        return this.f23452n;
    }

    /* renamed from: p */
    public final void mo63171p(int i) {
        this.f23452n = i;
    }

    /* renamed from: q */
    public final void mo63173q(int i) {
        this.f23447i = i;
    }

    /* renamed from: v */
    public final long mo63182v() {
        return this.f23443e;
    }

    /* renamed from: a */
    public final void mo63138a(String str) {
        this.f23440b = str;
    }

    /* renamed from: w */
    public final List<C9540b> mo63184w() {
        return this.f23442d;
    }

    /* renamed from: a */
    public final void mo63140a(List<C9540b> list) {
        this.f23442d = list;
    }

    /* renamed from: x */
    public final int mo63186x() {
        return this.f23461w;
    }

    /* renamed from: r */
    public final void mo63175r(int i) {
        this.f23461w = i;
    }

    /* renamed from: s */
    public final boolean mo63177s(int i) {
        ArrayList<Integer> arrayList = this.f23459u;
        if (arrayList == null || arrayList.size() <= 0) {
            return false;
        }
        return this.f23459u.contains(Integer.valueOf(i));
    }

    /* renamed from: y */
    public final String mo63188y() {
        return this.f23441c;
    }

    /* renamed from: b */
    public final void mo63143b(String str) {
        this.f23441c = str;
    }

    /* renamed from: z */
    public final int mo63189z() {
        return this.f23460v;
    }

    /* renamed from: t */
    public final void mo63179t(int i) {
        this.f23460v = i;
    }

    /* renamed from: A */
    public final Queue<Integer> mo63131A() {
        LinkedList linkedList;
        Exception e;
        try {
            if (this.f23442d == null || this.f23442d.size() <= 0) {
                return null;
            }
            linkedList = new LinkedList();
            int i = 0;
            while (i < this.f23442d.size()) {
                try {
                    linkedList.add(Integer.valueOf(this.f23442d.get(i).mo63096b()));
                    i++;
                } catch (Exception e2) {
                    e = e2;
                    e.printStackTrace();
                    return linkedList;
                }
            }
            return linkedList;
        } catch (Exception e3) {
            Exception exc = e3;
            linkedList = null;
            e = exc;
            e.printStackTrace();
            return linkedList;
        }
    }

    /* renamed from: u */
    public final void mo63181u(int i) {
        this.f23437R = i;
    }

    /* renamed from: B */
    public final int mo63132B() {
        return this.f23438S;
    }

    /* renamed from: v */
    public final void mo63183v(int i) {
        this.f23438S = i;
    }

    /* renamed from: C */
    public final int mo63133C() {
        return this.f23439T;
    }

    /* renamed from: w */
    public final void mo63185w(int i) {
        this.f23439T = i;
    }

    /* renamed from: c */
    public static C9551c m27316c(String str) {
        JSONObject optJSONObject;
        if (f23419H == null) {
            f23419H = C2376g.m5723a(C2350a.m5601e().mo15792g());
        }
        C9551c cVar = null;
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                JSONArray optJSONArray = jSONObject.optJSONArray("unitSetting");
                if (optJSONArray == null || (optJSONObject = optJSONArray.optJSONObject(0)) == null) {
                    return null;
                }
                String optString = optJSONObject.optString("unitId");
                if (TextUtils.isEmpty(optString)) {
                    return null;
                }
                C9551c cVar2 = new C9551c();
                try {
                    List<C9540b> a = C9540b.m27259a(optJSONObject.optJSONArray("adSourceList"));
                    cVar2.f23440b = optString;
                    cVar2.f23442d = a;
                    cVar2.f23447i = optJSONObject.optInt("callbackType");
                    int optInt = optJSONObject.optInt("aqn", 1);
                    if (optInt <= 0) {
                        optInt = 1;
                    }
                    cVar2.f23448j = optInt;
                    int optInt2 = optJSONObject.optInt("acn", 1);
                    if (optInt2 < 0) {
                        optInt2 = 1;
                    }
                    cVar2.f23449k = optInt2;
                    cVar2.f23450l = optJSONObject.optInt("vcn", 5);
                    cVar2.f23451m = optJSONObject.optInt("offset", 5);
                    cVar2.f23452n = optJSONObject.optInt("dlnet", 1);
                    cVar2.f23428I = optJSONObject.optInt("endscreen_type", 2);
                    int i = 3;
                    cVar2.f23453o = optJSONObject.optInt("tv_start", 3);
                    cVar2.f23454p = optJSONObject.optInt("tv_end", 80);
                    cVar2.f23455q = optJSONObject.optInt(CampaignEx.JSON_KEY_READY_RATE, 100);
                    cVar2.f23456r = optJSONObject.optInt("cd_rate", 0);
                    cVar2.f23443e = jSONObject.optLong("current_time");
                    cVar2.f23464z = optJSONObject.optInt("orientation", 0);
                    cVar2.f23422B = optJSONObject.optInt("daily_play_cap", 0);
                    cVar2.f23423C = optJSONObject.optInt("video_skip_time", -1);
                    cVar2.f23424D = optJSONObject.optInt("video_skip_result", 2);
                    cVar2.f23425E = optJSONObject.optInt("video_interactive_type", -1);
                    cVar2.f23426F = optJSONObject.optInt("close_button_delay", 1);
                    cVar2.f23444f = optJSONObject.optInt("playclosebtn_tm", -1);
                    cVar2.f23445g = optJSONObject.optInt("play_ctdown", 0);
                    cVar2.f23446h = optJSONObject.optInt("close_alert", 0);
                    cVar2.f23427G = optJSONObject.optInt("rdrct", 20);
                    cVar2.f23421A = optJSONObject.optInt("load_global_timeout", 70);
                    cVar2.f23458t = optJSONObject.optInt("rfpv", -1);
                    cVar2.f23457s = optJSONObject.optDouble("vdcmp", 1.0d);
                    f23420a = optJSONObject.optString("atzu");
                    JSONArray optJSONArray2 = optJSONObject.optJSONArray("atl_type");
                    ArrayList<Integer> arrayList = new ArrayList<>();
                    if (optJSONArray2 != null) {
                        int i2 = 0;
                        while (i2 < optJSONArray2.length()) {
                            try {
                                arrayList.add(Integer.valueOf(optJSONArray2.getInt(i2)));
                                i2++;
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }
                    } else {
                        arrayList.add(4);
                        arrayList.add(6);
                    }
                    cVar2.f23459u = arrayList;
                    int optInt3 = optJSONObject.optInt("atl_dyt", 0);
                    if (optInt3 > 0) {
                        i = optInt3;
                    }
                    cVar2.f23460v = i;
                    int optInt4 = optJSONObject.optInt("tmorl", 1);
                    if (optInt4 > 2 || optInt4 <= 0) {
                        optInt4 = 1;
                    }
                    cVar2.f23461w = optInt4;
                    cVar2.f23441c = optJSONObject.optString("placementid");
                    cVar2.f23462x = optJSONObject.optInt("ltafemty", 10);
                    cVar2.f23463y = optJSONObject.optInt("ltorwc", 60);
                    cVar2.m27317d(optJSONObject.optString("ab_id"));
                    cVar2.f23429J = optJSONObject.optInt(RewardPlus.AMOUNT_MAX, 0);
                    cVar2.f23430K = optJSONObject.optInt(RewardPlus.CALLBACK_RULE, 1);
                    cVar2.f23431L = optJSONObject.optString(RewardPlus.VIRTUAL_CURRENCY, "");
                    cVar2.m27319y(optJSONObject.optInt("amount", 1));
                    cVar2.f23433N = optJSONObject.optString(RewardPlus.ICON, "");
                    cVar2.f23434O = optJSONObject.optInt("currency_id", 1);
                    cVar2.m27318e(optJSONObject.optString("name", "Virtual Item"));
                    cVar2.f23438S = optJSONObject.optInt("video_error_rule", 1);
                    cVar2.f23439T = optJSONObject.optInt("loadtmo", 60);
                    return cVar2;
                } catch (Exception e2) {
                    e = e2;
                    cVar = cVar2;
                    e.printStackTrace();
                    return cVar;
                }
            } catch (Exception e3) {
                e = e3;
                e.printStackTrace();
                return cVar;
            }
        }
        return cVar;
    }

    /* renamed from: D */
    public final JSONObject mo63134D() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("unitId", this.f23440b);
            jSONObject.put("callbackType", this.f23447i);
            if (this.f23442d != null && this.f23442d.size() > 0) {
                JSONArray jSONArray = new JSONArray();
                for (C9540b next : this.f23442d) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("id", next.mo63095a());
                    jSONObject2.put("timeout", next.mo63096b());
                    jSONArray.put(jSONObject2);
                }
                jSONObject.put("adSourceList", jSONArray);
            }
            jSONObject.put("aqn", this.f23448j);
            jSONObject.put("acn", this.f23449k);
            jSONObject.put("vcn", this.f23450l);
            jSONObject.put("offset", this.f23451m);
            jSONObject.put("dlnet", this.f23452n);
            jSONObject.put("tv_start", this.f23453o);
            jSONObject.put("tv_end", this.f23454p);
            jSONObject.put(CampaignEx.JSON_KEY_READY_RATE, this.f23455q);
            jSONObject.put("endscreen_type", this.f23428I);
            jSONObject.put("daily_play_cap", this.f23422B);
            jSONObject.put("video_skip_time", this.f23423C);
            jSONObject.put("video_skip_result", this.f23424D);
            jSONObject.put("video_interactive_type", this.f23425E);
            jSONObject.put("orientation", this.f23464z);
            jSONObject.put("close_button_delay", this.f23426F);
            jSONObject.put("playclosebtn_tm", this.f23444f);
            jSONObject.put("play_ctdown", this.f23445g);
            jSONObject.put("close_alert", this.f23446h);
            jSONObject.put("rfpv", this.f23458t);
            jSONObject.put("vdcmp", this.f23457s);
            JSONArray jSONArray2 = new JSONArray();
            if (this.f23459u != null) {
                if (this.f23459u.size() > 0) {
                    Iterator<Integer> it = this.f23459u.iterator();
                    while (it.hasNext()) {
                        jSONArray2.put(it.next());
                    }
                }
                jSONObject.put("atl_type", jSONArray2);
            }
            jSONObject.put("atl_dyt", this.f23460v);
            jSONObject.put("tmorl", this.f23461w);
            jSONObject.put("placementid", this.f23441c);
            jSONObject.put("ltafemty", this.f23462x);
            jSONObject.put("ltorwc", this.f23463y);
            jSONObject.put(RewardPlus.AMOUNT_MAX, this.f23429J);
            jSONObject.put(RewardPlus.CALLBACK_RULE, this.f23430K);
            jSONObject.put(RewardPlus.VIRTUAL_CURRENCY, this.f23431L);
            jSONObject.put("amount", this.f23432M);
            jSONObject.put(RewardPlus.ICON, this.f23433N);
            jSONObject.put("currency_id", this.f23434O);
            jSONObject.put("name", this.f23435P);
            jSONObject.put("isDefault", this.f23437R);
            jSONObject.put("video_error_rule", this.f23438S);
            jSONObject.put("loadtmo", this.f23439T);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return jSONObject;
    }

    /* renamed from: a */
    public static C9551c m27315a(JSONObject jSONObject) {
        C9551c cVar = null;
        if (jSONObject == null) {
            return null;
        }
        try {
            C9551c cVar2 = new C9551c();
            try {
                cVar2.f23442d = C9540b.m27259a(jSONObject.optJSONArray("adSourceList"));
                cVar2.f23447i = jSONObject.optInt("callbackType");
                int optInt = jSONObject.optInt("aqn", 1);
                if (optInt <= 0) {
                    optInt = 1;
                }
                cVar2.f23448j = optInt;
                int optInt2 = jSONObject.optInt("acn", 1);
                if (optInt2 < 0) {
                    optInt2 = 1;
                }
                cVar2.f23449k = optInt2;
                cVar2.f23450l = jSONObject.optInt("vcn", 5);
                cVar2.f23451m = jSONObject.optInt("offset", 5);
                cVar2.f23452n = jSONObject.optInt("dlnet", 2);
                cVar2.f23428I = jSONObject.optInt("endscreen_type", 2);
                cVar2.f23453o = jSONObject.optInt("tv_start", 3);
                cVar2.f23454p = jSONObject.optInt("tv_end", 80);
                cVar2.f23455q = jSONObject.optInt(CampaignEx.JSON_KEY_READY_RATE, 100);
                cVar2.f23443e = jSONObject.optLong("current_time");
                cVar2.f23464z = jSONObject.optInt("orientation", 0);
                cVar2.f23422B = jSONObject.optInt("daily_play_cap", 0);
                cVar2.f23423C = jSONObject.optInt("video_skip_time", -1);
                cVar2.f23424D = jSONObject.optInt("video_skip_result", 2);
                cVar2.f23425E = jSONObject.optInt("video_interactive_type", -1);
                cVar2.f23426F = jSONObject.optInt("close_button_delay", 1);
                cVar2.f23444f = jSONObject.optInt("playclosebtn_tm", -1);
                cVar2.f23445g = jSONObject.optInt("play_ctdown", 0);
                cVar2.f23446h = jSONObject.optInt("close_alert", 0);
                cVar2.f23427G = jSONObject.optInt("rdrct", 20);
                cVar2.f23458t = jSONObject.optInt("rfpv", -1);
                cVar2.f23457s = jSONObject.optDouble("vdcmp", 1.0d);
                cVar2.f23421A = jSONObject.optInt("load_global_timeout", 70);
                JSONArray optJSONArray = jSONObject.optJSONArray("atl_type");
                ArrayList<Integer> arrayList = new ArrayList<>();
                if (optJSONArray != null) {
                    int i = 0;
                    while (i < optJSONArray.length()) {
                        try {
                            arrayList.add(Integer.valueOf(optJSONArray.getInt(i)));
                            i++;
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                } else {
                    arrayList.add(4);
                    arrayList.add(6);
                }
                cVar2.f23459u = arrayList;
                cVar2.f23460v = jSONObject.optInt("atl_dyt", 3);
                int optInt3 = jSONObject.optInt("tmorl", 1);
                if (optInt3 > 2 || optInt3 <= 0) {
                    optInt3 = 1;
                }
                cVar2.f23461w = optInt3;
                cVar2.f23441c = jSONObject.optString("placementid");
                cVar2.f23462x = jSONObject.optInt("ltafemty", 10);
                cVar2.f23463y = jSONObject.optInt("ltorwc", 60);
                cVar2.m27317d(jSONObject.optString("ab_id"));
                cVar2.f23429J = jSONObject.optInt(RewardPlus.AMOUNT_MAX, 0);
                cVar2.f23430K = jSONObject.optInt(RewardPlus.CALLBACK_RULE, 1);
                cVar2.f23431L = jSONObject.optString(RewardPlus.VIRTUAL_CURRENCY, "");
                cVar2.m27319y(jSONObject.optInt("amount", 1));
                cVar2.f23433N = jSONObject.optString(RewardPlus.ICON, "");
                cVar2.f23434O = jSONObject.optInt("currency_id", 1);
                cVar2.m27318e(jSONObject.optString("name", "Virtual Item"));
                cVar2.f23438S = jSONObject.optInt("video_error_rule", 1);
                cVar2.f23439T = jSONObject.optInt("loadtmo", 60);
                return cVar2;
            } catch (Exception e2) {
                e = e2;
                cVar = cVar2;
                e.printStackTrace();
                return cVar;
            }
        } catch (Exception e3) {
            e = e3;
            e.printStackTrace();
            return cVar;
        }
    }

    /* renamed from: E */
    public final int mo63135E() {
        return this.f23421A;
    }

    /* renamed from: x */
    public final void mo63187x(int i) {
        this.f23421A = i;
    }
}

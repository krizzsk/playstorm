package com.mbridge.msdk.foundation.controller.authoritycontroller;

import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.controller.C2350a;
import com.mbridge.msdk.foundation.p062a.p063a.C2338a;
import com.mbridge.msdk.foundation.tools.C8608u;
import com.mbridge.msdk.p054c.C2278a;
import com.mbridge.msdk.p054c.C2283b;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.mbridge.msdk.foundation.controller.authoritycontroller.a */
/* compiled from: SDKAuthorityController */
public class C2357a {

    /* renamed from: b */
    private static volatile C2357a f4929b;

    /* renamed from: a */
    public ArrayList<String> f4930a = new ArrayList<>();

    /* renamed from: c */
    private AuthorityInfoBean f4931c = new AuthorityInfoBean();

    /* renamed from: d */
    private int f4932d = 3;

    private C2357a() {
        try {
            if (C2338a.m5535a().mo15735b(MBridgeConstans.AUTHORITY_GENERAL_DATA).equals("")) {
                this.f4931c.mo15807b(1);
            }
            if (C2338a.m5535a().mo15735b(MBridgeConstans.AUTHORITY_DEVICE_ID).equals("")) {
                this.f4931c.mo15808c(1);
            }
            if (C2338a.m5535a().mo15735b(MBridgeConstans.AUTHORITY_SERIAL_ID).equals("")) {
                this.f4931c.mo15809d(1);
            }
            if (C2338a.m5535a().mo15735b(MBridgeConstans.AUTHORITY_OTHER).equals("")) {
                this.f4931c.mo15810e(1);
            }
            this.f4930a.add(MBridgeConstans.AUTHORITY_GENERAL_DATA);
            this.f4930a.add(MBridgeConstans.AUTHORITY_DEVICE_ID);
            this.f4930a.add(MBridgeConstans.AUTHORITY_SERIAL_ID);
            this.f4930a.add(MBridgeConstans.AUTHORITY_OTHER);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public static C2357a m5633a() {
        if (f4929b == null) {
            synchronized (C2357a.class) {
                if (f4929b == null) {
                    f4929b = new C2357a();
                }
            }
        }
        return f4929b;
    }

    /* renamed from: a */
    public final void mo15818a(String str, int i) {
        if (this.f4931c == null) {
            return;
        }
        if (str.equals(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
            this.f4931c.mo15807b(i);
        } else if (str.equals(MBridgeConstans.AUTHORITY_DEVICE_ID)) {
            this.f4931c.mo15808c(i);
        } else if (str.equals(MBridgeConstans.AUTHORITY_ALL_INFO)) {
            this.f4931c.mo15806a(i);
        } else if (str.equals(MBridgeConstans.AUTHORITY_SERIAL_ID)) {
            this.f4931c.mo15809d(i);
        } else if (str.equals(MBridgeConstans.AUTHORITY_OTHER)) {
            this.f4931c.mo15810e(i);
        }
    }

    /* renamed from: b */
    public final AuthorityInfoBean mo15820b() {
        AuthorityInfoBean authorityInfoBean = this.f4931c;
        if (authorityInfoBean != null) {
            return authorityInfoBean;
        }
        return new AuthorityInfoBean().mo15806a(1);
    }

    /* renamed from: b */
    private int m5634b(String str) {
        try {
            if (!TextUtils.isEmpty(str)) {
                String b = C2338a.m5535a().mo15735b(str);
                if (TextUtils.isEmpty(b)) {
                    return 0;
                }
                return Integer.parseInt(b);
            }
        } catch (Exception e) {
            C8608u.m24884d("SDKAuthorityController", e.getMessage());
        }
        return 0;
    }

    /* renamed from: c */
    private int m5635c(String str) {
        C2278a b = C2283b.m5275a().mo15563b(C2350a.m5601e().mo15793h());
        if (b == null) {
            b = C2283b.m5275a().mo15562b();
        }
        if (str.equals(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
            return b.mo15427A();
        }
        if (str.equals(MBridgeConstans.AUTHORITY_DEVICE_ID)) {
            return b.mo15428B();
        }
        if (str.equals(MBridgeConstans.AUTHORITY_SERIAL_ID)) {
            return b.mo15547z();
        }
        return -1;
    }

    /* renamed from: a */
    public final boolean mo15819a(String str) {
        boolean z;
        boolean z2;
        C2278a b = C2283b.m5275a().mo15563b(C2350a.m5601e().mo15793h());
        boolean z3 = false;
        if (b == null) {
            b = C2283b.m5275a().mo15562b();
            z = true;
        } else {
            z = false;
        }
        int C = b.mo15429C();
        if (C != 0 ? !(C == 1 && m5635c(str) == 1) : !(m5634b(str) == 1 && m5635c(str) == 1)) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (str.equals(MBridgeConstans.AUTHORITY_OTHER)) {
            z2 = m5634b(str) == 1;
        }
        if (!str.equals(MBridgeConstans.AUTHORITY_DEVICE_ID) || m5633a().f4932d != 2) {
            return z2;
        }
        if (!b.mo15482au() && !z && m5634b(str) == 1) {
            z3 = true;
        }
        return z3;
    }

    /* renamed from: c */
    public final String mo15822c() {
        JSONArray jSONArray = new JSONArray();
        for (int i = 0; i < this.f4930a.size(); i++) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("keyname", String.valueOf(this.f4930a.get(i)));
                jSONObject.put("client_status", m5634b(this.f4930a.get(i)));
                jSONObject.put("server_status", m5635c(this.f4930a.get(i)));
                jSONArray.put(jSONObject);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return jSONArray.toString();
    }

    /* renamed from: a */
    public final void mo15817a(int i) {
        if (this.f4931c != null) {
            int i2 = 1;
            if (i != 1) {
                i2 = 2;
            }
            this.f4932d = i2;
        }
    }

    /* renamed from: d */
    public final boolean mo15823d() {
        int i = this.f4932d;
        return i == 1 || i == 3;
    }

    /* renamed from: b */
    public final void mo15821b(int i) {
        C2338a.m5535a().mo15731a(MBridgeConstans.AUTHORITY_DNT, i);
    }

    /* renamed from: e */
    public final int mo15824e() {
        return this.f4932d;
    }
}

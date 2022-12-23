package com.mbridge.msdk.interstitial.p317b;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.controller.C2350a;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.p066db.C2372e;
import com.mbridge.msdk.foundation.p066db.C2374f;
import com.mbridge.msdk.foundation.p066db.C2376g;
import com.mbridge.msdk.foundation.tools.C8608u;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.mbridge.msdk.interstitial.b.a */
/* compiled from: InterstitialCamapignCache */
public class C8633a {

    /* renamed from: a */
    private static final String f20889a = C8633a.class.getName();

    /* renamed from: c */
    private static C8633a f20890c = null;

    /* renamed from: b */
    private C2372e f20891b;

    private C8633a() {
        try {
            Context g = C2350a.m5601e().mo15792g();
            if (g != null) {
                this.f20891b = C2372e.m5679a((C2374f) C2376g.m5723a(g));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public static synchronized C8633a m25004a() {
        C8633a aVar;
        synchronized (C8633a.class) {
            if (f20890c == null) {
                f20890c = new C8633a();
            }
            aVar = f20890c;
        }
        return aVar;
    }

    /* renamed from: a */
    public final List<CampaignEx> mo57835a(String str, int i) {
        List<CampaignEx> a;
        ArrayList arrayList = null;
        try {
            if (TextUtils.isEmpty(str) || (a = this.f20891b.mo15859a(str, i, 0, 1)) == null) {
                return null;
            }
            ArrayList arrayList2 = new ArrayList();
            try {
                for (CampaignEx add : a) {
                    arrayList2.add(add);
                }
                return arrayList2;
            } catch (Exception e) {
                e = e;
                arrayList = arrayList2;
                e.printStackTrace();
                return arrayList;
            }
        } catch (Exception e2) {
            e = e2;
            e.printStackTrace();
            return arrayList;
        }
    }

    /* renamed from: a */
    public final void mo57837a(CampaignEx campaignEx, String str) {
        if (campaignEx != null) {
            try {
                if (!TextUtils.isEmpty(str)) {
                    this.f20891b.mo15868a(campaignEx.getId(), str);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    public final void mo57838a(List<CampaignEx> list, String str) {
        if (list != null && list.size() > 0 && !TextUtils.isEmpty(str)) {
            for (CampaignEx a : list) {
                mo57837a(a, str);
            }
        }
    }

    /* renamed from: b */
    public final void mo57839b(CampaignEx campaignEx, String str) {
        try {
            if (this.f20891b != null && campaignEx != null && !TextUtils.isEmpty(str)) {
                this.f20891b.mo15858a(campaignEx, str, 0);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public final synchronized void mo57836a(long j, String str) {
        try {
            if (!(this.f20891b == null || j == 0 || TextUtils.isEmpty(str))) {
                this.f20891b.mo15881b(j, str);
            }
        } catch (Exception e) {
            e.printStackTrace();
            C8608u.m24884d(f20889a, e.getMessage());
        }
        return;
    }
}

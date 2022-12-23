package com.mbridge.msdk.mbnative.p331a;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.controller.C2350a;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.p066db.C2372e;
import com.mbridge.msdk.foundation.p066db.C2374f;
import com.mbridge.msdk.foundation.p066db.C2376g;
import com.mbridge.msdk.foundation.same.p304f.C8442b;
import com.mbridge.msdk.out.Campaign;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.mbridge.msdk.mbnative.a.a */
/* compiled from: APICache */
public final class C8733a extends C8735b<String, List<Campaign>> {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public C2372e f21174a = C2372e.m5679a((C2374f) C2376g.m5723a(C2350a.m5601e().mo15792g()));

    /* renamed from: b */
    private int f21175b;

    /* renamed from: a */
    public final /* synthetic */ Object mo58103a(Object obj, int i) {
        String str = (String) obj;
        List<CampaignEx> a = this.f21174a.mo15859a(str, i, 2, this.f21175b);
        if (a == null) {
            return null;
        }
        if (m25341a(a, 2)) {
            this.f21174a.mo15865a(str, 2, this.f21175b);
            return null;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(a);
        return arrayList;
    }

    /* renamed from: a */
    public final /* synthetic */ void mo58104a(Object obj, Object obj2) {
        String str = (String) obj;
        List list = (List) obj2;
        if (!TextUtils.isEmpty(str) && list != null && list.size() > 0) {
            this.f21174a.mo15866a(str, 1, this.f21175b, false);
            this.f21174a.mo15866a(str, 2, this.f21175b, false);
            for (int i = 0; i < list.size(); i++) {
                CampaignEx campaignEx = (CampaignEx) list.get(i);
                campaignEx.setCacheLevel(1);
                this.f21174a.mo15858a(campaignEx, str, 1);
            }
        }
    }

    /* renamed from: a */
    public final /* synthetic */ void mo58105a(Object obj, Object obj2, String str) {
        final String str2 = (String) obj;
        final List list = (List) obj2;
        boolean z = !TextUtils.isEmpty(str);
        if (!TextUtils.isEmpty(str2) && list != null && list.size() > 0) {
            this.f21174a.mo15866a(str2, 1, this.f21175b, z);
            this.f21174a.mo15866a(str2, 2, this.f21175b, z);
            C8442b.m24388a().execute(new Runnable() {
                public final void run() {
                    for (int i = 0; i < list.size(); i++) {
                        CampaignEx campaignEx = (CampaignEx) list.get(i);
                        campaignEx.setCacheLevel(1);
                        C8733a.this.f21174a.mo15858a(campaignEx, str2, 1);
                    }
                }
            });
        }
    }

    /* renamed from: b */
    public final /* synthetic */ Object mo58107b(Object obj, int i) {
        String str = (String) obj;
        List<CampaignEx> a = this.f21174a.mo15859a(str, i, 1, this.f21175b);
        if (a == null) {
            return null;
        }
        if (m25341a(a, 1)) {
            for (int i2 = 0; i2 < a.size(); i2++) {
                CampaignEx campaignEx = a.get(i2);
                campaignEx.setCacheLevel(2);
                this.f21174a.mo15858a(campaignEx, str, 1);
            }
            return null;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(a);
        return arrayList;
    }

    public C8733a(int i) {
        this.f21175b = i;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0065 A[RETURN] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m25341a(java.util.List<com.mbridge.msdk.foundation.entity.CampaignEx> r11, int r12) {
        /*
            r10 = this;
            r0 = 0
            if (r11 == 0) goto L_0x0066
            int r1 = r11.size()
            if (r1 <= 0) goto L_0x0066
            long r1 = java.lang.System.currentTimeMillis()
            java.lang.Object r11 = r11.get(r0)
            com.mbridge.msdk.foundation.entity.CampaignEx r11 = (com.mbridge.msdk.foundation.entity.CampaignEx) r11
            long r3 = r11.getTimestamp()
            r5 = 0
            r7 = 1000(0x3e8, double:4.94E-321)
            r11 = 1
            if (r12 == r11) goto L_0x0041
            r9 = 2
            if (r12 == r9) goto L_0x0022
            goto L_0x0060
        L_0x0022:
            com.mbridge.msdk.c.b r12 = com.mbridge.msdk.p054c.C2283b.m5275a()
            com.mbridge.msdk.foundation.controller.a r5 = com.mbridge.msdk.foundation.controller.C2350a.m5601e()
            java.lang.String r5 = r5.mo15793h()
            com.mbridge.msdk.c.a r12 = r12.mo15563b(r5)
            if (r12 != 0) goto L_0x003c
            com.mbridge.msdk.c.b r12 = com.mbridge.msdk.p054c.C2283b.m5275a()
            com.mbridge.msdk.c.a r12 = r12.mo15562b()
        L_0x003c:
            long r5 = r12.mo15436J()
            goto L_0x005f
        L_0x0041:
            com.mbridge.msdk.c.b r12 = com.mbridge.msdk.p054c.C2283b.m5275a()
            com.mbridge.msdk.foundation.controller.a r5 = com.mbridge.msdk.foundation.controller.C2350a.m5601e()
            java.lang.String r5 = r5.mo15793h()
            com.mbridge.msdk.c.a r12 = r12.mo15563b(r5)
            if (r12 != 0) goto L_0x005b
            com.mbridge.msdk.c.b r12 = com.mbridge.msdk.p054c.C2283b.m5275a()
            com.mbridge.msdk.c.a r12 = r12.mo15562b()
        L_0x005b:
            long r5 = r12.mo15442P()
        L_0x005f:
            long r5 = r5 * r7
        L_0x0060:
            long r1 = r1 - r3
            int r12 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r12 <= 0) goto L_0x0066
            return r11
        L_0x0066:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.mbnative.p331a.C8733a.m25341a(java.util.List, int):boolean");
    }

    /* renamed from: a */
    public final void mo58106a(String str, Campaign campaign, String str2) {
        boolean z = !TextUtils.isEmpty(str2);
        if (campaign != null && !TextUtils.isEmpty(str)) {
            try {
                CampaignEx campaignEx = (CampaignEx) campaign;
                if (this.f21174a.mo15877a(campaignEx.getId(), campaignEx.getTab(), str, campaignEx.getCacheLevel(), campaignEx.getType(), z)) {
                    this.f21174a.mo15869a(campaignEx.getId(), str, campaignEx.getCacheLevel(), this.f21175b, z);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

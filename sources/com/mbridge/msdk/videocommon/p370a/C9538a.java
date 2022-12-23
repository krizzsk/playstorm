package com.mbridge.msdk.videocommon.p370a;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.controller.C2350a;
import com.mbridge.msdk.foundation.entity.C8401b;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.p066db.C2372e;
import com.mbridge.msdk.foundation.p066db.C2374f;
import com.mbridge.msdk.foundation.p066db.C2376g;
import com.mbridge.msdk.foundation.same.p299a.C8417d;
import com.mbridge.msdk.foundation.tools.C8608u;
import com.mbridge.msdk.p054c.C2278a;
import com.mbridge.msdk.p054c.C2283b;
import com.mbridge.msdk.videocommon.C9536a;
import com.mbridge.msdk.videocommon.p373d.C9548a;
import com.mbridge.msdk.videocommon.p373d.C9549b;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.mbridge.msdk.videocommon.a.a */
/* compiled from: VideoCampaignCache */
public class C9538a {

    /* renamed from: a */
    private static final String f23381a = C9538a.class.getName();

    /* renamed from: b */
    private static C9538a f23382b = null;

    /* renamed from: c */
    private C2372e f23383c;

    private C9538a() {
        try {
            Context g = C2350a.m5601e().mo15792g();
            if (g != null) {
                this.f23383c = C2372e.m5679a((C2374f) C2376g.m5723a(g));
            } else {
                C8608u.m24884d(f23381a, "RewardCampaignCache get Context is null");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public static synchronized C9538a m27238a() {
        C9538a aVar;
        synchronized (C9538a.class) {
            if (f23382b == null) {
                f23382b = new C9538a();
            }
            aVar = f23382b;
        }
        return aVar;
    }

    /* renamed from: a */
    public final List<CampaignEx> mo63077a(String str, int i) {
        List<CampaignEx> a;
        ArrayList arrayList = null;
        try {
            if (TextUtils.isEmpty(str) || (a = this.f23383c.mo15859a(str, 0, 0, i)) == null) {
                return null;
            }
            ArrayList arrayList2 = new ArrayList();
            try {
                for (CampaignEx next : a) {
                    if (next != null) {
                        arrayList2.add(next);
                    }
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
    public final void mo63087a(String str, List<CampaignEx> list, String str2, int i) {
        C2372e eVar;
        if (!TextUtils.isEmpty(str) && list != null && list.size() > 0 && !TextUtils.isEmpty(str2) && (eVar = this.f23383c) != null) {
            eVar.mo15872a(str, list, str2, i);
        }
    }

    /* renamed from: a */
    public final void mo63086a(String str, List<CampaignEx> list) {
        C2372e eVar;
        if (!TextUtils.isEmpty(str) && list != null && list.size() > 0 && (eVar = this.f23383c) != null) {
            eVar.mo15883b(str, list);
        }
    }

    /* renamed from: a */
    public final void mo63084a(String str, String str2) {
        if (this.f23383c != null && !TextUtils.isEmpty(str)) {
            this.f23383c.mo15890e(str, str2);
        }
    }

    /* renamed from: a */
    public final List<CampaignEx> mo63078a(String str, int i, boolean z) {
        return mo63079a(str, i, z, "");
    }

    /* renamed from: a */
    public final List<CampaignEx> mo63079a(String str, int i, boolean z, String str2) {
        List<CampaignEx> list;
        ArrayList arrayList = null;
        try {
            C9548a b = C9549b.m27299a().mo63129b();
            long d = b != null ? b.mo63114d() : 0;
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            if (z) {
                list = this.f23383c.mo15860a(str, 0, 0, i, str2);
            } else {
                list = this.f23383c.mo15861a(str, 0, 0, i, false);
            }
            long currentTimeMillis = System.currentTimeMillis();
            if (list == null) {
                return null;
            }
            ArrayList arrayList2 = new ArrayList();
            try {
                for (CampaignEx next : list) {
                    if (next != null && (next.getReadyState() == 0 || next.getLoadTimeoutState() == 1)) {
                        long plct = next.getPlct() * 1000;
                        long timestamp = currentTimeMillis - next.getTimestamp();
                        int i2 = (plct > 0 ? 1 : (plct == 0 ? 0 : -1));
                        if ((i2 > 0 && plct >= timestamp) || (i2 <= 0 && d >= timestamp)) {
                            arrayList2.add(next);
                        }
                    }
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
    public final List<CampaignEx> mo63080a(List<CampaignEx> list) {
        ArrayList arrayList = null;
        if (list == null) {
            return null;
        }
        try {
            C9548a b = C9549b.m27299a().mo63129b();
            long d = b != null ? b.mo63114d() : 0;
            long currentTimeMillis = System.currentTimeMillis();
            if (list == null || list.size() <= 0) {
                return null;
            }
            ArrayList arrayList2 = new ArrayList();
            try {
                for (CampaignEx next : list) {
                    if (next != null) {
                        long plct = next.getPlct() * 1000;
                        long timestamp = currentTimeMillis - next.getTimestamp();
                        int i = (plct > 0 ? 1 : (plct == 0 ? 0 : -1));
                        if ((i > 0 && plct >= timestamp) || (i <= 0 && d >= timestamp)) {
                            arrayList2.add(next);
                        }
                    }
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
    public final List<C8401b> mo63076a(String str) {
        try {
            if (!TextUtils.isEmpty(str)) {
                return this.f23383c.mo15887d(str);
            }
            return null;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: b */
    public final int mo63088b(String str, int i, boolean z, String str2) {
        List<CampaignEx> list;
        try {
            if (TextUtils.isEmpty(str)) {
                return 0;
            }
            ArrayList arrayList = new ArrayList();
            if (z) {
                list = this.f23383c.mo15860a(str, 0, 0, i, str2);
            } else {
                list = this.f23383c.mo15861a(str, 0, 0, i, false);
            }
            if (list == null) {
                return 0;
            }
            for (CampaignEx next : list) {
                if (next != null && next.getReadyState() == 0) {
                    arrayList.add(next);
                }
            }
            return arrayList.size();
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    /* renamed from: b */
    public final List<CampaignEx> mo63089b(String str, int i, boolean z) {
        try {
            if (!TextUtils.isEmpty(str)) {
                return this.f23383c.mo15861a(str, 0, 0, i, z);
            }
            return null;
        } catch (Exception e) {
            C8608u.m24884d(f23381a, e.getLocalizedMessage());
            return null;
        }
    }

    /* renamed from: c */
    public final List<CampaignEx> mo63093c(String str, int i, boolean z, String str2) {
        long J;
        List<CampaignEx> list;
        ArrayList arrayList = null;
        try {
            C2278a b = C2283b.m5275a().mo15563b(C2350a.m5601e().mo15793h());
            if (b != null) {
                J = b.mo15436J();
            } else {
                J = C2283b.m5275a().mo15562b().mo15436J();
            }
            long j = J * 1000;
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            if (z) {
                list = this.f23383c.mo15860a(str, 0, 0, i, str2);
            } else {
                list = this.f23383c.mo15861a(str, 0, 0, i, false);
            }
            long currentTimeMillis = System.currentTimeMillis();
            if (list == null) {
                return null;
            }
            ArrayList arrayList2 = new ArrayList();
            try {
                for (CampaignEx next : list) {
                    if (next != null && next.getReadyState() == 0) {
                        long plctb = next.getPlctb() * 1000;
                        long timestamp = currentTimeMillis - next.getTimestamp();
                        int i2 = (plctb > 0 ? 1 : (plctb == 0 ? 0 : -1));
                        if ((i2 <= 0 && j >= timestamp) || (i2 > 0 && plctb >= timestamp)) {
                            arrayList2.add(next);
                        }
                    }
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
    public final void mo63083a(CampaignEx campaignEx, String str) {
        if (campaignEx != null) {
            try {
                if (!TextUtils.isEmpty(str)) {
                    if (campaignEx.isBidCampaign()) {
                        C8417d.m24313b(str, campaignEx.getRequestId());
                    }
                    this.f23383c.mo15870a(campaignEx.getId(), str, campaignEx.isBidCampaign(), campaignEx.getRequestId());
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    public final void mo63082a(CampaignEx campaignEx) {
        if (campaignEx != null) {
            try {
                if (!TextUtils.isEmpty(campaignEx.getId())) {
                    this.f23383c.mo15882b(campaignEx.getId(), campaignEx.getRequestId());
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: b */
    public final void mo63090b(String str) {
        ConcurrentHashMap<String, C8401b> e;
        try {
            if (!TextUtils.isEmpty(str) && (e = this.f23383c.mo15889e(str)) != null && e.size() > 0) {
                C2278a b = C2283b.m5275a().mo15563b(C2350a.m5601e().mo15793h());
                if (b == null) {
                    b = C2283b.m5275a().mo15562b();
                }
                long J = b != null ? b.mo15436J() : 0;
                long currentTimeMillis = System.currentTimeMillis();
                for (C8401b next : e.values()) {
                    if (next != null) {
                        long d = next.mo57305d();
                        if (d <= 0) {
                            d = J;
                        }
                        if (next.mo57306e() + (d * 1000) < currentTimeMillis) {
                            if (!TextUtils.isEmpty(next.mo57298b())) {
                                mo63092b(str, next.mo57298b());
                            }
                        }
                    }
                }
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    /* renamed from: b */
    public final void mo63091b(String str, int i) {
        int size;
        try {
            List<C8401b> d = this.f23383c.mo15887d(str);
            if (d != null && d.size() > 0 && (size = d.size() - i) > 0) {
                for (int i2 = 0; i2 < size; i2++) {
                    mo63092b(str, d.get(i2).mo57298b());
                    C8417d.m24313b(str, d.get(i2).mo57298b());
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: b */
    public final synchronized void mo63092b(String str, String str2) {
        try {
            this.f23383c.mo15885c(str2, str);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return;
    }

    /* renamed from: a */
    public final void mo63085a(String str, String str2, List<CampaignEx> list) {
        try {
            if (!TextUtils.isEmpty(str2) && list != null && list.size() > 0) {
                this.f23383c.mo15876a(list, str, str2, 0);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public final synchronized void mo63081a(long j, String str) {
        try {
            this.f23383c.mo15863a(j, str);
        } catch (Exception e) {
            e.printStackTrace();
            C8608u.m24884d(f23381a, e.getMessage());
        }
        return;
    }

    /* renamed from: c */
    public final synchronized void mo63094c(String str, int i) {
        try {
            C2278a b = C2283b.m5275a().mo15563b(C2350a.m5601e().mo15793h());
            if (b == null) {
                b = C2283b.m5275a().mo15562b();
            }
            int at = b.mo15481at();
            if (at != 0) {
                boolean z = true;
                List<CampaignEx> b2 = this.f23383c.mo15880b(str, i, at == 2);
                if (b2 != null && b2.size() > 0) {
                    for (CampaignEx next : b2) {
                        String requestIdNotice = next.getRequestIdNotice();
                        String id = next.getId();
                        C9536a.m27228b(next.getCampaignUnitId() + "_" + id + "_" + requestIdNotice + "_" + next.getCMPTEntryUrl());
                    }
                }
                C2372e eVar = this.f23383c;
                if (at != 2) {
                    z = false;
                }
                eVar.mo15867a(str, i, z);
            } else {
                return;
            }
        } catch (Exception e) {
            C8608u.m24884d(f23381a, e.getMessage());
        }
        return;
    }
}

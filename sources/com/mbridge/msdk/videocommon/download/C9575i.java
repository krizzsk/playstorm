package com.mbridge.msdk.videocommon.download;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.controller.C2350a;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.p301c.C8425b;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.mbridge.msdk.videocommon.download.i */
/* compiled from: ResDownloadCheckManager */
public final class C9575i {

    /* renamed from: b */
    private static Map<String, Boolean> f23539b = new HashMap();

    /* renamed from: a */
    private Map<String, Boolean> f23540a;

    /* renamed from: c */
    private Map<String, Boolean> f23541c;

    /* renamed from: d */
    private Map<String, Boolean> f23542d;

    /* renamed from: e */
    private Map<String, Boolean> f23543e;

    /* renamed from: com.mbridge.msdk.videocommon.download.i$a */
    /* compiled from: ResDownloadCheckManager */
    private static final class C9577a {

        /* renamed from: a */
        public static C9575i f23544a = new C9575i();
    }

    private C9575i() {
        this.f23540a = new HashMap();
        this.f23541c = new HashMap();
        this.f23542d = new HashMap();
        this.f23543e = new HashMap();
    }

    /* renamed from: a */
    public static C9575i m27485a() {
        return C9577a.f23544a;
    }

    /* renamed from: a */
    public final boolean mo63250a(String str) {
        if (this.f23540a == null || TextUtils.isEmpty(str) || !this.f23540a.containsKey(str)) {
            return false;
        }
        return this.f23540a.get(str).booleanValue();
    }

    /* renamed from: b */
    public final boolean mo63252b(String str) {
        if (this.f23541c == null || TextUtils.isEmpty(str) || !this.f23541c.containsKey(str)) {
            return false;
        }
        return this.f23541c.get(str).booleanValue();
    }

    /* renamed from: a */
    public final void mo63249a(List<CampaignEx> list) {
        List<CampaignEx.C8398c.C8399a> f;
        List<String> list2;
        Map<String, Boolean> map;
        if (list != null && list.size() != 0) {
            for (CampaignEx next : list) {
                if (next != null) {
                    if (next != null) {
                        String videoUrlEncode = next.getVideoUrlEncode();
                        Map<String, Boolean> map2 = this.f23540a;
                        if (map2 != null && !map2.containsKey(videoUrlEncode)) {
                            this.f23540a.put(videoUrlEncode, false);
                        }
                        String str = next.getendcard_url();
                        Map<String, Boolean> map3 = this.f23541c;
                        if (map3 != null && !map3.containsKey(str)) {
                            this.f23541c.put(str, false);
                        }
                        CampaignEx.C8398c rewardTemplateMode = next.getRewardTemplateMode();
                        if (!(rewardTemplateMode == null || (f = rewardTemplateMode.mo57206f()) == null)) {
                            for (CampaignEx.C8398c.C8399a next2 : f) {
                                if (!(next2 == null || (list2 = next2.f20183b) == null || list2.size() == 0)) {
                                    for (String next3 : list2) {
                                        if (!TextUtils.isEmpty(next3) && (map = f23539b) != null && !map.containsKey(next3)) {
                                            f23539b.put(next3, Boolean.valueOf(C8425b.m24339a(C2350a.m5601e().mo15792g()).mo57507b(next3)));
                                        }
                                    }
                                }
                            }
                        }
                    }
                    String id = next.getId();
                    if (this.f23542d == null) {
                        this.f23542d = new HashMap();
                    }
                    this.f23542d.put(id, false);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo63248a(String str, boolean z) {
        if (this.f23540a == null) {
            this.f23540a = new HashMap();
        }
        this.f23540a.put(str, Boolean.valueOf(z));
    }

    /* renamed from: b */
    public final void mo63251b(String str, boolean z) {
        if (this.f23541c == null) {
            this.f23541c = new HashMap();
        }
        this.f23541c.put(str, Boolean.valueOf(z));
    }

    /* renamed from: c */
    public final void mo63253c(String str, boolean z) {
        if (f23539b == null) {
            f23539b = new HashMap();
        }
        f23539b.put(str, Boolean.valueOf(z));
    }

    /* renamed from: d */
    public final void mo63255d(String str, boolean z) {
        if (this.f23543e == null) {
            this.f23543e = new HashMap();
        }
        this.f23543e.put(str, Boolean.valueOf(z));
    }

    /* renamed from: c */
    public final boolean mo63254c(String str) {
        if (!TextUtils.isEmpty(str) && this.f23543e.containsKey(str)) {
            return this.f23543e.get(str).booleanValue();
        }
        return false;
    }
}

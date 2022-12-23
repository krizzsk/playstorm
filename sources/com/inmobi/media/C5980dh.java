package com.inmobi.media;

import android.os.Build;
import androidx.browser.trusted.sharing.ShareTarget;
import com.inmobi.media.C6145fs;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.inmobi.media.dh */
/* compiled from: TokenRequest */
public final class C5980dh extends C6206gx {

    /* renamed from: a */
    public String f15196a;

    /* renamed from: b */
    public Map<String, String> f15197b;

    public C5980dh(C6271ir irVar) {
        super(ShareTarget.METHOD_POST, (String) null, irVar, false, ShareTarget.ENCODING_TYPE_URL_ENCODED);
        this.f15719s = C6227ho.m18559f();
        this.f15715o = true;
        mo35386a(C6227ho.m18558e());
    }

    /* renamed from: a */
    public final void mo34922a() {
        String d;
        super.mo34922a();
        C5926ci a = C6310jl.m18869a();
        if (a.f15019a != null) {
            this.f15708h.put("ufid", a.f15019a);
        }
        Map map = this.f15708h;
        StringBuilder sb = new StringBuilder();
        sb.append(a.f15020b);
        map.put("is-unifid-service-used", sb.toString());
        this.f15708h.putAll(C6275iu.m18752a().mo35485d());
        this.f15708h.putAll(C6257if.m18680a());
        this.f15708h.put("d-media-volume", String.valueOf(C6251ib.m18648a(C6227ho.m18551c(), this.f15718r)));
        mo35391d(this.f15708h);
        if (this.f15196a != null) {
            this.f15708h.put("p-keywords", this.f15196a);
        }
        Map<String, String> map2 = this.f15197b;
        if (map2 != null) {
            for (Map.Entry next : map2.entrySet()) {
                if (!this.f15708h.containsKey(next.getKey())) {
                    this.f15708h.put((String) next.getKey(), (String) next.getValue());
                }
            }
        }
        JSONObject jSONObject = ((C6171ge) C6145fs.m18321a("signals", this.f15719s, (C6145fs.C6148c) null)).ext;
        if (jSONObject != null && jSONObject.length() > 0) {
            this.f15708h.put("im-ext", jSONObject.toString());
        }
        if (Build.VERSION.SDK_INT >= 29 && (d = C6252ic.m18663d()) != null) {
            this.f15708h.put("d-device-gesture-margins", d);
        }
        Map map3 = this.f15708h;
        C6125fq fqVar = (C6125fq) C6145fs.m18321a(CampaignUnit.JSON_KEY_ADS, this.f15719s, (C6145fs.C6148c) null);
        boolean z = true;
        if (!(fqVar != null && fqVar.cctEnabled) || C6209h.m18477a(C6227ho.m18551c()) == null) {
            z = false;
        }
        map3.put("cct-enabled", String.valueOf(z));
        this.f15708h.putAll(C6258ig.m18692d());
        this.f15708h.putAll(C6252ic.m18662c());
        this.f15708h.putAll(C6285iz.m18789a("InMobi"));
    }
}

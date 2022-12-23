package com.mbridge.msdk.foundation.same.net.p311g;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.tools.C8608u;
import com.mbridge.msdk.foundation.tools.C8613y;

/* renamed from: com.mbridge.msdk.foundation.same.net.g.a */
/* compiled from: CampaignRequest */
public class C8491a extends C8492b {
    public C8491a(Context context) {
        super(context);
    }

    /* renamed from: a */
    public void mo15557a(String str, C8494d dVar) {
        try {
            int c = C8613y.m24937c();
            String d = C8613y.m24942d();
            if (dVar != null) {
                dVar.mo57606a("misk_spt", String.valueOf(c));
                if (!TextUtils.isEmpty(d)) {
                    dVar.mo57606a("misk_spt_det", d);
                }
            }
        } catch (Exception e) {
            C8608u.m24880a("CampaignRequest", e.getMessage());
        } catch (Throwable th) {
            super.mo15557a(str, dVar);
            throw th;
        }
        super.mo15557a(str, dVar);
    }
}

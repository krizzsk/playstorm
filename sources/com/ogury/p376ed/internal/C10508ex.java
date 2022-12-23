package com.ogury.p376ed.internal;

import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.ogury.core.internal.network.OguryNetworkResponse;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.ogury.ed.internal.ex */
public final class C10508ex {

    /* renamed from: a */
    public static final C10508ex f26563a = new C10508ex();

    private C10508ex() {
    }

    /* renamed from: a */
    public final void mo67336a(List<C10483eb> list, C10505ev evVar, C10469dv dvVar) throws C10507ew {
        C10765mq.m32773b(list, CampaignUnit.JSON_KEY_ADS);
        C10765mq.m32773b(evVar, "mraidDao");
        C10765mq.m32773b(dvVar, "presageApi");
        C10483eb a = m31853a(list);
        if (a != null) {
            if (!(!C10765mq.m32772a((Object) a.mo67245k(), (Object) evVar.mo67332a()))) {
                if (!(evVar.mo67334b().length() == 0)) {
                    return;
                }
            }
            try {
                m31854a(a.mo67245k(), true, evVar, dvVar);
            } catch (C10507ew e) {
                C10445di diVar = C10445di.f26411a;
                C10445di.m31608a((C10444dh) new C10455dl("loaded_error", a));
                throw e;
            }
        }
    }

    /* renamed from: a */
    private static C10483eb m31853a(List<C10483eb> list) {
        Object obj;
        boolean z;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((C10483eb) obj).mo67245k().length() > 0) {
                z = true;
                continue;
            } else {
                z = false;
                continue;
            }
            if (z) {
                break;
            }
        }
        return (C10483eb) obj;
    }

    /* renamed from: a */
    private final void m31854a(String str, boolean z, C10505ev evVar, C10469dv dvVar) throws C10507ew {
        OguryNetworkResponse b = dvVar.mo67208b(str);
        if (b instanceof OguryNetworkResponse.Success) {
            OguryNetworkResponse.Success success = (OguryNetworkResponse.Success) b;
            String responseBody = success.getResponseBody();
            C10765mq.m32770a((Object) responseBody, "response.responseBody");
            if (responseBody.length() > 0) {
                String responseBody2 = success.getResponseBody();
                C10765mq.m32770a((Object) responseBody2, "response.responseBody");
                evVar.mo67333a(responseBody2);
                evVar.mo67335b(str);
                return;
            }
        }
        if (z) {
            Thread.sleep(400);
            m31854a(str, false, evVar, dvVar);
            return;
        }
        throw new C10507ew();
    }
}

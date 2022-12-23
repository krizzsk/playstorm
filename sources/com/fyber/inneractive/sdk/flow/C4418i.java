package com.fyber.inneractive.sdk.flow;

import com.fyber.inneractive.sdk.external.InneractiveError;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.external.InneractiveInfrastructureError;
import com.fyber.inneractive.sdk.measurement.C4459a;
import com.fyber.inneractive.sdk.measurement.C4463d;
import com.fyber.inneractive.sdk.measurement.C4466g;
import com.fyber.inneractive.sdk.measurement.C4467h;
import com.fyber.inneractive.sdk.measurement.C4468i;
import com.fyber.inneractive.sdk.measurement.C4469j;
import com.fyber.inneractive.sdk.model.vast.C4478b;
import com.fyber.inneractive.sdk.model.vast.C4493q;
import com.fyber.inneractive.sdk.player.C4588a;
import com.fyber.inneractive.sdk.player.C5066f;
import com.fyber.inneractive.sdk.player.C5071g;
import com.fyber.inneractive.sdk.player.C5073i;
import com.fyber.inneractive.sdk.response.C5293g;
import com.fyber.inneractive.sdk.response.C5295i;
import com.fyber.inneractive.sdk.util.IAlog;
import com.iab.omid.library.fyber.adsession.AdEvents;
import com.iab.omid.library.fyber.adsession.AdSession;
import com.iab.omid.library.fyber.adsession.AdSessionConfiguration;
import com.iab.omid.library.fyber.adsession.AdSessionContext;
import com.iab.omid.library.fyber.adsession.CreativeType;
import com.iab.omid.library.fyber.adsession.ImpressionType;
import com.iab.omid.library.fyber.adsession.Owner;
import com.iab.omid.library.fyber.adsession.VerificationScriptResource;
import com.iab.omid.library.fyber.adsession.media.MediaEvents;
import java.util.List;

/* renamed from: com.fyber.inneractive.sdk.flow.i */
public class C4418i extends C4406c<C5293g, C4450y> implements C5073i.C5075b {

    /* renamed from: h */
    public C5073i f10912h;

    public C4418i(String str) {
    }

    /* renamed from: a */
    public void mo24566a() {
        this.f10912h.mo25677a();
    }

    /* renamed from: b */
    public String mo24370b() {
        return "send_failed_vast_creatives";
    }

    /* renamed from: d */
    public void mo24571d() {
        super.mo24571d();
    }

    /* renamed from: e */
    public void mo24371e() {
        C4478b bVar;
        AdSessionConfiguration adSessionConfiguration;
        C4478b bVar2;
        IAlog.m16699a(IAlog.m16696a((Object) this) + "start called", new Object[0]);
        Content yVar = new C4450y(mo24570c(), this.f10875f, (C5293g) this.f10871b, this.f10870a);
        this.f10872c = yVar;
        C5293g gVar = (C5293g) this.f10871b;
        C5073i iVar = new C5073i(gVar, this.f10870a, yVar, this);
        this.f10912h = iVar;
        C4450y yVar2 = (C4450y) this.f10872c;
        yVar2.f10998g = iVar;
        yVar2.f10918f = this.f10876g;
        AdSessionContext adSessionContext = null;
        iVar.f13574e = null;
        if (!(gVar == null || (bVar2 = gVar.f14094C) == null)) {
            iVar.f13574e = bVar2.f11063d.poll();
        }
        if (iVar.f13574e == null) {
            iVar.mo25680b();
            C5073i.C5075b bVar3 = iVar.f13573d;
            InneractiveInfrastructureError inneractiveInfrastructureError = new InneractiveInfrastructureError(InneractiveErrorCode.SDK_INTERNAL_ERROR);
            C4418i iVar2 = (C4418i) bVar3;
            iVar2.mo24568a((InneractiveError) inneractiveInfrastructureError);
            iVar2.mo24569a(inneractiveInfrastructureError);
            return;
        }
        iVar.mo25683e();
        C4588a.C4589a aVar = iVar.f13575f;
        if (aVar != null) {
            C5066f fVar = (C5066f) aVar;
            C4459a aVar2 = fVar.f11412h;
            if (aVar2 != null) {
                C4466g gVar2 = new C4466g();
                List<C4468i> list = fVar.f13563x.f11064e;
                C4450y yVar3 = fVar.f11410f;
                try {
                    CreativeType creativeType = CreativeType.VIDEO;
                    ImpressionType impressionType = ImpressionType.UNSPECIFIED;
                    Owner owner = Owner.NATIVE;
                    adSessionConfiguration = AdSessionConfiguration.createAdSessionConfiguration(creativeType, impressionType, owner, owner, false);
                } catch (Throwable th) {
                    gVar2.mo24663a(th);
                }
                List<VerificationScriptResource> a = gVar2.mo24662a(list);
                if (!(((C4463d) aVar2).f11005c == null || ((C4463d) aVar2).f11004b == null)) {
                    try {
                        adSessionContext = AdSessionContext.createNativeAdSessionContext(((C4463d) aVar2).f11005c, ((C4463d) aVar2).f11004b, a, "", "");
                    } catch (Throwable th2) {
                        gVar2.mo24663a(th2);
                    }
                }
                AdSession createAdSession = AdSession.createAdSession(adSessionConfiguration, adSessionContext);
                gVar2.f11013a = createAdSession;
                gVar2.f11014b = AdEvents.createAdEvents(createAdSession);
                gVar2.f11015c = MediaEvents.createMediaEvents(gVar2.f11013a);
                gVar2.f11013a.start();
                gVar2.f11018f = yVar3;
                fVar.f11413i = gVar2;
                fVar.f11414j = new C5071g(gVar2);
            }
            if (fVar.f11413i == null && (bVar = fVar.f13563x) != null) {
                for (C4468i next : bVar.f11064e) {
                    C4469j jVar = C4469j.ERROR_DURING_RESOURCE_LOAD;
                    C4493q qVar = C4493q.EVENT_VERIFICATION_NOT_EXECUTED;
                    C5066f.m15433a((C5295i) new C4467h(next, next.mo24664a(qVar), jVar), qVar);
                }
            }
        }
        iVar.mo25682d();
    }
}

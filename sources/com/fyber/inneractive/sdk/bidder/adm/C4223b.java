package com.fyber.inneractive.sdk.bidder.adm;

import com.fyber.inneractive.sdk.bidder.adm.AdmParametersOuterClass$AdmParameters;
import com.fyber.inneractive.sdk.bidder.adm.C4226e;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.global.C4277a;
import com.fyber.inneractive.sdk.config.global.C4278b;
import com.fyber.inneractive.sdk.config.global.C4301k;
import com.fyber.inneractive.sdk.config.global.C4302l;
import com.fyber.inneractive.sdk.config.global.C4307q;
import com.fyber.inneractive.sdk.config.global.C4309s;
import com.fyber.inneractive.sdk.config.global.features.C4287e;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.factories.C4397b;
import com.fyber.inneractive.sdk.flow.C4408e;
import com.fyber.inneractive.sdk.flow.C4411f;
import com.fyber.inneractive.sdk.flow.C4423m;
import com.fyber.inneractive.sdk.network.C4558m;
import com.fyber.inneractive.sdk.network.C4560n;
import com.fyber.inneractive.sdk.network.C4579u;
import com.fyber.inneractive.sdk.response.C5287a;
import com.fyber.inneractive.sdk.response.C5288b;
import com.fyber.inneractive.sdk.response.C5291e;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.fyber.inneractive.sdk.bidder.adm.b */
public class C4223b implements C4579u<C5291e> {

    /* renamed from: a */
    public final /* synthetic */ C4226e.C4227a f10429a;

    /* renamed from: b */
    public final /* synthetic */ C4226e f10430b;

    public C4223b(C4226e eVar, C4226e.C4227a aVar) {
        this.f10430b = eVar;
        this.f10429a = aVar;
    }

    /* renamed from: a */
    public void mo24228a(Object obj, Exception exc, boolean z) {
        int i;
        C4307q a;
        C4278b bVar;
        C4301k kVar;
        C4302l lVar;
        C4307q a2;
        C5291e eVar = (C5291e) obj;
        C5291e eVar2 = null;
        if (exc == null) {
            C4226e.C4227a aVar = this.f10429a;
            if (aVar != null) {
                C4423m.C4424a aVar2 = (C4423m.C4424a) aVar;
                C4309s sVar = new C4309s();
                AdmParametersOuterClass$AdmParameters admParametersOuterClass$AdmParameters = aVar2.f10944a.f10433a;
                if (admParametersOuterClass$AdmParameters != null) {
                    List<AdmParametersOuterClass$AdmParameters.Experiment> abExperimentsList = admParametersOuterClass$AdmParameters.getAbExperimentsList();
                    C4277a aVar3 = IAConfigManager.f10525J.f10561z;
                    aVar3.getClass();
                    for (C4287e next : sVar.f10655c.values()) {
                        if (!(next == null || (lVar = aVar3.f10611a) == null || (a2 = lVar.mo24331a(next.f10625b)) == null)) {
                            next.f10650a = a2.f10650a;
                        }
                    }
                    if (abExperimentsList != null && abExperimentsList.size() > 0) {
                        C4277a aVar4 = IAConfigManager.f10525J.f10561z;
                        aVar4.f10612b = sVar;
                        for (C4287e next2 : sVar.f10655c.values()) {
                            for (AdmParametersOuterClass$AdmParameters.Experiment next3 : abExperimentsList) {
                                String identifier = next3.getIdentifier();
                                String variant = next3.getVariant();
                                C4302l lVar2 = aVar4.f10611a;
                                if (!(lVar2 == null || (a = lVar2.mo24331a(next2.f10625b)) == null || (bVar = a.f10652c.get(identifier)) == null)) {
                                    Iterator<C4301k> it = bVar.f10615c.iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                            kVar = null;
                                            break;
                                        }
                                        kVar = it.next();
                                        if (kVar.f10646b.equals(variant)) {
                                            break;
                                        }
                                    }
                                    next2.f10626c.add(bVar);
                                    if (kVar != null) {
                                        next2.f10627d.put(bVar.f10613a, kVar);
                                    }
                                }
                            }
                        }
                    }
                }
                C4423m mVar = C4423m.this;
                C4411f fVar = mVar.f10943l;
                String str = mVar.f10932a;
                C4408e.C4410b bVar2 = mVar.f10935d;
                fVar.f10881e = null;
                fVar.f10880d = bVar2;
                if (IAConfigManager.m13434g()) {
                    fVar.f10882f = sVar;
                    C4560n nVar = new C4560n(fVar.f10881e, str, sVar, fVar);
                    fVar.f10883g = nVar;
                    nVar.mo24764a(eVar);
                    return;
                }
                IAConfigManager.addListener(fVar);
                IAConfigManager.m13428a();
            }
        } else if (this.f10429a != null) {
            C4226e eVar3 = this.f10430b;
            try {
                AdmParametersOuterClass$AdmParameters admParametersOuterClass$AdmParameters2 = eVar3.f10433a;
                if (admParametersOuterClass$AdmParameters2 != null) {
                    i = admParametersOuterClass$AdmParameters2.getAdType().mo24088a();
                } else {
                    i = AdmParametersOuterClass$AdmParameters.C4215a.UNRECOGNIZED.mo24088a();
                }
                C5287a a3 = C5287a.m16615a(i);
                if (a3 == null) {
                    a3 = C5287a.RETURNED_ADTYPE_MRAID;
                }
                C5288b a4 = C4397b.C4398a.f10858a.mo24559a(a3);
                if (a4 != null) {
                    a4.mo26385a((C4558m) null);
                    eVar3.mo24232a(a4);
                    eVar2 = a4.f14055a;
                } else {
                    IAlog.m16699a("failed parse adm network request with no input stream - received ad type %s does not have an appropriate parser", Integer.valueOf(i));
                }
            } catch (Exception e) {
                IAlog.m16698a("failed parse adm network request with no input stream", e, new Object[0]);
            }
            ((C4423m.C4424a) this.f10429a).mo24616a(exc, InneractiveErrorCode.CONNECTION_ERROR, eVar2);
        }
    }
}

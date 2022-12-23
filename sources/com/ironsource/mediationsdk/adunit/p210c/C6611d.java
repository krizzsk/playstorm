package com.ironsource.mediationsdk.adunit.p210c;

import com.facebook.internal.security.CertificateUtil;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.C6463D;
import com.ironsource.mediationsdk.C6569ac;
import com.ironsource.mediationsdk.C6661h;
import com.ironsource.mediationsdk.C6663i;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.IronSourceSegment;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdInteractionAdapter;
import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.adunit.p210c.C6612e;
import com.ironsource.mediationsdk.adunit.p210c.p211a.C6603a;
import com.ironsource.mediationsdk.adunit.p210c.p212b.C6607a;
import com.ironsource.mediationsdk.adunit.p213d.p214a.C6620a;
import com.ironsource.mediationsdk.adunit.p213d.p214a.C6622c;
import com.ironsource.mediationsdk.impressionData.ImpressionDataListener;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.Placement;
import com.ironsource.mediationsdk.server.C6758b;
import com.ironsource.mediationsdk.utils.C6774k;
import com.ironsource.mediationsdk.utils.C6782o;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.Iterator;
import java.util.Set;

/* renamed from: com.ironsource.mediationsdk.adunit.c.d */
public abstract class C6611d<Smash extends C6620a<?>, Adapter extends BaseAdInteractionAdapter<?, ? extends AdapterAdInteractionListener>> extends C6612e<Smash, Adapter> implements C6603a {
    public C6611d(C6602a aVar, Set<ImpressionDataListener> set, IronSourceSegment ironSourceSegment) {
        super(aVar, set, ironSourceSegment);
    }

    /* renamed from: a */
    private void m20113a(IronSourceError ironSourceError, String str) {
        this.f17156q.f17102d.mo36496a(mo36587h(), ironSourceError.getErrorCode(), ironSourceError.getErrorMessage(), str);
        this.f17154o.mo36569b();
        this.f17157r.mo36563a(ironSourceError, this.f17140a.mo36610a(this.f17140a.f17209b));
        if (this.f17152m.f17125h.mo36566b()) {
            mo36581a(false, false);
        }
    }

    /* renamed from: a */
    public final void mo36551a(C6620a<?> aVar) {
        IronLog.INTERNAL.verbose(mo36575a(aVar.mo36605m()));
        C6606b bVar = this.f17157r;
        AdInfo a = this.f17140a.mo36610a(aVar.mo36607o());
        if (bVar.f17127a == IronSource.AD_UNIT.INTERSTITIAL) {
            C6463D.m19392a().mo36019d(a);
        } else if (bVar.f17127a != IronSource.AD_UNIT.REWARDED_VIDEO) {
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.warning("ad unit not supported - " + bVar.f17127a);
        }
    }

    /* renamed from: a */
    public final void mo36552a(IronSourceError ironSourceError, C6620a<?> aVar) {
        C6758b bVar;
        if (this.f17152m.mo36550a() && (bVar = (C6758b) this.f17141b.get(aVar.mo36401k())) != null) {
            this.f17140a.mo36614a(this.f17140a.f17209b, bVar.mo36938a(mo36587h()));
        }
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(mo36575a(aVar.mo36605m() + " - error = " + ironSourceError));
        this.f17142c.put(aVar.mo36401k(), C6663i.C6664a.ISAuctionPerformanceFailedToShow);
        mo36578a(C6612e.C6615a.READY_TO_LOAD);
        m20113a(ironSourceError, "");
    }

    /* renamed from: a */
    public final void mo36571a(Placement placement) {
        C6620a aVar;
        IronSourceError ironSourceError;
        String stringBuffer;
        IronLog.INTERNAL.verbose(mo36575a("state = " + this.f17153n));
        synchronized (this.f17159t) {
            this.f17149j = placement;
            this.f17156q.f17102d.mo36495a(mo36587h());
            C6612e.C6615a aVar2 = this.f17153n;
            C6612e.C6615a aVar3 = C6612e.C6615a.SHOWING;
            int i = IronSourceError.ERROR_CODE_GENERIC;
            aVar = null;
            if (aVar2 == aVar3) {
                IronSource.AD_UNIT ad_unit = this.f17152m.f17118a;
                if (ad_unit == IronSource.AD_UNIT.INTERSTITIAL) {
                    i = 1036;
                } else if (ad_unit == IronSource.AD_UNIT.REWARDED_VIDEO) {
                    i = 1022;
                } else {
                    IronLog.INTERNAL.warning("ad unit not supported - " + ad_unit);
                }
                ironSourceError = new IronSourceError(i, "can't show ad while an ad is already showing");
            } else if (this.f17153n != C6612e.C6615a.READY_TO_SHOW) {
                ironSourceError = new IronSourceError(IronSourceError.ERROR_CODE_NO_ADS_TO_SHOW, "show called while no ads are available");
            } else if (placement == null) {
                IronSource.AD_UNIT ad_unit2 = this.f17152m.f17118a;
                if (ad_unit2 == IronSource.AD_UNIT.INTERSTITIAL) {
                    i = 1020;
                } else if (ad_unit2 == IronSource.AD_UNIT.REWARDED_VIDEO) {
                    i = 1021;
                } else {
                    IronLog.INTERNAL.warning("ad unit not supported - " + ad_unit2);
                }
                ironSourceError = new IronSourceError(i, "empty default placement");
            } else if (C6774k.m20607a(ContextProvider.getInstance().getApplicationContext(), placement.getPlacementName(), this.f17152m.f17118a)) {
                ironSourceError = new IronSourceError(IronSourceError.ERROR_REACHED_CAP_LIMIT_PER_PLACEMENT, "placement " + placement.getPlacementName() + " is capped");
            } else {
                ironSourceError = null;
            }
            if (ironSourceError != null) {
                IronLog.API.error(mo36575a(ironSourceError.getErrorMessage()));
                stringBuffer = "";
            } else {
                StringBuffer stringBuffer2 = new StringBuffer();
                Iterator it = this.f17140a.mo36611a().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    C6620a aVar4 = (C6620a) it.next();
                    if (aVar4.mo36592a()) {
                        mo36578a(C6612e.C6615a.SHOWING);
                        aVar4.mo36591a(true);
                        aVar = aVar4;
                        break;
                    }
                    if (aVar4.mo36602h() != null) {
                        stringBuffer2.append(aVar4.mo36401k() + CertificateUtil.DELIMITER + aVar4.mo36602h() + ",");
                    }
                    aVar4.mo36591a(false);
                    IronLog.INTERNAL.verbose(mo36575a(aVar4.mo36605m() + " - not ready to show"));
                }
                if (aVar == null) {
                    ironSourceError = ErrorBuilder.buildNoAdsToShowError(this.f17152m.f17118a.toString());
                    stringBuffer = stringBuffer2.toString();
                }
            }
            m20113a(ironSourceError, stringBuffer);
        }
        if (aVar != null) {
            Placement placement2 = this.f17149j;
            if (this.f17152m.f17125h.mo36566b()) {
                this.f17155p.mo37015a();
            }
            aVar.mo36590a(placement2);
        }
    }

    /* renamed from: b */
    public final void mo36553b(C6620a<?> aVar) {
        IronLog.INTERNAL.verbose(mo36575a(aVar.mo36605m()));
        this.f17140a.mo36613a((C6622c<?>) aVar);
        this.f17151l.mo36985a(aVar);
        if (this.f17151l.mo36987b(aVar)) {
            IronLog.INTERNAL.verbose(mo36575a(aVar.mo36401k() + " was session capped"));
            aVar.mo36601g();
            IronSourceUtils.sendAutomationLog(aVar.mo36401k() + " was session capped");
        }
        C6774k.m20610b(ContextProvider.getInstance().getApplicationContext(), mo36587h(), this.f17152m.f17118a);
        if (C6774k.m20607a(ContextProvider.getInstance().getApplicationContext(), mo36587h(), this.f17152m.f17118a)) {
            IronLog.INTERNAL.verbose(mo36575a("placement " + mo36587h() + " is capped"));
            this.f17156q.f17102d.mo36506h(mo36587h());
        }
        C6782o.m20647a().mo36989a(this.f17152m.f17118a);
        if (this.f17152m.mo36550a()) {
            C6758b bVar = (C6758b) this.f17141b.get(aVar.mo36401k());
            if (bVar != null) {
                this.f17140a.mo36614a(this.f17140a.f17209b, bVar.mo36938a(mo36587h()));
                C6661h.m20331a(bVar, aVar.mo36604l(), this.f17148i, mo36587h());
                this.f17142c.put(aVar.mo36401k(), C6663i.C6664a.ISAuctionPerformanceShowedSuccessfully);
                mo36580a(bVar, mo36587h());
            } else {
                String k = aVar.mo36401k();
                String str = "showing instance missing from waterfall - " + k;
                IronLog.INTERNAL.verbose(mo36575a(str));
                this.f17156q.f17103e.mo36530a(1011, str, k);
            }
        }
        C6606b bVar2 = this.f17157r;
        AdInfo a = this.f17140a.mo36610a(aVar.mo36607o());
        if (bVar2.f17127a == IronSource.AD_UNIT.INTERSTITIAL) {
            C6463D.m19392a().mo36017b(a);
        } else if (bVar2.f17127a == IronSource.AD_UNIT.REWARDED_VIDEO) {
            C6569ac.m19976a().mo36416a(a);
        } else {
            IronLog.INTERNAL.warning("ad unit not supported - " + bVar2.f17127a);
        }
        if (this.f17152m.f17125h.mo36566b()) {
            mo36581a(false, false);
        }
        C6609c cVar = this.f17154o;
        if (cVar.f17136a.f17128a == C6607a.C6608a.AUTOMATIC_LOAD_WHILE_SHOW) {
            cVar.mo36568a(cVar.f17136a.f17129b);
        }
    }

    /* renamed from: b */
    public final boolean mo36572b() {
        if (!mo36585f()) {
            return false;
        }
        if (this.f17150k && !IronSourceUtils.isNetworkConnected(ContextProvider.getInstance().getApplicationContext())) {
            return false;
        }
        Iterator it = this.f17140a.mo36611a().iterator();
        while (it.hasNext()) {
            if (((C6620a) it.next()).mo36592a()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    public final String mo36554c() {
        StringBuilder sb = new StringBuilder();
        if (this.f17153n == C6612e.C6615a.READY_TO_SHOW) {
            Iterator it = this.f17140a.mo36611a().iterator();
            while (it.hasNext()) {
                C6620a aVar = (C6620a) it.next();
                if (aVar.mo36599e()) {
                    sb.append(aVar.mo36401k() + ";");
                }
            }
        }
        return sb.toString();
    }

    /* renamed from: c */
    public final void mo36555c(C6620a<?> aVar) {
        IronLog.INTERNAL.verbose(mo36575a(aVar.mo36605m()));
        if (this.f17153n == C6612e.C6615a.SHOWING) {
            mo36578a(C6612e.C6615a.READY_TO_LOAD);
        }
        C6609c cVar = this.f17154o;
        if (cVar.f17136a.f17128a == C6607a.C6608a.AUTOMATIC_LOAD_AFTER_CLOSE) {
            cVar.mo36568a(cVar.f17136a.f17129b);
        }
        C6606b bVar = this.f17157r;
        AdInfo a = this.f17140a.mo36610a(aVar.mo36607o());
        if (bVar.f17127a == IronSource.AD_UNIT.INTERSTITIAL) {
            C6463D.m19392a().mo36018c(a);
        } else if (bVar.f17127a == IronSource.AD_UNIT.REWARDED_VIDEO) {
            C6569ac.m19976a().mo36422b(a);
        } else {
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.warning("ad unit not supported - " + bVar.f17127a);
        }
    }

    /* renamed from: d */
    public final void mo36556d(C6620a<?> aVar) {
        IronLog.INTERNAL.verbose(mo36575a(aVar.mo36605m()));
        C6606b bVar = this.f17157r;
        if (bVar.f17127a == IronSource.AD_UNIT.REWARDED_VIDEO) {
            C6569ac.m19976a().mo36421b();
            return;
        }
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.warning("ad unit not supported - " + bVar.f17127a);
    }

    /* renamed from: e */
    public final void mo36557e(C6620a<?> aVar) {
        IronLog.INTERNAL.verbose(mo36575a(aVar.mo36605m()));
        C6606b bVar = this.f17157r;
        if (bVar.f17127a == IronSource.AD_UNIT.REWARDED_VIDEO) {
            C6569ac.m19976a().mo36424c();
            return;
        }
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.warning("ad unit not supported - " + bVar.f17127a);
    }
}

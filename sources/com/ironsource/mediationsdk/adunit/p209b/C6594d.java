package com.ironsource.mediationsdk.adunit.p209b;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.p207a.C6544b;
import com.ironsource.mediationsdk.p207a.C6552c;
import com.ironsource.mediationsdk.p207a.C6553d;
import com.ironsource.mediationsdk.p207a.C6557h;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.ironsource.mediationsdk.adunit.b.d */
public final class C6594d {

    /* renamed from: a */
    public C6599g f17099a;

    /* renamed from: b */
    public C6600h f17100b;

    /* renamed from: c */
    public C6597e f17101c;

    /* renamed from: d */
    public C6591a f17102d;

    /* renamed from: e */
    public C6601i f17103e;

    /* renamed from: f */
    private final int f17104f = -1;

    /* renamed from: g */
    private IronSource.AD_UNIT f17105g;

    /* renamed from: h */
    private C6596b f17106h;

    /* renamed from: i */
    private C6593c f17107i;

    /* renamed from: j */
    private C6544b f17108j;

    /* renamed from: k */
    private Map<C6592b, C6595a> f17109k;

    /* renamed from: l */
    private Map<C6592b, C6595a> f17110l;

    /* renamed from: com.ironsource.mediationsdk.adunit.b.d$a */
    class C6595a {

        /* renamed from: a */
        private int f17111a;

        /* renamed from: b */
        private int f17112b;

        public C6595a(int i, int i2) {
            this.f17111a = i;
            this.f17112b = i2;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final int mo36511a(C6596b bVar) {
            return C6596b.MEDIATION.equals(bVar) ? this.f17111a : this.f17112b;
        }
    }

    /* renamed from: com.ironsource.mediationsdk.adunit.b.d$b */
    public enum C6596b {
        MEDIATION,
        PROVIDER
    }

    public C6594d(IronSource.AD_UNIT ad_unit, C6596b bVar, C6593c cVar) {
        this.f17105g = ad_unit;
        this.f17106h = bVar;
        this.f17107i = cVar;
        this.f17108j = (ad_unit.equals(IronSource.AD_UNIT.REWARDED_VIDEO) || ad_unit.equals(IronSource.AD_UNIT.OFFERWALL)) ? C6557h.m19950d() : C6553d.m19930d();
        HashMap hashMap = new HashMap();
        this.f17109k = hashMap;
        hashMap.put(C6592b.INIT_STARTED, new C6595a(IronSourceConstants.IS_MANAGER_INIT_STARTED, -1));
        this.f17109k.put(C6592b.INIT_ENDED, new C6595a(IronSourceConstants.IS_MANAGER_INIT_ENDED, -1));
        this.f17109k.put(C6592b.SESSION_CAPPED, new C6595a(-1, IronSourceConstants.IS_CAP_SESSION));
        this.f17109k.put(C6592b.PLACEMENT_CAPPED, new C6595a(IronSourceConstants.IS_CAP_PLACEMENT, -1));
        this.f17109k.put(C6592b.AUCTION_REQUEST, new C6595a(2000, -1));
        this.f17109k.put(C6592b.AUCTION_SUCCESS, new C6595a(IronSourceConstants.IS_AUCTION_SUCCESS, -1));
        this.f17109k.put(C6592b.AUCTION_FAILED, new C6595a(IronSourceConstants.IS_AUCTION_FAILED, -1));
        this.f17109k.put(C6592b.AUCTION_REQUEST_WATERFALL, new C6595a(IronSourceConstants.IS_AUCTION_REQUEST_WATERFALL, -1));
        this.f17109k.put(C6592b.AUCTION_RESULT_WATERFALL, new C6595a(IronSourceConstants.IS_RESULT_WATERFALL, -1));
        this.f17109k.put(C6592b.INIT_SUCCESS, new C6595a(-1, -1));
        this.f17109k.put(C6592b.INIT_FAILED, new C6595a(-1, -1));
        this.f17109k.put(C6592b.SHOW_AD_SUCCESS, new C6595a(-1, IronSourceConstants.IS_INSTANCE_SHOW_SUCCESS));
        this.f17109k.put(C6592b.AD_OPENED, new C6595a(-1, 2005));
        this.f17109k.put(C6592b.AD_CLOSED, new C6595a(-1, IronSourceConstants.IS_INSTANCE_CLOSED));
        this.f17109k.put(C6592b.AD_CLICKED, new C6595a(-1, 2006));
        this.f17109k.put(C6592b.LOAD_AD, new C6595a(2001, 2002));
        this.f17109k.put(C6592b.LOAD_AD_SUCCESS, new C6595a(2004, 2003));
        this.f17109k.put(C6592b.LOAD_AD_FAILED_WITH_REASON, new C6595a(IronSourceConstants.IS_CALLBACK_LOAD_ERROR, IronSourceConstants.IS_INSTANCE_LOAD_FAILED));
        this.f17109k.put(C6592b.LOAD_AD_NO_FILL, new C6595a(-1, IronSourceConstants.IS_INSTANCE_LOAD_NO_FILL));
        this.f17109k.put(C6592b.SHOW_AD, new C6595a(2100, IronSourceConstants.IS_INSTANCE_SHOW));
        this.f17109k.put(C6592b.SHOW_AD_SUCCESS, new C6595a(-1, IronSourceConstants.IS_INSTANCE_SHOW_SUCCESS));
        this.f17109k.put(C6592b.SHOW_AD_FAILED, new C6595a(IronSourceConstants.IS_CALLBACK_AD_SHOW_ERROR, IronSourceConstants.IS_INSTANCE_SHOW_FAILED));
        this.f17109k.put(C6592b.AD_UNIT_CAPPED, new C6595a(IronSourceConstants.IS_AD_UNIT_CAPPED, -1));
        this.f17109k.put(C6592b.TROUBLESHOOT_NETWORK_ADAPTER_NOT_AVAILABLE, new C6595a(IronSourceConstants.TROUBLESHOOTING_IS_NETWORK_ADAPTER_NOT_AVAILABLE, IronSourceConstants.TROUBLESHOOTING_IS_NETWORK_ADAPTER_NOT_AVAILABLE));
        this.f17109k.put(C6592b.TROUBLESHOOT_AD_ADAPTER_NOT_AVAILABLE, new C6595a(IronSourceConstants.TROUBLESHOOTING_IS_AD_ADAPTER_NOT_AVAILABLE, IronSourceConstants.TROUBLESHOOTING_IS_AD_ADAPTER_NOT_AVAILABLE));
        this.f17109k.put(C6592b.TROUBLESHOOT_PROVIDER_SETTINGS_MISSING, new C6595a(IronSourceConstants.TROUBLESHOOTING_IS_PROVIDER_SETTINGS_MISSING, IronSourceConstants.TROUBLESHOOTING_IS_PROVIDER_SETTINGS_MISSING));
        this.f17109k.put(C6592b.TROUBLESHOOT_BIDDING_DATA_MISSING, new C6595a(IronSourceConstants.TROUBLESHOOTING_IS_BIDDING_DATA_MISSING, IronSourceConstants.TROUBLESHOOTING_IS_BIDDING_DATA_MISSING));
        this.f17109k.put(C6592b.TROUBLESHOOT_UNEXPECTED_INIT_SUCCESS, new C6595a(IronSourceConstants.TROUBLESHOOTING_IS_UNEXPECTED_INIT_SUCCESS, IronSourceConstants.TROUBLESHOOTING_IS_UNEXPECTED_INIT_SUCCESS));
        this.f17109k.put(C6592b.TROUBLESHOOT_UNEXPECTED_INIT_FAILED, new C6595a(IronSourceConstants.TROUBLESHOOTING_IS_UNEXPECTED_INIT_FAILED, IronSourceConstants.TROUBLESHOOTING_IS_UNEXPECTED_INIT_FAILED));
        this.f17109k.put(C6592b.TROUBLESHOOT_UNEXPECTED_AUCTION_SUCCESS, new C6595a(IronSourceConstants.TROUBLESHOOTING_IS_UNEXPECTED_AUCTION_SUCCESS, IronSourceConstants.TROUBLESHOOTING_IS_UNEXPECTED_AUCTION_SUCCESS));
        this.f17109k.put(C6592b.TROUBLESHOOT_UNEXPECTED_AUCTION_FAILED, new C6595a(IronSourceConstants.TROUBLESHOOTING_IS_UNEXPECTED_AUCTION_FAILED, IronSourceConstants.TROUBLESHOOTING_IS_UNEXPECTED_AUCTION_FAILED));
        this.f17109k.put(C6592b.TROUBLESHOOT_UNEXPECTED_LOAD_SUCCESS, new C6595a(IronSourceConstants.TROUBLESHOOTING_IS_UNEXPECTED_LOAD_SUCCESS, IronSourceConstants.TROUBLESHOOTING_IS_UNEXPECTED_LOAD_SUCCESS));
        this.f17109k.put(C6592b.TROUBLESHOOT_UNEXPECTED_LOAD_FAILED, new C6595a(IronSourceConstants.TROUBLESHOOTING_IS_UNEXPECTED_LOAD_FAILED, IronSourceConstants.TROUBLESHOOTING_IS_UNEXPECTED_LOAD_FAILED));
        this.f17109k.put(C6592b.TROUBLESHOOT_UNEXPECTED_SHOW_FAILED, new C6595a(IronSourceConstants.TROUBLESHOOTING_IS_UNEXPECTED_SHOW_FAILED, IronSourceConstants.TROUBLESHOOTING_IS_UNEXPECTED_SHOW_FAILED));
        this.f17109k.put(C6592b.TROUBLESHOOT_UNEXPECTED_CLOSED, new C6595a(IronSourceConstants.TROUBLESHOOTING_IS_UNEXPECTED_CLOSED, IronSourceConstants.TROUBLESHOOTING_IS_UNEXPECTED_CLOSED));
        this.f17109k.put(C6592b.TROUBLESHOOT_UNEXPECTED_TIMEOUT, new C6595a(IronSourceConstants.TROUBLESHOOTING_IS_UNEXPECTED_TIMEOUT, IronSourceConstants.TROUBLESHOOTING_IS_UNEXPECTED_TIMEOUT));
        this.f17109k.put(C6592b.TROUBLESHOOT_INTERNAL_ERROR, new C6595a(IronSourceConstants.TROUBLESHOOTING_IS_INTERNAL_ERROR, IronSourceConstants.TROUBLESHOOTING_IS_INTERNAL_ERROR));
        this.f17109k.put(C6592b.TROUBLESHOOT_ADAPTER_BRIDGE_INTERNAL_ERROR, new C6595a(IronSourceConstants.TROUBLESHOOTING_ADAPTER_BRIDGE_INTERNAL_ERROR, IronSourceConstants.TROUBLESHOOTING_ADAPTER_BRIDGE_INTERNAL_ERROR));
        this.f17109k.put(C6592b.TROUBLESHOOT_ADAPTER_REPOSITORY_INTERNAL_ERROR, new C6595a(IronSourceConstants.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR, IronSourceConstants.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR));
        this.f17109k.put(C6592b.TROUBLESHOOT_AUCTION_SUCCESSFUL_RECOVERY_ERROR, new C6595a(IronSourceConstants.TROUBLESHOOTING_AUCTION_SUCCESSFUL_RECOVERY_ERROR, IronSourceConstants.TROUBLESHOOTING_AUCTION_SUCCESSFUL_RECOVERY_ERROR));
        this.f17109k.put(C6592b.TROUBLESHOOT_NOTIFICATION_ERROR, new C6595a(IronSourceConstants.TROUBLESHOOTING_IS_NOTIFICATIONS_ERROR, -1));
        HashMap hashMap2 = new HashMap();
        this.f17110l = hashMap2;
        hashMap2.put(C6592b.INIT_STARTED, new C6595a(IronSourceConstants.RV_MANAGER_INIT_STARTED, -1));
        this.f17110l.put(C6592b.INIT_ENDED, new C6595a(IronSourceConstants.RV_MANAGER_INIT_ENDED, -1));
        this.f17110l.put(C6592b.SESSION_CAPPED, new C6595a(-1, IronSourceConstants.RV_CAP_SESSION));
        this.f17110l.put(C6592b.PLACEMENT_CAPPED, new C6595a(IronSourceConstants.RV_CAP_PLACEMENT, -1));
        this.f17110l.put(C6592b.AUCTION_REQUEST, new C6595a(IronSourceConstants.RV_AUCTION_REQUEST, -1));
        this.f17110l.put(C6592b.AUCTION_SUCCESS, new C6595a(IronSourceConstants.RV_AUCTION_SUCCESS, -1));
        this.f17110l.put(C6592b.AUCTION_FAILED, new C6595a(IronSourceConstants.RV_AUCTION_FAILED, -1));
        this.f17110l.put(C6592b.AUCTION_REQUEST_WATERFALL, new C6595a(IronSourceConstants.RV_AUCTION_REQUEST_WATERFALL, -1));
        this.f17110l.put(C6592b.AUCTION_RESULT_WATERFALL, new C6595a(IronSourceConstants.RV_AUCTION_RESPONSE_WATERFALL, -1));
        this.f17110l.put(C6592b.INIT_SUCCESS, new C6595a(-1, -1));
        this.f17110l.put(C6592b.INIT_FAILED, new C6595a(-1, -1));
        this.f17110l.put(C6592b.AD_VISIBLE, new C6595a(-1, IronSourceConstants.RV_INSTANCE_VISIBLE));
        this.f17110l.put(C6592b.AD_OPENED, new C6595a(-1, 1005));
        this.f17110l.put(C6592b.AD_CLOSED, new C6595a(-1, IronSourceConstants.RV_INSTANCE_CLOSED));
        this.f17110l.put(C6592b.AD_STARTED, new C6595a(-1, IronSourceConstants.RV_INSTANCE_STARTED));
        this.f17110l.put(C6592b.AD_ENDED, new C6595a(-1, IronSourceConstants.RV_INSTANCE_ENDED));
        this.f17110l.put(C6592b.AD_CLICKED, new C6595a(-1, 1006));
        this.f17110l.put(C6592b.AD_REWARDED, new C6595a(-1, 1010));
        this.f17110l.put(C6592b.AD_AVAILABILITY_CHANGED_TRUE, new C6595a(IronSourceConstants.RV_CALLBACK_AVAILABILITY_TRUE, IronSourceConstants.RV_INSTANCE_AVAILABILITY_TRUE));
        this.f17110l.put(C6592b.AD_AVAILABILITY_CHANGED_FALSE, new C6595a(IronSourceConstants.RV_CALLBACK_AVAILABILITY_FALSE, IronSourceConstants.RV_INSTANCE_AVAILABILITY_FALSE));
        this.f17110l.put(C6592b.LOAD_AD, new C6595a(1000, 1001));
        this.f17110l.put(C6592b.LOAD_AD_SUCCESS, new C6595a(1003, 1002));
        this.f17110l.put(C6592b.LOAD_AD_FAILED, new C6595a(-1, IronSourceConstants.RV_INSTANCE_LOAD_FAILED));
        this.f17110l.put(C6592b.LOAD_AD_FAILED_WITH_REASON, new C6595a(IronSourceConstants.RV_MEDIATION_LOAD_ERROR, IronSourceConstants.RV_INSTANCE_LOAD_FAILED_REASON));
        this.f17110l.put(C6592b.LOAD_AD_NO_FILL, new C6595a(-1, IronSourceConstants.RV_INSTANCE_LOAD_NO_FILL));
        this.f17110l.put(C6592b.SHOW_AD, new C6595a(IronSourceConstants.RV_API_SHOW_CALLED, IronSourceConstants.RV_INSTANCE_SHOW));
        this.f17110l.put(C6592b.SHOW_AD_CHANCE, new C6595a(-1, IronSourceConstants.RV_INSTANCE_SHOW_CHANCE));
        this.f17110l.put(C6592b.SHOW_AD_FAILED, new C6595a(IronSourceConstants.RV_CALLBACK_SHOW_FAILED, IronSourceConstants.RV_INSTANCE_SHOW_FAILED));
        this.f17110l.put(C6592b.AD_UNIT_CAPPED, new C6595a(IronSourceConstants.RV_AD_UNIT_CAPPED, -1));
        this.f17110l.put(C6592b.TROUBLESHOOT_NETWORK_ADAPTER_NOT_AVAILABLE, new C6595a(IronSourceConstants.TROUBLESHOOTING_RV_NETWORK_ADAPTER_NOT_AVAILABLE, IronSourceConstants.TROUBLESHOOTING_RV_NETWORK_ADAPTER_NOT_AVAILABLE));
        this.f17110l.put(C6592b.TROUBLESHOOT_AD_ADAPTER_NOT_AVAILABLE, new C6595a(IronSourceConstants.TROUBLESHOOTING_RV_AD_ADAPTER_NOT_AVAILABLE, IronSourceConstants.TROUBLESHOOTING_RV_AD_ADAPTER_NOT_AVAILABLE));
        this.f17110l.put(C6592b.TROUBLESHOOT_PROVIDER_SETTINGS_MISSING, new C6595a(IronSourceConstants.TROUBLESHOOTING_RV_PROVIDER_SETTINGS_MISSING, IronSourceConstants.TROUBLESHOOTING_RV_PROVIDER_SETTINGS_MISSING));
        this.f17110l.put(C6592b.TROUBLESHOOT_BIDDING_DATA_MISSING, new C6595a(IronSourceConstants.TROUBLESHOOTING_RV_BIDDING_DATA_MISSING, IronSourceConstants.TROUBLESHOOTING_RV_BIDDING_DATA_MISSING));
        this.f17110l.put(C6592b.TROUBLESHOOT_UNEXPECTED_INIT_SUCCESS, new C6595a(IronSourceConstants.TROUBLESHOOTING_RV_UNEXPECTED_INIT_SUCCESS, IronSourceConstants.TROUBLESHOOTING_RV_UNEXPECTED_INIT_SUCCESS));
        this.f17110l.put(C6592b.TROUBLESHOOT_UNEXPECTED_INIT_FAILED, new C6595a(IronSourceConstants.TROUBLESHOOTING_RV_UNEXPECTED_INIT_FAILED, IronSourceConstants.TROUBLESHOOTING_RV_UNEXPECTED_INIT_FAILED));
        this.f17110l.put(C6592b.TROUBLESHOOT_UNEXPECTED_AUCTION_SUCCESS, new C6595a(IronSourceConstants.TROUBLESHOOTING_RV_UNEXPECTED_AUCTION_SUCCESS, IronSourceConstants.TROUBLESHOOTING_RV_UNEXPECTED_AUCTION_SUCCESS));
        this.f17110l.put(C6592b.TROUBLESHOOT_UNEXPECTED_AUCTION_FAILED, new C6595a(IronSourceConstants.TROUBLESHOOTING_RV_UNEXPECTED_AUCTION_FAILED, IronSourceConstants.TROUBLESHOOTING_RV_UNEXPECTED_AUCTION_FAILED));
        this.f17110l.put(C6592b.TROUBLESHOOT_UNEXPECTED_LOAD_SUCCESS, new C6595a(IronSourceConstants.TROUBLESHOOTING_RV_UNEXPECTED_LOAD_SUCCESS, IronSourceConstants.TROUBLESHOOTING_RV_UNEXPECTED_LOAD_SUCCESS));
        this.f17110l.put(C6592b.TROUBLESHOOT_UNEXPECTED_LOAD_FAILED, new C6595a(IronSourceConstants.TROUBLESHOOTING_RV_UNEXPECTED_LOAD_FAILED, IronSourceConstants.TROUBLESHOOTING_RV_UNEXPECTED_LOAD_FAILED));
        this.f17110l.put(C6592b.TROUBLESHOOT_UNEXPECTED_SHOW_FAILED, new C6595a(IronSourceConstants.TROUBLESHOOTING_RV_UNEXPECTED_SHOW_FAILED, IronSourceConstants.TROUBLESHOOTING_RV_UNEXPECTED_SHOW_FAILED));
        this.f17110l.put(C6592b.TROUBLESHOOT_UNEXPECTED_TIMEOUT, new C6595a(IronSourceConstants.TROUBLESHOOTING_RV_UNEXPECTED_TIMEOUT, IronSourceConstants.TROUBLESHOOTING_RV_UNEXPECTED_TIMEOUT));
        this.f17110l.put(C6592b.TROUBLESHOOT_UNEXPECTED_CLOSED, new C6595a(IronSourceConstants.TROUBLESHOOTING_RV_UNEXPECTED_CLOSED, IronSourceConstants.TROUBLESHOOTING_RV_UNEXPECTED_CLOSED));
        this.f17110l.put(C6592b.TROUBLESHOOT_UNEXPECTED_TIMEOUT, new C6595a(IronSourceConstants.TROUBLESHOOTING_RV_UNEXPECTED_TIMEOUT, IronSourceConstants.TROUBLESHOOTING_RV_UNEXPECTED_TIMEOUT));
        this.f17110l.put(C6592b.TROUBLESHOOT_UNEXPECTED_TIMEOUT, new C6595a(IronSourceConstants.TROUBLESHOOTING_RV_UNEXPECTED_TIMEOUT, IronSourceConstants.TROUBLESHOOTING_RV_UNEXPECTED_TIMEOUT));
        this.f17110l.put(C6592b.TROUBLESHOOT_LOAD_FAILED, new C6595a(IronSourceConstants.TROUBLESHOOTING_RV_LOAD_FAILED, IronSourceConstants.TROUBLESHOOTING_RV_LOAD_FAILED));
        this.f17110l.put(C6592b.TROUBLESHOOT_INTERNAL_ERROR, new C6595a(IronSourceConstants.TROUBLESHOOTING_RV_INTERNAL_ERROR, IronSourceConstants.TROUBLESHOOTING_RV_INTERNAL_ERROR));
        this.f17110l.put(C6592b.TROUBLESHOOT_ADAPTER_BRIDGE_INTERNAL_ERROR, new C6595a(IronSourceConstants.TROUBLESHOOTING_ADAPTER_BRIDGE_INTERNAL_ERROR, IronSourceConstants.TROUBLESHOOTING_ADAPTER_BRIDGE_INTERNAL_ERROR));
        this.f17110l.put(C6592b.TROUBLESHOOT_ADAPTER_REPOSITORY_INTERNAL_ERROR, new C6595a(IronSourceConstants.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR, IronSourceConstants.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR));
        this.f17110l.put(C6592b.TROUBLESHOOTING_WATERFALL_OVERHEAD, new C6595a(IronSourceConstants.TROUBLESHOOTING_RV_WATERFALL_OVERHEAD, IronSourceConstants.TROUBLESHOOTING_RV_WATERFALL_OVERHEAD));
        this.f17110l.put(C6592b.TROUBLESHOOT_NOTIFICATION_ERROR, new C6595a(IronSourceConstants.TROUBLESHOOTING_RV_NOTIFICATIONS_ERROR, -1));
        this.f17099a = new C6599g(this);
        this.f17100b = new C6600h(this);
        this.f17101c = new C6597e(this);
        this.f17102d = new C6591a(this);
        this.f17103e = new C6601i(this);
    }

    /* renamed from: a */
    private int m20049a(C6592b bVar) {
        try {
            if (IronSource.AD_UNIT.INTERSTITIAL.equals(this.f17105g) && this.f17109k.containsKey(bVar)) {
                return this.f17109k.get(bVar).mo36511a(this.f17106h);
            }
            if (!IronSource.AD_UNIT.REWARDED_VIDEO.equals(this.f17105g) || !this.f17110l.containsKey(bVar)) {
                return -1;
            }
            return this.f17110l.get(bVar).mo36511a(this.f17106h);
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
    }

    /* renamed from: a */
    public final void mo36508a() {
        this.f17107i = null;
        this.f17101c = null;
        this.f17099a = null;
        this.f17100b = null;
        this.f17102d = null;
        this.f17103e = null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo36509a(C6592b bVar, Map<String, Object> map) {
        mo36510a(bVar, map, System.currentTimeMillis());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo36510a(C6592b bVar, Map<String, Object> map, long j) {
        int a = m20049a(bVar);
        if (-1 != a) {
            if (map == null) {
                map = new HashMap<>();
            }
            C6593c cVar = this.f17107i;
            if (cVar != null) {
                map.putAll(cVar.mo36507a(bVar));
            }
            this.f17108j.mo36371b(new C6552c(a, j, new JSONObject(map)));
        }
    }
}

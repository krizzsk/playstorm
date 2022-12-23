package com.tapjoy;

import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.Constants;
import com.tapjoy.TapjoyErrorMessage;
import com.tapjoy.internal.C11637fp;
import com.tapjoy.internal.C11644fs;
import com.tapjoy.internal.C11652fy;
import com.tapjoy.internal.C11675gh;
import com.tapjoy.internal.C11676gi;
import com.tapjoy.internal.C11703hc;
import com.tapjoy.internal.C11706hf;
import com.tapjoy.internal.C11714hj;
import com.tapjoy.internal.C11728ho;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class TJPlacement {

    /* renamed from: a */
    TJPlacementListener f27410a;

    /* renamed from: b */
    private TJCorePlacement f27411b;

    /* renamed from: c */
    private TJPlacementListener f27412c;

    /* renamed from: d */
    private TJPlacementVideoListener f27413d;

    /* renamed from: e */
    private String f27414e;
    public String pushId;

    @Deprecated
    public TJPlacement(Context context, String str, TJPlacementListener tJPlacementListener) {
        TJCorePlacement a = TJPlacementManager.m33111a(str);
        a = a == null ? TJPlacementManager.m33112a(str, "", "", false, false) : a;
        a.setContext(context);
        m33109a(a, tJPlacementListener);
    }

    TJPlacement(TJCorePlacement tJCorePlacement, TJPlacementListener tJPlacementListener) {
        m33109a(tJCorePlacement, tJPlacementListener);
    }

    /* renamed from: a */
    private void m33109a(TJCorePlacement tJCorePlacement, TJPlacementListener tJPlacementListener) {
        this.f27411b = tJCorePlacement;
        this.f27414e = UUID.randomUUID().toString();
        this.f27412c = tJPlacementListener;
        this.f27410a = tJPlacementListener != null ? (TJPlacementListener) C11637fp.m33802a(tJPlacementListener, TJPlacementListener.class) : null;
        FiveRocksIntegration.addPlacementCallback(getName(), this);
    }

    public TJPlacementListener getListener() {
        return this.f27412c;
    }

    public void setVideoListener(TJPlacementVideoListener tJPlacementVideoListener) {
        this.f27413d = tJPlacementVideoListener;
    }

    public TJPlacementVideoListener getVideoListener() {
        return this.f27413d;
    }

    public String getName() {
        return this.f27411b.getPlacementData() != null ? this.f27411b.getPlacementData().getPlacementName() : "";
    }

    public boolean isLimited() {
        return this.f27411b.isLimited();
    }

    public boolean isContentReady() {
        boolean isContentReady = this.f27411b.isContentReady();
        C11652fy fyVar = this.f27411b.f27348f;
        if (isContentReady) {
            fyVar.mo72522a(4);
        } else {
            fyVar.mo72522a(2);
        }
        return isContentReady;
    }

    public boolean isContentAvailable() {
        this.f27411b.f27348f.mo72522a(1);
        return this.f27411b.isContentAvailable();
    }

    public void setMediationId(String str) {
        this.f27411b.f27359q = str;
    }

    public void requestContent() {
        boolean z;
        String name = getName();
        TapjoyLog.m33197i("TJPlacement", "requestContent() called for placement ".concat(String.valueOf(name)));
        C11676gi.m33878a("TJPlacement.requestContent").mo72567a("placement", (Object) name).mo72567a("placement_type", (Object) this.f27411b.f27345c.getPlacementType());
        if (C11675gh.m33868a() != null && TextUtils.isEmpty(C11675gh.m33868a().f28399a)) {
            TapjoyLog.m33199w("TJPlacement", "[INFO] Your application calls requestContent without having previously called setUserConsent. You can review Tapjoy supported consent API here - https://dev.tapjoy.com/sdk-integration/#sdk11122_gdpr_release.");
        }
        if (!isLimited()) {
            z = TapjoyConnectCore.isConnected();
        } else {
            z = TapjoyConnectCore.isLimitedConnected();
        }
        boolean z2 = false;
        if (!z) {
            C11676gi.m33885b("TJPlacement.requestContent").mo72570b("not connected").mo72572c();
            m33110a(new TJError(0, "SDK not connected -- connect must be called first with a successful callback"));
        } else if (this.f27411b.getContext() == null) {
            C11676gi.m33885b("TJPlacement.requestContent").mo72570b("no context").mo72572c();
            m33110a(new TJError(0, "Context is null -- TJPlacement requires a valid Context."));
        } else if (TextUtils.isEmpty(name)) {
            C11676gi.m33885b("TJPlacement.requestContent").mo72570b("invalid name").mo72572c();
            m33110a(new TJError(0, "Invalid placement name -- TJPlacement requires a valid placement name."));
        } else {
            try {
                TJCorePlacement tJCorePlacement = this.f27411b;
                tJCorePlacement.mo71879a("REQUEST", this);
                if (tJCorePlacement.f27347e - SystemClock.elapsedRealtime() > 0) {
                    TapjoyLog.m33194d(TJCorePlacement.f27342a, "Content has not expired yet for " + tJCorePlacement.f27345c.getPlacementName());
                    if (tJCorePlacement.f27354l) {
                        C11676gi.m33885b("TJPlacement.requestContent").mo72567a(FirebaseAnalytics.Param.CONTENT_TYPE, (Object) tJCorePlacement.mo71881b()).mo72567a(Constants.MessagePayloadKeys.FROM, (Object) "cache").mo72572c();
                        tJCorePlacement.f27353k = false;
                        tJCorePlacement.mo71877a(this);
                        tJCorePlacement.mo71882c();
                    } else {
                        C11676gi.m33885b("TJPlacement.requestContent").mo72567a(FirebaseAnalytics.Param.CONTENT_TYPE, (Object) "none").mo72567a(Constants.MessagePayloadKeys.FROM, (Object) "cache").mo72572c();
                        tJCorePlacement.mo71877a(this);
                    }
                } else {
                    if (tJCorePlacement.f27354l) {
                        C11676gi.m33887c("TJPlacement.requestContent").mo72567a("was_available", (Object) Boolean.TRUE);
                    }
                    if (tJCorePlacement.f27355m) {
                        C11676gi.m33887c("TJPlacement.requestContent").mo72567a("was_ready", (Object) Boolean.TRUE);
                    }
                    if (!TextUtils.isEmpty(tJCorePlacement.f27358p)) {
                        HashMap hashMap = new HashMap();
                        hashMap.put(TJAdUnitConstants.PARAM_PLACEMENT_MEDIATION_AGENT, tJCorePlacement.f27358p);
                        hashMap.put(TJAdUnitConstants.PARAM_PLACEMENT_MEDIATION_ID, tJCorePlacement.f27359q);
                        if (tJCorePlacement.f27360r != null && !tJCorePlacement.f27360r.isEmpty()) {
                            z2 = true;
                        }
                        if (z2) {
                            for (String next : tJCorePlacement.f27360r.keySet()) {
                                hashMap.put(TJAdUnitConstants.AUCTION_PARAM_PREFIX.concat(String.valueOf(next)), tJCorePlacement.f27360r.get(next));
                            }
                            tJCorePlacement.mo71880a(tJCorePlacement.f27345c.getAuctionMediationURL(), (Map<String, String>) hashMap);
                        } else {
                            tJCorePlacement.mo71880a(tJCorePlacement.f27345c.getMediationURL(), (Map<String, String>) hashMap);
                        }
                    } else {
                        tJCorePlacement.mo71876a();
                    }
                }
            } finally {
                C11676gi.m33888d("TJPlacement.requestContent");
            }
        }
    }

    public void showContent() {
        int i;
        TapjoyLog.m33197i("TJPlacement", "showContent() called for placement ".concat(String.valueOf(getName())));
        TJCorePlacement tJCorePlacement = this.f27411b;
        C11676gi.m33878a("TJPlacement.showContent").mo72567a("placement", (Object) tJCorePlacement.f27345c.getPlacementName()).mo72567a("placement_type", (Object) tJCorePlacement.f27345c.getPlacementType()).mo72567a(FirebaseAnalytics.Param.CONTENT_TYPE, (Object) tJCorePlacement.mo71881b());
        C11652fy fyVar = tJCorePlacement.f27348f;
        fyVar.mo72522a(8);
        C11644fs fsVar = fyVar.f28331a;
        if (fsVar != null) {
            fsVar.mo72513a();
        }
        if (!this.f27411b.isContentAvailable()) {
            TapjoyLog.m33195e("TJPlacement", new TapjoyErrorMessage(TapjoyErrorMessage.ErrorType.INTEGRATION_ERROR, "No placement content available. Can not show content for non-200 placement."));
            C11676gi.m33885b("TJPlacement.showContent").mo72570b("no content").mo72572c();
            return;
        }
        try {
            TJCorePlacement tJCorePlacement2 = this.f27411b;
            if (TapjoyConnectCore.isFullScreenViewOpen()) {
                TapjoyLog.m33199w(TJCorePlacement.f27342a, "Only one view can be presented at a time.");
                C11676gi.m33885b("TJPlacement.showContent").mo72570b("another content showing").mo72572c();
            } else {
                if (TapjoyConnectCore.isViewOpen()) {
                    TapjoyLog.m33199w(TJCorePlacement.f27342a, "Will close N2E content.");
                    TJPlacementManager.dismissContentShowing(false);
                }
                tJCorePlacement2.mo71879a("SHOW", this);
                C11676gi.C11678a d = C11676gi.m33888d("TJPlacement.showContent");
                if (tJCorePlacement2.f27349g.isPrerendered()) {
                    d.mo72567a("prerendered", (Object) Boolean.TRUE);
                }
                if (tJCorePlacement2.isContentReady()) {
                    d.mo72567a("content_ready", (Object) Boolean.TRUE);
                }
                tJCorePlacement2.f27348f.f28334d = d;
                String uuid = UUID.randomUUID().toString();
                if (tJCorePlacement2.f27351i != null) {
                    tJCorePlacement2.f27351i.f28553f = uuid;
                    if (tJCorePlacement2.f27351i == null) {
                        i = 1;
                    } else if (tJCorePlacement2.f27351i instanceof C11706hf) {
                        i = 3;
                    } else {
                        i = tJCorePlacement2.f27351i instanceof C11728ho ? 2 : 0;
                    }
                    TapjoyConnectCore.viewWillOpen(uuid, i);
                    tJCorePlacement2.f27351i.f28552e = new C11703hc(uuid) {

                        /* renamed from: a */
                        final /* synthetic */ String f27378a;

                        {
                            this.f27378a = r2;
                        }

                        /* renamed from: a */
                        public final void mo71894a(Context context, String str, String str2) {
                            if (str2 == null) {
                                TJCorePlacement.this.f27345c.setRedirectURL(str);
                            } else {
                                TJCorePlacement.this.f27345c.setBaseURL(str);
                                TJCorePlacement.this.f27345c.setHttpResponse(str2);
                            }
                            TJCorePlacement.this.f27345c.setHasProgressSpinner(true);
                            TJCorePlacement.this.f27345c.setContentViewId(this.f27378a);
                            Intent intent = new Intent(TJCorePlacement.this.f27344b, TJAdUnitActivity.class);
                            intent.putExtra(TJAdUnitConstants.EXTRA_TJ_PLACEMENT_DATA, TJCorePlacement.this.f27345c);
                            intent.setFlags(268435456);
                            context.startActivity(intent);
                        }
                    };
                    C11714hj.m34003a((Runnable) new Runnable() {
                        public final void run() {
                            TJCorePlacement.this.f27351i.mo72591a(C11714hj.m33999a().f28494o, TJCorePlacement.this.f27348f);
                        }
                    });
                } else {
                    tJCorePlacement2.f27345c.setContentViewId(uuid);
                    Intent intent = new Intent(tJCorePlacement2.f27344b, TJAdUnitActivity.class);
                    intent.putExtra(TJAdUnitConstants.EXTRA_TJ_PLACEMENT_DATA, tJCorePlacement2.f27345c);
                    intent.setFlags(268435456);
                    tJCorePlacement2.f27344b.startActivity(intent);
                }
                tJCorePlacement2.f27347e = 0;
                tJCorePlacement2.f27354l = false;
                tJCorePlacement2.f27355m = false;
            }
        } finally {
            C11676gi.m33888d("TJPlacement.showContent");
        }
    }

    public void setAuctionData(HashMap<String, String> hashMap) {
        if (hashMap == null || hashMap.isEmpty()) {
            TapjoyLog.m33194d("TJPlacement", "auctionData can not be null or empty");
            return;
        }
        TJCorePlacement tJCorePlacement = this.f27411b;
        tJCorePlacement.f27360r = hashMap;
        String e = tJCorePlacement.mo71884e();
        if (!TextUtils.isEmpty(e)) {
            tJCorePlacement.f27345c.setAuctionMediationURL(TapjoyConnectCore.getPlacementURL() + "v1/apps/" + e + "/bid_content?");
            return;
        }
        TapjoyLog.m33197i(TJCorePlacement.f27342a, "Placement auction data can not be set for a null app ID");
    }

    public void setMediationName(String str) {
        TapjoyLog.m33194d("TJPlacement", "setMediationName=".concat(String.valueOf(str)));
        if (!TextUtils.isEmpty(str)) {
            TJCorePlacement tJCorePlacement = this.f27411b;
            Context context = tJCorePlacement != null ? tJCorePlacement.getContext() : null;
            TJCorePlacement a = TJPlacementManager.m33112a(getName(), str, "", false, isLimited());
            this.f27411b = a;
            a.f27358p = str;
            a.f27356n = str;
            a.f27345c.setPlacementType(str);
            String e = a.mo71884e();
            if (!TextUtils.isEmpty(e)) {
                a.f27345c.setMediationURL(TapjoyConnectCore.getPlacementURL() + "v1/apps/" + e + "/mediation_content?");
            } else {
                TapjoyLog.m33197i(TJCorePlacement.f27342a, "Placement mediation name can not be set for a null app ID");
            }
            if (context != null) {
                this.f27411b.setContext(context);
            }
        }
    }

    public void setAdapterVersion(String str) {
        this.f27411b.f27357o = str;
    }

    public static void dismissContent() {
        TJPlacementManager.dismissContentShowing("true".equals(TapjoyConnectCore.getConnectFlagValue("TJC_OPTION_DISMISS_CONTENT_ALL")));
    }

    public String getGUID() {
        return this.f27414e;
    }

    /* renamed from: a */
    private void m33110a(TJError tJError) {
        this.f27411b.mo71878a(this, TapjoyErrorMessage.ErrorType.INTEGRATION_ERROR, tJError);
    }
}

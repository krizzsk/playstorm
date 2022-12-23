package com.fyber.inneractive.sdk.flow;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.config.C4271d0;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.interfaces.C4452a;
import com.fyber.inneractive.sdk.network.C4531b;
import com.fyber.inneractive.sdk.network.C4560n;
import com.fyber.inneractive.sdk.network.C4565o;
import com.fyber.inneractive.sdk.network.C4569q;
import com.fyber.inneractive.sdk.response.C5291e;
import com.fyber.inneractive.sdk.util.IAlog;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.fyber.inneractive.sdk.flow.d */
public class C4407d extends C4408e implements IAConfigManager.OnConfigurationReadyAndValidListener {
    /* renamed from: a */
    public void mo24572a(boolean z) {
        mo24576g();
        C4452a aVar = this.f10879c;
        if (aVar != null && z) {
            aVar.mo24566a();
            this.f10879c = null;
        }
        mo24581b();
        this.f10880d = null;
    }

    /* renamed from: d */
    public String mo24574d() {
        return IAlog.m16696a((Object) this);
    }

    /* renamed from: e */
    public void mo24575e() {
        super.mo24575e();
        mo24579a(this.f10881e, mo24582c(), InneractiveErrorCode.IN_FLIGHT_TIMEOUT);
        mo24576g();
    }

    /* renamed from: g */
    public void mo24576g() {
        IAConfigManager.removeListener(this);
        C4560n nVar = this.f10883g;
        if (nVar != null) {
            nVar.f11296e = true;
            nVar.f11294c = null;
            nVar.f11297f.f11223a = true;
            this.f10883g = null;
        }
        this.f10881e = null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x006a, code lost:
        r0 = (r0 = r0.f10750f).f10579j;
     */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00fd  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0104  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0110  */
    /* JADX WARNING: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo24577h() {
        /*
            r6 = this;
            boolean r0 = com.fyber.inneractive.sdk.external.InneractiveAdManager.wasInitialized()
            if (r0 != 0) goto L_0x001c
            com.fyber.inneractive.sdk.flow.e$b r0 = r6.f10880d
            if (r0 == 0) goto L_0x001c
            com.fyber.inneractive.sdk.external.InneractiveAdRequest r1 = r6.f10881e
            com.fyber.inneractive.sdk.response.e r2 = r6.mo24582c()
            com.fyber.inneractive.sdk.external.InneractiveInfrastructureError r3 = new com.fyber.inneractive.sdk.external.InneractiveInfrastructureError
            com.fyber.inneractive.sdk.external.InneractiveErrorCode r4 = com.fyber.inneractive.sdk.external.InneractiveErrorCode.SDK_NOT_INITIALIZED
            r3.<init>(r4)
            com.fyber.inneractive.sdk.flow.n r0 = (com.fyber.inneractive.sdk.flow.C4427n) r0
            r0.mo24618a(r1, r2, r3)
        L_0x001c:
            com.fyber.inneractive.sdk.external.InneractiveAdRequest r0 = r6.f10881e
            java.lang.String r0 = r0.getSpotId()
            com.fyber.inneractive.sdk.config.x r0 = com.fyber.inneractive.sdk.config.C4261a.m13436a(r0)
            com.fyber.inneractive.sdk.response.e r1 = r6.mo24582c()
            r2 = 0
            if (r0 == 0) goto L_0x004a
            boolean r3 = r0.f10744b
            if (r3 != 0) goto L_0x004a
            r6.mo24573a(r2, r1)
            com.fyber.inneractive.sdk.flow.e$b r0 = r6.f10880d
            com.fyber.inneractive.sdk.external.InneractiveAdRequest r1 = r6.f10881e
            com.fyber.inneractive.sdk.response.e r2 = r6.mo24582c()
            com.fyber.inneractive.sdk.external.InneractiveInfrastructureError r3 = new com.fyber.inneractive.sdk.external.InneractiveInfrastructureError
            com.fyber.inneractive.sdk.external.InneractiveErrorCode r4 = com.fyber.inneractive.sdk.external.InneractiveErrorCode.SPOT_DISABLED
            r3.<init>(r4)
            com.fyber.inneractive.sdk.flow.n r0 = (com.fyber.inneractive.sdk.flow.C4427n) r0
            r0.mo24618a(r1, r2, r3)
            goto L_0x0155
        L_0x004a:
            r3 = 1
            if (r0 == 0) goto L_0x0114
            java.util.List<com.fyber.inneractive.sdk.config.y> r4 = r0.f10743a
            java.util.Iterator r4 = r4.iterator()
            boolean r4 = r4.hasNext()
            if (r4 == 0) goto L_0x0114
            java.util.List<com.fyber.inneractive.sdk.config.y> r0 = r0.f10743a
            java.lang.Object r0 = r0.get(r2)
            com.fyber.inneractive.sdk.config.y r0 = (com.fyber.inneractive.sdk.config.C4345y) r0
            com.fyber.inneractive.sdk.config.r r1 = r0.f10747c
            if (r1 == 0) goto L_0x0066
            goto L_0x0074
        L_0x0066:
            com.fyber.inneractive.sdk.config.a0 r0 = r0.f10750f
            if (r0 == 0) goto L_0x0076
            com.fyber.inneractive.sdk.config.enums.UnitDisplayType r0 = r0.f10579j
            com.fyber.inneractive.sdk.config.enums.UnitDisplayType r1 = com.fyber.inneractive.sdk.config.enums.UnitDisplayType.INTERSTITIAL
            if (r0 == r1) goto L_0x0074
            com.fyber.inneractive.sdk.config.enums.UnitDisplayType r1 = com.fyber.inneractive.sdk.config.enums.UnitDisplayType.REWARDED
            if (r0 != r1) goto L_0x0076
        L_0x0074:
            r0 = r3
            goto L_0x0077
        L_0x0076:
            r0 = r2
        L_0x0077:
            if (r0 != 0) goto L_0x008f
            com.fyber.inneractive.sdk.flow.e$b r0 = r6.f10880d
            com.fyber.inneractive.sdk.external.InneractiveAdRequest r1 = r6.f10881e
            com.fyber.inneractive.sdk.response.e r2 = r6.mo24582c()
            com.fyber.inneractive.sdk.external.InneractiveInfrastructureError r3 = new com.fyber.inneractive.sdk.external.InneractiveInfrastructureError
            com.fyber.inneractive.sdk.external.InneractiveErrorCode r4 = com.fyber.inneractive.sdk.external.InneractiveErrorCode.UNSUPPORTED_SPOT
            r3.<init>(r4)
            com.fyber.inneractive.sdk.flow.n r0 = (com.fyber.inneractive.sdk.flow.C4427n) r0
            r0.mo24618a(r1, r2, r3)
            goto L_0x0155
        L_0x008f:
            com.fyber.inneractive.sdk.config.global.s r0 = new com.fyber.inneractive.sdk.config.global.s
            r0.<init>()
            r6.f10882f = r0
            com.fyber.inneractive.sdk.external.InneractiveAdRequest r1 = r6.f10881e
            java.lang.String r1 = r1.getSpotId()
            r0.mo24341a((java.lang.String) r1)
            com.fyber.inneractive.sdk.network.n r0 = new com.fyber.inneractive.sdk.network.n
            com.fyber.inneractive.sdk.external.InneractiveAdRequest r1 = r6.f10881e
            java.lang.String r4 = r1.f10864b
            com.fyber.inneractive.sdk.config.global.s r5 = r6.f10882f
            r0.<init>(r1, r4, r5, r6)
            r6.f10883g = r0
            r0.f11296e = r2
            java.lang.Object[] r1 = new java.lang.Object[r2]
            java.lang.String r4 = "IARemoteAdFetcher: requestAd called"
            com.fyber.inneractive.sdk.util.IAlog.m16699a(r4, r1)
            com.fyber.inneractive.sdk.external.InneractiveAdRequest r1 = r0.f11292a
            if (r1 == 0) goto L_0x00cb
            java.lang.String r1 = r1.getSpotId()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L_0x00cb
            java.lang.Object[] r1 = new java.lang.Object[r2]
            java.lang.String r4 = "appID is null or empty. Please provide a valid appID and re-try."
            com.fyber.inneractive.sdk.util.IAlog.m16700b(r4, r1)
            goto L_0x00da
        L_0x00cb:
            java.lang.String r1 = "android.permission.INTERNET"
            boolean r1 = com.fyber.inneractive.sdk.util.C5350l.m16763b((java.lang.String) r1)
            if (r1 != 0) goto L_0x00dc
            java.lang.Object[] r1 = new java.lang.Object[r2]
            java.lang.String r4 = "INTERNET permission is missing. Please add it to the Manifest and re-try, otherwise ads will not be requested and displayed! "
            com.fyber.inneractive.sdk.util.IAlog.m16700b(r4, r1)
        L_0x00da:
            r1 = r2
            goto L_0x00fb
        L_0x00dc:
            java.lang.String r1 = "android.permission.ACCESS_NETWORK_STATE"
            boolean r1 = com.fyber.inneractive.sdk.util.C5350l.m16763b((java.lang.String) r1)
            if (r1 != 0) goto L_0x00eb
            java.lang.Object[] r1 = new java.lang.Object[r2]
            java.lang.String r4 = "It is recommended to add ACCESS_NETWORK_STATE permission to the Manifest for better targetting"
            com.fyber.inneractive.sdk.util.IAlog.m16700b(r4, r1)
        L_0x00eb:
            java.lang.String r1 = "android.permission.READ_PHONE_STATE"
            boolean r1 = com.fyber.inneractive.sdk.util.C5350l.m16763b((java.lang.String) r1)
            if (r1 != 0) goto L_0x00fa
            java.lang.Object[] r1 = new java.lang.Object[r2]
            java.lang.String r4 = "It is recomended to add the READ_PHONE_STATE permission to the manifest for better targetting"
            com.fyber.inneractive.sdk.util.IAlog.m16703e(r4, r1)
        L_0x00fa:
            r1 = r3
        L_0x00fb:
            if (r1 != 0) goto L_0x0104
            com.fyber.inneractive.sdk.external.InneractiveErrorCode r1 = com.fyber.inneractive.sdk.external.InneractiveErrorCode.INVALID_INPUT
            r3 = 0
            r0.mo24763a(r1, r3)
            goto L_0x010e
        L_0x0104:
            com.fyber.inneractive.sdk.config.IAConfigManager r1 = com.fyber.inneractive.sdk.config.IAConfigManager.f10525J
            com.fyber.inneractive.sdk.network.w r1 = r1.f10555t
            com.fyber.inneractive.sdk.network.c0 r0 = r0.f11297f
            r1.mo24781c(r0)
            r2 = r3
        L_0x010e:
            if (r2 == 0) goto L_0x0155
            r6.mo24583f()
            goto L_0x0155
        L_0x0114:
            if (r0 != 0) goto L_0x011c
            r6.mo24573a(r3, r1)
            com.fyber.inneractive.sdk.config.IAConfigManager.m13428a()
        L_0x011c:
            java.lang.Object[] r0 = new java.lang.Object[r2]
            java.lang.String r4 = "************************************************************************************************************************"
            com.fyber.inneractive.sdk.util.IAlog.m16703e(r4, r0)
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            com.fyber.inneractive.sdk.external.InneractiveAdRequest r5 = r6.f10881e
            java.lang.String r5 = r5.getSpotId()
            r0[r2] = r5
            com.fyber.inneractive.sdk.config.IAConfigManager r5 = com.fyber.inneractive.sdk.config.IAConfigManager.f10525J
            java.lang.String r5 = r5.f10538c
            r0[r3] = r5
            java.lang.String r3 = "*** Requested spot id '%s' doesn't exist within this application config - application Id: '%s'"
            com.fyber.inneractive.sdk.util.IAlog.m16703e(r3, r0)
            java.lang.Object[] r0 = new java.lang.Object[r2]
            java.lang.String r3 = "*** Are you sure that you are using the correct application and spot ids, as defined for this application in the Inneractive console?"
            com.fyber.inneractive.sdk.util.IAlog.m16703e(r3, r0)
            java.lang.Object[] r0 = new java.lang.Object[r2]
            com.fyber.inneractive.sdk.util.IAlog.m16703e(r4, r0)
            com.fyber.inneractive.sdk.flow.e$b r0 = r6.f10880d
            com.fyber.inneractive.sdk.external.InneractiveAdRequest r2 = r6.f10881e
            com.fyber.inneractive.sdk.external.InneractiveInfrastructureError r3 = new com.fyber.inneractive.sdk.external.InneractiveInfrastructureError
            com.fyber.inneractive.sdk.external.InneractiveErrorCode r4 = com.fyber.inneractive.sdk.external.InneractiveErrorCode.ERROR_CONFIGURATION_NO_SUCH_SPOT
            r3.<init>(r4)
            com.fyber.inneractive.sdk.flow.n r0 = (com.fyber.inneractive.sdk.flow.C4427n) r0
            r0.mo24618a(r2, r1, r3)
        L_0x0155:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.flow.C4407d.mo24577h():void");
    }

    public void onConfigurationReadyAndValid(IAConfigManager iAConfigManager, boolean z, Exception exc) {
        InneractiveErrorCode inneractiveErrorCode;
        IAConfigManager.removeListener(this);
        if (z) {
            mo24577h();
            return;
        }
        InneractiveAdRequest inneractiveAdRequest = this.f10881e;
        C5291e c = mo24582c();
        if (exc instanceof C4531b) {
            inneractiveErrorCode = InneractiveErrorCode.CONNECTION_ERROR;
        } else {
            inneractiveErrorCode = InneractiveErrorCode.SDK_NOT_INITIALIZED_OR_CONFIG_ERROR;
        }
        mo24579a(inneractiveAdRequest, c, inneractiveErrorCode);
    }

    /* renamed from: a */
    public final void mo24573a(boolean z, C5291e eVar) {
        String str;
        String spotId = this.f10881e.getSpotId();
        IAConfigManager iAConfigManager = IAConfigManager.f10525J;
        String str2 = iAConfigManager.f10559x.f10603c.get("KEY_MISSMATCH_STATS_SPOTS");
        if (TextUtils.isEmpty(str2)) {
            str2 = "";
        }
        if (!str2.contains(String.format("-%s-", new Object[]{spotId}))) {
            C4569q.C4570a aVar = new C4569q.C4570a(C4565o.MISSMATCH_SPOTID, this.f10881e, eVar, (JSONArray) null);
            if (z) {
                str = String.format("There is no %s spot ID in current app config", new Object[]{spotId});
            } else {
                str = String.format("spot ID %s is not active in current app config", new Object[]{spotId});
            }
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(IronSourceConstants.EVENTS_ERROR_REASON, str);
            } catch (Exception unused) {
                IAlog.m16703e("Got exception adding param to json object: %s, %s", IronSourceConstants.EVENTS_ERROR_REASON, str);
            }
            aVar.f11368f.put(jSONObject);
            aVar.mo24768a((String) null);
            C4271d0 d0Var = iAConfigManager.f10559x;
            d0Var.f10603c.put("KEY_MISSMATCH_STATS_SPOTS", String.format("%s -%s-", new Object[]{str2, spotId}));
        }
    }
}

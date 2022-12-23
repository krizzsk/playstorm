package com.fyber.inneractive.sdk.flow;

import android.os.Looper;
import android.text.TextUtils;
import com.fyber.inneractive.sdk.bidder.adm.C4221a;
import com.fyber.inneractive.sdk.bidder.adm.C4226e;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.external.InneractiveAdManager;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.external.InneractiveAdSpotManager;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.external.InneractiveFullscreenUnitController;
import com.fyber.inneractive.sdk.external.InneractiveInfrastructureError;
import com.fyber.inneractive.sdk.external.InneractiveMediationName;
import com.fyber.inneractive.sdk.external.InneractiveUnitController;
import com.fyber.inneractive.sdk.flow.C4408e;
import com.fyber.inneractive.sdk.metrics.C4473c;
import com.fyber.inneractive.sdk.network.C4565o;
import com.fyber.inneractive.sdk.network.C4569q;
import com.fyber.inneractive.sdk.response.C5291e;
import com.fyber.inneractive.sdk.util.C5357n;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.fyber.inneractive.sdk.flow.m */
public class C4423m implements C4429p, C4438v {

    /* renamed from: a */
    public final String f10932a;

    /* renamed from: b */
    public InneractiveAdSpot.RequestListener f10933b;

    /* renamed from: c */
    public InneractiveAdRequest f10934c;

    /* renamed from: d */
    public C4408e.C4410b f10935d;

    /* renamed from: e */
    public C4419j f10936e;

    /* renamed from: f */
    public C4449x f10937f;

    /* renamed from: g */
    public Set<C4449x> f10938g;

    /* renamed from: h */
    public C4407d f10939h;

    /* renamed from: i */
    public C4426c f10940i;

    /* renamed from: j */
    public boolean f10941j = true;

    /* renamed from: k */
    public boolean f10942k = false;

    /* renamed from: l */
    public C4411f f10943l;

    /* renamed from: com.fyber.inneractive.sdk.flow.m$a */
    public class C4424a implements C4226e.C4227a {

        /* renamed from: a */
        public final /* synthetic */ C4226e f10944a;

        /* renamed from: b */
        public final /* synthetic */ String f10945b;

        public C4424a(C4226e eVar, String str) {
            this.f10944a = eVar;
            this.f10945b = str;
        }

        /* renamed from: a */
        public void mo24616a(Exception exc, InneractiveErrorCode inneractiveErrorCode, C5291e... eVarArr) {
            C4565o oVar;
            C5291e eVar = eVarArr.length > 0 ? eVarArr[0] : null;
            C4408e.C4410b bVar = C4423m.this.f10935d;
            if (bVar != null) {
                ((C4427n) bVar).mo24618a((InneractiveAdRequest) null, eVar, new InneractiveInfrastructureError(inneractiveErrorCode));
            }
            C4423m mVar = C4423m.this;
            String str = this.f10945b;
            mVar.getClass();
            if (inneractiveErrorCode.equals(InneractiveErrorCode.CONNECTION_ERROR)) {
                oVar = C4565o.FATAL_ADM_MARKUP_FETCHING_ERROR;
            } else {
                oVar = C4565o.FATAL_ADM_PARSING_ERROR;
            }
            if (eVar != null) {
                eVar.f14065A = false;
            }
            C4569q.C4570a aVar = new C4569q.C4570a(eVar);
            aVar.f11364b = oVar;
            aVar.f11363a = null;
            aVar.f11366d = null;
            JSONObject jSONObject = new JSONObject();
            String name = exc.getClass().getName();
            try {
                jSONObject.put("exception", name);
            } catch (Exception unused) {
                IAlog.m16703e("Got exception adding param to json object: %s, %s", "exception", name);
            }
            String localizedMessage = exc.getLocalizedMessage();
            try {
                jSONObject.put("message", localizedMessage);
            } catch (Exception unused2) {
                IAlog.m16703e("Got exception adding param to json object: %s, %s", "message", localizedMessage);
            }
            try {
                jSONObject.put("admPayload", str);
            } catch (Exception unused3) {
                IAlog.m16703e("Got exception adding param to json object: %s, %s", "admPayload", str);
            }
            aVar.f11368f.put(jSONObject);
            aVar.mo24768a((String) null);
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.flow.m$b */
    public class C4425b implements Runnable {
        public C4425b() {
        }

        public void run() {
            C4423m.this.mo24613b();
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.flow.m$c */
    public interface C4426c {
        void onAdRefreshFailed(InneractiveAdSpot inneractiveAdSpot, InneractiveErrorCode inneractiveErrorCode);

        void onAdRefreshed(InneractiveAdSpot inneractiveAdSpot);
    }

    public C4423m() {
        String uuid = UUID.randomUUID().toString();
        this.f10932a = uuid;
        this.f10938g = new HashSet();
        IAlog.m16699a("%sInneractiveAdSpotImpl created with UID: %s", mo24614c(), uuid);
    }

    public void addUnitController(InneractiveUnitController inneractiveUnitController) {
        if (inneractiveUnitController != null) {
            C4449x xVar = (C4449x) inneractiveUnitController;
            xVar.setAdSpot(this);
            if (this.f10938g.size() > 0) {
                Iterator it = new HashSet(this.f10938g).iterator();
                while (it.hasNext()) {
                    InneractiveUnitController inneractiveUnitController2 = (InneractiveUnitController) it.next();
                    if (inneractiveUnitController2.getClass().equals(inneractiveUnitController.getClass())) {
                        C4449x xVar2 = this.f10937f;
                        if (xVar2 != null && xVar2.equals(inneractiveUnitController2)) {
                            this.f10937f.destroy();
                            this.f10937f = null;
                        }
                        this.f10938g.remove(inneractiveUnitController2);
                    }
                }
            }
            this.f10938g.add(xVar);
            if (this.f10936e != null) {
                mo24615d();
            }
        }
    }

    /* renamed from: b */
    public final void mo24613b() {
        for (C4449x destroy : this.f10938g) {
            destroy.destroy();
        }
        this.f10938g.clear();
        C4407d dVar = this.f10939h;
        if (dVar != null) {
            dVar.mo24572a(true);
            this.f10939h = null;
        }
        this.f10933b = null;
        mo24610a();
        InneractiveAdSpotManager.get().removeSpot(this);
    }

    /* renamed from: c */
    public final String mo24614c() {
        return IAlog.m16696a((Object) this);
    }

    /* renamed from: d */
    public final boolean mo24615d() {
        for (C4449x next : this.f10938g) {
            if (next.supports(this)) {
                this.f10937f = next;
                return true;
            }
        }
        return false;
    }

    public void destroy() {
        if (Looper.myLooper() == null || Looper.getMainLooper() != Looper.myLooper()) {
            C5357n.f14225b.post(new C4425b());
        } else {
            mo24613b();
        }
    }

    public C4419j getAdContent() {
        return this.f10936e;
    }

    public InneractiveAdRequest getCurrentProcessedRequest() {
        return this.f10934c;
    }

    public String getLocalUniqueId() {
        return this.f10932a;
    }

    public InneractiveMediationName getMediationName() {
        return IAConfigManager.f10525J.f10549n;
    }

    public String getMediationNameString() {
        return IAConfigManager.f10525J.f10548m;
    }

    public String getMediationVersion() {
        return IAConfigManager.f10525J.f10550o;
    }

    public String getRequestedSpotId() {
        InneractiveAdRequest inneractiveAdRequest = this.f10934c;
        return inneractiveAdRequest != null ? inneractiveAdRequest.getSpotId() : "";
    }

    public InneractiveUnitController getSelectedUnitController() {
        return this.f10937f;
    }

    public boolean isReady() {
        C4419j jVar;
        C4419j jVar2 = this.f10936e;
        if (jVar2 == null) {
            return false;
        }
        boolean z = jVar2.mo24367c() != null && this.f10936e.mo24367c().mo26391d();
        if (z && (jVar = this.f10936e) != null) {
            C5291e c = jVar.mo24367c();
            if (!this.f10942k && c != null) {
                long minutes = TimeUnit.MILLISECONDS.toMinutes(System.currentTimeMillis() - c.f14068c);
                long j = c.f14067b;
                long j2 = minutes - j;
                IAlog.m16699a(String.format("Firing Event 802 - AdExpired - time passed- %s, sessionTimeOut - %s", new Object[]{Long.valueOf(j2), Long.valueOf(j)}), new Object[0]);
                C4565o oVar = C4565o.IA_AD_EXPIRED;
                InneractiveAdRequest inneractiveAdRequest = jVar.f10913a;
                JSONArray c2 = jVar.f10915c.mo24342c();
                C4569q.C4570a aVar = new C4569q.C4570a(c);
                aVar.f11364b = oVar;
                aVar.f11363a = inneractiveAdRequest;
                aVar.f11366d = c2;
                JSONObject jSONObject = new JSONObject();
                Long valueOf = Long.valueOf(j2);
                try {
                    jSONObject.put("time_passed", valueOf);
                } catch (Exception unused) {
                    IAlog.m16703e("Got exception adding param to json object: %s, %s", "time_passed", valueOf);
                }
                Long valueOf2 = Long.valueOf(j);
                try {
                    jSONObject.put("timeout", valueOf2);
                } catch (Exception unused2) {
                    IAlog.m16703e("Got exception adding param to json object: %s, %s", "timeout", valueOf2);
                }
                aVar.f11368f.put(jSONObject);
                aVar.mo24768a((String) null);
                this.f10942k = true;
            }
        }
        if (z || !this.f10936e.mo24368e()) {
            return false;
        }
        return true;
    }

    public void loadAd(String str) {
        if (TextUtils.isEmpty(str)) {
            InneractiveAdSpot.RequestListener requestListener = this.f10933b;
            if (requestListener != null) {
                requestListener.onInneractiveFailedAdRequest(this, InneractiveErrorCode.INVALID_INPUT);
            }
        } else if (!InneractiveAdManager.wasInitialized()) {
            InneractiveAdSpot.RequestListener requestListener2 = this.f10933b;
            if (requestListener2 != null) {
                requestListener2.onInneractiveFailedAdRequest(this, InneractiveErrorCode.SDK_NOT_INITIALIZED);
            }
        } else {
            C4473c.f11045c.mo24671a(this.f10932a).mo24674c();
            C4411f fVar = new C4411f(this.f10933b, this);
            this.f10943l = fVar;
            if (this.f10935d == null) {
                this.f10935d = new C4427n(this);
            }
            C4226e eVar = new C4226e(str);
            C4424a aVar = new C4424a(eVar, str);
            fVar.mo24583f();
            eVar.f10436d = this.f10932a;
            C5357n.m16773a(new C4221a(eVar, aVar));
        }
    }

    public void removeUnitController(InneractiveUnitController inneractiveUnitController) {
        if (inneractiveUnitController != null) {
            C4449x xVar = this.f10937f;
            if (xVar != null && xVar.equals(inneractiveUnitController)) {
                this.f10937f.destroy();
                this.f10937f = null;
            }
            this.f10938g.remove(inneractiveUnitController);
        }
    }

    public void setMediationName(InneractiveMediationName inneractiveMediationName) {
        InneractiveAdManager.setMediationName(inneractiveMediationName);
    }

    public void setMediationVersion(String str) {
        InneractiveAdManager.setMediationVersion(str);
    }

    /* renamed from: a */
    public void mo24612a(C4426c cVar) {
        this.f10940i = cVar;
        IAlog.m16699a("%srequestAd called with request: %s", IAlog.m16696a((Object) this), null);
        if (this.f10934c == null) {
            IAlog.m16700b("%srequestAd called with a null request, but no previous request is available! Cannot continue", IAlog.m16696a((Object) this));
            InneractiveAdSpot.RequestListener requestListener = this.f10933b;
            if (requestListener != null) {
                requestListener.onInneractiveFailedAdRequest(this, InneractiveErrorCode.INVALID_INPUT);
            }
        } else if (!InneractiveAdManager.wasInitialized()) {
            InneractiveAdSpot.RequestListener requestListener2 = this.f10933b;
            if (requestListener2 != null) {
                requestListener2.onInneractiveFailedAdRequest(this, InneractiveErrorCode.SDK_NOT_INITIALIZED);
            }
        } else {
            InneractiveAdRequest inneractiveAdRequest = this.f10934c;
            String str = this.f10932a;
            inneractiveAdRequest.f10864b = str;
            C4473c.f11045c.mo24671a(str).mo24674c();
            if (this.f10938g.isEmpty()) {
                IAlog.m16700b("%srequestAd called but no AdUnitControllers exist! Cannot continue", IAlog.m16696a((Object) this));
                if (this.f10933b != null) {
                    mo24611a(this.f10934c, (C5291e) null);
                    this.f10933b.onInneractiveFailedAdRequest(this, InneractiveErrorCode.INVALID_INPUT);
                    return;
                }
                return;
            }
            C4407d dVar = this.f10939h;
            if (dVar != null) {
                dVar.mo24572a(this.f10934c == null);
            }
            this.f10939h = new C4407d();
            if (this.f10935d == null) {
                this.f10935d = new C4427n(this);
            }
            IAlog.m16699a("%sFound ad source for request! %s", IAlog.m16696a((Object) this), this.f10939h);
            C4407d dVar2 = this.f10939h;
            InneractiveAdRequest inneractiveAdRequest2 = this.f10934c;
            C4408e.C4410b bVar = this.f10935d;
            dVar2.f10881e = inneractiveAdRequest2;
            dVar2.f10880d = bVar;
            if (IAConfigManager.m13434g()) {
                dVar2.mo24577h();
                return;
            }
            IAConfigManager.addListener(dVar2);
            IAConfigManager.m13428a();
        }
    }

    public void requestAd(InneractiveAdRequest inneractiveAdRequest) {
        InneractiveAdRequest inneractiveAdRequest2;
        boolean z;
        IAlog.m16699a("%srequestAd called with request: %s", IAlog.m16696a((Object) this), inneractiveAdRequest);
        if (inneractiveAdRequest == null && this.f10934c == null) {
            IAlog.m16700b("%srequestAd called with a null request, but no previous request is available! Cannot continue", IAlog.m16696a((Object) this));
            InneractiveAdSpot.RequestListener requestListener = this.f10933b;
            if (requestListener != null) {
                requestListener.onInneractiveFailedAdRequest(this, InneractiveErrorCode.INVALID_INPUT);
            }
        } else if (!InneractiveAdManager.wasInitialized()) {
            InneractiveAdSpot.RequestListener requestListener2 = this.f10933b;
            if (requestListener2 != null) {
                requestListener2.onInneractiveFailedAdRequest(this, InneractiveErrorCode.SDK_NOT_INITIALIZED);
            }
        } else {
            if (inneractiveAdRequest != null) {
                inneractiveAdRequest2 = inneractiveAdRequest;
            } else {
                inneractiveAdRequest2 = this.f10934c;
            }
            String str = this.f10932a;
            inneractiveAdRequest2.f10864b = str;
            C4473c.f11045c.mo24671a(str).mo24674c();
            if (this.f10938g.isEmpty()) {
                IAlog.m16700b("%srequestAd called but no AdUnitControllers exist! Cannot continue", IAlog.m16696a((Object) this));
                if (this.f10933b != null) {
                    if (inneractiveAdRequest == null) {
                        inneractiveAdRequest = this.f10934c;
                    }
                    mo24611a(inneractiveAdRequest, (C5291e) null);
                    this.f10933b.onInneractiveFailedAdRequest(this, InneractiveErrorCode.INVALID_INPUT);
                    return;
                }
                return;
            }
            C4407d dVar = this.f10939h;
            if (dVar != null) {
                dVar.mo24572a(inneractiveAdRequest != null || this.f10934c == null);
            }
            if (inneractiveAdRequest != null) {
                InneractiveAdRequest inneractiveAdRequest3 = this.f10934c;
                if (inneractiveAdRequest3 != null) {
                    inneractiveAdRequest.setSelectedUnitConfig(inneractiveAdRequest3.getSelectedUnitConfig());
                }
                this.f10934c = inneractiveAdRequest;
                C4419j jVar = this.f10936e;
                if (jVar != null) {
                    jVar.mo24365a();
                    this.f10941j = true;
                }
                Iterator<C4449x> it = this.f10938g.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (it.next() instanceof InneractiveFullscreenUnitController) {
                            z = true;
                            break;
                        }
                    } else {
                        z = false;
                        break;
                    }
                }
                if (!z) {
                    this.f10934c.f10863a = false;
                }
            }
            this.f10939h = new C4407d();
            if (this.f10935d == null) {
                this.f10935d = new C4427n(this);
            }
            IAlog.m16699a("%sFound ad source for request! %s", IAlog.m16696a((Object) this), this.f10939h);
            C4407d dVar2 = this.f10939h;
            InneractiveAdRequest inneractiveAdRequest4 = this.f10934c;
            C4408e.C4410b bVar = this.f10935d;
            dVar2.f10881e = inneractiveAdRequest4;
            dVar2.f10880d = bVar;
            if (IAConfigManager.m13434g()) {
                dVar2.mo24577h();
                return;
            }
            IAConfigManager.addListener(dVar2);
            IAConfigManager.m13428a();
        }
    }

    public void setMediationName(String str) {
        InneractiveAdManager.setMediationName(str);
    }

    public void setRequestListener(InneractiveAdSpot.RequestListener requestListener) {
        IAlog.m16699a("%ssetRequestListener called with: %s", IAlog.m16696a((Object) this), requestListener);
        this.f10933b = requestListener;
    }

    /* renamed from: a */
    public void mo24610a() {
        C4419j jVar;
        C4419j jVar2 = this.f10936e;
        if (jVar2 != null) {
            if (jVar2.mo24373d() && (jVar = this.f10936e) != null && !jVar.f10917e) {
                C5291e c = jVar.mo24367c();
                InneractiveAdRequest inneractiveAdRequest = this.f10936e.f10913a;
                C5357n.f14225b.post(new C4428o(this, Arrays.toString(Thread.currentThread().getStackTrace()), inneractiveAdRequest, c));
            }
            this.f10936e.mo24365a();
            this.f10936e = null;
        }
        this.f10937f = null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0038, code lost:
        r2 = r2.f10914b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x004f  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo24611a(com.fyber.inneractive.sdk.external.InneractiveAdRequest r10, com.fyber.inneractive.sdk.response.C5291e r11) {
        /*
            r9 = this;
            r0 = 0
            if (r10 == 0) goto L_0x0033
            com.fyber.inneractive.sdk.config.z r1 = r10.getSelectedUnitConfig()
            if (r1 == 0) goto L_0x0033
            com.fyber.inneractive.sdk.config.z r1 = r10.getSelectedUnitConfig()
            com.fyber.inneractive.sdk.config.y r1 = (com.fyber.inneractive.sdk.config.C4345y) r1
            com.fyber.inneractive.sdk.config.r r1 = r1.f10747c
            if (r1 == 0) goto L_0x001e
            com.fyber.inneractive.sdk.config.z r1 = r10.getSelectedUnitConfig()
            com.fyber.inneractive.sdk.config.y r1 = (com.fyber.inneractive.sdk.config.C4345y) r1
            com.fyber.inneractive.sdk.config.r r1 = r1.f10747c
            com.fyber.inneractive.sdk.config.enums.UnitDisplayType r1 = r1.f10691b
            goto L_0x0034
        L_0x001e:
            com.fyber.inneractive.sdk.config.z r1 = r10.getSelectedUnitConfig()
            com.fyber.inneractive.sdk.config.y r1 = (com.fyber.inneractive.sdk.config.C4345y) r1
            com.fyber.inneractive.sdk.config.a0 r1 = r1.f10750f
            if (r1 == 0) goto L_0x0033
            com.fyber.inneractive.sdk.config.z r1 = r10.getSelectedUnitConfig()
            com.fyber.inneractive.sdk.config.y r1 = (com.fyber.inneractive.sdk.config.C4345y) r1
            com.fyber.inneractive.sdk.config.a0 r1 = r1.f10750f
            com.fyber.inneractive.sdk.config.enums.UnitDisplayType r1 = r1.f10579j
            goto L_0x0034
        L_0x0033:
            r1 = r0
        L_0x0034:
            com.fyber.inneractive.sdk.flow.j r2 = r9.f10936e
            if (r2 == 0) goto L_0x003e
            T r2 = r2.f10914b
            if (r2 == 0) goto L_0x003e
            r4 = r2
            goto L_0x003f
        L_0x003e:
            r4 = r11
        L_0x003f:
            java.lang.String r6 = r9.f10932a
            if (r1 != 0) goto L_0x0047
            if (r4 == 0) goto L_0x0047
            com.fyber.inneractive.sdk.config.enums.UnitDisplayType r1 = r4.f14079n
        L_0x0047:
            r7 = r1
            com.fyber.inneractive.sdk.metrics.b r11 = new com.fyber.inneractive.sdk.metrics.b
            com.fyber.inneractive.sdk.flow.j r1 = r9.f10936e
            if (r1 != 0) goto L_0x004f
            goto L_0x0055
        L_0x004f:
            com.fyber.inneractive.sdk.config.global.s r0 = r1.f10915c
            org.json.JSONArray r0 = r0.mo24342c()
        L_0x0055:
            r8 = r0
            r3 = r11
            r5 = r10
            r3.<init>(r4, r5, r6, r7, r8)
            r11.mo24669a()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.flow.C4423m.mo24611a(com.fyber.inneractive.sdk.external.InneractiveAdRequest, com.fyber.inneractive.sdk.response.e):void");
    }
}

package com.fyber.inneractive.sdk.player;

import android.view.View;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.global.C4309s;
import com.fyber.inneractive.sdk.config.global.features.C4292j;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveError;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.external.InneractiveInfrastructureError;
import com.fyber.inneractive.sdk.external.InneractiveVideoError;
import com.fyber.inneractive.sdk.flow.C4412g;
import com.fyber.inneractive.sdk.flow.C4418i;
import com.fyber.inneractive.sdk.flow.C4450y;
import com.fyber.inneractive.sdk.model.vast.C4478b;
import com.fyber.inneractive.sdk.model.vast.C4489m;
import com.fyber.inneractive.sdk.model.vast.C4493q;
import com.fyber.inneractive.sdk.network.C4552j0;
import com.fyber.inneractive.sdk.network.C4565o;
import com.fyber.inneractive.sdk.network.C4569q;
import com.fyber.inneractive.sdk.p192ui.IAmraidWebViewController;
import com.fyber.inneractive.sdk.player.C4588a;
import com.fyber.inneractive.sdk.player.controller.C4633c;
import com.fyber.inneractive.sdk.player.controller.C4640g;
import com.fyber.inneractive.sdk.player.enums.VideoClickOrigin;
import com.fyber.inneractive.sdk.response.C5293g;
import com.fyber.inneractive.sdk.util.C5348k;
import com.fyber.inneractive.sdk.util.C5357n;
import com.fyber.inneractive.sdk.util.C5365q;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.web.C5405c;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.fyber.inneractive.sdk.player.i */
public class C5073i implements C5072h {

    /* renamed from: a */
    public C4588a f13570a;

    /* renamed from: b */
    public InneractiveAdRequest f13571b;

    /* renamed from: c */
    public C5293g f13572c;

    /* renamed from: d */
    public C5075b f13573d;

    /* renamed from: e */
    public C4489m f13574e;

    /* renamed from: f */
    public C4588a.C4589a f13575f;

    /* renamed from: g */
    public boolean f13576g = false;

    /* renamed from: h */
    public C4309s f13577h;

    /* renamed from: com.fyber.inneractive.sdk.player.i$a */
    public static /* synthetic */ class C5074a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f13578a;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.fyber.inneractive.sdk.external.InneractiveVideoError$Error[] r0 = com.fyber.inneractive.sdk.external.InneractiveVideoError.Error.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f13578a = r0
                com.fyber.inneractive.sdk.external.InneractiveVideoError$Error r1 = com.fyber.inneractive.sdk.external.InneractiveVideoError.Error.ERROR_NO_MEDIA_FILES     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f13578a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.fyber.inneractive.sdk.external.InneractiveVideoError$Error r1 = com.fyber.inneractive.sdk.external.InneractiveVideoError.Error.ERROR_FAILED_PLAYING_MEDIA_FILE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f13578a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.fyber.inneractive.sdk.external.InneractiveVideoError$Error r1 = com.fyber.inneractive.sdk.external.InneractiveVideoError.Error.ERROR_FAILED_PLAYING_ALL_MEDIA_FILES     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f13578a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.fyber.inneractive.sdk.external.InneractiveVideoError$Error r1 = com.fyber.inneractive.sdk.external.InneractiveVideoError.Error.ERROR_PRE_BUFFER_TIMEOUT     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f13578a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.fyber.inneractive.sdk.external.InneractiveVideoError$Error r1 = com.fyber.inneractive.sdk.external.InneractiveVideoError.Error.ERROR_BUFFER_TIMEOUT     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.C5073i.C5074a.<clinit>():void");
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.player.i$b */
    public interface C5075b {
    }

    public C5073i(C5293g gVar, InneractiveAdRequest inneractiveAdRequest, C4450y yVar, C5075b bVar) {
        this.f13571b = inneractiveAdRequest;
        this.f13572c = gVar;
        this.f13573d = bVar;
        this.f13577h = yVar.mo24593b();
        this.f13570a = new C4588a(yVar);
    }

    /* renamed from: a */
    public final C4565o mo25676a(InneractiveVideoError.Error error) {
        int i = C5074a.f13578a[error.ordinal()];
        if (i == 1) {
            return C4565o.VAST_ERROR_NO_MEDIA_FILES;
        }
        if (i == 2) {
            return C4565o.VAST_ERROR_FAILED_PLAYING_MEDIA_FILE;
        }
        if (i == 3) {
            return C4565o.VAST_ERROR_FAILED_PLAYING_ALL_MEDIA_FILES;
        }
        if (i == 4) {
            return C4565o.VAST_ERROR_PRE_BUFFER_TIMEOUT;
        }
        if (i == 5) {
            return C4565o.VAST_ERROR_BUFFER_TIMEOUT;
        }
        IAlog.m16699a("IAReportError, Does not know player error " + error.getErrorString(), new Object[0]);
        return C4565o.VAST_UNKNOWN_PLAYER_ERROR;
    }

    /* renamed from: b */
    public final void mo25680b() {
        C4565o a = mo25676a(new InneractiveVideoError(InneractiveVideoError.Error.ERROR_FAILED_PLAYING_ALL_MEDIA_FILES).getPlayerError());
        InneractiveAdRequest inneractiveAdRequest = this.f13571b;
        C5293g gVar = this.f13572c;
        JSONArray c = this.f13577h.mo24342c();
        C4569q.C4570a aVar = new C4569q.C4570a(gVar);
        aVar.f11364b = a;
        aVar.f11363a = inneractiveAdRequest;
        aVar.f11366d = c;
        aVar.mo24768a((String) null);
    }

    /* renamed from: c */
    public C4588a.C4589a mo25681c() {
        return this.f13575f;
    }

    /* renamed from: d */
    public final void mo25682d() {
        C4588a.C4589a aVar = this.f13575f;
        if (aVar != null) {
            C4489m mVar = this.f13574e;
            C5066f fVar = (C5066f) aVar;
            fVar.f11424t = this;
            if (mVar != null) {
                String str = mVar.f11117g;
                fVar.f11426v = mVar;
                fVar.f11423s++;
                fVar.f11419o = false;
                fVar.f11421q = false;
                fVar.f11407c = str;
                IAlog.m16699a("IAMediaPlayerFlowManager: playNextMediaFile - loading video url: %s", str);
                C5365q qVar = fVar.f11417m;
                if (qVar != null) {
                    qVar.cancel(true);
                    qVar.f14234b = null;
                    fVar.f11418n = null;
                }
                if (fVar.f11418n == null) {
                    fVar.f11418n = new C4664d(fVar);
                }
                IAlog.m16699a("IAMediaPlayerFlowManager: start - start fetching video frame", new Object[0]);
                if (!fVar.f11406b.mo24861a()) {
                    C5365q qVar2 = new C5365q(fVar.f11405a, fVar.f11418n, fVar.f11407c, (String) null, 81920);
                    fVar.f11417m = qVar2;
                    qVar2.executeOnExecutor(C5357n.f14224a, new Void[0]);
                }
                if (!fVar.f11420p) {
                    fVar.f11406b.mo24859a(str, fVar.f11425u);
                }
                int i = 10;
                if (C5348k.m16748m()) {
                    C4309s sVar = fVar.f11408d;
                    int a = IAConfigManager.f10525J.f10557v.f10660b.mo24345a("VASTLoadTimeoutWiFi", 10, 1);
                    if (sVar != null) {
                        Integer b = ((C4292j) sVar.mo24338a(C4292j.class)).mo24314b("load_timeout_wifi");
                        if (b != null) {
                            i = b.intValue();
                        }
                    } else {
                        i = a;
                    }
                } else {
                    C4309s sVar2 = fVar.f11408d;
                    i = IAConfigManager.f10525J.f10557v.f10660b.mo24345a("VASTLoadTimeout3G", 30, 1);
                    if (sVar2 != null) {
                        Integer b2 = ((C4292j) sVar2.mo24338a(C4292j.class)).mo24314b("load_timeout_3g");
                        i = b2 != null ? b2.intValue() : 30;
                    }
                }
                fVar.mo24788a((long) (i * 1000));
                fVar.f13561B.mo24585a();
                return;
            }
            return;
        }
        C5075b bVar = this.f13573d;
        InneractiveInfrastructureError inneractiveInfrastructureError = new InneractiveInfrastructureError(InneractiveErrorCode.SDK_INTERNAL_ERROR);
        C4418i iVar = (C4418i) bVar;
        iVar.mo24568a((InneractiveError) inneractiveInfrastructureError);
        iVar.mo24569a(inneractiveInfrastructureError);
    }

    /* renamed from: e */
    public final void mo25683e() {
        try {
            this.f13575f = this.f13570a.mo24786a();
        } catch (Throwable th) {
            C5075b bVar = this.f13573d;
            InneractiveInfrastructureError inneractiveInfrastructureError = new InneractiveInfrastructureError(InneractiveErrorCode.SDK_INTERNAL_ERROR, th);
            C4418i iVar = (C4418i) bVar;
            iVar.mo24568a((InneractiveError) inneractiveInfrastructureError);
            iVar.mo24569a(inneractiveInfrastructureError);
        }
    }

    /* renamed from: a */
    public void mo25677a() {
        C4633c cVar;
        IAmraidWebViewController iAmraidWebViewController;
        C4588a.C4589a aVar = this.f13570a.f11402b;
        if (aVar != null) {
            C5066f fVar = (C5066f) aVar;
            fVar.f11420p = true;
            IAlog.m16699a("IAMediaPlayerFlowManager: destroy", new Object[0]);
            View c = fVar.mo24796c();
            if (c != null && (c instanceof C5405c)) {
                ((C5405c) c).destroy();
            }
            C5365q qVar = fVar.f11417m;
            if (qVar != null) {
                qVar.cancel(true);
                qVar.f14234b = null;
                fVar.f11418n = null;
            }
            fVar.mo24787a();
            C4640g gVar = fVar.f11406b;
            if (gVar != null) {
                gVar.mo24862b();
                fVar.f11406b = null;
            }
            fVar.f11416l = null;
            fVar.f11424t = null;
            Runnable runnable = fVar.f11409e;
            if (runnable != null) {
                C5357n.f14225b.removeCallbacks(runnable);
            }
            C4412g gVar2 = fVar.f13561B;
            if (gVar2 != null) {
                gVar2.f10892f = false;
                View view = gVar2.f10893g;
                if (!(view == null || !(view instanceof C5405c) || (cVar = gVar2.f10895i) == null || (iAmraidWebViewController = cVar.f11546a) == null)) {
                    iAmraidWebViewController.mo26420l();
                    cVar.f11546a = null;
                }
                C4552j0 j0Var = gVar2.f10897k;
                if (j0Var != null) {
                    j0Var.f11223a = true;
                }
                gVar2.f10895i = null;
            }
            fVar.f13561B = null;
        }
    }

    /* renamed from: a */
    public void mo25678a(InneractiveVideoError inneractiveVideoError, InneractiveErrorCode inneractiveErrorCode, JSONObject jSONObject, boolean z) {
        C4478b bVar;
        C4565o a = mo25676a(inneractiveVideoError.getPlayerError());
        InneractiveAdRequest inneractiveAdRequest = this.f13571b;
        C5293g gVar = this.f13572c;
        JSONArray c = this.f13577h.mo24342c();
        C4569q.C4570a aVar = new C4569q.C4570a(gVar);
        aVar.f11364b = a;
        aVar.f11363a = inneractiveAdRequest;
        aVar.f11366d = c;
        if (jSONObject != null) {
            try {
                aVar.f11368f.put(new JSONObject(jSONObject.toString()));
            } catch (Exception unused) {
            }
        }
        aVar.mo24768a((String) null);
        IAlog.m16699a("got onMediaPlayerLoadError with: " + inneractiveVideoError.getPlayerError(), new Object[0]);
        InneractiveErrorCode inneractiveErrorCode2 = z ? InneractiveErrorCode.LOAD_TIMEOUT : null;
        IAlog.m16699a("got onMediaPlayerLoadError with: " + inneractiveVideoError.description(), new Object[0]);
        if (inneractiveVideoError.getPlayerError().isFatal()) {
            inneractiveErrorCode2 = InneractiveErrorCode.SERVER_INVALID_RESPONSE;
        }
        if (inneractiveErrorCode2 == null) {
            inneractiveErrorCode2 = InneractiveErrorCode.SERVER_INVALID_RESPONSE;
        }
        if (InneractiveErrorCode.NON_SECURE_CONTENT_DETECTED == null) {
            C4565o oVar = C4565o.VPAID_ERROR_UNSECURE_CONTENT;
            InneractiveAdRequest inneractiveAdRequest2 = this.f13571b;
            C5293g gVar2 = this.f13572c;
            JSONArray c2 = this.f13577h.mo24342c();
            C4569q.C4570a aVar2 = new C4569q.C4570a(gVar2);
            aVar2.f11364b = oVar;
            aVar2.f11363a = inneractiveAdRequest2;
            aVar2.f11366d = c2;
            aVar2.mo24768a((String) null);
        }
        this.f13574e = null;
        C5293g gVar3 = this.f13572c;
        if (!(gVar3 == null || (bVar = gVar3.f14094C) == null)) {
            this.f13574e = bVar.f11063d.poll();
        }
        if (this.f13574e == null) {
            mo25680b();
            C5075b bVar2 = this.f13573d;
            if (bVar2 != null) {
                InneractiveInfrastructureError inneractiveInfrastructureError = new InneractiveInfrastructureError(inneractiveErrorCode2, inneractiveVideoError.getCause());
                C4418i iVar = (C4418i) bVar2;
                iVar.mo24568a((InneractiveError) inneractiveInfrastructureError);
                iVar.mo24569a(inneractiveInfrastructureError);
                mo25677a();
            }
        } else if (!this.f13576g) {
            mo25683e();
            mo25682d();
        }
    }

    /* renamed from: a */
    public void mo25679a(String str, String... strArr) {
        C4588a.C4589a aVar = this.f13575f;
        if (aVar != null) {
            C5066f fVar = (C5066f) aVar;
            fVar.getClass();
            if ("TRACKING_COMPLETED".equalsIgnoreCase(str)) {
                fVar.f13565z = true;
            } else if ("EVENT_TRACKING".equalsIgnoreCase(str)) {
                for (String a : strArr) {
                    fVar.mo24791a(fVar.f13563x, VideoClickOrigin.InvalidOrigin, C4493q.m13870a(a));
                }
            }
        }
    }
}

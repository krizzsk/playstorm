package com.ogury.p376ed.internal;

import androidx.browser.trusted.sharing.ShareTarget;
import com.ironsource.mediationsdk.adunit.data.DataKeys;
import com.ogury.core.internal.network.NetworkRequest;
import com.ogury.core.internal.network.OguryNetworkClient;
import com.ogury.core.internal.network.OguryNetworkResponse;
import com.ogury.p376ed.internal.C10410cp;
import com.smaato.sdk.video.vast.model.C11286Ad;
import com.tapjoy.TapjoyConstants;
import org.json.JSONObject;
import p394io.presage.common.AdConfig;

/* renamed from: com.ogury.ed.internal.dx */
public final class C10471dx implements C10469dv {

    /* renamed from: a */
    private final C10465ds f26455a;

    /* renamed from: b */
    private final C10514fa f26456b;

    /* renamed from: c */
    private final C10510ez f26457c;

    /* renamed from: d */
    private final C10430dc f26458d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final OguryNetworkClient f26459e;

    /* renamed from: f */
    private final C10467dt f26460f;

    /* renamed from: g */
    private final C10531fn f26461g;

    /* renamed from: h */
    private final C10500er f26462h;

    /* renamed from: i */
    private final C10542fx f26463i;

    private C10471dx(C10465ds dsVar, C10514fa faVar, C10510ez ezVar, C10430dc dcVar, OguryNetworkClient oguryNetworkClient, C10467dt dtVar, C10531fn fnVar, C10500er erVar, C10542fx fxVar) {
        C10765mq.m32773b(dsVar, "headersFactory");
        C10765mq.m32773b(faVar, TapjoyConstants.TJC_APP_PLACEMENT);
        C10765mq.m32773b(ezVar, "androidDevice");
        C10765mq.m32773b(dcVar, "extraAdConfiguration");
        C10765mq.m32773b(oguryNetworkClient, "networkClient");
        C10765mq.m32773b(dtVar, "httpProfigChecker");
        C10765mq.m32773b(fnVar, "profigGateway");
        C10765mq.m32773b(erVar, "omidSdkChecker");
        C10765mq.m32773b(fxVar, "coreWrapper");
        this.f26455a = dsVar;
        this.f26456b = faVar;
        this.f26457c = ezVar;
        this.f26458d = dcVar;
        this.f26459e = oguryNetworkClient;
        this.f26460f = dtVar;
        this.f26461g = fnVar;
        this.f26462h = erVar;
        this.f26463i = fxVar;
    }

    public /* synthetic */ C10471dx(C10465ds dsVar, C10514fa faVar, C10510ez ezVar, C10430dc dcVar, OguryNetworkClient oguryNetworkClient, C10542fx fxVar) {
        this(dsVar, faVar, ezVar, dcVar, oguryNetworkClient, new C10467dt(), C10531fn.f26635a, C10500er.f26548a, fxVar);
    }

    /* renamed from: a */
    public final OguryNetworkResponse mo67204a(C10491ej ejVar, AdConfig adConfig, String str, C10501es esVar) {
        String str2 = str;
        C10765mq.m32773b(ejVar, C11286Ad.AD_TYPE);
        C10765mq.m32773b(str2, DataKeys.USER_ID);
        C10482ea eaVar = C10482ea.f26477a;
        String a = C10482ea.m31686a();
        String a2 = ejVar.mo67287a();
        String str3 = null;
        String adUnitId = adConfig == null ? null : adConfig.getAdUnitId();
        String campaignId = adConfig == null ? null : adConfig.getCampaignId();
        if (adConfig != null) {
            str3 = adConfig.getCreativeId();
        }
        C10484ec ecVar = new C10484ec(a2, adUnitId, campaignId, str3);
        C10489eh ehVar = new C10489eh(this.f26456b, this.f26457c, this.f26461g, this.f26462h, this.f26458d, this.f26463i);
        C10487ef efVar = C10487ef.f26514a;
        OguryNetworkResponse execute = this.f26459e.newCall(new NetworkRequest(a, ShareTarget.METHOD_POST, C10487ef.m31762a(ehVar, ecVar, str2, esVar), this.f26455a.mo67201b())).execute();
        C10765mq.m32770a((Object) execute, "networkClient.newCall(request).execute()");
        return execute;
    }

    /* renamed from: b */
    public final OguryNetworkResponse mo67208b(String str) {
        C10765mq.m32773b(str, "url");
        OguryNetworkResponse execute = this.f26459e.newCall(new NetworkRequest(str, ShareTarget.METHOD_GET, "", this.f26455a.mo67202c())).execute();
        C10765mq.m32770a((Object) execute, "networkClient.newCall(re…t)\n            .execute()");
        return execute;
    }

    /* renamed from: a */
    public final OguryNetworkResponse mo67205a(JSONObject jSONObject) {
        C10765mq.m32773b(jSONObject, "requestBody");
        boolean a = C10467dt.m31654a(jSONObject);
        C10482ea eaVar = C10482ea.f26477a;
        OguryNetworkResponse execute = this.f26459e.newCall(new NetworkRequest(C10482ea.m31688a(a), ShareTarget.METHOD_POST, jSONObject.toString(), this.f26455a.mo67200a())).execute();
        C10765mq.m32770a((Object) execute, "networkClient.newCall(request).execute()");
        return execute;
    }

    /* renamed from: a */
    public final C10410cp mo67206a(JSONObject jSONObject, String str) {
        C10765mq.m32773b(jSONObject, "requestBody");
        CharSequence charSequence = str;
        if (charSequence == null || charSequence.length() == 0) {
            C10482ea eaVar = C10482ea.f26477a;
            str = C10482ea.m31689b();
        }
        NetworkRequest networkRequest = new NetworkRequest(str, ShareTarget.METHOD_POST, jSONObject.toString(), this.f26455a.mo67202c());
        C10410cp.C10411a aVar = C10410cp.f26347a;
        return C10410cp.C10411a.m31506a(new C10475d(this, networkRequest));
    }

    /* renamed from: com.ogury.ed.internal.dx$d */
    static final class C10475d extends C10766mr implements C10729lj<C10684ke> {

        /* renamed from: a */
        final /* synthetic */ C10471dx f26467a;

        /* renamed from: b */
        final /* synthetic */ NetworkRequest f26468b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10475d(C10471dx dxVar, NetworkRequest networkRequest) {
            super(0);
            this.f26467a = dxVar;
            this.f26468b = networkRequest;
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo67074a() {
            m31676b();
            return C10684ke.f26938a;
        }

        /* renamed from: b */
        private void m31676b() {
            OguryNetworkResponse execute = this.f26467a.f26459e.newCall(this.f26468b).execute();
            if (execute instanceof OguryNetworkResponse.Failure) {
                Throwable exception = ((OguryNetworkResponse.Failure) execute).getException();
                C10765mq.m32770a((Object) exception, "response.exception");
                throw exception;
            }
        }
    }

    /* renamed from: b */
    public final C10410cp mo67209b(JSONObject jSONObject, String str) {
        C10765mq.m32773b(jSONObject, "requestBody");
        CharSequence charSequence = str;
        if (charSequence == null || charSequence.length() == 0) {
            C10482ea eaVar = C10482ea.f26477a;
            str = C10482ea.m31690c();
        }
        NetworkRequest networkRequest = new NetworkRequest(str, ShareTarget.METHOD_POST, jSONObject.toString(), this.f26455a.mo67203d());
        C10410cp.C10411a aVar = C10410cp.f26347a;
        return C10410cp.C10411a.m31506a(new C10477f(this, networkRequest));
    }

    /* renamed from: com.ogury.ed.internal.dx$f */
    static final class C10477f extends C10766mr implements C10729lj<C10684ke> {

        /* renamed from: a */
        final /* synthetic */ C10471dx f26471a;

        /* renamed from: b */
        final /* synthetic */ NetworkRequest f26472b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10477f(C10471dx dxVar, NetworkRequest networkRequest) {
            super(0);
            this.f26471a = dxVar;
            this.f26472b = networkRequest;
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo67074a() {
            m31680b();
            return C10684ke.f26938a;
        }

        /* renamed from: b */
        private void m31680b() {
            OguryNetworkResponse execute = this.f26471a.f26459e.newCall(this.f26472b).execute();
            if (execute instanceof OguryNetworkResponse.Failure) {
                Throwable exception = ((OguryNetworkResponse.Failure) execute).getException();
                C10765mq.m32770a((Object) exception, "response.exception");
                throw exception;
            }
        }
    }

    /* renamed from: a */
    public final void mo67207a(String str) {
        C10765mq.m32773b(str, "url");
        NetworkRequest networkRequest = new NetworkRequest(str, ShareTarget.METHOD_GET, "", this.f26455a.mo67203d());
        C10410cp.C10411a aVar = C10410cp.f26347a;
        C10410cp.C10411a.m31506a(new C10474c(this, networkRequest)).mo67163a((C10730lk<? super Throwable, C10684ke>) new C10472a(C10553gf.f26677a)).mo67164a((C10729lj<C10684ke>) C10473b.f26464a);
    }

    /* renamed from: com.ogury.ed.internal.dx$c */
    static final class C10474c extends C10766mr implements C10729lj<C10684ke> {

        /* renamed from: a */
        final /* synthetic */ C10471dx f26465a;

        /* renamed from: b */
        final /* synthetic */ NetworkRequest f26466b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10474c(C10471dx dxVar, NetworkRequest networkRequest) {
            super(0);
            this.f26465a = dxVar;
            this.f26466b = networkRequest;
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo67074a() {
            m31674b();
            return C10684ke.f26938a;
        }

        /* renamed from: b */
        private void m31674b() {
            OguryNetworkResponse execute = this.f26465a.f26459e.newCall(this.f26466b).execute();
            if (execute instanceof OguryNetworkResponse.Failure) {
                Throwable exception = ((OguryNetworkResponse.Failure) execute).getException();
                C10765mq.m32770a((Object) exception, "response.exception");
                throw exception;
            }
        }
    }

    /* renamed from: com.ogury.ed.internal.dx$a */
    /* synthetic */ class C10472a extends C10764mp implements C10730lk<Throwable, C10684ke> {
        C10472a(Object obj) {
            super(1, obj, C10553gf.class, "e", "e(Ljava/lang/Throwable;)V");
        }

        /* renamed from: a */
        private static void m31671a(Throwable th) {
            C10765mq.m32773b(th, "p0");
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ Object mo66961a(Object obj) {
            m31671a((Throwable) obj);
            return C10684ke.f26938a;
        }
    }

    /* renamed from: com.ogury.ed.internal.dx$b */
    static final class C10473b extends C10766mr implements C10729lj<C10684ke> {

        /* renamed from: a */
        public static final C10473b f26464a = new C10473b();

        C10473b() {
            super(0);
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ Object mo67074a() {
            return C10684ke.f26938a;
        }
    }

    /* renamed from: c */
    public final C10410cp mo67210c(JSONObject jSONObject, String str) {
        C10765mq.m32773b(jSONObject, "requestBody");
        CharSequence charSequence = str;
        if (charSequence == null || charSequence.length() == 0) {
            C10482ea eaVar = C10482ea.f26477a;
            str = C10482ea.m31691d();
        }
        NetworkRequest networkRequest = new NetworkRequest(str, ShareTarget.METHOD_POST, jSONObject.toString(), this.f26455a.mo67203d());
        C10410cp.C10411a aVar = C10410cp.f26347a;
        return C10410cp.C10411a.m31506a(new C10476e(this, networkRequest));
    }

    /* renamed from: com.ogury.ed.internal.dx$e */
    static final class C10476e extends C10766mr implements C10729lj<C10684ke> {

        /* renamed from: a */
        final /* synthetic */ C10471dx f26469a;

        /* renamed from: b */
        final /* synthetic */ NetworkRequest f26470b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10476e(C10471dx dxVar, NetworkRequest networkRequest) {
            super(0);
            this.f26469a = dxVar;
            this.f26470b = networkRequest;
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo67074a() {
            m31678b();
            return C10684ke.f26938a;
        }

        /* renamed from: b */
        private void m31678b() {
            OguryNetworkResponse execute = this.f26469a.f26459e.newCall(this.f26470b).execute();
            if (execute instanceof OguryNetworkResponse.Failure) {
                Throwable exception = ((OguryNetworkResponse.Failure) execute).getException();
                C10765mq.m32770a((Object) exception, "response.exception");
                throw exception;
            }
        }
    }
}

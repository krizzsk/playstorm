package com.ogury.p376ed.internal;

import android.util.Base64;
import com.ironsource.mediationsdk.adunit.data.DataKeys;
import com.ogury.core.internal.network.OguryNetworkResponse;
import com.ogury.p376ed.internal.C10420cw;
import com.smaato.sdk.video.vast.model.C11286Ad;
import p394io.presage.common.AdConfig;

/* renamed from: com.ogury.ed.internal.dm */
public final class C10456dm {

    /* renamed from: a */
    public static final C10457a f26422a = new C10457a((byte) 0);
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C10469dv f26423b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C10505ev f26424c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C10508ex f26425d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C10486ee f26426e;

    private C10456dm(C10469dv dvVar, C10505ev evVar, C10508ex exVar, C10486ee eeVar) {
        this.f26423b = dvVar;
        this.f26424c = evVar;
        this.f26425d = exVar;
        this.f26426e = eeVar;
    }

    private /* synthetic */ C10456dm(C10469dv dvVar, C10505ev evVar) {
        this(dvVar, evVar, C10508ex.f26563a, C10486ee.f26512a);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C10456dm(android.content.Context r3) {
        /*
            r2 = this;
            java.lang.String r0 = "context"
            com.ogury.p376ed.internal.C10765mq.m32773b(r3, r0)
            com.ogury.ed.internal.dw r0 = com.ogury.p376ed.internal.C10470dw.f26453a
            com.ogury.ed.internal.dv r0 = com.ogury.p376ed.internal.C10470dw.m31662a(r3)
            com.ogury.ed.internal.ev$a r1 = com.ogury.p376ed.internal.C10505ev.f26560a
            com.ogury.ed.internal.ev r3 = com.ogury.p376ed.internal.C10505ev.C10506a.m31852a(r3)
            r2.<init>(r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ogury.p376ed.internal.C10456dm.<init>(android.content.Context):void");
    }

    /* renamed from: com.ogury.ed.internal.dm$a */
    public static final class C10457a {
        public /* synthetic */ C10457a(byte b) {
            this();
        }

        private C10457a() {
        }
    }

    /* renamed from: a */
    public final C10420cw<C10490ei> mo67192a(C10491ej ejVar, AdConfig adConfig, String str, C10501es esVar) {
        C10765mq.m32773b(ejVar, C11286Ad.AD_TYPE);
        C10765mq.m32773b(str, DataKeys.USER_ID);
        C10420cw.C10421a aVar = C10420cw.f26359a;
        return C10420cw.C10421a.m31531a(new C10458b(this, ejVar, adConfig, str, esVar));
    }

    /* renamed from: com.ogury.ed.internal.dm$b */
    static final class C10458b extends C10766mr implements C10729lj<C10490ei> {

        /* renamed from: a */
        final /* synthetic */ C10456dm f26427a;

        /* renamed from: b */
        final /* synthetic */ C10491ej f26428b;

        /* renamed from: c */
        final /* synthetic */ AdConfig f26429c;

        /* renamed from: d */
        final /* synthetic */ String f26430d;

        /* renamed from: e */
        final /* synthetic */ C10501es f26431e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10458b(C10456dm dmVar, C10491ej ejVar, AdConfig adConfig, String str, C10501es esVar) {
            super(0);
            this.f26427a = dmVar;
            this.f26428b = ejVar;
            this.f26429c = adConfig;
            this.f26430d = str;
            this.f26431e = esVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public C10490ei mo67074a() {
            OguryNetworkResponse a = this.f26427a.f26423b.mo67204a(this.f26428b, this.f26429c, this.f26430d, this.f26431e);
            if (a instanceof OguryNetworkResponse.Success) {
                C10486ee unused = this.f26427a.f26426e;
                String responseBody = ((OguryNetworkResponse.Success) a).getResponseBody();
                C10765mq.m32770a((Object) responseBody, "response.responseBody");
                C10490ei a2 = C10486ee.m31753a(responseBody, this.f26428b, this.f26431e);
                this.f26427a.f26425d.mo67336a(a2.mo67286a(), this.f26427a.f26424c, this.f26427a.f26423b);
                return a2;
            } else if (a instanceof OguryNetworkResponse.Failure) {
                Throwable exception = ((OguryNetworkResponse.Failure) a).getException();
                C10765mq.m32770a((Object) exception, "response.exception");
                throw exception;
            } else {
                throw new IllegalStateException();
            }
        }
    }

    /* renamed from: com.ogury.ed.internal.dm$c */
    static final class C10459c extends C10766mr implements C10729lj<C10490ei> {

        /* renamed from: a */
        final /* synthetic */ String f26432a;

        /* renamed from: b */
        final /* synthetic */ C10456dm f26433b;

        /* renamed from: c */
        final /* synthetic */ C10491ej f26434c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10459c(String str, C10456dm dmVar, C10491ej ejVar) {
            super(0);
            this.f26432a = str;
            this.f26433b = dmVar;
            this.f26434c = ejVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public C10490ei mo67074a() {
            byte[] decode = Base64.decode(this.f26432a, 2);
            C10765mq.m32770a((Object) decode, "decode(adMarkup, Base64.NO_WRAP)");
            String str = new String(decode, C10804nz.f27018a);
            if (str.length() > 0) {
                C10486ee unused = this.f26433b.f26426e;
                C10490ei a = C10486ee.m31753a(str, this.f26434c, (C10501es) null);
                this.f26433b.f26425d.mo67336a(a.mo67286a(), this.f26433b.f26424c, this.f26433b.f26423b);
                if (!C10692km.m32657b(a.mo67286a())) {
                    return a;
                }
                throw new IllegalStateException("No available ads.");
            }
            throw new IllegalStateException("AdMarkup must not be empty.");
        }
    }

    /* renamed from: a */
    public final C10420cw<C10490ei> mo67193a(String str, C10491ej ejVar) {
        C10765mq.m32773b(str, "adMarkup");
        C10765mq.m32773b(ejVar, C11286Ad.AD_TYPE);
        C10420cw.C10421a aVar = C10420cw.f26359a;
        return C10420cw.C10421a.m31531a(new C10459c(str, this, ejVar));
    }
}

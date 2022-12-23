package com.ogury.p376ed.internal;

import android.content.Context;
import com.ogury.core.internal.InternalCore;
import com.ogury.core.internal.aaid.OguryAaid;

/* renamed from: com.ogury.ed.internal.fx */
public final class C10542fx {

    /* renamed from: a */
    public static final C10543a f26656a = new C10543a((byte) 0);

    /* renamed from: b */
    private final Context f26657b;

    public C10542fx(Context context) {
        C10765mq.m32773b(context, "context");
        this.f26657b = context;
    }

    /* renamed from: com.ogury.ed.internal.fx$a */
    public static final class C10543a {
        public /* synthetic */ C10543a(byte b) {
            this();
        }

        private C10543a() {
        }
    }

    /* renamed from: a */
    public final OguryAaid mo67450a() {
        OguryAaid aaid = InternalCore.getAaid(this.f26657b);
        C10765mq.m32770a((Object) aaid, "getAaid(context)");
        return aaid;
    }

    /* renamed from: b */
    public final int mo67451b() {
        return InternalCore.getSdkType(this.f26657b);
    }

    /* renamed from: c */
    public final String mo67452c() {
        String token = InternalCore.getToken(this.f26657b, "consent_token");
        C10765mq.m32770a((Object) token, "getToken(context, \"consent_token\")");
        return token;
    }

    /* renamed from: d */
    public final String mo67453d() {
        String token = InternalCore.getToken(this.f26657b, "instance_token");
        C10765mq.m32770a((Object) token, "getToken(context, \"instance_token\")");
        return token;
    }
}

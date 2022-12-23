package com.ogury.p376ed.internal;

import android.content.Context;
import com.ogury.core.internal.network.HeadersLoader;

/* renamed from: com.ogury.ed.internal.ds */
public final class C10465ds {

    /* renamed from: a */
    public static final C10466a f26447a = new C10466a((byte) 0);

    /* renamed from: b */
    private final C10478dy f26448b;

    /* renamed from: c */
    private final C10460dn f26449c;

    /* renamed from: d */
    private final C10468du f26450d;

    /* renamed from: e */
    private final C10479dz f26451e;

    public C10465ds(Context context, C10463dq dqVar) {
        C10765mq.m32773b(context, "context");
        C10765mq.m32773b(dqVar, "configurableRequestFieldPermission");
        this.f26448b = new C10478dy(context);
        this.f26449c = new C10460dn(context, dqVar);
        this.f26450d = new C10468du(context, dqVar);
        this.f26451e = new C10479dz(context, dqVar);
    }

    /* renamed from: com.ogury.ed.internal.ds$a */
    public static final class C10466a {
        public /* synthetic */ C10466a(byte b) {
            this();
        }

        private C10466a() {
        }

        /* renamed from: a */
        public static C10465ds m31652a(Context context, C10463dq dqVar) {
            C10765mq.m32773b(context, "context");
            C10765mq.m32773b(dqVar, "configurableRequestFieldPermission");
            Context applicationContext = context.getApplicationContext();
            C10765mq.m32770a((Object) applicationContext, "context.applicationContext");
            return new C10465ds(applicationContext, dqVar);
        }
    }

    /* renamed from: a */
    public final HeadersLoader mo67200a() {
        return this.f26448b;
    }

    /* renamed from: b */
    public final HeadersLoader mo67201b() {
        return this.f26449c;
    }

    /* renamed from: c */
    public final HeadersLoader mo67202c() {
        return this.f26450d;
    }

    /* renamed from: d */
    public final HeadersLoader mo67203d() {
        return this.f26451e;
    }
}

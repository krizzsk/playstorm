package com.mbridge.msdk.foundation.same.net.p309e;

import com.mbridge.msdk.foundation.same.net.p307c.C8457b;
import java.io.InputStream;
import java.util.Collections;
import java.util.List;

/* renamed from: com.mbridge.msdk.foundation.same.net.e.b */
/* compiled from: HttpResponse */
public final class C8478b {

    /* renamed from: a */
    private final int f20488a;

    /* renamed from: b */
    private final List<C8457b> f20489b;

    /* renamed from: c */
    private final InputStream f20490c;

    public C8478b(int i, List<C8457b> list, InputStream inputStream) {
        this.f20488a = i;
        this.f20489b = list;
        this.f20490c = inputStream;
    }

    /* renamed from: a */
    public final int mo57582a() {
        return this.f20488a;
    }

    /* renamed from: b */
    public final List<C8457b> mo57583b() {
        return Collections.unmodifiableList(this.f20489b);
    }

    /* renamed from: c */
    public final InputStream mo57584c() {
        return this.f20490c;
    }
}

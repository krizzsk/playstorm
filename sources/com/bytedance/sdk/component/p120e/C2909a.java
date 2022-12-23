package com.bytedance.sdk.component.p120e;

import android.content.Context;
import com.bytedance.sdk.component.p104b.p105a.C2810g;
import com.bytedance.sdk.component.p104b.p105a.C2813i;
import com.bytedance.sdk.component.p120e.p122b.C2914a;
import com.bytedance.sdk.component.p120e.p122b.C2916b;
import com.bytedance.sdk.component.p120e.p122b.C2919d;
import com.bytedance.sdk.component.p120e.p123c.C2925b;
import com.bytedance.sdk.component.p120e.p123c.C2930f;
import com.bytedance.sdk.component.p120e.p123c.C2931g;
import com.bytedance.sdk.component.p120e.p124d.C2933b;
import com.bytedance.sdk.component.p120e.p124d.C2941f;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: com.bytedance.sdk.component.e.a */
/* compiled from: NetClient */
public class C2909a {

    /* renamed from: a */
    private C2813i f6570a;

    /* renamed from: b */
    private C2930f f6571b;

    /* renamed from: c */
    private int f6572c;

    private C2909a(C2911a aVar) {
        C2813i.C2814a b = new C2813i.C2814a().mo17575a((long) aVar.f6573a, TimeUnit.MILLISECONDS).mo17579c((long) aVar.f6575c, TimeUnit.MILLISECONDS).mo17578b((long) aVar.f6574b, TimeUnit.MILLISECONDS);
        if (aVar.f6576d) {
            C2930f fVar = new C2930f();
            this.f6571b = fVar;
            b.mo17576a(fVar);
        }
        if (aVar.f6577e != null && aVar.f6577e.size() > 0) {
            for (C2810g a : aVar.f6577e) {
                b.mo17576a(a);
            }
        }
        this.f6570a = b.mo17577a();
    }

    /* renamed from: a */
    public void mo17760a(Context context, boolean z, boolean z2, C2925b bVar) {
        if (context == null) {
            throw new IllegalArgumentException("tryInitAdTTNet context is null");
        } else if (bVar != null) {
            int a = bVar.mo17813a();
            this.f6572c = a;
            C2930f fVar = this.f6571b;
            if (fVar != null) {
                fVar.mo17842a(a);
            }
            C2931g.m8259a().mo17844a(this.f6572c).mo17833a(z2);
            C2931g.m8259a().mo17844a(this.f6572c).mo17832a(bVar);
            C2931g.m8259a().mo17844a(this.f6572c).mo17829a(context, C2941f.m8279b(context));
            if (C2941f.m8278a(context) || (!C2941f.m8279b(context) && z)) {
                C2931g.m8259a().mo17843a(this.f6572c, context).mo17807d();
                C2931g.m8259a().mo17843a(this.f6572c, context).mo17800a();
            }
            if (C2941f.m8279b(context)) {
                C2931g.m8259a().mo17843a(this.f6572c, context).mo17807d();
                C2931g.m8259a().mo17843a(this.f6572c, context).mo17800a();
            }
        } else {
            throw new IllegalArgumentException("tryInitAdTTNet ITTAdNetDepend is null");
        }
    }

    /* renamed from: a */
    public static void m8132a() {
        C2933b.m8264a(C2933b.C2935a.DEBUG);
    }

    /* renamed from: b */
    public C2919d mo17761b() {
        return new C2919d(this.f6570a);
    }

    /* renamed from: c */
    public C2916b mo17762c() {
        return new C2916b(this.f6570a);
    }

    /* renamed from: d */
    public C2914a mo17763d() {
        return new C2914a(this.f6570a);
    }

    /* renamed from: e */
    public C2813i mo17764e() {
        return this.f6570a;
    }

    /* renamed from: com.bytedance.sdk.component.e.a$a */
    /* compiled from: NetClient */
    public static final class C2911a {

        /* renamed from: a */
        int f6573a = 10000;

        /* renamed from: b */
        int f6574b = 10000;

        /* renamed from: c */
        int f6575c = 10000;

        /* renamed from: d */
        boolean f6576d = true;

        /* renamed from: e */
        final List<C2810g> f6577e = new ArrayList();

        /* renamed from: a */
        public C2911a mo17765a(long j, TimeUnit timeUnit) {
            this.f6573a = m8138a("timeout", j, timeUnit);
            return this;
        }

        /* renamed from: b */
        public C2911a mo17768b(long j, TimeUnit timeUnit) {
            this.f6574b = m8138a("timeout", j, timeUnit);
            return this;
        }

        /* renamed from: c */
        public C2911a mo17769c(long j, TimeUnit timeUnit) {
            this.f6575c = m8138a("timeout", j, timeUnit);
            return this;
        }

        /* renamed from: a */
        public C2911a mo17766a(boolean z) {
            this.f6576d = z;
            return this;
        }

        /* renamed from: a */
        private static int m8138a(String str, long j, TimeUnit timeUnit) {
            int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
            if (i < 0) {
                throw new IllegalArgumentException(str + " < 0");
            } else if (timeUnit != null) {
                long millis = timeUnit.toMillis(j);
                if (millis > 2147483647L) {
                    throw new IllegalArgumentException(str + " too large.");
                } else if (millis != 0 || i <= 0) {
                    return (int) millis;
                } else {
                    throw new IllegalArgumentException(str + " too small.");
                }
            } else {
                throw new NullPointerException("unit == null");
            }
        }

        /* renamed from: a */
        public C2909a mo17767a() {
            return new C2909a(this);
        }
    }
}

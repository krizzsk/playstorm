package com.bytedance.sdk.component.p104b.p105a;

import com.bytedance.sdk.component.p104b.p105a.p106a.C2783a;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: com.bytedance.sdk.component.b.a.i */
/* compiled from: OkHttpClient */
public abstract class C2813i implements Cloneable {

    /* renamed from: a */
    public List<C2810g> f6332a;

    /* renamed from: b */
    public long f6333b;

    /* renamed from: c */
    public TimeUnit f6334c;

    /* renamed from: d */
    public long f6335d;

    /* renamed from: e */
    public TimeUnit f6336e;

    /* renamed from: f */
    public long f6337f;

    /* renamed from: g */
    public TimeUnit f6338g;

    /* renamed from: a */
    public abstract C2794b mo17476a(C2816k kVar);

    /* renamed from: a */
    public abstract C2805d mo17477a();

    public C2813i(C2814a aVar) {
        this.f6333b = aVar.f6340b;
        this.f6335d = aVar.f6342d;
        this.f6337f = aVar.f6344f;
        this.f6332a = aVar.f6339a;
        this.f6334c = aVar.f6341c;
        this.f6336e = aVar.f6343e;
        this.f6338g = aVar.f6345g;
        this.f6332a = aVar.f6339a;
    }

    /* renamed from: com.bytedance.sdk.component.b.a.i$a */
    /* compiled from: OkHttpClient */
    public static final class C2814a {

        /* renamed from: a */
        public final List<C2810g> f6339a = new ArrayList();

        /* renamed from: b */
        public long f6340b = 10000;

        /* renamed from: c */
        public TimeUnit f6341c = TimeUnit.MILLISECONDS;

        /* renamed from: d */
        public long f6342d = 10000;

        /* renamed from: e */
        public TimeUnit f6343e = TimeUnit.MILLISECONDS;

        /* renamed from: f */
        public long f6344f = 10000;

        /* renamed from: g */
        public TimeUnit f6345g = TimeUnit.MILLISECONDS;

        public C2814a() {
        }

        public C2814a(C2813i iVar) {
            this.f6340b = iVar.f6333b;
            this.f6341c = iVar.f6334c;
            this.f6342d = iVar.f6335d;
            this.f6343e = iVar.f6336e;
            this.f6344f = iVar.f6337f;
            this.f6345g = iVar.f6338g;
        }

        /* renamed from: a */
        public C2814a mo17575a(long j, TimeUnit timeUnit) {
            this.f6340b = j;
            this.f6341c = timeUnit;
            return this;
        }

        /* renamed from: b */
        public C2814a mo17578b(long j, TimeUnit timeUnit) {
            this.f6342d = j;
            this.f6343e = timeUnit;
            return this;
        }

        /* renamed from: c */
        public C2814a mo17579c(long j, TimeUnit timeUnit) {
            this.f6344f = j;
            this.f6345g = timeUnit;
            return this;
        }

        /* renamed from: a */
        public C2814a mo17576a(C2810g gVar) {
            this.f6339a.add(gVar);
            return this;
        }

        /* renamed from: a */
        public C2813i mo17577a() {
            return C2783a.m7590a(this);
        }
    }

    /* renamed from: b */
    public C2814a mo17574b() {
        return new C2814a(this);
    }
}

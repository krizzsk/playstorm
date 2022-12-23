package com.tapjoy.internal;

import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Collection;
import java.util.Map;

/* renamed from: com.tapjoy.internal.bb */
public final class C11443bb implements C11450bf {

    /* renamed from: a */
    private final StringWriter f27689a = new StringWriter();

    /* renamed from: b */
    private final C11462bn f27690b = new C11462bn(this.f27689a);

    public final String toString() {
        try {
            this.f27690b.f27735a.flush();
            return this.f27689a.toString();
        } catch (IOException e) {
            throw C11691gt.m33929a(e);
        }
    }

    /* renamed from: a */
    public final void mo72196a(Writer writer) {
        try {
            this.f27690b.f27735a.flush();
            writer.write(this.f27689a.toString());
        } catch (IOException e) {
            throw C11691gt.m33929a(e);
        }
    }

    /* renamed from: a */
    public final C11443bb mo72189a() {
        try {
            this.f27690b.mo72236a();
            return this;
        } catch (IOException e) {
            throw C11691gt.m33929a(e);
        }
    }

    /* renamed from: b */
    public final C11443bb mo72197b() {
        try {
            this.f27690b.mo72244b();
            return this;
        } catch (IOException e) {
            throw C11691gt.m33929a(e);
        }
    }

    /* renamed from: c */
    public final C11443bb mo72199c() {
        try {
            this.f27690b.mo72246c();
            return this;
        } catch (IOException e) {
            throw C11691gt.m33929a(e);
        }
    }

    /* renamed from: d */
    public final C11443bb mo72200d() {
        try {
            this.f27690b.mo72248d();
            return this;
        } catch (IOException e) {
            throw C11691gt.m33929a(e);
        }
    }

    /* renamed from: a */
    public final C11443bb mo72193a(String str) {
        try {
            this.f27690b.mo72241a(str);
            return this;
        } catch (IOException e) {
            throw C11691gt.m33929a(e);
        }
    }

    /* renamed from: a */
    public final C11443bb mo72191a(C11450bf bfVar) {
        try {
            this.f27690b.mo72238a(bfVar);
            return this;
        } catch (IOException e) {
            throw C11691gt.m33929a(e);
        }
    }

    /* renamed from: b */
    public final C11443bb mo72198b(String str) {
        try {
            this.f27690b.mo72245b(str);
            return this;
        } catch (IOException e) {
            throw C11691gt.m33929a(e);
        }
    }

    /* renamed from: a */
    public final C11443bb mo72190a(long j) {
        try {
            this.f27690b.mo72237a(j);
            return this;
        } catch (IOException e) {
            throw C11691gt.m33929a(e);
        }
    }

    /* renamed from: a */
    public final C11443bb mo72192a(Number number) {
        try {
            this.f27690b.mo72239a(number);
            return this;
        } catch (IOException e) {
            throw C11691gt.m33929a(e);
        }
    }

    /* renamed from: b */
    private C11443bb m33244b(Object obj) {
        try {
            this.f27690b.mo72240a(obj);
            return this;
        } catch (IOException e) {
            throw C11691gt.m33929a(e);
        }
    }

    /* renamed from: a */
    public final C11443bb mo72194a(Collection collection) {
        try {
            this.f27690b.mo72242a(collection);
            return this;
        } catch (IOException e) {
            throw C11691gt.m33929a(e);
        }
    }

    /* renamed from: a */
    public final C11443bb mo72195a(Map map) {
        try {
            this.f27690b.mo72243a((Map<Object, Object>) map);
            return this;
        } catch (IOException e) {
            throw C11691gt.m33929a(e);
        }
    }

    /* renamed from: a */
    public static String m33243a(Object obj) {
        return new C11443bb().m33244b(obj).toString();
    }
}

package com.ogury.core.internal.crash;

import android.content.Context;
import android.os.Build;
import com.ogury.core.internal.C10219ai;
import com.ogury.core.internal.crash.C10243a;
import com.ogury.core.internal.crash.C10267o;
import com.ogury.core.internal.crash.C10269p;
import java.io.File;
import java.io.IOException;
import org.json.JSONObject;

/* renamed from: com.ogury.core.internal.crash.c */
/* compiled from: CrashFileSerializer.kt */
public final class C10246c {

    /* renamed from: a */
    private final C10250e f26018a;

    /* renamed from: b */
    private final C10264m f26019b;

    /* renamed from: c */
    private final Throwable f26020c;

    /* renamed from: d */
    private final C10267o f26021d;

    /* renamed from: e */
    private final C10243a f26022e;

    /* renamed from: f */
    private final C10252f f26023f;

    /* renamed from: g */
    private final C10248d f26024g;

    /* renamed from: h */
    private final C10266n f26025h;

    /* renamed from: i */
    private final String f26026i;

    private C10246c(C10247a aVar) {
        this.f26018a = aVar.mo66812f();
        this.f26019b = aVar.mo66813g();
        this.f26020c = aVar.mo66814h();
        this.f26021d = aVar.mo66807a();
        this.f26022e = aVar.mo66808b();
        this.f26023f = aVar.mo66809c();
        this.f26024g = aVar.mo66810d();
        this.f26025h = aVar.mo66811e();
        this.f26026i = C10250e.m31079a(this.f26020c);
    }

    public /* synthetic */ C10246c(C10247a aVar, byte b) {
        this(aVar);
    }

    /* renamed from: com.ogury.core.internal.crash.c$a */
    /* compiled from: CrashFileSerializer.kt */
    public static final class C10247a {

        /* renamed from: a */
        private C10267o f26027a;

        /* renamed from: b */
        private C10243a f26028b;

        /* renamed from: c */
        private C10252f f26029c;

        /* renamed from: d */
        private C10248d f26030d;

        /* renamed from: e */
        private C10266n f26031e;

        /* renamed from: f */
        private final C10250e f26032f;

        /* renamed from: g */
        private final C10264m f26033g;

        /* renamed from: h */
        private final Throwable f26034h;

        public C10247a(Context context, C10250e eVar, C10264m mVar, Throwable th) {
            C10269p pVar;
            Context context2 = context;
            C10250e eVar2 = eVar;
            C10264m mVar2 = mVar;
            Throwable th2 = th;
            C10219ai.m31036b(context2, "context");
            C10219ai.m31036b(eVar2, "crashFormatter");
            C10219ai.m31036b(mVar2, "fileStore");
            C10219ai.m31036b(th2, "throwable");
            this.f26032f = eVar2;
            this.f26033g = mVar2;
            this.f26034h = th2;
            C10267o.C10268a aVar = C10267o.f26061a;
            String str = Build.MODEL;
            C10219ai.m31034a((Object) str, "Build.MODEL");
            String str2 = Build.VERSION.RELEASE;
            C10219ai.m31034a((Object) str2, "Build.VERSION.RELEASE");
            C10269p.C10270a aVar2 = C10269p.f26065a;
            Runtime runtime = Runtime.getRuntime();
            if (runtime != null) {
                pVar = new C10269p(runtime.freeMemory(), runtime.totalMemory(), runtime.maxMemory(), true);
            } else {
                pVar = new C10269p(0, 0, 0, false, 15);
            }
            this.f26027a = new C10267o(str, str2, pVar);
            C10243a.C10244a aVar3 = C10243a.f26014a;
            this.f26028b = C10243a.C10244a.m31062a(context);
            this.f26029c = new C10252f(context2);
            this.f26030d = new C10248d();
            this.f26031e = new C10266n(this.f26029c);
        }

        /* renamed from: f */
        public final C10250e mo66812f() {
            return this.f26032f;
        }

        /* renamed from: g */
        public final C10264m mo66813g() {
            return this.f26033g;
        }

        /* renamed from: h */
        public final Throwable mo66814h() {
            return this.f26034h;
        }

        /* renamed from: a */
        public final C10267o mo66807a() {
            return this.f26027a;
        }

        /* renamed from: b */
        public final C10243a mo66808b() {
            return this.f26028b;
        }

        /* renamed from: c */
        public final C10252f mo66809c() {
            return this.f26029c;
        }

        /* renamed from: d */
        public final C10248d mo66810d() {
            return this.f26030d;
        }

        /* renamed from: e */
        public final C10266n mo66811e() {
            return this.f26031e;
        }
    }

    /* renamed from: a */
    public final void mo66804a() throws IOException {
        String c;
        String a = this.f26025h.mo66837a(this.f26026i);
        if (a != null && (c = this.f26023f.mo66824c(a)) != null) {
            m31064a(c, 1);
        }
    }

    /* renamed from: a */
    public final void mo66805a(String str) {
        C10219ai.m31036b(str, "sdkKey");
        m31064a(str, 1);
    }

    /* renamed from: b */
    public final void mo66806b(String str) {
        C10219ai.m31036b(str, "sdkKey");
        m31064a(str, 2);
    }

    /* renamed from: a */
    private final void m31064a(String str, int i) {
        File a = this.f26019b.mo66833a(str, i);
        if (a != null) {
            JSONObject a2 = this.f26018a.mo66817a(this.f26022e, this.f26021d, this.f26020c, this.f26026i);
            if (this.f26023f.mo66823b(str)) {
                this.f26024g.mo66815a(a, a2, C10264m.m31105b(a));
            }
        }
    }
}

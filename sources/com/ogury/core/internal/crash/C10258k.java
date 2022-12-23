package com.ogury.core.internal.crash;

import com.ogury.core.internal.C10215ae;
import com.ogury.core.internal.C10219ai;
import com.ogury.core.internal.C10220aj;
import com.ogury.core.internal.C10277g;
import java.io.File;
import org.json.JSONArray;

/* renamed from: com.ogury.core.internal.crash.k */
/* compiled from: CrashUploader.kt */
public final class C10258k {

    /* renamed from: a */
    private final C10252f f26047a;

    /* renamed from: b */
    private final C10264m f26048b;

    /* renamed from: c */
    private final C10248d f26049c;

    static {
        new C10259a((byte) 0);
    }

    private C10258k(C10252f fVar, C10264m mVar, C10248d dVar) {
        C10219ai.m31036b(fVar, "crashReportDao");
        C10219ai.m31036b(mVar, "fileStore");
        C10219ai.m31036b(dVar, "crashFileWriter");
        this.f26047a = fVar;
        this.f26048b = mVar;
        this.f26049c = dVar;
    }

    public /* synthetic */ C10258k(C10252f fVar, C10264m mVar, C10248d dVar, int i) {
        this(fVar, mVar, new C10248d());
    }

    /* renamed from: com.ogury.core.internal.crash.k$a */
    /* compiled from: CrashUploader.kt */
    public static final class C10259a {
        private C10259a() {
        }

        public /* synthetic */ C10259a(byte b) {
            this();
        }
    }

    /* renamed from: com.ogury.core.internal.crash.k$b */
    /* compiled from: CrashUploader.kt */
    static final class C10260b extends C10220aj implements C10215ae<C10277g> {

        /* renamed from: a */
        private /* synthetic */ C10258k f26050a;

        /* renamed from: b */
        private /* synthetic */ String f26051b;

        /* renamed from: c */
        private /* synthetic */ int f26052c;

        /* renamed from: d */
        private /* synthetic */ int f26053d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10260b(C10258k kVar, String str, int i, int i2) {
            super(0);
            this.f26050a = kVar;
            this.f26051b = str;
            this.f26052c = i;
            this.f26053d = i2;
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ Object mo66778a() {
            C10258k.m31101a(this.f26050a, this.f26051b, this.f26052c, this.f26053d);
            return C10277g.f26074a;
        }
    }

    /* renamed from: com.ogury.core.internal.crash.k$c */
    /* compiled from: CrashUploader.kt */
    static final class C10261c extends C10220aj implements C10215ae<C10277g> {

        /* renamed from: a */
        private /* synthetic */ C10258k f26054a;

        /* renamed from: b */
        private /* synthetic */ String f26055b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10261c(C10258k kVar, String str) {
            super(0);
            this.f26054a = kVar;
            this.f26055b = str;
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ Object mo66778a() {
            C10258k.m31100a(this.f26054a, this.f26055b);
            return C10277g.f26074a;
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ void m31101a(C10258k kVar, String str, int i, int i2) {
        try {
            File c = kVar.f26048b.mo66836c(str);
            JSONArray b = C10264m.m31105b(c);
            C10271q qVar = C10271q.f26070a;
            JSONArray a = C10271q.m31120a(b, i);
            if (a.length() != 0) {
                C10245b bVar = C10245b.f26017a;
                String jSONArray = a.toString();
                C10219ai.m31034a((Object) jSONArray, "crashesToUpload.toString()");
                int a2 = C10245b.m31063a(jSONArray, kVar.f26047a.mo66818a(str));
                if (a2 == 201) {
                    kVar.f26049c.mo66816a(b, c);
                }
                if (a2 < 500 && b.length() >= i2) {
                    C10264m.m31104a(c);
                }
            }
        } catch (Exception e) {
            C10256i iVar = C10256i.f26043a;
            C10256i.m31098a(e);
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ void m31100a(C10258k kVar, String str) {
        try {
            File b = kVar.f26048b.mo66835b(str);
            JSONArray b2 = C10264m.m31105b(b);
            if (b2.length() != 0) {
                C10245b bVar = C10245b.f26017a;
                String jSONArray = b2.toString();
                C10219ai.m31034a((Object) jSONArray, "savedCrashes.toString()");
                if (C10245b.m31063a(jSONArray, kVar.f26047a.mo66818a(str)) < 500) {
                    C10264m.m31104a(b);
                }
            }
        } catch (Exception e) {
            C10256i iVar = C10256i.f26043a;
            C10256i.m31098a(e);
        }
    }
}

package com.ogury.core.internal.crash;

import com.ogury.core.internal.C10219ai;
import com.ogury.core.internal.C10296w;
import com.ogury.core.internal.crash.C10258k;
import com.ogury.core.internal.crash.C10262l;
import java.lang.Thread;

/* renamed from: com.ogury.core.internal.crash.g */
/* compiled from: CrashReportFacade.kt */
public final class C10254g {

    /* renamed from: a */
    private boolean f26037a;

    /* renamed from: b */
    private final C10252f f26038b;

    /* renamed from: c */
    private final C10264m f26039c;

    /* renamed from: d */
    private final C10257j f26040d;

    /* renamed from: e */
    private final C10258k f26041e;

    /* renamed from: f */
    private final C10262l.C10263a f26042f;

    private C10254g(C10252f fVar, C10264m mVar, C10257j jVar, C10258k kVar, C10262l.C10263a aVar) {
        C10219ai.m31036b(fVar, "crashReportDao");
        C10219ai.m31036b(mVar, "fileStore");
        C10219ai.m31036b(jVar, "crashSerializerFactory");
        C10219ai.m31036b(kVar, "crashUploader");
        C10219ai.m31036b(aVar, "exceptionHandler");
        this.f26038b = fVar;
        this.f26039c = mVar;
        this.f26040d = jVar;
        this.f26041e = kVar;
        this.f26042f = aVar;
    }

    public /* synthetic */ C10254g(C10252f fVar, C10264m mVar, C10257j jVar, C10258k kVar, C10262l.C10263a aVar, int i) {
        this(fVar, mVar, jVar, new C10258k(fVar, mVar, (C10248d) null, 4), C10262l.f26056a);
    }

    /* renamed from: a */
    public final void mo66827a(String str, CrashConfig crashConfig) {
        C10219ai.m31036b(str, "sdkKey");
        C10219ai.m31036b(crashConfig, "crashConfig");
        this.f26039c.mo66834a(str);
        this.f26038b.mo66820a(str, crashConfig.getUrl());
        this.f26038b.mo66821a(str, true);
        this.f26038b.mo66822b(crashConfig.getPackageName(), str);
        this.f26038b.mo66825d(crashConfig.getPackageName());
        C10258k kVar = this.f26041e;
        int sendCrashFrequency = crashConfig.getSendCrashFrequency();
        int deleteAllCrashesFrequency = crashConfig.getDeleteAllCrashesFrequency();
        C10219ai.m31036b(str, "sdkKey");
        Thread unused = C10296w.m31136a(true, false, (ClassLoader) null, (String) null, -1, new C10258k.C10260b(kVar, str, sendCrashFrequency, deleteAllCrashesFrequency));
        if (!this.f26037a) {
            C10257j jVar = this.f26040d;
            C10219ai.m31036b(jVar, "crashSerializerFactory");
            Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
            if (!(defaultUncaughtExceptionHandler instanceof C10262l)) {
                Thread.setDefaultUncaughtExceptionHandler(new C10262l(jVar, defaultUncaughtExceptionHandler));
            }
            this.f26037a = true;
        }
    }

    /* renamed from: a */
    public final void mo66826a(String str) {
        C10219ai.m31036b(str, "sdkKey");
        C10258k kVar = this.f26041e;
        C10219ai.m31036b(str, "sdkKey");
        Thread unused = C10296w.m31136a(true, false, (ClassLoader) null, (String) null, -1, new C10258k.C10261c(kVar, str));
    }

    /* renamed from: b */
    public final void mo66829b(String str) {
        C10219ai.m31036b(str, "sdkKey");
        this.f26038b.mo66821a(str, false);
    }

    /* renamed from: a */
    public final void mo66828a(String str, Throwable th) {
        C10219ai.m31036b(str, "sdkKey");
        C10219ai.m31036b(th, "t");
        this.f26040d.mo66831a(th).mo66806b(str);
    }

    /* renamed from: b */
    public final void mo66830b(String str, Throwable th) {
        C10219ai.m31036b(str, "sdkKey");
        C10219ai.m31036b(th, "t");
        this.f26040d.mo66831a(th).mo66805a(str);
    }
}

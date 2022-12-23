package com.ogury.core.internal;

import com.adcolony.sdk.AdColonyAppOptions;
import com.unity3d.services.core.properties.MadeWithUnityDetector;

/* renamed from: com.ogury.core.internal.c */
/* compiled from: OguryFrameworkChecker.kt */
public final class C10241c {

    /* renamed from: a */
    private C10296w f26007a;

    /* renamed from: b */
    private final C10276f f26008b;

    static {
        new C10242a((byte) 0);
    }

    public C10241c() {
        this((C10276f) null, 1);
    }

    private C10241c(C10276f fVar) {
        C10296w wVar;
        C10219ai.m31036b(fVar, "reflectionUtil");
        this.f26008b = fVar;
        if (C10276f.m31125a(MadeWithUnityDetector.UNITY_PLAYER_CLASS_NAME)) {
            wVar = new C10296w(1, AdColonyAppOptions.UNITY);
        } else if (C10276f.m31125a("org.apache.cordova.CordovaWebView")) {
            wVar = new C10296w(2, "Cordova");
        } else if (C10276f.m31125a("mono.android.Runtime")) {
            wVar = new C10296w(3, "Xamarin");
        } else if (C10276f.m31125a("com.adobe.fre.FREFunction")) {
            wVar = new C10296w(4, "Adobe Air");
        } else {
            wVar = new C10296w(0, "Native");
        }
        this.f26007a = wVar;
    }

    public /* synthetic */ C10241c(C10276f fVar, int i) {
        this(new C10276f());
    }

    /* renamed from: com.ogury.core.internal.c$a */
    /* compiled from: OguryFrameworkChecker.kt */
    public static final class C10242a {
        private C10242a() {
        }

        public /* synthetic */ C10242a(byte b) {
            this();
        }
    }

    /* renamed from: a */
    public final int mo66793a() {
        return this.f26007a.mo66930a();
    }

    /* renamed from: b */
    public final String mo66794b() {
        return this.f26007a.mo66931b();
    }
}

package com.fyber.inneractive.sdk.player.controller;

import android.view.View;
import com.fyber.inneractive.sdk.config.enums.Orientation;
import com.fyber.inneractive.sdk.util.C5320d0;
import com.fyber.inneractive.sdk.util.C5325e;
import com.fyber.inneractive.sdk.util.C5364p0;

/* renamed from: com.fyber.inneractive.sdk.player.controller.s */
public interface C4663s {
    /* renamed from: a */
    C5320d0.C5321a mo24989a(C5364p0 p0Var, C5325e eVar);

    /* renamed from: a */
    C5320d0.C5321a mo24990a(String str, C5364p0 p0Var);

    /* renamed from: a */
    void mo24991a(View view, String str);

    /* renamed from: a */
    void mo24992a(String str, String str2);

    /* renamed from: a */
    void mo24993a(boolean z);

    /* renamed from: a */
    void mo24994a(boolean z, Orientation orientation);

    /* renamed from: e */
    void mo24995e();

    /* renamed from: g */
    void mo24996g();

    /* renamed from: h */
    void mo24997h();

    /* renamed from: j */
    void mo24998j();

    /* renamed from: k */
    void mo24999k();

    /* renamed from: l */
    void mo25000l();

    void onCompleted();

    void onPlayerError();

    void onProgress(int i, int i2);

    /* renamed from: r */
    void mo25004r();
}

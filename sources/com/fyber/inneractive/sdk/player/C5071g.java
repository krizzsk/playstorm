package com.fyber.inneractive.sdk.player;

import com.fyber.inneractive.sdk.measurement.C4466g;
import com.fyber.inneractive.sdk.player.controller.C4640g;
import com.fyber.inneractive.sdk.player.enums.C4668b;
import com.fyber.inneractive.sdk.util.IAlog;

/* renamed from: com.fyber.inneractive.sdk.player.g */
public class C5071g implements C4640g.C4646f {

    /* renamed from: a */
    public final C4466g f13566a;

    /* renamed from: b */
    public boolean f13567b = false;

    /* renamed from: c */
    public boolean f13568c = false;

    /* renamed from: d */
    public boolean f13569d = false;

    public C5071g(C4466g gVar) {
        this.f13566a = gVar;
    }

    /* renamed from: a */
    public void mo24915a(C4668b bVar) {
        IAlog.m16699a("MeasurementHelper onPlayerStateChanged=%s mBuffering=%s mPrepared=%s", bVar, String.valueOf(this.f13567b), String.valueOf(this.f13569d));
        if (this.f13566a != null) {
            int ordinal = bVar.ordinal();
            if (ordinal == 2) {
                this.f13569d = true;
            } else if (ordinal != 3) {
                if (ordinal != 6) {
                    if (ordinal == 7) {
                        C4466g gVar = this.f13566a;
                        if (gVar.f11015c != null) {
                            IAlog.m16699a("%s pause", "OMVideo");
                            try {
                                gVar.f11015c.pause();
                            } catch (Throwable th) {
                                gVar.mo24663a(th);
                            }
                        }
                        this.f13568c = true;
                    } else if (ordinal == 8) {
                        C4466g gVar2 = this.f13566a;
                        if (gVar2.f11015c != null) {
                            IAlog.m16699a("%s complete", "OMVideo");
                            try {
                                gVar2.f11015c.complete();
                            } catch (Throwable th2) {
                                gVar2.mo24663a(th2);
                            }
                        }
                    }
                } else if (this.f13567b) {
                    this.f13567b = false;
                    C4466g gVar3 = this.f13566a;
                    if (gVar3.f11015c != null) {
                        IAlog.m16699a("%s bufferEnd", "OMVideo");
                        try {
                            gVar3.f11015c.bufferFinish();
                        } catch (Throwable th3) {
                            gVar3.mo24663a(th3);
                        }
                    }
                } else if (this.f13568c) {
                    C4466g gVar4 = this.f13566a;
                    if (gVar4.f11015c != null) {
                        IAlog.m16699a("%s resume", "OMVideo");
                        try {
                            gVar4.f11015c.resume();
                        } catch (Throwable th4) {
                            gVar4.mo24663a(th4);
                        }
                    }
                    this.f13568c = false;
                }
            } else if (this.f13569d) {
                C4466g gVar5 = this.f13566a;
                if (gVar5.f11015c != null) {
                    IAlog.m16699a("%s bufferStart", "OMVideo");
                    try {
                        gVar5.f11015c.bufferStart();
                    } catch (Throwable th5) {
                        gVar5.mo24663a(th5);
                    }
                }
                this.f13567b = true;
            }
        }
    }

    /* renamed from: a */
    public void mo24792a(Exception exc) {
    }

    /* renamed from: e */
    public void mo24916e() {
    }

    /* renamed from: e */
    public void mo24798e(boolean z) {
    }
}

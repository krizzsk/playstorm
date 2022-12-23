package com.fyber.inneractive.sdk.player.controller;

import android.view.Surface;
import com.fyber.inneractive.sdk.player.cache.C4629n;
import com.fyber.inneractive.sdk.player.enums.C4668b;
import com.fyber.inneractive.sdk.player.exoplayer2.C4697d;
import com.fyber.inneractive.sdk.player.exoplayer2.C4710e;
import com.fyber.inneractive.sdk.player.exoplayer2.C4863g;
import com.fyber.inneractive.sdk.player.exoplayer2.C4869i;
import com.fyber.inneractive.sdk.player.exoplayer2.C4874m;
import com.fyber.inneractive.sdk.player.exoplayer2.C4913p;
import com.fyber.inneractive.sdk.player.exoplayer2.audio.C4681c;
import com.fyber.inneractive.sdk.player.exoplayer2.decoder.DecoderCounters;
import com.fyber.inneractive.sdk.player.exoplayer2.source.C4926f;
import com.fyber.inneractive.sdk.player.exoplayer2.source.C4938l;
import com.fyber.inneractive.sdk.player.exoplayer2.source.C4948s;
import com.fyber.inneractive.sdk.player.exoplayer2.trackselection.C4964e;
import com.fyber.inneractive.sdk.player.exoplayer2.trackselection.C4966f;
import com.fyber.inneractive.sdk.player.exoplayer2.video.VideoRendererEventListener;
import com.fyber.inneractive.sdk.player.mediaplayer.C5076a;
import com.fyber.inneractive.sdk.util.C5370s;
import com.fyber.inneractive.sdk.util.IAlog;
import java.lang.ref.WeakReference;

/* renamed from: com.fyber.inneractive.sdk.player.controller.r */
public class C4662r implements C4938l.C4939a, VideoRendererEventListener, C4710e.C4711a, C4926f {

    /* renamed from: a */
    public final WeakReference<C4635d> f11639a;

    /* renamed from: b */
    public boolean f11640b = false;

    public C4662r(C4635d dVar) {
        this.f11639a = new WeakReference<>(dVar);
    }

    /* renamed from: a */
    public void mo24974a() {
    }

    /* renamed from: a */
    public void mo24976a(C4874m mVar) {
    }

    /* renamed from: a */
    public void mo24977a(C4913p pVar, Object obj) {
    }

    /* renamed from: a */
    public void mo24978a(C4948s sVar, C4966f fVar) {
    }

    /* renamed from: a */
    public void mo24979a(boolean z) {
    }

    /* renamed from: a */
    public void mo24980a(boolean z, int i) {
        C4710e eVar;
        IAlog.m16699a("%sonPlayerStateChanged called with pwr = %s state = %d", mo24981b(), Boolean.valueOf(z), Integer.valueOf(i));
        WeakReference<C4635d> weakReference = this.f11639a;
        C4869i iVar = null;
        C4635d dVar = weakReference == null ? null : (C4635d) weakReference.get();
        if (dVar != null && (eVar = dVar.f11565s) != null && !dVar.f11553A) {
            if (i == 3) {
                if (z) {
                    dVar.mo24907a(C4668b.Playing);
                } else if (dVar.f11583e == C4668b.Preparing) {
                    if (eVar != null) {
                        C4863g gVar = (C4863g) eVar;
                        if (gVar.f12883r != null && gVar.f12883r.f13232a > 0) {
                            C4964e eVar2 = gVar.f12883r.f13233b[0];
                            if (eVar2 != null) {
                                iVar = eVar2.mo25496c();
                            }
                            if (iVar != null) {
                                int i2 = iVar.f12960j;
                                int i3 = iVar.f12961k;
                                dVar.f11566t = i2;
                                dVar.f11567u = i3;
                            }
                        }
                    }
                    this.f11640b = true;
                    dVar.mo24907a(C4668b.Prepared);
                }
            } else if (i == 2) {
                if (dVar.f11583e == C4668b.Playing) {
                    dVar.mo24907a(C4668b.Buffering);
                }
            } else if (i == 4) {
                dVar.mo24907a(C4668b.f11663i);
            }
        }
    }

    /* renamed from: b */
    public final String mo24981b() {
        WeakReference<C4635d> weakReference = this.f11639a;
        C4635d dVar = weakReference == null ? null : (C4635d) weakReference.get();
        if (dVar == null) {
            return C4662r.class.getName();
        }
        return IAlog.m16696a((Object) dVar);
    }

    public void onDroppedFrames(int i, long j) {
    }

    public void onRenderedFirstFrame(Surface surface) {
    }

    public void onVideoDecoderInitialized(String str, long j, long j2) {
    }

    public void onVideoDisabled(DecoderCounters decoderCounters) {
    }

    public void onVideoEnabled(DecoderCounters decoderCounters) {
    }

    public void onVideoInputFormatChanged(C4869i iVar) {
    }

    public void onVideoSizeChanged(int i, int i2, int i3, float f) {
        WeakReference<C4635d> weakReference = this.f11639a;
        C4635d dVar = weakReference == null ? null : (C4635d) weakReference.get();
        if (dVar != null) {
            dVar.f11566t = i;
            dVar.f11567u = i2;
        }
    }

    /* renamed from: a */
    public void mo24975a(C4697d dVar) {
        String str;
        C4635d dVar2 = (C4635d) this.f11639a.get();
        if (dVar2 != null && dVar2.f11560H && dVar2.f11554B && !this.f11640b && (dVar.getCause() instanceof C4681c.C4686e)) {
            dVar2.f11568v = true;
            C4710e eVar = dVar2.f11565s;
            if (eVar != null) {
                ((C4863g) eVar).mo25330b();
                dVar2.f11565s = null;
            }
            dVar2.mo24860a(false);
            dVar2.mo24886a(dVar2.f11559G);
            dVar2.f11587i.post(new C4648h(dVar2, false));
        } else if (dVar2 == null || !dVar2.f11554B || this.f11640b || !C4629n.f11534f.mo24853a() || dVar2.f11561I >= dVar2.f11562p) {
            if (dVar.getCause() == null) {
                str = "empty";
            } else {
                str = dVar.getCause().getMessage();
            }
            C5076a.C5089m mVar = new C5076a.C5089m(dVar, str);
            IAlog.m16699a("%sonPlayerError called with %s for sendErrorState", mo24981b(), mVar);
            C4635d dVar3 = (C4635d) C5370s.m16784a(this.f11639a);
            if (dVar3 != null) {
                dVar3.mo24908a((Exception) mVar);
            }
        } else {
            C4710e eVar2 = dVar2.f11565s;
            if (eVar2 != null) {
                ((C4863g) eVar2).mo25330b();
                dVar2.f11565s = null;
            }
            dVar2.mo24860a(true);
            dVar2.mo24886a(dVar2.f11559G);
            dVar2.f11561I++;
            dVar2.f11587i.post(new C4648h(dVar2, true));
        }
    }
}

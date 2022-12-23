package com.fyber.inneractive.sdk.player.exoplayer2.extractor;

import com.fyber.inneractive.sdk.player.exoplayer2.extractor.flv.C4725b;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv.C4769a;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv.C4773d;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp3.C4780b;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4793d;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4797f;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.C4809c;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.p190ts.C4824a;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.p190ts.C4826c;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.p190ts.C4828e;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.p190ts.C4844p;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.p190ts.C4850u;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.wav.C4858a;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C5046r;
import java.lang.reflect.Constructor;
import java.util.Collections;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.c */
public final class C4716c implements C4762i {

    /* renamed from: a */
    public static final Constructor<? extends C4723f> f11875a;

    /* renamed from: a */
    public synchronized C4723f[] mo25141a() {
        C4723f[] fVarArr;
        Constructor<? extends C4723f> constructor = f11875a;
        fVarArr = new C4723f[(constructor == null ? 11 : 12)];
        fVarArr[0] = new C4773d(new C4769a(), 0);
        fVarArr[1] = new C4793d(0, (C5046r) null);
        fVarArr[2] = new C4797f();
        fVarArr[3] = new C4780b(0, -9223372036854775807L);
        fVarArr[4] = new C4826c(0);
        fVarArr[5] = new C4824a(0);
        fVarArr[6] = new C4850u(1, new C5046r(0), new C4828e(0, Collections.emptyList()));
        fVarArr[7] = new C4725b();
        fVarArr[8] = new C4809c();
        fVarArr[9] = new C4844p(new C5046r(0));
        fVarArr[10] = new C4858a();
        if (constructor != null) {
            try {
                fVarArr[11] = (C4723f) constructor.newInstance(new Object[0]);
            } catch (Exception e) {
                throw new IllegalStateException("Unexpected error creating FLAC extractor", e);
            }
        }
        return fVarArr;
    }

    static {
        Constructor<? extends U> constructor;
        try {
            constructor = Class.forName("com.fyber.inneractive.sdk.player.exoplayer2.ext.flac.FlacExtractor").asSubclass(C4723f.class).getConstructor(new Class[0]);
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            constructor = null;
        }
        f11875a = constructor;
    }
}

package com.fyber.inneractive.sdk.player.exoplayer2.upstream;

import android.net.Uri;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C5023a;
import java.io.IOException;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.upstream.z */
public final class C5022z implements C4996g {

    /* renamed from: a */
    public final C4996g f13407a;

    /* renamed from: b */
    public final C4994f f13408b;

    public C5022z(C4996g gVar, C4994f fVar) {
        this.f13407a = (C4996g) C5023a.m15300a(gVar);
        this.f13408b = (C4994f) C5023a.m15300a(fVar);
    }

    /* renamed from: a */
    public long mo24831a(C5000j jVar) throws IOException {
        long a = this.f13407a.mo24831a(jVar);
        if (jVar.f13331e == -1 && a != -1) {
            jVar = new C5000j(jVar.f13327a, (byte[]) null, jVar.f13329c, jVar.f13330d, a, jVar.f13332f, jVar.f13333g);
        }
        this.f13408b.mo25524a(jVar);
        return a;
    }

    public void close() throws IOException {
        try {
            this.f13407a.close();
        } finally {
            this.f13408b.close();
        }
    }

    /* renamed from: a */
    public int mo24830a(byte[] bArr, int i, int i2) throws IOException {
        int a = this.f13407a.mo24830a(bArr, i, i2);
        if (a > 0) {
            this.f13408b.mo25525a(bArr, i, a);
        }
        return a;
    }

    /* renamed from: a */
    public Uri mo24832a() {
        return this.f13407a.mo24832a();
    }
}

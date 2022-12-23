package com.fyber.inneractive.sdk.player.exoplayer2.upstream;

import android.net.Uri;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.C4754d;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.C5015x;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C5049u;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.upstream.y */
public final class C5020y<T> implements C5015x.C5018c {

    /* renamed from: a */
    public final C5000j f13401a;

    /* renamed from: b */
    public final C4996g f13402b;

    /* renamed from: c */
    public final C5021a<? extends T> f13403c;

    /* renamed from: d */
    public volatile T f13404d;

    /* renamed from: e */
    public volatile boolean f13405e;

    /* renamed from: f */
    public volatile long f13406f;

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.upstream.y$a */
    public interface C5021a<T> {
    }

    public C5020y(C4996g gVar, Uri uri, int i, C5021a<? extends T> aVar) {
        this.f13402b = gVar;
        this.f13401a = new C5000j(uri, 1);
        this.f13403c = aVar;
    }

    /* renamed from: a */
    public final boolean mo25185a() {
        return this.f13405e;
    }

    /* renamed from: b */
    public final void mo25186b() {
        this.f13405e = true;
    }

    public final void load() throws IOException, InterruptedException {
        C4999i iVar = new C4999i(this.f13402b, this.f13401a);
        try {
            if (!iVar.f13324d) {
                iVar.f13321a.mo24831a(iVar.f13322b);
                iVar.f13324d = true;
            }
            this.f13404d = ((C4754d) this.f13403c).mo25227a(this.f13402b.mo24832a(), (InputStream) iVar);
        } finally {
            this.f13406f = iVar.f13326f;
            C5049u.m15391a((Closeable) iVar);
        }
    }
}

package com.fyber.inneractive.sdk.player.exoplayer2.source;

import android.os.Handler;
import com.fyber.inneractive.sdk.player.exoplayer2.C4695b;
import com.fyber.inneractive.sdk.player.exoplayer2.C4869i;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.C5000j;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C5023a;
import java.io.IOException;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.source.f */
public interface C4926f {

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.source.f$a */
    public static final class C4927a {

        /* renamed from: a */
        public final Handler f13121a;

        /* renamed from: b */
        public final C4926f f13122b;

        /* renamed from: c */
        public final long f13123c;

        public C4927a(Handler handler, C4926f fVar) {
            this(handler, fVar, 0);
        }

        /* renamed from: a */
        public static long m15085a(C4927a aVar, long j) {
            aVar.getClass();
            long b = C4695b.m14455b(j);
            if (b == -9223372036854775807L) {
                return -9223372036854775807L;
            }
            return aVar.f13123c + b;
        }

        /* renamed from: b */
        public void mo25471b(C5000j jVar, int i, long j, long j2, long j3) {
            if (this.f13122b != null) {
                C4918b bVar = r0;
                C4918b bVar2 = new C4918b(this, jVar, i, -1, (C4869i) null, 0, (Object) null, -9223372036854775807L, -9223372036854775807L, j, j2, j3);
                this.f13121a.post(bVar);
            }
        }

        public C4927a(Handler handler, C4926f fVar, long j) {
            this.f13121a = fVar != null ? (Handler) C5023a.m15300a(handler) : null;
            this.f13122b = fVar;
            this.f13123c = j;
        }

        /* renamed from: a */
        public void mo25469a(C5000j jVar, int i, long j, long j2, long j3) {
            if (this.f13122b != null) {
                C4919c cVar = r0;
                C4919c cVar2 = new C4919c(this, jVar, i, -1, (C4869i) null, 0, (Object) null, -9223372036854775807L, -9223372036854775807L, j, j2, j3);
                this.f13121a.post(cVar);
            }
        }

        /* renamed from: a */
        public void mo25470a(C5000j jVar, int i, long j, long j2, long j3, IOException iOException, boolean z) {
            if (this.f13122b != null) {
                C4924d dVar = r0;
                C4924d dVar2 = new C4924d(this, jVar, i, -1, (C4869i) null, 0, (Object) null, -9223372036854775807L, -9223372036854775807L, j, j2, j3, iOException, z);
                this.f13121a.post(dVar);
            }
        }
    }
}

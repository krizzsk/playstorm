package com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache;

import java.io.File;
import java.io.IOException;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.a */
public interface C4974a {

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.a$a */
    public static class C4975a extends IOException {
        public C4975a(String str) {
            super(str);
        }

        public C4975a(IOException iOException) {
            super(iOException);
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.a$b */
    public interface C4976b {
        /* renamed from: a */
        void mo25520a(C4974a aVar, C4984g gVar);

        /* renamed from: a */
        void mo25521a(C4974a aVar, C4984g gVar, C4984g gVar2);

        /* renamed from: b */
        void mo25522b(C4974a aVar, C4984g gVar);
    }

    /* renamed from: a */
    long mo25511a();

    /* renamed from: a */
    long mo25512a(String str);

    /* renamed from: a */
    File mo25513a(String str, long j, long j2) throws C4975a;

    /* renamed from: a */
    void mo25514a(C4984g gVar) throws C4975a;

    /* renamed from: a */
    void mo25515a(File file) throws C4975a;

    /* renamed from: a */
    void mo25516a(String str, long j) throws C4975a;

    /* renamed from: b */
    C4984g mo25517b(String str, long j) throws InterruptedException, C4975a;

    /* renamed from: b */
    void mo25518b(C4984g gVar);

    /* renamed from: c */
    C4984g mo25519c(String str, long j) throws C4975a;
}

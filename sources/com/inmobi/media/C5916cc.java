package com.inmobi.media;

import android.media.MediaMetadataRetriever;

/* renamed from: com.inmobi.media.cc */
/* compiled from: NativeTimer */
public final class C5916cc {

    /* renamed from: a */
    public C5917a f14976a;

    /* renamed from: b */
    public C5917a f14977b;

    public C5916cc(C5917a aVar, C5917a aVar2) {
        this.f14976a = aVar;
        this.f14977b = aVar2;
    }

    /* renamed from: com.inmobi.media.cc$a */
    /* compiled from: NativeTimer */
    public static class C5917a {

        /* renamed from: a */
        private long f14978a;

        /* renamed from: b */
        private long f14979b;

        /* renamed from: c */
        private String f14980c;

        /* renamed from: d */
        private C5907bx f14981d;

        public C5917a(long j, long j2, String str, C5907bx bxVar) {
            this.f14978a = j;
            this.f14979b = j2;
            this.f14980c = str;
            this.f14981d = bxVar;
        }

        /* renamed from: a */
        public final long mo34906a() {
            String b;
            long j = this.f14978a;
            C5901bt b2 = this.f14981d.mo34896b(this.f14980c);
            if ((b2 instanceof C5923cg) && (b = ((C5923cg) b2).mo34920b().mo35108b()) != null) {
                MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                mediaMetadataRetriever.setDataSource(b);
                j = (long) (((double) j) + (((((double) this.f14979b) * 1.0d) / 100.0d) * ((double) (((long) Integer.valueOf(mediaMetadataRetriever.extractMetadata(9)).intValue()) / 1000))));
                mediaMetadataRetriever.release();
            }
            if (j >= 0) {
                return j;
            }
            return 0;
        }
    }
}

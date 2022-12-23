package com.inmobi.media;

/* renamed from: com.inmobi.media.gc */
/* compiled from: NetworkType */
public final class C6164gc {
    public C6165a others;
    public C6165a wifi;

    /* renamed from: a */
    public final boolean mo35345a(int i) {
        return this.wifi.mo35346a(i) && this.others.mo35346a(i);
    }

    /* renamed from: com.inmobi.media.gc$a */
    /* compiled from: NetworkType */
    public static final class C6165a {
        public int maxBatchSize;
        public int minBatchSize;
        public long retryInterval;

        /* JADX WARNING: Code restructure failed: missing block: B:5:0x000e, code lost:
            r6 = r5.minBatchSize;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean mo35346a(int r6) {
            /*
                r5 = this;
                int r0 = r5.maxBatchSize
                if (r0 > r6) goto L_0x0016
                long r1 = r5.retryInterval
                r3 = 0
                int r6 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                if (r6 <= 0) goto L_0x0016
                if (r0 <= 0) goto L_0x0016
                int r6 = r5.minBatchSize
                if (r6 <= 0) goto L_0x0016
                if (r6 > r0) goto L_0x0016
                r6 = 1
                return r6
            L_0x0016:
                r6 = 0
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C6164gc.C6165a.mo35346a(int):boolean");
        }
    }
}

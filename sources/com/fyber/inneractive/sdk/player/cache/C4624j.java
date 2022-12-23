package com.fyber.inneractive.sdk.player.cache;

/* renamed from: com.fyber.inneractive.sdk.player.cache.j */
public final class C4624j extends C4597b {

    /* renamed from: b */
    public final boolean f11526b;

    public C4624j(boolean z) {
        this.f11526b = z;
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0083 A[Catch:{ all -> 0x0089 }] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00bb A[Catch:{ all -> 0x00d3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00dc A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00d3 A[EDGE_INSN: B:66:0x00d3->B:53:0x00d3 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:70:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.fyber.inneractive.sdk.player.cache.C4597b.C4598a mo24804a(com.fyber.inneractive.sdk.player.cache.C4596a r9, java.lang.String r10) {
        /*
            r8 = this;
            com.fyber.inneractive.sdk.player.cache.b$a r10 = com.fyber.inneractive.sdk.player.cache.C4597b.C4598a.INVALID
            android.media.MediaPlayer r0 = new android.media.MediaPlayer
            r0.<init>()
            java.io.File r1 = r9.f11430a
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x0015
            boolean r1 = r1.exists()
            if (r1 == 0) goto L_0x0015
            r1 = r2
            goto L_0x0016
        L_0x0015:
            r1 = r3
        L_0x0016:
            if (r1 == 0) goto L_0x008e
            r1 = 0
            java.io.FileInputStream r4 = new java.io.FileInputStream     // Catch:{ all -> 0x0074 }
            java.io.File r5 = r9.mo24803a()     // Catch:{ all -> 0x0074 }
            r4.<init>(r5)     // Catch:{ all -> 0x0074 }
            java.io.File r1 = r9.mo24803a()     // Catch:{ all -> 0x0072 }
            java.lang.String r1 = r1.getAbsolutePath()     // Catch:{ all -> 0x0072 }
            r0.setDataSource(r1)     // Catch:{ all -> 0x0072 }
            r0.prepare()     // Catch:{ all -> 0x0072 }
            int r1 = r0.getDuration()     // Catch:{ all -> 0x0072 }
            if (r1 <= 0) goto L_0x0085
            com.fyber.inneractive.sdk.player.cache.b$a r10 = com.fyber.inneractive.sdk.player.cache.C4597b.C4598a.OK     // Catch:{ all -> 0x0072 }
            int r1 = r0.getVideoWidth()     // Catch:{ all -> 0x0072 }
            if (r1 <= 0) goto L_0x0062
            int r1 = r0.getVideoHeight()     // Catch:{ all -> 0x0072 }
            if (r1 <= 0) goto L_0x0062
            java.lang.String r1 = "video.width"
            int r5 = r0.getVideoWidth()     // Catch:{ all -> 0x0072 }
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ all -> 0x0072 }
            java.util.Map<java.lang.String, java.lang.String> r6 = r8.f11436a     // Catch:{ all -> 0x0072 }
            r6.put(r1, r5)     // Catch:{ all -> 0x0072 }
            java.lang.String r1 = "video.height"
            int r5 = r0.getVideoHeight()     // Catch:{ all -> 0x0072 }
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ all -> 0x0072 }
            java.util.Map<java.lang.String, java.lang.String> r6 = r8.f11436a     // Catch:{ all -> 0x0072 }
            r6.put(r1, r5)     // Catch:{ all -> 0x0072 }
        L_0x0062:
            java.lang.String r1 = "video.duration"
            int r5 = r0.getDuration()     // Catch:{ all -> 0x0072 }
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ all -> 0x0072 }
            java.util.Map<java.lang.String, java.lang.String> r6 = r8.f11436a     // Catch:{ all -> 0x0072 }
            r6.put(r1, r5)     // Catch:{ all -> 0x0072 }
            goto L_0x0085
        L_0x0072:
            r1 = move-exception
            goto L_0x0078
        L_0x0074:
            r4 = move-exception
            r7 = r4
            r4 = r1
            r1 = r7
        L_0x0078:
            java.lang.String r5 = "Exception raised while trying to open a cache candidate"
            java.lang.Object[] r6 = new java.lang.Object[r3]     // Catch:{ all -> 0x0089 }
            com.fyber.inneractive.sdk.util.IAlog.m16698a(r5, r1, r6)     // Catch:{ all -> 0x0089 }
            boolean r1 = r9.f11432c     // Catch:{ all -> 0x0089 }
            if (r1 == 0) goto L_0x0085
            com.fyber.inneractive.sdk.player.cache.b$a r10 = com.fyber.inneractive.sdk.player.cache.C4597b.C4598a.PARTIAL_CANNOT_VALIDATE     // Catch:{ all -> 0x0089 }
        L_0x0085:
            com.fyber.inneractive.sdk.player.cache.C4628m.m14135a((java.io.Closeable) r4)
            goto L_0x008e
        L_0x0089:
            r9 = move-exception
            com.fyber.inneractive.sdk.player.cache.C4628m.m14135a((java.io.Closeable) r4)
            throw r9
        L_0x008e:
            r0.release()     // Catch:{ all -> 0x0091 }
        L_0x0091:
            boolean r0 = r8.f11526b
            if (r0 == 0) goto L_0x009e
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 16
            if (r0 >= r1) goto L_0x009c
            goto L_0x009e
        L_0x009c:
            r0 = r3
            goto L_0x009f
        L_0x009e:
            r0 = r2
        L_0x009f:
            if (r0 != 0) goto L_0x00d8
            com.fyber.inneractive.sdk.player.cache.b$a r1 = com.fyber.inneractive.sdk.player.cache.C4597b.C4598a.OK
            if (r10 != r1) goto L_0x00d8
            android.media.MediaExtractor r1 = new android.media.MediaExtractor
            r1.<init>()
            java.io.File r4 = r9.mo24803a()     // Catch:{ all -> 0x00d3 }
            java.lang.String r4 = r4.getAbsolutePath()     // Catch:{ all -> 0x00d3 }
            r1.setDataSource(r4)     // Catch:{ all -> 0x00d3 }
        L_0x00b5:
            int r4 = r1.getTrackCount()     // Catch:{ all -> 0x00d3 }
            if (r3 >= r4) goto L_0x00d3
            android.media.MediaFormat r4 = r1.getTrackFormat(r3)     // Catch:{ all -> 0x00d3 }
            java.lang.String r5 = "mime"
            java.lang.String r4 = r4.getString(r5)     // Catch:{ all -> 0x00d3 }
            if (r4 == 0) goto L_0x00d0
            java.lang.String r5 = "video/"
            boolean r4 = r4.startsWith(r5)     // Catch:{ all -> 0x00d3 }
            if (r4 == 0) goto L_0x00d0
            goto L_0x00d4
        L_0x00d0:
            int r3 = r3 + 1
            goto L_0x00b5
        L_0x00d3:
            r2 = r0
        L_0x00d4:
            r1.release()     // Catch:{ all -> 0x00d7 }
        L_0x00d7:
            r0 = r2
        L_0x00d8:
            com.fyber.inneractive.sdk.player.cache.b$a r1 = com.fyber.inneractive.sdk.player.cache.C4597b.C4598a.OK
            if (r10 != r1) goto L_0x00e7
            if (r0 != 0) goto L_0x00e7
            boolean r9 = r9.f11432c
            if (r9 == 0) goto L_0x00e5
            com.fyber.inneractive.sdk.player.cache.b$a r10 = com.fyber.inneractive.sdk.player.cache.C4597b.C4598a.PARTIAL_CANNOT_VALIDATE
            goto L_0x00e7
        L_0x00e5:
            com.fyber.inneractive.sdk.player.cache.b$a r10 = com.fyber.inneractive.sdk.player.cache.C4597b.C4598a.INVALID
        L_0x00e7:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.cache.C4624j.mo24804a(com.fyber.inneractive.sdk.player.cache.a, java.lang.String):com.fyber.inneractive.sdk.player.cache.b$a");
    }
}

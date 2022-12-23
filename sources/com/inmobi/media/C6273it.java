package com.inmobi.media;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;

/* renamed from: com.inmobi.media.it */
/* compiled from: IceCollector */
class C6273it {
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static final String f15882b = C6273it.class.getSimpleName();

    /* renamed from: a */
    C6274a f15883a;

    C6273it() {
        HandlerThread handlerThread = new HandlerThread("DataCollectionHandler");
        handlerThread.start();
        this.f15883a = new C6274a(handlerThread.getLooper());
    }

    /* renamed from: com.inmobi.media.it$a */
    /* compiled from: IceCollector */
    static class C6274a extends Handler {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public boolean f15884a;

        C6274a(Looper looper) {
            super(looper);
        }

        public final void handleMessage(Message message) {
            int i = message.what;
            if (i == 1) {
                String unused = C6273it.f15882b;
                sendEmptyMessage(3);
            } else if (i == 2) {
                String unused2 = C6273it.f15882b;
                removeMessages(3);
            } else if (i != 3) {
                String unused3 = C6273it.f15882b;
                int i2 = message.what;
            } else {
                String unused4 = C6273it.f15882b;
                if (this.f15884a) {
                    sendEmptyMessage(2);
                    return;
                }
                C6290jc.m18808a();
                C6281iw.m18775a();
                sendEmptyMessageDelayed(3, (long) (C6281iw.m18777e().sampleInterval * 1000));
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x005c, code lost:
        return;
     */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0041 A[DONT_GENERATE] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0043 A[SYNTHETIC, Splitter:B:20:0x0043] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo35482a() {
        /*
            r9 = this;
            monitor-enter(r9)
            boolean r0 = com.inmobi.media.C6227ho.m18545a()     // Catch:{ all -> 0x005d }
            r1 = 3
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L_0x003e
            java.lang.String r0 = "android.permission.ACCESS_WIFI_STATE"
            java.lang.String r4 = "android.permission.CHANGE_WIFI_STATE"
            java.lang.String r5 = "android.permission.ACCESS_COARSE_LOCATION"
            java.lang.String[] r0 = new java.lang.String[]{r0, r4, r5}     // Catch:{ all -> 0x005d }
            android.content.Context r4 = com.inmobi.media.C6227ho.m18551c()     // Catch:{ all -> 0x005d }
            java.lang.String r5 = "android.permission.ACCESS_FINE_LOCATION"
            boolean r4 = com.inmobi.media.C6240hw.m18620a(r4, r5)     // Catch:{ all -> 0x005d }
            r6 = r2
            r5 = r3
        L_0x0020:
            if (r5 >= r1) goto L_0x0032
            r7 = r0[r5]     // Catch:{ all -> 0x005d }
            android.content.Context r8 = com.inmobi.media.C6227ho.m18551c()     // Catch:{ all -> 0x005d }
            boolean r7 = com.inmobi.media.C6240hw.m18620a(r8, r7)     // Catch:{ all -> 0x005d }
            if (r7 != 0) goto L_0x002f
            r6 = r3
        L_0x002f:
            int r5 = r5 + 1
            goto L_0x0020
        L_0x0032:
            if (r6 == 0) goto L_0x003e
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x005d }
            r5 = 29
            if (r0 < r5) goto L_0x003c
            if (r4 == 0) goto L_0x003e
        L_0x003c:
            r0 = r2
            goto L_0x003f
        L_0x003e:
            r0 = r3
        L_0x003f:
            if (r0 != 0) goto L_0x0043
            monitor-exit(r9)
            return
        L_0x0043:
            com.inmobi.media.it$a r0 = r9.f15883a     // Catch:{ all -> 0x005d }
            boolean unused = r0.f15884a = r3     // Catch:{ all -> 0x005d }
            com.inmobi.media.it$a r0 = r9.f15883a     // Catch:{ all -> 0x005d }
            boolean r0 = r0.hasMessages(r1)     // Catch:{ all -> 0x005d }
            if (r0 != 0) goto L_0x005b
            com.inmobi.media.it$a r0 = r9.f15883a     // Catch:{ all -> 0x005d }
            r1 = 2
            r0.removeMessages(r1)     // Catch:{ all -> 0x005d }
            com.inmobi.media.it$a r0 = r9.f15883a     // Catch:{ all -> 0x005d }
            r0.sendEmptyMessage(r2)     // Catch:{ all -> 0x005d }
        L_0x005b:
            monitor-exit(r9)
            return
        L_0x005d:
            r0 = move-exception
            monitor-exit(r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C6273it.mo35482a():void");
    }
}

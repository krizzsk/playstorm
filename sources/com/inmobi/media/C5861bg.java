package com.inmobi.media;

import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.inmobi.media.C5839av;
import com.inmobi.media.C6125fq;
import com.inmobi.media.C6145fs;
import com.inmobi.media.C6243hz;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.smaato.sdk.video.vast.model.C11286Ad;
import com.squareup.picasso.Callback;
import java.io.File;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.inmobi.media.bg */
/* compiled from: AssetStore */
public final class C5861bg implements C6145fs.C6148c {
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static final String f14788b = C5861bg.class.getSimpleName();

    /* renamed from: m */
    private static final Object f14789m = new Object();

    /* renamed from: a */
    public ExecutorService f14790a;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public C5858be f14791c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public C6125fq.C6130a f14792d;

    /* renamed from: e */
    private C6125fq.C6140k f14793e;

    /* renamed from: f */
    private ExecutorService f14794f;

    /* renamed from: g */
    private C5867a f14795g;

    /* renamed from: h */
    private HandlerThread f14796h;

    /* renamed from: i */
    private AtomicBoolean f14797i;

    /* renamed from: j */
    private AtomicBoolean f14798j;

    /* renamed from: k */
    private ConcurrentHashMap<String, C5839av> f14799k;

    /* renamed from: l */
    private C6243hz.C6247c f14800l;

    /* renamed from: n */
    private List<C5841aw> f14801n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public final C5860bf f14802o;

    /* renamed from: com.inmobi.media.bg$b */
    /* compiled from: AssetStore */
    static class C5869b {

        /* renamed from: a */
        static final C5861bg f14815a = new C5861bg((byte) 0);
    }

    /* synthetic */ C5861bg(byte b) {
        this();
    }

    private C5861bg() {
        this.f14797i = new AtomicBoolean(false);
        this.f14798j = new AtomicBoolean(false);
        this.f14801n = new ArrayList();
        this.f14802o = new C5860bf() {
            /* renamed from: a */
            public final void mo34834a(C6207gy gyVar, String str, C5839av avVar) {
                String unused = C5861bg.f14788b;
                C5839av a = new C5839av.C5840a().mo34755a(avVar.f14715d, str, gyVar, C5861bg.this.f14792d.maxRetries, C5861bg.this.f14792d.timeToLive).mo34756a();
                C5858be unused2 = C5861bg.this.f14791c;
                C5858be.m17532b(a);
                a.f14722k = avVar.f14722k;
                a.f14712a = avVar.f14712a;
                C5861bg.this.m17548a(a, (byte) 0);
                try {
                    C5861bg.m17565c(C5861bg.this);
                } catch (Exception e) {
                    String unused3 = C5861bg.f14788b;
                    C6181gg.m18398a().mo35357a(new C6217hg(e));
                }
            }

            /* renamed from: a */
            public final void mo34833a(C5839av avVar) {
                String unused = C5861bg.f14788b;
                C5861bg.this.m17567c(avVar.f14715d);
                if (avVar.f14714c <= 0) {
                    String unused2 = C5861bg.f14788b;
                    C5861bg.this.m17548a(avVar, avVar.f14723l);
                    C5858be unused3 = C5861bg.this.f14791c;
                    C5858be.m17536c(avVar);
                } else {
                    String unused4 = C5861bg.f14788b;
                    avVar.f14717f = System.currentTimeMillis();
                    C5858be unused5 = C5861bg.this.f14791c;
                    C5858be.m17532b(avVar);
                    if (!C6239hv.m18616a()) {
                        C5861bg.this.m17548a(avVar, avVar.f14723l);
                    }
                }
                try {
                    C5861bg.m17565c(C5861bg.this);
                } catch (Exception e) {
                    String unused6 = C5861bg.f14788b;
                    C6181gg.m18398a().mo35357a(new C6217hg(e));
                }
            }
        };
        C6125fq fqVar = (C6125fq) C6145fs.m18321a(CampaignUnit.JSON_KEY_ADS, C6227ho.m18559f(), this);
        this.f14792d = fqVar.assetCache;
        this.f14793e = fqVar.vastVideo;
        this.f14791c = C5858be.m17531a();
        this.f14790a = Executors.newCachedThreadPool(new C6237ht(f14788b + "-AP"));
        this.f14794f = Executors.newFixedThreadPool(1, new C6237ht(f14788b + "-AD"));
        HandlerThread handlerThread = new HandlerThread("assetFetcher");
        this.f14796h = handlerThread;
        handlerThread.start();
        this.f14795g = new C5867a(this.f14796h.getLooper(), this);
        this.f14800l = new C6243hz.C6247c() {
            /* renamed from: a */
            public final void mo34838a(boolean z) {
                if (z) {
                    C5861bg.m17565c(C5861bg.this);
                } else {
                    C5861bg.this.m17579i();
                }
            }
        };
        this.f14799k = new ConcurrentHashMap<>(2, 0.9f, 2);
    }

    /* renamed from: a */
    public static C5861bg m17544a() {
        return C5869b.f14815a;
    }

    /* renamed from: a */
    public final void mo34481a(C6144fr frVar) {
        C6125fq fqVar = (C6125fq) frVar;
        this.f14792d = fqVar.assetCache;
        this.f14793e = fqVar.vastVideo;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public synchronized void m17555a(String str) {
        boolean z;
        for (int i = 0; i < this.f14801n.size(); i++) {
            C5841aw awVar = this.f14801n.get(i);
            Set<C5895bn> set = awVar.f14733b;
            Set<String> set2 = awVar.f14734c;
            Iterator<C5895bn> it = set.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (it.next().f14886b.equals(str)) {
                        z = true;
                        break;
                    }
                } else {
                    z = false;
                    break;
                }
            }
            if (z && !set2.contains(str)) {
                awVar.f14734c.add(str);
                awVar.f14735d++;
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public synchronized void m17562b(String str) {
        boolean z;
        for (int i = 0; i < this.f14801n.size(); i++) {
            C5841aw awVar = this.f14801n.get(i);
            Iterator<C5895bn> it = awVar.f14733b.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (it.next().f14886b.equals(str)) {
                        z = true;
                        break;
                    }
                } else {
                    z = false;
                    break;
                }
            }
            if (z) {
                awVar.f14736e++;
            }
        }
    }

    /* renamed from: a */
    private synchronized void m17547a(C5839av avVar) {
        boolean z;
        for (int i = 0; i < this.f14801n.size(); i++) {
            C5841aw awVar = this.f14801n.get(i);
            Iterator<C5895bn> it = awVar.f14733b.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (it.next().f14886b.equals(avVar.f14715d)) {
                        z = true;
                        break;
                    }
                } else {
                    z = false;
                    break;
                }
            }
            if (z && !awVar.f14732a.contains(avVar)) {
                awVar.f14732a.add(avVar);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public synchronized void m17549a(C5841aw awVar) {
        if (!this.f14801n.contains(awVar)) {
            this.f14801n.add(awVar);
        }
    }

    /* renamed from: a */
    private synchronized void m17556a(List<C5841aw> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            this.f14801n.remove(list.get(i));
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x01a4, code lost:
        r14 = r6;
        r15 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x01a6, code lost:
        r4 = r15;
        r2 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x01c6, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x01c7, code lost:
        r4 = null;
        r14 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x01ca, code lost:
        r4 = null;
        r14 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x01d4, code lost:
        r2 = 5;
        r4 = null;
        r14 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x01df, code lost:
        r2 = 5;
        r4 = null;
        r14 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x01ea, code lost:
        r2 = 1;
        r4 = null;
        r14 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x01f5, code lost:
        r2 = 2;
        r4 = null;
        r14 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x0200, code lost:
        r2 = 2;
        r4 = null;
        r14 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:?, code lost:
        r8.f14723l = 4;
        r8.f14714c = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x010a, code lost:
        if (r0.exists() == false) goto L_0x010f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x010c, code lost:
        r0.delete();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x010f, code lost:
        r5.disconnect();
        com.inmobi.media.C6239hv.m18613a((java.io.Closeable) r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0116, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:?, code lost:
        com.inmobi.media.C6181gg.m18398a().mo35357a(new com.inmobi.media.C6217hg(r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x013e, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x013f, code lost:
        r14 = r6;
        r4 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:?, code lost:
        r7.flush();
        r5.disconnect();
        r11 = android.os.SystemClock.elapsedRealtime();
        com.inmobi.media.C5842ax.m17436a(r20, r16, r11);
        r13 = new com.inmobi.media.C6207gy();
        r13.f15724c = r5.getHeaderFields();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x015f, code lost:
        r14 = r6;
        r15 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:?, code lost:
        r8.f14722k = com.inmobi.media.C5842ax.m17435a(r23, r0, r20, r11);
        r8.f14712a = r11 - r20;
        r10.f14743a.mo34834a(r13, r0.getAbsolutePath(), r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x017a, code lost:
        com.inmobi.media.C6239hv.m18613a((java.io.Closeable) r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x017f, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0187, code lost:
        r14 = r6;
        r15 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0189, code lost:
        r4 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x018c, code lost:
        r14 = r6;
        r15 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x018e, code lost:
        r4 = r15;
        r2 = 5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0192, code lost:
        r14 = r6;
        r15 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0194, code lost:
        r4 = r15;
        r2 = 5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0198, code lost:
        r14 = r6;
        r15 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x019a, code lost:
        r4 = r15;
        r2 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x019e, code lost:
        r14 = r6;
        r15 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x01a0, code lost:
        r4 = r15;
        r2 = 2;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:102:? A[ExcHandler: SocketTimeoutException (unused java.net.SocketTimeoutException), SYNTHETIC, Splitter:B:48:0x00f1] */
    /* JADX WARNING: Removed duplicated region for block: B:122:? A[ExcHandler: Exception (unused java.lang.Exception), SYNTHETIC, Splitter:B:11:0x0052] */
    /* JADX WARNING: Removed duplicated region for block: B:126:? A[ExcHandler: IOException (unused java.io.IOException), SYNTHETIC, Splitter:B:11:0x0052] */
    /* JADX WARNING: Removed duplicated region for block: B:129:? A[ExcHandler: ProtocolException (unused java.net.ProtocolException), SYNTHETIC, Splitter:B:11:0x0052] */
    /* JADX WARNING: Removed duplicated region for block: B:132:? A[ExcHandler: MalformedURLException (unused java.net.MalformedURLException), SYNTHETIC, Splitter:B:11:0x0052] */
    /* JADX WARNING: Removed duplicated region for block: B:135:? A[ExcHandler: FileNotFoundException (unused java.io.FileNotFoundException), SYNTHETIC, Splitter:B:11:0x0052] */
    /* JADX WARNING: Removed duplicated region for block: B:138:? A[ExcHandler: SocketTimeoutException (unused java.net.SocketTimeoutException), SYNTHETIC, Splitter:B:11:0x0052] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x013e A[ExcHandler: all (th java.lang.Throwable), Splitter:B:54:0x0102] */
    /* JADX WARNING: Removed duplicated region for block: B:82:? A[ExcHandler: Exception (unused java.lang.Exception), SYNTHETIC, Splitter:B:48:0x00f1] */
    /* JADX WARNING: Removed duplicated region for block: B:86:? A[ExcHandler: IOException (unused java.io.IOException), SYNTHETIC, Splitter:B:48:0x00f1] */
    /* JADX WARNING: Removed duplicated region for block: B:90:? A[ExcHandler: ProtocolException (unused java.net.ProtocolException), SYNTHETIC, Splitter:B:48:0x00f1] */
    /* JADX WARNING: Removed duplicated region for block: B:94:? A[ExcHandler: MalformedURLException (unused java.net.MalformedURLException), SYNTHETIC, Splitter:B:48:0x00f1] */
    /* JADX WARNING: Removed duplicated region for block: B:98:? A[ExcHandler: FileNotFoundException (unused java.io.FileNotFoundException), SYNTHETIC, Splitter:B:48:0x00f1] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean m17557a(com.inmobi.media.C5839av r23, com.inmobi.media.C5860bf r24) {
        /*
            r22 = this;
            r1 = r22
            r8 = r23
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.inmobi.media.av> r0 = r1.f14799k
            java.lang.String r2 = r8.f14715d
            java.lang.Object r0 = r0.putIfAbsent(r2, r8)
            com.inmobi.media.av r0 = (com.inmobi.media.C5839av) r0
            r9 = 0
            if (r0 != 0) goto L_0x0223
            com.inmobi.media.ax r10 = new com.inmobi.media.ax
            r0 = r24
            r10.<init>(r0)
            com.inmobi.media.fq$k r0 = r1.f14793e
            long r2 = r0.vastMaxAssetSize
            com.inmobi.media.fq$k r0 = r1.f14793e
            java.util.List<java.lang.String> r0 = r0.allowedContentType
            boolean r4 = com.inmobi.media.C6239hv.m18616a()
            r11 = 5
            if (r4 != 0) goto L_0x0031
            r8.f14723l = r11
            com.inmobi.media.bf r0 = r10.f14743a
            r0.mo34833a(r8)
        L_0x002e:
            r2 = 1
            goto L_0x0222
        L_0x0031:
            java.lang.String r4 = r8.f14715d
            java.lang.String r5 = ""
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L_0x021a
            java.lang.String r4 = r8.f14715d
            boolean r4 = android.webkit.URLUtil.isValidUrl(r4)
            if (r4 != 0) goto L_0x0045
            goto L_0x021a
        L_0x0045:
            int r4 = r0.size()
            java.lang.String[] r4 = new java.lang.String[r4]
            java.lang.Object[] r0 = r0.toArray(r4)
            java.lang.String[] r0 = (java.lang.String[]) r0
            r4 = 0
            long r20 = android.os.SystemClock.elapsedRealtime()     // Catch:{ SocketTimeoutException -> 0x0200, FileNotFoundException -> 0x01f5, MalformedURLException -> 0x01ea, ProtocolException -> 0x01df, IOException -> 0x01d4, Exception -> 0x01ca, all -> 0x01c6 }
            java.net.URL r5 = new java.net.URL     // Catch:{ SocketTimeoutException -> 0x0200, FileNotFoundException -> 0x01f5, MalformedURLException -> 0x01ea, ProtocolException -> 0x01df, IOException -> 0x01d4, Exception -> 0x01ca, all -> 0x01c6 }
            java.lang.String r6 = r8.f14715d     // Catch:{ SocketTimeoutException -> 0x0200, FileNotFoundException -> 0x01f5, MalformedURLException -> 0x01ea, ProtocolException -> 0x01df, IOException -> 0x01d4, Exception -> 0x01ca, all -> 0x01c6 }
            r5.<init>(r6)     // Catch:{ SocketTimeoutException -> 0x0200, FileNotFoundException -> 0x01f5, MalformedURLException -> 0x01ea, ProtocolException -> 0x01df, IOException -> 0x01d4, Exception -> 0x01ca, all -> 0x01c6 }
            java.net.URLConnection r5 = r5.openConnection()     // Catch:{ SocketTimeoutException -> 0x0200, FileNotFoundException -> 0x01f5, MalformedURLException -> 0x01ea, ProtocolException -> 0x01df, IOException -> 0x01d4, Exception -> 0x01ca, all -> 0x01c6 }
            java.net.HttpURLConnection r5 = (java.net.HttpURLConnection) r5     // Catch:{ SocketTimeoutException -> 0x0200, FileNotFoundException -> 0x01f5, MalformedURLException -> 0x01ea, ProtocolException -> 0x01df, IOException -> 0x01d4, Exception -> 0x01ca, all -> 0x01c6 }
            java.lang.String r6 = "GET"
            r5.setRequestMethod(r6)     // Catch:{ SocketTimeoutException -> 0x0200, FileNotFoundException -> 0x01f5, MalformedURLException -> 0x01ea, ProtocolException -> 0x01df, IOException -> 0x01d4, Exception -> 0x01ca, all -> 0x01c6 }
            r6 = 60000(0xea60, float:8.4078E-41)
            r5.setConnectTimeout(r6)     // Catch:{ SocketTimeoutException -> 0x0200, FileNotFoundException -> 0x01f5, MalformedURLException -> 0x01ea, ProtocolException -> 0x01df, IOException -> 0x01d4, Exception -> 0x01ca, all -> 0x01c6 }
            r5.setReadTimeout(r6)     // Catch:{ SocketTimeoutException -> 0x0200, FileNotFoundException -> 0x01f5, MalformedURLException -> 0x01ea, ProtocolException -> 0x01df, IOException -> 0x01d4, Exception -> 0x01ca, all -> 0x01c6 }
            int r6 = r5.getResponseCode()     // Catch:{ SocketTimeoutException -> 0x0200, FileNotFoundException -> 0x01f5, MalformedURLException -> 0x01ea, ProtocolException -> 0x01df, IOException -> 0x01d4, Exception -> 0x01ca, all -> 0x01c6 }
            r7 = 400(0x190, float:5.6E-43)
            if (r6 >= r7) goto L_0x00ae
            java.lang.String r6 = r5.getContentType()     // Catch:{ SocketTimeoutException -> 0x0200, FileNotFoundException -> 0x01f5, MalformedURLException -> 0x01ea, ProtocolException -> 0x01df, IOException -> 0x01d4, Exception -> 0x01ca, all -> 0x00aa }
            int r7 = r0.length     // Catch:{ SocketTimeoutException -> 0x0200, FileNotFoundException -> 0x01f5, MalformedURLException -> 0x01ea, ProtocolException -> 0x01df, IOException -> 0x01d4, Exception -> 0x01ca, all -> 0x00aa }
            r14 = r9
        L_0x007f:
            if (r14 >= r7) goto L_0x009c
            r15 = r0[r14]     // Catch:{ SocketTimeoutException -> 0x0200, FileNotFoundException -> 0x01f5, MalformedURLException -> 0x01ea, ProtocolException -> 0x01df, IOException -> 0x01d4, Exception -> 0x01ca, all -> 0x00aa }
            if (r6 == 0) goto L_0x0099
            java.util.Locale r13 = java.util.Locale.ENGLISH     // Catch:{ SocketTimeoutException -> 0x0200, FileNotFoundException -> 0x01f5, MalformedURLException -> 0x01ea, ProtocolException -> 0x01df, IOException -> 0x01d4, Exception -> 0x01ca, all -> 0x00aa }
            java.lang.String r13 = r15.toLowerCase(r13)     // Catch:{ SocketTimeoutException -> 0x0200, FileNotFoundException -> 0x01f5, MalformedURLException -> 0x01ea, ProtocolException -> 0x01df, IOException -> 0x01d4, Exception -> 0x01ca, all -> 0x00aa }
            java.util.Locale r15 = java.util.Locale.ENGLISH     // Catch:{ SocketTimeoutException -> 0x0200, FileNotFoundException -> 0x01f5, MalformedURLException -> 0x01ea, ProtocolException -> 0x01df, IOException -> 0x01d4, Exception -> 0x01ca, all -> 0x00aa }
            java.lang.String r15 = r6.toLowerCase(r15)     // Catch:{ SocketTimeoutException -> 0x0200, FileNotFoundException -> 0x01f5, MalformedURLException -> 0x01ea, ProtocolException -> 0x01df, IOException -> 0x01d4, Exception -> 0x01ca, all -> 0x00aa }
            boolean r13 = r13.equals(r15)     // Catch:{ SocketTimeoutException -> 0x0200, FileNotFoundException -> 0x01f5, MalformedURLException -> 0x01ea, ProtocolException -> 0x01df, IOException -> 0x01d4, Exception -> 0x01ca, all -> 0x00aa }
            if (r13 == 0) goto L_0x0099
            r0 = 1
            goto L_0x009d
        L_0x0099:
            int r14 = r14 + 1
            goto L_0x007f
        L_0x009c:
            r0 = r9
        L_0x009d:
            if (r0 != 0) goto L_0x00ae
            r0 = 3
            r8.f14723l = r0     // Catch:{ SocketTimeoutException -> 0x0200, FileNotFoundException -> 0x01f5, MalformedURLException -> 0x01ea, ProtocolException -> 0x01df, IOException -> 0x01d4, Exception -> 0x01ca, all -> 0x00aa }
            r8.f14714c = r9     // Catch:{ SocketTimeoutException -> 0x0200, FileNotFoundException -> 0x01f5, MalformedURLException -> 0x01ea, ProtocolException -> 0x01df, IOException -> 0x01d4, Exception -> 0x01ca, all -> 0x00aa }
            com.inmobi.media.bf r0 = r10.f14743a     // Catch:{ SocketTimeoutException -> 0x0200, FileNotFoundException -> 0x01f5, MalformedURLException -> 0x01ea, ProtocolException -> 0x01df, IOException -> 0x01d4, Exception -> 0x01ca, all -> 0x00aa }
            r0.mo34833a(r8)     // Catch:{ SocketTimeoutException -> 0x0200, FileNotFoundException -> 0x01f5, MalformedURLException -> 0x01ea, ProtocolException -> 0x01df, IOException -> 0x01d4, Exception -> 0x01ca, all -> 0x00aa }
            goto L_0x00c7
        L_0x00aa:
            r0 = move-exception
            r14 = r4
            goto L_0x0213
        L_0x00ae:
            int r0 = r5.getContentLength()     // Catch:{ SocketTimeoutException -> 0x0200, FileNotFoundException -> 0x01f5, MalformedURLException -> 0x01ea, ProtocolException -> 0x01df, IOException -> 0x01d4, Exception -> 0x01ca, all -> 0x01c6 }
            long r6 = (long) r0
            r13 = 0
            int r0 = (r6 > r13 ? 1 : (r6 == r13 ? 0 : -1))
            r15 = 4
            if (r0 < 0) goto L_0x00cf
            int r0 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r0 <= 0) goto L_0x00cf
            r8.f14723l = r15     // Catch:{ SocketTimeoutException -> 0x0200, FileNotFoundException -> 0x01f5, MalformedURLException -> 0x01ea, ProtocolException -> 0x01df, IOException -> 0x01d4, Exception -> 0x01ca, all -> 0x00aa }
            r8.f14714c = r9     // Catch:{ SocketTimeoutException -> 0x0200, FileNotFoundException -> 0x01f5, MalformedURLException -> 0x01ea, ProtocolException -> 0x01df, IOException -> 0x01d4, Exception -> 0x01ca, all -> 0x00aa }
            com.inmobi.media.bf r0 = r10.f14743a     // Catch:{ SocketTimeoutException -> 0x0200, FileNotFoundException -> 0x01f5, MalformedURLException -> 0x01ea, ProtocolException -> 0x01df, IOException -> 0x01d4, Exception -> 0x01ca, all -> 0x00aa }
            r0.mo34833a(r8)     // Catch:{ SocketTimeoutException -> 0x0200, FileNotFoundException -> 0x01f5, MalformedURLException -> 0x01ea, ProtocolException -> 0x01df, IOException -> 0x01d4, Exception -> 0x01ca, all -> 0x00aa }
        L_0x00c7:
            com.inmobi.media.C6239hv.m18613a((java.io.Closeable) r4)
            com.inmobi.media.C6239hv.m18613a((java.io.Closeable) r4)
            goto L_0x002e
        L_0x00cf:
            r5.connect()     // Catch:{ SocketTimeoutException -> 0x0200, FileNotFoundException -> 0x01f5, MalformedURLException -> 0x01ea, ProtocolException -> 0x01df, IOException -> 0x01d4, Exception -> 0x01ca, all -> 0x01c6 }
            java.lang.String r0 = r8.f14715d     // Catch:{ SocketTimeoutException -> 0x0200, FileNotFoundException -> 0x01f5, MalformedURLException -> 0x01ea, ProtocolException -> 0x01df, IOException -> 0x01d4, Exception -> 0x01ca, all -> 0x01c6 }
            java.io.File r0 = com.inmobi.media.C6227ho.m18537a((java.lang.String) r0)     // Catch:{ SocketTimeoutException -> 0x0200, FileNotFoundException -> 0x01f5, MalformedURLException -> 0x01ea, ProtocolException -> 0x01df, IOException -> 0x01d4, Exception -> 0x01ca, all -> 0x01c6 }
            boolean r6 = r0.exists()     // Catch:{ SocketTimeoutException -> 0x0200, FileNotFoundException -> 0x01f5, MalformedURLException -> 0x01ea, ProtocolException -> 0x01df, IOException -> 0x01d4, Exception -> 0x01ca, all -> 0x01c6 }
            if (r6 == 0) goto L_0x00e1
            r0.delete()     // Catch:{ SocketTimeoutException -> 0x0200, FileNotFoundException -> 0x01f5, MalformedURLException -> 0x01ea, ProtocolException -> 0x01df, IOException -> 0x01d4, Exception -> 0x01ca, all -> 0x00aa }
        L_0x00e1:
            java.io.InputStream r6 = r5.getInputStream()     // Catch:{ SocketTimeoutException -> 0x0200, FileNotFoundException -> 0x01f5, MalformedURLException -> 0x01ea, ProtocolException -> 0x01df, IOException -> 0x01d4, Exception -> 0x01ca, all -> 0x01c6 }
            java.io.BufferedOutputStream r7 = new java.io.BufferedOutputStream     // Catch:{ SocketTimeoutException -> 0x01c2, FileNotFoundException -> 0x01be, MalformedURLException -> 0x01ba, ProtocolException -> 0x01b6, IOException -> 0x01b2, Exception -> 0x01af, all -> 0x01aa }
            java.io.FileOutputStream r4 = new java.io.FileOutputStream     // Catch:{ SocketTimeoutException -> 0x01c2, FileNotFoundException -> 0x01be, MalformedURLException -> 0x01ba, ProtocolException -> 0x01b6, IOException -> 0x01b2, Exception -> 0x01af, all -> 0x01aa }
            r4.<init>(r0)     // Catch:{ SocketTimeoutException -> 0x01c2, FileNotFoundException -> 0x01be, MalformedURLException -> 0x01ba, ProtocolException -> 0x01b6, IOException -> 0x01b2, Exception -> 0x01af, all -> 0x01aa }
            r7.<init>(r4)     // Catch:{ SocketTimeoutException -> 0x01c2, FileNotFoundException -> 0x01be, MalformedURLException -> 0x01ba, ProtocolException -> 0x01b6, IOException -> 0x01b2, Exception -> 0x01af, all -> 0x01aa }
            r4 = 1024(0x400, float:1.435E-42)
            byte[] r4 = new byte[r4]     // Catch:{ SocketTimeoutException -> 0x01a4, FileNotFoundException -> 0x019e, MalformedURLException -> 0x0198, ProtocolException -> 0x0192, IOException -> 0x018c, Exception -> 0x0187, all -> 0x0181 }
            r16 = r13
        L_0x00f5:
            int r13 = r6.read(r4)     // Catch:{ SocketTimeoutException -> 0x01a4, FileNotFoundException -> 0x019e, MalformedURLException -> 0x0198, ProtocolException -> 0x0192, IOException -> 0x018c, Exception -> 0x0187, all -> 0x0181 }
            if (r13 <= 0) goto L_0x0143
            long r11 = (long) r13
            long r16 = r16 + r11
            int r11 = (r16 > r2 ? 1 : (r16 == r2 ? 0 : -1))
            if (r11 <= 0) goto L_0x0139
            r8.f14723l = r15     // Catch:{ SocketTimeoutException -> 0x01a4, FileNotFoundException -> 0x019e, MalformedURLException -> 0x0198, ProtocolException -> 0x0192, IOException -> 0x018c, Exception -> 0x0187, all -> 0x013e }
            r8.f14714c = r9     // Catch:{ SocketTimeoutException -> 0x01a4, FileNotFoundException -> 0x019e, MalformedURLException -> 0x0198, ProtocolException -> 0x0192, IOException -> 0x018c, Exception -> 0x0187, all -> 0x013e }
            boolean r2 = r0.exists()     // Catch:{ Exception -> 0x0116, SocketTimeoutException -> 0x01a4, FileNotFoundException -> 0x019e, MalformedURLException -> 0x0198, ProtocolException -> 0x0192, IOException -> 0x018c, all -> 0x013e }
            if (r2 == 0) goto L_0x010f
            r0.delete()     // Catch:{ Exception -> 0x0116, SocketTimeoutException -> 0x01a4, FileNotFoundException -> 0x019e, MalformedURLException -> 0x0198, ProtocolException -> 0x0192, IOException -> 0x018c, all -> 0x013e }
        L_0x010f:
            r5.disconnect()     // Catch:{ Exception -> 0x0116, SocketTimeoutException -> 0x01a4, FileNotFoundException -> 0x019e, MalformedURLException -> 0x0198, ProtocolException -> 0x0192, IOException -> 0x018c, all -> 0x013e }
            com.inmobi.media.C6239hv.m18613a((java.io.Closeable) r7)     // Catch:{ Exception -> 0x0116, SocketTimeoutException -> 0x01a4, FileNotFoundException -> 0x019e, MalformedURLException -> 0x0198, ProtocolException -> 0x0192, IOException -> 0x018c, all -> 0x013e }
            goto L_0x0123
        L_0x0116:
            r0 = move-exception
            com.inmobi.media.gg r2 = com.inmobi.media.C6181gg.m18398a()     // Catch:{ SocketTimeoutException -> 0x01a4, FileNotFoundException -> 0x019e, MalformedURLException -> 0x0198, ProtocolException -> 0x0192, IOException -> 0x018c, Exception -> 0x0187, all -> 0x013e }
            com.inmobi.media.hg r3 = new com.inmobi.media.hg     // Catch:{ SocketTimeoutException -> 0x01a4, FileNotFoundException -> 0x019e, MalformedURLException -> 0x0198, ProtocolException -> 0x0192, IOException -> 0x018c, Exception -> 0x0187, all -> 0x013e }
            r3.<init>(r0)     // Catch:{ SocketTimeoutException -> 0x01a4, FileNotFoundException -> 0x019e, MalformedURLException -> 0x0198, ProtocolException -> 0x0192, IOException -> 0x018c, Exception -> 0x0187, all -> 0x013e }
            r2.mo35357a((com.inmobi.media.C6217hg) r3)     // Catch:{ SocketTimeoutException -> 0x01a4, FileNotFoundException -> 0x019e, MalformedURLException -> 0x0198, ProtocolException -> 0x0192, IOException -> 0x018c, Exception -> 0x0187, all -> 0x013e }
        L_0x0123:
            long r18 = android.os.SystemClock.elapsedRealtime()     // Catch:{ SocketTimeoutException -> 0x01a4, FileNotFoundException -> 0x019e, MalformedURLException -> 0x0198, ProtocolException -> 0x0192, IOException -> 0x018c, Exception -> 0x0187, all -> 0x013e }
            r14 = r20
            com.inmobi.media.C5842ax.m17436a(r14, r16, r18)     // Catch:{ SocketTimeoutException -> 0x01a4, FileNotFoundException -> 0x019e, MalformedURLException -> 0x0198, ProtocolException -> 0x0192, IOException -> 0x018c, Exception -> 0x0187, all -> 0x013e }
            com.inmobi.media.bf r0 = r10.f14743a     // Catch:{ SocketTimeoutException -> 0x01a4, FileNotFoundException -> 0x019e, MalformedURLException -> 0x0198, ProtocolException -> 0x0192, IOException -> 0x018c, Exception -> 0x0187, all -> 0x013e }
            r0.mo34833a(r8)     // Catch:{ SocketTimeoutException -> 0x01a4, FileNotFoundException -> 0x019e, MalformedURLException -> 0x0198, ProtocolException -> 0x0192, IOException -> 0x018c, Exception -> 0x0187, all -> 0x013e }
            com.inmobi.media.C6239hv.m18613a((java.io.Closeable) r7)
            com.inmobi.media.C6239hv.m18613a((java.io.Closeable) r6)
            goto L_0x002e
        L_0x0139:
            r7.write(r4, r9, r13)     // Catch:{ SocketTimeoutException -> 0x01a4, FileNotFoundException -> 0x019e, MalformedURLException -> 0x0198, ProtocolException -> 0x0192, IOException -> 0x018c, Exception -> 0x0187, all -> 0x013e }
            r11 = 5
            goto L_0x00f5
        L_0x013e:
            r0 = move-exception
            r14 = r6
            r4 = r7
            goto L_0x0213
        L_0x0143:
            r7.flush()     // Catch:{ SocketTimeoutException -> 0x01a4, FileNotFoundException -> 0x019e, MalformedURLException -> 0x0198, ProtocolException -> 0x0192, IOException -> 0x018c, Exception -> 0x0187, all -> 0x0181 }
            r5.disconnect()     // Catch:{ SocketTimeoutException -> 0x01a4, FileNotFoundException -> 0x019e, MalformedURLException -> 0x0198, ProtocolException -> 0x0192, IOException -> 0x018c, Exception -> 0x0187, all -> 0x0181 }
            long r11 = android.os.SystemClock.elapsedRealtime()     // Catch:{ SocketTimeoutException -> 0x01a4, FileNotFoundException -> 0x019e, MalformedURLException -> 0x0198, ProtocolException -> 0x0192, IOException -> 0x018c, Exception -> 0x0187, all -> 0x0181 }
            r14 = r20
            r18 = r11
            com.inmobi.media.C5842ax.m17436a(r14, r16, r18)     // Catch:{ SocketTimeoutException -> 0x01a4, FileNotFoundException -> 0x019e, MalformedURLException -> 0x0198, ProtocolException -> 0x0192, IOException -> 0x018c, Exception -> 0x0187, all -> 0x0181 }
            com.inmobi.media.gy r13 = new com.inmobi.media.gy     // Catch:{ SocketTimeoutException -> 0x01a4, FileNotFoundException -> 0x019e, MalformedURLException -> 0x0198, ProtocolException -> 0x0192, IOException -> 0x018c, Exception -> 0x0187, all -> 0x0181 }
            r13.<init>()     // Catch:{ SocketTimeoutException -> 0x01a4, FileNotFoundException -> 0x019e, MalformedURLException -> 0x0198, ProtocolException -> 0x0192, IOException -> 0x018c, Exception -> 0x0187, all -> 0x0181 }
            java.util.Map r2 = r5.getHeaderFields()     // Catch:{ SocketTimeoutException -> 0x01a4, FileNotFoundException -> 0x019e, MalformedURLException -> 0x0198, ProtocolException -> 0x0192, IOException -> 0x018c, Exception -> 0x0187, all -> 0x0181 }
            r13.f15724c = r2     // Catch:{ SocketTimeoutException -> 0x01a4, FileNotFoundException -> 0x019e, MalformedURLException -> 0x0198, ProtocolException -> 0x0192, IOException -> 0x018c, Exception -> 0x0187, all -> 0x0181 }
            r2 = r23
            r3 = r0
            r4 = r20
            r14 = r6
            r15 = r7
            r6 = r11
            java.lang.String r2 = com.inmobi.media.C5842ax.m17435a(r2, r3, r4, r6)     // Catch:{ SocketTimeoutException -> 0x01a6, FileNotFoundException -> 0x01a0, MalformedURLException -> 0x019a, ProtocolException -> 0x0194, IOException -> 0x018e, Exception -> 0x0189, all -> 0x017f }
            r8.f14722k = r2     // Catch:{ SocketTimeoutException -> 0x01a6, FileNotFoundException -> 0x01a0, MalformedURLException -> 0x019a, ProtocolException -> 0x0194, IOException -> 0x018e, Exception -> 0x0189, all -> 0x017f }
            long r11 = r11 - r20
            r8.f14712a = r11     // Catch:{ SocketTimeoutException -> 0x01a6, FileNotFoundException -> 0x01a0, MalformedURLException -> 0x019a, ProtocolException -> 0x0194, IOException -> 0x018e, Exception -> 0x0189, all -> 0x017f }
            com.inmobi.media.bf r2 = r10.f14743a     // Catch:{ SocketTimeoutException -> 0x01a6, FileNotFoundException -> 0x01a0, MalformedURLException -> 0x019a, ProtocolException -> 0x0194, IOException -> 0x018e, Exception -> 0x0189, all -> 0x017f }
            java.lang.String r0 = r0.getAbsolutePath()     // Catch:{ SocketTimeoutException -> 0x01a6, FileNotFoundException -> 0x01a0, MalformedURLException -> 0x019a, ProtocolException -> 0x0194, IOException -> 0x018e, Exception -> 0x0189, all -> 0x017f }
            r2.mo34834a(r13, r0, r8)     // Catch:{ SocketTimeoutException -> 0x01a6, FileNotFoundException -> 0x01a0, MalformedURLException -> 0x019a, ProtocolException -> 0x0194, IOException -> 0x018e, Exception -> 0x0189, all -> 0x017f }
            com.inmobi.media.C6239hv.m18613a((java.io.Closeable) r15)
            goto L_0x020d
        L_0x017f:
            r0 = move-exception
            goto L_0x0184
        L_0x0181:
            r0 = move-exception
            r14 = r6
            r15 = r7
        L_0x0184:
            r4 = r15
            goto L_0x0213
        L_0x0187:
            r14 = r6
            r15 = r7
        L_0x0189:
            r4 = r15
            goto L_0x01cc
        L_0x018c:
            r14 = r6
            r15 = r7
        L_0x018e:
            r4 = r15
            r2 = 5
            goto L_0x01d7
        L_0x0192:
            r14 = r6
            r15 = r7
        L_0x0194:
            r4 = r15
            r2 = 5
            goto L_0x01e2
        L_0x0198:
            r14 = r6
            r15 = r7
        L_0x019a:
            r4 = r15
            r2 = 1
            goto L_0x01ed
        L_0x019e:
            r14 = r6
            r15 = r7
        L_0x01a0:
            r4 = r15
            r2 = 2
            goto L_0x01f8
        L_0x01a4:
            r14 = r6
            r15 = r7
        L_0x01a6:
            r4 = r15
            r2 = 2
            goto L_0x0203
        L_0x01aa:
            r0 = move-exception
            r14 = r6
            r4 = 0
            goto L_0x0213
        L_0x01af:
            r14 = r6
            r4 = 0
            goto L_0x01cc
        L_0x01b2:
            r14 = r6
            r2 = 5
            r4 = 0
            goto L_0x01d7
        L_0x01b6:
            r14 = r6
            r2 = 5
            r4 = 0
            goto L_0x01e2
        L_0x01ba:
            r14 = r6
            r2 = 1
            r4 = 0
            goto L_0x01ed
        L_0x01be:
            r14 = r6
            r2 = 2
            r4 = 0
            goto L_0x01f8
        L_0x01c2:
            r14 = r6
            r2 = 2
            r4 = 0
            goto L_0x0203
        L_0x01c6:
            r0 = move-exception
            r4 = 0
            r14 = 0
            goto L_0x0213
        L_0x01ca:
            r4 = 0
            r14 = 0
        L_0x01cc:
            r8.f14723l = r9     // Catch:{ all -> 0x0212 }
            com.inmobi.media.bf r0 = r10.f14743a     // Catch:{ all -> 0x0212 }
            r0.mo34833a(r8)     // Catch:{ all -> 0x0212 }
            goto L_0x020a
        L_0x01d4:
            r2 = 5
            r4 = 0
            r14 = 0
        L_0x01d7:
            r8.f14723l = r2     // Catch:{ all -> 0x0212 }
            com.inmobi.media.bf r0 = r10.f14743a     // Catch:{ all -> 0x0212 }
            r0.mo34833a(r8)     // Catch:{ all -> 0x0212 }
            goto L_0x020a
        L_0x01df:
            r2 = 5
            r4 = 0
            r14 = 0
        L_0x01e2:
            r8.f14723l = r2     // Catch:{ all -> 0x0212 }
            com.inmobi.media.bf r0 = r10.f14743a     // Catch:{ all -> 0x0212 }
            r0.mo34833a(r8)     // Catch:{ all -> 0x0212 }
            goto L_0x020a
        L_0x01ea:
            r2 = 1
            r4 = 0
            r14 = 0
        L_0x01ed:
            r8.f14723l = r2     // Catch:{ all -> 0x0212 }
            com.inmobi.media.bf r0 = r10.f14743a     // Catch:{ all -> 0x0212 }
            r0.mo34833a(r8)     // Catch:{ all -> 0x0212 }
            goto L_0x020a
        L_0x01f5:
            r2 = 2
            r4 = 0
            r14 = 0
        L_0x01f8:
            r8.f14723l = r2     // Catch:{ all -> 0x0212 }
            com.inmobi.media.bf r0 = r10.f14743a     // Catch:{ all -> 0x0212 }
            r0.mo34833a(r8)     // Catch:{ all -> 0x0212 }
            goto L_0x020a
        L_0x0200:
            r2 = 2
            r4 = 0
            r14 = 0
        L_0x0203:
            r8.f14723l = r2     // Catch:{ all -> 0x0212 }
            com.inmobi.media.bf r0 = r10.f14743a     // Catch:{ all -> 0x0212 }
            r0.mo34833a(r8)     // Catch:{ all -> 0x0212 }
        L_0x020a:
            com.inmobi.media.C6239hv.m18613a((java.io.Closeable) r4)
        L_0x020d:
            com.inmobi.media.C6239hv.m18613a((java.io.Closeable) r14)
            goto L_0x002e
        L_0x0212:
            r0 = move-exception
        L_0x0213:
            com.inmobi.media.C6239hv.m18613a((java.io.Closeable) r4)
            com.inmobi.media.C6239hv.m18613a((java.io.Closeable) r14)
            throw r0
        L_0x021a:
            r2 = 1
            r8.f14723l = r2
            com.inmobi.media.bf r0 = r10.f14743a
            r0.mo34833a(r8)
        L_0x0222:
            return r2
        L_0x0223:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C5861bg.m17557a(com.inmobi.media.av, com.inmobi.media.bf):boolean");
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m17567c(String str) {
        this.f14799k.remove(str);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public synchronized void m17548a(C5839av avVar, byte b) {
        m17547a(avVar);
        m17567c(avVar.f14715d);
        if (b == 0) {
            m17555a(avVar.f14715d);
            m17572f();
            return;
        }
        m17562b(avVar.f14715d);
        m17546a(b);
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public synchronized void m17572f() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < this.f14801n.size(); i++) {
            C5841aw awVar = this.f14801n.get(i);
            if (awVar.f14735d == awVar.f14733b.size()) {
                try {
                    C5871bh a = awVar.mo34757a();
                    if (a != null) {
                        a.mo34828a(awVar);
                    }
                    arrayList.add(awVar);
                } catch (Exception e) {
                    C6181gg.m18398a().mo35357a(new C6217hg(e));
                }
            }
        }
        m17556a((List<C5841aw>) arrayList);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public synchronized void m17546a(byte b) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < this.f14801n.size(); i++) {
            C5841aw awVar = this.f14801n.get(i);
            if (awVar.f14736e > 0) {
                try {
                    C5871bh a = awVar.mo34757a();
                    if (a != null) {
                        a.mo34829a(awVar, b);
                    }
                    arrayList.add(awVar);
                } catch (Exception e) {
                    C6181gg.m18398a().mo35357a(new C6217hg(e));
                }
            }
        }
        m17556a((List<C5841aw>) arrayList);
    }

    /* renamed from: b */
    public final void mo34835b() {
        this.f14798j.set(false);
        if (!C6239hv.m18616a()) {
            m17575g();
            m17577h();
            return;
        }
        synchronized (f14789m) {
            if (this.f14797i.compareAndSet(false, true)) {
                if (this.f14796h == null) {
                    HandlerThread handlerThread = new HandlerThread("assetFetcher");
                    this.f14796h = handlerThread;
                    handlerThread.start();
                }
                if (this.f14795g == null) {
                    this.f14795g = new C5867a(this.f14796h.getLooper(), this);
                }
                if (C5858be.m17535c().isEmpty()) {
                    m17579i();
                } else {
                    m17575g();
                    m17577h();
                    this.f14795g.sendEmptyMessage(1);
                }
            }
        }
    }

    /* renamed from: c */
    public final void mo34836c() {
        this.f14798j.set(true);
        m17579i();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00ad, code lost:
        return;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo34837d() {
        /*
            r11 = this;
            java.lang.Object r0 = f14789m
            monitor-enter(r0)
            java.util.List r1 = com.inmobi.media.C5858be.m17538d()     // Catch:{ all -> 0x00ae }
            boolean r2 = r1.isEmpty()     // Catch:{ all -> 0x00ae }
            if (r2 == 0) goto L_0x000f
            monitor-exit(r0)     // Catch:{ all -> 0x00ae }
            return
        L_0x000f:
            java.util.Iterator r2 = r1.iterator()     // Catch:{ all -> 0x00ae }
        L_0x0013:
            boolean r3 = r2.hasNext()     // Catch:{ all -> 0x00ae }
            r4 = 1
            r5 = 0
            if (r3 == 0) goto L_0x0033
            java.lang.Object r3 = r2.next()     // Catch:{ all -> 0x00ae }
            com.inmobi.media.av r3 = (com.inmobi.media.C5839av) r3     // Catch:{ all -> 0x00ae }
            long r6 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x00ae }
            long r8 = r3.f14719h     // Catch:{ all -> 0x00ae }
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 <= 0) goto L_0x002c
            goto L_0x002d
        L_0x002c:
            r4 = r5
        L_0x002d:
            if (r4 == 0) goto L_0x0013
            m17560b((com.inmobi.media.C5839av) r3)     // Catch:{ all -> 0x00ae }
            goto L_0x0013
        L_0x0033:
            java.util.List r2 = com.inmobi.media.C5858be.m17538d()     // Catch:{ all -> 0x00ae }
            r6 = 0
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x00ae }
        L_0x003d:
            boolean r3 = r2.hasNext()     // Catch:{ all -> 0x00ae }
            if (r3 == 0) goto L_0x0056
            java.lang.Object r3 = r2.next()     // Catch:{ all -> 0x00ae }
            com.inmobi.media.av r3 = (com.inmobi.media.C5839av) r3     // Catch:{ all -> 0x00ae }
            java.io.File r8 = new java.io.File     // Catch:{ all -> 0x00ae }
            java.lang.String r3 = r3.f14716e     // Catch:{ all -> 0x00ae }
            r8.<init>(r3)     // Catch:{ all -> 0x00ae }
            long r8 = r8.length()     // Catch:{ all -> 0x00ae }
            long r6 = r6 + r8
            goto L_0x003d
        L_0x0056:
            com.inmobi.media.fq$a r2 = r11.f14792d     // Catch:{ all -> 0x00ae }
            long r2 = r2.maxCacheSize     // Catch:{ all -> 0x00ae }
            int r2 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r2 <= 0) goto L_0x0068
            com.inmobi.media.av r2 = com.inmobi.media.C5858be.m17533b()     // Catch:{ all -> 0x00ae }
            if (r2 == 0) goto L_0x0068
            m17560b((com.inmobi.media.C5839av) r2)     // Catch:{ all -> 0x00ae }
            goto L_0x0033
        L_0x0068:
            android.content.Context r2 = com.inmobi.media.C6227ho.m18551c()     // Catch:{ all -> 0x00ae }
            java.io.File r2 = com.inmobi.media.C6227ho.m18546b((android.content.Context) r2)     // Catch:{ all -> 0x00ae }
            boolean r3 = r2.exists()     // Catch:{ all -> 0x00ae }
            if (r3 == 0) goto L_0x00ac
            java.io.File[] r2 = r2.listFiles()     // Catch:{ all -> 0x00ae }
            if (r2 == 0) goto L_0x00ac
            int r3 = r2.length     // Catch:{ all -> 0x00ae }
            r6 = r5
        L_0x007e:
            if (r6 >= r3) goto L_0x00ac
            r7 = r2[r6]     // Catch:{ all -> 0x00ae }
            java.util.Iterator r8 = r1.iterator()     // Catch:{ all -> 0x00ae }
        L_0x0086:
            boolean r9 = r8.hasNext()     // Catch:{ all -> 0x00ae }
            if (r9 == 0) goto L_0x00a0
            java.lang.Object r9 = r8.next()     // Catch:{ all -> 0x00ae }
            com.inmobi.media.av r9 = (com.inmobi.media.C5839av) r9     // Catch:{ all -> 0x00ae }
            java.lang.String r10 = r7.getAbsolutePath()     // Catch:{ all -> 0x00ae }
            java.lang.String r9 = r9.f14716e     // Catch:{ all -> 0x00ae }
            boolean r9 = r10.equals(r9)     // Catch:{ all -> 0x00ae }
            if (r9 == 0) goto L_0x0086
            r8 = r4
            goto L_0x00a1
        L_0x00a0:
            r8 = r5
        L_0x00a1:
            if (r8 != 0) goto L_0x00a9
            r7.getAbsolutePath()     // Catch:{ all -> 0x00ae }
            r7.delete()     // Catch:{ all -> 0x00ae }
        L_0x00a9:
            int r6 = r6 + 1
            goto L_0x007e
        L_0x00ac:
            monitor-exit(r0)     // Catch:{ all -> 0x00ae }
            return
        L_0x00ae:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00ae }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C5861bg.mo34837d():void");
    }

    /* renamed from: b */
    private static void m17560b(C5839av avVar) {
        C5858be.m17536c(avVar);
        File file = new File(avVar.f14716e);
        if (file.exists()) {
            file.delete();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m17564c(C5839av avVar) {
        File file = new File(avVar.f14716e);
        long min = Math.min(System.currentTimeMillis() + (avVar.f14719h - avVar.f14717f), System.currentTimeMillis() + (this.f14792d.timeToLive * 1000));
        C5839av.C5840a aVar = new C5839av.C5840a();
        String str = avVar.f14715d;
        String str2 = avVar.f14716e;
        int i = this.f14792d.maxRetries;
        long j = avVar.f14720i;
        aVar.f14726c = str;
        aVar.f14727d = str2;
        aVar.f14725b = i;
        aVar.f14730g = min;
        aVar.f14731h = j;
        C5839av a = aVar.mo34756a();
        a.f14717f = System.currentTimeMillis();
        C5858be.m17532b(a);
        a.f14722k = C5842ax.m17435a(avVar, file, avVar.f14717f, avVar.f14717f);
        a.f14721j = true;
        m17548a(a, (byte) 0);
    }

    /* renamed from: com.inmobi.media.bg$c */
    /* compiled from: AssetStore */
    class C5870c implements InvocationHandler {

        /* renamed from: b */
        private CountDownLatch f14817b;

        /* renamed from: c */
        private String f14818c;

        /* renamed from: d */
        private long f14819d;

        /* renamed from: e */
        private String f14820e;

        C5870c(CountDownLatch countDownLatch, String str, long j, String str2) {
            this.f14817b = countDownLatch;
            this.f14818c = str;
            this.f14819d = j;
            this.f14820e = str2;
        }

        public final Object invoke(Object obj, Method method, Object[] objArr) {
            String unused = C5861bg.f14788b;
            if (method == null) {
                return null;
            }
            if ("onSuccess".equalsIgnoreCase(method.getName())) {
                HashMap hashMap = new HashMap();
                hashMap.put("latency", Long.valueOf(SystemClock.elapsedRealtime() - this.f14819d));
                hashMap.put("size", 0);
                hashMap.put("assetType", "image");
                hashMap.put("networkType", C6251ib.m18652b());
                hashMap.put(C11286Ad.AD_TYPE, this.f14820e);
                C6218hh.m18506a().mo35424a("AssetDownloaded", (Map<String, Object>) hashMap);
                C5861bg.this.m17555a(this.f14818c);
                this.f14817b.countDown();
                return null;
            } else if (!"onError".equalsIgnoreCase(method.getName())) {
                return null;
            } else {
                C5861bg.this.m17562b(this.f14818c);
                this.f14817b.countDown();
                return null;
            }
        }
    }

    /* renamed from: g */
    private void m17575g() {
        C6243hz.m18635a();
        C6243hz.m18636a(this.f14800l, "android.net.conn.CONNECTIVITY_CHANGE");
        if (Build.VERSION.SDK_INT >= 23) {
            C6243hz.m18635a();
            C6243hz.m18640b(this.f14800l);
        }
    }

    /* renamed from: h */
    private void m17577h() {
        C6243hz.m18635a().mo35460a("android.net.conn.CONNECTIVITY_CHANGE", this.f14800l);
        if (Build.VERSION.SDK_INT >= 23) {
            C6243hz.m18635a().mo35459a(this.f14800l);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public void m17579i() {
        synchronized (f14789m) {
            this.f14797i.set(false);
            this.f14799k.clear();
            if (this.f14796h != null) {
                this.f14796h.getLooper().quit();
                this.f14796h.interrupt();
                this.f14796h = null;
                this.f14795g = null;
            }
        }
    }

    /* renamed from: com.inmobi.media.bg$a */
    /* compiled from: AssetStore */
    static final class C5867a extends Handler {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public WeakReference<C5861bg> f14812a;

        /* renamed from: b */
        private final C5860bf f14813b = new C5860bf() {
            /* renamed from: a */
            public final void mo34834a(C6207gy gyVar, String str, C5839av avVar) {
                C5861bg bgVar = (C5861bg) C5867a.this.f14812a.get();
                if (bgVar != null) {
                    String unused = C5861bg.f14788b;
                    C5839av a = new C5839av.C5840a().mo34755a(avVar.f14715d, str, gyVar, bgVar.f14792d.maxRetries, bgVar.f14792d.timeToLive).mo34756a();
                    C5858be unused2 = bgVar.f14791c;
                    C5858be.m17532b(a);
                    a.f14722k = avVar.f14722k;
                    a.f14712a = avVar.f14712a;
                    bgVar.m17548a(a, (byte) 0);
                    C5867a.this.m17588a();
                    return;
                }
                String unused3 = C5861bg.f14788b;
            }

            /* renamed from: a */
            public final void mo34833a(C5839av avVar) {
                C5861bg bgVar = (C5861bg) C5867a.this.f14812a.get();
                if (bgVar != null) {
                    String unused = C5861bg.f14788b;
                    bgVar.m17567c(avVar.f14715d);
                    if (avVar.f14714c > 0) {
                        avVar.f14714c--;
                        avVar.f14717f = System.currentTimeMillis();
                        C5858be unused2 = bgVar.f14791c;
                        C5858be.m17532b(avVar);
                        C5867a.this.m17591b();
                        return;
                    }
                    bgVar.m17548a(avVar, avVar.f14723l);
                    C5867a.this.m17589a(avVar);
                    return;
                }
                String unused3 = C5861bg.f14788b;
            }
        };

        C5867a(Looper looper, C5861bg bgVar) {
            super(looper);
            this.f14812a = new WeakReference<>(bgVar);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:65:?, code lost:
            com.inmobi.media.C5861bg.m17570e();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:71:?, code lost:
            return;
         */
        /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
        /* JADX WARNING: Missing exception handler attribute for start block: B:64:0x0113 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void handleMessage(android.os.Message r9) {
            /*
                r8 = this;
                java.lang.ref.WeakReference<com.inmobi.media.bg> r0 = r8.f14812a     // Catch:{ Exception -> 0x0117 }
                java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x0117 }
                com.inmobi.media.bg r0 = (com.inmobi.media.C5861bg) r0     // Catch:{ Exception -> 0x0117 }
                int r1 = r9.what     // Catch:{ Exception -> 0x0117 }
                r2 = 0
                r3 = 2
                r4 = 1
                if (r1 == r4) goto L_0x0088
                if (r1 == r3) goto L_0x002d
                r2 = 3
                if (r1 == r2) goto L_0x0028
                r2 = 4
                if (r1 == r2) goto L_0x0018
                return
            L_0x0018:
                if (r0 == 0) goto L_0x0024
                java.lang.Object r9 = r9.obj     // Catch:{ Exception -> 0x0117 }
                com.inmobi.media.av r9 = (com.inmobi.media.C5839av) r9     // Catch:{ Exception -> 0x0117 }
                com.inmobi.media.C5858be unused = r0.f14791c     // Catch:{ Exception -> 0x0117 }
                com.inmobi.media.C5858be.m17536c(r9)     // Catch:{ Exception -> 0x0117 }
            L_0x0024:
                r8.m17591b()     // Catch:{ Exception -> 0x0117 }
                return
            L_0x0028:
                r8.m17591b()     // Catch:{ Exception -> 0x0117 }
                goto L_0x0116
            L_0x002d:
                if (r0 == 0) goto L_0x0116
                java.lang.Object r9 = r9.obj     // Catch:{ Exception -> 0x0117 }
                java.lang.String r9 = (java.lang.String) r9     // Catch:{ Exception -> 0x0117 }
                com.inmobi.media.C5858be unused = r0.f14791c     // Catch:{ Exception -> 0x0117 }
                com.inmobi.media.av r9 = com.inmobi.media.C5858be.m17534b((java.lang.String) r9)     // Catch:{ Exception -> 0x0117 }
                if (r9 != 0) goto L_0x0040
                r8.m17591b()     // Catch:{ Exception -> 0x0117 }
                return
            L_0x0040:
                boolean r1 = r9.mo34750a()     // Catch:{ Exception -> 0x0117 }
                if (r1 != 0) goto L_0x007e
                com.inmobi.media.C6125fq.C6130a unused = r0.f14792d     // Catch:{ Exception -> 0x0117 }
                int r1 = r9.f14714c     // Catch:{ Exception -> 0x0117 }
                if (r1 != 0) goto L_0x0059
                r1 = 6
                r9.f14723l = r1     // Catch:{ Exception -> 0x0117 }
                byte r1 = r9.f14723l     // Catch:{ Exception -> 0x0117 }
                r0.m17548a((com.inmobi.media.C5839av) r9, (byte) r1)     // Catch:{ Exception -> 0x0117 }
                r8.m17589a((com.inmobi.media.C5839av) r9)     // Catch:{ Exception -> 0x0117 }
                return
            L_0x0059:
                boolean r1 = com.inmobi.media.C6239hv.m18616a()     // Catch:{ Exception -> 0x0117 }
                if (r1 != 0) goto L_0x0068
                byte r1 = r9.f14723l     // Catch:{ Exception -> 0x0117 }
                r0.m17548a((com.inmobi.media.C5839av) r9, (byte) r1)     // Catch:{ Exception -> 0x0117 }
                r0.m17579i()     // Catch:{ Exception -> 0x0117 }
                return
            L_0x0068:
                com.inmobi.media.bf r1 = r8.f14813b     // Catch:{ Exception -> 0x0117 }
                boolean r9 = r0.m17557a((com.inmobi.media.C5839av) r9, (com.inmobi.media.C5860bf) r1)     // Catch:{ Exception -> 0x0117 }
                if (r9 == 0) goto L_0x0077
                java.lang.String unused = com.inmobi.media.C5861bg.f14788b     // Catch:{ Exception -> 0x0117 }
                java.lang.String unused = com.inmobi.media.C5861bg.f14788b     // Catch:{ Exception -> 0x0117 }
                return
            L_0x0077:
                java.lang.String unused = com.inmobi.media.C5861bg.f14788b     // Catch:{ Exception -> 0x0117 }
                r8.m17591b()     // Catch:{ Exception -> 0x0117 }
                return
            L_0x007e:
                java.lang.String unused = com.inmobi.media.C5861bg.f14788b     // Catch:{ Exception -> 0x0117 }
                r8.m17588a()     // Catch:{ Exception -> 0x0117 }
                r0.m17548a((com.inmobi.media.C5839av) r9, (byte) r2)     // Catch:{ Exception -> 0x0117 }
                return
            L_0x0088:
                if (r0 == 0) goto L_0x0116
                com.inmobi.media.fq$a r9 = r0.f14792d     // Catch:{ Exception -> 0x0117 }
                if (r9 != 0) goto L_0x009f
                java.lang.String r9 = "ads"
                java.lang.String r1 = com.inmobi.media.C6227ho.m18559f()     // Catch:{ Exception -> 0x0117 }
                r5 = 0
                com.inmobi.media.fr r9 = com.inmobi.media.C6145fs.m18321a(r9, r1, r5)     // Catch:{ Exception -> 0x0117 }
                com.inmobi.media.fq r9 = (com.inmobi.media.C6125fq) r9     // Catch:{ Exception -> 0x0117 }
                com.inmobi.media.fq$a r9 = r9.assetCache     // Catch:{ Exception -> 0x0117 }
            L_0x009f:
                com.inmobi.media.C5858be unused = r0.f14791c     // Catch:{ Exception -> 0x0117 }
                java.util.List r1 = com.inmobi.media.C5858be.m17535c()     // Catch:{ Exception -> 0x0117 }
                int r5 = r1.size()     // Catch:{ Exception -> 0x0117 }
                if (r5 > 0) goto L_0x00b3
                java.lang.String unused = com.inmobi.media.C5861bg.f14788b     // Catch:{ Exception -> 0x0117 }
                r0.m17579i()     // Catch:{ Exception -> 0x0117 }
                return
            L_0x00b3:
                java.lang.String unused = com.inmobi.media.C5861bg.f14788b     // Catch:{ Exception -> 0x0117 }
                java.lang.Object r2 = r1.get(r2)     // Catch:{ Exception -> 0x0117 }
                com.inmobi.media.av r2 = (com.inmobi.media.C5839av) r2     // Catch:{ Exception -> 0x0117 }
                java.util.Iterator r1 = r1.iterator()     // Catch:{ Exception -> 0x0117 }
            L_0x00c0:
                boolean r5 = r1.hasNext()     // Catch:{ Exception -> 0x0117 }
                if (r5 == 0) goto L_0x00d3
                java.lang.Object r5 = r1.next()     // Catch:{ Exception -> 0x0117 }
                com.inmobi.media.av r5 = (com.inmobi.media.C5839av) r5     // Catch:{ Exception -> 0x0117 }
                boolean r6 = r0.f14799k.containsKey(r2.f14715d)     // Catch:{ Exception -> 0x0117 }
                if (r6 != 0) goto L_0x00c0
                r2 = r5
            L_0x00d3:
                android.os.Message r1 = android.os.Message.obtain()     // Catch:{ Exception -> 0x0117 }
                r1.what = r4     // Catch:{ Exception -> 0x0117 }
                long r4 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0117 }
                long r6 = r2.f14717f     // Catch:{ Exception -> 0x0117 }
                long r4 = r4 - r6
                int r6 = r9.retryInterval     // Catch:{ Exception -> 0x0113 }
                int r6 = r6 * 1000
                long r6 = (long) r6     // Catch:{ Exception -> 0x0113 }
                int r6 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                if (r6 >= 0) goto L_0x00f3
                int r9 = r9.retryInterval     // Catch:{ Exception -> 0x0113 }
                int r9 = r9 * 1000
                long r2 = (long) r9     // Catch:{ Exception -> 0x0113 }
                long r2 = r2 - r4
                r8.sendMessageDelayed(r1, r2)     // Catch:{ Exception -> 0x0113 }
                return
            L_0x00f3:
                boolean r0 = r0.f14799k.containsKey(r2.f14715d)     // Catch:{ Exception -> 0x0113 }
                if (r0 == 0) goto L_0x0102
                int r9 = r9.retryInterval     // Catch:{ Exception -> 0x0113 }
                int r9 = r9 * 1000
                long r2 = (long) r9     // Catch:{ Exception -> 0x0113 }
                r8.sendMessageDelayed(r1, r2)     // Catch:{ Exception -> 0x0113 }
                return
            L_0x0102:
                java.lang.String unused = com.inmobi.media.C5861bg.f14788b     // Catch:{ Exception -> 0x0113 }
                android.os.Message r9 = android.os.Message.obtain()     // Catch:{ Exception -> 0x0113 }
                r9.what = r3     // Catch:{ Exception -> 0x0113 }
                java.lang.String r0 = r2.f14715d     // Catch:{ Exception -> 0x0113 }
                r9.obj = r0     // Catch:{ Exception -> 0x0113 }
                r8.sendMessage(r9)     // Catch:{ Exception -> 0x0113 }
                return
            L_0x0113:
                java.lang.String unused = com.inmobi.media.C5861bg.f14788b     // Catch:{ Exception -> 0x0117 }
            L_0x0116:
                return
            L_0x0117:
                r9 = move-exception
                java.lang.String unused = com.inmobi.media.C5861bg.f14788b
                com.inmobi.media.gg r0 = com.inmobi.media.C6181gg.m18398a()
                com.inmobi.media.hg r1 = new com.inmobi.media.hg
                r1.<init>(r9)
                r0.mo35357a((com.inmobi.media.C6217hg) r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C5861bg.C5867a.handleMessage(android.os.Message):void");
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void m17589a(C5839av avVar) {
            try {
                Message obtain = Message.obtain();
                obtain.what = 4;
                obtain.obj = avVar;
                sendMessage(obtain);
            } catch (Exception unused) {
                String unused2 = C5861bg.f14788b;
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void m17588a() {
            try {
                sendEmptyMessage(3);
            } catch (Exception unused) {
                String unused2 = C5861bg.f14788b;
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public void m17591b() {
            try {
                sendEmptyMessage(1);
            } catch (Exception unused) {
                String unused2 = C5861bg.f14788b;
            }
        }
    }

    /* renamed from: c */
    static /* synthetic */ void m17565c(C5861bg bgVar) {
        if (!bgVar.f14798j.get()) {
            bgVar.mo34835b();
        }
    }

    /* renamed from: b */
    static /* synthetic */ void m17561b(C5861bg bgVar, final String str) {
        C5839av a = C5858be.m17530a(str);
        if (a == null || !a.mo34750a()) {
            C5839av a2 = new C5839av.C5840a().mo34754a(str, bgVar.f14792d.maxRetries, bgVar.f14792d.timeToLive).mo34756a();
            if (C5858be.m17530a(str) == null) {
                bgVar.f14791c.mo34832a(a2);
            }
            bgVar.f14794f.execute(new Runnable() {
                public final void run() {
                    C5858be unused = C5861bg.this.f14791c;
                    C5839av a = C5858be.m17530a(str);
                    if (a == null) {
                        return;
                    }
                    if (a.mo34750a()) {
                        C5861bg.this.m17564c(a);
                        return;
                    }
                    C5861bg bgVar = C5861bg.this;
                    if (bgVar.m17557a(a, bgVar.f14802o)) {
                        String unused2 = C5861bg.f14788b;
                    } else {
                        String unused3 = C5861bg.f14788b;
                    }
                }
            });
            return;
        }
        bgVar.m17564c(a);
    }

    /* renamed from: a */
    static /* synthetic */ void m17554a(C5861bg bgVar, List list, String str) {
        CountDownLatch countDownLatch = new CountDownLatch(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            try {
                C5981di.m17851a(C6227ho.m18551c()).load(str2).fetch((Callback) C5981di.m17853a((InvocationHandler) new C5870c(countDownLatch, str2, SystemClock.elapsedRealtime(), str)));
            } catch (Exception unused) {
                countDownLatch.countDown();
            }
        }
        try {
            countDownLatch.await();
        } catch (InterruptedException unused2) {
        }
    }
}

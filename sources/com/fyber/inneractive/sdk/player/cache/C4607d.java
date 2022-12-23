package com.fyber.inneractive.sdk.player.cache;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.HandlerThread;
import android.text.TextUtils;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.global.C4309s;
import com.fyber.inneractive.sdk.config.global.features.C4292j;
import com.fyber.inneractive.sdk.player.cache.C4614h;
import com.fyber.inneractive.sdk.player.controller.C4635d;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.C4996g;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.C5000j;
import com.fyber.inneractive.sdk.util.C5327f;
import com.fyber.inneractive.sdk.util.C5360n0;
import com.fyber.inneractive.sdk.util.C5370s;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Locale;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.fyber.inneractive.sdk.player.cache.d */
public class C4607d implements C4996g {

    /* renamed from: a */
    public boolean f11471a = false;

    /* renamed from: b */
    public C4596a f11472b;

    /* renamed from: c */
    public C4614h f11473c;

    /* renamed from: d */
    public Uri f11474d;

    /* renamed from: e */
    public long f11475e = 0;

    /* renamed from: f */
    public FileInputStream f11476f;

    /* renamed from: g */
    public FileInputStream f11477g;

    /* renamed from: h */
    public C4609b f11478h;

    /* renamed from: i */
    public C4610c f11479i;

    /* renamed from: j */
    public int f11480j;

    /* renamed from: k */
    public C4309s f11481k;

    /* renamed from: com.fyber.inneractive.sdk.player.cache.d$a */
    public class C4608a implements C4614h.C4622h {

        /* renamed from: a */
        public final /* synthetic */ C5327f f11482a;

        /* renamed from: b */
        public final /* synthetic */ AtomicReference f11483b;

        /* renamed from: c */
        public final /* synthetic */ CountDownLatch f11484c;

        public C4608a(C5327f fVar, AtomicReference atomicReference, CountDownLatch countDownLatch) {
            this.f11482a = fVar;
            this.f11483b = atomicReference;
            this.f11484c = countDownLatch;
        }

        /* renamed from: a */
        public void mo24835a(C4614h hVar, C4596a aVar, Exception exc) {
            C4609b bVar;
            C4607d dVar = C4607d.this;
            if (!dVar.f11471a) {
                if (exc == null) {
                    Bitmap bitmap = this.f11482a.f14178b;
                    if (!(bitmap == null || (bVar = dVar.f11478h) == null)) {
                        ((C4635d) bVar).f11555C = bitmap;
                    }
                    dVar.f11472b = aVar;
                } else {
                    this.f11483b.set(exc);
                }
            }
            this.f11484c.countDown();
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.player.cache.d$b */
    public interface C4609b {
    }

    /* renamed from: com.fyber.inneractive.sdk.player.cache.d$c */
    public interface C4610c {
    }

    /* renamed from: a */
    public long mo24831a(C5000j jVar) throws IOException {
        String str;
        C4292j jVar2;
        C4597b bVar;
        C4292j.C4296d dVar;
        C5000j jVar3 = jVar;
        if (this.f11472b == null) {
            CountDownLatch countDownLatch = new CountDownLatch(1);
            AtomicReference atomicReference = new AtomicReference();
            C5327f fVar = new C5327f();
            Uri uri = jVar3.f13327a;
            this.f11474d = uri;
            C4629n nVar = C4629n.f11534f;
            int i = this.f11480j;
            String uri2 = uri.toString();
            C4309s sVar = this.f11481k;
            C4608a aVar = new C4608a(fVar, atomicReference, countDownLatch);
            C4599c cVar = nVar.f11536b;
            boolean a = IAConfigManager.f10525J.f10557v.f10660b.mo24347a("validateHasVideoTracks", false);
            if (sVar == null) {
                jVar2 = null;
            } else {
                jVar2 = (C4292j) sVar.mo24338a(C4292j.class);
            }
            if (jVar2 != null) {
                C4292j.C4296d dVar2 = C4292j.C4296d.LEGACY;
                String a2 = jVar2.mo24311a("v_type", "legacy");
                C4292j.C4296d[] values = C4292j.C4296d.values();
                int length = values.length;
                C4292j.C4296d dVar3 = dVar2;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        dVar = dVar3;
                        break;
                    }
                    int i3 = length;
                    C4292j.C4296d dVar4 = values[i2];
                    C4292j.C4296d[] dVarArr = values;
                    C4292j.C4296d dVar5 = dVar4;
                    if (TextUtils.equals(dVar4.f10639a, a2.toLowerCase(Locale.US))) {
                        dVar = dVar5;
                        break;
                    }
                    i2++;
                    length = i3;
                    values = dVarArr;
                }
                int ordinal = dVar.ordinal();
                if (ordinal == 1) {
                    bVar = new C4623i();
                } else if (ordinal != 2) {
                    bVar = new C4624j(a);
                } else {
                    bVar = new C4625k();
                }
            } else {
                bVar = new C4624j(a);
            }
            C4614h hVar = new C4614h(cVar, uri2, bVar, i, sVar);
            hVar.f11498g = aVar;
            nVar.f11538d.add(hVar.mo24839a());
            this.f11473c = hVar;
            hVar.f11508q = fVar;
            hVar.f11506o = true;
            HandlerThread handlerThread = hVar.f11500i;
            if (handlerThread != null) {
                handlerThread.start();
                C5360n0 n0Var = new C5360n0(hVar.f11500i.getLooper(), hVar);
                hVar.f11501j = n0Var;
                n0Var.post(new C4612f(hVar));
            }
            C4610c cVar2 = this.f11479i;
            if (cVar2 != null) {
                ((C4635d) cVar2).f11558F.add(this.f11473c);
            }
            try {
                countDownLatch.await(7, TimeUnit.SECONDS);
                if (this.f11472b == null) {
                    if (atomicReference.get() == null) {
                        throw new IOException("Cache has failed to download");
                    }
                    throw new IOException((Throwable) atomicReference.get());
                }
            } catch (InterruptedException e) {
                C4614h hVar2 = this.f11473c;
                hVar2.mo24842a(hVar2.f11506o);
                throw new IOException(e);
            }
        }
        this.f11475e = jVar3.f13330d;
        C4596a aVar2 = this.f11472b;
        if (aVar2.f11432c) {
            str = aVar2.f11434e.get("http.file.length");
        } else {
            str = String.valueOf(aVar2.mo24803a().length());
        }
        if (str == null || !TextUtils.isDigitsOnly(str)) {
            return -1;
        }
        return Long.parseLong(str);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(10:7|(2:10|8)|48|11|12|13|29|30|31|33) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x0077 */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0071 A[SYNTHETIC, Splitter:B:24:0x0071] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0076  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo24833b(byte[] r12, int r13, int r14) throws java.io.IOException {
        /*
            r11 = this;
            com.fyber.inneractive.sdk.player.cache.a r0 = r11.f11472b
            java.lang.String r0 = r0.f11431b
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream
            int r2 = r12.length
            r1.<init>(r2)
            long r2 = r11.f11475e
            int r2 = (int) r2
            com.fyber.inneractive.sdk.util.d r3 = com.fyber.inneractive.sdk.util.C5319d.f14156b
            java.nio.ByteBuffer r3 = r3.mo26442b()
            r4 = 0
            r5 = 0
            java.net.URL r6 = new java.net.URL     // Catch:{ IOException -> 0x0082, all -> 0x006e }
            r6.<init>(r0)     // Catch:{ IOException -> 0x0082, all -> 0x006e }
            java.net.URLConnection r0 = r6.openConnection()     // Catch:{ IOException -> 0x0082, all -> 0x006e }
            java.net.HttpURLConnection r0 = (java.net.HttpURLConnection) r0     // Catch:{ IOException -> 0x0082, all -> 0x006e }
            java.lang.String r6 = "Range"
            java.util.Locale r7 = java.util.Locale.ENGLISH     // Catch:{ IOException -> 0x006a, all -> 0x0066 }
            java.lang.String r8 = "bytes=%d-"
            r9 = 1
            java.lang.Object[] r9 = new java.lang.Object[r9]     // Catch:{ IOException -> 0x006a, all -> 0x0066 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ IOException -> 0x006a, all -> 0x0066 }
            r9[r4] = r2     // Catch:{ IOException -> 0x006a, all -> 0x0066 }
            java.lang.String r2 = java.lang.String.format(r7, r8, r9)     // Catch:{ IOException -> 0x006a, all -> 0x0066 }
            r0.setRequestProperty(r6, r2)     // Catch:{ IOException -> 0x006a, all -> 0x0066 }
            r0.connect()     // Catch:{ IOException -> 0x006a, all -> 0x0066 }
            int r2 = r0.getResponseCode()     // Catch:{ IOException -> 0x006a, all -> 0x0066 }
            r6 = 206(0xce, float:2.89E-43)
            if (r2 != r6) goto L_0x005e
            java.io.InputStream r5 = r0.getInputStream()     // Catch:{ IOException -> 0x006a, all -> 0x0066 }
            byte[] r2 = r3.array()     // Catch:{ IOException -> 0x006a, all -> 0x0066 }
        L_0x0049:
            int r3 = r5.read(r2)     // Catch:{ IOException -> 0x006a, all -> 0x0066 }
            r6 = -1
            if (r3 == r6) goto L_0x0054
            r1.write(r2)     // Catch:{ IOException -> 0x006a, all -> 0x0066 }
            goto L_0x0049
        L_0x0054:
            r5.close()     // Catch:{ IOException -> 0x006a, all -> 0x0066 }
            r0.disconnect()     // Catch:{ IOException -> 0x006a, all -> 0x0066 }
            r0.disconnect()     // Catch:{ Exception -> 0x0077 }
            goto L_0x0077
        L_0x005e:
            java.io.IOException r2 = new java.io.IOException     // Catch:{ IOException -> 0x006a, all -> 0x0066 }
            java.lang.String r3 = "Server did not reply with proper range."
            r2.<init>(r3)     // Catch:{ IOException -> 0x006a, all -> 0x0066 }
            throw r2     // Catch:{ IOException -> 0x006a, all -> 0x0066 }
        L_0x0066:
            r10 = r5
            r5 = r0
            r0 = r10
            goto L_0x006f
        L_0x006a:
            r12 = move-exception
            r13 = r5
            r5 = r0
            goto L_0x0084
        L_0x006e:
            r0 = r5
        L_0x006f:
            if (r5 == 0) goto L_0x0074
            r5.disconnect()     // Catch:{ Exception -> 0x0074 }
        L_0x0074:
            if (r0 == 0) goto L_0x007a
            r5 = r0
        L_0x0077:
            r5.close()     // Catch:{ Exception -> 0x007a }
        L_0x007a:
            byte[] r0 = r1.toByteArray()
            java.lang.System.arraycopy(r0, r4, r12, r13, r14)
            return r14
        L_0x0082:
            r12 = move-exception
            r13 = r5
        L_0x0084:
            throw r12     // Catch:{ all -> 0x0085 }
        L_0x0085:
            r12 = move-exception
            if (r5 == 0) goto L_0x008b
            r5.disconnect()     // Catch:{ Exception -> 0x008b }
        L_0x008b:
            if (r13 == 0) goto L_0x0090
            r13.close()     // Catch:{ Exception -> 0x0090 }
        L_0x0090:
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.cache.C4607d.mo24833b(byte[], int, int):int");
    }

    public void close() throws IOException {
        this.f11471a = true;
        this.f11475e = 0;
        C5370s.m16792b(this.f11476f);
        C5370s.m16792b(this.f11477g);
        this.f11476f = null;
        this.f11477g = null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x0083 A[Catch:{ InterruptedException -> 0x003e }] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0097 A[Catch:{ InterruptedException -> 0x003e }] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0098 A[Catch:{ InterruptedException -> 0x003e }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo24830a(byte[] r10, int r11, int r12) throws java.io.IOException {
        /*
            r9 = this;
            com.fyber.inneractive.sdk.player.cache.a r0 = r9.f11472b
            if (r0 != 0) goto L_0x0006
            r10 = -1
            return r10
        L_0x0006:
            if (r12 != 0) goto L_0x0009
            return r12
        L_0x0009:
            java.lang.Object r0 = r0.f11433d
            monitor-enter(r0)
            com.fyber.inneractive.sdk.player.cache.a r1 = r9.f11472b     // Catch:{ all -> 0x00b6 }
            java.io.File r1 = r1.mo24803a()     // Catch:{ all -> 0x00b6 }
            long r1 = r1.length()     // Catch:{ all -> 0x00b6 }
            int r1 = (int) r1     // Catch:{ all -> 0x00b6 }
            if (r11 <= r1) goto L_0x001f
            int r10 = r9.mo24833b(r10, r11, r12)     // Catch:{ all -> 0x00b6 }
            monitor-exit(r0)     // Catch:{ all -> 0x00b6 }
            return r10
        L_0x001f:
            com.fyber.inneractive.sdk.player.cache.a r2 = r9.f11472b     // Catch:{ all -> 0x00b6 }
            boolean r2 = r2.f11432c     // Catch:{ all -> 0x00b6 }
            r3 = 0
            r5 = 0
            r6 = 1
            if (r2 == 0) goto L_0x0058
        L_0x0029:
            int r2 = r1 - r11
            if (r2 > 0) goto L_0x0045
            r1 = 50
            r9.wait(r3, r1)     // Catch:{ InterruptedException -> 0x003e }
            com.fyber.inneractive.sdk.player.cache.a r1 = r9.f11472b     // Catch:{ all -> 0x00b6 }
            java.io.File r1 = r1.mo24803a()     // Catch:{ all -> 0x00b6 }
            long r1 = r1.length()     // Catch:{ all -> 0x00b6 }
            int r1 = (int) r1     // Catch:{ all -> 0x00b6 }
            goto L_0x0029
        L_0x003e:
            r10 = move-exception
            java.io.IOException r11 = new java.io.IOException     // Catch:{ all -> 0x00b6 }
            r11.<init>(r10)     // Catch:{ all -> 0x00b6 }
            throw r11     // Catch:{ all -> 0x00b6 }
        L_0x0045:
            java.io.FileInputStream r2 = r9.f11477g     // Catch:{ all -> 0x00b6 }
            if (r2 != 0) goto L_0x007f
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ all -> 0x00b6 }
            com.fyber.inneractive.sdk.player.cache.a r5 = r9.f11472b     // Catch:{ all -> 0x00b6 }
            java.io.File r5 = r5.mo24803a()     // Catch:{ all -> 0x00b6 }
            r2.<init>(r5)     // Catch:{ all -> 0x00b6 }
            r9.f11477g = r2     // Catch:{ all -> 0x00b6 }
        L_0x0056:
            r5 = r6
            goto L_0x007f
        L_0x0058:
            java.io.FileInputStream r2 = r9.f11476f     // Catch:{ all -> 0x00b6 }
            if (r2 != 0) goto L_0x007f
            java.lang.String r2 = "%s creating a single instance of fis"
            java.lang.Object[] r7 = new java.lang.Object[r6]     // Catch:{ all -> 0x00b6 }
            java.lang.String r8 = r9.toString()     // Catch:{ all -> 0x00b6 }
            r7[r5] = r8     // Catch:{ all -> 0x00b6 }
            com.fyber.inneractive.sdk.util.IAlog.m16699a(r2, r7)     // Catch:{ all -> 0x00b6 }
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ all -> 0x00b6 }
            com.fyber.inneractive.sdk.player.cache.a r5 = r9.f11472b     // Catch:{ all -> 0x00b6 }
            java.io.File r5 = r5.mo24803a()     // Catch:{ all -> 0x00b6 }
            r2.<init>(r5)     // Catch:{ all -> 0x00b6 }
            r9.f11476f = r2     // Catch:{ all -> 0x00b6 }
            java.io.FileInputStream r2 = r9.f11477g     // Catch:{ all -> 0x00b6 }
            com.fyber.inneractive.sdk.util.C5370s.m16792b(r2)     // Catch:{ all -> 0x00b6 }
            r2 = 0
            r9.f11477g = r2     // Catch:{ all -> 0x00b6 }
            goto L_0x0056
        L_0x007f:
            java.io.FileInputStream r2 = r9.f11476f     // Catch:{ all -> 0x00b6 }
            if (r2 != 0) goto L_0x0085
            java.io.FileInputStream r2 = r9.f11477g     // Catch:{ all -> 0x00b6 }
        L_0x0085:
            long r6 = r9.f11475e     // Catch:{ all -> 0x00b6 }
            int r3 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r3 <= 0) goto L_0x00a0
            if (r5 == 0) goto L_0x00a0
            long r3 = r2.skip(r6)     // Catch:{ all -> 0x00b6 }
            long r5 = r9.f11475e     // Catch:{ all -> 0x00b6 }
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 != 0) goto L_0x0098
            goto L_0x00a0
        L_0x0098:
            java.io.IOException r10 = new java.io.IOException     // Catch:{ all -> 0x00b6 }
            java.lang.String r11 = "Failed to skip the stream"
            r10.<init>(r11)     // Catch:{ all -> 0x00b6 }
            throw r10     // Catch:{ all -> 0x00b6 }
        L_0x00a0:
            int r1 = r1 - r11
            int r3 = r10.length     // Catch:{ all -> 0x00b6 }
            int r1 = java.lang.Math.min(r3, r1)     // Catch:{ all -> 0x00b6 }
            int r12 = java.lang.Math.min(r1, r12)     // Catch:{ all -> 0x00b6 }
            int r10 = r2.read(r10, r11, r12)     // Catch:{ all -> 0x00b6 }
            monitor-exit(r0)     // Catch:{ all -> 0x00b6 }
            long r11 = r9.f11475e
            long r0 = (long) r10
            long r11 = r11 + r0
            r9.f11475e = r11
            return r10
        L_0x00b6:
            r10 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00b6 }
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.cache.C4607d.mo24830a(byte[], int, int):int");
    }

    /* renamed from: a */
    public Uri mo24832a() {
        return this.f11474d;
    }
}

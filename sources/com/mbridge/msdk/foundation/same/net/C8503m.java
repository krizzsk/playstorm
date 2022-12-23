package com.mbridge.msdk.foundation.same.net;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.tools.C8608u;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.ByteBuffer;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/* renamed from: com.mbridge.msdk.foundation.same.net.m */
/* compiled from: SocketManager */
public final class C8503m {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static volatile AtomicInteger f20597a = new AtomicInteger(1);

    /* renamed from: b */
    private ExecutorService f20598b;

    /* renamed from: com.mbridge.msdk.foundation.same.net.m$b */
    /* compiled from: SocketManager */
    private static final class C8506b {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public static C8503m f20609a = new C8503m();
    }

    private C8503m() {
        this.f20598b = new ThreadPoolExecutor(5, 10, 5, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new ThreadFactory() {
            public final Thread newThread(Runnable runnable) {
                Thread newThread = Executors.defaultThreadFactory().newThread(runnable);
                newThread.setName("SocketThreadPool");
                return newThread;
            }
        }, new ThreadPoolExecutor.DiscardPolicy());
    }

    /* renamed from: a */
    public static C8503m m24579a() {
        return C8506b.f20609a;
    }

    /* renamed from: a */
    public final synchronized void mo57642a(String str, int i, String str2, C8476e eVar) {
        this.f20598b.execute(new C8505a(str, i, str2, eVar));
    }

    /* renamed from: a */
    public final synchronized void mo57643a(String str, int i, String str2, boolean z, C8476e eVar) {
        this.f20598b.execute(new C8505a(str, i, str2, z, eVar));
    }

    /* renamed from: com.mbridge.msdk.foundation.same.net.m$a */
    /* compiled from: SocketManager */
    private class C8505a implements Runnable {

        /* renamed from: b */
        private String f20601b;

        /* renamed from: c */
        private ByteBuffer f20602c;

        /* renamed from: d */
        private OutputStream f20603d;

        /* renamed from: e */
        private boolean f20604e = false;

        /* renamed from: f */
        private C8476e f20605f;

        /* renamed from: g */
        private Socket f20606g;

        /* renamed from: h */
        private String f20607h;

        /* renamed from: i */
        private int f20608i;

        C8505a(String str, int i, String str2, C8476e eVar) {
            this.f20607h = str;
            this.f20608i = i;
            this.f20601b = str2;
            this.f20605f = eVar;
        }

        C8505a(String str, int i, String str2, boolean z, C8476e eVar) {
            this.f20607h = str;
            this.f20608i = i;
            this.f20601b = str2;
            this.f20604e = z;
            this.f20605f = eVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:61:0x01f0 A[Catch:{ all -> 0x023f, all -> 0x027a }] */
        /* JADX WARNING: Removed duplicated region for block: B:66:0x0203 A[Catch:{ all -> 0x023f, all -> 0x027a }] */
        /* JADX WARNING: Removed duplicated region for block: B:73:0x0239 A[SYNTHETIC, Splitter:B:73:0x0239] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
                r15 = this;
                java.lang.String r0 = " length : "
                java.lang.String r1 = "SocketManager"
                r2 = 404(0x194, float:5.66E-43)
                r3 = 2
                r4 = 0
                java.net.Socket r5 = new java.net.Socket     // Catch:{ all -> 0x023f }
                java.lang.String r6 = r15.f20607h     // Catch:{ all -> 0x023f }
                int r7 = r15.f20608i     // Catch:{ all -> 0x023f }
                r5.<init>(r6, r7)     // Catch:{ all -> 0x023f }
                r15.f20606g = r5     // Catch:{ all -> 0x023f }
                r6 = 15000(0x3a98, float:2.102E-41)
                r5.setSoTimeout(r6)     // Catch:{ all -> 0x023f }
                java.lang.String r5 = r15.f20607h     // Catch:{ all -> 0x023f }
                com.mbridge.msdk.foundation.same.net.f.d r6 = com.mbridge.msdk.foundation.same.net.p310f.C8487d.m24492a()     // Catch:{ all -> 0x023f }
                java.lang.String r6 = r6.f20535e     // Catch:{ all -> 0x023f }
                boolean r5 = r5.contains(r6)     // Catch:{ all -> 0x023f }
                java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x023f }
                r6.<init>()     // Catch:{ all -> 0x023f }
                java.lang.String r7 = "Socket connect : "
                r6.append(r7)     // Catch:{ all -> 0x023f }
                java.lang.String r7 = r15.f20607h     // Catch:{ all -> 0x023f }
                r6.append(r7)     // Catch:{ all -> 0x023f }
                java.lang.String r7 = " : "
                r6.append(r7)     // Catch:{ all -> 0x023f }
                int r7 = r15.f20608i     // Catch:{ all -> 0x023f }
                r6.append(r7)     // Catch:{ all -> 0x023f }
                java.lang.String r7 = " isAnalytics : "
                r6.append(r7)     // Catch:{ all -> 0x023f }
                r6.append(r5)     // Catch:{ all -> 0x023f }
                java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x023f }
                com.mbridge.msdk.foundation.tools.C8608u.m24884d(r1, r6)     // Catch:{ all -> 0x023f }
                java.net.Socket r6 = r15.f20606g     // Catch:{ all -> 0x023f }
                java.io.OutputStream r6 = r6.getOutputStream()     // Catch:{ all -> 0x023f }
                r15.f20603d = r6     // Catch:{ all -> 0x023f }
                r6 = 8
                byte[] r7 = new byte[r6]     // Catch:{ all -> 0x023f }
                java.nio.ByteBuffer r7 = java.nio.ByteBuffer.wrap(r7)     // Catch:{ all -> 0x023f }
                r15.f20602c = r7     // Catch:{ all -> 0x023f }
                java.nio.ByteOrder r8 = java.nio.ByteOrder.BIG_ENDIAN     // Catch:{ all -> 0x023f }
                r7.order(r8)     // Catch:{ all -> 0x023f }
                java.nio.ByteBuffer r7 = r15.f20602c     // Catch:{ all -> 0x023f }
                r7.put(r3)     // Catch:{ all -> 0x023f }
                java.lang.String r7 = r15.f20601b     // Catch:{ all -> 0x023f }
                boolean r7 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x023f }
                r8 = 3
                r9 = 1
                if (r7 == 0) goto L_0x0078
                java.nio.ByteBuffer r7 = r15.f20602c     // Catch:{ all -> 0x023f }
                r7.put(r9)     // Catch:{ all -> 0x023f }
                goto L_0x0084
            L_0x0078:
                java.nio.ByteBuffer r7 = r15.f20602c     // Catch:{ all -> 0x023f }
                boolean r10 = r15.f20604e     // Catch:{ all -> 0x023f }
                if (r10 == 0) goto L_0x0080
                r10 = r8
                goto L_0x0081
            L_0x0080:
                r10 = r3
            L_0x0081:
                r7.put(r10)     // Catch:{ all -> 0x023f }
            L_0x0084:
                java.nio.ByteBuffer r7 = r15.f20602c     // Catch:{ all -> 0x023f }
                java.util.concurrent.atomic.AtomicInteger r10 = com.mbridge.msdk.foundation.same.net.C8503m.f20597a     // Catch:{ all -> 0x023f }
                int r10 = r10.getAndIncrement()     // Catch:{ all -> 0x023f }
                short r10 = (short) r10     // Catch:{ all -> 0x023f }
                r7.putShort(r10)     // Catch:{ all -> 0x023f }
                java.lang.String r7 = r15.f20601b     // Catch:{ all -> 0x023f }
                boolean r7 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x023f }
                r10 = 0
                if (r7 == 0) goto L_0x00ad
                java.nio.ByteBuffer r7 = r15.f20602c     // Catch:{ all -> 0x023f }
                r7.putInt(r10)     // Catch:{ all -> 0x023f }
                java.io.OutputStream r7 = r15.f20603d     // Catch:{ all -> 0x023f }
                java.nio.ByteBuffer r11 = r15.f20602c     // Catch:{ all -> 0x023f }
                byte[] r11 = r11.array()     // Catch:{ all -> 0x023f }
                r7.write(r11)     // Catch:{ all -> 0x023f }
                r11 = r10
                goto L_0x00d6
            L_0x00ad:
                boolean r7 = r15.f20604e     // Catch:{ all -> 0x023f }
                if (r7 == 0) goto L_0x00ba
                com.mbridge.msdk.foundation.same.net.m r7 = com.mbridge.msdk.foundation.same.net.C8503m.this     // Catch:{ all -> 0x023f }
                java.lang.String r11 = r15.f20601b     // Catch:{ all -> 0x023f }
                byte[] r7 = r7.mo57644a((java.lang.String) r11)     // Catch:{ all -> 0x023f }
                goto L_0x00c0
            L_0x00ba:
                java.lang.String r7 = r15.f20601b     // Catch:{ all -> 0x023f }
                byte[] r7 = r7.getBytes()     // Catch:{ all -> 0x023f }
            L_0x00c0:
                int r11 = r7.length     // Catch:{ all -> 0x023f }
                java.nio.ByteBuffer r12 = r15.f20602c     // Catch:{ all -> 0x023f }
                r12.putInt(r11)     // Catch:{ all -> 0x023f }
                java.io.OutputStream r12 = r15.f20603d     // Catch:{ all -> 0x023f }
                java.nio.ByteBuffer r13 = r15.f20602c     // Catch:{ all -> 0x023f }
                byte[] r13 = r13.array()     // Catch:{ all -> 0x023f }
                r12.write(r13)     // Catch:{ all -> 0x023f }
                java.io.OutputStream r12 = r15.f20603d     // Catch:{ all -> 0x023f }
                r12.write(r7)     // Catch:{ all -> 0x023f }
            L_0x00d6:
                java.io.OutputStream r7 = r15.f20603d     // Catch:{ all -> 0x023f }
                r7.flush()     // Catch:{ all -> 0x023f }
                java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x023f }
                r7.<init>()     // Catch:{ all -> 0x023f }
                java.lang.String r12 = "Socket Request : header : "
                r7.append(r12)     // Catch:{ all -> 0x023f }
                java.nio.ByteBuffer r12 = r15.f20602c     // Catch:{ all -> 0x023f }
                byte[] r12 = r12.array()     // Catch:{ all -> 0x023f }
                java.lang.String r12 = java.util.Arrays.toString(r12)     // Catch:{ all -> 0x023f }
                r7.append(r12)     // Catch:{ all -> 0x023f }
                r7.append(r0)     // Catch:{ all -> 0x023f }
                r7.append(r11)     // Catch:{ all -> 0x023f }
                java.lang.String r7 = r7.toString()     // Catch:{ all -> 0x023f }
                com.mbridge.msdk.foundation.tools.C8608u.m24880a(r1, r7)     // Catch:{ all -> 0x023f }
                java.net.Socket r7 = r15.f20606g     // Catch:{ all -> 0x023f }
                java.io.InputStream r7 = r7.getInputStream()     // Catch:{ all -> 0x023f }
                byte[] r11 = new byte[r6]     // Catch:{ all -> 0x023f }
                r7.read(r11, r10, r6)     // Catch:{ all -> 0x023f }
                java.nio.ByteBuffer r12 = java.nio.ByteBuffer.wrap(r11)     // Catch:{ all -> 0x023f }
                r15.f20602c = r12     // Catch:{ all -> 0x023f }
                java.nio.ByteOrder r13 = java.nio.ByteOrder.BIG_ENDIAN     // Catch:{ all -> 0x023f }
                r12.order(r13)     // Catch:{ all -> 0x023f }
                java.nio.ByteBuffer r12 = r15.f20602c     // Catch:{ all -> 0x023f }
                r13 = 4
                int r12 = r12.getInt(r13)     // Catch:{ all -> 0x023f }
                byte r13 = r11[r9]     // Catch:{ all -> 0x023f }
                if (r13 != r8) goto L_0x0122
                r8 = r9
                goto L_0x0123
            L_0x0122:
                r8 = r10
            L_0x0123:
                java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ all -> 0x023f }
                r13.<init>()     // Catch:{ all -> 0x023f }
                java.lang.String r14 = "Socket Response : header : "
                r13.append(r14)     // Catch:{ all -> 0x023f }
                java.lang.String r11 = java.util.Arrays.toString(r11)     // Catch:{ all -> 0x023f }
                r13.append(r11)     // Catch:{ all -> 0x023f }
                r13.append(r0)     // Catch:{ all -> 0x023f }
                r13.append(r12)     // Catch:{ all -> 0x023f }
                java.lang.String r0 = " isGzip : "
                r13.append(r0)     // Catch:{ all -> 0x023f }
                r13.append(r8)     // Catch:{ all -> 0x023f }
                java.lang.String r0 = r13.toString()     // Catch:{ all -> 0x023f }
                com.mbridge.msdk.foundation.tools.C8608u.m24884d(r1, r0)     // Catch:{ all -> 0x023f }
                byte[] r0 = new byte[r12]     // Catch:{ all -> 0x023f }
                java.io.DataInputStream r11 = new java.io.DataInputStream     // Catch:{ all -> 0x023f }
                java.net.Socket r13 = r15.f20606g     // Catch:{ all -> 0x023f }
                java.io.InputStream r13 = r13.getInputStream()     // Catch:{ all -> 0x023f }
                r11.<init>(r13)     // Catch:{ all -> 0x023f }
                r11.readFully(r0)     // Catch:{ all -> 0x023f }
                if (r8 != 0) goto L_0x016b
                if (r12 <= r3) goto L_0x016b
                byte r11 = r0[r10]     // Catch:{ all -> 0x023f }
                int r6 = r11 << 8
                byte r11 = r0[r9]     // Catch:{ all -> 0x023f }
                r11 = r11 & 255(0xff, float:3.57E-43)
                r6 = r6 | r11
                r11 = 8075(0x1f8b, float:1.1315E-41)
                if (r6 != r11) goto L_0x016b
                r8 = r9
            L_0x016b:
                if (r12 < r9) goto L_0x0213
                com.mbridge.msdk.foundation.same.net.e r6 = r15.f20605f     // Catch:{ all -> 0x023f }
                if (r6 == 0) goto L_0x0226
                r6 = 200(0xc8, float:2.8E-43)
                if (r5 == 0) goto L_0x01a6
                byte r0 = r0[r10]     // Catch:{ all -> 0x023f }
                if (r0 != r9) goto L_0x0188
                com.mbridge.msdk.foundation.same.net.e r0 = r15.f20605f     // Catch:{ all -> 0x023f }
                com.mbridge.msdk.foundation.same.net.e.c r5 = new com.mbridge.msdk.foundation.same.net.e.c     // Catch:{ all -> 0x023f }
                r5.<init>(r6, r4, r4)     // Catch:{ all -> 0x023f }
                com.mbridge.msdk.foundation.same.net.k r5 = com.mbridge.msdk.foundation.same.net.C8501k.m24570a(r4, r5)     // Catch:{ all -> 0x023f }
                r0.mo57520a(r5)     // Catch:{ all -> 0x023f }
                goto L_0x0197
            L_0x0188:
                com.mbridge.msdk.foundation.same.net.e r0 = r15.f20605f     // Catch:{ all -> 0x023f }
                com.mbridge.msdk.foundation.same.net.a.a r5 = new com.mbridge.msdk.foundation.same.net.a.a     // Catch:{ all -> 0x023f }
                com.mbridge.msdk.foundation.same.net.e.c r6 = new com.mbridge.msdk.foundation.same.net.e.c     // Catch:{ all -> 0x023f }
                r6.<init>(r2, r4, r4)     // Catch:{ all -> 0x023f }
                r5.<init>(r3, r6)     // Catch:{ all -> 0x023f }
                r0.mo57519a((com.mbridge.msdk.foundation.same.net.p305a.C8452a) r5)     // Catch:{ all -> 0x023f }
            L_0x0197:
                java.net.Socket r0 = r15.f20606g
                if (r0 == 0) goto L_0x01a3
                r0.close()     // Catch:{ IOException -> 0x019f }
                goto L_0x01a3
            L_0x019f:
                r0 = move-exception
                r0.printStackTrace()
            L_0x01a3:
                r15.f20605f = r4
                return
            L_0x01a6:
                if (r8 == 0) goto L_0x01af
                com.mbridge.msdk.foundation.same.net.m r5 = com.mbridge.msdk.foundation.same.net.C8503m.this     // Catch:{ all -> 0x01e5 }
                java.lang.String r0 = r5.mo57641a((byte[]) r0)     // Catch:{ all -> 0x01e5 }
                goto L_0x01b5
            L_0x01af:
                java.lang.String r5 = new java.lang.String     // Catch:{ all -> 0x01e5 }
                r5.<init>(r0)     // Catch:{ all -> 0x01e5 }
                r0 = r5
            L_0x01b5:
                boolean r5 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x01e5 }
                if (r5 != 0) goto L_0x01c1
                org.json.JSONObject r5 = new org.json.JSONObject     // Catch:{ all -> 0x01e5 }
                r5.<init>(r0)     // Catch:{ all -> 0x01e5 }
                goto L_0x01c2
            L_0x01c1:
                r5 = r4
            L_0x01c2:
                java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x01e3 }
                r8.<init>()     // Catch:{ all -> 0x01e3 }
                java.lang.String r9 = "Socket Response length : "
                r8.append(r9)     // Catch:{ all -> 0x01e3 }
                r8.append(r12)     // Catch:{ all -> 0x01e3 }
                java.lang.String r9 = " "
                r8.append(r9)     // Catch:{ all -> 0x01e3 }
                int r0 = r0.length()     // Catch:{ all -> 0x01e3 }
                r8.append(r0)     // Catch:{ all -> 0x01e3 }
                java.lang.String r0 = r8.toString()     // Catch:{ all -> 0x01e3 }
                com.mbridge.msdk.foundation.tools.C8608u.m24884d(r1, r0)     // Catch:{ all -> 0x01e3 }
                goto L_0x01ee
            L_0x01e3:
                r0 = move-exception
                goto L_0x01e7
            L_0x01e5:
                r0 = move-exception
                r5 = r4
            L_0x01e7:
                java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x023f }
                com.mbridge.msdk.foundation.tools.C8608u.m24884d(r1, r0)     // Catch:{ all -> 0x023f }
            L_0x01ee:
                if (r5 == 0) goto L_0x0203
                com.mbridge.msdk.foundation.same.net.e r0 = r15.f20605f     // Catch:{ all -> 0x023f }
                if (r5 == 0) goto L_0x01f5
                goto L_0x01f6
            L_0x01f5:
                r5 = r4
            L_0x01f6:
                com.mbridge.msdk.foundation.same.net.e.c r8 = new com.mbridge.msdk.foundation.same.net.e.c     // Catch:{ all -> 0x023f }
                r8.<init>(r6, r4, r4)     // Catch:{ all -> 0x023f }
                com.mbridge.msdk.foundation.same.net.k r5 = com.mbridge.msdk.foundation.same.net.C8501k.m24570a(r5, r8)     // Catch:{ all -> 0x023f }
                r0.mo57520a(r5)     // Catch:{ all -> 0x023f }
                goto L_0x0226
            L_0x0203:
                com.mbridge.msdk.foundation.same.net.e r0 = r15.f20605f     // Catch:{ all -> 0x023f }
                com.mbridge.msdk.foundation.same.net.a.a r5 = new com.mbridge.msdk.foundation.same.net.a.a     // Catch:{ all -> 0x023f }
                com.mbridge.msdk.foundation.same.net.e.c r6 = new com.mbridge.msdk.foundation.same.net.e.c     // Catch:{ all -> 0x023f }
                r6.<init>(r2, r4, r4)     // Catch:{ all -> 0x023f }
                r5.<init>(r3, r6)     // Catch:{ all -> 0x023f }
                r0.mo57519a((com.mbridge.msdk.foundation.same.net.p305a.C8452a) r5)     // Catch:{ all -> 0x023f }
                goto L_0x0226
            L_0x0213:
                com.mbridge.msdk.foundation.same.net.e r0 = r15.f20605f     // Catch:{ all -> 0x023f }
                if (r0 == 0) goto L_0x0226
                com.mbridge.msdk.foundation.same.net.e r0 = r15.f20605f     // Catch:{ all -> 0x023f }
                com.mbridge.msdk.foundation.same.net.a.a r5 = new com.mbridge.msdk.foundation.same.net.a.a     // Catch:{ all -> 0x023f }
                com.mbridge.msdk.foundation.same.net.e.c r6 = new com.mbridge.msdk.foundation.same.net.e.c     // Catch:{ all -> 0x023f }
                r6.<init>(r2, r4, r4)     // Catch:{ all -> 0x023f }
                r5.<init>(r3, r6)     // Catch:{ all -> 0x023f }
                r0.mo57519a((com.mbridge.msdk.foundation.same.net.p305a.C8452a) r5)     // Catch:{ all -> 0x023f }
            L_0x0226:
                java.net.Socket r0 = r15.f20606g     // Catch:{ all -> 0x023f }
                r0.close()     // Catch:{ all -> 0x023f }
                r15.f20602c = r4     // Catch:{ all -> 0x023f }
                r7.close()     // Catch:{ all -> 0x023f }
                java.io.OutputStream r0 = r15.f20603d     // Catch:{ all -> 0x023f }
                r0.close()     // Catch:{ all -> 0x023f }
                java.net.Socket r0 = r15.f20606g
                if (r0 == 0) goto L_0x0277
                r0.close()     // Catch:{ IOException -> 0x023d }
                goto L_0x0277
            L_0x023d:
                r0 = move-exception
                goto L_0x0274
            L_0x023f:
                r0 = move-exception
                java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x027a }
                r5.<init>()     // Catch:{ all -> 0x027a }
                java.lang.String r6 = "Socket exception: "
                r5.append(r6)     // Catch:{ all -> 0x027a }
                java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x027a }
                r5.append(r0)     // Catch:{ all -> 0x027a }
                java.lang.String r0 = r5.toString()     // Catch:{ all -> 0x027a }
                com.mbridge.msdk.foundation.tools.C8608u.m24880a(r1, r0)     // Catch:{ all -> 0x027a }
                com.mbridge.msdk.foundation.same.net.e r0 = r15.f20605f     // Catch:{ all -> 0x027a }
                if (r0 == 0) goto L_0x026b
                com.mbridge.msdk.foundation.same.net.e r0 = r15.f20605f     // Catch:{ all -> 0x027a }
                com.mbridge.msdk.foundation.same.net.a.a r1 = new com.mbridge.msdk.foundation.same.net.a.a     // Catch:{ all -> 0x027a }
                com.mbridge.msdk.foundation.same.net.e.c r5 = new com.mbridge.msdk.foundation.same.net.e.c     // Catch:{ all -> 0x027a }
                r5.<init>(r2, r4, r4)     // Catch:{ all -> 0x027a }
                r1.<init>(r3, r5)     // Catch:{ all -> 0x027a }
                r0.mo57519a((com.mbridge.msdk.foundation.same.net.p305a.C8452a) r1)     // Catch:{ all -> 0x027a }
            L_0x026b:
                java.net.Socket r0 = r15.f20606g
                if (r0 == 0) goto L_0x0277
                r0.close()     // Catch:{ IOException -> 0x0273 }
                goto L_0x0277
            L_0x0273:
                r0 = move-exception
            L_0x0274:
                r0.printStackTrace()
            L_0x0277:
                r15.f20605f = r4
                return
            L_0x027a:
                r0 = move-exception
                java.net.Socket r1 = r15.f20606g
                if (r1 == 0) goto L_0x0287
                r1.close()     // Catch:{ IOException -> 0x0283 }
                goto L_0x0287
            L_0x0283:
                r1 = move-exception
                r1.printStackTrace()
            L_0x0287:
                r15.f20605f = r4
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.same.net.C8503m.C8505a.run():void");
        }
    }

    /* renamed from: a */
    public final byte[] mo57644a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(str.getBytes());
            gZIPOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (Throwable th) {
            C8608u.m24884d("SocketManager", th.getMessage());
            return null;
        }
    }

    /* renamed from: a */
    public final String mo57641a(byte[] bArr) {
        ByteArrayOutputStream byteArrayOutputStream;
        if (!(bArr == null || bArr.length == 0)) {
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
                GZIPInputStream gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
                byte[] bArr2 = new byte[1024];
                while (true) {
                    int read = gZIPInputStream.read(bArr2, 0, 1024);
                    if (read <= 0) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr2, 0, read);
                }
                gZIPInputStream.close();
                byteArrayInputStream.close();
                byteArrayOutputStream.flush();
                byteArrayOutputStream.close();
            } catch (Throwable th) {
                C8608u.m24884d("SocketManager", th.getMessage());
            }
            return byteArrayOutputStream.toString();
        }
        return null;
    }
}

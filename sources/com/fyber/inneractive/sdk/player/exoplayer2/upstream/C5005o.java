package com.fyber.inneractive.sdk.player.exoplayer2.upstream;

import android.net.Uri;
import android.support.p003v4.media.session.PlaybackStateCompat;
import android.util.Log;
import androidx.browser.trusted.sharing.ShareTarget;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C5023a;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C5038m;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C5049u;
import com.google.common.net.HttpHeaders;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.NoRouteToHostException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.upstream.o */
public class C5005o implements C4996g {

    /* renamed from: q */
    public static final Pattern f13357q = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");

    /* renamed from: r */
    public static final AtomicReference<byte[]> f13358r = new AtomicReference<>();

    /* renamed from: a */
    public final boolean f13359a;

    /* renamed from: b */
    public final int f13360b;

    /* renamed from: c */
    public final int f13361c;

    /* renamed from: d */
    public final String f13362d;

    /* renamed from: e */
    public final C5038m<String> f13363e = null;

    /* renamed from: f */
    public final C5014w f13364f;

    /* renamed from: g */
    public final C5014w f13365g;

    /* renamed from: h */
    public final C4970a0<? super C5005o> f13366h;

    /* renamed from: i */
    public C5000j f13367i;

    /* renamed from: j */
    public HttpURLConnection f13368j;

    /* renamed from: k */
    public InputStream f13369k;

    /* renamed from: l */
    public boolean f13370l;

    /* renamed from: m */
    public long f13371m;

    /* renamed from: n */
    public long f13372n;

    /* renamed from: o */
    public long f13373o;

    /* renamed from: p */
    public long f13374p;

    public C5005o(String str, C5038m<String> mVar, C4970a0<? super C5005o> a0Var, int i, int i2, boolean z, C5014w wVar) {
        this.f13362d = C5023a.m15301a(str);
        this.f13366h = a0Var;
        this.f13365g = new C5014w();
        this.f13360b = i;
        this.f13361c = i2;
        this.f13359a = z;
        this.f13364f = wVar;
    }

    /* renamed from: a */
    public Uri mo24832a() {
        HttpURLConnection httpURLConnection = this.f13368j;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    /* renamed from: b */
    public final HttpURLConnection mo25562b(C5000j jVar) throws IOException {
        HttpURLConnection a;
        C5000j jVar2 = jVar;
        URL url = new URL(jVar2.f13327a.toString());
        byte[] bArr = jVar2.f13328b;
        long j = jVar2.f13330d;
        long j2 = jVar2.f13331e;
        boolean a2 = jVar2.mo25553a(1);
        if (!this.f13359a) {
            return mo25560a(url, bArr, j, j2, a2, true);
        }
        int i = 0;
        while (true) {
            int i2 = i + 1;
            if (i <= 20) {
                long j3 = j;
                int i3 = i2;
                a = mo25560a(url, bArr, j, j2, a2, false);
                int responseCode = a.getResponseCode();
                if (responseCode == 300 || responseCode == 301 || responseCode == 302 || responseCode == 303 || (bArr == null && (responseCode == 307 || responseCode == 308))) {
                    bArr = null;
                    String headerField = a.getHeaderField(HttpHeaders.LOCATION);
                    a.disconnect();
                    if (headerField != null) {
                        URL url2 = new URL(url, headerField);
                        String protocol = url2.getProtocol();
                        if ("https".equals(protocol) || "http".equals(protocol)) {
                            url = url2;
                            i = i3;
                            j = j3;
                        } else {
                            throw new ProtocolException("Unsupported protocol redirect: " + protocol);
                        }
                    } else {
                        throw new ProtocolException("Null location redirect");
                    }
                }
            } else {
                throw new NoRouteToHostException("Too many redirects: " + i2);
            }
        }
        return a;
    }

    /* renamed from: c */
    public final void mo25564c() throws IOException {
        if (this.f13373o != this.f13371m) {
            byte[] andSet = f13358r.getAndSet((Object) null);
            if (andSet == null) {
                andSet = new byte[4096];
            }
            while (true) {
                long j = this.f13373o;
                long j2 = this.f13371m;
                if (j != j2) {
                    int read = this.f13369k.read(andSet, 0, (int) Math.min(j2 - j, (long) andSet.length));
                    if (Thread.interrupted()) {
                        throw new InterruptedIOException();
                    } else if (read != -1) {
                        long j3 = (long) read;
                        this.f13373o += j3;
                        C4970a0<? super C5005o> a0Var = this.f13366h;
                        if (a0Var != null) {
                            C5002l lVar = (C5002l) a0Var;
                            synchronized (lVar) {
                                lVar.f13345d += j3;
                            }
                        }
                    } else {
                        throw new EOFException();
                    }
                } else {
                    f13358r.set(andSet);
                    return;
                }
            }
        }
    }

    public void close() throws C5011t {
        try {
            if (this.f13369k != null) {
                HttpURLConnection httpURLConnection = this.f13368j;
                long j = this.f13372n;
                if (j != -1) {
                    j -= this.f13374p;
                }
                m15268a(httpURLConnection, j);
                this.f13369k.close();
            }
            this.f13369k = null;
            mo25563b();
            if (this.f13370l) {
                this.f13370l = false;
                C4970a0<? super C5005o> a0Var = this.f13366h;
                if (a0Var != null) {
                    ((C5002l) a0Var).mo25558a(this);
                }
            }
        } catch (IOException e) {
            throw new C5011t(e, this.f13367i, 3);
        } catch (Throwable th) {
            this.f13369k = null;
            mo25563b();
            if (this.f13370l) {
                this.f13370l = false;
                C4970a0<? super C5005o> a0Var2 = this.f13366h;
                if (a0Var2 != null) {
                    ((C5002l) a0Var2).mo25558a(this);
                }
            }
            throw th;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0043, code lost:
        if (r7 != 0) goto L_0x0047;
     */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0102  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long mo24831a(com.fyber.inneractive.sdk.player.exoplayer2.upstream.C5000j r19) throws com.fyber.inneractive.sdk.player.exoplayer2.upstream.C5011t {
        /*
            r18 = this;
            r1 = r18
            r2 = r19
            java.lang.String r3 = "Unable to connect to "
            r1.f13367i = r2
            r4 = 0
            r1.f13374p = r4
            r1.f13373o = r4
            r6 = 1
            java.net.HttpURLConnection r0 = r18.mo25562b(r19)     // Catch:{ IOException -> 0x0169 }
            r1.f13368j = r0     // Catch:{ IOException -> 0x0169 }
            int r0 = r0.getResponseCode()     // Catch:{ IOException -> 0x0149 }
            r3 = 200(0xc8, float:2.8E-43)
            if (r0 < r3) goto L_0x012d
            r7 = 299(0x12b, float:4.19E-43)
            if (r0 <= r7) goto L_0x0023
            goto L_0x012d
        L_0x0023:
            java.net.HttpURLConnection r7 = r1.f13368j
            java.lang.String r7 = r7.getContentType()
            com.fyber.inneractive.sdk.player.exoplayer2.util.m<java.lang.String> r8 = r1.f13363e
            if (r8 == 0) goto L_0x003d
            boolean r8 = r8.mo25626a(r7)
            if (r8 == 0) goto L_0x0034
            goto L_0x003d
        L_0x0034:
            r18.mo25563b()
            com.fyber.inneractive.sdk.player.exoplayer2.upstream.u r0 = new com.fyber.inneractive.sdk.player.exoplayer2.upstream.u
            r0.<init>(r7, r2)
            throw r0
        L_0x003d:
            if (r0 != r3) goto L_0x0046
            long r7 = r2.f13330d
            int r0 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x0046
            goto L_0x0047
        L_0x0046:
            r7 = r4
        L_0x0047:
            r1.f13371m = r7
            boolean r0 = r2.mo25553a(r6)
            if (r0 != 0) goto L_0x0109
            long r7 = r2.f13331e
            r9 = -1
            int r0 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r0 == 0) goto L_0x005b
            r1.f13372n = r7
            goto L_0x010d
        L_0x005b:
            java.net.HttpURLConnection r0 = r1.f13368j
            java.lang.String r3 = "Content-Length"
            java.lang.String r3 = r0.getHeaderField(r3)
            boolean r7 = android.text.TextUtils.isEmpty(r3)
            java.lang.String r8 = "DefaultHttpDataSource"
            java.lang.String r11 = "]"
            if (r7 != 0) goto L_0x0089
            long r12 = java.lang.Long.parseLong(r3)     // Catch:{ NumberFormatException -> 0x0072 }
            goto L_0x008a
        L_0x0072:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r12 = "Unexpected Content-Length ["
            r7.append(r12)
            r7.append(r3)
            r7.append(r11)
            java.lang.String r7 = r7.toString()
            android.util.Log.e(r8, r7)
        L_0x0089:
            r12 = r9
        L_0x008a:
            java.lang.String r7 = "Content-Range"
            java.lang.String r0 = r0.getHeaderField(r7)
            boolean r7 = android.text.TextUtils.isEmpty(r0)
            if (r7 != 0) goto L_0x00fe
            java.util.regex.Pattern r7 = f13357q
            java.util.regex.Matcher r7 = r7.matcher(r0)
            boolean r14 = r7.find()
            if (r14 == 0) goto L_0x00fe
            r14 = 2
            java.lang.String r14 = r7.group(r14)     // Catch:{ NumberFormatException -> 0x00e7 }
            long r14 = java.lang.Long.parseLong(r14)     // Catch:{ NumberFormatException -> 0x00e7 }
            java.lang.String r7 = r7.group(r6)     // Catch:{ NumberFormatException -> 0x00e7 }
            long r16 = java.lang.Long.parseLong(r7)     // Catch:{ NumberFormatException -> 0x00e7 }
            long r14 = r14 - r16
            r16 = 1
            long r14 = r14 + r16
            int r4 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r4 >= 0) goto L_0x00bf
            r12 = r14
            goto L_0x00fe
        L_0x00bf:
            int r4 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r4 == 0) goto L_0x00fe
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ NumberFormatException -> 0x00e7 }
            r4.<init>()     // Catch:{ NumberFormatException -> 0x00e7 }
            java.lang.String r5 = "Inconsistent headers ["
            r4.append(r5)     // Catch:{ NumberFormatException -> 0x00e7 }
            r4.append(r3)     // Catch:{ NumberFormatException -> 0x00e7 }
            java.lang.String r3 = "] ["
            r4.append(r3)     // Catch:{ NumberFormatException -> 0x00e7 }
            r4.append(r0)     // Catch:{ NumberFormatException -> 0x00e7 }
            r4.append(r11)     // Catch:{ NumberFormatException -> 0x00e7 }
            java.lang.String r3 = r4.toString()     // Catch:{ NumberFormatException -> 0x00e7 }
            android.util.Log.w(r8, r3)     // Catch:{ NumberFormatException -> 0x00e7 }
            long r12 = java.lang.Math.max(r12, r14)     // Catch:{ NumberFormatException -> 0x00e7 }
            goto L_0x00fe
        L_0x00e7:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Unexpected Content-Range ["
            r3.append(r4)
            r3.append(r0)
            r3.append(r11)
            java.lang.String r0 = r3.toString()
            android.util.Log.e(r8, r0)
        L_0x00fe:
            int r0 = (r12 > r9 ? 1 : (r12 == r9 ? 0 : -1))
            if (r0 == 0) goto L_0x0106
            long r3 = r1.f13371m
            long r9 = r12 - r3
        L_0x0106:
            r1.f13372n = r9
            goto L_0x010d
        L_0x0109:
            long r3 = r2.f13331e
            r1.f13372n = r3
        L_0x010d:
            java.net.HttpURLConnection r0 = r1.f13368j     // Catch:{ IOException -> 0x0123 }
            java.io.InputStream r0 = r0.getInputStream()     // Catch:{ IOException -> 0x0123 }
            r1.f13369k = r0     // Catch:{ IOException -> 0x0123 }
            r1.f13370l = r6
            com.fyber.inneractive.sdk.player.exoplayer2.upstream.a0<? super com.fyber.inneractive.sdk.player.exoplayer2.upstream.o> r0 = r1.f13366h
            if (r0 == 0) goto L_0x0120
            com.fyber.inneractive.sdk.player.exoplayer2.upstream.l r0 = (com.fyber.inneractive.sdk.player.exoplayer2.upstream.C5002l) r0
            r0.mo25559a(r1, r2)
        L_0x0120:
            long r2 = r1.f13372n
            return r2
        L_0x0123:
            r0 = move-exception
            r18.mo25563b()
            com.fyber.inneractive.sdk.player.exoplayer2.upstream.t r3 = new com.fyber.inneractive.sdk.player.exoplayer2.upstream.t
            r3.<init>((java.io.IOException) r0, (com.fyber.inneractive.sdk.player.exoplayer2.upstream.C5000j) r2, (int) r6)
            throw r3
        L_0x012d:
            java.net.HttpURLConnection r3 = r1.f13368j
            java.util.Map r3 = r3.getHeaderFields()
            r18.mo25563b()
            com.fyber.inneractive.sdk.player.exoplayer2.upstream.v r4 = new com.fyber.inneractive.sdk.player.exoplayer2.upstream.v
            r4.<init>(r0, r3, r2)
            r2 = 416(0x1a0, float:5.83E-43)
            if (r0 != r2) goto L_0x0148
            com.fyber.inneractive.sdk.player.exoplayer2.upstream.h r0 = new com.fyber.inneractive.sdk.player.exoplayer2.upstream.h
            r2 = 0
            r0.<init>(r2)
            r4.initCause(r0)
        L_0x0148:
            throw r4
        L_0x0149:
            r0 = move-exception
            r4 = r0
            r18.mo25563b()
            com.fyber.inneractive.sdk.player.exoplayer2.upstream.t r0 = new com.fyber.inneractive.sdk.player.exoplayer2.upstream.t
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r3)
            android.net.Uri r3 = r2.f13327a
            java.lang.String r3 = r3.toString()
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            r0.<init>(r3, r4, r2, r6)
            throw r0
        L_0x0169:
            r0 = move-exception
            com.fyber.inneractive.sdk.player.exoplayer2.upstream.t r4 = new com.fyber.inneractive.sdk.player.exoplayer2.upstream.t
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r3)
            android.net.Uri r3 = r2.f13327a
            java.lang.String r3 = r3.toString()
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            r4.<init>(r3, r0, r2, r6)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.upstream.C5005o.mo24831a(com.fyber.inneractive.sdk.player.exoplayer2.upstream.j):long");
    }

    /* renamed from: b */
    public final int mo25561b(byte[] bArr, int i, int i2) throws IOException {
        if (i2 == 0) {
            return 0;
        }
        long j = this.f13372n;
        if (j != -1) {
            long j2 = j - this.f13374p;
            if (j2 == 0) {
                return -1;
            }
            i2 = (int) Math.min((long) i2, j2);
        }
        int read = this.f13369k.read(bArr, i, i2);
        if (read != -1) {
            long j3 = (long) read;
            this.f13374p += j3;
            C4970a0<? super C5005o> a0Var = this.f13366h;
            if (a0Var != null) {
                C5002l lVar = (C5002l) a0Var;
                synchronized (lVar) {
                    lVar.f13345d += j3;
                }
            }
            return read;
        } else if (this.f13372n == -1) {
            return -1;
        } else {
            throw new EOFException();
        }
    }

    /* renamed from: b */
    public final void mo25563b() {
        HttpURLConnection httpURLConnection = this.f13368j;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e) {
                Log.e("DefaultHttpDataSource", "Unexpected error while disconnecting", e);
            }
            this.f13368j = null;
        }
    }

    /* renamed from: a */
    public int mo24830a(byte[] bArr, int i, int i2) throws C5011t {
        try {
            mo25564c();
            return mo25561b(bArr, i, i2);
        } catch (IOException e) {
            throw new C5011t(e, this.f13367i, 2);
        }
    }

    /* renamed from: a */
    public final HttpURLConnection mo25560a(URL url, byte[] bArr, long j, long j2, boolean z, boolean z2) throws IOException {
        Map<String, String> map;
        Map<String, String> map2;
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(this.f13360b);
        httpURLConnection.setReadTimeout(this.f13361c);
        C5014w wVar = this.f13364f;
        if (wVar != null) {
            synchronized (wVar) {
                if (wVar.f13388b == null) {
                    wVar.f13388b = Collections.unmodifiableMap(new HashMap(wVar.f13387a));
                }
                map2 = wVar.f13388b;
            }
            for (Map.Entry next : map2.entrySet()) {
                httpURLConnection.setRequestProperty((String) next.getKey(), (String) next.getValue());
            }
        }
        C5014w wVar2 = this.f13365g;
        synchronized (wVar2) {
            if (wVar2.f13388b == null) {
                wVar2.f13388b = Collections.unmodifiableMap(new HashMap(wVar2.f13387a));
            }
            map = wVar2.f13388b;
        }
        for (Map.Entry next2 : map.entrySet()) {
            httpURLConnection.setRequestProperty((String) next2.getKey(), (String) next2.getValue());
        }
        if (!(j == 0 && j2 == -1)) {
            String str = "bytes=" + j + "-";
            if (j2 != -1) {
                str = str + ((j + j2) - 1);
            }
            httpURLConnection.setRequestProperty("Range", str);
        }
        httpURLConnection.setRequestProperty("User-Agent", this.f13362d);
        if (!z) {
            httpURLConnection.setRequestProperty(HttpHeaders.ACCEPT_ENCODING, "identity");
        }
        httpURLConnection.setInstanceFollowRedirects(z2);
        httpURLConnection.setDoOutput(bArr != null);
        if (bArr != null) {
            httpURLConnection.setRequestMethod(ShareTarget.METHOD_POST);
            if (bArr.length == 0) {
                httpURLConnection.connect();
            } else {
                httpURLConnection.setFixedLengthStreamingMode(bArr.length);
                httpURLConnection.connect();
                OutputStream outputStream = httpURLConnection.getOutputStream();
                outputStream.write(bArr);
                outputStream.close();
            }
        } else {
            httpURLConnection.connect();
        }
        return httpURLConnection;
    }

    /* renamed from: a */
    public static void m15268a(HttpURLConnection httpURLConnection, long j) {
        int i = C5049u.f13471a;
        if (i == 19 || i == 20) {
            try {
                InputStream inputStream = httpURLConnection.getInputStream();
                if (j == -1) {
                    if (inputStream.read() == -1) {
                        return;
                    }
                } else if (j <= PlaybackStateCompat.ACTION_PLAY_FROM_SEARCH) {
                    return;
                }
                String name = inputStream.getClass().getName();
                if (name.equals("com.android.okhttp.internal.http.HttpTransport$ChunkedInputStream") || name.equals("com.android.okhttp.internal.http.HttpTransport$FixedLengthInputStream")) {
                    Method declaredMethod = inputStream.getClass().getSuperclass().getDeclaredMethod("unexpectedEndOfInput", new Class[0]);
                    declaredMethod.setAccessible(true);
                    declaredMethod.invoke(inputStream, new Object[0]);
                }
            } catch (Exception unused) {
            }
        }
    }
}

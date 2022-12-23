package com.ironsource.mediationsdk;

import android.content.Context;
import android.util.Pair;
import com.ironsource.environment.p205e.C6423c;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.server.C6758b;
import com.ironsource.mediationsdk.utils.C6765c;
import com.ironsource.mediationsdk.utils.C6770g;
import com.ironsource.mediationsdk.utils.C6784p;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.ref.WeakReference;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.mediationsdk.h */
public final class C6661h {

    /* renamed from: a */
    ISBannerSize f17312a;

    /* renamed from: b */
    private final String f17313b = "1";

    /* renamed from: c */
    private final String f17314c = "102";

    /* renamed from: d */
    private final String f17315d = "103";

    /* renamed from: e */
    private final String f17316e = "102";

    /* renamed from: f */
    private final String f17317f = "GenericNotifications";

    /* renamed from: g */
    private String f17318g;

    /* renamed from: h */
    private String f17319h;

    /* renamed from: i */
    private C6765c f17320i;

    /* renamed from: j */
    private C6660g f17321j;

    /* renamed from: com.ironsource.mediationsdk.h$a */
    static class C6662a implements Runnable {

        /* renamed from: a */
        private WeakReference<C6660g> f17322a;

        /* renamed from: b */
        private int f17323b;

        /* renamed from: c */
        private String f17324c;

        /* renamed from: d */
        private String f17325d;

        /* renamed from: e */
        private List<C6758b> f17326e;

        /* renamed from: f */
        private C6758b f17327f;

        /* renamed from: g */
        private JSONObject f17328g;

        /* renamed from: h */
        private JSONObject f17329h;

        /* renamed from: i */
        private long f17330i;

        /* renamed from: j */
        private int f17331j;

        /* renamed from: k */
        private String f17332k = "other";

        /* renamed from: l */
        private int f17333l;

        /* renamed from: m */
        private String f17334m = "";

        /* renamed from: n */
        private int f17335n = 0;

        /* renamed from: o */
        private final URL f17336o;

        /* renamed from: p */
        private final JSONObject f17337p;

        /* renamed from: q */
        private final boolean f17338q;

        /* renamed from: r */
        private final int f17339r;

        /* renamed from: s */
        private final long f17340s;

        /* renamed from: t */
        private final boolean f17341t;

        /* renamed from: u */
        private final boolean f17342u;

        /* renamed from: v */
        private final int f17343v;

        C6662a(C6660g gVar, URL url, JSONObject jSONObject, boolean z, int i, long j, boolean z2, boolean z3, int i2) {
            this.f17322a = new WeakReference<>(gVar);
            this.f17336o = url;
            this.f17337p = jSONObject;
            this.f17338q = z;
            this.f17339r = i;
            this.f17340s = j;
            this.f17341t = z2;
            this.f17342u = z3;
            this.f17343v = i2;
        }

        /* renamed from: a */
        private static String m20335a(HttpURLConnection httpURLConnection) {
            InputStreamReader inputStreamReader = new InputStreamReader(httpURLConnection.getInputStream());
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            StringBuilder sb = new StringBuilder();
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine != null) {
                    sb.append(readLine);
                } else {
                    bufferedReader.close();
                    inputStreamReader.close();
                    return sb.toString();
                }
            }
        }

        /* JADX WARNING: type inference failed for: r0v22, types: [java.net.URLConnection] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:90:0x0255  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private boolean m20336a() {
            /*
                r17 = this;
                r1 = r17
                java.lang.String r2 = "decompression error"
                java.lang.String r3 = "decryption error"
                java.lang.String r4 = "other"
                java.util.Date r0 = new java.util.Date
                r0.<init>()
                long r5 = r0.getTime()
                r1.f17330i = r5
                r5 = 0
                int r0 = r1.f17335n     // Catch:{ Exception -> 0x02a1 }
                r6 = 1015(0x3f7, float:1.422E-42)
                r7 = 1
                if (r0 != r6) goto L_0x001d
                r0 = r7
                goto L_0x001f
            L_0x001d:
                int r0 = r1.f17343v     // Catch:{ Exception -> 0x02a1 }
            L_0x001f:
                r1.f17333l = r0     // Catch:{ Exception -> 0x02a1 }
                r1.f17331j = r5
                r0 = 0
                r8 = r0
            L_0x0025:
                int r0 = r1.f17331j
                int r9 = r1.f17339r
                if (r0 >= r9) goto L_0x0297
                java.util.Date r0 = new java.util.Date     // Catch:{ SocketTimeoutException -> 0x0266, Exception -> 0x023f }
                r0.<init>()     // Catch:{ SocketTimeoutException -> 0x0266, Exception -> 0x023f }
                long r9 = r0.getTime()     // Catch:{ SocketTimeoutException -> 0x0266, Exception -> 0x023f }
                java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ SocketTimeoutException -> 0x0266, Exception -> 0x023f }
                java.lang.String r11 = "Auction Handler: auction trial "
                r0.<init>(r11)     // Catch:{ SocketTimeoutException -> 0x0266, Exception -> 0x023f }
                int r11 = r1.f17331j     // Catch:{ SocketTimeoutException -> 0x0266, Exception -> 0x023f }
                int r11 = r11 + r7
                r0.append(r11)     // Catch:{ SocketTimeoutException -> 0x0266, Exception -> 0x023f }
                java.lang.String r11 = " out of "
                r0.append(r11)     // Catch:{ SocketTimeoutException -> 0x0266, Exception -> 0x023f }
                int r11 = r1.f17339r     // Catch:{ SocketTimeoutException -> 0x0266, Exception -> 0x023f }
                r0.append(r11)     // Catch:{ SocketTimeoutException -> 0x0266, Exception -> 0x023f }
                java.lang.String r11 = " max trials"
                r0.append(r11)     // Catch:{ SocketTimeoutException -> 0x0266, Exception -> 0x023f }
                java.lang.String r0 = r0.toString()     // Catch:{ SocketTimeoutException -> 0x0266, Exception -> 0x023f }
                com.ironsource.mediationsdk.logger.IronSourceLoggerManager r11 = com.ironsource.mediationsdk.logger.IronSourceLoggerManager.getLogger()     // Catch:{ SocketTimeoutException -> 0x0266, Exception -> 0x023f }
                com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r12 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.INTERNAL     // Catch:{ SocketTimeoutException -> 0x0266, Exception -> 0x023f }
                r11.log(r12, r0, r5)     // Catch:{ SocketTimeoutException -> 0x0266, Exception -> 0x023f }
                com.ironsource.mediationsdk.utils.IronSourceUtils.sendAutomationLog(r0)     // Catch:{ SocketTimeoutException -> 0x0266, Exception -> 0x023f }
                java.net.URL r0 = r1.f17336o     // Catch:{ SocketTimeoutException -> 0x0266, Exception -> 0x023f }
                long r11 = r1.f17340s     // Catch:{ SocketTimeoutException -> 0x0266, Exception -> 0x023f }
                int r11 = (int) r11     // Catch:{ SocketTimeoutException -> 0x0266, Exception -> 0x023f }
                java.net.URLConnection r0 = r0.openConnection()     // Catch:{ SocketTimeoutException -> 0x0266, Exception -> 0x023f }
                r12 = r0
                java.net.HttpURLConnection r12 = (java.net.HttpURLConnection) r12     // Catch:{ SocketTimeoutException -> 0x0266, Exception -> 0x023f }
                java.lang.String r0 = "POST"
                r12.setRequestMethod(r0)     // Catch:{ SocketTimeoutException -> 0x0266, Exception -> 0x023f }
                java.lang.String r0 = "Content-Type"
                java.lang.String r13 = "application/json; charset=utf-8"
                r12.setRequestProperty(r0, r13)     // Catch:{ SocketTimeoutException -> 0x0266, Exception -> 0x023f }
                r12.setReadTimeout(r11)     // Catch:{ SocketTimeoutException -> 0x0266, Exception -> 0x023f }
                r12.setDoInput(r7)     // Catch:{ SocketTimeoutException -> 0x0266, Exception -> 0x023f }
                r12.setDoOutput(r7)     // Catch:{ SocketTimeoutException -> 0x0266, Exception -> 0x023f }
                org.json.JSONObject r8 = r1.f17337p     // Catch:{ SocketTimeoutException -> 0x023c, Exception -> 0x0239 }
                boolean r11 = r1.f17341t     // Catch:{ SocketTimeoutException -> 0x023c, Exception -> 0x0239 }
                java.io.OutputStream r13 = r12.getOutputStream()     // Catch:{ SocketTimeoutException -> 0x023c, Exception -> 0x0239 }
                java.io.OutputStreamWriter r14 = new java.io.OutputStreamWriter     // Catch:{ SocketTimeoutException -> 0x023c, Exception -> 0x0239 }
                java.lang.String r0 = "UTF-8"
                r14.<init>(r13, r0)     // Catch:{ SocketTimeoutException -> 0x023c, Exception -> 0x0239 }
                java.io.BufferedWriter r15 = new java.io.BufferedWriter     // Catch:{ SocketTimeoutException -> 0x023c, Exception -> 0x0239 }
                r15.<init>(r14)     // Catch:{ SocketTimeoutException -> 0x023c, Exception -> 0x0239 }
                java.lang.String r16 = ""
                int r0 = r1.f17333l     // Catch:{ SocketTimeoutException -> 0x023c, Exception -> 0x0239 }
                r5 = 2
                if (r0 != r5) goto L_0x00c7
                com.ironsource.mediationsdk.utils.g r0 = com.ironsource.mediationsdk.utils.C6770g.m20577a()     // Catch:{ JSONException -> 0x00a5 }
                java.lang.String r16 = r0.mo36968d()     // Catch:{ JSONException -> 0x00a5 }
                goto L_0x00c7
            L_0x00a5:
                r0 = move-exception
                java.lang.String r5 = r0.getLocalizedMessage()     // Catch:{ SocketTimeoutException -> 0x023c, Exception -> 0x0239 }
                r1.f17334m = r5     // Catch:{ SocketTimeoutException -> 0x023c, Exception -> 0x0239 }
                r1.f17335n = r6     // Catch:{ SocketTimeoutException -> 0x023c, Exception -> 0x0239 }
                r1.f17333l = r7     // Catch:{ SocketTimeoutException -> 0x023c, Exception -> 0x0239 }
                com.ironsource.mediationsdk.logger.IronLog r5 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL     // Catch:{ SocketTimeoutException -> 0x023c, Exception -> 0x0239 }
                java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ SocketTimeoutException -> 0x023c, Exception -> 0x0239 }
                java.lang.String r7 = "get encrypted session key exception "
                r6.<init>(r7)     // Catch:{ SocketTimeoutException -> 0x023c, Exception -> 0x0239 }
                java.lang.String r0 = r0.getMessage()     // Catch:{ SocketTimeoutException -> 0x023c, Exception -> 0x0239 }
                r6.append(r0)     // Catch:{ SocketTimeoutException -> 0x023c, Exception -> 0x0239 }
                java.lang.String r0 = r6.toString()     // Catch:{ SocketTimeoutException -> 0x023c, Exception -> 0x0239 }
                r5.error(r0)     // Catch:{ SocketTimeoutException -> 0x023c, Exception -> 0x0239 }
            L_0x00c7:
                java.lang.String r0 = r8.toString()     // Catch:{ SocketTimeoutException -> 0x023c, Exception -> 0x0239 }
                java.lang.String r5 = r17.m20337b()     // Catch:{ SocketTimeoutException -> 0x023c, Exception -> 0x0239 }
                if (r11 == 0) goto L_0x00dd
                com.ironsource.mediationsdk.logger.IronLog r6 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL     // Catch:{ SocketTimeoutException -> 0x023c, Exception -> 0x0239 }
                java.lang.String r7 = "compressing and encrypting auction request"
                r6.verbose(r7)     // Catch:{ SocketTimeoutException -> 0x023c, Exception -> 0x0239 }
                java.lang.String r0 = com.ironsource.mediationsdk.utils.IronSourceAES.compressAndEncrypt(r5, r0)     // Catch:{ SocketTimeoutException -> 0x023c, Exception -> 0x0239 }
                goto L_0x00e1
            L_0x00dd:
                java.lang.String r0 = com.ironsource.mediationsdk.utils.IronSourceAES.encode(r5, r0)     // Catch:{ SocketTimeoutException -> 0x023c, Exception -> 0x0239 }
            L_0x00e1:
                int r5 = r1.f17333l     // Catch:{ SocketTimeoutException -> 0x023c, Exception -> 0x0239 }
                r6 = 2
                if (r5 != r6) goto L_0x00f5
                java.lang.String r5 = "{\"sk\" : \"%1$s\", \"ct\" : \"%2$s\"}"
                java.lang.Object[] r7 = new java.lang.Object[r6]     // Catch:{ SocketTimeoutException -> 0x023c, Exception -> 0x0239 }
                r6 = 0
                r7[r6] = r16     // Catch:{ SocketTimeoutException -> 0x023c, Exception -> 0x0239 }
                r6 = 1
                r7[r6] = r0     // Catch:{ SocketTimeoutException -> 0x023c, Exception -> 0x0239 }
                java.lang.String r0 = java.lang.String.format(r5, r7)     // Catch:{ SocketTimeoutException -> 0x023c, Exception -> 0x0239 }
                goto L_0x0101
            L_0x00f5:
                java.lang.String r5 = "{\"request\" : \"%1$s\"}"
                r6 = 1
                java.lang.Object[] r7 = new java.lang.Object[r6]     // Catch:{ SocketTimeoutException -> 0x023c, Exception -> 0x0239 }
                r6 = 0
                r7[r6] = r0     // Catch:{ SocketTimeoutException -> 0x023c, Exception -> 0x0239 }
                java.lang.String r0 = java.lang.String.format(r5, r7)     // Catch:{ SocketTimeoutException -> 0x023c, Exception -> 0x0239 }
            L_0x0101:
                r15.write(r0)     // Catch:{ SocketTimeoutException -> 0x023c, Exception -> 0x0239 }
                r15.flush()     // Catch:{ SocketTimeoutException -> 0x023c, Exception -> 0x0239 }
                r15.close()     // Catch:{ SocketTimeoutException -> 0x023c, Exception -> 0x0239 }
                r14.close()     // Catch:{ SocketTimeoutException -> 0x023c, Exception -> 0x0239 }
                r13.close()     // Catch:{ SocketTimeoutException -> 0x023c, Exception -> 0x0239 }
                int r0 = r12.getResponseCode()     // Catch:{ SocketTimeoutException -> 0x023c, Exception -> 0x0239 }
                r5 = 200(0xc8, float:2.8E-43)
                if (r0 == r5) goto L_0x0157
                r5 = 1001(0x3e9, float:1.403E-42)
                r1.f17323b = r5     // Catch:{ SocketTimeoutException -> 0x023c, Exception -> 0x0239 }
                java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ SocketTimeoutException -> 0x023c, Exception -> 0x0239 }
                java.lang.String r6 = "Auction status not 200 error, error code response from server - "
                r5.<init>(r6)     // Catch:{ SocketTimeoutException -> 0x023c, Exception -> 0x0239 }
                r5.append(r0)     // Catch:{ SocketTimeoutException -> 0x023c, Exception -> 0x0239 }
                java.lang.String r0 = r5.toString()     // Catch:{ SocketTimeoutException -> 0x023c, Exception -> 0x0239 }
                r1.f17324c = r0     // Catch:{ SocketTimeoutException -> 0x023c, Exception -> 0x0239 }
                com.ironsource.mediationsdk.logger.IronLog r0 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL     // Catch:{ SocketTimeoutException -> 0x023c, Exception -> 0x0239 }
                java.lang.String r5 = r1.f17324c     // Catch:{ SocketTimeoutException -> 0x023c, Exception -> 0x0239 }
                r0.error(r5)     // Catch:{ SocketTimeoutException -> 0x023c, Exception -> 0x0239 }
                r12.disconnect()     // Catch:{ SocketTimeoutException -> 0x023c, Exception -> 0x0239 }
                int r0 = r1.f17331j     // Catch:{ SocketTimeoutException -> 0x023c, Exception -> 0x0239 }
                int r5 = r1.f17339r     // Catch:{ SocketTimeoutException -> 0x023c, Exception -> 0x0239 }
                r6 = 1
                int r5 = r5 - r6
                if (r0 >= r5) goto L_0x0154
                long r5 = r1.f17340s     // Catch:{ SocketTimeoutException -> 0x023c, Exception -> 0x0239 }
                java.util.Date r0 = new java.util.Date     // Catch:{ SocketTimeoutException -> 0x023c, Exception -> 0x0239 }
                r0.<init>()     // Catch:{ SocketTimeoutException -> 0x023c, Exception -> 0x0239 }
                long r7 = r0.getTime()     // Catch:{ SocketTimeoutException -> 0x023c, Exception -> 0x0239 }
                long r7 = r7 - r9
                long r5 = r5 - r7
                r7 = 0
                int r0 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
                if (r0 <= 0) goto L_0x0154
                android.os.SystemClock.sleep(r5)     // Catch:{ SocketTimeoutException -> 0x023c, Exception -> 0x0239 }
            L_0x0154:
                r8 = r12
                goto L_0x028b
            L_0x0157:
                java.lang.String r0 = m20335a(r12)     // Catch:{ SocketTimeoutException -> 0x023c, Exception -> 0x0239 }
                boolean r5 = r1.f17338q     // Catch:{ JSONException -> 0x01e0 }
                boolean r6 = r1.f17342u     // Catch:{ JSONException -> 0x01e0 }
                boolean r7 = android.text.TextUtils.isEmpty(r0)     // Catch:{ JSONException -> 0x01e0 }
                if (r7 != 0) goto L_0x01d8
                org.json.JSONObject r7 = new org.json.JSONObject     // Catch:{ JSONException -> 0x01e0 }
                r7.<init>(r0)     // Catch:{ JSONException -> 0x01e0 }
                if (r5 == 0) goto L_0x01b0
                java.lang.String r0 = r17.m20337b()     // Catch:{ JSONException -> 0x01e0 }
                int r5 = r1.f17333l     // Catch:{ JSONException -> 0x01e0 }
                r8 = 2
                if (r5 != r8) goto L_0x0178
                java.lang.String r5 = "ct"
                goto L_0x017a
            L_0x0178:
                java.lang.String r5 = "response"
            L_0x017a:
                java.lang.String r5 = r7.getString(r5)     // Catch:{ JSONException -> 0x01e0 }
                if (r6 == 0) goto L_0x0199
                com.ironsource.mediationsdk.logger.IronLog r6 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL     // Catch:{ JSONException -> 0x01e0 }
                java.lang.String r7 = "decrypting and decompressing auction response"
                r6.verbose(r7)     // Catch:{ JSONException -> 0x01e0 }
                java.lang.String r0 = com.ironsource.mediationsdk.utils.IronSourceAES.decryptAndDecompress(r0, r5)     // Catch:{ JSONException -> 0x01e0 }
                if (r0 == 0) goto L_0x0193
                org.json.JSONObject r5 = new org.json.JSONObject     // Catch:{ JSONException -> 0x01e0 }
                r5.<init>(r0)     // Catch:{ JSONException -> 0x01e0 }
                goto L_0x01a8
            L_0x0193:
                org.json.JSONException r0 = new org.json.JSONException     // Catch:{ JSONException -> 0x01e0 }
                r0.<init>(r2)     // Catch:{ JSONException -> 0x01e0 }
                throw r0     // Catch:{ JSONException -> 0x01e0 }
            L_0x0199:
                java.lang.String r0 = com.ironsource.mediationsdk.utils.IronSourceAES.decode(r0, r5)     // Catch:{ JSONException -> 0x01e0 }
                boolean r5 = android.text.TextUtils.isEmpty(r0)     // Catch:{ JSONException -> 0x01e0 }
                if (r5 != 0) goto L_0x01aa
                org.json.JSONObject r5 = new org.json.JSONObject     // Catch:{ JSONException -> 0x01e0 }
                r5.<init>(r0)     // Catch:{ JSONException -> 0x01e0 }
            L_0x01a8:
                r7 = r5
                goto L_0x01b0
            L_0x01aa:
                org.json.JSONException r0 = new org.json.JSONException     // Catch:{ JSONException -> 0x01e0 }
                r0.<init>(r3)     // Catch:{ JSONException -> 0x01e0 }
                throw r0     // Catch:{ JSONException -> 0x01e0 }
            L_0x01b0:
                com.ironsource.mediationsdk.C6656f.m20309a()     // Catch:{ JSONException -> 0x01e0 }
                com.ironsource.mediationsdk.f$a r0 = com.ironsource.mediationsdk.C6656f.m20308a((org.json.JSONObject) r7)     // Catch:{ JSONException -> 0x01e0 }
                java.lang.String r5 = r0.f17299a     // Catch:{ JSONException -> 0x01e0 }
                r1.f17325d = r5     // Catch:{ JSONException -> 0x01e0 }
                java.util.List<com.ironsource.mediationsdk.server.b> r5 = r0.f17300b     // Catch:{ JSONException -> 0x01e0 }
                r1.f17326e = r5     // Catch:{ JSONException -> 0x01e0 }
                com.ironsource.mediationsdk.server.b r5 = r0.f17301c     // Catch:{ JSONException -> 0x01e0 }
                r1.f17327f = r5     // Catch:{ JSONException -> 0x01e0 }
                org.json.JSONObject r5 = r0.f17302d     // Catch:{ JSONException -> 0x01e0 }
                r1.f17328g = r5     // Catch:{ JSONException -> 0x01e0 }
                org.json.JSONObject r5 = r0.f17303e     // Catch:{ JSONException -> 0x01e0 }
                r1.f17329h = r5     // Catch:{ JSONException -> 0x01e0 }
                int r5 = r0.f17304f     // Catch:{ JSONException -> 0x01e0 }
                r1.f17323b = r5     // Catch:{ JSONException -> 0x01e0 }
                java.lang.String r0 = r0.f17305g     // Catch:{ JSONException -> 0x01e0 }
                r1.f17324c = r0     // Catch:{ JSONException -> 0x01e0 }
                r12.disconnect()     // Catch:{ SocketTimeoutException -> 0x023c, Exception -> 0x0239 }
                r2 = 1
                return r2
            L_0x01d8:
                org.json.JSONException r0 = new org.json.JSONException     // Catch:{ JSONException -> 0x01e0 }
                java.lang.String r5 = "empty response"
                r0.<init>(r5)     // Catch:{ JSONException -> 0x01e0 }
                throw r0     // Catch:{ JSONException -> 0x01e0 }
            L_0x01e0:
                r0 = move-exception
                java.lang.String r5 = r0.getMessage()     // Catch:{ SocketTimeoutException -> 0x023c, Exception -> 0x0239 }
                if (r5 == 0) goto L_0x01f9
                java.lang.String r5 = r0.getMessage()     // Catch:{ SocketTimeoutException -> 0x023c, Exception -> 0x0239 }
                boolean r5 = r5.equalsIgnoreCase(r3)     // Catch:{ SocketTimeoutException -> 0x023c, Exception -> 0x0239 }
                if (r5 == 0) goto L_0x01f9
                r5 = 1003(0x3eb, float:1.406E-42)
                r1.f17323b = r5     // Catch:{ SocketTimeoutException -> 0x023c, Exception -> 0x0239 }
                java.lang.String r5 = "Auction decryption error"
                r1.f17324c = r5     // Catch:{ SocketTimeoutException -> 0x023c, Exception -> 0x0239 }
            L_0x01f9:
                java.lang.String r5 = r0.getMessage()     // Catch:{ SocketTimeoutException -> 0x023c, Exception -> 0x0239 }
                if (r5 == 0) goto L_0x0212
                java.lang.String r5 = r0.getMessage()     // Catch:{ SocketTimeoutException -> 0x023c, Exception -> 0x0239 }
                boolean r5 = r5.equalsIgnoreCase(r2)     // Catch:{ SocketTimeoutException -> 0x023c, Exception -> 0x0239 }
                if (r5 == 0) goto L_0x0212
                r5 = 1008(0x3f0, float:1.413E-42)
                r1.f17323b = r5     // Catch:{ SocketTimeoutException -> 0x023c, Exception -> 0x0239 }
                java.lang.String r5 = "Auction decompression error"
            L_0x020f:
                r1.f17324c = r5     // Catch:{ SocketTimeoutException -> 0x023c, Exception -> 0x0239 }
                goto L_0x0219
            L_0x0212:
                r5 = 1002(0x3ea, float:1.404E-42)
                r1.f17323b = r5     // Catch:{ SocketTimeoutException -> 0x023c, Exception -> 0x0239 }
                java.lang.String r5 = "Auction parsing error"
                goto L_0x020f
            L_0x0219:
                java.lang.String r5 = "parsing"
                r1.f17332k = r5     // Catch:{ SocketTimeoutException -> 0x023c, Exception -> 0x0239 }
                com.ironsource.mediationsdk.logger.IronLog r5 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL     // Catch:{ SocketTimeoutException -> 0x023c, Exception -> 0x0239 }
                java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ SocketTimeoutException -> 0x023c, Exception -> 0x0239 }
                java.lang.String r7 = "Auction handle response exception "
                r6.<init>(r7)     // Catch:{ SocketTimeoutException -> 0x023c, Exception -> 0x0239 }
                java.lang.String r0 = r0.getMessage()     // Catch:{ SocketTimeoutException -> 0x023c, Exception -> 0x0239 }
                r6.append(r0)     // Catch:{ SocketTimeoutException -> 0x023c, Exception -> 0x0239 }
                java.lang.String r0 = r6.toString()     // Catch:{ SocketTimeoutException -> 0x023c, Exception -> 0x0239 }
                r5.error(r0)     // Catch:{ SocketTimeoutException -> 0x023c, Exception -> 0x0239 }
                r12.disconnect()     // Catch:{ SocketTimeoutException -> 0x023c, Exception -> 0x0239 }
                r2 = 0
                return r2
            L_0x0239:
                r0 = move-exception
                r8 = r12
                goto L_0x0240
            L_0x023c:
                r0 = move-exception
                r8 = r12
                goto L_0x0267
            L_0x023f:
                r0 = move-exception
            L_0x0240:
                com.ironsource.mediationsdk.logger.IronLog r2 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                java.lang.String r5 = "getting exception "
                r3.<init>(r5)
                r3.append(r0)
                java.lang.String r3 = r3.toString()
                r2.error(r3)
                if (r8 == 0) goto L_0x0258
                r8.disconnect()
            L_0x0258:
                r2 = 1000(0x3e8, float:1.401E-42)
                r1.f17323b = r2
                java.lang.String r0 = r0.getMessage()
                r1.f17324c = r0
                r1.f17332k = r4
                r2 = 0
                return r2
            L_0x0266:
                r0 = move-exception
            L_0x0267:
                if (r8 == 0) goto L_0x026c
                r8.disconnect()
            L_0x026c:
                r5 = 1006(0x3ee, float:1.41E-42)
                r1.f17323b = r5
                java.lang.String r5 = "Connection timed out"
                r1.f17324c = r5
                com.ironsource.mediationsdk.logger.IronLog r5 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                java.lang.String r7 = "Auction socket timeout exception "
                r6.<init>(r7)
                java.lang.String r0 = r0.getMessage()
                r6.append(r0)
                java.lang.String r0 = r6.toString()
                r5.error(r0)
            L_0x028b:
                int r0 = r1.f17331j
                r5 = 1
                int r0 = r0 + r5
                r1.f17331j = r0
                r7 = r5
                r5 = 0
                r6 = 1015(0x3f7, float:1.422E-42)
                goto L_0x0025
            L_0x0297:
                r5 = r7
                int r9 = r9 - r5
                r1.f17331j = r9
                java.lang.String r0 = "trials_fail"
                r1.f17332k = r0
                r2 = 0
                return r2
            L_0x02a1:
                r0 = move-exception
                r2 = r5
                r3 = 1007(0x3ef, float:1.411E-42)
                r1.f17323b = r3
                java.lang.String r3 = r0.getMessage()
                r1.f17324c = r3
                r1.f17331j = r2
                r1.f17332k = r4
                com.ironsource.mediationsdk.logger.IronLog r3 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                java.lang.String r5 = "Auction request exception "
                r4.<init>(r5)
                java.lang.String r0 = r0.getMessage()
                r4.append(r0)
                java.lang.String r0 = r4.toString()
                r3.error(r0)
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.C6661h.C6662a.m20336a():boolean");
        }

        /* renamed from: b */
        private String m20337b() {
            return this.f17333l == 2 ? C6770g.m20577a().mo36967c() : C6770g.m20577a().mo36966b();
        }

        public final void run() {
            boolean a = m20336a();
            C6660g gVar = (C6660g) this.f17322a.get();
            if (gVar != null) {
                long time = new Date().getTime() - this.f17330i;
                if (a) {
                    gVar.mo36182a(this.f17326e, this.f17325d, this.f17327f, this.f17328g, this.f17329h, this.f17331j + 1, time, this.f17335n, this.f17334m);
                } else {
                    gVar.mo36176a(this.f17323b, this.f17324c, this.f17331j + 1, this.f17332k, time);
                }
            }
        }
    }

    public C6661h(String str, C6765c cVar, C6660g gVar) {
        this.f17318g = str;
        this.f17320i = cVar;
        this.f17321j = gVar;
        this.f17319h = IronSourceUtils.getSessionId();
    }

    /* renamed from: a */
    private JSONObject m20328a(Context context, Map<String, Object> map, List<String> list, C6663i iVar, int i, boolean z, IronSourceSegment ironSourceSegment) {
        new JSONObject();
        C6784p c = C6490J.m19474a().f16543i.f17849c.f17500e.mo56832c();
        JSONObject a = m20329a(ironSourceSegment);
        boolean z2 = c.f17891d;
        C6656f a2 = C6656f.m20309a();
        if (z2) {
            return a2.mo36673a(this.f17318g, z, map, list, iVar, i, this.f17312a, a);
        }
        JSONObject a3 = a2.mo36672a(context, map, list, iVar, i, this.f17319h, this.f17320i, this.f17312a, a);
        a3.put(IronSourceConstants.EVENTS_AD_UNIT, this.f17318g);
        a3.put("doNotEncryptResponse", z ? "false" : "true");
        return a3;
    }

    /* renamed from: a */
    private static JSONObject m20329a(IronSourceSegment ironSourceSegment) {
        JSONObject jSONObject = new JSONObject();
        if (ironSourceSegment == null) {
            return null;
        }
        Vector<Pair<String, String>> a = ironSourceSegment.mo36116a();
        for (int i = 0; i < a.size(); i++) {
            try {
                jSONObject.put((String) a.get(i).first, a.get(i).second);
            } catch (JSONException e) {
                e.printStackTrace();
                IronLog ironLog = IronLog.INTERNAL;
                ironLog.error("exception " + e.getMessage());
            }
        }
        return jSONObject;
    }

    /* renamed from: a */
    public static void m20330a(C6758b bVar, int i, C6758b bVar2) {
        for (String a : bVar.mo36944f()) {
            String a2 = C6656f.m20309a().mo36671a(a, i, bVar, "", "", "");
            C6656f.m20309a();
            C6656f.m20314a("reportLoadSuccess", bVar.mo36939a(), a2);
        }
        if (bVar2 != null) {
            for (String a3 : bVar2.mo36944f()) {
                String a4 = C6656f.m20309a().mo36671a(a3, i, bVar, "", "102", "");
                C6656f.m20309a();
                C6656f.m20314a("reportLoadSuccess", "GenericNotifications", a4);
            }
        }
    }

    /* renamed from: a */
    public static void m20331a(C6758b bVar, int i, C6758b bVar2, String str) {
        for (String a : bVar.mo36942d()) {
            String a2 = C6656f.m20309a().mo36671a(a, i, bVar, "", "", str);
            C6656f.m20309a();
            C6656f.m20314a("reportImpression", bVar.mo36939a(), a2);
        }
        if (bVar2 != null) {
            for (String a3 : bVar2.mo36942d()) {
                String a4 = C6656f.m20309a().mo36671a(a3, i, bVar, "", "102", str);
                C6656f.m20309a();
                C6656f.m20314a("reportImpression", "GenericNotifications", a4);
            }
        }
    }

    /* renamed from: a */
    public static void m20332a(ArrayList<String> arrayList, ConcurrentHashMap<String, C6758b> concurrentHashMap, int i, C6758b bVar, C6758b bVar2) {
        Iterator<String> it = arrayList.iterator();
        boolean z = false;
        boolean z2 = false;
        while (it.hasNext()) {
            String next = it.next();
            if (next.equals(bVar2.mo36939a())) {
                z2 = i == 2;
                z = true;
            } else {
                int i2 = i;
                C6758b bVar3 = concurrentHashMap.get(next);
                String c = bVar3.mo36941c();
                String str = z ? z2 ? "102" : "103" : "1";
                for (String a : bVar3.mo36943e()) {
                    String a2 = C6656f.m20309a().mo36671a(a, i, bVar2, c, str, "");
                    C6656f.m20309a();
                    C6656f.m20314a("reportAuctionLose", bVar3.mo36939a(), a2);
                }
            }
        }
        int i3 = i;
        if (bVar != null) {
            for (String a3 : bVar.mo36943e()) {
                String a4 = C6656f.m20309a().mo36671a(a3, i, bVar2, "", "102", "");
                C6656f.m20309a();
                C6656f.m20314a("reportAuctionLose", "GenericNotifications", a4);
            }
        }
    }

    /* renamed from: a */
    public final void mo36677a(Context context, Map<String, Object> map, List<String> list, C6663i iVar, int i, IronSourceSegment ironSourceSegment) {
        try {
            boolean z = true;
            if (IronSourceUtils.getSerr() != 1) {
                z = false;
            }
            boolean z2 = z;
            JSONObject a = m20328a(context, map, list, iVar, i, z2, ironSourceSegment);
            C6423c.f16330a.mo35934c(new C6662a(this.f17321j, new URL(this.f17320i.f17672d), a, z2, this.f17320i.f17673e, this.f17320i.f17676h, this.f17320i.f17684p, this.f17320i.f17685q, this.f17320i.f17686r));
        } catch (Exception e) {
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.error("execute auction exception " + e.getMessage());
            this.f17321j.mo36176a(1000, e.getMessage(), 0, "other", 0);
        }
    }

    /* renamed from: a */
    public final void mo36678a(CopyOnWriteArrayList<C6560aa> copyOnWriteArrayList, ConcurrentHashMap<String, C6758b> concurrentHashMap, int i, C6758b bVar, C6758b bVar2) {
        ArrayList arrayList = new ArrayList();
        Iterator<C6560aa> it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().mo36401k());
        }
        m20332a((ArrayList<String>) arrayList, concurrentHashMap, i, bVar, bVar2);
    }
}

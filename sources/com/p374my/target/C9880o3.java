package com.p374my.target;

import android.os.Build;
import java.lang.reflect.Field;
import java.net.HttpCookie;
import org.json.JSONObject;

/* renamed from: com.my.target.o3 */
public class C9880o3 {
    /* JADX WARNING: Can't wrap try/catch for region: R(37:1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|(2:35|36)(2:37|38)|39|40|44) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x009f */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String mo65155a(java.net.HttpCookie r5) {
        /*
            r4 = this;
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r1 = "name"
            java.lang.String r2 = r5.getName()     // Catch:{ all -> 0x00a4 }
            r0.put(r1, r2)     // Catch:{ all -> 0x00a4 }
            java.lang.String r1 = "value"
            java.lang.String r2 = r5.getValue()     // Catch:{ all -> 0x00a4 }
            r0.putOpt(r1, r2)     // Catch:{ all -> 0x00a4 }
            java.lang.String r1 = "comment"
            java.lang.String r2 = r5.getComment()     // Catch:{ all -> 0x00a4 }
            r0.putOpt(r1, r2)     // Catch:{ all -> 0x00a4 }
            java.lang.String r1 = "commentUrl"
            java.lang.String r2 = r5.getCommentURL()     // Catch:{ all -> 0x00a4 }
            r0.putOpt(r1, r2)     // Catch:{ all -> 0x00a4 }
            java.lang.String r1 = "domain"
            java.lang.String r2 = r5.getDomain()     // Catch:{ all -> 0x00a4 }
            r0.putOpt(r1, r2)     // Catch:{ all -> 0x00a4 }
            java.lang.String r1 = "maxage"
            long r2 = r5.getMaxAge()     // Catch:{ all -> 0x00a4 }
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x00a4 }
            r0.putOpt(r1, r2)     // Catch:{ all -> 0x00a4 }
            java.lang.String r1 = "path"
            java.lang.String r2 = r5.getPath()     // Catch:{ all -> 0x00a4 }
            r0.putOpt(r1, r2)     // Catch:{ all -> 0x00a4 }
            java.lang.String r1 = "portlist"
            java.lang.String r2 = r5.getPortlist()     // Catch:{ all -> 0x00a4 }
            r0.putOpt(r1, r2)     // Catch:{ all -> 0x00a4 }
            java.lang.String r1 = "version"
            int r2 = r5.getVersion()     // Catch:{ all -> 0x00a4 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x00a4 }
            r0.putOpt(r1, r2)     // Catch:{ all -> 0x00a4 }
            java.lang.String r1 = "secure"
            boolean r2 = r5.getSecure()     // Catch:{ all -> 0x00a4 }
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)     // Catch:{ all -> 0x00a4 }
            r0.putOpt(r1, r2)     // Catch:{ all -> 0x00a4 }
            java.lang.String r1 = "discard"
            boolean r2 = r5.getDiscard()     // Catch:{ all -> 0x00a4 }
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)     // Catch:{ all -> 0x00a4 }
            r0.putOpt(r1, r2)     // Catch:{ all -> 0x00a4 }
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x00a4 }
            r2 = 24
            java.lang.String r3 = "httpOnly"
            if (r1 < r2) goto L_0x008c
            boolean r5 = r5.isHttpOnly()     // Catch:{ all -> 0x00a4 }
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)     // Catch:{ all -> 0x00a4 }
            r0.putOpt(r3, r5)     // Catch:{ all -> 0x00a4 }
            goto L_0x009f
        L_0x008c:
            java.lang.Class r1 = r5.getClass()     // Catch:{ all -> 0x009f }
            java.lang.reflect.Field r1 = r1.getDeclaredField(r3)     // Catch:{ all -> 0x009f }
            r2 = 1
            r1.setAccessible(r2)     // Catch:{ all -> 0x009f }
            java.lang.Object r5 = r1.get(r5)     // Catch:{ all -> 0x009f }
            r0.putOpt(r3, r5)     // Catch:{ all -> 0x009f }
        L_0x009f:
            java.lang.String r5 = r0.toString()     // Catch:{ all -> 0x00a4 }
            goto L_0x00be
        L_0x00a4:
            r5 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Exception encoding cookie"
            r0.append(r1)
            java.lang.String r5 = r5.getMessage()
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            com.p374my.target.C9672e0.m27882a(r5)
            r5 = 0
        L_0x00be:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p374my.target.C9880o3.mo65155a(java.net.HttpCookie):java.lang.String");
    }

    /* renamed from: a */
    public HttpCookie mo65156a(String str) {
        HttpCookie httpCookie;
        Throwable th;
        try {
            JSONObject jSONObject = new JSONObject(str);
            httpCookie = new HttpCookie(jSONObject.getString("name"), jSONObject.optString("value"));
            try {
                httpCookie.setComment(jSONObject.optString("comment"));
                httpCookie.setCommentURL(jSONObject.optString("commentUrl"));
                httpCookie.setDomain(jSONObject.optString("domain"));
                httpCookie.setMaxAge((long) jSONObject.optInt("maxage"));
                httpCookie.setPath(jSONObject.optString("path"));
                httpCookie.setPortlist(jSONObject.optString("portlist"));
                httpCookie.setVersion(jSONObject.optInt("version"));
                httpCookie.setSecure(jSONObject.optBoolean("secure"));
                httpCookie.setDiscard(jSONObject.optBoolean("discard"));
                if (Build.VERSION.SDK_INT >= 24) {
                    httpCookie.setHttpOnly(jSONObject.optBoolean("httpOnly"));
                } else {
                    try {
                        Field declaredField = httpCookie.getClass().getDeclaredField("httpOnly");
                        declaredField.setAccessible(true);
                        declaredField.set(httpCookie, Boolean.valueOf(jSONObject.optBoolean("httpOnly")));
                    } catch (Throwable unused) {
                    }
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            th = th3;
            httpCookie = null;
            C9672e0.m27882a("Exception decoding cookie" + th.getMessage());
            return httpCookie;
        }
        return httpCookie;
    }
}

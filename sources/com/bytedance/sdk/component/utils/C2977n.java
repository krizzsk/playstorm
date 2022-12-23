package com.bytedance.sdk.component.utils;

import android.content.Context;
import android.text.TextUtils;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.bytedance.sdk.component.utils.n */
/* compiled from: MimeDetector */
public class C2977n {

    /* renamed from: c */
    private static volatile C2977n f6742c;

    /* renamed from: a */
    private Map<String, String> f6743a;

    /* renamed from: b */
    private volatile boolean f6744b = false;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public Context f6745d;

    /* renamed from: a */
    public static String m8395a(Context context, String str) {
        if (str != null) {
            try {
                if (str.startsWith("http") && str.contains("?")) {
                    str = str.split("\\?")[0];
                    if (str.endsWith("/")) {
                        str = str.substring(0, str.length() - 1);
                    }
                }
            } catch (Throwable unused) {
            }
        }
        return m8394a(context).mo17895a(str);
    }

    /* renamed from: a */
    static C2977n m8394a(Context context) {
        if (f6742c == null) {
            synchronized (C2977n.class) {
                if (f6742c == null) {
                    f6742c = new C2977n(context);
                }
            }
        }
        return f6742c;
    }

    private C2977n(Context context) {
        if (context != null && this.f6745d == null) {
            this.f6745d = context.getApplicationContext();
            m8396a();
        }
        this.f6745d = context;
    }

    /* renamed from: a */
    public final String mo17895a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String d = m8401d(str);
        if (TextUtils.isEmpty(d)) {
            return null;
        }
        return m8399b(d);
    }

    /* renamed from: b */
    private static String m8399b(String str) {
        String str2;
        int indexOf = str.indexOf(47);
        int indexOf2 = str.indexOf(59);
        if (indexOf < 0) {
            return null;
        }
        String lowerCase = str.substring(0, indexOf).trim().toLowerCase(Locale.ENGLISH);
        if (!m8400c(lowerCase)) {
            return null;
        }
        int i = indexOf + 1;
        if (indexOf2 < 0) {
            str2 = str.substring(i);
        } else {
            str2 = str.substring(i, indexOf2);
        }
        String lowerCase2 = str2.trim().toLowerCase(Locale.ENGLISH);
        if (!m8400c(lowerCase2)) {
            return null;
        }
        StringBuilder sb = new StringBuilder(lowerCase.length() + lowerCase2.length() + 1);
        sb.append(lowerCase);
        sb.append('/');
        sb.append(lowerCase2);
        return sb.toString();
    }

    /* renamed from: a */
    private static boolean m8398a(char c) {
        return c > ' ' && c < 127 && "()<>@,;:/[]?=\\\"".indexOf(c) < 0;
    }

    /* renamed from: c */
    private static boolean m8400c(String str) {
        int length = str.length();
        if (length == 0) {
            return false;
        }
        for (int i = 0; i < length; i++) {
            if (!m8398a(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:9:0x0024  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String m8401d(java.lang.String r3) {
        /*
            r2 = this;
            java.lang.String r3 = m8402e(r3)
            boolean r0 = r3.isEmpty()
            r1 = 0
            if (r0 == 0) goto L_0x000c
            return r1
        L_0x000c:
            r2.m8396a()
            java.util.Map<java.lang.String, java.lang.String> r0 = r2.f6743a
            if (r0 == 0) goto L_0x0031
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x001a
            goto L_0x0031
        L_0x001a:
            java.util.Map<java.lang.String, java.lang.String> r0 = r2.f6743a
            java.lang.Object r0 = r0.get(r3)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 != 0) goto L_0x0028
            java.lang.String r3 = m8402e(r3)
        L_0x0028:
            if (r0 != 0) goto L_0x0030
            boolean r1 = r3.isEmpty()
            if (r1 == 0) goto L_0x001a
        L_0x0030:
            return r0
        L_0x0031:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.utils.C2977n.m8401d(java.lang.String):java.lang.String");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0008, code lost:
        r0 = r2.indexOf(46);
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String m8402e(java.lang.String r2) {
        /*
            if (r2 == 0) goto L_0x001f
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L_0x001f
            r0 = 46
            int r0 = r2.indexOf(r0)
            if (r0 < 0) goto L_0x001f
            int r1 = r2.length()
            int r1 = r1 + -1
            if (r0 >= r1) goto L_0x001f
            int r0 = r0 + 1
            java.lang.String r2 = r2.substring(r0)
            goto L_0x0021
        L_0x001f:
            java.lang.String r2 = ""
        L_0x0021:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.utils.C2977n.m8402e(java.lang.String):java.lang.String");
    }

    /* renamed from: a */
    private void m8396a() {
        if (this.f6745d != null && !this.f6744b) {
            synchronized (this) {
                if (!this.f6744b) {
                    List<String> list = (List) AccessController.doPrivileged(new PrivilegedAction<List<String>>() {
                        /* JADX WARNING: Failed to process nested try/catch */
                        /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x0035 */
                        /* JADX WARNING: Removed duplicated region for block: B:27:0x0043 A[SYNTHETIC, Splitter:B:27:0x0043] */
                        /* JADX WARNING: Removed duplicated region for block: B:31:0x0048 A[SYNTHETIC, Splitter:B:31:0x0048] */
                        /* renamed from: a */
                        /* Code decompiled incorrectly, please refer to instructions dump. */
                        public java.util.List<java.lang.String> run() {
                            /*
                                r5 = this;
                                r0 = 0
                                java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ all -> 0x003c }
                                r1.<init>()     // Catch:{ all -> 0x003c }
                                com.bytedance.sdk.component.utils.n r2 = com.bytedance.sdk.component.utils.C2977n.this     // Catch:{ all -> 0x003c }
                                android.content.Context r2 = r2.f6745d     // Catch:{ all -> 0x003c }
                                android.content.res.AssetManager r2 = r2.getAssets()     // Catch:{ all -> 0x003c }
                                java.lang.String r3 = "tt_mime_type.pro"
                                java.io.InputStream r2 = r2.open(r3)     // Catch:{ all -> 0x003c }
                                java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch:{ all -> 0x0039 }
                                java.io.InputStreamReader r4 = new java.io.InputStreamReader     // Catch:{ all -> 0x0039 }
                                r4.<init>(r2)     // Catch:{ all -> 0x0039 }
                                r3.<init>(r4)     // Catch:{ all -> 0x0039 }
                            L_0x0020:
                                java.lang.String r0 = r3.readLine()     // Catch:{ all -> 0x003a }
                                if (r0 == 0) goto L_0x0030
                                boolean r4 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x003a }
                                if (r4 != 0) goto L_0x0020
                                r1.add(r0)     // Catch:{ all -> 0x003a }
                                goto L_0x0020
                            L_0x0030:
                                if (r2 == 0) goto L_0x0035
                                r2.close()     // Catch:{ all -> 0x0035 }
                            L_0x0035:
                                r3.close()     // Catch:{ all -> 0x0038 }
                            L_0x0038:
                                return r1
                            L_0x0039:
                                r3 = r0
                            L_0x003a:
                                r0 = r2
                                goto L_0x003d
                            L_0x003c:
                                r3 = r0
                            L_0x003d:
                                java.util.List r1 = java.util.Collections.emptyList()     // Catch:{ all -> 0x004c }
                                if (r0 == 0) goto L_0x0046
                                r0.close()     // Catch:{ all -> 0x0046 }
                            L_0x0046:
                                if (r3 == 0) goto L_0x004b
                                r3.close()     // Catch:{ all -> 0x004b }
                            L_0x004b:
                                return r1
                            L_0x004c:
                                r1 = move-exception
                                if (r0 == 0) goto L_0x0052
                                r0.close()     // Catch:{ all -> 0x0052 }
                            L_0x0052:
                                if (r3 == 0) goto L_0x0057
                                r3.close()     // Catch:{ all -> 0x0057 }
                            L_0x0057:
                                throw r1
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.utils.C2977n.C29781.run():java.util.List");
                        }
                    });
                    this.f6743a = new HashMap(list.size());
                    String str = "";
                    for (String str2 : list) {
                        String str3 = str + str2;
                        if (str3.endsWith("\\")) {
                            str = str3.substring(0, str3.length() - 1);
                        } else {
                            m8403f(str3);
                            str = "";
                        }
                    }
                    if (!str.isEmpty()) {
                        m8403f(str);
                    }
                    this.f6744b = true;
                }
            }
        }
    }

    /* renamed from: f */
    private void m8403f(String str) {
        String trim = str.trim();
        if (!trim.isEmpty()) {
            if (trim.charAt(0) != '#') {
                String replaceAll = trim.replaceAll("\\s*#.*", "");
                if (replaceAll.indexOf(61) > 0) {
                    Matcher matcher = Pattern.compile("\\btype=(\"\\p{Graph}+?/\\p{Graph}+?\"|\\p{Graph}+/\\p{Graph}+\\b)").matcher(replaceAll);
                    if (matcher.find()) {
                        String substring = matcher.group().substring(5);
                        if (substring.charAt(0) == '\"') {
                            substring = substring.substring(1, substring.length() - 1);
                        }
                        Matcher matcher2 = Pattern.compile("\\bexts=(\"[\\p{Graph}|\\p{Blank}]+?\"|\\p{Graph}+\\b)").matcher(replaceAll);
                        if (matcher2.find()) {
                            String substring2 = matcher2.group().substring(5);
                            if (substring2.charAt(0) == '\"') {
                                substring2 = substring2.substring(1, substring2.length() - 1);
                            }
                            for (String a : substring2.split("[\\p{Blank}|\\p{Punct}]+")) {
                                m8397a(a, substring);
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
                String[] split = replaceAll.split("\\s+");
                for (int i = 1; i < split.length; i++) {
                    m8397a(split[i], split[0]);
                }
            }
        }
    }

    /* renamed from: a */
    private void m8397a(String str, String str2) {
        if (str != null && !str.isEmpty() && str2 != null && !str2.isEmpty() && !this.f6743a.containsKey(str)) {
            this.f6743a.put(str, str2);
        }
    }
}

package com.bykv.p068vk.openvk.component.video.p069a.p073b;

import android.net.Uri;
import android.text.TextUtils;
import com.bykv.p068vk.openvk.component.video.p069a.p080c.C2482a;
import com.facebook.internal.security.CertificateUtil;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bykv.vk.openvk.component.video.a.b.i */
/* compiled from: Request */
public class C2473i {

    /* renamed from: a */
    public final C2476c f5257a;

    /* renamed from: b */
    public final List<C2475b> f5258b;

    /* renamed from: c */
    public final C2474a f5259c;

    public C2473i(C2476c cVar, List<C2475b> list, C2474a aVar) {
        this.f5257a = cVar;
        this.f5258b = list;
        this.f5259c = aVar;
    }

    /* renamed from: a */
    public static C2473i m6031a(InputStream inputStream) throws IOException, C2477d {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, C2482a.f5286a));
        ArrayList arrayList = new ArrayList();
        C2476c cVar = null;
        while (true) {
            String readLine = bufferedReader.readLine();
            if (TextUtils.isEmpty(readLine)) {
                break;
            }
            String trim = readLine.trim();
            if (cVar == null) {
                cVar = C2476c.m6036a(trim);
            } else {
                arrayList.add(C2475b.m6035a(trim));
            }
        }
        if (cVar != null) {
            return new C2473i(cVar, arrayList, C2474a.m6034a(cVar, arrayList));
        }
        throw new C2477d("request line is null");
    }

    /* renamed from: com.bykv.vk.openvk.component.video.a.b.i$c */
    /* compiled from: Request */
    static final class C2476c {

        /* renamed from: a */
        final String f5269a;

        /* renamed from: b */
        final String f5270b;

        /* renamed from: c */
        final String f5271c;

        private C2476c(String str, String str2, String str3) {
            this.f5269a = str;
            this.f5270b = str2;
            this.f5271c = str3;
        }

        /* renamed from: a */
        static C2476c m6036a(String str) throws C2477d {
            int indexOf = str.indexOf(32);
            if (indexOf != -1) {
                int lastIndexOf = str.lastIndexOf(32);
                if (lastIndexOf > indexOf) {
                    String trim = str.substring(0, indexOf).trim();
                    String trim2 = str.substring(indexOf + 1, lastIndexOf).trim();
                    String trim3 = str.substring(lastIndexOf + 1).trim();
                    if (trim.length() != 0 && trim2.length() != 0 && trim3.length() != 0) {
                        return new C2476c(trim, trim2, trim3);
                    }
                    throw new C2477d("request line format error, line: " + str);
                }
                throw new C2477d("request line format error, line: " + str);
            }
            throw new C2477d("request line format error, line: " + str);
        }

        public String toString() {
            return "RequestLine{method='" + this.f5269a + '\'' + ", path='" + this.f5270b + '\'' + ", version='" + this.f5271c + '\'' + '}';
        }
    }

    /* renamed from: com.bykv.vk.openvk.component.video.a.b.i$b */
    /* compiled from: Request */
    public static final class C2475b {

        /* renamed from: a */
        public final String f5267a;

        /* renamed from: b */
        public final String f5268b;

        public C2475b(String str, String str2) {
            this.f5267a = str;
            this.f5268b = str2;
        }

        /* renamed from: a */
        static C2475b m6035a(String str) throws C2477d {
            int indexOf = str.indexOf(CertificateUtil.DELIMITER);
            if (indexOf != -1) {
                String trim = str.substring(0, indexOf).trim();
                String trim2 = str.substring(indexOf + 1).trim();
                if (trim.length() != 0 && trim2.length() != 0) {
                    return new C2475b(trim, trim2);
                }
                throw new C2477d("request header format error, header: " + str);
            }
            throw new C2477d("request header format error, header: " + str);
        }

        public String toString() {
            return "Header{name='" + this.f5267a + '\'' + ", value='" + this.f5268b + '\'' + '}';
        }
    }

    /* renamed from: com.bykv.vk.openvk.component.video.a.b.i$a */
    /* compiled from: Request */
    static final class C2474a {

        /* renamed from: a */
        final int f5260a;

        /* renamed from: b */
        final String f5261b;

        /* renamed from: c */
        final String f5262c;

        /* renamed from: d */
        final int f5263d;

        /* renamed from: e */
        final int f5264e;

        /* renamed from: f */
        final String f5265f;

        /* renamed from: g */
        final List<String> f5266g;

        private C2474a(int i, String str, String str2, int i2, int i3, String str3, List<String> list) {
            this.f5260a = i;
            this.f5261b = str;
            this.f5262c = str2;
            this.f5263d = i2;
            this.f5264e = i3;
            this.f5265f = str3;
            this.f5266g = list;
        }

        /* renamed from: a */
        static C2474a m6034a(C2476c cVar, List<C2475b> list) throws C2477d {
            int i;
            String str;
            int i2;
            int indexOf = cVar.f5270b.indexOf("?");
            if (indexOf != -1) {
                ArrayList arrayList = new ArrayList();
                String str2 = null;
                String str3 = null;
                String str4 = null;
                int i3 = 0;
                for (String split : cVar.f5270b.substring(indexOf + 1).split("&")) {
                    String[] split2 = split.split("=");
                    if (split2.length == 2) {
                        if ("rk".equals(split2[0])) {
                            str3 = Uri.decode(split2[1]);
                        } else if (CampaignEx.JSON_KEY_AD_K.equals(split2[0])) {
                            str4 = Uri.decode(split2[1]);
                        } else if (split2[0].startsWith("u")) {
                            arrayList.add(Uri.decode(split2[1]));
                        } else if (InneractiveMediationDefs.GENDER_FEMALE.equals(split2[0]) && C2482a.m6062b(split2[1]) == 1) {
                            i3 = 1;
                        }
                    }
                }
                if (TextUtils.isEmpty(str3) || TextUtils.isEmpty(str4)) {
                    throw new C2477d("rawKey or key is empty, path: " + cVar.f5270b);
                }
                if (list != null) {
                    i2 = 0;
                    int i4 = 0;
                    for (C2475b next : list) {
                        if (next != null && "Range".equalsIgnoreCase(next.f5267a)) {
                            int indexOf2 = next.f5268b.indexOf("=");
                            if (indexOf2 == -1) {
                                throw new C2477d("Range format error, Range: " + next.f5268b);
                            } else if ("bytes".equalsIgnoreCase(next.f5268b.substring(0, indexOf2).trim())) {
                                String substring = next.f5268b.substring(indexOf2 + 1);
                                if (!substring.contains(",")) {
                                    int indexOf3 = substring.indexOf("-");
                                    if (indexOf3 != -1) {
                                        String trim = substring.substring(0, indexOf3).trim();
                                        String trim2 = substring.substring(indexOf3 + 1).trim();
                                        try {
                                            if (trim.length() > 0) {
                                                i2 = Integer.parseInt(trim);
                                            }
                                            if (trim2.length() > 0) {
                                                i4 = Integer.parseInt(trim2);
                                                if (i2 > i4) {
                                                    throw new C2477d("Range format error, Range: " + next.f5268b);
                                                }
                                            }
                                            str2 = next.f5268b;
                                        } catch (NumberFormatException unused) {
                                            throw new C2477d("Range format error, Range: " + next.f5268b);
                                        }
                                    } else {
                                        throw new C2477d("Range format error, Range: " + next.f5268b);
                                    }
                                } else {
                                    throw new C2477d("Range format error, Range: " + next.f5268b);
                                }
                            } else {
                                throw new C2477d("Range format error, Range: " + next.f5268b);
                            }
                        }
                    }
                    i = i4;
                    str = str2;
                } else {
                    str = null;
                    i = 0;
                    i2 = 0;
                }
                if (!arrayList.isEmpty()) {
                    return new C2474a(i3, str3, str4, i2, i, str, arrayList);
                }
                throw new C2477d("no url found: path: " + cVar.f5270b);
            }
            throw new C2477d("path format error, path: " + cVar.f5270b);
        }

        public String toString() {
            return "Extra{flag=" + this.f5260a + ", rawKey='" + this.f5261b + '\'' + ", key='" + this.f5262c + '\'' + ", from=" + this.f5263d + ", to=" + this.f5264e + ", urls=" + this.f5266g + '}';
        }
    }

    /* renamed from: a */
    static String m6032a(String str, String str2, List<String> list) {
        StringBuilder sb = new StringBuilder(512);
        String str3 = null;
        do {
            if (str3 != null) {
                if (list.size() == 1) {
                    return null;
                }
                list.remove(list.size() - 1);
            }
            str3 = m6033a(sb, str, str2, list);
        } while (str3.length() > 3072);
        return str3;
    }

    /* renamed from: a */
    private static String m6033a(StringBuilder sb, String str, String str2, List<String> list) {
        sb.delete(0, sb.length());
        sb.append("rk");
        sb.append("=");
        sb.append(Uri.encode(str));
        sb.append("&");
        sb.append(CampaignEx.JSON_KEY_AD_K);
        sb.append("=");
        sb.append(Uri.encode(str2));
        int size = list.size();
        for (int i = 0; i < size; i++) {
            sb.append("&");
            sb.append("u");
            sb.append(i);
            sb.append("=");
            sb.append(Uri.encode(list.get(i)));
        }
        return sb.toString();
    }

    public String toString() {
        return "Request{requestLine=" + this.f5257a + ", headers=" + this.f5258b + ", extra=" + this.f5259c + '}';
    }

    /* renamed from: com.bykv.vk.openvk.component.video.a.b.i$d */
    /* compiled from: Request */
    static final class C2477d extends Exception {
        C2477d(String str) {
            super(str);
        }
    }
}

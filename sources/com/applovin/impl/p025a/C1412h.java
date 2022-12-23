package com.applovin.impl.p025a;

import android.net.Uri;
import android.webkit.URLUtil;
import com.applovin.impl.sdk.C1959m;
import com.applovin.impl.sdk.C2092v;
import com.applovin.impl.sdk.utils.C2088r;
import com.applovin.impl.sdk.utils.StringUtils;

/* renamed from: com.applovin.impl.a.h */
public class C1412h {

    /* renamed from: a */
    private C1413a f1586a;

    /* renamed from: b */
    private Uri f1587b;

    /* renamed from: c */
    private String f1588c;

    /* renamed from: com.applovin.impl.a.h$a */
    public enum C1413a {
        UNSPECIFIED,
        STATIC,
        IFRAME,
        HTML
    }

    private C1412h() {
    }

    /* renamed from: a */
    static C1412h m2413a(C2088r rVar, C1412h hVar, C1959m mVar) {
        if (rVar == null) {
            throw new IllegalArgumentException("No node specified.");
        } else if (mVar != null) {
            if (hVar == null) {
                try {
                    hVar = new C1412h();
                } catch (Throwable th) {
                    if (!C2092v.m5047a()) {
                        return null;
                    }
                    mVar.mo14286A().mo14790b("VastNonVideoResource", "Error occurred while initializing", th);
                    return null;
                }
            }
            if (hVar.f1587b == null && !StringUtils.isValidString(hVar.f1588c)) {
                String a = m2414a(rVar, "StaticResource");
                if (URLUtil.isValidUrl(a)) {
                    hVar.f1587b = Uri.parse(a);
                    hVar.f1586a = C1413a.STATIC;
                    return hVar;
                }
                String a2 = m2414a(rVar, "IFrameResource");
                if (StringUtils.isValidString(a2)) {
                    hVar.f1586a = C1413a.IFRAME;
                    if (URLUtil.isValidUrl(a2)) {
                        hVar.f1587b = Uri.parse(a2);
                    } else {
                        hVar.f1588c = a2;
                    }
                    return hVar;
                }
                String a3 = m2414a(rVar, "HTMLResource");
                if (StringUtils.isValidString(a3)) {
                    hVar.f1586a = C1413a.HTML;
                    if (URLUtil.isValidUrl(a3)) {
                        hVar.f1587b = Uri.parse(a3);
                    } else {
                        hVar.f1588c = a3;
                    }
                }
            }
            return hVar;
        } else {
            throw new IllegalArgumentException("No sdk specified.");
        }
    }

    /* renamed from: a */
    private static String m2414a(C2088r rVar, String str) {
        C2088r b = rVar.mo14767b(str);
        if (b != null) {
            return b.mo14770c();
        }
        return null;
    }

    /* renamed from: a */
    public C1413a mo12688a() {
        return this.f1586a;
    }

    /* renamed from: a */
    public void mo12689a(Uri uri) {
        this.f1587b = uri;
    }

    /* renamed from: a */
    public void mo12690a(String str) {
        this.f1588c = str;
    }

    /* renamed from: b */
    public Uri mo12691b() {
        return this.f1587b;
    }

    /* renamed from: c */
    public String mo12692c() {
        return this.f1588c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1412h)) {
            return false;
        }
        C1412h hVar = (C1412h) obj;
        if (this.f1586a != hVar.f1586a) {
            return false;
        }
        Uri uri = this.f1587b;
        if (uri == null ? hVar.f1587b != null : !uri.equals(hVar.f1587b)) {
            return false;
        }
        String str = this.f1588c;
        String str2 = hVar.f1588c;
        return str != null ? str.equals(str2) : str2 == null;
    }

    public int hashCode() {
        C1413a aVar = this.f1586a;
        int i = 0;
        int hashCode = (aVar != null ? aVar.hashCode() : 0) * 31;
        Uri uri = this.f1587b;
        int hashCode2 = (hashCode + (uri != null ? uri.hashCode() : 0)) * 31;
        String str = this.f1588c;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        return "VastNonVideoResource{type=" + this.f1586a + ", resourceUri=" + this.f1587b + ", resourceContents='" + this.f1588c + '\'' + '}';
    }
}

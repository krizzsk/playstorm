package com.applovin.impl.p025a;

import android.net.Uri;
import android.webkit.URLUtil;
import com.applovin.impl.sdk.C1959m;
import com.applovin.impl.sdk.C2092v;
import com.applovin.impl.sdk.utils.C2088r;
import com.applovin.impl.sdk.utils.StringUtils;
import com.smaato.sdk.video.vast.model.MediaFile;
import java.util.Locale;

/* renamed from: com.applovin.impl.a.n */
public class C1421n {

    /* renamed from: a */
    private Uri f1616a;

    /* renamed from: b */
    private Uri f1617b;

    /* renamed from: c */
    private C1422a f1618c;

    /* renamed from: d */
    private String f1619d;

    /* renamed from: e */
    private int f1620e;

    /* renamed from: f */
    private int f1621f;

    /* renamed from: g */
    private int f1622g;

    /* renamed from: com.applovin.impl.a.n$a */
    public enum C1422a {
        Progressive,
        Streaming
    }

    private C1421n() {
    }

    /* renamed from: a */
    private static C1422a m2455a(String str) {
        if (StringUtils.isValidString(str)) {
            if ("progressive".equalsIgnoreCase(str)) {
                return C1422a.Progressive;
            }
            if ("streaming".equalsIgnoreCase(str)) {
                return C1422a.Streaming;
            }
        }
        return C1422a.Progressive;
    }

    /* renamed from: a */
    public static C1421n m2456a(C2088r rVar, C1959m mVar) {
        if (rVar == null) {
            throw new IllegalArgumentException("No node specified.");
        } else if (mVar != null) {
            try {
                String c = rVar.mo14770c();
                if (URLUtil.isValidUrl(c)) {
                    Uri parse = Uri.parse(c);
                    C1421n nVar = new C1421n();
                    nVar.f1616a = parse;
                    nVar.f1617b = parse;
                    nVar.f1622g = StringUtils.parseInt(rVar.mo14768b().get(MediaFile.BITRATE));
                    nVar.f1618c = m2455a(rVar.mo14768b().get(MediaFile.DELIVERY));
                    nVar.f1621f = StringUtils.parseInt(rVar.mo14768b().get("height"));
                    nVar.f1620e = StringUtils.parseInt(rVar.mo14768b().get("width"));
                    nVar.f1619d = rVar.mo14768b().get("type").toLowerCase(Locale.ENGLISH);
                    return nVar;
                } else if (!C2092v.m5047a()) {
                    return null;
                } else {
                    mVar.mo14286A().mo14793e("VastVideoFile", "Unable to create video file. Could not find URL.");
                    return null;
                }
            } catch (Throwable th) {
                if (!C2092v.m5047a()) {
                    return null;
                }
                mVar.mo14286A().mo14790b("VastVideoFile", "Error occurred while initializing", th);
                return null;
            }
        } else {
            throw new IllegalArgumentException("No sdk specified.");
        }
    }

    /* renamed from: a */
    public Uri mo12716a() {
        return this.f1616a;
    }

    /* renamed from: a */
    public void mo12717a(Uri uri) {
        this.f1617b = uri;
    }

    /* renamed from: b */
    public Uri mo12718b() {
        return this.f1617b;
    }

    /* renamed from: c */
    public String mo12719c() {
        return this.f1619d;
    }

    /* renamed from: d */
    public int mo12720d() {
        return this.f1622g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1421n)) {
            return false;
        }
        C1421n nVar = (C1421n) obj;
        if (this.f1620e != nVar.f1620e || this.f1621f != nVar.f1621f || this.f1622g != nVar.f1622g) {
            return false;
        }
        Uri uri = this.f1616a;
        if (uri == null ? nVar.f1616a != null : !uri.equals(nVar.f1616a)) {
            return false;
        }
        Uri uri2 = this.f1617b;
        if (uri2 == null ? nVar.f1617b != null : !uri2.equals(nVar.f1617b)) {
            return false;
        }
        if (this.f1618c != nVar.f1618c) {
            return false;
        }
        String str = this.f1619d;
        String str2 = nVar.f1619d;
        return str != null ? str.equals(str2) : str2 == null;
    }

    public int hashCode() {
        Uri uri = this.f1616a;
        int i = 0;
        int hashCode = (uri != null ? uri.hashCode() : 0) * 31;
        Uri uri2 = this.f1617b;
        int hashCode2 = (hashCode + (uri2 != null ? uri2.hashCode() : 0)) * 31;
        C1422a aVar = this.f1618c;
        int hashCode3 = (hashCode2 + (aVar != null ? aVar.hashCode() : 0)) * 31;
        String str = this.f1619d;
        if (str != null) {
            i = str.hashCode();
        }
        return ((((((hashCode3 + i) * 31) + this.f1620e) * 31) + this.f1621f) * 31) + this.f1622g;
    }

    public String toString() {
        return "VastVideoFile{sourceVideoUri=" + this.f1616a + ", videoUri=" + this.f1617b + ", deliveryType=" + this.f1618c + ", fileType='" + this.f1619d + '\'' + ", width=" + this.f1620e + ", height=" + this.f1621f + ", bitrate=" + this.f1622g + '}';
    }
}

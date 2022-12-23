package com.applovin.impl.sdk.nativeAd;

import android.net.Uri;
import com.amazon.aps.shared.util.APSSharedUtil;
import com.applovin.impl.sdk.C1959m;
import com.applovin.impl.sdk.C2092v;
import com.applovin.impl.sdk.p049d.C1870e;
import com.applovin.impl.sdk.p050e.C1877a;
import com.applovin.impl.sdk.utils.StringUtils;
import java.io.File;
import java.util.Collections;

/* renamed from: com.applovin.impl.sdk.nativeAd.a */
public class C1976a extends C1877a {

    /* renamed from: a */
    private final C1870e f3740a = new C1870e();

    /* renamed from: c */
    private final AppLovinNativeAdImpl f3741c;

    /* renamed from: d */
    private final C1977a f3742d;

    /* renamed from: com.applovin.impl.sdk.nativeAd.a$a */
    public interface C1977a {
        /* renamed from: a */
        void mo14463a(AppLovinNativeAdImpl appLovinNativeAdImpl);
    }

    public C1976a(AppLovinNativeAdImpl appLovinNativeAdImpl, C1959m mVar, C1977a aVar) {
        super("TaskCacheNativeAd", mVar);
        this.f3741c = appLovinNativeAdImpl;
        this.f3742d = aVar;
    }

    /* renamed from: a */
    private Uri m4525a(Uri uri) {
        String str;
        if (uri == null) {
            return null;
        }
        if (C2092v.m5047a()) {
            mo14142a("Attempting to cache resource: " + uri);
        }
        String a = this.f3467b.mo14328aa() != null ? this.f3467b.mo14328aa().mo14638a(mo14149f(), uri.toString(), this.f3741c.getCachePrefix(), Collections.emptyList(), false, this.f3740a) : this.f3467b.mo14329ab().mo14626a(mo14149f(), uri.toString(), this.f3741c.getCachePrefix(), Collections.emptyList(), false, this.f3740a);
        if (StringUtils.isValidString(a)) {
            File a2 = this.f3467b.mo14328aa() != null ? this.f3467b.mo14328aa().mo14637a(a, mo14149f()) : this.f3467b.mo14329ab().mo14624a(a, mo14149f());
            if (a2 != null) {
                Uri fromFile = Uri.fromFile(a2);
                if (fromFile != null) {
                    return fromFile;
                }
                if (C2092v.m5047a()) {
                    str = "Unable to extract Uri from image file";
                }
            } else if (C2092v.m5047a()) {
                str = "Unable to retrieve File from cached image filename = " + a;
            }
            mo14147d(str);
        }
        return null;
    }

    public void run() {
        if (C2092v.m5047a()) {
            mo14142a("Begin caching ad #" + this.f3741c.getAdIdNumber() + APSSharedUtil.TRUNCATE_SEPARATOR);
        }
        Uri a = m4525a(this.f3741c.getIconUri());
        if (a != null) {
            this.f3741c.setIconUri(a);
        }
        Uri a2 = m4525a(this.f3741c.getMainImageUri());
        if (a2 != null) {
            this.f3741c.setMainImageUri(a2);
        }
        Uri a3 = m4525a(this.f3741c.getPrivacyIconUri());
        if (a3 != null) {
            this.f3741c.setPrivacyIconUri(a3);
        }
        if (C2092v.m5047a()) {
            mo14142a("Finished caching ad #" + this.f3741c.getAdIdNumber());
        }
        this.f3742d.mo14463a(this.f3741c);
    }
}

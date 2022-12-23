package com.applovin.impl.sdk.p050e;

import android.net.Uri;
import android.os.Bundle;
import androidx.browser.trusted.sharing.ShareTarget;
import com.amazon.aps.shared.util.APSSharedUtil;
import com.applovin.impl.mediation.C1775h;
import com.applovin.impl.mediation.p028a.C1573a;
import com.applovin.impl.sdk.AppLovinAdBase;
import com.applovin.impl.sdk.C1959m;
import com.applovin.impl.sdk.C2022q;
import com.applovin.impl.sdk.C2023r;
import com.applovin.impl.sdk.C2092v;
import com.applovin.impl.sdk.network.C1985b;
import com.applovin.impl.sdk.network.C1990c;
import com.applovin.impl.sdk.p046ad.C1829e;
import com.applovin.impl.sdk.p048c.C1857b;
import com.applovin.impl.sdk.p049d.C1869d;
import com.applovin.impl.sdk.p049d.C1870e;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinErrorCodes;
import com.applovin.sdk.AppLovinSdkUtils;
import com.vungle.warren.model.Advertisement;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.text.Typography;

/* renamed from: com.applovin.impl.sdk.e.c */
public abstract class C1883c extends C1877a implements C1775h.C1776a {

    /* renamed from: a */
    protected final C1829e f3475a;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public AppLovinAdLoadListener f3476c;

    /* renamed from: d */
    private final C2022q f3477d;

    /* renamed from: e */
    private final C2023r f3478e;

    /* renamed from: f */
    private final Collection<Character> f3479f;

    /* renamed from: g */
    private final C1870e f3480g;

    /* renamed from: h */
    private boolean f3481h;

    C1883c(String str, C1829e eVar, C1959m mVar, AppLovinAdLoadListener appLovinAdLoadListener) {
        super(str, mVar);
        if (eVar != null) {
            this.f3475a = eVar;
            this.f3476c = appLovinAdLoadListener;
            this.f3477d = mVar.mo14329ab();
            this.f3478e = mVar.mo14328aa();
            this.f3479f = m4165j();
            this.f3480g = new C1870e();
            return;
        }
        throw new IllegalArgumentException("No ad specified.");
    }

    /* renamed from: a */
    private Uri m4159a(Uri uri, String str) {
        String str2;
        StringBuilder sb;
        if (uri != null) {
            String uri2 = uri.toString();
            if (StringUtils.isValidString(uri2)) {
                if (C2092v.m5047a()) {
                    mo14142a("Caching " + str + " image...");
                }
                return m4164g(uri2);
            } else if (!C2092v.m5047a()) {
                return null;
            } else {
                sb = new StringBuilder();
                sb.append("Failed to cache ");
                sb.append(str);
                str2 = " image";
            }
        } else if (!C2092v.m5047a()) {
            return null;
        } else {
            sb = new StringBuilder();
            sb.append("No ");
            sb.append(str);
            str2 = " image to cache";
        }
        sb.append(str2);
        mo14142a(sb.toString());
        return null;
    }

    /* renamed from: a */
    private Uri m4160a(String str, String str2) {
        StringBuilder sb;
        if (this.f3478e != null) {
            return m4163b(str, str2);
        }
        String replace = str2.replace("/", "_");
        String L = this.f3475a.mo13949L();
        if (StringUtils.isValidString(L)) {
            replace = L + replace;
        }
        File a = this.f3477d.mo14624a(replace, this.f3467b.mo14297L());
        if (a == null) {
            return null;
        }
        if (a.exists()) {
            this.f3480g.mo14117b(a.length());
            sb = new StringBuilder();
        } else {
            if (!this.f3477d.mo14630a(a, str + str2, (List<String>) Arrays.asList(new String[]{str}), this.f3480g)) {
                return null;
            }
            sb = new StringBuilder();
        }
        sb.append(Advertisement.FILE_SCHEME);
        sb.append(a.getAbsolutePath());
        return Uri.parse(sb.toString());
    }

    /* renamed from: b */
    private Uri m4163b(String str, String str2) {
        StringBuilder sb;
        String replace = str2.replace("/", "_");
        String L = this.f3475a.mo13949L();
        if (StringUtils.isValidString(L)) {
            replace = L + replace;
        }
        File a = this.f3478e.mo14637a(replace, this.f3467b.mo14297L());
        if (a == null) {
            return null;
        }
        if (a.exists()) {
            this.f3480g.mo14117b(a.length());
            sb = new StringBuilder();
        } else {
            if (!this.f3478e.mo14641a(a, str + str2, (List<String>) Arrays.asList(new String[]{str}), this.f3480g)) {
                return null;
            }
            sb = new StringBuilder();
        }
        sb.append(Advertisement.FILE_SCHEME);
        sb.append(a.getAbsolutePath());
        return Uri.parse(sb.toString());
    }

    /* renamed from: g */
    private Uri m4164g(String str) {
        return mo14166c(str, this.f3475a.mo13945H(), true);
    }

    /* renamed from: j */
    private Collection<Character> m4165j() {
        HashSet hashSet = new HashSet();
        for (char valueOf : ((String) this.f3467b.mo14311a(C1857b.f3162bm)).toCharArray()) {
            hashSet.add(Character.valueOf(valueOf));
        }
        hashSet.add(Character.valueOf(Typography.quote));
        return hashSet;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public Uri mo14158a(String str, List<String> list, boolean z) {
        String str2;
        if (this.f3478e != null) {
            return mo14163b(str, list, z);
        }
        if (!StringUtils.isValidString(str)) {
            return null;
        }
        if (C2092v.m5047a()) {
            mo14142a("Caching video " + str + APSSharedUtil.TRUNCATE_SEPARATOR);
        }
        String a = this.f3477d.mo14626a(mo14149f(), str, this.f3475a.mo13949L(), list, z, this.f3480g);
        if (StringUtils.isValidString(a)) {
            File a2 = this.f3477d.mo14624a(a, mo14149f());
            if (a2 != null) {
                Uri fromFile = Uri.fromFile(a2);
                if (fromFile != null) {
                    if (C2092v.m5047a()) {
                        mo14142a("Finish caching video for ad #" + this.f3475a.getAdIdNumber() + ". Updating ad with cachedVideoFilename = " + a);
                    }
                    return fromFile;
                } else if (!C2092v.m5047a()) {
                    return null;
                } else {
                    str2 = "Unable to create URI from cached video file = " + a2;
                }
            } else if (!C2092v.m5047a()) {
                return null;
            } else {
                str2 = "Unable to cache video = " + str + "Video file was missing or null";
            }
            mo14147d(str2);
            return null;
        }
        if (C2092v.m5047a()) {
            mo14147d("Failed to cache video");
        }
        mo14171h();
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public String mo14159a(String str, List<String> list) {
        InputStream inputStream;
        if (this.f3478e != null) {
            return mo14164b(str, list);
        }
        if (StringUtils.isValidString(str)) {
            Uri parse = Uri.parse(str);
            if (parse == null) {
                if (C2092v.m5047a()) {
                    mo14142a("Nothing to cache, skipping...");
                }
                return null;
            }
            String fileName = ((Boolean) this.f3467b.mo14311a(C1857b.f3299eT)).booleanValue() ? Utils.getFileName(parse) : parse.getLastPathSegment();
            if (StringUtils.isValidString(this.f3475a.mo13949L())) {
                fileName = this.f3475a.mo13949L() + fileName;
            }
            try {
                File a = this.f3477d.mo14624a(fileName, mo14149f());
                if (a != null && a.exists()) {
                    return this.f3477d.mo14628a(a);
                }
                inputStream = this.f3477d.mo14625a(str, list, true, this.f3480g);
                if (inputStream != null) {
                    try {
                        this.f3477d.mo14633b(inputStream, a);
                    } catch (Throwable th) {
                        th = th;
                    }
                }
                Utils.close(inputStream, this.f3467b);
                return this.f3477d.mo14628a(a);
            } catch (Throwable th2) {
                if (C2092v.m5047a()) {
                    mo14143a("Resource at " + str + " failed to load.", th2);
                }
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public String mo14160a(String str, List<String> list, C1829e eVar) {
        StringBuilder sb;
        if (!StringUtils.isValidString(str)) {
            return str;
        }
        if (!((Boolean) this.f3467b.mo14311a(C1857b.f3163bn)).booleanValue()) {
            if (C2092v.m5047a()) {
                mo14142a("Resource caching is disabled, skipping cache...");
            }
            return str;
        }
        StringBuilder sb2 = new StringBuilder(str);
        boolean shouldCancelHtmlCachingIfShown = eVar.shouldCancelHtmlCachingIfShown();
        boolean aK = eVar.mo13979aK();
        List<String> G = eVar.mo13944G();
        for (String next : list) {
            int i = 0;
            int i2 = 0;
            while (i < sb2.length()) {
                if (mo14165b()) {
                    return str;
                }
                i = sb2.indexOf(next, i2);
                if (i == -1) {
                    continue;
                    break;
                }
                int length = sb2.length();
                int i3 = i;
                while (!this.f3479f.contains(Character.valueOf(sb2.charAt(i3))) && i3 < length) {
                    i3++;
                }
                if (i3 <= i || i3 == length) {
                    if (C2092v.m5047a()) {
                        mo14147d("Unable to cache resource; ad HTML is invalid.");
                    }
                    return str;
                }
                String substring = sb2.substring(next.length() + i, i3);
                if (StringUtils.isValidString(substring)) {
                    if (!shouldCancelHtmlCachingIfShown || !eVar.hasShown()) {
                        if (aK) {
                            if (eVar.mo12623d().equals(next + substring)) {
                                if (C2092v.m5047a()) {
                                    sb = new StringBuilder();
                                    sb.append("Postponing caching for \"");
                                    sb.append(substring);
                                    substring = "\" video resource";
                                } else {
                                    i2 = i3;
                                }
                            }
                        }
                        Uri a = m4160a(next, substring);
                        if (a != null) {
                            sb2.replace(i, i3, a.toString());
                            eVar.mo14006b(a);
                            this.f3480g.mo14121e();
                        } else {
                            if (G.contains(next + substring)) {
                                mo14171h();
                                this.f3481h = true;
                            }
                            this.f3480g.mo14122f();
                        }
                        i2 = i3;
                    } else {
                        if (C2092v.m5047a()) {
                            mo14142a("Cancelling HTML caching due to ad being shown already");
                        }
                        this.f3480g.mo14113a();
                        return str;
                    }
                } else if (C2092v.m5047a()) {
                    sb = new StringBuilder();
                    sb.append("Skip caching of non-resource ");
                } else {
                    i2 = i3;
                }
                sb.append(substring);
                mo14142a(sb.toString());
                i2 = i3;
            }
        }
        return sb2.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo14161a() {
        this.f3467b.mo14293H().mo13719b(this);
    }

    /* renamed from: a */
    public void mo13720a(C1573a aVar) {
        if (aVar.mo13142f().equalsIgnoreCase(this.f3475a.mo13951N())) {
            if (C2092v.m5047a()) {
                mo14147d("Updating flag for timeout...");
            }
            this.f3481h = true;
        }
        this.f3467b.mo14293H().mo13719b(this);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo14162a(AppLovinAdBase appLovinAdBase) {
        C1869d.m4084a(this.f3480g, appLovinAdBase, this.f3467b);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public Uri mo14163b(String str, List<String> list, boolean z) {
        String str2;
        if (!StringUtils.isValidString(str)) {
            return null;
        }
        mo14142a("Caching video " + str + APSSharedUtil.TRUNCATE_SEPARATOR);
        String a = this.f3478e.mo14638a(mo14149f(), str, this.f3475a.mo13949L(), list, z, this.f3480g);
        if (StringUtils.isValidString(a)) {
            File a2 = this.f3478e.mo14637a(a, mo14149f());
            if (a2 != null) {
                Uri fromFile = Uri.fromFile(a2);
                if (fromFile != null) {
                    mo14142a("Finish caching video for ad #" + this.f3475a.getAdIdNumber() + ". Updating ad with cachedVideoFilename = " + a);
                    return fromFile;
                }
                str2 = "Unable to create URI from cached video file = " + a2;
            } else {
                str2 = "Unable to cache video = " + str + "Video file was missing or null";
            }
            mo14147d(str2);
            return null;
        }
        mo14147d("Failed to cache video");
        mo14171h();
        Bundle bundle = new Bundle();
        bundle.putLong("ad_id", this.f3475a.getAdIdNumber());
        bundle.putInt("load_response_code", this.f3480g.mo14126j());
        Exception i = this.f3480g.mo14125i();
        if (i != null) {
            bundle.putString("load_exception_message", i.getMessage());
        }
        this.f3467b.mo14334ag().mo14257a(bundle, "video_caching_failed");
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public String mo14164b(String str, List<String> list) {
        if (StringUtils.isValidString(str)) {
            Uri parse = Uri.parse(str);
            if (parse == null) {
                mo14142a("Nothing to cache, skipping...");
                return null;
            }
            String fileName = ((Boolean) this.f3467b.mo14311a(C1857b.f3299eT)).booleanValue() ? Utils.getFileName(parse) : parse.getLastPathSegment();
            if (StringUtils.isValidString(this.f3475a.mo13949L())) {
                fileName = this.f3475a.mo13949L() + fileName;
            }
            File a = this.f3478e.mo14637a(fileName, mo14149f());
            ByteArrayOutputStream a2 = (a == null || !a.exists()) ? null : this.f3478e.mo14635a(a);
            if (a2 == null) {
                a2 = this.f3478e.mo14636a(str, list, true, this.f3480g);
                if (a2 != null) {
                    this.f3478e.mo14640a(a2, a);
                    this.f3480g.mo14115a((long) a2.size());
                }
            } else {
                this.f3480g.mo14117b((long) a2.size());
            }
            try {
                return a2.toString("UTF-8");
            } catch (UnsupportedEncodingException e) {
                mo14143a("UTF-8 encoding not supported.", e);
            } catch (Throwable th) {
                mo14143a("String resource at " + str + " failed to load.", th);
                return null;
            }
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public boolean mo14165b() {
        return this.f3481h;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public Uri mo14166c(String str, List<String> list, boolean z) {
        String str2;
        if (this.f3478e != null) {
            return mo14168d(str, list, z);
        }
        try {
            String a = this.f3477d.mo14626a(mo14149f(), str, this.f3475a.mo13949L(), list, z, this.f3480g);
            if (!StringUtils.isValidString(a)) {
                return null;
            }
            File a2 = this.f3477d.mo14624a(a, mo14149f());
            if (a2 != null) {
                Uri fromFile = Uri.fromFile(a2);
                if (fromFile != null) {
                    return fromFile;
                }
                if (!C2092v.m5047a()) {
                    return null;
                }
                str2 = "Unable to extract Uri from image file";
            } else if (!C2092v.m5047a()) {
                return null;
            } else {
                str2 = "Unable to retrieve File from cached image filename = " + a;
            }
            mo14147d(str2);
            return null;
        } catch (Throwable th) {
            if (!C2092v.m5047a()) {
                return null;
            }
            mo14143a("Failed to cache image at url = " + str, th);
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo14167c() {
        if (C2092v.m5047a()) {
            mo14142a("Caching mute images...");
        }
        Uri a = m4159a(this.f3475a.mo13971aC(), "mute");
        if (a != null) {
            this.f3475a.mo14007c(a);
        }
        Uri a2 = m4159a(this.f3475a.mo13972aD(), "unmute");
        if (a2 != null) {
            this.f3475a.mo14008d(a2);
        }
        if (C2092v.m5047a()) {
            mo14142a("Ad updated with muteImageFilename = " + this.f3475a.mo13971aC() + ", unmuteImageFilename = " + this.f3475a.mo13972aD());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public Uri mo14168d(String str, List<String> list, boolean z) {
        String str2;
        try {
            String a = this.f3478e.mo14638a(mo14149f(), str, this.f3475a.mo13949L(), list, z, this.f3480g);
            if (!StringUtils.isValidString(a)) {
                return null;
            }
            File a2 = this.f3478e.mo14637a(a, mo14149f());
            if (a2 != null) {
                Uri fromFile = Uri.fromFile(a2);
                if (fromFile != null) {
                    return fromFile;
                }
                str2 = "Unable to extract Uri from image file";
            } else {
                str2 = "Unable to retrieve File from cached image filename = " + a;
            }
            mo14147d(str2);
            return null;
        } catch (Throwable th) {
            mo14143a("Failed to cache image at url = " + str, th);
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public Uri mo14169e(String str) {
        return mo14158a(str, this.f3475a.mo13945H(), true);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public String mo14170f(final String str) {
        if (!StringUtils.isValidString(str)) {
            return null;
        }
        C1990c a = C1990c.m4570a(this.f3467b).mo14501a(str).mo14507b(ShareTarget.METHOD_GET).mo14500a("").mo14499a(0).mo14505a();
        final AtomicReference atomicReference = new AtomicReference((Object) null);
        this.f3467b.mo14302R().mo14474a(a, new C1985b.C1987a(), new C1985b.C1989c<String>() {
            /* renamed from: a */
            public void mo13362a(int i, String str, String str2) {
                C1883c cVar = C1883c.this;
                cVar.mo14147d("Failed to load resource from '" + str + "'");
            }

            /* renamed from: a */
            public void mo13364a(String str, int i) {
                atomicReference.set(str);
            }
        });
        String str2 = (String) atomicReference.get();
        if (str2 != null) {
            this.f3480g.mo14115a((long) str2.length());
        }
        return str2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo14171h() {
        AppLovinAdLoadListener appLovinAdLoadListener = this.f3476c;
        if (appLovinAdLoadListener != null) {
            appLovinAdLoadListener.failedToReceiveAd(AppLovinErrorCodes.UNABLE_TO_PRECACHE_VIDEO_RESOURCES);
            this.f3476c = null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public void mo14172i() {
        if (C2092v.m5047a()) {
            mo14142a("Rendered new ad:" + this.f3475a);
        }
        AppLovinSdkUtils.runOnUiThread(new Runnable() {
            public void run() {
                if (C1883c.this.f3476c != null) {
                    C1883c.this.f3476c.adReceived(C1883c.this.f3475a);
                    AppLovinAdLoadListener unused = C1883c.this.f3476c = null;
                }
            }
        });
    }

    public void run() {
        if (this.f3475a.mo13950M()) {
            if (C2092v.m5047a()) {
                mo14142a("Subscribing to timeout events...");
            }
            this.f3467b.mo14293H().mo13718a((C1775h.C1776a) this);
        }
    }
}

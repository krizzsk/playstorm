package com.applovin.impl.sdk.nativeAd;

import android.net.Uri;
import android.text.TextUtils;
import android.webkit.URLUtil;
import com.amazon.aps.shared.util.APSSharedUtil;
import com.applovin.impl.p025a.C1401a;
import com.applovin.impl.sdk.C1959m;
import com.applovin.impl.sdk.C2092v;
import com.applovin.impl.sdk.nativeAd.AppLovinNativeAdImpl;
import com.applovin.impl.sdk.nativeAd.C1976a;
import com.applovin.impl.sdk.network.C2010i;
import com.applovin.impl.sdk.p046ad.C1825b;
import com.applovin.impl.sdk.p050e.C1877a;
import com.applovin.impl.sdk.p050e.C1908o;
import com.applovin.impl.sdk.p050e.C1918r;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.sdk.nativeAd.e */
public class C1981e extends C1877a implements C1976a.C1977a, AppLovinAdLoadListener {

    /* renamed from: a */
    private final JSONObject f3747a;

    /* renamed from: c */
    private final JSONObject f3748c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final AppLovinNativeAdLoadListener f3749d;

    /* renamed from: e */
    private String f3750e = "";

    /* renamed from: f */
    private String f3751f = "";

    /* renamed from: g */
    private String f3752g = "";

    /* renamed from: h */
    private String f3753h = "";

    /* renamed from: i */
    private Uri f3754i = null;

    /* renamed from: j */
    private Uri f3755j = null;

    /* renamed from: k */
    private Uri f3756k = null;

    /* renamed from: l */
    private Uri f3757l = null;

    /* renamed from: m */
    private C1401a f3758m;

    /* renamed from: n */
    private Uri f3759n = null;

    /* renamed from: o */
    private Uri f3760o = null;

    /* renamed from: p */
    private final List<String> f3761p = new ArrayList();

    /* renamed from: q */
    private String f3762q;

    /* renamed from: r */
    private final List<C2010i> f3763r = new ArrayList();

    /* renamed from: s */
    private final List<C2010i> f3764s = new ArrayList();

    /* renamed from: t */
    private final List<C2010i> f3765t = new ArrayList();

    /* renamed from: u */
    private final List<C2010i> f3766u = new ArrayList();

    public C1981e(JSONObject jSONObject, JSONObject jSONObject2, AppLovinNativeAdLoadListener appLovinNativeAdLoadListener, C1959m mVar) {
        super("TaskRenderNativeAd", mVar);
        this.f3747a = jSONObject;
        this.f3748c = jSONObject2;
        this.f3749d = appLovinNativeAdLoadListener;
    }

    /* renamed from: a */
    private void m4532a() {
        AppLovinNativeAdImpl build = new AppLovinNativeAdImpl.Builder(JsonUtils.shallowCopy(this.f3747a), JsonUtils.shallowCopy(this.f3748c), this.f3467b).setTitle(this.f3750e).setAdvertiser(this.f3751f).setBody(this.f3752g).setCallToAction(this.f3753h).setIconUri(this.f3754i).setMainImageUri(this.f3755j).setPrivacyIconUri(this.f3756k).setVastAd(this.f3758m).setPrivacyDestinationUri(this.f3757l).setClickDestinationUri(this.f3759n).setClickDestinationBackupUri(this.f3760o).setClickTrackingUrls(this.f3761p).setJsTracker(this.f3762q).setImpressionRequests(this.f3763r).setViewableMRC50Requests(this.f3764s).setViewableMRC100Requests(this.f3765t).setViewableVideo50Requests(this.f3766u).build();
        build.getAdEventTracker().mo13843b();
        if (C2092v.m5047a()) {
            mo14142a("Starting cache task for type: " + build.getType() + APSSharedUtil.TRUNCATE_SEPARATOR);
        }
        this.f3467b.mo14303S().mo14206a((C1877a) new C1976a(build, this.f3467b, this), C1908o.C1910a.MAIN);
    }

    /* renamed from: a */
    private void m4536a(JSONObject jSONObject) {
        if (jSONObject != null) {
            String string = JsonUtils.getString(jSONObject, "url", (String) null);
            if (StringUtils.isValidString(string)) {
                this.f3759n = Uri.parse(string);
                if (C2092v.m5047a()) {
                    mo14142a("Processed click destination URL: " + this.f3759n);
                }
            }
            String string2 = JsonUtils.getString(jSONObject, "fallback", (String) null);
            if (StringUtils.isValidString(string2)) {
                this.f3760o = Uri.parse(string2);
                if (C2092v.m5047a()) {
                    mo14142a("Processed click destination backup URL: " + this.f3760o);
                }
            }
            JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, "clicktrackers", (JSONArray) null);
            if (jSONArray != null) {
                try {
                    this.f3761p.addAll(JsonUtils.toList(jSONArray));
                    if (C2092v.m5047a()) {
                        mo14142a("Processed click tracking URLs: " + this.f3761p);
                    }
                } catch (Throwable th) {
                    if (C2092v.m5047a()) {
                        mo14143a("Failed to render click tracking URLs", th);
                    }
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m4538b() {
        this.f3749d.onNativeAdLoadFailed(-6);
    }

    /* renamed from: b */
    private void m4539b(final AppLovinNativeAdImpl appLovinNativeAdImpl) {
        AppLovinSdkUtils.runOnUiThread(new Runnable() {
            public void run() {
                if (C2092v.m5047a()) {
                    C1981e.this.mo14142a("Preparing native ad view components...");
                }
                try {
                    appLovinNativeAdImpl.setUpNativeAdViewComponents();
                    if (C2092v.m5047a()) {
                        C1981e.this.mo14142a("Successfully prepared native ad view components");
                    }
                    appLovinNativeAdImpl.getAdEventTracker().mo13845c();
                    C1981e.this.f3749d.onNativeAdLoaded(appLovinNativeAdImpl);
                } catch (Throwable th) {
                    if (C2092v.m5047a()) {
                        C1981e.this.mo14143a("Failed to prepare native ad view components", th);
                    }
                    C1981e.this.m4538b();
                }
            }
        });
    }

    /* renamed from: a */
    public void mo14463a(AppLovinNativeAdImpl appLovinNativeAdImpl) {
        if (C2092v.m5047a()) {
            mo14142a("Successfully cached and loaded ad");
        }
        m4539b(appLovinNativeAdImpl);
    }

    public void adReceived(AppLovinAd appLovinAd) {
        if (C2092v.m5047a()) {
            mo14142a("VAST ad rendered successfully");
        }
        this.f3758m = (C1401a) appLovinAd;
        m4532a();
    }

    public void failedToReceiveAd(int i) {
        if (C2092v.m5047a()) {
            mo14147d("VAST ad failed to render");
        }
        m4532a();
    }

    public void run() {
        StringBuilder sb;
        String str;
        StringBuilder sb2;
        String str2;
        StringBuilder sb3;
        String str3;
        String sb4;
        String str4;
        Uri uri;
        StringBuilder sb5;
        String string = JsonUtils.getString(this.f3747a, "privacy_icon_url", (String) null);
        if (URLUtil.isValidUrl(string)) {
            this.f3756k = Uri.parse(string);
        }
        String string2 = JsonUtils.getString(this.f3747a, "privacy_url", (String) null);
        if (!URLUtil.isValidUrl(string2)) {
            string2 = "https://www.applovin.com/privacy/";
        }
        this.f3757l = Uri.parse(string2);
        JSONObject jSONObject = JsonUtils.getJSONObject(this.f3747a, "ortb_response", (JSONObject) null);
        if (jSONObject == null || jSONObject.length() == 0) {
            if (C2092v.m5047a()) {
                mo14147d("No oRtb response provided: " + this.f3747a);
            }
            m4538b();
            return;
        }
        String string3 = JsonUtils.getString(jSONObject, "version", (String) null);
        JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONObject, "value", (JSONObject) null);
        if (C2092v.m5047a()) {
            mo14142a("Rendering native ad for oRTB version: " + string3);
        }
        JSONObject jSONObject3 = JsonUtils.getJSONObject(jSONObject2, "native", jSONObject2);
        m4536a(JsonUtils.getJSONObject(jSONObject3, "link", (JSONObject) null));
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject3, "assets", (JSONArray) null);
        if (jSONArray == null || jSONArray.length() == 0) {
            if (C2092v.m5047a()) {
                mo14147d("Unable to retrieve assets - failing ad load: " + this.f3747a);
            }
            m4538b();
            return;
        }
        String str5 = "";
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject4 = JsonUtils.getJSONObject(jSONArray, i, (JSONObject) null);
            if (jSONObject4.has("title")) {
                this.f3750e = JsonUtils.getString(JsonUtils.getJSONObject(jSONObject4, "title", (JSONObject) null), "text", (String) null);
                if (C2092v.m5047a()) {
                    sb2 = new StringBuilder();
                    sb2.append("Processed title: ");
                    str2 = this.f3750e;
                }
            } else {
                if (jSONObject4.has("link")) {
                    m4536a(JsonUtils.getJSONObject(jSONObject4, "link", (JSONObject) null));
                } else {
                    if (jSONObject4.has("img")) {
                        int i2 = JsonUtils.getInt(jSONObject4, "id", -1);
                        JSONObject jSONObject5 = JsonUtils.getJSONObject(jSONObject4, "img", (JSONObject) null);
                        int i3 = JsonUtils.getInt(jSONObject5, "type", -1);
                        String string4 = JsonUtils.getString(jSONObject5, "url", (String) null);
                        if (i3 == 1 || 3 == i2) {
                            this.f3754i = Uri.parse(string4);
                            if (C2092v.m5047a()) {
                                sb5 = new StringBuilder();
                                sb5.append("Processed icon URL: ");
                                uri = this.f3754i;
                            }
                        } else if (i3 == 3 || 2 == i2) {
                            this.f3755j = Uri.parse(string4);
                            if (C2092v.m5047a()) {
                                sb5 = new StringBuilder();
                                sb5.append("Processed main image URL: ");
                                uri = this.f3755j;
                            }
                        } else {
                            if (C2092v.m5047a()) {
                                mo14145c("Unrecognized image: " + jSONObject4);
                            }
                            int i4 = JsonUtils.getInt(jSONObject5, "w", -1);
                            int i5 = JsonUtils.getInt(jSONObject5, "h", -1);
                            if (i4 <= 0 || i5 <= 0) {
                                if (C2092v.m5047a()) {
                                    sb4 = "Skipping...";
                                }
                            } else if (((double) (((float) i4) / ((float) i5))) > 1.0d) {
                                if (C2092v.m5047a()) {
                                    mo14142a("Inferring main image from " + i4 + "x" + i5 + APSSharedUtil.TRUNCATE_SEPARATOR);
                                }
                                this.f3755j = Uri.parse(string4);
                            } else {
                                if (C2092v.m5047a()) {
                                    mo14142a("Inferring icon image from " + i4 + "x" + i5 + APSSharedUtil.TRUNCATE_SEPARATOR);
                                }
                                this.f3754i = Uri.parse(string4);
                            }
                        }
                        sb5.append(uri);
                        str4 = sb5.toString();
                        mo14142a(str4);
                    } else {
                        if (jSONObject4.has("video")) {
                            str5 = JsonUtils.getString(JsonUtils.getJSONObject(jSONObject4, "video", (JSONObject) null), "vasttag", (String) null);
                            if (StringUtils.isValidString(str5)) {
                                if (C2092v.m5047a()) {
                                    str4 = "Processed VAST video";
                                    mo14142a(str4);
                                }
                            } else if (C2092v.m5047a()) {
                                sb3 = new StringBuilder();
                                str3 = "Ignoring invalid \"vasttag\" for video: ";
                            }
                        } else if (jSONObject4.has("data")) {
                            int i6 = JsonUtils.getInt(jSONObject4, "id", -1);
                            JSONObject jSONObject6 = JsonUtils.getJSONObject(jSONObject4, "data", (JSONObject) null);
                            int i7 = JsonUtils.getInt(jSONObject6, "type", -1);
                            String string5 = JsonUtils.getString(jSONObject6, "value", (String) null);
                            if (i7 == 1 || i6 == 8) {
                                this.f3751f = string5;
                                if (C2092v.m5047a()) {
                                    sb2 = new StringBuilder();
                                    sb2.append("Processed advertiser: ");
                                    str2 = this.f3751f;
                                }
                            } else if (i7 == 2 || i6 == 4) {
                                this.f3752g = string5;
                                if (C2092v.m5047a()) {
                                    sb2 = new StringBuilder();
                                    sb2.append("Processed body: ");
                                    str2 = this.f3752g;
                                }
                            } else if (i7 == 12 || i6 == 5) {
                                this.f3753h = string5;
                                if (C2092v.m5047a()) {
                                    sb2 = new StringBuilder();
                                    sb2.append("Processed cta: ");
                                    str2 = this.f3753h;
                                }
                            } else if (C2092v.m5047a()) {
                                sb3 = new StringBuilder();
                                str3 = "Skipping unsupported data: ";
                            }
                        } else if (C2092v.m5047a()) {
                            mo14147d("Unsupported asset object: " + jSONObject4);
                        }
                        sb3.append(str3);
                        sb3.append(jSONObject4);
                        sb4 = sb3.toString();
                    }
                    mo14145c(sb4);
                }
            }
            sb5.append(str2);
            str4 = sb5.toString();
            mo14142a(str4);
        }
        String string6 = JsonUtils.getString(jSONObject3, "jstracker", (String) null);
        if (StringUtils.isValidString(string6)) {
            this.f3762q = string6;
            mo14142a("Processed jstracker: " + string6);
        }
        JSONArray jSONArray2 = JsonUtils.getJSONArray(jSONObject3, "imptrackers", (JSONArray) null);
        if (jSONArray2 != null) {
            for (int i8 = 0; i8 < jSONArray2.length(); i8++) {
                Object objectAtIndex = JsonUtils.getObjectAtIndex(jSONArray2, i8, (Object) null);
                if (objectAtIndex instanceof String) {
                    String str6 = (String) objectAtIndex;
                    if (!TextUtils.isEmpty(str6)) {
                        this.f3763r.add(new C2010i.C2011a(this.f3467b).mo14501a(str6).mo14513d(false).mo14512c(false).mo14505a());
                        if (C2092v.m5047a()) {
                            mo14142a("Processed imptracker URL: " + str6);
                        }
                    }
                }
            }
        }
        JSONArray jSONArray3 = JsonUtils.getJSONArray(jSONObject3, "eventtrackers", (JSONArray) null);
        if (jSONArray3 != null) {
            for (int i9 = 0; i9 < jSONArray3.length(); i9++) {
                JSONObject jSONObject7 = JsonUtils.getJSONObject(jSONArray3, i9, (JSONObject) null);
                int i10 = JsonUtils.getInt(jSONObject7, "event", -1);
                int i11 = JsonUtils.getInt(jSONObject7, "method", -1);
                String string7 = JsonUtils.getString(jSONObject7, "url", (String) null);
                if (!TextUtils.isEmpty(string7)) {
                    if (i11 == 1 || i11 == 2) {
                        C2010i b = new C2010i.C2011a(this.f3467b).mo14501a(string7).mo14513d(false).mo14512c(false).mo14596g(i11 == 2).mo14505a();
                        if (i10 == 1) {
                            this.f3763r.add(b);
                            if (C2092v.m5047a()) {
                                mo14142a("Processed impression URL: " + string7);
                            }
                        } else {
                            if (i10 == 2) {
                                this.f3764s.add(b);
                                if (C2092v.m5047a()) {
                                    sb = new StringBuilder();
                                    str = "Processed viewable MRC50 URL: ";
                                }
                            } else if (i10 == 3) {
                                this.f3765t.add(b);
                                if (C2092v.m5047a()) {
                                    sb = new StringBuilder();
                                    str = "Processed viewable MRC100 URL: ";
                                }
                            } else {
                                if (i10 == 4) {
                                    this.f3766u.add(b);
                                    if (C2092v.m5047a()) {
                                        mo14142a("Processed viewable video 50 URL: " + string7);
                                    }
                                } else if (C2092v.m5047a()) {
                                    mo14147d("Unsupported event tracker: " + jSONObject7);
                                }
                            }
                            sb.append(str);
                            sb.append(string7);
                            mo14142a(sb.toString());
                        }
                    } else if (C2092v.m5047a()) {
                        mo14147d("Unsupported method for event tracker: " + jSONObject7);
                    }
                }
            }
        }
        if (StringUtils.isValidString(str5)) {
            if (C2092v.m5047a()) {
                mo14142a("Processing VAST video...");
            }
            this.f3467b.mo14303S().mo14205a((C1877a) C1918r.m4274a(str5, JsonUtils.shallowCopy(this.f3747a), JsonUtils.shallowCopy(this.f3748c), C1825b.UNKNOWN, this, this.f3467b));
            return;
        }
        m4532a();
    }
}

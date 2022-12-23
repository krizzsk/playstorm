package com.inmobi.media;

import android.text.TextUtils;
import com.inmobi.ads.AdMetaInfo;
import com.smaato.sdk.video.vast.model.StaticResource;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.inmobi.media.au */
/* compiled from: Ad */
public class C5838au {
    public static final String CLICK_BEACON = "click";
    private static final boolean DEFAULT_ALLOW_AUTO_REDIRECTION = false;
    public static final String IMPRESSION_BEACON = "impression";
    private static final long INVALID_AD_EXPIRY = -1;
    public static final String LOAD_AD_TOKEN_URL = "load_ad_token_url";
    public static final String LOAD_AD_TOKEN_URL_FAILURE = "load_ad_token_url_failure";
    private static final String TAG = C5838au.class.getSimpleName();
    public static final String WIN_BEACON = "win_beacon";
    private String adAuctionMeta;
    private boolean allowAutoRedirection;
    private boolean applyBitmap;
    JSONArray assetUrls;
    private boolean canLoadBeforeShow;
    String impressionId;
    private JSONArray landingPageParams;
    JSONObject mAdContent;
    String mAdType;
    long mExpiryDurationInMillis;
    long mInsertionTimestampInMillis;
    boolean mIsPreloadWebView;
    private String mWebVast;
    String markupType;
    private JSONObject metaInfo;
    private String pubContent;
    private JSONArray trackers;
    JSONObject transaction;

    public C5838au() {
        this.markupType = "unknown";
        this.mWebVast = "";
        this.adAuctionMeta = null;
        this.impressionId = "";
        this.canLoadBeforeShow = true;
        this.pubContent = "";
        this.applyBitmap = false;
        this.trackers = null;
        this.allowAutoRedirection = false;
        this.mInsertionTimestampInMillis = System.currentTimeMillis();
    }

    C5838au(C5838au auVar, JSONArray jSONArray) {
        this.markupType = "unknown";
        this.mWebVast = "";
        this.adAuctionMeta = null;
        this.impressionId = "";
        this.canLoadBeforeShow = true;
        this.pubContent = "";
        this.applyBitmap = false;
        this.trackers = null;
        this.allowAutoRedirection = false;
        C6262ij.m18715a((Object) auVar, (Object) this);
        this.assetUrls = jSONArray;
    }

    /* renamed from: a */
    public final String mo34723a() {
        return this.mAdType;
    }

    /* renamed from: b */
    public final JSONObject mo34727b() {
        return this.mAdContent;
    }

    /* renamed from: c */
    public String mo34729c() {
        return this.mWebVast;
    }

    /* renamed from: d */
    public boolean mo34731d() {
        return this.mIsPreloadWebView;
    }

    /* renamed from: e */
    public boolean mo34732e() {
        return this.allowAutoRedirection;
    }

    /* renamed from: f */
    public final String mo34733f() {
        return this.impressionId;
    }

    /* renamed from: g */
    public AdMetaInfo mo34734g() {
        return new AdMetaInfo(mo34747t(), this.transaction);
    }

    /* renamed from: w */
    private long m17400w() {
        long j = this.mExpiryDurationInMillis;
        if (j == -1) {
            return -1;
        }
        return this.mInsertionTimestampInMillis + j;
    }

    /* renamed from: a */
    public boolean mo34726a(long j) {
        long j2;
        if (m17400w() == -1) {
            j2 = (this.mInsertionTimestampInMillis + TimeUnit.SECONDS.toMillis(j)) - System.currentTimeMillis();
        } else {
            j2 = m17400w() - System.currentTimeMillis();
        }
        return j2 < 0;
    }

    /* renamed from: h */
    public final Set<C5895bn> mo34735h() {
        HashSet hashSet = new HashSet();
        try {
            if (this.assetUrls != null) {
                for (int i = 0; i < this.assetUrls.length(); i++) {
                    JSONObject jSONObject = new JSONObject(this.assetUrls.getString(i));
                    byte b = (byte) jSONObject.getInt("type");
                    String optString = jSONObject.optString("url");
                    if (!TextUtils.isEmpty(optString)) {
                        hashSet.add(new C5895bn(b, optString));
                    }
                }
            }
            return hashSet;
        } catch (JSONException e) {
            C6181gg.m18398a().mo35357a(new C6217hg(e));
            return hashSet;
        }
    }

    /* renamed from: i */
    public final String mo34736i() {
        return this.markupType;
    }

    /* renamed from: a */
    public void mo34724a(String str) {
        this.mWebVast = str;
    }

    /* renamed from: j */
    public String mo34737j() {
        return this.pubContent;
    }

    /* renamed from: b */
    public void mo34728b(String str) throws JSONException {
        if ("inmobiJson".equals(mo34736i())) {
            this.mAdContent.put("pubContent", new JSONObject(str));
        } else {
            this.mAdContent.put("pubContent", str);
        }
        this.pubContent = str;
    }

    /* renamed from: k */
    public boolean mo34738k() {
        return this.canLoadBeforeShow;
    }

    /* renamed from: l */
    public JSONObject mo34739l() {
        return this.transaction;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo34725a(JSONObject jSONObject) throws JSONException {
        if (jSONObject != null) {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                this.pubContent = this.pubContent.replace(next, jSONObject.getString(next));
            }
        }
        mo34728b(this.pubContent);
    }

    /* renamed from: m */
    public JSONArray mo34740m() {
        return this.mAdContent.optJSONArray("trackingEvents");
    }

    /* renamed from: n */
    public String mo34741n() {
        return this.mAdContent.optString("baseEventUrl", (String) null);
    }

    /* renamed from: o */
    public Long mo34742o() {
        try {
            if (this.mAdContent.has("asPlcId")) {
                return Long.valueOf(this.mAdContent.getLong("asPlcId"));
            }
            return null;
        } catch (JSONException e) {
            C6181gg.m18398a().mo35357a(new C6217hg(e));
            return null;
        }
    }

    /* renamed from: p */
    public long mo34743p() {
        return this.mAdContent.optLong("lineItemId", Long.MIN_VALUE);
    }

    /* renamed from: q */
    public String mo34744q() {
        return this.adAuctionMeta;
    }

    /* renamed from: r */
    public boolean mo34745r() {
        return this.applyBitmap;
    }

    /* renamed from: b */
    public static Map<String, String> m17399b(JSONObject jSONObject) throws JSONException {
        if (!jSONObject.has("rewards")) {
            return null;
        }
        HashMap hashMap = new HashMap();
        JSONObject optJSONObject = jSONObject.optJSONObject("rewards");
        if (optJSONObject != null) {
            Iterator<String> keys = optJSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                hashMap.put(next, optJSONObject.getString(next));
            }
        }
        return hashMap;
    }

    /* renamed from: s */
    public Map<String, String> mo34746s() {
        try {
            return m17399b(this.mAdContent.getJSONObject("pubContent"));
        } catch (JSONException e) {
            C6181gg.m18398a().mo35357a(new C6217hg(e));
            return null;
        }
    }

    /* renamed from: t */
    public String mo34747t() {
        return this.mAdContent.optString("creativeId");
    }

    /* renamed from: c */
    public List<String> mo34730c(String str) {
        JSONArray optJSONArray;
        if (this.trackers == null) {
            return null;
        }
        LinkedList linkedList = new LinkedList();
        int i = 0;
        while (i < this.trackers.length()) {
            try {
                JSONObject jSONObject = this.trackers.getJSONObject(i);
                if (str.equals(jSONObject.optString("type")) && (optJSONArray = jSONObject.optJSONArray("url")) != null) {
                    for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                        linkedList.add(optJSONArray.getString(i2));
                    }
                }
                i++;
            } catch (JSONException unused) {
                return null;
            }
        }
        if (linkedList.isEmpty()) {
            return null;
        }
        return linkedList;
    }

    /* renamed from: u */
    public String mo34748u() {
        JSONObject jSONObject;
        JSONObject jSONObject2 = this.metaInfo;
        if (jSONObject2 == null) {
            return "DEFAULT";
        }
        JSONArray optJSONArray = jSONObject2.optJSONArray("landingPageParams");
        this.landingPageParams = optJSONArray;
        if (optJSONArray == null || (jSONObject = (JSONObject) optJSONArray.opt(0)) == null) {
            return "DEFAULT";
        }
        return jSONObject.optString("openMode", "DEFAULT");
    }

    /* renamed from: v */
    public String mo34749v() {
        JSONObject jSONObject = this.metaInfo;
        if (jSONObject != null) {
            return jSONObject.optString(StaticResource.CREATIVE_TYPE, (String) null);
        }
        return null;
    }
}

package com.ironsource.mediationsdk.utils;

import android.content.Context;
import android.text.TextUtils;
import com.ironsource.mediationsdk.C6478E;
import com.ironsource.mediationsdk.adunit.data.DataKeys;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.model.C6697g;
import com.ironsource.mediationsdk.model.C6701k;
import com.ironsource.mediationsdk.model.C6703l;
import com.ironsource.mediationsdk.model.C6704m;
import com.ironsource.mediationsdk.model.C6705n;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.p374my.tracker.ads.AdFormat;
import com.smaato.sdk.video.vast.model.MediaFile;
import com.tapjoy.TJAdUnitConstants;
import com.tapjoy.TapjoyConstants;
import com.vungle.warren.model.ReportDBAdapter;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.mediationsdk.utils.l */
public final class C6777l {

    /* renamed from: A */
    private final String f17746A = TapjoyConstants.PREF_SERVER_PROVIDED_CONFIGURATIONS;

    /* renamed from: B */
    private final String f17747B = IronSourceConstants.EVENTS_GENERIC_PARAMS;

    /* renamed from: C */
    private final String f17748C = "adUnits";

    /* renamed from: D */
    private final String f17749D = "providerLoadName";

    /* renamed from: E */
    private final String f17750E = "application";

    /* renamed from: F */
    private final String f17751F = "rewardedVideo";

    /* renamed from: G */
    private final String f17752G = "interstitial";

    /* renamed from: H */
    private final String f17753H = "offerwall";

    /* renamed from: I */
    private final String f17754I = AdFormat.BANNER;

    /* renamed from: J */
    private final String f17755J = "integration";

    /* renamed from: K */
    private final String f17756K = "loggers";

    /* renamed from: L */
    private final String f17757L = "segment";

    /* renamed from: M */
    private final String f17758M = "events";

    /* renamed from: N */
    private final String f17759N = "crashReporter";

    /* renamed from: O */
    private final String f17760O = "token";

    /* renamed from: P */
    private final String f17761P = "external";

    /* renamed from: Q */
    private final String f17762Q = "mediationTypes";

    /* renamed from: R */
    private final String f17763R = "providerDefaultInstance";

    /* renamed from: S */
    private final String f17764S = "settings";

    /* renamed from: T */
    private final String f17765T = "maxNumOfAdaptersToLoadOnStart";

    /* renamed from: U */
    private final String f17766U = "advancedLoading";

    /* renamed from: V */
    private final String f17767V = "adapterTimeOutInSeconds";

    /* renamed from: W */
    private final String f17768W = "atim";

    /* renamed from: X */
    private final String f17769X = "bannerInterval";

    /* renamed from: Y */
    private final String f17770Y = "loadRVInterval";

    /* renamed from: Z */
    private final String f17771Z = "expiredDurationInMinutes";

    /* renamed from: a */
    public C6704m f17772a;

    /* renamed from: aA */
    private final String f17773aA = "maxImpressions";

    /* renamed from: aB */
    private final String f17774aB = "numOfSeconds";

    /* renamed from: aC */
    private final String f17775aC = "unit";

    /* renamed from: aD */
    private final String f17776aD = "virtualItemName";

    /* renamed from: aE */
    private final String f17777aE = "virtualItemCount";

    /* renamed from: aF */
    private final String f17778aF = "backFill";

    /* renamed from: aG */
    private final String f17779aG = "premium";

    /* renamed from: aH */
    private final String f17780aH = "uuidEnabled";

    /* renamed from: aI */
    private final String f17781aI = "abt";

    /* renamed from: aJ */
    private final String f17782aJ = "delayLoadFailure";

    /* renamed from: aK */
    private final String f17783aK = "keysToInclude";

    /* renamed from: aL */
    private final String f17784aL = "reporterURL";

    /* renamed from: aM */
    private final String f17785aM = "reporterKeyword";

    /* renamed from: aN */
    private final String f17786aN = "includeANR";

    /* renamed from: aO */
    private final String f17787aO = "timeout";

    /* renamed from: aP */
    private final String f17788aP = "setIgnoreDebugger";

    /* renamed from: aQ */
    private final String f17789aQ = "adSourceName";

    /* renamed from: aR */
    private final String f17790aR = "spId";

    /* renamed from: aS */
    private final String f17791aS = "mpis";

    /* renamed from: aT */
    private final String f17792aT = "auction";

    /* renamed from: aU */
    private final String f17793aU = "auctionData";

    /* renamed from: aV */
    private final String f17794aV = "auctioneerURL";

    /* renamed from: aW */
    private final String f17795aW = IronSourceConstants.EVENTS_PROGRAMMATIC;

    /* renamed from: aX */
    private final String f17796aX = "objectPerWaterfall";

    /* renamed from: aY */
    private final String f17797aY = "minTimeBeforeFirstAuction";

    /* renamed from: aZ */
    private final String f17798aZ = "timeToWaitBeforeAuction";

    /* renamed from: aa */
    private final String f17799aa = "server";

    /* renamed from: ab */
    private final String f17800ab = "publisher";

    /* renamed from: ac */
    private final String f17801ac = "console";

    /* renamed from: ad */
    private final String f17802ad = "sendUltraEvents";

    /* renamed from: ae */
    private final String f17803ae = "sendEventsToggle";

    /* renamed from: af */
    private final String f17804af = "eventsCompression";

    /* renamed from: ag */
    private final String f17805ag = "serverEventsURL";

    /* renamed from: ah */
    private final String f17806ah = "serverEventsType";

    /* renamed from: ai */
    private final String f17807ai = "backupThreshold";

    /* renamed from: aj */
    private final String f17808aj = "maxNumberOfEvents";

    /* renamed from: ak */
    private final String f17809ak = "maxEventsPerBatch";

    /* renamed from: al */
    private final String f17810al = "optOut";

    /* renamed from: am */
    private final String f17811am = "optIn";

    /* renamed from: an */
    private final String f17812an = "triggerEvents";

    /* renamed from: ao */
    private final String f17813ao = "nonConnectivityEvents";

    /* renamed from: ap */
    private final String f17814ap = "pixel";

    /* renamed from: aq */
    private final String f17815aq = "pixelEventsUrl";

    /* renamed from: ar */
    private final String f17816ar = "pixelEventsEnabled";

    /* renamed from: as */
    private final String f17817as = "placements";

    /* renamed from: at */
    private final String f17818at = ReportDBAdapter.ReportColumns.COLUMN_PLACEMENT_ID;

    /* renamed from: au */
    private final String f17819au = "placementName";

    /* renamed from: av */
    private final String f17820av = MediaFile.DELIVERY;

    /* renamed from: aw */
    private final String f17821aw = "isDefault";

    /* renamed from: ax */
    private final String f17822ax = "capping";

    /* renamed from: ay */
    private final String f17823ay = "pacing";

    /* renamed from: az */
    private final String f17824az = TJAdUnitConstants.String.ENABLED;

    /* renamed from: b */
    public C6705n f17825b;

    /* renamed from: ba */
    private final String f17826ba = "timeToWaitBeforeLoad";

    /* renamed from: bb */
    private final String f17827bb = "auctionRetryInterval";

    /* renamed from: bc */
    private final String f17828bc = "isAuctionOnShowStart";

    /* renamed from: bd */
    private final String f17829bd = "isLoadWhileShow";

    /* renamed from: be */
    private final String f17830be = IronSourceConstants.AUCTION_TRIALS;

    /* renamed from: bf */
    private final String f17831bf = "auctionTimeout";

    /* renamed from: bg */
    private final String f17832bg = "auctionSavedHistory";

    /* renamed from: bh */
    private final String f17833bh = "disableLoadWhileShowSupportFor";

    /* renamed from: bi */
    private final String f17834bi = "timeToDeleteOldWaterfallAfterAuction";

    /* renamed from: bj */
    private final String f17835bj = "compressAuctionRequest";

    /* renamed from: bk */
    private final String f17836bk = "compressAuctionResponse";

    /* renamed from: bl */
    private final String f17837bl = "encryptionVersion";

    /* renamed from: bm */
    private final String f17838bm = "shouldSendBannerBURLFromImpression";

    /* renamed from: bn */
    private final String f17839bn = "optInKeys";

    /* renamed from: bo */
    private final String f17840bo = "tokenGenericParams";

    /* renamed from: bp */
    private final String f17841bp = "oneToken";

    /* renamed from: bq */
    private final String f17842bq = "compressToken";

    /* renamed from: br */
    private final String f17843br = "isExternalArmEventsEnabled";

    /* renamed from: bs */
    private final String f17844bs = "externalArmEventsUrl";

    /* renamed from: bt */
    private final String f17845bt = "compressExternalToken";

    /* renamed from: bu */
    private String f17846bu;

    /* renamed from: bv */
    private String f17847bv;

    /* renamed from: bw */
    private Context f17848bw;

    /* renamed from: c */
    public C6697g f17849c;

    /* renamed from: d */
    public JSONObject f17850d;

    /* renamed from: e */
    public int f17851e = C6778a.f17873a;

    /* renamed from: f */
    private final String f17852f = "error";

    /* renamed from: g */
    private final int f17853g = 3;

    /* renamed from: h */
    private final int f17854h = 2;

    /* renamed from: i */
    private final int f17855i = 60;

    /* renamed from: j */
    private final int f17856j = 10000;

    /* renamed from: k */
    private final int f17857k = 5000;

    /* renamed from: l */
    private final int f17858l = 300;

    /* renamed from: m */
    private final int f17859m = 3;

    /* renamed from: n */
    private final int f17860n = 3;

    /* renamed from: o */
    private final int f17861o = 3;

    /* renamed from: p */
    private final int f17862p = 2;

    /* renamed from: q */
    private final int f17863q = 15;

    /* renamed from: r */
    private final long f17864r = 10000;

    /* renamed from: s */
    private final int f17865s = 0;

    /* renamed from: t */
    private final boolean f17866t = false;

    /* renamed from: u */
    private final int f17867u = 30000;

    /* renamed from: v */
    private final int f17868v = -1;

    /* renamed from: w */
    private final int f17869w = 5000;

    /* renamed from: x */
    private final int f17870x = 1;

    /* renamed from: y */
    private final String f17871y = "providerOrder";

    /* renamed from: z */
    private final String f17872z = "providerSettings";

    /* renamed from: com.ironsource.mediationsdk.utils.l$a */
    public enum C6778a {
        ;
        

        /* renamed from: a */
        public static final int f17873a = 1;

        /* renamed from: b */
        public static final int f17874b = 2;

        /* renamed from: c */
        public static final int f17875c = 3;

        static {
            f17876d = new int[]{1, 2, 3};
        }
    }

    public C6777l(Context context, String str, String str2, String str3) {
        this.f17848bw = context;
        try {
            this.f17850d = TextUtils.isEmpty(str3) ? new JSONObject() : new JSONObject(str3);
            m20633h();
            m20634i();
            m20632g();
            this.f17846bu = TextUtils.isEmpty(str) ? "" : str;
            this.f17847bv = TextUtils.isEmpty(str2) ? "" : str2;
        } catch (JSONException e) {
            e.printStackTrace();
            m20630e();
        }
    }

    public C6777l(C6777l lVar) {
        try {
            this.f17848bw = lVar.f17848bw;
            this.f17850d = new JSONObject(lVar.f17850d.toString());
            this.f17846bu = lVar.f17846bu;
            this.f17847bv = lVar.f17847bv;
            this.f17772a = lVar.f17772a;
            this.f17825b = lVar.f17825b;
            this.f17849c = lVar.f17849c;
            this.f17851e = lVar.f17851e;
        } catch (Exception unused) {
            m20630e();
        }
    }

    /* renamed from: a */
    private static int m20626a(JSONObject jSONObject, JSONObject jSONObject2, String str, int i) {
        int i2 = 0;
        if (jSONObject.has(str)) {
            i2 = jSONObject.optInt(str, 0);
        } else if (jSONObject2.has(str)) {
            i2 = jSONObject2.optInt(str, 0);
        }
        return i2 == 0 ? i : i2;
    }

    /* renamed from: a */
    private static C6701k m20627a(JSONObject jSONObject) {
        C6703l lVar = null;
        if (jSONObject == null) {
            return null;
        }
        C6701k.C6702a aVar = new C6701k.C6702a();
        boolean z = true;
        aVar.f17524a = jSONObject.optBoolean(MediaFile.DELIVERY, true);
        JSONObject optJSONObject = jSONObject.optJSONObject("capping");
        if (optJSONObject != null) {
            String optString = optJSONObject.optString("unit");
            if (!TextUtils.isEmpty(optString)) {
                if (C6703l.PER_DAY.toString().equals(optString)) {
                    lVar = C6703l.PER_DAY;
                } else if (C6703l.PER_HOUR.toString().equals(optString)) {
                    lVar = C6703l.PER_HOUR;
                }
            }
            int optInt = optJSONObject.optInt("maxImpressions", 0);
            aVar.mo36823a(optJSONObject.optBoolean(TJAdUnitConstants.String.ENABLED, false) && optInt > 0, lVar, optInt);
        }
        JSONObject optJSONObject2 = jSONObject.optJSONObject("pacing");
        if (optJSONObject2 != null) {
            int optInt2 = optJSONObject2.optInt("numOfSeconds", 0);
            if (!optJSONObject2.optBoolean(TJAdUnitConstants.String.ENABLED, false) || optInt2 <= 0) {
                z = false;
            }
            aVar.mo36822a(z, optInt2);
        }
        return aVar.mo36824a();
    }

    /* renamed from: a */
    private static int[] m20628a(JSONObject jSONObject, String str) {
        JSONArray optJSONArray = jSONObject.optJSONArray(str);
        if (optJSONArray == null) {
            return null;
        }
        int[] iArr = new int[optJSONArray.length()];
        for (int i = 0; i < optJSONArray.length(); i++) {
            iArr[i] = optJSONArray.optInt(i);
        }
        return iArr;
    }

    /* renamed from: b */
    private static JSONObject m20629b(JSONObject jSONObject, String str) {
        if (jSONObject != null) {
            return jSONObject.optJSONObject(str);
        }
        return null;
    }

    /* renamed from: e */
    private void m20630e() {
        this.f17850d = new JSONObject();
        this.f17846bu = "";
        this.f17847bv = "";
        this.f17772a = new C6704m();
        this.f17825b = C6705n.m20411a();
        this.f17849c = new C6697g();
    }

    /* renamed from: f */
    private boolean m20631f() {
        JSONArray names = m20629b(this.f17850d, "providerOrder").names();
        if (names == null) {
            return true;
        }
        JSONObject b = m20629b(m20629b(this.f17850d, TapjoyConstants.PREF_SERVER_PROVIDED_CONFIGURATIONS), "adUnits");
        for (int i = 0; i < names.length(); i++) {
            JSONArray optJSONArray = m20629b(b, names.optString(i)).optJSONArray("placements");
            if (optJSONArray == null || optJSONArray.length() == 0) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: g */
    private void m20632g() {
        try {
            JSONObject b = m20629b(this.f17850d, "providerOrder");
            JSONArray optJSONArray = b.optJSONArray("rewardedVideo");
            JSONArray optJSONArray2 = b.optJSONArray("interstitial");
            JSONArray optJSONArray3 = b.optJSONArray(AdFormat.BANNER);
            this.f17772a = new C6704m();
            if (!(optJSONArray == null || this.f17849c == null || this.f17849c.f17496a == null)) {
                String str = this.f17849c.f17496a.f17548f;
                String str2 = this.f17849c.f17496a.f17549g;
                for (int i = 0; i < optJSONArray.length(); i++) {
                    String optString = optJSONArray.optString(i);
                    if (optString.equals(str)) {
                        this.f17772a.f17535b = str;
                    } else {
                        if (optString.equals(str2)) {
                            this.f17772a.f17536c = str2;
                        }
                        C6704m mVar = this.f17772a;
                        if (!TextUtils.isEmpty(optString)) {
                            mVar.f17534a.add(optString);
                        }
                        NetworkSettings a = C6705n.m20411a().mo36826a(optString);
                        if (a != null) {
                            a.setRewardedVideoPriority(i);
                        }
                    }
                }
            }
            if (!(optJSONArray2 == null || this.f17849c == null || this.f17849c.f17497b == null)) {
                String str3 = this.f17849c.f17497b.f17507g;
                String str4 = this.f17849c.f17497b.f17508h;
                for (int i2 = 0; i2 < optJSONArray2.length(); i2++) {
                    String optString2 = optJSONArray2.optString(i2);
                    if (optString2.equals(str3)) {
                        this.f17772a.f17539f = str3;
                    } else {
                        if (optString2.equals(str4)) {
                            this.f17772a.f17540g = str4;
                        }
                        C6704m mVar2 = this.f17772a;
                        if (!TextUtils.isEmpty(optString2)) {
                            mVar2.f17537d.add(optString2);
                        }
                        NetworkSettings a2 = C6705n.m20411a().mo36826a(optString2);
                        if (a2 != null) {
                            a2.setInterstitialPriority(i2);
                        }
                    }
                }
            }
            if (optJSONArray3 != null) {
                for (int i3 = 0; i3 < optJSONArray3.length(); i3++) {
                    String optString3 = optJSONArray3.optString(i3);
                    C6704m mVar3 = this.f17772a;
                    if (!TextUtils.isEmpty(optString3)) {
                        mVar3.f17538e.add(optString3);
                    }
                    NetworkSettings a3 = C6705n.m20411a().mo36826a(optString3);
                    if (a3 != null) {
                        a3.setBannerPriority(i3);
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x00e2 A[Catch:{ Exception -> 0x015c }] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0132 A[Catch:{ Exception -> 0x015c }] */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m20633h() {
        /*
            r18 = this;
            r1 = r18
            java.lang.String r0 = "Mediation"
            com.ironsource.mediationsdk.model.n r2 = com.ironsource.mediationsdk.model.C6705n.m20411a()     // Catch:{ Exception -> 0x015c }
            r1.f17825b = r2     // Catch:{ Exception -> 0x015c }
            org.json.JSONObject r2 = r1.f17850d     // Catch:{ Exception -> 0x015c }
            java.lang.String r3 = "providerSettings"
            org.json.JSONObject r2 = m20629b(r2, r3)     // Catch:{ Exception -> 0x015c }
            java.util.Iterator r3 = r2.keys()     // Catch:{ Exception -> 0x015c }
        L_0x0016:
            boolean r4 = r3.hasNext()     // Catch:{ Exception -> 0x015c }
            if (r4 == 0) goto L_0x0156
            java.lang.Object r4 = r3.next()     // Catch:{ Exception -> 0x015c }
            r6 = r4
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ Exception -> 0x015c }
            org.json.JSONObject r4 = r2.optJSONObject(r6)     // Catch:{ Exception -> 0x015c }
            if (r4 == 0) goto L_0x014c
            java.lang.String r5 = "mpis"
            r7 = 0
            boolean r13 = r4.optBoolean(r5, r7)     // Catch:{ Exception -> 0x015c }
            java.lang.String r5 = "spId"
            java.lang.String r8 = "0"
            java.lang.String r14 = r4.optString(r5, r8)     // Catch:{ Exception -> 0x015c }
            java.lang.String r5 = "adSourceName"
            r8 = 0
            java.lang.String r15 = r4.optString(r5, r8)     // Catch:{ Exception -> 0x015c }
            java.lang.String r5 = "providerLoadName"
            java.lang.String r8 = r4.optString(r5, r6)     // Catch:{ Exception -> 0x015c }
            java.lang.String r5 = "providerDefaultInstance"
            java.lang.String r9 = r4.optString(r5, r8)     // Catch:{ Exception -> 0x015c }
            java.lang.String r5 = "adUnits"
            org.json.JSONObject r5 = m20629b(r4, r5)     // Catch:{ Exception -> 0x015c }
            java.lang.String r10 = "application"
            org.json.JSONObject r4 = m20629b(r4, r10)     // Catch:{ Exception -> 0x015c }
            java.lang.String r10 = "rewardedVideo"
            org.json.JSONObject r10 = m20629b(r5, r10)     // Catch:{ Exception -> 0x015c }
            java.lang.String r11 = "interstitial"
            org.json.JSONObject r11 = m20629b(r5, r11)     // Catch:{ Exception -> 0x015c }
            java.lang.String r12 = "banner"
            org.json.JSONObject r5 = m20629b(r5, r12)     // Catch:{ Exception -> 0x015c }
            org.json.JSONObject r10 = com.ironsource.mediationsdk.utils.IronSourceUtils.mergeJsons(r10, r4)     // Catch:{ Exception -> 0x015c }
            org.json.JSONObject r11 = com.ironsource.mediationsdk.utils.IronSourceUtils.mergeJsons(r11, r4)     // Catch:{ Exception -> 0x015c }
            org.json.JSONObject r12 = com.ironsource.mediationsdk.utils.IronSourceUtils.mergeJsons(r5, r4)     // Catch:{ Exception -> 0x015c }
            com.ironsource.mediationsdk.model.n r5 = r1.f17825b     // Catch:{ Exception -> 0x015c }
            boolean r5 = r5.mo36829b(r6)     // Catch:{ Exception -> 0x015c }
            if (r5 == 0) goto L_0x00af
            com.ironsource.mediationsdk.model.n r4 = r1.f17825b     // Catch:{ Exception -> 0x015c }
            com.ironsource.mediationsdk.model.NetworkSettings r4 = r4.mo36826a((java.lang.String) r6)     // Catch:{ Exception -> 0x015c }
            org.json.JSONObject r5 = r4.getRewardedVideoSettings()     // Catch:{ Exception -> 0x015c }
            org.json.JSONObject r6 = r4.getInterstitialSettings()     // Catch:{ Exception -> 0x015c }
            org.json.JSONObject r7 = r4.getBannerSettings()     // Catch:{ Exception -> 0x015c }
            org.json.JSONObject r5 = com.ironsource.mediationsdk.utils.IronSourceUtils.mergeJsons(r5, r10)     // Catch:{ Exception -> 0x015c }
            r4.setRewardedVideoSettings(r5)     // Catch:{ Exception -> 0x015c }
            org.json.JSONObject r5 = com.ironsource.mediationsdk.utils.IronSourceUtils.mergeJsons(r6, r11)     // Catch:{ Exception -> 0x015c }
            r4.setInterstitialSettings(r5)     // Catch:{ Exception -> 0x015c }
            org.json.JSONObject r5 = com.ironsource.mediationsdk.utils.IronSourceUtils.mergeJsons(r7, r12)     // Catch:{ Exception -> 0x015c }
            r4.setBannerSettings(r5)     // Catch:{ Exception -> 0x015c }
            r4.setIsMultipleInstances(r13)     // Catch:{ Exception -> 0x015c }
            r4.setSubProviderId(r14)     // Catch:{ Exception -> 0x015c }
            r4.setAdSourceNameForEvents(r15)     // Catch:{ Exception -> 0x015c }
            goto L_0x0016
        L_0x00af:
            java.util.Locale r5 = java.util.Locale.ENGLISH     // Catch:{ Exception -> 0x015c }
            java.lang.String r5 = r8.toLowerCase(r5)     // Catch:{ Exception -> 0x015c }
            com.ironsource.mediationsdk.model.n r7 = r1.f17825b     // Catch:{ Exception -> 0x015c }
            boolean r7 = r7.mo36829b(r0)     // Catch:{ Exception -> 0x015c }
            if (r7 == 0) goto L_0x00dd
            java.lang.String r7 = "SupersonicAds"
            r17 = r2
            java.util.Locale r2 = java.util.Locale.ENGLISH     // Catch:{ Exception -> 0x015c }
            java.lang.String r2 = r7.toLowerCase(r2)     // Catch:{ Exception -> 0x015c }
            boolean r2 = r2.equals(r5)     // Catch:{ Exception -> 0x015c }
            if (r2 != 0) goto L_0x00db
            java.lang.String r2 = "IronSource"
            java.util.Locale r7 = java.util.Locale.ENGLISH     // Catch:{ Exception -> 0x015c }
            java.lang.String r2 = r2.toLowerCase(r7)     // Catch:{ Exception -> 0x015c }
            boolean r2 = r2.equals(r5)     // Catch:{ Exception -> 0x015c }
            if (r2 == 0) goto L_0x00df
        L_0x00db:
            r7 = 1
            goto L_0x00e0
        L_0x00dd:
            r17 = r2
        L_0x00df:
            r7 = 0
        L_0x00e0:
            if (r7 == 0) goto L_0x0132
            com.ironsource.mediationsdk.model.n r2 = r1.f17825b     // Catch:{ Exception -> 0x015c }
            com.ironsource.mediationsdk.model.NetworkSettings r2 = r2.mo36826a((java.lang.String) r0)     // Catch:{ Exception -> 0x015c }
            org.json.JSONObject r5 = r2.getRewardedVideoSettings()     // Catch:{ Exception -> 0x015c }
            org.json.JSONObject r7 = r2.getInterstitialSettings()     // Catch:{ Exception -> 0x015c }
            org.json.JSONObject r2 = r2.getBannerSettings()     // Catch:{ Exception -> 0x015c }
            r16 = r0
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ Exception -> 0x015c }
            java.lang.String r5 = r5.toString()     // Catch:{ Exception -> 0x015c }
            r0.<init>(r5)     // Catch:{ Exception -> 0x015c }
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch:{ Exception -> 0x015c }
            java.lang.String r7 = r7.toString()     // Catch:{ Exception -> 0x015c }
            r5.<init>(r7)     // Catch:{ Exception -> 0x015c }
            org.json.JSONObject r7 = new org.json.JSONObject     // Catch:{ Exception -> 0x015c }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x015c }
            r7.<init>(r2)     // Catch:{ Exception -> 0x015c }
            org.json.JSONObject r10 = com.ironsource.mediationsdk.utils.IronSourceUtils.mergeJsons(r0, r10)     // Catch:{ Exception -> 0x015c }
            org.json.JSONObject r11 = com.ironsource.mediationsdk.utils.IronSourceUtils.mergeJsons(r5, r11)     // Catch:{ Exception -> 0x015c }
            org.json.JSONObject r12 = com.ironsource.mediationsdk.utils.IronSourceUtils.mergeJsons(r7, r12)     // Catch:{ Exception -> 0x015c }
            com.ironsource.mediationsdk.model.NetworkSettings r0 = new com.ironsource.mediationsdk.model.NetworkSettings     // Catch:{ Exception -> 0x015c }
            r5 = r0
            r7 = r8
            r8 = r9
            r9 = r4
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)     // Catch:{ Exception -> 0x015c }
            r0.setIsMultipleInstances(r13)     // Catch:{ Exception -> 0x015c }
            r0.setSubProviderId(r14)     // Catch:{ Exception -> 0x015c }
            r0.setAdSourceNameForEvents(r15)     // Catch:{ Exception -> 0x015c }
            com.ironsource.mediationsdk.model.n r2 = r1.f17825b     // Catch:{ Exception -> 0x015c }
            goto L_0x0148
        L_0x0132:
            r16 = r0
            com.ironsource.mediationsdk.model.NetworkSettings r0 = new com.ironsource.mediationsdk.model.NetworkSettings     // Catch:{ Exception -> 0x015c }
            r5 = r0
            r7 = r8
            r8 = r9
            r9 = r4
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)     // Catch:{ Exception -> 0x015c }
            r0.setIsMultipleInstances(r13)     // Catch:{ Exception -> 0x015c }
            r0.setSubProviderId(r14)     // Catch:{ Exception -> 0x015c }
            r0.setAdSourceNameForEvents(r15)     // Catch:{ Exception -> 0x015c }
            com.ironsource.mediationsdk.model.n r2 = r1.f17825b     // Catch:{ Exception -> 0x015c }
        L_0x0148:
            r2.mo36827a((com.ironsource.mediationsdk.model.NetworkSettings) r0)     // Catch:{ Exception -> 0x015c }
            goto L_0x0150
        L_0x014c:
            r16 = r0
            r17 = r2
        L_0x0150:
            r0 = r16
            r2 = r17
            goto L_0x0016
        L_0x0156:
            com.ironsource.mediationsdk.model.n r0 = r1.f17825b     // Catch:{ Exception -> 0x015c }
            r0.mo36828b()     // Catch:{ Exception -> 0x015c }
            return
        L_0x015c:
            r0 = move-exception
            r0.printStackTrace()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.utils.C6777l.m20633h():void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:164:0x0557 A[Catch:{ Exception -> 0x058a }] */
    /* JADX WARNING: Removed duplicated region for block: B:250:0x079d A[Catch:{ Exception -> 0x058a }] */
    /* JADX WARNING: Removed duplicated region for block: B:307:0x08d9 A[Catch:{ Exception -> 0x058a }] */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0325 A[Catch:{ Exception -> 0x058a }] */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m20634i() {
        /*
            r82 = this;
            r1 = r82
            java.lang.String r2 = "events"
            org.json.JSONObject r3 = r1.f17850d     // Catch:{ Exception -> 0x0ac4 }
            java.lang.String r4 = "configurations"
            org.json.JSONObject r3 = m20629b(r3, r4)     // Catch:{ Exception -> 0x0ac4 }
            java.lang.String r4 = "adUnits"
            org.json.JSONObject r4 = m20629b(r3, r4)     // Catch:{ Exception -> 0x0ac4 }
            java.lang.String r5 = "application"
            org.json.JSONObject r3 = m20629b(r3, r5)     // Catch:{ Exception -> 0x0ac4 }
            java.lang.String r5 = "rewardedVideo"
            org.json.JSONObject r5 = m20629b(r4, r5)     // Catch:{ Exception -> 0x0ac4 }
            java.lang.String r6 = "interstitial"
            org.json.JSONObject r6 = m20629b(r4, r6)     // Catch:{ Exception -> 0x0ac4 }
            java.lang.String r7 = "offerwall"
            org.json.JSONObject r7 = m20629b(r4, r7)     // Catch:{ Exception -> 0x0ac4 }
            java.lang.String r8 = "banner"
            org.json.JSONObject r4 = m20629b(r4, r8)     // Catch:{ Exception -> 0x0ac4 }
            org.json.JSONObject r8 = m20629b(r3, r2)     // Catch:{ Exception -> 0x0ac4 }
            java.lang.String r9 = "loggers"
            org.json.JSONObject r9 = m20629b(r3, r9)     // Catch:{ Exception -> 0x0ac4 }
            java.lang.String r10 = "token"
            org.json.JSONObject r10 = m20629b(r3, r10)     // Catch:{ Exception -> 0x0ac4 }
            java.lang.String r11 = "segment"
            org.json.JSONObject r11 = m20629b(r3, r11)     // Catch:{ Exception -> 0x0ac4 }
            java.lang.String r12 = "auction"
            org.json.JSONObject r12 = m20629b(r3, r12)     // Catch:{ Exception -> 0x0ac4 }
            java.lang.String r13 = "crashReporter"
            org.json.JSONObject r13 = m20629b(r3, r13)     // Catch:{ Exception -> 0x0ac4 }
            java.lang.String r14 = "settings"
            org.json.JSONObject r14 = m20629b(r3, r14)     // Catch:{ Exception -> 0x0ac4 }
            java.lang.String r15 = "external"
            org.json.JSONObject r15 = m20629b(r3, r15)     // Catch:{ Exception -> 0x0ac4 }
            r16 = r15
            java.lang.String r15 = "pixel"
            org.json.JSONObject r15 = m20629b(r8, r15)     // Catch:{ Exception -> 0x0ac4 }
            r17 = r14
            r14 = 1
            if (r3 == 0) goto L_0x007d
            r18 = r11
            java.lang.String r11 = "uuidEnabled"
            boolean r11 = r3.optBoolean(r11, r14)     // Catch:{ Exception -> 0x0ac4 }
            android.content.Context r14 = r1.f17848bw     // Catch:{ Exception -> 0x0ac4 }
            r19 = r13
            java.lang.String r13 = "uuidEnabled"
            com.ironsource.mediationsdk.utils.IronSourceUtils.saveBooleanToSharedPrefs(r14, r13, r11)     // Catch:{ Exception -> 0x0ac4 }
            goto L_0x0081
        L_0x007d:
            r18 = r11
            r19 = r13
        L_0x0081:
            if (r8 == 0) goto L_0x009b
            java.lang.String r11 = "abt"
            java.lang.String r11 = r8.optString(r11)     // Catch:{ Exception -> 0x0ac4 }
            boolean r13 = android.text.TextUtils.isEmpty(r11)     // Catch:{ Exception -> 0x0ac4 }
            if (r13 != 0) goto L_0x009b
            com.ironsource.mediationsdk.a.d r13 = com.ironsource.mediationsdk.p207a.C6553d.m19930d()     // Catch:{ Exception -> 0x0ac4 }
            r13.f16925p = r11     // Catch:{ Exception -> 0x0ac4 }
            com.ironsource.mediationsdk.a.h r13 = com.ironsource.mediationsdk.p207a.C6557h.m19950d()     // Catch:{ Exception -> 0x0ac4 }
            r13.f16925p = r11     // Catch:{ Exception -> 0x0ac4 }
        L_0x009b:
            java.lang.String r11 = "triggerEvents"
            java.lang.String r13 = "maxEventsPerBatch"
            java.lang.String r14 = "maxNumberOfEvents"
            r20 = r9
            java.lang.String r9 = "backupThreshold"
            r21 = r6
            r22 = r7
            java.lang.String r6 = "serverEventsType"
            java.lang.String r7 = "serverEventsURL"
            r24 = r15
            java.lang.String r15 = "sendEventsToggle"
            r25 = r10
            java.lang.String r10 = "placements"
            r26 = r4
            java.lang.String r4 = "optIn"
            java.lang.String r1 = "optOut"
            r27 = r12
            java.lang.String r12 = "eventsCompression"
            r28 = r11
            java.lang.String r11 = ""
            r29 = 0
            r30 = r4
            if (r5 == 0) goto L_0x0357
            org.json.JSONArray r4 = r5.optJSONArray(r10)     // Catch:{ Exception -> 0x0352 }
            r31 = r10
            org.json.JSONObject r10 = m20629b(r5, r2)     // Catch:{ Exception -> 0x0352 }
            r32 = r2
            java.lang.String r2 = "maxNumOfAdaptersToLoadOnStart"
            r33 = r4
            r4 = 2
            int r2 = m20626a(r5, r3, r2, r4)     // Catch:{ Exception -> 0x0352 }
            java.lang.String r4 = "advancedLoading"
            r34 = r2
            r2 = 0
            int r4 = m20626a(r5, r3, r4, r2)     // Catch:{ Exception -> 0x0352 }
            if (r4 <= 0) goto L_0x00ee
            r36 = r4
            r37 = 1
            goto L_0x00f2
        L_0x00ee:
            r36 = r34
            r37 = 0
        L_0x00f2:
            java.lang.String r2 = "adapterTimeOutInSeconds"
            r4 = 60
            int r38 = m20626a(r5, r3, r2, r4)     // Catch:{ Exception -> 0x0352 }
            java.lang.String r2 = "loadRVInterval"
            r4 = 300(0x12c, float:4.2E-43)
            int r39 = m20626a(r5, r3, r2, r4)     // Catch:{ Exception -> 0x0352 }
            java.lang.String r2 = "expiredDurationInMinutes"
            r4 = -1
            int r40 = m20626a(r5, r3, r2, r4)     // Catch:{ Exception -> 0x0352 }
            java.lang.String r2 = "delayLoadFailure"
            r4 = 3
            int r43 = m20626a(r5, r3, r2, r4)     // Catch:{ Exception -> 0x0352 }
            org.json.JSONObject r2 = com.ironsource.mediationsdk.utils.IronSourceUtils.mergeJsons(r10, r8)     // Catch:{ Exception -> 0x0352 }
            java.lang.String r4 = "sendUltraEvents"
            r10 = 0
            boolean r45 = r2.optBoolean(r4, r10)     // Catch:{ Exception -> 0x0352 }
            boolean r46 = r2.optBoolean(r15, r10)     // Catch:{ Exception -> 0x0352 }
            boolean r47 = r2.optBoolean(r12, r10)     // Catch:{ Exception -> 0x0352 }
            java.lang.String r48 = r2.optString(r7, r11)     // Catch:{ Exception -> 0x0352 }
            java.lang.String r49 = r2.optString(r6, r11)     // Catch:{ Exception -> 0x0352 }
            r4 = -1
            int r50 = r2.optInt(r9, r4)     // Catch:{ Exception -> 0x0352 }
            int r51 = r2.optInt(r14, r4)     // Catch:{ Exception -> 0x0352 }
            r4 = 5000(0x1388, float:7.006E-42)
            int r52 = r2.optInt(r13, r4)     // Catch:{ Exception -> 0x0352 }
            org.json.JSONArray r4 = r2.optJSONArray(r1)     // Catch:{ Exception -> 0x0352 }
            if (r4 == 0) goto L_0x015d
            int r10 = r4.length()     // Catch:{ Exception -> 0x0352 }
            int[] r10 = new int[r10]     // Catch:{ Exception -> 0x0352 }
            r34 = r1
            r57 = r13
            r1 = 0
        L_0x014b:
            int r13 = r4.length()     // Catch:{ Exception -> 0x0352 }
            if (r1 >= r13) goto L_0x015a
            int r13 = r4.optInt(r1)     // Catch:{ Exception -> 0x0352 }
            r10[r1] = r13     // Catch:{ Exception -> 0x0352 }
            int r1 = r1 + 1
            goto L_0x014b
        L_0x015a:
            r53 = r10
            goto L_0x0163
        L_0x015d:
            r34 = r1
            r57 = r13
            r53 = r29
        L_0x0163:
            r1 = r30
            org.json.JSONArray r4 = r2.optJSONArray(r1)     // Catch:{ Exception -> 0x0352 }
            if (r4 == 0) goto L_0x0186
            int r10 = r4.length()     // Catch:{ Exception -> 0x0352 }
            int[] r10 = new int[r10]     // Catch:{ Exception -> 0x0352 }
            r30 = r1
            r13 = 0
        L_0x0174:
            int r1 = r4.length()     // Catch:{ Exception -> 0x0352 }
            if (r13 >= r1) goto L_0x0183
            int r1 = r4.optInt(r13)     // Catch:{ Exception -> 0x0352 }
            r10[r13] = r1     // Catch:{ Exception -> 0x0352 }
            int r13 = r13 + 1
            goto L_0x0174
        L_0x0183:
            r54 = r10
            goto L_0x018a
        L_0x0186:
            r30 = r1
            r54 = r29
        L_0x018a:
            r1 = r28
            org.json.JSONArray r4 = r2.optJSONArray(r1)     // Catch:{ Exception -> 0x0352 }
            if (r4 == 0) goto L_0x01ad
            int r10 = r4.length()     // Catch:{ Exception -> 0x0352 }
            int[] r10 = new int[r10]     // Catch:{ Exception -> 0x0352 }
            r28 = r1
            r13 = 0
        L_0x019b:
            int r1 = r4.length()     // Catch:{ Exception -> 0x0352 }
            if (r13 >= r1) goto L_0x01aa
            int r1 = r4.optInt(r13)     // Catch:{ Exception -> 0x0352 }
            r10[r13] = r1     // Catch:{ Exception -> 0x0352 }
            int r13 = r13 + 1
            goto L_0x019b
        L_0x01aa:
            r55 = r10
            goto L_0x01b1
        L_0x01ad:
            r28 = r1
            r55 = r29
        L_0x01b1:
            java.lang.String r1 = "nonConnectivityEvents"
            org.json.JSONArray r1 = r2.optJSONArray(r1)     // Catch:{ Exception -> 0x0352 }
            if (r1 == 0) goto L_0x01d2
            int r2 = r1.length()     // Catch:{ Exception -> 0x0352 }
            int[] r2 = new int[r2]     // Catch:{ Exception -> 0x0352 }
            r4 = 0
        L_0x01c0:
            int r10 = r1.length()     // Catch:{ Exception -> 0x0352 }
            if (r4 >= r10) goto L_0x01cf
            int r10 = r1.optInt(r4)     // Catch:{ Exception -> 0x0352 }
            r2[r4] = r10     // Catch:{ Exception -> 0x0352 }
            int r4 = r4 + 1
            goto L_0x01c0
        L_0x01cf:
            r56 = r2
            goto L_0x01d4
        L_0x01d2:
            r56 = r29
        L_0x01d4:
            com.ironsource.sdk.g.d r41 = new com.ironsource.sdk.g.d     // Catch:{ Exception -> 0x0352 }
            r44 = r41
            r44.<init>(r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56)     // Catch:{ Exception -> 0x0352 }
            if (r27 == 0) goto L_0x02a0
            java.lang.String r1 = "rewardedVideo"
            r2 = r27
            org.json.JSONObject r1 = m20629b(r2, r1)     // Catch:{ Exception -> 0x0352 }
            java.lang.String r4 = "auctionData"
            java.lang.String r59 = r2.optString(r4, r11)     // Catch:{ Exception -> 0x0352 }
            java.lang.String r4 = "auctioneerURL"
            java.lang.String r60 = r2.optString(r4, r11)     // Catch:{ Exception -> 0x0352 }
            java.lang.String r4 = "auctionTrials"
            r10 = 2
            int r61 = r2.optInt(r4, r10)     // Catch:{ Exception -> 0x0352 }
            java.lang.String r4 = "auctionTimeout"
            r10 = r14
            r13 = 10000(0x2710, double:4.9407E-320)
            long r63 = r2.optLong(r4, r13)     // Catch:{ Exception -> 0x0352 }
            java.lang.String r4 = "auctionSavedHistory"
            r13 = 15
            int r62 = r2.optInt(r4, r13)     // Catch:{ Exception -> 0x0352 }
            java.lang.String r4 = "compressAuctionRequest"
            r13 = 0
            boolean r77 = r2.optBoolean(r4, r13)     // Catch:{ Exception -> 0x0352 }
            java.lang.String r4 = "compressAuctionResponse"
            boolean r78 = r2.optBoolean(r4, r13)     // Catch:{ Exception -> 0x0352 }
            java.lang.String r4 = "encryptionVersion"
            r14 = 1
            int r80 = r2.optInt(r4, r14)     // Catch:{ Exception -> 0x0352 }
            java.lang.String r4 = "programmatic"
            boolean r65 = r1.optBoolean(r4, r13)     // Catch:{ Exception -> 0x0352 }
            java.lang.String r4 = "minTimeBeforeFirstAuction"
            r13 = 2000(0x7d0, float:2.803E-42)
            int r4 = r1.optInt(r4, r13)     // Catch:{ Exception -> 0x0352 }
            java.lang.String r13 = "auctionRetryInterval"
            r14 = 30000(0x7530, float:4.2039E-41)
            int r13 = r1.optInt(r13, r14)     // Catch:{ Exception -> 0x0352 }
            java.lang.String r14 = "timeToWaitBeforeAuction"
            r27 = r2
            r2 = 5000(0x1388, float:7.006E-42)
            int r14 = r1.optInt(r14, r2)     // Catch:{ Exception -> 0x0352 }
            java.lang.String r2 = "timeToWaitBeforeLoad"
            r44 = r10
            r10 = 50
            int r2 = r1.optInt(r2, r10)     // Catch:{ Exception -> 0x0352 }
            java.lang.String r10 = "isAuctionOnShowStart"
            r45 = r9
            r9 = 0
            boolean r74 = r1.optBoolean(r10, r9)     // Catch:{ Exception -> 0x0352 }
            java.lang.String r10 = "objectPerWaterfall"
            boolean r79 = r1.optBoolean(r10, r9)     // Catch:{ Exception -> 0x0352 }
            java.lang.String r10 = "isLoadWhileShow"
            boolean r75 = r1.optBoolean(r10, r9)     // Catch:{ Exception -> 0x0352 }
            java.lang.String r9 = "timeToDeleteOldWaterfallAfterAuction"
            r10 = 30000(0x7530, float:4.2039E-41)
            int r76 = r1.optInt(r9, r10)     // Catch:{ Exception -> 0x0352 }
            com.ironsource.mediationsdk.utils.c r9 = new com.ironsource.mediationsdk.utils.c     // Catch:{ Exception -> 0x0352 }
            r10 = r6
            r46 = r7
            long r6 = (long) r4     // Catch:{ Exception -> 0x0352 }
            r66 = r6
            long r6 = (long) r13     // Catch:{ Exception -> 0x0352 }
            r68 = r6
            long r6 = (long) r14     // Catch:{ Exception -> 0x0352 }
            r70 = r6
            long r6 = (long) r2     // Catch:{ Exception -> 0x0352 }
            r72 = r6
            r81 = 0
            r58 = r9
            r58.<init>(r59, r60, r61, r62, r63, r65, r66, r68, r70, r72, r74, r75, r76, r77, r78, r79, r80, r81)     // Catch:{ Exception -> 0x0352 }
            java.lang.String r2 = "disableLoadWhileShowSupportFor"
            org.json.JSONArray r1 = r1.optJSONArray(r2)     // Catch:{ Exception -> 0x0352 }
            if (r1 == 0) goto L_0x029d
            r2 = 0
        L_0x0285:
            int r4 = r1.length()     // Catch:{ Exception -> 0x0352 }
            if (r2 >= r4) goto L_0x029d
            java.lang.String r4 = r1.optString(r2)     // Catch:{ Exception -> 0x0352 }
            boolean r6 = android.text.TextUtils.isEmpty(r4)     // Catch:{ Exception -> 0x0352 }
            if (r6 != 0) goto L_0x029a
            java.util.ArrayList<java.lang.String> r6 = r9.f17683o     // Catch:{ Exception -> 0x0352 }
            r6.add(r4)     // Catch:{ Exception -> 0x0352 }
        L_0x029a:
            int r2 = r2 + 1
            goto L_0x0285
        L_0x029d:
            r42 = r9
            goto L_0x02ae
        L_0x02a0:
            r10 = r6
            r46 = r7
            r45 = r9
            r44 = r14
            com.ironsource.mediationsdk.utils.c r1 = new com.ironsource.mediationsdk.utils.c     // Catch:{ Exception -> 0x0352 }
            r1.<init>()     // Catch:{ Exception -> 0x0352 }
            r42 = r1
        L_0x02ae:
            com.ironsource.mediationsdk.model.o r1 = new com.ironsource.mediationsdk.model.o     // Catch:{ Exception -> 0x0352 }
            r35 = r1
            r35.<init>(r36, r37, r38, r39, r40, r41, r42, r43)     // Catch:{ Exception -> 0x0352 }
            if (r33 == 0) goto L_0x0331
            r2 = 0
        L_0x02b8:
            int r4 = r33.length()     // Catch:{ Exception -> 0x0352 }
            if (r2 >= r4) goto L_0x0331
            r4 = r33
            org.json.JSONObject r6 = r4.optJSONObject(r2)     // Catch:{ Exception -> 0x0352 }
            if (r6 == 0) goto L_0x0311
            java.lang.String r7 = "placementId"
            r9 = -1
            int r36 = r6.optInt(r7, r9)     // Catch:{ Exception -> 0x0352 }
            java.lang.String r7 = "placementName"
            java.lang.String r37 = r6.optString(r7, r11)     // Catch:{ Exception -> 0x0352 }
            java.lang.String r7 = "isDefault"
            r9 = 0
            boolean r38 = r6.optBoolean(r7, r9)     // Catch:{ Exception -> 0x0352 }
            java.lang.String r7 = "virtualItemName"
            java.lang.String r39 = r6.optString(r7, r11)     // Catch:{ Exception -> 0x0352 }
            java.lang.String r7 = "virtualItemCount"
            r9 = -1
            int r40 = r6.optInt(r7, r9)     // Catch:{ Exception -> 0x0352 }
            com.ironsource.mediationsdk.model.k r6 = m20627a((org.json.JSONObject) r6)     // Catch:{ Exception -> 0x0352 }
            if (r36 < 0) goto L_0x0311
            boolean r7 = android.text.TextUtils.isEmpty(r37)     // Catch:{ Exception -> 0x0352 }
            if (r7 != 0) goto L_0x0311
            boolean r7 = android.text.TextUtils.isEmpty(r39)     // Catch:{ Exception -> 0x0352 }
            if (r7 != 0) goto L_0x0311
            if (r40 <= 0) goto L_0x0311
            com.ironsource.mediationsdk.model.Placement r7 = new com.ironsource.mediationsdk.model.Placement     // Catch:{ Exception -> 0x0352 }
            r35 = r7
            r41 = r6
            r35.<init>(r36, r37, r38, r39, r40, r41)     // Catch:{ Exception -> 0x0352 }
            if (r6 == 0) goto L_0x030e
            r6 = r82
            android.content.Context r9 = r6.f17848bw     // Catch:{ Exception -> 0x058a }
            com.ironsource.mediationsdk.utils.C6774k.m20603a((android.content.Context) r9, (com.ironsource.mediationsdk.model.Placement) r7)     // Catch:{ Exception -> 0x058a }
            goto L_0x0315
        L_0x030e:
            r6 = r82
            goto L_0x0315
        L_0x0311:
            r6 = r82
            r7 = r29
        L_0x0315:
            if (r7 == 0) goto L_0x032c
            if (r7 == 0) goto L_0x032c
            java.util.ArrayList<com.ironsource.mediationsdk.model.Placement> r9 = r1.f17543a     // Catch:{ Exception -> 0x058a }
            r9.add(r7)     // Catch:{ Exception -> 0x058a }
            com.ironsource.mediationsdk.model.Placement r9 = r1.f17553k     // Catch:{ Exception -> 0x058a }
            if (r9 != 0) goto L_0x0325
        L_0x0322:
            r1.f17553k = r7     // Catch:{ Exception -> 0x058a }
            goto L_0x032c
        L_0x0325:
            int r9 = r7.getPlacementId()     // Catch:{ Exception -> 0x058a }
            if (r9 != 0) goto L_0x032c
            goto L_0x0322
        L_0x032c:
            int r2 = r2 + 1
            r33 = r4
            goto L_0x02b8
        L_0x0331:
            r6 = r82
            java.lang.String r2 = "backFill"
            java.lang.String r2 = r5.optString(r2)     // Catch:{ Exception -> 0x058a }
            boolean r4 = android.text.TextUtils.isEmpty(r2)     // Catch:{ Exception -> 0x058a }
            if (r4 != 0) goto L_0x0341
            r1.f17548f = r2     // Catch:{ Exception -> 0x058a }
        L_0x0341:
            java.lang.String r2 = "premium"
            java.lang.String r2 = r5.optString(r2)     // Catch:{ Exception -> 0x058a }
            boolean r4 = android.text.TextUtils.isEmpty(r2)     // Catch:{ Exception -> 0x058a }
            if (r4 != 0) goto L_0x034f
            r1.f17549g = r2     // Catch:{ Exception -> 0x058a }
        L_0x034f:
            r36 = r1
            goto L_0x036a
        L_0x0352:
            r0 = move-exception
            r6 = r82
            goto L_0x0ac6
        L_0x0357:
            r34 = r1
            r32 = r2
            r46 = r7
            r45 = r9
            r31 = r10
            r57 = r13
            r44 = r14
            r10 = r6
            r6 = r82
            r36 = r29
        L_0x036a:
            if (r21 == 0) goto L_0x058d
            r1 = r21
            r2 = r31
            org.json.JSONArray r4 = r1.optJSONArray(r2)     // Catch:{ Exception -> 0x058a }
            r5 = r32
            org.json.JSONObject r7 = m20629b(r1, r5)     // Catch:{ Exception -> 0x058a }
            java.lang.String r9 = "maxNumOfAdaptersToLoadOnStart"
            r13 = 2
            int r9 = m20626a(r1, r3, r9, r13)     // Catch:{ Exception -> 0x058a }
            java.lang.String r13 = "advancedLoading"
            r14 = 0
            int r13 = m20626a(r1, r3, r13, r14)     // Catch:{ Exception -> 0x058a }
            if (r13 <= 0) goto L_0x038f
            r38 = r13
            r39 = 1
            goto L_0x0393
        L_0x038f:
            r38 = r9
            r39 = 0
        L_0x0393:
            java.lang.String r9 = "adapterTimeOutInSeconds"
            r13 = 60
            int r40 = m20626a(r1, r3, r9, r13)     // Catch:{ Exception -> 0x058a }
            java.lang.String r9 = "delayLoadFailure"
            r13 = 3
            int r43 = m20626a(r1, r3, r9, r13)     // Catch:{ Exception -> 0x058a }
            org.json.JSONObject r7 = com.ironsource.mediationsdk.utils.IronSourceUtils.mergeJsons(r7, r8)     // Catch:{ Exception -> 0x058a }
            r9 = 0
            boolean r60 = r7.optBoolean(r15, r9)     // Catch:{ Exception -> 0x058a }
            boolean r61 = r7.optBoolean(r12, r9)     // Catch:{ Exception -> 0x058a }
            r9 = r46
            java.lang.String r62 = r7.optString(r9, r11)     // Catch:{ Exception -> 0x058a }
            java.lang.String r63 = r7.optString(r10, r11)     // Catch:{ Exception -> 0x058a }
            r13 = r45
            r14 = -1
            int r64 = r7.optInt(r13, r14)     // Catch:{ Exception -> 0x058a }
            r45 = r13
            r13 = r44
            int r65 = r7.optInt(r13, r14)     // Catch:{ Exception -> 0x058a }
            r44 = r13
            r14 = r57
            r13 = 5000(0x1388, float:7.006E-42)
            int r66 = r7.optInt(r14, r13)     // Catch:{ Exception -> 0x058a }
            r57 = r14
            r13 = r34
            org.json.JSONArray r14 = r7.optJSONArray(r13)     // Catch:{ Exception -> 0x058a }
            if (r14 == 0) goto L_0x03fb
            r34 = r13
            int r13 = r14.length()     // Catch:{ Exception -> 0x058a }
            int[] r13 = new int[r13]     // Catch:{ Exception -> 0x058a }
            r46 = r9
            r21 = r10
            r10 = 0
        L_0x03e9:
            int r9 = r14.length()     // Catch:{ Exception -> 0x058a }
            if (r10 >= r9) goto L_0x03f8
            int r9 = r14.optInt(r10)     // Catch:{ Exception -> 0x058a }
            r13[r10] = r9     // Catch:{ Exception -> 0x058a }
            int r10 = r10 + 1
            goto L_0x03e9
        L_0x03f8:
            r67 = r13
            goto L_0x0403
        L_0x03fb:
            r46 = r9
            r21 = r10
            r34 = r13
            r67 = r29
        L_0x0403:
            r9 = r30
            org.json.JSONArray r10 = r7.optJSONArray(r9)     // Catch:{ Exception -> 0x058a }
            if (r10 == 0) goto L_0x0426
            int r13 = r10.length()     // Catch:{ Exception -> 0x058a }
            int[] r13 = new int[r13]     // Catch:{ Exception -> 0x058a }
            r30 = r9
            r14 = 0
        L_0x0414:
            int r9 = r10.length()     // Catch:{ Exception -> 0x058a }
            if (r14 >= r9) goto L_0x0423
            int r9 = r10.optInt(r14)     // Catch:{ Exception -> 0x058a }
            r13[r14] = r9     // Catch:{ Exception -> 0x058a }
            int r14 = r14 + 1
            goto L_0x0414
        L_0x0423:
            r68 = r13
            goto L_0x042a
        L_0x0426:
            r30 = r9
            r68 = r29
        L_0x042a:
            r9 = r28
            org.json.JSONArray r10 = r7.optJSONArray(r9)     // Catch:{ Exception -> 0x058a }
            if (r10 == 0) goto L_0x044d
            int r13 = r10.length()     // Catch:{ Exception -> 0x058a }
            int[] r13 = new int[r13]     // Catch:{ Exception -> 0x058a }
            r28 = r9
            r14 = 0
        L_0x043b:
            int r9 = r10.length()     // Catch:{ Exception -> 0x058a }
            if (r14 >= r9) goto L_0x044a
            int r9 = r10.optInt(r14)     // Catch:{ Exception -> 0x058a }
            r13[r14] = r9     // Catch:{ Exception -> 0x058a }
            int r14 = r14 + 1
            goto L_0x043b
        L_0x044a:
            r69 = r13
            goto L_0x0451
        L_0x044d:
            r28 = r9
            r69 = r29
        L_0x0451:
            java.lang.String r9 = "nonConnectivityEvents"
            org.json.JSONArray r7 = r7.optJSONArray(r9)     // Catch:{ Exception -> 0x058a }
            if (r7 == 0) goto L_0x0472
            int r9 = r7.length()     // Catch:{ Exception -> 0x058a }
            int[] r9 = new int[r9]     // Catch:{ Exception -> 0x058a }
            r10 = 0
        L_0x0460:
            int r13 = r7.length()     // Catch:{ Exception -> 0x058a }
            if (r10 >= r13) goto L_0x046f
            int r13 = r7.optInt(r10)     // Catch:{ Exception -> 0x058a }
            r9[r10] = r13     // Catch:{ Exception -> 0x058a }
            int r10 = r10 + 1
            goto L_0x0460
        L_0x046f:
            r70 = r9
            goto L_0x0474
        L_0x0472:
            r70 = r29
        L_0x0474:
            com.ironsource.sdk.g.d r41 = new com.ironsource.sdk.g.d     // Catch:{ Exception -> 0x058a }
            r59 = 0
            r58 = r41
            r58.<init>(r59, r60, r61, r62, r63, r64, r65, r66, r67, r68, r69, r70)     // Catch:{ Exception -> 0x058a }
            if (r27 == 0) goto L_0x04ed
            java.lang.String r7 = "interstitial"
            r9 = r27
            org.json.JSONObject r7 = m20629b(r9, r7)     // Catch:{ Exception -> 0x058a }
            java.lang.String r10 = "auctionData"
            java.lang.String r59 = r9.optString(r10, r11)     // Catch:{ Exception -> 0x058a }
            java.lang.String r10 = "auctioneerURL"
            java.lang.String r60 = r9.optString(r10, r11)     // Catch:{ Exception -> 0x058a }
            java.lang.String r10 = "auctionTrials"
            r13 = 2
            int r61 = r9.optInt(r10, r13)     // Catch:{ Exception -> 0x058a }
            java.lang.String r10 = "auctionSavedHistory"
            r13 = 15
            int r62 = r9.optInt(r10, r13)     // Catch:{ Exception -> 0x058a }
            java.lang.String r10 = "auctionTimeout"
            r13 = 10000(0x2710, double:4.9407E-320)
            long r63 = r9.optLong(r10, r13)     // Catch:{ Exception -> 0x058a }
            java.lang.String r10 = "compressAuctionRequest"
            r13 = 0
            boolean r77 = r9.optBoolean(r10, r13)     // Catch:{ Exception -> 0x058a }
            java.lang.String r10 = "compressAuctionResponse"
            boolean r78 = r9.optBoolean(r10, r13)     // Catch:{ Exception -> 0x058a }
            java.lang.String r10 = "encryptionVersion"
            r14 = 1
            int r80 = r9.optInt(r10, r14)     // Catch:{ Exception -> 0x058a }
            java.lang.String r10 = "programmatic"
            boolean r65 = r7.optBoolean(r10, r13)     // Catch:{ Exception -> 0x058a }
            java.lang.String r10 = "objectPerWaterfall"
            boolean r79 = r7.optBoolean(r10, r13)     // Catch:{ Exception -> 0x058a }
            java.lang.String r10 = "minTimeBeforeFirstAuction"
            r13 = 2000(0x7d0, float:2.803E-42)
            int r7 = r7.optInt(r10, r13)     // Catch:{ Exception -> 0x058a }
            com.ironsource.mediationsdk.utils.c r10 = new com.ironsource.mediationsdk.utils.c     // Catch:{ Exception -> 0x058a }
            long r13 = (long) r7     // Catch:{ Exception -> 0x058a }
            r66 = r13
            r68 = 0
            r70 = 0
            r72 = 0
            r74 = 1
            r75 = 1
            r76 = 0
            r81 = 0
            r58 = r10
            r58.<init>(r59, r60, r61, r62, r63, r65, r66, r68, r70, r72, r74, r75, r76, r77, r78, r79, r80, r81)     // Catch:{ Exception -> 0x058a }
            r42 = r10
            goto L_0x04f6
        L_0x04ed:
            r9 = r27
            com.ironsource.mediationsdk.utils.c r7 = new com.ironsource.mediationsdk.utils.c     // Catch:{ Exception -> 0x058a }
            r7.<init>()     // Catch:{ Exception -> 0x058a }
            r42 = r7
        L_0x04f6:
            com.ironsource.mediationsdk.model.h r7 = new com.ironsource.mediationsdk.model.h     // Catch:{ Exception -> 0x058a }
            r37 = r7
            r37.<init>(r38, r39, r40, r41, r42, r43)     // Catch:{ Exception -> 0x058a }
            if (r4 == 0) goto L_0x0567
            r10 = 0
        L_0x0500:
            int r13 = r4.length()     // Catch:{ Exception -> 0x058a }
            if (r10 >= r13) goto L_0x0567
            org.json.JSONObject r13 = r4.optJSONObject(r10)     // Catch:{ Exception -> 0x058a }
            if (r13 == 0) goto L_0x053f
            java.lang.String r14 = "placementId"
            r27 = r4
            r4 = -1
            int r14 = r13.optInt(r14, r4)     // Catch:{ Exception -> 0x058a }
            java.lang.String r4 = "placementName"
            java.lang.String r4 = r13.optString(r4, r11)     // Catch:{ Exception -> 0x058a }
            r31 = r9
            java.lang.String r9 = "isDefault"
            r32 = r11
            r11 = 0
            boolean r9 = r13.optBoolean(r9, r11)     // Catch:{ Exception -> 0x058a }
            com.ironsource.mediationsdk.model.k r11 = m20627a((org.json.JSONObject) r13)     // Catch:{ Exception -> 0x058a }
            if (r14 < 0) goto L_0x0545
            boolean r13 = android.text.TextUtils.isEmpty(r4)     // Catch:{ Exception -> 0x058a }
            if (r13 != 0) goto L_0x0545
            com.ironsource.mediationsdk.model.InterstitialPlacement r13 = new com.ironsource.mediationsdk.model.InterstitialPlacement     // Catch:{ Exception -> 0x058a }
            r13.<init>(r14, r4, r9, r11)     // Catch:{ Exception -> 0x058a }
            if (r11 == 0) goto L_0x0547
            android.content.Context r4 = r6.f17848bw     // Catch:{ Exception -> 0x058a }
            com.ironsource.mediationsdk.utils.C6774k.m20602a((android.content.Context) r4, (com.ironsource.mediationsdk.model.InterstitialPlacement) r13)     // Catch:{ Exception -> 0x058a }
            goto L_0x0547
        L_0x053f:
            r27 = r4
            r31 = r9
            r32 = r11
        L_0x0545:
            r13 = r29
        L_0x0547:
            if (r13 == 0) goto L_0x055e
            if (r13 == 0) goto L_0x055e
            java.util.ArrayList<com.ironsource.mediationsdk.model.InterstitialPlacement> r4 = r7.f17501a     // Catch:{ Exception -> 0x058a }
            r4.add(r13)     // Catch:{ Exception -> 0x058a }
            com.ironsource.mediationsdk.model.InterstitialPlacement r4 = r7.f17510j     // Catch:{ Exception -> 0x058a }
            if (r4 != 0) goto L_0x0557
        L_0x0554:
            r7.f17510j = r13     // Catch:{ Exception -> 0x058a }
            goto L_0x055e
        L_0x0557:
            int r4 = r13.getPlacementId()     // Catch:{ Exception -> 0x058a }
            if (r4 != 0) goto L_0x055e
            goto L_0x0554
        L_0x055e:
            int r10 = r10 + 1
            r4 = r27
            r9 = r31
            r11 = r32
            goto L_0x0500
        L_0x0567:
            r31 = r9
            r32 = r11
            java.lang.String r4 = "backFill"
            java.lang.String r4 = r1.optString(r4)     // Catch:{ Exception -> 0x058a }
            boolean r9 = android.text.TextUtils.isEmpty(r4)     // Catch:{ Exception -> 0x058a }
            if (r9 != 0) goto L_0x0579
            r7.f17507g = r4     // Catch:{ Exception -> 0x058a }
        L_0x0579:
            java.lang.String r4 = "premium"
            java.lang.String r1 = r1.optString(r4)     // Catch:{ Exception -> 0x058a }
            boolean r4 = android.text.TextUtils.isEmpty(r1)     // Catch:{ Exception -> 0x058a }
            if (r4 != 0) goto L_0x0587
            r7.f17508h = r1     // Catch:{ Exception -> 0x058a }
        L_0x0587:
            r37 = r7
            goto L_0x0599
        L_0x058a:
            r0 = move-exception
            goto L_0x0ac6
        L_0x058d:
            r21 = r10
            r2 = r31
            r5 = r32
            r32 = r11
            r31 = r27
            r37 = r29
        L_0x0599:
            if (r26 == 0) goto L_0x07b4
            r1 = r26
            org.json.JSONArray r4 = r1.optJSONArray(r2)     // Catch:{ Exception -> 0x058a }
            org.json.JSONObject r7 = m20629b(r1, r5)     // Catch:{ Exception -> 0x058a }
            java.lang.String r9 = "maxNumOfAdaptersToLoadOnStart"
            r10 = 1
            int r48 = m20626a(r1, r3, r9, r10)     // Catch:{ Exception -> 0x058a }
            java.lang.String r9 = "atim"
            boolean r10 = r1.has(r9)     // Catch:{ Exception -> 0x058a }
            r13 = 0
            if (r10 == 0) goto L_0x05bb
            long r9 = r1.optLong(r9, r13)     // Catch:{ Exception -> 0x058a }
            goto L_0x05c7
        L_0x05bb:
            boolean r10 = r3.has(r9)     // Catch:{ Exception -> 0x058a }
            if (r10 == 0) goto L_0x05c6
            long r9 = r3.optLong(r9, r13)     // Catch:{ Exception -> 0x058a }
            goto L_0x05c7
        L_0x05c6:
            r9 = r13
        L_0x05c7:
            int r11 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            if (r11 != 0) goto L_0x05ce
            r49 = 10000(0x2710, double:4.9407E-320)
            goto L_0x05d0
        L_0x05ce:
            r49 = r9
        L_0x05d0:
            java.lang.String r9 = "delayLoadFailure"
            r10 = 3
            int r54 = m20626a(r1, r3, r9, r10)     // Catch:{ Exception -> 0x058a }
            java.lang.String r9 = "bannerInterval"
            r10 = 60
            int r52 = m20626a(r1, r3, r9, r10)     // Catch:{ Exception -> 0x058a }
            org.json.JSONObject r1 = com.ironsource.mediationsdk.utils.IronSourceUtils.mergeJsons(r7, r8)     // Catch:{ Exception -> 0x058a }
            r7 = 0
            boolean r60 = r1.optBoolean(r15, r7)     // Catch:{ Exception -> 0x058a }
            boolean r61 = r1.optBoolean(r12, r7)     // Catch:{ Exception -> 0x058a }
            r9 = r32
            r7 = r46
            java.lang.String r62 = r1.optString(r7, r9)     // Catch:{ Exception -> 0x058a }
            r10 = r21
            java.lang.String r63 = r1.optString(r10, r9)     // Catch:{ Exception -> 0x058a }
            r11 = r45
            r13 = -1
            int r64 = r1.optInt(r11, r13)     // Catch:{ Exception -> 0x058a }
            r14 = r44
            int r65 = r1.optInt(r14, r13)     // Catch:{ Exception -> 0x058a }
            r21 = r3
            r13 = r57
            r3 = 5000(0x1388, float:7.006E-42)
            int r66 = r1.optInt(r13, r3)     // Catch:{ Exception -> 0x058a }
            r26 = r2
            r3 = r34
            org.json.JSONArray r2 = r1.optJSONArray(r3)     // Catch:{ Exception -> 0x058a }
            if (r2 == 0) goto L_0x063a
            r34 = r3
            int r3 = r2.length()     // Catch:{ Exception -> 0x058a }
            int[] r3 = new int[r3]     // Catch:{ Exception -> 0x058a }
            r57 = r13
            r44 = r14
            r13 = 0
        L_0x0628:
            int r14 = r2.length()     // Catch:{ Exception -> 0x058a }
            if (r13 >= r14) goto L_0x0637
            int r14 = r2.optInt(r13)     // Catch:{ Exception -> 0x058a }
            r3[r13] = r14     // Catch:{ Exception -> 0x058a }
            int r13 = r13 + 1
            goto L_0x0628
        L_0x0637:
            r67 = r3
            goto L_0x0642
        L_0x063a:
            r34 = r3
            r57 = r13
            r44 = r14
            r67 = r29
        L_0x0642:
            r2 = r30
            org.json.JSONArray r3 = r1.optJSONArray(r2)     // Catch:{ Exception -> 0x058a }
            if (r3 == 0) goto L_0x0665
            int r13 = r3.length()     // Catch:{ Exception -> 0x058a }
            int[] r13 = new int[r13]     // Catch:{ Exception -> 0x058a }
            r30 = r2
            r14 = 0
        L_0x0653:
            int r2 = r3.length()     // Catch:{ Exception -> 0x058a }
            if (r14 >= r2) goto L_0x0662
            int r2 = r3.optInt(r14)     // Catch:{ Exception -> 0x058a }
            r13[r14] = r2     // Catch:{ Exception -> 0x058a }
            int r14 = r14 + 1
            goto L_0x0653
        L_0x0662:
            r68 = r13
            goto L_0x0669
        L_0x0665:
            r30 = r2
            r68 = r29
        L_0x0669:
            r2 = r28
            org.json.JSONArray r3 = r1.optJSONArray(r2)     // Catch:{ Exception -> 0x058a }
            if (r3 == 0) goto L_0x068c
            int r13 = r3.length()     // Catch:{ Exception -> 0x058a }
            int[] r13 = new int[r13]     // Catch:{ Exception -> 0x058a }
            r28 = r2
            r14 = 0
        L_0x067a:
            int r2 = r3.length()     // Catch:{ Exception -> 0x058a }
            if (r14 >= r2) goto L_0x0689
            int r2 = r3.optInt(r14)     // Catch:{ Exception -> 0x058a }
            r13[r14] = r2     // Catch:{ Exception -> 0x058a }
            int r14 = r14 + 1
            goto L_0x067a
        L_0x0689:
            r69 = r13
            goto L_0x0690
        L_0x068c:
            r28 = r2
            r69 = r29
        L_0x0690:
            java.lang.String r2 = "nonConnectivityEvents"
            org.json.JSONArray r1 = r1.optJSONArray(r2)     // Catch:{ Exception -> 0x058a }
            if (r1 == 0) goto L_0x06b1
            int r2 = r1.length()     // Catch:{ Exception -> 0x058a }
            int[] r2 = new int[r2]     // Catch:{ Exception -> 0x058a }
            r3 = 0
        L_0x069f:
            int r13 = r1.length()     // Catch:{ Exception -> 0x058a }
            if (r3 >= r13) goto L_0x06ae
            int r13 = r1.optInt(r3)     // Catch:{ Exception -> 0x058a }
            r2[r3] = r13     // Catch:{ Exception -> 0x058a }
            int r3 = r3 + 1
            goto L_0x069f
        L_0x06ae:
            r70 = r2
            goto L_0x06b3
        L_0x06b1:
            r70 = r29
        L_0x06b3:
            com.ironsource.sdk.g.d r51 = new com.ironsource.sdk.g.d     // Catch:{ Exception -> 0x058a }
            r59 = 0
            r58 = r51
            r58.<init>(r59, r60, r61, r62, r63, r64, r65, r66, r67, r68, r69, r70)     // Catch:{ Exception -> 0x058a }
            if (r31 == 0) goto L_0x0733
            java.lang.String r1 = "banner"
            r2 = r31
            org.json.JSONObject r1 = m20629b(r2, r1)     // Catch:{ Exception -> 0x058a }
            if (r1 == 0) goto L_0x072d
            java.lang.String r3 = "auctionData"
            java.lang.String r59 = r2.optString(r3, r9)     // Catch:{ Exception -> 0x058a }
            java.lang.String r3 = "auctioneerURL"
            java.lang.String r60 = r2.optString(r3, r9)     // Catch:{ Exception -> 0x058a }
            java.lang.String r3 = "auctionTrials"
            r13 = 2
            int r61 = r2.optInt(r3, r13)     // Catch:{ Exception -> 0x058a }
            java.lang.String r3 = "auctionSavedHistory"
            r13 = 15
            int r62 = r2.optInt(r3, r13)     // Catch:{ Exception -> 0x058a }
            java.lang.String r3 = "auctionTimeout"
            r13 = 10000(0x2710, double:4.9407E-320)
            long r63 = r2.optLong(r3, r13)     // Catch:{ Exception -> 0x058a }
            java.lang.String r3 = "compressAuctionRequest"
            r13 = 0
            boolean r77 = r2.optBoolean(r3, r13)     // Catch:{ Exception -> 0x058a }
            java.lang.String r3 = "compressAuctionResponse"
            boolean r78 = r2.optBoolean(r3, r13)     // Catch:{ Exception -> 0x058a }
            java.lang.String r3 = "encryptionVersion"
            r14 = 1
            int r80 = r2.optInt(r3, r14)     // Catch:{ Exception -> 0x058a }
            java.lang.String r3 = "programmatic"
            boolean r65 = r1.optBoolean(r3, r13)     // Catch:{ Exception -> 0x058a }
            java.lang.String r3 = "minTimeBeforeFirstAuction"
            r13 = 2000(0x7d0, float:2.803E-42)
            int r3 = r1.optInt(r3, r13)     // Catch:{ Exception -> 0x058a }
            java.lang.String r13 = "shouldSendBannerBURLFromImpression"
            r14 = 1
            boolean r81 = r1.optBoolean(r13, r14)     // Catch:{ Exception -> 0x058a }
            com.ironsource.mediationsdk.utils.c r1 = new com.ironsource.mediationsdk.utils.c     // Catch:{ Exception -> 0x058a }
            long r13 = (long) r3     // Catch:{ Exception -> 0x058a }
            r66 = r13
            r68 = 0
            r70 = 0
            r72 = 0
            r74 = 1
            r75 = 1
            r76 = 0
            r79 = 0
            r58 = r1
            r58.<init>(r59, r60, r61, r62, r63, r65, r66, r68, r70, r72, r74, r75, r76, r77, r78, r79, r80, r81)     // Catch:{ Exception -> 0x058a }
            goto L_0x073a
        L_0x072d:
            com.ironsource.mediationsdk.utils.c r1 = new com.ironsource.mediationsdk.utils.c     // Catch:{ Exception -> 0x058a }
            r1.<init>()     // Catch:{ Exception -> 0x058a }
            goto L_0x073a
        L_0x0733:
            r2 = r31
            com.ironsource.mediationsdk.utils.c r1 = new com.ironsource.mediationsdk.utils.c     // Catch:{ Exception -> 0x058a }
            r1.<init>()     // Catch:{ Exception -> 0x058a }
        L_0x073a:
            r53 = r1
            com.ironsource.mediationsdk.model.e r1 = new com.ironsource.mediationsdk.model.e     // Catch:{ Exception -> 0x058a }
            r47 = r1
            r47.<init>(r48, r49, r51, r52, r53, r54)     // Catch:{ Exception -> 0x058a }
            if (r4 == 0) goto L_0x07ad
            r3 = 0
        L_0x0746:
            int r13 = r4.length()     // Catch:{ Exception -> 0x058a }
            if (r3 >= r13) goto L_0x07ad
            org.json.JSONObject r13 = r4.optJSONObject(r3)     // Catch:{ Exception -> 0x058a }
            if (r13 == 0) goto L_0x0785
            java.lang.String r14 = "placementId"
            r23 = r4
            r4 = -1
            int r14 = r13.optInt(r14, r4)     // Catch:{ Exception -> 0x058a }
            java.lang.String r4 = "placementName"
            java.lang.String r4 = r13.optString(r4, r9)     // Catch:{ Exception -> 0x058a }
            r27 = r2
            java.lang.String r2 = "isDefault"
            r45 = r11
            r11 = 0
            boolean r2 = r13.optBoolean(r2, r11)     // Catch:{ Exception -> 0x058a }
            com.ironsource.mediationsdk.model.k r11 = m20627a((org.json.JSONObject) r13)     // Catch:{ Exception -> 0x058a }
            if (r14 < 0) goto L_0x078b
            boolean r13 = android.text.TextUtils.isEmpty(r4)     // Catch:{ Exception -> 0x058a }
            if (r13 != 0) goto L_0x078b
            com.ironsource.mediationsdk.model.f r13 = new com.ironsource.mediationsdk.model.f     // Catch:{ Exception -> 0x058a }
            r13.<init>(r14, r4, r2, r11)     // Catch:{ Exception -> 0x058a }
            if (r11 == 0) goto L_0x078d
            android.content.Context r2 = r6.f17848bw     // Catch:{ Exception -> 0x058a }
            com.ironsource.mediationsdk.utils.C6774k.m20604a((android.content.Context) r2, (com.ironsource.mediationsdk.model.C6696f) r13)     // Catch:{ Exception -> 0x058a }
            goto L_0x078d
        L_0x0785:
            r27 = r2
            r23 = r4
            r45 = r11
        L_0x078b:
            r13 = r29
        L_0x078d:
            if (r13 == 0) goto L_0x07a4
            if (r13 == 0) goto L_0x07a4
            java.util.ArrayList<com.ironsource.mediationsdk.model.f> r2 = r1.f17490c     // Catch:{ Exception -> 0x058a }
            r2.add(r13)     // Catch:{ Exception -> 0x058a }
            com.ironsource.mediationsdk.model.f r2 = r1.f17491d     // Catch:{ Exception -> 0x058a }
            if (r2 != 0) goto L_0x079d
        L_0x079a:
            r1.f17491d = r13     // Catch:{ Exception -> 0x058a }
            goto L_0x07a4
        L_0x079d:
            int r2 = r13.getPlacementId()     // Catch:{ Exception -> 0x058a }
            if (r2 != 0) goto L_0x07a4
            goto L_0x079a
        L_0x07a4:
            int r3 = r3 + 1
            r4 = r23
            r2 = r27
            r11 = r45
            goto L_0x0746
        L_0x07ad:
            r27 = r2
            r45 = r11
            r39 = r1
            goto L_0x07c2
        L_0x07b4:
            r26 = r2
            r10 = r21
            r27 = r31
            r9 = r32
            r7 = r46
            r21 = r3
            r39 = r29
        L_0x07c2:
            if (r22 == 0) goto L_0x08e4
            r1 = r22
            org.json.JSONObject r2 = m20629b(r1, r5)     // Catch:{ Exception -> 0x058a }
            org.json.JSONObject r2 = com.ironsource.mediationsdk.utils.IronSourceUtils.mergeJsons(r2, r8)     // Catch:{ Exception -> 0x058a }
            r3 = 0
            boolean r60 = r2.optBoolean(r15, r3)     // Catch:{ Exception -> 0x058a }
            boolean r61 = r2.optBoolean(r12, r3)     // Catch:{ Exception -> 0x058a }
            java.lang.String r62 = r2.optString(r7, r9)     // Catch:{ Exception -> 0x058a }
            java.lang.String r63 = r2.optString(r10, r9)     // Catch:{ Exception -> 0x058a }
            r3 = r45
            r4 = -1
            int r64 = r2.optInt(r3, r4)     // Catch:{ Exception -> 0x058a }
            r3 = r44
            int r65 = r2.optInt(r3, r4)     // Catch:{ Exception -> 0x058a }
            r3 = r57
            r4 = 5000(0x1388, float:7.006E-42)
            int r66 = r2.optInt(r3, r4)     // Catch:{ Exception -> 0x058a }
            r3 = r34
            org.json.JSONArray r4 = r2.optJSONArray(r3)     // Catch:{ Exception -> 0x058a }
            if (r4 == 0) goto L_0x0815
            int r7 = r4.length()     // Catch:{ Exception -> 0x058a }
            int[] r7 = new int[r7]     // Catch:{ Exception -> 0x058a }
            r10 = 0
        L_0x0803:
            int r11 = r4.length()     // Catch:{ Exception -> 0x058a }
            if (r10 >= r11) goto L_0x0812
            int r11 = r4.optInt(r10)     // Catch:{ Exception -> 0x058a }
            r7[r10] = r11     // Catch:{ Exception -> 0x058a }
            int r10 = r10 + 1
            goto L_0x0803
        L_0x0812:
            r67 = r7
            goto L_0x0817
        L_0x0815:
            r67 = r29
        L_0x0817:
            r4 = r30
            org.json.JSONArray r7 = r2.optJSONArray(r4)     // Catch:{ Exception -> 0x058a }
            if (r7 == 0) goto L_0x0838
            int r10 = r7.length()     // Catch:{ Exception -> 0x058a }
            int[] r10 = new int[r10]     // Catch:{ Exception -> 0x058a }
            r11 = 0
        L_0x0826:
            int r13 = r7.length()     // Catch:{ Exception -> 0x058a }
            if (r11 >= r13) goto L_0x0835
            int r13 = r7.optInt(r11)     // Catch:{ Exception -> 0x058a }
            r10[r11] = r13     // Catch:{ Exception -> 0x058a }
            int r11 = r11 + 1
            goto L_0x0826
        L_0x0835:
            r68 = r10
            goto L_0x083a
        L_0x0838:
            r68 = r29
        L_0x083a:
            r7 = r28
            org.json.JSONArray r7 = r2.optJSONArray(r7)     // Catch:{ Exception -> 0x058a }
            if (r7 == 0) goto L_0x085b
            int r10 = r7.length()     // Catch:{ Exception -> 0x058a }
            int[] r10 = new int[r10]     // Catch:{ Exception -> 0x058a }
            r11 = 0
        L_0x0849:
            int r13 = r7.length()     // Catch:{ Exception -> 0x058a }
            if (r11 >= r13) goto L_0x0858
            int r13 = r7.optInt(r11)     // Catch:{ Exception -> 0x058a }
            r10[r11] = r13     // Catch:{ Exception -> 0x058a }
            int r11 = r11 + 1
            goto L_0x0849
        L_0x0858:
            r69 = r10
            goto L_0x085d
        L_0x085b:
            r69 = r29
        L_0x085d:
            java.lang.String r7 = "nonConnectivityEvents"
            org.json.JSONArray r2 = r2.optJSONArray(r7)     // Catch:{ Exception -> 0x058a }
            if (r2 == 0) goto L_0x087e
            int r7 = r2.length()     // Catch:{ Exception -> 0x058a }
            int[] r7 = new int[r7]     // Catch:{ Exception -> 0x058a }
            r10 = 0
        L_0x086c:
            int r11 = r2.length()     // Catch:{ Exception -> 0x058a }
            if (r10 >= r11) goto L_0x087b
            int r11 = r2.optInt(r10)     // Catch:{ Exception -> 0x058a }
            r7[r10] = r11     // Catch:{ Exception -> 0x058a }
            int r10 = r10 + 1
            goto L_0x086c
        L_0x087b:
            r70 = r7
            goto L_0x0880
        L_0x087e:
            r70 = r29
        L_0x0880:
            com.ironsource.sdk.g.d r2 = new com.ironsource.sdk.g.d     // Catch:{ Exception -> 0x058a }
            r59 = 0
            r58 = r2
            r58.<init>(r59, r60, r61, r62, r63, r64, r65, r66, r67, r68, r69, r70)     // Catch:{ Exception -> 0x058a }
            com.ironsource.mediationsdk.model.i r7 = new com.ironsource.mediationsdk.model.i     // Catch:{ Exception -> 0x058a }
            r7.<init>(r2)     // Catch:{ Exception -> 0x058a }
            r7.f17514d = r1     // Catch:{ Exception -> 0x058a }
            r2 = r26
            org.json.JSONArray r1 = r1.optJSONArray(r2)     // Catch:{ Exception -> 0x058a }
            if (r1 == 0) goto L_0x08e1
            r2 = 0
        L_0x0899:
            int r10 = r1.length()     // Catch:{ Exception -> 0x058a }
            if (r2 >= r10) goto L_0x08e1
            org.json.JSONObject r10 = r1.optJSONObject(r2)     // Catch:{ Exception -> 0x058a }
            if (r10 == 0) goto L_0x08c7
            java.lang.String r11 = "placementId"
            r13 = -1
            int r11 = r10.optInt(r11, r13)     // Catch:{ Exception -> 0x058a }
            java.lang.String r14 = "placementName"
            java.lang.String r14 = r10.optString(r14, r9)     // Catch:{ Exception -> 0x058a }
            java.lang.String r15 = "isDefault"
            r13 = 0
            boolean r10 = r10.optBoolean(r15, r13)     // Catch:{ Exception -> 0x058a }
            if (r11 < 0) goto L_0x08c7
            boolean r13 = android.text.TextUtils.isEmpty(r14)     // Catch:{ Exception -> 0x058a }
            if (r13 != 0) goto L_0x08c7
            com.ironsource.mediationsdk.model.j r13 = new com.ironsource.mediationsdk.model.j     // Catch:{ Exception -> 0x058a }
            r13.<init>(r11, r14, r10)     // Catch:{ Exception -> 0x058a }
            goto L_0x08c9
        L_0x08c7:
            r13 = r29
        L_0x08c9:
            if (r13 == 0) goto L_0x08de
            if (r13 == 0) goto L_0x08de
            java.util.ArrayList<com.ironsource.mediationsdk.model.j> r10 = r7.f17511a     // Catch:{ Exception -> 0x058a }
            r10.add(r13)     // Catch:{ Exception -> 0x058a }
            com.ironsource.mediationsdk.model.j r10 = r7.f17512b     // Catch:{ Exception -> 0x058a }
            if (r10 != 0) goto L_0x08d9
        L_0x08d6:
            r7.f17512b = r13     // Catch:{ Exception -> 0x058a }
            goto L_0x08de
        L_0x08d9:
            int r10 = r13.f17515a     // Catch:{ Exception -> 0x058a }
            if (r10 != 0) goto L_0x08de
            goto L_0x08d6
        L_0x08de:
            int r2 = r2 + 1
            goto L_0x0899
        L_0x08e1:
            r38 = r7
            goto L_0x08ea
        L_0x08e4:
            r4 = r30
            r3 = r34
            r38 = r29
        L_0x08ea:
            com.ironsource.mediationsdk.utils.p r1 = new com.ironsource.mediationsdk.utils.p     // Catch:{ Exception -> 0x058a }
            r1.<init>()     // Catch:{ Exception -> 0x058a }
            if (r25 == 0) goto L_0x0930
            java.lang.String r2 = "optInKeys"
            r7 = r25
            org.json.JSONArray r2 = r7.optJSONArray(r2)     // Catch:{ Exception -> 0x058a }
            if (r2 == 0) goto L_0x0914
            r10 = 0
        L_0x08fc:
            int r11 = r2.length()     // Catch:{ Exception -> 0x058a }
            if (r10 >= r11) goto L_0x0914
            java.lang.String r11 = r2.optString(r10)     // Catch:{ Exception -> 0x058a }
            boolean r13 = android.text.TextUtils.isEmpty(r11)     // Catch:{ Exception -> 0x058a }
            if (r13 != 0) goto L_0x0911
            java.util.ArrayList<java.lang.String> r13 = r1.f17888a     // Catch:{ Exception -> 0x058a }
            r13.add(r11)     // Catch:{ Exception -> 0x058a }
        L_0x0911:
            int r10 = r10 + 1
            goto L_0x08fc
        L_0x0914:
            java.lang.String r2 = "tokenGenericParams"
            org.json.JSONObject r2 = r7.optJSONObject(r2)     // Catch:{ Exception -> 0x058a }
            if (r2 == 0) goto L_0x091e
            r1.f17890c = r2     // Catch:{ Exception -> 0x058a }
        L_0x091e:
            java.lang.String r2 = "oneToken"
            r10 = 0
            boolean r2 = r7.optBoolean(r2, r10)     // Catch:{ Exception -> 0x058a }
            r1.f17891d = r2     // Catch:{ Exception -> 0x058a }
            java.lang.String r2 = "compressToken"
            r10 = 1
            boolean r2 = r7.optBoolean(r2, r10)     // Catch:{ Exception -> 0x058a }
            r1.f17892e = r2     // Catch:{ Exception -> 0x058a }
        L_0x0930:
            com.ironsource.mediationsdk.utils.j r2 = new com.ironsource.mediationsdk.utils.j     // Catch:{ Exception -> 0x058a }
            r2.<init>()     // Catch:{ Exception -> 0x058a }
            if (r24 == 0) goto L_0x0950
            java.lang.String r7 = "pixelEventsUrl"
            java.lang.String r10 = "https://outcome-ssp.supersonicads.com/mediation?adUnit=3"
            r11 = r24
            java.lang.String r7 = r11.optString(r7, r10)     // Catch:{ Exception -> 0x058a }
            java.lang.String r10 = "pixelEventsEnabled"
            r13 = 1
            boolean r14 = r11.optBoolean(r10, r13)     // Catch:{ Exception -> 0x058a }
            java.lang.String r10 = "<set-?>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r10)     // Catch:{ Exception -> 0x058a }
            r2.f17733b = r7     // Catch:{ Exception -> 0x058a }
            goto L_0x0951
        L_0x0950:
            r14 = 1
        L_0x0951:
            r2.f17732a = r14     // Catch:{ Exception -> 0x058a }
            if (r14 == 0) goto L_0x0968
            int[] r3 = m20628a(r8, r3)     // Catch:{ Exception -> 0x058a }
            r2.f17735d = r3     // Catch:{ Exception -> 0x058a }
            int[] r3 = m20628a(r8, r4)     // Catch:{ Exception -> 0x058a }
            r2.f17736e = r3     // Catch:{ Exception -> 0x058a }
            r3 = 0
            boolean r4 = r8.optBoolean(r12, r3)     // Catch:{ Exception -> 0x058a }
            r2.f17734c = r4     // Catch:{ Exception -> 0x058a }
        L_0x0968:
            java.lang.String r3 = "server"
            r4 = r20
            r7 = 3
            int r3 = r4.optInt(r3, r7)     // Catch:{ Exception -> 0x058a }
            java.lang.String r10 = "publisher"
            int r10 = r4.optInt(r10, r7)     // Catch:{ Exception -> 0x058a }
            java.lang.String r11 = "console"
            int r4 = r4.optInt(r11, r7)     // Catch:{ Exception -> 0x058a }
            com.ironsource.mediationsdk.model.d r7 = new com.ironsource.mediationsdk.model.d     // Catch:{ Exception -> 0x058a }
            r7.<init>(r3, r10, r4)     // Catch:{ Exception -> 0x058a }
            com.ironsource.sdk.controller.u r3 = new com.ironsource.sdk.controller.u     // Catch:{ Exception -> 0x058a }
            r3.<init>()     // Catch:{ Exception -> 0x058a }
            if (r19 == 0) goto L_0x09df
            java.lang.String r4 = "enabled"
            r10 = r19
            r11 = 0
            boolean r4 = r10.optBoolean(r4, r11)     // Catch:{ Exception -> 0x058a }
            r3.mo56599a((boolean) r4)     // Catch:{ Exception -> 0x058a }
            java.lang.String r4 = "reporterURL"
            java.lang.String r4 = r10.optString(r4, r9)     // Catch:{ Exception -> 0x058a }
            r3.mo56600b((java.lang.String) r4)     // Catch:{ Exception -> 0x058a }
            java.lang.String r4 = "reporterKeyword"
            java.lang.String r4 = r10.optString(r4, r9)     // Catch:{ Exception -> 0x058a }
            r3.mo56604c((java.lang.String) r4)     // Catch:{ Exception -> 0x058a }
            java.lang.String r4 = "includeANR"
            r11 = 0
            boolean r4 = r10.optBoolean(r4, r11)     // Catch:{ Exception -> 0x058a }
            r3.mo56601b((boolean) r4)     // Catch:{ Exception -> 0x058a }
            java.lang.String r4 = "timeout"
            r11 = 5000(0x1388, float:7.006E-42)
            int r4 = r10.optInt(r4, r11)     // Catch:{ Exception -> 0x058a }
            r3.mo56597a((int) r4)     // Catch:{ Exception -> 0x058a }
            java.lang.String r4 = "setIgnoreDebugger"
            r11 = 0
            boolean r4 = r10.optBoolean(r4, r11)     // Catch:{ Exception -> 0x058a }
            r3.mo56605c((boolean) r4)     // Catch:{ Exception -> 0x058a }
            java.lang.String r4 = "keysToInclude"
            org.json.JSONArray r4 = r10.optJSONArray(r4)     // Catch:{ Exception -> 0x058a }
            if (r4 == 0) goto L_0x09df
            r10 = 0
        L_0x09cf:
            int r11 = r4.length()     // Catch:{ Exception -> 0x058a }
            if (r10 >= r11) goto L_0x09df
            java.lang.String r11 = r4.optString(r10)     // Catch:{ Exception -> 0x058a }
            r3.mo56598a((java.lang.String) r11)     // Catch:{ Exception -> 0x058a }
            int r10 = r10 + 1
            goto L_0x09cf
        L_0x09df:
            if (r18 == 0) goto L_0x09ff
            java.lang.String r4 = "name"
            r10 = r18
            java.lang.String r4 = r10.optString(r4, r9)     // Catch:{ Exception -> 0x058a }
            java.lang.String r9 = "id"
            java.lang.String r11 = "-1"
            java.lang.String r9 = r10.optString(r9, r11)     // Catch:{ Exception -> 0x058a }
            java.lang.String r11 = "custom"
            org.json.JSONObject r10 = r10.optJSONObject(r11)     // Catch:{ Exception -> 0x058a }
            com.ironsource.mediationsdk.model.p r11 = new com.ironsource.mediationsdk.model.p     // Catch:{ Exception -> 0x058a }
            r11.<init>(r4, r9, r10)     // Catch:{ Exception -> 0x058a }
            r42 = r11
            goto L_0x0a01
        L_0x09ff:
            r42 = r29
        L_0x0a01:
            com.ironsource.mediationsdk.utils.b r4 = new com.ironsource.mediationsdk.utils.b     // Catch:{ Exception -> 0x058a }
            r4.<init>()     // Catch:{ Exception -> 0x058a }
            if (r17 == 0) goto L_0x0a27
            java.lang.String r4 = "isExternalArmEventsEnabled"
            r9 = r17
            r10 = 1
            boolean r4 = r9.optBoolean(r4, r10)     // Catch:{ Exception -> 0x058a }
            java.lang.String r11 = "externalArmEventsUrl"
            java.lang.String r12 = "https://outcome-arm-ext-med-ext.sonic-us.supersonicads.com/aemData"
            java.lang.String r11 = r9.optString(r11, r12)     // Catch:{ Exception -> 0x058a }
            java.lang.String r12 = "sid"
            boolean r9 = r9.optBoolean(r12, r10)     // Catch:{ Exception -> 0x058a }
            com.ironsource.mediationsdk.utils.b r10 = new com.ironsource.mediationsdk.utils.b     // Catch:{ Exception -> 0x058a }
            r10.<init>(r4, r11, r9)     // Catch:{ Exception -> 0x058a }
            r46 = r10
            goto L_0x0a29
        L_0x0a27:
            r46 = r4
        L_0x0a29:
            com.ironsource.mediationsdk.model.c r4 = new com.ironsource.mediationsdk.model.c     // Catch:{ Exception -> 0x058a }
            r4.<init>()     // Catch:{ Exception -> 0x058a }
            if (r16 == 0) goto L_0x0a4e
            java.lang.String r4 = "mediationTypes"
            r9 = r16
            org.json.JSONObject r4 = r9.optJSONObject(r4)     // Catch:{ Exception -> 0x058a }
            java.util.HashMap r10 = new java.util.HashMap     // Catch:{ Exception -> 0x058a }
            r10.<init>()     // Catch:{ Exception -> 0x058a }
            if (r4 == 0) goto L_0x0a43
            java.util.Map r10 = com.ironsource.mediationsdk.utils.IronSourceUtils.parseJsonToStringMap(r4)     // Catch:{ Exception -> 0x058a }
        L_0x0a43:
            java.lang.String r4 = "compressExternalToken"
            r11 = 0
            r9.optBoolean(r4, r11)     // Catch:{ Exception -> 0x058a }
            com.ironsource.mediationsdk.model.c r4 = new com.ironsource.mediationsdk.model.c     // Catch:{ Exception -> 0x058a }
            r4.<init>(r10)     // Catch:{ Exception -> 0x058a }
        L_0x0a4e:
            r47 = r4
            com.ironsource.mediationsdk.model.b r4 = new com.ironsource.mediationsdk.model.b     // Catch:{ Exception -> 0x058a }
            r4.<init>()     // Catch:{ Exception -> 0x058a }
            if (r27 == 0) goto L_0x0a67
            java.lang.String r4 = "auctionData"
            r9 = r27
            java.lang.String r4 = r9.optString(r4)     // Catch:{ Exception -> 0x058a }
            com.ironsource.mediationsdk.model.b r9 = new com.ironsource.mediationsdk.model.b     // Catch:{ Exception -> 0x058a }
            r9.<init>(r4)     // Catch:{ Exception -> 0x058a }
            r49 = r9
            goto L_0x0a69
        L_0x0a67:
            r49 = r4
        L_0x0a69:
            java.lang.String r4 = "integration"
            r9 = r21
            r10 = 0
            boolean r44 = r9.optBoolean(r4, r10)     // Catch:{ Exception -> 0x058a }
            com.ironsource.sdk.f.a r4 = new com.ironsource.sdk.f.a     // Catch:{ Exception -> 0x058a }
            r40 = r4
            r41 = r7
            r43 = r1
            r45 = r3
            r48 = r2
            r40.<init>(r41, r42, r43, r44, r45, r46, r47, r48, r49)     // Catch:{ Exception -> 0x058a }
            com.ironsource.mediationsdk.model.g r1 = new com.ironsource.mediationsdk.model.g     // Catch:{ Exception -> 0x058a }
            r35 = r1
            r40 = r4
            r35.<init>(r36, r37, r38, r39, r40)     // Catch:{ Exception -> 0x058a }
            r6.f17849c = r1     // Catch:{ Exception -> 0x058a }
            java.lang.String r1 = "genericParams"
            org.json.JSONObject r1 = m20629b(r8, r1)     // Catch:{ Exception -> 0x058a }
            if (r1 == 0) goto L_0x0aaf
            org.json.JSONObject r2 = m20629b(r1, r5)     // Catch:{ Exception -> 0x058a }
            if (r2 == 0) goto L_0x0aaf
            r1.remove(r5)     // Catch:{ Exception -> 0x058a }
            java.util.Map r2 = com.ironsource.mediationsdk.utils.IronSourceUtils.parseJsonToStringMap(r2)     // Catch:{ Exception -> 0x058a }
            com.ironsource.mediationsdk.a.h r3 = com.ironsource.mediationsdk.p207a.C6557h.m19950d()     // Catch:{ Exception -> 0x058a }
            r3.mo36373b((java.util.Map<java.lang.String, java.lang.String>) r2)     // Catch:{ Exception -> 0x058a }
            com.ironsource.mediationsdk.a.d r3 = com.ironsource.mediationsdk.p207a.C6553d.m19930d()     // Catch:{ Exception -> 0x058a }
            r3.mo36373b((java.util.Map<java.lang.String, java.lang.String>) r2)     // Catch:{ Exception -> 0x058a }
        L_0x0aaf:
            if (r1 == 0) goto L_0x0ac3
            java.util.Map r1 = com.ironsource.mediationsdk.utils.IronSourceUtils.parseJsonToStringMap(r1)     // Catch:{ Exception -> 0x058a }
            com.ironsource.mediationsdk.a.h r2 = com.ironsource.mediationsdk.p207a.C6557h.m19950d()     // Catch:{ Exception -> 0x058a }
            r2.mo36365a((java.util.Map<java.lang.String, java.lang.String>) r1)     // Catch:{ Exception -> 0x058a }
            com.ironsource.mediationsdk.a.d r2 = com.ironsource.mediationsdk.p207a.C6553d.m19930d()     // Catch:{ Exception -> 0x058a }
            r2.mo36365a((java.util.Map<java.lang.String, java.lang.String>) r1)     // Catch:{ Exception -> 0x058a }
        L_0x0ac3:
            return
        L_0x0ac4:
            r0 = move-exception
            r6 = r1
        L_0x0ac6:
            r1 = r0
            r1.printStackTrace()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.utils.C6777l.m20634i():void");
    }

    /* renamed from: a */
    public final C6478E mo36979a() {
        return new C6478E(this.f17846bu, this.f17847bv);
    }

    /* renamed from: a */
    public final void mo36980a(int i) {
        this.f17851e = i;
    }

    /* renamed from: b */
    public final boolean mo36981b() {
        return (((((this.f17850d != null) && !this.f17850d.has("error")) && this.f17772a != null) && this.f17825b != null) && this.f17849c != null) && m20631f();
    }

    /* renamed from: c */
    public final String mo36982c() {
        try {
            return this.f17772a.f17535b;
        } catch (Exception e) {
            IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.INTERNAL, "getRVBackFillProvider", e);
            return null;
        }
    }

    /* renamed from: d */
    public final String mo36983d() {
        try {
            return this.f17772a.f17536c;
        } catch (Exception e) {
            IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.INTERNAL, "getRVPremiumProvider", e);
            return null;
        }
    }

    public final String toString() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("appKey", this.f17846bu);
            jSONObject.put(DataKeys.USER_ID, this.f17847bv);
            jSONObject.put("response", this.f17850d);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject.toString();
    }
}

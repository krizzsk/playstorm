package com.inmobi.media;

import com.inmobi.commons.utils.json.Constructor;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.inmobi.media.bb */
/* compiled from: AdSet */
public final class C5849bb {
    static final String BUYER_PRICE = "buyerPrice";
    public static final String CTX_HASH_KEY = "ctxHash";
    private static final long INVALID_AD_EXPIRY = -1;
    private static final String KEY_ADS = "ads";
    private static final String KEY_AD_SET_EXPIRY = "expiry";
    private static final String KEY_IMPRESSION_ID = "impressionId";
    private static final String KEY_MACROS = "macros";
    public static final String KEY_REQUEST_ID = "requestId";
    private static final String MACRO_ADV_PRICE = "${advPrice}";
    public static final String MACRO_CTX_HASH = "${ctxhash}";
    private static final String TAG = C5849bb.class.getSimpleName();
    private String adSetAuctionMeta = null;
    private String adSetId = "";
    private LinkedList<C5838au> ads = new LinkedList<>();
    private boolean isAuctionClosed = true;
    private boolean isPod = false;
    private String mAdType;
    private boolean mCanLoadBeforeShow;
    private JSONObject mMacros;
    private long mPlacementId;
    private String requestId = "";

    /* renamed from: a */
    public static C6262ij<C5849bb> m17495a() {
        return new C6262ij().mo35466a(new C6267io("ads", C5849bb.class), (C6266in) new C6264il(new Constructor<List<C5838au>>() {
            public final /* synthetic */ Object construct() {
                return new LinkedList();
            }
        }, C5838au.class));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        com.inmobi.media.C5843ay.m17441a(r5, r1.getJSONObject(r10), r11, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0083, code lost:
        r5 = null;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.inmobi.media.C5849bb m17494a(org.json.JSONObject r8, long r9, java.lang.String r11, java.lang.String r12) {
        /*
            r0 = 0
            java.lang.String r1 = "expiry"
            r2 = -1
            long r4 = r8.optLong(r1, r2)     // Catch:{ JSONException -> 0x00a8 }
            r6 = 0
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 > 0) goto L_0x0010
            goto L_0x0016
        L_0x0010:
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ JSONException -> 0x00a8 }
            long r2 = r1.toMillis(r4)     // Catch:{ JSONException -> 0x00a8 }
        L_0x0016:
            java.lang.String r1 = "ads"
            org.json.JSONArray r1 = r8.getJSONArray(r1)     // Catch:{ JSONException -> 0x00a8 }
            int r4 = r1.length()     // Catch:{ JSONException -> 0x00a8 }
            if (r4 != 0) goto L_0x0023
            return r0
        L_0x0023:
            com.inmobi.media.ij r4 = m17495a()     // Catch:{ JSONException -> 0x00a8 }
            java.lang.Class<com.inmobi.media.bb> r5 = com.inmobi.media.C5849bb.class
            java.lang.Object r8 = r4.mo35467a((org.json.JSONObject) r8, r5)     // Catch:{ JSONException -> 0x00a8 }
            com.inmobi.media.bb r8 = (com.inmobi.media.C5849bb) r8     // Catch:{ JSONException -> 0x00a8 }
            if (r8 == 0) goto L_0x00a8
            java.lang.String r4 = r8.adSetId     // Catch:{ JSONException -> 0x00a8 }
            boolean r4 = android.text.TextUtils.isEmpty(r4)     // Catch:{ JSONException -> 0x00a8 }
            if (r4 != 0) goto L_0x00a8
            r8.mPlacementId = r9     // Catch:{ JSONException -> 0x00a8 }
            r8.requestId = r12     // Catch:{ JSONException -> 0x00a8 }
            r8.mAdType = r11     // Catch:{ JSONException -> 0x00a8 }
            r9 = 0
            r10 = r9
        L_0x0041:
            int r12 = r1.length()     // Catch:{ JSONException -> 0x00a8 }
            if (r10 >= r12) goto L_0x008e
            org.json.JSONObject r12 = r1.getJSONObject(r10)     // Catch:{ JSONException -> 0x00a8 }
            java.util.LinkedList<com.inmobi.media.au> r4 = r8.ads     // Catch:{ JSONException -> 0x00a8 }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ JSONException -> 0x00a8 }
        L_0x0051:
            boolean r5 = r4.hasNext()     // Catch:{ JSONException -> 0x00a8 }
            if (r5 == 0) goto L_0x0083
            java.lang.Object r5 = r4.next()     // Catch:{ JSONException -> 0x00a8 }
            com.inmobi.media.au r5 = (com.inmobi.media.C5838au) r5     // Catch:{ JSONException -> 0x00a8 }
            java.lang.String r6 = "impressionId"
            java.lang.String r6 = r12.optString(r6)     // Catch:{ JSONException -> 0x00a8 }
            java.lang.String r7 = r5.mo34733f()     // Catch:{ JSONException -> 0x00a8 }
            boolean r6 = r6.equals(r7)     // Catch:{ JSONException -> 0x00a8 }
            if (r6 == 0) goto L_0x0051
            org.json.JSONObject r12 = r1.getJSONObject(r10)     // Catch:{ Exception -> 0x0075 }
            com.inmobi.media.C5843ay.m17441a(r5, r12, r11, r2)     // Catch:{ Exception -> 0x0075 }
            goto L_0x0083
        L_0x0075:
            r12 = move-exception
            com.inmobi.media.gg r4 = com.inmobi.media.C6181gg.m18398a()     // Catch:{ JSONException -> 0x00a8 }
            com.inmobi.media.hg r6 = new com.inmobi.media.hg     // Catch:{ JSONException -> 0x00a8 }
            r6.<init>(r12)     // Catch:{ JSONException -> 0x00a8 }
            r4.mo35357a((com.inmobi.media.C6217hg) r6)     // Catch:{ JSONException -> 0x00a8 }
            goto L_0x0084
        L_0x0083:
            r5 = r0
        L_0x0084:
            if (r5 == 0) goto L_0x008b
            java.util.LinkedList<com.inmobi.media.au> r12 = r8.ads     // Catch:{ JSONException -> 0x00a8 }
            r12.remove(r5)     // Catch:{ JSONException -> 0x00a8 }
        L_0x008b:
            int r10 = r10 + 1
            goto L_0x0041
        L_0x008e:
            java.util.LinkedList<com.inmobi.media.au> r10 = r8.ads     // Catch:{ JSONException -> 0x00a8 }
            boolean r10 = r10.isEmpty()     // Catch:{ JSONException -> 0x00a8 }
            if (r10 != 0) goto L_0x00a4
            java.util.LinkedList<com.inmobi.media.au> r11 = r8.ads     // Catch:{ JSONException -> 0x00a8 }
            java.lang.Object r9 = r11.get(r9)     // Catch:{ JSONException -> 0x00a8 }
            com.inmobi.media.au r9 = (com.inmobi.media.C5838au) r9     // Catch:{ JSONException -> 0x00a8 }
            boolean r9 = r9.mo34738k()     // Catch:{ JSONException -> 0x00a8 }
            r8.mCanLoadBeforeShow = r9     // Catch:{ JSONException -> 0x00a8 }
        L_0x00a4:
            if (r10 == 0) goto L_0x00a7
            return r0
        L_0x00a7:
            return r8
        L_0x00a8:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C5849bb.m17494a(org.json.JSONObject, long, java.lang.String, java.lang.String):com.inmobi.media.bb");
    }

    /* renamed from: b */
    public final LinkedList<C5838au> mo34812b() {
        return this.ads;
    }

    /* renamed from: c */
    public final boolean mo34813c() {
        return this.isAuctionClosed;
    }

    /* renamed from: d */
    public final boolean mo34814d() {
        return this.isPod;
    }

    /* renamed from: e */
    public final String mo34815e() {
        return this.adSetId;
    }

    /* renamed from: f */
    public final String mo34816f() {
        return this.mAdType;
    }

    /* renamed from: g */
    public final String mo34817g() {
        return this.adSetAuctionMeta;
    }

    /* renamed from: h */
    public final String mo34818h() {
        return this.requestId;
    }

    /* renamed from: i */
    public final long mo34819i() {
        return this.mPlacementId;
    }

    /* renamed from: j */
    public final boolean mo34820j() {
        return this.mCanLoadBeforeShow;
    }

    /* renamed from: k */
    public final C5838au mo34821k() {
        try {
            if (!this.ads.isEmpty()) {
                this.ads.removeFirst();
            }
        } catch (Exception unused) {
        }
        return mo34822l();
    }

    /* renamed from: l */
    public final C5838au mo34822l() {
        try {
            if (this.ads.isEmpty()) {
                return null;
            }
            return this.ads.getFirst();
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    private C5838au m17493a(String str) {
        Iterator it = this.ads.iterator();
        while (it.hasNext()) {
            C5838au auVar = (C5838au) it.next();
            if (str.equals(auVar.mo34733f())) {
                return auVar;
            }
        }
        return null;
    }

    /* renamed from: a */
    public final void mo34811a(JSONObject jSONObject, C6125fq fqVar) throws JSONException {
        if (!this.isAuctionClosed) {
            String string = jSONObject.getString(KEY_REQUEST_ID);
            JSONArray jSONArray = jSONObject.getJSONArray("ads");
            if (this.requestId.equals(string)) {
                int length = jSONArray.length();
                if (length != 0) {
                    LinkedList linkedList = new LinkedList();
                    for (int i = 0; i < length; i++) {
                        JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                        String string2 = jSONObject2.getString(KEY_IMPRESSION_ID);
                        this.mMacros = jSONObject2.optJSONObject(KEY_MACROS);
                        C5838au a = m17493a(string2);
                        if (a != null) {
                            a.mo34725a(this.mMacros);
                            try {
                                a = C5843ay.m17437a(a, fqVar);
                            } catch (C5899br unused) {
                            }
                            if (a != null) {
                                JSONObject jSONObject3 = this.mMacros;
                                if (jSONObject3 != null) {
                                    if (jSONObject3.has(MACRO_ADV_PRICE)) {
                                        String string3 = this.mMacros.getString(MACRO_ADV_PRICE);
                                        try {
                                            if (a.transaction != null) {
                                                a.transaction.put(BUYER_PRICE, Double.parseDouble(string3));
                                                a.mAdContent.put("transaction", a.transaction);
                                            }
                                        } catch (Exception e) {
                                            C6181gg.m18398a().mo35357a(new C6217hg(e));
                                        }
                                    }
                                    if (this.mMacros.has(MACRO_CTX_HASH)) {
                                        String string4 = this.mMacros.getString(MACRO_CTX_HASH);
                                        try {
                                            if (a.transaction != null) {
                                                a.transaction.put(CTX_HASH_KEY, string4);
                                                a.mAdContent.put("transaction", a.transaction);
                                            }
                                        } catch (JSONException e2) {
                                            C6181gg.m18398a().mo35357a(new C6217hg(e2));
                                        }
                                    }
                                }
                                linkedList.add(a);
                            }
                        }
                    }
                    this.ads.clear();
                    this.ads.addAll(linkedList);
                    if (!this.ads.isEmpty()) {
                        this.isAuctionClosed = true;
                        return;
                    }
                    throw new IllegalArgumentException("No matching ads to render");
                }
                throw new IllegalArgumentException("UAS response supplied doesn't have any ads");
            }
            throw new IllegalArgumentException("UAS response supplied was of a different requestId");
        }
        throw new IllegalStateException("Auction was already closed. Can't process UAS response");
    }

    /* renamed from: m */
    public final JSONObject mo34823m() {
        return this.mMacros;
    }

    /* renamed from: a */
    public final void mo34810a(C6125fq fqVar, C5999dr drVar) {
        C5838au l = mo34822l();
        if (l != null) {
            C5995dq a = C5995dq.m17896a();
            a.f15247a.execute(new Runnable(l, fqVar, drVar) {

                /* renamed from: a */
                final /* synthetic */ C5838au f15249a;

                /* renamed from: b */
                final /* synthetic */ C6125fq f15250b;

                /* renamed from: c */
                final /* synthetic */ C5999dr f15251c;

                {
                    this.f15249a = r2;
                    this.f15250b = r3;
                    this.f15251c = r4;
                }

                public final void run() {
                    C5995dq.m17898a(C5995dq.this, this.f15249a, this.f15250b, this.f15251c);
                }
            });
        }
    }

    /* renamed from: a */
    public final void mo34809a(C5838au auVar) {
        try {
            if (mo34822l() != null) {
                this.ads.removeFirst();
            }
        } catch (Exception unused) {
        }
        this.ads.addFirst(auVar);
    }
}

package com.ogury.p375cm.internal;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingClientStateListener;
import com.android.billingclient.api.BillingFlowParams;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.PurchasesUpdatedListener;
import com.android.billingclient.api.SkuDetails;
import com.android.billingclient.api.SkuDetailsParams;
import com.android.billingclient.api.SkuDetailsResponseListener;
import com.applovin.sdk.AppLovinEventTypes;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.ogury.p375cm.internal.bacab;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ogury.cm.internal.baabb */
public final class baabb implements BillingClientStateListener, PurchasesUpdatedListener, SkuDetailsResponseListener, baaab {

    /* renamed from: a */
    private baacb f25876a;

    /* renamed from: b */
    private babab f25877b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public babaa f25878c;

    /* renamed from: d */
    private baacc f25879d;

    /* renamed from: e */
    private baaaa f25880e;

    /* renamed from: f */
    private int f25881f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public volatile boolean f25882g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public baabc f25883h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public BillingClient f25884i;

    /* renamed from: j */
    private Context f25885j;

    /* renamed from: com.ogury.cm.internal.baabb$aaaaa */
    static final class aaaaa {

        /* renamed from: a */
        public static final aaaaa f25886a = new aaaaa();

        /* renamed from: b */
        private static AtomicInteger f25887b = new AtomicInteger(1);

        /* renamed from: com.ogury.cm.internal.baabb$aaaaa$aaaaa  reason: collision with other inner class name */
        static final class C12480aaaaa implements Runnable {

            /* renamed from: a */
            final /* synthetic */ bbaaa f25888a;

            C12480aaaaa(bbaaa bbaaa) {
                this.f25888a = bbaaa;
            }

            public final void run() {
                this.f25888a.mo66502a();
            }
        }

        /* renamed from: com.ogury.cm.internal.baabb$aaaaa$aaaab */
        static final class aaaab implements Runnable {

            /* renamed from: a */
            final /* synthetic */ bbaaa f25889a;

            aaaab(bbaaa bbaaa) {
                this.f25889a = bbaaa;
            }

            public final void run() {
                this.f25889a.mo66502a();
            }
        }

        private aaaaa() {
        }

        /* renamed from: a */
        public static void m30889a() {
            f25887b.set(1);
        }

        /* renamed from: a */
        public static void m30890a(BillingClient billingClient, baabb baabb, bbaaa<babcc> bbaaa) {
            bbabc.m30943b(billingClient, "billingClient");
            bbabc.m30943b(baabb, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
            bbabc.m30943b(bbaaa, "task");
            if (billingClient.isReady()) {
                bbaaa.mo66502a();
                return;
            }
            Log.d("FairChoice", "taskExecutionRetryPolicy billing not ready");
            billingClient.startConnection((BillingClientStateListener) baabb);
            new Handler(Looper.getMainLooper()).postDelayed(new aaaab(bbaaa), 2000);
        }

        /* renamed from: a */
        public static void m30891a(bbaaa<babcc> bbaaa) {
            bbabc.m30943b(bbaaa, "block");
            int andIncrement = f25887b.getAndIncrement();
            if (andIncrement < 5) {
                new Handler(Looper.getMainLooper()).postDelayed(new C12480aaaaa(bbaaa), (long) (((float) Math.pow(2.0d, (double) andIncrement)) * 500.0f));
            }
        }
    }

    /* renamed from: com.ogury.cm.internal.baabb$aaaab */
    static final class aaaab extends bbaca implements bbaaa<babcc> {

        /* renamed from: a */
        final /* synthetic */ baabb f25890a;

        /* renamed from: b */
        final /* synthetic */ Activity f25891b;

        /* renamed from: c */
        final /* synthetic */ BillingFlowParams f25892c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        aaaab(baabb baabb, Activity activity, BillingFlowParams billingFlowParams) {
            super(0);
            this.f25890a = baabb;
            this.f25891b = activity;
            this.f25892c = billingFlowParams;
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo66502a() {
            baabb.access$getPlayStoreBillingClient$p(this.f25890a).launchBillingFlow(this.f25891b, this.f25892c);
            return babcc.f25908a;
        }
    }

    /* renamed from: com.ogury.cm.internal.baabb$aaaac */
    static final class aaaac extends bbaca implements bbaaa<babcc> {

        /* renamed from: a */
        final /* synthetic */ baabb f25893a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        aaaac(baabb baabb) {
            super(0);
            this.f25893a = baabb;
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo66502a() {
            boolean unused = this.f25893a.m30888b();
            return babcc.f25908a;
        }
    }

    /* renamed from: com.ogury.cm.internal.baabb$aaaba */
    static final class aaaba extends bbaca implements bbaaa<babcc> {

        /* renamed from: a */
        final /* synthetic */ baabb f25894a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        aaaba(baabb baabb) {
            super(0);
            this.f25894a = baabb;
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo66502a() {
            mo66662b();
            return babcc.f25908a;
        }

        /* renamed from: b */
        public final void mo66662b() {
            List purchasesList;
            List purchasesList2;
            Log.d("FairChoice", "queryPurchases called");
            this.f25894a.f25882g = false;
            HashSet hashSet = new HashSet();
            Purchase.PurchasesResult queryPurchases = baabb.access$getPlayStoreBillingClient$p(this.f25894a).queryPurchases("inapp");
            bbabc.m30940a((Object) queryPurchases, "playStoreBillingClient.q…lingClient.SkuType.INAPP)");
            StringBuilder sb = new StringBuilder("queryPurchases INAPP results: ");
            List list = null;
            sb.append(queryPurchases != null ? queryPurchases.getPurchasesList() : null);
            Log.d("FairChoice", sb.toString());
            if (!(queryPurchases == null || (purchasesList2 = queryPurchases.getPurchasesList()) == null)) {
                hashSet.addAll(purchasesList2);
            }
            if (baabb.access$isSubscriptionSupported(this.f25894a)) {
                Purchase.PurchasesResult queryPurchases2 = baabb.access$getPlayStoreBillingClient$p(this.f25894a).queryPurchases("subs");
                bbabc.m30940a((Object) queryPurchases2, "playStoreBillingClient.q…llingClient.SkuType.SUBS)");
                if (!(queryPurchases2 == null || (purchasesList = queryPurchases2.getPurchasesList()) == null)) {
                    hashSet.addAll(purchasesList);
                }
                StringBuilder sb2 = new StringBuilder("queryPurchases SUBS results: ");
                if (queryPurchases2 != null) {
                    list = queryPurchases2.getPurchasesList();
                }
                sb2.append(list);
                Log.d("FairChoice", sb2.toString());
            }
            baabb.access$getSharedPreferences$p(this.f25894a);
            baabc.m30901a((HashSet<Purchase>) hashSet);
            babaa access$getPurchaseQueryListener$p = this.f25894a.f25878c;
            if (access$getPurchaseQueryListener$p != null) {
                access$getPurchaseQueryListener$p.mo66497a();
            }
        }
    }

    /* renamed from: com.ogury.cm.internal.baabb$aaabb */
    static final class aaabb extends bbaca implements bbaaa<babcc> {

        /* renamed from: a */
        final /* synthetic */ aaaba f25895a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        aaabb(aaaba aaaba) {
            super(0);
            this.f25895a = aaaba;
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo66502a() {
            this.f25895a.mo66662b();
            return babcc.f25908a;
        }
    }

    /* renamed from: com.ogury.cm.internal.baabb$aaabc */
    static final class aaabc extends bbaca implements bbaaa<babcc> {

        /* renamed from: a */
        final /* synthetic */ baabb f25896a;

        /* renamed from: b */
        final /* synthetic */ String f25897b;

        /* renamed from: c */
        final /* synthetic */ SkuDetailsParams.Builder f25898c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        aaabc(baabb baabb, String str, SkuDetailsParams.Builder builder) {
            super(0);
            this.f25896a = baabb;
            this.f25897b = str;
            this.f25898c = builder;
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo66502a() {
            Log.d("FairChoice", "querySkuDetailsAsync for " + this.f25897b);
            baabb.access$getPlayStoreBillingClient$p(this.f25896a).querySkuDetailsAsync(this.f25898c.build(), this.f25896a);
            return babcc.f25908a;
        }
    }

    /* renamed from: a */
    private static String m30886a(SkuDetails skuDetails) {
        JSONObject jSONObject = new JSONObject();
        if (skuDetails != null) {
            try {
                jSONObject = new JSONObject(skuDetails.getOriginalJson());
            } catch (Exception e) {
                Log.w("FairChoice", "Error while parsing skuDetailsJson: ".concat(String.valueOf(e)));
            }
            jSONObject.remove("skuDetailsToken");
            jSONObject.remove("rewardToken");
        }
        String jSONObject2 = jSONObject.toString();
        bbabc.m30940a((Object) jSONObject2, "billingJson.toString()");
        return jSONObject2;
    }

    /* renamed from: a */
    private final void m30887a() {
        aaaba aaaba2 = new aaaba(this);
        aaaaa aaaaa2 = aaaaa.f25886a;
        BillingClient billingClient = this.f25884i;
        if (billingClient == null) {
            bbabc.m30941a("playStoreBillingClient");
        }
        aaaaa.m30890a(billingClient, this, new aaabb(aaaba2));
    }

    public static final /* synthetic */ BillingClient access$getPlayStoreBillingClient$p(baabb baabb) {
        BillingClient billingClient = baabb.f25884i;
        if (billingClient == null) {
            bbabc.m30941a("playStoreBillingClient");
        }
        return billingClient;
    }

    public static final /* synthetic */ baabc access$getSharedPreferences$p(baabb baabb) {
        baabc baabc = baabb.f25883h;
        if (baabc == null) {
            bbabc.m30941a("sharedPreferences");
        }
        return baabc;
    }

    public static final /* synthetic */ boolean access$isSubscriptionSupported(baabb baabb) {
        BillingClient billingClient = baabb.f25884i;
        if (billingClient == null) {
            bbabc.m30941a("playStoreBillingClient");
        }
        BillingResult isFeatureSupported = billingClient.isFeatureSupported("subscriptions");
        bbabc.m30940a((Object) isFeatureSupported, "playStoreBillingClient.i…eatureType.SUBSCRIPTIONS)");
        int responseCode = isFeatureSupported.getResponseCode();
        if (responseCode != 0) {
            Log.w("FairChoice", "isSubscriptionSupported() got an error response: ".concat(String.valueOf(responseCode)));
        }
        return responseCode == 0;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final boolean m30888b() {
        Log.d("FairChoice", "connectToPlayBillingService");
        BillingClient billingClient = this.f25884i;
        if (billingClient == null) {
            bbabc.m30941a("playStoreBillingClient");
        }
        if (billingClient.isReady()) {
            return false;
        }
        BillingClient billingClient2 = this.f25884i;
        if (billingClient2 == null) {
            bbabc.m30941a("playStoreBillingClient");
        }
        billingClient2.startConnection((BillingClientStateListener) this);
        return true;
    }

    public final void activateProduct(baacb baacb) {
        bbabc.m30943b(baacb, AppLovinEventTypes.USER_VIEWED_PRODUCT);
        this.f25876a = baacb;
        if (this.f25883h == null) {
            bbabc.m30941a("sharedPreferences");
        }
        baabc.m30900a(baacb);
    }

    public final void endDataSourceConnections() {
        Log.d("FairChoice", "endDataSourceConnections");
        BillingClient billingClient = this.f25884i;
        if (billingClient == null) {
            bbabc.m30941a("playStoreBillingClient");
        }
        billingClient.endConnection();
    }

    public final boolean isBillingDisabled() {
        return false;
    }

    public final boolean isProductActivated() {
        return this.f25876a != null;
    }

    public final void launchBillingFlow(Activity activity) {
        bbabc.m30943b(activity, "activity");
        BillingFlowParams.Builder newBuilder = BillingFlowParams.newBuilder();
        babab babab = this.f25877b;
        SkuDetails b = babab != null ? babab.mo66666b() : null;
        if (b == null) {
            bbabc.m30939a();
        }
        BillingFlowParams build = newBuilder.setSkuDetails(b).build();
        bbabc.m30940a((Object) build, "BillingFlowParams.newBui…fo?.skuDetails!!).build()");
        aaaaa aaaaa2 = aaaaa.f25886a;
        BillingClient billingClient = this.f25884i;
        if (billingClient == null) {
            bbabc.m30941a("playStoreBillingClient");
        }
        aaaaa.m30890a(billingClient, this, new aaaab(this, activity, build));
    }

    public final void onBillingServiceDisconnected() {
        Log.d("FairChoice", "onBillingServiceDisconnected");
        aaaaa aaaaa2 = aaaaa.f25886a;
        aaaaa.m30891a(new aaaac(this));
    }

    public final void onBillingSetupFinished(BillingResult billingResult) {
        bbabc.m30943b(billingResult, "billingResult");
        int responseCode = billingResult.getResponseCode();
        if (responseCode == 0) {
            Log.d("FairChoice", "onBillingSetupFinished successfully");
            aaaaa aaaaa2 = aaaaa.f25886a;
            aaaaa.m30889a();
            if (this.f25882g) {
                m30887a();
                return;
            }
            return;
        }
        if (responseCode == 3) {
            Log.e("FairChoice", "Ogury FairChoice not available - Android Billing Library is unavailable");
            baaba baaba = baaba.f25874a;
            Context context = this.f25885j;
            if (context == null) {
                bbabc.m30941a("context");
            }
            baaba.m30885a(context);
        }
        baaac baaac = baaac.f25873a;
        Log.d("FairChoice", "onBillingSetupFinished with failure response code: ".concat(String.valueOf(baaac.m30884a(responseCode))));
        this.f25881f = responseCode;
        babaa babaa = this.f25878c;
        if (babaa != null) {
            babaa.mo66497a();
        }
    }

    public final void onPurchasesUpdated(BillingResult billingResult, List<Purchase> list) {
        bbabc.m30943b(billingResult, "billingResult");
        int responseCode = billingResult.getResponseCode();
        String str = null;
        if (responseCode != 0) {
            if (responseCode == 5) {
                Log.e("FairChoice", "Your app's configuration is incorrect. Review in the Google PlayConsole. Possible causes of this error include: APK is not signed with release key; SKU productId mismatch.");
            } else if (responseCode != 7) {
                StringBuilder sb = new StringBuilder("BillingClient.BillingResponse error code:");
                baaac baaac = baaac.f25873a;
                sb.append(baaac.m30884a(responseCode));
                Log.i("FairChoice", sb.toString());
            } else {
                Log.d("FairChoice", "already owned items");
            }
        } else if (list != null) {
            String str2 = null;
            for (Purchase purchase : list) {
                if (purchase.getPurchaseState() == 1) {
                    String sku = purchase.getSku();
                    baacb baacb = this.f25876a;
                    if (bbabc.m30942a((Object) sku, (Object) baacb != null ? baacb.mo66664b() : null)) {
                        str2 = purchase.getPurchaseToken();
                    }
                } else if (purchase.getPurchaseState() == 2) {
                    Log.d("FairChoice", "Received a pending purchase of SKU: " + purchase.getSku());
                }
            }
            str = str2;
        }
        baaaa baaaa = this.f25880e;
        if (baaaa != null) {
            JSONObject jSONObject = new JSONObject();
            if (responseCode == 0) {
                jSONObject.put("paid", true);
                jSONObject.put("token", str);
            } else {
                jSONObject.put("paid", false);
                baaac baaac2 = baaac.f25873a;
                jSONObject.put("errorMessage", baaac.m30884a(responseCode));
            }
            String jSONObject2 = jSONObject.toString();
            bbabc.m30940a((Object) jSONObject2, "json.toString()");
            baaaa.mo66549a(jSONObject2);
        }
    }

    public final void onSkuDetailsResponse(BillingResult billingResult, List<SkuDetails> list) {
        baacc baacc;
        bbabc.m30943b(billingResult, "billingResult");
        int responseCode = billingResult.getResponseCode();
        if (responseCode != 0) {
            if (this.f25881f != 0) {
                baaac baaac = baaac.f25873a;
                responseCode = this.f25881f;
            } else {
                baaac baaac2 = baaac.f25873a;
            }
            String a = baaac.m30884a(responseCode);
            this.f25881f = 0;
            Log.w("FairChoice", "SkuDetails query failed with response: ".concat(String.valueOf(a)));
            baacc baacc2 = this.f25879d;
            if (baacc2 != null) {
                baacc2.mo66547a(a, "");
                return;
            }
            return;
        }
        Log.d("FairChoice", "SkuDetails query responded with success. List: ".concat(String.valueOf(list)));
        if (list == null || list.isEmpty()) {
            this.f25877b = new babab("store-product-not-available", (SkuDetails) null);
        }
        if (list != null) {
            for (SkuDetails skuDetails : list) {
                String sku = skuDetails.getSku();
                baacb baacb = this.f25876a;
                if (bbabc.m30942a((Object) sku, (Object) baacb != null ? baacb.mo66664b() : null)) {
                    this.f25877b = new babab("ok", skuDetails);
                }
            }
        }
        babab babab = this.f25877b;
        if (babab != null && (baacc = this.f25879d) != null) {
            baacc.mo66547a(babab.mo66665a(), m30886a(babab.mo66666b()));
        }
    }

    public final void queryProductDetails() {
        baacb baacb = this.f25876a;
        if (baacb == null) {
            Log.i("FairChoice", "Product must be activated(saved) prior to calling queryProductDetails() -> FairChoice disabled");
        } else if (baacb != null) {
            String a = baacb.mo66663a();
            List a2 = bacab.aaaaa.m30918a(baacb.mo66664b());
            SkuDetailsParams.Builder newBuilder = SkuDetailsParams.newBuilder();
            bbabc.m30940a((Object) newBuilder, "SkuDetailsParams.newBuilder()");
            newBuilder.setSkusList(a2).setType(a);
            aaaaa aaaaa2 = aaaaa.f25886a;
            BillingClient billingClient = this.f25884i;
            if (billingClient == null) {
                bbabc.m30941a("playStoreBillingClient");
            }
            aaaaa.m30890a(billingClient, this, new aaabc(this, a, newBuilder));
        }
    }

    public final void queryPurchase(babaa babaa) {
        bbabc.m30943b(babaa, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.f25878c = babaa;
        BillingClient billingClient = this.f25884i;
        if (billingClient == null) {
            bbabc.m30941a("playStoreBillingClient");
        }
        if (billingClient.isReady()) {
            m30887a();
        } else {
            this.f25882g = true;
        }
    }

    public final void setBillingFinishedListener(baaaa baaaa) {
        this.f25880e = baaaa;
    }

    public final void setPurchaseQueryListener(babaa babaa) {
        bbabc.m30943b(babaa, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.f25882g = true;
        this.f25878c = babaa;
    }

    public final void setQueryProductDetailsListener(baacc baacc) {
        this.f25879d = baacc;
        babab babab = this.f25877b;
        if (babab != null && baacc != null) {
            baacc.mo66547a(babab.mo66665a(), m30886a(babab.mo66666b()));
        }
    }

    public final void startDataSourceConnections(Context context) {
        bbabc.m30943b(context, "context");
        this.f25885j = context;
        acccc acccc = acccc.f25869a;
        this.f25883h = acccc.m30879b(context);
        this.f25884i = acccc.f25869a.mo66642a(context, (PurchasesUpdatedListener) this);
        m30888b();
    }

    public final boolean tokenExistsForActiveProduct() {
        if (this.f25883h == null) {
            bbabc.m30941a("sharedPreferences");
        }
        String b = baabc.m30902b();
        if (this.f25883h == null) {
            bbabc.m30941a("sharedPreferences");
        }
        String a = baabc.m30898a();
        if (a != null) {
            try {
                JSONArray jSONArray = new JSONArray(a);
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    if (bbabc.m30942a((Object) jSONObject.getString(InAppPurchaseMetaData.KEY_PRODUCT_ID), (Object) b) && jSONObject.has(SDKConstants.PARAM_PURCHASE_TOKEN)) {
                        return true;
                    }
                }
                babcc babcc = babcc.f25908a;
            } catch (JSONException e) {
                Integer.valueOf(Log.e("FairChoice", "Error while parsing purchases json: " + e + ')'));
            }
        }
        return false;
    }
}

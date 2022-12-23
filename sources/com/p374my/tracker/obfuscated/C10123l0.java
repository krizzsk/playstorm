package com.p374my.tracker.obfuscated;

import android.content.Context;
import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingClientStateListener;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.PurchasesUpdatedListener;
import com.android.billingclient.api.SkuDetails;
import com.android.billingclient.api.SkuDetailsParams;
import com.android.billingclient.api.SkuDetailsResponseListener;
import com.p374my.tracker.obfuscated.C10123l0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;

/* renamed from: com.my.tracker.obfuscated.l0 */
public final class C10123l0 {

    /* renamed from: g */
    public static final Boolean f25235g = true;

    /* renamed from: h */
    private static final Set<C10123l0> f25236h = new HashSet();

    /* renamed from: i */
    private static final PurchasesUpdatedListener f25237i = $$Lambda$l0$0qjVs3bbWcc8BnUt1IfzJ6vAhA.INSTANCE;

    /* renamed from: a */
    final BillingClientStateListener f25238a = new C10124a();

    /* renamed from: b */
    private final AtomicBoolean f25239b = new AtomicBoolean();

    /* renamed from: c */
    private final List<String> f25240c;

    /* renamed from: d */
    private final String f25241d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C10125b f25242e;

    /* renamed from: f */
    private final BillingClient f25243f;

    /* renamed from: com.my.tracker.obfuscated.l0$a */
    class C10124a implements BillingClientStateListener {

        /* renamed from: a */
        final AtomicInteger f25244a = new AtomicInteger(0);

        C10124a() {
        }

        public void onBillingServiceDisconnected() {
            if (this.f25244a.incrementAndGet() >= 3 || !C10123l0.this.mo66223c()) {
                C10175u0.m30440a("ProductHelper: exceeded numbers of billing client connection attempts");
                C10123l0.this.f25242e.mo66227a(1, Collections.EMPTY_MAP);
                C10123l0.this.mo66221a();
            }
        }

        public void onBillingSetupFinished(BillingResult billingResult) {
            if (billingResult == null || billingResult.getResponseCode() != 0) {
                C10175u0.m30440a("ProductHelper: error while connecting with billing client");
                onBillingServiceDisconnected();
                return;
            }
            C10175u0.m30440a("ProductHelper: connection with billing client has been established");
            this.f25244a.set(0);
            C10123l0.this.mo66222b();
        }
    }

    /* renamed from: com.my.tracker.obfuscated.l0$b */
    public interface C10125b {
        /* renamed from: a */
        void mo66227a(int i, Map<String, JSONObject> map);
    }

    private C10123l0(List<String> list, String str, C10125b bVar, Context context) {
        this.f25240c = list;
        this.f25242e = bVar;
        this.f25243f = BillingClient.newBuilder(context).setListener(f25237i).enablePendingPurchases().build();
        this.f25241d = str;
    }

    /* renamed from: a */
    public static C10164q0 m30161a(Object obj) {
        if (!f25235g.booleanValue()) {
            C10175u0.m30444b("ProductHelper: purchase helper is disabled");
            return null;
        }
        try {
            if (obj instanceof Purchase) {
                Purchase purchase = (Purchase) obj;
                return C10164q0.m30400a(purchase.getOriginalJson(), purchase.getSignature(), C10173t0.m30433a());
            }
        } catch (Throwable th) {
            C10175u0.m30445b("ProductHelper error: exception occurred while processing uncasted object", th);
        }
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m30163a(List list, String str, C10125b bVar, Context context) {
        try {
            C10123l0 l0Var = new C10123l0(list, str, bVar, context);
            if (!l0Var.mo66223c()) {
                l0Var.mo66221a();
                bVar.mo66227a(1, Collections.EMPTY_MAP);
            }
        } catch (Throwable th) {
            C10175u0.m30445b("ProductHelper error: error while creating ProductHelper", th);
        }
    }

    /* renamed from: a */
    public static void m30164a(List<C10164q0> list, boolean z, C10125b bVar, Context context) {
        if (list.isEmpty()) {
            C10175u0.m30440a("ProductHelper: empty purchases list");
            bVar.mo66227a(0, Collections.EMPTY_MAP);
            return;
        }
        String str = z ? "subs" : "inapp";
        ArrayList arrayList = new ArrayList();
        for (C10164q0 c : list) {
            String c2 = c.mo66373c();
            if (!arrayList.contains(c2)) {
                arrayList.add(c2);
            }
        }
        C10104d.m30025c(new Runnable(arrayList, str, bVar, context) {
            public final /* synthetic */ List f$0;
            public final /* synthetic */ String f$1;
            public final /* synthetic */ C10123l0.C10125b f$2;
            public final /* synthetic */ Context f$3;

            {
                this.f$0 = r1;
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
            }

            public final void run() {
                C10123l0.m30163a(this.f$0, this.f$1, this.f$2, this.f$3);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m30165b(BillingResult billingResult, List list) {
        C10104d.m30023a(new Runnable(billingResult, list) {
            public final /* synthetic */ BillingResult f$1;
            public final /* synthetic */ List f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void run() {
                C10123l0.this.m30162a(this.f$1, this.f$2);
            }
        });
        mo66221a();
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static /* synthetic */ void m30166c(BillingResult billingResult, List list) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo66221a() {
        try {
            C10175u0.m30440a("ProductHelper: end connection with billing client");
            f25236h.remove(this);
            this.f25243f.endConnection();
        } catch (Throwable th) {
            C10175u0.m30445b("ProductHelper error: exception while end connection:", th);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo66222b() {
        try {
            C10175u0.m30440a("ProductHelper: querying for " + this.f25241d);
            this.f25243f.querySkuDetailsAsync(SkuDetailsParams.newBuilder().setSkusList(this.f25240c).setType(this.f25241d).build(), new SkuDetailsResponseListener() {
                public final void onSkuDetailsResponse(BillingResult billingResult, List list) {
                    C10123l0.this.m30165b(billingResult, list);
                }
            });
        } catch (Throwable th) {
            C10175u0.m30445b("ProductHelper error: exception while querying details for " + this.f25241d, th);
            mo66221a();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean mo66223c() {
        try {
            C10175u0.m30440a("ProductHelper: start connection with billing client");
            this.f25243f.startConnection(this.f25238a);
            f25236h.add(this);
            return true;
        } catch (Throwable th) {
            C10175u0.m30445b("ProductHelper error: exception while start connection:", th);
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void m30162a(BillingResult billingResult, List<SkuDetails> list) {
        if (!this.f25239b.compareAndSet(false, true)) {
            C10175u0.m30440a("ProductHelper: skuDetails has already been received");
            return;
        }
        int responseCode = billingResult != null ? billingResult.getResponseCode() : 6;
        if (responseCode != 0) {
            String debugMessage = billingResult != null ? billingResult.getDebugMessage() : "{empty message}";
            C10175u0.m30440a("ProductHelper: getSkuDetails completed with errorCode: " + responseCode + ", message: " + debugMessage);
            this.f25242e.mo66227a(1, Collections.EMPTY_MAP);
        } else if (list == null || list.isEmpty()) {
            C10175u0.m30440a("ProductHelper: null list of skuDetail has been received");
            this.f25242e.mo66227a(0, Collections.EMPTY_MAP);
        } else {
            HashMap hashMap = new HashMap();
            C10175u0.m30440a("ProductHelper: populating map of skuDetails data");
            for (SkuDetails next : list) {
                try {
                    hashMap.put(next.getSku(), new JSONObject(next.getOriginalJson()));
                } catch (Throwable th) {
                    C10175u0.m30445b("ProductHelper error: exception while parsing skuData", th);
                }
            }
            this.f25242e.mo66227a(0, hashMap);
        }
    }
}

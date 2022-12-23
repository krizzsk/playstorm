package com.p374my.tracker.recsys;

import android.net.Uri;
import android.os.Handler;
import android.text.TextUtils;
import com.applovin.sdk.AppLovinWebViewActivity;
import com.p374my.tracker.MyTracker;
import com.p374my.tracker.MyTrackerConfig;
import com.p374my.tracker.obfuscated.C10104d;
import com.p374my.tracker.obfuscated.C10170t;
import com.p374my.tracker.obfuscated.C10175u0;
import com.p374my.tracker.recsys.OfferRequest;
import com.vungle.warren.model.AdvertisementDBAdapter;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.my.tracker.recsys.OfferRequest */
public final class OfferRequest {

    /* renamed from: a */
    final OnCompleteListener f25516a;

    /* renamed from: b */
    final Handler f25517b;

    /* renamed from: c */
    final String f25518c;

    /* renamed from: d */
    private final AtomicBoolean f25519d = new AtomicBoolean(false);
    public final String data;
    public final List<String> placementIds;
    public final Boolean reset;
    public final String userId;

    /* renamed from: com.my.tracker.recsys.OfferRequest$OnCompleteListener */
    public interface OnCompleteListener {
        void onComplete(OfferRequest offerRequest, List<Offer> list, String str);
    }

    /* renamed from: com.my.tracker.recsys.OfferRequest$a */
    class C10184a implements C10170t.C10171a {
        C10184a() {
        }

        /* renamed from: a */
        public String mo66257a() {
            return "application/json";
        }

        /* renamed from: a */
        public void mo66264a(OutputStream outputStream) {
            if (!TextUtils.isEmpty(OfferRequest.this.data)) {
                outputStream.write(OfferRequest.this.data.getBytes("UTF-8"));
            }
        }
    }

    OfferRequest(String str, List<String> list, String str2, Boolean bool, OnCompleteListener onCompleteListener, Handler handler) {
        this.userId = str;
        this.placementIds = list;
        this.data = str2;
        this.reset = bool;
        this.f25516a = onCompleteListener;
        this.f25517b = handler;
        this.f25518c = "https://recsys.tracker.my.com/api/public/v3/rec/item";
    }

    /* renamed from: a */
    static List<Offer> m30506a(String str) {
        try {
            JSONArray jSONArray = new JSONObject(str).getJSONArray("data");
            ArrayList arrayList = new ArrayList();
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                String optString = jSONObject.optString(AdvertisementDBAdapter.AdvertisementColumns.COLUMN_PLACEMENT_ID);
                int optInt = jSONObject.optInt("test_id");
                int optInt2 = jSONObject.optInt("split_id");
                JSONObject jSONObject2 = jSONObject.getJSONObject("offer");
                arrayList.add(new Offer(optString, jSONObject2.optString("item_id"), jSONObject2.optDouble("price"), jSONObject2.optDouble("discount_price"), jSONObject2.optInt("value"), jSONObject2.optInt("discount_value"), optInt, optInt2));
            }
            return arrayList;
        } catch (Throwable unused) {
            C10175u0.m30440a("OfferRequest: error occurred while parsing values from json response");
            return null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m30507a() {
        String id = MyTracker.getTrackerConfig().getId();
        if (TextUtils.isEmpty(id)) {
            C10175u0.m30444b("OfferRequest: MyTracker hasn't been initialized yet, MyTracker.initTracker() should be called first");
            m30509a(this, this.f25517b, this.f25516a, (C10170t.C10172b<String>) null);
            return;
        }
        m30509a(this, this.f25517b, this.f25516a, C10170t.m30425a(new C10184a(), (MyTrackerConfig.OkHttpClientProvider) null, false).mo66167a(mo66446a(this.f25518c, id)));
    }

    /* renamed from: a */
    static void m30509a(OfferRequest offerRequest, Handler handler, OnCompleteListener onCompleteListener, C10170t.C10172b<String> bVar) {
        String str;
        List<Offer> list = null;
        if (bVar == null) {
            str = "MyTracker hasn't been initialized yet";
        } else if (!bVar.mo66385b()) {
            C10175u0.m30440a("OfferRequest: http response is unsuccessful");
            str = "Unsuccessful response";
        } else {
            String a = bVar.mo66384a();
            if (TextUtils.isEmpty(a)) {
                C10175u0.m30440a("OfferRequest: http response is empty ");
                str = "Empty response";
            } else {
                List<Offer> a2 = m30506a(a);
                if (a2 == null) {
                    C10175u0.m30440a("OfferRequest: error while parsing offers from response");
                    str = "Offers parsing error";
                } else {
                    list = a2;
                    str = null;
                }
            }
        }
        handler.post(new Runnable(offerRequest, list, str) {
            public final /* synthetic */ OfferRequest f$1;
            public final /* synthetic */ List f$2;
            public final /* synthetic */ String f$3;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
            }

            public final void run() {
                OfferRequest.OnCompleteListener.this.onComplete(this.f$1, this.f$2, this.f$3);
            }
        });
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public String mo66446a(String str, String str2) {
        Uri.Builder buildUpon = Uri.parse(str).buildUpon();
        buildUpon.appendQueryParameter("custom_user_id", this.userId);
        buildUpon.appendQueryParameter(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY, str2);
        Boolean bool = this.reset;
        if (bool != null) {
            buildUpon.appendQueryParameter("reset", String.valueOf(bool));
        }
        if (!this.placementIds.isEmpty()) {
            int size = this.placementIds.size();
            for (int i = 0; i < size; i++) {
                buildUpon.appendQueryParameter(AdvertisementDBAdapter.AdvertisementColumns.COLUMN_PLACEMENT_ID, this.placementIds.get(i));
            }
        }
        return buildUpon.toString();
    }

    public void send() {
        if (this.f25516a == null) {
            C10175u0.m30440a("OfferRequest: listener is null, offers from response can not be returned");
        } else if (!this.f25519d.compareAndSet(false, true)) {
            C10175u0.m30440a("OfferRequest: send has already been called");
        } else {
            C10104d.m30024b(new Runnable() {
                public final void run() {
                    OfferRequest.this.m30507a();
                }
            });
        }
    }
}

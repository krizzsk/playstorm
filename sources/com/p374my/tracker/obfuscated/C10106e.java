package com.p374my.tracker.obfuscated;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.text.TextUtils;
import com.p374my.tracker.MyTracker;
import com.p374my.tracker.MyTrackerAttribution;
import java.net.URLDecoder;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* renamed from: com.my.tracker.obfuscated.e */
public final class C10106e {

    /* renamed from: a */
    final AtomicBoolean f25174a = new AtomicBoolean(false);

    /* renamed from: b */
    final C10178v0 f25175b;

    /* renamed from: c */
    final Context f25176c;

    C10106e(C10178v0 v0Var, Context context) {
        this.f25175b = v0Var;
        this.f25176c = context.getApplicationContext();
    }

    /* renamed from: a */
    public static C10106e m30062a(C10178v0 v0Var, Context context) {
        return new C10106e(v0Var, context);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m30063a(MyTracker.AttributionListener attributionListener, MyTrackerAttribution myTrackerAttribution) {
        try {
            attributionListener.onReceiveAttribution(myTrackerAttribution);
        } catch (Throwable unused) {
            C10175u0.m30444b("AttributionHandler error: exception at AttributionListener::onReceiveAttribution()");
        }
    }

    /* renamed from: a */
    public void mo66157a(String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            str2 = "AttributionHandler: referrer is empty";
        } else if (mo66159a()) {
            str2 = "AttributionHandler: attribution has already been received";
        } else {
            try {
                String queryParameter = Uri.parse("https://my.com/?" + URLDecoder.decode(str, "UTF-8")).getQueryParameter("mt_deeplink");
                if (TextUtils.isEmpty(queryParameter)) {
                    C10175u0.m30440a("AttributionHandler: deeplink is empty");
                    return;
                } else {
                    mo66158a(new JSONObject().put("deeplink", queryParameter));
                    return;
                }
            } catch (Throwable th) {
                C10175u0.m30445b("AttributionHandler error: handling referrer failed with error: ", th);
                return;
            }
        }
        C10175u0.m30440a(str2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo66158a(JSONObject jSONObject) {
        String optString = jSONObject.optString("deeplink");
        if (TextUtils.isEmpty(optString)) {
            C10175u0.m30440a("AttributionHandler: deeplink is empty");
        } else if (!this.f25174a.compareAndSet(false, true)) {
            C10175u0.m30440a("AttributionHandler: attribution has already been received");
        } else {
            C10121k0 a = C10121k0.m30104a(this.f25176c);
            if (!TextUtils.isEmpty(a.mo66195f())) {
                C10175u0.m30440a("AttributionHandler: attribution has already been received");
                return;
            }
            a.mo66202i(jSONObject.toString());
            MyTracker.AttributionListener c = this.f25175b.mo66409c();
            if (c != null) {
                Handler b = this.f25175b.mo66405b();
                if (b == null) {
                    b = C10104d.f25156a;
                }
                try {
                    b.post(new Runnable(MyTrackerAttribution.newAttribution(optString)) {
                        public final /* synthetic */ MyTrackerAttribution f$1;

                        {
                            this.f$1 = r2;
                        }

                        public final void run() {
                            C10106e.m30063a(MyTracker.AttributionListener.this, this.f$1);
                        }
                    });
                } catch (Throwable th) {
                    C10175u0.m30445b("AttributionHandler error: exception occurred while post runnable", th);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo66159a() {
        if (this.f25174a.get()) {
            return true;
        }
        return !TextUtils.isEmpty(C10121k0.m30104a(this.f25176c).mo66195f());
    }

    /* renamed from: b */
    public void mo66160b(String str) {
        if (mo66159a()) {
            C10175u0.m30440a("AttributionHandler: attribution has already been received");
            return;
        }
        try {
            JSONObject optJSONObject = new JSONObject(str).optJSONObject("attribution");
            if (optJSONObject == null) {
                C10175u0.m30440a("AttributionHandler: empty attribution object has been returned");
            } else if (optJSONObject.has("error")) {
                int optInt = optJSONObject.optInt("error");
                C10175u0.m30440a("AttributionHandler: attribution response returned error " + optInt);
            } else {
                mo66158a(optJSONObject);
            }
        } catch (Throwable th) {
            C10175u0.m30445b("AttributionHandler error: handling server attribution failed with error: ", th);
        }
    }
}

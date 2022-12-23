package com.p374my.target;

import android.content.Context;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.my.target.s8 */
public class C9957s8 {

    /* renamed from: a */
    public final C10016w2 f24641a;

    /* renamed from: b */
    public final C9596a f24642b;

    public C9957s8(C10016w2 w2Var, C9596a aVar) {
        this.f24641a = w2Var;
        this.f24642b = aVar;
    }

    /* renamed from: a */
    public static C9957s8 m29272a(C10016w2 w2Var, C9596a aVar) {
        return new C9957s8(w2Var, aVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m29273a(C9795k2 k2Var, Context context) {
        String a = mo65415a(k2Var);
        if (a != null) {
            C9740h8 a2 = C9740h8.m28156a(context);
            if (a2 == null) {
                C9672e0.m27882a("unable to open disk cache and save text data for slotId: " + this.f24642b.getSlotId());
                return;
            }
            a2.mo64191a(this.f24642b.getSlotId(), a, true);
        }
    }

    /* renamed from: a */
    public final String mo65415a(C9795k2 k2Var) {
        String id = k2Var.getId();
        try {
            JSONObject j = this.f24641a.mo65663j();
            if (j == null) {
                C9672e0.m27882a("unable to change cached notification for banner " + id + ": no raw data in section");
                return null;
            }
            JSONObject jSONObject = j.getJSONObject(this.f24641a.mo65662i());
            if (jSONObject == null) {
                C9672e0.m27882a("unable to change cached notification for banner " + id + ": no section object in raw data");
                return null;
            }
            JSONArray jSONArray = jSONObject.getJSONArray("banners");
            if (jSONArray == null) {
                C9672e0.m27882a("unable to change cached notification for banner " + id + ": no banners array in section object");
                return null;
            }
            int length = jSONArray.length();
            int i = 0;
            while (i < length) {
                JSONObject jSONObject2 = (JSONObject) jSONArray.get(i);
                String string = jSONObject2.getString("bannerID");
                if (string == null || !string.equals(id)) {
                    i++;
                } else {
                    jSONObject2.put("hasNotification", k2Var.isHasNotification());
                    C9672e0.m27882a("notification changed in raw data for banner " + id);
                    return j.toString();
                }
            }
            return null;
        } catch (Throwable th) {
            C9672e0.m27882a("error updating cached notification for section " + this.f24641a.mo65662i() + " and banner " + id + ": " + th);
        }
    }

    /* renamed from: a */
    public void mo65416a(C9795k2 k2Var, boolean z, Context context) {
        if (k2Var.isHasNotification() != z) {
            k2Var.setHasNotification(z);
            C9693f0.m27979a(new Runnable(k2Var, context.getApplicationContext()) {
                public final /* synthetic */ C9795k2 f$1;
                public final /* synthetic */ Context f$2;

                {
                    this.f$1 = r2;
                    this.f$2 = r3;
                }

                public final void run() {
                    C9957s8.this.m29273a(this.f$1, this.f$2);
                }
            });
        }
    }
}

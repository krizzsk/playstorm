package com.ironsource.sdk.service.Connectivity;

import android.content.Context;
import android.os.Build;
import com.ironsource.environment.C6408c;
import com.ironsource.sdk.utils.Logger;
import org.json.JSONObject;

/* renamed from: com.ironsource.sdk.service.Connectivity.b */
public abstract class C8380b implements C8382d {

    /* renamed from: a */
    public C8381c f20100a;

    protected C8380b(JSONObject jSONObject, Context context) {
        C8381c cVar;
        if (jSONObject.optInt("connectivityStrategy") == 1) {
            cVar = new C8379a(this);
        } else {
            cVar = (Build.VERSION.SDK_INT < 23 || !C6408c.m19240b(context, "android.permission.ACCESS_NETWORK_STATE")) ? new C8379a(this) : new C8383e(this);
        }
        this.f20100a = cVar;
        String simpleName = C8380b.class.getSimpleName();
        Logger.m24028i(simpleName, "created ConnectivityAdapter with strategy " + this.f20100a.getClass().getSimpleName());
    }

    /* renamed from: a */
    public void mo56634a() {
    }

    /* renamed from: a */
    public void mo56635a(String str) {
    }

    /* renamed from: a */
    public void mo56636a(String str, JSONObject jSONObject) {
    }
}

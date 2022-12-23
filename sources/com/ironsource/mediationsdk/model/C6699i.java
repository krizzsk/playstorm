package com.ironsource.mediationsdk.model;

import android.text.TextUtils;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.sdk.p293g.C8343d;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONObject;

/* renamed from: com.ironsource.mediationsdk.model.i */
public final class C6699i {

    /* renamed from: a */
    public ArrayList<C6700j> f17511a = new ArrayList<>();

    /* renamed from: b */
    public C6700j f17512b;

    /* renamed from: c */
    public C8343d f17513c;

    /* renamed from: d */
    public JSONObject f17514d;

    public C6699i(C8343d dVar) {
        this.f17513c = dVar;
    }

    /* renamed from: a */
    public final C6700j mo36818a() {
        Iterator<C6700j> it = this.f17511a.iterator();
        while (it.hasNext()) {
            C6700j next = it.next();
            if (next.f17517c) {
                return next;
            }
        }
        return this.f17512b;
    }

    /* renamed from: a */
    public final C6700j mo36819a(String str) {
        Iterator<C6700j> it = this.f17511a.iterator();
        while (it.hasNext()) {
            C6700j next = it.next();
            if (next.f17516b.equals(str)) {
                return next;
            }
        }
        return null;
    }

    /* renamed from: b */
    public final String mo36820b() {
        JSONObject jSONObject = this.f17514d;
        return (jSONObject == null || TextUtils.isEmpty(jSONObject.optString("adapterName"))) ? IronSourceConstants.SUPERSONIC_CONFIG_NAME : this.f17514d.optString("adapterName");
    }
}

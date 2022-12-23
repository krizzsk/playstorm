package com.ironsource.sdk.p294h;

import com.ironsource.sdk.utils.IronSourceStorageUtils;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONObject;

/* renamed from: com.ironsource.sdk.h.d */
public final class C8356d {

    /* renamed from: a */
    private String f20074a;

    public C8356d(String str) {
        this.f20074a = str;
    }

    /* renamed from: a */
    private boolean m23937a(JSONObject jSONObject) {
        return IronSourceStorageUtils.saveFile(jSONObject.toString().getBytes(), m23938b().getPath()) != 0;
    }

    /* renamed from: b */
    private C8355c m23938b() {
        C8355c cVar = new C8355c(this.f20074a, "metadata.json");
        if (!cVar.exists()) {
            IronSourceStorageUtils.saveFile(new JSONObject().toString().getBytes(), cVar.getPath());
        }
        return cVar;
    }

    /* renamed from: a */
    public final synchronized JSONObject mo56872a() {
        return new JSONObject(IronSourceStorageUtils.readFile(m23938b()));
    }

    /* renamed from: a */
    public final synchronized boolean mo56873a(String str) {
        JSONObject a = mo56872a();
        if (!a.has(str)) {
            return true;
        }
        a.remove(str);
        return m23937a(a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized boolean mo56874a(String str, JSONObject jSONObject) {
        JSONObject a;
        a = mo56872a();
        a.put(str, jSONObject);
        return m23937a(a);
    }

    /* renamed from: a */
    public final boolean mo56875a(ArrayList<C8355c> arrayList) {
        Iterator<C8355c> it = arrayList.iterator();
        boolean z = true;
        while (it.hasNext()) {
            if (!mo56873a(it.next().getName())) {
                z = false;
            }
        }
        return z;
    }

    /* renamed from: b */
    public final synchronized boolean mo56876b(String str, JSONObject jSONObject) {
        JSONObject a;
        a = mo56872a();
        JSONObject optJSONObject = a.optJSONObject(str);
        if (optJSONObject != null) {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                optJSONObject.putOpt(next, jSONObject.opt(next));
            }
        } else {
            a.putOpt(str, jSONObject);
        }
        return m23937a(a);
    }
}

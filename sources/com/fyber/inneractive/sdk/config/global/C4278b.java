package com.fyber.inneractive.sdk.config.global;

import com.fyber.inneractive.sdk.util.IAlog;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.fyber.inneractive.sdk.config.global.b */
public class C4278b {

    /* renamed from: a */
    public String f10613a;

    /* renamed from: b */
    public int f10614b;

    /* renamed from: c */
    public final List<C4301k> f10615c = new ArrayList();

    /* renamed from: d */
    public List<C4280d> f10616d = new ArrayList();

    /* renamed from: a */
    public static void m13469a(C4278b bVar, JSONObject jSONObject, boolean z) throws Exception {
        Object obj;
        if (jSONObject != null) {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                next.getClass();
                char c = 65535;
                switch (next.hashCode()) {
                    case -1335432629:
                        if (next.equals("demand")) {
                            c = 0;
                            break;
                        }
                        break;
                    case -977436259:
                        if (next.equals("pub_id")) {
                            c = 1;
                            break;
                        }
                        break;
                    case -212583340:
                        if (next.equals("placement_type")) {
                            c = 2;
                            break;
                        }
                        break;
                    case 3556:
                        if (next.equals("os")) {
                            c = 3;
                            break;
                        }
                        break;
                    case 113722:
                        if (next.equals("sdk")) {
                            c = 4;
                            break;
                        }
                        break;
                }
                if (c == 0) {
                    obj = new C4279c(jSONObject.getJSONArray(next), z);
                } else if (c == 1) {
                    obj = new C4299i(jSONObject.getJSONArray(next), z);
                } else if (c == 2) {
                    obj = new C4298h(jSONObject.getJSONArray(next), z);
                } else if (c == 3) {
                    obj = new C4282f(jSONObject.getString(next), z);
                } else if (c != 4) {
                    obj = null;
                } else {
                    obj = new C4300j(jSONObject.getString(next), z);
                }
                if (obj != null) {
                    bVar.f10616d.add(obj);
                } else {
                    IAlog.m16699a(String.format("%s: Unsupported filter type: %s", new Object[]{"b", next}), new Object[0]);
                }
            }
        }
    }

    public String toString() {
        return String.format("experiment: id=%s, variants=%s, filters=%s", new Object[]{this.f10613a, this.f10615c, this.f10616d});
    }
}

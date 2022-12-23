package com.fyber.inneractive.sdk.config.global.features;

import com.fyber.inneractive.sdk.config.global.C4278b;
import com.fyber.inneractive.sdk.config.global.C4301k;
import com.fyber.inneractive.sdk.config.global.C4304n;
import com.fyber.inneractive.sdk.config.global.C4306p;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.fyber.inneractive.sdk.config.global.features.e */
public abstract class C4287e extends C4306p {

    /* renamed from: b */
    public String f10625b;

    /* renamed from: c */
    public List<C4278b> f10626c = new ArrayList();

    /* renamed from: d */
    public Map<String, C4301k> f10627d = new HashMap();

    public C4287e(String str) {
        this.f10625b = str;
    }

    /* renamed from: a */
    public String mo24311a(String str, String str2) {
        String str3;
        Iterator<String> it = this.f10627d.keySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                str3 = null;
                break;
            }
            str3 = this.f10627d.get(it.next()).mo24315c(str);
            if (str3 != null) {
                break;
            }
        }
        if (str3 != null) {
            return str3;
        }
        C4304n nVar = this.f10650a;
        return nVar != null ? nVar.mo24311a(str, str2) : str2;
    }

    /* renamed from: b */
    public abstract C4287e mo24308b();

    /* renamed from: b */
    public Integer mo24314b(String str) {
        Integer num;
        Iterator<String> it = this.f10627d.keySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                num = null;
                break;
            }
            num = this.f10627d.get(it.next()).mo24314b(str);
            if (num != null) {
                break;
            }
        }
        return num == null ? super.mo24314b(str) : num;
    }

    /* renamed from: c */
    public String mo24315c(String str) {
        return mo24311a(str, (String) null);
    }

    /* renamed from: d */
    public Boolean mo24316d(String str) {
        Boolean bool;
        Iterator<String> it = this.f10627d.keySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                bool = null;
                break;
            }
            bool = this.f10627d.get(it.next()).mo24316d(str);
            if (bool != null) {
                break;
            }
        }
        return bool == null ? super.mo24316d(str) : bool;
    }

    public String toString() {
        return String.format("id: %s, params: %s exp: %s", new Object[]{this.f10625b, this.f10650a, this.f10626c});
    }

    /* renamed from: a */
    public Double mo24310a(String str) {
        Double d;
        Iterator<String> it = this.f10627d.keySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                d = null;
                break;
            }
            d = this.f10627d.get(it.next()).mo24310a(str);
            if (d != null) {
                break;
            }
        }
        return d == null ? super.mo24310a(str) : d;
    }

    /* renamed from: a */
    public boolean mo24313a(String str, boolean z) {
        Boolean d = mo24316d(str);
        return d != null ? d.booleanValue() : z;
    }

    /* renamed from: a */
    public void mo24312a(C4287e eVar) {
        eVar.f10625b = this.f10625b;
        eVar.f10650a = this.f10650a;
        eVar.f10626c = new ArrayList(this.f10626c);
        eVar.f10627d = new HashMap(this.f10627d);
    }
}

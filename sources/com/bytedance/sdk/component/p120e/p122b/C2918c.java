package com.bytedance.sdk.component.p120e.p122b;

import android.text.TextUtils;
import com.bytedance.sdk.component.p104b.p105a.C2813i;
import com.bytedance.sdk.component.p104b.p105a.C2816k;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/* renamed from: com.bytedance.sdk.component.e.b.c */
/* compiled from: NetExecutor */
public abstract class C2918c {

    /* renamed from: a */
    private Map<String, Object> f6598a;

    /* renamed from: c */
    protected C2813i f6599c;

    /* renamed from: d */
    protected String f6600d = null;

    /* renamed from: e */
    protected final Map<String, String> f6601e = new HashMap();

    /* renamed from: f */
    protected String f6602f = null;

    public C2918c(C2813i iVar) {
        this.f6599c = iVar;
        mo17791b(UUID.randomUUID().toString());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo17788a(C2816k.C2817a aVar) {
        if (aVar != null && this.f6601e.size() > 0) {
            for (Map.Entry next : this.f6601e.entrySet()) {
                String str = (String) next.getKey();
                if (!TextUtils.isEmpty(str)) {
                    String str2 = (String) next.getValue();
                    if (str2 == null) {
                        str2 = "";
                    }
                    aVar.mo17596b(str, str2);
                }
            }
        }
    }

    /* renamed from: a */
    public void mo17789a(String str) {
        this.f6602f = str;
    }

    /* renamed from: b */
    public String mo17790b() {
        return this.f6600d;
    }

    /* renamed from: b */
    public void mo17791b(String str) {
        this.f6600d = str;
    }

    /* renamed from: b */
    public void mo17792b(String str, String str2) {
        this.f6601e.put(str, str2);
    }

    /* renamed from: c */
    public Map<String, Object> mo17793c() {
        return this.f6598a;
    }

    /* renamed from: d */
    public void mo17794d(Map<String, String> map) {
        if (map != null) {
            for (Map.Entry next : map.entrySet()) {
                this.f6601e.put(next.getKey(), next.getValue());
            }
        }
    }

    /* renamed from: e */
    public void mo17795e(Map<String, Object> map) {
        this.f6598a = map;
    }
}

package com.fyber.inneractive.sdk.measurement;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.model.vast.C4493q;
import com.fyber.inneractive.sdk.response.C5295i;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.fyber.inneractive.sdk.measurement.h */
public class C4467h implements C5295i {

    /* renamed from: a */
    public final /* synthetic */ List f11019a;

    /* renamed from: b */
    public final /* synthetic */ C4469j f11020b;

    public C4467h(C4468i iVar, List list, C4469j jVar) {
        this.f11019a = list;
        this.f11020b = jVar;
    }

    /* renamed from: a */
    public List<String> mo24664a(C4493q qVar) {
        if (this.f11019a == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : this.f11019a) {
            if (!TextUtils.isEmpty(str)) {
                arrayList.add(str.replace("[REASON]", String.valueOf(this.f11020b.f11031a)));
            }
        }
        return arrayList;
    }
}

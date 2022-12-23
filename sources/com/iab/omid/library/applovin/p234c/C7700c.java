package com.iab.omid.library.applovin.p234c;

import android.view.View;
import com.iab.omid.library.applovin.adsession.C7686a;
import com.iab.omid.library.applovin.p233b.C7688a;
import com.iab.omid.library.applovin.p234c.C7697a;
import com.iab.omid.library.applovin.p235d.C7703b;
import com.iab.omid.library.applovin.p235d.C7708f;
import java.util.ArrayList;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.applovin.c.c */
public class C7700c implements C7697a {

    /* renamed from: a */
    private final C7697a f18352a;

    public C7700c(C7697a aVar) {
        this.f18352a = aVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public ArrayList<View> mo54658a() {
        View rootView;
        ArrayList<View> arrayList = new ArrayList<>();
        C7688a a = C7688a.m21396a();
        if (a != null) {
            Collection<C7686a> c = a.mo54610c();
            IdentityHashMap identityHashMap = new IdentityHashMap((c.size() * 2) + 3);
            for (C7686a e : c) {
                View e2 = e.mo54576e();
                if (e2 != null && C7708f.m21502c(e2) && (rootView = e2.getRootView()) != null && !identityHashMap.containsKey(rootView)) {
                    identityHashMap.put(rootView, rootView);
                    float a2 = C7708f.m21500a(rootView);
                    int size = arrayList.size();
                    while (size > 0 && C7708f.m21500a(arrayList.get(size - 1)) > a2) {
                        size--;
                    }
                    arrayList.add(size, rootView);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public JSONObject mo54653a(View view) {
        return C7703b.m21467a(0, 0, 0, 0);
    }

    /* renamed from: a */
    public void mo54654a(View view, JSONObject jSONObject, C7697a.C7698a aVar, boolean z, boolean z2) {
        Iterator<View> it = mo54658a().iterator();
        while (it.hasNext()) {
            aVar.mo54655a(it.next(), this.f18352a, jSONObject, z2);
        }
    }
}

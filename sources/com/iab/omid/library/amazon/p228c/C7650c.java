package com.iab.omid.library.amazon.p228c;

import android.view.View;
import com.iab.omid.library.amazon.adsession.C7636a;
import com.iab.omid.library.amazon.p227b.C7638a;
import com.iab.omid.library.amazon.p228c.C7647a;
import com.iab.omid.library.amazon.p229d.C7653b;
import com.iab.omid.library.amazon.p229d.C7658f;
import java.util.ArrayList;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.amazon.c.c */
public class C7650c implements C7647a {

    /* renamed from: a */
    private final C7647a f18235a;

    public C7650c(C7647a aVar) {
        this.f18235a = aVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public ArrayList<View> mo54459a() {
        View rootView;
        ArrayList<View> arrayList = new ArrayList<>();
        C7638a a = C7638a.m21166a();
        if (a != null) {
            Collection<C7636a> c = a.mo54411c();
            IdentityHashMap identityHashMap = new IdentityHashMap((c.size() * 2) + 3);
            for (C7636a e : c) {
                View e2 = e.mo54377e();
                if (e2 != null && C7658f.m21272c(e2) && (rootView = e2.getRootView()) != null && !identityHashMap.containsKey(rootView)) {
                    identityHashMap.put(rootView, rootView);
                    float a2 = C7658f.m21270a(rootView);
                    int size = arrayList.size();
                    while (size > 0 && C7658f.m21270a(arrayList.get(size - 1)) > a2) {
                        size--;
                    }
                    arrayList.add(size, rootView);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public JSONObject mo54454a(View view) {
        return C7653b.m21237a(0, 0, 0, 0);
    }

    /* renamed from: a */
    public void mo54455a(View view, JSONObject jSONObject, C7647a.C7648a aVar, boolean z, boolean z2) {
        Iterator<View> it = mo54459a().iterator();
        while (it.hasNext()) {
            aVar.mo54456a(it.next(), this.f18235a, jSONObject, z2);
        }
    }
}

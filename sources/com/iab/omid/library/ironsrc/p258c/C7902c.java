package com.iab.omid.library.ironsrc.p258c;

import android.view.View;
import com.iab.omid.library.ironsrc.adsession.C7888a;
import com.iab.omid.library.ironsrc.p257b.C7890a;
import com.iab.omid.library.ironsrc.p258c.C7899a;
import com.iab.omid.library.ironsrc.p259d.C7905b;
import com.iab.omid.library.ironsrc.p259d.C7910f;
import java.util.ArrayList;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.ironsrc.c.c */
public class C7902c implements C7899a {

    /* renamed from: a */
    private final C7899a f18812a;

    public C7902c(C7899a aVar) {
        this.f18812a = aVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public ArrayList<View> mo55432a() {
        View rootView;
        ArrayList<View> arrayList = new ArrayList<>();
        C7890a a = C7890a.m22302a();
        if (a != null) {
            Collection<C7888a> c = a.mo55392c();
            IdentityHashMap identityHashMap = new IdentityHashMap((c.size() * 2) + 3);
            for (C7888a d : c) {
                View d2 = d.mo55358d();
                if (d2 != null && C7910f.m22403c(d2) && (rootView = d2.getRootView()) != null && !identityHashMap.containsKey(rootView)) {
                    identityHashMap.put(rootView, rootView);
                    float a2 = C7910f.m22401a(rootView);
                    int size = arrayList.size();
                    while (size > 0 && C7910f.m22401a(arrayList.get(size - 1)) > a2) {
                        size--;
                    }
                    arrayList.add(size, rootView);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public JSONObject mo55427a(View view) {
        return C7905b.m22370a(0, 0, 0, 0);
    }

    /* renamed from: a */
    public void mo55428a(View view, JSONObject jSONObject, C7899a.C7900a aVar, boolean z) {
        Iterator<View> it = mo55432a().iterator();
        while (it.hasNext()) {
            aVar.mo55429a(it.next(), this.f18812a, jSONObject);
        }
    }
}

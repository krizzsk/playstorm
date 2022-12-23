package com.iab.omid.library.smaato.p276c;

import android.view.View;
import com.iab.omid.library.smaato.adsession.C8039a;
import com.iab.omid.library.smaato.p275b.C8041a;
import com.iab.omid.library.smaato.p276c.C8050a;
import com.iab.omid.library.smaato.p277d.C8056b;
import com.iab.omid.library.smaato.p277d.C8061f;
import java.util.ArrayList;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.smaato.c.c */
public class C8053c implements C8050a {

    /* renamed from: a */
    private final C8050a f19163a;

    public C8053c(C8050a aVar) {
        this.f19163a = aVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public ArrayList<View> mo56039a() {
        View rootView;
        ArrayList<View> arrayList = new ArrayList<>();
        C8041a a = C8041a.m22982a();
        if (a != null) {
            Collection<C8039a> c = a.mo55991c();
            IdentityHashMap identityHashMap = new IdentityHashMap((c.size() * 2) + 3);
            for (C8039a d : c) {
                View d2 = d.mo55957d();
                if (d2 != null && C8061f.m23086c(d2) && (rootView = d2.getRootView()) != null && !identityHashMap.containsKey(rootView)) {
                    identityHashMap.put(rootView, rootView);
                    float a2 = C8061f.m23084a(rootView);
                    int size = arrayList.size();
                    while (size > 0 && C8061f.m23084a(arrayList.get(size - 1)) > a2) {
                        size--;
                    }
                    arrayList.add(size, rootView);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public JSONObject mo56034a(View view) {
        return C8056b.m23053a(0, 0, 0, 0);
    }

    /* renamed from: a */
    public void mo56035a(View view, JSONObject jSONObject, C8050a.C8051a aVar, boolean z) {
        Iterator<View> it = mo56039a().iterator();
        while (it.hasNext()) {
            aVar.mo56036a(it.next(), this.f19163a, jSONObject);
        }
    }
}

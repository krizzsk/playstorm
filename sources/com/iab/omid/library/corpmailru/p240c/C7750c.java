package com.iab.omid.library.corpmailru.p240c;

import android.view.View;
import com.iab.omid.library.corpmailru.adsession.C7736a;
import com.iab.omid.library.corpmailru.p239b.C7738a;
import com.iab.omid.library.corpmailru.p240c.C7747a;
import com.iab.omid.library.corpmailru.p241d.C7753b;
import com.iab.omid.library.corpmailru.p241d.C7758f;
import java.util.ArrayList;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.corpmailru.c.c */
public class C7750c implements C7747a {

    /* renamed from: a */
    private final C7747a f18468a;

    public C7750c(C7747a aVar) {
        this.f18468a = aVar;
    }

    /* renamed from: a */
    public ArrayList<View> mo54853a() {
        View rootView;
        ArrayList<View> arrayList = new ArrayList<>();
        C7738a a = C7738a.m21624a();
        if (a != null) {
            Collection<C7736a> c = a.mo54805c();
            IdentityHashMap identityHashMap = new IdentityHashMap((c.size() * 2) + 3);
            for (C7736a d : c) {
                View d2 = d.mo54771d();
                if (d2 != null && C7758f.m21728c(d2) && (rootView = d2.getRootView()) != null && !identityHashMap.containsKey(rootView)) {
                    identityHashMap.put(rootView, rootView);
                    float a2 = C7758f.m21726a(rootView);
                    int size = arrayList.size();
                    while (size > 0 && C7758f.m21726a(arrayList.get(size - 1)) > a2) {
                        size--;
                    }
                    arrayList.add(size, rootView);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public JSONObject mo54848a(View view) {
        return C7753b.m21695a(0, 0, 0, 0);
    }

    /* renamed from: a */
    public void mo54849a(View view, JSONObject jSONObject, C7747a.C7748a aVar, boolean z) {
        Iterator<View> it = mo54853a().iterator();
        while (it.hasNext()) {
            aVar.mo54850a(it.next(), this.f18468a, jSONObject);
        }
    }
}

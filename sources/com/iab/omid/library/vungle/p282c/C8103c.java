package com.iab.omid.library.vungle.p282c;

import android.view.View;
import com.iab.omid.library.vungle.adsession.C8089a;
import com.iab.omid.library.vungle.p281b.C8091a;
import com.iab.omid.library.vungle.p282c.C8100a;
import com.iab.omid.library.vungle.p283d.C8106b;
import com.iab.omid.library.vungle.p283d.C8111f;
import java.util.ArrayList;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.vungle.c.c */
public class C8103c implements C8100a {

    /* renamed from: a */
    private final C8100a f19276a;

    public C8103c(C8100a aVar) {
        this.f19276a = aVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public ArrayList<View> mo56233a() {
        View rootView;
        ArrayList<View> arrayList = new ArrayList<>();
        C8091a a = C8091a.m23206a();
        if (a != null) {
            Collection<C8089a> c = a.mo56185c();
            IdentityHashMap identityHashMap = new IdentityHashMap((c.size() * 2) + 3);
            for (C8089a d : c) {
                View d2 = d.mo56151d();
                if (d2 != null && C8111f.m23310c(d2) && (rootView = d2.getRootView()) != null && !identityHashMap.containsKey(rootView)) {
                    identityHashMap.put(rootView, rootView);
                    float a2 = C8111f.m23308a(rootView);
                    int size = arrayList.size();
                    while (size > 0 && C8111f.m23308a(arrayList.get(size - 1)) > a2) {
                        size--;
                    }
                    arrayList.add(size, rootView);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public JSONObject mo56228a(View view) {
        return C8106b.m23277a(0, 0, 0, 0);
    }

    /* renamed from: a */
    public void mo56229a(View view, JSONObject jSONObject, C8100a.C8101a aVar, boolean z) {
        Iterator<View> it = mo56233a().iterator();
        while (it.hasNext()) {
            aVar.mo56230a(it.next(), this.f19276a, jSONObject);
        }
    }
}

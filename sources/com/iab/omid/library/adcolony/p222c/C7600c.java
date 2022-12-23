package com.iab.omid.library.adcolony.p222c;

import android.view.View;
import com.iab.omid.library.adcolony.adsession.C7586a;
import com.iab.omid.library.adcolony.p221b.C7588a;
import com.iab.omid.library.adcolony.p222c.C7597a;
import com.iab.omid.library.adcolony.p223d.C7603b;
import com.iab.omid.library.adcolony.p223d.C7608f;
import java.util.ArrayList;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.adcolony.c.c */
public class C7600c implements C7597a {

    /* renamed from: a */
    private final C7597a f18118a;

    public C7600c(C7597a aVar) {
        this.f18118a = aVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public ArrayList<View> mo54260a() {
        View rootView;
        ArrayList<View> arrayList = new ArrayList<>();
        C7588a a = C7588a.m20936a();
        if (a != null) {
            Collection<C7586a> c = a.mo54212c();
            IdentityHashMap identityHashMap = new IdentityHashMap((c.size() * 2) + 3);
            for (C7586a e : c) {
                View e2 = e.mo54178e();
                if (e2 != null && C7608f.m21042c(e2) && (rootView = e2.getRootView()) != null && !identityHashMap.containsKey(rootView)) {
                    identityHashMap.put(rootView, rootView);
                    float a2 = C7608f.m21040a(rootView);
                    int size = arrayList.size();
                    while (size > 0 && C7608f.m21040a(arrayList.get(size - 1)) > a2) {
                        size--;
                    }
                    arrayList.add(size, rootView);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public JSONObject mo54255a(View view) {
        return C7603b.m21007a(0, 0, 0, 0);
    }

    /* renamed from: a */
    public void mo54256a(View view, JSONObject jSONObject, C7597a.C7598a aVar, boolean z, boolean z2) {
        Iterator<View> it = mo54260a().iterator();
        while (it.hasNext()) {
            aVar.mo54257a(it.next(), this.f18118a, jSONObject, z2);
        }
    }
}

package com.iab.omid.library.inmobi.p252c;

import android.view.View;
import com.iab.omid.library.inmobi.adsession.C7838a;
import com.iab.omid.library.inmobi.p251b.C7840a;
import com.iab.omid.library.inmobi.p252c.C7849a;
import com.iab.omid.library.inmobi.p253d.C7855b;
import com.iab.omid.library.inmobi.p253d.C7860f;
import java.util.ArrayList;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.inmobi.c.c */
public class C7852c implements C7849a {

    /* renamed from: a */
    private final C7849a f18698a;

    public C7852c(C7849a aVar) {
        this.f18698a = aVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public ArrayList<View> mo55246a() {
        View rootView;
        ArrayList<View> arrayList = new ArrayList<>();
        C7840a a = C7840a.m22078a();
        if (a != null) {
            Collection<C7838a> c = a.mo55198c();
            IdentityHashMap identityHashMap = new IdentityHashMap((c.size() * 2) + 3);
            for (C7838a d : c) {
                View d2 = d.mo55164d();
                if (d2 != null && C7860f.m22182c(d2) && (rootView = d2.getRootView()) != null && !identityHashMap.containsKey(rootView)) {
                    identityHashMap.put(rootView, rootView);
                    float a2 = C7860f.m22180a(rootView);
                    int size = arrayList.size();
                    while (size > 0 && C7860f.m22180a(arrayList.get(size - 1)) > a2) {
                        size--;
                    }
                    arrayList.add(size, rootView);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public JSONObject mo55241a(View view) {
        return C7855b.m22149a(0, 0, 0, 0);
    }

    /* renamed from: a */
    public void mo55242a(View view, JSONObject jSONObject, C7849a.C7850a aVar, boolean z) {
        Iterator<View> it = mo55246a().iterator();
        while (it.hasNext()) {
            aVar.mo55243a(it.next(), this.f18698a, jSONObject);
        }
    }
}

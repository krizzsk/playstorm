package com.iab.omid.library.fyber.p246c;

import android.view.View;
import com.iab.omid.library.fyber.adsession.C7787a;
import com.iab.omid.library.fyber.p245b.C7789a;
import com.iab.omid.library.fyber.p246c.C7798a;
import com.iab.omid.library.fyber.p247d.C7804b;
import com.iab.omid.library.fyber.p247d.C7809f;
import java.util.ArrayList;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.fyber.c.c */
public class C7801c implements C7798a {

    /* renamed from: a */
    private final C7798a f18582a;

    public C7801c(C7798a aVar) {
        this.f18582a = aVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public ArrayList<View> mo55051a() {
        View rootView;
        ArrayList<View> arrayList = new ArrayList<>();
        C7789a a = C7789a.m21850a();
        if (a != null) {
            Collection<C7787a> c = a.mo55003c();
            IdentityHashMap identityHashMap = new IdentityHashMap((c.size() * 2) + 3);
            for (C7787a e : c) {
                View e2 = e.mo54969e();
                if (e2 != null && C7809f.m21956c(e2) && (rootView = e2.getRootView()) != null && !identityHashMap.containsKey(rootView)) {
                    identityHashMap.put(rootView, rootView);
                    float a2 = C7809f.m21954a(rootView);
                    int size = arrayList.size();
                    while (size > 0 && C7809f.m21954a(arrayList.get(size - 1)) > a2) {
                        size--;
                    }
                    arrayList.add(size, rootView);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public JSONObject mo55046a(View view) {
        return C7804b.m21921a(0, 0, 0, 0);
    }

    /* renamed from: a */
    public void mo55047a(View view, JSONObject jSONObject, C7798a.C7799a aVar, boolean z, boolean z2) {
        Iterator<View> it = mo55051a().iterator();
        while (it.hasNext()) {
            aVar.mo55048a(it.next(), this.f18582a, jSONObject, z2);
        }
    }
}

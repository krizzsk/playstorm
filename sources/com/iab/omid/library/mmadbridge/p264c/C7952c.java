package com.iab.omid.library.mmadbridge.p264c;

import android.view.View;
import com.iab.omid.library.mmadbridge.adsession.C7938a;
import com.iab.omid.library.mmadbridge.p263b.C7940a;
import com.iab.omid.library.mmadbridge.p264c.C7949a;
import com.iab.omid.library.mmadbridge.p265d.C7955b;
import com.iab.omid.library.mmadbridge.p265d.C7960f;
import java.util.ArrayList;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.mmadbridge.c.c */
public class C7952c implements C7949a {

    /* renamed from: a */
    private final C7949a f18926a;

    public C7952c(C7949a aVar) {
        this.f18926a = aVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public ArrayList<View> mo55630a() {
        View rootView;
        ArrayList<View> arrayList = new ArrayList<>();
        C7940a a = C7940a.m22525a();
        if (a != null) {
            Collection<C7938a> c = a.mo55582c();
            IdentityHashMap identityHashMap = new IdentityHashMap((c.size() * 2) + 3);
            for (C7938a e : c) {
                View e2 = e.mo55548e();
                if (e2 != null && C7960f.m22631c(e2) && (rootView = e2.getRootView()) != null && !identityHashMap.containsKey(rootView)) {
                    identityHashMap.put(rootView, rootView);
                    float a2 = C7960f.m22629a(rootView);
                    int size = arrayList.size();
                    while (size > 0 && C7960f.m22629a(arrayList.get(size - 1)) > a2) {
                        size--;
                    }
                    arrayList.add(size, rootView);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public JSONObject mo55625a(View view) {
        return C7955b.m22596a(0, 0, 0, 0);
    }

    /* renamed from: a */
    public void mo55626a(View view, JSONObject jSONObject, C7949a.C7950a aVar, boolean z, boolean z2) {
        Iterator<View> it = mo55630a().iterator();
        while (it.hasNext()) {
            aVar.mo55627a(it.next(), this.f18926a, jSONObject, z2);
        }
    }
}

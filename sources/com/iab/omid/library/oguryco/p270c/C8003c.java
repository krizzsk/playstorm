package com.iab.omid.library.oguryco.p270c;

import android.view.View;
import com.iab.omid.library.oguryco.adsession.C7988a;
import com.iab.omid.library.oguryco.p269b.C7990a;
import com.iab.omid.library.oguryco.p270c.C8000a;
import com.iab.omid.library.oguryco.p271d.C8006b;
import com.iab.omid.library.oguryco.p271d.C8011f;
import java.util.ArrayList;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.oguryco.c.c */
public class C8003c implements C8000a {

    /* renamed from: a */
    private final C8000a f19050a;

    public C8003c(C8000a aVar) {
        this.f19050a = aVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public ArrayList<View> mo55845a() {
        View rootView;
        ArrayList<View> arrayList = new ArrayList<>();
        C7990a a = C7990a.m22755a();
        if (a != null) {
            Collection<C7988a> c = a.mo55803c();
            IdentityHashMap identityHashMap = new IdentityHashMap((c.size() * 2) + 3);
            for (C7988a d : c) {
                View d2 = d.mo55745d();
                if (d2 != null && C8011f.m22862c(d2) && (rootView = d2.getRootView()) != null && !identityHashMap.containsKey(rootView)) {
                    identityHashMap.put(rootView, rootView);
                    float a2 = C8011f.m22860a(rootView);
                    int size = arrayList.size();
                    while (size > 0 && C8011f.m22860a(arrayList.get(size - 1)) > a2) {
                        size--;
                    }
                    arrayList.add(size, rootView);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public JSONObject mo55840a(View view) {
        return C8006b.m22829a(0, 0, 0, 0);
    }

    /* renamed from: a */
    public void mo55841a(View view, JSONObject jSONObject, C8000a.C8001a aVar, boolean z) {
        Iterator<View> it = mo55845a().iterator();
        while (it.hasNext()) {
            aVar.mo55842a(it.next(), this.f19050a, jSONObject);
        }
    }
}

package com.tapjoy.internal;

import android.view.View;
import com.tapjoy.internal.C11515dj;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* renamed from: com.tapjoy.internal.dl */
public final class C11518dl implements C11515dj {

    /* renamed from: a */
    private final C11515dj f27875a;

    public C11518dl(C11515dj djVar) {
        this.f27875a = djVar;
    }

    /* renamed from: a */
    public final JSONObject mo72311a(View view) {
        return C11521do.m33433a(0, 0, 0, 0);
    }

    /* renamed from: a */
    public final void mo72312a(View view, JSONObject jSONObject, C11515dj.C11516a aVar, boolean z) {
        View rootView;
        ArrayList arrayList = new ArrayList();
        C11507dd a = C11507dd.m33405a();
        if (a != null) {
            Collection<T> unmodifiableCollection = Collections.unmodifiableCollection(a.f27852b);
            IdentityHashMap identityHashMap = new IdentityHashMap((unmodifiableCollection.size() * 2) + 3);
            for (T c : unmodifiableCollection) {
                View c2 = c.mo72289c();
                if (c2 != null && C11525dr.m33451b(c2) && (rootView = c2.getRootView()) != null && !identityHashMap.containsKey(rootView)) {
                    identityHashMap.put(rootView, rootView);
                    float a2 = C11525dr.m33450a(rootView);
                    int size = arrayList.size();
                    while (size > 0 && C11525dr.m33450a((View) arrayList.get(size - 1)) > a2) {
                        size--;
                    }
                    arrayList.add(size, rootView);
                }
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            aVar.mo72313a((View) it.next(), this.f27875a, jSONObject);
        }
    }
}

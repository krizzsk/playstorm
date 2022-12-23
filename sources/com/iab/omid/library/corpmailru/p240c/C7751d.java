package com.iab.omid.library.corpmailru.p240c;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import com.iab.omid.library.corpmailru.p240c.C7747a;
import com.iab.omid.library.corpmailru.p241d.C7753b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.corpmailru.c.d */
public class C7751d implements C7747a {

    /* renamed from: a */
    private final int[] f18469a = new int[2];

    /* renamed from: a */
    private void m21686a(ViewGroup viewGroup, JSONObject jSONObject, C7747a.C7748a aVar) {
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            aVar.mo54850a(viewGroup.getChildAt(i), this, jSONObject);
        }
    }

    /* renamed from: b */
    private void m21687b(ViewGroup viewGroup, JSONObject jSONObject, C7747a.C7748a aVar) {
        HashMap hashMap = new HashMap();
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            View childAt = viewGroup.getChildAt(i);
            ArrayList arrayList = (ArrayList) hashMap.get(Float.valueOf(childAt.getZ()));
            if (arrayList == null) {
                arrayList = new ArrayList();
                hashMap.put(Float.valueOf(childAt.getZ()), arrayList);
            }
            arrayList.add(childAt);
        }
        ArrayList arrayList2 = new ArrayList(hashMap.keySet());
        Collections.sort(arrayList2);
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            Iterator it2 = ((ArrayList) hashMap.get((Float) it.next())).iterator();
            while (it2.hasNext()) {
                aVar.mo54850a((View) it2.next(), this, jSONObject);
            }
        }
    }

    /* renamed from: a */
    public JSONObject mo54848a(View view) {
        if (view == null) {
            return C7753b.m21695a(0, 0, 0, 0);
        }
        int width = view.getWidth();
        int height = view.getHeight();
        view.getLocationOnScreen(this.f18469a);
        int[] iArr = this.f18469a;
        return C7753b.m21695a(iArr[0], iArr[1], width, height);
    }

    /* renamed from: a */
    public void mo54849a(View view, JSONObject jSONObject, C7747a.C7748a aVar, boolean z) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (!z || Build.VERSION.SDK_INT < 21) {
                m21686a(viewGroup, jSONObject, aVar);
            } else {
                m21687b(viewGroup, jSONObject, aVar);
            }
        }
    }
}

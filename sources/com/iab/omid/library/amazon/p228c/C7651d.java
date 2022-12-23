package com.iab.omid.library.amazon.p228c;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import com.iab.omid.library.amazon.p228c.C7647a;
import com.iab.omid.library.amazon.p229d.C7653b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.amazon.c.d */
public class C7651d implements C7647a {

    /* renamed from: a */
    private final int[] f18236a = new int[2];

    /* renamed from: a */
    private void m21228a(ViewGroup viewGroup, JSONObject jSONObject, C7647a.C7648a aVar, boolean z) {
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            aVar.mo54456a(viewGroup.getChildAt(i), this, jSONObject, z);
        }
    }

    /* renamed from: b */
    private void m21229b(ViewGroup viewGroup, JSONObject jSONObject, C7647a.C7648a aVar, boolean z) {
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
                aVar.mo54456a((View) it2.next(), this, jSONObject, z);
            }
        }
    }

    /* renamed from: a */
    public JSONObject mo54454a(View view) {
        if (view == null) {
            return C7653b.m21237a(0, 0, 0, 0);
        }
        int width = view.getWidth();
        int height = view.getHeight();
        view.getLocationOnScreen(this.f18236a);
        int[] iArr = this.f18236a;
        return C7653b.m21237a(iArr[0], iArr[1], width, height);
    }

    /* renamed from: a */
    public void mo54455a(View view, JSONObject jSONObject, C7647a.C7648a aVar, boolean z, boolean z2) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (!z || Build.VERSION.SDK_INT < 21) {
                m21228a(viewGroup, jSONObject, aVar, z2);
            } else {
                m21229b(viewGroup, jSONObject, aVar, z2);
            }
        }
    }
}

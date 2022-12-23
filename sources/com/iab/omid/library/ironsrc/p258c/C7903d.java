package com.iab.omid.library.ironsrc.p258c;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import com.iab.omid.library.ironsrc.p258c.C7899a;
import com.iab.omid.library.ironsrc.p259d.C7905b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.ironsrc.c.d */
public class C7903d implements C7899a {

    /* renamed from: a */
    private final int[] f18813a = new int[2];

    /* renamed from: a */
    private void m22361a(ViewGroup viewGroup, JSONObject jSONObject, C7899a.C7900a aVar) {
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            aVar.mo55429a(viewGroup.getChildAt(i), this, jSONObject);
        }
    }

    /* renamed from: b */
    private void m22362b(ViewGroup viewGroup, JSONObject jSONObject, C7899a.C7900a aVar) {
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
                aVar.mo55429a((View) it2.next(), this, jSONObject);
            }
        }
    }

    /* renamed from: a */
    public JSONObject mo55427a(View view) {
        if (view == null) {
            return C7905b.m22370a(0, 0, 0, 0);
        }
        int width = view.getWidth();
        int height = view.getHeight();
        view.getLocationOnScreen(this.f18813a);
        int[] iArr = this.f18813a;
        return C7905b.m22370a(iArr[0], iArr[1], width, height);
    }

    /* renamed from: a */
    public void mo55428a(View view, JSONObject jSONObject, C7899a.C7900a aVar, boolean z) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (!z || Build.VERSION.SDK_INT < 21) {
                m22361a(viewGroup, jSONObject, aVar);
            } else {
                m22362b(viewGroup, jSONObject, aVar);
            }
        }
    }
}

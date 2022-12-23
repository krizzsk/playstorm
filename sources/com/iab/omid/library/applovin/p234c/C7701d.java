package com.iab.omid.library.applovin.p234c;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import com.iab.omid.library.applovin.p234c.C7697a;
import com.iab.omid.library.applovin.p235d.C7703b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.applovin.c.d */
public class C7701d implements C7697a {

    /* renamed from: a */
    private final int[] f18353a = new int[2];

    /* renamed from: a */
    private void m21458a(ViewGroup viewGroup, JSONObject jSONObject, C7697a.C7698a aVar, boolean z) {
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            aVar.mo54655a(viewGroup.getChildAt(i), this, jSONObject, z);
        }
    }

    /* renamed from: b */
    private void m21459b(ViewGroup viewGroup, JSONObject jSONObject, C7697a.C7698a aVar, boolean z) {
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
                aVar.mo54655a((View) it2.next(), this, jSONObject, z);
            }
        }
    }

    /* renamed from: a */
    public JSONObject mo54653a(View view) {
        if (view == null) {
            return C7703b.m21467a(0, 0, 0, 0);
        }
        int width = view.getWidth();
        int height = view.getHeight();
        view.getLocationOnScreen(this.f18353a);
        int[] iArr = this.f18353a;
        return C7703b.m21467a(iArr[0], iArr[1], width, height);
    }

    /* renamed from: a */
    public void mo54654a(View view, JSONObject jSONObject, C7697a.C7698a aVar, boolean z, boolean z2) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (!z || Build.VERSION.SDK_INT < 21) {
                m21458a(viewGroup, jSONObject, aVar, z2);
            } else {
                m21459b(viewGroup, jSONObject, aVar, z2);
            }
        }
    }
}

package com.iab.omid.library.inmobi.p252c;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import com.iab.omid.library.inmobi.p252c.C7849a;
import com.iab.omid.library.inmobi.p253d.C7855b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.inmobi.c.d */
public class C7853d implements C7849a {

    /* renamed from: a */
    private final int[] f18699a = new int[2];

    /* renamed from: a */
    private void m22140a(ViewGroup viewGroup, JSONObject jSONObject, C7849a.C7850a aVar) {
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            aVar.mo55243a(viewGroup.getChildAt(i), this, jSONObject);
        }
    }

    /* renamed from: b */
    private void m22141b(ViewGroup viewGroup, JSONObject jSONObject, C7849a.C7850a aVar) {
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
                aVar.mo55243a((View) it2.next(), this, jSONObject);
            }
        }
    }

    /* renamed from: a */
    public JSONObject mo55241a(View view) {
        if (view == null) {
            return C7855b.m22149a(0, 0, 0, 0);
        }
        int width = view.getWidth();
        int height = view.getHeight();
        view.getLocationOnScreen(this.f18699a);
        int[] iArr = this.f18699a;
        return C7855b.m22149a(iArr[0], iArr[1], width, height);
    }

    /* renamed from: a */
    public void mo55242a(View view, JSONObject jSONObject, C7849a.C7850a aVar, boolean z) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (!z || Build.VERSION.SDK_INT < 21) {
                m22140a(viewGroup, jSONObject, aVar);
            } else {
                m22141b(viewGroup, jSONObject, aVar);
            }
        }
    }
}

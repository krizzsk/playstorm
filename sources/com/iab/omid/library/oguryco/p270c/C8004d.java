package com.iab.omid.library.oguryco.p270c;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import com.iab.omid.library.oguryco.p270c.C8000a;
import com.iab.omid.library.oguryco.p271d.C8006b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.oguryco.c.d */
public class C8004d implements C8000a {

    /* renamed from: a */
    private final int[] f19051a = new int[2];

    /* renamed from: a */
    private void m22820a(ViewGroup viewGroup, JSONObject jSONObject, C8000a.C8001a aVar) {
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            aVar.mo55842a(viewGroup.getChildAt(i), this, jSONObject);
        }
    }

    /* renamed from: b */
    private void m22821b(ViewGroup viewGroup, JSONObject jSONObject, C8000a.C8001a aVar) {
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
                aVar.mo55842a((View) it2.next(), this, jSONObject);
            }
        }
    }

    /* renamed from: a */
    public JSONObject mo55840a(View view) {
        if (view == null) {
            return C8006b.m22829a(0, 0, 0, 0);
        }
        int width = view.getWidth();
        int height = view.getHeight();
        view.getLocationOnScreen(this.f19051a);
        int[] iArr = this.f19051a;
        return C8006b.m22829a(iArr[0], iArr[1], width, height);
    }

    /* renamed from: a */
    public void mo55841a(View view, JSONObject jSONObject, C8000a.C8001a aVar, boolean z) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (!z || Build.VERSION.SDK_INT < 21) {
                m22820a(viewGroup, jSONObject, aVar);
            } else {
                m22821b(viewGroup, jSONObject, aVar);
            }
        }
    }
}

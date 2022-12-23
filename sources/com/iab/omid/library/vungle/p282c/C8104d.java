package com.iab.omid.library.vungle.p282c;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import com.iab.omid.library.vungle.p282c.C8100a;
import com.iab.omid.library.vungle.p283d.C8106b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.vungle.c.d */
public class C8104d implements C8100a {

    /* renamed from: a */
    private final int[] f19277a = new int[2];

    /* renamed from: a */
    private void m23268a(ViewGroup viewGroup, JSONObject jSONObject, C8100a.C8101a aVar) {
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            aVar.mo56230a(viewGroup.getChildAt(i), this, jSONObject);
        }
    }

    /* renamed from: b */
    private void m23269b(ViewGroup viewGroup, JSONObject jSONObject, C8100a.C8101a aVar) {
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
                aVar.mo56230a((View) it2.next(), this, jSONObject);
            }
        }
    }

    /* renamed from: a */
    public JSONObject mo56228a(View view) {
        if (view == null) {
            return C8106b.m23277a(0, 0, 0, 0);
        }
        int width = view.getWidth();
        int height = view.getHeight();
        view.getLocationOnScreen(this.f19277a);
        int[] iArr = this.f19277a;
        return C8106b.m23277a(iArr[0], iArr[1], width, height);
    }

    /* renamed from: a */
    public void mo56229a(View view, JSONObject jSONObject, C8100a.C8101a aVar, boolean z) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (!z || Build.VERSION.SDK_INT < 21) {
                m23268a(viewGroup, jSONObject, aVar);
            } else {
                m23269b(viewGroup, jSONObject, aVar);
            }
        }
    }
}

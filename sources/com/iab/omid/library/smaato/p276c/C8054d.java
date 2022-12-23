package com.iab.omid.library.smaato.p276c;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import com.iab.omid.library.smaato.p276c.C8050a;
import com.iab.omid.library.smaato.p277d.C8056b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.smaato.c.d */
public class C8054d implements C8050a {

    /* renamed from: a */
    private final int[] f19164a = new int[2];

    /* renamed from: a */
    private void m23044a(ViewGroup viewGroup, JSONObject jSONObject, C8050a.C8051a aVar) {
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            aVar.mo56036a(viewGroup.getChildAt(i), this, jSONObject);
        }
    }

    /* renamed from: b */
    private void m23045b(ViewGroup viewGroup, JSONObject jSONObject, C8050a.C8051a aVar) {
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
                aVar.mo56036a((View) it2.next(), this, jSONObject);
            }
        }
    }

    /* renamed from: a */
    public JSONObject mo56034a(View view) {
        if (view == null) {
            return C8056b.m23053a(0, 0, 0, 0);
        }
        int width = view.getWidth();
        int height = view.getHeight();
        view.getLocationOnScreen(this.f19164a);
        int[] iArr = this.f19164a;
        return C8056b.m23053a(iArr[0], iArr[1], width, height);
    }

    /* renamed from: a */
    public void mo56035a(View view, JSONObject jSONObject, C8050a.C8051a aVar, boolean z) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (!z || Build.VERSION.SDK_INT < 21) {
                m23044a(viewGroup, jSONObject, aVar);
            } else {
                m23045b(viewGroup, jSONObject, aVar);
            }
        }
    }
}

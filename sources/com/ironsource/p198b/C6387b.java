package com.ironsource.p198b;

import android.util.Pair;
import com.ironsource.mediationsdk.p207a.C6552c;
import com.ironsource.p200d.C6393b;
import com.ironsource.p200d.C6396c;
import java.util.ArrayList;

/* renamed from: com.ironsource.b.b */
public final class C6387b implements Runnable {

    /* renamed from: a */
    private C6388c f16233a;

    /* renamed from: b */
    private String f16234b;

    /* renamed from: c */
    private String f16235c;

    /* renamed from: d */
    private ArrayList<C6552c> f16236d;

    public C6387b(C6388c cVar, String str, String str2, ArrayList<C6552c> arrayList) {
        this.f16233a = cVar;
        this.f16234b = str;
        this.f16235c = str2;
        this.f16236d = arrayList;
    }

    public final void run() {
        boolean z = false;
        try {
            ArrayList arrayList = new ArrayList();
            arrayList.add(new Pair("Content-Type", "application/json"));
            C6396c a = C6393b.m19186a(this.f16235c, this.f16234b, arrayList);
            if (a != null && (a.f16255a == 200 || a.f16255a == 204)) {
                z = true;
            }
        } catch (Exception unused) {
        }
        C6388c cVar = this.f16233a;
        if (cVar != null) {
            cVar.mo35873a((ArrayList<C6552c>) null, z);
        }
    }
}

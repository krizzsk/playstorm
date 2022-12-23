package com.p374my.target;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.p374my.target.C10018w4;
import com.p374my.target.C9887o7;
import com.p374my.target.C9918q4;
import com.p374my.target.C9947s4;
import com.p374my.target.C9955s7;
import com.p374my.target.common.models.VideoData;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.my.target.n7 */
public class C9863n7 {

    /* renamed from: a */
    public final C9996v1 f24402a;

    /* renamed from: b */
    public final C9897p3 f24403b;

    /* renamed from: c */
    public final Context f24404c;

    /* renamed from: d */
    public final C10038x7 f24405d;

    /* renamed from: e */
    public boolean f24406e = C9864n8.m28843a();

    public C9863n7(C9996v1 v1Var, C9897p3 p3Var, Context context) {
        this.f24402a = v1Var;
        this.f24403b = p3Var;
        this.f24404c = context;
        this.f24405d = C10038x7.m29711a(context);
    }

    /* renamed from: a */
    public static C9863n7 m28830a(C9996v1 v1Var, C9897p3 p3Var, Context context) {
        return new C9863n7(v1Var, p3Var, context);
    }

    /* renamed from: a */
    public C9860n4 mo64880a(C9711g2<VideoData> g2Var, C10055y5 y5Var, C9947s4.C9948a aVar) {
        return C9947s4.m29211a(g2Var, y5Var, aVar, this, this.f24406e ? C9687e9.m27944a(y5Var.getContext()) : C9668d9.m27851p());
    }

    /* renamed from: a */
    public C9887o7 mo64881a(C9887o7.C9888a aVar) {
        return new C9909p7(this.f24405d, this.f24404c, aVar);
    }

    /* renamed from: a */
    public C9918q4 mo64882a(C9640c2 c2Var, C9918q4.C9919a aVar) {
        return C9932r4.m29135a(c2Var, aVar);
    }

    /* renamed from: a */
    public C9955s7 mo64883a(C9697f2 f2Var, View view, View view2, View view3, C9955s7.C9956a aVar) {
        if (!f2Var.getInterstitialAdCards().isEmpty()) {
            return new C9992u7(f2Var.getInterstitialAdCards().get(0).isImageOnly(), view, view2, aVar, view3, this.f24405d, this.f24404c);
        } else if (f2Var.getVideoBanner() != null) {
            return new C10022w7(view, view2, aVar, view3, this.f24405d, this.f24404c);
        } else {
            return new C10007v7(view, view2, aVar, view3, this.f24405d, this.f24404c);
        }
    }

    /* renamed from: a */
    public C9977t8 mo64884a(C9711g2<VideoData> g2Var) {
        return C9977t8.m29379a(g2Var, this.f24403b, this.f24404c);
    }

    /* renamed from: a */
    public C10018w4 mo64885a(C9686e8 e8Var, List<C9640c2> list, C10018w4.C10019a aVar) {
        C10018w4 a = C9999v4.m29562a((C9666d8) e8Var, list, aVar);
        ArrayList arrayList = new ArrayList();
        for (C9640c2 a2 : list) {
            arrayList.add(mo64882a(a2, a));
        }
        e8Var.setAdapter(new C10058y7(arrayList, this));
        return a;
    }

    /* renamed from: a */
    public C10080z7 mo64886a() {
        return new C9608a8(this.f24404c, this.f24402a, this.f24405d);
    }

    /* renamed from: a */
    public void mo64887a(boolean z) {
        this.f24406e = z && C9864n8.m28843a();
    }

    /* renamed from: b */
    public C10055y5 mo64888b() {
        return new C10055y5(this.f24404c);
    }

    /* renamed from: c */
    public C9686e8 mo64889c() {
        return new C9686e8(this.f24404c);
    }

    /* renamed from: d */
    public Handler mo64890d() {
        return new Handler(Looper.getMainLooper());
    }

    /* renamed from: e */
    public C9926q7 mo64891e() {
        return new C9936r7(this.f24404c);
    }
}

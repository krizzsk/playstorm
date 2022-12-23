package com.p374my.target;

import android.content.Context;
import com.p374my.target.common.models.VideoData;

/* renamed from: com.my.target.i1 */
public class C9750i1 {

    /* renamed from: a */
    public final C9897p3 f24038a;

    /* renamed from: b */
    public final Context f24039b;

    /* renamed from: c */
    public boolean f24040c = C9864n8.m28843a();

    public C9750i1(C9897p3 p3Var, Context context) {
        this.f24038a = p3Var;
        this.f24039b = context;
    }

    /* renamed from: a */
    public static C9750i1 m28217a(C9897p3 p3Var, Context context) {
        return new C9750i1(p3Var, context);
    }

    /* renamed from: a */
    public C9651c9 mo64232a() {
        return this.f24040c ? C9687e9.m27944a(this.f24039b) : C9668d9.m27851p();
    }

    /* renamed from: a */
    public C9977t8 mo64233a(C9711g2<VideoData> g2Var) {
        return C9977t8.m29379a(g2Var, this.f24038a, this.f24039b);
    }

    /* renamed from: a */
    public void mo64234a(boolean z) {
        this.f24040c = z && C9864n8.m28843a();
    }
}

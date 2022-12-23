package com.p374my.target;

import android.content.Context;
import com.p374my.target.common.models.VideoData;

/* renamed from: com.my.target.m7 */
public class C9850m7 {

    /* renamed from: a */
    public final C9897p3 f24348a;

    /* renamed from: b */
    public final Context f24349b;

    /* renamed from: c */
    public boolean f24350c = C9864n8.m28843a();

    public C9850m7(C9897p3 p3Var, Context context) {
        this.f24348a = p3Var;
        this.f24349b = context;
    }

    /* renamed from: a */
    public static C9850m7 m28743a(C9897p3 p3Var, Context context) {
        return new C9850m7(p3Var, context);
    }

    /* renamed from: a */
    public C9662d7 mo64766a(C10059y8 y8Var, boolean z) {
        return new C9662d7(this.f24349b, y8Var, z, this.f24350c);
    }

    /* renamed from: a */
    public C9784j7 mo64767a() {
        return new C9784j7(this.f24349b);
    }

    /* renamed from: a */
    public C9977t8 mo64768a(C9711g2<VideoData> g2Var) {
        return C9977t8.m29379a(g2Var, this.f24348a, this.f24349b);
    }

    /* renamed from: a */
    public void mo64769a(boolean z) {
        this.f24350c = z && C9864n8.m28843a();
    }

    /* renamed from: b */
    public C9703f7 mo64770b(C10059y8 y8Var, boolean z) {
        return new C9703f7(this.f24349b, y8Var, z);
    }

    /* renamed from: b */
    public C10079z6 mo64771b() {
        return new C9646c7(this.f24349b, this);
    }

    /* renamed from: c */
    public C10079z6 mo64772c() {
        return new C9680e7(this.f24349b, this.f24350c);
    }
}

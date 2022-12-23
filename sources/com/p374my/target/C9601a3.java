package com.p374my.target;

/* renamed from: com.my.target.a3 */
public class C9601a3 extends C9626b3 {

    /* renamed from: d */
    public float f23612d = -1.0f;

    /* renamed from: e */
    public float f23613e = -1.0f;

    public C9601a3(String str) {
        super("playheadReachedValue", str);
    }

    /* renamed from: a */
    public static C9601a3 m27586a(String str) {
        return new C9601a3(str);
    }

    /* renamed from: a */
    public void mo63447a(float f) {
        this.f23613e = f;
    }

    /* renamed from: b */
    public void mo63448b(float f) {
        this.f23612d = f;
    }

    /* renamed from: d */
    public float mo63449d() {
        return this.f23613e;
    }

    /* renamed from: e */
    public float mo63450e() {
        return this.f23612d;
    }

    public String toString() {
        return "ProgressStat{" + "value=" + this.f23612d + ", pvalue=" + this.f23613e + '}';
    }
}

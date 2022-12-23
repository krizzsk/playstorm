package com.bykv.p068vk.openvk.component.video.p069a.p073b;

/* renamed from: com.bykv.vk.openvk.component.video.a.b.c */
/* compiled from: IncrementalTimeout */
public class C2431c {

    /* renamed from: a */
    private final long f5153a;

    /* renamed from: b */
    private final long f5154b;

    /* renamed from: c */
    private final long f5155c;

    /* renamed from: a */
    public long mo16143a(int i) {
        if (i <= 0) {
            return this.f5153a;
        }
        return Math.min(this.f5153a + (this.f5154b * ((long) i)), this.f5155c);
    }
}

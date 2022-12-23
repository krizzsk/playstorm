package com.bytedance.sdk.openadsdk.p130b.p132b.p134b;

import com.bykv.p068vk.openvk.component.video.api.p085c.C2522c;
import com.bytedance.sdk.openadsdk.core.p151e.C3498n;

/* renamed from: com.bytedance.sdk.openadsdk.b.b.b.o */
/* compiled from: VideoLogHelperModel */
public class C3150o {

    /* renamed from: a */
    private long f7435a;

    /* renamed from: b */
    private String f7436b;

    /* renamed from: c */
    private int f7437c;

    /* renamed from: d */
    private C2522c f7438d;

    /* renamed from: e */
    private C3498n f7439e;

    public C3150o(long j, String str, int i, C2522c cVar, C3498n nVar) {
        this.f7435a = j;
        this.f7436b = str;
        this.f7437c = i;
        this.f7438d = cVar;
        this.f7439e = nVar;
    }

    /* renamed from: a */
    public long mo18714a() {
        return this.f7435a;
    }

    /* renamed from: b */
    public String mo18715b() {
        return this.f7436b;
    }

    /* renamed from: c */
    public int mo18716c() {
        return this.f7437c;
    }

    /* renamed from: d */
    public C2522c mo18717d() {
        return this.f7438d;
    }

    /* renamed from: e */
    public C3498n mo18718e() {
        return this.f7439e;
    }

    /* renamed from: com.bytedance.sdk.openadsdk.b.b.b.o$a */
    /* compiled from: VideoLogHelperModel */
    public static class C3151a {

        /* renamed from: a */
        private long f7440a = 0;

        /* renamed from: b */
        private long f7441b = 0;

        /* renamed from: c */
        private long f7442c = 0;

        /* renamed from: d */
        private boolean f7443d = false;

        /* renamed from: e */
        private int f7444e = 0;

        /* renamed from: f */
        private int f7445f = 0;

        /* renamed from: g */
        private int f7446g;

        /* renamed from: h */
        private int f7447h;

        /* renamed from: i */
        private int f7448i;

        /* renamed from: j */
        private int f7449j;

        /* renamed from: k */
        private int f7450k;

        /* renamed from: l */
        private boolean f7451l = false;

        /* renamed from: a */
        public long mo18719a() {
            return this.f7440a;
        }

        /* renamed from: a */
        public void mo18721a(long j) {
            this.f7440a = j;
        }

        /* renamed from: b */
        public long mo18723b() {
            return this.f7441b;
        }

        /* renamed from: b */
        public void mo18725b(long j) {
            this.f7441b = j;
        }

        /* renamed from: c */
        public long mo18726c() {
            return this.f7442c;
        }

        /* renamed from: c */
        public void mo18728c(long j) {
            this.f7442c = j;
        }

        /* renamed from: d */
        public int mo18729d() {
            return this.f7444e;
        }

        /* renamed from: a */
        public void mo18720a(int i) {
            this.f7444e = i;
        }

        /* renamed from: e */
        public int mo18731e() {
            return this.f7445f;
        }

        /* renamed from: b */
        public void mo18724b(int i) {
            this.f7445f = i;
        }

        /* renamed from: f */
        public int mo18733f() {
            return this.f7446g;
        }

        /* renamed from: c */
        public void mo18727c(int i) {
            this.f7446g = i;
        }

        /* renamed from: g */
        public int mo18735g() {
            return this.f7447h;
        }

        /* renamed from: d */
        public void mo18730d(int i) {
            this.f7447h = i;
        }

        /* renamed from: h */
        public int mo18736h() {
            long j = this.f7442c;
            if (j <= 0) {
                return 0;
            }
            return Math.min((int) ((this.f7440a * 100) / j), 100);
        }

        /* renamed from: i */
        public int mo18737i() {
            return this.f7448i;
        }

        /* renamed from: e */
        public void mo18732e(int i) {
            this.f7448i = i;
        }

        /* renamed from: j */
        public int mo18738j() {
            return this.f7449j;
        }

        /* renamed from: k */
        public int mo18739k() {
            return this.f7450k;
        }

        /* renamed from: f */
        public void mo18734f(int i) {
            this.f7450k = i;
        }

        /* renamed from: l */
        public boolean mo18740l() {
            return this.f7451l;
        }

        /* renamed from: m */
        public boolean mo18741m() {
            return this.f7443d;
        }

        /* renamed from: a */
        public void mo18722a(boolean z) {
            this.f7443d = z;
        }
    }
}

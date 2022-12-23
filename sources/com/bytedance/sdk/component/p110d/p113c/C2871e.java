package com.bytedance.sdk.component.p110d.p113c;

import android.content.Context;
import com.bytedance.sdk.component.p110d.C2829b;
import com.bytedance.sdk.component.p110d.C2835c;
import com.bytedance.sdk.component.p110d.C2877d;
import com.bytedance.sdk.component.p110d.C2899k;
import com.bytedance.sdk.component.p110d.C2900l;
import com.bytedance.sdk.component.p110d.C2903o;
import com.bytedance.sdk.component.p110d.C2904p;
import com.bytedance.sdk.component.p110d.C2905q;
import java.util.concurrent.ExecutorService;

/* renamed from: com.bytedance.sdk.component.d.c.e */
/* compiled from: LoadConfig */
public class C2871e implements C2900l {

    /* renamed from: a */
    private C2899k f6522a;

    /* renamed from: b */
    private ExecutorService f6523b;

    /* renamed from: c */
    private C2877d f6524c;

    /* renamed from: d */
    private C2904p f6525d;

    /* renamed from: e */
    private C2905q f6526e;

    /* renamed from: f */
    private C2835c f6527f;

    /* renamed from: g */
    private C2903o f6528g;

    /* renamed from: h */
    private C2829b f6529h;

    private C2871e(C2873a aVar) {
        this.f6522a = aVar.f6530a;
        this.f6523b = aVar.f6531b;
        this.f6524c = aVar.f6532c;
        this.f6525d = aVar.f6533d;
        this.f6526e = aVar.f6534e;
        this.f6527f = aVar.f6535f;
        this.f6529h = aVar.f6537h;
        this.f6528g = aVar.f6536g;
    }

    /* renamed from: a */
    public C2899k mo17730a() {
        return this.f6522a;
    }

    /* renamed from: b */
    public ExecutorService mo17731b() {
        return this.f6523b;
    }

    /* renamed from: c */
    public C2877d mo17732c() {
        return this.f6524c;
    }

    /* renamed from: d */
    public C2904p mo17733d() {
        return this.f6525d;
    }

    /* renamed from: e */
    public C2905q mo17734e() {
        return this.f6526e;
    }

    /* renamed from: f */
    public C2835c mo17735f() {
        return this.f6527f;
    }

    /* renamed from: g */
    public C2903o mo17736g() {
        return this.f6528g;
    }

    /* renamed from: h */
    public C2829b mo17737h() {
        return this.f6529h;
    }

    /* renamed from: a */
    public static C2871e m8011a(Context context) {
        return new C2873a().mo17741a();
    }

    /* renamed from: com.bytedance.sdk.component.d.c.e$a */
    /* compiled from: LoadConfig */
    public static class C2873a {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public C2899k f6530a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public ExecutorService f6531b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public C2877d f6532c;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public C2904p f6533d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public C2905q f6534e;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public C2835c f6535f;
        /* access modifiers changed from: private */

        /* renamed from: g */
        public C2903o f6536g;
        /* access modifiers changed from: private */

        /* renamed from: h */
        public C2829b f6537h;

        /* renamed from: a */
        public C2873a mo17738a(C2829b bVar) {
            this.f6537h = bVar;
            return this;
        }

        /* renamed from: a */
        public C2873a mo17740a(ExecutorService executorService) {
            this.f6531b = executorService;
            return this;
        }

        /* renamed from: a */
        public C2873a mo17739a(C2877d dVar) {
            this.f6532c = dVar;
            return this;
        }

        /* renamed from: a */
        public C2871e mo17741a() {
            return new C2871e(this);
        }
    }
}

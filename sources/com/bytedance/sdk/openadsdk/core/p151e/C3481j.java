package com.bytedance.sdk.openadsdk.core.p151e;

import android.util.SparseArray;
import com.bytedance.sdk.component.adexpress.C2618b;
import com.bytedance.sdk.openadsdk.core.p146b.C3429c;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.core.e.j */
/* compiled from: DynamicClickInfo */
public class C3481j implements C2618b {

    /* renamed from: a */
    public final float f8480a;

    /* renamed from: b */
    public final float f8481b;

    /* renamed from: c */
    public final float f8482c;

    /* renamed from: d */
    public final float f8483d;

    /* renamed from: e */
    public final long f8484e;

    /* renamed from: f */
    public final long f8485f;

    /* renamed from: g */
    public final int f8486g;

    /* renamed from: h */
    public final int f8487h;

    /* renamed from: i */
    public final int f8488i;

    /* renamed from: j */
    public final int f8489j;

    /* renamed from: k */
    public final String f8490k;

    /* renamed from: l */
    public int f8491l;

    /* renamed from: m */
    public JSONObject f8492m;

    /* renamed from: n */
    public SparseArray<C3429c.C3430a> f8493n;

    /* renamed from: o */
    public final boolean f8494o;

    /* renamed from: p */
    public int f8495p;

    private C3481j(C3483a aVar) {
        this.f8480a = aVar.f8502g;
        this.f8481b = aVar.f8501f;
        this.f8482c = aVar.f8500e;
        this.f8483d = aVar.f8499d;
        this.f8484e = aVar.f8498c;
        this.f8485f = aVar.f8497b;
        this.f8486g = aVar.f8503h;
        this.f8487h = aVar.f8504i;
        this.f8488i = aVar.f8505j;
        this.f8489j = aVar.f8506k;
        this.f8490k = aVar.f8507l;
        this.f8493n = aVar.f8496a;
        this.f8494o = aVar.f8511p;
        this.f8491l = aVar.f8508m;
        this.f8492m = aVar.f8509n;
        this.f8495p = aVar.f8510o;
    }

    /* renamed from: com.bytedance.sdk.openadsdk.core.e.j$a */
    /* compiled from: DynamicClickInfo */
    public static class C3483a {

        /* renamed from: a */
        protected SparseArray<C3429c.C3430a> f8496a = new SparseArray<>();
        /* access modifiers changed from: private */

        /* renamed from: b */
        public long f8497b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public long f8498c;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public float f8499d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public float f8500e;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public float f8501f;
        /* access modifiers changed from: private */

        /* renamed from: g */
        public float f8502g;
        /* access modifiers changed from: private */

        /* renamed from: h */
        public int f8503h;
        /* access modifiers changed from: private */

        /* renamed from: i */
        public int f8504i;
        /* access modifiers changed from: private */

        /* renamed from: j */
        public int f8505j;
        /* access modifiers changed from: private */

        /* renamed from: k */
        public int f8506k;
        /* access modifiers changed from: private */

        /* renamed from: l */
        public String f8507l;
        /* access modifiers changed from: private */

        /* renamed from: m */
        public int f8508m;
        /* access modifiers changed from: private */

        /* renamed from: n */
        public JSONObject f8509n;
        /* access modifiers changed from: private */

        /* renamed from: o */
        public int f8510o;
        /* access modifiers changed from: private */

        /* renamed from: p */
        public boolean f8511p;

        /* renamed from: a */
        public C3483a mo19543a(int i) {
            this.f8510o = i;
            return this;
        }

        /* renamed from: b */
        public C3483a mo19551b(int i) {
            this.f8508m = i;
            return this;
        }

        /* renamed from: a */
        public C3483a mo19547a(JSONObject jSONObject) {
            this.f8509n = jSONObject;
            return this;
        }

        /* renamed from: a */
        public C3483a mo19548a(boolean z) {
            this.f8511p = z;
            return this;
        }

        /* renamed from: a */
        public C3483a mo19544a(long j) {
            this.f8497b = j;
            return this;
        }

        /* renamed from: b */
        public C3483a mo19552b(long j) {
            this.f8498c = j;
            return this;
        }

        /* renamed from: a */
        public C3483a mo19542a(float f) {
            this.f8499d = f;
            return this;
        }

        /* renamed from: b */
        public C3483a mo19550b(float f) {
            this.f8500e = f;
            return this;
        }

        /* renamed from: c */
        public C3483a mo19553c(float f) {
            this.f8501f = f;
            return this;
        }

        /* renamed from: d */
        public C3483a mo19555d(float f) {
            this.f8502g = f;
            return this;
        }

        /* renamed from: c */
        public C3483a mo19554c(int i) {
            this.f8503h = i;
            return this;
        }

        /* renamed from: d */
        public C3483a mo19556d(int i) {
            this.f8504i = i;
            return this;
        }

        /* renamed from: e */
        public C3483a mo19557e(int i) {
            this.f8505j = i;
            return this;
        }

        /* renamed from: f */
        public C3483a mo19558f(int i) {
            this.f8506k = i;
            return this;
        }

        /* renamed from: a */
        public C3483a mo19546a(String str) {
            this.f8507l = str;
            return this;
        }

        /* renamed from: a */
        public C3483a mo19545a(SparseArray<C3429c.C3430a> sparseArray) {
            this.f8496a = sparseArray;
            return this;
        }

        /* renamed from: a */
        public C3481j mo19549a() {
            return new C3481j(this);
        }
    }
}

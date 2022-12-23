package com.applovin.impl.sdk.p050e;

import android.content.Context;
import com.applovin.impl.sdk.C1959m;
import com.applovin.impl.sdk.C2092v;

/* renamed from: com.applovin.impl.sdk.e.a */
public abstract class C1877a implements Runnable {

    /* renamed from: a */
    private final String f3466a;
    /* access modifiers changed from: protected */

    /* renamed from: b */
    public final C1959m f3467b;

    /* renamed from: c */
    private final C2092v f3468c;

    /* renamed from: d */
    private final Context f3469d;

    /* renamed from: e */
    private final boolean f3470e;

    public C1877a(String str, C1959m mVar) {
        this(str, mVar, false);
    }

    public C1877a(String str, C1959m mVar, boolean z) {
        this.f3466a = str;
        this.f3467b = mVar;
        this.f3468c = mVar.mo14286A();
        this.f3469d = mVar.mo14297L();
        this.f3470e = z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo14142a(String str) {
        this.f3468c.mo14789b(this.f3466a, str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo14143a(String str, Throwable th) {
        this.f3468c.mo14790b(this.f3466a, str, th);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo14144b(String str) {
        this.f3468c.mo14791c(this.f3466a, str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo14145c(String str) {
        this.f3468c.mo14792d(this.f3466a, str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public C1959m mo14146d() {
        return this.f3467b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo14147d(String str) {
        this.f3468c.mo14793e(this.f3466a, str);
    }

    /* renamed from: e */
    public String mo14148e() {
        return this.f3466a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public Context mo14149f() {
        return this.f3469d;
    }

    /* renamed from: g */
    public boolean mo14150g() {
        return this.f3470e;
    }
}

package com.tapjoy.internal;

import com.tapjoy.internal.C11594ey;
import java.util.Map;

/* renamed from: com.tapjoy.internal.iu */
public final class C11789iu extends C11786is<Void> {

    /* renamed from: c */
    private final C11594ey.C11595a f28769c = new C11594ey.C11595a();

    /* renamed from: d */
    private C11601fa f28770d = null;

    /* renamed from: c */
    public final String mo72258c() {
        return this.f28770d == C11601fa.USAGES ? "api/v1/usages" : "api/v1/cevs";
    }

    /* renamed from: a */
    public final boolean mo72724a(C11591ex exVar) {
        if (this.f28770d == null) {
            this.f28770d = exVar.f28051n;
        } else if (exVar.f28051n != this.f28770d) {
            return false;
        }
        this.f28769c.f28091c.add(exVar);
        return true;
    }

    /* renamed from: g */
    public final int mo72725g() {
        return this.f28769c.f28091c.size();
    }

    /* renamed from: e */
    public final Map<String, Object> mo72260e() {
        Map<String, Object> e = super.mo72260e();
        e.put("events", new C11451bg(C11748hz.m34133a(this.f28769c.mo72454b())));
        return e;
    }
}

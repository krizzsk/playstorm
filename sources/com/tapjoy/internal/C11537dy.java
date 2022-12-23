package com.tapjoy.internal;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/* renamed from: com.tapjoy.internal.dy */
public final class C11537dy {

    /* renamed from: a */
    final HashMap<View, String> f27909a = new HashMap<>();

    /* renamed from: b */
    final HashMap<View, C11538a> f27910b = new HashMap<>();

    /* renamed from: c */
    final HashMap<String, View> f27911c = new HashMap<>();

    /* renamed from: d */
    final HashSet<View> f27912d = new HashSet<>();

    /* renamed from: e */
    final HashSet<String> f27913e = new HashSet<>();

    /* renamed from: f */
    final HashSet<String> f27914f = new HashSet<>();

    /* renamed from: g */
    final HashMap<String, String> f27915g = new HashMap<>();

    /* renamed from: h */
    boolean f27916h;

    /* renamed from: com.tapjoy.internal.dy$a */
    public static class C11538a {

        /* renamed from: a */
        public final C11510df f27917a;

        /* renamed from: b */
        public final ArrayList<String> f27918b = new ArrayList<>();

        public C11538a(C11510df dfVar, String str) {
            this.f27917a = dfVar;
            mo72330a(str);
        }

        /* renamed from: a */
        public final void mo72330a(String str) {
            this.f27918b.add(str);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo72329a(C11500cx cxVar) {
        for (C11510df next : cxVar.f27818b) {
            View view = (View) next.f27857a.get();
            if (view != null) {
                C11538a aVar = this.f27910b.get(view);
                if (aVar != null) {
                    aVar.mo72330a(cxVar.f27822f);
                } else {
                    this.f27910b.put(view, new C11538a(next, cxVar.f27822f));
                }
            }
        }
    }
}

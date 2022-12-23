package com.ogury.p376ed.internal;

import android.app.Activity;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: com.ogury.ed.internal.bq */
public final class C10371bq {

    /* renamed from: a */
    private final C10524fh f26264a;

    /* renamed from: b */
    private final Class<? extends Activity> f26265b;

    /* renamed from: c */
    private List<String> f26266c = new ArrayList();

    /* renamed from: d */
    private List<String> f26267d = new ArrayList();

    public C10371bq(C10524fh fhVar, Class<? extends Activity> cls) {
        C10765mq.m32773b(fhVar, "overlayActivityConfig");
        C10765mq.m32773b(cls, "showActivityClass");
        this.f26264a = fhVar;
        this.f26265b = cls;
        m31387b();
        m31385a();
    }

    /* renamed from: a */
    public final void mo67108a(List<String> list) {
        C10765mq.m32773b(list, "list");
        if (this.f26264a.mo67383c()) {
            this.f26266c.addAll(list);
        }
    }

    /* renamed from: b */
    public final void mo67109b(List<? extends Class<? extends Activity>> list) {
        C10765mq.m32773b(list, "activities");
        if (this.f26264a.mo67385d()) {
            for (Class canonicalName : list) {
                List<String> list2 = this.f26267d;
                String canonicalName2 = canonicalName.getCanonicalName();
                C10765mq.m32770a((Object) canonicalName2, "it.canonicalName");
                list2.add(canonicalName2);
            }
        }
    }

    /* renamed from: a */
    public final void mo67107a(Activity activity) {
        C10765mq.m32773b(activity, "activity");
        if (this.f26264a.mo67381b()) {
            this.f26266c.add(C10392cc.m31455a(activity));
        }
    }

    /* renamed from: a */
    private final void m31385a() {
        if (!this.f26264a.mo67386e().isEmpty()) {
            this.f26266c.addAll(this.f26264a.mo67386e());
        }
    }

    /* renamed from: b */
    private final void m31387b() {
        if (!this.f26264a.mo67387f().isEmpty()) {
            this.f26267d.addAll(this.f26264a.mo67387f());
        }
    }

    /* renamed from: b */
    public final boolean mo67110b(Activity activity) {
        C10765mq.m32773b(activity, "activity");
        if (activity instanceof C10431dd) {
            return false;
        }
        if ((this.f26264a.mo67377a() || C10765mq.m32772a((Object) activity.getClass(), (Object) this.f26265b)) && !m31386a(C10392cc.m31456a((Object) activity)) && m31388b(C10392cc.m31456a((Object) activity))) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private final boolean m31386a(String str) {
        Iterable<String> iterable = this.f26267d;
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return false;
        }
        for (String b : iterable) {
            if (C10814oc.m32844b(str, b)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    private final boolean m31388b(String str) {
        Iterable<String> iterable = this.f26266c;
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return false;
        }
        for (String b : iterable) {
            if (C10814oc.m32844b(str, b)) {
                return true;
            }
        }
        return false;
    }
}

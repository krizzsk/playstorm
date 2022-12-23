package com.applovin.impl.mediation.debugger.p038ui.p039a;

import android.content.Context;
import android.text.SpannedString;
import android.text.TextUtils;
import androidx.core.view.ViewCompat;
import com.applovin.impl.mediation.debugger.p034b.p035a.C1655a;
import com.applovin.impl.mediation.debugger.p034b.p035a.C1656b;
import com.applovin.impl.mediation.debugger.p034b.p035a.C1659e;
import com.applovin.impl.mediation.debugger.p038ui.p040b.p041a.C1694a;
import com.applovin.impl.mediation.debugger.p038ui.p043d.C1707c;
import com.applovin.impl.mediation.debugger.p038ui.p043d.C1711d;
import com.applovin.impl.mediation.debugger.p038ui.p043d.C1714e;
import com.applovin.impl.sdk.utils.StringUtils;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.applovin.impl.mediation.debugger.ui.a.b */
class C1677b extends C1711d {

    /* renamed from: a */
    private final C1655a f2429a;

    /* renamed from: b */
    private final C1656b f2430b;

    /* renamed from: d */
    private final List<C1707c> f2431d = m3435c();

    /* renamed from: e */
    private final List<C1707c> f2432e = m3436d();

    /* renamed from: f */
    private final List<C1707c> f2433f = m3437e();

    /* renamed from: com.applovin.impl.mediation.debugger.ui.a.b$a */
    class C1678a extends C1694a {

        /* renamed from: o */
        private final C1656b f2435o;

        C1678a(C1656b bVar, String str, boolean z) {
            super(bVar.mo13406a().mo13418c(), C1677b.this.f2575c);
            this.f2435o = bVar;
            this.f2541d = StringUtils.createSpannedString(bVar.mo13406a().mo13417b(), ViewCompat.MEASURED_STATE_MASK, 18, 1);
            this.f2542e = !TextUtils.isEmpty(str) ? new SpannedString(str) : null;
            this.f2540c = z;
        }

        /* renamed from: a */
        public C1656b mo13485a() {
            return this.f2435o;
        }

        /* renamed from: b */
        public boolean mo13486b() {
            return this.f2540c;
        }

        /* renamed from: c */
        public int mo13487c() {
            return -12303292;
        }
    }

    /* renamed from: com.applovin.impl.mediation.debugger.ui.a.b$b */
    enum C1679b {
        INFO,
        BIDDERS,
        WATERFALL,
        COUNT
    }

    C1677b(C1655a aVar, C1656b bVar, Context context) {
        super(context);
        this.f2429a = aVar;
        this.f2430b = bVar;
        notifyDataSetChanged();
    }

    /* renamed from: c */
    private List<C1707c> m3435c() {
        ArrayList arrayList = new ArrayList(2);
        arrayList.add(m3438f());
        arrayList.add(m3439g());
        if (this.f2430b != null) {
            arrayList.add(m3440h());
        }
        return arrayList;
    }

    /* renamed from: d */
    private List<C1707c> m3436d() {
        C1656b bVar = this.f2430b;
        if (bVar != null && !bVar.mo13408c()) {
            return new ArrayList();
        }
        List<C1656b> a = this.f2429a.mo13404e().mo13411a();
        ArrayList arrayList = new ArrayList(a.size());
        for (C1656b next : a) {
            C1656b bVar2 = this.f2430b;
            if (bVar2 == null || bVar2.mo13406a().mo13416a().equals(next.mo13406a().mo13416a())) {
                arrayList.add(new C1678a(next, next.mo13407b() != null ? next.mo13407b().mo13422a() : "", this.f2430b == null));
            }
        }
        return arrayList;
    }

    /* renamed from: e */
    private List<C1707c> m3437e() {
        C1656b bVar = this.f2430b;
        if (bVar != null && bVar.mo13408c()) {
            return new ArrayList();
        }
        List<C1656b> b = this.f2429a.mo13404e().mo13412b();
        ArrayList arrayList = new ArrayList(b.size());
        for (C1656b next : b) {
            C1656b bVar2 = this.f2430b;
            if (bVar2 == null || bVar2.mo13406a().mo13416a().equals(next.mo13406a().mo13416a())) {
                arrayList.add(new C1678a(next, (String) null, this.f2430b == null));
                for (C1659e next2 : next.mo13409d()) {
                    arrayList.add(C1707c.m3545p().mo13541a(next2.mo13422a()).mo13546b(next2.mo13423b()).mo13547b(true).mo13543a());
                }
            }
        }
        return arrayList;
    }

    /* renamed from: f */
    private C1707c m3438f() {
        return C1707c.m3545p().mo13541a("ID").mo13546b(this.f2429a.mo13399a()).mo13543a();
    }

    /* renamed from: g */
    private C1707c m3439g() {
        return C1707c.m3545p().mo13541a("Ad Format").mo13546b(this.f2429a.mo13401c()).mo13543a();
    }

    /* renamed from: h */
    private C1707c m3440h() {
        return C1707c.m3545p().mo13541a("Selected Network").mo13546b(this.f2430b.mo13406a().mo13417b()).mo13543a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo13480a(int i) {
        return (i == C1679b.INFO.ordinal() ? this.f2431d : i == C1679b.BIDDERS.ordinal() ? this.f2432e : this.f2433f).size();
    }

    /* renamed from: a */
    public String mo13481a() {
        return this.f2429a.mo13400b();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public int mo13482b() {
        return C1679b.COUNT.ordinal();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C1707c mo13483b(int i) {
        return i == C1679b.INFO.ordinal() ? new C1714e("INFO") : i == C1679b.BIDDERS.ordinal() ? new C1714e("BIDDERS") : new C1714e("WATERFALL");
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public List<C1707c> mo13484c(int i) {
        return i == C1679b.INFO.ordinal() ? this.f2431d : i == C1679b.BIDDERS.ordinal() ? this.f2432e : this.f2433f;
    }
}

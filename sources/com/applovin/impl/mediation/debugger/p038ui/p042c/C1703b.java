package com.applovin.impl.mediation.debugger.p038ui.p042c;

import android.content.Context;
import android.text.SpannableString;
import android.text.SpannedString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import com.applovin.impl.mediation.debugger.p034b.p036b.C1660a;
import com.applovin.impl.mediation.debugger.p034b.p036b.C1661b;
import com.applovin.impl.mediation.debugger.p034b.p036b.C1664c;
import com.applovin.impl.mediation.debugger.p034b.p036b.C1665d;
import com.applovin.impl.mediation.debugger.p038ui.p043d.C1707c;
import com.applovin.impl.mediation.debugger.p038ui.p043d.C1711d;
import com.applovin.impl.mediation.debugger.p038ui.p043d.C1714e;
import com.applovin.impl.sdk.utils.C2038f;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.adapter.MaxAdapter;
import com.applovin.sdk.C2392R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.applovin.impl.mediation.debugger.ui.c.b */
public class C1703b extends C1711d {

    /* renamed from: a */
    private final C1661b f2517a;

    /* renamed from: b */
    private List<C1707c> f2518b;

    /* renamed from: d */
    private final List<C1707c> f2519d;

    /* renamed from: e */
    private final List<C1707c> f2520e;

    /* renamed from: f */
    private final List<C1707c> f2521f;

    /* renamed from: g */
    private final List<C1707c> f2522g;

    /* renamed from: h */
    private SpannedString f2523h;

    /* renamed from: com.applovin.impl.mediation.debugger.ui.c.b$a */
    public enum C1704a {
        INTEGRATIONS,
        PERMISSIONS,
        CONFIGURATION,
        DEPENDENCIES,
        TEST_ADS,
        COUNT
    }

    C1703b(C1661b bVar, Context context) {
        super(context);
        this.f2517a = bVar;
        if (bVar.mo13428a() == C1661b.C1662a.INVALID_INTEGRATION) {
            SpannableString spannableString = new SpannableString("Tap for more information");
            spannableString.setSpan(new AbsoluteSizeSpan(12, true), 0, spannableString.length(), 33);
            this.f2523h = new SpannedString(spannableString);
        } else {
            this.f2523h = new SpannedString("");
        }
        this.f2518b = m3525d();
        this.f2519d = m3521a(bVar.mo13446r());
        this.f2520e = m3520a(bVar.mo13448t());
        this.f2521f = m3523b(bVar.mo13447s());
        this.f2522g = m3530h();
        notifyDataSetChanged();
    }

    /* renamed from: a */
    private int m3518a(boolean z) {
        return z ? C2392R.C2393drawable.applovin_ic_check_mark_bordered : C2392R.C2393drawable.applovin_ic_x_mark;
    }

    /* renamed from: a */
    private C1707c m3519a(C1661b.C1663b bVar) {
        C1707c.C1709a p = C1707c.m3545p();
        if (bVar == C1661b.C1663b.READY) {
            p.mo13539a(this.f2575c);
        }
        return p.mo13541a("Test Mode").mo13546b(bVar.mo13456a()).mo13544b(bVar.mo13457b()).mo13550d(bVar.mo13458c()).mo13542a(true).mo13543a();
    }

    /* renamed from: a */
    private List<C1707c> m3520a(C1664c cVar) {
        ArrayList arrayList = new ArrayList(1);
        if (cVar.mo13459a()) {
            boolean b = cVar.mo13460b();
            arrayList.add(C1707c.m3543a(b ? C1707c.C1710b.RIGHT_DETAIL : C1707c.C1710b.DETAIL).mo13541a("Cleartext Traffic").mo13545b(b ? null : this.f2523h).mo13550d(cVar.mo13461c()).mo13538a(m3518a(b)).mo13548c(m3522b(b)).mo13542a(true ^ b).mo13543a());
        }
        return arrayList;
    }

    /* renamed from: a */
    private List<C1707c> m3521a(List<C1665d> list) {
        ArrayList arrayList = new ArrayList(list.size());
        if (list.size() > 0) {
            for (C1665d next : list) {
                boolean c = next.mo13464c();
                arrayList.add(C1707c.m3543a(c ? C1707c.C1710b.RIGHT_DETAIL : C1707c.C1710b.DETAIL).mo13541a(next.mo13462a()).mo13545b(c ? null : this.f2523h).mo13550d(next.mo13463b()).mo13538a(m3518a(c)).mo13548c(m3522b(c)).mo13542a(!c).mo13543a());
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    private int m3522b(boolean z) {
        return C2038f.m4879a(z ? C2392R.color.applovin_sdk_checkmarkColor : C2392R.color.applovin_sdk_xmarkColor, this.f2575c);
    }

    /* renamed from: b */
    private List<C1707c> m3523b(List<C1660a> list) {
        ArrayList arrayList = new ArrayList(list.size());
        if (list.size() > 0) {
            for (C1660a next : list) {
                boolean c = next.mo13426c();
                arrayList.add(C1707c.m3543a(c ? C1707c.C1710b.RIGHT_DETAIL : C1707c.C1710b.DETAIL).mo13541a(next.mo13424a()).mo13545b(c ? null : this.f2523h).mo13550d(next.mo13425b()).mo13538a(m3518a(c)).mo13548c(m3522b(c)).mo13542a(!c).mo13543a());
            }
        }
        return arrayList;
    }

    /* renamed from: c */
    private C1707c m3524c(List<String> list) {
        return C1707c.m3545p().mo13541a("Region/VPN Required").mo13546b(CollectionUtils.implode(list, ", ", list.size())).mo13543a();
    }

    /* renamed from: d */
    private List<C1707c> m3525d() {
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(m3526e());
        arrayList.add(m3528f());
        arrayList.add(m3529g());
        return arrayList;
    }

    /* renamed from: e */
    private C1707c m3526e() {
        C1707c.C1709a b = C1707c.m3545p().mo13541a("SDK").mo13546b(this.f2517a.mo13438j());
        if (TextUtils.isEmpty(this.f2517a.mo13438j())) {
            b.mo13538a(m3518a(this.f2517a.mo13432d())).mo13548c(m3522b(this.f2517a.mo13432d()));
        }
        return b.mo13543a();
    }

    /* renamed from: e */
    private String m3527e(int i) {
        return (MaxAdapter.InitializationStatus.INITIALIZED_SUCCESS.getCode() == i || MaxAdapter.InitializationStatus.INITIALIZED_UNKNOWN.getCode() == i || MaxAdapter.InitializationStatus.DOES_NOT_APPLY.getCode() == i) ? "Initialized" : MaxAdapter.InitializationStatus.INITIALIZED_FAILURE.getCode() == i ? "Failure" : MaxAdapter.InitializationStatus.INITIALIZING.getCode() == i ? "Initializing..." : "Not Initialized";
    }

    /* renamed from: f */
    private C1707c m3528f() {
        C1707c.C1709a b = C1707c.m3545p().mo13541a("Adapter").mo13546b(this.f2517a.mo13439k());
        if (TextUtils.isEmpty(this.f2517a.mo13439k())) {
            b.mo13538a(m3518a(this.f2517a.mo13433e())).mo13548c(m3522b(this.f2517a.mo13433e()));
        }
        return b.mo13543a();
    }

    /* renamed from: g */
    private C1707c m3529g() {
        return C1707c.m3545p().mo13541a("Initialization Status").mo13546b(m3527e(this.f2517a.mo13429b())).mo13542a(false).mo13543a();
    }

    /* renamed from: h */
    private List<C1707c> m3530h() {
        ArrayList arrayList = new ArrayList(3);
        if (StringUtils.isValidString(this.f2517a.mo13450u())) {
            arrayList.add(C1707c.m3543a(C1707c.C1710b.DETAIL).mo13541a(this.f2517a.mo13450u()).mo13543a());
        }
        if (this.f2517a.mo13430c() != C1661b.C1663b.NOT_SUPPORTED) {
            if (this.f2517a.mo13442n() != null) {
                arrayList.add(m3524c(this.f2517a.mo13442n()));
            }
            arrayList.add(m3519a(this.f2517a.mo13430c()));
        }
        return arrayList;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo13480a(int i) {
        return (i == C1704a.INTEGRATIONS.ordinal() ? this.f2518b : i == C1704a.PERMISSIONS.ordinal() ? this.f2519d : i == C1704a.CONFIGURATION.ordinal() ? this.f2520e : i == C1704a.DEPENDENCIES.ordinal() ? this.f2521f : this.f2522g).size();
    }

    /* renamed from: a */
    public C1661b mo13481a() {
        return this.f2517a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public int mo13482b() {
        return C1704a.COUNT.ordinal();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C1707c mo13483b(int i) {
        return i == C1704a.INTEGRATIONS.ordinal() ? new C1714e("INTEGRATIONS") : i == C1704a.PERMISSIONS.ordinal() ? new C1714e("PERMISSIONS") : i == C1704a.CONFIGURATION.ordinal() ? new C1714e("CONFIGURATION") : i == C1704a.DEPENDENCIES.ordinal() ? new C1714e("DEPENDENCIES") : new C1714e("TEST ADS");
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public List<C1707c> mo13484c(int i) {
        return i == C1704a.INTEGRATIONS.ordinal() ? this.f2518b : i == C1704a.PERMISSIONS.ordinal() ? this.f2519d : i == C1704a.CONFIGURATION.ordinal() ? this.f2520e : i == C1704a.DEPENDENCIES.ordinal() ? this.f2521f : this.f2522g;
    }

    /* renamed from: c */
    public void mo13523c() {
        this.f2518b = m3525d();
    }

    public String toString() {
        return "MediatedNetworkListAdapter{}";
    }
}

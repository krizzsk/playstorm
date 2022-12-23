package com.applovin.impl.mediation.debugger.p038ui.p044e;

import android.os.Bundle;
import android.text.SpannedString;
import android.widget.ListView;
import androidx.core.view.ViewCompat;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.impl.mediation.debugger.p034b.p035a.C1658d;
import com.applovin.impl.mediation.debugger.p038ui.C1668a;
import com.applovin.impl.mediation.debugger.p038ui.p040b.p041a.C1694a;
import com.applovin.impl.mediation.debugger.p038ui.p043d.C1705a;
import com.applovin.impl.mediation.debugger.p038ui.p043d.C1707c;
import com.applovin.impl.mediation.debugger.p038ui.p043d.C1711d;
import com.applovin.impl.mediation.debugger.p038ui.p043d.C1714e;
import com.applovin.impl.sdk.C1959m;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.C2392R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.applovin.impl.mediation.debugger.ui.e.a */
public class C1715a extends C1668a {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public C1959m f2579a;

    /* renamed from: b */
    private List<C1658d> f2580b;

    /* renamed from: c */
    private List<C1658d> f2581c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public C1711d f2582d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public List<C1707c> f2583e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public List<C1707c> f2584f;

    /* renamed from: g */
    private ListView f2585g;

    /* renamed from: com.applovin.impl.mediation.debugger.ui.e.a$a */
    enum C1719a {
        BIDDERS,
        WATERFALL,
        COUNT
    }

    public C1715a() {
        this.communicatorTopics.add("network_sdk_version_updated");
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public C1658d m3587a(C1705a aVar) {
        return (aVar.mo13525a() == C1719a.BIDDERS.ordinal() ? this.f2580b : this.f2581c).get(aVar.mo13526b());
    }

    /* renamed from: a */
    private List<C1707c> m3590a(List<C1658d> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (final C1658d next : list) {
            arrayList.add(new C1694a(next.mo13418c(), this) {
                /* renamed from: f */
                public int mo13505f() {
                    if (C1715a.this.f2579a.mo14295J().mo13586c() == null || !C1715a.this.f2579a.mo14295J().mo13586c().equals(next.mo13416a())) {
                        return 0;
                    }
                    return C2392R.C2393drawable.applovin_ic_check_mark_borderless;
                }

                /* renamed from: g */
                public int mo13506g() {
                    if (C1715a.this.f2579a.mo14295J().mo13586c() == null || !C1715a.this.f2579a.mo14295J().mo13586c().equals(next.mo13416a())) {
                        return super.mo13506g();
                    }
                    return -16776961;
                }

                /* renamed from: k */
                public SpannedString mo13533k() {
                    return StringUtils.createSpannedString(next.mo13417b(), mo13486b() ? ViewCompat.MEASURED_STATE_MASK : -7829368, 18, 1);
                }
            });
        }
        return arrayList;
    }

    /* access modifiers changed from: protected */
    public C1959m getSdk() {
        return this.f2579a;
    }

    public void initialize(List<C1658d> list, List<C1658d> list2, final C1959m mVar) {
        this.f2579a = mVar;
        this.f2580b = list;
        this.f2581c = list2;
        this.f2583e = m3590a(list);
        this.f2584f = m3590a(list2);
        C17161 r1 = new C1711d(this) {
            /* access modifiers changed from: protected */
            /* renamed from: a */
            public int mo13480a(int i) {
                return (i == C1719a.BIDDERS.ordinal() ? C1715a.this.f2583e : C1715a.this.f2584f).size();
            }

            /* access modifiers changed from: protected */
            /* renamed from: b */
            public int mo13482b() {
                return C1719a.COUNT.ordinal();
            }

            /* access modifiers changed from: protected */
            /* renamed from: b */
            public C1707c mo13483b(int i) {
                return i == C1719a.BIDDERS.ordinal() ? new C1714e("BIDDERS") : new C1714e("WATERFALL");
            }

            /* access modifiers changed from: protected */
            /* renamed from: c */
            public List<C1707c> mo13484c(int i) {
                return i == C1719a.BIDDERS.ordinal() ? C1715a.this.f2583e : C1715a.this.f2584f;
            }

            /* access modifiers changed from: protected */
            /* renamed from: k */
            public C1707c mo13565k() {
                return new C1707c.C1709a(C1707c.C1710b.SECTION_CENTERED).mo13541a("Select a network to load ads using your MAX ad unit configuration. Once enabled, this functionality will reset on the next app session.").mo13543a();
            }
        };
        this.f2582d = r1;
        r1.mo13554a((C1711d.C1713a) new C1711d.C1713a() {
            /* renamed from: a */
            public void mo13476a(C1705a aVar, C1707c cVar) {
                String a = C1715a.this.m3587a(aVar).mo13416a();
                if (!StringUtils.isValidString(a) || !StringUtils.isValidString(mVar.mo14295J().mo13586c()) || !a.equals(mVar.mo14295J().mo13586c())) {
                    mVar.mo14295J().mo13582a(true);
                    mVar.mo14295J().mo13580a(a);
                } else {
                    mVar.mo14295J().mo13582a(false);
                    mVar.mo14295J().mo13580a((String) null);
                }
                C1715a.this.f2582d.notifyDataSetChanged();
            }
        });
        this.f2582d.notifyDataSetChanged();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle("Select Live Network");
        setContentView(C2392R.layout.list_view);
        ListView listView = (ListView) findViewById(C2392R.C2394id.listView);
        this.f2585g = listView;
        listView.setAdapter(this.f2582d);
    }

    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        this.f2583e = m3590a(this.f2580b);
        this.f2584f = m3590a(this.f2581c);
        this.f2582d.mo13564j();
    }
}

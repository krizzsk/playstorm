package com.applovin.impl.mediation.debugger.p038ui.p039a;

import android.content.Context;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.widget.ListView;
import androidx.core.view.ViewCompat;
import com.applovin.impl.mediation.debugger.p034b.p035a.C1655a;
import com.applovin.impl.mediation.debugger.p034b.p035a.C1656b;
import com.applovin.impl.mediation.debugger.p038ui.C1668a;
import com.applovin.impl.mediation.debugger.p038ui.p043d.C1705a;
import com.applovin.impl.mediation.debugger.p038ui.p043d.C1707c;
import com.applovin.impl.mediation.debugger.p038ui.p043d.C1711d;
import com.applovin.impl.mediation.debugger.p038ui.p043d.C1714e;
import com.applovin.impl.sdk.C1959m;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxDebuggerAdUnitDetailActivity;
import com.applovin.sdk.C2392R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.applovin.impl.mediation.debugger.ui.a.c */
public class C1680c extends C1668a {

    /* renamed from: a */
    private List<C1655a> f2441a;

    /* renamed from: b */
    private C1959m f2442b;

    /* renamed from: c */
    private C1711d f2443c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public List<C1707c> f2444d;

    /* renamed from: e */
    private ListView f2445e;

    /* renamed from: a */
    private List<C1707c> m3450a(List<C1655a> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (C1655a next : list) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(StringUtils.createListItemDetailSubSpannedString("ID\t\t\t\t\t\t", -7829368));
            spannableStringBuilder.append(StringUtils.createListItemDetailSpannedString(next.mo13399a(), ViewCompat.MEASURED_STATE_MASK));
            spannableStringBuilder.append(new SpannedString("\n"));
            spannableStringBuilder.append(StringUtils.createListItemDetailSubSpannedString("FORMAT  ", -7829368));
            spannableStringBuilder.append(StringUtils.createListItemDetailSpannedString(next.mo13401c(), ViewCompat.MEASURED_STATE_MASK));
            arrayList.add(C1707c.m3543a(C1707c.C1710b.DETAIL).mo13540a(StringUtils.createSpannedString(next.mo13400b(), ViewCompat.MEASURED_STATE_MASK, 18, 1)).mo13545b(new SpannedString(spannableStringBuilder)).mo13539a((Context) this).mo13542a(true).mo13543a());
        }
        return arrayList;
    }

    /* access modifiers changed from: protected */
    public C1959m getSdk() {
        return this.f2442b;
    }

    public void initialize(final List<C1655a> list, final C1959m mVar) {
        this.f2441a = list;
        this.f2442b = mVar;
        this.f2444d = m3450a(list);
        C16811 r0 = new C1711d(this) {
            /* access modifiers changed from: protected */
            /* renamed from: a */
            public int mo13480a(int i) {
                return list.size();
            }

            /* access modifiers changed from: protected */
            /* renamed from: b */
            public int mo13482b() {
                return 1;
            }

            /* access modifiers changed from: protected */
            /* renamed from: b */
            public C1707c mo13483b(int i) {
                return new C1714e("");
            }

            /* access modifiers changed from: protected */
            /* renamed from: c */
            public List<C1707c> mo13484c(int i) {
                return C1680c.this.f2444d;
            }
        };
        this.f2443c = r0;
        r0.mo13554a((C1711d.C1713a) new C1711d.C1713a() {
            /* renamed from: a */
            public void mo13476a(final C1705a aVar, C1707c cVar) {
                C1680c.this.startActivity(MaxDebuggerAdUnitDetailActivity.class, mVar.mo14333af(), new C1668a.C1670a<MaxDebuggerAdUnitDetailActivity>() {
                    /* renamed from: a */
                    public void mo13473a(MaxDebuggerAdUnitDetailActivity maxDebuggerAdUnitDetailActivity) {
                        maxDebuggerAdUnitDetailActivity.initialize((C1655a) list.get(aVar.mo13526b()), (C1656b) null, mVar);
                    }
                });
            }
        });
        this.f2443c.notifyDataSetChanged();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle("Ad Units");
        setContentView(C2392R.layout.list_view);
        ListView listView = (ListView) findViewById(C2392R.C2394id.listView);
        this.f2445e = listView;
        listView.setAdapter(this.f2443c);
    }
}

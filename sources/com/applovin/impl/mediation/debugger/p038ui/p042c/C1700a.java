package com.applovin.impl.mediation.debugger.p038ui.p042c;

import android.os.Bundle;
import android.widget.ListView;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.impl.mediation.debugger.p034b.p036b.C1661b;
import com.applovin.impl.mediation.debugger.p038ui.C1668a;
import com.applovin.impl.mediation.debugger.p038ui.p042c.C1703b;
import com.applovin.impl.mediation.debugger.p038ui.p043d.C1705a;
import com.applovin.impl.mediation.debugger.p038ui.p043d.C1707c;
import com.applovin.impl.mediation.debugger.p038ui.p043d.C1711d;
import com.applovin.impl.sdk.C1959m;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.mediation.MaxDebuggerMultiAdActivity;
import com.applovin.sdk.C2392R;

/* renamed from: com.applovin.impl.mediation.debugger.ui.c.a */
public class C1700a extends C1668a {

    /* renamed from: a */
    private C1703b f2512a;

    /* renamed from: b */
    private ListView f2513b;

    public C1700a() {
        this.communicatorTopics.add("adapter_initialization_status");
        this.communicatorTopics.add("network_sdk_version_updated");
    }

    /* access modifiers changed from: protected */
    public C1959m getSdk() {
        C1703b bVar = this.f2512a;
        if (bVar != null) {
            return bVar.mo13481a().mo13451v();
        }
        return null;
    }

    public void initialize(final C1661b bVar) {
        setTitle(bVar.mo13437i());
        C1703b bVar2 = new C1703b(bVar, this);
        this.f2512a = bVar2;
        bVar2.mo13554a((C1711d.C1713a) new C1711d.C1713a() {
            /* renamed from: a */
            public void mo13476a(C1705a aVar, C1707c cVar) {
                if (aVar.mo13525a() == C1703b.C1704a.TEST_ADS.ordinal()) {
                    C1959m v = bVar.mo13451v();
                    C1661b.C1663b c = bVar.mo13430c();
                    if (C1661b.C1663b.READY == c) {
                        C1700a.this.startActivity(MaxDebuggerMultiAdActivity.class, v.mo14333af(), new C1668a.C1670a<MaxDebuggerMultiAdActivity>() {
                            /* renamed from: a */
                            public void mo13473a(MaxDebuggerMultiAdActivity maxDebuggerMultiAdActivity) {
                                maxDebuggerMultiAdActivity.initialize(bVar);
                            }
                        });
                        return;
                    } else if (C1661b.C1663b.DISABLED == c) {
                        v.mo14295J().mo13587d();
                        Utils.showAlert("Restart Required", cVar.mo13535m(), C1700a.this);
                        return;
                    }
                }
                Utils.showAlert("Instructions", cVar.mo13535m(), C1700a.this);
            }
        });
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C2392R.layout.list_view);
        ListView listView = (ListView) findViewById(C2392R.C2394id.listView);
        this.f2513b = listView;
        listView.setAdapter(this.f2512a);
    }

    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        if (this.f2512a.mo13481a().mo13441m().equals(appLovinCommunicatorMessage.getMessageData().getString("adapter_class", ""))) {
            this.f2512a.mo13523c();
            this.f2512a.mo13564j();
        }
    }
}

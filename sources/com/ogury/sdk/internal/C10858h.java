package com.ogury.sdk.internal;

import com.ogury.core.internal.network.OguryNetworkClient;
import com.ogury.core.internal.network.OguryNetworkResponse;
import org.json.JSONException;

/* renamed from: com.ogury.sdk.internal.h */
/* compiled from: MonitoringInfoSender.kt */
public final class C10858h {

    /* renamed from: a */
    private final C10856f f27087a;

    /* renamed from: b */
    private final C10857g f27088b;

    static {
        new C10859a((byte) 0);
    }

    public C10858h(C10856f fVar, C10857g gVar) {
        C10865m.m32951b(fVar, "monitoringInfoHelper");
        C10865m.m32951b(gVar, "monitoringInfoJsonSerializer");
        this.f27087a = fVar;
        this.f27088b = gVar;
    }

    /* renamed from: a */
    public final OguryNetworkResponse mo67927a(C10850b bVar) throws JSONException {
        C10865m.m32951b(bVar, "monitoringInfo");
        OguryNetworkResponse post = new OguryNetworkClient(3000, 3000).post("https://sdk-monitoring.ogury.co/sdk-versions", this.f27088b.mo67926a(bVar), new C10862j(this.f27087a));
        C10865m.m32949a((Object) post, "oguryNetworkClient.post(…er(monitoringInfoHelper))");
        return post;
    }

    /* renamed from: com.ogury.sdk.internal.h$a */
    /* compiled from: MonitoringInfoSender.kt */
    public static final class C10859a {
        private C10859a() {
        }

        public /* synthetic */ C10859a(byte b) {
            this();
        }
    }
}

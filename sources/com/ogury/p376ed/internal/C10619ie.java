package com.ogury.p376ed.internal;

import android.content.Context;
import android.webkit.WebView;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import java.util.List;

/* renamed from: com.ogury.ed.internal.ie */
public final class C10619ie {

    /* renamed from: a */
    public static final C10620a f26812a = new C10620a((byte) 0);

    /* renamed from: b */
    private final C10618id f26813b;

    /* renamed from: c */
    private C10636ir f26814c;

    /* renamed from: d */
    private final C10624ii f26815d;

    /* renamed from: e */
    private final C10531fn f26816e;

    /* renamed from: f */
    private long f26817f;

    /* renamed from: g */
    private final Context f26818g;

    private C10619ie(Context context, C10618id idVar, C10636ir irVar, C10624ii iiVar, C10531fn fnVar) {
        C10765mq.m32773b(context, "context");
        C10765mq.m32773b(idVar, "mraidCacheStore");
        C10765mq.m32773b(irVar, "webViewLoader");
        C10765mq.m32773b(iiVar, "chromeVersionHelper");
        C10765mq.m32773b(fnVar, "profigGateway");
        this.f26813b = idVar;
        this.f26814c = irVar;
        this.f26815d = iiVar;
        this.f26816e = fnVar;
        this.f26817f = 80000;
        this.f26818g = context.getApplicationContext();
    }

    public /* synthetic */ C10619ie(Context context, C10618id idVar) {
        this(context, idVar, new C10636ir(), new C10624ii(), C10531fn.f26635a);
    }

    /* renamed from: com.ogury.ed.internal.ie$a */
    public static final class C10620a {
        public /* synthetic */ C10620a(byte b) {
            this();
        }

        private C10620a() {
        }

        /* renamed from: a */
        public static C10619ie m32380a(Context context) {
            C10765mq.m32773b(context, "context");
            return new C10619ie(context, C10618id.f26806a);
        }
    }

    /* renamed from: a */
    public final void mo67617a(C10622ig igVar, List<C10483eb> list, C10621if ifVar) {
        C10765mq.m32773b(igVar, "presageAdGateway");
        C10765mq.m32773b(list, CampaignUnit.JSON_KEY_ADS);
        C10765mq.m32773b(ifVar, "preCacheListener");
        m32376a(ifVar, igVar);
        for (C10483eb next : list) {
            Context context = this.f26818g;
            C10765mq.m32770a((Object) context, "context");
            C10660jh a = C10663jk.m32604a(context, next);
            if (a != null) {
                WebView webView = a;
                this.f26815d.mo67624a(webView);
                C10566gr.m32105a(webView);
                this.f26814c.mo67639a((C10635iq) new C10627ik(a, next, this.f26813b, igVar));
                if (next.mo67259r().length() > 0) {
                    m32375a(next);
                }
            } else {
                ifVar.mo67620b();
                return;
            }
        }
        this.f26814c.mo67638a(this.f26815d, this.f26817f, list.size());
    }

    /* renamed from: a */
    private final void m32376a(C10621if ifVar, C10622ig igVar) {
        this.f26814c.mo67637a(ifVar);
        this.f26814c.mo67640b();
        C10618id.m32366a(igVar);
        m32374a();
    }

    /* renamed from: a */
    private final void m32374a() {
        Context context = this.f26818g;
        C10765mq.m32770a((Object) context, "context");
        C10530fm a = C10531fn.m32005a(context);
        if (a != null) {
            this.f26817f = a.mo67434i();
        }
    }

    /* renamed from: a */
    private final void m32375a(C10483eb ebVar) {
        C10660jh b = m32377b(ebVar);
        if (b != null) {
            C10594hn.m32228a(b);
            this.f26814c.mo67639a((C10635iq) new C10630im(b, ebVar));
        }
    }

    /* renamed from: b */
    private final C10660jh m32377b(C10483eb ebVar) {
        Context context = this.f26818g;
        C10765mq.m32770a((Object) context, "context");
        C10660jh a = C10663jk.m32604a(context, ebVar);
        if (a != null) {
            C10566gr.m32105a((WebView) a);
        }
        return a;
    }

    /* renamed from: a */
    public final void mo67616a(C10622ig igVar) {
        C10765mq.m32773b(igVar, "presageAdGateway");
        this.f26814c.mo67637a((C10621if) null);
        this.f26814c.mo67640b();
        C10618id.m32366a(igVar);
    }
}

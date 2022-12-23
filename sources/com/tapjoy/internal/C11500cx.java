package com.tapjoy.internal;

import android.provider.Settings;
import android.view.View;
import android.webkit.WebView;
import com.smaato.sdk.video.vast.model.StaticResource;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* renamed from: com.tapjoy.internal.cx */
public final class C11500cx extends C11489cm {

    /* renamed from: i */
    private static final Pattern f27816i = Pattern.compile("^[a-zA-Z0-9 ]+$");

    /* renamed from: a */
    public final C11490cn f27817a;

    /* renamed from: b */
    public final List<C11510df> f27818b = new ArrayList();

    /* renamed from: c */
    public C11528du f27819c;

    /* renamed from: d */
    public boolean f27820d = false;

    /* renamed from: e */
    public boolean f27821e = false;

    /* renamed from: f */
    public final String f27822f;

    /* renamed from: g */
    public boolean f27823g;

    /* renamed from: h */
    public boolean f27824h;

    /* renamed from: j */
    private final C11491co f27825j;

    /* renamed from: k */
    private C11526ds f27826k;

    /* renamed from: b */
    private void m33396b(View view) {
        this.f27826k = new C11526ds(view);
    }

    /* renamed from: c */
    public final View mo72289c() {
        return (View) this.f27826k.get();
    }

    /* renamed from: d */
    public final boolean mo72290d() {
        return this.f27820d && !this.f27821e;
    }

    public C11500cx(C11490cn cnVar, C11491co coVar) {
        this.f27817a = cnVar;
        this.f27825j = coVar;
        this.f27822f = UUID.randomUUID().toString();
        m33396b((View) null);
        if (coVar.f27774h == C11492cp.HTML || coVar.f27774h == C11492cp.JAVASCRIPT) {
            this.f27819c = new C11530dv(coVar.f27768b);
        } else {
            this.f27819c = new C11531dw(Collections.unmodifiableMap(coVar.f27770d), coVar.f27771e);
        }
        this.f27819c.mo72314a();
        C11507dd.m33405a().f27851a.add(this);
        C11528du duVar = this.f27819c;
        C11512dh a = C11512dh.m33412a();
        WebView c = duVar.mo72323c();
        JSONObject jSONObject = new JSONObject();
        C11521do.m33438a(jSONObject, "impressionOwner", cnVar.f27762a);
        C11521do.m33438a(jSONObject, "mediaEventsOwner", cnVar.f27763b);
        C11521do.m33438a(jSONObject, StaticResource.CREATIVE_TYPE, cnVar.f27765d);
        C11521do.m33438a(jSONObject, "impressionType", cnVar.f27766e);
        C11521do.m33438a(jSONObject, "isolateVerificationScripts", Boolean.valueOf(cnVar.f27764c));
        a.mo72307a(c, "init", jSONObject);
    }

    /* renamed from: a */
    public final void mo72280a() {
        if (!this.f27820d) {
            this.f27820d = true;
            C11507dd a = C11507dd.m33405a();
            boolean b = a.mo72294b();
            a.f27852b.add(this);
            if (!b) {
                C11514di a2 = C11514di.m33422a();
                C11508de.m33407a().f27856c = a2;
                C11508de a3 = C11508de.m33407a();
                a3.f27854a = true;
                a3.f27855b = false;
                a3.mo72295b();
                C11533dx.m33468a();
                C11533dx.m33472b();
                C11486cj cjVar = a2.f27869b;
                cjVar.f27757b = cjVar.mo72277a();
                cjVar.mo72278b();
                cjVar.f27756a.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, cjVar);
            }
            this.f27819c.mo72315a(C11514di.m33422a().f27868a);
            this.f27819c.mo72317a(this, this.f27825j);
        }
    }

    /* renamed from: a */
    public final void mo72282a(C11494cr crVar, String str) {
        if (!this.f27821e) {
            C11524dq.m33446a((Object) crVar, "Error type is null");
            C11524dq.m33447a(str, "Message is null");
            C11528du duVar = this.f27819c;
            C11512dh.m33412a().mo72307a(duVar.mo72323c(), "error", crVar.toString(), str);
            return;
        }
        throw new IllegalStateException("AdSession is finished");
    }

    /* renamed from: a */
    public final void mo72281a(View view) {
        if (!this.f27821e) {
            C11524dq.m33446a((Object) view, "AdView is null");
            if (mo72289c() != view) {
                m33396b(view);
                this.f27819c.mo72324d();
                Collection<T> unmodifiableCollection = Collections.unmodifiableCollection(C11507dd.m33405a().f27851a);
                if (unmodifiableCollection != null && !unmodifiableCollection.isEmpty()) {
                    for (T t : unmodifiableCollection) {
                        if (t != this && t.mo72289c() == view) {
                            t.f27826k.clear();
                        }
                    }
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo72283b() {
        if (!this.f27821e) {
            this.f27826k.clear();
            if (!this.f27821e) {
                this.f27818b.clear();
            }
            this.f27821e = true;
            C11512dh.m33412a().mo72307a(this.f27819c.mo72323c(), "finishSession", new Object[0]);
            C11507dd a = C11507dd.m33405a();
            boolean b = a.mo72294b();
            a.f27851a.remove(this);
            a.f27852b.remove(this);
            if (b && !a.mo72294b()) {
                C11514di a2 = C11514di.m33422a();
                C11533dx a3 = C11533dx.m33468a();
                C11533dx.m33474c();
                a3.f27902b.clear();
                C11533dx.f27897a.post(new Runnable() {
                    public final void run() {
                        C11533dx.this.f27906h.mo72341b();
                    }
                });
                C11508de a4 = C11508de.m33407a();
                a4.f27854a = false;
                a4.f27855b = false;
                a4.f27856c = null;
                C11486cj cjVar = a2.f27869b;
                cjVar.f27756a.getContentResolver().unregisterContentObserver(cjVar);
            }
            this.f27819c.mo72322b();
            this.f27819c = null;
        }
    }
}

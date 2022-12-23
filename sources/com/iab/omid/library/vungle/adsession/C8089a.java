package com.iab.omid.library.vungle.adsession;

import android.view.View;
import com.iab.omid.library.vungle.p281b.C8091a;
import com.iab.omid.library.vungle.p281b.C8094c;
import com.iab.omid.library.vungle.p281b.C8098f;
import com.iab.omid.library.vungle.p283d.C8110e;
import com.iab.omid.library.vungle.p284e.C8112a;
import com.iab.omid.library.vungle.publisher.AdSessionStatePublisher;
import com.iab.omid.library.vungle.publisher.C8115a;
import com.iab.omid.library.vungle.publisher.C8116b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.UUID;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.vungle.adsession.a */
public class C8089a extends AdSession {

    /* renamed from: a */
    private static final Pattern f19228a = Pattern.compile("^[a-zA-Z0-9 ]+$");

    /* renamed from: b */
    private final AdSessionContext f19229b;

    /* renamed from: c */
    private final AdSessionConfiguration f19230c;

    /* renamed from: d */
    private final List<C8094c> f19231d = new ArrayList();

    /* renamed from: e */
    private C8112a f19232e;

    /* renamed from: f */
    private AdSessionStatePublisher f19233f;

    /* renamed from: g */
    private boolean f19234g = false;

    /* renamed from: h */
    private boolean f19235h = false;

    /* renamed from: i */
    private final String f19236i;

    /* renamed from: j */
    private boolean f19237j;

    /* renamed from: k */
    private boolean f19238k;

    C8089a(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext) {
        this.f19230c = adSessionConfiguration;
        this.f19229b = adSessionContext;
        this.f19236i = UUID.randomUUID().toString();
        m23186c((View) null);
        this.f19233f = (adSessionContext.getAdSessionContextType() == AdSessionContextType.HTML || adSessionContext.getAdSessionContextType() == AdSessionContextType.JAVASCRIPT) ? new C8115a(adSessionContext.getWebView()) : new C8116b(adSessionContext.getInjectedResourcesMap(), adSessionContext.getOmidJsScriptContent());
        this.f19233f.mo56234a();
        C8091a.m23206a().mo56182a(this);
        this.f19233f.mo56238a(adSessionConfiguration);
    }

    /* renamed from: a */
    private C8094c m23183a(View view) {
        for (C8094c next : this.f19231d) {
            if (next.mo56201a().get() == view) {
                return next;
            }
        }
        return null;
    }

    /* renamed from: a */
    private void m23184a(String str) {
        if (str == null) {
            return;
        }
        if (str.length() > 50) {
            throw new IllegalArgumentException("FriendlyObstruction has detailed reason over 50 characters in length");
        } else if (!f19228a.matcher(str).matches()) {
            throw new IllegalArgumentException("FriendlyObstruction has detailed reason that contains characters not in [a-z][A-Z][0-9] or space");
        }
    }

    /* renamed from: b */
    private static void m23185b(View view) {
        if (view == null) {
            throw new IllegalArgumentException("FriendlyObstruction is null");
        }
    }

    /* renamed from: c */
    private void m23186c(View view) {
        this.f19232e = new C8112a(view);
    }

    /* renamed from: d */
    private void m23187d(View view) {
        Collection<C8089a> b = C8091a.m23206a().mo56183b();
        if (b != null && !b.isEmpty()) {
            for (C8089a next : b) {
                if (next != this && next.mo56151d() == view) {
                    next.f19232e.clear();
                }
            }
        }
    }

    /* renamed from: j */
    private void m23188j() {
        if (this.f19237j) {
            throw new IllegalStateException("Impression event can only be sent once");
        }
    }

    /* renamed from: k */
    private void m23189k() {
        if (this.f19238k) {
            throw new IllegalStateException("Loaded event can only be sent once");
        }
    }

    /* renamed from: a */
    public List<C8094c> mo56147a() {
        return this.f19231d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo56148a(JSONObject jSONObject) {
        m23189k();
        getAdSessionStatePublisher().mo56246a(jSONObject);
        this.f19238k = true;
    }

    public void addFriendlyObstruction(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, String str) {
        if (!this.f19235h) {
            m23185b(view);
            m23184a(str);
            if (m23183a(view) == null) {
                this.f19231d.add(new C8094c(view, friendlyObstructionPurpose, str));
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo56149b() {
        m23188j();
        getAdSessionStatePublisher().mo56254g();
        this.f19237j = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo56150c() {
        m23189k();
        getAdSessionStatePublisher().mo56256h();
        this.f19238k = true;
    }

    /* renamed from: d */
    public View mo56151d() {
        return (View) this.f19232e.get();
    }

    /* renamed from: e */
    public boolean mo56152e() {
        return this.f19234g && !this.f19235h;
    }

    public void error(ErrorType errorType, String str) {
        if (!this.f19235h) {
            C8110e.m23298a((Object) errorType, "Error type is null");
            C8110e.m23300a(str, "Message is null");
            getAdSessionStatePublisher().mo56239a(errorType, str);
            return;
        }
        throw new IllegalStateException("AdSession is finished");
    }

    /* renamed from: f */
    public boolean mo56153f() {
        return this.f19234g;
    }

    public void finish() {
        if (!this.f19235h) {
            this.f19232e.clear();
            removeAllFriendlyObstructions();
            this.f19235h = true;
            getAdSessionStatePublisher().mo56253f();
            C8091a.m23206a().mo56186c(this);
            getAdSessionStatePublisher().mo56248b();
            this.f19233f = null;
        }
    }

    /* renamed from: g */
    public boolean mo56154g() {
        return this.f19235h;
    }

    public String getAdSessionId() {
        return this.f19236i;
    }

    public AdSessionStatePublisher getAdSessionStatePublisher() {
        return this.f19233f;
    }

    /* renamed from: h */
    public boolean mo56155h() {
        return this.f19230c.isNativeImpressionOwner();
    }

    /* renamed from: i */
    public boolean mo56156i() {
        return this.f19230c.isNativeMediaEventsOwner();
    }

    public void registerAdView(View view) {
        if (!this.f19235h) {
            C8110e.m23298a((Object) view, "AdView is null");
            if (mo56151d() != view) {
                m23186c(view);
                getAdSessionStatePublisher().mo56257i();
                m23187d(view);
            }
        }
    }

    public void removeAllFriendlyObstructions() {
        if (!this.f19235h) {
            this.f19231d.clear();
        }
    }

    public void removeFriendlyObstruction(View view) {
        if (!this.f19235h) {
            m23185b(view);
            C8094c a = m23183a(view);
            if (a != null) {
                this.f19231d.remove(a);
            }
        }
    }

    public void start() {
        if (!this.f19234g) {
            this.f19234g = true;
            C8091a.m23206a().mo56184b(this);
            this.f19233f.mo56235a(C8098f.m23246a().mo56227d());
            this.f19233f.mo56240a(this, this.f19229b);
        }
    }
}

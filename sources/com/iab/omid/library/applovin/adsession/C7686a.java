package com.iab.omid.library.applovin.adsession;

import android.view.View;
import com.iab.omid.library.applovin.p233b.C7688a;
import com.iab.omid.library.applovin.p233b.C7691c;
import com.iab.omid.library.applovin.p233b.C7695f;
import com.iab.omid.library.applovin.p235d.C7707e;
import com.iab.omid.library.applovin.p236e.C7709a;
import com.iab.omid.library.applovin.publisher.AdSessionStatePublisher;
import com.iab.omid.library.applovin.publisher.C7712a;
import com.iab.omid.library.applovin.publisher.C7713b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.UUID;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.applovin.adsession.a */
public class C7686a extends AdSession {

    /* renamed from: a */
    private static final Pattern f18303a = Pattern.compile("^[a-zA-Z0-9 ]+$");

    /* renamed from: b */
    private final AdSessionContext f18304b;

    /* renamed from: c */
    private final AdSessionConfiguration f18305c;

    /* renamed from: d */
    private final List<C7691c> f18306d = new ArrayList();

    /* renamed from: e */
    private C7709a f18307e;

    /* renamed from: f */
    private AdSessionStatePublisher f18308f;

    /* renamed from: g */
    private boolean f18309g = false;

    /* renamed from: h */
    private boolean f18310h = false;

    /* renamed from: i */
    private final String f18311i;

    /* renamed from: j */
    private boolean f18312j;

    /* renamed from: k */
    private boolean f18313k;

    /* renamed from: l */
    private PossibleObstructionListener f18314l;

    C7686a(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext) {
        this.f18305c = adSessionConfiguration;
        this.f18304b = adSessionContext;
        this.f18311i = UUID.randomUUID().toString();
        m21374c((View) null);
        this.f18308f = (adSessionContext.getAdSessionContextType() == AdSessionContextType.HTML || adSessionContext.getAdSessionContextType() == AdSessionContextType.JAVASCRIPT) ? new C7712a(adSessionContext.getWebView()) : new C7713b(adSessionContext.getInjectedResourcesMap(), adSessionContext.getOmidJsScriptContent());
        this.f18308f.mo54659a();
        C7688a.m21396a().mo54607a(this);
        this.f18308f.mo54663a(adSessionConfiguration);
    }

    /* renamed from: a */
    private C7691c m21371a(View view) {
        for (C7691c next : this.f18306d) {
            if (next.mo54626a().get() == view) {
                return next;
            }
        }
        return null;
    }

    /* renamed from: a */
    private void m21372a(String str) {
        if (str == null) {
            return;
        }
        if (str.length() > 50) {
            throw new IllegalArgumentException("FriendlyObstruction has detailed reason over 50 characters in length");
        } else if (!f18303a.matcher(str).matches()) {
            throw new IllegalArgumentException("FriendlyObstruction has detailed reason that contains characters not in [a-z][A-Z][0-9] or space");
        }
    }

    /* renamed from: b */
    private static void m21373b(View view) {
        if (view == null) {
            throw new IllegalArgumentException("FriendlyObstruction is null");
        }
    }

    /* renamed from: c */
    private void m21374c(View view) {
        this.f18307e = new C7709a(view);
    }

    /* renamed from: d */
    private void m21375d(View view) {
        Collection<C7686a> b = C7688a.m21396a().mo54608b();
        if (b != null && !b.isEmpty()) {
            for (C7686a next : b) {
                if (next != this && next.mo54576e() == view) {
                    next.f18307e.clear();
                }
            }
        }
    }

    /* renamed from: k */
    private void m21376k() {
        if (this.f18312j) {
            throw new IllegalStateException("Impression event can only be sent once");
        }
    }

    /* renamed from: l */
    private void m21377l() {
        if (this.f18313k) {
            throw new IllegalStateException("Loaded event can only be sent once");
        }
    }

    /* renamed from: a */
    public List<C7691c> mo54570a() {
        return this.f18306d;
    }

    /* renamed from: a */
    public void mo54571a(List<C7709a> list) {
        if (mo54573b()) {
            ArrayList arrayList = new ArrayList();
            for (C7709a aVar : list) {
                View view = (View) aVar.get();
                if (view != null) {
                    arrayList.add(view);
                }
            }
            this.f18314l.onPossibleObstructionsDetected(this.f18311i, arrayList);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo54572a(JSONObject jSONObject) {
        m21377l();
        getAdSessionStatePublisher().mo54671a(jSONObject);
        this.f18313k = true;
    }

    public void addFriendlyObstruction(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, String str) {
        if (!this.f18310h) {
            m21373b(view);
            m21372a(str);
            if (m21371a(view) == null) {
                this.f18306d.add(new C7691c(view, friendlyObstructionPurpose, str));
            }
        }
    }

    /* renamed from: b */
    public boolean mo54573b() {
        return this.f18314l != null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo54574c() {
        m21376k();
        getAdSessionStatePublisher().mo54679g();
        this.f18312j = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo54575d() {
        m21377l();
        getAdSessionStatePublisher().mo54681h();
        this.f18313k = true;
    }

    /* renamed from: e */
    public View mo54576e() {
        return (View) this.f18307e.get();
    }

    public void error(ErrorType errorType, String str) {
        if (!this.f18310h) {
            C7707e.m21490a((Object) errorType, "Error type is null");
            C7707e.m21492a(str, "Message is null");
            getAdSessionStatePublisher().mo54664a(errorType, str);
            return;
        }
        throw new IllegalStateException("AdSession is finished");
    }

    /* renamed from: f */
    public boolean mo54577f() {
        return this.f18309g && !this.f18310h;
    }

    public void finish() {
        if (!this.f18310h) {
            this.f18307e.clear();
            removeAllFriendlyObstructions();
            this.f18310h = true;
            getAdSessionStatePublisher().mo54678f();
            C7688a.m21396a().mo54611c(this);
            getAdSessionStatePublisher().mo54673b();
            this.f18308f = null;
            this.f18314l = null;
        }
    }

    /* renamed from: g */
    public boolean mo54578g() {
        return this.f18309g;
    }

    public String getAdSessionId() {
        return this.f18311i;
    }

    public AdSessionStatePublisher getAdSessionStatePublisher() {
        return this.f18308f;
    }

    /* renamed from: h */
    public boolean mo54579h() {
        return this.f18310h;
    }

    /* renamed from: i */
    public boolean mo54580i() {
        return this.f18305c.isNativeImpressionOwner();
    }

    /* renamed from: j */
    public boolean mo54581j() {
        return this.f18305c.isNativeMediaEventsOwner();
    }

    public void registerAdView(View view) {
        if (!this.f18310h) {
            C7707e.m21490a((Object) view, "AdView is null");
            if (mo54576e() != view) {
                m21374c(view);
                getAdSessionStatePublisher().mo54682i();
                m21375d(view);
            }
        }
    }

    public void removeAllFriendlyObstructions() {
        if (!this.f18310h) {
            this.f18306d.clear();
        }
    }

    public void removeFriendlyObstruction(View view) {
        if (!this.f18310h) {
            m21373b(view);
            C7691c a = m21371a(view);
            if (a != null) {
                this.f18306d.remove(a);
            }
        }
    }

    public void setPossibleObstructionListener(PossibleObstructionListener possibleObstructionListener) {
        this.f18314l = possibleObstructionListener;
    }

    public void start() {
        if (!this.f18309g) {
            this.f18309g = true;
            C7688a.m21396a().mo54609b(this);
            this.f18308f.mo54660a(C7695f.m21436a().mo54652d());
            this.f18308f.mo54665a(this, this.f18304b);
        }
    }
}

package com.iab.omid.library.fyber.adsession;

import android.view.View;
import com.iab.omid.library.fyber.p245b.C7789a;
import com.iab.omid.library.fyber.p245b.C7792c;
import com.iab.omid.library.fyber.p245b.C7796f;
import com.iab.omid.library.fyber.p247d.C7808e;
import com.iab.omid.library.fyber.p248e.C7810a;
import com.iab.omid.library.fyber.publisher.AdSessionStatePublisher;
import com.iab.omid.library.fyber.publisher.C7813a;
import com.iab.omid.library.fyber.publisher.C7814b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.UUID;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.fyber.adsession.a */
public class C7787a extends AdSession {

    /* renamed from: a */
    private static final Pattern f18533a = Pattern.compile("^[a-zA-Z0-9 ]+$");

    /* renamed from: b */
    private final AdSessionContext f18534b;

    /* renamed from: c */
    private final AdSessionConfiguration f18535c;

    /* renamed from: d */
    private final List<C7792c> f18536d = new ArrayList();

    /* renamed from: e */
    private C7810a f18537e;

    /* renamed from: f */
    private AdSessionStatePublisher f18538f;

    /* renamed from: g */
    private boolean f18539g = false;

    /* renamed from: h */
    private boolean f18540h = false;

    /* renamed from: i */
    private final String f18541i;

    /* renamed from: j */
    private boolean f18542j;

    /* renamed from: k */
    private boolean f18543k;

    /* renamed from: l */
    private PossibleObstructionListener f18544l;

    C7787a(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext) {
        this.f18535c = adSessionConfiguration;
        this.f18534b = adSessionContext;
        this.f18541i = UUID.randomUUID().toString();
        m21828c((View) null);
        this.f18538f = (adSessionContext.getAdSessionContextType() == AdSessionContextType.HTML || adSessionContext.getAdSessionContextType() == AdSessionContextType.JAVASCRIPT) ? new C7813a(adSessionContext.getWebView()) : new C7814b(adSessionContext.getInjectedResourcesMap(), adSessionContext.getOmidJsScriptContent());
        this.f18538f.mo55052a();
        C7789a.m21850a().mo55000a(this);
        this.f18538f.mo55056a(adSessionConfiguration);
    }

    /* renamed from: a */
    private C7792c m21825a(View view) {
        for (C7792c next : this.f18536d) {
            if (next.mo55019a().get() == view) {
                return next;
            }
        }
        return null;
    }

    /* renamed from: a */
    private void m21826a(String str) {
        if (str == null) {
            return;
        }
        if (str.length() > 50) {
            throw new IllegalArgumentException("FriendlyObstruction has detailed reason over 50 characters in length");
        } else if (!f18533a.matcher(str).matches()) {
            throw new IllegalArgumentException("FriendlyObstruction has detailed reason that contains characters not in [a-z][A-Z][0-9] or space");
        }
    }

    /* renamed from: b */
    private static void m21827b(View view) {
        if (view == null) {
            throw new IllegalArgumentException("FriendlyObstruction is null");
        }
    }

    /* renamed from: c */
    private void m21828c(View view) {
        this.f18537e = new C7810a(view);
    }

    /* renamed from: d */
    private void m21829d(View view) {
        Collection<C7787a> b = C7789a.m21850a().mo55001b();
        if (b != null && !b.isEmpty()) {
            for (C7787a next : b) {
                if (next != this && next.mo54969e() == view) {
                    next.f18537e.clear();
                }
            }
        }
    }

    /* renamed from: k */
    private void m21830k() {
        if (this.f18542j) {
            throw new IllegalStateException("Impression event can only be sent once");
        }
    }

    /* renamed from: l */
    private void m21831l() {
        if (this.f18543k) {
            throw new IllegalStateException("Loaded event can only be sent once");
        }
    }

    /* renamed from: a */
    public List<C7792c> mo54963a() {
        return this.f18536d;
    }

    /* renamed from: a */
    public void mo54964a(List<C7810a> list) {
        if (mo54966b()) {
            ArrayList arrayList = new ArrayList();
            for (C7810a aVar : list) {
                View view = (View) aVar.get();
                if (view != null) {
                    arrayList.add(view);
                }
            }
            this.f18544l.onPossibleObstructionsDetected(this.f18541i, arrayList);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo54965a(JSONObject jSONObject) {
        m21831l();
        getAdSessionStatePublisher().mo55064a(jSONObject);
        this.f18543k = true;
    }

    public void addFriendlyObstruction(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, String str) {
        if (!this.f18540h) {
            m21827b(view);
            m21826a(str);
            if (m21825a(view) == null) {
                this.f18536d.add(new C7792c(view, friendlyObstructionPurpose, str));
            }
        }
    }

    /* renamed from: b */
    public boolean mo54966b() {
        return this.f18544l != null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo54967c() {
        m21830k();
        getAdSessionStatePublisher().mo55072g();
        this.f18542j = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo54968d() {
        m21831l();
        getAdSessionStatePublisher().mo55074h();
        this.f18543k = true;
    }

    /* renamed from: e */
    public View mo54969e() {
        return (View) this.f18537e.get();
    }

    public void error(ErrorType errorType, String str) {
        if (!this.f18540h) {
            C7808e.m21944a((Object) errorType, "Error type is null");
            C7808e.m21946a(str, "Message is null");
            getAdSessionStatePublisher().mo55057a(errorType, str);
            return;
        }
        throw new IllegalStateException("AdSession is finished");
    }

    /* renamed from: f */
    public boolean mo54970f() {
        return this.f18539g && !this.f18540h;
    }

    public void finish() {
        if (!this.f18540h) {
            this.f18537e.clear();
            removeAllFriendlyObstructions();
            this.f18540h = true;
            getAdSessionStatePublisher().mo55071f();
            C7789a.m21850a().mo55004c(this);
            getAdSessionStatePublisher().mo55066b();
            this.f18538f = null;
            this.f18544l = null;
        }
    }

    /* renamed from: g */
    public boolean mo54971g() {
        return this.f18539g;
    }

    public String getAdSessionId() {
        return this.f18541i;
    }

    public AdSessionStatePublisher getAdSessionStatePublisher() {
        return this.f18538f;
    }

    /* renamed from: h */
    public boolean mo54972h() {
        return this.f18540h;
    }

    /* renamed from: i */
    public boolean mo54973i() {
        return this.f18535c.isNativeImpressionOwner();
    }

    /* renamed from: j */
    public boolean mo54974j() {
        return this.f18535c.isNativeMediaEventsOwner();
    }

    public void registerAdView(View view) {
        if (!this.f18540h) {
            C7808e.m21944a((Object) view, "AdView is null");
            if (mo54969e() != view) {
                m21828c(view);
                getAdSessionStatePublisher().mo55075i();
                m21829d(view);
            }
        }
    }

    public void removeAllFriendlyObstructions() {
        if (!this.f18540h) {
            this.f18536d.clear();
        }
    }

    public void removeFriendlyObstruction(View view) {
        if (!this.f18540h) {
            m21827b(view);
            C7792c a = m21825a(view);
            if (a != null) {
                this.f18536d.remove(a);
            }
        }
    }

    public void setPossibleObstructionListener(PossibleObstructionListener possibleObstructionListener) {
        this.f18544l = possibleObstructionListener;
    }

    public void start() {
        if (!this.f18539g) {
            this.f18539g = true;
            C7789a.m21850a().mo55002b(this);
            this.f18538f.mo55053a(C7796f.m21890a().mo55045d());
            this.f18538f.mo55058a(this, this.f18534b);
        }
    }
}

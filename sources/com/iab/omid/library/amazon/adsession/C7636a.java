package com.iab.omid.library.amazon.adsession;

import android.view.View;
import com.iab.omid.library.amazon.p227b.C7638a;
import com.iab.omid.library.amazon.p227b.C7641c;
import com.iab.omid.library.amazon.p227b.C7645f;
import com.iab.omid.library.amazon.p229d.C7657e;
import com.iab.omid.library.amazon.p230e.C7659a;
import com.iab.omid.library.amazon.publisher.AdSessionStatePublisher;
import com.iab.omid.library.amazon.publisher.C7662a;
import com.iab.omid.library.amazon.publisher.C7663b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.UUID;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.amazon.adsession.a */
public class C7636a extends AdSession {

    /* renamed from: a */
    private static final Pattern f18186a = Pattern.compile("^[a-zA-Z0-9 ]+$");

    /* renamed from: b */
    private final AdSessionContext f18187b;

    /* renamed from: c */
    private final AdSessionConfiguration f18188c;

    /* renamed from: d */
    private final List<C7641c> f18189d = new ArrayList();

    /* renamed from: e */
    private C7659a f18190e;

    /* renamed from: f */
    private AdSessionStatePublisher f18191f;

    /* renamed from: g */
    private boolean f18192g = false;

    /* renamed from: h */
    private boolean f18193h = false;

    /* renamed from: i */
    private final String f18194i;

    /* renamed from: j */
    private boolean f18195j;

    /* renamed from: k */
    private boolean f18196k;

    /* renamed from: l */
    private PossibleObstructionListener f18197l;

    C7636a(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext) {
        this.f18188c = adSessionConfiguration;
        this.f18187b = adSessionContext;
        this.f18194i = UUID.randomUUID().toString();
        m21144c((View) null);
        this.f18191f = (adSessionContext.getAdSessionContextType() == AdSessionContextType.HTML || adSessionContext.getAdSessionContextType() == AdSessionContextType.JAVASCRIPT) ? new C7662a(adSessionContext.getWebView()) : new C7663b(adSessionContext.getInjectedResourcesMap(), adSessionContext.getOmidJsScriptContent());
        this.f18191f.mo54460a();
        C7638a.m21166a().mo54408a(this);
        this.f18191f.mo54464a(adSessionConfiguration);
    }

    /* renamed from: a */
    private C7641c m21141a(View view) {
        for (C7641c next : this.f18189d) {
            if (next.mo54427a().get() == view) {
                return next;
            }
        }
        return null;
    }

    /* renamed from: a */
    private void m21142a(String str) {
        if (str == null) {
            return;
        }
        if (str.length() > 50) {
            throw new IllegalArgumentException("FriendlyObstruction has detailed reason over 50 characters in length");
        } else if (!f18186a.matcher(str).matches()) {
            throw new IllegalArgumentException("FriendlyObstruction has detailed reason that contains characters not in [a-z][A-Z][0-9] or space");
        }
    }

    /* renamed from: b */
    private static void m21143b(View view) {
        if (view == null) {
            throw new IllegalArgumentException("FriendlyObstruction is null");
        }
    }

    /* renamed from: c */
    private void m21144c(View view) {
        this.f18190e = new C7659a(view);
    }

    /* renamed from: d */
    private void m21145d(View view) {
        Collection<C7636a> b = C7638a.m21166a().mo54409b();
        if (b != null && !b.isEmpty()) {
            for (C7636a next : b) {
                if (next != this && next.mo54377e() == view) {
                    next.f18190e.clear();
                }
            }
        }
    }

    /* renamed from: k */
    private void m21146k() {
        if (this.f18195j) {
            throw new IllegalStateException("Impression event can only be sent once");
        }
    }

    /* renamed from: l */
    private void m21147l() {
        if (this.f18196k) {
            throw new IllegalStateException("Loaded event can only be sent once");
        }
    }

    /* renamed from: a */
    public List<C7641c> mo54371a() {
        return this.f18189d;
    }

    /* renamed from: a */
    public void mo54372a(List<C7659a> list) {
        if (mo54374b()) {
            ArrayList arrayList = new ArrayList();
            for (C7659a aVar : list) {
                View view = (View) aVar.get();
                if (view != null) {
                    arrayList.add(view);
                }
            }
            this.f18197l.onPossibleObstructionsDetected(this.f18194i, arrayList);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo54373a(JSONObject jSONObject) {
        m21147l();
        getAdSessionStatePublisher().mo54472a(jSONObject);
        this.f18196k = true;
    }

    public void addFriendlyObstruction(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, String str) {
        if (!this.f18193h) {
            m21143b(view);
            m21142a(str);
            if (m21141a(view) == null) {
                this.f18189d.add(new C7641c(view, friendlyObstructionPurpose, str));
            }
        }
    }

    /* renamed from: b */
    public boolean mo54374b() {
        return this.f18197l != null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo54375c() {
        m21146k();
        getAdSessionStatePublisher().mo54480g();
        this.f18195j = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo54376d() {
        m21147l();
        getAdSessionStatePublisher().mo54482h();
        this.f18196k = true;
    }

    /* renamed from: e */
    public View mo54377e() {
        return (View) this.f18190e.get();
    }

    public void error(ErrorType errorType, String str) {
        if (!this.f18193h) {
            C7657e.m21260a((Object) errorType, "Error type is null");
            C7657e.m21262a(str, "Message is null");
            getAdSessionStatePublisher().mo54465a(errorType, str);
            return;
        }
        throw new IllegalStateException("AdSession is finished");
    }

    /* renamed from: f */
    public boolean mo54378f() {
        return this.f18192g && !this.f18193h;
    }

    public void finish() {
        if (!this.f18193h) {
            this.f18190e.clear();
            removeAllFriendlyObstructions();
            this.f18193h = true;
            getAdSessionStatePublisher().mo54479f();
            C7638a.m21166a().mo54412c(this);
            getAdSessionStatePublisher().mo54474b();
            this.f18191f = null;
            this.f18197l = null;
        }
    }

    /* renamed from: g */
    public boolean mo54379g() {
        return this.f18192g;
    }

    public String getAdSessionId() {
        return this.f18194i;
    }

    public AdSessionStatePublisher getAdSessionStatePublisher() {
        return this.f18191f;
    }

    /* renamed from: h */
    public boolean mo54380h() {
        return this.f18193h;
    }

    /* renamed from: i */
    public boolean mo54381i() {
        return this.f18188c.isNativeImpressionOwner();
    }

    /* renamed from: j */
    public boolean mo54382j() {
        return this.f18188c.isNativeMediaEventsOwner();
    }

    public void registerAdView(View view) {
        if (!this.f18193h) {
            C7657e.m21260a((Object) view, "AdView is null");
            if (mo54377e() != view) {
                m21144c(view);
                getAdSessionStatePublisher().mo54483i();
                m21145d(view);
            }
        }
    }

    public void removeAllFriendlyObstructions() {
        if (!this.f18193h) {
            this.f18189d.clear();
        }
    }

    public void removeFriendlyObstruction(View view) {
        if (!this.f18193h) {
            m21143b(view);
            C7641c a = m21141a(view);
            if (a != null) {
                this.f18189d.remove(a);
            }
        }
    }

    public void setPossibleObstructionListener(PossibleObstructionListener possibleObstructionListener) {
        this.f18197l = possibleObstructionListener;
    }

    public void start() {
        if (!this.f18192g) {
            this.f18192g = true;
            C7638a.m21166a().mo54410b(this);
            this.f18191f.mo54461a(C7645f.m21206a().mo54453d());
            this.f18191f.mo54466a(this, this.f18187b);
        }
    }
}

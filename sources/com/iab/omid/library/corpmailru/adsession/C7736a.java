package com.iab.omid.library.corpmailru.adsession;

import android.view.View;
import com.iab.omid.library.corpmailru.p239b.C7738a;
import com.iab.omid.library.corpmailru.p239b.C7741c;
import com.iab.omid.library.corpmailru.p239b.C7745f;
import com.iab.omid.library.corpmailru.p241d.C7757e;
import com.iab.omid.library.corpmailru.p242e.C7759a;
import com.iab.omid.library.corpmailru.publisher.AdSessionStatePublisher;
import com.iab.omid.library.corpmailru.publisher.C7762a;
import com.iab.omid.library.corpmailru.publisher.C7763b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.UUID;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.corpmailru.adsession.a */
public class C7736a extends AdSession {

    /* renamed from: a */
    private static final Pattern f18420a = Pattern.compile("^[a-zA-Z0-9 ]+$");

    /* renamed from: b */
    private final AdSessionContext f18421b;

    /* renamed from: c */
    private final AdSessionConfiguration f18422c;

    /* renamed from: d */
    private final List<C7741c> f18423d = new ArrayList();

    /* renamed from: e */
    private C7759a f18424e;

    /* renamed from: f */
    private AdSessionStatePublisher f18425f;

    /* renamed from: g */
    private boolean f18426g = false;

    /* renamed from: h */
    private boolean f18427h = false;

    /* renamed from: i */
    private final String f18428i;

    /* renamed from: j */
    private boolean f18429j;

    /* renamed from: k */
    private boolean f18430k;

    public C7736a(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext) {
        this.f18422c = adSessionConfiguration;
        this.f18421b = adSessionContext;
        this.f18428i = UUID.randomUUID().toString();
        m21604c((View) null);
        this.f18425f = (adSessionContext.getAdSessionContextType() == AdSessionContextType.HTML || adSessionContext.getAdSessionContextType() == AdSessionContextType.JAVASCRIPT) ? new C7762a(adSessionContext.getWebView()) : new C7763b(adSessionContext.getInjectedResourcesMap(), adSessionContext.getOmidJsScriptContent());
        this.f18425f.mo54854a();
        C7738a.m21624a().mo54802a(this);
        this.f18425f.mo54858a(adSessionConfiguration);
    }

    /* renamed from: a */
    private C7741c m21601a(View view) {
        for (C7741c next : this.f18423d) {
            if (next.mo54821a().get() == view) {
                return next;
            }
        }
        return null;
    }

    /* renamed from: a */
    private void m21602a(String str) {
        if (str == null) {
            return;
        }
        if (str.length() > 50 || !f18420a.matcher(str).matches()) {
            throw new IllegalArgumentException("FriendlyObstruction has improperly formatted detailed reason");
        }
    }

    /* renamed from: b */
    private static void m21603b(View view) {
        if (view == null) {
            throw new IllegalArgumentException("FriendlyObstruction is null");
        }
    }

    /* renamed from: c */
    private void m21604c(View view) {
        this.f18424e = new C7759a(view);
    }

    /* renamed from: d */
    private void m21605d(View view) {
        Collection<C7736a> b = C7738a.m21624a().mo54803b();
        if (b != null && !b.isEmpty()) {
            for (C7736a next : b) {
                if (next != this && next.mo54771d() == view) {
                    next.f18424e.clear();
                }
            }
        }
    }

    /* renamed from: j */
    private void m21606j() {
        if (this.f18429j) {
            throw new IllegalStateException("Impression event can only be sent once");
        }
    }

    /* renamed from: k */
    private void m21607k() {
        if (this.f18430k) {
            throw new IllegalStateException("Loaded event can only be sent once");
        }
    }

    /* renamed from: a */
    public List<C7741c> mo54767a() {
        return this.f18423d;
    }

    /* renamed from: a */
    public void mo54768a(JSONObject jSONObject) {
        m21607k();
        getAdSessionStatePublisher().mo54866a(jSONObject);
        this.f18430k = true;
    }

    public void addFriendlyObstruction(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, String str) {
        if (!this.f18427h) {
            m21603b(view);
            m21602a(str);
            if (m21601a(view) == null) {
                this.f18423d.add(new C7741c(view, friendlyObstructionPurpose, str));
            }
        }
    }

    /* renamed from: b */
    public void mo54769b() {
        m21606j();
        getAdSessionStatePublisher().mo54874g();
        this.f18429j = true;
    }

    /* renamed from: c */
    public void mo54770c() {
        m21607k();
        getAdSessionStatePublisher().mo54876h();
        this.f18430k = true;
    }

    /* renamed from: d */
    public View mo54771d() {
        return (View) this.f18424e.get();
    }

    /* renamed from: e */
    public boolean mo54772e() {
        return this.f18426g && !this.f18427h;
    }

    public void error(ErrorType errorType, String str) {
        if (!this.f18427h) {
            C7757e.m21716a((Object) errorType, "Error type is null");
            C7757e.m21718a(str, "Message is null");
            getAdSessionStatePublisher().mo54859a(errorType, str);
            return;
        }
        throw new IllegalStateException("AdSession is finished");
    }

    /* renamed from: f */
    public boolean mo54773f() {
        return this.f18426g;
    }

    public void finish() {
        if (!this.f18427h) {
            this.f18424e.clear();
            removeAllFriendlyObstructions();
            this.f18427h = true;
            getAdSessionStatePublisher().mo54873f();
            C7738a.m21624a().mo54806c(this);
            getAdSessionStatePublisher().mo54868b();
            this.f18425f = null;
        }
    }

    /* renamed from: g */
    public boolean mo54774g() {
        return this.f18427h;
    }

    public String getAdSessionId() {
        return this.f18428i;
    }

    public AdSessionStatePublisher getAdSessionStatePublisher() {
        return this.f18425f;
    }

    /* renamed from: h */
    public boolean mo54775h() {
        return this.f18422c.isNativeImpressionOwner();
    }

    /* renamed from: i */
    public boolean mo54776i() {
        return this.f18422c.isNativeMediaEventsOwner();
    }

    public void registerAdView(View view) {
        if (!this.f18427h) {
            C7757e.m21716a((Object) view, "AdView is null");
            if (mo54771d() != view) {
                m21604c(view);
                getAdSessionStatePublisher().mo54877i();
                m21605d(view);
            }
        }
    }

    public void removeAllFriendlyObstructions() {
        if (!this.f18427h) {
            this.f18423d.clear();
        }
    }

    public void removeFriendlyObstruction(View view) {
        if (!this.f18427h) {
            m21603b(view);
            C7741c a = m21601a(view);
            if (a != null) {
                this.f18423d.remove(a);
            }
        }
    }

    public void start() {
        if (!this.f18426g) {
            this.f18426g = true;
            C7738a.m21624a().mo54804b(this);
            this.f18425f.mo54855a(C7745f.m21664a().mo54847d());
            this.f18425f.mo54860a(this, this.f18421b);
        }
    }
}

package com.iab.omid.library.oguryco.adsession;

import android.view.View;
import com.iab.omid.library.oguryco.p269b.C7990a;
import com.iab.omid.library.oguryco.p269b.C7994c;
import com.iab.omid.library.oguryco.p269b.C7998f;
import com.iab.omid.library.oguryco.p271d.C8010e;
import com.iab.omid.library.oguryco.p272e.C8012a;
import com.iab.omid.library.oguryco.publisher.AdSessionStatePublisher;
import com.iab.omid.library.oguryco.publisher.C8015a;
import com.iab.omid.library.oguryco.publisher.C8016b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.UUID;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.oguryco.adsession.a */
public class C7988a extends AdSession {

    /* renamed from: a */
    private static final Pattern f18994a = Pattern.compile("^[a-zA-Z0-9 ]+$");

    /* renamed from: b */
    private final AdSessionContext f18995b;

    /* renamed from: c */
    private final AdSessionConfiguration f18996c;

    /* renamed from: d */
    private final List<C7994c> f18997d = new ArrayList();

    /* renamed from: e */
    private C8012a f18998e;

    /* renamed from: f */
    private AdSessionStatePublisher f18999f;

    /* renamed from: g */
    private boolean f19000g = false;

    /* renamed from: h */
    private boolean f19001h = false;

    /* renamed from: i */
    private String f19002i;

    /* renamed from: j */
    private boolean f19003j;

    /* renamed from: k */
    private boolean f19004k;

    C7988a(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext) {
        this.f18996c = adSessionConfiguration;
        this.f18995b = adSessionContext;
        this.f19002i = UUID.randomUUID().toString();
        m22733c((View) null);
        this.f18999f = (adSessionContext.getAdSessionContextType() == AdSessionContextType.HTML || adSessionContext.getAdSessionContextType() == AdSessionContextType.JAVASCRIPT) ? new C8015a(adSessionContext.getWebView()) : new C8016b(adSessionContext.getInjectedResourcesMap(), adSessionContext.getOmidJsScriptContent());
        this.f18999f.mo55846a();
        C7990a.m22755a().mo55800a(this);
        this.f18999f.mo55850a(adSessionConfiguration);
    }

    /* renamed from: a */
    private C7994c m22730a(View view) {
        for (C7994c next : this.f18997d) {
            if (next.mo55813a().get() == view) {
                return next;
            }
        }
        return null;
    }

    /* renamed from: a */
    private void m22731a(String str) {
        if (str == null) {
            return;
        }
        if (str.length() > 50 || !f18994a.matcher(str).matches()) {
            throw new IllegalArgumentException("FriendlyObstruction has improperly formatted detailed reason");
        }
    }

    /* renamed from: b */
    private void m22732b(View view) {
        if (view == null) {
            throw new IllegalArgumentException("FriendlyObstruction is null");
        }
    }

    /* renamed from: c */
    private void m22733c(View view) {
        this.f18998e = new C8012a(view);
    }

    /* renamed from: d */
    private void m22734d(View view) {
        Collection<C7988a> b = C7990a.m22755a().mo55801b();
        if (b != null && b.size() > 0) {
            for (C7988a next : b) {
                if (next != this && next.mo55745d() == view) {
                    next.f18998e.clear();
                }
            }
        }
    }

    /* renamed from: j */
    private void m22735j() {
        if (this.f19003j) {
            throw new IllegalStateException("Impression event can only be sent once");
        }
    }

    /* renamed from: k */
    private void m22736k() {
        if (this.f19004k) {
            throw new IllegalStateException("Loaded event can only be sent once");
        }
    }

    /* renamed from: a */
    public List<C7994c> mo55741a() {
        return this.f18997d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo55742a(JSONObject jSONObject) {
        m22736k();
        getAdSessionStatePublisher().mo55858a(jSONObject);
        this.f19004k = true;
    }

    public void addFriendlyObstruction(View view) {
        addFriendlyObstruction(view, FriendlyObstructionPurpose.OTHER, (String) null);
    }

    public void addFriendlyObstruction(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, String str) {
        if (!this.f19001h) {
            m22732b(view);
            m22731a(str);
            if (m22730a(view) == null) {
                this.f18997d.add(new C7994c(view, friendlyObstructionPurpose, str));
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo55743b() {
        m22735j();
        getAdSessionStatePublisher().mo55866g();
        this.f19003j = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo55744c() {
        m22736k();
        getAdSessionStatePublisher().mo55868h();
        this.f19004k = true;
    }

    /* renamed from: d */
    public View mo55745d() {
        return (View) this.f18998e.get();
    }

    /* renamed from: e */
    public boolean mo55746e() {
        return this.f19000g && !this.f19001h;
    }

    public void error(ErrorType errorType, String str) {
        if (!this.f19001h) {
            C8010e.m22850a((Object) errorType, "Error type is null");
            C8010e.m22852a(str, "Message is null");
            getAdSessionStatePublisher().mo55851a(errorType, str);
            return;
        }
        throw new IllegalStateException("AdSession is finished");
    }

    /* renamed from: f */
    public boolean mo55747f() {
        return this.f19000g;
    }

    public void finish() {
        if (!this.f19001h) {
            this.f18998e.clear();
            removeAllFriendlyObstructions();
            this.f19001h = true;
            getAdSessionStatePublisher().mo55865f();
            C7990a.m22755a().mo55804c(this);
            getAdSessionStatePublisher().mo55860b();
            this.f18999f = null;
        }
    }

    /* renamed from: g */
    public boolean mo55748g() {
        return this.f19001h;
    }

    public String getAdSessionId() {
        return this.f19002i;
    }

    public AdSessionStatePublisher getAdSessionStatePublisher() {
        return this.f18999f;
    }

    /* renamed from: h */
    public boolean mo55749h() {
        return this.f18996c.isNativeImpressionOwner();
    }

    /* renamed from: i */
    public boolean mo55750i() {
        return this.f18996c.isNativeMediaEventsOwner();
    }

    public void registerAdView(View view) {
        if (!this.f19001h) {
            C8010e.m22850a((Object) view, "AdView is null");
            if (mo55745d() != view) {
                m22733c(view);
                getAdSessionStatePublisher().mo55869i();
                m22734d(view);
            }
        }
    }

    public void removeAllFriendlyObstructions() {
        if (!this.f19001h) {
            this.f18997d.clear();
        }
    }

    public void removeFriendlyObstruction(View view) {
        if (!this.f19001h) {
            m22732b(view);
            C7994c a = m22730a(view);
            if (a != null) {
                this.f18997d.remove(a);
            }
        }
    }

    public void start() {
        if (!this.f19000g) {
            this.f19000g = true;
            C7990a.m22755a().mo55802b(this);
            this.f18999f.mo55847a(C7998f.m22798a().mo55839d());
            this.f18999f.mo55852a(this, this.f18995b);
        }
    }
}

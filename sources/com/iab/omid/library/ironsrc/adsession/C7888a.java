package com.iab.omid.library.ironsrc.adsession;

import android.view.View;
import com.iab.omid.library.ironsrc.p257b.C7890a;
import com.iab.omid.library.ironsrc.p257b.C7893c;
import com.iab.omid.library.ironsrc.p257b.C7897f;
import com.iab.omid.library.ironsrc.p259d.C7909e;
import com.iab.omid.library.ironsrc.p260e.C7911a;
import com.iab.omid.library.ironsrc.publisher.AdSessionStatePublisher;
import com.iab.omid.library.ironsrc.publisher.C7914a;
import com.iab.omid.library.ironsrc.publisher.C7915b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.UUID;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.ironsrc.adsession.a */
public class C7888a extends AdSession {

    /* renamed from: a */
    private static final Pattern f18763a = Pattern.compile("^[a-zA-Z0-9 ]+$");

    /* renamed from: b */
    private final AdSessionContext f18764b;

    /* renamed from: c */
    private final AdSessionConfiguration f18765c;

    /* renamed from: d */
    private final List<C7893c> f18766d = new ArrayList();

    /* renamed from: e */
    private C7911a f18767e;

    /* renamed from: f */
    private AdSessionStatePublisher f18768f;

    /* renamed from: g */
    private boolean f18769g = false;

    /* renamed from: h */
    private boolean f18770h = false;

    /* renamed from: i */
    private String f18771i;

    /* renamed from: j */
    private boolean f18772j;

    /* renamed from: k */
    private boolean f18773k;

    C7888a(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext) {
        this.f18765c = adSessionConfiguration;
        this.f18764b = adSessionContext;
        this.f18771i = UUID.randomUUID().toString();
        m22282c((View) null);
        this.f18768f = (adSessionContext.getAdSessionContextType() == AdSessionContextType.HTML || adSessionContext.getAdSessionContextType() == AdSessionContextType.JAVASCRIPT) ? new C7914a(adSessionContext.getWebView()) : new C7915b(adSessionContext.getInjectedResourcesMap(), adSessionContext.getOmidJsScriptContent());
        this.f18768f.mo55433a();
        C7890a.m22302a().mo55389a(this);
        this.f18768f.mo55437a(adSessionConfiguration);
    }

    /* renamed from: a */
    private C7893c m22279a(View view) {
        for (C7893c next : this.f18766d) {
            if (next.mo55400a().get() == view) {
                return next;
            }
        }
        return null;
    }

    /* renamed from: a */
    private void m22280a(String str) {
        if (str == null) {
            return;
        }
        if (str.length() > 50 || !f18763a.matcher(str).matches()) {
            throw new IllegalArgumentException("FriendlyObstruction has improperly formatted detailed reason");
        }
    }

    /* renamed from: b */
    private void m22281b(View view) {
        if (view == null) {
            throw new IllegalArgumentException("FriendlyObstruction is null");
        }
    }

    /* renamed from: c */
    private void m22282c(View view) {
        this.f18767e = new C7911a(view);
    }

    /* renamed from: d */
    private void m22283d(View view) {
        Collection<C7888a> b = C7890a.m22302a().mo55390b();
        if (b != null && b.size() > 0) {
            for (C7888a next : b) {
                if (next != this && next.mo55358d() == view) {
                    next.f18767e.clear();
                }
            }
        }
    }

    /* renamed from: j */
    private void m22284j() {
        if (this.f18772j) {
            throw new IllegalStateException("Impression event can only be sent once");
        }
    }

    /* renamed from: k */
    private void m22285k() {
        if (this.f18773k) {
            throw new IllegalStateException("Loaded event can only be sent once");
        }
    }

    /* renamed from: a */
    public List<C7893c> mo55354a() {
        return this.f18766d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo55355a(JSONObject jSONObject) {
        m22285k();
        getAdSessionStatePublisher().mo55445a(jSONObject);
        this.f18773k = true;
    }

    public void addFriendlyObstruction(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, String str) {
        if (!this.f18770h) {
            m22281b(view);
            m22280a(str);
            if (m22279a(view) == null) {
                this.f18766d.add(new C7893c(view, friendlyObstructionPurpose, str));
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo55356b() {
        m22284j();
        getAdSessionStatePublisher().mo55453g();
        this.f18772j = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo55357c() {
        m22285k();
        getAdSessionStatePublisher().mo55455h();
        this.f18773k = true;
    }

    /* renamed from: d */
    public View mo55358d() {
        return (View) this.f18767e.get();
    }

    /* renamed from: e */
    public boolean mo55359e() {
        return this.f18769g && !this.f18770h;
    }

    public void error(ErrorType errorType, String str) {
        if (!this.f18770h) {
            C7909e.m22391a((Object) errorType, "Error type is null");
            C7909e.m22393a(str, "Message is null");
            getAdSessionStatePublisher().mo55438a(errorType, str);
            return;
        }
        throw new IllegalStateException("AdSession is finished");
    }

    /* renamed from: f */
    public boolean mo55360f() {
        return this.f18769g;
    }

    public void finish() {
        if (!this.f18770h) {
            this.f18767e.clear();
            removeAllFriendlyObstructions();
            this.f18770h = true;
            getAdSessionStatePublisher().mo55452f();
            C7890a.m22302a().mo55393c(this);
            getAdSessionStatePublisher().mo55447b();
            this.f18768f = null;
        }
    }

    /* renamed from: g */
    public boolean mo55361g() {
        return this.f18770h;
    }

    public String getAdSessionId() {
        return this.f18771i;
    }

    public AdSessionStatePublisher getAdSessionStatePublisher() {
        return this.f18768f;
    }

    /* renamed from: h */
    public boolean mo55362h() {
        return this.f18765c.isNativeImpressionOwner();
    }

    /* renamed from: i */
    public boolean mo55363i() {
        return this.f18765c.isNativeMediaEventsOwner();
    }

    public void registerAdView(View view) {
        if (!this.f18770h) {
            C7909e.m22391a((Object) view, "AdView is null");
            if (mo55358d() != view) {
                m22282c(view);
                getAdSessionStatePublisher().mo55456i();
                m22283d(view);
            }
        }
    }

    public void removeAllFriendlyObstructions() {
        if (!this.f18770h) {
            this.f18766d.clear();
        }
    }

    public void removeFriendlyObstruction(View view) {
        if (!this.f18770h) {
            m22281b(view);
            C7893c a = m22279a(view);
            if (a != null) {
                this.f18766d.remove(a);
            }
        }
    }

    public void start() {
        if (!this.f18769g) {
            this.f18769g = true;
            C7890a.m22302a().mo55391b(this);
            this.f18768f.mo55434a(C7897f.m22340a().mo55426d());
            this.f18768f.mo55439a(this, this.f18764b);
        }
    }
}

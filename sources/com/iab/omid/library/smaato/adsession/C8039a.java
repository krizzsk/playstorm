package com.iab.omid.library.smaato.adsession;

import android.view.View;
import com.iab.omid.library.smaato.p275b.C8041a;
import com.iab.omid.library.smaato.p275b.C8044c;
import com.iab.omid.library.smaato.p275b.C8048f;
import com.iab.omid.library.smaato.p277d.C8060e;
import com.iab.omid.library.smaato.p278e.C8062a;
import com.iab.omid.library.smaato.publisher.AdSessionStatePublisher;
import com.iab.omid.library.smaato.publisher.C8065a;
import com.iab.omid.library.smaato.publisher.C8066b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.UUID;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.smaato.adsession.a */
public class C8039a extends AdSession {

    /* renamed from: a */
    private static final Pattern f19115a = Pattern.compile("^[a-zA-Z0-9 ]+$");

    /* renamed from: b */
    private final AdSessionContext f19116b;

    /* renamed from: c */
    private final AdSessionConfiguration f19117c;

    /* renamed from: d */
    private final List<C8044c> f19118d = new ArrayList();

    /* renamed from: e */
    private C8062a f19119e;

    /* renamed from: f */
    private AdSessionStatePublisher f19120f;

    /* renamed from: g */
    private boolean f19121g = false;

    /* renamed from: h */
    private boolean f19122h = false;

    /* renamed from: i */
    private final String f19123i;

    /* renamed from: j */
    private boolean f19124j;

    /* renamed from: k */
    private boolean f19125k;

    C8039a(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext) {
        this.f19117c = adSessionConfiguration;
        this.f19116b = adSessionContext;
        this.f19123i = UUID.randomUUID().toString();
        m22962c((View) null);
        this.f19120f = (adSessionContext.getAdSessionContextType() == AdSessionContextType.HTML || adSessionContext.getAdSessionContextType() == AdSessionContextType.JAVASCRIPT) ? new C8065a(adSessionContext.getWebView()) : new C8066b(adSessionContext.getInjectedResourcesMap(), adSessionContext.getOmidJsScriptContent());
        this.f19120f.mo56040a();
        C8041a.m22982a().mo55988a(this);
        this.f19120f.mo56044a(adSessionConfiguration);
    }

    /* renamed from: a */
    private C8044c m22959a(View view) {
        for (C8044c next : this.f19118d) {
            if (next.mo56007a().get() == view) {
                return next;
            }
        }
        return null;
    }

    /* renamed from: a */
    private void m22960a(String str) {
        if (str == null) {
            return;
        }
        if (str.length() > 50 || !f19115a.matcher(str).matches()) {
            throw new IllegalArgumentException("FriendlyObstruction has improperly formatted detailed reason");
        }
    }

    /* renamed from: b */
    private static void m22961b(View view) {
        if (view == null) {
            throw new IllegalArgumentException("FriendlyObstruction is null");
        }
    }

    /* renamed from: c */
    private void m22962c(View view) {
        this.f19119e = new C8062a(view);
    }

    /* renamed from: d */
    private void m22963d(View view) {
        Collection<C8039a> b = C8041a.m22982a().mo55989b();
        if (b != null && !b.isEmpty()) {
            for (C8039a next : b) {
                if (next != this && next.mo55957d() == view) {
                    next.f19119e.clear();
                }
            }
        }
    }

    /* renamed from: j */
    private void m22964j() {
        if (this.f19124j) {
            throw new IllegalStateException("Impression event can only be sent once");
        }
    }

    /* renamed from: k */
    private void m22965k() {
        if (this.f19125k) {
            throw new IllegalStateException("Loaded event can only be sent once");
        }
    }

    /* renamed from: a */
    public List<C8044c> mo55953a() {
        return this.f19118d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo55954a(JSONObject jSONObject) {
        m22965k();
        getAdSessionStatePublisher().mo56052a(jSONObject);
        this.f19125k = true;
    }

    public void addFriendlyObstruction(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, String str) {
        if (!this.f19122h) {
            m22961b(view);
            m22960a(str);
            if (m22959a(view) == null) {
                this.f19118d.add(new C8044c(view, friendlyObstructionPurpose, str));
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo55955b() {
        m22964j();
        getAdSessionStatePublisher().mo56060g();
        this.f19124j = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo55956c() {
        m22965k();
        getAdSessionStatePublisher().mo56062h();
        this.f19125k = true;
    }

    /* renamed from: d */
    public View mo55957d() {
        return (View) this.f19119e.get();
    }

    /* renamed from: e */
    public boolean mo55958e() {
        return this.f19121g && !this.f19122h;
    }

    public void error(ErrorType errorType, String str) {
        if (!this.f19122h) {
            C8060e.m23074a((Object) errorType, "Error type is null");
            C8060e.m23076a(str, "Message is null");
            getAdSessionStatePublisher().mo56045a(errorType, str);
            return;
        }
        throw new IllegalStateException("AdSession is finished");
    }

    /* renamed from: f */
    public boolean mo55959f() {
        return this.f19121g;
    }

    public void finish() {
        if (!this.f19122h) {
            this.f19119e.clear();
            removeAllFriendlyObstructions();
            this.f19122h = true;
            getAdSessionStatePublisher().mo56059f();
            C8041a.m22982a().mo55992c(this);
            getAdSessionStatePublisher().mo56054b();
            this.f19120f = null;
        }
    }

    /* renamed from: g */
    public boolean mo55960g() {
        return this.f19122h;
    }

    public String getAdSessionId() {
        return this.f19123i;
    }

    public AdSessionStatePublisher getAdSessionStatePublisher() {
        return this.f19120f;
    }

    /* renamed from: h */
    public boolean mo55961h() {
        return this.f19117c.isNativeImpressionOwner();
    }

    /* renamed from: i */
    public boolean mo55962i() {
        return this.f19117c.isNativeMediaEventsOwner();
    }

    public void registerAdView(View view) {
        if (!this.f19122h) {
            C8060e.m23074a((Object) view, "AdView is null");
            if (mo55957d() != view) {
                m22962c(view);
                getAdSessionStatePublisher().mo56063i();
                m22963d(view);
            }
        }
    }

    public void removeAllFriendlyObstructions() {
        if (!this.f19122h) {
            this.f19118d.clear();
        }
    }

    public void removeFriendlyObstruction(View view) {
        if (!this.f19122h) {
            m22961b(view);
            C8044c a = m22959a(view);
            if (a != null) {
                this.f19118d.remove(a);
            }
        }
    }

    public void start() {
        if (!this.f19121g) {
            this.f19121g = true;
            C8041a.m22982a().mo55990b(this);
            this.f19120f.mo56041a(C8048f.m23022a().mo56033d());
            this.f19120f.mo56046a(this, this.f19116b);
        }
    }
}

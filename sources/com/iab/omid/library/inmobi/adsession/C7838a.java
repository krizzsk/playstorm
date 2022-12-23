package com.iab.omid.library.inmobi.adsession;

import android.view.View;
import com.iab.omid.library.inmobi.p251b.C7840a;
import com.iab.omid.library.inmobi.p251b.C7843c;
import com.iab.omid.library.inmobi.p251b.C7847f;
import com.iab.omid.library.inmobi.p253d.C7859e;
import com.iab.omid.library.inmobi.p254e.C7861a;
import com.iab.omid.library.inmobi.publisher.AdSessionStatePublisher;
import com.iab.omid.library.inmobi.publisher.C7864a;
import com.iab.omid.library.inmobi.publisher.C7865b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.UUID;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.inmobi.adsession.a */
public class C7838a extends AdSession {

    /* renamed from: a */
    private static final Pattern f18650a = Pattern.compile("^[a-zA-Z0-9 ]+$");

    /* renamed from: b */
    private final AdSessionContext f18651b;

    /* renamed from: c */
    private final AdSessionConfiguration f18652c;

    /* renamed from: d */
    private final List<C7843c> f18653d = new ArrayList();

    /* renamed from: e */
    private C7861a f18654e;

    /* renamed from: f */
    private AdSessionStatePublisher f18655f;

    /* renamed from: g */
    private boolean f18656g = false;

    /* renamed from: h */
    private boolean f18657h = false;

    /* renamed from: i */
    private final String f18658i;

    /* renamed from: j */
    private boolean f18659j;

    /* renamed from: k */
    private boolean f18660k;

    C7838a(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext) {
        this.f18652c = adSessionConfiguration;
        this.f18651b = adSessionContext;
        this.f18658i = UUID.randomUUID().toString();
        m22058c((View) null);
        this.f18655f = (adSessionContext.getAdSessionContextType() == AdSessionContextType.HTML || adSessionContext.getAdSessionContextType() == AdSessionContextType.JAVASCRIPT) ? new C7864a(adSessionContext.getWebView()) : new C7865b(adSessionContext.getInjectedResourcesMap(), adSessionContext.getOmidJsScriptContent());
        this.f18655f.mo55247a();
        C7840a.m22078a().mo55195a(this);
        this.f18655f.mo55251a(adSessionConfiguration);
    }

    /* renamed from: a */
    private C7843c m22055a(View view) {
        for (C7843c next : this.f18653d) {
            if (next.mo55214a().get() == view) {
                return next;
            }
        }
        return null;
    }

    /* renamed from: a */
    private void m22056a(String str) {
        if (str == null) {
            return;
        }
        if (str.length() > 50 || !f18650a.matcher(str).matches()) {
            throw new IllegalArgumentException("FriendlyObstruction has improperly formatted detailed reason");
        }
    }

    /* renamed from: b */
    private static void m22057b(View view) {
        if (view == null) {
            throw new IllegalArgumentException("FriendlyObstruction is null");
        }
    }

    /* renamed from: c */
    private void m22058c(View view) {
        this.f18654e = new C7861a(view);
    }

    /* renamed from: d */
    private void m22059d(View view) {
        Collection<C7838a> b = C7840a.m22078a().mo55196b();
        if (b != null && !b.isEmpty()) {
            for (C7838a next : b) {
                if (next != this && next.mo55164d() == view) {
                    next.f18654e.clear();
                }
            }
        }
    }

    /* renamed from: j */
    private void m22060j() {
        if (this.f18659j) {
            throw new IllegalStateException("Impression event can only be sent once");
        }
    }

    /* renamed from: k */
    private void m22061k() {
        if (this.f18660k) {
            throw new IllegalStateException("Loaded event can only be sent once");
        }
    }

    /* renamed from: a */
    public List<C7843c> mo55160a() {
        return this.f18653d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo55161a(JSONObject jSONObject) {
        m22061k();
        getAdSessionStatePublisher().mo55259a(jSONObject);
        this.f18660k = true;
    }

    public void addFriendlyObstruction(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, String str) {
        if (!this.f18657h) {
            m22057b(view);
            m22056a(str);
            if (m22055a(view) == null) {
                this.f18653d.add(new C7843c(view, friendlyObstructionPurpose, str));
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo55162b() {
        m22060j();
        getAdSessionStatePublisher().mo55267g();
        this.f18659j = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo55163c() {
        m22061k();
        getAdSessionStatePublisher().mo55269h();
        this.f18660k = true;
    }

    /* renamed from: d */
    public View mo55164d() {
        return (View) this.f18654e.get();
    }

    /* renamed from: e */
    public boolean mo55165e() {
        return this.f18656g && !this.f18657h;
    }

    public void error(ErrorType errorType, String str) {
        if (!this.f18657h) {
            C7859e.m22170a((Object) errorType, "Error type is null");
            C7859e.m22172a(str, "Message is null");
            getAdSessionStatePublisher().mo55252a(errorType, str);
            return;
        }
        throw new IllegalStateException("AdSession is finished");
    }

    /* renamed from: f */
    public boolean mo55166f() {
        return this.f18656g;
    }

    public void finish() {
        if (!this.f18657h) {
            this.f18654e.clear();
            removeAllFriendlyObstructions();
            this.f18657h = true;
            getAdSessionStatePublisher().mo55266f();
            C7840a.m22078a().mo55199c(this);
            getAdSessionStatePublisher().mo55261b();
            this.f18655f = null;
        }
    }

    /* renamed from: g */
    public boolean mo55167g() {
        return this.f18657h;
    }

    public String getAdSessionId() {
        return this.f18658i;
    }

    public AdSessionStatePublisher getAdSessionStatePublisher() {
        return this.f18655f;
    }

    /* renamed from: h */
    public boolean mo55168h() {
        return this.f18652c.isNativeImpressionOwner();
    }

    /* renamed from: i */
    public boolean mo55169i() {
        return this.f18652c.isNativeMediaEventsOwner();
    }

    public void registerAdView(View view) {
        if (!this.f18657h) {
            C7859e.m22170a((Object) view, "AdView is null");
            if (mo55164d() != view) {
                m22058c(view);
                getAdSessionStatePublisher().mo55270i();
                m22059d(view);
            }
        }
    }

    public void removeAllFriendlyObstructions() {
        if (!this.f18657h) {
            this.f18653d.clear();
        }
    }

    public void removeFriendlyObstruction(View view) {
        if (!this.f18657h) {
            m22057b(view);
            C7843c a = m22055a(view);
            if (a != null) {
                this.f18653d.remove(a);
            }
        }
    }

    public void start() {
        if (!this.f18656g) {
            this.f18656g = true;
            C7840a.m22078a().mo55197b(this);
            this.f18655f.mo55248a(C7847f.m22118a().mo55240d());
            this.f18655f.mo55253a(this, this.f18651b);
        }
    }
}

package com.iab.omid.library.mmadbridge.adsession;

import android.view.View;
import com.iab.omid.library.mmadbridge.p263b.C7940a;
import com.iab.omid.library.mmadbridge.p263b.C7943c;
import com.iab.omid.library.mmadbridge.p263b.C7947f;
import com.iab.omid.library.mmadbridge.p265d.C7959e;
import com.iab.omid.library.mmadbridge.p266e.C7961a;
import com.iab.omid.library.mmadbridge.publisher.AdSessionStatePublisher;
import com.iab.omid.library.mmadbridge.publisher.C7964a;
import com.iab.omid.library.mmadbridge.publisher.C7965b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.UUID;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.mmadbridge.adsession.a */
public class C7938a extends AdSession {

    /* renamed from: a */
    private static final Pattern f18877a = Pattern.compile("^[a-zA-Z0-9 ]+$");

    /* renamed from: b */
    private final AdSessionContext f18878b;

    /* renamed from: c */
    private final AdSessionConfiguration f18879c;

    /* renamed from: d */
    private final List<C7943c> f18880d = new ArrayList();

    /* renamed from: e */
    private C7961a f18881e;

    /* renamed from: f */
    private AdSessionStatePublisher f18882f;

    /* renamed from: g */
    private boolean f18883g = false;

    /* renamed from: h */
    private boolean f18884h = false;

    /* renamed from: i */
    private final String f18885i;

    /* renamed from: j */
    private boolean f18886j;

    /* renamed from: k */
    private boolean f18887k;

    /* renamed from: l */
    private PossibleObstructionListener f18888l;

    C7938a(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext) {
        this.f18879c = adSessionConfiguration;
        this.f18878b = adSessionContext;
        this.f18885i = UUID.randomUUID().toString();
        m22503c((View) null);
        this.f18882f = (adSessionContext.getAdSessionContextType() == AdSessionContextType.HTML || adSessionContext.getAdSessionContextType() == AdSessionContextType.JAVASCRIPT) ? new C7964a(adSessionContext.getWebView()) : new C7965b(adSessionContext.getInjectedResourcesMap(), adSessionContext.getOmidJsScriptContent());
        this.f18882f.mo55631a();
        C7940a.m22525a().mo55579a(this);
        this.f18882f.mo55635a(adSessionConfiguration);
    }

    /* renamed from: a */
    private C7943c m22500a(View view) {
        for (C7943c next : this.f18880d) {
            if (next.mo55598a().get() == view) {
                return next;
            }
        }
        return null;
    }

    /* renamed from: a */
    private void m22501a(String str) {
        if (str == null) {
            return;
        }
        if (str.length() > 50) {
            throw new IllegalArgumentException("FriendlyObstruction has detailed reason over 50 characters in length");
        } else if (!f18877a.matcher(str).matches()) {
            throw new IllegalArgumentException("FriendlyObstruction has detailed reason that contains characters not in [a-z][A-Z][0-9] or space");
        }
    }

    /* renamed from: b */
    private static void m22502b(View view) {
        if (view == null) {
            throw new IllegalArgumentException("FriendlyObstruction is null");
        }
    }

    /* renamed from: c */
    private void m22503c(View view) {
        this.f18881e = new C7961a(view);
    }

    /* renamed from: d */
    private void m22504d(View view) {
        Collection<C7938a> b = C7940a.m22525a().mo55580b();
        if (b != null && !b.isEmpty()) {
            for (C7938a next : b) {
                if (next != this && next.mo55548e() == view) {
                    next.f18881e.clear();
                }
            }
        }
    }

    /* renamed from: k */
    private void m22505k() {
        if (this.f18886j) {
            throw new IllegalStateException("Impression event can only be sent once");
        }
    }

    /* renamed from: l */
    private void m22506l() {
        if (this.f18887k) {
            throw new IllegalStateException("Loaded event can only be sent once");
        }
    }

    /* renamed from: a */
    public List<C7943c> mo55542a() {
        return this.f18880d;
    }

    /* renamed from: a */
    public void mo55543a(List<C7961a> list) {
        if (mo55545b()) {
            ArrayList arrayList = new ArrayList();
            for (C7961a aVar : list) {
                View view = (View) aVar.get();
                if (view != null) {
                    arrayList.add(view);
                }
            }
            this.f18888l.onPossibleObstructionsDetected(this.f18885i, arrayList);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo55544a(JSONObject jSONObject) {
        m22506l();
        getAdSessionStatePublisher().mo55643a(jSONObject);
        this.f18887k = true;
    }

    public void addFriendlyObstruction(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, String str) {
        if (!this.f18884h) {
            m22502b(view);
            m22501a(str);
            if (m22500a(view) == null) {
                this.f18880d.add(new C7943c(view, friendlyObstructionPurpose, str));
            }
        }
    }

    /* renamed from: b */
    public boolean mo55545b() {
        return this.f18888l != null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo55546c() {
        m22505k();
        getAdSessionStatePublisher().mo55651g();
        this.f18886j = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo55547d() {
        m22506l();
        getAdSessionStatePublisher().mo55653h();
        this.f18887k = true;
    }

    /* renamed from: e */
    public View mo55548e() {
        return (View) this.f18881e.get();
    }

    public void error(ErrorType errorType, String str) {
        if (!this.f18884h) {
            C7959e.m22619a((Object) errorType, "Error type is null");
            C7959e.m22621a(str, "Message is null");
            getAdSessionStatePublisher().mo55636a(errorType, str);
            return;
        }
        throw new IllegalStateException("AdSession is finished");
    }

    /* renamed from: f */
    public boolean mo55549f() {
        return this.f18883g && !this.f18884h;
    }

    public void finish() {
        if (!this.f18884h) {
            this.f18881e.clear();
            removeAllFriendlyObstructions();
            this.f18884h = true;
            getAdSessionStatePublisher().mo55650f();
            C7940a.m22525a().mo55583c(this);
            getAdSessionStatePublisher().mo55645b();
            this.f18882f = null;
            this.f18888l = null;
        }
    }

    /* renamed from: g */
    public boolean mo55550g() {
        return this.f18883g;
    }

    public String getAdSessionId() {
        return this.f18885i;
    }

    public AdSessionStatePublisher getAdSessionStatePublisher() {
        return this.f18882f;
    }

    /* renamed from: h */
    public boolean mo55551h() {
        return this.f18884h;
    }

    /* renamed from: i */
    public boolean mo55552i() {
        return this.f18879c.isNativeImpressionOwner();
    }

    /* renamed from: j */
    public boolean mo55553j() {
        return this.f18879c.isNativeMediaEventsOwner();
    }

    public void registerAdView(View view) {
        if (!this.f18884h) {
            C7959e.m22619a((Object) view, "AdView is null");
            if (mo55548e() != view) {
                m22503c(view);
                getAdSessionStatePublisher().mo55654i();
                m22504d(view);
            }
        }
    }

    public void removeAllFriendlyObstructions() {
        if (!this.f18884h) {
            this.f18880d.clear();
        }
    }

    public void removeFriendlyObstruction(View view) {
        if (!this.f18884h) {
            m22502b(view);
            C7943c a = m22500a(view);
            if (a != null) {
                this.f18880d.remove(a);
            }
        }
    }

    public void setPossibleObstructionListener(PossibleObstructionListener possibleObstructionListener) {
        this.f18888l = possibleObstructionListener;
    }

    public void start() {
        if (!this.f18883g) {
            this.f18883g = true;
            C7940a.m22525a().mo55581b(this);
            this.f18882f.mo55632a(C7947f.m22565a().mo55624d());
            this.f18882f.mo55637a(this, this.f18878b);
        }
    }
}

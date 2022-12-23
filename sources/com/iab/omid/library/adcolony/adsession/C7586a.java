package com.iab.omid.library.adcolony.adsession;

import android.view.View;
import com.iab.omid.library.adcolony.p221b.C7588a;
import com.iab.omid.library.adcolony.p221b.C7591c;
import com.iab.omid.library.adcolony.p221b.C7595f;
import com.iab.omid.library.adcolony.p223d.C7607e;
import com.iab.omid.library.adcolony.p224e.C7609a;
import com.iab.omid.library.adcolony.publisher.AdSessionStatePublisher;
import com.iab.omid.library.adcolony.publisher.C7612a;
import com.iab.omid.library.adcolony.publisher.C7613b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.UUID;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.adcolony.adsession.a */
public class C7586a extends AdSession {

    /* renamed from: a */
    private static final Pattern f18069a = Pattern.compile("^[a-zA-Z0-9 ]+$");

    /* renamed from: b */
    private final AdSessionContext f18070b;

    /* renamed from: c */
    private final AdSessionConfiguration f18071c;

    /* renamed from: d */
    private final List<C7591c> f18072d = new ArrayList();

    /* renamed from: e */
    private C7609a f18073e;

    /* renamed from: f */
    private AdSessionStatePublisher f18074f;

    /* renamed from: g */
    private boolean f18075g = false;

    /* renamed from: h */
    private boolean f18076h = false;

    /* renamed from: i */
    private final String f18077i;

    /* renamed from: j */
    private boolean f18078j;

    /* renamed from: k */
    private boolean f18079k;

    /* renamed from: l */
    private PossibleObstructionListener f18080l;

    C7586a(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext) {
        this.f18071c = adSessionConfiguration;
        this.f18070b = adSessionContext;
        this.f18077i = UUID.randomUUID().toString();
        m20914c((View) null);
        this.f18074f = (adSessionContext.getAdSessionContextType() == AdSessionContextType.HTML || adSessionContext.getAdSessionContextType() == AdSessionContextType.JAVASCRIPT) ? new C7612a(adSessionContext.getWebView()) : new C7613b(adSessionContext.getInjectedResourcesMap(), adSessionContext.getOmidJsScriptContent());
        this.f18074f.mo54261a();
        C7588a.m20936a().mo54209a(this);
        this.f18074f.mo54265a(adSessionConfiguration);
    }

    /* renamed from: a */
    private C7591c m20911a(View view) {
        for (C7591c next : this.f18072d) {
            if (next.mo54228a().get() == view) {
                return next;
            }
        }
        return null;
    }

    /* renamed from: a */
    private void m20912a(String str) {
        if (str == null) {
            return;
        }
        if (str.length() > 50) {
            throw new IllegalArgumentException("FriendlyObstruction has detailed reason over 50 characters in length");
        } else if (!f18069a.matcher(str).matches()) {
            throw new IllegalArgumentException("FriendlyObstruction has detailed reason that contains characters not in [a-z][A-Z][0-9] or space");
        }
    }

    /* renamed from: b */
    private static void m20913b(View view) {
        if (view == null) {
            throw new IllegalArgumentException("FriendlyObstruction is null");
        }
    }

    /* renamed from: c */
    private void m20914c(View view) {
        this.f18073e = new C7609a(view);
    }

    /* renamed from: d */
    private void m20915d(View view) {
        Collection<C7586a> b = C7588a.m20936a().mo54210b();
        if (b != null && !b.isEmpty()) {
            for (C7586a next : b) {
                if (next != this && next.mo54178e() == view) {
                    next.f18073e.clear();
                }
            }
        }
    }

    /* renamed from: k */
    private void m20916k() {
        if (this.f18078j) {
            throw new IllegalStateException("Impression event can only be sent once");
        }
    }

    /* renamed from: l */
    private void m20917l() {
        if (this.f18079k) {
            throw new IllegalStateException("Loaded event can only be sent once");
        }
    }

    /* renamed from: a */
    public List<C7591c> mo54172a() {
        return this.f18072d;
    }

    /* renamed from: a */
    public void mo54173a(List<C7609a> list) {
        if (mo54175b()) {
            ArrayList arrayList = new ArrayList();
            for (C7609a aVar : list) {
                View view = (View) aVar.get();
                if (view != null) {
                    arrayList.add(view);
                }
            }
            this.f18080l.onPossibleObstructionsDetected(this.f18077i, arrayList);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo54174a(JSONObject jSONObject) {
        m20917l();
        getAdSessionStatePublisher().mo54273a(jSONObject);
        this.f18079k = true;
    }

    public void addFriendlyObstruction(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, String str) {
        if (!this.f18076h) {
            m20913b(view);
            m20912a(str);
            if (m20911a(view) == null) {
                this.f18072d.add(new C7591c(view, friendlyObstructionPurpose, str));
            }
        }
    }

    /* renamed from: b */
    public boolean mo54175b() {
        return this.f18080l != null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo54176c() {
        m20916k();
        getAdSessionStatePublisher().mo54281g();
        this.f18078j = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo54177d() {
        m20917l();
        getAdSessionStatePublisher().mo54283h();
        this.f18079k = true;
    }

    /* renamed from: e */
    public View mo54178e() {
        return (View) this.f18073e.get();
    }

    public void error(ErrorType errorType, String str) {
        if (!this.f18076h) {
            C7607e.m21030a((Object) errorType, "Error type is null");
            C7607e.m21032a(str, "Message is null");
            getAdSessionStatePublisher().mo54266a(errorType, str);
            return;
        }
        throw new IllegalStateException("AdSession is finished");
    }

    /* renamed from: f */
    public boolean mo54179f() {
        return this.f18075g && !this.f18076h;
    }

    public void finish() {
        if (!this.f18076h) {
            this.f18073e.clear();
            removeAllFriendlyObstructions();
            this.f18076h = true;
            getAdSessionStatePublisher().mo54280f();
            C7588a.m20936a().mo54213c(this);
            getAdSessionStatePublisher().mo54275b();
            this.f18074f = null;
            this.f18080l = null;
        }
    }

    /* renamed from: g */
    public boolean mo54180g() {
        return this.f18075g;
    }

    public String getAdSessionId() {
        return this.f18077i;
    }

    public AdSessionStatePublisher getAdSessionStatePublisher() {
        return this.f18074f;
    }

    /* renamed from: h */
    public boolean mo54181h() {
        return this.f18076h;
    }

    /* renamed from: i */
    public boolean mo54182i() {
        return this.f18071c.isNativeImpressionOwner();
    }

    /* renamed from: j */
    public boolean mo54183j() {
        return this.f18071c.isNativeMediaEventsOwner();
    }

    public void registerAdView(View view) {
        if (!this.f18076h) {
            C7607e.m21030a((Object) view, "AdView is null");
            if (mo54178e() != view) {
                m20914c(view);
                getAdSessionStatePublisher().mo54284i();
                m20915d(view);
            }
        }
    }

    public void removeAllFriendlyObstructions() {
        if (!this.f18076h) {
            this.f18072d.clear();
        }
    }

    public void removeFriendlyObstruction(View view) {
        if (!this.f18076h) {
            m20913b(view);
            C7591c a = m20911a(view);
            if (a != null) {
                this.f18072d.remove(a);
            }
        }
    }

    public void setPossibleObstructionListener(PossibleObstructionListener possibleObstructionListener) {
        this.f18080l = possibleObstructionListener;
    }

    public void start() {
        if (!this.f18075g) {
            this.f18075g = true;
            C7588a.m20936a().mo54211b(this);
            this.f18074f.mo54262a(C7595f.m20976a().mo54254d());
            this.f18074f.mo54267a(this, this.f18070b);
        }
    }
}

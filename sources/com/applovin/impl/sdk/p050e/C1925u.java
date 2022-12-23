package com.applovin.impl.sdk.p050e;

import android.text.TextUtils;
import androidx.browser.trusted.sharing.ShareTarget;
import com.applovin.impl.sdk.C1959m;
import com.applovin.impl.sdk.C2092v;
import com.applovin.impl.sdk.network.C1985b;
import com.applovin.impl.sdk.network.C1990c;
import com.applovin.impl.sdk.p048c.C1857b;
import com.applovin.impl.sdk.p050e.C1908o;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinErrorCodes;
import java.util.concurrent.TimeUnit;

/* renamed from: com.applovin.impl.sdk.e.u */
public abstract class C1925u<T> extends C1877a implements C1985b.C1989c<T> {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C1990c<T> f3570a;

    /* renamed from: c */
    private final C1985b.C1989c<T> f3571c;

    /* renamed from: d */
    protected C1985b.C1987a f3572d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public C1908o.C1910a f3573e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public C1857b<String> f3574f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public C1857b<String> f3575g;

    public C1925u(C1990c<T> cVar, C1959m mVar) {
        this(cVar, mVar, false);
    }

    public C1925u(C1990c<T> cVar, final C1959m mVar, boolean z) {
        super("TaskRepeatRequest", mVar, z);
        this.f3573e = C1908o.C1910a.BACKGROUND;
        this.f3574f = null;
        this.f3575g = null;
        if (cVar != null) {
            this.f3570a = cVar;
            this.f3572d = new C1985b.C1987a();
            this.f3571c = new C1985b.C1989c<T>() {
                /* renamed from: a */
                public void mo13362a(int i, String str, T t) {
                    C1857b bVar;
                    C1925u uVar;
                    boolean z = false;
                    boolean z2 = i < 200 || i >= 500;
                    boolean z3 = i == 429;
                    if ((i != -1009) && (z2 || z3 || C1925u.this.f3570a.mo14495m())) {
                        String f = C1925u.this.f3570a.mo14487f();
                        if (C1925u.this.f3570a.mo14489h() > 0) {
                            if (C2092v.m5047a()) {
                                C1925u.this.mo14145c("Unable to send request due to server failure (code " + i + "). " + C1925u.this.f3570a.mo14489h() + " attempts left, retrying in " + TimeUnit.MILLISECONDS.toSeconds((long) C1925u.this.f3570a.mo14493k()) + " seconds...");
                            }
                            int h = C1925u.this.f3570a.mo14489h() - 1;
                            C1925u.this.f3570a.mo14479a(h);
                            if (h == 0) {
                                C1925u uVar2 = C1925u.this;
                                uVar2.m4284c(uVar2.f3574f);
                                if (StringUtils.isValidString(f) && f.length() >= 4) {
                                    if (C2092v.m5047a()) {
                                        C1925u.this.mo14144b("Switching to backup endpoint " + f);
                                    }
                                    C1925u.this.f3570a.mo14480a(f);
                                    z = true;
                                }
                            }
                            long millis = (!((Boolean) mVar.mo14311a(C1857b.f3257dd)).booleanValue() || !z) ? C1925u.this.f3570a.mo14494l() ? TimeUnit.SECONDS.toMillis((long) Math.pow(2.0d, (double) C1925u.this.f3570a.mo14491i())) : (long) C1925u.this.f3570a.mo14493k() : 0;
                            C1908o S = mVar.mo14303S();
                            C1925u uVar3 = C1925u.this;
                            S.mo14207a((C1877a) uVar3, uVar3.f3573e, millis);
                            return;
                        }
                        if (f == null || !f.equals(C1925u.this.f3570a.mo14478a())) {
                            uVar = C1925u.this;
                            bVar = uVar.f3574f;
                        } else {
                            uVar = C1925u.this;
                            bVar = uVar.f3575g;
                        }
                        uVar.m4284c(bVar);
                    }
                    C1925u.this.mo13362a(i, str, t);
                }

                /* renamed from: a */
                public void mo13364a(T t, int i) {
                    C1925u.this.f3570a.mo14479a(0);
                    C1925u.this.mo13364a(t, i);
                }
            };
            return;
        }
        throw new IllegalArgumentException("No request specified");
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public <ST> void m4284c(C1857b<ST> bVar) {
        if (bVar != null) {
            mo14146d().mo14296K().mo14063a((C1857b<?>) bVar, (Object) bVar.mo14058b());
        }
    }

    /* renamed from: a */
    public abstract void mo13362a(int i, String str, T t);

    /* renamed from: a */
    public void mo14230a(C1857b<String> bVar) {
        this.f3574f = bVar;
    }

    /* renamed from: a */
    public void mo14231a(C1908o.C1910a aVar) {
        this.f3573e = aVar;
    }

    /* renamed from: a */
    public abstract void mo13364a(T t, int i);

    /* renamed from: b */
    public void mo14232b(C1857b<String> bVar) {
        this.f3575g = bVar;
    }

    public void run() {
        int i;
        C1985b R = mo14146d().mo14302R();
        if (!mo14146d().mo14350c() && !mo14146d().mo14351d()) {
            if (C2092v.m5047a()) {
                C2092v.m5053i("AppLovinSdk", "AppLovin SDK is disabled");
            }
            i = -22;
        } else if (!StringUtils.isValidString(this.f3570a.mo14478a()) || this.f3570a.mo14478a().length() < 4) {
            if (C2092v.m5047a()) {
                mo14147d("Task has an invalid or null request endpoint.");
            }
            i = AppLovinErrorCodes.INVALID_URL;
        } else {
            if (TextUtils.isEmpty(this.f3570a.mo14481b())) {
                this.f3570a.mo14482b(this.f3570a.mo14485e() != null ? ShareTarget.METHOD_POST : ShareTarget.METHOD_GET);
            }
            R.mo14474a(this.f3570a, this.f3572d, this.f3571c);
            return;
        }
        mo13362a(i, (String) null, (Object) null);
    }
}

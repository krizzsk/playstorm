package com.p374my.target;

import android.content.Context;
import com.p374my.target.C9822l3;
import com.p374my.target.common.MyTargetPrivacy;
import com.p374my.target.mediation.MediationAdConfig;
import com.p374my.target.mediation.MediationAdapter;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;

/* renamed from: com.my.target.z0 */
public abstract class C10063z0<T extends MediationAdapter> {

    /* renamed from: a */
    public final C9596a f25033a;

    /* renamed from: b */
    public final C9822l3.C9823a f25034b;

    /* renamed from: c */
    public final C9839m2 f25035c;

    /* renamed from: d */
    public T f25036d;

    /* renamed from: e */
    public WeakReference<Context> f25037e;

    /* renamed from: f */
    public C10008v8 f25038f;

    /* renamed from: g */
    public C10063z0<T>.b f25039g;

    /* renamed from: h */
    public String f25040h;

    /* renamed from: i */
    public C9822l3 f25041i;

    /* renamed from: j */
    public float f25042j;

    /* renamed from: com.my.target.z0$a */
    public static class C10064a implements MediationAdConfig {

        /* renamed from: a */
        public final String f25043a;

        /* renamed from: b */
        public final String f25044b;

        /* renamed from: c */
        public final int f25045c;

        /* renamed from: d */
        public final int f25046d;

        /* renamed from: e */
        public final Map<String, String> f25047e;

        /* renamed from: f */
        public final MyTargetPrivacy f25048f;

        public C10064a(String str, String str2, Map<String, String> map, int i, int i2, MyTargetPrivacy myTargetPrivacy) {
            this.f25043a = str;
            this.f25044b = str2;
            this.f25047e = map;
            this.f25046d = i;
            this.f25045c = i2;
            this.f25048f = myTargetPrivacy;
        }

        /* renamed from: a */
        public static C10064a m29867a(String str, String str2, Map<String, String> map, int i, int i2, MyTargetPrivacy myTargetPrivacy) {
            return new C10064a(str, str2, map, i, i2, myTargetPrivacy);
        }

        public int getAge() {
            return this.f25046d;
        }

        public int getGender() {
            return this.f25045c;
        }

        public String getPayload() {
            return this.f25044b;
        }

        public String getPlacementId() {
            return this.f25043a;
        }

        public MyTargetPrivacy getPrivacy() {
            return this.f25048f;
        }

        public Map<String, String> getServerParams() {
            return this.f25047e;
        }

        public boolean isUserAgeRestricted() {
            return this.f25048f.userAgeRestricted;
        }

        public boolean isUserConsent() {
            Boolean bool = this.f25048f.userConsent;
            if (bool != null) {
                return bool.booleanValue();
            }
            return true;
        }

        public boolean isUserConsentSpecified() {
            return this.f25048f.userConsent != null;
        }
    }

    /* renamed from: com.my.target.z0$b */
    public final class C10065b implements Runnable {

        /* renamed from: a */
        public final C9858n2 f25049a;

        public C10065b(C9858n2 n2Var) {
            this.f25049a = n2Var;
        }

        public void run() {
            C9672e0.m27882a("MediationEngine: timeout for " + this.f25049a.mo64842b() + " ad network");
            Context l = C10063z0.this.mo65790l();
            if (l != null) {
                C10063z0.this.mo65785a(this.f25049a, "networkTimeout", l);
            }
            C10063z0.this.mo65786a(this.f25049a, false);
        }
    }

    public C10063z0(C9839m2 m2Var, C9596a aVar, C9822l3.C9823a aVar2) {
        this.f25035c = m2Var;
        this.f25033a = aVar;
        this.f25034b = aVar2;
    }

    /* renamed from: a */
    public final T mo65783a(C9858n2 n2Var) {
        return "myTarget".equals(n2Var.mo64842b()) ? mo63418k() : mo65784a(n2Var.mo64836a());
    }

    /* renamed from: a */
    public final T mo65784a(String str) {
        try {
            return (MediationAdapter) Class.forName(str).getConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Throwable th) {
            C9672e0.m27883b("MediationEngine error: " + th.toString());
            return null;
        }
    }

    /* renamed from: a */
    public abstract void mo63411a(T t, C9858n2 n2Var, Context context);

    /* renamed from: a */
    public void mo65785a(C9858n2 n2Var, String str, Context context) {
        C10039x8.m29720c((List<C9626b3>) n2Var.mo64848h().mo63675a(str), context);
    }

    /* renamed from: a */
    public void mo65786a(C9858n2 n2Var, boolean z) {
        C10063z0<T>.b bVar = this.f25039g;
        if (bVar != null && bVar.f25049a == n2Var) {
            Context l = mo65790l();
            C9822l3 l3Var = this.f25041i;
            if (!(l3Var == null || l == null)) {
                l3Var.mo64676b();
                this.f25041i.mo64678b(l);
            }
            C10008v8 v8Var = this.f25038f;
            if (v8Var != null) {
                v8Var.mo65626b(this.f25039g);
                this.f25038f.close();
                this.f25038f = null;
            }
            this.f25039g = null;
            if (z) {
                this.f25040h = n2Var.mo64842b();
                this.f25042j = n2Var.mo64846f();
                if (l != null) {
                    mo65785a(n2Var, "networkFilled", l);
                    return;
                }
                return;
            }
            mo65791m();
        }
    }

    /* renamed from: a */
    public abstract boolean mo63414a(MediationAdapter mediationAdapter);

    /* renamed from: b */
    public void mo65787b(Context context) {
        this.f25037e = new WeakReference<>(context);
        mo65791m();
    }

    /* renamed from: c */
    public String mo65788c() {
        return this.f25040h;
    }

    /* renamed from: d */
    public float mo65789d() {
        return this.f25042j;
    }

    /* renamed from: j */
    public abstract void mo63417j();

    /* renamed from: k */
    public abstract T mo63418k();

    /* renamed from: l */
    public Context mo65790l() {
        WeakReference<Context> weakReference = this.f25037e;
        if (weakReference == null) {
            return null;
        }
        return (Context) weakReference.get();
    }

    /* renamed from: m */
    public final void mo65791m() {
        T t = this.f25036d;
        if (t != null) {
            try {
                t.destroy();
            } catch (Throwable th) {
                C9672e0.m27883b("MediationEngine error: " + th.toString());
            }
            this.f25036d = null;
        }
        Context l = mo65790l();
        if (l == null) {
            C9672e0.m27883b("MediationEngine: can't configure next ad network, context is null");
            return;
        }
        C9858n2 d = this.f25035c.mo64725d();
        if (d == null) {
            C9672e0.m27882a("MediationEngine: no ad networks available");
            mo63417j();
            return;
        }
        C9672e0.m27882a("MediationEngine: prepare adapter for " + d.mo64842b() + " ad network");
        T a = mo65783a(d);
        this.f25036d = a;
        if (a == null || !mo63414a((MediationAdapter) a)) {
            C9672e0.m27883b("MediationEngine: can't create adapter, class " + d.mo64836a() + " not found or invalid");
            mo65785a(d, "networkAdapterInvalid", l);
            mo65791m();
            return;
        }
        C9672e0.m27882a("MediationEngine: adapter created");
        this.f25041i = this.f25034b.mo64680a(d.mo64842b(), d.mo64846f());
        C10008v8 v8Var = this.f25038f;
        if (v8Var != null) {
            v8Var.close();
        }
        int i = d.mo64849i();
        if (i > 0) {
            this.f25039g = new C10065b(d);
            C10008v8 a2 = C10008v8.m29579a(i);
            this.f25038f = a2;
            a2.mo65624a((Runnable) this.f25039g);
        } else {
            this.f25039g = null;
        }
        mo65785a(d, "networkRequested", l);
        mo63411a(this.f25036d, d, l);
    }
}

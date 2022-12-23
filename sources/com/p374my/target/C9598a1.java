package com.p374my.target;

import android.content.Context;
import com.p374my.target.C10063z0;
import com.p374my.target.C9822l3;
import com.p374my.target.C9891p0;
import com.p374my.target.ads.Reward;
import com.p374my.target.common.MyTargetPrivacy;
import com.p374my.target.mediation.MediationAdapter;
import com.p374my.target.mediation.MediationInterstitialAdAdapter;
import com.p374my.target.mediation.MyTargetInterstitialAdAdapter;
import java.util.List;

/* renamed from: com.my.target.a1 */
public class C9598a1 extends C10063z0<MediationInterstitialAdAdapter> implements C9891p0 {

    /* renamed from: k */
    public final C9891p0.C9892a f23608k;

    /* renamed from: l */
    public C9891p0.C9893b f23609l;

    /* renamed from: com.my.target.a1$a */
    public class C9599a implements MediationInterstitialAdAdapter.MediationInterstitialAdListener {

        /* renamed from: a */
        public final C9858n2 f23610a;

        public C9599a(C9858n2 n2Var) {
            this.f23610a = n2Var;
        }

        public void onClick(MediationInterstitialAdAdapter mediationInterstitialAdAdapter) {
            C9598a1 a1Var = C9598a1.this;
            if (a1Var.f25036d == mediationInterstitialAdAdapter) {
                Context l = a1Var.mo65790l();
                if (l != null) {
                    C10039x8.m29720c((List<C9626b3>) this.f23610a.mo64848h().mo63675a("click"), l);
                }
                C9598a1.this.f23608k.onClick();
            }
        }

        public void onDismiss(MediationInterstitialAdAdapter mediationInterstitialAdAdapter) {
            C9598a1 a1Var = C9598a1.this;
            if (a1Var.f25036d == mediationInterstitialAdAdapter) {
                a1Var.f23608k.onDismiss();
            }
        }

        public void onDisplay(MediationInterstitialAdAdapter mediationInterstitialAdAdapter) {
            C9598a1 a1Var = C9598a1.this;
            if (a1Var.f25036d == mediationInterstitialAdAdapter) {
                Context l = a1Var.mo65790l();
                if (l != null) {
                    C10039x8.m29720c((List<C9626b3>) this.f23610a.mo64848h().mo63675a("playbackStarted"), l);
                }
                C9598a1.this.f23608k.onDisplay();
            }
        }

        public void onLoad(MediationInterstitialAdAdapter mediationInterstitialAdAdapter) {
            if (C9598a1.this.f25036d == mediationInterstitialAdAdapter) {
                C9672e0.m27882a("MediationInterstitialAdEngine: data from " + this.f23610a.mo64842b() + " ad network loaded successfully");
                C9598a1.this.mo65786a(this.f23610a, true);
                C9598a1.this.f23608k.onLoad();
            }
        }

        public void onNoAd(String str, MediationInterstitialAdAdapter mediationInterstitialAdAdapter) {
            if (C9598a1.this.f25036d == mediationInterstitialAdAdapter) {
                C9672e0.m27882a("MediationInterstitialAdEngine: no data from " + this.f23610a.mo64842b() + " ad network");
                C9598a1.this.mo65786a(this.f23610a, false);
            }
        }

        public void onVideoCompleted(MediationInterstitialAdAdapter mediationInterstitialAdAdapter) {
            C9598a1 a1Var = C9598a1.this;
            if (a1Var.f25036d == mediationInterstitialAdAdapter) {
                a1Var.f23608k.onVideoCompleted();
                Context l = C9598a1.this.mo65790l();
                if (l != null) {
                    C10039x8.m29720c((List<C9626b3>) this.f23610a.mo64848h().mo63675a("reward"), l);
                }
                C9891p0.C9893b o = C9598a1.this.mo63420o();
                if (o != null) {
                    o.onReward(Reward.getDefault());
                }
            }
        }
    }

    public C9598a1(C9839m2 m2Var, C9596a aVar, C9822l3.C9823a aVar2, C9891p0.C9892a aVar3) {
        super(m2Var, aVar, aVar2);
        this.f23608k = aVar3;
    }

    /* renamed from: a */
    public static C9598a1 m27576a(C9839m2 m2Var, C9596a aVar, C9822l3.C9823a aVar2, C9891p0.C9892a aVar3) {
        return new C9598a1(m2Var, aVar, aVar2, aVar3);
    }

    /* renamed from: a */
    public void mo63410a(Context context) {
        T t = this.f25036d;
        if (t == null) {
            C9672e0.m27883b("MediationInterstitialAdEngine error: can't show ad, adapter is not set");
            return;
        }
        try {
            ((MediationInterstitialAdAdapter) t).show(context);
        } catch (Throwable th) {
            C9672e0.m27883b("MediationInterstitialAdEngine error: " + th.toString());
        }
    }

    /* renamed from: a */
    public void mo63411a(MediationInterstitialAdAdapter mediationInterstitialAdAdapter, C9858n2 n2Var, Context context) {
        C10063z0.C10064a a = C10063z0.C10064a.m29867a(n2Var.mo64845e(), n2Var.mo64844d(), n2Var.mo64843c(), this.f25033a.getCustomParams().getAge(), this.f25033a.getCustomParams().getGender(), MyTargetPrivacy.currentPrivacy());
        if (mediationInterstitialAdAdapter instanceof MyTargetInterstitialAdAdapter) {
            C9916q2 g = n2Var.mo64847g();
            if (g instanceof C9963t2) {
                ((MyTargetInterstitialAdAdapter) mediationInterstitialAdAdapter).setSection((C9963t2) g);
            }
        }
        try {
            mediationInterstitialAdAdapter.load(a, new C9599a(n2Var), context);
        } catch (Throwable th) {
            C9672e0.m27883b("MediationInterstitialAdEngine error: " + th.toString());
        }
    }

    /* renamed from: a */
    public void mo63413a(C9891p0.C9893b bVar) {
        this.f23609l = bVar;
    }

    /* renamed from: a */
    public boolean mo63414a(MediationAdapter mediationAdapter) {
        return mediationAdapter instanceof MediationInterstitialAdAdapter;
    }

    public void destroy() {
        T t = this.f25036d;
        if (t == null) {
            C9672e0.m27883b("MediationInterstitialAdEngine error: can't destroy ad, adapter is not set");
            return;
        }
        try {
            ((MediationInterstitialAdAdapter) t).destroy();
        } catch (Throwable th) {
            C9672e0.m27883b("MediationInterstitialAdEngine error: " + th.toString());
        }
        this.f25036d = null;
    }

    public void dismiss() {
        T t = this.f25036d;
        if (t == null) {
            C9672e0.m27883b("MediationInterstitialAdEngine error: can't dismiss ad, adapter is not set");
            return;
        }
        try {
            ((MediationInterstitialAdAdapter) t).dismiss();
        } catch (Throwable th) {
            C9672e0.m27883b("MediationInterstitialAdEngine error: " + th.toString());
        }
    }

    /* renamed from: j */
    public void mo63417j() {
        this.f23608k.onNoAd("No data for available ad networks");
    }

    /* renamed from: n */
    public MediationInterstitialAdAdapter mo63418k() {
        return new MyTargetInterstitialAdAdapter();
    }

    /* renamed from: o */
    public C9891p0.C9893b mo63420o() {
        return this.f23609l;
    }
}

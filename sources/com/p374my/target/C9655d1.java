package com.p374my.target;

import android.content.Context;
import com.p374my.target.C10063z0;
import com.p374my.target.C9822l3;
import com.p374my.target.C9891p0;
import com.p374my.target.ads.Reward;
import com.p374my.target.common.MyTargetPrivacy;
import com.p374my.target.mediation.MediationAdapter;
import com.p374my.target.mediation.MediationRewardedAdAdapter;
import com.p374my.target.mediation.MyTargetRewardedAdAdapter;
import java.util.List;

/* renamed from: com.my.target.d1 */
public class C9655d1 extends C10063z0<MediationRewardedAdAdapter> implements C9891p0 {

    /* renamed from: k */
    public final C9891p0.C9892a f23746k;

    /* renamed from: l */
    public C9891p0.C9893b f23747l;

    /* renamed from: com.my.target.d1$a */
    public class C9656a implements MediationRewardedAdAdapter.MediationRewardedAdListener {

        /* renamed from: a */
        public final C9858n2 f23748a;

        public C9656a(C9858n2 n2Var) {
            this.f23748a = n2Var;
        }

        public void onClick(MediationRewardedAdAdapter mediationRewardedAdAdapter) {
            C9655d1 d1Var = C9655d1.this;
            if (d1Var.f25036d == mediationRewardedAdAdapter) {
                Context l = d1Var.mo65790l();
                if (l != null) {
                    C10039x8.m29720c((List<C9626b3>) this.f23748a.mo64848h().mo63675a("click"), l);
                }
                C9655d1.this.f23746k.onClick();
            }
        }

        public void onDismiss(MediationRewardedAdAdapter mediationRewardedAdAdapter) {
            C9655d1 d1Var = C9655d1.this;
            if (d1Var.f25036d == mediationRewardedAdAdapter) {
                d1Var.f23746k.onDismiss();
            }
        }

        public void onDisplay(MediationRewardedAdAdapter mediationRewardedAdAdapter) {
            C9655d1 d1Var = C9655d1.this;
            if (d1Var.f25036d == mediationRewardedAdAdapter) {
                Context l = d1Var.mo65790l();
                if (l != null) {
                    C10039x8.m29720c((List<C9626b3>) this.f23748a.mo64848h().mo63675a("playbackStarted"), l);
                }
                C9655d1.this.f23746k.onDisplay();
            }
        }

        public void onLoad(MediationRewardedAdAdapter mediationRewardedAdAdapter) {
            if (C9655d1.this.f25036d == mediationRewardedAdAdapter) {
                C9672e0.m27882a("MediationRewardedAdEngine: data from " + this.f23748a.mo64842b() + " ad network loaded successfully");
                C9655d1.this.mo65786a(this.f23748a, true);
                C9655d1.this.f23746k.onLoad();
            }
        }

        public void onNoAd(String str, MediationRewardedAdAdapter mediationRewardedAdAdapter) {
            if (C9655d1.this.f25036d == mediationRewardedAdAdapter) {
                C9672e0.m27882a("MediationRewardedAdEngine: no data from " + this.f23748a.mo64842b() + " ad network");
                C9655d1.this.mo65786a(this.f23748a, false);
            }
        }

        public void onReward(Reward reward, MediationRewardedAdAdapter mediationRewardedAdAdapter) {
            C9655d1 d1Var = C9655d1.this;
            if (d1Var.f25036d == mediationRewardedAdAdapter) {
                Context l = d1Var.mo65790l();
                if (l != null) {
                    C10039x8.m29720c((List<C9626b3>) this.f23748a.mo64848h().mo63675a("reward"), l);
                }
                C9891p0.C9893b o = C9655d1.this.mo63855o();
                if (o != null) {
                    o.onReward(reward);
                }
            }
        }
    }

    public C9655d1(C9839m2 m2Var, C9596a aVar, C9822l3.C9823a aVar2, C9891p0.C9892a aVar3) {
        super(m2Var, aVar, aVar2);
        this.f23746k = aVar3;
    }

    /* renamed from: a */
    public static C9655d1 m27811a(C9839m2 m2Var, C9596a aVar, C9822l3.C9823a aVar2, C9891p0.C9892a aVar3) {
        return new C9655d1(m2Var, aVar, aVar2, aVar3);
    }

    /* renamed from: a */
    public void mo63410a(Context context) {
        T t = this.f25036d;
        if (t == null) {
            C9672e0.m27883b("MediationRewardedAdEngine error: can't show ad, adapter is not set");
            return;
        }
        try {
            ((MediationRewardedAdAdapter) t).show(context);
        } catch (Throwable th) {
            C9672e0.m27883b("MediationRewardedAdEngine error: " + th.toString());
        }
    }

    /* renamed from: a */
    public void mo63411a(MediationRewardedAdAdapter mediationRewardedAdAdapter, C9858n2 n2Var, Context context) {
        C10063z0.C10064a a = C10063z0.C10064a.m29867a(n2Var.mo64845e(), n2Var.mo64844d(), n2Var.mo64843c(), this.f25033a.getCustomParams().getAge(), this.f25033a.getCustomParams().getGender(), MyTargetPrivacy.currentPrivacy());
        if (mediationRewardedAdAdapter instanceof MyTargetRewardedAdAdapter) {
            C9916q2 g = n2Var.mo64847g();
            if (g instanceof C9963t2) {
                ((MyTargetRewardedAdAdapter) mediationRewardedAdAdapter).setSection((C9963t2) g);
            }
        }
        try {
            mediationRewardedAdAdapter.load(a, new C9656a(n2Var), context);
        } catch (Throwable th) {
            C9672e0.m27883b("MediationRewardedAdEngine error: " + th.toString());
        }
    }

    /* renamed from: a */
    public void mo63413a(C9891p0.C9893b bVar) {
        this.f23747l = bVar;
    }

    /* renamed from: a */
    public boolean mo63414a(MediationAdapter mediationAdapter) {
        return mediationAdapter instanceof MediationRewardedAdAdapter;
    }

    public void destroy() {
        T t = this.f25036d;
        if (t == null) {
            C9672e0.m27883b("MediationRewardedAdEngine error: can't destroy ad, adapter is not set");
            return;
        }
        try {
            ((MediationRewardedAdAdapter) t).destroy();
        } catch (Throwable th) {
            C9672e0.m27883b("MediationRewardedAdEngine error: " + th.toString());
        }
        this.f25036d = null;
    }

    public void dismiss() {
        T t = this.f25036d;
        if (t == null) {
            C9672e0.m27883b("MediationRewardedAdEngine error: can't dismiss ad, adapter is not set");
            return;
        }
        try {
            ((MediationRewardedAdAdapter) t).dismiss();
        } catch (Throwable th) {
            C9672e0.m27883b("MediationRewardedAdEngine error: " + th.toString());
        }
    }

    /* renamed from: j */
    public void mo63417j() {
        this.f23746k.onNoAd("No data for available ad networks");
    }

    /* renamed from: n */
    public MediationRewardedAdAdapter mo63418k() {
        return new MyTargetRewardedAdAdapter();
    }

    /* renamed from: o */
    public C9891p0.C9893b mo63855o() {
        return this.f23747l;
    }
}

package com.p374my.target;

import android.content.Context;
import android.view.View;
import android.widget.RelativeLayout;
import com.p374my.target.C10063z0;
import com.p374my.target.C9822l3;
import com.p374my.target.C9942s0;
import com.p374my.target.ads.MyTargetView;
import com.p374my.target.common.MyTargetPrivacy;
import com.p374my.target.mediation.MediationAdapter;
import com.p374my.target.mediation.MediationStandardAdAdapter;
import com.p374my.target.mediation.MyTargetStandardAdAdapter;
import java.util.List;

/* renamed from: com.my.target.e1 */
public class C9673e1 extends C10063z0<MediationStandardAdAdapter> implements C9942s0 {

    /* renamed from: k */
    public final MyTargetView f23795k;

    /* renamed from: l */
    public C9942s0.C9943a f23796l;

    /* renamed from: com.my.target.e1$a */
    public class C9674a implements MediationStandardAdAdapter.MediationStandardAdListener {

        /* renamed from: a */
        public final C9858n2 f23797a;

        public C9674a(C9858n2 n2Var) {
            this.f23797a = n2Var;
        }

        public void onClick(MediationStandardAdAdapter mediationStandardAdAdapter) {
            C9673e1 e1Var = C9673e1.this;
            if (e1Var.f25036d == mediationStandardAdAdapter) {
                Context l = e1Var.mo65790l();
                if (l != null) {
                    C10039x8.m29720c((List<C9626b3>) this.f23797a.mo64848h().mo63675a("click"), l);
                }
                C9942s0.C9943a aVar = C9673e1.this.f23796l;
                if (aVar != null) {
                    aVar.onClick();
                }
            }
        }

        public void onLoad(View view, MediationStandardAdAdapter mediationStandardAdAdapter) {
            if (C9673e1.this.f25036d == mediationStandardAdAdapter) {
                C9672e0.m27882a("MediationStandardAdEngine: data from " + this.f23797a.mo64842b() + " ad network loaded successfully");
                C9673e1.this.mo65786a(this.f23797a, true);
                C9673e1.this.mo63920a(view);
                C9942s0.C9943a aVar = C9673e1.this.f23796l;
                if (aVar != null) {
                    aVar.onLoad();
                }
            }
        }

        public void onNoAd(String str, MediationStandardAdAdapter mediationStandardAdAdapter) {
            if (C9673e1.this.f25036d == mediationStandardAdAdapter) {
                C9672e0.m27882a("MediationStandardAdEngine: no data from " + this.f23797a.mo64842b() + " ad network");
                C9673e1.this.mo65786a(this.f23797a, false);
            }
        }

        public void onShow(MediationStandardAdAdapter mediationStandardAdAdapter) {
            C9673e1 e1Var = C9673e1.this;
            if (e1Var.f25036d == mediationStandardAdAdapter) {
                Context l = e1Var.mo65790l();
                if (l != null) {
                    C10039x8.m29720c((List<C9626b3>) this.f23797a.mo64848h().mo63675a("playbackStarted"), l);
                }
                C9942s0.C9943a aVar = C9673e1.this.f23796l;
                if (aVar != null) {
                    aVar.mo64513d();
                }
            }
        }
    }

    public C9673e1(MyTargetView myTargetView, C9839m2 m2Var, C9596a aVar, C9822l3.C9823a aVar2) {
        super(m2Var, aVar, aVar2);
        this.f23795k = myTargetView;
    }

    /* renamed from: a */
    public static C9673e1 m27885a(MyTargetView myTargetView, C9839m2 m2Var, C9596a aVar, C9822l3.C9823a aVar2) {
        return new C9673e1(myTargetView, m2Var, aVar, aVar2);
    }

    /* renamed from: a */
    public void mo63919a() {
    }

    /* renamed from: a */
    public void mo63920a(View view) {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(13);
        view.setLayoutParams(layoutParams);
        this.f23795k.removeAllViews();
        this.f23795k.addView(view);
    }

    /* renamed from: a */
    public void mo63921a(MyTargetView.AdSize adSize) {
    }

    /* renamed from: a */
    public void mo63411a(MediationStandardAdAdapter mediationStandardAdAdapter, C9858n2 n2Var, Context context) {
        C10063z0.C10064a a = C10063z0.C10064a.m29867a(n2Var.mo64845e(), n2Var.mo64844d(), n2Var.mo64843c(), this.f25033a.getCustomParams().getAge(), this.f25033a.getCustomParams().getGender(), MyTargetPrivacy.currentPrivacy());
        if (mediationStandardAdAdapter instanceof MyTargetStandardAdAdapter) {
            C9916q2 g = n2Var.mo64847g();
            if (g instanceof C10029x2) {
                ((MyTargetStandardAdAdapter) mediationStandardAdAdapter).setSection((C10029x2) g);
            }
        }
        try {
            mediationStandardAdAdapter.load(a, this.f23795k.getSize(), new C9674a(n2Var), context);
        } catch (Throwable th) {
            C9672e0.m27883b("MediationStandardAdEngine error: " + th.toString());
        }
    }

    /* renamed from: a */
    public void mo63923a(C9942s0.C9943a aVar) {
        this.f23796l = aVar;
    }

    /* renamed from: a */
    public boolean mo63414a(MediationAdapter mediationAdapter) {
        return mediationAdapter instanceof MediationStandardAdAdapter;
    }

    /* renamed from: b */
    public void mo63924b() {
    }

    public void destroy() {
        if (this.f25036d == null) {
            C9672e0.m27883b("MediationStandardAdEngine error: can't destroy ad, adapter is not set");
            return;
        }
        this.f23795k.removeAllViews();
        try {
            ((MediationStandardAdAdapter) this.f25036d).destroy();
        } catch (Throwable th) {
            C9672e0.m27883b("MediationStandardAdEngine error: " + th.toString());
        }
        this.f25036d = null;
    }

    /* renamed from: e */
    public void mo63926e() {
    }

    /* renamed from: f */
    public void mo63927f() {
    }

    /* renamed from: i */
    public void mo63928i() {
        super.mo65787b(this.f23795k.getContext());
    }

    /* renamed from: j */
    public void mo63417j() {
        C9942s0.C9943a aVar = this.f23796l;
        if (aVar != null) {
            aVar.onNoAd("No data for available ad networks");
        }
    }

    /* renamed from: n */
    public MediationStandardAdAdapter mo63418k() {
        return new MyTargetStandardAdAdapter();
    }
}

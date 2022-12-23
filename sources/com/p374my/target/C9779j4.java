package com.p374my.target;

import com.p374my.target.C9784j7;
import com.p374my.target.C9965t4;
import com.tapjoy.TJAdUnitConstants;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.my.target.j4 */
public class C9779j4 {

    /* renamed from: a */
    public final C9606a7 f24130a;

    /* renamed from: b */
    public final ArrayList<C9640c2> f24131b = new ArrayList<>();

    /* renamed from: c */
    public C9965t4.C9968c f24132c;

    /* renamed from: com.my.target.j4$b */
    public class C9781b implements C9784j7.C9786b {
        public C9781b() {
        }

        /* renamed from: a */
        public void mo64470a(C9640c2 c2Var) {
            if (C9779j4.this.f24132c != null) {
                C9779j4.this.f24132c.mo65211a(c2Var, (String) null, C9779j4.this.f24130a.getView().getContext());
            }
        }

        /* renamed from: a */
        public void mo64471a(List<C9640c2> list) {
            for (C9640c2 next : list) {
                if (!C9779j4.this.f24131b.contains(next)) {
                    C9779j4.this.f24131b.add(next);
                    C10039x8.m29720c((List<C9626b3>) next.getStatHolder().mo63675a("playbackStarted"), C9779j4.this.f24130a.getView().getContext());
                    C10039x8.m29720c((List<C9626b3>) next.getStatHolder().mo63675a(TJAdUnitConstants.String.BEACON_SHOW_PATH), C9779j4.this.f24130a.getView().getContext());
                }
            }
        }
    }

    public C9779j4(List<C9640c2> list, C9784j7 j7Var) {
        this.f24130a = j7Var;
        j7Var.setCarouselListener(new C9781b());
        for (int i : j7Var.getNumbersOfCurrentShowingCards()) {
            if (i < list.size() && i >= 0) {
                C9640c2 c2Var = list.get(i);
                this.f24131b.add(c2Var);
                C10039x8.m29720c((List<C9626b3>) c2Var.getStatHolder().mo63675a("playbackStarted"), j7Var.getView().getContext());
            }
        }
    }

    /* renamed from: a */
    public static C9779j4 m28398a(List<C9640c2> list, C9784j7 j7Var) {
        return new C9779j4(list, j7Var);
    }

    /* renamed from: a */
    public void mo64469a(C9965t4.C9968c cVar) {
        this.f24132c = cVar;
    }
}

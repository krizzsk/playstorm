package com.fyber.inneractive.sdk.external;

import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import com.fyber.inneractive.sdk.activities.InneractiveFullscreenAdActivity;
import com.fyber.inneractive.sdk.config.C4262a0;
import com.fyber.inneractive.sdk.config.C4327r;
import com.fyber.inneractive.sdk.config.C4345y;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.factories.C4394a;
import com.fyber.inneractive.sdk.factories.C4400c;
import com.fyber.inneractive.sdk.flow.C4423m;
import com.fyber.inneractive.sdk.flow.C4429p;
import com.fyber.inneractive.sdk.flow.C4438v;
import com.fyber.inneractive.sdk.flow.C4449x;
import com.fyber.inneractive.sdk.interfaces.C4454b;
import com.fyber.inneractive.sdk.interfaces.C4455c;
import com.fyber.inneractive.sdk.util.C5357n;
import com.fyber.inneractive.sdk.util.C5370s;
import com.fyber.inneractive.sdk.util.IAlog;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class InneractiveAdViewUnitController extends C4449x<InneractiveAdViewEventsListener> implements C4423m.C4426c, InneractiveFullscreenAdActivity.FullScreenRendererProvider {
    public static final int DISABLED_REFRESH_INTERVAL = -1;

    /* renamed from: a */
    public Set<InneractiveAdRenderer> f10823a;

    /* renamed from: b */
    public boolean f10824b;

    /* renamed from: c */
    public View f10825c;

    /* renamed from: d */
    public int f10826d;
    public int mAdContentHeight;
    public int mAdContentWidth;

    /* renamed from: com.fyber.inneractive.sdk.external.InneractiveAdViewUnitController$a */
    public class C4390a implements Runnable {
        public C4390a() {
        }

        public void run() {
            InneractiveAdViewUnitController.this.mo24499a();
        }
    }

    public InneractiveAdViewUnitController() {
        this.f10824b = false;
        this.mAdContentWidth = -1;
        this.mAdContentHeight = -1;
        this.f10826d = 0;
        this.f10823a = new HashSet();
    }

    /* renamed from: a */
    public final void mo24499a() {
        this.f10824b = true;
        Iterator it = new HashSet(this.f10823a).iterator();
        while (it.hasNext()) {
            ((InneractiveAdRenderer) it.next()).destroy();
        }
        this.f10823a.clear();
        this.f10825c = null;
        super.destroy();
    }

    public void bindView(ViewGroup viewGroup) {
        C4454b bVar;
        IAlog.m16699a("%sPPPP bindView called with parent: %s", logPrefix(), viewGroup);
        InneractiveAdSpot adSpot = getAdSpot();
        if (adSpot == null) {
            IAlog.m16703e("InneractiveFullscreenUnitController was not attached to an ad spot", new Object[0]);
            return;
        }
        IAlog.m16699a("%sPPPP bindView spot is %s", logPrefix(), adSpot);
        Iterator it = new HashSet(this.f10823a).iterator();
        while (it.hasNext()) {
            InneractiveAdRenderer inneractiveAdRenderer = (InneractiveAdRenderer) it.next();
            if (inneractiveAdRenderer instanceof C4454b) {
                C4454b bVar2 = (C4454b) inneractiveAdRenderer;
                if (bVar2.mo24377a((View) viewGroup)) {
                    bVar2.mo24381n();
                    IAlog.m16699a("%sPPPP bindAdToRenderer returning an already attached renderer %s", logPrefix(), bVar2);
                    return;
                }
            }
        }
        this.f10825c = viewGroup;
        Iterator<C4394a.C4395a> it2 = C4394a.C4396b.f10856a.f10855a.iterator();
        while (true) {
            if (!it2.hasNext()) {
                bVar = null;
                break;
            }
            C4394a.C4395a next = it2.next();
            if (next.mo24391a(adSpot)) {
                bVar = next.mo24392b(adSpot);
                break;
            }
        }
        int i = this.f10826d;
        if (i != 0) {
            bVar.mo24375a(i);
        }
        if (bVar != null) {
            bVar.initialize(adSpot);
            selectContentController();
            bVar.mo24376a(viewGroup);
            this.f10823a.add(bVar);
            IAlog.m16699a("%sPPPP bindView created renderer %s", logPrefix(), bVar);
            return;
        }
        IAlog.m16703e("%sCould not find a renderer for the given spot! Did you add the appropriate module to your project?", logPrefix());
    }

    public boolean canRefreshAd() {
        if (!supportsRefresh()) {
            return false;
        }
        for (InneractiveAdRenderer canRefreshAd : this.f10823a) {
            if (!canRefreshAd.canRefreshAd()) {
                return false;
            }
        }
        return true;
    }

    public void destroy() {
        if (Looper.myLooper() == null || Looper.getMainLooper() != Looper.myLooper()) {
            C5357n.f14225b.post(new C4390a());
        } else {
            mo24499a();
        }
    }

    public int getAdContentHeight() {
        int p;
        for (InneractiveAdRenderer next : this.f10823a) {
            if ((next instanceof C4454b) && (p = ((C4454b) next).mo24382p()) > 0) {
                return p;
            }
        }
        return this.mAdContentHeight;
    }

    public int getAdContentWidth() {
        int f;
        for (InneractiveAdRenderer next : this.f10823a) {
            if ((next instanceof C4454b) && (f = ((C4454b) next).mo24380f()) > 0) {
                return f;
            }
        }
        return this.mAdContentWidth;
    }

    public C4455c getFullscreenRenderer() {
        C4455c a = C4400c.C4402b.f10860a.mo24561a((InneractiveAdSpot) C5370s.m16784a(this.mAdSpot));
        this.f10823a.add(a);
        return a;
    }

    public InneractiveContentController getSelectedContentController() {
        return this.mSelectedContentController;
    }

    public void onAdRefreshFailed(InneractiveAdSpot inneractiveAdSpot, InneractiveErrorCode inneractiveErrorCode) {
        Iterator it = new HashSet(this.f10823a).iterator();
        while (it.hasNext()) {
            InneractiveAdRenderer inneractiveAdRenderer = (InneractiveAdRenderer) it.next();
            if (inneractiveAdRenderer instanceof C4454b) {
                ((C4454b) inneractiveAdRenderer).mo24383q();
                return;
            }
        }
    }

    public void onAdRefreshed(InneractiveAdSpot inneractiveAdSpot) {
        C4454b bVar;
        Iterator it = new HashSet(this.f10823a).iterator();
        while (true) {
            if (!it.hasNext()) {
                bVar = null;
                break;
            }
            InneractiveAdRenderer inneractiveAdRenderer = (InneractiveAdRenderer) it.next();
            if (inneractiveAdRenderer instanceof C4454b) {
                bVar = (C4454b) inneractiveAdRenderer;
                if (bVar.mo24378a(inneractiveAdSpot.getAdContent())) {
                    break;
                }
            }
        }
        if (bVar != null) {
            bVar.mo24376a((ViewGroup) null);
        } else {
            onAdRefreshFailed(inneractiveAdSpot, InneractiveErrorCode.SDK_INTERNAL_ERROR);
        }
        try {
            if (inneractiveAdSpot instanceof C4423m) {
                int i = IAlog.f14137a;
                IAlog.m16697a(1, (Exception) null, "%s %s", "AD_REFRESH", ((C4423m) inneractiveAdSpot).f10939h.f10883g.f11297f.mo24715a());
            }
        } catch (Exception unused) {
        }
        IAlog.m16699a("InneractiveFullscreenUnitController onAdRefreshed called", new Object[0]);
    }

    public void refreshAd() {
        IAlog.m16699a("InneractiveFullscreenUnitController refreshAd called", new Object[0]);
        InneractiveAdSpot inneractiveAdSpot = (InneractiveAdSpot) C5370s.m16784a(this.mAdSpot);
        if (inneractiveAdSpot != null && (inneractiveAdSpot instanceof C4438v)) {
            ((C4438v) inneractiveAdSpot).mo24612a(this);
        }
    }

    public boolean supports(InneractiveAdSpot inneractiveAdSpot) {
        C4345y yVar = (C4345y) inneractiveAdSpot.getAdContent().f10916d;
        if (yVar.f10749e != null) {
            return false;
        }
        C4327r rVar = yVar.f10747c;
        if (rVar != null) {
            if (UnitDisplayType.BANNER.equals(rVar.f10691b) || UnitDisplayType.MRECT.equals(rVar.f10691b)) {
                return true;
            }
            if (UnitDisplayType.INTERSTITIAL.equals(rVar.f10691b)) {
                return !inneractiveAdSpot.getCurrentProcessedRequest().getAllowFullscreen();
            }
        }
        C4262a0 a0Var = yVar.f10750f;
        if (a0Var == null || (!UnitDisplayType.LANDSCAPE.equals(a0Var.f10579j) && !UnitDisplayType.SQUARE.equals(a0Var.f10579j) && !UnitDisplayType.MRECT.equals(a0Var.f10579j))) {
            return false;
        }
        return true;
    }

    public boolean supportsRefresh() {
        return true;
    }

    public void unbindFullscreenRenderer(C4455c cVar) {
        WeakReference<C4429p> weakReference;
        IAlog.m16699a("%sremoving full screen ad renderer %s", logPrefix(), cVar);
        Set<InneractiveAdRenderer> set = this.f10823a;
        if (set != null) {
            set.remove(cVar);
        }
        if (!this.f10824b) {
            Iterator it = new HashSet(this.f10823a).iterator();
            while (it.hasNext()) {
                InneractiveAdRenderer inneractiveAdRenderer = (InneractiveAdRenderer) it.next();
                if (inneractiveAdRenderer instanceof C4454b) {
                    ((C4454b) inneractiveAdRenderer).mo24374a();
                    if (!(this.mEventsListener == null || (weakReference = this.mAdSpot) == null || weakReference.get() == null)) {
                        ((InneractiveAdViewEventsListener) this.mEventsListener).onAdCollapsed((InneractiveAdSpot) this.mAdSpot.get());
                    }
                }
            }
        }
    }

    public void unbindView(View view) {
        if (this.f10825c != view) {
            IAlog.m16703e("%s unbindView invoked with incorrect view, was - %s received - %s", logPrefix(), this.f10825c, view);
        } else {
            this.f10825c = null;
        }
        IAlog.m16699a("%sPPPP unbindView called with %s", logPrefix(), view);
        IAlog.m16699a("%sPPPP spot is %s", logPrefix(), this.mAdSpot);
        Iterator it = new HashSet(this.f10823a).iterator();
        while (it.hasNext()) {
            InneractiveAdRenderer inneractiveAdRenderer = (InneractiveAdRenderer) it.next();
            if (inneractiveAdRenderer instanceof C4454b) {
                C4454b bVar = (C4454b) inneractiveAdRenderer;
                if (bVar.mo24377a(view)) {
                    IAlog.m16699a("%sPPPP unbindView unbinding renderer %s", logPrefix(), inneractiveAdRenderer);
                    bVar.mo24384t();
                    this.f10823a.remove(bVar);
                    return;
                }
            }
        }
    }

    public InneractiveAdViewUnitController(int i) {
        this();
        if (i >= 30) {
            IAlog.m16699a("InneractiveAdViewUnitController: Overriding remote config refresh interval to: %d", Integer.valueOf(i));
            this.f10826d = i;
            return;
        }
        IAlog.m16699a("InneractiveAdViewUnitController: Overriding remote config refresh interval - value too low. Setting to default: %d -> %d", Integer.valueOf(i), 30);
        this.f10826d = 30;
    }

    public InneractiveAdViewUnitController(boolean z) {
        this();
        if (z) {
            this.f10826d = -1;
        }
    }
}

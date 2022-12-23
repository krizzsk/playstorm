package com.fyber.inneractive.sdk.flow;

import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.external.InneractiveContentController;
import com.fyber.inneractive.sdk.external.InneractiveUnitController;
import com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener;
import com.fyber.inneractive.sdk.util.C5370s;
import com.fyber.inneractive.sdk.util.IAlog;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.fyber.inneractive.sdk.flow.x */
public abstract class C4449x<EL extends InneractiveUnitController.EventsListener> implements InneractiveUnitController<EL> {
    public WeakReference<C4429p> mAdSpot;
    public Set<InneractiveContentController> mContentControllers = new HashSet();
    public EL mEventsListener;
    public InneractiveContentController mSelectedContentController;

    public void addContentController(InneractiveContentController inneractiveContentController) {
        this.mContentControllers.add(inneractiveContentController);
    }

    public boolean canRefreshAd() {
        return supportsRefresh();
    }

    public void destroy() {
        for (InneractiveContentController destroy : this.mContentControllers) {
            destroy.destroy();
        }
        this.mContentControllers.clear();
        this.mSelectedContentController = null;
        this.mAdSpot = null;
    }

    public InneractiveAdSpot getAdSpot() {
        return (C4429p) C5370s.m16784a(this.mAdSpot);
    }

    public EL getEventsListener() {
        return this.mEventsListener;
    }

    public InneractiveContentController getSelectedContentController() {
        return this.mSelectedContentController;
    }

    public String logPrefix() {
        return IAlog.m16696a((Object) this);
    }

    public void selectContentController() {
        InneractiveAdSpot inneractiveAdSpot = (InneractiveAdSpot) C5370s.m16784a(this.mAdSpot);
        if (inneractiveAdSpot == null) {
            IAlog.m16703e("selectContentController called, but ad spot is null", new Object[0]);
            return;
        }
        for (InneractiveContentController next : this.mContentControllers) {
            C4430q qVar = (C4430q) next;
            if (qVar.canControl(inneractiveAdSpot)) {
                this.mSelectedContentController = next;
                qVar.setAdSpot(inneractiveAdSpot);
            }
        }
    }

    public void setAdSpot(C4429p pVar) {
        this.mAdSpot = new WeakReference<>(pVar);
    }

    public void setEventsListener(EL el) {
        this.mEventsListener = el;
    }

    public abstract boolean supports(InneractiveAdSpot inneractiveAdSpot);

    public abstract boolean supportsRefresh();
}

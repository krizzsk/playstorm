package com.tapjoy.internal;

import android.content.Context;
import com.tapjoy.TJPlacement;
import com.tapjoy.TJPlacementListener;
import com.tapjoy.TJPlacementManager;
import com.tapjoy.TapjoyConnectCore;
import com.tapjoy.internal.C11660gc;
import com.tapjoy.internal.C11738hu;
import java.util.Observer;

/* renamed from: com.tapjoy.internal.fz */
public final class C11653fz extends C11738hu {

    /* renamed from: b */
    private final C11660gc<C11738hu.C11739a> f28336b = new C11660gc<C11738hu.C11739a>() {
        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final boolean mo72512a() {
            return true;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final /* synthetic */ TJPlacement mo72510a(Context context, TJPlacementListener tJPlacementListener, Object obj) {
            C11738hu.C11739a aVar = (C11738hu.C11739a) obj;
            TJPlacement createPlacement = TJPlacementManager.createPlacement(TapjoyConnectCore.getContext(), aVar.f28595b, false, tJPlacementListener);
            createPlacement.pushId = aVar.f28594a;
            return createPlacement;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final /* bridge */ /* synthetic */ String mo72511a(Object obj) {
            C11738hu.C11739a aVar = (C11738hu.C11739a) obj;
            if (aVar != null) {
                return aVar.f28595b;
            }
            return null;
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public final /* synthetic */ C11660gc.C11661a mo72527b(Object obj) {
            C11738hu.C11739a aVar = (C11738hu.C11739a) obj;
            return new C11660gc.C11661a(aVar, aVar.f28596c);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final boolean mo72526a(Observer observer) {
            if (TapjoyConnectCore.isViewOpen()) {
                TJPlacementManager.dismissContentShowing(true);
            }
            return super.mo72526a(observer);
        }
    };

    /* renamed from: a */
    public static void m33824a() {
    }

    static {
        C11738hu.m34109a((C11738hu) new C11653fz());
    }

    private C11653fz() {
    }

    /* renamed from: b */
    public final boolean mo72525b() {
        return this.f28336b.f28355b != null;
    }

    /* renamed from: a */
    public final void mo72524a(C11738hu.C11739a aVar) {
        this.f28336b.mo72536c(aVar);
    }
}

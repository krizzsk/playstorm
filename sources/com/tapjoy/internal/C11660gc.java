package com.tapjoy.internal;

import android.content.Context;
import com.tapjoy.TJActionRequest;
import com.tapjoy.TJError;
import com.tapjoy.TJPlacement;
import com.tapjoy.TJPlacementListener;
import com.tapjoy.TapjoyConnectCore;
import com.tapjoy.TapjoyLog;
import java.util.Observable;
import java.util.Observer;

/* renamed from: com.tapjoy.internal.gc */
abstract class C11660gc<R> {

    /* renamed from: b */
    volatile C11660gc<R>.a f28355b;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract TJPlacement mo72510a(Context context, TJPlacementListener tJPlacementListener, R r);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract String mo72511a(R r);

    C11660gc() {
    }

    /* renamed from: c */
    public final boolean mo72536c(R r) {
        if (!mo72512a()) {
            return false;
        }
        C11660gc<R>.a aVar = null;
        synchronized (this) {
            if (this.f28355b == null) {
                aVar = mo72527b(r);
                this.f28355b = aVar;
            }
        }
        if (aVar == null) {
            return false;
        }
        aVar.mo72537a();
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C11660gc<R>.a mo72527b(R r) {
        return new C11661a(this, r);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo72512a() {
        return !TapjoyConnectCore.isFullScreenViewOpen();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo72526a(Observer observer) {
        if (TapjoyConnectCore.isFullScreenViewOpen()) {
            C11647fu.f28328e.addObserver(observer);
            if (TapjoyConnectCore.isFullScreenViewOpen()) {
                return false;
            }
            C11647fu.f28328e.deleteObserver(observer);
        }
        if (C11714hj.m33999a().mo72629d()) {
            return true;
        }
        C11647fu.f28326c.addObserver(observer);
        if (!C11714hj.m33999a().mo72629d()) {
            return false;
        }
        C11647fu.f28326c.deleteObserver(observer);
        return true;
    }

    /* renamed from: com.tapjoy.internal.gc$a */
    class C11661a implements TJPlacementListener, Observer {

        /* renamed from: b */
        private final R f28357b;

        /* renamed from: c */
        private final C11630fk f28358c;

        /* renamed from: d */
        private volatile boolean f28359d;

        /* renamed from: e */
        private TJPlacement f28360e;

        public final void onClick(TJPlacement tJPlacement) {
        }

        public final void onContentDismiss(TJPlacement tJPlacement) {
        }

        public final void onContentShow(TJPlacement tJPlacement) {
        }

        public final void onPurchaseRequest(TJPlacement tJPlacement, TJActionRequest tJActionRequest, String str) {
        }

        public final void onRequestSuccess(TJPlacement tJPlacement) {
        }

        public final void onRewardRequest(TJPlacement tJPlacement, TJActionRequest tJActionRequest, String str, int i) {
        }

        C11661a(C11660gc gcVar, R r) {
            this(r, new C11630fk(10000));
        }

        C11661a(R r, C11630fk fkVar) {
            this.f28357b = r;
            this.f28358c = fkVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final void mo72537a() {
            synchronized (this) {
                if (!this.f28359d) {
                    if (this.f28358c.mo72492a()) {
                        m33845a("Timed out");
                        return;
                    }
                    if (!TapjoyConnectCore.isConnected()) {
                        C11647fu.f28324a.addObserver(this);
                        if (TapjoyConnectCore.isConnected()) {
                            C11647fu.f28324a.deleteObserver(this);
                        } else {
                            return;
                        }
                    }
                    if (this.f28360e == null) {
                        if (!C11660gc.this.mo72512a()) {
                            m33845a("Cannot request");
                            return;
                        }
                        TJPlacement a = C11660gc.this.mo72510a(TapjoyConnectCore.getContext(), this, this.f28357b);
                        this.f28360e = a;
                        a.requestContent();
                    } else if (this.f28360e.isContentReady()) {
                        if (C11660gc.this.mo72526a((Observer) this)) {
                            this.f28360e.showContent();
                            m33845a((String) null);
                        }
                    }
                }
            }
        }

        /* renamed from: a */
        private void m33845a(String str) {
            synchronized (this) {
                String a = C11660gc.this.mo72511a(this.f28357b);
                if (str == null) {
                    TapjoyLog.m33197i("SystemPlacement", "Placement " + a + " is presented now");
                } else {
                    TapjoyLog.m33197i("SystemPlacement", "Cannot show placement " + a + " now (" + str + ")");
                }
                this.f28359d = true;
                this.f28360e = null;
                C11647fu.f28324a.deleteObserver(this);
                C11647fu.f28328e.deleteObserver(this);
                C11647fu.f28326c.deleteObserver(this);
            }
            C11660gc.m33838a(C11660gc.this, this);
        }

        public final void update(Observable observable, Object obj) {
            mo72537a();
        }

        public final void onRequestFailure(TJPlacement tJPlacement, TJError tJError) {
            m33845a(tJError.message);
        }

        public final void onContentReady(TJPlacement tJPlacement) {
            mo72537a();
        }
    }

    /* renamed from: a */
    static /* synthetic */ void m33838a(C11660gc gcVar, C11661a aVar) {
        synchronized (gcVar) {
            if (gcVar.f28355b == aVar) {
                gcVar.f28355b = null;
            }
        }
    }
}

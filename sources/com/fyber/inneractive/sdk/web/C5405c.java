package com.fyber.inneractive.sdk.web;

import android.content.Context;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import com.fyber.inneractive.sdk.p192ui.IAmraidWebViewController;
import com.fyber.inneractive.sdk.util.C5357n;
import com.fyber.inneractive.sdk.util.C5364p0;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.web.C5429o;

/* renamed from: com.fyber.inneractive.sdk.web.c */
public class C5405c extends WebView {

    /* renamed from: a */
    public boolean f14312a = false;

    /* renamed from: b */
    public boolean f14313b;

    /* renamed from: c */
    public C5406a f14314c;

    /* renamed from: d */
    public C5429o f14315d;

    /* renamed from: e */
    public final C5364p0 f14316e = C5364p0.m16776a();

    /* renamed from: f */
    public int f14317f;

    /* renamed from: g */
    public int f14318g;

    /* renamed from: com.fyber.inneractive.sdk.web.c$a */
    public interface C5406a {
    }

    public C5405c() {
        super((Context) null);
    }

    /* renamed from: a */
    public void mo26523a(String str) {
        IAlog.m16699a("injecting JS: %s", str);
        if (str != null) {
            try {
                loadUrl("javascript:" + str);
            } catch (Exception unused) {
                IAlog.m16699a("Failed to inject JS", new Object[0]);
            }
        }
    }

    public void destroy() {
        try {
            super.destroy();
        } catch (Throwable unused) {
        }
        this.f14314c = null;
    }

    public int getHeightDp() {
        return this.f14318g;
    }

    public boolean getIsVisible() {
        return this.f14313b;
    }

    public C5364p0 getLastClickedLocation() {
        return this.f14316e;
    }

    public int getWidthDp() {
        return this.f14317f;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!this.f14312a) {
            this.f14312a = true;
            C5406a aVar = this.f14314c;
            if (aVar != null) {
                C5407d dVar = (C5407d) aVar;
                dVar.getClass();
                C5357n.f14225b.post(new C5420f(dVar));
            }
            mo26524a();
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f14313b = false;
        if (this.f14312a) {
            this.f14312a = false;
            C5406a aVar = this.f14314c;
            if (aVar != null) {
                C5407d dVar = (C5407d) aVar;
                dVar.getClass();
                C5357n.f14225b.post(new C5421g(dVar));
            }
            mo26524a();
        }
    }

    public void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        mo26524a();
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        C5429o oVar = this.f14315d;
        if (oVar != null) {
            oVar.onTouch(this, motionEvent);
        }
        if (motionEvent.getAction() == 0) {
            C5364p0 p0Var = this.f14316e;
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            p0Var.f14230a = x;
            p0Var.f14231b = y;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        mo26524a();
    }

    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        IAlog.m16702d("onWindowFocusChanged with: %s", Boolean.valueOf(z));
        mo26524a();
    }

    public void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        if (i == 8) {
            mo26525a(false);
        } else {
            mo26524a();
        }
    }

    public void setHeightDp(int i) {
        this.f14318g = i;
    }

    public void setListener(C5406a aVar) {
        this.f14314c = aVar;
    }

    public void setTapListener(C5429o.C5430a aVar) {
        this.f14315d = new C5429o(aVar, getContext());
    }

    public void setWidthDp(int i) {
        this.f14317f = i;
    }

    /* renamed from: a */
    public boolean mo26524a() {
        boolean z = false;
        IAlog.m16702d("updateVisibility called - is = %s hwf = %s atw = %swinToken - %s app token - %s", Boolean.valueOf(isShown()), Boolean.valueOf(hasWindowFocus()), Boolean.valueOf(this.f14312a), getWindowToken(), getApplicationWindowToken());
        if (getWindowToken() != getApplicationWindowToken()) {
            if (getWindowVisibility() != 8 && isShown() && this.f14312a) {
                z = true;
            }
            return mo26525a(z);
        }
        if (isShown() && hasWindowFocus() && this.f14312a) {
            z = true;
        }
        return mo26525a(z);
    }

    public C5405c(Context context) {
        super(context.getApplicationContext());
    }

    /* renamed from: a */
    public final boolean mo26525a(boolean z) {
        if (z) {
            ViewGroup viewGroup = (ViewGroup) getParent();
            if (viewGroup != null) {
                Rect rect = new Rect();
                viewGroup.getHitRect(rect);
                if (!getLocalVisibleRect(rect) && getWindowToken() == getApplicationWindowToken()) {
                    IAlog.m16702d("updateVisibility - Cannot find local visible rect. Scrolled out?", new Object[0]);
                    z = false;
                }
            } else {
                IAlog.m16702d("updateVisibility - No parent available", new Object[0]);
            }
        }
        if (this.f14313b == z) {
            return false;
        }
        this.f14313b = z;
        C5406a aVar = this.f14314c;
        if (aVar != null) {
            ((IAmraidWebViewController) aVar).mo26419e(z);
        }
        return true;
    }
}

package com.ironsource.sdk.controller;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.ironsource.environment.C6429h;
import com.ironsource.sdk.controller.C8252x;
import com.ironsource.sdk.p295i.C8358a;
import com.ironsource.sdk.p296j.C8370g;

/* renamed from: com.ironsource.sdk.controller.i */
public final class C8216i extends FrameLayout implements C8370g {

    /* renamed from: a */
    Context f19644a;

    /* renamed from: b */
    C8252x f19645b;

    public C8216i(Context context) {
        super(context);
        this.f19644a = context;
        setClickable(true);
    }

    /* renamed from: a */
    static /* synthetic */ ViewGroup m23583a(C8216i iVar) {
        Activity activity = (Activity) iVar.f19644a;
        if (activity != null) {
            return (ViewGroup) activity.getWindow().getDecorView();
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo56565a() {
        int identifier;
        try {
            if (this.f19644a == null || (identifier = this.f19644a.getResources().getIdentifier("status_bar_height", "dimen", "android")) <= 0) {
                return 0;
            }
            return this.f19644a.getResources().getDimensionPixelSize(identifier);
        } catch (Exception unused) {
            return 0;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public int mo56566b() {
        Activity activity = (Activity) this.f19644a;
        try {
            if (Build.VERSION.SDK_INT > 9) {
                Rect rect = new Rect();
                activity.getWindow().getDecorView().getDrawingRect(rect);
                Rect rect2 = new Rect();
                activity.getWindow().getDecorView().getWindowVisibleDisplayFrame(rect2);
                if (C6429h.m19336o(activity) == 1) {
                    if (rect.bottom - rect2.bottom > 0) {
                        return rect.bottom - rect2.bottom;
                    }
                    return 0;
                } else if (rect.right - rect2.right > 0) {
                    return rect.right - rect2.right;
                }
            }
        } catch (Exception unused) {
        }
        return 0;
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f19645b.mo56630l();
        this.f19645b.mo56619a(true, "main");
    }

    public final boolean onBackButtonPressed() {
        new C8358a();
        return C8358a.m23945a((Activity) this.f19644a);
    }

    public final void onCloseRequested() {
        ((Activity) this.f19644a).runOnUiThread(new Runnable() {
            public final void run() {
                ViewGroup a = C8216i.m23583a(C8216i.this);
                if (a != null) {
                    a.removeView(C8216i.this);
                }
            }
        });
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f19645b.mo56629k();
        this.f19645b.mo56619a(false, "main");
        C8252x xVar = this.f19645b;
        if (xVar != null) {
            xVar.f19772j = C8252x.C8308g.Gone;
            this.f19645b.f19774l = null;
            this.f19645b.f19784v = null;
        }
        removeAllViews();
    }

    public final void onOrientationChanged(String str, int i) {
    }
}

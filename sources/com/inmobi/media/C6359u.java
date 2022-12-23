package com.inmobi.media;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

/* renamed from: com.inmobi.media.u */
/* compiled from: EmbeddedBrowserCustomView */
public class C6359u extends RelativeLayout {

    /* renamed from: a */
    private static final String f16159a = C6359u.class.getSimpleName();

    /* renamed from: b */
    private final int f16160b = 48;

    /* renamed from: c */
    private int f16161c = -1;

    /* renamed from: d */
    private C6363y f16162d;

    /* renamed from: e */
    private C6362x f16163e;

    /* renamed from: f */
    private C6358t f16164f = null;

    public C6359u(Context context) {
        super(context);
    }

    public void setEmbeddedBrowserUpdateListener(C6362x xVar) {
        this.f16163e = xVar;
    }

    public void setUserLeftApplicationListener(C6358t tVar) {
        this.f16164f = tVar;
    }

    public C6358t getUserLeftApplicationListener() {
        return this.f16164f;
    }

    /* renamed from: a */
    public final void mo35726a(String str, C6360v vVar, boolean z) {
        if (this.f16162d == null) {
            C6363y yVar = new C6363y(getContext());
            this.f16162d = yVar;
            yVar.setId(C6248i.f15819h);
        }
        boolean z2 = true;
        if (this.f16161c != str.hashCode()) {
            if (vVar == C6360v.URL) {
                this.f16162d.loadUrl(str);
            } else {
                this.f16162d.loadData(str, "text/html", "UTF-8");
            }
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams.addRule(10);
            layoutParams.addRule(2, C6248i.f15814c);
            if (findViewById(C6248i.f15819h) != null) {
                this.f16162d.setLayoutParams(layoutParams);
            } else {
                addView(this.f16162d, layoutParams);
            }
            this.f16161c = str.hashCode();
        }
        if (z) {
            if (findViewById(C6248i.f15814c) == null) {
                z2 = false;
            }
            if (!z2) {
                float f = C6252ic.m18655a().f15840c;
                LinearLayout linearLayout = new LinearLayout(getContext());
                linearLayout.setOrientation(0);
                linearLayout.setId(C6248i.f15814c);
                linearLayout.setWeightSum(100.0f);
                linearLayout.setBackgroundResource(17301658);
                linearLayout.setBackgroundColor(-7829368);
                RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, (int) (48.0f * f));
                layoutParams2.addRule(12);
                addView(linearLayout, layoutParams2);
                LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -1);
                layoutParams3.weight = 25.0f;
                C5933cp cpVar = new C5933cp(getContext(), f, (byte) 2);
                cpVar.setId(C6248i.f15820i);
                cpVar.setOnTouchListener(new View.OnTouchListener() {
                    public final boolean onTouch(View view, MotionEvent motionEvent) {
                        return C6359u.this.m19143d(view, motionEvent);
                    }
                });
                linearLayout.addView(cpVar, layoutParams3);
                C5933cp cpVar2 = new C5933cp(getContext(), f, (byte) 3);
                cpVar2.setId(C6248i.f15823l);
                cpVar2.setOnTouchListener(new View.OnTouchListener() {
                    public final boolean onTouch(View view, MotionEvent motionEvent) {
                        return C6359u.this.m19142c(view, motionEvent);
                    }
                });
                linearLayout.addView(cpVar2, layoutParams3);
                C5933cp cpVar3 = new C5933cp(getContext(), f, (byte) 4);
                cpVar3.setId(C6248i.f15822k);
                cpVar3.setOnTouchListener(new View.OnTouchListener() {
                    public final boolean onTouch(View view, MotionEvent motionEvent) {
                        return C6359u.this.m19141b(view, motionEvent);
                    }
                });
                linearLayout.addView(cpVar3, layoutParams3);
                C5933cp cpVar4 = new C5933cp(getContext(), f, (byte) 6);
                cpVar4.setId(C6248i.f15821j);
                cpVar4.setOnTouchListener(new View.OnTouchListener() {
                    public final boolean onTouch(View view, MotionEvent motionEvent) {
                        return C6359u.this.m19140a(view, motionEvent);
                    }
                });
                linearLayout.addView(cpVar4, layoutParams3);
                return;
            }
            return;
        }
        View findViewById = findViewById(C6248i.f15814c);
        if (findViewById != null) {
            removeView(findViewById);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ boolean m19143d(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            view.setBackgroundColor(-7829368);
            mo35725a();
            return true;
        }
        if (motionEvent.getAction() == 0) {
            view.setBackgroundColor(-16711681);
        }
        return true;
    }

    /* renamed from: a */
    public final void mo35725a() {
        C6362x xVar = this.f16163e;
        if (xVar != null) {
            xVar.finish();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ boolean m19142c(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            view.setBackgroundColor(-7829368);
            C6363y yVar = this.f16162d;
            if (yVar != null) {
                yVar.reload();
            }
            return true;
        }
        if (motionEvent.getAction() == 0) {
            view.setBackgroundColor(-16711681);
        }
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ boolean m19141b(View view, MotionEvent motionEvent) {
        if (this.f16162d == null) {
            mo35725a();
            return true;
        } else if (motionEvent.getAction() == 1) {
            view.setBackgroundColor(-7829368);
            if (this.f16162d.canGoBack()) {
                this.f16162d.goBack();
            } else {
                mo35725a();
            }
            return true;
        } else {
            if (motionEvent.getAction() == 0) {
                view.setBackgroundColor(-16711681);
            }
            return true;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ boolean m19140a(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            view.setBackgroundColor(-7829368);
            if (this.f16162d.canGoForward()) {
                this.f16162d.goForward();
            }
            return true;
        }
        if (motionEvent.getAction() == 0) {
            view.setBackgroundColor(-16711681);
        }
        return true;
    }

    /* renamed from: b */
    public final void mo35727b() {
        C6363y yVar = this.f16162d;
        if (yVar != null) {
            yVar.destroy();
        }
        this.f16162d = null;
        this.f16163e = null;
        this.f16164f = null;
        removeAllViews();
    }
}

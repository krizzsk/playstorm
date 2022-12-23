package com.bytedance.sdk.openadsdk.core.widget;

import android.view.MotionEvent;
import android.view.View;
import com.bytedance.sdk.openadsdk.core.C3578m;
import com.bytedance.sdk.openadsdk.utils.C4020v;

/* renamed from: com.bytedance.sdk.openadsdk.core.widget.d */
/* compiled from: VideoOnTouchLayout */
public class C3758d {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C3760a f9778a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public boolean f9779b = false;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public boolean f9780c = false;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public float f9781d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public float f9782e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public int f9783f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public int f9784g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public boolean f9785h = true;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public boolean f9786i = false;

    /* renamed from: j */
    private final View.OnTouchListener f9787j = new View.OnTouchListener() {
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (!C3758d.this.f9778a.mo20383o()) {
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                int action = motionEvent.getAction();
                if (action == 0) {
                    C3758d dVar = C3758d.this;
                    boolean unused = dVar.f9788k = dVar.m12332a(motionEvent);
                    float unused2 = C3758d.this.f9781d = x;
                    float unused3 = C3758d.this.f9782e = y;
                    int unused4 = C3758d.this.f9783f = (int) x;
                    int unused5 = C3758d.this.f9784g = (int) y;
                    boolean unused6 = C3758d.this.f9785h = true;
                    if (C3758d.this.f9778a != null && C3758d.this.f9780c && !C3758d.this.f9779b) {
                        C3758d.this.f9778a.mo20361a(view, true);
                    }
                } else if (action == 1) {
                    if (Math.abs(x - ((float) C3758d.this.f9783f)) > 20.0f || Math.abs(y - ((float) C3758d.this.f9784g)) > 20.0f) {
                        boolean unused7 = C3758d.this.f9785h = false;
                    }
                    if (!C3758d.this.f9779b) {
                        boolean unused8 = C3758d.this.f9785h = true;
                    }
                    boolean unused9 = C3758d.this.f9786i = false;
                    float unused10 = C3758d.this.f9781d = 0.0f;
                    float unused11 = C3758d.this.f9782e = 0.0f;
                    int unused12 = C3758d.this.f9783f = 0;
                    if (C3758d.this.f9778a != null) {
                        C3758d.this.f9778a.mo20361a(view, C3758d.this.f9785h);
                    }
                    boolean unused13 = C3758d.this.f9788k = false;
                } else if (action != 2) {
                    if (action == 3) {
                        boolean unused14 = C3758d.this.f9788k = false;
                    }
                } else if (C3758d.this.f9779b && !C3758d.this.f9788k) {
                    float abs = Math.abs(x - C3758d.this.f9781d);
                    float abs2 = Math.abs(y - C3758d.this.f9782e);
                    if (!C3758d.this.f9786i) {
                        if (abs <= 20.0f && abs2 <= 20.0f) {
                            return true;
                        }
                        boolean unused15 = C3758d.this.f9786i = true;
                    }
                    if (C3758d.this.f9778a != null) {
                        C3758d.this.f9778a.mo20382n();
                    }
                    float unused16 = C3758d.this.f9781d = x;
                    float unused17 = C3758d.this.f9782e = y;
                }
                if (C3758d.this.f9779b || !C3758d.this.f9780c) {
                    return true;
                }
                return false;
            } else if (C3758d.this.f9779b || !C3758d.this.f9780c) {
                return true;
            } else {
                return false;
            }
        }
    };
    /* access modifiers changed from: private */

    /* renamed from: k */
    public boolean f9788k;

    /* renamed from: com.bytedance.sdk.openadsdk.core.widget.d$a */
    /* compiled from: VideoOnTouchLayout */
    public interface C3760a {
        /* renamed from: a */
        void mo20361a(View view, boolean z);

        /* renamed from: n */
        void mo20382n();

        /* renamed from: o */
        boolean mo20383o();
    }

    public C3758d(C3760a aVar) {
        this.f9778a = aVar;
    }

    /* renamed from: a */
    public void mo20564a(View view) {
        if (view != null) {
            view.setOnTouchListener(this.f9787j);
        }
    }

    /* renamed from: a */
    public void mo20565a(boolean z) {
        this.f9780c = z;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public boolean m12332a(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() != 0) {
            return false;
        }
        int c = C4020v.m13306c(C3578m.m11231a().getApplicationContext());
        int d = C4020v.m13310d(C3578m.m11231a().getApplicationContext());
        float rawX = motionEvent.getRawX();
        float rawY = motionEvent.getRawY();
        float f = (float) c;
        if (rawX > f * 0.01f && rawX < f * 0.99f) {
            float f2 = (float) d;
            if (rawY <= 0.01f * f2 || rawY >= f2 * 0.99f) {
                return true;
            }
            return false;
        }
        return true;
    }
}

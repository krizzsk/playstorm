package com.p374my.target;

import android.content.Context;
import android.os.Build;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebSettings;
import com.p374my.target.C9755i6;

/* renamed from: com.my.target.i6 */
public class C9755i6 extends C9605a6 {

    /* renamed from: b */
    public C9756a f24069b;

    /* renamed from: c */
    public boolean f24070c;

    /* renamed from: d */
    public boolean f24071d;

    /* renamed from: e */
    public int f24072e;

    /* renamed from: com.my.target.i6$a */
    public interface C9756a {
        /* renamed from: a */
        void mo64285a(boolean z);

        /* renamed from: c */
        void mo64286c();
    }

    /* renamed from: com.my.target.i6$b */
    public static class C9757b extends GestureDetector {

        /* renamed from: a */
        public final View f24073a;

        /* renamed from: b */
        public C9758a f24074b;

        /* renamed from: com.my.target.i6$b$a */
        public interface C9758a {
            /* renamed from: a */
            void mo63345a();
        }

        public C9757b(Context context, View view) {
            this(context, view, new GestureDetector.SimpleOnGestureListener());
        }

        public C9757b(Context context, View view, GestureDetector.SimpleOnGestureListener simpleOnGestureListener) {
            super(context, simpleOnGestureListener);
            this.f24073a = view;
            setIsLongpressEnabled(false);
        }

        /* renamed from: a */
        public void mo64287a(MotionEvent motionEvent) {
            int action = motionEvent.getAction();
            if (action != 0) {
                if (action != 1) {
                    if (action != 2 || !mo64289a(motionEvent, this.f24073a)) {
                        return;
                    }
                } else if (this.f24074b != null) {
                    C9672e0.m27882a("Gestures: user clicked");
                    this.f24074b.mo63345a();
                    return;
                } else {
                    C9672e0.m27882a("View's onUserClick() is not registered.");
                    return;
                }
            }
            onTouchEvent(motionEvent);
        }

        /* renamed from: a */
        public void mo64288a(C9758a aVar) {
            this.f24074b = aVar;
        }

        /* renamed from: a */
        public final boolean mo64289a(MotionEvent motionEvent, View view) {
            if (motionEvent == null || view == null) {
                return false;
            }
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            return x >= 0.0f && x <= ((float) view.getWidth()) && y >= 0.0f && y <= ((float) view.getHeight());
        }
    }

    public C9755i6(Context context) {
        super(context);
        this.f24070c = getVisibility() == 0;
        WebSettings settings = getSettings();
        if (settings != null) {
            settings.setJavaScriptEnabled(true);
            settings.setDomStorageEnabled(true);
            settings.setAppCacheEnabled(true);
            settings.setAppCachePath(getContext().getCacheDir().getAbsolutePath());
            settings.setAllowFileAccess(false);
            settings.setAllowContentAccess(false);
            if (Build.VERSION.SDK_INT >= 16) {
                settings.setAllowFileAccessFromFileURLs(false);
                settings.setAllowUniversalAccessFromFileURLs(false);
            }
        }
        C9757b bVar = new C9757b(getContext(), this);
        bVar.mo64288a((C9757b.C9758a) new C9757b.C9758a() {
            /* renamed from: a */
            public final void mo63345a() {
                C9755i6.this.m28276i();
            }
        });
        setOnTouchListener(new View.OnTouchListener() {
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return C9755i6.C9757b.this.mo64287a(motionEvent);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public /* synthetic */ void m28276i() {
        this.f24071d = true;
    }

    /* renamed from: a */
    public final void mo64278a(int i, int i2) {
        int i3 = ((float) i) / ((float) i2) > 1.0f ? 2 : 1;
        if (i3 != this.f24072e) {
            this.f24072e = i3;
            C9756a aVar = this.f24069b;
            if (aVar != null) {
                aVar.mo64286c();
            }
        }
    }

    /* renamed from: a */
    public void mo64279a(boolean z) {
        C9672e0.m27882a("MraidWebView: pause, finishing " + z);
        if (z) {
            mo63466f();
            mo63460a("");
        }
        mo63464d();
    }

    /* renamed from: g */
    public boolean mo64280g() {
        return this.f24071d;
    }

    /* renamed from: h */
    public boolean mo64281h() {
        return this.f24070c;
    }

    public void onMeasure(int i, int i2) {
        mo64278a(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
        super.onMeasure(i, i2);
    }

    public void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        boolean z = i == 0;
        if (z != this.f24070c) {
            this.f24070c = z;
            C9756a aVar = this.f24069b;
            if (aVar != null) {
                aVar.mo64285a(z);
            }
        }
    }

    public void setClicked(boolean z) {
        this.f24071d = z;
    }

    public void setVisibilityChangedListener(C9756a aVar) {
        this.f24069b = aVar;
    }
}

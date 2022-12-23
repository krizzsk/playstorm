package com.inmobi.media;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.LayerDrawable;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import com.google.common.base.Ascii;
import com.iab.omid.library.inmobi.adsession.FriendlyObstructionPurpose;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.inmobi.media.fi */
/* compiled from: NativeVideoController */
public class C6086fi extends FrameLayout {

    /* renamed from: b */
    private static final String f15475b = C6086fi.class.getSimpleName();

    /* renamed from: a */
    boolean f15476a;

    /* renamed from: c */
    private C6332o f15477c;

    /* renamed from: d */
    private C6088a f15478d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public C6089fj f15479e;

    /* renamed from: f */
    private C5933cp f15480f;

    /* renamed from: g */
    private C5933cp f15481g;

    /* renamed from: h */
    private ProgressBar f15482h;

    /* renamed from: i */
    private RelativeLayout f15483i;

    /* renamed from: j */
    private boolean f15484j;

    /* renamed from: k */
    private float f15485k;

    /* renamed from: l */
    private final View.OnClickListener f15486l;

    public C6086fi(Context context) {
        this(context, (byte) 0);
    }

    private C6086fi(Context context, byte b) {
        this(context, 0);
    }

    private C6086fi(Context context, char c) {
        super(context, (AttributeSet) null, 0);
        this.f15484j = false;
        this.f15486l = new View.OnClickListener() {
            public final void onClick(View view) {
                C6086fi.m18184c(C6086fi.this);
            }
        };
        this.f15483i = new RelativeLayout(getContext());
        addView(this.f15483i, new RelativeLayout.LayoutParams(-1, -1));
        this.f15483i.setPadding(0, 0, 0, 0);
        if (this.f15483i != null) {
            this.f15485k = C6252ic.m18655a().f15840c;
            this.f15480f = new C5933cp(getContext(), this.f15485k, (byte) 9);
            this.f15481g = new C5933cp(getContext(), this.f15485k, Ascii.f17948VT);
            ProgressBar progressBar = new ProgressBar(getContext(), (AttributeSet) null, 16842872);
            this.f15482h = progressBar;
            progressBar.setScaleY(0.8f);
            m18185e();
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
            layoutParams.addRule(12, -1);
            float f = C6252ic.m18655a().f15840c;
            layoutParams.setMargins(0, (int) (-6.0f * f), 0, (int) (f * -8.0f));
            LayerDrawable layerDrawable = (LayerDrawable) this.f15482h.getProgressDrawable();
            if (layerDrawable != null) {
                layerDrawable.getDrawable(0).setColorFilter(-1, PorterDuff.Mode.SRC_IN);
                layerDrawable.getDrawable(2).setColorFilter(-327674, PorterDuff.Mode.SRC_IN);
            }
            this.f15483i.addView(this.f15482h, layoutParams);
        }
        this.f15478d = new C6088a(this);
    }

    public void setMediaPlayer(C6089fj fjVar) {
        this.f15479e = fjVar;
        C5923cg cgVar = (C5923cg) fjVar.getTag();
        if (cgVar != null && cgVar.f15008B && !cgVar.mo34919a()) {
            this.f15484j = true;
            this.f15483i.removeView(this.f15481g);
            this.f15483i.removeView(this.f15480f);
            m18186f();
        }
    }

    /* renamed from: e */
    private void m18185e() {
        float f = this.f15485k;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams((int) (f * 30.0f), (int) (f * 30.0f));
        layoutParams.addRule(9, -1);
        layoutParams.addRule(12, -1);
        this.f15483i.addView(this.f15480f, layoutParams);
        this.f15480f.setOnClickListener(this.f15486l);
    }

    /* renamed from: f */
    private void m18186f() {
        float f = this.f15485k;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams((int) (f * 30.0f), (int) (f * 30.0f));
        layoutParams.addRule(9, -1);
        layoutParams.addRule(12, -1);
        this.f15483i.addView(this.f15481g, layoutParams);
        this.f15481g.setOnClickListener(this.f15486l);
    }

    /* renamed from: a */
    public final void mo35239a() {
        if (!this.f15476a) {
            m18187g();
            this.f15476a = true;
            C5923cg cgVar = (C5923cg) this.f15479e.getTag();
            if (cgVar != null) {
                int i = 4;
                this.f15480f.setVisibility(cgVar.f15008B ? 0 : 4);
                ProgressBar progressBar = this.f15482h;
                if (cgVar.f15010D) {
                    i = 0;
                }
                progressBar.setVisibility(i);
            }
            setVisibility(0);
        }
        this.f15478d.sendEmptyMessage(2);
    }

    /* renamed from: b */
    public final void mo35240b() {
        if (this.f15476a) {
            try {
                this.f15478d.removeMessages(2);
                setVisibility(8);
            } catch (IllegalArgumentException e) {
                C6181gg.m18398a().mo35357a(new C6217hg(e));
            }
            this.f15476a = false;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public void m18187g() {
        C6089fj fjVar = this.f15479e;
        if (fjVar != null) {
            int currentPosition = fjVar.getCurrentPosition();
            int duration = this.f15479e.getDuration();
            ProgressBar progressBar = this.f15482h;
            if (progressBar != null && duration != 0) {
                progressBar.setProgress((currentPosition * 100) / duration);
            }
        }
    }

    public boolean onTrackballEvent(MotionEvent motionEvent) {
        C6089fj fjVar = this.f15479e;
        if (fjVar == null || !fjVar.mo35259f()) {
            return false;
        }
        if (this.f15476a) {
            mo35240b();
            return false;
        }
        mo35239a();
        return false;
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        boolean z = keyEvent.getRepeatCount() == 0 && keyEvent.getAction() == 0;
        if (keyCode == 79 || keyCode == 85 || keyCode == 62) {
            if (z) {
                if (this.f15479e.isPlaying()) {
                    this.f15479e.pause();
                } else {
                    this.f15479e.start();
                }
                mo35239a();
            }
            return true;
        } else if (keyCode == 126) {
            if (z && !this.f15479e.isPlaying()) {
                this.f15479e.start();
                mo35239a();
            }
            return true;
        } else if (keyCode == 86 || keyCode == 127) {
            if (z && this.f15479e.isPlaying()) {
                this.f15479e.pause();
                mo35239a();
            }
            return true;
        } else if (keyCode == 25 || keyCode == 24 || keyCode == 164 || keyCode == 27) {
            return super.dispatchKeyEvent(keyEvent);
        } else {
            mo35239a();
            return super.dispatchKeyEvent(keyEvent);
        }
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(C6086fi.class.getName());
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(C6086fi.class.getName());
    }

    /* renamed from: com.inmobi.media.fi$a */
    /* compiled from: NativeVideoController */
    static final class C6088a extends Handler {

        /* renamed from: a */
        private final WeakReference<C6086fi> f15488a;

        C6088a(C6086fi fiVar) {
            this.f15488a = new WeakReference<>(fiVar);
        }

        public final void handleMessage(Message message) {
            if (message.what != 2) {
                super.handleMessage(message);
                return;
            }
            C6086fi fiVar = (C6086fi) this.f15488a.get();
            if (fiVar != null) {
                fiVar.m18187g();
                if (fiVar.f15476a && fiVar.f15479e.isPlaying()) {
                    sendMessageDelayed(obtainMessage(2), 200);
                }
            }
        }
    }

    /* renamed from: c */
    public final void mo35241c() {
        if (this.f15479e != null) {
            this.f15484j = false;
            this.f15483i.removeView(this.f15481g);
            this.f15483i.removeView(this.f15480f);
            m18185e();
        }
    }

    /* renamed from: d */
    public final void mo35242d() {
        if (this.f15479e != null) {
            this.f15484j = true;
            this.f15483i.removeView(this.f15480f);
            this.f15483i.removeView(this.f15481g);
            m18186f();
        }
    }

    public void setVideoAd(C6332o oVar) {
        this.f15477c = oVar;
    }

    public Map<View, FriendlyObstructionPurpose> getFriendlyViews() {
        HashMap hashMap = new HashMap();
        hashMap.put(this.f15482h, FriendlyObstructionPurpose.VIDEO_CONTROLS);
        hashMap.put(this.f15480f, FriendlyObstructionPurpose.VIDEO_CONTROLS);
        hashMap.put(this.f15481g, FriendlyObstructionPurpose.VIDEO_CONTROLS);
        return hashMap;
    }

    /* renamed from: c */
    static /* synthetic */ void m18184c(C6086fi fiVar) {
        C6332o oVar;
        C6332o oVar2;
        C6089fj fjVar = fiVar.f15479e;
        if (fjVar != null) {
            C5923cg cgVar = (C5923cg) fjVar.getTag();
            if (fiVar.f15484j) {
                fiVar.f15479e.mo35275i();
                fiVar.f15484j = false;
                fiVar.f15483i.removeView(fiVar.f15481g);
                fiVar.f15483i.removeView(fiVar.f15480f);
                fiVar.m18185e();
                if (cgVar != null && (oVar2 = fiVar.f15477c) != null) {
                    try {
                        oVar2.mo35601f(cgVar);
                        cgVar.f15007A = true;
                    } catch (Exception e) {
                        C6181gg.m18398a().mo35357a(new C6217hg(e));
                    }
                }
            } else {
                fiVar.f15479e.mo35274h();
                fiVar.f15484j = true;
                fiVar.f15483i.removeView(fiVar.f15480f);
                fiVar.f15483i.removeView(fiVar.f15481g);
                fiVar.m18186f();
                if (cgVar != null && (oVar = fiVar.f15477c) != null) {
                    try {
                        oVar.mo35600e(cgVar);
                        cgVar.f15007A = false;
                    } catch (Exception e2) {
                        C6181gg.m18398a().mo35357a(new C6217hg(e2));
                    }
                }
            }
        }
    }
}

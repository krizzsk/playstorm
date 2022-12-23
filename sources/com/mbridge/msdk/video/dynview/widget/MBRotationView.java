package com.mbridge.msdk.video.dynview.widget;

import android.content.Context;
import android.graphics.Camera;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

public class MBRotationView extends FrameLayout {

    /* renamed from: a */
    Runnable f22634a = new Runnable() {
        public final void run() {
            MBRotationView.m26732a(MBRotationView.this);
        }
    };

    /* renamed from: b */
    private Camera f22635b;

    /* renamed from: c */
    private Matrix f22636c;

    /* renamed from: d */
    private int f22637d;

    /* renamed from: e */
    private int f22638e;

    /* renamed from: f */
    private int f22639f = 40;

    /* renamed from: g */
    private int f22640g = 20;

    /* renamed from: h */
    private int f22641h = 0;

    /* renamed from: i */
    private int f22642i = 0;

    /* renamed from: j */
    private int f22643j;

    /* renamed from: k */
    private int f22644k = 0;

    /* renamed from: l */
    private float f22645l = 0.5f;

    /* renamed from: m */
    private float f22646m = 0.9f;

    /* renamed from: n */
    private boolean f22647n = true;

    /* renamed from: o */
    private boolean f22648o = false;

    /* renamed from: p */
    private boolean f22649p = false;

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    public MBRotationView(Context context) {
        super(context);
        m26729a();
    }

    public MBRotationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m26729a();
    }

    public MBRotationView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m26729a();
    }

    /* renamed from: a */
    private void m26729a() {
        this.f22635b = new Camera();
        this.f22636c = new Matrix();
        setWillNotDraw(false);
    }

    public void setWidthRatio(float f) {
        this.f22645l = f;
    }

    public void setHeightRatio(float f) {
        this.f22646m = f;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = i3 - i;
        float f = (float) i5;
        float f2 = this.f22645l;
        int i6 = (int) (((1.0f - f2) * f) / 2.0f);
        int i7 = i4 - i2;
        float f3 = (float) i7;
        float f4 = this.f22646m;
        int i8 = (int) (((1.0f - f4) * f3) / 2.0f);
        this.f22637d = (int) (f3 * f4);
        this.f22638e = (int) (f * f2);
        int childCount = getChildCount();
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = getChildAt(i9);
            childAt.layout(i6, i8, i5 - i6, i7 - i8);
            childAt.setClickable(true);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            int i10 = layoutParams.width;
            int i11 = this.f22638e;
            if (i10 != i11) {
                layoutParams.width = i11;
                layoutParams.height = this.f22637d;
                childAt.setLayoutParams(layoutParams);
            }
        }
    }

    public void setRotateV(boolean z) {
        this.f22648o = z;
        invalidate();
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
        if (getChildCount() != 0) {
            if (this.f22648o) {
                int height = getHeight() / 2;
                int i = ((this.f22641h * this.f22637d) / 2) / this.f22639f;
                m26731a(canvas, i, height, 0);
                m26731a(canvas, i, height, 1);
                if (Math.abs(this.f22641h) > this.f22639f / 2) {
                    m26731a(canvas, i, height, 3);
                    m26731a(canvas, i, height, 2);
                    return;
                }
                m26731a(canvas, i, height, 2);
                m26731a(canvas, i, height, 3);
                return;
            }
            int width = getWidth() / 2;
            int i2 = ((this.f22641h * this.f22638e) / 2) / this.f22639f;
            m26734b(canvas, i2, width, 0);
            m26734b(canvas, i2, width, 1);
            if (Math.abs(this.f22641h) > this.f22639f / 2) {
                m26734b(canvas, i2, width, 3);
                m26734b(canvas, i2, width, 2);
                return;
            }
            m26734b(canvas, i2, width, 2);
            m26734b(canvas, i2, width, 3);
        }
    }

    public void setAutoscroll(boolean z) {
        if (z) {
            postDelayed(this.f22634a, (long) (1000 / this.f22640g));
        }
        this.f22647n = z;
    }

    /* renamed from: a */
    private void m26730a(int i, int i2, int i3) {
        float f = ((float) (-i)) / 2.0f;
        if (i3 == 0) {
            this.f22635b.translate(0.0f, f, 0.0f);
            float f2 = (float) (-i2);
            this.f22635b.rotateX(f2);
            this.f22635b.translate(0.0f, f, 0.0f);
            this.f22635b.translate(0.0f, f, 0.0f);
            this.f22635b.rotateX(f2);
            this.f22635b.translate(0.0f, f, 0.0f);
        } else if (i3 == 1) {
            this.f22635b.translate(0.0f, f, 0.0f);
            this.f22635b.rotateX((float) i2);
            this.f22635b.translate(0.0f, f, 0.0f);
        } else if (i3 == 2) {
            this.f22635b.translate(0.0f, f, 0.0f);
            this.f22635b.rotateX((float) (-i2));
            this.f22635b.translate(0.0f, f, 0.0f);
        } else if (i3 == 3) {
            this.f22635b.rotateX(0.0f);
        }
    }

    /* renamed from: a */
    private void m26731a(Canvas canvas, int i, int i2, int i3) {
        canvas.save();
        this.f22635b.save();
        this.f22636c.reset();
        float f = (float) i;
        this.f22635b.translate(0.0f, f, 0.0f);
        this.f22635b.rotateX((float) this.f22641h);
        this.f22635b.translate(0.0f, f, 0.0f);
        if (i == 0) {
            if (this.f22649p) {
                m26730a(this.f22637d, this.f22639f, i3);
            } else {
                m26730a(-this.f22637d, -this.f22639f, i3);
            }
        } else if (i > 0) {
            m26730a(this.f22637d, this.f22639f, i3);
        } else if (i < 0) {
            m26730a(-this.f22637d, -this.f22639f, i3);
        }
        this.f22635b.getMatrix(this.f22636c);
        this.f22635b.restore();
        this.f22636c.preTranslate((float) ((-getWidth()) / 2), (float) (-i2));
        this.f22636c.postTranslate((float) (getWidth() / 2), (float) i2);
        canvas.concat(this.f22636c);
        View childAt = getChildAt(m26728a(i3));
        if (childAt != null) {
            drawChild(canvas, childAt, 0);
        }
        canvas.restore();
    }

    /* renamed from: a */
    private int m26728a(int i) {
        int i2;
        int i3;
        int i4;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    i2 = i != 3 ? 0 : this.f22642i;
                } else if (this.f22649p) {
                    i3 = this.f22642i;
                    i2 = i3 - 1;
                } else {
                    i4 = this.f22642i;
                }
            } else if (this.f22649p) {
                i4 = this.f22642i;
            } else {
                i3 = this.f22642i;
                i2 = i3 - 1;
            }
            i2 = i4 + 1;
        } else if (this.f22649p) {
            i2 = this.f22642i - 2;
        } else {
            i2 = this.f22642i + 2;
        }
        int childCount = i2 % getChildCount();
        if (childCount >= 0) {
            return childCount;
        }
        return childCount + getChildCount();
    }

    /* renamed from: b */
    private void m26733b(int i, int i2, int i3) {
        if (i3 == 0) {
            float f = (float) ((-i) / 2);
            this.f22635b.translate(f, 0.0f, 0.0f);
            float f2 = (float) (-i2);
            this.f22635b.rotateY(f2);
            this.f22635b.translate(f, 0.0f, 0.0f);
            this.f22635b.translate(f, 0.0f, 0.0f);
            this.f22635b.rotateY(f2);
            this.f22635b.translate(f, 0.0f, 0.0f);
        } else if (i3 == 1) {
            float f3 = (float) (i / 2);
            this.f22635b.translate(f3, 0.0f, 0.0f);
            this.f22635b.rotateY((float) i2);
            this.f22635b.translate(f3, 0.0f, 0.0f);
        } else if (i3 == 2) {
            float f4 = (float) ((-i) / 2);
            this.f22635b.translate(f4, 0.0f, 0.0f);
            this.f22635b.rotateY((float) (-i2));
            this.f22635b.translate(f4, 0.0f, 0.0f);
        } else if (i3 == 3) {
            this.f22635b.rotateY(0.0f);
        }
    }

    /* renamed from: b */
    private void m26734b(Canvas canvas, int i, int i2, int i3) {
        canvas.save();
        this.f22635b.save();
        this.f22636c.reset();
        float f = (float) i;
        this.f22635b.translate(f, 0.0f, 0.0f);
        this.f22635b.rotateY((float) this.f22641h);
        this.f22635b.translate(f, 0.0f, 0.0f);
        if (i == 0) {
            if (this.f22649p) {
                m26733b(this.f22638e, this.f22639f, i3);
            } else {
                m26733b(-this.f22638e, -this.f22639f, i3);
            }
        } else if (i > 0) {
            m26733b(this.f22638e, this.f22639f, i3);
        } else if (i < 0) {
            m26733b(-this.f22638e, -this.f22639f, i3);
        }
        this.f22635b.getMatrix(this.f22636c);
        this.f22635b.restore();
        this.f22636c.preTranslate((float) (-i2), (float) ((-getHeight()) / 2));
        this.f22636c.postTranslate((float) i2, (float) (getHeight() / 2));
        canvas.concat(this.f22636c);
        View childAt = getChildAt(m26728a(i3));
        if (childAt != null) {
            drawChild(canvas, childAt, 0);
        }
        canvas.restore();
    }

    /* renamed from: a */
    static /* synthetic */ void m26732a(MBRotationView mBRotationView) {
        int i;
        if (mBRotationView.getChildCount() != 0) {
            int i2 = mBRotationView.f22641h - 1;
            mBRotationView.f22641h = i2;
            int i3 = mBRotationView.f22642i;
            mBRotationView.f22643j = i3;
            int i4 = mBRotationView.f22639f;
            int i5 = i2 % i4;
            mBRotationView.f22641h = i5;
            mBRotationView.f22642i = i3 - (i2 / i4);
            if (Math.abs(i5) > mBRotationView.f22639f / 2) {
                i = mBRotationView.m26728a(2);
            } else {
                i = mBRotationView.m26728a(3);
            }
            if (mBRotationView.f22644k != i) {
                mBRotationView.f22644k = i;
            }
            mBRotationView.invalidate();
            if (mBRotationView.f22647n) {
                mBRotationView.postDelayed(mBRotationView.f22634a, (long) (1000 / mBRotationView.f22640g));
            }
        }
    }
}

package com.mbridge.msdk.video.dynview.p358g;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Shader;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;

/* renamed from: com.mbridge.msdk.video.dynview.g.a */
/* compiled from: BackgroundDrawable */
public final class C9282a extends ShapeDrawable {

    /* renamed from: a */
    private int f22499a;

    /* renamed from: b */
    private float f22500b;

    /* renamed from: c */
    private float f22501c;

    /* renamed from: d */
    private int f22502d;

    /* renamed from: e */
    private int f22503e;

    /* renamed from: f */
    private Bitmap f22504f;

    /* renamed from: g */
    private Bitmap f22505g;

    /* renamed from: h */
    private boolean f22506h;

    /* renamed from: i */
    private Paint f22507i;

    /* renamed from: com.mbridge.msdk.video.dynview.g.a$b */
    /* compiled from: BackgroundDrawable */
    public interface C9285b {
        /* renamed from: a */
        C9285b mo62467a(Bitmap bitmap);

        /* renamed from: a */
        C9285b mo62468a(boolean z);

        /* renamed from: b */
        C9285b mo62470b(float f);

        /* renamed from: b */
        C9285b mo62471b(Bitmap bitmap);
    }

    public final int getOpacity() {
        return -3;
    }

    private C9282a(C9284a aVar) {
        super(aVar.f22508a);
        this.f22506h = false;
        this.f22504f = aVar.f22509b;
        this.f22505g = aVar.f22510c;
        this.f22506h = aVar.f22511d;
        this.f22499a = aVar.f22512e;
        this.f22502d = aVar.f22513f;
        this.f22503e = aVar.f22514g;
        this.f22500b = aVar.f22515h;
        this.f22501c = aVar.f22516i;
        Paint paint = new Paint();
        this.f22507i = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f22507i.setAntiAlias(true);
    }

    public final void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f22499a == 1) {
            float f = this.f22501c / 2.0f;
            Path path = new Path();
            path.moveTo(0.0f, 0.0f);
            path.lineTo(0.0f, (((float) this.f22502d) + f) - ((float) this.f22503e));
            path.lineTo(this.f22500b, (f - ((float) this.f22502d)) - ((float) this.f22503e));
            path.lineTo(this.f22500b, 0.0f);
            if (this.f22506h) {
                try {
                    m26618a(canvas, path);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            } else {
                Bitmap bitmap = this.f22504f;
                if (bitmap != null && !bitmap.isRecycled()) {
                    try {
                        m26619a(canvas, path, this.f22504f);
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
                }
            }
            Path path2 = new Path();
            path2.moveTo(0.0f, ((float) this.f22502d) + f + ((float) this.f22503e));
            path2.lineTo(0.0f, this.f22501c);
            path2.lineTo(this.f22500b, this.f22501c);
            path2.lineTo(this.f22500b, (f - ((float) this.f22502d)) + ((float) this.f22503e));
            if (this.f22506h) {
                try {
                    m26618a(canvas, path2);
                } catch (Exception e3) {
                    e3.printStackTrace();
                }
            } else {
                Bitmap bitmap2 = this.f22505g;
                if (bitmap2 != null && !bitmap2.isRecycled()) {
                    try {
                        m26619a(canvas, path2, this.f22505g);
                    } catch (Exception e4) {
                        e4.printStackTrace();
                    }
                }
            }
        } else {
            float f2 = this.f22500b / 2.0f;
            Path path3 = new Path();
            path3.moveTo(0.0f, 0.0f);
            path3.lineTo(0.0f, this.f22501c);
            path3.lineTo((f2 - ((float) this.f22502d)) - ((float) this.f22503e), this.f22501c);
            path3.lineTo((((float) this.f22502d) + f2) - ((float) this.f22503e), 0.0f);
            if (this.f22506h) {
                try {
                    m26618a(canvas, path3);
                } catch (Exception e5) {
                    e5.printStackTrace();
                }
            } else {
                Bitmap bitmap3 = this.f22504f;
                if (bitmap3 != null && !bitmap3.isRecycled()) {
                    try {
                        m26619a(canvas, path3, this.f22504f);
                    } catch (Exception e6) {
                        e6.printStackTrace();
                    }
                }
            }
            Path path4 = new Path();
            path4.moveTo(((float) this.f22502d) + f2 + ((float) this.f22503e), 0.0f);
            path4.lineTo(this.f22500b, 0.0f);
            path4.lineTo(this.f22500b, this.f22501c);
            path4.lineTo((f2 - ((float) this.f22502d)) + ((float) this.f22503e), this.f22501c);
            if (this.f22506h) {
                try {
                    m26618a(canvas, path4);
                } catch (Exception e7) {
                    e7.printStackTrace();
                }
            } else {
                Bitmap bitmap4 = this.f22505g;
                if (bitmap4 != null && !bitmap4.isRecycled()) {
                    try {
                        m26619a(canvas, path4, this.f22505g);
                    } catch (Exception e8) {
                        e8.printStackTrace();
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private void m26619a(Canvas canvas, Path path, Bitmap bitmap) {
        this.f22507i.setShader(new BitmapShader(bitmap, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP));
        canvas.drawPath(path, this.f22507i);
    }

    /* renamed from: a */
    private void m26618a(Canvas canvas, Path path) {
        this.f22507i.setColor(Color.parseColor("#40EAEAEA"));
        canvas.drawPath(path, this.f22507i);
    }

    /* renamed from: a */
    public static C9284a m26617a() {
        return new C9284a();
    }

    /* renamed from: com.mbridge.msdk.video.dynview.g.a$a */
    /* compiled from: BackgroundDrawable */
    public static class C9284a implements C9285b {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public RectShape f22508a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public Bitmap f22509b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public Bitmap f22510c;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public boolean f22511d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public int f22512e;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public int f22513f;
        /* access modifiers changed from: private */

        /* renamed from: g */
        public int f22514g;
        /* access modifiers changed from: private */

        /* renamed from: h */
        public float f22515h;
        /* access modifiers changed from: private */

        /* renamed from: i */
        public float f22516i;

        private C9284a() {
            this.f22513f = 100;
            this.f22514g = 10;
            this.f22508a = new RectShape();
        }

        /* renamed from: a */
        public final C9285b mo62467a(Bitmap bitmap) {
            this.f22509b = bitmap;
            return this;
        }

        /* renamed from: b */
        public final C9285b mo62471b(Bitmap bitmap) {
            this.f22510c = bitmap;
            return this;
        }

        /* renamed from: a */
        public final C9285b mo62468a(boolean z) {
            this.f22511d = z;
            return this;
        }

        /* renamed from: a */
        public final C9285b mo62466a(int i) {
            this.f22512e = i;
            return this;
        }

        /* renamed from: a */
        public final C9285b mo62465a(float f) {
            this.f22515h = f;
            return this;
        }

        /* renamed from: b */
        public final C9285b mo62470b(float f) {
            this.f22516i = f;
            return this;
        }

        /* renamed from: a */
        public final C9282a mo62469a() {
            return new C9282a(this);
        }
    }
}

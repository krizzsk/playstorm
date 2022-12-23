package com.inmobi.media;

import android.graphics.Camera;
import android.graphics.Matrix;
import android.view.animation.Animation;
import android.view.animation.Transformation;

/* renamed from: com.inmobi.media.a */
/* compiled from: AnimationController */
final class C5755a {

    /* renamed from: com.inmobi.media.a$a */
    /* compiled from: AnimationController */
    static class C5756a extends Animation {

        /* renamed from: a */
        private final float f14505a = 0.0f;

        /* renamed from: b */
        private final float f14506b = 90.0f;

        /* renamed from: c */
        private final float f14507c;

        /* renamed from: d */
        private final float f14508d;

        /* renamed from: e */
        private final float f14509e;

        /* renamed from: f */
        private final boolean f14510f;

        /* renamed from: g */
        private Camera f14511g;

        C5756a(float f, float f2) {
            this.f14507c = f;
            this.f14508d = f2;
            this.f14509e = 0.0f;
            this.f14510f = true;
        }

        public final void initialize(int i, int i2, int i3, int i4) {
            super.initialize(i, i2, i3, i4);
            this.f14511g = new Camera();
        }

        /* access modifiers changed from: protected */
        public final void applyTransformation(float f, Transformation transformation) {
            float f2 = this.f14505a;
            float f3 = f2 + ((this.f14506b - f2) * f);
            float f4 = this.f14507c;
            float f5 = this.f14508d;
            Camera camera = this.f14511g;
            Matrix matrix = transformation.getMatrix();
            camera.save();
            if (this.f14510f) {
                camera.translate(0.0f, 0.0f, this.f14509e * f);
            } else {
                camera.translate(0.0f, 0.0f, this.f14509e * (1.0f - f));
            }
            camera.rotateX(f3);
            camera.getMatrix(matrix);
            camera.restore();
            matrix.preTranslate(-f4, -f5);
            matrix.postTranslate(f4, f5);
        }
    }

    /* renamed from: com.inmobi.media.a$b */
    /* compiled from: AnimationController */
    static class C5757b extends Animation {

        /* renamed from: a */
        private final float f14512a = 0.0f;

        /* renamed from: b */
        private final float f14513b = 90.0f;

        /* renamed from: c */
        private final float f14514c;

        /* renamed from: d */
        private final float f14515d;

        /* renamed from: e */
        private final float f14516e;

        /* renamed from: f */
        private final boolean f14517f;

        /* renamed from: g */
        private Camera f14518g;

        C5757b(float f, float f2) {
            this.f14514c = f;
            this.f14515d = f2;
            this.f14516e = 0.0f;
            this.f14517f = true;
        }

        public final void initialize(int i, int i2, int i3, int i4) {
            super.initialize(i, i2, i3, i4);
            this.f14518g = new Camera();
        }

        /* access modifiers changed from: protected */
        public final void applyTransformation(float f, Transformation transformation) {
            float f2 = this.f14512a;
            float f3 = f2 + ((this.f14513b - f2) * f);
            float f4 = this.f14514c;
            float f5 = this.f14515d;
            Camera camera = this.f14518g;
            Matrix matrix = transformation.getMatrix();
            camera.save();
            if (this.f14517f) {
                camera.translate(0.0f, 0.0f, this.f14516e * f);
            } else {
                camera.translate(0.0f, 0.0f, this.f14516e * (1.0f - f));
            }
            camera.rotateY(f3);
            camera.getMatrix(matrix);
            camera.restore();
            matrix.preTranslate(-f4, -f5);
            matrix.postTranslate(f4, f5);
        }
    }
}

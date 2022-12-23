package com.p374my.target.common.views;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.view.View;
import com.p374my.target.C9672e0;

/* renamed from: com.my.target.common.views.StarsRatingView */
public class StarsRatingView extends View {
    private static final float ACCURACY = 0.2f;
    private static final int GRAY = -3355444;
    private static final int ORANGE = -552162;
    private static final float RAY_LENGTH = 0.45f;
    private static final Paint STAR_PAINT;
    private boolean bitmapCreating;
    private float rating;
    private float starPadding;
    private int starSize;
    private Bitmap starsBitmap;

    static {
        Paint paint = new Paint();
        STAR_PAINT = paint;
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
    }

    public StarsRatingView(Context context) {
        super(context);
    }

    /* access modifiers changed from: private */
    public void createBitmap() {
        if (this.starSize > 0) {
            int floor = (int) Math.floor((double) this.rating);
            int ceil = (int) Math.ceil((double) (5.0f - this.rating));
            float f = (float) floor;
            boolean z = this.rating - f >= ACCURACY;
            try {
                int i = this.starSize;
                this.starsBitmap = Bitmap.createBitmap((int) ((((float) i) + this.starPadding) * 5.0f), i, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(this.starsBitmap);
                drawStars(0, this.starSize, ORANGE, canvas, floor);
                int i2 = this.starSize;
                int i3 = (int) (((float) 0) + ((((float) i2) + this.starPadding) * f));
                drawStars(i3, i2, GRAY, canvas, ceil);
                if (z) {
                    int i4 = this.starSize;
                    double d = (double) this.rating;
                    drawOrangePartStar(i3, i4, (float) (d - Math.floor(d)), canvas);
                }
                invalidate();
                this.bitmapCreating = false;
            } catch (OutOfMemoryError unused) {
                C9672e0.m27882a("Unable to create rating bitmap because of OOME");
            }
        }
    }

    private void drawOrangePartStar(int i, int i2, float f, Canvas canvas) {
        Paint paint = STAR_PAINT;
        paint.setColor(ORANGE);
        Path drawStarPath = drawStarPath(0, (float) (i2 / 2), 1);
        float f2 = ((float) i2) * f;
        Rect rect = new Rect(i, 0, (int) (((float) i) + f2), i2);
        Bitmap createBitmap = Bitmap.createBitmap((int) f2, i2, Bitmap.Config.ARGB_8888);
        new Canvas(createBitmap).drawPath(drawStarPath, paint);
        canvas.drawBitmap(createBitmap, (Rect) null, rect, paint);
    }

    private Path drawStarPath(int i, float f, int i2) {
        float f2 = f;
        Path path = new Path();
        path.setFillType(Path.FillType.EVEN_ODD);
        int i3 = 0;
        while (i3 < i2) {
            float f3 = (float) i3;
            float f4 = ((float) i) + f2 + (f3 * f2 * 2.0f) + (f3 * this.starPadding);
            float f5 = RAY_LENGTH * f2;
            double d = (double) f4;
            double d2 = (double) f2;
            float f6 = 2.0f * f2;
            path.moveTo((float) (d + (Math.sin(0.0d) * d2)), f6 - ((float) ((Math.cos(0.0d) * d2) + d2)));
            double d3 = (double) f5;
            path.lineTo((float) (d + (Math.sin(0.6283185307179586d) * d3)), f6 - ((float) (d2 + (Math.cos(0.6283185307179586d) * d3))));
            int i4 = 1;
            while (i4 < 5) {
                double d4 = ((double) i4) * 1.2566370614359172d;
                path.lineTo((float) (d + (Math.sin(d4) * d2)), f6 - ((float) (d2 + (Math.cos(d4) * d2))));
                double d5 = d4 + 0.6283185307179586d;
                path.lineTo((float) (d + (Math.sin(d5) * d3)), f6 - ((float) ((Math.cos(d5) * d3) + d2)));
                i4++;
                i3 = i3;
            }
            i3++;
        }
        path.close();
        return path;
    }

    private void drawStars(int i, int i2, int i3, Canvas canvas, int i4) {
        Paint paint = STAR_PAINT;
        paint.setColor(i3);
        canvas.drawPath(drawStarPath(i, (float) (i2 / 2), i4), paint);
    }

    public void onDraw(Canvas canvas) {
        if (this.rating > 0.0f) {
            Bitmap bitmap = this.starsBitmap;
            if (bitmap != null) {
                canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
            } else if (this.starSize > 0 && !this.bitmapCreating) {
                this.bitmapCreating = true;
                post(new Runnable() {
                    public final void run() {
                        StarsRatingView.this.createBitmap();
                    }
                });
            }
        }
    }

    public void onMeasure(int i, int i2) {
        int i3 = this.starSize;
        if (i3 <= 0) {
            i3 = View.MeasureSpec.getSize(i2);
            this.starSize = i3;
        }
        setMeasuredDimension((int) (((float) (i3 * 5)) + (this.starPadding * 4.0f)), i3);
    }

    public void setRating(float f) {
        setContentDescription(Float.toString(f));
        if (f > 5.0f || f < 0.0f) {
            C9672e0.m27882a("Rating is out of bounds: " + f);
            this.rating = 0.0f;
        } else {
            this.rating = f;
        }
        invalidate();
    }

    public void setStarSize(int i) {
        this.starSize = i;
    }

    public void setStarsPadding(float f) {
        this.starPadding = f;
    }
}

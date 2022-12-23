package com.smaato.sdk.video.vast.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.view.ViewCompat;
import com.smaato.sdk.video.C11260R;

public class CircularProgressBar extends View {
    private int backgroundColor = -7829368;
    private Paint backgroundOuterPaint = new Paint(1);
    private Paint backgroundPaint = new Paint(1);
    private float backgroundStrokeWidth = getResources().getDimension(C11260R.dimen.smaato_sdk_video_default_stroke_width);
    private int color = ViewCompat.MEASURED_STATE_MASK;
    private String label;
    private Paint labelPaint = new Paint(1);
    private float labelSize = 48.0f;
    private float progress = 0.0f;
    private float progressMax = 100.0f;
    private RectF rectF = new RectF();
    private float strokeWidth = getResources().getDimension(C11260R.dimen.smaato_sdk_video_default_background_stroke_width);
    private Rect textRect = new Rect();

    public CircularProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init(context, attributeSet);
    }

    /* JADX INFO: finally extract failed */
    private void init(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, C11260R.styleable.smaato_sdk_video_circular_progress_bar, 0, 0);
        try {
            this.strokeWidth = obtainStyledAttributes.getDimension(C11260R.styleable.f27157x5b5543a1, this.strokeWidth);
            this.backgroundStrokeWidth = obtainStyledAttributes.getDimension(C11260R.styleable.f27154x564d8d28, this.backgroundStrokeWidth);
            this.color = obtainStyledAttributes.getInt(C11260R.styleable.f27156x5a3e453e, this.color);
            this.backgroundColor = obtainStyledAttributes.getInt(C11260R.styleable.f27153x55368ec5, this.backgroundColor);
            this.labelSize = obtainStyledAttributes.getDimension(C11260R.styleable.f27155xbc78c3fa, this.labelSize);
            obtainStyledAttributes.recycle();
            this.backgroundOuterPaint.setColor(this.backgroundColor);
            this.backgroundOuterPaint.setStyle(Paint.Style.STROKE);
            this.backgroundOuterPaint.setStrokeWidth(this.backgroundStrokeWidth);
            this.backgroundPaint.setColor(this.color);
            this.backgroundPaint.setStyle(Paint.Style.FILL);
            this.labelPaint.setColor(this.backgroundColor);
            this.labelPaint.setTextSize(this.labelSize);
            this.labelPaint.setStyle(Paint.Style.FILL_AND_STROKE);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawOval(this.rectF, this.backgroundPaint);
        String str = this.label;
        float width = this.rectF.width() / 2.0f;
        float height = this.rectF.height() / 2.0f;
        if (!TextUtils.isEmpty(str)) {
            this.labelPaint.getTextBounds(str, 0, str.length(), this.textRect);
            canvas.drawText(str, width - (((float) this.textRect.width()) / 2.0f), height + (((float) this.textRect.height()) / 2.0f), this.labelPaint);
        }
        Canvas canvas2 = canvas;
        canvas2.drawArc(this.rectF, 270.0f, ((100.0f - ((this.progress / this.progressMax) * 100.0f)) * -360.0f) / 100.0f, false, this.backgroundOuterPaint);
    }

    private void reDraw() {
        requestLayout();
        invalidate();
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int min = Math.min(View.getDefaultSize(getSuggestedMinimumWidth(), i), View.getDefaultSize(getSuggestedMinimumHeight(), i2));
        setMeasuredDimension(min, min);
        float f = this.strokeWidth;
        float f2 = this.backgroundStrokeWidth;
        if (f <= f2) {
            f = f2;
        }
        float f3 = f / 2.0f;
        float f4 = ((float) min) - f3;
        this.rectF.set(f3, f3, f4, f4);
    }

    public void setProgress(float f, float f2, String str) {
        if (f2 < 0.0f) {
            f2 = 100.0f;
        }
        boolean z = false;
        boolean z2 = Math.abs(this.progressMax - f2) > 0.0f;
        if (z2) {
            this.progressMax = f2;
        }
        float f3 = this.progressMax;
        if (f > f3) {
            f = f3;
        }
        boolean z3 = Math.abs(this.progress - f) > 0.0f;
        if (z3) {
            this.progress = f;
        }
        boolean z4 = !TextUtils.equals(this.label, str);
        if (z4) {
            this.label = str;
        }
        if (z3 || z2 || z4) {
            z = true;
        }
        if (z) {
            reDraw();
        }
    }

    public float getProgress() {
        return this.progress;
    }

    public float getProgressMax() {
        return this.progressMax;
    }
}

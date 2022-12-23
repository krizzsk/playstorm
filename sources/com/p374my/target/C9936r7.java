package com.p374my.target;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.ProgressBar;
import androidx.core.app.NotificationCompat;
import androidx.core.view.GravityCompat;

/* renamed from: com.my.target.r7 */
public class C9936r7 extends ProgressBar implements C9926q7 {
    public C9936r7(Context context) {
        super(context, (AttributeSet) null, 16842872);
    }

    /* renamed from: a */
    public View mo65315a() {
        return this;
    }

    public void setColor(int i) {
        ClipDrawable clipDrawable = new ClipDrawable(new ColorDrawable(i), GravityCompat.START, 1);
        ColorDrawable colorDrawable = new ColorDrawable(0);
        LayerDrawable layerDrawable = (LayerDrawable) getProgressDrawable();
        layerDrawable.setDrawableByLayerId(16908288, colorDrawable);
        layerDrawable.setDrawableByLayerId(16908301, clipDrawable);
        setProgressDrawable(layerDrawable);
    }

    public void setMaxTime(float f) {
        setMax((int) (f * 1000.0f));
    }

    public void setTimeChanged(float f) {
        if (Build.VERSION.SDK_INT >= 26) {
            setProgress((int) (f * 1000.0f), true);
            return;
        }
        ObjectAnimator ofInt = ObjectAnimator.ofInt(this, NotificationCompat.CATEGORY_PROGRESS, new int[]{getProgress(), (int) (f * 1000.0f)});
        ofInt.setDuration(200);
        ofInt.setInterpolator(new DecelerateInterpolator());
        ofInt.start();
    }

    public void setVisible(boolean z) {
        setVisibility(z ? 0 : 8);
    }
}

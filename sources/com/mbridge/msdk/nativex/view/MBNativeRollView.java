package com.mbridge.msdk.nativex.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import com.mbridge.msdk.foundation.tools.C8613y;
import com.mbridge.msdk.out.Frame;
import com.mbridge.msdk.out.NativeListener;
import java.util.List;

public class MBNativeRollView extends LinearLayout {

    /* renamed from: a */
    private RollingBCView f21583a;

    /* renamed from: b */
    private Context f21584b;

    /* renamed from: c */
    private NativeListener.FilpListener f21585c;

    /* renamed from: com.mbridge.msdk.nativex.view.MBNativeRollView$a */
    public interface C8863a {
        /* renamed from: a */
        View mo58403a(Frame frame, int i);
    }

    public void setFilpListening(NativeListener.FilpListener filpListener) {
        if (filpListener != null) {
            this.f21585c = filpListener;
            this.f21583a.setFilpListening(filpListener);
        }
    }

    public MBNativeRollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public MBNativeRollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f21584b = context;
        RollingBCView rollingBCView = new RollingBCView(context);
        this.f21583a = rollingBCView;
        addView(rollingBCView);
        this.f21583a.setLayoutParams(new LinearLayout.LayoutParams((int) (((double) C8613y.m24946f(context)) * 0.9d), -2));
        setClipChildren(false);
    }

    public MBNativeRollView(Context context) {
        this(context, (AttributeSet) null);
    }

    public void setData(List<Frame> list, Context context, String str, C8863a aVar) {
        this.f21583a.setData(list, context, str, aVar);
    }

    public void setFrameWidth(int i) {
        this.f21583a.setLayoutParams(new LinearLayout.LayoutParams(i, -2));
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        return this.f21583a.dispatchTouchEvent(motionEvent);
    }
}

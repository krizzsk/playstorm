package com.p374my.target;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.text.TextUtils;
import android.util.StateSet;
import android.view.MotionEvent;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p374my.target.common.models.ImageData;

/* renamed from: com.my.target.u5 */
public class C9990u5 extends LinearLayout {

    /* renamed from: a */
    public final TextView f24793a;

    /* renamed from: b */
    public final C9804k6 f24794b;

    public C9990u5(Context context) {
        super(context);
        TextView textView = new TextView(context);
        this.f24793a = textView;
        C9804k6 k6Var = new C9804k6(context);
        this.f24794b = k6Var;
        C10059y8 c = C10059y8.m29843c(context);
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{-1157627904, -1157627904});
        gradientDrawable.setStroke(c.mo65777a(1.0f), -1157627904);
        gradientDrawable.setCornerRadius((float) c.mo65777a(10.0f));
        GradientDrawable gradientDrawable2 = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{-1157627904, -1157627904});
        gradientDrawable2.setStroke(c.mo65777a(1.0f), -1157627904);
        gradientDrawable2.setCornerRadius((float) c.mo65777a(10.0f));
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{16842919}, gradientDrawable2);
        stateListDrawable.addState(StateSet.WILD_CARD, gradientDrawable);
        int b = c.mo65778b(6);
        int b2 = c.mo65778b(12);
        textView.setTextColor(-1);
        textView.setTextSize(18.0f);
        textView.setMaxLines(5);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        int a = C10059y8.m29824a(32, context);
        setPadding(b2, b, b2, b);
        setBackgroundDrawable(stateListDrawable);
        setGravity(16);
        setOrientation(0);
        C10059y8.m29840b(k6Var, "ctc_icon");
        addView(k6Var, a, a);
        C10059y8.m29840b(textView, "ctc_text");
        addView(textView, new LinearLayout.LayoutParams(-2, -2));
    }

    /* renamed from: a */
    public void mo65556a(String str, ImageData imageData) {
        this.f24793a.setText(str);
        this.f24794b.setImageData(imageData);
        ((LinearLayout.LayoutParams) this.f24793a.getLayoutParams()).leftMargin = imageData == null ? 0 : C10059y8.m29824a(4, getContext()) * 2;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return false;
    }
}

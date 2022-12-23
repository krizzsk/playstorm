package com.mbridge.msdk.video.dynview.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.mbridge.msdk.foundation.tools.C8594o;

public class MBridgeLevelLayoutView extends LinearLayout {

    /* renamed from: a */
    private double f22670a;

    /* renamed from: b */
    private int f22671b;

    /* renamed from: c */
    private boolean f22672c;

    public MBridgeLevelLayoutView(Context context) {
        super(context);
    }

    public MBridgeLevelLayoutView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MBridgeLevelLayoutView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public void setRatingAndUser(double d, int i) {
        this.f22670a = d;
        if (i == 0) {
            i = (int) (((Math.random() * 9.0d) + 1.0d) * 10000.0d);
        }
        this.f22671b = i;
        this.f22672c = true;
        m26735a();
    }

    public void setRating(int i) {
        this.f22670a = (double) i;
        m26735a();
    }

    /* renamed from: a */
    private void m26735a() {
        LinearLayout linearLayout;
        LinearLayout linearLayout2;
        if (this.f22672c) {
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            layoutParams.setMargins(0, dip2px(getContext(), 2.0f), 0, 0);
            linearLayout2 = new LinearLayout(getContext());
            linearLayout2.setOrientation(0);
            linearLayout2.setLayoutParams(layoutParams);
            linearLayout = new LinearLayout(getContext());
            linearLayout.setOrientation(0);
            linearLayout.setLayoutParams(layoutParams);
        } else {
            linearLayout2 = null;
            linearLayout = null;
        }
        removeAllViews();
        if (linearLayout != null) {
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, dip2px(getContext(), 30.0f));
            TextView textView = new TextView(getContext());
            textView.setTypeface(Typeface.defaultFromStyle(1));
            textView.setText("(");
            textView.setTextColor(Color.parseColor("#5f5f5f"));
            TextView textView2 = new TextView(getContext());
            textView2.setTypeface(Typeface.defaultFromStyle(1));
            textView2.setGravity(17);
            textView2.setTextColor(Color.parseColor("#5f5f5f"));
            Drawable drawable = getResources().getDrawable(C8594o.m24812a(getContext(), "mbridge_reward_user", "drawable"));
            drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
            textView2.setCompoundDrawables(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
            textView2.setText(this.f22671b + " )");
            linearLayout.addView(textView, layoutParams2);
            linearLayout.addView(textView2, layoutParams2);
        }
        double d = this.f22670a;
        if (d == 0.0d) {
            d = 5.0d;
        }
        for (int i = 0; i < 5; i++) {
            ImageView imageView = new ImageView(getContext());
            LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(0, dip2px(getContext(), 13.0f));
            if (((double) i) < d) {
                imageView.setImageResource(C8594o.m24812a(getContext(), "mbridge_download_message_dialog_star_sel", "drawable"));
            } else {
                imageView.setImageResource(C8594o.m24812a(getContext(), "mbridge_download_message_dilaog_star_nor", "drawable"));
            }
            layoutParams3.weight = 1.0f;
            if (linearLayout2 != null) {
                linearLayout2.addView(imageView, layoutParams3);
            } else {
                addView(imageView, layoutParams3);
            }
        }
        if (linearLayout2 != null && linearLayout2 != null) {
            addView(linearLayout2);
            addView(linearLayout);
        }
    }

    public static int dip2px(Context context, float f) {
        Resources resources;
        if (context == null || (resources = context.getResources()) == null) {
            return 0;
        }
        return (int) ((f * resources.getDisplayMetrics().density) + 0.5f);
    }
}

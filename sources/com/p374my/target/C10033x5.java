package com.p374my.target;

import android.content.Context;
import android.graphics.Typeface;
import android.util.TypedValue;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

/* renamed from: com.my.target.x5 */
public class C10033x5 extends RelativeLayout {

    /* renamed from: a */
    public final TextView f24893a;

    /* renamed from: b */
    public final View f24894b;

    /* renamed from: c */
    public String f24895c;

    /* renamed from: d */
    public C10034a f24896d;

    /* renamed from: com.my.target.x5$a */
    public interface C10034a {
        /* renamed from: a */
        void mo63322a();
    }

    public C10033x5(Context context) {
        super(context);
        TextView textView = new TextView(context);
        this.f24893a = textView;
        textView.setTextColor(-1);
        textView.setTypeface((Typeface) null, 1);
        textView.setTextSize(2, 20.0f);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.leftMargin = (int) TypedValue.applyDimension(1, 8.0f, getContext().getResources().getDisplayMetrics());
        layoutParams.addRule(15);
        layoutParams.addRule(1, 256);
        addView(textView, layoutParams);
        setBackgroundColor(-7829368);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, (int) (C10059y8.m29821a() + 0.5f));
        layoutParams2.addRule(12);
        View view = new View(context);
        this.f24894b = view;
        view.setBackgroundColor(-10066330);
        addView(view, layoutParams2);
        C9720g6 g6Var = new C9720g6(context);
        g6Var.mo64102a(C9885o5.m28930a(), false);
        g6Var.setId(256);
        g6Var.setOnClickListener(new View.OnClickListener() {
            public final void onClick(View view) {
                C10033x5.this.m29706a(view);
            }
        });
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams3.leftMargin = (int) TypedValue.applyDimension(1, 5.0f, getContext().getResources().getDisplayMetrics());
        layoutParams3.addRule(15);
        layoutParams3.addRule(9);
        g6Var.setLayoutParams(layoutParams3);
        addView(g6Var);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m29706a(View view) {
        C10034a aVar = this.f24896d;
        if (aVar != null) {
            aVar.mo63322a();
        }
    }

    public String getTitle() {
        return this.f24895c;
    }

    public void setMainColor(int i) {
        setBackgroundColor(i);
    }

    public void setOnCloseClickListener(C10034a aVar) {
        this.f24896d = aVar;
    }

    public void setStripeColor(int i) {
        this.f24894b.setBackgroundColor(i);
    }

    public void setTitle(String str) {
        this.f24895c = str;
        this.f24893a.setText(str);
    }

    public void setTitleColor(int i) {
        this.f24893a.setTextColor(i);
    }
}

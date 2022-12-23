package com.p374my.target;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import com.p374my.target.nativeads.views.MediaAdView;

/* renamed from: com.my.target.f7 */
public class C9703f7 extends RelativeLayout {

    /* renamed from: a */
    public static final int f23899a = C10059y8.m29841c();

    /* renamed from: b */
    public static final int f23900b = C10059y8.m29841c();

    /* renamed from: c */
    public final C10021w6 f23901c;

    /* renamed from: d */
    public final Button f23902d;

    /* renamed from: e */
    public final C9629b6 f23903e;

    /* renamed from: f */
    public final C10035x6 f23904f;

    /* renamed from: g */
    public final C10059y8 f23905g;

    /* renamed from: h */
    public final boolean f23906h;

    public C9703f7(Context context, C10059y8 y8Var, boolean z) {
        super(context);
        this.f23905g = y8Var;
        this.f23906h = z;
        C10035x6 x6Var = new C10035x6(context, y8Var, z);
        this.f23904f = x6Var;
        C10059y8.m29840b(x6Var, "footer_layout");
        C10021w6 w6Var = new C10021w6(context, y8Var, z);
        this.f23901c = w6Var;
        C10059y8.m29840b(w6Var, "body_layout");
        Button button = new Button(context);
        this.f23902d = button;
        C10059y8.m29840b(button, "cta_button");
        C9629b6 b6Var = new C9629b6(context);
        this.f23903e = b6Var;
        C10059y8.m29840b(b6Var, "age_bordering");
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ boolean m28035a(C9929r1 r1Var, View.OnClickListener onClickListener, View view, MotionEvent motionEvent) {
        if (!r1Var.f24590j) {
            return true;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f23901c.setBackgroundColor(-3806472);
        } else if (action == 1) {
            this.f23901c.setBackgroundColor(-1);
            onClickListener.onClick(view);
        } else if (action == 3) {
            setBackgroundColor(-1);
        }
        return true;
    }

    /* renamed from: a */
    public void mo64032a(int i, int i2, boolean z) {
        float f;
        Button button;
        boolean z2 = z;
        int max = Math.max(i2, i) / 8;
        this.f23901c.mo65677a(z2);
        this.f23904f.mo65710a();
        View view = new View(getContext());
        view.setBackgroundColor(-5592406);
        view.setLayoutParams(new RelativeLayout.LayoutParams(-1, 1));
        C10035x6 x6Var = this.f23904f;
        int i3 = f23899a;
        x6Var.setId(i3);
        this.f23904f.mo65711a(max, z2);
        this.f23902d.setPadding(this.f23905g.mo65778b(15), 0, this.f23905g.mo65778b(15), 0);
        this.f23902d.setMinimumWidth(this.f23905g.mo65778b(100));
        this.f23902d.setTransformationMethod((TransformationMethod) null);
        this.f23902d.setSingleLine();
        this.f23902d.setEllipsize(TextUtils.TruncateAt.END);
        this.f23903e.mo63621a(1, -7829368);
        this.f23903e.setPadding(this.f23905g.mo65778b(2), 0, 0, 0);
        this.f23903e.setTextColor(MediaAdView.COLOR_PLACEHOLDER_GRAY);
        this.f23903e.setMaxEms(5);
        this.f23903e.mo63622a(1, MediaAdView.COLOR_PLACEHOLDER_GRAY, this.f23905g.mo65778b(3));
        this.f23903e.setBackgroundColor(1711276032);
        C10021w6 w6Var = this.f23901c;
        int i4 = f23900b;
        w6Var.setId(i4);
        if (z2) {
            this.f23901c.setPadding(this.f23905g.mo65778b(4), this.f23905g.mo65778b(4), this.f23905g.mo65778b(4), this.f23905g.mo65778b(4));
        } else {
            this.f23901c.setPadding(this.f23905g.mo65778b(16), this.f23905g.mo65778b(16), this.f23905g.mo65778b(16), this.f23905g.mo65778b(16));
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(2, i3);
        this.f23901c.setLayoutParams(layoutParams);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        C10059y8 y8Var = this.f23905g;
        layoutParams2.setMargins(this.f23905g.mo65778b(16), z2 ? y8Var.mo65778b(8) : y8Var.mo65778b(16), this.f23905g.mo65778b(16), this.f23905g.mo65778b(4));
        layoutParams2.addRule(Build.VERSION.SDK_INT >= 17 ? 21 : 11, -1);
        this.f23903e.setLayoutParams(layoutParams2);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, this.f23906h ? this.f23905g.mo65778b(64) : this.f23905g.mo65778b(52));
        layoutParams3.addRule(14, -1);
        layoutParams3.addRule(8, i4);
        int i5 = -this.f23905g.mo65778b(52);
        layoutParams3.bottomMargin = z2 ? (int) (((double) i5) / 1.5d) : i5 / 2;
        this.f23902d.setLayoutParams(layoutParams3);
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-1, max);
        layoutParams4.addRule(12, -1);
        this.f23904f.setLayoutParams(layoutParams4);
        addView(this.f23901c);
        addView(view);
        addView(this.f23903e);
        addView(this.f23904f);
        addView(this.f23902d);
        setClickable(true);
        if (this.f23906h) {
            button = this.f23902d;
            f = 32.0f;
        } else {
            button = this.f23902d;
            f = 22.0f;
        }
        button.setTextSize(2, f);
    }

    /* renamed from: a */
    public void mo64033a(C9929r1 r1Var, View.OnClickListener onClickListener) {
        boolean z;
        Button button;
        this.f23901c.mo65676a(r1Var, onClickListener);
        if (r1Var.f24595o) {
            this.f23902d.setOnClickListener(onClickListener);
            return;
        }
        if (r1Var.f24589i) {
            this.f23902d.setOnClickListener(onClickListener);
            button = this.f23902d;
            z = true;
        } else {
            this.f23902d.setOnClickListener((View.OnClickListener) null);
            button = this.f23902d;
            z = false;
        }
        button.setEnabled(z);
        this.f23903e.setOnTouchListener(new View.OnTouchListener(r1Var, onClickListener) {
            public final /* synthetic */ C9929r1 f$1;
            public final /* synthetic */ View.OnClickListener f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return C9703f7.this.m28035a(this.f$1, this.f$2, view, motionEvent);
            }
        });
    }

    public void setBanner(C9697f2 f2Var) {
        this.f23901c.setBanner(f2Var);
        this.f23902d.setText(f2Var.getCtaText());
        this.f23904f.setBackgroundColor(-39322);
        if (TextUtils.isEmpty(f2Var.getAgeRestrictions())) {
            this.f23903e.setVisibility(8);
        } else {
            this.f23903e.setText(f2Var.getAgeRestrictions());
        }
        C10059y8.m29839b(this.f23902d, -16733198, -16746839, this.f23905g.mo65778b(2));
        this.f23902d.setTextColor(-1);
    }
}

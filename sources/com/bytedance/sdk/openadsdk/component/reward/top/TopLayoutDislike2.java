package com.bytedance.sdk.openadsdk.component.reward.top;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.sdk.component.utils.C2984t;
import com.bytedance.sdk.openadsdk.core.C3578m;
import com.bytedance.sdk.openadsdk.core.p151e.C3498n;

public class TopLayoutDislike2 extends FrameLayout implements C3378a<TopLayoutDislike2> {

    /* renamed from: a */
    private View f8089a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public ImageView f8090b;

    /* renamed from: c */
    private TextView f8091c;

    /* renamed from: d */
    private boolean f8092d;

    /* renamed from: e */
    private C3498n f8093e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public boolean f8094f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public C3379b f8095g;

    /* renamed from: h */
    private CharSequence f8096h;

    /* renamed from: i */
    private CharSequence f8097i;

    public TopLayoutDislike2(Context context) {
        this(context, (AttributeSet) null);
    }

    public TopLayoutDislike2(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TopLayoutDislike2(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f8096h = "";
        this.f8097i = "";
    }

    /* renamed from: a */
    public TopLayoutDislike2 mo19241a(boolean z, C3498n nVar) {
        this.f8092d = z;
        this.f8093e = nVar;
        LayoutInflater.from(getContext()).inflate(C2984t.m8433f(getContext(), "tt_top_reward_dislike_2"), this, true);
        this.f8089a = findViewById(C2984t.m8432e(getContext(), "tt_top_dislike"));
        if (nVar.mo19679aw()) {
            this.f8089a.setVisibility(8);
        }
        ((TextView) this.f8089a).setText(C2984t.m8425a(C3578m.m11231a(), "tt_reward_feedback"));
        this.f8090b = (ImageView) findViewById(C2984t.m8432e(getContext(), "tt_top_mute"));
        TextView textView = (TextView) findViewById(C2984t.m8432e(getContext(), "tt_top_skip"));
        this.f8091c = textView;
        textView.setVisibility(0);
        this.f8091c.setText("");
        this.f8091c.setEnabled(false);
        this.f8091c.setClickable(false);
        m10037d();
        return this;
    }

    /* renamed from: d */
    private void m10037d() {
        View view = this.f8089a;
        if (view != null) {
            view.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    if (TopLayoutDislike2.this.f8095g != null) {
                        TopLayoutDislike2.this.f8095g.mo18526c(view);
                    }
                }
            });
        }
        ImageView imageView = this.f8090b;
        if (imageView != null) {
            imageView.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    int i;
                    TopLayoutDislike2 topLayoutDislike2 = TopLayoutDislike2.this;
                    boolean unused = topLayoutDislike2.f8094f = !topLayoutDislike2.f8094f;
                    if (TopLayoutDislike2.this.f8094f) {
                        i = C2984t.m8431d(TopLayoutDislike2.this.getContext(), "tt_mute");
                    } else {
                        i = C2984t.m8431d(TopLayoutDislike2.this.getContext(), "tt_unmute");
                    }
                    TopLayoutDislike2.this.f8090b.setImageResource(i);
                    if (TopLayoutDislike2.this.f8095g != null) {
                        TopLayoutDislike2.this.f8095g.mo18525b(view);
                    }
                }
            });
        }
        TextView textView = this.f8091c;
        if (textView != null) {
            textView.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    if (TopLayoutDislike2.this.f8095g != null) {
                        TopLayoutDislike2.this.f8095g.mo18524a(view);
                    }
                }
            });
        }
    }

    public void setShowSkip(boolean z) {
        TextView textView = this.f8091c;
        if (textView != null) {
            if (!z) {
                textView.setText("");
            }
            if (this.f8091c.getVisibility() != 4) {
                this.f8091c.setVisibility(z ? 0 : 8);
            }
        }
    }

    public void setSkipEnable(boolean z) {
        TextView textView = this.f8091c;
        if (textView != null) {
            textView.setEnabled(z);
            this.f8091c.setClickable(z);
        }
    }

    public void setShowSound(boolean z) {
        ImageView imageView = this.f8090b;
        if (imageView != null) {
            imageView.setVisibility(z ? 0 : 8);
        }
    }

    public void setSoundMute(boolean z) {
        int i;
        this.f8094f = z;
        if (z) {
            i = C2984t.m8431d(getContext(), "tt_mute");
        } else {
            i = C2984t.m8431d(getContext(), "tt_unmute");
        }
        this.f8090b.setImageResource(i);
    }

    /* renamed from: a */
    public void mo19243a(CharSequence charSequence, CharSequence charSequence2) {
        if (!TextUtils.isEmpty(charSequence)) {
            this.f8096h = charSequence;
        }
        if (!TextUtils.isEmpty(charSequence2)) {
            this.f8097i = charSequence2;
        }
        if (this.f8091c != null) {
            CharSequence charSequence3 = this.f8096h;
            if (!TextUtils.isEmpty(this.f8097i)) {
                charSequence3 = charSequence3 + " | " + this.f8097i;
            }
            this.f8091c.setText(charSequence3);
        }
    }

    public void setShowDislike(boolean z) {
        View view = this.f8089a;
        if (view != null) {
            view.setVisibility(z ? 0 : 8);
        }
    }

    public void setListener(C3379b bVar) {
        this.f8095g = bVar;
    }

    /* renamed from: a */
    public void mo19242a() {
        TextView textView = this.f8091c;
        if (textView != null) {
            textView.performClick();
        }
    }

    /* renamed from: b */
    public void mo19244b() {
        ImageView imageView = this.f8090b;
        if (imageView != null) {
            imageView.performClick();
        }
    }

    /* renamed from: c */
    public void mo19245c() {
        this.f8091c.setWidth(20);
        this.f8091c.setVisibility(4);
    }
}

package com.bytedance.sdk.openadsdk.core.widget;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.sdk.component.utils.C2984t;
import com.bytedance.sdk.openadsdk.core.C3578m;

/* renamed from: com.bytedance.sdk.openadsdk.core.widget.a */
/* compiled from: CustomCommonDialog */
public class C3742a extends Dialog {

    /* renamed from: a */
    public C3745a f9711a;

    /* renamed from: b */
    private ImageView f9712b;

    /* renamed from: c */
    private TextView f9713c;

    /* renamed from: d */
    private TextView f9714d;

    /* renamed from: e */
    private Button f9715e;

    /* renamed from: f */
    private Button f9716f;

    /* renamed from: g */
    private View f9717g;

    /* renamed from: h */
    private Context f9718h;

    /* renamed from: i */
    private String f9719i;

    /* renamed from: j */
    private String f9720j;

    /* renamed from: k */
    private String f9721k;

    /* renamed from: l */
    private String f9722l;

    /* renamed from: m */
    private int f9723m = -1;

    /* renamed from: n */
    private boolean f9724n = false;

    /* renamed from: com.bytedance.sdk.openadsdk.core.widget.a$a */
    /* compiled from: CustomCommonDialog */
    public interface C3745a {
        /* renamed from: a */
        void mo18582a();

        /* renamed from: b */
        void mo18583b();
    }

    public void onBackPressed() {
    }

    public C3742a(Context context) {
        super(context, C2984t.m8434g(context, "tt_custom_dialog"));
        this.f9718h = context;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C2984t.m8433f(this.f9718h, "tt_custom_dailog_layout"));
        setCanceledOnTouchOutside(false);
        m12292c();
        m12291b();
        m12290a();
    }

    /* renamed from: a */
    private void m12290a() {
        this.f9716f.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (C3742a.this.f9711a != null) {
                    C3742a.this.f9711a.mo18582a();
                }
            }
        });
        this.f9715e.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (C3742a.this.f9711a != null) {
                    C3742a.this.f9711a.mo18583b();
                }
            }
        });
    }

    /* renamed from: b */
    private void m12291b() {
        if (!TextUtils.isEmpty(this.f9720j)) {
            this.f9713c.setText(this.f9720j);
            this.f9713c.setVisibility(0);
        } else {
            this.f9713c.setVisibility(8);
        }
        if (!TextUtils.isEmpty(this.f9719i)) {
            this.f9714d.setText(this.f9719i);
        }
        if (!TextUtils.isEmpty(this.f9721k)) {
            this.f9716f.setText(this.f9721k);
        } else {
            this.f9716f.setText(C2984t.m8425a(C3578m.m11231a(), "tt_postive_txt"));
        }
        if (!TextUtils.isEmpty(this.f9722l)) {
            this.f9715e.setText(this.f9722l);
        } else {
            this.f9715e.setText(C2984t.m8425a(C3578m.m11231a(), "tt_negtive_txt"));
        }
        int i = this.f9723m;
        if (i != -1) {
            this.f9712b.setImageResource(i);
            this.f9712b.setVisibility(0);
        } else {
            this.f9712b.setVisibility(8);
        }
        if (this.f9724n) {
            this.f9717g.setVisibility(8);
            this.f9715e.setVisibility(8);
            return;
        }
        this.f9715e.setVisibility(0);
        this.f9717g.setVisibility(0);
    }

    public void show() {
        super.show();
        m12291b();
    }

    /* renamed from: c */
    private void m12292c() {
        this.f9715e = (Button) findViewById(C2984t.m8432e(this.f9718h, "tt_negtive"));
        this.f9716f = (Button) findViewById(C2984t.m8432e(this.f9718h, "tt_positive"));
        this.f9713c = (TextView) findViewById(C2984t.m8432e(this.f9718h, "tt_title"));
        this.f9714d = (TextView) findViewById(C2984t.m8432e(this.f9718h, "tt_message"));
        this.f9712b = (ImageView) findViewById(C2984t.m8432e(this.f9718h, "tt_image"));
        this.f9717g = findViewById(C2984t.m8432e(this.f9718h, "tt_column_line"));
    }

    /* renamed from: a */
    public C3742a mo20526a(C3745a aVar) {
        this.f9711a = aVar;
        return this;
    }

    /* renamed from: a */
    public C3742a mo20527a(String str) {
        this.f9719i = str;
        return this;
    }

    /* renamed from: b */
    public C3742a mo20528b(String str) {
        this.f9721k = str;
        return this;
    }

    /* renamed from: c */
    public C3742a mo20529c(String str) {
        this.f9722l = str;
        return this;
    }
}

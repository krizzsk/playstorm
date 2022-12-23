package com.mbridge.msdk.foundation.p064b.p065a;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import com.mbridge.msdk.foundation.controller.C2350a;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.p064b.C2339a;
import com.mbridge.msdk.foundation.p064b.C2347b;
import com.mbridge.msdk.foundation.tools.C8608u;
import com.mbridge.msdk.foundation.tools.C8613y;
import com.mbridge.msdk.p054c.C2278a;
import com.mbridge.msdk.p054c.C2283b;
import com.mbridge.msdk.widget.FeedBackButton;
import com.mbridge.msdk.widget.FeedbackRadioGroup;
import com.mbridge.msdk.widget.dialog.C9593a;
import com.mbridge.msdk.widget.dialog.MBFeedBackDialog;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;

/* renamed from: com.mbridge.msdk.foundation.b.a.a */
/* compiled from: FeedBackBtnBean */
public final class C2340a {

    /* renamed from: t */
    private static int f4864t = -1;
    /* access modifiers changed from: private */

    /* renamed from: y */
    public static String f4865y;

    /* renamed from: a */
    private String f4866a;

    /* renamed from: b */
    private CampaignEx f4867b;

    /* renamed from: c */
    private FeedBackButton f4868c;

    /* renamed from: d */
    private int f4869d;

    /* renamed from: e */
    private int f4870e;

    /* renamed from: f */
    private int f4871f = -1;

    /* renamed from: g */
    private int f4872g = -1;

    /* renamed from: h */
    private int f4873h = -1;

    /* renamed from: i */
    private int f4874i = -1;

    /* renamed from: j */
    private float f4875j = -1.0f;

    /* renamed from: k */
    private JSONArray f4876k;

    /* renamed from: l */
    private int f4877l = -1;

    /* renamed from: m */
    private int f4878m = -1;

    /* renamed from: n */
    private int f4879n = -1;

    /* renamed from: o */
    private int f4880o = -1;

    /* renamed from: p */
    private String f4881p;

    /* renamed from: q */
    private String f4882q;

    /* renamed from: r */
    private float f4883r = 1.0f;

    /* renamed from: s */
    private int f4884s = C8613y.m24929b(C2350a.m5601e().mo15792g(), 20.0f);

    /* renamed from: u */
    private int f4885u = f4864t;
    /* access modifiers changed from: private */

    /* renamed from: v */
    public MBFeedBackDialog f4886v;

    /* renamed from: w */
    private List<C2346a> f4887w = new ArrayList();

    /* renamed from: x */
    private C9593a f4888x = new C9593a() {
        /* renamed from: a */
        public final void mo15754a() {
            C2340a.m5549a(C2340a.this);
        }

        /* renamed from: b */
        public final void mo15755b() {
            C2340a.m5551b(C2340a.this);
        }
    };

    public C2340a(String str) {
        this.f4866a = str;
        if (this.f4887w == null) {
            this.f4887w = new ArrayList();
        }
        m5554i();
        m5557l();
        m5555j();
    }

    /* renamed from: i */
    private void m5554i() {
        if (this.f4888x == null) {
            this.f4888x = new C9593a() {
                /* renamed from: a */
                public final void mo15754a() {
                    C2340a.m5549a(C2340a.this);
                }

                /* renamed from: b */
                public final void mo15755b() {
                    C2340a.m5551b(C2340a.this);
                }
            };
        }
    }

    /* renamed from: a */
    public final void mo15740a() {
        C2347b.m5579a().mo15764a(this.f4866a, 0, 1, f4865y);
        Activity a = C2347b.m5579a().mo15760a(C2350a.m5601e().mo15792g());
        MBFeedBackDialog mBFeedBackDialog = this.f4886v;
        if (mBFeedBackDialog == null || mBFeedBackDialog.getContext() != a) {
            m5555j();
        }
        Context g = C2350a.m5601e().mo15792g();
        FeedBackButton feedBackButton = this.f4868c;
        if (feedBackButton != null) {
            g = feedBackButton.getContext();
        }
        int i = C2347b.m5579a().mo15770a(this.f4866a, g, this.f4886v) ? 2 : 3;
        if (i == 2) {
            C2347b.m5579a().mo15764a(this.f4866a, 0, 2, f4865y);
        } else {
            C2347b.m5579a().mo15764a(this.f4866a, 0, 3, f4865y);
        }
        List<C2346a> list = this.f4887w;
        if (list != null) {
            for (C2346a next : list) {
                if (next != null) {
                    next.mo15759a(i);
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo15746b() {
        MBFeedBackDialog mBFeedBackDialog = this.f4886v;
        if (mBFeedBackDialog != null && mBFeedBackDialog.isShowing()) {
            this.f4886v.cancel();
        }
    }

    /* renamed from: j */
    private void m5555j() {
        try {
            if (C2347b.m5579a().mo15760a(C2350a.m5601e().mo15792g()) != null) {
                C2278a b = C2283b.m5275a().mo15563b(C2350a.m5601e().mo15793h());
                if (b == null) {
                    b = C2283b.m5275a().mo15562b();
                }
                C2278a.C2280b ao = b.mo15476ao();
                if (ao == null) {
                    C8608u.m24882b("", "feedback fbk is null");
                    return;
                }
                m5554i();
                this.f4886v = new MBFeedBackDialog(C2347b.m5579a().mo15760a(C2350a.m5601e().mo15792g()), this.f4888x);
                FeedbackRadioGroup a = m5546a(ao);
                this.f4886v.setCancelText(ao.mo15555c());
                this.f4886v.setConfirmText(ao.mo15554b());
                this.f4886v.setTitle(ao.mo15553a());
                this.f4886v.setContent(a);
                this.f4886v.setCancelButtonClickable(!TextUtils.isEmpty(f4865y));
                m5550a(a, ao);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public final void mo15741a(int i) {
        this.f4885u = i;
        FeedBackButton feedBackButton = this.f4868c;
        if (feedBackButton != null) {
            feedBackButton.setVisibility(i);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0050  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m5550a(com.mbridge.msdk.widget.FeedbackRadioGroup r12, com.mbridge.msdk.p054c.C2278a.C2280b r13) {
        /*
            r11 = this;
            org.json.JSONArray r13 = r13.mo15556d()
            com.mbridge.msdk.foundation.controller.a r0 = com.mbridge.msdk.foundation.controller.C2350a.m5601e()
            android.content.Context r0 = r0.mo15792g()
            if (r13 == 0) goto L_0x007e
            int r1 = r13.length()
            if (r1 <= 0) goto L_0x007e
            if (r0 == 0) goto L_0x007e
            java.lang.String r1 = "mbridge_cm_feedback_choice_btn_bg"
            java.lang.String r2 = "drawable"
            int r1 = com.mbridge.msdk.foundation.tools.C8594o.m24812a(r0, r1, r2)
            android.content.res.Resources r2 = com.mbridge.msdk.foundation.tools.C8594o.m24813a(r0)
            java.lang.String r3 = "mbridge_cm_feedback_rb_text_color_color_list"
            java.lang.String r4 = "color"
            int r3 = com.mbridge.msdk.foundation.tools.C8594o.m24812a(r0, r3, r4)
            r4 = 0
            if (r2 == 0) goto L_0x0036
            android.content.res.ColorStateList r2 = r2.getColorStateList(r3)     // Catch:{ Exception -> 0x0032 }
            goto L_0x0037
        L_0x0032:
            r2 = move-exception
            r2.printStackTrace()
        L_0x0036:
            r2 = r4
        L_0x0037:
            r3 = 1096810496(0x41600000, float:14.0)
            int r3 = com.mbridge.msdk.foundation.tools.C8613y.m24929b((android.content.Context) r0, (float) r3)
            r5 = 1088421888(0x40e00000, float:7.0)
            int r5 = com.mbridge.msdk.foundation.tools.C8613y.m24929b((android.content.Context) r0, (float) r5)
            r6 = 1086324736(0x40c00000, float:6.0)
            int r6 = com.mbridge.msdk.foundation.tools.C8613y.m24929b((android.content.Context) r0, (float) r6)
            r7 = 0
        L_0x004a:
            int r8 = r13.length()
            if (r7 >= r8) goto L_0x007e
            java.lang.String r8 = r13.optString(r7)
            android.widget.RadioButton r9 = new android.widget.RadioButton
            r9.<init>(r0)
            r9.setButtonDrawable(r4)
            r9.setBackgroundResource(r1)
            r9.setText(r8)
            if (r2 == 0) goto L_0x0067
            r9.setTextColor(r2)
        L_0x0067:
            r9.setPadding(r3, r5, r3, r5)
            android.widget.RadioGroup$LayoutParams r8 = new android.widget.RadioGroup$LayoutParams
            r10 = -2
            r8.<init>(r10, r10)
            int r10 = r6 / 4
            r8.setMargins(r6, r10, r6, r10)
            r11.m5548a((android.widget.RadioButton) r9)
            r12.addView(r9, r8)
            int r7 = r7 + 1
            goto L_0x004a
        L_0x007e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.p064b.p065a.C2340a.m5550a(com.mbridge.msdk.widget.FeedbackRadioGroup, com.mbridge.msdk.c.a$b):void");
    }

    /* renamed from: a */
    private FeedbackRadioGroup m5546a(C2278a.C2280b bVar) {
        JSONArray d = bVar.mo15556d();
        Context g = C2350a.m5601e().mo15792g();
        if (d == null || d.length() <= 0 || g == null) {
            return null;
        }
        FeedbackRadioGroup feedbackRadioGroup = new FeedbackRadioGroup(g);
        feedbackRadioGroup.setOrientation(0);
        return feedbackRadioGroup;
    }

    /* renamed from: a */
    private void m5548a(RadioButton radioButton) {
        if (radioButton != null) {
            radioButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                    if (z) {
                        String unused = C2340a.f4865y = (String) compoundButton.getText();
                    }
                    if (C2340a.this.f4886v != null) {
                        C2340a.this.f4886v.setCancelButtonClickable(!TextUtils.isEmpty(C2340a.f4865y));
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public final void mo15743a(C2346a aVar) {
        if (this.f4887w == null) {
            this.f4887w = new ArrayList();
        }
        this.f4887w.add(aVar);
    }

    /* renamed from: k */
    private void m5556k() {
        FeedBackButton feedBackButton = this.f4868c;
        if (feedBackButton != null) {
            int i = this.f4871f;
            if (i > -1) {
                feedBackButton.setX((float) i);
            }
            int i2 = this.f4872g;
            if (i2 > -1) {
                this.f4868c.setY((float) i2);
            }
            float f = this.f4883r;
            if (f >= 0.0f) {
                this.f4868c.setAlpha(f);
                this.f4868c.setEnabled(this.f4883r != 0.0f);
            }
            ViewGroup.LayoutParams layoutParams = this.f4868c.getLayoutParams();
            int i3 = this.f4873h;
            if (i3 > 0) {
                this.f4868c.setWidth(i3);
                if (layoutParams != null) {
                    layoutParams.width = this.f4873h;
                }
            }
            int i4 = this.f4874i;
            if (i4 > 0) {
                this.f4868c.setHeight(i4);
                if (layoutParams != null) {
                    layoutParams.height = this.f4874i;
                }
            }
            if (layoutParams != null) {
                this.f4868c.setLayoutParams(layoutParams);
            }
            try {
                if (!TextUtils.isEmpty(this.f4881p)) {
                    this.f4868c.setTextColor(Color.parseColor(this.f4881p));
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            float f2 = this.f4875j;
            if (f2 > 0.0f) {
                this.f4868c.setTextSize(f2);
            }
            JSONArray jSONArray = this.f4876k;
            if (jSONArray != null && jSONArray.length() == 4) {
                Context g = C2350a.m5601e().mo15792g();
                this.f4868c.setPadding(C8613y.m24929b(g, (float) this.f4876k.optDouble(0)), C8613y.m24929b(g, (float) this.f4876k.optDouble(1)), C8613y.m24929b(g, (float) this.f4876k.optDouble(2)), C8613y.m24929b(g, (float) this.f4876k.optDouble(3)));
            }
            GradientDrawable gradientDrawable = new GradientDrawable();
            int i5 = this.f4884s;
            if (i5 > 0) {
                gradientDrawable.setCornerRadius((float) i5);
            }
            if (!TextUtils.isEmpty(this.f4882q)) {
                gradientDrawable.setColor(Color.parseColor(this.f4882q));
            } else {
                gradientDrawable.setColor(Color.parseColor(FeedBackButton.FEEDBACK_BTN_BACKGROUND_COLOR_STR));
            }
            this.f4868c.setBackground(gradientDrawable);
        }
    }

    /* renamed from: a */
    public final void mo15742a(int i, int i2, int i3, int i4, int i5, float f, String str, String str2, float f2, JSONArray jSONArray) {
        if (i > -1) {
            this.f4871f = i;
        }
        if (i2 > -1) {
            this.f4872g = i2;
        }
        if (i3 > -1) {
            this.f4873h = i3;
        }
        if (i4 > -1) {
            this.f4874i = i4;
        }
        if (f2 > -1.0f) {
            this.f4875j = f2;
        }
        if (jSONArray != null) {
            this.f4876k = jSONArray;
        }
        this.f4881p = str;
        this.f4882q = str2;
        this.f4883r = f;
        this.f4884s = i5;
        m5556k();
    }

    /* renamed from: l */
    private void m5557l() {
        Context g = C2350a.m5601e().mo15792g();
        if (g != null) {
            try {
                FeedBackButton feedBackButton = new FeedBackButton(g);
                this.f4868c = feedBackButton;
                int i = 8;
                if (this.f4885u != 8) {
                    i = 0;
                }
                feedBackButton.setVisibility(i);
                this.f4868c.setOnClickListener(new View.OnClickListener() {
                    public final void onClick(View view) {
                        C2340a.this.mo15740a();
                    }
                });
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: c */
    public final FeedBackButton mo15748c() {
        if (this.f4868c == null) {
            m5557l();
        }
        return this.f4868c;
    }

    /* renamed from: d */
    public final void mo15750d() {
        FeedBackButton feedBackButton = this.f4868c;
        if (feedBackButton != null) {
            feedBackButton.setOnClickListener((View.OnClickListener) null);
            this.f4868c.setVisibility(8);
            ViewGroup viewGroup = (ViewGroup) this.f4868c.getParent();
            if (viewGroup != null) {
                viewGroup.removeView(this.f4868c);
            }
        }
        MBFeedBackDialog mBFeedBackDialog = this.f4886v;
        if (mBFeedBackDialog != null) {
            mBFeedBackDialog.cancel();
            this.f4886v.setListener((C9593a) null);
        }
        this.f4886v = null;
        this.f4887w = null;
        this.f4868c = null;
        this.f4888x = null;
    }

    /* renamed from: e */
    public final CampaignEx mo15751e() {
        return this.f4867b;
    }

    /* renamed from: a */
    public final void mo15744a(CampaignEx campaignEx) {
        this.f4867b = campaignEx;
    }

    /* renamed from: f */
    public final int mo15752f() {
        return this.f4869d;
    }

    /* renamed from: b */
    public final void mo15747b(int i) {
        this.f4869d = i;
    }

    /* renamed from: g */
    public final int mo15753g() {
        return this.f4870e;
    }

    /* renamed from: c */
    public final void mo15749c(int i) {
        this.f4870e = i;
    }

    /* renamed from: com.mbridge.msdk.foundation.b.a.a$a */
    /* compiled from: FeedBackBtnBean */
    public static class C2346a implements C9593a {

        /* renamed from: a */
        private C2339a f4894a;

        /* renamed from: b */
        private String f4895b;

        public C2346a(String str, C2339a aVar) {
            this.f4894a = aVar;
            this.f4895b = str;
        }

        /* renamed from: a */
        public final void mo15754a() {
            C2347b.f4898c = false;
            C2339a aVar = this.f4894a;
            if (aVar != null) {
                aVar.mo15738a(C2340a.f4865y);
            }
        }

        /* renamed from: b */
        public final void mo15755b() {
            C2347b.f4898c = false;
            C2339a aVar = this.f4894a;
            if (aVar != null) {
                aVar.mo15739b();
            }
        }

        /* renamed from: a */
        public final void mo15759a(int i) {
            C2347b.f4898c = true;
            C2339a aVar = this.f4894a;
            if (aVar != null && i == 2) {
                aVar.mo15737a();
            }
        }
    }

    /* renamed from: a */
    public final void mo15745a(FeedBackButton feedBackButton) {
        FeedBackButton feedBackButton2 = this.f4868c;
        int i = 8;
        if (feedBackButton2 != null) {
            feedBackButton2.setVisibility(8);
        }
        if (feedBackButton != null) {
            feedBackButton.setAlpha(this.f4883r);
            feedBackButton.setEnabled(this.f4883r != 0.0f);
            if (this.f4885u != 8) {
                i = 0;
            }
            feedBackButton.setVisibility(i);
            this.f4868c = feedBackButton;
            m5556k();
            feedBackButton.setOnClickListener(new View.OnClickListener() {
                public final void onClick(View view) {
                    C2340a.this.mo15740a();
                }
            });
        }
    }

    /* renamed from: a */
    static /* synthetic */ void m5549a(C2340a aVar) {
        C2347b.m5579a().mo15764a(aVar.f4866a, 1, 4, f4865y);
        List<C2346a> list = aVar.f4887w;
        if (list != null) {
            for (C2346a next : list) {
                if (next != null) {
                    next.mo15754a();
                }
            }
        }
        f4865y = "";
    }

    /* renamed from: b */
    static /* synthetic */ void m5551b(C2340a aVar) {
        C2347b.m5579a().mo15764a(aVar.f4866a, 0, 4, f4865y);
        List<C2346a> list = aVar.f4887w;
        if (list != null) {
            for (C2346a next : list) {
                if (next != null) {
                    next.mo15755b();
                }
            }
        }
        f4865y = "";
    }
}

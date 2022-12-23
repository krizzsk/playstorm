package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.widget.TextView;
import com.bytedance.sdk.component.adexpress.C2640c;
import com.bytedance.sdk.component.adexpress.dynamic.p100b.C2688h;
import com.bytedance.sdk.component.adexpress.p096c.C2642b;
import com.bytedance.sdk.component.adexpress.widget.AnimationText;
import com.bytedance.sdk.component.utils.C2975l;
import com.bytedance.sdk.component.utils.C2984t;
import java.text.DecimalFormat;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;

public class DynamicTextView extends DynamicBaseWidgetImp {
    public DynamicTextView(Context context, DynamicRootView dynamicRootView, C2688h hVar) {
        super(context, dynamicRootView, hVar);
        if (this.f5974l.mo17099A()) {
            this.f5977o = new AnimationText(context, this.f5974l.mo17118g(), this.f5974l.mo17116e(), 1, this.f5974l.mo17119h());
            ((AnimationText) this.f5977o).setMaxLines(1);
        } else {
            this.f5977o = new TextView(context);
        }
        this.f5977o.setTag(Integer.valueOf(getClickArea()));
        addView(this.f5977o, getWidgetLayoutParams());
    }

    /* renamed from: h */
    public boolean mo17249h() {
        int i;
        super.mo17249h();
        if (TextUtils.isEmpty(getText())) {
            this.f5977o.setVisibility(4);
            return true;
        } else if (this.f5974l.mo17099A()) {
            m7424k();
            return true;
        } else {
            ((TextView) this.f5977o).setText(this.f5974l.mo17117f());
            if (Build.VERSION.SDK_INT >= 17) {
                this.f5977o.setTextAlignment(this.f5974l.mo17119h());
            }
            ((TextView) this.f5977o).setTextColor(this.f5974l.mo17118g());
            ((TextView) this.f5977o).setTextSize(this.f5974l.mo17116e());
            if (!this.f5974l.mo17131t()) {
                ((TextView) this.f5977o).setMaxLines(1);
                ((TextView) this.f5977o).setGravity(17);
                ((TextView) this.f5977o).setEllipsize(TextUtils.TruncateAt.END);
            } else {
                int u = this.f5974l.mo17132u();
                if (u > 0) {
                    ((TextView) this.f5977o).setLines(u);
                    ((TextView) this.f5977o).setEllipsize(TextUtils.TruncateAt.END);
                }
            }
            if (!(this.f5975m == null || this.f5975m.mo17160i() == null)) {
                if (!C2640c.m6891b() || !m7421a() || (!TextUtils.equals(this.f5975m.mo17160i().mo16954b(), "text_star") && !TextUtils.equals(this.f5975m.mo17160i().mo16954b(), "score-count") && !TextUtils.equals(this.f5975m.mo17160i().mo16954b(), "score-count-type-1") && !TextUtils.equals(this.f5975m.mo17160i().mo16954b(), "score-count-type-2"))) {
                    if (TextUtils.equals(this.f5975m.mo17160i().mo16954b(), "score-count") || TextUtils.equals(this.f5975m.mo17160i().mo16954b(), "score-count-type-2")) {
                        try {
                            i = Integer.parseInt(getText());
                        } catch (NumberFormatException unused) {
                            i = -1;
                        }
                        if (i < 0) {
                            try {
                                if (C2640c.m6891b()) {
                                    setVisibility(8);
                                    return true;
                                }
                                this.f5977o.setVisibility(0);
                            } catch (Exception unused2) {
                            }
                        }
                        m7422i();
                        if (TextUtils.equals(this.f5975m.mo17160i().mo16954b(), "score-count-type-2")) {
                            ((TextView) this.f5977o).setText(String.format(new DecimalFormat("(###,###,###)").format((long) i), new Object[]{Integer.valueOf(i)}));
                            ((TextView) this.f5977o).setGravity(17);
                            return true;
                        }
                        mo17285a((TextView) this.f5977o, i, getContext(), "tt_comment_num");
                    } else if (TextUtils.equals(this.f5975m.mo17160i().mo16954b(), "text_star")) {
                        double d = -1.0d;
                        try {
                            d = Double.parseDouble(getText());
                        } catch (Exception e) {
                            C2975l.m8391e("DynamicStarView applyNativeStyle", e.toString());
                        }
                        if (d < 0.0d || d > 5.0d) {
                            if (C2640c.m6891b()) {
                                setVisibility(8);
                                return true;
                            }
                            this.f5977o.setVisibility(0);
                        }
                        m7422i();
                        ((TextView) this.f5977o).setIncludeFontPadding(false);
                        ((TextView) this.f5977o).setGravity(17);
                        if (Build.VERSION.SDK_INT >= 17) {
                            this.f5977o.setTextAlignment(4);
                        }
                        ((TextView) this.f5977o).setText(String.format("%.1f", new Object[]{Double.valueOf(d)}));
                    } else if (TextUtils.equals("privacy-detail", this.f5975m.mo17160i().mo16954b())) {
                        ((TextView) this.f5977o).setText("权限列表 | 隐私政策");
                    } else if (TextUtils.equals(this.f5975m.mo17160i().mo16954b(), "development-name")) {
                        ((TextView) this.f5977o).setText("开发者：" + getText());
                    } else if (TextUtils.equals(this.f5975m.mo17160i().mo16954b(), "app-version")) {
                        ((TextView) this.f5977o).setText("版本号：V" + getText());
                    } else {
                        ((TextView) this.f5977o).setText(getText());
                    }
                    if (Build.VERSION.SDK_INT >= 17) {
                        this.f5977o.setTextAlignment(this.f5974l.mo17119h());
                        ((TextView) this.f5977o).setGravity(this.f5974l.mo17120i());
                    }
                    if (C2640c.m6891b()) {
                        m7423j();
                    }
                } else {
                    setVisibility(8);
                    return true;
                }
            }
            return true;
        }
    }

    /* renamed from: a */
    private boolean m7421a() {
        return (this.f5976n == null || this.f5976n.getRenderRequest() == null || this.f5976n.getRenderRequest().mo16759k() == 4) ? false : true;
    }

    /* renamed from: i */
    private void m7422i() {
        if ((this.f5974l.mo17110a() != 0 || this.f5974l.mo17113b() <= 0) && C2640c.m6891b()) {
            this.f5977o.setTranslationY((float) (-(((int) ((((float) this.f5970h) - ((TextView) this.f5977o).getTextSize()) - C2642b.m6894a(getContext(), (float) (this.f5974l.mo17113b() + this.f5974l.mo17110a())))) / 2)));
        }
    }

    /* renamed from: j */
    private void m7423j() {
        if ((TextUtils.equals(this.f5975m.mo17160i().mo16954b(), "source") || TextUtils.equals(this.f5975m.mo17160i().mo16954b(), "title")) && Build.VERSION.SDK_INT >= 17) {
            this.f5977o.setTextAlignment(2);
        }
        if ((TextUtils.equals(this.f5975m.mo17160i().mo16954b(), "text_star") || TextUtils.equals(this.f5975m.mo17160i().mo16954b(), "fillButton")) && Build.VERSION.SDK_INT >= 17) {
            this.f5977o.setTextAlignment(2);
            ((TextView) this.f5977o).setGravity(17);
        }
    }

    public String getText() {
        String f = this.f5974l.mo17117f();
        if (TextUtils.isEmpty(f)) {
            if (!C2640c.m6891b() && TextUtils.equals(this.f5975m.mo17160i().mo16954b(), "text_star")) {
                f = "5";
            }
            if (!C2640c.m6891b() && TextUtils.equals(this.f5975m.mo17160i().mo16954b(), "score-count")) {
                f = "6870";
            }
        }
        return (TextUtils.equals(this.f5975m.mo17160i().mo16954b(), "title") || TextUtils.equals(this.f5975m.mo17160i().mo16954b(), "subtitle")) ? f.replace("\n", "") : f;
    }

    /* renamed from: a */
    public void mo17285a(TextView textView, int i, Context context, String str) {
        String format = String.format(C2984t.m8425a(context, str), new Object[]{Integer.valueOf(i)});
        textView.setText("(" + format + ")");
        if (i == -1) {
            textView.setVisibility(8);
        }
    }

    /* renamed from: k */
    private void m7424k() {
        if (this.f5977o instanceof AnimationText) {
            String text = getText();
            ArrayList arrayList = new ArrayList();
            try {
                JSONArray jSONArray = new JSONArray(text);
                for (int i = 0; i < jSONArray.length(); i++) {
                    arrayList.add(jSONArray.optString(i));
                }
            } catch (JSONException e) {
                e.printStackTrace();
                arrayList.add(text);
            }
            ((AnimationText) this.f5977o).setMaxLines(1);
            ((AnimationText) this.f5977o).setTextColor(this.f5974l.mo17118g());
            ((AnimationText) this.f5977o).setTextSize(this.f5974l.mo17116e());
            ((AnimationText) this.f5977o).setAnimationText(arrayList);
            ((AnimationText) this.f5977o).setAnimationType(this.f5974l.mo17101C());
            ((AnimationText) this.f5977o).setAnimationDuration(this.f5974l.mo17100B() * 1000);
            ((AnimationText) this.f5977o).mo17317a();
        }
    }
}

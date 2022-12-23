package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.Build;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.sdk.component.adexpress.dynamic.p100b.C2688h;
import com.bytedance.sdk.component.adexpress.p091a.p092a.C2599a;
import com.bytedance.sdk.component.adexpress.p096c.C2641a;
import com.bytedance.sdk.component.adexpress.p096c.C2642b;
import com.bytedance.sdk.component.adexpress.widget.TTRoundRectImageView;
import com.bytedance.sdk.component.p110d.C2897i;
import com.bytedance.sdk.component.p110d.C2898j;
import com.bytedance.sdk.component.p110d.C2902n;
import com.bytedance.sdk.component.p110d.C2908t;
import com.bytedance.sdk.component.utils.C2984t;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public class DynamicImageView extends DynamicBaseWidgetImp {

    /* renamed from: a */
    private String f5990a;

    public DynamicImageView(Context context, DynamicRootView dynamicRootView, C2688h hVar) {
        super(context, dynamicRootView, hVar);
        if (this.f5974l.mo17126o() > 0.0f) {
            this.f5977o = new TTRoundRectImageView(context);
            ((TTRoundRectImageView) this.f5977o).setXRound((int) C2642b.m6894a(context, this.f5974l.mo17126o()));
            ((TTRoundRectImageView) this.f5977o).setYRound((int) C2642b.m6894a(context, this.f5974l.mo17126o()));
        } else {
            this.f5977o = new ImageView(context);
        }
        this.f5990a = getImageKey();
        this.f5977o.setTag(Integer.valueOf(getClickArea()));
        if ("arrowButton".equals(hVar.mo17160i().mo16954b())) {
            if (this.f5974l.mo17113b() > 0 || this.f5974l.mo17110a() > 0) {
                this.f5969g = Math.min(this.f5969g, this.f5970h);
                this.f5970h = Math.min(this.f5969g, this.f5970h);
                this.f5971i = (int) (((float) this.f5971i) + C2642b.m6894a(context, ((float) (this.f5974l.mo17113b() + (this.f5974l.mo17110a() / 2))) + 0.5f));
            } else {
                this.f5969g = Math.max(this.f5969g, this.f5970h);
                this.f5970h = Math.max(this.f5969g, this.f5970h);
            }
            this.f5974l.mo17111a((float) (this.f5969g / 2));
        }
        addView(this.f5977o, new FrameLayout.LayoutParams(this.f5969g, this.f5970h));
    }

    /* renamed from: h */
    public boolean mo17249h() {
        super.mo17249h();
        if ("arrowButton".equals(this.f5975m.mo17160i().mo16954b())) {
            ((ImageView) this.f5977o).setImageResource(C2984t.m8431d(this.f5973k, "tt_white_righterbackicon_titlebar"));
            this.f5977o.setPadding(0, 0, 0, 0);
            ((ImageView) this.f5977o).setScaleType(ImageView.ScaleType.FIT_XY);
            return true;
        }
        this.f5977o.setBackgroundColor(this.f5974l.mo17134w());
        if ("user".equals(this.f5975m.mo17160i().mo16957c())) {
            ((ImageView) this.f5977o).setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            ((ImageView) this.f5977o).setColorFilter(this.f5974l.mo17118g());
            ((ImageView) this.f5977o).setImageDrawable(C2984t.m8430c(getContext(), "tt_user"));
            ((ImageView) this.f5977o).setPadding(this.f5969g / 10, this.f5970h / 5, this.f5969g / 10, 0);
        }
        if (!m7386a() || Build.VERSION.SDK_INT < 17) {
            C2897i a = C2599a.m6611a().mo16630e().mo17677a(this.f5974l.mo17122k()).mo17717a(this.f5990a);
            String o = this.f5976n.getRenderRequest().mo16763o();
            if (!TextUtils.isEmpty(o)) {
                a.mo17720b(o);
            }
            a.mo17710a((ImageView) this.f5977o);
            ((ImageView) this.f5977o).setScaleType(ImageView.ScaleType.FIT_XY);
        } else {
            ((ImageView) this.f5977o).setScaleType(ImageView.ScaleType.FIT_CENTER);
            C2599a.m6611a().mo16630e().mo17677a(this.f5974l.mo17122k()).mo17716a(C2908t.BITMAP).mo17711a((C2902n) new C2902n<Bitmap>() {
                /* renamed from: a */
                public void mo17256a(int i, String str, Throwable th) {
                }

                /* renamed from: a */
                public void mo17257a(C2898j<Bitmap> jVar) {
                    Bitmap a = C2641a.m6893a(DynamicImageView.this.f5973k, jVar.mo17725b(), 25);
                    if (a != null) {
                        DynamicImageView.this.f5977o.setBackground(new BitmapDrawable(DynamicImageView.this.getResources(), a));
                    }
                }
            });
        }
        return true;
    }

    /* renamed from: a */
    private boolean m7386a() {
        String l = this.f5974l.mo17123l();
        if (this.f5974l.mo17130s()) {
            return true;
        }
        if (TextUtils.isEmpty(l)) {
            return false;
        }
        try {
            JSONObject jSONObject = new JSONObject(l);
            if (Math.abs((((float) this.f5969g) / (((float) this.f5970h) * 1.0f)) - (((float) jSONObject.optInt("width")) / (((float) jSONObject.optInt("height")) * 1.0f))) <= 0.01f) {
                return false;
            }
            return true;
        } catch (JSONException e) {
            e.printStackTrace();
            return false;
        }
    }

    private String getImageKey() {
        Map<String, String> l = this.f5976n.getRenderRequest().mo16760l();
        if (l == null || l.size() <= 0) {
            return null;
        }
        return l.get(this.f5974l.mo17122k());
    }
}

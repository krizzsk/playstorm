package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.dynamic.C2651a;
import com.bytedance.sdk.component.adexpress.dynamic.C2679b;
import com.bytedance.sdk.component.adexpress.dynamic.C2690c;
import com.bytedance.sdk.component.adexpress.dynamic.C2711d;
import com.bytedance.sdk.component.adexpress.dynamic.p098a.C2658b;
import com.bytedance.sdk.component.adexpress.dynamic.p100b.C2685e;
import com.bytedance.sdk.component.adexpress.dynamic.p100b.C2686f;
import com.bytedance.sdk.component.adexpress.dynamic.p100b.C2688h;
import com.bytedance.sdk.component.adexpress.dynamic.p102d.C2712a;
import com.bytedance.sdk.component.adexpress.p095b.C2631j;
import com.bytedance.sdk.component.adexpress.p095b.C2633l;
import com.bytedance.sdk.component.adexpress.p095b.C2635m;
import com.bytedance.sdk.component.adexpress.theme.C2746a;
import com.bytedance.sdk.component.adexpress.theme.ThemeStatusBroadcastReceiver;
import java.util.ArrayList;
import java.util.List;

public class DynamicRootView extends FrameLayout implements C2690c, C2746a {

    /* renamed from: a */
    protected final C2635m f5997a;

    /* renamed from: b */
    boolean f5998b;

    /* renamed from: c */
    private C2631j f5999c;

    /* renamed from: d */
    private DynamicBaseWidget f6000d;

    /* renamed from: e */
    private C2712a f6001e;

    /* renamed from: f */
    private ThemeStatusBroadcastReceiver f6002f;

    /* renamed from: g */
    private C2651a f6003g;

    /* renamed from: h */
    private ViewGroup f6004h = null;

    /* renamed from: i */
    private int f6005i = 0;

    /* renamed from: j */
    private List<C2679b> f6006j = new ArrayList();

    /* renamed from: k */
    private C2711d f6007k;

    /* renamed from: l */
    private int f6008l = 0;

    /* renamed from: m */
    private int f6009m = 0;

    /* renamed from: n */
    private C2633l f6010n;

    /* renamed from: o */
    private Context f6011o;

    /* renamed from: p */
    private String f6012p;

    public DynamicRootView(Context context, ThemeStatusBroadcastReceiver themeStatusBroadcastReceiver, boolean z, C2633l lVar, C2712a aVar) {
        super(context);
        this.f6011o = context;
        C2635m mVar = new C2635m();
        this.f5997a = mVar;
        mVar.mo16783a(2);
        this.f6001e = aVar;
        aVar.mo17210a((View) this);
        this.f6002f = themeStatusBroadcastReceiver;
        themeStatusBroadcastReceiver.mo17315a(this);
        this.f5998b = z;
        this.f6010n = lVar;
    }

    public String getBgColor() {
        return this.f6012p;
    }

    public void setBgColor(String str) {
        this.f6012p = str;
    }

    public void setRenderListener(C2631j jVar) {
        this.f5999c = jVar;
        this.f6001e.mo17211a(jVar);
    }

    /* renamed from: a */
    public void mo17261a(C2688h hVar, int i) {
        this.f6000d = mo17258a(hVar, (ViewGroup) this, i);
        this.f5997a.mo16785a(true);
        this.f5997a.mo16781a((double) this.f6000d.f5967e);
        this.f5997a.mo16788b((double) this.f6000d.f5968f);
        this.f5999c.mo16748a(this.f5997a);
    }

    /* renamed from: a */
    public DynamicBaseWidget mo17258a(C2688h hVar, ViewGroup viewGroup, int i) {
        if (hVar == null) {
            return null;
        }
        DynamicBaseWidget a = C2658b.m6971a(this.f6011o, this, hVar);
        if (a instanceof DynamicUnKnowView) {
            mo17260a(i == 3 ? 128 : 118);
            return null;
        }
        m7400a(hVar);
        a.mo17228c();
        if (viewGroup != null) {
            viewGroup.addView(a);
            m7399a(viewGroup, hVar);
        }
        List<C2688h> j = hVar.mo17161j();
        if (j == null || j.size() <= 0) {
            return null;
        }
        for (C2688h a2 : j) {
            mo17258a(a2, (ViewGroup) a, i);
        }
        return a;
    }

    /* renamed from: a */
    private void m7400a(C2688h hVar) {
        C2686f e;
        C2685e i = hVar.mo17160i();
        if (i != null && (e = i.mo16960e()) != null) {
            this.f5997a.mo16791b(e.mo17007ak());
        }
    }

    /* renamed from: a */
    private void m7399a(ViewGroup viewGroup, C2688h hVar) {
        ViewGroup viewGroup2;
        if (viewGroup != null && (viewGroup2 = (ViewGroup) viewGroup.getParent()) != null && hVar.mo17171t()) {
            viewGroup2.setClipChildren(false);
            viewGroup2.setClipToPadding(false);
            ViewGroup viewGroup3 = (ViewGroup) viewGroup2.getParent();
            if (viewGroup3 != null) {
                viewGroup3.setClipChildren(false);
                viewGroup3.setClipToPadding(false);
            }
        }
    }

    /* renamed from: a */
    public void mo17259a(double d, double d2, double d3, double d4, float f) {
        this.f5997a.mo16793c(d);
        this.f5997a.mo16796d(d2);
        this.f5997a.mo16799e(d3);
        this.f5997a.mo16801f(d4);
        this.f5997a.mo16782a(f);
        this.f5997a.mo16789b(f);
        this.f5997a.mo16794c(f);
        this.f5997a.mo16797d(f);
    }

    /* renamed from: a */
    public void mo17260a(int i) {
        this.f5997a.mo16785a(false);
        this.f5997a.mo16790b(i);
        this.f5999c.mo16748a(this.f5997a);
    }

    public void setMuteListener(C2651a aVar) {
        this.f6003g = aVar;
    }

    public void setDislikeView(View view) {
        this.f6001e.mo17212b(view);
    }

    public C2631j getRenderListener() {
        return this.f5999c;
    }

    public C2712a getDynamicClickListener() {
        return this.f6001e;
    }

    /* renamed from: b */
    public void mo17262b(int i) {
        DynamicBaseWidget dynamicBaseWidget = this.f6000d;
        if (dynamicBaseWidget != null) {
            dynamicBaseWidget.mo17226a(i);
        }
    }

    /* renamed from: a */
    public void mo17175a(CharSequence charSequence, int i, int i2) {
        for (int i3 = 0; i3 < this.f6006j.size(); i3++) {
            if (this.f6006j.get(i3) != null) {
                C2679b bVar = this.f6006j.get(i3);
                boolean z = true;
                if (i != 1) {
                    z = false;
                }
                bVar.mo16910a(charSequence, z, i2);
            }
        }
    }

    public void setSoundMute(boolean z) {
        C2651a aVar = this.f6003g;
        if (aVar != null) {
            aVar.setSoundMute(z);
        }
    }

    public void setTimeUpdate(int i) {
        this.f6007k.setTimeUpdate(i);
    }

    /* renamed from: f */
    public void mo17176f() {
        this.f6007k.mo17208a();
    }

    public ViewGroup getTimeOut() {
        return this.f6004h;
    }

    public void setTimeOut(ViewGroup viewGroup) {
        this.f6004h = viewGroup;
    }

    public int getTimedown() {
        return this.f6005i;
    }

    public void setTimedown(int i) {
        this.f6005i = i;
    }

    public List<C2679b> getTimeOutListener() {
        return this.f6006j;
    }

    public void setTimeOutListener(C2679b bVar) {
        this.f6006j.add(bVar);
    }

    public void setVideoListener(C2711d dVar) {
        this.f6007k = dVar;
    }

    public int getScoreCountWithIcon() {
        return this.f6009m;
    }

    public void setScoreCountWithIcon(int i) {
        this.f6009m = i;
    }

    public int getLogoUnionHeight() {
        return this.f6008l;
    }

    public void setLogoUnionHeight(int i) {
        this.f6008l = i;
    }

    public C2633l getRenderRequest() {
        return this.f6010n;
    }
}

package com.bytedance.sdk.component.adexpress.dynamic.interact;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidget;
import com.bytedance.sdk.component.adexpress.dynamic.interact.p103a.C2729a;
import com.bytedance.sdk.component.adexpress.dynamic.interact.p103a.C2730b;
import com.bytedance.sdk.component.adexpress.dynamic.interact.p103a.C2731c;
import com.bytedance.sdk.component.adexpress.dynamic.interact.p103a.C2732d;
import com.bytedance.sdk.component.adexpress.dynamic.p100b.C2687g;
import com.bytedance.sdk.component.adexpress.widget.CircleLongPressView;
import com.bytedance.sdk.component.adexpress.widget.RippleView;
import com.bytedance.sdk.component.adexpress.widget.ShakeAnimationView;
import com.bytedance.sdk.component.adexpress.widget.WriggleGuideAnimationView;

public class InteractViewContainer extends FrameLayout implements C2734c {

    /* renamed from: a */
    private Context f6029a;

    /* renamed from: b */
    private DynamicBaseWidget f6030b;

    /* renamed from: c */
    private C2687g f6031c;

    /* renamed from: d */
    private View f6032d;

    /* renamed from: e */
    private C2733b f6033e;

    /* renamed from: f */
    private String f6034f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public RippleView f6035g;

    /* renamed from: h */
    private View.OnTouchListener f6036h;

    /* renamed from: i */
    private int f6037i;

    /* renamed from: j */
    private int f6038j;

    /* renamed from: k */
    private int f6039k;

    public InteractViewContainer(Context context, DynamicBaseWidget dynamicBaseWidget, C2687g gVar) {
        super(context);
        this.f6029a = context;
        this.f6030b = dynamicBaseWidget;
        this.f6031c = gVar;
        m7446e();
    }

    public InteractViewContainer(Context context, DynamicBaseWidget dynamicBaseWidget, C2687g gVar, int i, int i2) {
        super(context);
        this.f6029a = context;
        this.f6030b = dynamicBaseWidget;
        this.f6031c = gVar;
        this.f6038j = i;
        this.f6039k = i2;
        m7446e();
    }

    /* renamed from: e */
    private void m7446e() {
        setBackgroundColor(0);
        setClipChildren(false);
        setClipToPadding(false);
        this.f6034f = this.f6031c.mo17102D();
        this.f6037i = this.f6031c.mo17103E();
        C2733b a = C2735d.m7462a(this.f6029a, this.f6030b, this.f6031c, this.f6038j, this.f6039k);
        this.f6033e = a;
        if (a != null) {
            this.f6032d = a.mo17302d();
            if (TextUtils.equals(this.f6034f, "6")) {
                RippleView rippleView = new RippleView(this.f6029a);
                this.f6035g = rippleView;
                addView(rippleView, new FrameLayout.LayoutParams(-1, -1));
                post(new Runnable() {
                    public void run() {
                        InteractViewContainer.this.f6035g.mo17392b();
                    }
                });
            }
            addView(this.f6033e.mo17302d());
            m7447f();
            setVisibility(0);
        }
    }

    /* renamed from: f */
    private void m7447f() {
        if (this.f6032d != null) {
            String str = this.f6034f;
            char c = 65535;
            int hashCode = str.hashCode();
            if (hashCode != 50) {
                switch (hashCode) {
                    case 53:
                        if (str.equals("5")) {
                            c = 7;
                            break;
                        }
                        break;
                    case 54:
                        if (str.equals("6")) {
                            c = 3;
                            break;
                        }
                        break;
                    case 55:
                        if (str.equals("7")) {
                            c = 10;
                            break;
                        }
                        break;
                    case 56:
                        if (str.equals("8")) {
                            c = 5;
                            break;
                        }
                        break;
                    case 57:
                        if (str.equals("9")) {
                            c = 0;
                            break;
                        }
                        break;
                    default:
                        switch (hashCode) {
                            case 1568:
                                if (str.equals("11")) {
                                    c = 4;
                                    break;
                                }
                                break;
                            case 1569:
                                if (str.equals("12")) {
                                    c = 6;
                                    break;
                                }
                                break;
                            case 1570:
                                if (str.equals("13")) {
                                    c = 2;
                                    break;
                                }
                                break;
                            case 1571:
                                if (str.equals("14")) {
                                    c = 8;
                                    break;
                                }
                                break;
                            default:
                                switch (hashCode) {
                                    case 1573:
                                        if (str.equals("16")) {
                                            c = 11;
                                            break;
                                        }
                                        break;
                                    case 1574:
                                        if (str.equals("17")) {
                                            c = 1;
                                            break;
                                        }
                                        break;
                                    case 1575:
                                        if (str.equals("18")) {
                                            c = 12;
                                            break;
                                        }
                                        break;
                                }
                        }
                }
            } else if (str.equals("2")) {
                c = 9;
            }
            switch (c) {
                case 0:
                case 1:
                    this.f6032d.setTag(2);
                    break;
                case 2:
                    this.f6036h = new C2731c(this, this.f6037i);
                    break;
                case 3:
                    setBackgroundColor(Color.parseColor("#80000000"));
                    this.f6036h = new C2732d(this);
                    break;
                case 4:
                case 5:
                    this.f6030b.setClipChildren(false);
                    this.f6030b.setClipChildren(false);
                    ViewGroup viewGroup = (ViewGroup) this.f6030b.getParent();
                    if (viewGroup != null) {
                        viewGroup.setClipChildren(false);
                        viewGroup.setClipToPadding(false);
                    }
                    this.f6036h = new C2732d(this);
                    break;
                case 6:
                    this.f6036h = new C2730b(this);
                    break;
                case 7:
                    setBackgroundColor(Color.parseColor("#80000000"));
                    this.f6036h = new C2730b(this);
                    break;
                case 8:
                    this.f6036h = new C2729a(this, this);
                    break;
                case 9:
                case 10:
                    setBackgroundColor(Color.parseColor("#80000000"));
                    this.f6036h = new C2729a(this, this);
                    break;
                case 11:
                    View view = this.f6032d;
                    if (!(view == null || !(view instanceof ShakeAnimationView) || ((ShakeAnimationView) view).getShakeLayout() == null)) {
                        ((ShakeAnimationView) this.f6032d).getShakeLayout().setTag(2);
                    }
                    this.f6032d.setTag(2);
                    break;
                case 12:
                    View view2 = this.f6032d;
                    if (!(view2 == null || !(view2 instanceof WriggleGuideAnimationView) || ((WriggleGuideAnimationView) view2).getWriggleLayout() == null)) {
                        ((WriggleGuideAnimationView) this.f6032d).getWriggleLayout().setTag(2);
                    }
                    this.f6032d.setTag(2);
                    break;
            }
            View.OnTouchListener onTouchListener = this.f6036h;
            if (onTouchListener != null) {
                setOnTouchListener(onTouchListener);
            }
            if (m7448g()) {
                setOnClickListener((View.OnClickListener) this.f6030b.getDynamicClickListener());
            }
        }
    }

    /* renamed from: g */
    private boolean m7448g() {
        if (!this.f6031c.mo17108J() && !TextUtils.equals("9", this.f6034f) && !TextUtils.equals("16", this.f6034f) && !TextUtils.equals("17", this.f6034f) && !TextUtils.equals("18", this.f6034f)) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public void mo17293b() {
        C2733b bVar = this.f6033e;
        if (bVar != null) {
            bVar.mo17299a();
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C2733b bVar = this.f6033e;
        if (bVar != null) {
            bVar.mo17300b();
        }
    }

    /* renamed from: c */
    public void mo17294c() {
        if (this.f6032d != null && TextUtils.equals(this.f6034f, "2")) {
            View view = this.f6032d;
            if (view instanceof CircleLongPressView) {
                ((CircleLongPressView) view).mo17334c();
            }
        }
    }

    /* renamed from: d */
    public void mo17295d() {
        if (this.f6032d != null && TextUtils.equals(this.f6034f, "2")) {
            View view = this.f6032d;
            if (view instanceof CircleLongPressView) {
                ((CircleLongPressView) view).mo17335d();
            }
        }
    }

    /* renamed from: a */
    public void mo17292a() {
        if (TextUtils.equals(this.f6034f, "6")) {
            RippleView rippleView = this.f6035g;
            if (rippleView != null) {
                rippleView.mo17393c();
                postDelayed(new Runnable() {
                    public void run() {
                        InteractViewContainer.this.m7449h();
                    }
                }, 300);
                return;
            }
            return;
        }
        m7449h();
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public void m7449h() {
        if (this.f6036h != null) {
            setOnClickListener((View.OnClickListener) this.f6030b.getDynamicClickListener());
            performClick();
        }
    }
}

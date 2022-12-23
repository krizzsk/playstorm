package com.ogury.p376ed.internal;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.ogury.p376ed.internal.C10805o;

/* renamed from: com.ogury.ed.internal.g */
public final class C10546g extends FrameLayout implements C10828p {

    /* renamed from: a */
    public static final C10547a f26660a = new C10547a((byte) 0);

    /* renamed from: b */
    private int f26661b;

    /* renamed from: c */
    private int f26662c;

    /* renamed from: d */
    private final C10356be f26663d = new C10356be();

    /* renamed from: e */
    private C10775n f26664e;

    /* renamed from: f */
    private C10648iz f26665f;

    /* renamed from: g */
    private C10730lk<? super C10546g, C10684ke> f26666g;

    /* renamed from: h */
    private C10730lk<? super C10546g, C10684ke> f26667h;

    /* renamed from: i */
    private C10729lj<C10684ke> f26668i;

    /* renamed from: j */
    private C10729lj<C10684ke> f26669j;

    /* renamed from: k */
    private C10729lj<C10684ke> f26670k;

    /* renamed from: l */
    private C10729lj<C10684ke> f26671l;

    /* renamed from: m */
    private C10729lj<C10684ke> f26672m;

    /* renamed from: n */
    private boolean f26673n;

    /* renamed from: o */
    private boolean f26674o;

    /* renamed from: p */
    private C10648iz f26675p;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10546g(Context context) {
        super(context);
        C10765mq.m32773b(context, "context");
        C10805o.C10806a aVar = C10805o.f27025a;
        this.f26664e = C10805o.C10806a.m32827a();
        setLayoutParams(new FrameLayout.LayoutParams(600, 600));
        addOnLayoutChangeListener(new View.OnLayoutChangeListener() {
            public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                C10546g.m32058a(C10546g.this, view, i, i2, i3, i4, i5, i6, i7, i8);
            }
        });
    }

    public final int getContainerHeight() {
        return this.f26661b;
    }

    public final void setContainerHeight(int i) {
        this.f26661b = i;
    }

    public final int getContainerWidth() {
        return this.f26662c;
    }

    public final void setContainerWidth(int i) {
        this.f26662c = i;
    }

    public final C10648iz getResizeProps() {
        return this.f26665f;
    }

    public final void setResizeProps(C10648iz izVar) {
        this.f26665f = izVar;
    }

    public final C10730lk<C10546g, C10684ke> getAdLayoutChangeListener() {
        return this.f26666g;
    }

    public final void setAdLayoutChangeListener(C10730lk<? super C10546g, C10684ke> lkVar) {
        this.f26666g = lkVar;
    }

    public final C10730lk<C10546g, C10684ke> getOnMouseUpListener() {
        return this.f26667h;
    }

    public final void setOnMouseUpListener(C10730lk<? super C10546g, C10684ke> lkVar) {
        this.f26667h = lkVar;
    }

    public final C10729lj<C10684ke> getOnWindowGainFocusListener() {
        return this.f26668i;
    }

    public final void setOnWindowGainFocusListener(C10729lj<C10684ke> ljVar) {
        this.f26668i = ljVar;
    }

    public final C10729lj<C10684ke> getOnWindowLoseFocusListener() {
        return this.f26669j;
    }

    public final void setOnWindowLoseFocusListener(C10729lj<C10684ke> ljVar) {
        this.f26669j = ljVar;
    }

    public final C10729lj<C10684ke> getOnAttachToWindowListener() {
        return this.f26670k;
    }

    public final void setOnAttachToWindowListener(C10729lj<C10684ke> ljVar) {
        this.f26670k = ljVar;
    }

    public final C10729lj<C10684ke> getOnDetachFromWindowListener() {
        return this.f26671l;
    }

    public final void setOnDetachFromWindowListener(C10729lj<C10684ke> ljVar) {
        this.f26671l = ljVar;
    }

    public final C10729lj<C10684ke> getOnOverlayPositionChanged() {
        return this.f26672m;
    }

    public final void setOnOverlayPositionChanged(C10729lj<C10684ke> ljVar) {
        this.f26672m = ljVar;
    }

    public final void setDisplayedInFullScreen(boolean z) {
        this.f26673n = z;
    }

    public final boolean getContainsOverlayAd() {
        return this.f26674o;
    }

    public final void setContainsOverlayAd(boolean z) {
        this.f26674o = z;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static final void m32058a(C10546g gVar, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        C10765mq.m32773b(gVar, "this$0");
        C10730lk<C10546g, C10684ke> adLayoutChangeListener = gVar.getAdLayoutChangeListener();
        if (adLayoutChangeListener != null) {
            adLayoutChangeListener.mo66961a(gVar);
        }
    }

    /* renamed from: com.ogury.ed.internal.g$a */
    public static final class C10547a {
        public /* synthetic */ C10547a(byte b) {
            this();
        }

        private C10547a() {
        }
    }

    public final void setupDrag(boolean z) {
        C10805o.C10806a aVar = C10805o.f27025a;
        this.f26664e = C10805o.C10806a.m32828a(this, z);
    }

    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        C10765mq.m32773b(view, "child");
        C10765mq.m32773b(layoutParams, "params");
        if (!(view instanceof WebView) || getChildCount() <= 0) {
            super.addView(view, layoutParams);
        } else {
            super.addView(view, getChildCount() - 1, layoutParams);
        }
    }

    /* renamed from: a */
    public final void mo67454a() {
        ViewGroup parentAsViewGroup = getParentAsViewGroup();
        if (parentAsViewGroup != null) {
            parentAsViewGroup.removeView(this);
        }
    }

    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        C10765mq.m32773b(motionEvent, "ev");
        if (this.f26664e.mo67866a(motionEvent)) {
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    /* renamed from: b */
    public final void mo67457b() {
        C10729lj<C10684ke> ljVar;
        C10730lk<? super C10546g, C10684ke> lkVar = this.f26667h;
        if (lkVar != null) {
            lkVar.mo66961a(this);
        }
        C10730lk<? super C10546g, C10684ke> lkVar2 = this.f26666g;
        if (lkVar2 != null) {
            lkVar2.mo66961a(this);
        }
        if (m32063i() && (ljVar = this.f26672m) != null) {
            ljVar.mo67074a();
        }
    }

    /* renamed from: c */
    public final void mo67458c() {
        m32059a(this.f26665f);
    }

    /* renamed from: a */
    public final void mo67455a(Rect rect) {
        m32059a(C10651ja.m32561a(this.f26665f, rect));
    }

    /* renamed from: a */
    private final void m32059a(C10648iz izVar) {
        if (izVar != null) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams != null) {
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                setX((float) izVar.mo67670d());
                setY((float) izVar.mo67672e());
                layoutParams2.width = izVar.mo67666b();
                layoutParams2.height = izVar.mo67668c();
                layoutParams2.gravity = izVar.mo67675f();
                setLayoutParams(layoutParams2);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        }
    }

    /* renamed from: h */
    private final void m32062h() {
        setX(0.0f);
        setY(0.0f);
    }

    /* renamed from: d */
    public final void mo67459d() {
        m32062h();
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            layoutParams2.width = -1;
            layoutParams2.height = -1;
            setLayoutParams(layoutParams2);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
    }

    public final void setInitialSize(C10648iz izVar) {
        C10765mq.m32773b(izVar, "initialSize");
        this.f26675p = izVar;
        m32062h();
        m32059a(izVar);
    }

    public final void setInitialSizeWithoutResizing(C10648iz izVar) {
        C10765mq.m32773b(izVar, "initialSize");
        this.f26675p = izVar;
    }

    /* renamed from: e */
    public final void mo67461e() {
        m32062h();
        ViewParent parent = getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            if (this.f26674o) {
                this.f26665f = this.f26663d.mo67089a((View) viewGroup, this.f26675p);
            } else {
                this.f26665f = this.f26675p;
            }
            m32057a(viewGroup);
        }
    }

    /* renamed from: a */
    private final void m32057a(ViewGroup viewGroup) {
        setContainerWidth(viewGroup.getMeasuredWidth());
        setContainerHeight(viewGroup.getMeasuredHeight());
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        ViewGroup parentAsViewGroup = getParentAsViewGroup();
        if (parentAsViewGroup != null) {
            if (m32063i()) {
                m32060b(parentAsViewGroup);
                C10729lj<C10684ke> ljVar = this.f26672m;
                if (ljVar != null) {
                    ljVar.mo67074a();
                }
            }
            m32057a(parentAsViewGroup);
        }
    }

    /* renamed from: i */
    private final boolean m32063i() {
        return !this.f26673n && this.f26674o;
    }

    /* renamed from: b */
    private final void m32060b(ViewGroup viewGroup) {
        if (getContainerHeight() != viewGroup.getMeasuredHeight() || getContainerWidth() != viewGroup.getMeasuredWidth()) {
            m32061c(viewGroup);
        }
    }

    /* renamed from: c */
    private final void m32061c(ViewGroup viewGroup) {
        m32059a(this.f26663d.mo67090a(this, (View) viewGroup));
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        if (this.f26674o) {
            C10831s sVar = C10831s.f27048a;
            C10831s.m32875a(true);
        }
        super.onAttachedToWindow();
        C10729lj<C10684ke> ljVar = this.f26670k;
        if (ljVar != null) {
            ljVar.mo67074a();
        }
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        this.f26673n = false;
        if (this.f26674o) {
            C10831s sVar = C10831s.f27048a;
            C10831s.m32875a(false);
        }
        super.onDetachedFromWindow();
        C10729lj<C10684ke> ljVar = this.f26671l;
        if (ljVar != null) {
            ljVar.mo67074a();
        }
    }

    public final ViewGroup getParentAsViewGroup() {
        ViewParent parent = getParent();
        if (parent instanceof ViewGroup) {
            return (ViewGroup) parent;
        }
        return null;
    }

    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z) {
            C10729lj<C10684ke> ljVar = this.f26668i;
            if (ljVar != null) {
                ljVar.mo67074a();
                return;
            }
            return;
        }
        C10729lj<C10684ke> ljVar2 = this.f26669j;
        if (ljVar2 != null) {
            ljVar2.mo67074a();
        }
    }

    /* renamed from: f */
    public final void mo67462f() {
        this.f26666g = null;
        this.f26668i = null;
        this.f26669j = null;
        this.f26670k = null;
        this.f26671l = null;
        this.f26667h = null;
        this.f26672m = null;
        removeAllViews();
    }

    /* renamed from: g */
    public final boolean mo67463g() {
        Activity a = C10564gp.m32101a((View) this);
        if (a == null) {
            return true;
        }
        return a.hasWindowFocus();
    }
}

package com.tapjoy.internal;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.tapjoy.internal.ja */
public final class C11799ja extends RelativeLayout implements View.OnClickListener {

    /* renamed from: a */
    private boolean f28804a;

    /* renamed from: b */
    private float f28805b = 1.0f;

    /* renamed from: c */
    private View f28806c;

    /* renamed from: d */
    private View f28807d;

    /* renamed from: e */
    private FrameLayout f28808e;

    /* renamed from: f */
    private ImageView f28809f;

    /* renamed from: g */
    private C11792ix f28810g;

    /* renamed from: h */
    private C11760ie f28811h;

    /* renamed from: i */
    private C11800a f28812i;

    /* renamed from: com.tapjoy.internal.ja$a */
    public interface C11800a {
        /* renamed from: a */
        void mo72662a();

        /* renamed from: a */
        void mo72663a(C11754ic icVar);

        /* renamed from: b */
        void mo72664b();
    }

    public C11799ja(Context context, C11760ie ieVar, C11800a aVar) {
        super(context);
        this.f28811h = ieVar;
        this.f28812i = aVar;
        Context context2 = getContext();
        View view = new View(context2);
        this.f28806c = view;
        boolean z = true;
        view.setId(1);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(0, 0);
        layoutParams.addRule(13);
        addView(this.f28806c, layoutParams);
        this.f28807d = new View(context2);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(0, 0);
        layoutParams2.addRule(13);
        addView(this.f28807d, layoutParams2);
        this.f28808e = new FrameLayout(context2);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(0, 0);
        layoutParams3.addRule(13);
        addView(this.f28808e, layoutParams3);
        ImageView imageView = new ImageView(context2);
        this.f28809f = imageView;
        imageView.setOnClickListener(this);
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(0, 0);
        layoutParams4.addRule(7, this.f28806c.getId());
        layoutParams4.addRule(6, this.f28806c.getId());
        addView(this.f28809f, layoutParams4);
        if (this.f28811h.f28654m != null) {
            C11762if ifVar = this.f28811h.f28654m;
            if (ifVar.f28656a == null || (ifVar.f28657b == null && ifVar.f28658c == null)) {
                z = false;
            }
            if (z) {
                C11792ix ixVar = new C11792ix(context2);
                this.f28810g = ixVar;
                ixVar.setOnClickListener(this);
                RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(0, 0);
                layoutParams5.addRule(5, this.f28807d.getId());
                layoutParams5.addRule(8, this.f28807d.getId());
                addView(this.f28810g, layoutParams5);
            }
        }
        this.f28809f.setImageBitmap(ieVar.f28644c.f28665b);
        if (this.f28810g != null && ieVar.f28654m != null && ieVar.f28654m.f28656a != null) {
            this.f28810g.setImageBitmap(ieVar.f28654m.f28656a.f28665b);
        }
    }

    public final void setLandscape(boolean z) {
        Bitmap bitmap;
        ArrayList<C11754ic> arrayList;
        Bitmap bitmap2;
        this.f28804a = z;
        if (z) {
            bitmap = this.f28811h.f28643b.f28665b;
            bitmap2 = this.f28811h.f28647f.f28665b;
            arrayList = this.f28811h.f28651j;
        } else {
            bitmap = this.f28811h.f28642a.f28665b;
            bitmap2 = this.f28811h.f28646e.f28665b;
            arrayList = this.f28811h.f28650i;
        }
        C11411aa.m33202a(this.f28806c, new BitmapDrawable((Resources) null, bitmap));
        C11411aa.m33202a(this.f28807d, new BitmapDrawable((Resources) null, bitmap2));
        if (this.f28808e.getChildCount() > 0) {
            this.f28808e.removeAllViews();
        }
        Context context = getContext();
        Iterator<C11754ic> it = arrayList.iterator();
        while (it.hasNext()) {
            View view = new View(context);
            view.setTag(it.next());
            view.setOnClickListener(this);
            this.f28808e.addView(view, new FrameLayout.LayoutParams(0, 0, 51));
        }
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        int i3;
        Point point;
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        if (this.f28804a) {
            this.f28805b = Math.min(((float) size) / 480.0f, ((float) size2) / 320.0f);
        } else {
            this.f28805b = Math.min(((float) size) / 320.0f, ((float) size2) / 480.0f);
        }
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f28806c.getLayoutParams();
        int i4 = 480;
        layoutParams.width = m34248a(this.f28804a ? 480 : 320);
        if (this.f28804a) {
            i4 = 320;
        }
        layoutParams.height = m34248a(i4);
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.f28807d.getLayoutParams();
        int i5 = 448;
        layoutParams2.width = m34248a(this.f28804a ? 448 : 290);
        if (this.f28804a) {
            i5 = 290;
        }
        layoutParams2.height = m34248a(i5);
        RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) this.f28808e.getLayoutParams();
        layoutParams3.width = layoutParams2.width;
        layoutParams3.height = layoutParams2.height;
        for (View next : C11412ab.m33203a(this.f28808e)) {
            FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) next.getLayoutParams();
            Rect rect = ((C11754ic) next.getTag()).f28622a;
            layoutParams4.width = m34248a(rect.width());
            layoutParams4.height = m34248a(rect.height());
            layoutParams4.leftMargin = m34248a(rect.left);
            layoutParams4.topMargin = m34248a(rect.top);
        }
        int i6 = 0;
        int a = m34248a(0);
        this.f28809f.setPadding(a, a, a, a);
        RelativeLayout.LayoutParams layoutParams5 = (RelativeLayout.LayoutParams) this.f28809f.getLayoutParams();
        layoutParams5.width = m34248a(30);
        layoutParams5.height = layoutParams5.width;
        int i7 = -a;
        layoutParams5.rightMargin = m34248a(this.f28811h.f28645d.x) + i7;
        layoutParams5.topMargin = i7 + m34248a(this.f28811h.f28645d.y);
        if (this.f28810g != null) {
            int i8 = 16;
            int a2 = m34248a(this.f28804a ? 16 : 15);
            if (this.f28804a) {
                i8 = 15;
            }
            int a3 = m34248a(i8);
            this.f28810g.setPadding(a, a, a, a);
            RelativeLayout.LayoutParams layoutParams6 = (RelativeLayout.LayoutParams) this.f28810g.getLayoutParams();
            layoutParams6.width = m34248a(26);
            layoutParams6.height = layoutParams6.width;
            if (this.f28811h.f28654m != null) {
                if (this.f28804a) {
                    C11762if ifVar = this.f28811h.f28654m;
                    if (ifVar.f28657b == null) {
                        point = ifVar.f28658c;
                    } else {
                        point = ifVar.f28657b;
                    }
                } else {
                    C11762if ifVar2 = this.f28811h.f28654m;
                    if (ifVar2.f28658c == null) {
                        point = ifVar2.f28657b;
                    } else {
                        point = ifVar2.f28658c;
                    }
                }
                if (point != null) {
                    i6 = point.x;
                    i3 = point.y;
                    layoutParams6.leftMargin = a2 + m34248a(i6);
                    layoutParams6.topMargin = a3 + m34248a(i3);
                }
            }
            i3 = 0;
            layoutParams6.leftMargin = a2 + m34248a(i6);
            layoutParams6.topMargin = a3 + m34248a(i3);
        }
        super.onMeasure(i, i2);
    }

    /* renamed from: a */
    private int m34248a(int i) {
        return (int) (((float) i) * this.f28805b);
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
    }

    public final void onClick(View view) {
        C11792ix ixVar;
        if (view == this.f28809f) {
            this.f28812i.mo72662a();
        } else if (view != null && view == (ixVar = this.f28810g)) {
            ixVar.f28776a = !ixVar.f28776a;
            ixVar.mo72727a();
            ixVar.invalidate();
            this.f28812i.mo72664b();
        } else if (view.getTag() instanceof C11754ic) {
            this.f28812i.mo72663a((C11754ic) view.getTag());
        }
    }
}

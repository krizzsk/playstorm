package com.inmobi.media;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.core.view.GravityCompat;

/* renamed from: com.inmobi.media.dc */
/* compiled from: MraidResizeProcessor */
public final class C5973dc {

    /* renamed from: a */
    public C6337q f15179a;

    /* renamed from: b */
    public ViewGroup f15180b;

    /* renamed from: c */
    public int f15181c;

    public C5973dc(C6337q qVar) {
        this.f15179a = qVar;
    }

    /* renamed from: a */
    public final void mo35077a() {
        if (this.f15180b == null) {
            ViewGroup viewGroup = (ViewGroup) this.f15179a.getParent();
            this.f15180b = viewGroup;
            this.f15181c = viewGroup.indexOfChild(this.f15179a);
        }
        C5976de resizeProperties = this.f15179a.getResizeProperties();
        m17842b();
        m17841a(resizeProperties);
    }

    /* renamed from: b */
    private void m17842b() {
        if (this.f15180b != null) {
            FrameLayout frameLayout = new FrameLayout(this.f15179a.getContainerContext());
            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(this.f15179a.getWidth(), this.f15179a.getHeight());
            frameLayout.setId(C6248i.f15812a);
            this.f15180b.addView(frameLayout, this.f15181c, layoutParams);
            this.f15180b.removeView(this.f15179a);
        }
    }

    /* JADX WARNING: type inference failed for: r0v13, types: [android.view.ViewParent] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m17841a(com.inmobi.media.C5976de r10) {
        /*
            r9 = this;
            com.inmobi.media.id r0 = com.inmobi.media.C6252ic.m18655a()
            float r0 = r0.f15840c
            int r1 = r10.width
            float r1 = (float) r1
            float r1 = r1 * r0
            r2 = 1056964608(0x3f000000, float:0.5)
            float r1 = r1 + r2
            int r1 = (int) r1
            int r3 = r10.height
            float r3 = (float) r3
            float r3 = r3 * r0
            float r3 = r3 + r2
            int r0 = (int) r3
            android.view.ViewGroup r2 = r9.f15180b
            r3 = 0
            if (r2 != 0) goto L_0x001b
            r2 = r3
            goto L_0x001f
        L_0x001b:
            android.view.View r2 = r2.getRootView()
        L_0x001f:
            if (r2 == 0) goto L_0x0087
            r4 = 16908290(0x1020002, float:2.3877235E-38)
            android.view.View r2 = r2.findViewById(r4)
            android.widget.FrameLayout r2 = (android.widget.FrameLayout) r2
            android.widget.FrameLayout r4 = new android.widget.FrameLayout
            com.inmobi.media.q r5 = r9.f15179a
            android.content.Context r5 = r5.getContainerContext()
            r4.<init>(r5)
            android.widget.FrameLayout$LayoutParams r5 = new android.widget.FrameLayout$LayoutParams
            r6 = -1
            r5.<init>(r6, r6)
            android.widget.RelativeLayout r6 = new android.widget.RelativeLayout
            com.inmobi.media.q r7 = r9.f15179a
            android.content.Context r7 = r7.getContainerContext()
            r6.<init>(r7)
            android.widget.FrameLayout$LayoutParams r7 = new android.widget.FrameLayout$LayoutParams
            r7.<init>(r1, r0)
            android.widget.RelativeLayout$LayoutParams r8 = new android.widget.RelativeLayout$LayoutParams
            r8.<init>(r1, r0)
            int r0 = com.inmobi.media.C6248i.f15813b
            r4.setId(r0)
            com.inmobi.media.q r0 = r9.f15179a
            android.view.ViewParent r0 = r0.getParent()
            boolean r0 = r0 instanceof android.view.ViewGroup
            if (r0 == 0) goto L_0x0068
            com.inmobi.media.q r0 = r9.f15179a
            android.view.ViewParent r0 = r0.getParent()
            r3 = r0
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
        L_0x0068:
            if (r3 == 0) goto L_0x006d
            r3.removeAllViews()
        L_0x006d:
            com.inmobi.media.q r0 = r9.f15179a
            r6.addView(r0, r8)
            java.lang.String r0 = r10.customClosePosition
            r9.m17839a((android.view.ViewGroup) r6, (java.lang.String) r0)
            r4.addView(r6, r7)
            r2.addView(r4, r5)
            android.view.ViewGroup r0 = r9.f15180b
            m17840a(r2, r4, r10, r0)
            r10 = 0
            r4.setBackgroundColor(r10)
            return
        L_0x0087:
            r10 = 1
            java.lang.Class<com.inmobi.media.dc> r0 = com.inmobi.media.C5973dc.class
            java.lang.String r0 = r0.getSimpleName()
            java.lang.String r1 = "Couldn't process resize request as root view was found null."
            com.inmobi.media.C6238hu.m18605a((byte) r10, (java.lang.String) r0, (java.lang.String) r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C5973dc.m17841a(com.inmobi.media.de):void");
    }

    /* renamed from: a */
    private void m17839a(ViewGroup viewGroup, String str) {
        float f = C6252ic.m18655a().f15840c;
        C5933cp cpVar = new C5933cp(this.f15179a.getContainerContext(), f, (byte) 1);
        cpVar.setId(C6248i.f15815d);
        cpVar.setOnClickListener(new View.OnClickListener() {
            public final void onClick(View view) {
                C5973dc.this.f15179a.mo35499b();
            }
        });
        viewGroup.addView(cpVar, m17836a(str, f));
    }

    /* renamed from: a */
    private static RelativeLayout.LayoutParams m17836a(String str, float f) {
        String a = m17838a(str);
        int i = (int) (f * 50.0f);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(i, i);
        if (C5976de.DEFAULT_POSITION.equals(a) || "bottom-right".equals(a)) {
            layoutParams.addRule(11);
        }
        if ("bottom-right".equals(a) || "bottom-left".equals(a) || "bottom-center".equals(a)) {
            layoutParams.addRule(12);
            layoutParams.addRule(4);
        }
        if ("bottom-center".equals(a) || "top-center".equals(a) || "center".equals(a)) {
            layoutParams.addRule(13);
        }
        if ("top-center".equals(a)) {
            layoutParams.addRule(10);
        }
        return layoutParams;
    }

    /* renamed from: a */
    private static String m17838a(String str) {
        if (str == null || str.length() == 0) {
            return C5976de.DEFAULT_POSITION;
        }
        if ("top-left".equals(str) || C5976de.DEFAULT_POSITION.equals(str) || "bottom-left".equals(str) || "bottom-right".equals(str) || "top-center".equals(str) || "bottom-center".equals(str) || "center".equals(str)) {
            return str;
        }
        return C5976de.DEFAULT_POSITION;
    }

    /* renamed from: a */
    private static void m17840a(FrameLayout frameLayout, FrameLayout frameLayout2, C5976de deVar, ViewGroup viewGroup) {
        float f = C6252ic.m18655a().f15840c;
        int i = (int) ((((float) deVar.width) * f) + 0.5f);
        int i2 = (int) ((((float) deVar.height) * f) + 0.5f);
        int i3 = (int) ((((float) deVar.offsetY) * f) + 0.5f);
        int[] iArr = new int[2];
        int[] iArr2 = new int[2];
        viewGroup.getLocationOnScreen(iArr);
        frameLayout.getLocationOnScreen(iArr2);
        iArr[1] = iArr[1] - iArr2[1];
        iArr[0] = iArr[0] - iArr2[0];
        iArr[0] = iArr[0] + ((int) ((((float) deVar.offsetX) * f) + 0.5f));
        iArr[1] = iArr[1] + i3;
        if (!deVar.allowOffscreen.booleanValue()) {
            if (i > frameLayout.getWidth() - iArr[0]) {
                iArr[0] = frameLayout.getWidth() - i;
            }
            if (i2 > frameLayout.getHeight() - iArr[1]) {
                iArr[1] = frameLayout.getHeight() - i2;
            }
            if (iArr[0] < 0) {
                iArr[0] = 0;
            }
            if (iArr[1] < 0) {
                iArr[1] = 0;
            }
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i, i2);
        layoutParams.leftMargin = iArr[0];
        layoutParams.topMargin = iArr[1];
        layoutParams.gravity = GravityCompat.START;
        frameLayout2.setLayoutParams(layoutParams);
    }
}

package com.applovin.impl.sdk;

import android.app.Activity;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.View;
import android.view.animation.Animation;
import com.applovin.impl.mediation.p028a.C1577e;
import com.applovin.impl.sdk.utils.C2039g;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.sdk.AppLovinSdkUtils;

/* renamed from: com.applovin.impl.sdk.z */
public class C2101z {

    /* renamed from: a */
    private final C1959m f4123a;

    /* renamed from: b */
    private final C2092v f4124b;

    /* renamed from: c */
    private final View f4125c;

    public C2101z(View view, C1959m mVar) {
        this.f4123a = mVar;
        this.f4124b = mVar.mo14286A();
        this.f4125c = view;
    }

    /* renamed from: a */
    public long mo14810a(C1577e eVar) {
        if (C2092v.m5047a()) {
            this.f4124b.mo14789b("ViewabilityTracker", "Checking visibility...");
        }
        long j = 0;
        if (!this.f4125c.isShown()) {
            if (C2092v.m5047a()) {
                this.f4124b.mo14793e("ViewabilityTracker", "View is hidden");
            }
            j = 2;
        }
        if (this.f4125c.getAlpha() < eVar.mo13201E()) {
            if (C2092v.m5047a()) {
                this.f4124b.mo14793e("ViewabilityTracker", "View is transparent");
            }
            j |= 4;
        }
        Animation animation = this.f4125c.getAnimation();
        if (animation != null && animation.hasStarted() && !animation.hasEnded()) {
            if (C2092v.m5047a()) {
                this.f4124b.mo14793e("ViewabilityTracker", "View is animating");
            }
            j |= 8;
        }
        if (this.f4125c.getParent() == null) {
            if (C2092v.m5047a()) {
                this.f4124b.mo14793e("ViewabilityTracker", "No parent view found");
            }
            j |= 16;
        }
        int pxToDp = AppLovinSdkUtils.pxToDp(this.f4125c.getContext(), this.f4125c.getWidth());
        if (pxToDp < eVar.mo13199C()) {
            if (C2092v.m5047a()) {
                C2092v vVar = this.f4124b;
                vVar.mo14793e("ViewabilityTracker", "View has width (" + pxToDp + ") below threshold");
            }
            j |= 32;
        }
        int pxToDp2 = AppLovinSdkUtils.pxToDp(this.f4125c.getContext(), this.f4125c.getHeight());
        if (pxToDp2 < eVar.mo13200D()) {
            if (C2092v.m5047a()) {
                C2092v vVar2 = this.f4124b;
                vVar2.mo14793e("ViewabilityTracker", "View has height (" + pxToDp2 + ") below threshold");
            }
            j |= 64;
        }
        Point a = C2039g.m4880a(this.f4125c.getContext());
        Rect rect = new Rect(0, 0, a.x, a.y);
        int[] iArr = {-1, -1};
        this.f4125c.getLocationOnScreen(iArr);
        Rect rect2 = new Rect(iArr[0], iArr[1], iArr[0] + this.f4125c.getWidth(), iArr[1] + this.f4125c.getHeight());
        if (!Rect.intersects(rect, rect2)) {
            if (C2092v.m5047a()) {
                C2092v vVar3 = this.f4124b;
                vVar3.mo14793e("ViewabilityTracker", "Rect (" + rect2 + ") outside of screen's bounds (" + rect + ")");
            }
            j |= 128;
        }
        Activity a2 = this.f4123a.mo14333af().mo13822a();
        if (a2 != null && !Utils.isViewInTopActivity(this.f4125c, a2)) {
            if (C2092v.m5047a()) {
                this.f4124b.mo14793e("ViewabilityTracker", "View is not in top activity's view hierarchy");
            }
            j |= 256;
        }
        if (C2092v.m5047a()) {
            C2092v vVar4 = this.f4124b;
            vVar4.mo14789b("ViewabilityTracker", "Returning flags: " + Long.toBinaryString(j));
        }
        return j;
    }
}

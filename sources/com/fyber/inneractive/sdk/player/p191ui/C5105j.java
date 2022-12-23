package com.fyber.inneractive.sdk.player.p191ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: com.fyber.inneractive.sdk.player.ui.j */
public class C5105j extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ C5100i f13685a;

    public C5105j(C5100i iVar) {
        this.f13685a = iVar;
    }

    public void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        C5100i iVar = this.f13685a;
        ViewGroup viewGroup = iVar.f13674y;
        if (viewGroup != null && viewGroup.getParent() != null) {
            ((View) iVar.f13674y.getParent()).setOnTouchListener((View.OnTouchListener) null);
        }
    }
}

package com.smaato.sdk.video.utils;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

public class AnimationHelper {
    private final long animationDurationMillis;

    public AnimationHelper(long j) {
        this.animationDurationMillis = j;
    }

    public void showWithAnim(View view) {
        view.setAlpha(0.0f);
        view.setVisibility(0);
        view.animate().alpha(1.0f).setDuration(this.animationDurationMillis).start();
    }

    public void hideWithAnim(final View view) {
        view.animate().alpha(0.0f).setDuration(this.animationDurationMillis).setListener(new AnimatorListenerAdapter() {
            public void onAnimationEnd(Animator animator) {
                view.setVisibility(8);
            }
        }).start();
    }
}

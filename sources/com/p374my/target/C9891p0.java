package com.p374my.target;

import android.content.Context;
import com.p374my.target.ads.Reward;

/* renamed from: com.my.target.p0 */
public interface C9891p0 {

    /* renamed from: com.my.target.p0$a */
    public interface C9892a {
        void onClick();

        void onDismiss();

        void onDisplay();

        void onLoad();

        void onNoAd(String str);

        void onStartDisplaying();

        void onVideoCompleted();
    }

    /* renamed from: com.my.target.p0$b */
    public interface C9893b {
        void onReward(Reward reward);
    }

    /* renamed from: a */
    void mo63410a(Context context);

    /* renamed from: a */
    void mo63413a(C9893b bVar);

    /* renamed from: c */
    String mo65189c();

    /* renamed from: d */
    float mo65190d();

    void destroy();

    void dismiss();
}

package com.fyber.inneractive.sdk.external;

import com.fyber.inneractive.sdk.flow.C4451z;
import com.fyber.inneractive.sdk.util.C5370s;
import java.lang.ref.WeakReference;

public class InneractiveNativeVideoContentController extends C4451z {

    /* renamed from: a */
    public WeakReference<Renderer> f10841a;

    public interface Renderer {
        void pauseVideo();

        void playVideo();
    }

    public boolean canControl(InneractiveAdSpot inneractiveAdSpot) {
        return inneractiveAdSpot.getAdContent().isVideoAd();
    }

    public void pauseVideo() {
        if (((Renderer) C5370s.m16784a(this.f10841a)) != null) {
            ((Renderer) this.f10841a.get()).pauseVideo();
        }
    }

    public void playVideo() {
        Renderer renderer = (Renderer) C5370s.m16784a(this.f10841a);
        if (renderer != null) {
            renderer.playVideo();
        }
    }

    public void setControlledRenderer(Renderer renderer) {
        this.f10841a = new WeakReference<>(renderer);
    }
}

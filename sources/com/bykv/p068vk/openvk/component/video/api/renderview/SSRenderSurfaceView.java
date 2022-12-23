package com.bykv.p068vk.openvk.component.video.api.renderview;

import android.content.Context;
import android.view.SurfaceHolder;
import android.view.View;
import android.view.ViewGroup;
import com.bykv.p068vk.openvk.component.video.api.p088f.C2536c;
import com.bykv.p068vk.openvk.component.video.api.renderview.C2540b;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.bykv.vk.openvk.component.video.api.renderview.SSRenderSurfaceView */
public class SSRenderSurfaceView extends SSSurfaceView implements SurfaceHolder.Callback, C2540b {

    /* renamed from: c */
    private static final ArrayList<C2542c> f5426c = new ArrayList<>();

    /* renamed from: a */
    private WeakReference<C2539a> f5427a;

    /* renamed from: b */
    private C2542c f5428b;

    /* renamed from: d */
    private C2540b.C2541a f5429d;

    public View getView() {
        return this;
    }

    public SSRenderSurfaceView(Context context) {
        super(context);
        C2536c.m6436b("CSJ_VIDEO_SurfaceView", "SSRenderSurfaceView: ");
        m6443a();
    }

    /* renamed from: a */
    private void m6443a() {
        C2542c cVar = new C2542c(this);
        this.f5428b = cVar;
        f5426c.add(cVar);
    }

    /* renamed from: a */
    public void mo16479a(C2539a aVar) {
        this.f5427a = new WeakReference<>(aVar);
        SurfaceHolder holder = getHolder();
        holder.setFormat(-3);
        Iterator<C2542c> it = f5426c.iterator();
        while (it.hasNext()) {
            C2542c next = it.next();
            if (next != null && next.mo16505a() == null) {
                holder.removeCallback(next);
                it.remove();
            }
        }
        holder.addCallback(this.f5428b);
    }

    /* renamed from: a */
    public void mo16478a(int i, int i2) {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        layoutParams.height = i2;
        layoutParams.width = i;
        setLayoutParams(layoutParams);
    }

    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        WeakReference<C2539a> weakReference = this.f5427a;
        if (!(weakReference == null || weakReference.get() == null)) {
            ((C2539a) this.f5427a.get()).mo16497a(surfaceHolder);
        }
        C2536c.m6436b("CSJ_VIDEO_SurfaceView", "surfaceCreated: ");
    }

    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        C2536c.m6436b("CSJ_VIDEO_SurfaceView", "surfaceChanged: ");
        WeakReference<C2539a> weakReference = this.f5427a;
        if (weakReference != null && weakReference.get() != null) {
            ((C2539a) this.f5427a.get()).mo16498a(surfaceHolder, i, i2, i3);
        }
    }

    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        C2536c.m6436b("CSJ_VIDEO_SurfaceView", "surfaceDestroyed: ");
        WeakReference<C2539a> weakReference = this.f5427a;
        if (weakReference != null && weakReference.get() != null) {
            ((C2539a) this.f5427a.get()).mo16502b(surfaceHolder);
        }
    }

    /* access modifiers changed from: protected */
    public void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        C2540b.C2541a aVar = this.f5429d;
        if (aVar != null) {
            aVar.mo16504a(i);
        }
    }

    public void setWindowVisibilityChangedListener(C2540b.C2541a aVar) {
        this.f5429d = aVar;
    }
}

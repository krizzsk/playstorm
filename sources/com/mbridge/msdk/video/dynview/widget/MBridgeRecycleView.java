package com.mbridge.msdk.video.dynview.widget;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.mbridge.msdk.foundation.tools.C8613y;
import java.lang.ref.WeakReference;

public class MBridgeRecycleView extends RecyclerView {

    /* renamed from: c */
    private static int f22673c = -1;

    /* renamed from: a */
    C9327a f22674a;

    /* renamed from: b */
    private float f22675b;

    /* renamed from: d */
    private float f22676d;

    /* renamed from: e */
    private float f22677e;

    /* renamed from: f */
    private int f22678f;

    /* renamed from: g */
    private float f22679g;

    /* renamed from: h */
    private int f22680h;

    /* renamed from: i */
    private boolean f22681i;

    /* renamed from: j */
    private LinearLayoutManager f22682j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public boolean f22683k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public boolean f22684l;

    public MBridgeRecycleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f22675b = 0.0f;
        this.f22676d = 0.0f;
        this.f22677e = -1.0f;
        this.f22678f = -1;
        this.f22679g = 1.3f;
        this.f22681i = false;
        this.f22674a = new C9327a(this);
        this.f22680h = C8613y.m24929b(context, 40.0f);
    }

    public MBridgeRecycleView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f22675b = 0.0f;
        this.f22676d = 0.0f;
        this.f22677e = -1.0f;
        this.f22678f = -1;
        this.f22679g = 1.3f;
        this.f22681i = false;
    }

    /* renamed from: a */
    public final void mo62546a(LinearLayoutManager linearLayoutManager) {
        this.f22682j = linearLayoutManager;
    }

    /* renamed from: com.mbridge.msdk.video.dynview.widget.MBridgeRecycleView$a */
    static class C9327a implements Runnable {

        /* renamed from: a */
        private final WeakReference<MBridgeRecycleView> f22685a;

        public C9327a(MBridgeRecycleView mBridgeRecycleView) {
            this.f22685a = new WeakReference<>(mBridgeRecycleView);
        }

        public final void run() {
            MBridgeRecycleView mBridgeRecycleView = (MBridgeRecycleView) this.f22685a.get();
            if (mBridgeRecycleView != null && mBridgeRecycleView.f22683k && mBridgeRecycleView.f22684l) {
                mBridgeRecycleView.scrollBy(-1, 0);
                mBridgeRecycleView.postDelayed(mBridgeRecycleView.f22674a, 16);
            }
        }
    }

    /* renamed from: a */
    public final void mo62547a(boolean z) {
        this.f22681i = z;
    }

    /* renamed from: a */
    public final void mo62545a() {
        if (this.f22683k) {
            this.f22683k = false;
            removeCallbacks(this.f22674a);
        }
        if (this.f22681i) {
            this.f22684l = true;
            this.f22683k = true;
            postDelayed(this.f22674a, 16);
        }
    }
}

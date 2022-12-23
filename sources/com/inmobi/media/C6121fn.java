package com.inmobi.media;

import android.content.Context;
import android.os.Build;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.inmobi.ads.viewsv2.NativeRecyclerViewAdapter;
import com.inmobi.media.C6082ff;

/* renamed from: com.inmobi.media.fn */
/* compiled from: ScrollableDeckFreeContainer */
class C6121fn extends C6082ff {

    /* renamed from: a */
    private RecyclerView f15564a;

    /* renamed from: b */
    private boolean f15565b = false;

    public C6121fn(Context context) {
        super(context, (byte) 1);
    }

    /* renamed from: a */
    public final void mo35237a(C5903bv bvVar, C6084fg fgVar, int i, int i2, C6082ff.C6083a aVar) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) C6103fl.m18232a(bvVar.mo34887a(0), (ViewGroup) this);
        if (Build.VERSION.SDK_INT >= 17) {
            layoutParams.setMarginStart(20);
            layoutParams.setMarginEnd(20);
        } else {
            layoutParams.setMargins(20, 0, 20, 0);
        }
        layoutParams.gravity = i2;
        RecyclerView recyclerView = new RecyclerView(getContext());
        this.f15564a = recyclerView;
        recyclerView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.f15564a.setLayoutManager(new LinearLayoutManager(getContext(), 0, false));
        addView(this.f15564a);
        this.f15564a.setAdapter((NativeRecyclerViewAdapter) fgVar);
    }
}

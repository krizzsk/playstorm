package com.inmobi.ads.viewsv2;

import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.inmobi.media.C5901bt;
import com.inmobi.media.C5903bv;
import com.inmobi.media.C5907bx;
import com.inmobi.media.C6067fc;
import com.inmobi.media.C6084fg;
import com.inmobi.media.C6103fl;
import java.lang.ref.WeakReference;

public class NativeRecyclerViewAdapter extends RecyclerView.Adapter<C8148a> implements C6084fg {

    /* renamed from: a */
    private static final String f19398a = NativeRecyclerViewAdapter.class.getSimpleName();

    /* renamed from: b */
    private C5907bx f19399b;

    /* renamed from: c */
    private C6067fc f19400c;

    /* renamed from: d */
    private SparseArray<WeakReference<View>> f19401d = new SparseArray<>();

    public NativeRecyclerViewAdapter(C5907bx bxVar, C6067fc fcVar) {
        this.f19399b = bxVar;
        this.f19400c = fcVar;
    }

    /* renamed from: com.inmobi.ads.viewsv2.NativeRecyclerViewAdapter$a */
    class C8148a extends RecyclerView.ViewHolder {
        /* access modifiers changed from: private */

        /* renamed from: b */
        public ViewGroup f19403b;

        C8148a(View view) {
            super(view);
            this.f19403b = (ViewGroup) view;
        }
    }

    public C8148a onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C8148a(new FrameLayout(viewGroup.getContext()));
    }

    public void onBindViewHolder(C8148a aVar, int i) {
        View view;
        C5907bx bxVar = this.f19399b;
        C5903bv a = bxVar == null ? null : bxVar.mo34894a(i);
        WeakReference weakReference = this.f19401d.get(i);
        if (a != null) {
            if (weakReference == null || (view = (View) weakReference.get()) == null) {
                view = buildScrollableView(i, aVar.f19403b, a);
            }
            if (view != null) {
                if (i != getItemCount() - 1) {
                    aVar.f19403b.setPadding(0, 0, 16, 0);
                }
                aVar.f19403b.addView(view);
                this.f19401d.put(i, new WeakReference(view));
            }
        }
    }

    public void onViewRecycled(C8148a aVar) {
        aVar.f19403b.removeAllViews();
        super.onViewRecycled(aVar);
    }

    public ViewGroup buildScrollableView(int i, ViewGroup viewGroup, C5903bv bvVar) {
        ViewGroup a = this.f19400c.mo35220a(viewGroup, bvVar);
        this.f19400c.mo35223b(a, bvVar);
        a.setLayoutParams(C6103fl.m18232a((C5901bt) bvVar, viewGroup));
        return a;
    }

    public int getItemCount() {
        C5907bx bxVar = this.f19399b;
        if (bxVar == null) {
            return 0;
        }
        return bxVar.mo34898c();
    }

    public void destroy() {
        C5907bx bxVar = this.f19399b;
        if (bxVar != null) {
            bxVar.f14942h = null;
            bxVar.f14940f = null;
            this.f19399b = null;
        }
        this.f19400c = null;
    }
}

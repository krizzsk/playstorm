package com.inmobi.media;

import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.PagerAdapter;

/* renamed from: com.inmobi.media.fa */
/* compiled from: NativeDataSource */
final class C6061fa extends PagerAdapter implements C6084fg {

    /* renamed from: a */
    private static final String f15414a = C6061fa.class.getSimpleName();

    /* renamed from: e */
    private static Handler f15415e = new Handler(Looper.getMainLooper());
    /* access modifiers changed from: private */

    /* renamed from: b */
    public boolean f15416b;

    /* renamed from: c */
    private final C5907bx f15417c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public C6067fc f15418d;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public SparseArray<Runnable> f15419f = new SparseArray<>();

    C6061fa(C5907bx bxVar, C6067fc fcVar) {
        this.f15417c = bxVar;
        this.f15418d = fcVar;
    }

    public final int getItemPosition(Object obj) {
        Object tag = obj == null ? null : ((View) obj).getTag();
        if (tag instanceof Integer) {
            return ((Integer) tag).intValue();
        }
        return -2;
    }

    public final int getCount() {
        return this.f15417c.mo34898c();
    }

    public final boolean isViewFromObject(View view, Object obj) {
        return view.equals(obj);
    }

    public final Object instantiateItem(ViewGroup viewGroup, int i) {
        C5903bv a = this.f15417c.mo34894a(i);
        if (a == null) {
            return null;
        }
        ViewGroup a2 = this.f15418d.mo35220a(viewGroup, a);
        int abs = Math.abs(this.f15418d.f15434a - i);
        final int i2 = i;
        final ViewGroup viewGroup2 = a2;
        final ViewGroup viewGroup3 = viewGroup;
        final C5903bv bvVar = a;
        C60632 r1 = new Runnable() {
            public final void run() {
                if (!C6061fa.this.f15416b) {
                    C6061fa.this.f15419f.remove(i2);
                    C6061fa.this.f15418d.mo35223b(viewGroup2, bvVar);
                }
            }
        };
        this.f15419f.put(i, r1);
        f15415e.postDelayed(r1, (long) (abs * 50));
        a2.setLayoutParams(C6103fl.m18232a((C5901bt) a, viewGroup));
        a2.setTag(Integer.valueOf(i));
        viewGroup.addView(a2);
        return a2;
    }

    public final void destroyItem(ViewGroup viewGroup, int i, final Object obj) {
        viewGroup.removeView((View) obj);
        Runnable runnable = this.f15419f.get(i);
        if (runnable != null) {
            f15415e.removeCallbacks(runnable);
            C6103fl.class.getSimpleName();
        }
        f15415e.post(new Runnable() {
            public final void run() {
                C6061fa.this.f15418d.f15436c.mo35307a((View) obj);
            }
        });
    }

    public final void destroy() {
        this.f15416b = true;
        int size = this.f15419f.size();
        for (int i = 0; i < size; i++) {
            f15415e.removeCallbacks(this.f15419f.get(this.f15419f.keyAt(i)));
        }
        this.f15419f.clear();
    }
}

package com.applovin.impl.mediation.debugger.p038ui.p043d;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.C2392R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.applovin.impl.mediation.debugger.ui.d.d */
public abstract class C1711d extends BaseAdapter implements View.OnClickListener {

    /* renamed from: a */
    private List<C1707c> f2573a = new ArrayList();

    /* renamed from: b */
    private Map<Integer, Integer> f2574b = new HashMap();
    /* access modifiers changed from: protected */

    /* renamed from: c */
    public Context f2575c;

    /* renamed from: d */
    private C1713a f2576d;

    /* renamed from: e */
    private LayoutInflater f2577e;

    /* renamed from: com.applovin.impl.mediation.debugger.ui.d.d$a */
    public interface C1713a {
        /* renamed from: a */
        void mo13476a(C1705a aVar, C1707c cVar);
    }

    protected C1711d(Context context) {
        this.f2575c = context;
    }

    /* renamed from: a */
    private LayoutInflater mo13481a() {
        LayoutInflater layoutInflater = this.f2577e;
        if (layoutInflater != null) {
            return layoutInflater;
        }
        LayoutInflater layoutInflater2 = (LayoutInflater) this.f2575c.getSystemService("layout_inflater");
        this.f2577e = layoutInflater2;
        return layoutInflater2;
    }

    /* renamed from: e */
    private C1705a m3576e(int i) {
        for (int i2 = 0; i2 < mo13482b(); i2++) {
            Integer num = this.f2574b.get(Integer.valueOf(i2));
            if (num != null) {
                if (i <= num.intValue() + mo13480a(i2)) {
                    return new C1705a(i2, i - (num.intValue() + 1));
                }
            }
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract int mo13480a(int i);

    /* renamed from: a */
    public Bitmap mo13553a(ListView listView) {
        int count = getCount();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(listView.getWidth(), 1073741824);
        int i = 0;
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        ArrayList<Bitmap> arrayList = new ArrayList<>(count);
        int i2 = 0;
        for (int i3 = 0; i3 < count; i3++) {
            View view = getView(i3, (View) null, listView);
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
            Bitmap createBitmap = Bitmap.createBitmap(view.getMeasuredWidth(), view.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
            view.draw(new Canvas(createBitmap));
            arrayList.add(createBitmap);
            i2 += view.getMeasuredHeight();
        }
        Bitmap createBitmap2 = Bitmap.createBitmap(listView.getMeasuredWidth(), i2, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap2);
        Paint paint = new Paint();
        for (Bitmap bitmap : arrayList) {
            canvas.drawBitmap(bitmap, 0.0f, (float) i, paint);
            i += bitmap.getHeight();
            bitmap.recycle();
        }
        return createBitmap2;
    }

    /* renamed from: a */
    public void mo13554a(C1713a aVar) {
        this.f2576d = aVar;
    }

    public boolean areAllItemsEnabled() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract int mo13482b();

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract C1707c mo13483b(int i);

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract List<C1707c> mo13484c(int i);

    /* renamed from: d */
    public C1707c getItem(int i) {
        return this.f2573a.get(i);
    }

    public int getCount() {
        return this.f2573a.size();
    }

    public long getItemId(int i) {
        return (long) i;
    }

    public int getItemViewType(int i) {
        return getItem(i).mo13531i();
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        C1706b bVar;
        C1707c d = getItem(i);
        if (view == null) {
            view = mo13481a().inflate(d.mo13532j(), viewGroup, false);
            bVar = new C1706b();
            bVar.f2533a = (TextView) view.findViewById(16908308);
            bVar.f2534b = (TextView) view.findViewById(16908309);
            bVar.f2535c = (ImageView) view.findViewById(C2392R.C2394id.imageView);
            bVar.f2536d = (ImageView) view.findViewById(C2392R.C2394id.detailImageView);
            view.setTag(bVar);
            view.setOnClickListener(this);
        } else {
            bVar = (C1706b) view.getTag();
        }
        bVar.mo13528a(i);
        bVar.mo13529a(d);
        view.setEnabled(d.mo13486b());
        return view;
    }

    public int getViewTypeCount() {
        return C1707c.m3544h();
    }

    public boolean isEnabled(int i) {
        return getItem(i).mo13486b();
    }

    /* renamed from: j */
    public void mo13564j() {
        AppLovinSdkUtils.runOnUiThread(new Runnable() {
            public void run() {
                C1711d.this.notifyDataSetChanged();
            }
        });
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public C1707c mo13565k() {
        return null;
    }

    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        this.f2573a = new ArrayList();
        Integer num = 0;
        Integer valueOf = Integer.valueOf(mo13482b());
        this.f2574b = new HashMap(valueOf.intValue());
        C1707c k = mo13565k();
        if (k != null) {
            this.f2573a.add(k);
            num = Integer.valueOf(num.intValue() + 1);
        }
        for (int i = 0; i < valueOf.intValue(); i++) {
            Integer valueOf2 = Integer.valueOf(mo13480a(i));
            if (valueOf2.intValue() != 0) {
                this.f2573a.add(mo13483b(i));
                this.f2573a.addAll(mo13484c(i));
                this.f2574b.put(Integer.valueOf(i), num);
                num = Integer.valueOf(num.intValue() + valueOf2.intValue() + 1);
            }
        }
        this.f2573a.add(new C1714e(""));
    }

    public void onClick(View view) {
        C1706b bVar = (C1706b) view.getTag();
        C1707c b = bVar.mo13530b();
        C1705a e = m3576e(bVar.mo13527a());
        C1713a aVar = this.f2576d;
        if (aVar != null && e != null) {
            aVar.mo13476a(e, b);
        }
    }
}

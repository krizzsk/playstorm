package com.p374my.target;

import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p374my.target.C10005v6;
import com.p374my.target.C9934r6;
import com.p374my.target.C9951s6;
import java.util.List;

/* renamed from: com.my.target.t6 */
public class C9972t6 extends RecyclerView implements C9991u6 {

    /* renamed from: a */
    public final C9975c f24690a;

    /* renamed from: b */
    public final C9951s6.C9954c f24691b;

    /* renamed from: c */
    public final C9951s6 f24692c;

    /* renamed from: d */
    public boolean f24693d;

    /* renamed from: e */
    public C10005v6.C10006a f24694e;

    /* renamed from: com.my.target.t6$b */
    public class C9974b implements C9951s6.C9954c {
        public C9974b() {
        }

        public void onCardRender(int i) {
            if (C9972t6.this.f24694e != null) {
                C9972t6.this.f24694e.mo63985a(i, C9972t6.this.getContext());
            }
        }

        public void onClick(View view) {
            View findContainingItemView;
            int position;
            if (!C9972t6.this.f24693d && C9972t6.this.isClickable() && (findContainingItemView = C9972t6.this.f24690a.findContainingItemView(view)) != null && C9972t6.this.f24694e != null && (position = C9972t6.this.f24690a.getPosition(findContainingItemView)) >= 0) {
                C9972t6.this.f24694e.mo63987a(findContainingItemView, position);
            }
        }
    }

    /* renamed from: com.my.target.t6$c */
    public static class C9975c extends LinearLayoutManager {

        /* renamed from: a */
        public C9934r6.C9935a f24696a;

        /* renamed from: b */
        public int f24697b;

        public C9975c(Context context) {
            super(context, 0, false);
        }

        /* renamed from: a */
        public void mo65472a(int i) {
            this.f24697b = i;
        }

        /* renamed from: a */
        public void mo65473a(C9934r6.C9935a aVar) {
            this.f24696a = aVar;
        }

        public void measureChildWithMargins(View view, int i, int i2) {
            int i3;
            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
            int width = getWidth();
            if (getHeight() > 0 && width > 0) {
                if (getItemViewType(view) == 1) {
                    i3 = this.f24697b;
                } else if (getItemViewType(view) == 2) {
                    layoutParams.leftMargin = this.f24697b;
                    super.measureChildWithMargins(view, i, i2);
                } else {
                    i3 = this.f24697b;
                    layoutParams.leftMargin = i3;
                }
                layoutParams.rightMargin = i3;
                super.measureChildWithMargins(view, i, i2);
            }
        }

        public void onLayoutCompleted(RecyclerView.State state) {
            super.onLayoutCompleted(state);
            C9934r6.C9935a aVar = this.f24696a;
            if (aVar != null) {
                aVar.mo63318a();
            }
        }
    }

    public C9972t6(Context context) {
        this(context, (AttributeSet) null);
    }

    public C9972t6(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C9972t6(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f24691b = new C9974b();
        C9975c cVar = new C9975c(context);
        this.f24690a = cVar;
        cVar.mo65472a(C10059y8.m29824a(4, context));
        this.f24692c = new C9951s6(getContext());
        setHasFixedSize(true);
    }

    private void setCardLayoutManager(C9975c cVar) {
        cVar.mo65473a((C9934r6.C9935a) new C9934r6.C9935a() {
            /* renamed from: a */
            public final void mo63318a() {
                C9972t6.this.mo65468a();
            }
        });
        super.setLayoutManager(cVar);
    }

    /* renamed from: a */
    public final void mo65468a() {
        C10005v6.C10006a aVar = this.f24694e;
        if (aVar != null) {
            aVar.mo63989a(getVisibleCardNumbers(), getContext());
        }
    }

    public void dispose() {
        this.f24692c.mo65384a();
    }

    public Parcelable getState() {
        return this.f24690a.onSaveInstanceState();
    }

    public View getView() {
        return this;
    }

    public int[] getVisibleCardNumbers() {
        int findFirstVisibleItemPosition = this.f24690a.findFirstVisibleItemPosition();
        int findLastVisibleItemPosition = this.f24690a.findLastVisibleItemPosition();
        if (findFirstVisibleItemPosition < 0 || findLastVisibleItemPosition < 0) {
            return new int[0];
        }
        if (C9609a9.m27614a(this.f24690a.findViewByPosition(findFirstVisibleItemPosition)) < 50.0d) {
            findFirstVisibleItemPosition++;
        }
        if (C9609a9.m27614a(this.f24690a.findViewByPosition(findLastVisibleItemPosition)) < 50.0d) {
            findLastVisibleItemPosition--;
        }
        if (findFirstVisibleItemPosition > findLastVisibleItemPosition) {
            return new int[0];
        }
        if (findFirstVisibleItemPosition == findLastVisibleItemPosition) {
            return new int[]{findFirstVisibleItemPosition};
        }
        int i = (findLastVisibleItemPosition - findFirstVisibleItemPosition) + 1;
        int[] iArr = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            iArr[i2] = findFirstVisibleItemPosition;
            findFirstVisibleItemPosition++;
        }
        return iArr;
    }

    public void onScrollStateChanged(int i) {
        super.onScrollStateChanged(i);
        boolean z = i != 0;
        this.f24693d = z;
        if (!z) {
            mo65468a();
        }
    }

    public void restoreState(Parcelable parcelable) {
        this.f24690a.onRestoreInstanceState(parcelable);
    }

    public void setPromoCardSliderListener(C10005v6.C10006a aVar) {
        this.f24694e = aVar;
    }

    public void setupCards(List<C9751i2> list) {
        this.f24692c.mo65388a(list);
        if (isClickable()) {
            this.f24692c.mo65387a(this.f24691b);
        }
        setCardLayoutManager(this.f24690a);
        swapAdapter(this.f24692c, true);
    }
}

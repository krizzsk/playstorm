package com.p374my.target;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import androidx.core.view.GravityCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.p374my.target.C9649c8;
import com.p374my.target.C9666d8;
import com.p374my.target.C9830l7;

/* renamed from: com.my.target.e8 */
public class C9686e8 extends FrameLayout implements C9666d8, C9649c8.C9650a, C9830l7.C9831a {

    /* renamed from: a */
    public final C9830l7 f23840a;

    /* renamed from: b */
    public final LinearLayoutManager f23841b;

    /* renamed from: c */
    public final C9805k7 f23842c;

    /* renamed from: d */
    public C9666d8.C9667a f23843d;

    public C9686e8(Context context) {
        super(context);
        C9830l7 l7Var = new C9830l7(context);
        this.f23840a = l7Var;
        C9649c8 c8Var = new C9649c8(context);
        c8Var.mo63721a(this);
        l7Var.setLayoutManager(c8Var);
        this.f23841b = c8Var;
        C9805k7 k7Var = new C9805k7(17);
        this.f23842c = k7Var;
        k7Var.attachToRecyclerView(l7Var);
        l7Var.setHasFixedSize(true);
        l7Var.setMoveStopListener(this);
        addView(l7Var, new FrameLayout.LayoutParams(-1, -1));
    }

    /* renamed from: a */
    public void mo63722a() {
        int i;
        C9805k7 k7Var;
        int findFirstCompletelyVisibleItemPosition = this.f23841b.findFirstCompletelyVisibleItemPosition();
        View findViewByPosition = findFirstCompletelyVisibleItemPosition >= 0 ? this.f23841b.findViewByPosition(findFirstCompletelyVisibleItemPosition) : null;
        if (this.f23840a.getChildCount() == 0 || findViewByPosition == null || ((double) getWidth()) > ((double) findViewByPosition.getWidth()) * 1.7d) {
            k7Var = this.f23842c;
            i = GravityCompat.START;
        } else {
            k7Var = this.f23842c;
            i = 17;
        }
        k7Var.mo64612a(i);
        mo63963c();
    }

    /* renamed from: a */
    public boolean mo63898a(int i) {
        return i >= this.f23841b.findFirstCompletelyVisibleItemPosition() && i <= this.f23841b.findLastCompletelyVisibleItemPosition();
    }

    /* renamed from: a */
    public final boolean mo63961a(View view) {
        return C9609a9.m27614a(view) < 50.0d;
    }

    /* renamed from: b */
    public void mo63962b() {
        mo63963c();
    }

    /* renamed from: b */
    public void mo63899b(int i) {
        this.f23842c.mo64617b(i);
    }

    /* renamed from: c */
    public final void mo63963c() {
        int[] iArr;
        if (this.f23843d != null) {
            int findFirstVisibleItemPosition = this.f23841b.findFirstVisibleItemPosition();
            int findLastVisibleItemPosition = this.f23841b.findLastVisibleItemPosition();
            if (findFirstVisibleItemPosition >= 0 && findLastVisibleItemPosition >= 0) {
                if (mo63961a(this.f23841b.findViewByPosition(findFirstVisibleItemPosition))) {
                    findFirstVisibleItemPosition++;
                }
                if (mo63961a(this.f23841b.findViewByPosition(findLastVisibleItemPosition))) {
                    findLastVisibleItemPosition--;
                }
                if (findFirstVisibleItemPosition <= findLastVisibleItemPosition) {
                    if (findFirstVisibleItemPosition == findLastVisibleItemPosition) {
                        iArr = new int[]{findFirstVisibleItemPosition};
                    } else {
                        int i = (findLastVisibleItemPosition - findFirstVisibleItemPosition) + 1;
                        int[] iArr2 = new int[i];
                        for (int i2 = 0; i2 < i; i2++) {
                            iArr2[i2] = findFirstVisibleItemPosition;
                            findFirstVisibleItemPosition++;
                        }
                        iArr = iArr2;
                    }
                    this.f23843d.mo63901a(iArr);
                }
            }
        }
    }

    public void setAdapter(C10058y7 y7Var) {
        this.f23840a.setAdapter(y7Var);
    }

    public void setListener(C9666d8.C9667a aVar) {
        this.f23843d = aVar;
    }
}

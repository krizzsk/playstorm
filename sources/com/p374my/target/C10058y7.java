package com.p374my.target;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

/* renamed from: com.my.target.y7 */
public class C10058y7 extends RecyclerView.Adapter<C9633b8> {

    /* renamed from: a */
    public final List<C9918q4> f25022a;

    /* renamed from: b */
    public final C9863n7 f25023b;

    public C10058y7(List<C9918q4> list, C9863n7 n7Var) {
        this.f25022a = list;
        this.f25023b = n7Var;
    }

    /* renamed from: a */
    public C9633b8 onCreateViewHolder(ViewGroup viewGroup, int i) {
        C10080z7 a = this.f25023b.mo64886a();
        a.mo63486a().setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        return new C9633b8(a);
    }

    /* renamed from: a */
    public void onBindViewHolder(C9633b8 b8Var, int i) {
        b8Var.mo63646a(this.f25022a.get(i), i);
    }

    /* renamed from: a */
    public boolean onFailedToRecycleView(C9633b8 b8Var) {
        b8Var.mo63645a();
        return super.onFailedToRecycleView(b8Var);
    }

    /* renamed from: b */
    public void onViewRecycled(C9633b8 b8Var) {
        b8Var.mo63645a();
        super.onViewRecycled(b8Var);
    }

    public int getItemCount() {
        return this.f25022a.size();
    }
}

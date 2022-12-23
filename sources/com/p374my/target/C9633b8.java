package com.p374my.target;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: com.my.target.b8 */
public class C9633b8 extends RecyclerView.ViewHolder {

    /* renamed from: a */
    public final C10080z7 f23689a;

    /* renamed from: b */
    public C9918q4 f23690b;

    public C9633b8(C10080z7 z7Var) {
        super(z7Var.mo63486a());
        this.f23689a = z7Var;
    }

    /* renamed from: a */
    public void mo63645a() {
        C9918q4 q4Var = this.f23690b;
        if (q4Var != null) {
            q4Var.mo65298a(this.f23689a);
        }
        this.f23690b = null;
    }

    /* renamed from: a */
    public void mo63646a(C9918q4 q4Var, int i) {
        this.f23690b = q4Var;
        q4Var.mo65299a(this.f23689a, i);
    }
}

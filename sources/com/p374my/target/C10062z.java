package com.p374my.target;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.my.target.z */
public class C10062z {

    /* renamed from: a */
    public final ArrayList<C10015w1> f25030a;

    /* renamed from: b */
    public final ArrayList<C9601a3> f25031b;

    /* renamed from: c */
    public int f25032c = -1;

    public C10062z(C9641c3 c3Var) {
        ArrayList<C10015w1> arrayList = new ArrayList<>();
        Iterator<C9626b3> it = c3Var.mo63675a("playheadTimerValue").iterator();
        while (it.hasNext()) {
            C9626b3 next = it.next();
            if (next instanceof C10015w1) {
                arrayList.add((C10015w1) next);
            }
        }
        this.f25030a = arrayList;
        ArrayList<C9601a3> arrayList2 = new ArrayList<>();
        this.f25031b = arrayList2;
        c3Var.mo63681b(arrayList2);
    }

    /* renamed from: a */
    public static C10062z m29851a(C9641c3 c3Var) {
        return new C10062z(c3Var);
    }

    /* renamed from: a */
    public void mo65781a(int i, int i2, Context context) {
        if (i2 >= 0 && i >= 0 && i != this.f25032c) {
            this.f25032c = i;
            if (!this.f25030a.isEmpty() && i != 0) {
                Iterator<C10015w1> it = this.f25030a.iterator();
                while (it.hasNext()) {
                    mo65782a(i, it.next(), context);
                }
            }
            ArrayList arrayList = new ArrayList();
            while (!this.f25031b.isEmpty()) {
                ArrayList<C9601a3> arrayList2 = this.f25031b;
                if (arrayList2.get(arrayList2.size() - 1).mo63450e() > ((float) i)) {
                    break;
                }
                ArrayList<C9601a3> arrayList3 = this.f25031b;
                arrayList.add(arrayList3.remove(arrayList3.size() - 1));
            }
            if (!arrayList.isEmpty()) {
                C10039x8.m29720c((List<C9626b3>) arrayList, context);
            }
        }
    }

    /* renamed from: a */
    public final void mo65782a(int i, C10015w1 w1Var, Context context) {
        int f = w1Var.mo65645f();
        int d = w1Var.mo65643d();
        if ((f <= i && (d == 0 || d >= i)) && (i - f) % w1Var.mo65644e() == 0) {
            String replace = w1Var.mo63604b().replace("[CONTENTPLAYHEAD]", String.valueOf(i));
            if (!TextUtils.isEmpty(replace)) {
                C10039x8.m29719c(replace, context);
            }
        }
    }
}

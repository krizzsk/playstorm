package com.p374my.target;

import com.p374my.target.C9983u1;
import com.p374my.target.common.models.AudioData;
import com.p374my.target.common.models.VideoData;
import com.vungle.warren.model.Advertisement;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.my.target.u2 */
public class C9984u2<T extends C9983u1> extends C9916q2 {

    /* renamed from: b */
    public final int f24766b;

    /* renamed from: c */
    public final String f24767c;

    /* renamed from: d */
    public final ArrayList<C9711g2<T>> f24768d = new ArrayList<>();

    /* renamed from: e */
    public final ArrayList<C9915q1> f24769e = new ArrayList<>();

    /* renamed from: f */
    public final ArrayList<C9915q1> f24770f = new ArrayList<>();

    /* renamed from: g */
    public final ArrayList<C9915q1> f24771g = new ArrayList<>();

    /* renamed from: h */
    public int f24772h = 10;

    /* renamed from: i */
    public int f24773i;

    public C9984u2(String str) {
        char c = 65535;
        this.f24773i = -1;
        this.f24767c = str;
        str.hashCode();
        switch (str.hashCode()) {
            case -318297696:
                if (str.equals("preroll")) {
                    c = 0;
                    break;
                }
                break;
            case 757909789:
                if (str.equals(Advertisement.KEY_POSTROLL)) {
                    c = 1;
                    break;
                }
                break;
            case 830323571:
                if (str.equals("pauseroll")) {
                    c = 2;
                    break;
                }
                break;
            case 1055572677:
                if (str.equals("midroll")) {
                    c = 3;
                    break;
                }
                break;
        }
        if (c == 0) {
            this.f24766b = 1;
        } else if (c == 1) {
            this.f24766b = 3;
        } else if (c == 2) {
            this.f24766b = 4;
        } else if (c != 3) {
            this.f24766b = 0;
        } else {
            this.f24766b = 2;
        }
    }

    /* renamed from: a */
    public static C9984u2<AudioData> m29442a(String str) {
        return m29443b(str);
    }

    /* renamed from: b */
    public static <T extends C9983u1> C9984u2<T> m29443b(String str) {
        return new C9984u2<>(str);
    }

    /* renamed from: c */
    public static C9984u2<VideoData> m29444c(String str) {
        return m29443b(str);
    }

    /* renamed from: a */
    public int mo65292a() {
        return this.f24768d.size();
    }

    /* renamed from: a */
    public ArrayList<C9915q1> mo65526a(float f) {
        ArrayList<C9915q1> arrayList = new ArrayList<>();
        Iterator<C9915q1> it = this.f24770f.iterator();
        while (it.hasNext()) {
            C9915q1 next = it.next();
            if (next.mo65284s() == f) {
                arrayList.add(next);
            }
        }
        if (arrayList.size() > 0) {
            this.f24770f.removeAll(arrayList);
        }
        return arrayList;
    }

    /* renamed from: a */
    public void mo65527a(int i) {
        this.f24772h = i;
    }

    /* renamed from: a */
    public void mo65528a(C9711g2<T> g2Var) {
        g2Var.setMediaSectionType(this.f24766b);
        this.f24768d.add(g2Var);
    }

    /* renamed from: a */
    public void mo65529a(C9711g2<T> g2Var, int i) {
        int size = this.f24768d.size();
        if (i >= 0 && i <= size) {
            g2Var.setMediaSectionType(this.f24766b);
            this.f24768d.add(i, g2Var);
            Iterator<C9915q1> it = this.f24771g.iterator();
            while (it.hasNext()) {
                C9915q1 next = it.next();
                int u = next.mo65286u();
                if (u >= i) {
                    next.mo65257c(u + 1);
                }
            }
        }
    }

    /* renamed from: a */
    public void mo65530a(C9915q1 q1Var) {
        (q1Var.mo65291z() ? this.f24770f : q1Var.mo65290y() ? this.f24769e : this.f24771g).add(q1Var);
    }

    /* renamed from: a */
    public void mo65531a(C9984u2<T> u2Var) {
        Iterator<C9711g2<T>> it = u2Var.f24768d.iterator();
        while (it.hasNext()) {
            mo65528a(it.next());
        }
        this.f24769e.addAll(u2Var.f24769e);
        this.f24770f.addAll(u2Var.f24770f);
    }

    /* renamed from: b */
    public void mo65532b(int i) {
        this.f24773i = i;
    }

    /* renamed from: c */
    public void mo65533c() {
        this.f24771g.clear();
    }

    /* renamed from: d */
    public List<C9711g2<T>> mo65534d() {
        return new ArrayList(this.f24768d);
    }

    /* renamed from: e */
    public int mo65535e() {
        return this.f24772h;
    }

    /* renamed from: f */
    public int mo65536f() {
        return this.f24773i;
    }

    /* renamed from: g */
    public ArrayList<C9915q1> mo65537g() {
        return new ArrayList<>(this.f24770f);
    }

    /* renamed from: h */
    public String mo65538h() {
        return this.f24767c;
    }

    /* renamed from: i */
    public boolean mo65539i() {
        return !this.f24770f.isEmpty() || !this.f24769e.isEmpty();
    }

    /* renamed from: j */
    public C9915q1 mo65540j() {
        if (this.f24769e.size() > 0) {
            return this.f24769e.remove(0);
        }
        return null;
    }
}

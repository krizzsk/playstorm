package com.ogury.p375cm.internal;

import com.ogury.p375cm.ConsentActivity;
import com.ogury.p375cm.internal.bbbac;
import java.util.Iterator;

/* renamed from: com.ogury.cm.internal.bbbaa */
public class bbbaa implements Iterable<Integer> {

    /* renamed from: a */
    public static final aaaaa f25927a = new aaaaa((bbabb) null);

    /* renamed from: b */
    private final int f25928b;

    /* renamed from: c */
    private final int f25929c;

    /* renamed from: d */
    private final int f25930d = 1;

    /* renamed from: com.ogury.cm.internal.bbbaa$aaaaa */
    public static final class aaaaa {
        private aaaaa() {
        }

        public /* synthetic */ aaaaa(bbabb bbabb) {
            this();
        }

        /* renamed from: a */
        public static bbbac m30950a(int i, int i2) {
            if (i2 > Integer.MIN_VALUE) {
                return new bbbac(i, i2 - 1);
            }
            bbbac.aaaaa aaaaa = bbbac.f25935b;
            return bbbac.f25936c;
        }
    }

    public bbbaa(int i, int i2, int i3) {
        this.f25928b = i;
        this.f25929c = ConsentActivity.aaaaa.m30514a(i, i2, 1);
    }

    /* renamed from: a */
    public final int mo66724a() {
        return this.f25928b;
    }

    /* renamed from: b */
    public final int mo66725b() {
        return this.f25929c;
    }

    /* renamed from: c */
    public final int mo66726c() {
        return this.f25930d;
    }

    /* renamed from: d */
    public boolean mo66727d() {
        return this.f25930d > 0 ? this.f25928b > this.f25929c : this.f25928b < this.f25929c;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof bbbaa)) {
            return false;
        }
        if (mo66727d() && ((bbbaa) obj).mo66727d()) {
            return true;
        }
        bbbaa bbbaa = (bbbaa) obj;
        return this.f25928b == bbbaa.f25928b && this.f25929c == bbbaa.f25929c && this.f25930d == bbbaa.f25930d;
    }

    public int hashCode() {
        if (mo66727d()) {
            return -1;
        }
        return (((this.f25928b * 31) + this.f25929c) * 31) + this.f25930d;
    }

    public /* synthetic */ Iterator iterator() {
        return new bbbab(this.f25928b, this.f25929c, this.f25930d);
    }

    public String toString() {
        StringBuilder sb;
        int i;
        if (this.f25930d > 0) {
            sb = new StringBuilder();
            sb.append(this.f25928b);
            sb.append("..");
            sb.append(this.f25929c);
            sb.append(" step ");
            i = this.f25930d;
        } else {
            sb = new StringBuilder();
            sb.append(this.f25928b);
            sb.append(" downTo ");
            sb.append(this.f25929c);
            sb.append(" step ");
            i = -this.f25930d;
        }
        sb.append(i);
        return sb.toString();
    }
}

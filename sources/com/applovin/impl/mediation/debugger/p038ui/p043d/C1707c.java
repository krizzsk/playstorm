package com.applovin.impl.mediation.debugger.p038ui.p043d;

import android.content.Context;
import android.text.SpannedString;
import android.text.TextUtils;
import androidx.core.view.ViewCompat;
import com.applovin.impl.sdk.utils.C2038f;
import com.applovin.sdk.C2392R;

/* renamed from: com.applovin.impl.mediation.debugger.ui.d.c */
public class C1707c {

    /* renamed from: b */
    protected C1710b f2539b;

    /* renamed from: c */
    protected boolean f2540c;

    /* renamed from: d */
    protected SpannedString f2541d;

    /* renamed from: e */
    protected SpannedString f2542e;

    /* renamed from: f */
    protected String f2543f;

    /* renamed from: g */
    protected String f2544g;

    /* renamed from: h */
    protected int f2545h;

    /* renamed from: i */
    protected int f2546i;

    /* renamed from: j */
    protected int f2547j;

    /* renamed from: k */
    protected int f2548k;

    /* renamed from: l */
    protected int f2549l;

    /* renamed from: m */
    protected int f2550m;

    /* renamed from: n */
    protected boolean f2551n;

    /* renamed from: com.applovin.impl.mediation.debugger.ui.d.c$a */
    public static class C1709a {

        /* renamed from: a */
        final C1710b f2552a;

        /* renamed from: b */
        boolean f2553b;

        /* renamed from: c */
        SpannedString f2554c;

        /* renamed from: d */
        SpannedString f2555d;

        /* renamed from: e */
        String f2556e;

        /* renamed from: f */
        String f2557f;

        /* renamed from: g */
        int f2558g = 0;

        /* renamed from: h */
        int f2559h = 0;

        /* renamed from: i */
        int f2560i = ViewCompat.MEASURED_STATE_MASK;

        /* renamed from: j */
        int f2561j = ViewCompat.MEASURED_STATE_MASK;

        /* renamed from: k */
        int f2562k = 0;

        /* renamed from: l */
        int f2563l = 0;

        /* renamed from: m */
        boolean f2564m;

        public C1709a(C1710b bVar) {
            this.f2552a = bVar;
        }

        /* renamed from: a */
        public C1709a mo13538a(int i) {
            this.f2559h = i;
            return this;
        }

        /* renamed from: a */
        public C1709a mo13539a(Context context) {
            this.f2559h = C2392R.C2393drawable.applovin_ic_disclosure_arrow;
            this.f2563l = C2038f.m4879a(C2392R.color.applovin_sdk_disclosureButtonColor, context);
            return this;
        }

        /* renamed from: a */
        public C1709a mo13540a(SpannedString spannedString) {
            this.f2554c = spannedString;
            return this;
        }

        /* renamed from: a */
        public C1709a mo13541a(String str) {
            return mo13540a(!TextUtils.isEmpty(str) ? new SpannedString(str) : null);
        }

        /* renamed from: a */
        public C1709a mo13542a(boolean z) {
            this.f2553b = z;
            return this;
        }

        /* renamed from: a */
        public C1707c mo13543a() {
            return new C1707c(this);
        }

        /* renamed from: b */
        public C1709a mo13544b(int i) {
            this.f2561j = i;
            return this;
        }

        /* renamed from: b */
        public C1709a mo13545b(SpannedString spannedString) {
            this.f2555d = spannedString;
            return this;
        }

        /* renamed from: b */
        public C1709a mo13546b(String str) {
            return mo13545b(!TextUtils.isEmpty(str) ? new SpannedString(str) : null);
        }

        /* renamed from: b */
        public C1709a mo13547b(boolean z) {
            this.f2564m = z;
            return this;
        }

        /* renamed from: c */
        public C1709a mo13548c(int i) {
            this.f2563l = i;
            return this;
        }

        /* renamed from: c */
        public C1709a mo13549c(String str) {
            this.f2556e = str;
            return this;
        }

        /* renamed from: d */
        public C1709a mo13550d(String str) {
            this.f2557f = str;
            return this;
        }
    }

    /* renamed from: com.applovin.impl.mediation.debugger.ui.d.c$b */
    public enum C1710b {
        SECTION(0),
        SECTION_CENTERED(1),
        SIMPLE(2),
        DETAIL(3),
        RIGHT_DETAIL(4),
        COUNT(5);
        

        /* renamed from: g */
        private final int f2572g;

        private C1710b(int i) {
            this.f2572g = i;
        }

        /* renamed from: a */
        public int mo13551a() {
            return this.f2572g;
        }

        /* renamed from: b */
        public int mo13552b() {
            if (this == SECTION) {
                return C2392R.layout.list_section;
            }
            if (this == SECTION_CENTERED) {
                return C2392R.layout.list_section_centered;
            }
            if (this == SIMPLE) {
                return 17367043;
            }
            return this == DETAIL ? C2392R.layout.list_item_detail : C2392R.layout.list_item_right_detail;
        }
    }

    private C1707c(C1709a aVar) {
        this.f2545h = 0;
        this.f2546i = 0;
        this.f2547j = ViewCompat.MEASURED_STATE_MASK;
        this.f2548k = ViewCompat.MEASURED_STATE_MASK;
        this.f2549l = 0;
        this.f2550m = 0;
        this.f2539b = aVar.f2552a;
        this.f2540c = aVar.f2553b;
        this.f2541d = aVar.f2554c;
        this.f2542e = aVar.f2555d;
        this.f2543f = aVar.f2556e;
        this.f2544g = aVar.f2557f;
        this.f2545h = aVar.f2558g;
        this.f2546i = aVar.f2559h;
        this.f2547j = aVar.f2560i;
        this.f2548k = aVar.f2561j;
        this.f2549l = aVar.f2562k;
        this.f2550m = aVar.f2563l;
        this.f2551n = aVar.f2564m;
    }

    protected C1707c(C1710b bVar) {
        this.f2545h = 0;
        this.f2546i = 0;
        this.f2547j = ViewCompat.MEASURED_STATE_MASK;
        this.f2548k = ViewCompat.MEASURED_STATE_MASK;
        this.f2549l = 0;
        this.f2550m = 0;
        this.f2539b = bVar;
    }

    /* renamed from: a */
    public static C1709a m3543a(C1710b bVar) {
        return new C1709a(bVar);
    }

    /* renamed from: h */
    public static int m3544h() {
        return C1710b.COUNT.mo13551a();
    }

    /* renamed from: p */
    public static C1709a m3545p() {
        return m3543a(C1710b.RIGHT_DETAIL);
    }

    /* renamed from: b */
    public boolean mo13486b() {
        return this.f2540c;
    }

    /* renamed from: c */
    public int mo13487c() {
        return this.f2548k;
    }

    /* renamed from: c_ */
    public SpannedString mo13508c_() {
        return this.f2542e;
    }

    /* renamed from: d_ */
    public boolean mo13509d_() {
        return this.f2551n;
    }

    /* renamed from: e */
    public int mo13504e() {
        return this.f2545h;
    }

    /* renamed from: f */
    public int mo13505f() {
        return this.f2546i;
    }

    /* renamed from: g */
    public int mo13506g() {
        return this.f2550m;
    }

    /* renamed from: i */
    public int mo13531i() {
        return this.f2539b.mo13551a();
    }

    /* renamed from: j */
    public int mo13532j() {
        return this.f2539b.mo13552b();
    }

    /* renamed from: k */
    public SpannedString mo13533k() {
        return this.f2541d;
    }

    /* renamed from: l */
    public String mo13534l() {
        return this.f2543f;
    }

    /* renamed from: m */
    public String mo13535m() {
        return this.f2544g;
    }

    /* renamed from: n */
    public int mo13536n() {
        return this.f2547j;
    }

    /* renamed from: o */
    public int mo13537o() {
        return this.f2549l;
    }
}

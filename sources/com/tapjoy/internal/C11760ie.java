package com.tapjoy.internal;

import android.graphics.Point;
import android.os.SystemClock;
import com.tapjoy.TapjoyConstants;
import com.vungle.warren.model.VisionDataDBAdapter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import javax.annotation.Nullable;

/* renamed from: com.tapjoy.internal.ie */
public class C11760ie extends C11751ia {

    /* renamed from: n */
    public static final C11444bc<C11760ie> f28641n = new C11444bc<C11760ie>() {
        /* renamed from: a */
        public final /* synthetic */ Object mo72202a(C11452bh bhVar) {
            return new C11760ie(bhVar);
        }
    };
    @Nullable

    /* renamed from: a */
    public C11766ih f28642a;
    @Nullable

    /* renamed from: b */
    public C11766ih f28643b;

    /* renamed from: c */
    public C11766ih f28644c;
    @Nullable

    /* renamed from: d */
    public Point f28645d;
    @Nullable

    /* renamed from: e */
    public C11766ih f28646e;
    @Nullable

    /* renamed from: f */
    public C11766ih f28647f;

    /* renamed from: g */
    public String f28648g;
    @Nullable

    /* renamed from: h */
    public C11693gv f28649h;

    /* renamed from: i */
    public ArrayList<C11754ic> f28650i = new ArrayList<>();

    /* renamed from: j */
    public ArrayList<C11754ic> f28651j = new ArrayList<>();

    /* renamed from: k */
    public Map<String, Object> f28652k;

    /* renamed from: l */
    public long f28653l;
    @Nullable

    /* renamed from: m */
    public C11762if f28654m;

    public C11760ie() {
    }

    C11760ie(C11452bh bhVar) {
        bhVar.mo72223h();
        String str = null;
        String str2 = null;
        while (bhVar.mo72225j()) {
            String l = bhVar.mo72227l();
            if ("frame".equals(l)) {
                bhVar.mo72223h();
                while (bhVar.mo72225j()) {
                    String l2 = bhVar.mo72227l();
                    if ("portrait".equals(l2)) {
                        this.f28642a = C11766ih.f28662e.mo72202a(bhVar);
                    } else if ("landscape".equals(l2)) {
                        this.f28643b = C11766ih.f28662e.mo72202a(bhVar);
                    } else if ("close_button".equals(l2)) {
                        this.f28644c = C11766ih.f28662e.mo72202a(bhVar);
                    } else if ("close_button_offset".equals(l2)) {
                        this.f28645d = C11445bd.f27691a.mo72202a(bhVar);
                    } else {
                        bhVar.mo72234s();
                    }
                }
                bhVar.mo72224i();
            } else if (VisionDataDBAdapter.VisionDataColumns.COLUMN_CREATIVE.equals(l)) {
                bhVar.mo72223h();
                while (bhVar.mo72225j()) {
                    String l3 = bhVar.mo72227l();
                    if ("portrait".equals(l3)) {
                        this.f28646e = C11766ih.f28662e.mo72202a(bhVar);
                    } else if ("landscape".equals(l3)) {
                        this.f28647f = C11766ih.f28662e.mo72202a(bhVar);
                    } else {
                        bhVar.mo72234s();
                    }
                }
                bhVar.mo72224i();
            } else if ("url".equals(l)) {
                this.f28648g = bhVar.mo72212b();
            } else if (C11747hy.m34129a(l)) {
                this.f28649h = C11747hy.m34128a(l, bhVar);
            } else if ("mappings".equals(l)) {
                bhVar.mo72223h();
                while (bhVar.mo72225j()) {
                    String l4 = bhVar.mo72227l();
                    if ("portrait".equals(l4)) {
                        bhVar.mo72209a(this.f28650i, C11754ic.f28621h);
                    } else if ("landscape".equals(l4)) {
                        bhVar.mo72209a(this.f28651j, C11754ic.f28621h);
                    } else {
                        bhVar.mo72234s();
                    }
                }
                bhVar.mo72224i();
            } else if ("meta".equals(l)) {
                this.f28652k = bhVar.mo72215d();
            } else if ("ttl".equals(l)) {
                this.f28653l = SystemClock.elapsedRealtime() + ((long) (bhVar.mo72231p() * 1000.0d));
            } else if ("no_more_today".equals(l)) {
                this.f28654m = C11762if.f28655d.mo72202a(bhVar);
            } else if ("ad_content".equals(l)) {
                str = bhVar.mo72212b();
            } else if (TapjoyConstants.TJC_REDIRECT_URL.equals(l)) {
                str2 = bhVar.mo72212b();
            } else {
                bhVar.mo72234s();
            }
        }
        bhVar.mo72224i();
        if (this.f28648g == null) {
            this.f28648g = "";
        }
        ArrayList<C11754ic> arrayList = this.f28650i;
        if (arrayList != null) {
            Iterator<C11754ic> it = arrayList.iterator();
            while (it.hasNext()) {
                C11754ic next = it.next();
                if (next.f28627f == null) {
                    next.f28627f = str;
                }
                if (next.f28626e == null) {
                    next.f28626e = str2;
                }
            }
        }
        ArrayList<C11754ic> arrayList2 = this.f28651j;
        if (arrayList2 != null) {
            Iterator<C11754ic> it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                C11754ic next2 = it2.next();
                if (next2.f28627f == null) {
                    next2.f28627f = str;
                }
                if (next2.f28626e == null) {
                    next2.f28626e = str2;
                }
            }
        }
    }

    /* renamed from: a */
    public final boolean mo72693a() {
        return (this.f28644c == null || this.f28642a == null || this.f28646e == null) ? false : true;
    }

    /* renamed from: b */
    public final boolean mo72694b() {
        return (this.f28644c == null || this.f28643b == null || this.f28647f == null) ? false : true;
    }
}

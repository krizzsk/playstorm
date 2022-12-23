package com.tapjoy.internal;

import com.tapjoy.TapjoyConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.tapjoy.internal.ib */
public class C11752ib extends C11751ia {

    /* renamed from: d */
    public static final C11444bc<C11752ib> f28617d = new C11444bc<C11752ib>() {
        /* renamed from: a */
        public final /* synthetic */ Object mo72202a(C11452bh bhVar) {
            return new C11752ib(bhVar);
        }
    };

    /* renamed from: a */
    public ArrayList<C11772ik> f28618a = new ArrayList<>();

    /* renamed from: b */
    public Map<String, Object> f28619b;

    /* renamed from: c */
    public float f28620c;

    public C11752ib(C11452bh bhVar) {
        bhVar.mo72223h();
        String str = null;
        String str2 = null;
        while (bhVar.mo72225j()) {
            String l = bhVar.mo72227l();
            if ("layouts".equals(l)) {
                bhVar.mo72209a(this.f28618a, C11772ik.f28687d);
            } else if ("meta".equals(l)) {
                this.f28619b = bhVar.mo72215d();
            } else if ("max_show_time".equals(l)) {
                this.f28620c = (float) bhVar.mo72231p();
            } else if ("ad_content".equals(l)) {
                str = bhVar.mo72212b();
            } else if (TapjoyConstants.TJC_REDIRECT_URL.equals(l)) {
                str2 = bhVar.mo72212b();
            } else {
                bhVar.mo72234s();
            }
        }
        bhVar.mo72224i();
        ArrayList<C11772ik> arrayList = this.f28618a;
        if (arrayList != null) {
            Iterator<C11772ik> it = arrayList.iterator();
            while (it.hasNext()) {
                C11772ik next = it.next();
                if (next.f28690c != null) {
                    Iterator<C11770ij> it2 = next.f28690c.iterator();
                    while (it2.hasNext()) {
                        C11770ij next2 = it2.next();
                        if (next2.f28682i == null) {
                            next2.f28682i = str;
                        }
                        if (next2.f28681h == null) {
                            next2.f28681h = str2;
                        }
                    }
                }
            }
        }
    }
}

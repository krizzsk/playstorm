package com.fyber.inneractive.sdk.util;

import android.net.Uri;
import java.util.List;

/* renamed from: com.fyber.inneractive.sdk.util.s0 */
public class C5371s0 implements Comparable<C5371s0> {

    /* renamed from: a */
    public C5372a f14240a;

    /* renamed from: b */
    public Uri f14241b;

    /* renamed from: c */
    public List<String> f14242c;

    /* renamed from: com.fyber.inneractive.sdk.util.s0$a */
    public enum C5372a {
        Primary(1),
        FallBack(2);
        

        /* renamed from: a */
        public Integer f14246a;

        /* access modifiers changed from: public */
        C5372a(Integer num) {
            this.f14246a = num;
        }
    }

    public C5371s0(C5372a aVar, Uri uri, List<String> list) {
        this.f14240a = aVar;
        this.f14241b = uri;
        this.f14242c = list;
    }

    public int compareTo(Object obj) {
        return this.f14240a.f14246a.compareTo(((C5371s0) obj).f14240a.f14246a);
    }
}

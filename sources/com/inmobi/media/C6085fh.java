package com.inmobi.media;

import com.inmobi.ads.viewsv2.NativeRecyclerViewAdapter;

/* renamed from: com.inmobi.media.fh */
/* compiled from: NativeScrollableDataSourceFactory */
final class C6085fh {
    /* renamed from: a */
    public static C6084fg m18181a(byte b, C5907bx bxVar, C6067fc fcVar) {
        if (b == 0) {
            return new C6061fa(bxVar, fcVar);
        }
        if (b != 1) {
            return null;
        }
        try {
            return new NativeRecyclerViewAdapter(bxVar, fcVar);
        } catch (NoClassDefFoundError e) {
            C6238hu.m18605a((byte) 1, "InMobi", "Error rendering ad! RecyclerView not found. Please check if the recyclerview support library was included");
            C6181gg.m18398a().mo35357a(new C6217hg(e));
            return null;
        }
    }
}

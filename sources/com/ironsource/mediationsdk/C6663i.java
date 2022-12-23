package com.ironsource.mediationsdk;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.ironsource.mediationsdk.i */
public final class C6663i {

    /* renamed from: a */
    private ConcurrentHashMap<String, ArrayList<C6664a>> f17344a = new ConcurrentHashMap<>();

    /* renamed from: b */
    private int f17345b;

    /* renamed from: com.ironsource.mediationsdk.i$a */
    public enum C6664a {
        ISAuctionPerformanceDidntAttemptToLoad,
        ISAuctionPerformanceFailedToLoad,
        ISAuctionPerformanceLoadedSuccessfully,
        ISAuctionPerformanceFailedToShow,
        ISAuctionPerformanceShowedSuccessfully,
        ISAuctionPerformanceNotPartOfWaterfall
    }

    public C6663i(List<String> list, int i) {
        this.f17345b = i;
        for (String put : list) {
            ArrayList arrayList = new ArrayList();
            this.f17344a.put(put, arrayList);
        }
    }

    /* renamed from: a */
    public final String mo36680a(String str) {
        ArrayList arrayList = this.f17344a.get(str);
        String str2 = "";
        if (arrayList != null && !arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            StringBuilder sb = new StringBuilder();
            while (true) {
                sb.append(str2);
                sb.append(((C6664a) it.next()).ordinal());
                str2 = sb.toString();
                if (!it.hasNext()) {
                    break;
                }
                str2 = str2 + ",";
                sb = new StringBuilder();
            }
        }
        return str2;
    }

    /* renamed from: a */
    public final void mo36681a(ConcurrentHashMap<String, C6664a> concurrentHashMap) {
        if (this.f17345b != 0) {
            for (String next : this.f17344a.keySet()) {
                C6664a aVar = C6664a.ISAuctionPerformanceNotPartOfWaterfall;
                if (concurrentHashMap.containsKey(next)) {
                    aVar = concurrentHashMap.get(next);
                }
                ArrayList arrayList = this.f17344a.get(next);
                if (this.f17345b != -1 && arrayList.size() == this.f17345b) {
                    arrayList.remove(0);
                }
                arrayList.add(aVar);
            }
        }
    }
}

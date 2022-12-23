package com.fyber.inneractive.sdk.external;

import com.fyber.inneractive.sdk.flow.C4423m;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class InneractiveAdSpotManager {

    /* renamed from: a */
    public Map<String, InneractiveAdSpot> f10821a = new ConcurrentHashMap();

    /* renamed from: com.fyber.inneractive.sdk.external.InneractiveAdSpotManager$a */
    public static class C4389a {

        /* renamed from: a */
        public static InneractiveAdSpotManager f10822a = new InneractiveAdSpotManager();
    }

    public static void destroy() {
        Map<String, InneractiveAdSpot> map = get().f10821a;
        for (String str : map.keySet()) {
            InneractiveAdSpot inneractiveAdSpot = map.get(str);
            if (inneractiveAdSpot != null) {
                inneractiveAdSpot.destroy();
            }
        }
        map.clear();
    }

    public static InneractiveAdSpotManager get() {
        return C4389a.f10822a;
    }

    public void bindSpot(InneractiveAdSpot inneractiveAdSpot) {
        this.f10821a.put(inneractiveAdSpot.getLocalUniqueId(), inneractiveAdSpot);
    }

    public InneractiveAdSpot createSpot() {
        C4423m mVar = new C4423m();
        this.f10821a.put(mVar.f10932a, mVar);
        return mVar;
    }

    public InneractiveAdSpot getSpot(String str) {
        return this.f10821a.get(str);
    }

    public void removeSpot(InneractiveAdSpot inneractiveAdSpot) {
        Map<String, InneractiveAdSpot> map = this.f10821a;
        if (map != null) {
            map.remove(inneractiveAdSpot.getLocalUniqueId());
        }
    }
}

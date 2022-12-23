package com.inmobi.media;

import com.inmobi.unifiedId.InMobiUnifiedIdInterface;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.inmobi.media.jn */
/* compiled from: UnifiedIDServiceCallback */
public final class C6313jn implements C6203gu<JSONObject> {

    /* renamed from: a */
    C6314jo f15972a;

    /* renamed from: b */
    Set<InMobiUnifiedIdInterface> f15973b;

    /* renamed from: a */
    public final /* synthetic */ void mo35382a(Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        synchronized (C6312jm.class) {
            if (!this.f15972a.f15728a.get()) {
                C6312jm.m18882d();
                C6309jk.m18863a(C6310jl.m18870a(jSONObject, C6309jk.m18862a()));
                JSONObject c = C6310jl.m18875c(C6309jk.m18862a());
                for (InMobiUnifiedIdInterface next : this.f15973b) {
                    if (c == null) {
                        C6310jl.m18871a(next, (JSONObject) null, new Error(InMobiUnifiedIdInterface.NO_LOCAL_DATA_PRESENT));
                    } else {
                        C6310jl.m18871a(next, c, (Error) null);
                    }
                }
                this.f15973b.clear();
            }
        }
    }

    public C6313jn(C6314jo joVar, Set<InMobiUnifiedIdInterface> set) {
        this.f15972a = joVar;
        this.f15973b = set;
    }

    /* renamed from: a */
    public final void mo35381a(C6205gw gwVar) {
        synchronized (C6312jm.class) {
            HashMap hashMap = new HashMap();
            hashMap.put(IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(gwVar.f15700a));
            C6218hh.m18506a().mo35424a("UnifiedIdNetworkResponseFailure", (Map<String, Object>) hashMap);
            if (!this.f15972a.f15728a.get()) {
                C6312jm.m18882d();
                m18884a();
            }
        }
    }

    /* renamed from: a */
    private void m18884a() {
        JSONObject c = C6310jl.m18875c(C6309jk.m18862a());
        if (c != null) {
            try {
                if (c.has("ufids") && c.getJSONArray("ufids").length() > 0) {
                    for (InMobiUnifiedIdInterface a : this.f15973b) {
                        C6310jl.m18871a(a, c, (Error) null);
                    }
                    this.f15973b.clear();
                }
            } catch (JSONException e) {
                e.printStackTrace();
            } catch (Throwable th) {
                this.f15973b.clear();
                throw th;
            }
        }
        for (InMobiUnifiedIdInterface a2 : this.f15973b) {
            C6310jl.m18871a(a2, (JSONObject) null, new Error(InMobiUnifiedIdInterface.NETWORK_FAILURE_AND_NO_LOCAL_DATA_PRESENT));
        }
        this.f15973b.clear();
    }
}

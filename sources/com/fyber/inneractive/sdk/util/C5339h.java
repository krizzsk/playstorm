package com.fyber.inneractive.sdk.util;

import android.location.Location;
import com.fyber.inneractive.sdk.util.C5342i;
import com.google.android.gms.tasks.OnSuccessListener;

/* renamed from: com.fyber.inneractive.sdk.util.h */
public class C5339h implements OnSuccessListener<Location> {

    /* renamed from: a */
    public final /* synthetic */ C5342i.C5343a f14195a;

    public C5339h(C5342i.C5343a aVar) {
        this.f14195a = aVar;
    }

    public void onSuccess(Object obj) {
        Location location = (Location) obj;
        C5342i.C5343a aVar = this.f14195a;
        if (aVar != null) {
            ((C5381v) aVar).f14260a.f14272b = location;
        }
    }
}

package com.facebook.appevents.cloudbridge;

import com.facebook.GraphRequest;
import com.facebook.GraphResponse;

/* renamed from: com.facebook.appevents.cloudbridge.-$$Lambda$AppEventsCAPIManager$m16G8HSqb-E1bMmir1EfQXv1qNY  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$AppEventsCAPIManager$m16G8HSqbE1bMmir1EfQXv1qNY implements GraphRequest.Callback {
    public static final /* synthetic */ $$Lambda$AppEventsCAPIManager$m16G8HSqbE1bMmir1EfQXv1qNY INSTANCE = new $$Lambda$AppEventsCAPIManager$m16G8HSqbE1bMmir1EfQXv1qNY();

    private /* synthetic */ $$Lambda$AppEventsCAPIManager$m16G8HSqbE1bMmir1EfQXv1qNY() {
    }

    public final void onCompleted(GraphResponse graphResponse) {
        AppEventsCAPIManager.m34873enable$lambda0(graphResponse);
    }
}

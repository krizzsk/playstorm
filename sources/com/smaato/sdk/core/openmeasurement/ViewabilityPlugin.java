package com.smaato.sdk.core.openmeasurement;

import android.content.Context;
import com.smaato.sdk.core.p379di.DiRegistry;

public interface ViewabilityPlugin {
    DiRegistry diRegistry();

    String getName();

    void init(Context context);
}

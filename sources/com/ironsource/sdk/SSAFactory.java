package com.ironsource.sdk;

import android.app.Activity;
import android.content.Context;
import com.ironsource.sdk.p289d.C8315b;

@Deprecated
public class SSAFactory {
    public static C8335f getPublisherInstance(Activity activity) {
        return C8315b.m23813a((Context) activity);
    }

    public static C8335f getPublisherTestInstance(Activity activity, int i) {
        return C8315b.m23814a((Context) activity, i);
    }
}

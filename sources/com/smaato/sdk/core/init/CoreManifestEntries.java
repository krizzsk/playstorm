package com.smaato.sdk.core.init;

import android.app.Activity;
import com.smaato.sdk.core.browser.SmaatoSdkBrowserActivity;
import com.smaato.sdk.core.util.collections.Lists;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public final class CoreManifestEntries {
    public static final Set<Class<? extends Activity>> ACTIVITIES = Collections.unmodifiableSet(new HashSet(Lists.m32965of((T[]) new Class[]{SmaatoSdkBrowserActivity.class})));
    public static final Set<String> PERMISSIONS_MANDATORY = Collections.unmodifiableSet(new HashSet(Lists.m32965of((T[]) new String[]{"android.permission.INTERNET", "android.permission.ACCESS_NETWORK_STATE"})));

    private CoreManifestEntries() {
    }
}

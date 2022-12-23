package com.smaato.sdk.rewarded.framework;

import android.app.Activity;
import com.smaato.sdk.core.util.collections.Sets;
import com.smaato.sdk.rewarded.widget.RewardedInterstitialAdActivity;
import java.util.Collections;
import java.util.Set;

final class RewardedExpectedManifestEntries {
    static final Set<Class<? extends Activity>> ACTIVITIES = Sets.toImmutableSetOf(RewardedInterstitialAdActivity.class);
    static final Set<String> PERMISSIONS_MANDATORY = Collections.emptySet();
}

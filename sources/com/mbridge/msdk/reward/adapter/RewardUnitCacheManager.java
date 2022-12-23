package com.mbridge.msdk.reward.adapter;

import com.mbridge.msdk.foundation.tools.C8608u;
import com.mbridge.msdk.system.NoProGuard;
import com.mbridge.msdk.videocommon.p373d.C9551c;
import java.util.concurrent.ConcurrentHashMap;

public final class RewardUnitCacheManager implements NoProGuard {
    private static final String TAG = "RewardUnitCacheManager";
    private ConcurrentHashMap<String, C9551c> rewardUnitSettings;

    /* renamed from: com.mbridge.msdk.reward.adapter.RewardUnitCacheManager$a */
    private static final class C9067a {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public static final RewardUnitCacheManager f21798a = new RewardUnitCacheManager();
    }

    private RewardUnitCacheManager() {
        this.rewardUnitSettings = new ConcurrentHashMap<>();
    }

    public static RewardUnitCacheManager getInstance() {
        return C9067a.f21798a;
    }

    public final void add(String str, String str2, C9551c cVar) {
        try {
            String str3 = str + "_" + str2;
            if (cVar != null && this.rewardUnitSettings.containsKey(str3)) {
                this.rewardUnitSettings.remove(str3);
            }
            this.rewardUnitSettings.put(str3, cVar);
        } catch (Exception e) {
            C8608u.m24884d(TAG, e.getMessage());
        }
    }

    public final C9551c get(String str, String str2) {
        try {
            return this.rewardUnitSettings.remove(str + "_" + str2);
        } catch (Exception e) {
            C8608u.m24884d(TAG, e.getMessage());
        } catch (Throwable unused) {
        }
        return null;
    }
}

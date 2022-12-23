package com.smaato.sdk.core.linkhandler;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ActivityQueries {
    private final Context context;

    public ActivityQueries(Context context2) {
        this.context = context2;
    }

    public Set<String> queryTargetActivityNames(String str) {
        PackageManager packageManager = this.context.getPackageManager();
        HashSet hashSet = new HashSet();
        for (ResolveInfo resolveInfo : packageManager.queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse(str)).addCategory("android.intent.category.BROWSABLE").addCategory("android.intent.category.DEFAULT"), 0)) {
            hashSet.add(resolveInfo.activityInfo.targetActivity);
        }
        return hashSet;
    }

    public boolean canBeLaunched(Intent intent) {
        List<ResolveInfo> queryIntentActivities = this.context.getPackageManager().queryIntentActivities(intent, 0);
        if (queryIntentActivities == null || queryIntentActivities.isEmpty()) {
            return false;
        }
        return true;
    }
}

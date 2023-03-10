package com.unity3d.player;

import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.pm.PackageItemInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;

/* renamed from: com.unity3d.player.h */
public final class C11923h implements C11920e {
    /* renamed from: a */
    private static boolean m34540a(PackageItemInfo packageItemInfo) {
        try {
            return packageItemInfo.metaData.getBoolean("unityplayer.SkipPermissionsDialog");
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: a */
    public final void mo73044a(Activity activity, String str) {
        if (activity != null && str != null) {
            FragmentManager fragmentManager = activity.getFragmentManager();
            if (fragmentManager.findFragmentByTag("96489") == null) {
                C11924i iVar = new C11924i();
                Bundle bundle = new Bundle();
                bundle.putString("PermissionNames", str);
                iVar.setArguments(bundle);
                FragmentTransaction beginTransaction = fragmentManager.beginTransaction();
                beginTransaction.add(0, iVar, "96489");
                beginTransaction.commit();
            }
        }
    }

    /* renamed from: a */
    public final boolean mo73045a(Activity activity) {
        try {
            PackageManager packageManager = activity.getPackageManager();
            return m34540a((PackageItemInfo) packageManager.getActivityInfo(activity.getComponentName(), 128)) || m34540a((PackageItemInfo) packageManager.getApplicationInfo(activity.getPackageName(), 128));
        } catch (Exception unused) {
            return false;
        }
    }
}

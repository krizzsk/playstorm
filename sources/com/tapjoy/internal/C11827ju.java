package com.tapjoy.internal;

import android.app.Notification;
import android.os.Bundle;
import android.util.Log;
import android.util.SparseArray;
import androidx.core.app.NotificationCompatExtras;
import com.google.firebase.messaging.Constants;
import com.tapjoy.internal.C11821js;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* renamed from: com.tapjoy.internal.ju */
final class C11827ju {

    /* renamed from: a */
    private static final Object f28911a = new Object();

    /* renamed from: b */
    private static Field f28912b;

    /* renamed from: c */
    private static boolean f28913c;

    /* renamed from: d */
    private static final Object f28914d = new Object();

    /* renamed from: a */
    public static SparseArray<Bundle> m34384a(List<Bundle> list) {
        int size = list.size();
        SparseArray<Bundle> sparseArray = null;
        for (int i = 0; i < size; i++) {
            Bundle bundle = list.get(i);
            if (bundle != null) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                sparseArray.put(i, bundle);
            }
        }
        return sparseArray;
    }

    /* renamed from: a */
    public static Bundle m34383a(Notification notification) {
        synchronized (f28911a) {
            if (f28913c) {
                return null;
            }
            try {
                if (f28912b == null) {
                    Field declaredField = Notification.class.getDeclaredField("extras");
                    if (!Bundle.class.isAssignableFrom(declaredField.getType())) {
                        Log.e(NotificationCompatJellybean.TAG, "Notification.extras field is not of type Bundle");
                        f28913c = true;
                        return null;
                    }
                    declaredField.setAccessible(true);
                    f28912b = declaredField;
                }
                Bundle bundle = (Bundle) f28912b.get(notification);
                if (bundle == null) {
                    bundle = new Bundle();
                    f28912b.set(notification, bundle);
                }
                return bundle;
            } catch (IllegalAccessException e) {
                Log.e(NotificationCompatJellybean.TAG, "Unable to access notification extras", e);
                f28913c = true;
                return null;
            } catch (NoSuchFieldException e2) {
                Log.e(NotificationCompatJellybean.TAG, "Unable to access notification extras", e2);
                f28913c = true;
                return null;
            }
        }
    }

    /* renamed from: a */
    private static Bundle[] m34385a(C11828jv[] jvVarArr) {
        if (jvVarArr == null) {
            return null;
        }
        Bundle[] bundleArr = new Bundle[jvVarArr.length];
        for (int i = 0; i < jvVarArr.length; i++) {
            C11828jv jvVar = jvVarArr[i];
            Bundle bundle = new Bundle();
            bundle.putString("resultKey", jvVar.f28915a);
            bundle.putCharSequence(Constants.ScionAnalytics.PARAM_LABEL, jvVar.f28916b);
            bundle.putCharSequenceArray("choices", jvVar.f28917c);
            bundle.putBoolean("allowFreeFormInput", jvVar.f28918d);
            bundle.putBundle("extras", jvVar.f28919e);
            Set<String> set = jvVar.f28920f;
            if (set != null && !set.isEmpty()) {
                ArrayList arrayList = new ArrayList(set.size());
                for (String add : set) {
                    arrayList.add(add);
                }
                bundle.putStringArrayList("allowedDataTypes", arrayList);
            }
            bundleArr[i] = bundle;
        }
        return bundleArr;
    }

    /* renamed from: a */
    public static Bundle m34382a(Notification.Builder builder, C11821js.C11822a aVar) {
        builder.addAction(aVar.f28855e, aVar.f28856f, aVar.f28857g);
        Bundle bundle = new Bundle(aVar.f28851a);
        if (aVar.f28852b != null) {
            bundle.putParcelableArray(NotificationCompatExtras.EXTRA_REMOTE_INPUTS, m34385a(aVar.f28852b));
        }
        if (aVar.f28853c != null) {
            bundle.putParcelableArray("android.support.dataRemoteInputs", m34385a(aVar.f28853c));
        }
        bundle.putBoolean("android.support.allowGeneratedReplies", aVar.f28854d);
        return bundle;
    }
}

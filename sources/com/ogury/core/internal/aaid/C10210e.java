package com.ogury.core.internal.aaid;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import com.ogury.core.internal.C10219ai;
import com.ogury.core.internal.C10233au;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.UUID;

/* renamed from: com.ogury.core.internal.aaid.e */
/* compiled from: OguryAdvertisingIdGenerator.kt */
public final class C10210e {

    /* renamed from: a */
    public static final C10210e f25991a = new C10210e();

    /* renamed from: com.ogury.core.internal.aaid.e$a */
    /* compiled from: OguryAdvertisingIdGenerator.kt */
    static final class C10211a<T> implements Comparator<ApplicationInfo> {

        /* renamed from: a */
        public static final C10211a f25992a = new C10211a();

        C10211a() {
        }

        public final /* synthetic */ int compare(Object obj, Object obj2) {
            String str = ((ApplicationInfo) obj).packageName;
            String str2 = ((ApplicationInfo) obj2).packageName;
            C10219ai.m31034a((Object) str2, "rhs.packageName");
            return str.compareTo(str2);
        }
    }

    private C10210e() {
    }

    /* renamed from: a */
    public final OguryAaid mo66776a(Context context) {
        String str;
        String a;
        C10219ai.m31036b(context, "context");
        try {
            C10206a a2 = C10208c.f25988a.mo66772a(context);
            if (a2 == null || (a = a2.mo66764a()) == null) {
                throw new IllegalStateException("Advertising Id is null");
            }
            return new OguryAaid(a, !a2.mo66765b(), false);
        } catch (Exception unused) {
            ApplicationInfo b = m31023b(context);
            if (b == null) {
                str = "00000000-0000-0000-0000-000000000000";
            } else {
                str = m31022a(context, b);
            }
            return new OguryAaid(str, true, true);
        }
    }

    /* renamed from: a */
    private static String m31022a(Context context, ApplicationInfo applicationInfo) {
        try {
            long j = context.getPackageManager().getPackageInfo(applicationInfo.packageName, 128).firstInstallTime;
            String str = String.valueOf(j);
            Charset charset = C10233au.f26004a;
            if (str != null) {
                byte[] bytes = str.getBytes(charset);
                C10219ai.m31034a((Object) bytes, "(this as java.lang.String).getBytes(charset)");
                String uuid = UUID.nameUUIDFromBytes(bytes).toString();
                C10219ai.m31034a((Object) uuid, "UUID.nameUUIDFromBytes((…toByteArray()).toString()");
                return uuid;
            }
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        } catch (Exception unused) {
            return "00000000-0000-0000-0000-000000000000";
        }
    }

    /* renamed from: b */
    private final ApplicationInfo m31023b(Context context) {
        if (context != null) {
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager != null) {
                    List<ApplicationInfo> installedApplications = packageManager.getInstalledApplications(128);
                    ArrayList arrayList = new ArrayList();
                    if (installedApplications.size() == 0) {
                        return null;
                    }
                    C10219ai.m31034a((Object) installedApplications, "apps");
                    for (int i = 0; i < installedApplications.size(); i++) {
                        ApplicationInfo applicationInfo = installedApplications.get(i);
                        if (!((1 & applicationInfo.flags) == 0 || applicationInfo.packageName == null)) {
                            arrayList.add(applicationInfo);
                        }
                    }
                    List list = arrayList;
                    Comparator comparator = C10211a.f25992a;
                    C10219ai.m31036b(list, "$this$sortWith");
                    C10219ai.m31036b(comparator, "comparator");
                    if (list.size() > 1) {
                        Collections.sort(list, comparator);
                    }
                    return (ApplicationInfo) arrayList.get(0);
                }
            } catch (Exception unused) {
            }
        }
        return null;
    }
}

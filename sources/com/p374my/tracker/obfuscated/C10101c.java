package com.p374my.tracker.obfuscated;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.my.tracker.obfuscated.c */
public final class C10101c {

    /* renamed from: a */
    private List<C10102a> f25150a = Collections.EMPTY_LIST;

    /* renamed from: b */
    private List<PackageInfo> f25151b;

    /* renamed from: c */
    private String f25152c;

    /* renamed from: d */
    private boolean f25153d = false;

    /* renamed from: com.my.tracker.obfuscated.c$a */
    public static final class C10102a {

        /* renamed from: a */
        public final String f25154a;

        /* renamed from: b */
        public final long f25155b;

        C10102a(String str, long j) {
            this.f25154a = str;
            this.f25155b = j;
        }
    }

    C10101c() {
    }

    /* renamed from: a */
    private static String m30017a(List<C10102a> list) {
        StringBuilder sb = new StringBuilder();
        boolean z = false;
        for (C10102a next : list) {
            if (z) {
                sb.append(",");
            } else {
                z = true;
            }
            sb.append(next.f25154a);
        }
        return sb.toString();
    }

    /* renamed from: b */
    private static List<C10102a> m30018b(List<PackageInfo> list) {
        ArrayList arrayList = new ArrayList();
        for (PackageInfo next : list) {
            ApplicationInfo applicationInfo = next.applicationInfo;
            if ((applicationInfo.flags & 1) == 0) {
                arrayList.add(new C10102a(applicationInfo.packageName, C10173t0.m30435b(next.firstInstallTime)));
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public void mo66122a(Context context) {
        String str;
        this.f25153d = false;
        List<PackageInfo> list = this.f25151b;
        if (list != null && !list.isEmpty()) {
            List<C10102a> b = m30018b(this.f25151b);
            this.f25150a = b;
            String a = m30017a(b);
            if (!TextUtils.isEmpty(a)) {
                String e = C10121k0.m30104a(context).mo66193e();
                String a2 = C10120k.m30103a(a);
                this.f25152c = a2;
                if (e.equals(a2)) {
                    str = "Apps hash did not changed";
                } else {
                    this.f25153d = true;
                    str = "Apps hash changed";
                }
                C10175u0.m30440a(str);
            }
        }
    }

    /* renamed from: a */
    public void mo66123a(C10129m0 m0Var, Context context) {
        if (this.f25153d && !this.f25150a.isEmpty()) {
            m0Var.mo66273a(this.f25150a);
        }
    }

    /* renamed from: b */
    public void mo66124b(Context context) {
        if (this.f25153d) {
            C10121k0.m30104a(context).mo66200h(this.f25152c);
            this.f25153d = false;
        }
    }

    /* renamed from: c */
    public void mo66125c(List<PackageInfo> list) {
        this.f25151b = list;
    }
}

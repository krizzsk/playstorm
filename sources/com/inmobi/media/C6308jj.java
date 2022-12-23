package com.inmobi.media;

import com.inmobi.unifiedId.InMobiUserDataModel;
import com.inmobi.unifiedId.InMobiUserDataTypes;
import java.util.HashMap;

/* renamed from: com.inmobi.media.jj */
/* compiled from: HashedPII */
public final class C6308jj {

    /* renamed from: a */
    private static InMobiUserDataModel f15959a;

    /* renamed from: a */
    public static synchronized void m18858a(InMobiUserDataModel inMobiUserDataModel) {
        synchronized (C6308jj.class) {
            f15959a = inMobiUserDataModel;
        }
    }

    /* renamed from: a */
    public static InMobiUserDataTypes m18856a() {
        InMobiUserDataModel inMobiUserDataModel = f15959a;
        if (inMobiUserDataModel == null) {
            return null;
        }
        return m18857a(inMobiUserDataModel.getPhoneNumber());
    }

    /* renamed from: b */
    public static InMobiUserDataTypes m18859b() {
        InMobiUserDataModel inMobiUserDataModel = f15959a;
        if (inMobiUserDataModel == null) {
            return null;
        }
        return m18857a(inMobiUserDataModel.getEmailId());
    }

    /* renamed from: a */
    private static InMobiUserDataTypes m18857a(InMobiUserDataTypes inMobiUserDataTypes) {
        if (inMobiUserDataTypes == null) {
            return null;
        }
        if (inMobiUserDataTypes.getMd5() == null && inMobiUserDataTypes.getSha1() == null && inMobiUserDataTypes.getSha256() == null) {
            return null;
        }
        return inMobiUserDataTypes;
    }

    /* renamed from: c */
    public static HashMap<String, String> m18861c() {
        InMobiUserDataModel inMobiUserDataModel = f15959a;
        if (inMobiUserDataModel == null) {
            return null;
        }
        return inMobiUserDataModel.getExtras();
    }

    /* renamed from: b */
    public static boolean m18860b(InMobiUserDataModel inMobiUserDataModel) {
        InMobiUserDataModel inMobiUserDataModel2;
        if (inMobiUserDataModel == null && f15959a == null) {
            return true;
        }
        if (inMobiUserDataModel == null || (inMobiUserDataModel2 = f15959a) == null) {
            return false;
        }
        return inMobiUserDataModel.equals(inMobiUserDataModel2);
    }
}

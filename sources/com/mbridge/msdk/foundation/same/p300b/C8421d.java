package com.mbridge.msdk.foundation.same.p300b;

import java.util.ArrayList;
import java.util.List;

/* renamed from: com.mbridge.msdk.foundation.same.b.d */
/* compiled from: MBridgeDirContext */
public final class C8421d extends C8419b {
    public C8421d(String str) {
        super(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final List<C8418a> mo57501b() {
        ArrayList arrayList = new ArrayList();
        mo57500a(arrayList, C8420c.MBRIDGE_RES_MANAGER_DIR, "mb/res");
        mo57500a(arrayList, C8420c.AD_MOVIES, "mb/res/Movies").mo57493a(C8420c.MBRIDGE_VC, "mb/res/.MBridge_VC");
        C8418a a = mo57500a(arrayList, C8420c.AD_MBRIDGE_700, "mb/res/.mbridge700");
        a.mo57493a(C8420c.MBRIDGE_700_IMG, "mb/res/img");
        a.mo57493a(C8420c.MBRIDGE_700_RES, "mb/res/res");
        a.mo57493a(C8420c.MBRIDGE_700_HTML, "mb/res/html");
        a.mo57493a(C8420c.MBRIDGE_700_XML, "mb/res/xml");
        a.mo57493a(C8420c.MBRIDGE_700_CONFIG, "mb/config");
        mo57500a(arrayList, C8420c.MBRIDGE_OTHER, "mb/other");
        mo57500a(arrayList, C8420c.MBRIDGE_CRASH_INFO, "mb/crashinfo");
        mo57500a(arrayList, C8420c.MBRIDGE_OTHER, "mb/other");
        return arrayList;
    }
}

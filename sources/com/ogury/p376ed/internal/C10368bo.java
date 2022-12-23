package com.ogury.p376ed.internal;

import android.app.Activity;
import java.util.List;

/* renamed from: com.ogury.ed.internal.bo */
public final class C10368bo {
    /* renamed from: a */
    public static C10371bq m31377a(Activity activity, C10393cd cdVar, C10524fh fhVar) {
        C10765mq.m32773b(activity, "activity");
        C10765mq.m32773b(cdVar, "publisherActivityFilter");
        C10765mq.m32773b(fhVar, "overlayActivityConfig");
        C10371bq bqVar = new C10371bq(fhVar, activity.getClass());
        bqVar.mo67107a(activity);
        bqVar.mo67108a(cdVar.mo67148a());
        bqVar.mo67109b((List<? extends Class<? extends Activity>>) cdVar.mo67150b());
        return bqVar;
    }
}

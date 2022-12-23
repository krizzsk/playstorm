package com.mbridge.msdk.mbbanner.common.p323b;

import android.graphics.Bitmap;
import com.mbridge.msdk.foundation.same.p301c.C8428c;
import com.mbridge.msdk.mbbanner.common.p324c.C8687b;

/* renamed from: com.mbridge.msdk.mbbanner.common.b.f */
/* compiled from: DownloadImageListener */
public class C8675f implements C8428c {

    /* renamed from: a */
    private static final String f21004a = C8675f.class.getSimpleName();

    /* renamed from: b */
    private C8687b f21005b;

    /* renamed from: c */
    private String f21006c;

    public C8675f(C8687b bVar, String str) {
        if (bVar != null) {
            this.f21005b = bVar;
        }
        this.f21006c = str;
    }

    public void onSuccessLoad(Bitmap bitmap, String str) {
        this.f21005b.mo58020a(this.f21006c, 1, str, true);
    }

    public void onFailedLoad(String str, String str2) {
        this.f21005b.mo58020a(this.f21006c, 1, str2, false);
    }
}

package com.mbridge.msdk.mbbanner.common.p323b;

import com.mbridge.msdk.mbbanner.common.p324c.C8687b;
import com.mbridge.msdk.videocommon.download.C9563g;

/* renamed from: com.mbridge.msdk.mbbanner.common.b.e */
/* compiled from: DownloadBannerUrlListener */
public class C8674e implements C9563g.C9569b {

    /* renamed from: a */
    private static final String f21001a = C8674e.class.getSimpleName();

    /* renamed from: b */
    private String f21002b;

    /* renamed from: c */
    private C8687b f21003c;

    public C8674e(C8687b bVar, String str) {
        this.f21003c = bVar;
        this.f21002b = str;
    }

    /* renamed from: a */
    public final void mo57995a(String str) {
        C8687b bVar = this.f21003c;
        if (bVar != null) {
            bVar.mo58020a(this.f21002b, 3, str, true);
        }
    }

    /* renamed from: a */
    public final void mo57996a(String str, String str2) {
        C8687b bVar = this.f21003c;
        if (bVar != null) {
            bVar.mo58020a(this.f21002b, 3, str, false);
        }
    }
}

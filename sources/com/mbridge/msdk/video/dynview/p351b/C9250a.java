package com.mbridge.msdk.video.dynview.p351b;

import android.view.View;
import com.mbridge.msdk.video.dynview.C9252c;
import com.mbridge.msdk.video.dynview.p353d.C9258b;
import com.mbridge.msdk.video.dynview.p364j.C9302a;
import java.util.ArrayList;
import java.util.Map;

/* renamed from: com.mbridge.msdk.video.dynview.b.a */
/* compiled from: DataEnergize */
public class C9250a {

    /* renamed from: a */
    private static volatile C9250a f22406a;

    private C9250a() {
    }

    /* renamed from: a */
    public static C9250a m26479a() {
        C9250a aVar;
        if (f22406a != null) {
            return f22406a;
        }
        synchronized (C9250a.class) {
            if (f22406a == null) {
                f22406a = new C9250a();
            }
            aVar = f22406a;
        }
        return aVar;
    }

    /* renamed from: a */
    public final void mo62362a(View view, C9252c cVar, Map map, C9258b bVar) {
        int h = cVar.mo62371h();
        if (h == 1) {
            new C9302a().mo62503a(cVar, view, map, bVar);
        } else if (h == 4) {
            new C9302a().mo62502a(cVar, view, bVar);
        } else if (h == 102 || h == 202 || h == 302 || h == 802 || h == 904) {
            new C9302a().mo62504b(cVar, view, map, bVar);
        } else {
            bVar.mo62388a(view, new ArrayList());
        }
    }
}

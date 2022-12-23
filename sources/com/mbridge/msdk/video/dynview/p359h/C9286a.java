package com.mbridge.msdk.video.dynview.p359h;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.mbridge.msdk.foundation.tools.C8594o;
import com.mbridge.msdk.video.dynview.C9247a;
import com.mbridge.msdk.video.dynview.C9252c;
import com.mbridge.msdk.video.dynview.p351b.C9250a;
import com.mbridge.msdk.video.dynview.p351b.C9251b;
import com.mbridge.msdk.video.dynview.p352c.C9256a;
import com.mbridge.msdk.video.dynview.p353d.C9258b;
import com.mbridge.msdk.video.dynview.p353d.C9260d;
import java.util.List;
import java.util.Map;

/* renamed from: com.mbridge.msdk.video.dynview.h.a */
/* compiled from: MBridgeUI */
public final class C9286a {
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x002b, code lost:
        r3 = r9.get(0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C9286a(android.content.Context r8, java.util.List<com.mbridge.msdk.foundation.entity.CampaignEx> r9, com.mbridge.msdk.video.dynview.p353d.C9260d r10, java.util.Map<java.lang.String, java.lang.Object> r11) {
        /*
            r7 = this;
            r7.<init>()
            com.mbridge.msdk.video.dynview.j.c r0 = new com.mbridge.msdk.video.dynview.j.c
            r0.<init>()
            com.mbridge.msdk.foundation.controller.a r0 = com.mbridge.msdk.foundation.controller.C2350a.m5601e()
            android.content.Context r0 = r0.mo15792g()
            int r0 = com.mbridge.msdk.foundation.tools.C8613y.m24950h((android.content.Context) r0)
            float r0 = (float) r0
            com.mbridge.msdk.foundation.controller.a r1 = com.mbridge.msdk.foundation.controller.C2350a.m5601e()
            android.content.Context r1 = r1.mo15792g()
            int r1 = com.mbridge.msdk.foundation.tools.C8613y.m24948g((android.content.Context) r1)
            float r1 = (float) r1
            r2 = 1
            if (r9 == 0) goto L_0x0043
            int r3 = r9.size()
            if (r3 <= 0) goto L_0x0043
            r3 = 0
            java.lang.Object r3 = r9.get(r3)
            com.mbridge.msdk.foundation.entity.CampaignEx r3 = (com.mbridge.msdk.foundation.entity.CampaignEx) r3
            if (r3 == 0) goto L_0x0043
            com.mbridge.msdk.foundation.entity.CampaignEx$c r4 = r3.getRewardTemplateMode()
            if (r4 == 0) goto L_0x0043
            com.mbridge.msdk.foundation.entity.CampaignEx$c r3 = r3.getRewardTemplateMode()
            int r3 = r3.mo57203c()
            goto L_0x0044
        L_0x0043:
            r3 = r2
        L_0x0044:
            java.lang.String r4 = "mbridge_same_choice_one_layout_landscape"
            java.lang.String r5 = "mbridge_same_choice_one_layout_portrait"
            r6 = 2
            if (r3 == r2) goto L_0x0056
            if (r3 == r6) goto L_0x0057
            boolean r3 = com.mbridge.msdk.video.dynview.p360i.C9297b.m26663a((android.content.Context) r8)
            if (r3 == 0) goto L_0x0055
            r3 = r6
            goto L_0x0057
        L_0x0055:
            r3 = r2
        L_0x0056:
            r4 = r5
        L_0x0057:
            com.mbridge.msdk.video.dynview.c$a r5 = new com.mbridge.msdk.video.dynview.c$a
            r5.<init>()
            com.mbridge.msdk.video.dynview.c$b r8 = r5.mo62376a((android.content.Context) r8)
            com.mbridge.msdk.video.dynview.c$b r8 = r8.mo62378a((java.lang.String) r4)
            com.mbridge.msdk.video.dynview.c$b r8 = r8.mo62375a((int) r2)
            com.mbridge.msdk.video.dynview.c$b r8 = r8.mo62374a((float) r1)
            com.mbridge.msdk.video.dynview.c$b r8 = r8.mo62382b((float) r0)
            com.mbridge.msdk.video.dynview.c$b r8 = r8.mo62379a((java.util.List<com.mbridge.msdk.foundation.entity.CampaignEx>) r9)
            com.mbridge.msdk.video.dynview.c$b r8 = r8.mo62383b((int) r3)
            com.mbridge.msdk.video.dynview.c r8 = r8.mo62381a()
            r7.m26640a(r8, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.video.dynview.p359h.C9286a.<init>(android.content.Context, java.util.List, com.mbridge.msdk.video.dynview.d.d, java.util.Map):void");
    }

    public C9286a(C9252c cVar, C9260d dVar, Map<String, Object> map) {
        m26640a(cVar, dVar, map);
    }

    /* renamed from: a */
    private void m26640a(C9252c cVar, final C9260d dVar, Map<String, Object> map) {
        if (dVar != null) {
            if (cVar == null) {
                dVar.mo62281a(C9256a.NOT_FOUND_VIEWOPTION);
            } else if (cVar.mo62364a() == null) {
                dVar.mo62281a(C9256a.NOT_FOUND_CONTEXT);
            } else if (TextUtils.isEmpty(cVar.mo62365b())) {
                dVar.mo62281a(C9256a.NOT_FOUND_LAYOUTNAME);
            } else {
                View inflate = LayoutInflater.from(cVar.mo62364a()).inflate(C8594o.m24812a(cVar.mo62364a(), cVar.mo62365b(), "layout"), (ViewGroup) null);
                C9251b.m26481a().mo62363a(inflate, cVar, map);
                C9250a.m26479a().mo62362a(inflate, cVar, map, new C9258b() {
                    /* renamed from: a */
                    public final void mo62388a(View view, List<View> list) {
                        C9247a aVar = new C9247a();
                        aVar.mo62358a(view);
                        aVar.mo62359a(list);
                        dVar.mo62280a(aVar);
                    }

                    /* renamed from: a */
                    public final void mo62389a(C9256a aVar) {
                        dVar.mo62281a(aVar);
                    }
                });
            }
        }
    }
}

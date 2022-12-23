package com.mbridge.msdk.video.dynview.p360i.p361a;

import android.graphics.Bitmap;
import android.view.View;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.video.dynview.C9252c;
import com.mbridge.msdk.video.dynview.p358g.C9282a;
import com.mbridge.msdk.video.dynview.p360i.C9295a;
import java.util.List;
import java.util.Map;

/* renamed from: com.mbridge.msdk.video.dynview.i.a.a */
/* compiled from: ChoiceOneDrawBitBg */
public class C9296a {

    /* renamed from: a */
    private static volatile C9296a f22532a;

    /* renamed from: b */
    private View f22533b;

    /* renamed from: c */
    private Bitmap f22534c;

    /* renamed from: d */
    private Bitmap f22535d;

    private C9296a() {
    }

    /* renamed from: a */
    public static C9296a m26657a() {
        C9296a aVar;
        if (f22532a != null) {
            return f22532a;
        }
        synchronized (C9296a.class) {
            if (f22532a == null) {
                f22532a = new C9296a();
            }
            aVar = f22532a;
        }
        return aVar;
    }

    /* renamed from: a */
    public final void mo62490a(Map map, C9252c cVar, View view) {
        Bitmap bitmap;
        List<CampaignEx> g;
        this.f22533b = view;
        int e = cVar.mo62368e();
        float d = cVar.mo62367d();
        float c = cVar.mo62366c();
        if (map != null && map.size() > 1 && (g = cVar.mo62370g()) != null && g.size() > 1) {
            if (map.get(SameMD5.getMD5(g.get(0).getImageUrl())) != null && (map.get(SameMD5.getMD5(g.get(0).getImageUrl())) instanceof Bitmap)) {
                Bitmap bitmap2 = (Bitmap) map.get(SameMD5.getMD5(g.get(0).getImageUrl()));
                if (!(g.get(0) == null || bitmap2 == null || bitmap2.isRecycled())) {
                    this.f22534c = C9295a.m26655a().mo62489a(bitmap2, 0);
                }
            }
            if (map.get(SameMD5.getMD5(g.get(1).getImageUrl())) != null && (map.get(SameMD5.getMD5(g.get(1).getImageUrl())) instanceof Bitmap)) {
                Bitmap bitmap3 = (Bitmap) map.get(SameMD5.getMD5(g.get(1).getImageUrl()));
                if (g.get(1) != null && !bitmap3.isRecycled()) {
                    this.f22535d = C9295a.m26655a().mo62489a(bitmap3, 1);
                }
            }
        }
        Bitmap bitmap4 = this.f22534c;
        if (bitmap4 != null && !bitmap4.isRecycled() && (bitmap = this.f22535d) != null && !bitmap.isRecycled()) {
            m26658a(e, d, c, this.f22534c, this.f22535d);
        }
    }

    /* renamed from: a */
    private synchronized void m26658a(int i, float f, float f2, Bitmap bitmap, Bitmap bitmap2) {
        C9282a.C9284a a = C9282a.m26617a();
        a.mo62466a(i).mo62467a(bitmap).mo62471b(bitmap2);
        if (i != 2) {
            a.mo62465a(f).mo62470b(f2);
        } else if (f > f2) {
            a.mo62465a(f).mo62470b(f2);
        } else {
            a.mo62465a(f2).mo62470b(f);
        }
        this.f22533b.setBackground(a.mo62469a());
    }

    /* renamed from: b */
    public final void mo62491b() {
        if (this.f22533b != null) {
            this.f22533b = null;
        }
        Bitmap bitmap = this.f22534c;
        if (bitmap != null && !bitmap.isRecycled()) {
            this.f22534c.recycle();
            this.f22534c = null;
        }
        Bitmap bitmap2 = this.f22535d;
        if (bitmap2 != null && !bitmap2.isRecycled()) {
            this.f22535d.recycle();
            this.f22535d = null;
        }
    }
}

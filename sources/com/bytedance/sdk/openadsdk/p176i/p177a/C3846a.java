package com.bytedance.sdk.openadsdk.p176i.p177a;

import android.graphics.Bitmap;
import android.text.TextUtils;
import android.widget.ImageView;
import com.bytedance.sdk.component.p110d.C2898j;
import com.bytedance.sdk.component.p110d.C2902n;
import com.bytedance.sdk.openadsdk.p167d.C3769a;
import com.bytedance.sdk.openadsdk.p176i.C3845a;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.Map;

/* renamed from: com.bytedance.sdk.openadsdk.i.a.a */
/* compiled from: GifLoader */
public class C3846a {

    /* renamed from: com.bytedance.sdk.openadsdk.i.a.a$b */
    /* compiled from: GifLoader */
    public interface C3849b {
        /* renamed from: a */
        void mo20692a();

        /* renamed from: a */
        void mo20693a(int i, String str, Throwable th);

        /* renamed from: a */
        void mo20694a(String str, C3850b bVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo20687a() {
    }

    /* renamed from: a */
    public void mo20691a(C3845a aVar, C3849b bVar, int i, int i2, String str) {
        mo20690a(aVar, bVar, i, i2, ImageView.ScaleType.CENTER_INSIDE, str);
    }

    /* renamed from: a */
    public void mo20690a(C3845a aVar, final C3849b bVar, int i, int i2, ImageView.ScaleType scaleType, String str) {
        C3769a.m12388a(aVar.f9955a).mo17717a(aVar.f9956b).mo17712a(i).mo17719b(i2).mo17720b(str).mo17713a(Bitmap.Config.RGB_565).mo17714a(scaleType).mo17718a(!TextUtils.isEmpty(str)).mo17711a((C2902n) new C2902n() {
            /* renamed from: a */
            public void mo17257a(C2898j jVar) {
                C3846a.this.mo20689a(jVar, bVar);
            }

            /* renamed from: a */
            public void mo17256a(int i, String str, Throwable th) {
                C3846a.this.mo20688a(i, str, th, bVar);
            }
        });
        mo20687a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo20689a(C2898j jVar, C3849b bVar) {
        if (bVar != null) {
            Object b = jVar.mo17725b();
            int a = m12619a(jVar);
            if (b instanceof byte[]) {
                bVar.mo20694a(jVar.mo17724a(), new C3850b((byte[]) b, a));
            } else if (b instanceof Bitmap) {
                bVar.mo20694a(jVar.mo17724a(), new C3850b((Bitmap) b, a));
            } else {
                bVar.mo20693a(0, "not bitmap or gif result!", (Throwable) null);
            }
        }
        if (bVar != null) {
            bVar.mo20692a();
        }
    }

    /* renamed from: a */
    private int m12619a(C2898j jVar) {
        String str;
        Map<String, String> c = jVar.mo17726c();
        if (c == null || (str = c.get(CampaignEx.JSON_KEY_IMAGE_SIZE)) == null || !(str instanceof Integer)) {
            return 0;
        }
        return ((Integer) str).intValue();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo20688a(int i, String str, Throwable th, C3849b bVar) {
        if (bVar != null) {
            bVar.mo20693a(i, str, th);
        }
    }

    /* renamed from: b */
    public static C3848a m12620b() {
        return new C3848a();
    }

    /* renamed from: com.bytedance.sdk.openadsdk.i.a.a$a */
    /* compiled from: GifLoader */
    static class C3848a implements C3849b {
        /* renamed from: a */
        public void mo20692a() {
        }

        /* renamed from: a */
        public void mo20693a(int i, String str, Throwable th) {
        }

        /* renamed from: a */
        public void mo20694a(String str, C3850b bVar) {
        }

        C3848a() {
        }
    }
}

package com.iab.omid.library.corpmailru;

import android.content.Context;
import com.iab.omid.library.corpmailru.p239b.C7739b;
import com.iab.omid.library.corpmailru.p239b.C7742d;
import com.iab.omid.library.corpmailru.p239b.C7745f;
import com.iab.omid.library.corpmailru.p241d.C7753b;
import com.iab.omid.library.corpmailru.p241d.C7757e;

/* renamed from: com.iab.omid.library.corpmailru.b */
public class C7737b {

    /* renamed from: a */
    private boolean f18435a;

    /* renamed from: b */
    private void m21619b(Context context) {
        C7757e.m21716a((Object) context, "Application Context cannot be null");
    }

    /* renamed from: a */
    public String mo54798a() {
        return "1.3.20-Corpmailru";
    }

    /* renamed from: a */
    public void mo54799a(Context context) {
        m21619b(context);
        if (!mo54801b()) {
            mo54800a(true);
            C7745f.m21664a().mo54844a(context);
            C7739b.m21631a().mo54808a(context);
            C7753b.m21696a(context);
            C7742d.m21644a().mo54825a(context);
        }
    }

    /* renamed from: a */
    public void mo54800a(boolean z) {
        this.f18435a = z;
    }

    /* renamed from: b */
    public boolean mo54801b() {
        return this.f18435a;
    }
}

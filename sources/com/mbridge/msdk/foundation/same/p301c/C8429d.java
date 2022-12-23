package com.mbridge.msdk.foundation.same.p301c;

import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.same.net.C8480f;
import com.mbridge.msdk.foundation.same.net.C8501k;
import com.mbridge.msdk.foundation.same.net.p305a.C8452a;
import com.mbridge.msdk.foundation.same.net.p311g.C8492b;
import com.mbridge.msdk.foundation.same.p303e.C8434a;
import java.io.File;

/* renamed from: com.mbridge.msdk.foundation.same.c.d */
/* compiled from: CommonImageTask */
public final class C8429d extends C8434a {

    /* renamed from: a */
    private String f20394a;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public String f20395e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public String f20396f;

    /* renamed from: g */
    private boolean f20397g = false;

    /* renamed from: h */
    private C8431a f20398h;

    /* renamed from: com.mbridge.msdk.foundation.same.c.d$a */
    /* compiled from: CommonImageTask */
    public interface C8431a {
        /* renamed from: a */
        void mo57511a(String str, String str2);

        /* renamed from: b */
        void mo57512b(String str, String str2);
    }

    /* renamed from: b */
    public final void mo15709b() {
    }

    /* renamed from: a */
    public final void mo57516a(boolean z) {
        this.f20397g = z;
    }

    /* renamed from: a */
    public final void mo57515a(C8431a aVar) {
        this.f20398h = aVar;
    }

    public C8429d(String str, String str2, String str3) {
        this.f20394a = str;
        this.f20395e = str2;
        this.f20396f = str3;
    }

    /* renamed from: e */
    private void m24359e() {
        try {
            File file = new File(this.f20396f);
            if (!file.exists()) {
                file.mkdirs();
            }
            if (file.exists()) {
                file.delete();
            }
            C8492b.m24507a(file, this.f20395e, new C8480f<Void>() {
                /* renamed from: a */
                public final void mo57518a(long j, long j2) {
                }

                /* renamed from: b */
                public final void mo57521b() {
                }

                /* renamed from: a */
                public final void mo57520a(C8501k kVar) {
                    String unused = C8429d.this.f20396f;
                    C8429d.this.mo57517c();
                }

                /* renamed from: a */
                public final void mo57519a(C8452a aVar) {
                    C8429d dVar = C8429d.this;
                    String b = dVar.f20395e;
                    dVar.m24357a(b, "load image from http faild because http return code: " + aVar.f20430a + ".image url is " + C8429d.this.f20395e);
                }
            });
        } catch (Exception e) {
            m24357a(this.f20395e, e.getMessage());
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
        } catch (OutOfMemoryError e2) {
            m24357a(this.f20395e, e2.getMessage());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo57517c() {
        if (new File(this.f20396f).exists()) {
            String str = this.f20395e;
            String str2 = this.f20396f;
            C8431a aVar = this.f20398h;
            if (aVar != null) {
                aVar.mo57511a(str, str2);
                return;
            }
            return;
        }
        m24357a(this.f20395e, "load image faild.because file[" + this.f20396f + "] is not exist!");
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m24357a(String str, String str2) {
        C8431a aVar = this.f20398h;
        if (aVar != null) {
            aVar.mo57512b(str, str2);
        }
    }

    /* renamed from: a */
    public final void mo15708a() {
        if (this.f20397g) {
            m24359e();
        } else if (TextUtils.isEmpty(this.f20396f)) {
            m24357a(this.f20395e, "save path is null.");
        } else {
            File file = new File(this.f20396f);
            if (!file.exists() || file.length() <= 0) {
                m24359e();
            } else {
                mo57517c();
            }
        }
    }
}

package com.bytedance.sdk.openadsdk.core.nativeexpress;

import android.os.Looper;
import android.view.View;
import com.bytedance.sdk.component.adexpress.p095b.C2619a;
import com.bytedance.sdk.component.adexpress.p095b.C2622c;
import com.bytedance.sdk.component.adexpress.p095b.C2626f;
import com.bytedance.sdk.component.adexpress.p095b.C2633l;
import com.bytedance.sdk.component.adexpress.p095b.C2635m;
import com.bytedance.sdk.component.adexpress.theme.ThemeStatusBroadcastReceiver;
import com.bytedance.sdk.openadsdk.core.C3568k;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.bytedance.sdk.openadsdk.core.nativeexpress.l */
/* compiled from: NativeRender */
public class C3619l extends C2619a<BackupView> {

    /* renamed from: a */
    AtomicBoolean f9168a = new AtomicBoolean(false);

    /* renamed from: b */
    private BackupView f9169b;

    /* renamed from: c */
    private View f9170c;

    /* renamed from: d */
    private C2622c f9171d;

    /* renamed from: e */
    private C2626f f9172e;

    /* renamed from: f */
    private C2633l f9173f;

    public C3619l(View view, ThemeStatusBroadcastReceiver themeStatusBroadcastReceiver, C2633l lVar) {
        this.f9170c = view;
        this.f9173f = lVar;
    }

    /* renamed from: a */
    public void mo16719a(C2626f fVar) {
        this.f9172e = fVar;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            m11462b();
        } else {
            C3568k.m11192d().post(new Runnable() {
                public void run() {
                    C3619l.this.m11462b();
                }
            });
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m11462b() {
        if (!this.f9168a.get()) {
            C2622c cVar = this.f9171d;
            boolean z = false;
            if (cVar != null && cVar.mo16718a((NativeExpressView) this.f9170c, 0)) {
                z = true;
            }
            if (!z) {
                this.f9172e.mo16716a(107);
                return;
            }
            this.f9173f.mo16751c().mo16733e();
            BackupView backupView = (BackupView) this.f9170c.findViewWithTag("tt_express_backup_fl_tag_26");
            this.f9169b = backupView;
            if (backupView != null) {
                C2635m mVar = new C2635m();
                BackupView backupView2 = this.f9169b;
                float f = 0.0f;
                float realWidth = backupView2 == null ? 0.0f : backupView2.getRealWidth();
                BackupView backupView3 = this.f9169b;
                if (backupView3 != null) {
                    f = backupView3.getRealHeight();
                }
                mVar.mo16785a(true);
                mVar.mo16781a((double) realWidth);
                mVar.mo16788b((double) f);
                this.f9172e.mo16717a(this.f9169b, mVar);
                return;
            }
            this.f9172e.mo16716a(107);
        }
    }

    /* renamed from: a */
    public BackupView mo16720e() {
        return this.f9169b;
    }

    /* renamed from: a */
    public void mo16709a(C2622c cVar) {
        this.f9171d = cVar;
    }
}

package com.bytedance.sdk.openadsdk.dislike;

import android.app.Activity;
import android.content.Context;
import com.bytedance.sdk.component.utils.C2975l;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.TTAdDislike;
import com.bytedance.sdk.openadsdk.core.p151e.C3498n;
import com.bytedance.sdk.openadsdk.dislike.C3780c;

/* renamed from: com.bytedance.sdk.openadsdk.dislike.b */
/* compiled from: TTAdDislikeImpl */
public class C3778b implements TTAdDislike {

    /* renamed from: a */
    private final Context f9839a;

    /* renamed from: b */
    private C3498n f9840b;

    /* renamed from: c */
    private C3780c f9841c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public TTAdDislike.DislikeInteractionCallback f9842d;

    public C3778b(Context context, C3498n nVar) {
        if (!(context instanceof Activity)) {
            C2975l.m8383b("Dislike Initialization must use activity, please pass in TTAdManager.createAdNative(activity)");
        }
        this.f9839a = context;
        this.f9840b = nVar;
        m12422a();
    }

    /* renamed from: a */
    private void m12422a() {
        C3780c cVar = new C3780c(this.f9839a, this.f9840b);
        this.f9841c = cVar;
        cVar.mo20590a((C3780c.C3786a) new C3780c.C3786a() {
            /* renamed from: a */
            public void mo20585a() {
                C2975l.m8384b("TTAdDislikeImpl", "onDislikeShow: ");
            }

            /* renamed from: a */
            public void mo20586a(int i, FilterWord filterWord) {
                try {
                    if (!filterWord.hasSecondOptions() && C3778b.this.f9842d != null) {
                        C3778b.this.f9842d.onSelected(i, filterWord.getName());
                    }
                    C2975l.m8391e("TTAdDislikeImpl", "onDislikeSelected: " + i + ", " + String.valueOf(filterWord.getName()));
                } catch (Throwable th) {
                    C2975l.m8388c("TTAdDislikeImpl", "dislike callback selected error: ", th);
                }
            }

            /* renamed from: b */
            public void mo20587b() {
                C2975l.m8391e("TTAdDislikeImpl", "onDislikeDismiss: ");
                try {
                    if (C3778b.this.f9842d != null) {
                        C3778b.this.f9842d.onCancel();
                    }
                } catch (Throwable th) {
                    C2975l.m8388c("TTAdDislikeImpl", "dislike callback cancel error: ", th);
                }
            }

            /* renamed from: c */
            public void mo20588c() {
                C2975l.m8391e("TTAdDislikeImpl", "onDislikeOptionBack: ");
            }
        });
    }

    public void showDislikeDialog() {
        Context context = this.f9839a;
        if (((context instanceof Activity) && !((Activity) context).isFinishing()) && !this.f9841c.isShowing()) {
            this.f9841c.show();
        }
    }

    /* renamed from: a */
    public void mo20583a(C3498n nVar) {
        this.f9841c.mo20589a(nVar);
    }

    public void setDislikeInteractionCallback(TTAdDislike.DislikeInteractionCallback dislikeInteractionCallback) {
        this.f9842d = dislikeInteractionCallback;
    }

    /* renamed from: a */
    public void mo20584a(String str) {
        C3780c cVar = this.f9841c;
        if (cVar != null) {
            cVar.mo20591a(str);
        }
    }
}

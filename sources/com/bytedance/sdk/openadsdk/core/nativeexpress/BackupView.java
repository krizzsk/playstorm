package com.bytedance.sdk.openadsdk.core.nativeexpress;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.utils.C2979o;
import com.bytedance.sdk.openadsdk.TTAdDislike;
import com.bytedance.sdk.openadsdk.TTDislikeDialogAbstract;
import com.bytedance.sdk.openadsdk.activity.TTDelegateActivity;
import com.bytedance.sdk.openadsdk.core.C3578m;
import com.bytedance.sdk.openadsdk.core.p146b.C3426a;
import com.bytedance.sdk.openadsdk.core.p146b.C3427b;
import com.bytedance.sdk.openadsdk.core.p151e.C3481j;
import com.bytedance.sdk.openadsdk.core.p151e.C3498n;
import com.bytedance.sdk.openadsdk.core.video.nativevideo.NativeVideoTsView;
import com.bytedance.sdk.openadsdk.dislike.C3778b;
import com.bytedance.sdk.openadsdk.p130b.C3167j;
import com.bytedance.sdk.openadsdk.utils.C4014u;
import com.bytedance.sdk.openadsdk.utils.C4020v;

public abstract class BackupView extends FrameLayout {

    /* renamed from: a */
    private C3167j f9017a;
    /* access modifiers changed from: protected */

    /* renamed from: b */
    public Context f9018b;
    /* access modifiers changed from: protected */

    /* renamed from: c */
    public C3498n f9019c;

    /* renamed from: d */
    protected C3778b f9020d;

    /* renamed from: e */
    protected TTDislikeDialogAbstract f9021e;
    /* access modifiers changed from: protected */

    /* renamed from: f */
    public String f9022f = "embeded_ad";

    /* renamed from: g */
    protected int f9023g;

    /* renamed from: h */
    protected int f9024h;

    /* renamed from: i */
    protected int f9025i;

    /* renamed from: j */
    protected boolean f9026j = true;

    /* renamed from: k */
    protected boolean f9027k = true;

    /* renamed from: l */
    protected String f9028l;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo19260a(View view, int i, C3481j jVar);

    public Object getTag() {
        return "tt_express_backup_fl_tag_26";
    }

    public BackupView(Context context) {
        super(context);
        setTag("tt_express_backup_fl_tag_26");
    }

    public BackupView(Context context, String str) {
        super(context);
        this.f9028l = str;
        setTag("tt_express_backup_fl_tag_26");
    }

    public void setTag(Object obj) {
        super.setTag("tt_express_backup_fl_tag_26");
    }

    public void setDislikeInner(TTAdDislike tTAdDislike) {
        if (tTAdDislike instanceof C3778b) {
            this.f9020d = (C3778b) tTAdDislike;
        }
    }

    public void setDislikeOuter(TTDislikeDialogAbstract tTDislikeDialogAbstract) {
        C3498n nVar;
        if (!(tTDislikeDialogAbstract == null || (nVar = this.f9019c) == null)) {
            tTDislikeDialogAbstract.setMaterialMeta(nVar);
        }
        this.f9021e = tTDislikeDialogAbstract;
    }

    /* renamed from: a */
    public void mo19419a() {
        TTDislikeDialogAbstract tTDislikeDialogAbstract = this.f9021e;
        if (tTDislikeDialogAbstract != null) {
            tTDislikeDialogAbstract.show();
            return;
        }
        C3778b bVar = this.f9020d;
        if (bVar != null) {
            bVar.showDislikeDialog();
        } else {
            TTDelegateActivity.m8755a(this.f9019c, (String) null);
        }
    }

    /* access modifiers changed from: protected */
    public String getNameOrSource() {
        C3498n nVar = this.f9019c;
        if (nVar == null) {
            return "";
        }
        if (nVar.mo19657aa() != null && !TextUtils.isEmpty(this.f9019c.mo19657aa().mo19495b())) {
            return this.f9019c.mo19657aa().mo19495b();
        }
        if (!TextUtils.isEmpty(this.f9019c.mo19608K())) {
            return this.f9019c.mo19608K();
        }
        return "";
    }

    /* access modifiers changed from: protected */
    public String getTitle() {
        if (this.f9019c.mo19657aa() != null && !TextUtils.isEmpty(this.f9019c.mo19657aa().mo19495b())) {
            return this.f9019c.mo19657aa().mo19495b();
        }
        if (!TextUtils.isEmpty(this.f9019c.mo19608K())) {
            return this.f9019c.mo19608K();
        }
        return !TextUtils.isEmpty(this.f9019c.mo19618U()) ? this.f9019c.mo19618U() : "";
    }

    /* access modifiers changed from: protected */
    public String getDescription() {
        if (!TextUtils.isEmpty(this.f9019c.mo19618U())) {
            return this.f9019c.mo19618U();
        }
        return !TextUtils.isEmpty(this.f9019c.mo19619V()) ? this.f9019c.mo19619V() : "";
    }

    public float getRealWidth() {
        return (float) C4020v.m13311d(this.f9018b, (float) this.f9023g);
    }

    public float getRealHeight() {
        return (float) C4020v.m13311d(this.f9018b, (float) this.f9024h);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo20081a(View view, boolean z) {
        C3427b bVar;
        if (view != null) {
            if (z) {
                Context context = this.f9018b;
                C3498n nVar = this.f9019c;
                String str = this.f9022f;
                bVar = new C3426a(context, nVar, str, C4014u.m13176a(str));
            } else {
                Context context2 = this.f9018b;
                C3498n nVar2 = this.f9019c;
                String str2 = this.f9022f;
                bVar = new C3427b(context2, nVar2, str2, C4014u.m13176a(str2));
            }
            view.setOnTouchListener(bVar);
            view.setOnClickListener(bVar);
            bVar.mo19401a((C3593a) new C3593a() {
                /* renamed from: a */
                public void mo20092a(View view, int i, C3481j jVar) {
                    BackupView.this.mo19260a(view, i, jVar);
                }
            });
        }
    }

    /* access modifiers changed from: protected */
    public View getVideoView() {
        NativeVideoTsView nativeVideoTsView;
        C3498n nVar = this.f9019c;
        if (!(nVar == null || this.f9018b == null)) {
            if (C3498n.m10583c(nVar)) {
                try {
                    nativeVideoTsView = new NativeVideoTsView(this.f9018b, this.f9019c, this.f9022f, true, false, this.f9017a);
                    nativeVideoTsView.setVideoCacheUrl(this.f9028l);
                    nativeVideoTsView.setControllerStatusCallBack(new NativeVideoTsView.C3693b() {
                        /* renamed from: a */
                        public void mo18947a(boolean z, long j, long j2, long j3, boolean z2) {
                        }
                    });
                    nativeVideoTsView.setIsAutoPlay(this.f9026j);
                    nativeVideoTsView.setIsQuiet(this.f9027k);
                } catch (Throwable unused) {
                }
                if (C3498n.m10583c(this.f9019c) || nativeVideoTsView == null || !nativeVideoTsView.mo20296a(0, true, false)) {
                    return null;
                }
                return nativeVideoTsView;
            }
            nativeVideoTsView = null;
            if (C3498n.m10583c(this.f9019c)) {
            }
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo20079a(int i) {
        this.f9027k = C3578m.m11241h().mo19927a(this.f9025i);
        int c = C3578m.m11241h().mo19931c(i);
        if (3 == c) {
            this.f9026j = false;
            return;
        }
        int c2 = C2979o.m8409c(C3578m.m11231a());
        if (1 == c && C4014u.m13222e(c2)) {
            this.f9026j = true;
        } else if (2 == c) {
            if (C4014u.m13227f(c2) || C4014u.m13222e(c2) || C4014u.m13232g(c2)) {
                this.f9026j = true;
            }
        } else if (5 != c) {
        } else {
            if (C4014u.m13222e(c2) || C4014u.m13232g(c2)) {
                this.f9026j = true;
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo20080a(View view) {
        C3498n nVar = this.f9019c;
        if (nVar != null && nVar.mo19607J() != null && view != null) {
            if (this.f9019c.mo19736p() != 1 || !this.f9026j) {
                mo20081a(view, false);
            } else {
                mo20081a(view, true);
            }
        }
    }
}

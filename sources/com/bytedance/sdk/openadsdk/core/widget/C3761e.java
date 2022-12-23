package com.bytedance.sdk.openadsdk.core.widget;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.TextView;
import com.bykv.p068vk.openvk.component.video.api.p085c.C2521b;
import com.bykv.p068vk.openvk.component.video.api.p086d.C2524b;
import com.bytedance.sdk.component.utils.C2984t;
import com.bytedance.sdk.openadsdk.core.C3578m;
import com.bytedance.sdk.openadsdk.core.video.nativevideo.C3694a;
import com.bytedance.sdk.openadsdk.utils.C4020v;

/* renamed from: com.bytedance.sdk.openadsdk.core.widget.e */
/* compiled from: VideoTrafficTipLayout */
public class C3761e {

    /* renamed from: a */
    private View f9790a;

    /* renamed from: b */
    private TextView f9791b;

    /* renamed from: c */
    private Context f9792c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public C3694a f9793d;

    /* renamed from: e */
    private C3764b f9794e;

    /* renamed from: f */
    private boolean f9795f = false;

    /* renamed from: g */
    private C2521b f9796g;

    /* renamed from: h */
    private ViewStub f9797h;

    /* renamed from: i */
    private View f9798i;

    /* renamed from: com.bytedance.sdk.openadsdk.core.widget.e$a */
    /* compiled from: VideoTrafficTipLayout */
    public enum C3763a {
        PAUSE_VIDEO,
        RELEASE_VIDEO,
        START_VIDEO
    }

    /* renamed from: com.bytedance.sdk.openadsdk.core.widget.e$b */
    /* compiled from: VideoTrafficTipLayout */
    public interface C3764b {
        /* renamed from: j */
        boolean mo20378j();

        /* renamed from: l */
        void mo20380l();
    }

    /* renamed from: a */
    public void mo20567a(Context context, View view) {
        if (context != null && (view instanceof ViewGroup)) {
            this.f9798i = view;
            this.f9792c = C3578m.m11231a().getApplicationContext();
            this.f9797h = (ViewStub) LayoutInflater.from(context).inflate(C2984t.m8433f(context, "tt_video_traffic_tip"), (ViewGroup) view, true).findViewById(C2984t.m8432e(context, "tt_video_traffic_tip_layout_viewStub"));
        }
    }

    /* renamed from: a */
    private void m12353a(Context context, View view, boolean z) {
        ViewStub viewStub;
        if (context != null && view != null && (viewStub = this.f9797h) != null && viewStub.getParent() != null && this.f9790a == null) {
            this.f9797h.inflate();
            this.f9790a = view.findViewById(C2984t.m8432e(context, "tt_video_traffic_tip_layout"));
            this.f9791b = (TextView) view.findViewById(C2984t.m8432e(context, "tt_video_traffic_tip_tv"));
            View findViewById = view.findViewById(C2984t.m8432e(context, "tt_video_traffic_continue_play_btn"));
            if (z) {
                findViewById.setClickable(true);
                findViewById.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View view) {
                        C3761e.this.m12359c();
                        if (C3761e.this.f9793d != null) {
                            C3761e.this.f9793d.mo20277a(C3763a.START_VIDEO, (String) null);
                        }
                    }
                });
                return;
            }
            findViewById.setOnClickListener((View.OnClickListener) null);
            findViewById.setClickable(false);
        }
    }

    /* renamed from: a */
    public void mo20568a(C3694a aVar, C3764b bVar) {
        this.f9794e = bVar;
        this.f9793d = aVar;
    }

    /* renamed from: b */
    private void m12358b() {
        this.f9796g = null;
    }

    /* renamed from: a */
    public boolean mo20571a(int i, C2521b bVar, boolean z) {
        Context context = this.f9792c;
        if (context == null || bVar == null) {
            return true;
        }
        m12353a(context, this.f9798i, z);
        this.f9796g = bVar;
        if (i == 1 || i == 2) {
            return m12356a(i);
        }
        return true;
    }

    /* renamed from: a */
    private boolean m12356a(int i) {
        C3764b bVar;
        if (mo20570a() || this.f9795f) {
            return true;
        }
        if (!(this.f9793d == null || (bVar = this.f9794e) == null)) {
            if (bVar.mo20378j()) {
                this.f9793d.mo16421e((C2524b) null, (View) null);
            }
            this.f9793d.mo20277a(C3763a.PAUSE_VIDEO, (String) null);
        }
        m12354a(this.f9796g, true);
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m12359c() {
        if (this.f9792c != null) {
            m12360d();
        }
    }

    /* renamed from: a */
    public void mo20569a(boolean z) {
        if (z) {
            m12358b();
        }
        m12360d();
    }

    /* renamed from: a */
    public boolean mo20570a() {
        View view = this.f9790a;
        return view != null && view.getVisibility() == 0;
    }

    /* renamed from: d */
    private void m12360d() {
        View view = this.f9790a;
        if (view != null) {
            view.setVisibility(8);
        }
    }

    /* renamed from: a */
    private void m12354a(C2521b bVar, boolean z) {
        View view;
        String str;
        View view2;
        if (bVar != null && (view = this.f9790a) != null && this.f9792c != null && view.getVisibility() != 0) {
            C3764b bVar2 = this.f9794e;
            if (bVar2 != null) {
                bVar2.mo20380l();
            }
            double ceil = Math.ceil((((double) bVar.mo16350e()) * 1.0d) / 1048576.0d);
            if (z) {
                str = String.format(C2984t.m8425a(this.f9792c, "tt_video_without_wifi_tips"), new Object[]{Float.valueOf(Double.valueOf(ceil).floatValue())});
            } else {
                str = C2984t.m8425a(this.f9792c, "tt_video_without_wifi_tips") + C2984t.m8425a(this.f9792c, "tt_video_bytesize");
            }
            C4020v.m13282a(this.f9790a, 0);
            C4020v.m13291a(this.f9791b, (CharSequence) str);
            Log.i("VideoTrafficTipLayout", "showTrafficTipCover: ");
            if (C4020v.m13313d(this.f9790a) && (view2 = this.f9790a) != null) {
                view2.bringToFront();
                Log.i("VideoTrafficTipLayout", "showTrafficTipCover: bringToFront");
            }
        }
    }
}

package com.mbridge.msdk.nativex.view.mbfullview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.mbridge.msdk.foundation.tools.C8594o;

public class BaseView extends RelativeLayout {

    /* renamed from: a */
    protected RelativeLayout f21636a;

    /* renamed from: b */
    protected RelativeLayout f21637b;

    /* renamed from: c */
    protected RelativeLayout f21638c;

    /* renamed from: d */
    protected ImageView f21639d;

    /* renamed from: e */
    protected TextView f21640e;

    /* renamed from: f */
    protected ProgressBar f21641f;

    /* renamed from: g */
    protected FrameLayout f21642g;

    /* renamed from: h */
    protected LinearLayout f21643h;

    /* renamed from: i */
    protected RelativeLayout f21644i;
    public C8873a style;

    /* renamed from: com.mbridge.msdk.nativex.view.mbfullview.BaseView$a */
    public enum C8873a {
        FULL_TOP_VIEW,
        FULL_MIDDLE_VIEW
    }

    public FrameLayout getmAnimationContent() {
        return this.f21642g;
    }

    public LinearLayout getmAnimationPlayer() {
        return this.f21643h;
    }

    public BaseView(Context context) {
        super(context);
        View inflate = LayoutInflater.from(getContext()).inflate(C8594o.m24812a(getContext(), "mbridge_nativex_fullbasescreen", "layout"), this);
        this.f21644i = (RelativeLayout) inflate;
        if (inflate != null) {
            this.f21636a = (RelativeLayout) inflate.findViewById(C8594o.m24812a(getContext(), "mbridge_full_rl_playcontainer", "id"));
            this.f21637b = (RelativeLayout) inflate.findViewById(C8594o.m24812a(getContext(), "mbridge_full_player_parent", "id"));
            this.f21638c = (RelativeLayout) inflate.findViewById(C8594o.m24812a(getContext(), "mbridge_full_rl_close", "id"));
            this.f21639d = (ImageView) inflate.findViewById(C8594o.m24812a(getContext(), "mbridge_full_iv_close", "id"));
            this.f21640e = (TextView) inflate.findViewById(C8594o.m24812a(getContext(), "mbridge_full_tv_install", "id"));
            this.f21641f = (ProgressBar) inflate.findViewById(C8594o.m24812a(getContext(), "mbridge_full_pb_loading", "id"));
            this.f21642g = (FrameLayout) inflate.findViewById(C8594o.m24812a(getContext(), "mbridge_full_animation_content", "id"));
            this.f21643h = (LinearLayout) inflate.findViewById(C8594o.m24812a(getContext(), "mbridge_full_animation_player", "id"));
            inflate.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        }
    }

    public RelativeLayout getMBridgeFullPlayContainer() {
        return this.f21636a;
    }

    public RelativeLayout getMBridgeFullPlayerParent() {
        return this.f21637b;
    }

    public RelativeLayout getMBridgeFullClose() {
        return this.f21638c;
    }

    public ImageView getMBridgeFullIvClose() {
        return this.f21639d;
    }

    public TextView getMBridgeFullTvInstall() {
        return this.f21640e;
    }

    public ProgressBar getMBridgeFullPb() {
        return this.f21641f;
    }

    public C8873a getStytle() {
        return this.style;
    }

    public void setStytle(C8873a aVar) {
        this.style = aVar;
    }
}

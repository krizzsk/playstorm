package com.mbridge.msdk.nativex.view.mbfullview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.mbridge.msdk.foundation.tools.C8594o;

public class MBridgeTopFullView extends BaseView {
    public static final String INTERFACE_RESULT = (MBridgeTopFullView.class.getName() + "WithResault");

    /* renamed from: j */
    protected ImageView f21648j;

    /* renamed from: k */
    protected TextView f21649k;

    /* renamed from: l */
    protected TextView f21650l;

    /* renamed from: m */
    protected StarLevelLayoutView f21651m;

    public ImageView getMBridgeFullViewDisplayIcon() {
        return this.f21648j;
    }

    public TextView getMBridgeFullViewDisplayTitle() {
        return this.f21649k;
    }

    public TextView getMBridgeFullViewDisplayDscription() {
        return this.f21650l;
    }

    public StarLevelLayoutView getStarLevelLayoutView() {
        return this.f21651m;
    }

    public MBridgeTopFullView(Context context) {
        super(context);
        View inflate = LayoutInflater.from(getContext()).inflate(C8594o.m24812a(getContext(), "mbridge_nativex_fullscreen_top", "layout"), this.f21644i);
        if (inflate != null) {
            this.f21648j = (ImageView) inflate.findViewById(C8594o.m24812a(getContext(), "mbridge_full_tv_display_icon", "id"));
            this.f21649k = (TextView) inflate.findViewById(C8594o.m24812a(getContext(), "mbridge_full_tv_display_title", "id"));
            this.f21650l = (TextView) inflate.findViewById(C8594o.m24812a(getContext(), "mbridge_full_tv_display_description", "id"));
            this.f21651m = (StarLevelLayoutView) inflate.findViewById(C8594o.m24812a(getContext(), "mbridge_full_tv_feeds_star", "id"));
            this.f21650l.setTextColor(-7829368);
            inflate.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
            updateLayoutParams();
        }
    }

    public void updateLayoutParams() {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(10);
        this.f21636a.setLayoutParams(layoutParams);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams2.addRule(10);
        this.f21637b.setLayoutParams(layoutParams2);
    }
}

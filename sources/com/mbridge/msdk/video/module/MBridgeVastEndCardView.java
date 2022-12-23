package com.mbridge.msdk.video.module;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.mbridge.msdk.video.signal.factory.C9529b;
import com.mbridge.msdk.widget.C9587a;

public class MBridgeVastEndCardView extends MBridgeBaseView {

    /* renamed from: m */
    private ViewGroup f22857m;

    /* renamed from: n */
    private View f22858n;

    /* renamed from: o */
    private View f22859o;

    public void preLoadData(C9529b bVar) {
    }

    public MBridgeVastEndCardView(Context context) {
        super(context);
    }

    public MBridgeVastEndCardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void init(Context context) {
        int findLayout = findLayout("mbridge_reward_endcard_vast");
        if (findLayout >= 0) {
            this.f22695c.inflate(findLayout, this);
            this.f22857m = (ViewGroup) findViewById(findID("mbridge_rl_content"));
            this.f22858n = findViewById(findID("mbridge_iv_vastclose"));
            View findViewById = findViewById(findID("mbridge_iv_vastok"));
            this.f22859o = findViewById;
            this.f22698f = isNotNULL(this.f22857m, this.f22858n, findViewById);
            mo62563c();
            if (this.f22698f) {
                setMatchParent();
                setBackgroundResource(findColor("mbridge_reward_endcard_vast_bg"));
                setClickable(true);
                ((RelativeLayout.LayoutParams) this.f22857m.getLayoutParams()).addRule(13, -1);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo62563c() {
        super.mo62563c();
        if (this.f22698f) {
            this.f22858n.setOnClickListener(new View.OnClickListener() {
                public final void onClick(View view) {
                    MBridgeVastEndCardView.this.f22697e.mo62252a(104, "");
                }
            });
            this.f22859o.setOnClickListener(new C9587a() {
                /* access modifiers changed from: protected */
                /* renamed from: a */
                public final void mo58122a(View view) {
                    MBridgeVastEndCardView.this.f22697e.mo62252a(108, MBridgeVastEndCardView.this.mo62564d());
                }
            });
        }
    }

    public void notifyShowListener() {
        this.f22697e.mo62252a(111, "");
    }
}

package com.mbridge.msdk.video.module;

import android.content.Context;
import android.content.res.Configuration;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.mbridge.msdk.foundation.controller.C2350a;
import com.mbridge.msdk.foundation.same.C8413a;
import com.mbridge.msdk.foundation.same.p301c.C8425b;
import com.mbridge.msdk.foundation.same.p301c.C8428c;
import com.mbridge.msdk.foundation.tools.C8608u;
import com.mbridge.msdk.foundation.tools.C8613y;
import com.mbridge.msdk.video.module.p365a.p366a.C9395j;
import com.mbridge.msdk.video.signal.factory.C9529b;
import org.json.JSONException;
import org.json.JSONObject;

public class MBridgeVideoEndCoverView extends MBridgeBaseView {

    /* renamed from: m */
    private final String f22862m = "MBridgeVideoEndCoverView";

    /* renamed from: n */
    private View f22863n;

    /* renamed from: o */
    private ImageView f22864o;

    /* renamed from: p */
    private ImageView f22865p;

    /* renamed from: q */
    private TextView f22866q;

    /* renamed from: r */
    private TextView f22867r;

    /* renamed from: s */
    private TextView f22868s;

    /* renamed from: t */
    private C9529b f22869t;

    public MBridgeVideoEndCoverView(Context context) {
        super(context);
    }

    public MBridgeVideoEndCoverView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void init(Context context) {
        int findLayout = findLayout("mbridge_reward_videoend_cover");
        if (findLayout >= 0) {
            View inflate = this.f22695c.inflate(findLayout, (ViewGroup) null);
            this.f22863n = inflate;
            if (inflate != null) {
                this.f22698f = m26843a(inflate);
                addView(this.f22863n, -1, -1);
                mo62563c();
            }
        }
    }

    public void preLoadData(C9529b bVar) {
        this.f22869t = bVar;
        try {
            if (this.f22694b != null && this.f22698f && this.f22694b != null) {
                if (!TextUtils.isEmpty(this.f22694b.getIconUrl()) && this.f22864o != null) {
                    C8425b.m24339a(this.f22693a.getApplicationContext()).mo57506a(this.f22694b.getIconUrl(), (C8428c) new C9395j(this.f22864o, C8613y.m24929b(C2350a.m5601e().mo15792g(), 8.0f)));
                }
                if (this.f22866q != null) {
                    this.f22866q.setText(this.f22694b.getAppName());
                }
                if (this.f22868s != null) {
                    this.f22868s.setText(this.f22694b.getAdCall());
                }
                if (this.f22867r != null) {
                    this.f22867r.setText(this.f22694b.getAppDesc());
                }
            }
        } catch (Throwable th) {
            C8608u.m24880a("MBridgeVideoEndCoverView", th.getMessage());
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.f22699g = motionEvent.getRawX();
        this.f22700h = motionEvent.getRawY();
        return super.onInterceptTouchEvent(motionEvent);
    }

    public void onSelfConfigurationChanged(Configuration configuration) {
        super.onSelfConfigurationChanged(configuration);
        this.f22696d = configuration.orientation;
        removeView(this.f22863n);
        View view = this.f22863n;
        if (view == null) {
            init(this.f22693a);
            preLoadData(this.f22869t);
            return;
        }
        if (view.getParent() != null) {
            ((ViewGroup) this.f22863n.getParent()).removeView(this.f22863n);
        }
        addView(this.f22863n);
        m26843a(this.f22863n);
        mo62563c();
    }

    /* renamed from: a */
    private boolean m26843a(View view) {
        if (view == null) {
            return true;
        }
        try {
            this.f22864o = (ImageView) view.findViewById(findID("mbridge_vec_iv_icon"));
            this.f22865p = (ImageView) view.findViewById(findID("mbridge_vec_iv_close"));
            this.f22866q = (TextView) view.findViewById(findID("mbridge_vec_tv_title"));
            this.f22867r = (TextView) view.findViewById(findID("mbridge_vec_tv_desc"));
            this.f22868s = (TextView) view.findViewById(findID("mbridge_vec_btn"));
            return true;
        } catch (Throwable th) {
            C8608u.m24884d("MBridgeVideoEndCoverView", th.getMessage());
            return false;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo62563c() {
        super.mo62563c();
        this.f22865p.setOnClickListener(new View.OnClickListener() {
            public final void onClick(View view) {
                MBridgeVideoEndCoverView.this.f22697e.mo62252a(104, "");
            }
        });
        this.f22864o.setOnClickListener(new View.OnClickListener() {
            public final void onClick(View view) {
                MBridgeVideoEndCoverView.this.mo62709a();
            }
        });
        this.f22868s.setOnClickListener(new View.OnClickListener() {
            public final void onClick(View view) {
                MBridgeVideoEndCoverView.this.mo62709a();
            }
        });
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo62709a() {
        JSONObject jSONObject;
        JSONException e;
        JSONObject jSONObject2;
        JSONException e2;
        try {
            JSONObject jSONObject3 = new JSONObject();
            try {
                jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put(C8413a.f20323e, C8613y.m24912a(C2350a.m5601e().mo15792g(), this.f22699g));
                    jSONObject2.put(C8413a.f20324f, C8613y.m24912a(C2350a.m5601e().mo15792g(), this.f22700h));
                    jSONObject2.put(C8413a.f20326h, 0);
                    try {
                        this.f22696d = getContext().getResources().getConfiguration().orientation;
                    } catch (Exception e3) {
                        e3.printStackTrace();
                    }
                    jSONObject2.put(C8413a.f20327i, this.f22696d);
                    jSONObject2.put(C8413a.f20328j, (double) C8613y.m24941d(getContext()));
                } catch (JSONException e4) {
                    e2 = e4;
                    C8608u.m24884d("MBridgeVideoEndCoverView", e2.getMessage());
                    jSONObject = new JSONObject();
                    jSONObject.put(C8413a.f20325g, jSONObject2);
                    this.f22697e.mo62252a(105, jSONObject);
                }
            } catch (JSONException e5) {
                JSONException jSONException = e5;
                jSONObject2 = jSONObject3;
                e2 = jSONException;
                C8608u.m24884d("MBridgeVideoEndCoverView", e2.getMessage());
                jSONObject = new JSONObject();
                jSONObject.put(C8413a.f20325g, jSONObject2);
                this.f22697e.mo62252a(105, jSONObject);
            }
            jSONObject = new JSONObject();
            try {
                jSONObject.put(C8413a.f20325g, jSONObject2);
            } catch (JSONException e6) {
                e = e6;
            }
        } catch (JSONException e7) {
            JSONException jSONException2 = e7;
            jSONObject = null;
            e = jSONException2;
            e.printStackTrace();
            this.f22697e.mo62252a(105, jSONObject);
        }
        this.f22697e.mo62252a(105, jSONObject);
    }
}

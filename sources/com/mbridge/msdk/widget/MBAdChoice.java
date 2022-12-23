package com.mbridge.msdk.widget;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.mbridge.msdk.foundation.tools.C8611x;
import com.mbridge.msdk.out.NativeListener;

public class MBAdChoice extends MBImageView {

    /* renamed from: a */
    private static String f23575a = "MBAdChoice";

    /* renamed from: b */
    private String f23576b = "";

    /* renamed from: c */
    private String f23577c = "";

    /* renamed from: d */
    private String f23578d = "";

    /* renamed from: e */
    private Context f23579e;

    public MBAdChoice(Context context) {
        super(context);
        this.f23579e = context;
        m27537a();
    }

    public MBAdChoice(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f23579e = context;
        m27537a();
    }

    public MBAdChoice(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f23579e = context;
        m27537a();
    }

    /* renamed from: a */
    private void m27537a() {
        setScaleType(ImageView.ScaleType.FIT_CENTER);
        setClickable(true);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0075, code lost:
        if (android.text.TextUtils.isEmpty(r4.mo15465ad()) == false) goto L_0x0079;
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setCampaign(com.mbridge.msdk.out.Campaign r4) {
        /*
            r3 = this;
            boolean r0 = r4 instanceof com.mbridge.msdk.foundation.entity.CampaignEx
            if (r0 == 0) goto L_0x0093
            com.mbridge.msdk.foundation.entity.CampaignEx r4 = (com.mbridge.msdk.foundation.entity.CampaignEx) r4
            r0 = 1
            r1 = 0
            if (r4 == 0) goto L_0x0040
            com.mbridge.msdk.foundation.entity.CampaignEx$a r2 = r4.getAdchoice()
            if (r2 == 0) goto L_0x0040
            com.mbridge.msdk.foundation.entity.CampaignEx$a r2 = r4.getAdchoice()
            java.lang.String r2 = r2.mo57199e()
            r3.f23576b = r2
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L_0x0040
            com.mbridge.msdk.foundation.entity.CampaignEx$a r2 = r4.getAdchoice()
            java.lang.String r2 = r2.mo57198d()
            r3.f23578d = r2
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L_0x0040
            com.mbridge.msdk.foundation.entity.CampaignEx$a r4 = r4.getAdchoice()
            java.lang.String r4 = r4.mo57200f()
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 != 0) goto L_0x0040
            r4 = r0
            goto L_0x0041
        L_0x0040:
            r4 = r1
        L_0x0041:
            if (r4 != 0) goto L_0x007a
            com.mbridge.msdk.c.b r4 = com.mbridge.msdk.p054c.C2283b.m5275a()
            com.mbridge.msdk.foundation.controller.a r2 = com.mbridge.msdk.foundation.controller.C2350a.m5601e()
            java.lang.String r2 = r2.mo15793h()
            com.mbridge.msdk.c.a r4 = r4.mo15563b(r2)
            if (r4 == 0) goto L_0x0078
            java.lang.String r2 = r4.mo15464ac()
            r3.f23576b = r2
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L_0x0078
            java.lang.String r2 = r4.mo15466ae()
            r3.f23578d = r2
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L_0x0078
            java.lang.String r4 = r4.mo15465ad()
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 != 0) goto L_0x0078
            goto L_0x0079
        L_0x0078:
            r0 = r1
        L_0x0079:
            r4 = r0
        L_0x007a:
            java.lang.String r0 = r3.f23576b
            r3.setImageUrl(r0)
            if (r4 == 0) goto L_0x0093
            android.content.Context r4 = r3.f23579e
            if (r4 == 0) goto L_0x0093
            com.mbridge.msdk.foundation.same.c.b r4 = com.mbridge.msdk.foundation.same.p301c.C8425b.m24339a((android.content.Context) r4)
            java.lang.String r0 = r3.f23576b
            com.mbridge.msdk.widget.MBAdChoice$1 r1 = new com.mbridge.msdk.widget.MBAdChoice$1
            r1.<init>()
            r4.mo57506a((java.lang.String) r0, (com.mbridge.msdk.foundation.same.p301c.C8428c) r1)
        L_0x0093:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.widget.MBAdChoice.setCampaign(com.mbridge.msdk.out.Campaign):void");
    }

    public boolean performClick() {
        if (TextUtils.isEmpty(this.f23578d)) {
            return true;
        }
        C8611x.m24903b(this.f23579e, this.f23578d, (NativeListener.NativeTrackingListener) null);
        return true;
    }
}

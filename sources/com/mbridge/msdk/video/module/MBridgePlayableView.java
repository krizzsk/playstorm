package com.mbridge.msdk.video.module;

import android.content.Context;
import android.util.AttributeSet;
import com.mbridge.msdk.video.signal.factory.C9529b;

public class MBridgePlayableView extends MBridgeH5EndCardView {
    public MBridgePlayableView(Context context) {
        super(context);
    }

    public MBridgePlayableView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void init(Context context) {
        super.init(context);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo62558a() {
        return super.mo62558a();
    }

    public void preLoadData(C9529b bVar) {
        super.preLoadData(bVar);
        super.setLoadPlayable(true);
    }

    public void onBackPress() {
        super.onBackPress();
    }
}

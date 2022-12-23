package com.inmobi.media;

import android.content.Context;
import android.widget.FrameLayout;

/* renamed from: com.inmobi.media.ff */
/* compiled from: NativeScrollableContainer */
public abstract class C6082ff extends FrameLayout {

    /* renamed from: a */
    private final byte f15474a;

    /* renamed from: com.inmobi.media.ff$a */
    /* compiled from: NativeScrollableContainer */
    interface C6083a {
        /* renamed from: a */
        int mo35219a(int i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract void mo35237a(C5903bv bvVar, C6084fg fgVar, int i, int i2, C6083a aVar);

    public C6082ff(Context context, byte b) {
        super(context);
        this.f15474a = b;
    }

    public final byte getType() {
        return this.f15474a;
    }
}

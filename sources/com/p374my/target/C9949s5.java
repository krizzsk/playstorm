package com.p374my.target;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.Window;
import android.widget.FrameLayout;

/* renamed from: com.my.target.s5 */
public class C9949s5 extends Dialog {

    /* renamed from: a */
    public final C9950a f24633a;

    /* renamed from: com.my.target.s5$a */
    public interface C9950a {
        /* renamed from: a */
        void mo64139a(C9949s5 s5Var, FrameLayout frameLayout);

        /* renamed from: b */
        void mo64141b(boolean z);

        /* renamed from: q */
        void mo64143q();
    }

    public C9949s5(C9950a aVar, Context context) {
        super(context);
        this.f24633a = aVar;
    }

    /* renamed from: a */
    public static C9949s5 m29241a(C9950a aVar, Context context) {
        return new C9949s5(aVar, context);
    }

    public void dismiss() {
        super.dismiss();
        this.f24633a.mo64143q();
    }

    public void onCreate(Bundle bundle) {
        requestWindowFeature(1);
        FrameLayout frameLayout = new FrameLayout(getContext());
        setContentView(frameLayout);
        Window window = getWindow();
        if (window != null) {
            window.setBackgroundDrawable(new ColorDrawable(0));
            window.setLayout(-1, -1);
        }
        this.f24633a.mo64139a(this, frameLayout);
        super.onCreate(bundle);
    }

    public void onWindowFocusChanged(boolean z) {
        this.f24633a.mo64141b(z);
        super.onWindowFocusChanged(z);
    }
}

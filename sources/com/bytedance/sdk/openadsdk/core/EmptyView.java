package com.bytedance.sdk.openadsdk.core;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.sdk.component.utils.C2970j;
import com.bytedance.sdk.component.utils.C2989x;
import com.bytedance.sdk.openadsdk.core.p146b.C3429c;
import com.bytedance.sdk.openadsdk.utils.C4014u;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

public class EmptyView extends View implements C2989x.C2990a {

    /* renamed from: a */
    private boolean f8200a;

    /* renamed from: b */
    private boolean f8201b;

    /* renamed from: c */
    private C3399a f8202c;

    /* renamed from: d */
    private View f8203d;

    /* renamed from: e */
    private List<View> f8204e;

    /* renamed from: f */
    private List<View> f8205f;

    /* renamed from: g */
    private boolean f8206g;

    /* renamed from: h */
    private int f8207h;

    /* renamed from: i */
    private final Handler f8208i = new C2989x(Looper.getMainLooper(), this);

    /* renamed from: j */
    private final AtomicBoolean f8209j = new AtomicBoolean(true);

    /* renamed from: com.bytedance.sdk.openadsdk.core.EmptyView$a */
    public interface C3399a {
        /* renamed from: a */
        void mo19362a();

        /* renamed from: a */
        void mo19363a(View view);

        /* renamed from: a */
        void mo19364a(boolean z);

        /* renamed from: b */
        void mo19365b();
    }

    public EmptyView(Context context, View view) {
        super(C3578m.m11231a());
        this.f8203d = view;
        setLayoutParams(new ViewGroup.LayoutParams(0, 0));
    }

    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        C3399a aVar = this.f8202c;
        if (aVar != null) {
            aVar.mo19364a(z);
        }
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m10185d();
        this.f8206g = false;
        m10183b();
    }

    public void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
        m10183b();
    }

    /* renamed from: b */
    private void m10183b() {
        C3399a aVar;
        if (this.f8209j.getAndSet(false) && (aVar = this.f8202c) != null) {
            aVar.mo19362a();
        }
    }

    /* renamed from: c */
    private void m10184c() {
        C3399a aVar;
        if (!this.f8209j.getAndSet(true) && (aVar = this.f8202c) != null) {
            aVar.mo19365b();
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m10186e();
        this.f8206g = true;
        m10184c();
    }

    public void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
        m10184c();
    }

    public void setRefClickViews(List<View> list) {
        this.f8204e = list;
    }

    public void setRefCreativeViews(List<View> list) {
        this.f8205f = list;
    }

    /* renamed from: a */
    public void mo19350a() {
        mo19351a(this.f8204e, (C3429c) null);
        mo19351a(this.f8205f, (C3429c) null);
    }

    /* renamed from: a */
    public void mo19351a(List<View> list, C3429c cVar) {
        if (C2970j.m8371b(list)) {
            for (View next : list) {
                next.setOnClickListener(cVar);
                next.setOnTouchListener(cVar);
            }
        }
    }

    /* renamed from: d */
    private void m10185d() {
        if (this.f8201b && !this.f8200a) {
            this.f8200a = true;
            this.f8208i.sendEmptyMessage(1);
        }
    }

    /* renamed from: e */
    private void m10186e() {
        if (this.f8200a) {
            this.f8208i.removeCallbacksAndMessages((Object) null);
            this.f8200a = false;
        }
    }

    public void setNeedCheckingShow(boolean z) {
        this.f8201b = z;
        if (!z && this.f8200a) {
            m10186e();
        } else if (z && !this.f8200a) {
            m10185d();
        }
    }

    public void setCallback(C3399a aVar) {
        this.f8202c = aVar;
    }

    public void setAdType(int i) {
        this.f8207h = i;
    }

    /* renamed from: a */
    public void mo17318a(Message message) {
        int i = message.what;
        if (i != 1) {
            if (i == 2) {
                boolean c = C4014u.m13209c(C3578m.m11231a(), C3578m.m11231a().getPackageName());
                if (C3765x.m12370a(this.f8203d, 20, this.f8207h) || !c) {
                    this.f8208i.sendEmptyMessageDelayed(2, 1000);
                } else if (!this.f8206g) {
                    setNeedCheckingShow(true);
                }
            }
        } else if (!this.f8200a) {
        } else {
            if (C3765x.m12370a(this.f8203d, 20, this.f8207h)) {
                m10186e();
                this.f8208i.sendEmptyMessageDelayed(2, 1000);
                C3399a aVar = this.f8202c;
                if (aVar != null) {
                    aVar.mo19363a(this.f8203d);
                    return;
                }
                return;
            }
            this.f8208i.sendEmptyMessageDelayed(1, 1000);
        }
    }
}

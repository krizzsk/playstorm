package com.bytedance.sdk.component.p110d.p113c;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.widget.ImageView;
import com.bytedance.sdk.component.p110d.C2829b;
import com.bytedance.sdk.component.p110d.C2895g;
import com.bytedance.sdk.component.p110d.C2896h;
import com.bytedance.sdk.component.p110d.C2897i;
import com.bytedance.sdk.component.p110d.C2898j;
import com.bytedance.sdk.component.p110d.C2902n;
import com.bytedance.sdk.component.p110d.C2906r;
import com.bytedance.sdk.component.p110d.C2907s;
import com.bytedance.sdk.component.p110d.C2908t;
import com.bytedance.sdk.component.p110d.p113c.p114a.C2837a;
import com.bytedance.sdk.component.p110d.p119d.C2881c;
import com.bytedance.sdk.component.p110d.p119d.C2886h;
import com.bytedance.sdk.component.p110d.p119d.C2887i;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.Queue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;

/* renamed from: com.bytedance.sdk.component.d.c.c */
/* compiled from: ImageRequest */
public class C2860c implements C2896h {

    /* renamed from: a */
    Future<?> f6459a;

    /* renamed from: b */
    private String f6460b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public String f6461c;

    /* renamed from: d */
    private String f6462d;

    /* renamed from: e */
    private C2902n f6463e;

    /* renamed from: f */
    private ImageView.ScaleType f6464f;

    /* renamed from: g */
    private Bitmap.Config f6465g;

    /* renamed from: h */
    private int f6466h;

    /* renamed from: i */
    private int f6467i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public C2908t f6468j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public WeakReference<ImageView> f6469k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public volatile boolean f6470l;

    /* renamed from: m */
    private boolean f6471m;

    /* renamed from: n */
    private boolean f6472n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public C2906r f6473o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public C2907s f6474p;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public Queue<C2887i> f6475q;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public final Handler f6476r;

    /* renamed from: s */
    private boolean f6477s;

    /* renamed from: t */
    private C2895g f6478t;

    /* renamed from: u */
    private int f6479u;

    /* renamed from: v */
    private C2874f f6480v;

    /* renamed from: w */
    private C2836a f6481w;

    /* renamed from: x */
    private C2829b f6482x;

    private C2860c(C2866b bVar) {
        C2907s sVar;
        this.f6475q = new LinkedBlockingQueue();
        this.f6476r = new Handler(Looper.getMainLooper());
        this.f6477s = true;
        this.f6460b = bVar.f6498d;
        this.f6463e = new C2862a(bVar.f6495a);
        this.f6469k = new WeakReference<>(bVar.f6496b);
        this.f6464f = bVar.f6499e;
        this.f6465g = bVar.f6500f;
        this.f6466h = bVar.f6501g;
        this.f6467i = bVar.f6502h;
        this.f6468j = bVar.f6503i == null ? C2908t.AUTO : bVar.f6503i;
        if (bVar.f6504j == null) {
            sVar = C2907s.MAIN;
        } else {
            sVar = bVar.f6504j;
        }
        this.f6474p = sVar;
        this.f6473o = bVar.f6505k;
        this.f6482x = m7927a(bVar);
        if (!TextUtils.isEmpty(bVar.f6497c)) {
            mo17689b(bVar.f6497c);
            mo17685a(bVar.f6497c);
        }
        this.f6471m = bVar.f6506l;
        this.f6472n = bVar.f6507m;
        this.f6480v = bVar.f6510p;
        this.f6475q.add(new C2881c());
    }

    /* renamed from: a */
    private C2829b m7927a(C2866b bVar) {
        if (bVar.f6509o != null) {
            return bVar.f6509o;
        }
        if (!TextUtils.isEmpty(bVar.f6508n)) {
            return C2837a.m7815a(new File(bVar.f6508n));
        }
        return C2837a.m7817f();
    }

    /* renamed from: a */
    public String mo17681a() {
        return this.f6460b;
    }

    /* renamed from: f */
    public C2902n mo17693f() {
        return this.f6463e;
    }

    /* renamed from: g */
    public String mo17694g() {
        return this.f6462d;
    }

    /* renamed from: a */
    public void mo17685a(String str) {
        this.f6462d = str;
    }

    /* renamed from: e */
    public String mo17692e() {
        return this.f6461c;
    }

    /* renamed from: b */
    public void mo17689b(String str) {
        WeakReference<ImageView> weakReference = this.f6469k;
        if (!(weakReference == null || weakReference.get() == null)) {
            ((ImageView) this.f6469k.get()).setTag(1094453505, str);
        }
        this.f6461c = str;
    }

    /* renamed from: d */
    public ImageView.ScaleType mo17691d() {
        return this.f6464f;
    }

    /* renamed from: h */
    public Bitmap.Config mo17695h() {
        return this.f6465g;
    }

    /* renamed from: b */
    public int mo17688b() {
        return this.f6466h;
    }

    /* renamed from: c */
    public int mo17690c() {
        return this.f6467i;
    }

    /* renamed from: i */
    public C2908t mo17696i() {
        return this.f6468j;
    }

    /* renamed from: j */
    public boolean mo17697j() {
        return this.f6471m;
    }

    /* renamed from: k */
    public boolean mo17698k() {
        return this.f6472n;
    }

    /* renamed from: a */
    public void mo17686a(boolean z) {
        this.f6477s = z;
    }

    /* renamed from: l */
    public boolean mo17699l() {
        return this.f6477s;
    }

    /* renamed from: m */
    public C2895g mo17700m() {
        return this.f6478t;
    }

    /* renamed from: a */
    public void mo17684a(C2895g gVar) {
        this.f6478t = gVar;
    }

    /* renamed from: n */
    public int mo17701n() {
        return this.f6479u;
    }

    /* renamed from: a */
    public void mo17682a(int i) {
        this.f6479u = i;
    }

    /* renamed from: o */
    public C2836a mo17702o() {
        return this.f6481w;
    }

    /* renamed from: a */
    public void mo17683a(C2836a aVar) {
        this.f6481w = aVar;
    }

    /* renamed from: p */
    public C2874f mo17703p() {
        return this.f6480v;
    }

    /* renamed from: q */
    public C2829b mo17704q() {
        return this.f6482x;
    }

    /* renamed from: a */
    public boolean mo17687a(C2887i iVar) {
        if (this.f6470l) {
            return false;
        }
        return this.f6475q.add(iVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: s */
    public C2896h m7939s() {
        try {
            if (this.f6480v == null) {
                if (this.f6463e != null) {
                    this.f6463e.mo17256a(1005, "not init !", (Throwable) null);
                }
                return this;
            }
            ExecutorService e = this.f6480v.mo17751e();
            if (e != null) {
                this.f6459a = e.submit(new Runnable() {
                    public void run() {
                        while (true) {
                            try {
                                if (C2860c.this.f6470l) {
                                    break;
                                }
                                C2887i iVar = (C2887i) C2860c.this.f6475q.poll();
                                if (iVar == null) {
                                    break;
                                }
                                if (C2860c.this.f6473o != null) {
                                    C2860c.this.f6473o.mo17758a(iVar.mo17755a(), C2860c.this);
                                }
                                iVar.mo17756a(C2860c.this);
                                if (C2860c.this.f6473o != null) {
                                    C2860c.this.f6473o.mo17759b(iVar.mo17755a(), C2860c.this);
                                }
                            } catch (Throwable th) {
                                C2860c.this.m7928a(2000, th.getMessage(), th);
                                if (C2860c.this.f6473o != null) {
                                    C2860c.this.f6473o.mo17759b("exception", C2860c.this);
                                    return;
                                }
                                return;
                            }
                        }
                        if (C2860c.this.f6470l) {
                            C2860c.this.m7928a(1003, "canceled", (Throwable) null);
                        }
                    }
                });
            }
            return this;
        } catch (Exception e2) {
            Log.e("ImageRequest", e2.getMessage());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m7928a(int i, String str, Throwable th) {
        new C2886h(i, str, th).mo17756a(this);
        this.f6475q.clear();
    }

    /* renamed from: r */
    public String mo17705r() {
        return mo17692e() + mo17696i();
    }

    /* renamed from: com.bytedance.sdk.component.d.c.c$b */
    /* compiled from: ImageRequest */
    public static class C2866b implements C2897i {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public C2902n f6495a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public ImageView f6496b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public String f6497c;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public String f6498d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public ImageView.ScaleType f6499e;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public Bitmap.Config f6500f;
        /* access modifiers changed from: private */

        /* renamed from: g */
        public int f6501g;
        /* access modifiers changed from: private */

        /* renamed from: h */
        public int f6502h;
        /* access modifiers changed from: private */

        /* renamed from: i */
        public C2908t f6503i;
        /* access modifiers changed from: private */

        /* renamed from: j */
        public C2907s f6504j;
        /* access modifiers changed from: private */

        /* renamed from: k */
        public C2906r f6505k;
        /* access modifiers changed from: private */

        /* renamed from: l */
        public boolean f6506l;
        /* access modifiers changed from: private */

        /* renamed from: m */
        public boolean f6507m;
        /* access modifiers changed from: private */

        /* renamed from: n */
        public String f6508n;
        /* access modifiers changed from: private */

        /* renamed from: o */
        public C2829b f6509o;
        /* access modifiers changed from: private */

        /* renamed from: p */
        public C2874f f6510p;

        public C2866b(C2874f fVar) {
            this.f6510p = fVar;
        }

        /* renamed from: c */
        public C2897i mo17721c(String str) {
            this.f6498d = str;
            return this;
        }

        /* renamed from: a */
        public C2897i mo17717a(String str) {
            this.f6497c = str;
            return this;
        }

        /* renamed from: a */
        public C2897i mo17714a(ImageView.ScaleType scaleType) {
            this.f6499e = scaleType;
            return this;
        }

        /* renamed from: a */
        public C2897i mo17713a(Bitmap.Config config) {
            this.f6500f = config;
            return this;
        }

        /* renamed from: a */
        public C2897i mo17712a(int i) {
            this.f6501g = i;
            return this;
        }

        /* renamed from: b */
        public C2897i mo17719b(int i) {
            this.f6502h = i;
            return this;
        }

        /* renamed from: a */
        public C2897i mo17716a(C2908t tVar) {
            this.f6503i = tVar;
            return this;
        }

        /* renamed from: a */
        public C2897i mo17715a(C2906r rVar) {
            this.f6505k = rVar;
            return this;
        }

        /* renamed from: a */
        public C2897i mo17718a(boolean z) {
            this.f6507m = z;
            return this;
        }

        /* renamed from: b */
        public C2897i mo17720b(String str) {
            this.f6508n = str;
            return this;
        }

        /* renamed from: a */
        public C2896h mo17711a(C2902n nVar) {
            this.f6495a = nVar;
            return new C2860c(this).m7939s();
        }

        /* renamed from: a */
        public C2896h mo17710a(ImageView imageView) {
            this.f6496b = imageView;
            return new C2860c(this).m7939s();
        }
    }

    /* renamed from: com.bytedance.sdk.component.d.c.c$a */
    /* compiled from: ImageRequest */
    private class C2862a implements C2902n {
        /* access modifiers changed from: private */

        /* renamed from: b */
        public C2902n f6485b;

        public C2862a(C2902n nVar) {
            this.f6485b = nVar;
        }

        /* renamed from: a */
        public void mo17257a(final C2898j jVar) {
            final ImageView imageView = (ImageView) C2860c.this.f6469k.get();
            if (imageView != null && C2860c.this.f6468j != C2908t.RAW && m7966a(imageView) && (jVar.mo17725b() instanceof Bitmap)) {
                final Bitmap bitmap = (Bitmap) jVar.mo17725b();
                C2860c.this.f6476r.post(new Runnable() {
                    public void run() {
                        imageView.setImageBitmap(bitmap);
                    }
                });
            }
            if (C2860c.this.f6474p == C2907s.MAIN) {
                C2860c.this.f6476r.post(new Runnable() {
                    public void run() {
                        if (C2862a.this.f6485b != null) {
                            C2862a.this.f6485b.mo17257a(jVar);
                        }
                    }
                });
                return;
            }
            C2902n nVar = this.f6485b;
            if (nVar != null) {
                nVar.mo17257a(jVar);
            }
        }

        /* renamed from: a */
        private boolean m7966a(ImageView imageView) {
            Object tag;
            if (imageView == null || (tag = imageView.getTag(1094453505)) == null || !tag.equals(C2860c.this.f6461c)) {
                return false;
            }
            return true;
        }

        /* renamed from: a */
        public void mo17256a(final int i, final String str, final Throwable th) {
            if (C2860c.this.f6474p == C2907s.MAIN) {
                C2860c.this.f6476r.post(new Runnable() {
                    public void run() {
                        if (C2862a.this.f6485b != null) {
                            C2862a.this.f6485b.mo17256a(i, str, th);
                        }
                    }
                });
                return;
            }
            C2902n nVar = this.f6485b;
            if (nVar != null) {
                nVar.mo17256a(i, str, th);
            }
        }
    }
}

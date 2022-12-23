package com.p374my.target;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.widget.ImageView;
import com.p374my.target.common.models.ImageData;
import java.lang.ref.WeakReference;

/* renamed from: com.my.target.g0 */
public class C9707g0 {

    /* renamed from: a */
    public final C9894p1 f23907a;

    /* renamed from: b */
    public final C9730h0 f23908b;

    /* renamed from: c */
    public final C9708a f23909c;

    /* renamed from: d */
    public WeakReference<C10020w5> f23910d;

    /* renamed from: com.my.target.g0$a */
    public class C9708a implements View.OnClickListener {

        /* renamed from: a */
        public final String f23911a;

        public C9708a(String str) {
            this.f23911a = str;
        }

        public void onClick(View view) {
            Context context = view.getContext();
            C9730h0 h0Var = C9707g0.this.f23908b;
            if (h0Var == null) {
                C9832l8.m28605a(this.f23911a, context);
            } else if (!h0Var.mo64142c()) {
                C9707g0.this.f23908b.mo64136a(context);
            }
        }
    }

    /* renamed from: com.my.target.g0$b */
    public interface C9709b {
        /* renamed from: a */
        void mo63363a(Context context);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: com.my.target.h0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: com.my.target.g0$a} */
    /* JADX WARNING: type inference failed for: r0v0 */
    /* JADX WARNING: type inference failed for: r0v5 */
    /* JADX WARNING: type inference failed for: r0v6 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C9707g0(com.p374my.target.C9894p1 r4) {
        /*
            r3 = this;
            r3.<init>()
            r3.f23907a = r4
            r0 = 0
            if (r4 != 0) goto L_0x000d
            r3.f23908b = r0
        L_0x000a:
            r3.f23909c = r0
            return
        L_0x000d:
            java.util.List r1 = r4.mo65191a()
            if (r1 == 0) goto L_0x001d
            boolean r2 = r1.isEmpty()
            if (r2 != 0) goto L_0x001d
            com.my.target.h0 r0 = com.p374my.target.C9730h0.m28115a((java.util.List<com.p374my.target.C9894p1.C9895a>) r1)
        L_0x001d:
            r3.f23908b = r0
            com.my.target.g0$a r0 = new com.my.target.g0$a
            java.lang.String r4 = r4.mo65193b()
            r0.<init>(r4)
            goto L_0x000a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p374my.target.C9707g0.<init>(com.my.target.p1):void");
    }

    /* renamed from: a */
    public static C9707g0 m28052a(C9894p1 p1Var) {
        return new C9707g0(p1Var);
    }

    /* renamed from: a */
    public void mo64036a() {
        C9730h0 h0Var = this.f23908b;
        if (h0Var != null) {
            h0Var.mo64137a((C9709b) null);
        }
        WeakReference<C10020w5> weakReference = this.f23910d;
        C10020w5 w5Var = weakReference != null ? (C10020w5) weakReference.get() : null;
        if (w5Var != null) {
            C9894p1 p1Var = this.f23907a;
            if (p1Var != null) {
                C9807k8.m28512a(p1Var.mo65194c(), (ImageView) w5Var);
            }
            mo64037a(w5Var);
            this.f23910d.clear();
            this.f23910d = null;
        }
    }

    /* renamed from: a */
    public void mo64037a(C10020w5 w5Var) {
        w5Var.setImageBitmap((Bitmap) null);
        w5Var.setVisibility(8);
        w5Var.setOnClickListener((View.OnClickListener) null);
    }

    /* renamed from: a */
    public void mo64038a(C10020w5 w5Var, C9709b bVar) {
        if (this.f23907a == null) {
            mo64037a(w5Var);
            return;
        }
        C9730h0 h0Var = this.f23908b;
        if (h0Var != null) {
            h0Var.mo64137a(bVar);
        }
        this.f23910d = new WeakReference<>(w5Var);
        w5Var.setVisibility(0);
        w5Var.setOnClickListener(this.f23909c);
        ImageData c = this.f23907a.mo65194c();
        Bitmap bitmap = c.getBitmap();
        if (c.getBitmap() != null) {
            w5Var.setImageBitmap(bitmap);
        } else {
            C9807k8.m28516b(c, w5Var);
        }
    }
}

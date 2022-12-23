package com.inmobi.media;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Point;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.Handler;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.inmobi.ads.rendering.InMobiAdActivity;
import com.inmobi.media.C5905bw;
import com.inmobi.media.C5914cb;
import com.inmobi.media.C5916cc;
import com.inmobi.media.C6058ez;
import com.squareup.picasso.Callback;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

/* renamed from: com.inmobi.media.fl */
/* compiled from: NativeViewFactory */
public class C6103fl {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final String f15533a = C6103fl.class.getSimpleName();

    /* renamed from: c */
    private static final Map<Class, Byte> f15534c;

    /* renamed from: e */
    private static volatile WeakReference<C6103fl> f15535e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static WeakReference<Context> f15536f;

    /* renamed from: g */
    private static int f15537g = 1;

    /* renamed from: h */
    private static int f15538h = 1;

    /* renamed from: b */
    private int f15539b;

    /* renamed from: d */
    private Map<Byte, C6119d> f15540d = new HashMap();

    /* renamed from: a */
    static /* synthetic */ int m18231a(C6103fl flVar) {
        int i = flVar.f15539b;
        flVar.f15539b = i + 1;
        return i;
    }

    /* renamed from: b */
    static /* synthetic */ int m18249b(C6103fl flVar) {
        int i = flVar.f15539b;
        flVar.f15539b = i - 1;
        return i;
    }

    static {
        HashMap hashMap = new HashMap();
        f15534c = hashMap;
        hashMap.put(C6081fe.class, (byte) 0);
        f15534c.put(C6122fo.class, (byte) 1);
        f15534c.put(C6121fn.class, (byte) 2);
        f15534c.put(C6058ez.class, (byte) 3);
        f15534c.put(ImageView.class, (byte) 6);
        f15534c.put(C6102fk.class, (byte) 7);
        f15534c.put(C6117b.class, (byte) 4);
        f15534c.put(Button.class, (byte) 5);
        f15534c.put(C5919ce.class, (byte) 8);
        f15534c.put(C6337q.class, (byte) 9);
        f15534c.put(C6055ex.class, (byte) 10);
    }

    /* renamed from: com.inmobi.media.fl$d */
    /* compiled from: NativeViewFactory */
    abstract class C6119d {

        /* renamed from: a */
        private int f15560a = 0;

        /* renamed from: b */
        LinkedList<View> f15561b = new LinkedList<>();

        /* renamed from: d */
        private int f15563d = 0;

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public abstract View mo35309a(Context context);

        public C6119d() {
        }

        /* renamed from: a */
        public boolean mo35311a(View view) {
            C6103fl.m18253b(view);
            view.setOnClickListener((View.OnClickListener) null);
            this.f15561b.addLast(view);
            view.setScaleX(1.0f);
            view.setScaleY(1.0f);
            C6103fl.m18231a(C6103fl.this);
            return true;
        }

        /* renamed from: a */
        public final View mo35317a(Context context, C5901bt btVar, C6125fq fqVar) {
            View view;
            WeakReference unused = C6103fl.f15536f = new WeakReference(context);
            if (this.f15561b.isEmpty()) {
                this.f15560a++;
                view = mo35309a(context);
            } else {
                this.f15563d++;
                view = this.f15561b.removeFirst();
                C6103fl.m18249b(C6103fl.this);
            }
            if (view != null) {
                mo35310a(view, btVar, fqVar);
            }
            return view;
        }

        /* renamed from: a */
        public final void mo35318a() {
            if (this.f15561b.size() > 0) {
                this.f15561b.removeFirst();
            }
        }

        public String toString() {
            return "Size:" + this.f15561b.size() + " Miss Count:" + this.f15560a + " Hit Count:" + this.f15563d;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo35310a(View view, C5901bt btVar, C6125fq fqVar) {
            view.setVisibility(btVar.f14915x);
            view.setOnClickListener((View.OnClickListener) null);
        }
    }

    /* renamed from: a */
    static void m18236a(int i) {
        f15537g = i;
    }

    /* renamed from: b */
    static void m18251b(int i) {
        f15538h = i;
    }

    /* renamed from: c */
    static int m18254c(int i) {
        int i2;
        Context context = (Context) f15536f.get();
        if ((context == null || !(context instanceof InMobiAdActivity)) && (i2 = f15537g) != 0) {
            return (int) (((double) i) * ((((double) i2) * 1.0d) / ((double) f15538h)));
        }
        return i;
    }

    private C6103fl(Context context) {
        f15536f = new WeakReference<>(context);
        this.f15540d.put((byte) 0, new C6119d() {
            /* access modifiers changed from: protected */
            /* renamed from: a */
            public final View mo35309a(Context context) {
                return new C6081fe(context.getApplicationContext());
            }

            /* access modifiers changed from: protected */
            /* renamed from: a */
            public final void mo35310a(View view, C5901bt btVar, C6125fq fqVar) {
                super.mo35310a(view, btVar, fqVar);
                C6103fl.m18239a(view, btVar.f14894c);
            }
        });
        this.f15540d.put((byte) 3, new C6119d() {
            /* access modifiers changed from: protected */
            /* renamed from: a */
            public final View mo35309a(Context context) {
                return new C6058ez(context.getApplicationContext());
            }

            /* access modifiers changed from: protected */
            /* renamed from: a */
            public final void mo35310a(View view, C5901bt btVar, C6125fq fqVar) {
                super.mo35310a(view, btVar, fqVar);
                C6103fl.m18239a(view, btVar.f14894c);
            }
        });
        this.f15540d.put((byte) 1, new C6119d() {
            /* access modifiers changed from: protected */
            /* renamed from: a */
            public final View mo35309a(Context context) {
                return new C6122fo(context.getApplicationContext());
            }

            /* access modifiers changed from: protected */
            /* renamed from: a */
            public final void mo35310a(View view, C5901bt btVar, C6125fq fqVar) {
                super.mo35310a(view, btVar, fqVar);
                C6103fl.m18239a(view, btVar.f14894c);
            }

            /* renamed from: a */
            public final boolean mo35311a(View view) {
                ((C6122fo) view).f15567a = null;
                return super.mo35311a(view);
            }
        });
        this.f15540d.put((byte) 2, new C6119d() {
            /* access modifiers changed from: protected */
            /* renamed from: a */
            public final View mo35309a(Context context) {
                return new C6121fn(context.getApplicationContext());
            }

            /* access modifiers changed from: protected */
            /* renamed from: a */
            public final void mo35310a(View view, C5901bt btVar, C6125fq fqVar) {
                super.mo35310a(view, btVar, fqVar);
                C6103fl.m18239a(view, btVar.f14894c);
            }
        });
        this.f15540d.put((byte) 6, new C6119d() {
            /* access modifiers changed from: protected */
            /* renamed from: a */
            public final View mo35309a(Context context) {
                return new ImageView(context.getApplicationContext());
            }

            /* access modifiers changed from: protected */
            /* renamed from: a */
            public final void mo35310a(View view, C5901bt btVar, C6125fq fqVar) {
                super.mo35310a(view, btVar, fqVar);
                C6103fl.m18241a((ImageView) view, btVar);
            }

            /* renamed from: a */
            public final boolean mo35311a(View view) {
                if (!(view instanceof ImageView)) {
                    return false;
                }
                ((ImageView) view).setImageDrawable((Drawable) null);
                return super.mo35311a(view);
            }
        });
        this.f15540d.put((byte) 10, new C6119d() {
            /* access modifiers changed from: protected */
            /* renamed from: a */
            public final View mo35309a(Context context) {
                return new C6055ex(context.getApplicationContext());
            }

            /* access modifiers changed from: protected */
            /* renamed from: a */
            public final void mo35310a(View view, C5901bt btVar, C6125fq fqVar) {
                super.mo35310a(view, btVar, fqVar);
                C6103fl.m18245a((C6055ex) view, btVar);
            }

            /* renamed from: a */
            public final boolean mo35311a(View view) {
                if (!(view instanceof C6055ex)) {
                    return false;
                }
                ((C6055ex) view).setGifImpl((C6051ev) null);
                return super.mo35311a(view);
            }
        });
        this.f15540d.put((byte) 7, new C6119d() {
            /* access modifiers changed from: protected */
            /* renamed from: a */
            public final View mo35309a(Context context) {
                return new C6102fk(context.getApplicationContext());
            }

            /* access modifiers changed from: protected */
            /* renamed from: a */
            public final void mo35310a(View view, C5901bt btVar, C6125fq fqVar) {
                super.mo35310a(view, btVar, fqVar);
                C6103fl.m18246a((C6102fk) view, btVar);
            }

            /* renamed from: a */
            public final boolean mo35311a(View view) {
                if (!(view instanceof C6102fk)) {
                    return false;
                }
                C6102fk fkVar = (C6102fk) view;
                fkVar.getProgressBar().setVisibility(8);
                fkVar.getPoster().setImageBitmap((Bitmap) null);
                fkVar.getVideoView().mo35258e();
                return super.mo35311a(view);
            }
        });
        this.f15540d.put((byte) 4, new C6119d() {
            /* access modifiers changed from: protected */
            /* renamed from: a */
            public final View mo35309a(Context context) {
                return new C6117b(context.getApplicationContext());
            }

            /* access modifiers changed from: protected */
            /* renamed from: a */
            public final void mo35310a(View view, C5901bt btVar, C6125fq fqVar) {
                super.mo35310a(view, btVar, fqVar);
                C6103fl.m18243a((TextView) view, btVar);
            }

            /* renamed from: a */
            public final boolean mo35311a(View view) {
                if (!(view instanceof TextView)) {
                    return false;
                }
                C6103fl.m18242a((TextView) view);
                return super.mo35311a(view);
            }
        });
        this.f15540d.put((byte) 5, new C6119d() {
            /* access modifiers changed from: protected */
            /* renamed from: a */
            public final View mo35309a(Context context) {
                return new Button(context.getApplicationContext());
            }

            /* access modifiers changed from: protected */
            /* renamed from: a */
            public final void mo35310a(View view, C5901bt btVar, C6125fq fqVar) {
                super.mo35310a(view, btVar, fqVar);
                C6103fl.m18240a((Button) view, btVar);
            }

            /* renamed from: a */
            public final boolean mo35311a(View view) {
                if (!(view instanceof Button)) {
                    return false;
                }
                C6103fl.m18242a((TextView) (Button) view);
                return super.mo35311a(view);
            }
        });
        this.f15540d.put((byte) 8, new C6119d() {
            /* access modifiers changed from: protected */
            /* renamed from: a */
            public final View mo35309a(Context context) {
                return new C5919ce(context.getApplicationContext());
            }

            /* access modifiers changed from: protected */
            /* renamed from: a */
            public final void mo35310a(View view, C5901bt btVar, C6125fq fqVar) {
                super.mo35310a(view, btVar, fqVar);
                C6103fl.m18247a(C6103fl.this, (C5919ce) view, btVar);
            }

            /* renamed from: a */
            public final boolean mo35311a(View view) {
                return (view instanceof C5919ce) && super.mo35311a(view);
            }
        });
        this.f15540d.put((byte) 9, new C6119d() {
            /* access modifiers changed from: protected */
            /* renamed from: a */
            public final View mo35309a(Context context) {
                C6337q qVar = null;
                try {
                    C6337q qVar2 = new C6337q(context.getApplicationContext(), (byte) 0, (Set<C6002du>) null, (String) null, Boolean.FALSE, "DEFAULT");
                    try {
                        qVar2.setShouldFireRenderBeacon(false);
                        return qVar2;
                    } catch (Exception e) {
                        e = e;
                        qVar = qVar2;
                    }
                } catch (Exception e2) {
                    e = e2;
                    String unused = C6103fl.f15533a;
                    C6181gg.m18398a().mo35357a(new C6217hg(e));
                    return qVar;
                }
            }

            /* access modifiers changed from: protected */
            /* renamed from: a */
            public final void mo35310a(View view, C5901bt btVar, C6125fq fqVar) {
                super.mo35310a(view, btVar, fqVar);
                C6103fl.m18248a((C6337q) view, btVar, fqVar);
            }

            /* renamed from: a */
            public final boolean mo35311a(View view) {
                return (view instanceof C6337q) && !((C6337q) view).f16123u && super.mo35311a(view);
            }
        });
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: com.inmobi.media.fl} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.inmobi.media.C6103fl m18233a(android.content.Context r3) {
        /*
            java.lang.ref.WeakReference<com.inmobi.media.fl> r0 = f15535e
            r1 = 0
            if (r0 != 0) goto L_0x0007
            r0 = r1
            goto L_0x000f
        L_0x0007:
            java.lang.ref.WeakReference<com.inmobi.media.fl> r0 = f15535e
            java.lang.Object r0 = r0.get()
            com.inmobi.media.fl r0 = (com.inmobi.media.C6103fl) r0
        L_0x000f:
            if (r0 != 0) goto L_0x0037
            java.lang.Class<com.inmobi.media.fl> r2 = com.inmobi.media.C6103fl.class
            monitor-enter(r2)
            java.lang.ref.WeakReference<com.inmobi.media.fl> r0 = f15535e     // Catch:{ all -> 0x0034 }
            if (r0 != 0) goto L_0x0019
            goto L_0x0022
        L_0x0019:
            java.lang.ref.WeakReference<com.inmobi.media.fl> r0 = f15535e     // Catch:{ all -> 0x0034 }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x0034 }
            r1 = r0
            com.inmobi.media.fl r1 = (com.inmobi.media.C6103fl) r1     // Catch:{ all -> 0x0034 }
        L_0x0022:
            if (r1 != 0) goto L_0x0031
            com.inmobi.media.fl r0 = new com.inmobi.media.fl     // Catch:{ all -> 0x0034 }
            r0.<init>(r3)     // Catch:{ all -> 0x0034 }
            java.lang.ref.WeakReference r3 = new java.lang.ref.WeakReference     // Catch:{ all -> 0x0034 }
            r3.<init>(r0)     // Catch:{ all -> 0x0034 }
            f15535e = r3     // Catch:{ all -> 0x0034 }
            goto L_0x0032
        L_0x0031:
            r0 = r1
        L_0x0032:
            monitor-exit(r2)     // Catch:{ all -> 0x0034 }
            goto L_0x0037
        L_0x0034:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0034 }
            throw r3
        L_0x0037:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C6103fl.m18233a(android.content.Context):com.inmobi.media.fl");
    }

    /* renamed from: a */
    public final View mo35306a(Context context, C5901bt btVar, C6125fq fqVar) {
        C6119d dVar;
        byte a = m18230a(btVar);
        if (-1 == a || (dVar = this.f15540d.get(Byte.valueOf(a))) == null) {
            return null;
        }
        return dVar.mo35317a(context, btVar, fqVar);
    }

    /* renamed from: a */
    public final void mo35308a(ViewGroup viewGroup) {
        for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = viewGroup.getChildAt(childCount);
            viewGroup.removeViewAt(childCount);
            mo35307a(childAt);
        }
    }

    /* renamed from: a */
    public final void mo35307a(View view) {
        if ((view instanceof C6081fe) || (view instanceof C6058ez)) {
            C6058ez ezVar = (C6058ez) view;
            if (ezVar.getChildCount() != 0) {
                Stack stack = new Stack();
                stack.push(ezVar);
                while (!stack.isEmpty()) {
                    C6058ez ezVar2 = (C6058ez) stack.pop();
                    for (int childCount = ezVar2.getChildCount() - 1; childCount >= 0; childCount--) {
                        View childAt = ezVar2.getChildAt(childCount);
                        ezVar2.removeViewAt(childCount);
                        if (childAt instanceof C6058ez) {
                            stack.push((C6058ez) childAt);
                        } else {
                            m18256c(childAt);
                        }
                    }
                    m18256c((View) ezVar2);
                }
                return;
            }
        }
        m18256c(view);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003d, code lost:
        if (r10.equals(com.facebook.share.internal.ShareConstants.VIDEO_URL) != false) goto L_0x007d;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static byte m18230a(com.inmobi.media.C5901bt r10) {
        /*
            boolean r0 = r10 instanceof com.inmobi.media.C5903bv
            r1 = 3
            r2 = 2
            r3 = 0
            r4 = 1
            if (r0 == 0) goto L_0x001e
            com.inmobi.media.bv r10 = (com.inmobi.media.C5903bv) r10
            boolean r0 = r10.mo34888a()
            if (r0 == 0) goto L_0x0011
            return r3
        L_0x0011:
            boolean r0 = r10.mo34889b()
            if (r0 == 0) goto L_0x001d
            byte r10 = r10.f14928A
            if (r10 == r4) goto L_0x001c
            return r4
        L_0x001c:
            return r2
        L_0x001d:
            return r1
        L_0x001e:
            java.lang.String r10 = r10.f14893b
            int r0 = r10.hashCode()
            r5 = 5
            r6 = 7
            r7 = 6
            r8 = 4
            r9 = -1
            switch(r0) {
                case 67056: goto L_0x0072;
                case 70564: goto L_0x0068;
                case 2241657: goto L_0x005e;
                case 2571565: goto L_0x0054;
                case 69775675: goto L_0x004a;
                case 79826725: goto L_0x0040;
                case 81665115: goto L_0x0037;
                case 1942407129: goto L_0x002d;
                default: goto L_0x002c;
            }
        L_0x002c:
            goto L_0x007c
        L_0x002d:
            java.lang.String r0 = "WEBVIEW"
            boolean r10 = r10.equals(r0)
            if (r10 == 0) goto L_0x007c
            r1 = r7
            goto L_0x007d
        L_0x0037:
            java.lang.String r0 = "VIDEO"
            boolean r10 = r10.equals(r0)
            if (r10 == 0) goto L_0x007c
            goto L_0x007d
        L_0x0040:
            java.lang.String r0 = "TIMER"
            boolean r10 = r10.equals(r0)
            if (r10 == 0) goto L_0x007c
            r1 = r5
            goto L_0x007d
        L_0x004a:
            java.lang.String r0 = "IMAGE"
            boolean r10 = r10.equals(r0)
            if (r10 == 0) goto L_0x007c
            r1 = r4
            goto L_0x007d
        L_0x0054:
            java.lang.String r0 = "TEXT"
            boolean r10 = r10.equals(r0)
            if (r10 == 0) goto L_0x007c
            r1 = r3
            goto L_0x007d
        L_0x005e:
            java.lang.String r0 = "ICON"
            boolean r10 = r10.equals(r0)
            if (r10 == 0) goto L_0x007c
            r1 = r2
            goto L_0x007d
        L_0x0068:
            java.lang.String r0 = "GIF"
            boolean r10 = r10.equals(r0)
            if (r10 == 0) goto L_0x007c
            r1 = r6
            goto L_0x007d
        L_0x0072:
            java.lang.String r0 = "CTA"
            boolean r10 = r10.equals(r0)
            if (r10 == 0) goto L_0x007c
            r1 = r8
            goto L_0x007d
        L_0x007c:
            r1 = r9
        L_0x007d:
            switch(r1) {
                case 0: goto L_0x008d;
                case 1: goto L_0x008c;
                case 2: goto L_0x008c;
                case 3: goto L_0x008b;
                case 4: goto L_0x008a;
                case 5: goto L_0x0087;
                case 6: goto L_0x0084;
                case 7: goto L_0x0081;
                default: goto L_0x0080;
            }
        L_0x0080:
            return r9
        L_0x0081:
            r10 = 10
            return r10
        L_0x0084:
            r10 = 9
            return r10
        L_0x0087:
            r10 = 8
            return r10
        L_0x008a:
            return r5
        L_0x008b:
            return r6
        L_0x008c:
            return r7
        L_0x008d:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C6103fl.m18230a(com.inmobi.media.bt):byte");
    }

    /* renamed from: c */
    private void m18256c(View view) {
        C6119d dVar;
        byte byteValue = f15534c.get(view.getClass()).byteValue();
        if (-1 != byteValue && (dVar = this.f15540d.get(Integer.valueOf(byteValue))) != null) {
            if (this.f15539b >= 300) {
                m18255c();
            }
            dVar.mo35311a(view);
        }
    }

    /* renamed from: c */
    private void m18255c() {
        C6119d d = m18257d();
        if (d != null) {
            d.mo35318a();
        }
    }

    /* renamed from: d */
    private C6119d m18257d() {
        int i = 0;
        C6119d dVar = null;
        for (Map.Entry next : this.f15540d.entrySet()) {
            if (((C6119d) next.getValue()).f15561b.size() > i) {
                C6119d dVar2 = (C6119d) next.getValue();
                dVar = dVar2;
                i = dVar2.f15561b.size();
            }
        }
        return dVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static void m18252b(Context context, ImageView imageView) {
        Bitmap bitmap;
        if (imageView.getDrawable() == null) {
            float f = C6252ic.m18655a().f15840c;
            C5933cp cpVar = new C5933cp(context, f, (byte) 0);
            if (Build.VERSION.SDK_INT < 28) {
                cpVar.layout(0, 0, (int) (((float) m18254c(40)) * f), (int) (((float) m18254c(40)) * f));
                cpVar.setDrawingCacheEnabled(true);
                cpVar.buildDrawingCache();
                bitmap = cpVar.getDrawingCache();
            } else {
                cpVar.layout(0, 0, (int) (((float) m18254c(40)) * f), (int) (((float) m18254c(40)) * f));
                bitmap = Bitmap.createBitmap((int) (((float) m18254c(40)) * f), (int) (((float) m18254c(40)) * f), Bitmap.Config.ARGB_8888);
                cpVar.draw(new Canvas(bitmap));
            }
            imageView.setImageBitmap(bitmap);
        }
    }

    /* renamed from: com.inmobi.media.fl$c */
    /* compiled from: NativeViewFactory */
    static class C6118c implements InvocationHandler {

        /* renamed from: a */
        private WeakReference<Context> f15557a;

        /* renamed from: b */
        private WeakReference<ImageView> f15558b;

        /* renamed from: c */
        private C5901bt f15559c;

        C6118c(Context context, ImageView imageView, C5901bt btVar) {
            this.f15557a = new WeakReference<>(context);
            this.f15558b = new WeakReference<>(imageView);
            this.f15559c = btVar;
        }

        public final Object invoke(Object obj, Method method, Object[] objArr) {
            String unused = C6103fl.f15533a;
            if (method == null || !"onError".equalsIgnoreCase(method.getName())) {
                return null;
            }
            C6103fl.m18238a((Context) this.f15557a.get(), (ImageView) this.f15558b.get(), this.f15559c);
            return null;
        }
    }

    /* renamed from: com.inmobi.media.fl$a */
    /* compiled from: NativeViewFactory */
    static final class C6116a implements Runnable {

        /* renamed from: a */
        private WeakReference<Context> f15555a;

        /* renamed from: b */
        private WeakReference<ImageView> f15556b;

        C6116a(Context context, ImageView imageView) {
            this.f15555a = new WeakReference<>(context);
            this.f15556b = new WeakReference<>(imageView);
        }

        public final void run() {
            Context context = (Context) this.f15555a.get();
            ImageView imageView = (ImageView) this.f15556b.get();
            if (context != null && imageView != null) {
                C6103fl.m18252b(context, imageView);
            }
        }
    }

    /* renamed from: a */
    private static void m18244a(TextView textView, String[] strArr) {
        int paintFlags = textView.getPaintFlags();
        int i = 0;
        for (String str : strArr) {
            char c = 65535;
            switch (str.hashCode()) {
                case -1178781136:
                    if (str.equals("italic")) {
                        c = 1;
                        break;
                    }
                    break;
                case -1026963764:
                    if (str.equals("underline")) {
                        c = 3;
                        break;
                    }
                    break;
                case -891985998:
                    if (str.equals("strike")) {
                        c = 2;
                        break;
                    }
                    break;
                case 3029637:
                    if (str.equals("bold")) {
                        c = 0;
                        break;
                    }
                    break;
            }
            if (c == 0) {
                i |= 1;
            } else if (c == 1) {
                i |= 2;
            } else if (c == 2) {
                paintFlags |= 16;
            } else if (c == 3) {
                paintFlags |= 8;
            }
        }
        textView.setTypeface(Typeface.DEFAULT, i);
        textView.setPaintFlags(paintFlags);
    }

    /* renamed from: a */
    static void m18239a(View view, C5902bu buVar) {
        int parseColor = Color.parseColor("#00000000");
        try {
            parseColor = Color.parseColor(buVar.mo34884e());
        } catch (IllegalArgumentException e) {
            C6181gg.m18398a().mo35357a(new C6217hg(e));
        }
        view.setBackgroundColor(parseColor);
        if ("line".equals(buVar.mo34880a())) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setColor(parseColor);
            if ("curved".equals(buVar.mo34881b())) {
                gradientDrawable.setCornerRadius(buVar.mo34882c());
            }
            int parseColor2 = Color.parseColor("#ff000000");
            try {
                parseColor2 = Color.parseColor(buVar.mo34883d());
            } catch (IllegalArgumentException e2) {
                C6181gg.m18398a().mo35357a(new C6217hg(e2));
            }
            gradientDrawable.setStroke(1, parseColor2);
            if (Build.VERSION.SDK_INT < 16) {
                view.setBackgroundDrawable(gradientDrawable);
            } else {
                view.setBackground(gradientDrawable);
            }
        }
    }

    /* renamed from: com.inmobi.media.fl$b */
    /* compiled from: NativeViewFactory */
    static final class C6117b extends TextView {
        public final boolean onTouchEvent(MotionEvent motionEvent) {
            return false;
        }

        public C6117b(Context context) {
            super(context);
        }

        /* access modifiers changed from: protected */
        public final void onSizeChanged(int i, int i2, int i3, int i4) {
            super.onSizeChanged(i, i2, i3, i4);
            int lineHeight = getLineHeight() > 0 ? i2 / getLineHeight() : 0;
            if (lineHeight > 0) {
                setSingleLine(false);
                setLines(lineHeight);
            }
            if (lineHeight == 1) {
                setSingleLine();
            }
        }
    }

    /* renamed from: a */
    public static ViewGroup.LayoutParams m18232a(C5901bt btVar, ViewGroup viewGroup) {
        Point point = btVar.f14894c.f14917a;
        Point point2 = btVar.f14894c.f14919c;
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(m18254c(point.x), m18254c(point.y));
        if (viewGroup instanceof C6058ez) {
            C6058ez.C6059a aVar = new C6058ez.C6059a(m18254c(point.x), m18254c(point.y));
            C6058ez.C6059a aVar2 = aVar;
            int c = m18254c(point2.x);
            int c2 = m18254c(point2.y);
            aVar2.f15412a = c;
            aVar2.f15413b = c2;
            return aVar;
        } else if (viewGroup instanceof LinearLayout) {
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(m18254c(point.x), m18254c(point.y));
            layoutParams2.setMargins(m18254c(point2.x), m18254c(point2.y), 0, 0);
            return layoutParams2;
        } else if (viewGroup instanceof AbsListView) {
            return new AbsListView.LayoutParams(m18254c(point.x), m18254c(point.y));
        } else {
            if (!(viewGroup instanceof FrameLayout)) {
                return layoutParams;
            }
            FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(m18254c(point.x), m18254c(point.y));
            layoutParams3.setMargins(m18254c(point2.x), m18254c(point2.y), 0, 0);
            return layoutParams3;
        }
    }

    /* renamed from: b */
    static /* synthetic */ void m18253b(View view) {
        if (Build.VERSION.SDK_INT < 16) {
            view.setBackgroundDrawable((Drawable) null);
        } else {
            view.setBackground((Drawable) null);
        }
    }

    /* renamed from: a */
    static /* synthetic */ void m18241a(ImageView imageView, C5901bt btVar) {
        int i;
        int i2;
        int i3;
        String str = (String) btVar.f14896e;
        if (str != null) {
            int c = m18254c(btVar.f14894c.f14917a.x);
            int c2 = m18254c(btVar.f14894c.f14917a.y);
            String f = btVar.f14894c.mo34885f();
            char c3 = 65535;
            int hashCode = f.hashCode();
            int i4 = 0;
            if (hashCode != -1362001767) {
                if (hashCode == 727618043 && f.equals("aspectFill")) {
                    c3 = 1;
                }
            } else if (f.equals("aspectFit")) {
                c3 = 0;
            }
            if (c3 == 0) {
                imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            } else if (c3 != 1) {
                imageView.setScaleType(ImageView.ScaleType.FIT_XY);
            } else {
                imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            }
            Context context = (Context) f15536f.get();
            if (context != null && c > 0 && c2 > 0 && str.trim().length() != 0) {
                C5981di.m17851a(context).load(str).into(imageView, (Callback) C5981di.m17853a((InvocationHandler) new C6118c(context, imageView, btVar)));
                if ("cross_button".equalsIgnoreCase(btVar.f14895d) && btVar.f14909r.length() == 0) {
                    new Handler().postDelayed(new C6116a(context, imageView), 2000);
                }
            }
            C5901bt btVar2 = btVar.f14911t;
            if (btVar2 == null || !"line".equals(btVar2.f14894c.mo34880a())) {
                i3 = 0;
                i2 = 0;
                i = 0;
            } else {
                int i5 = btVar2.f14894c.f14919c.x == btVar.f14894c.f14919c.x ? 1 : 0;
                i2 = m18254c(btVar2.f14894c.f14917a.x) == m18254c(btVar.f14894c.f14917a.x) + btVar.f14894c.f14919c.x ? 1 : 0;
                i = m18254c(btVar2.f14894c.f14919c.y) == m18254c(btVar.f14894c.f14919c.y) ? 1 : 0;
                if (m18254c(btVar2.f14894c.f14917a.y) == m18254c(btVar.f14894c.f14917a.y) + m18254c(btVar.f14894c.f14919c.y)) {
                    i4 = 1;
                }
                if (m18254c(btVar2.f14894c.f14917a.x) == m18254c(btVar.f14894c.f14917a.x)) {
                    i3 = i4;
                    i2 = 1;
                    i4 = 1;
                } else {
                    i3 = i4;
                    i4 = i5;
                }
            }
            if (Build.VERSION.SDK_INT < 17) {
                imageView.setPadding(i4, i, i2, i3);
            } else {
                imageView.setPaddingRelative(i4, i, i2, i3);
            }
            m18239a((View) imageView, btVar.f14894c);
        }
    }

    /* renamed from: a */
    static /* synthetic */ void m18245a(C6055ex exVar, C5901bt btVar) {
        exVar.setLayoutParams(new ViewGroup.LayoutParams(m18254c(btVar.f14894c.f14917a.x), m18254c(btVar.f14894c.f14917a.y)));
        exVar.setContentMode(btVar.f14894c.mo34885f());
        exVar.setGifImpl(((C5910by) btVar).f14968z);
        m18239a((View) exVar, btVar.f14894c);
    }

    /* renamed from: a */
    static /* synthetic */ void m18246a(C6102fk fkVar, C5901bt btVar) {
        m18239a((View) fkVar, btVar.f14894c);
        if (btVar.f14914w != null) {
            fkVar.setPosterImage((Bitmap) btVar.f14914w);
        }
        fkVar.getProgressBar().setVisibility(0);
    }

    /* renamed from: a */
    static /* synthetic */ void m18243a(TextView textView, C5901bt btVar) {
        C5914cb.C5915a aVar = (C5914cb.C5915a) btVar.f14894c;
        textView.setLayoutParams(new ViewGroup.LayoutParams(m18254c(aVar.f14917a.x), m18254c(aVar.f14917a.y)));
        textView.setText((CharSequence) btVar.f14896e);
        textView.setTypeface(Typeface.DEFAULT);
        byte b = aVar.f14975p;
        if (b == 1) {
            textView.setGravity(8388629);
        } else if (b != 2) {
            textView.setGravity(8388627);
        } else {
            textView.setGravity(17);
        }
        textView.setTextSize(1, (float) m18254c(aVar.mo34903h()));
        int parseColor = Color.parseColor("#ff000000");
        try {
            parseColor = Color.parseColor(aVar.mo34904i());
        } catch (IllegalArgumentException e) {
            C6181gg.m18398a().mo35357a(new C6217hg(e));
        }
        textView.setTextColor(parseColor);
        int parseColor2 = Color.parseColor("#00000000");
        try {
            parseColor2 = Color.parseColor(aVar.mo34884e());
        } catch (IllegalArgumentException e2) {
            C6181gg.m18398a().mo35357a(new C6217hg(e2));
        }
        textView.setBackgroundColor(parseColor2);
        if (Build.VERSION.SDK_INT >= 17) {
            textView.setTextAlignment(1);
        }
        m18244a(textView, aVar.mo34905j());
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setHorizontallyScrolling(true);
        textView.setFocusable(true);
        textView.setFocusableInTouchMode(true);
        m18239a((View) textView, (C5902bu) aVar);
    }

    /* renamed from: a */
    static /* synthetic */ void m18242a(TextView textView) {
        textView.setTypeface(Typeface.DEFAULT, 0);
        textView.setPaintFlags(textView.getPaintFlags() & -17);
        textView.setPaintFlags(textView.getPaintFlags() & -9);
    }

    /* renamed from: a */
    static /* synthetic */ void m18240a(Button button, C5901bt btVar) {
        C5905bw.C5906a aVar = (C5905bw.C5906a) btVar.f14894c;
        button.setLayoutParams(new ViewGroup.LayoutParams(m18254c(aVar.f14917a.x), m18254c(aVar.f14917a.y)));
        button.setText((CharSequence) btVar.f14896e);
        button.setTextSize(1, (float) m18254c(aVar.mo34903h()));
        int parseColor = Color.parseColor("#ff000000");
        try {
            parseColor = Color.parseColor(aVar.mo34904i());
        } catch (IllegalArgumentException e) {
            C6181gg.m18398a().mo35357a(new C6217hg(e));
        }
        button.setTextColor(parseColor);
        int parseColor2 = Color.parseColor("#00000000");
        try {
            parseColor2 = Color.parseColor(aVar.mo34884e());
        } catch (IllegalArgumentException e2) {
            C6181gg.m18398a().mo35357a(new C6217hg(e2));
        }
        button.setBackgroundColor(parseColor2);
        if (Build.VERSION.SDK_INT >= 17) {
            button.setTextAlignment(4);
        }
        button.setGravity(17);
        m18244a((TextView) button, aVar.mo34905j());
        m18239a((View) button, (C5902bu) aVar);
    }

    /* renamed from: a */
    static /* synthetic */ void m18247a(C6103fl flVar, final C5919ce ceVar, C5901bt btVar) {
        long j;
        ceVar.setVisibility(4);
        final C5918cd cdVar = (C5918cd) btVar;
        C5916cc.C5917a aVar = cdVar.f14982A.f14976a;
        C5916cc.C5917a aVar2 = cdVar.f14982A.f14977b;
        if (aVar != null) {
            try {
                j = aVar.mo34906a();
            } catch (Exception e) {
                C6181gg.m18398a().mo35357a(new C6217hg(e));
                return;
            }
        } else {
            j = 0;
        }
        long a = aVar2 != null ? aVar2.mo34906a() : 0;
        if (a >= 0) {
            ceVar.setTimerValue(a);
            new Handler().postDelayed(new Runnable() {
                public final void run() {
                    if (C6103fl.f15536f.get() != null) {
                        if (cdVar.f14983z) {
                            ceVar.setVisibility(0);
                        }
                        ceVar.mo34907a();
                    }
                }
            }, j * 1000);
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static /* synthetic */ void m18248a(com.inmobi.media.C6337q r4, com.inmobi.media.C5901bt r5, com.inmobi.media.C6125fq r6) {
        /*
            r0 = r5
            com.inmobi.media.ch r0 = (com.inmobi.media.C5925ch) r0     // Catch:{ Exception -> 0x004f }
            com.inmobi.media.s r1 = com.inmobi.media.C6337q.f16049a     // Catch:{ Exception -> 0x004f }
            r2 = 0
            r4.mo35608a(r1, r6, r2, r2)     // Catch:{ Exception -> 0x004f }
            r6 = 1
            r4.f16111i = r6     // Catch:{ Exception -> 0x004f }
            java.lang.Object r5 = r5.f14896e     // Catch:{ Exception -> 0x004f }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ Exception -> 0x004f }
            java.lang.String r0 = r0.f15018z     // Catch:{ Exception -> 0x004f }
            r1 = -1
            int r3 = r0.hashCode()     // Catch:{ Exception -> 0x004f }
            switch(r3) {
                case -1081286672: goto L_0x0038;
                case 84303: goto L_0x002e;
                case 2228139: goto L_0x0024;
                case 83774455: goto L_0x001b;
                default: goto L_0x001a;
            }     // Catch:{ Exception -> 0x004f }
        L_0x001a:
            goto L_0x0042
        L_0x001b:
            java.lang.String r3 = "REF_HTML"
            boolean r0 = r0.equals(r3)     // Catch:{ Exception -> 0x004f }
            if (r0 == 0) goto L_0x0042
            goto L_0x0043
        L_0x0024:
            java.lang.String r2 = "HTML"
            boolean r0 = r0.equals(r2)     // Catch:{ Exception -> 0x004f }
            if (r0 == 0) goto L_0x0042
            r2 = r6
            goto L_0x0043
        L_0x002e:
            java.lang.String r2 = "URL"
            boolean r0 = r0.equals(r2)     // Catch:{ Exception -> 0x004f }
            if (r0 == 0) goto L_0x0042
            r2 = 3
            goto L_0x0043
        L_0x0038:
            java.lang.String r2 = "REF_IFRAME"
            boolean r0 = r0.equals(r2)     // Catch:{ Exception -> 0x004f }
            if (r0 == 0) goto L_0x0042
            r2 = 2
            goto L_0x0043
        L_0x0042:
            r2 = r1
        L_0x0043:
            if (r2 == 0) goto L_0x004b
            if (r2 == r6) goto L_0x004b
            r4.mo35613b((java.lang.String) r5)     // Catch:{ Exception -> 0x004f }
            return
        L_0x004b:
            r4.mo35610a((java.lang.String) r5)     // Catch:{ Exception -> 0x004f }
            return
        L_0x004f:
            r4 = move-exception
            com.inmobi.media.gg r5 = com.inmobi.media.C6181gg.m18398a()
            com.inmobi.media.hg r6 = new com.inmobi.media.hg
            r6.<init>(r4)
            r5.mo35357a((com.inmobi.media.C6217hg) r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C6103fl.m18248a(com.inmobi.media.q, com.inmobi.media.bt, com.inmobi.media.fq):void");
    }

    /* renamed from: a */
    static /* synthetic */ void m18238a(Context context, ImageView imageView, C5901bt btVar) {
        if (!(context == null || imageView == null)) {
            String str = btVar.f14909r;
            if ("cross_button".equalsIgnoreCase(btVar.f14895d) && str.trim().length() == 0) {
                m18252b(context, imageView);
            }
        }
        HashMap hashMap = new HashMap();
        hashMap.put("[ERRORCODE]", "603");
        btVar.mo34877a("error", (Map<String, String>) hashMap);
    }
}

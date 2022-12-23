package com.inmobi.media;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import com.inmobi.media.C6014ec;
import com.inmobi.media.C6028ei;
import com.inmobi.media.C6125fq;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: com.inmobi.media.eg */
/* compiled from: NativeAdTracker */
public class C6022eg {

    /* renamed from: a */
    static final Map<Context, C6014ec> f15318a = new WeakHashMap();

    /* renamed from: b */
    private static final String f15319b = C6022eg.class.getSimpleName();

    /* renamed from: c */
    private static final Map<Context, C6028ei> f15320c = new WeakHashMap();
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static final Map<View, C6026a> f15321d = new HashMap();

    /* renamed from: e */
    private static final C6014ec.C6016a f15322e = new C6014ec.C6016a() {
        /* renamed from: a */
        public final void mo35143a(View view, Object obj) {
            ((C6318n) obj).mo35555a(view);
        }
    };

    /* renamed from: f */
    private static final C6028ei.C6029a f15323f = new C6028ei.C6029a() {

        /* renamed from: a */
        private final Rect f15326a = new Rect();

        /* renamed from: a */
        public final boolean mo35150a(View view, View view2, int i) {
            return true;
        }

        /* renamed from: a */
        public final boolean mo35151a(View view, View view2, int i, Object obj) {
            C6080fd mediaPlayer;
            if (!(obj instanceof C6318n) || ((C6318n) obj).f16009j) {
                return false;
            }
            if (((view2 instanceof C6089fj) && (mediaPlayer = ((C6089fj) view2).getMediaPlayer()) != null && 3 != mediaPlayer.f15470a) || view2 == null || view == null || !view2.isShown() || view.getParent() == null || !view2.getGlobalVisibleRect(this.f15326a)) {
                return false;
            }
            long height = ((long) this.f15326a.height()) * ((long) this.f15326a.width());
            long width = ((long) view.getWidth()) * ((long) view.getHeight());
            if (width <= 0 || height * 100 < ((long) i) * width) {
                return false;
            }
            return true;
        }
    };

    /* renamed from: g */
    private boolean f15324g;

    /* renamed from: h */
    private byte f15325h;

    /* renamed from: com.inmobi.media.eg$a */
    /* compiled from: NativeAdTracker */
    public interface C6026a {
        /* renamed from: a */
        void mo35152a(View view, boolean z);
    }

    C6022eg(byte b) {
        this.f15325h = b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo35148a(Context context, View view, C6318n nVar, C6125fq.C6142m mVar) {
        C6014ec a = m18000a(context, mVar);
        if (this.f15325h != 0) {
            a.mo35137a(view, nVar, mVar.impressionMinPercentageViewed, mVar.impressionMinTimeViewed);
        } else {
            a.mo35137a(view, nVar, mVar.video.impressionMinPercentageViewed, mVar.video.impressionMinTimeViewed);
        }
    }

    /* renamed from: a */
    private C6014ec m18000a(Context context, C6125fq.C6142m mVar) {
        C6014ec ecVar = f15318a.get(context);
        if (ecVar == null) {
            if (context instanceof Activity) {
                ecVar = new C6014ec(mVar, new C6010ea(f15323f, (Activity) context), f15322e);
                if (!this.f15324g) {
                    this.f15324g = true;
                }
            } else {
                ecVar = new C6014ec(mVar, new C6027eh(f15323f, mVar, (byte) 1), f15322e);
            }
            f15318a.put(context, ecVar);
        }
        return ecVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo35149a(Context context, C6318n nVar) {
        C6014ec ecVar = f15318a.get(context);
        if (ecVar != null) {
            ecVar.mo35138a((Object) nVar);
            if (!ecVar.mo35140c()) {
                mo35145a(context);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo35145a(Context context) {
        C6014ec remove = f15318a.remove(context);
        if (remove != null) {
            remove.mo35141d();
        }
        if ((context instanceof Activity) && f15318a.isEmpty() && this.f15324g) {
            this.f15324g = false;
        }
    }

    /* renamed from: a */
    public final void mo35146a(Context context, View view, C6318n nVar) {
        C6028ei eiVar = f15320c.get(context);
        if (eiVar != null) {
            eiVar.mo35155a((Object) nVar);
            if (!eiVar.mo35157g()) {
                m18004d(context);
            }
        }
        f15321d.remove(view);
    }

    /* renamed from: d */
    private void m18004d(Context context) {
        C6028ei remove = f15320c.remove(context);
        if (remove != null) {
            remove.mo35132e();
        }
        if ((context instanceof Activity) && f15320c.isEmpty() && this.f15324g) {
            this.f15324g = false;
        }
    }

    /* renamed from: b */
    static void m18002b(Context context) {
        C6014ec ecVar = f15318a.get(context);
        if (ecVar != null) {
            ecVar.mo35139b();
        }
    }

    /* renamed from: c */
    static void m18003c(Context context) {
        C6014ec ecVar = f15318a.get(context);
        if (ecVar != null) {
            ecVar.mo35135a();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo35147a(Context context, View view, C6318n nVar, C6026a aVar, C6125fq.C6142m mVar) {
        C6028ei eiVar;
        C6028ei eiVar2 = f15320c.get(context);
        if (eiVar2 == null) {
            boolean z = context instanceof Activity;
            if (z) {
                eiVar = new C6010ea(f15323f, (Activity) context);
            } else {
                eiVar = new C6027eh(f15323f, mVar, (byte) 1);
            }
            eiVar.f15331c = new C6028ei.C6031c() {
                /* renamed from: a */
                public final void mo35142a(List<View> list, List<View> list2) {
                    for (View next : list) {
                        C6026a aVar = (C6026a) C6022eg.f15321d.get(next);
                        if (aVar != null) {
                            aVar.mo35152a(next, true);
                        }
                    }
                    for (View next2 : list2) {
                        C6026a aVar2 = (C6026a) C6022eg.f15321d.get(next2);
                        if (aVar2 != null) {
                            aVar2.mo35152a(next2, false);
                        }
                    }
                }
            };
            f15320c.put(context, eiVar);
            if (z && !this.f15324g) {
                this.f15324g = true;
            }
            eiVar2 = eiVar;
        }
        f15321d.put(view, aVar);
        if (this.f15325h != 0) {
            eiVar2.mo35154a(view, nVar, mVar.displayMinPercentageAnimate);
        } else {
            eiVar2.mo35154a(view, nVar, mVar.video.videoMinPercentagePlay);
        }
    }
}

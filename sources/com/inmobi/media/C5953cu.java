package com.inmobi.media;

import android.app.Activity;
import android.os.Build;
import android.view.OrientationEventListener;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: com.inmobi.media.cu */
/* compiled from: InMobiActivityOrientationHandler */
public class C5953cu extends OrientationEventListener {

    /* renamed from: a */
    public HashSet<C5956cw> f15115a;

    /* renamed from: b */
    public Activity f15116b;

    /* renamed from: c */
    private final String f15117c = C5953cu.class.getSimpleName();

    /* renamed from: d */
    private C5977df f15118d = C5977df.m17846a(C6252ic.m18659b());

    /* renamed from: a */
    private static int m17786a(byte b) {
        return (b == 3 || b == 4) ? 2 : 1;
    }

    public C5953cu(Activity activity) {
        super(activity.getApplicationContext());
        this.f15116b = activity;
        this.f15115a = new HashSet<>();
    }

    /* renamed from: b */
    private void m17788b() {
        if (this.f15115a.isEmpty()) {
            disable();
        } else {
            enable();
        }
    }

    /* renamed from: a */
    public final void mo35039a(C5956cw cwVar) {
        this.f15115a.add(cwVar);
        m17788b();
    }

    /* renamed from: b */
    public final void mo35041b(C5956cw cwVar) {
        this.f15115a.remove(cwVar);
        m17788b();
    }

    /* renamed from: a */
    public final void mo35040a(C5975dd ddVar) {
        if (ddVar != null) {
            if (!ddVar.f15184a) {
                String str = ddVar.f15185b;
                char c = 65535;
                int hashCode = str.hashCode();
                if (hashCode != 729267099) {
                    if (hashCode == 1430647483 && str.equals("landscape")) {
                        c = 0;
                    }
                } else if (str.equals("portrait")) {
                    c = 1;
                }
                if (c == 0) {
                    this.f15116b.setRequestedOrientation(6);
                } else if (c != 1) {
                    m17789c();
                } else {
                    this.f15116b.setRequestedOrientation(7);
                }
            } else {
                m17789c();
            }
        }
    }

    /* renamed from: c */
    private void m17789c() {
        if (Build.VERSION.SDK_INT >= 18) {
            this.f15116b.setRequestedOrientation(13);
        } else {
            this.f15116b.setRequestedOrientation(2);
        }
    }

    /* renamed from: a */
    public final void mo35038a() {
        boolean z = this.f15116b.getResources().getConfiguration().orientation == m17786a(C6252ic.m18659b());
        C5977df a = C5977df.m17846a(C6252ic.m18659b());
        if (z && this.f15118d.f15193e != a.f15193e) {
            this.f15118d = a;
            m17787a(a);
        }
    }

    /* renamed from: a */
    private void m17787a(C5977df dfVar) {
        Iterator<C5956cw> it = this.f15115a.iterator();
        while (it.hasNext()) {
            it.next().mo35032a(dfVar);
        }
    }

    public void onOrientationChanged(int i) {
        mo35038a();
    }
}

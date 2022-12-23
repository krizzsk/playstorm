package com.tapjoy.internal;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.widget.RemoteViews;
import java.util.ArrayList;

/* renamed from: com.tapjoy.internal.js */
public final class C11821js {

    /* renamed from: com.tapjoy.internal.js$a */
    public static class C11822a {

        /* renamed from: a */
        final Bundle f28851a;

        /* renamed from: b */
        final C11828jv[] f28852b;

        /* renamed from: c */
        final C11828jv[] f28853c;

        /* renamed from: d */
        boolean f28854d;

        /* renamed from: e */
        public int f28855e;

        /* renamed from: f */
        public CharSequence f28856f;

        /* renamed from: g */
        public PendingIntent f28857g;
    }

    /* renamed from: com.tapjoy.internal.js$c */
    public static class C11824c {

        /* renamed from: A */
        Bundle f28859A;

        /* renamed from: B */
        int f28860B = 0;

        /* renamed from: C */
        int f28861C = 0;

        /* renamed from: D */
        Notification f28862D;

        /* renamed from: E */
        RemoteViews f28863E;

        /* renamed from: F */
        RemoteViews f28864F;

        /* renamed from: G */
        RemoteViews f28865G;

        /* renamed from: H */
        String f28866H;

        /* renamed from: I */
        int f28867I = 0;

        /* renamed from: J */
        String f28868J;

        /* renamed from: K */
        long f28869K;

        /* renamed from: L */
        int f28870L = 0;

        /* renamed from: M */
        public Notification f28871M;
        @Deprecated

        /* renamed from: N */
        public ArrayList<String> f28872N;

        /* renamed from: a */
        public Context f28873a;

        /* renamed from: b */
        public ArrayList<C11822a> f28874b = new ArrayList<>();

        /* renamed from: c */
        CharSequence f28875c;

        /* renamed from: d */
        CharSequence f28876d;

        /* renamed from: e */
        public PendingIntent f28877e;

        /* renamed from: f */
        PendingIntent f28878f;

        /* renamed from: g */
        RemoteViews f28879g;

        /* renamed from: h */
        public Bitmap f28880h;

        /* renamed from: i */
        CharSequence f28881i;

        /* renamed from: j */
        int f28882j;

        /* renamed from: k */
        public int f28883k;

        /* renamed from: l */
        boolean f28884l = true;

        /* renamed from: m */
        boolean f28885m;

        /* renamed from: n */
        C11825d f28886n;

        /* renamed from: o */
        CharSequence f28887o;

        /* renamed from: p */
        CharSequence[] f28888p;

        /* renamed from: q */
        int f28889q;

        /* renamed from: r */
        int f28890r;

        /* renamed from: s */
        boolean f28891s;

        /* renamed from: t */
        String f28892t;

        /* renamed from: u */
        boolean f28893u;

        /* renamed from: v */
        String f28894v;

        /* renamed from: w */
        boolean f28895w = false;

        /* renamed from: x */
        boolean f28896x;

        /* renamed from: y */
        boolean f28897y;

        /* renamed from: z */
        String f28898z;

        public C11824c(Context context, String str) {
            Notification notification = new Notification();
            this.f28871M = notification;
            this.f28873a = context;
            this.f28866H = str;
            notification.when = System.currentTimeMillis();
            this.f28871M.audioStreamType = -1;
            this.f28883k = 0;
            this.f28872N = new ArrayList<>();
        }

        /* renamed from: a */
        public final C11824c mo72802a(CharSequence charSequence) {
            this.f28875c = m34371d(charSequence);
            return this;
        }

        /* renamed from: b */
        public final C11824c mo72803b(CharSequence charSequence) {
            this.f28876d = m34371d(charSequence);
            return this;
        }

        /* renamed from: c */
        public final C11824c mo72804c(CharSequence charSequence) {
            this.f28871M.tickerText = m34371d(charSequence);
            return this;
        }

        /* renamed from: a */
        public final C11824c mo72801a(C11825d dVar) {
            if (this.f28886n != dVar) {
                this.f28886n = dVar;
                if (dVar != null) {
                    dVar.mo72805a(this);
                }
            }
            return this;
        }

        /* renamed from: d */
        protected static CharSequence m34371d(CharSequence charSequence) {
            return (charSequence != null && charSequence.length() > 5120) ? charSequence.subSequence(0, 5120) : charSequence;
        }
    }

    /* renamed from: com.tapjoy.internal.js$d */
    public static abstract class C11825d {

        /* renamed from: a */
        protected C11824c f28899a;

        /* renamed from: b */
        CharSequence f28900b;

        /* renamed from: c */
        CharSequence f28901c;

        /* renamed from: d */
        boolean f28902d = false;

        /* renamed from: a */
        public void mo72799a(C11820jr jrVar) {
        }

        /* renamed from: a */
        public final void mo72805a(C11824c cVar) {
            if (this.f28899a != cVar) {
                this.f28899a = cVar;
                if (cVar != null) {
                    cVar.mo72801a(this);
                }
            }
        }
    }

    /* renamed from: com.tapjoy.internal.js$b */
    public static class C11823b extends C11825d {

        /* renamed from: e */
        private CharSequence f28858e;

        /* renamed from: a */
        public final C11823b mo72798a(CharSequence charSequence) {
            this.f28900b = C11824c.m34371d(charSequence);
            return this;
        }

        /* renamed from: b */
        public final C11823b mo72800b(CharSequence charSequence) {
            this.f28858e = C11824c.m34371d(charSequence);
            return this;
        }

        /* renamed from: a */
        public final void mo72799a(C11820jr jrVar) {
            if (Build.VERSION.SDK_INT >= 16) {
                Notification.BigTextStyle bigText = new Notification.BigTextStyle(jrVar.mo72797a()).setBigContentTitle(this.f28900b).bigText(this.f28858e);
                if (this.f28902d) {
                    bigText.setSummaryText(this.f28901c);
                }
            }
        }
    }

    /* renamed from: a */
    public static Bundle m34367a(Notification notification) {
        if (Build.VERSION.SDK_INT >= 19) {
            return notification.extras;
        }
        if (Build.VERSION.SDK_INT >= 16) {
            return C11827ju.m34383a(notification);
        }
        return null;
    }
}

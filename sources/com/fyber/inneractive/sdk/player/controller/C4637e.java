package com.fyber.inneractive.sdk.player.controller;

import com.fyber.inneractive.sdk.config.C4345y;
import com.fyber.inneractive.sdk.config.C4346z;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.enums.Skip;
import com.fyber.inneractive.sdk.config.enums.TapAction;
import com.fyber.inneractive.sdk.config.global.C4309s;
import com.fyber.inneractive.sdk.config.global.features.C4292j;
import com.fyber.inneractive.sdk.player.C4591c;
import com.fyber.inneractive.sdk.player.enums.C4668b;
import com.fyber.inneractive.sdk.player.enums.VideoClickOrigin;
import com.fyber.inneractive.sdk.player.p191ui.C5095d;
import com.fyber.inneractive.sdk.util.C5364p0;
import com.fyber.inneractive.sdk.util.IAlog;

/* renamed from: com.fyber.inneractive.sdk.player.controller.e */
public class C4637e extends C4652k<C4663s> {

    /* renamed from: A */
    public boolean f11574A;

    /* renamed from: y */
    public boolean f11575y = false;

    /* renamed from: z */
    public boolean f11576z = false;

    public C4637e(C4591c cVar, C5095d dVar, C4346z zVar, C4309s sVar, boolean z, boolean z2, Skip skip, boolean z3) {
        super(cVar, dVar, zVar, sVar, z2, skip);
        this.f11575y = z;
        this.f11574A = z3;
    }

    /* renamed from: a */
    public void mo24891a(boolean z) {
        C4591c cVar;
        C4640g gVar;
        if (z && (cVar = this.f11610a) != null && (gVar = cVar.f11406b) != null && !gVar.f11583e.equals(C4668b.f11663i) && !this.f11613d.mo25750d()) {
            mo24928h(false);
        }
        super.mo24891a(z);
    }

    /* renamed from: b */
    public void mo24892b() {
        if (this.f11617h) {
            mo24947q();
        } else {
            mo24893i();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0020, code lost:
        r3 = (r3 = r3.f11406b).f11583e;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo24880d(boolean r3) {
        /*
            r2 = this;
            super.mo24880d(r3)
            boolean r3 = r2.f11575y
            r0 = 0
            if (r3 == 0) goto L_0x0014
            com.fyber.inneractive.sdk.player.ui.i r3 = r2.f11613d
            r3.mo25752f()
            com.fyber.inneractive.sdk.player.ui.i r3 = r2.f11613d
            r3.mo25749d(r0)
            r2.f11615f = r0
        L_0x0014:
            r2.mo24948x()
            com.fyber.inneractive.sdk.player.c r3 = r2.f11610a
            if (r3 == 0) goto L_0x002c
            com.fyber.inneractive.sdk.player.controller.g r3 = r3.f11406b
            if (r3 != 0) goto L_0x0020
            goto L_0x002c
        L_0x0020:
            com.fyber.inneractive.sdk.player.enums.b r3 = r3.f11583e
            com.fyber.inneractive.sdk.player.enums.b r1 = com.fyber.inneractive.sdk.player.enums.C4668b.Preparing
            if (r3 == r1) goto L_0x002a
            com.fyber.inneractive.sdk.player.enums.b r1 = com.fyber.inneractive.sdk.player.enums.C4668b.Prepared
            if (r3 != r1) goto L_0x002c
        L_0x002a:
            r3 = 1
            goto L_0x002d
        L_0x002c:
            r3 = r0
        L_0x002d:
            com.fyber.inneractive.sdk.player.ui.i r1 = r2.f11613d
            r1.mo25746b(r3)
            com.fyber.inneractive.sdk.player.ui.i r3 = r2.f11613d
            r3.mo25748c(r0)
            com.fyber.inneractive.sdk.player.ui.i r3 = r2.f11613d
            com.fyber.inneractive.sdk.player.ui.b r1 = new com.fyber.inneractive.sdk.player.ui.b
            r1.<init>()
            r1.f13629b = r0
            com.fyber.inneractive.sdk.player.ui.a r0 = new com.fyber.inneractive.sdk.player.ui.a
            r0.<init>(r1)
            r3.mo25742a((com.fyber.inneractive.sdk.player.p191ui.C5092a) r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.controller.C4637e.mo24880d(boolean):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0044  */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo24893i() {
        /*
            r7 = this;
            super.mo24893i()
            com.fyber.inneractive.sdk.player.c r0 = r7.f11610a
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0077
            com.fyber.inneractive.sdk.player.controller.g r0 = r0.f11406b
            if (r0 == 0) goto L_0x0077
            boolean r0 = r7.f11576z
            if (r0 == 0) goto L_0x0013
            goto L_0x0077
        L_0x0013:
            r0 = 2
            com.fyber.inneractive.sdk.player.ui.i r3 = r7.f11613d     // Catch:{ all -> 0x002b }
            android.content.Context r3 = r3.getContext()     // Catch:{ all -> 0x002b }
            java.lang.String r4 = "audio"
            java.lang.Object r3 = r3.getSystemService(r4)     // Catch:{ all -> 0x002b }
            android.media.AudioManager r3 = (android.media.AudioManager) r3     // Catch:{ all -> 0x002b }
            int r4 = r3.getRingerMode()     // Catch:{ all -> 0x002b }
            int r3 = r3.getStreamVolume(r0)     // Catch:{ all -> 0x002c }
            goto L_0x002d
        L_0x002b:
            r4 = r2
        L_0x002c:
            r3 = r2
        L_0x002d:
            boolean r5 = r7.f11575y
            if (r5 != 0) goto L_0x0041
            com.fyber.inneractive.sdk.config.z r5 = r7.f11611b
            com.fyber.inneractive.sdk.config.y r5 = (com.fyber.inneractive.sdk.config.C4345y) r5
            com.fyber.inneractive.sdk.config.a0 r5 = r5.f10750f
            java.lang.Boolean r5 = r5.f10573d
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L_0x0041
            r5 = r1
            goto L_0x0042
        L_0x0041:
            r5 = r2
        L_0x0042:
            if (r5 != 0) goto L_0x006f
            boolean r5 = r7.f11574A
            if (r5 == 0) goto L_0x0056
            com.fyber.inneractive.sdk.config.z r5 = r7.f11611b
            com.fyber.inneractive.sdk.config.y r5 = (com.fyber.inneractive.sdk.config.C4345y) r5
            com.fyber.inneractive.sdk.config.a0 r5 = r5.f10750f
            com.fyber.inneractive.sdk.config.enums.UnitDisplayType r5 = r5.f10579j
            com.fyber.inneractive.sdk.config.enums.UnitDisplayType r6 = com.fyber.inneractive.sdk.config.enums.UnitDisplayType.REWARDED
            if (r5 == r6) goto L_0x0056
            r5 = r1
            goto L_0x0057
        L_0x0056:
            r5 = r2
        L_0x0057:
            if (r5 == 0) goto L_0x005a
            goto L_0x006f
        L_0x005a:
            if (r3 <= 0) goto L_0x0072
            if (r4 != r0) goto L_0x0072
            java.lang.Object[] r0 = new java.lang.Object[r1]
            java.lang.String r3 = com.fyber.inneractive.sdk.util.IAlog.m16696a((java.lang.Object) r7)
            r0[r2] = r3
            java.lang.String r3 = "%s setting default volume. unmuting player"
            com.fyber.inneractive.sdk.util.IAlog.m16699a(r3, r0)
            r7.mo24943i(r2)
            goto L_0x0072
        L_0x006f:
            r7.mo24939f(r2)
        L_0x0072:
            r7.mo24949z()
            r7.f11576z = r1
        L_0x0077:
            r7.mo24928h(r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.controller.C4637e.mo24893i():boolean");
    }

    /* renamed from: l */
    public int mo24894l() {
        return IAConfigManager.f10525J.f10557v.f10660b.mo24345a("VideoFullscreenBufferingTimeout", 12, 1) * 1000;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0033  */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo24895n() {
        /*
            r6 = this;
            com.fyber.inneractive.sdk.config.IAConfigManager r0 = com.fyber.inneractive.sdk.config.IAConfigManager.f10525J
            com.fyber.inneractive.sdk.config.i r0 = r0.f10557v
            com.fyber.inneractive.sdk.config.h r0 = r0.f10660b
            com.fyber.inneractive.sdk.config.z r1 = r6.f11611b
            com.fyber.inneractive.sdk.config.enums.Skip r2 = r6.f11633x
            java.lang.String r3 = "vast_configuration"
            com.fyber.inneractive.sdk.config.f r0 = r0.mo24346a((java.lang.String) r3)
            java.lang.String r3 = "skip_d"
            r0.getClass()
            r4 = -1
            java.util.Map<java.lang.String, java.lang.String> r5 = r0.f10609a     // Catch:{ Exception -> 0x002b }
            boolean r5 = r5.containsKey(r3)     // Catch:{ Exception -> 0x002b }
            if (r5 == 0) goto L_0x002b
            java.util.Map<java.lang.String, java.lang.String> r0 = r0.f10609a     // Catch:{ Exception -> 0x002b }
            java.lang.Object r0 = r0.get(r3)     // Catch:{ Exception -> 0x002b }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x002b }
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ Exception -> 0x002b }
            goto L_0x002c
        L_0x002b:
            r0 = r4
        L_0x002c:
            int r0 = java.lang.Math.max(r0, r4)
            if (r0 <= r4) goto L_0x0033
            goto L_0x004b
        L_0x0033:
            if (r2 != 0) goto L_0x003b
            com.fyber.inneractive.sdk.config.y r1 = (com.fyber.inneractive.sdk.config.C4345y) r1
            com.fyber.inneractive.sdk.config.a0 r0 = r1.f10750f
            com.fyber.inneractive.sdk.config.enums.Skip r2 = r0.f10577h
        L_0x003b:
            com.fyber.inneractive.sdk.config.enums.Skip r0 = com.fyber.inneractive.sdk.config.enums.Skip.DEFAULT
            if (r2 != r0) goto L_0x0043
            r0 = 99999(0x1869f, float:1.40128E-40)
            goto L_0x004b
        L_0x0043:
            java.lang.Integer r0 = r2.value()
            int r0 = r0.intValue()
        L_0x004b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.controller.C4637e.mo24895n():int");
    }

    /* renamed from: p */
    public void mo24896p() {
        this.f11630u = true;
        IAlog.m16699a("%s onBufferingTimeout reached. Skipping to end card", IAlog.m16696a((Object) this));
        mo24878c(false);
    }

    /* renamed from: r */
    public void mo24897r() {
        ListenerT listenert = this.f11616g;
        if (listenert != null) {
            listenert.mo24999k();
        }
    }

    /* renamed from: t */
    public void mo24898t() {
        this.f11613d.mo25749d(true);
        mo24948x();
        mo24944k();
        mo24893i();
        mo24928h(true);
    }

    /* renamed from: v */
    public void mo24899v() {
        super.mo24899v();
        this.f11613d.mo25746b(false);
        if (this.f11575y) {
            this.f11613d.mo25752f();
        }
    }

    /* renamed from: w */
    public boolean mo24900w() {
        return !this.f11575y;
    }

    /* renamed from: y */
    public void mo24901y() {
        C4640g gVar;
        super.mo24901y();
        C4591c cVar = this.f11610a;
        if (cVar != null && (gVar = cVar.f11406b) != null && gVar.f11583e.equals(C4668b.f11663i) && this.f11575y) {
            this.f11613d.mo25752f();
        }
    }

    /* renamed from: a */
    public void mo24890a(C5364p0 p0Var) {
        C4292j.C4294b bVar;
        TapAction tapAction = ((C4345y) this.f11611b).f10750f.f10578i;
        if (tapAction == TapAction.CTR) {
            mo24937a(false, VideoClickOrigin.VIDEO, p0Var);
        } else if (tapAction == TapAction.FULLSCREEN || tapAction == TapAction.DO_NOTHING) {
            String a = ((C4292j) this.f11612c.mo24338a(C4292j.class)).mo24311a("click_action", "none");
            C4292j.C4294b[] values = C4292j.C4294b.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    bVar = C4292j.C4294b.NONE;
                    break;
                }
                bVar = values[i];
                if (a.equalsIgnoreCase(bVar.f10632a)) {
                    break;
                }
                i++;
            }
            if (bVar.equals(C4292j.C4294b.OPEN)) {
                mo24937a(false, VideoClickOrigin.VIDEO, p0Var);
            }
        } else {
            IAlog.m16699a("% sonVideoClicked called, but we recieved an unknown tap action %s", IAlog.m16696a((Object) this), tapAction);
        }
    }
}

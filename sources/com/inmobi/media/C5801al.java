package com.inmobi.media;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.ads.rendering.InMobiAdActivity;
import com.inmobi.media.C5762ad;
import com.smaato.sdk.video.vast.model.ErrorCode;
import com.tapjoy.TJAdUnitConstants;

/* renamed from: com.inmobi.media.al */
/* compiled from: InterstitialAdUnit */
public class C5801al extends C5762ad {

    /* renamed from: x */
    private static final String f14629x = C5801al.class.getSimpleName();

    /* renamed from: y */
    private int f14630y = 0;

    /* renamed from: z */
    private boolean f14631z = false;

    /* renamed from: a */
    public void mo34609a(int i, C6337q qVar) {
    }

    /* renamed from: k */
    public String mo34539k() {
        return "int";
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final byte mo34541l() {
        return 1;
    }

    public C5801al(Context context, C5846ba baVar, C5762ad.C5780a aVar) {
        super(context, baVar, aVar);
        baVar.mo34779e();
        mo34470a(context, baVar, aVar);
        mo34501b("activity");
    }

    /* renamed from: t */
    public C6337q mo34550t() {
        C6337q t = super.mo34550t();
        if (this.f14631z && t != null) {
            t.mo35497a();
        }
        return t;
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x00b6 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00b7  */
    /* renamed from: aa */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m17255aa() {
        /*
            r9 = this;
            boolean r0 = r9.mo34554x()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0015
            com.inmobi.ads.InMobiAdRequestStatus r0 = new com.inmobi.ads.InMobiAdRequestStatus
            com.inmobi.ads.InMobiAdRequestStatus$StatusCode r3 = com.inmobi.ads.InMobiAdRequestStatus.StatusCode.MISSING_REQUIRED_DEPENDENCIES
            r0.<init>(r3)
            r3 = 39
            r9.mo34472a((com.inmobi.ads.InMobiAdRequestStatus) r0, (boolean) r2, (byte) r3)
            return r1
        L_0x0015:
            com.inmobi.media.ad$a r0 = r9.mo34546p()
            if (r0 != 0) goto L_0x001c
            return r1
        L_0x001c:
            byte r3 = r9.mo34537j()
            r4 = 53
            java.lang.String r5 = "An ad load is already in progress. Please wait for the load to complete before requesting for another ad for placement id: "
            r6 = 2
            java.lang.String r7 = "InMobiInterstitial"
            if (r3 == r2) goto L_0x0099
            if (r3 == r6) goto L_0x005f
            r4 = 6
            if (r3 == r4) goto L_0x0034
            r4 = 7
            if (r3 == r4) goto L_0x0034
            r0 = r1
            goto L_0x00b4
        L_0x0034:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "An ad is currently being viewed by the user. Please wait for the user to close the ad before requesting for another ad for placement id: "
            r3.<init>(r4)
            com.inmobi.media.ba r4 = r9.mo34535i()
            java.lang.String r4 = r4.toString()
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            com.inmobi.media.C6238hu.m18605a((byte) r2, (java.lang.String) r7, (java.lang.String) r3)
            com.inmobi.ads.InMobiAdRequestStatus r3 = new com.inmobi.ads.InMobiAdRequestStatus
            com.inmobi.ads.InMobiAdRequestStatus$StatusCode r4 = com.inmobi.ads.InMobiAdRequestStatus.StatusCode.AD_ACTIVE
            r3.<init>(r4)
            r4 = 15
            r9.mo34465a((byte) r4)
            if (r0 == 0) goto L_0x00b3
            r0.mo34584a((com.inmobi.media.C5762ad) r9, (com.inmobi.ads.InMobiAdRequestStatus) r3)
            goto L_0x00b3
        L_0x005f:
            java.lang.String r3 = r9.mo34544n()
            java.lang.String r8 = "html"
            boolean r3 = r8.equals(r3)
            if (r3 != 0) goto L_0x007e
            java.lang.String r3 = r9.mo34544n()
            java.lang.String r8 = "htmlUrl"
            boolean r3 = r8.equals(r3)
            if (r3 == 0) goto L_0x0078
            goto L_0x007e
        L_0x0078:
            if (r0 == 0) goto L_0x00b3
            r9.mo34499b((com.inmobi.media.C5762ad.C5780a) r0)
            goto L_0x00b3
        L_0x007e:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r5)
            com.inmobi.media.ba r3 = r9.mo34535i()
            java.lang.String r3 = r3.toString()
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            com.inmobi.media.C6238hu.m18605a((byte) r2, (java.lang.String) r7, (java.lang.String) r0)
            r9.mo34497b((byte) r4)
            goto L_0x00b3
        L_0x0099:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r5)
            com.inmobi.media.ba r3 = r9.mo34535i()
            java.lang.String r3 = r3.toString()
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            com.inmobi.media.C6238hu.m18605a((byte) r2, (java.lang.String) r7, (java.lang.String) r0)
            r9.mo34497b((byte) r4)
        L_0x00b3:
            r0 = r2
        L_0x00b4:
            if (r0 == 0) goto L_0x00b7
            return r1
        L_0x00b7:
            r0 = 4
            byte r3 = r9.mo34537j()
            if (r0 != r3) goto L_0x00db
            boolean r0 = r9.mo34547q()
            if (r0 == 0) goto L_0x00c8
            r9.mo34441D()
            goto L_0x00db
        L_0x00c8:
            com.inmobi.media.ad$a r0 = r9.mo34546p()
            if (r0 != 0) goto L_0x00d4
            java.lang.String r0 = "Listener was garbage collected. Unable to give callback"
            com.inmobi.media.C6238hu.m18605a((byte) r6, (java.lang.String) r7, (java.lang.String) r0)
            goto L_0x00da
        L_0x00d4:
            r9.mo34499b((com.inmobi.media.C5762ad.C5780a) r0)
            r9.mo34511c((com.inmobi.media.C5762ad.C5780a) r0)
        L_0x00da:
            return r1
        L_0x00db:
            r9.f14546l = r1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C5801al.m17255aa():boolean");
    }

    /* renamed from: y */
    public void mo34555y() {
        if (m17255aa()) {
            super.mo34555y();
        }
    }

    /* renamed from: a */
    public void mo34493a(byte[] bArr) {
        if (m17255aa()) {
            super.mo34493a(bArr);
        }
    }

    /* renamed from: h */
    public void mo34661h(C5762ad.C5780a aVar) {
        if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
            mo34472a(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.CALLED_FROM_WRONG_THREAD), false, (byte) 44);
            C6238hu.m18605a((byte) 1, "InMobiInterstitial", "Please ensure that you call show() on the UI thread");
        } else if (aVar == null) {
            C6238hu.m18605a((byte) 2, "InMobiInterstitial", "Listener was garbage collected. Unable to give callback");
        } else if (!mo34607Y()) {
            C6238hu.m18605a((byte) 1, f14629x, "Ad Load is not complete. Please wait for the Ad to be in a ready state before calling show.");
            mo34474a(aVar, (byte) 50);
        } else {
            mo34473a(aVar);
            this.f14536b = 6;
            if (!TJAdUnitConstants.String.HTML.equals(mo34544n()) && !"htmlUrl".equals(mo34544n())) {
                this.f14557w.mo35434a(hashCode(), new C5800ak(this, aVar));
            } else if (mo34547q()) {
                mo34660b(aVar, (byte) 36);
                C6286j s = mo34549s();
                if (s != null) {
                    s.destroy();
                }
            } else {
                mo34662i(aVar);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final void mo34662i(C5762ad.C5780a aVar) {
        boolean b = m17258b(mo34533h());
        if (aVar == null) {
            C6238hu.m18605a((byte) 2, "InMobiInterstitial", "Listener was garbage collected. Unable to give callback");
        } else if (!b) {
            this.f14536b = 3;
            mo34474a(aVar, (byte) 51);
        } else {
            aVar.mo34590b();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public boolean m17258b(Context context) {
        if (context == null) {
            return false;
        }
        try {
            InMobiAdActivity.class.getSimpleName();
            C6286j s = mo34549s();
            if (s != null) {
                if (!"unknown".equals(s.getMarkupType())) {
                    int a = InMobiAdActivity.m23427a(s);
                    Intent intent = new Intent(context, InMobiAdActivity.class);
                    intent.putExtra("com.inmobi.ads.rendering.InMobiAdActivity.EXTRA_AD_CONTAINER_INDEX", a);
                    intent.putExtra("com.inmobi.ads.rendering.InMobiAdActivity.EXTRA_AD_ACTIVITY_TYPE", 102);
                    if (mo34544n().equals("htmlUrl")) {
                        intent.putExtra("com.inmobi.ads.rendering.InMobiAdActivity.EXTRA_AD_CONTAINER_TYPE", ErrorCode.DIFFERENT_DURATION_EXPECTED_ERROR);
                    } else if (mo34544n().equals(TJAdUnitConstants.String.HTML)) {
                        intent.putExtra("com.inmobi.ads.rendering.InMobiAdActivity.EXTRA_AD_CONTAINER_TYPE", 200);
                    } else {
                        intent.putExtra("com.inmobi.ads.rendering.InMobiAdActivity.EXTRA_AD_CONTAINER_TYPE", ErrorCode.DIFFERENT_LINEARITY_EXPECTED_ERROR);
                    }
                    intent.putExtra("com.inmobi.ads.rendering.InMobiAdActivity.EXTRA_AD_ACTIVITY_IS_FULL_SCREEN", true);
                    if (this.f14556v) {
                        if (this.f14554t == -1) {
                            this.f14554t = System.currentTimeMillis();
                        }
                        if (this.f14553s > 0) {
                            intent.setFlags(603979776);
                        }
                    }
                    C6227ho.m18540a(context, intent);
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            C6238hu.m18605a((byte) 1, "InMobiInterstitial", "Cannot show ad; SDK encountered an unexpected error");
            C6181gg.m18398a().mo35357a(new C6217hg(e));
            return false;
        }
    }

    /* renamed from: Y */
    public boolean mo34607Y() {
        return mo34537j() == 4;
    }

    /* renamed from: Z */
    public void mo34608Z() {
        C6286j s = mo34549s();
        if (s != null) {
            this.f14631z = true;
            s.mo35497a();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public final Integer mo34553w() {
        return Integer.valueOf(this.f14537c.minimumRefreshInterval);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo34492a(boolean z, InMobiAdRequestStatus inMobiAdRequestStatus) {
        super.mo34492a(z, inMobiAdRequestStatus);
        if (mo34537j() == 2) {
            C6238hu.m18605a((byte) 2, "InMobiInterstitial", "Interstitial ad successfully fetched for placement id: " + mo34535i().toString());
            mo34454Q();
        }
    }

    /* renamed from: S */
    public void mo34456S() {
        mo34443F();
        try {
            if (!mo34455R()) {
                mo34457T();
                String n = mo34544n();
                char c = 65535;
                int hashCode = n.hashCode();
                if (hashCode != -1084172778) {
                    if (hashCode != 3213227) {
                        if (hashCode == 1236050372) {
                            if (n.equals("htmlUrl")) {
                                c = 1;
                            }
                        }
                    } else if (n.equals(TJAdUnitConstants.String.HTML)) {
                        c = 0;
                    }
                } else if (n.equals("inmobiJson")) {
                    c = 2;
                }
                if (c == 0 || c == 1) {
                    this.f14543i.post(new Runnable() {
                        public final void run() {
                            C5801al.this.mo34491a(true);
                            if (C5801al.this.f14556v) {
                                for (int i = 1; i < C5801al.this.f14550p.mo34812b().size(); i++) {
                                    C5801al.this.f14552r++;
                                    C5801al.this.mo34491a(false);
                                }
                            }
                        }
                    });
                } else if (c != 2) {
                    mo34544n();
                }
            }
        } catch (IllegalStateException unused) {
            mo34472a(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), true, (byte) 48);
        }
    }

    /* renamed from: a */
    public void mo34476a(C5838au auVar, boolean z, byte b) {
        if (!z) {
            mo34472a(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), true, b);
            return;
        }
        try {
            super.mo34476a(auVar, z, b);
        } catch (IllegalStateException unused) {
        }
        C5838au u = mo34551u();
        if (u == null) {
            mo34472a(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), true, (byte) 55);
        } else if (u.mo34731d()) {
            this.f14544j = true;
            mo34451N();
        } else {
            mo34475a(u);
        }
    }

    /* renamed from: a */
    public void mo34478a(C5846ba baVar, boolean z) {
        super.mo34478a(baVar, z);
        if (!z) {
            if (!mo34535i().equals(baVar)) {
                return;
            }
            if (2 == mo34537j() || 4 == mo34537j()) {
                this.f14536b = 0;
                mo34472a(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.AD_NO_LONGER_AVAILABLE), false, (byte) 0);
            }
        } else if (mo34535i().equals(baVar) && 2 == mo34537j()) {
            if (this.f14544j) {
                this.f14545k = true;
                mo34452O();
                return;
            }
            mo34453P();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: P */
    public final void mo34453P() {
        mo34446I();
        this.f14536b = 4;
        C5762ad.C5780a p = mo34546p();
        if (p != null && p.mo34600g()) {
            mo34511c(p);
        }
    }

    /* renamed from: j */
    public void mo34538j(C6337q qVar) {
        super.mo34538j(qVar);
        if (this.f14556v) {
            int indexOf = this.f14538d.indexOf(qVar);
            if (indexOf >= this.f14553s) {
                this.f14555u.add(Integer.valueOf(indexOf));
                boolean z = false;
                int i = 0;
                while (true) {
                    if (i >= indexOf) {
                        z = true;
                        break;
                    } else if (this.f14538d.get(i) != null) {
                        break;
                    } else {
                        i++;
                    }
                }
                if (z && mo34537j() == 2) {
                    mo34527f((byte) 2);
                    this.f14553s = indexOf;
                    m17257ac();
                }
            }
        } else if (mo34537j() == 2) {
            mo34527f((byte) 2);
            m17257ac();
        }
    }

    /* renamed from: k */
    public void mo34540k(C6337q qVar) {
        super.mo34540k(qVar);
        if (this.f14556v) {
            int indexOf = this.f14538d.indexOf(qVar);
            mo34518d(indexOf);
            boolean z = false;
            boolean z2 = true;
            int i = 0;
            boolean z3 = true;
            while (true) {
                if (i >= this.f14538d.size()) {
                    z = z2;
                    i = -1;
                    break;
                }
                if (!(i == indexOf || this.f14538d.get(i) == null)) {
                    if (this.f14555u.contains(Integer.valueOf(i))) {
                        break;
                    }
                    z2 = false;
                    z3 = false;
                }
                i++;
            }
            if (i != -1) {
                if (z3 && mo34537j() == 2) {
                    mo34527f((byte) 2);
                    this.f14553s = i;
                    m17257ac();
                }
            } else if (z) {
                m17256ab();
            }
        } else {
            m17256ab();
        }
    }

    /* renamed from: ab */
    private void m17256ab() {
        if (mo34537j() == 2) {
            mo34527f((byte) 2);
            this.f14536b = 3;
            C6238hu.m18605a((byte) 2, "InMobiInterstitial", "Failed to load the Interstitial markup in the WebView for placement id: " + mo34535i().toString());
            mo34472a(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), false, (byte) 43);
        }
    }

    /* renamed from: ac */
    private void m17257ac() {
        C6238hu.m18605a((byte) 2, "InMobiInterstitial", "Successfully loaded Interstitial ad markup in the WebView for placement id: " + mo34535i().toString());
        mo34439B();
        mo34453P();
    }

    /* access modifiers changed from: protected */
    /* renamed from: G */
    public final void mo34444G() {
        if (2 == mo34537j()) {
            mo34527f((byte) 2);
            this.f14536b = 3;
            C6238hu.m18605a((byte) 2, "InMobiInterstitial", "Failed to load the Interstitial markup in the WebView for placement id: " + mo34535i().toString());
            mo34472a(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), false, (byte) 42);
        }
    }

    /* renamed from: a_ */
    public synchronized void mo34610a_(C6337q qVar) {
        super.mo34610a_(qVar);
        this.f14543i.post(new Runnable() {
            public final void run() {
                C5801al alVar = C5801al.this;
                alVar.mo34528f(alVar.mo34546p());
            }
        });
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final void mo34528f(C5762ad.C5780a aVar) {
        if (mo34537j() == 6) {
            int i = this.f14630y + 1;
            this.f14630y = i;
            if (i == 1) {
                C6238hu.m18605a((byte) 2, "InMobiInterstitial", "Successfully displayed Interstitial for placement id: " + mo34535i().toString());
                if (aVar != null) {
                    if ((mo34544n().equals(TJAdUnitConstants.String.HTML) || mo34544n().equals("htmlUrl")) && !mo34458U()) {
                        mo34526f();
                    }
                    mo34519d(aVar);
                    return;
                }
                return;
            }
            this.f14536b = 7;
        } else if (mo34537j() == 7) {
            this.f14630y++;
        }
    }

    /* renamed from: b_ */
    public synchronized void mo34616b_(C6337q qVar) {
        super.mo34616b_(qVar);
        this.f14543i.post(new Runnable() {
            public final void run() {
                C5801al alVar = C5801al.this;
                alVar.mo34531g(alVar.mo34546p());
            }
        });
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final void mo34531g(C5762ad.C5780a aVar) {
        if (mo34537j() == 7) {
            int i = this.f14630y - 1;
            this.f14630y = i;
            if (i == 1) {
                this.f14536b = 6;
            }
        } else if (mo34537j() == 6) {
            this.f14630y--;
            C6238hu.m18605a((byte) 2, "InMobiInterstitial", "Interstitial ad dismissed for placement id: " + mo34535i().toString());
            if (aVar != null) {
                aVar.mo34595c();
            } else {
                C6238hu.m18605a((byte) 2, "InMobiInterstitial", "Listener was garbage collected. Unable to give callback");
            }
        }
    }

    /* renamed from: H */
    public boolean mo34445H() {
        return 2 == mo34537j();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Q */
    public final void mo34454Q() {
        C5762ad.C5780a p = mo34546p();
        if (p != null) {
            mo34499b(p);
        }
    }

    /* renamed from: b */
    public void mo34501b(String str) {
        super.mo34501b("activity");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: F */
    public final void mo34443F() {
        super.mo34443F();
        this.f14630y = 0;
    }

    /* renamed from: g */
    public void mo34530g() {
        Activity fullScreenActivity;
        super.mo34530g();
        C6286j s = mo34549s();
        if ((s instanceof C6337q) && (fullScreenActivity = ((C6337q) s).getFullScreenActivity()) != null) {
            this.f14551q = true;
            fullScreenActivity.finish();
        }
    }

    /* renamed from: D */
    public void mo34441D() {
        super.mo34441D();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo34471a(InMobiAdRequestStatus inMobiAdRequestStatus) {
        if (this.f14556v) {
            if (mo34537j() != 2) {
                mo34461X();
                return;
            } else if (this.f14555u.isEmpty()) {
                mo34461X();
            } else {
                mo34527f((byte) 2);
                this.f14555u.first();
                this.f14553s = ((Integer) this.f14555u.first()).intValue();
                m17257ac();
                for (int i = 0; i < this.f14538d.size(); i++) {
                    if (!this.f14555u.contains(Integer.valueOf(i))) {
                        mo34518d(i);
                    }
                }
                return;
            }
        }
        super.mo34471a(inMobiAdRequestStatus);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo34660b(C5762ad.C5780a aVar, byte b) {
        this.f14536b = 0;
        if (aVar != null) {
            mo34474a(aVar, b);
        } else {
            C6238hu.m18605a((byte) 2, "InMobiInterstitial", "Listener was garbage collected. Unable to give callback");
        }
    }

    /* renamed from: a */
    public void mo34467a(int i, final C6337q qVar, final Context context) {
        if (this.f14556v) {
            if (!this.f14555u.contains(Integer.valueOf(i)) || i <= this.f14538d.indexOf(qVar) || i >= this.f14538d.size() || this.f14538d.get(i) == null || !((C6337q) this.f14538d.get(i)).f16125w) {
                mo34468a(this.f14538d.indexOf(qVar), false);
                return;
            }
            if (context == null) {
                context = mo34533h();
            }
            super.mo34467a(i, qVar, context);
            this.f14543i.post(new Runnable() {
                public final void run() {
                    final int indexOf = C5801al.this.f14538d.indexOf(qVar);
                    if (indexOf >= 0 && indexOf < C5801al.this.f14538d.size()) {
                        boolean a = C5801al.this.m17258b(context);
                        if (!a) {
                            C5801al.this.mo34523e(indexOf);
                        }
                        C5801al.this.mo34468a(indexOf, a);
                        C5801al.this.f14543i.post(new Runnable() {
                            public final void run() {
                                C5801al.this.mo34518d(indexOf);
                            }
                        });
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public void mo34482a(C6337q qVar, Context context) {
        if (this.f14556v) {
            Integer num = (Integer) this.f14555u.higher(Integer.valueOf(this.f14538d.indexOf(qVar)));
            if (num != null) {
                mo34467a(num.intValue(), qVar, context);
            } else {
                mo34614b();
            }
        }
    }

    /* renamed from: b */
    public boolean mo34506b(C6337q qVar) {
        if (this.f14556v) {
            if (((Integer) this.f14555u.higher(Integer.valueOf(this.f14538d.indexOf(qVar)))) != null) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public void mo34614b() {
        if (this.f14556v) {
            this.f14543i.post(new Runnable() {
                public final void run() {
                    C5801al.this.mo34442E();
                    C6238hu.m18605a((byte) 2, "InMobiInterstitial", "Interstitial ad dismissed for placement id: " + C5801al.this.mo34535i().toString());
                    if (C5801al.this.mo34546p() != null) {
                        C5801al.this.mo34546p().mo34595c();
                    } else {
                        C6238hu.m18605a((byte) 2, "InMobiInterstitial", "Listener was garbage collected. Unable to give callback");
                    }
                }
            });
        }
    }
}

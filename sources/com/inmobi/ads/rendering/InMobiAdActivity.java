package com.inmobi.ads.rendering;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.inmobi.media.C5933cp;
import com.inmobi.media.C5951ct;
import com.inmobi.media.C5953cu;
import com.inmobi.media.C5956cw;
import com.inmobi.media.C5975dd;
import com.inmobi.media.C6002du;
import com.inmobi.media.C6125fq;
import com.inmobi.media.C6144fr;
import com.inmobi.media.C6181gg;
import com.inmobi.media.C6217hg;
import com.inmobi.media.C6227ho;
import com.inmobi.media.C6238hu;
import com.inmobi.media.C6248i;
import com.inmobi.media.C6252ic;
import com.inmobi.media.C6286j;
import com.inmobi.media.C6337q;
import com.inmobi.media.C6357s;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.vungle.warren.model.ReportDBAdapter;
import java.util.Set;

public class InMobiAdActivity extends Activity {

    /* renamed from: c */
    private static final String f19384c = InMobiAdActivity.class.getSimpleName();

    /* renamed from: d */
    private static SparseArray<C6286j> f19385d = new SparseArray<>();

    /* renamed from: e */
    private static C6337q f19386e;

    /* renamed from: f */
    private static C6357s f19387f;

    /* renamed from: a */
    public C5953cu f19388a;

    /* renamed from: b */
    public boolean f19389b = false;

    /* renamed from: g */
    private C5951ct f19390g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public C6337q f19391h;

    /* renamed from: i */
    private int f19392i;

    /* renamed from: j */
    private boolean f19393j = false;

    /* renamed from: a */
    public static int m23427a(C6286j jVar) {
        int hashCode = jVar.hashCode();
        f19385d.put(hashCode, jVar);
        return hashCode;
    }

    /* renamed from: a */
    public static void m23431a(Object obj) {
        f19385d.remove(obj.hashCode());
    }

    /* renamed from: a */
    public static void m23429a(C6337q qVar) {
        f19386e = qVar;
    }

    /* renamed from: a */
    public static void m23430a(C6357s sVar) {
        f19387f = sVar;
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        C5951ct ctVar;
        super.onResume();
        if (!this.f19389b) {
            int i = this.f19392i;
            if (100 == i) {
                C6337q qVar = this.f19391h;
                if (qVar != null && qVar.getFullScreenEventsListener() != null) {
                    try {
                        if (!this.f19393j) {
                            this.f19393j = true;
                            this.f19391h.getFullScreenEventsListener().mo35511a(this.f19391h);
                        }
                    } catch (Exception unused) {
                    }
                }
            } else if (102 == i && (ctVar = this.f19390g) != null && ctVar.f15105b != null) {
                ctVar.f15105b.mo35024c();
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        C5951ct ctVar;
        super.onStart();
        if (!this.f19389b && 102 == this.f19392i && (ctVar = this.f19390g) != null && ctVar.f15105b != null) {
            ctVar.f15105b.mo35023b();
        }
    }

    /* access modifiers changed from: protected */
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        this.f19393j = false;
        this.f19391h = null;
        setIntent(intent);
        C5951ct ctVar = this.f19390g;
        if (ctVar != null) {
            ctVar.mo35031a(intent, f19385d);
            if (ctVar.f15105b != null) {
                ctVar.f15105b.mo35023b();
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        C6357s sVar;
        C6125fq fqVar;
        C6125fq fqVar2;
        super.onCreate(bundle);
        if (!C6227ho.m18545a()) {
            finish();
            C6238hu.m18605a((byte) 2, "InMobi", "Session not found, AdActivity will be closed");
            return;
        }
        this.f19393j = false;
        if (Build.VERSION.SDK_INT >= 29) {
            C6252ic.m18657a((Context) this);
        }
        this.f19392i = getIntent().getIntExtra("com.inmobi.ads.rendering.InMobiAdActivity.EXTRA_AD_ACTIVITY_TYPE", 102);
        this.f19388a = new C5953cu(this);
        int i = this.f19392i;
        if (i == 100) {
            String stringExtra = getIntent().getStringExtra("com.inmobi.ads.rendering.InMobiAdActivity.IN_APP_BROWSER_URL");
            long longExtra = getIntent().getLongExtra(ReportDBAdapter.ReportColumns.COLUMN_PLACEMENT_ID, Long.MIN_VALUE);
            boolean booleanExtra = getIntent().getBooleanExtra("allowAutoRedirection", false);
            String stringExtra2 = getIntent().getStringExtra("impressionId");
            String stringExtra3 = getIntent().getStringExtra("creativeId");
            C6357s sVar2 = C6337q.f16049a;
            C6337q qVar = f19386e;
            if (qVar != null) {
                sVar2 = qVar.getListener();
                fqVar2 = f19386e.getAdConfig();
            } else {
                fqVar2 = (C6125fq) C6144fr.m18314a(CampaignUnit.JSON_KEY_ADS, C6227ho.m18559f());
                C6357s sVar3 = f19387f;
                if (sVar3 != null) {
                    fqVar = fqVar2;
                    sVar = sVar3;
                    C6337q qVar2 = r1;
                    C6337q qVar3 = new C6337q(this, (byte) 1, (Set<C6002du>) null, stringExtra2, Boolean.TRUE, "DEFAULT");
                    this.f19391h = qVar2;
                    qVar2.setPlacementId(longExtra);
                    this.f19391h.setCreativeId(stringExtra3);
                    this.f19391h.setAllowAutoRedirection(booleanExtra);
                    this.f19391h.setShouldFireRenderBeacon(false);
                    this.f19391h.mo35608a(sVar, fqVar, false, false);
                    RelativeLayout relativeLayout = new RelativeLayout(this);
                    RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
                    layoutParams.addRule(10);
                    layoutParams.addRule(2, C6248i.f15814c);
                    relativeLayout.setBackgroundColor(-1);
                    relativeLayout.addView(this.f19391h, layoutParams);
                    float f = C6252ic.m18655a().f15840c;
                    LinearLayout linearLayout = new LinearLayout(this);
                    RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, (int) (48.0f * f));
                    linearLayout.setOrientation(0);
                    linearLayout.setId(C6248i.f15814c);
                    linearLayout.setWeightSum(100.0f);
                    linearLayout.setBackgroundResource(17301658);
                    linearLayout.setBackgroundColor(-7829368);
                    layoutParams2.addRule(12);
                    relativeLayout.addView(linearLayout, layoutParams2);
                    LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -1);
                    layoutParams3.weight = 25.0f;
                    C5933cp cpVar = new C5933cp(this, f, (byte) 2);
                    cpVar.setOnTouchListener(new View.OnTouchListener() {
                        public final boolean onTouch(View view, MotionEvent motionEvent) {
                            if (motionEvent.getAction() == 1) {
                                view.setBackgroundColor(-7829368);
                                InMobiAdActivity.this.f19389b = true;
                                InMobiAdActivity.this.finish();
                                return true;
                            }
                            if (motionEvent.getAction() == 0) {
                                view.setBackgroundColor(-16711681);
                            }
                            return true;
                        }
                    });
                    linearLayout.addView(cpVar, layoutParams3);
                    C5933cp cpVar2 = new C5933cp(this, f, (byte) 3);
                    cpVar2.setOnTouchListener(new View.OnTouchListener() {
                        public final boolean onTouch(View view, MotionEvent motionEvent) {
                            if (motionEvent.getAction() == 1) {
                                view.setBackgroundColor(-7829368);
                                InMobiAdActivity.this.f19391h.reload();
                                return true;
                            }
                            if (motionEvent.getAction() == 0) {
                                view.setBackgroundColor(-16711681);
                            }
                            return true;
                        }
                    });
                    linearLayout.addView(cpVar2, layoutParams3);
                    C5933cp cpVar3 = new C5933cp(this, f, (byte) 4);
                    cpVar3.setOnTouchListener(new View.OnTouchListener() {
                        public final boolean onTouch(View view, MotionEvent motionEvent) {
                            if (motionEvent.getAction() == 1) {
                                view.setBackgroundColor(-7829368);
                                if (InMobiAdActivity.this.f19391h.canGoBack()) {
                                    InMobiAdActivity.this.f19391h.goBack();
                                } else {
                                    InMobiAdActivity.this.f19389b = true;
                                    InMobiAdActivity.this.finish();
                                }
                                return true;
                            }
                            if (motionEvent.getAction() == 0) {
                                view.setBackgroundColor(-16711681);
                            }
                            return true;
                        }
                    });
                    linearLayout.addView(cpVar3, layoutParams3);
                    C5933cp cpVar4 = new C5933cp(this, f, (byte) 6);
                    cpVar4.setOnTouchListener(new View.OnTouchListener() {
                        public final boolean onTouch(View view, MotionEvent motionEvent) {
                            if (motionEvent.getAction() == 1) {
                                view.setBackgroundColor(-7829368);
                                if (InMobiAdActivity.this.f19391h.canGoForward()) {
                                    InMobiAdActivity.this.f19391h.goForward();
                                }
                                return true;
                            }
                            if (motionEvent.getAction() == 0) {
                                view.setBackgroundColor(-16711681);
                            }
                            return true;
                        }
                    });
                    linearLayout.addView(cpVar4, layoutParams3);
                    setContentView(relativeLayout);
                    this.f19391h.loadUrl(stringExtra);
                    this.f19391h.setFullScreenActivityContext(this);
                    this.f19388a.mo35039a((C5956cw) this.f19391h);
                }
            }
            sVar = sVar2;
            fqVar = fqVar2;
            try {
                C6337q qVar22 = qVar3;
                C6337q qVar32 = new C6337q(this, (byte) 1, (Set<C6002du>) null, stringExtra2, Boolean.TRUE, "DEFAULT");
                this.f19391h = qVar22;
                qVar22.setPlacementId(longExtra);
                this.f19391h.setCreativeId(stringExtra3);
                this.f19391h.setAllowAutoRedirection(booleanExtra);
                this.f19391h.setShouldFireRenderBeacon(false);
                this.f19391h.mo35608a(sVar, fqVar, false, false);
                RelativeLayout relativeLayout2 = new RelativeLayout(this);
                RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-1, -1);
                layoutParams4.addRule(10);
                layoutParams4.addRule(2, C6248i.f15814c);
                relativeLayout2.setBackgroundColor(-1);
                relativeLayout2.addView(this.f19391h, layoutParams4);
                float f2 = C6252ic.m18655a().f15840c;
                LinearLayout linearLayout2 = new LinearLayout(this);
                RelativeLayout.LayoutParams layoutParams22 = new RelativeLayout.LayoutParams(-1, (int) (48.0f * f2));
                linearLayout2.setOrientation(0);
                linearLayout2.setId(C6248i.f15814c);
                linearLayout2.setWeightSum(100.0f);
                linearLayout2.setBackgroundResource(17301658);
                linearLayout2.setBackgroundColor(-7829368);
                layoutParams22.addRule(12);
                relativeLayout2.addView(linearLayout2, layoutParams22);
                LinearLayout.LayoutParams layoutParams32 = new LinearLayout.LayoutParams(-1, -1);
                layoutParams32.weight = 25.0f;
                C5933cp cpVar5 = new C5933cp(this, f2, (byte) 2);
                cpVar5.setOnTouchListener(new View.OnTouchListener() {
                    public final boolean onTouch(View view, MotionEvent motionEvent) {
                        if (motionEvent.getAction() == 1) {
                            view.setBackgroundColor(-7829368);
                            InMobiAdActivity.this.f19389b = true;
                            InMobiAdActivity.this.finish();
                            return true;
                        }
                        if (motionEvent.getAction() == 0) {
                            view.setBackgroundColor(-16711681);
                        }
                        return true;
                    }
                });
                linearLayout2.addView(cpVar5, layoutParams32);
                C5933cp cpVar22 = new C5933cp(this, f2, (byte) 3);
                cpVar22.setOnTouchListener(new View.OnTouchListener() {
                    public final boolean onTouch(View view, MotionEvent motionEvent) {
                        if (motionEvent.getAction() == 1) {
                            view.setBackgroundColor(-7829368);
                            InMobiAdActivity.this.f19391h.reload();
                            return true;
                        }
                        if (motionEvent.getAction() == 0) {
                            view.setBackgroundColor(-16711681);
                        }
                        return true;
                    }
                });
                linearLayout2.addView(cpVar22, layoutParams32);
                C5933cp cpVar32 = new C5933cp(this, f2, (byte) 4);
                cpVar32.setOnTouchListener(new View.OnTouchListener() {
                    public final boolean onTouch(View view, MotionEvent motionEvent) {
                        if (motionEvent.getAction() == 1) {
                            view.setBackgroundColor(-7829368);
                            if (InMobiAdActivity.this.f19391h.canGoBack()) {
                                InMobiAdActivity.this.f19391h.goBack();
                            } else {
                                InMobiAdActivity.this.f19389b = true;
                                InMobiAdActivity.this.finish();
                            }
                            return true;
                        }
                        if (motionEvent.getAction() == 0) {
                            view.setBackgroundColor(-16711681);
                        }
                        return true;
                    }
                });
                linearLayout2.addView(cpVar32, layoutParams32);
                C5933cp cpVar42 = new C5933cp(this, f2, (byte) 6);
                cpVar42.setOnTouchListener(new View.OnTouchListener() {
                    public final boolean onTouch(View view, MotionEvent motionEvent) {
                        if (motionEvent.getAction() == 1) {
                            view.setBackgroundColor(-7829368);
                            if (InMobiAdActivity.this.f19391h.canGoForward()) {
                                InMobiAdActivity.this.f19391h.goForward();
                            }
                            return true;
                        }
                        if (motionEvent.getAction() == 0) {
                            view.setBackgroundColor(-16711681);
                        }
                        return true;
                    }
                });
                linearLayout2.addView(cpVar42, layoutParams32);
                setContentView(relativeLayout2);
                this.f19391h.loadUrl(stringExtra);
                this.f19391h.setFullScreenActivityContext(this);
                this.f19388a.mo35039a((C5956cw) this.f19391h);
            } catch (Exception e) {
                C6181gg.m18398a().mo35357a(new C6217hg(e));
                sVar.mo34464a();
                finish();
            }
        } else if (i == 102) {
            C5951ct ctVar = new C5951ct(this);
            this.f19390g = ctVar;
            this.f19388a.mo35039a((C5956cw) ctVar);
            this.f19390g.mo35031a(getIntent(), f19385d);
        }
    }

    public void onStop() {
        C5951ct ctVar;
        super.onStop();
        if (!this.f19389b && (ctVar = this.f19390g) != null && ctVar.f15105b != null) {
            ctVar.f15105b.mo35025d();
        }
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        if (this.f19389b) {
            int i = this.f19392i;
            if (100 == i) {
                C6337q qVar = this.f19391h;
                if (!(qVar == null || qVar.getFullScreenEventsListener() == null)) {
                    try {
                        this.f19391h.getFullScreenEventsListener().mo35512b(this.f19391h);
                        this.f19391h.destroy();
                        this.f19388a.mo35041b(this.f19391h);
                        this.f19391h = null;
                    } catch (Exception unused) {
                    }
                }
            } else if (102 == i) {
                C5951ct ctVar = this.f19390g;
                if (ctVar != null) {
                    this.f19388a.mo35041b(ctVar);
                    this.f19390g.mo35030a();
                }
                this.f19390g = null;
            }
        } else {
            int i2 = this.f19392i;
            if (100 != i2 && 102 == i2) {
                C5951ct ctVar2 = this.f19390g;
                if (ctVar2 != null) {
                    this.f19388a.mo35041b(ctVar2);
                    this.f19390g.mo35030a();
                }
                this.f19390g = null;
            }
        }
        C5953cu cuVar = this.f19388a;
        if (cuVar != null) {
            cuVar.f15115a.clear();
            cuVar.disable();
            cuVar.f15116b = null;
        }
        super.onDestroy();
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f19388a.mo35038a();
    }

    public void onMultiWindowModeChanged(boolean z) {
        C5951ct ctVar;
        super.onMultiWindowModeChanged(z);
        if (!z && (ctVar = this.f19390g) != null) {
            this.f19388a.mo35040a(ctVar.f15106c instanceof C6337q ? ((C6337q) ctVar.f15106c).getOrientationProperties() : null);
        }
    }

    public void onMultiWindowModeChanged(boolean z, Configuration configuration) {
        super.onMultiWindowModeChanged(z, configuration);
        onMultiWindowModeChanged(z);
    }

    /* renamed from: a */
    public final void mo56396a(C5975dd ddVar) {
        this.f19388a.mo35040a(ddVar);
    }

    public void onBackPressed() {
        int i = this.f19392i;
        if (i == 102) {
            C5951ct ctVar = this.f19390g;
            if (ctVar != null && ctVar.f15105b != null) {
                ctVar.f15105b.mo35027f();
            }
        } else if (i == 100) {
            this.f19389b = true;
            finish();
        }
    }
}

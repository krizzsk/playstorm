package com.applovin.impl.mediation.debugger.p038ui.p040b;

import android.content.Context;
import android.content.Intent;
import android.database.DataSetObserver;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.FrameLayout;
import android.widget.ListView;
import com.applovin.impl.adview.C1423a;
import com.applovin.impl.mediation.debugger.p038ui.C1668a;
import com.applovin.impl.mediation.debugger.p038ui.p040b.C1696b;
import com.applovin.impl.mediation.debugger.p038ui.p040b.p041a.C1694a;
import com.applovin.impl.mediation.debugger.p038ui.p043d.C1705a;
import com.applovin.impl.mediation.debugger.p038ui.p043d.C1707c;
import com.applovin.impl.mediation.debugger.p038ui.p043d.C1711d;
import com.applovin.impl.sdk.AppLovinContentProviderUtils;
import com.applovin.impl.sdk.C1788a;
import com.applovin.impl.sdk.C1959m;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.mediation.MaxDebuggerAdUnitsListActivity;
import com.applovin.mediation.MaxDebuggerDetailActivity;
import com.applovin.mediation.MaxDebuggerTestLiveNetworkActivity;
import com.applovin.sdk.C2392R;
import com.google.android.exoplayer2.util.MimeTypes;

/* renamed from: com.applovin.impl.mediation.debugger.ui.b.a */
public class C1687a extends C1668a {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public C1696b f2459a;

    /* renamed from: b */
    private DataSetObserver f2460b;

    /* renamed from: c */
    private FrameLayout f2461c;

    /* renamed from: d */
    private ListView f2462d;

    /* renamed from: e */
    private C1423a f2463e;

    /* renamed from: a */
    private void m3459a() {
        Uri cacheJPEGImageWithFileName;
        Bitmap a = this.f2459a.mo13553a(this.f2462d);
        if (a != null && (cacheJPEGImageWithFileName = AppLovinContentProviderUtils.cacheJPEGImageWithFileName(a, "mediation_debugger_screenshot.jpeg")) != null) {
            Intent intent = new Intent("android.intent.action.SEND");
            intent.setType(MimeTypes.IMAGE_JPEG);
            intent.putExtra("android.intent.extra.STREAM", cacheJPEGImageWithFileName);
            intent.addFlags(1);
            startActivity(Intent.createChooser(intent, "Share Mediation Debugger"));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m3460a(final Context context) {
        if (StringUtils.isValidString(this.f2459a.mo13516g()) && !this.f2459a.mo13512c()) {
            this.f2459a.mo13511a(true);
            runOnUiThread(new Runnable() {
                public void run() {
                    Utils.showAlert(C1687a.this.f2459a.mo13515f(), C1687a.this.f2459a.mo13516g(), context);
                }
            });
        }
    }

    /* renamed from: b */
    private void m3465b() {
        m3467c();
        C1423a aVar = new C1423a(this, 50, 16842874);
        this.f2463e = aVar;
        aVar.setColor(-3355444);
        this.f2461c.addView(this.f2463e, new FrameLayout.LayoutParams(-1, -1, 17));
        this.f2461c.bringChildToFront(this.f2463e);
        this.f2463e.mo12732a();
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m3467c() {
        C1423a aVar = this.f2463e;
        if (aVar != null) {
            aVar.mo12733b();
            this.f2461c.removeView(this.f2463e);
            this.f2463e = null;
        }
    }

    /* access modifiers changed from: protected */
    public C1959m getSdk() {
        C1696b bVar = this.f2459a;
        if (bVar != null) {
            return bVar.mo13513d();
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle("MAX Mediation Debugger");
        setContentView(C2392R.layout.list_view);
        this.f2461c = (FrameLayout) findViewById(16908290);
        this.f2462d = (ListView) findViewById(C2392R.C2394id.listView);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(C2392R.C2396menu.mediation_debugger_activity_menu, menu);
        return true;
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        C1696b bVar = this.f2459a;
        if (bVar != null) {
            bVar.unregisterDataSetObserver(this.f2460b);
            this.f2459a.mo13554a((C1711d.C1713a) null);
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (C2392R.C2394id.action_share != menuItem.getItemId()) {
            return super.onOptionsItemSelected(menuItem);
        }
        m3459a();
        return true;
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        this.f2462d.setAdapter(this.f2459a);
        C1696b bVar = this.f2459a;
        if (bVar != null && !bVar.mo13481a()) {
            m3465b();
        }
    }

    public void setListAdapter(C1696b bVar, final C1788a aVar) {
        DataSetObserver dataSetObserver;
        C1696b bVar2 = this.f2459a;
        if (!(bVar2 == null || (dataSetObserver = this.f2460b) == null)) {
            bVar2.unregisterDataSetObserver(dataSetObserver);
        }
        this.f2459a = bVar;
        this.f2460b = new DataSetObserver() {
            public void onChanged() {
                C1687a.this.m3467c();
                C1687a aVar = C1687a.this;
                aVar.m3460a((Context) aVar);
            }
        };
        m3460a((Context) this);
        this.f2459a.registerDataSetObserver(this.f2460b);
        this.f2459a.mo13554a((C1711d.C1713a) new C1711d.C1713a() {
            /* renamed from: a */
            public void mo13476a(C1705a aVar, final C1707c cVar) {
                C1687a aVar2;
                String str;
                String str2;
                int a = aVar.mo13525a();
                if (a == C1696b.C1699b.MAX.ordinal()) {
                    Utils.showAlert(cVar.mo13534l(), cVar.mo13535m(), C1687a.this);
                } else if (a == C1696b.C1699b.ADS.ordinal()) {
                    if (aVar.mo13526b() == C1696b.C1698a.AD_UNITS.ordinal()) {
                        if (C1687a.this.f2459a.mo13514e().size() > 0) {
                            C1687a.this.startActivity(MaxDebuggerAdUnitsListActivity.class, aVar, new C1668a.C1670a<MaxDebuggerAdUnitsListActivity>() {
                                /* renamed from: a */
                                public void mo13473a(MaxDebuggerAdUnitsListActivity maxDebuggerAdUnitsListActivity) {
                                    maxDebuggerAdUnitsListActivity.initialize(C1687a.this.f2459a.mo13514e(), C1687a.this.f2459a.mo13513d());
                                }
                            });
                            return;
                        }
                        aVar2 = C1687a.this;
                        str = "No live ad units";
                        str2 = "Please setup or enable your MAX ad units on https://applovin.com.";
                    } else if (aVar.mo13526b() != C1696b.C1698a.SELECT_LIVE_NETWORKS.ordinal()) {
                        return;
                    } else {
                        if (C1687a.this.f2459a.mo13517h().size() <= 0 && C1687a.this.f2459a.mo13518i().size() <= 0) {
                            aVar2 = C1687a.this;
                            str = "Complete Integrations";
                            str2 = "Please complete integrations in order to access this.";
                        } else if (C1687a.this.f2459a.mo13513d().mo14295J().mo13583a()) {
                            Utils.showAlert("Restart Required", cVar.mo13535m(), C1687a.this);
                            return;
                        } else {
                            C1687a.this.startActivity(MaxDebuggerTestLiveNetworkActivity.class, aVar, new C1668a.C1670a<MaxDebuggerTestLiveNetworkActivity>() {
                                /* renamed from: a */
                                public void mo13473a(MaxDebuggerTestLiveNetworkActivity maxDebuggerTestLiveNetworkActivity) {
                                    maxDebuggerTestLiveNetworkActivity.initialize(C1687a.this.f2459a.mo13517h(), C1687a.this.f2459a.mo13518i(), C1687a.this.f2459a.mo13513d());
                                }
                            });
                            return;
                        }
                    }
                    Utils.showAlert(str, str2, aVar2);
                } else if ((a == C1696b.C1699b.INCOMPLETE_NETWORKS.ordinal() || a == C1696b.C1699b.COMPLETED_NETWORKS.ordinal()) && (cVar instanceof C1694a)) {
                    C1687a.this.startActivity(MaxDebuggerDetailActivity.class, aVar, new C1668a.C1670a<MaxDebuggerDetailActivity>() {
                        /* renamed from: a */
                        public void mo13473a(MaxDebuggerDetailActivity maxDebuggerDetailActivity) {
                            maxDebuggerDetailActivity.initialize(((C1694a) cVar).mo13503d());
                        }
                    });
                }
            }
        });
    }
}

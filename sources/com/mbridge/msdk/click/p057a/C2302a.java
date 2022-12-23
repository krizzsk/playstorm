package com.mbridge.msdk.click.p057a;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import androidx.browser.trusted.sharing.ShareTarget;
import com.mbridge.msdk.click.C2295a;
import com.mbridge.msdk.foundation.controller.C2350a;
import com.mbridge.msdk.foundation.entity.C8410k;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.p066db.C2374f;
import com.mbridge.msdk.foundation.p066db.C2376g;
import com.mbridge.msdk.foundation.p066db.C2382m;
import com.mbridge.msdk.foundation.same.C8413a;
import com.mbridge.msdk.foundation.same.net.p310f.C8487d;
import com.mbridge.msdk.foundation.same.report.C8518b;
import com.mbridge.msdk.foundation.same.report.C8542e;
import com.mbridge.msdk.foundation.same.report.p315d.C8540a;
import com.mbridge.msdk.foundation.same.report.p315d.C8541b;
import com.mbridge.msdk.foundation.tools.C8557ad;
import com.mbridge.msdk.foundation.tools.C8608u;
import com.mbridge.msdk.p054c.C2278a;
import com.mbridge.msdk.p054c.C2283b;
import java.net.URLEncoder;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.mbridge.msdk.click.a.a */
/* compiled from: RetryReportControl */
public final class C2302a {

    /* renamed from: a */
    public static String f4727a = "mtg_retry_report=1";

    /* renamed from: b */
    public static int f4728b = 10000;

    /* renamed from: c */
    public static int f4729c = 3;

    /* renamed from: d */
    public static int f4730d = 50;

    /* renamed from: e */
    public static int f4731e = 600000;

    /* renamed from: f */
    public static int f4732f = 0;

    /* renamed from: g */
    public static int f4733g = 1;

    /* renamed from: h */
    public static int f4734h = 2;

    /* renamed from: i */
    public static int f4735i = 3;

    /* renamed from: j */
    public static int f4736j = 4;

    /* renamed from: k */
    public static int f4737k = 5;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public static String f4738l = "RetryReportControl";

    /* renamed from: o */
    private static int f4739o;

    /* renamed from: p */
    private static int f4740p;

    /* renamed from: m */
    private ConcurrentHashMap<String, C2307b> f4741m;

    /* renamed from: n */
    private C2308c f4742n;

    /* renamed from: q */
    private BroadcastReceiver f4743q;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public final Handler f4744r;

    /* renamed from: com.mbridge.msdk.click.a.a$a */
    /* compiled from: RetryReportControl */
    private static class C2305a {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public static C2302a f4748a = new C2302a();
    }

    private C2302a() {
        this.f4741m = new ConcurrentHashMap<>();
        this.f4742n = new C2308c(f4730d);
        this.f4744r = new C2306b(Looper.getMainLooper());
        C2278a f = C2283b.m5275a().mo15571f(C2350a.m5601e().mo15793h());
        f4729c = f.mo15519l();
        f4728b = f.mo15523n() * 1000;
        f4731e = f.mo15521m() * 1000;
        f4739o = f.mo15517k();
        f4740p = f.mo15515j();
        try {
            if (this.f4743q == null) {
                this.f4743q = new BroadcastReceiver() {
                    public final void onReceive(Context context, Intent intent) {
                        if ("android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
                            C2302a.this.f4744r.sendEmptyMessage(2);
                        }
                    }
                };
                Context g = C2350a.m5601e().mo15792g();
                if (g != null) {
                    g.registerReceiver(this.f4743q, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public static C2302a m5402a() {
        return C2305a.f4748a;
    }

    /* renamed from: com.mbridge.msdk.click.a.a$b */
    /* compiled from: RetryReportControl */
    private static class C2306b extends Handler {
        public C2306b(Looper looper) {
            super(looper);
        }

        public final void handleMessage(Message message) {
            int i = message.what;
            if (i == 1) {
                Object obj = message.obj;
                if (obj instanceof String) {
                    C2302a.m5402a().m5409a((String) obj, C2307b.f4749a);
                }
            } else if (i == 2) {
                C2302a.m5405a(C2302a.m5402a());
            }
        }
    }

    /* renamed from: a */
    private void m5407a(C2307b bVar) {
        String str;
        String str2;
        try {
            CampaignEx f = bVar.mo15667f();
            if (f != null) {
                String requestId = f.getRequestId();
                str = f.getRequestIdNotice();
                str2 = requestId;
            } else {
                str2 = "";
                str = str2;
            }
            m5404a(C2350a.m5601e().mo15792g(), bVar.mo15670i().toString(), bVar.mo15668g(), str2, str, bVar.mo15665d());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    private static void m5404a(Context context, String str, String str2, String str3, String str4, int i) {
        if (context != null) {
            try {
                if (!TextUtils.isEmpty(str)) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("key=2000105&");
                    stringBuffer.append("url=" + URLEncoder.encode(str2, "utf-8") + "&");
                    stringBuffer.append("type=" + i + "&");
                    if (!TextUtils.isEmpty(C8413a.f20329k)) {
                        stringBuffer.append("b=" + C8413a.f20329k + "&");
                    }
                    if (!TextUtils.isEmpty(C8413a.f20330l)) {
                        stringBuffer.append("c=" + C8413a.f20330l + "&");
                    }
                    if (!TextUtils.isEmpty(str3)) {
                        stringBuffer.append("rid=");
                        stringBuffer.append(str3);
                        stringBuffer.append("&");
                    }
                    if (!TextUtils.isEmpty(str3)) {
                        stringBuffer.append("rid_n=");
                        stringBuffer.append(str4);
                        stringBuffer.append("&");
                    }
                    stringBuffer.append("reason=" + URLEncoder.encode(str, "utf-8"));
                    if (C8518b.m24607a().mo57681c()) {
                        C8518b.m24607a().mo57679a(stringBuffer.toString());
                    } else {
                        m5403a(context, stringBuffer.toString());
                    }
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    private static void m5403a(final Context context, final String str) {
        if (context != null && !TextUtils.isEmpty(str)) {
            try {
                new C8540a(context).mo57603c(0, C8487d.m24492a().f20531a, C8542e.m24690a(str, context), new C8541b() {
                    /* renamed from: a */
                    public final void mo15651a(String str) {
                        C8608u.m24884d(C2302a.f4738l, str);
                    }

                    /* renamed from: b */
                    public final void mo15652b(String str) {
                        C8410k kVar = new C8410k();
                        kVar.mo57423c(str);
                        kVar.mo57418a(System.currentTimeMillis());
                        kVar.mo57417a(0);
                        kVar.mo57421b(ShareTarget.METHOD_POST);
                        kVar.mo57419a(C8487d.m24492a().f20531a);
                        C2382m.m5755a((C2374f) C2376g.m5723a(context)).mo15920a(kVar);
                    }
                });
            } catch (Exception e) {
                e.printStackTrace();
                C8608u.m24884d(f4738l, e.getMessage());
            }
        }
    }

    /* renamed from: a */
    private void m5408a(String str) {
        Message obtainMessage = this.f4744r.obtainMessage();
        obtainMessage.what = 1;
        obtainMessage.obj = str;
        this.f4744r.sendMessageDelayed(obtainMessage, (long) f4728b);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m5409a(String str, int i) {
        String str2;
        C2308c cVar = this.f4742n;
        if (cVar != null) {
            C2307b a = cVar.mo15677b(str);
            this.f4742n.mo15674a(str);
            if (a == null) {
                C2307b bVar = this.f4741m.get(str);
                if (bVar != null && System.currentTimeMillis() <= bVar.mo15671j() + ((long) f4731e) && bVar.mo15669h() < f4729c && i != C2307b.f4750b) {
                    m5408a(str);
                }
            } else if (System.currentTimeMillis() <= a.mo15671j() + ((long) f4731e)) {
                a.mo15655a(i);
                this.f4741m.put(str, a);
                if (C8557ad.m24741b(str) == 0) {
                    str2 = str + "?" + f4727a;
                } else {
                    str2 = str + "&" + f4727a;
                }
                C2295a.m5361a(C2350a.m5601e().mo15792g(), a.mo15667f(), a.mo15666e(), str2, a.mo15659a(), a.mo15663b(), a.mo15665d());
            } else if (i != C2307b.f4750b) {
                m5407a(a);
            }
        }
    }

    /* renamed from: a */
    private boolean m5410a(int i) {
        return i == f4736j || i == f4735i;
    }

    /* renamed from: b */
    private boolean m5413b(int i) {
        return i == f4733g || i == f4734h;
    }

    /* renamed from: a */
    public final void mo15650a(String str, String str2, CampaignEx campaignEx, String str3, boolean z, boolean z2, int i) {
        boolean z3 = false;
        if ((m5410a(i) || m5413b(i) || i == f4737k) && !TextUtils.isEmpty(str)) {
            String replace = str.replace("?" + f4727a, "").replace("&" + f4727a, "");
            if (this.f4741m == null) {
                this.f4741m = new ConcurrentHashMap<>();
            }
            C2307b remove = this.f4741m.remove(replace);
            if (remove == null) {
                remove = new C2307b(str, str2);
                remove.mo15660b(i);
                remove.mo15658a(z);
                remove.mo15662b(z2);
                remove.mo15656a(campaignEx);
                remove.mo15657a(str3);
            } else if (remove.mo15664c() != C2307b.f4750b) {
                remove.mo15661b(str2);
            }
            if ((m5410a(i) && f4739o != 0) || ((m5413b(i) && f4740p != 0) || i == f4737k)) {
                z3 = true;
            }
            if (!z3) {
                m5407a(remove);
            } else if (System.currentTimeMillis() < remove.mo15671j() + ((long) f4731e)) {
                if (this.f4742n == null) {
                    this.f4742n = new C2308c(f4730d);
                }
                this.f4742n.mo15675a(replace, remove);
                if (remove.mo15664c() != C2307b.f4749a) {
                    return;
                }
                if (remove.mo15669h() <= f4729c) {
                    m5408a(replace);
                } else {
                    m5407a(remove);
                }
            } else if (remove.mo15664c() == C2307b.f4749a) {
                m5407a(remove);
            }
        }
    }

    /* renamed from: a */
    static /* synthetic */ void m5405a(C2302a aVar) {
        C2308c cVar = aVar.f4742n;
        if (cVar != null) {
            for (String a : cVar.mo15673a()) {
                aVar.m5409a(a, C2307b.f4750b);
            }
        }
    }
}

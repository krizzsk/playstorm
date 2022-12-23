package com.mbridge.msdk.videocommon.download;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.controller.C2350a;
import com.mbridge.msdk.foundation.download.DownloadError;
import com.mbridge.msdk.foundation.download.DownloadMessage;
import com.mbridge.msdk.foundation.download.DownloadPriority;
import com.mbridge.msdk.foundation.download.DownloadResourceType;
import com.mbridge.msdk.foundation.download.DownloadStatus;
import com.mbridge.msdk.foundation.download.MBDownloadManager;
import com.mbridge.msdk.foundation.download.OnDownloadStateListener;
import com.mbridge.msdk.foundation.download.OnProgressStateListener;
import com.mbridge.msdk.foundation.download.core.DownloadRequest;
import com.mbridge.msdk.foundation.entity.C8411l;
import com.mbridge.msdk.foundation.entity.C8412m;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.p066db.C2374f;
import com.mbridge.msdk.foundation.p066db.C2376g;
import com.mbridge.msdk.foundation.p066db.C2384o;
import com.mbridge.msdk.foundation.p066db.C2385p;
import com.mbridge.msdk.foundation.same.C8413a;
import com.mbridge.msdk.foundation.same.net.C8476e;
import com.mbridge.msdk.foundation.same.net.p310f.C8487d;
import com.mbridge.msdk.foundation.same.net.p311g.C8494d;
import com.mbridge.msdk.foundation.same.p300b.C8420c;
import com.mbridge.msdk.foundation.same.p300b.C8422e;
import com.mbridge.msdk.foundation.same.report.C8518b;
import com.mbridge.msdk.foundation.same.report.C8542e;
import com.mbridge.msdk.foundation.same.report.p315d.C8540a;
import com.mbridge.msdk.foundation.tools.C8557ad;
import com.mbridge.msdk.foundation.tools.C8601r;
import com.mbridge.msdk.foundation.tools.C8608u;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.videocommon.listener.C9584a;
import com.mbridge.msdk.videocommon.p370a.C9538a;
import com.mbridge.msdk.videocommon.p373d.C9549b;
import java.io.File;
import java.io.Serializable;
import java.net.URL;
import java.net.URLEncoder;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.mbridge.msdk.videocommon.download.a */
/* compiled from: CampaignDownLoadTask */
public final class C9552a implements Serializable {
    /* access modifiers changed from: private */

    /* renamed from: A */
    public boolean f23465A;

    /* renamed from: B */
    private int f23466B;

    /* renamed from: C */
    private File f23467C;
    /* access modifiers changed from: private */

    /* renamed from: D */
    public int f23468D = 1;

    /* renamed from: E */
    private int f23469E;

    /* renamed from: F */
    private int f23470F;

    /* renamed from: G */
    private int f23471G;
    /* access modifiers changed from: private */

    /* renamed from: H */
    public volatile boolean f23472H = false;

    /* renamed from: I */
    private OnDownloadStateListener f23473I = new OnDownloadStateListener() {
        public final void onDownloadStart(DownloadMessage downloadMessage) {
            int unused = C9552a.this.f23479e = 1;
            if (C9552a.this.f23495u == null) {
                C2384o unused2 = C9552a.this.f23495u = C2384o.m5768a((C2374f) C2376g.m5723a(C2350a.m5601e().mo15792g()));
            }
            C9552a.this.f23495u.mo15926a(C9552a.this.f23483i, C9552a.this.f23486l, C9552a.this.f23490p, C9552a.this.f23479e);
        }

        public final void onDownloadComplete(DownloadMessage downloadMessage) {
            try {
                C8608u.m24884d("CampaignDownLoadTask", "onDownloadComplete callback : " + C9552a.this.f23489o + "    " + C9552a.this.f23486l);
                if (C9552a.this.f23495u == null) {
                    C2384o unused = C9552a.this.f23495u = C2384o.m5768a((C2374f) C2376g.m5723a(C2350a.m5601e().mo15792g()));
                }
                C9552a.this.f23495u.mo15927a(C9552a.this.f23487m, C9552a.this.f23489o, 5);
                String videoMD5Value = C9552a.this.f23483i.getVideoMD5Value();
                if (!TextUtils.isEmpty(videoMD5Value)) {
                    try {
                        if (videoMD5Value.equals(C8601r.m24860a(new File(C9552a.this.f23488n)))) {
                            C9552a.this.mo63194a(C9552a.this.f23489o, true);
                            C9552a.this.m27394c(C9552a.this.m27398f(3));
                            return;
                        }
                    } catch (Throwable th) {
                        C8608u.m24881a("CampaignDownLoadTask", th.getMessage(), th);
                    }
                    C9552a.this.mo63198a("Video download complete but MD5 check failed");
                    return;
                }
                C9552a.this.mo63194a(C9552a.this.f23489o, false);
                C9552a.this.m27394c(C9552a.this.m27398f(3));
            } catch (Exception e) {
                C8608u.m24884d("CampaignDownLoadTask", e.getMessage());
            }
        }

        public final void onDownloadError(DownloadMessage downloadMessage, DownloadError downloadError) {
            if (C9552a.this.f23498x != null && C9552a.this.f23498x.getStatus() != DownloadStatus.CANCELLED) {
                String message = (downloadError == null || downloadError.getException() == null) ? "Video Download Error" : downloadError.getException().getMessage();
                C9552a.this.m27410p();
                C9552a.this.m27383a(3, message);
                C9552a.this.mo63198a(message);
            }
        }
    };

    /* renamed from: J */
    private OnProgressStateListener f23474J = new OnProgressStateListener() {
        /* JADX WARNING: Can't wrap try/catch for region: R(7:0|1|2|(2:4|(1:8))|9|10|(2:15|(4:17|(1:19)|20|(1:34)(2:27|35))(1:32))(1:31)) */
        /* JADX WARNING: Code restructure failed: missing block: B:28:0x00db, code lost:
            r6 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:29:0x00dc, code lost:
            com.mbridge.msdk.foundation.tools.C8608u.m24884d("CampaignDownLoadTask", r6.getMessage());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0027 */
        /* JADX WARNING: Removed duplicated region for block: B:15:0x0059 A[Catch:{ Exception -> 0x00db }] */
        /* JADX WARNING: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onProgress(com.mbridge.msdk.foundation.download.DownloadMessage r6, com.mbridge.msdk.foundation.download.DownloadProgress r7) {
            /*
                r5 = this;
                java.lang.String r0 = "CampaignDownLoadTask"
                r1 = 1
                com.mbridge.msdk.videocommon.download.a r2 = com.mbridge.msdk.videocommon.download.C9552a.this     // Catch:{ Exception -> 0x0027 }
                boolean r2 = r2.f23472H     // Catch:{ Exception -> 0x0027 }
                if (r2 != 0) goto L_0x0027
                java.io.File r2 = new java.io.File     // Catch:{ Exception -> 0x0027 }
                com.mbridge.msdk.videocommon.download.a r3 = com.mbridge.msdk.videocommon.download.C9552a.this     // Catch:{ Exception -> 0x0027 }
                java.lang.String r3 = r3.f23490p     // Catch:{ Exception -> 0x0027 }
                r2.<init>(r3)     // Catch:{ Exception -> 0x0027 }
                boolean r3 = r2.exists()     // Catch:{ Exception -> 0x0027 }
                if (r3 == 0) goto L_0x0027
                boolean r2 = r2.isFile()     // Catch:{ Exception -> 0x0027 }
                if (r2 == 0) goto L_0x0027
                com.mbridge.msdk.videocommon.download.a r2 = com.mbridge.msdk.videocommon.download.C9552a.this     // Catch:{ Exception -> 0x0027 }
                boolean unused = r2.f23472H = r1     // Catch:{ Exception -> 0x0027 }
            L_0x0027:
                com.mbridge.msdk.videocommon.download.a r2 = com.mbridge.msdk.videocommon.download.C9552a.this     // Catch:{ Exception -> 0x00db }
                long r3 = r7.getCurrent()     // Catch:{ Exception -> 0x00db }
                long unused = r2.f23489o = r3     // Catch:{ Exception -> 0x00db }
                com.mbridge.msdk.videocommon.download.a r2 = com.mbridge.msdk.videocommon.download.C9552a.this     // Catch:{ Exception -> 0x00db }
                long r3 = r7.getTotal()     // Catch:{ Exception -> 0x00db }
                long unused = r2.f23486l = r3     // Catch:{ Exception -> 0x00db }
                com.mbridge.msdk.videocommon.download.a r2 = com.mbridge.msdk.videocommon.download.C9552a.this     // Catch:{ Exception -> 0x00db }
                int r3 = r7.getCurrentDownloadRate()     // Catch:{ Exception -> 0x00db }
                int unused = r2.f23500z = r3     // Catch:{ Exception -> 0x00db }
                com.mbridge.msdk.videocommon.download.a r2 = com.mbridge.msdk.videocommon.download.C9552a.this     // Catch:{ Exception -> 0x00db }
                int r2 = r2.f23493s     // Catch:{ Exception -> 0x00db }
                r3 = 100
                if (r2 != r3) goto L_0x004d
                return
            L_0x004d:
                int r2 = r7.getCurrentDownloadRate()     // Catch:{ Exception -> 0x00db }
                com.mbridge.msdk.videocommon.download.a r3 = com.mbridge.msdk.videocommon.download.C9552a.this     // Catch:{ Exception -> 0x00db }
                int r3 = r3.f23493s     // Catch:{ Exception -> 0x00db }
                if (r2 < r3) goto L_0x00e3
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00db }
                r2.<init>()     // Catch:{ Exception -> 0x00db }
                java.lang.String r3 = "Rate : "
                r2.append(r3)     // Catch:{ Exception -> 0x00db }
                int r3 = r7.getCurrentDownloadRate()     // Catch:{ Exception -> 0x00db }
                r2.append(r3)     // Catch:{ Exception -> 0x00db }
                java.lang.String r3 = " ReadyRate & cdRate = "
                r2.append(r3)     // Catch:{ Exception -> 0x00db }
                com.mbridge.msdk.videocommon.download.a r3 = com.mbridge.msdk.videocommon.download.C9552a.this     // Catch:{ Exception -> 0x00db }
                int r3 = r3.f23493s     // Catch:{ Exception -> 0x00db }
                r2.append(r3)     // Catch:{ Exception -> 0x00db }
                java.lang.String r3 = " "
                r2.append(r3)     // Catch:{ Exception -> 0x00db }
                com.mbridge.msdk.videocommon.download.a r3 = com.mbridge.msdk.videocommon.download.C9552a.this     // Catch:{ Exception -> 0x00db }
                int r3 = r3.f23477c     // Catch:{ Exception -> 0x00db }
                r2.append(r3)     // Catch:{ Exception -> 0x00db }
                java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x00db }
                com.mbridge.msdk.foundation.tools.C8608u.m24884d(r0, r2)     // Catch:{ Exception -> 0x00db }
                com.mbridge.msdk.videocommon.download.a r2 = com.mbridge.msdk.videocommon.download.C9552a.this     // Catch:{ Exception -> 0x00db }
                boolean r2 = r2.f23478d     // Catch:{ Exception -> 0x00db }
                if (r2 != 0) goto L_0x00e3
                com.mbridge.msdk.videocommon.download.a r2 = com.mbridge.msdk.videocommon.download.C9552a.this     // Catch:{ Exception -> 0x00db }
                boolean unused = r2.f23478d = r1     // Catch:{ Exception -> 0x00db }
                com.mbridge.msdk.videocommon.download.a r2 = com.mbridge.msdk.videocommon.download.C9552a.this     // Catch:{ Exception -> 0x00db }
                boolean r2 = r2.f23465A     // Catch:{ Exception -> 0x00db }
                if (r2 != 0) goto L_0x00b7
                com.mbridge.msdk.videocommon.download.a r2 = com.mbridge.msdk.videocommon.download.C9552a.this     // Catch:{ Exception -> 0x00db }
                com.mbridge.msdk.videocommon.download.a r3 = com.mbridge.msdk.videocommon.download.C9552a.this     // Catch:{ Exception -> 0x00db }
                java.lang.String r1 = r3.m27398f((int) r1)     // Catch:{ Exception -> 0x00db }
                r2.m27394c((java.lang.String) r1)     // Catch:{ Exception -> 0x00db }
                com.mbridge.msdk.videocommon.download.a r1 = com.mbridge.msdk.videocommon.download.C9552a.this     // Catch:{ Exception -> 0x00db }
                long r2 = r7.getCurrent()     // Catch:{ Exception -> 0x00db }
                r7 = 0
                r1.mo63194a((long) r2, (boolean) r7)     // Catch:{ Exception -> 0x00db }
            L_0x00b7:
                com.mbridge.msdk.videocommon.download.a r7 = com.mbridge.msdk.videocommon.download.C9552a.this     // Catch:{ Exception -> 0x00db }
                com.mbridge.msdk.foundation.download.core.DownloadRequest r7 = r7.f23498x     // Catch:{ Exception -> 0x00db }
                if (r7 == 0) goto L_0x00e3
                com.mbridge.msdk.videocommon.download.a r7 = com.mbridge.msdk.videocommon.download.C9552a.this     // Catch:{ Exception -> 0x00db }
                int r7 = r7.f23468D     // Catch:{ Exception -> 0x00db }
                r1 = 2
                if (r7 == r1) goto L_0x00c9
                return
            L_0x00c9:
                com.mbridge.msdk.videocommon.download.a r7 = com.mbridge.msdk.videocommon.download.C9552a.this     // Catch:{ Exception -> 0x00db }
                boolean r7 = r7.f23465A     // Catch:{ Exception -> 0x00db }
                if (r7 != 0) goto L_0x00e3
                com.mbridge.msdk.videocommon.download.a r7 = com.mbridge.msdk.videocommon.download.C9552a.this     // Catch:{ Exception -> 0x00db }
                com.mbridge.msdk.foundation.download.core.DownloadRequest r7 = r7.f23498x     // Catch:{ Exception -> 0x00db }
                r7.cancel(r6)     // Catch:{ Exception -> 0x00db }
                goto L_0x00e3
            L_0x00db:
                r6 = move-exception
                java.lang.String r6 = r6.getMessage()
                com.mbridge.msdk.foundation.tools.C8608u.m24884d(r0, r6)
            L_0x00e3:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.videocommon.download.C9552a.C95542.onProgress(com.mbridge.msdk.foundation.download.DownloadMessage, com.mbridge.msdk.foundation.download.DownloadProgress):void");
        }
    };

    /* renamed from: a */
    private boolean f23475a = false;

    /* renamed from: b */
    private int f23476b = 1;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public int f23477c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public boolean f23478d = false;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public volatile int f23479e = 0;

    /* renamed from: f */
    private CopyOnWriteArrayList<C9557d> f23480f = new CopyOnWriteArrayList<>();

    /* renamed from: g */
    private C9584a f23481g;

    /* renamed from: h */
    private C9584a f23482h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public CampaignEx f23483i;

    /* renamed from: j */
    private String f23484j;

    /* renamed from: k */
    private Context f23485k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public long f23486l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public String f23487m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public String f23488n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public long f23489o = 0;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public String f23490p;

    /* renamed from: q */
    private boolean f23491q = false;

    /* renamed from: r */
    private long f23492r;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public int f23493s = 100;

    /* renamed from: t */
    private boolean f23494t = false;
    /* access modifiers changed from: private */

    /* renamed from: u */
    public C2384o f23495u;

    /* renamed from: v */
    private boolean f23496v = false;

    /* renamed from: w */
    private String f23497w;
    /* access modifiers changed from: private */

    /* renamed from: x */
    public DownloadRequest f23498x;

    /* renamed from: y */
    private DownloadMessage f23499y;
    /* access modifiers changed from: private */

    /* renamed from: z */
    public int f23500z;

    public C9552a(Context context, CampaignEx campaignEx, String str, int i) {
        String str2;
        CampaignEx campaignEx2 = campaignEx;
        if (context != null || campaignEx2 != null) {
            this.f23469E = C8413a.f20317B;
            this.f23470F = C8413a.f20318C;
            this.f23471G = C8413a.f20316A;
            this.f23492r = System.currentTimeMillis();
            this.f23485k = C2350a.m5601e().mo15792g();
            this.f23483i = campaignEx2;
            this.f23484j = str;
            this.f23476b = i;
            if (campaignEx2 != null) {
                this.f23487m = campaignEx.getVideoUrlEncode();
            }
            String str3 = this.f23487m;
            if (!TextUtils.isEmpty(str3)) {
                str2 = SameMD5.getMD5(C8557ad.m24739a(str3.trim()));
            } else {
                str2 = "";
            }
            this.f23497w = str2;
            this.f23488n = C8422e.m24335b(C8420c.MBRIDGE_VC) + File.separator;
            this.f23490p = this.f23488n + this.f23497w;
            C8608u.m24882b("CampaignDownLoadTask", this.f23483i.getAppName() + " videoLocalPath:" + this.f23490p + " videoUrl: " + this.f23483i.getVideoUrlEncode() + " " + this.f23493s);
            try {
                if (!TextUtils.isEmpty(this.f23487m)) {
                    File file = null;
                    if (!TextUtils.isEmpty(this.f23488n)) {
                        file = new File(this.f23488n);
                        if (!file.exists()) {
                            file.mkdirs();
                        }
                    }
                    if (file != null && file.exists() && (this.f23467C == null || !this.f23467C.exists())) {
                        File file2 = new File(file + "/.nomedia");
                        this.f23467C = file2;
                        if (!file2.exists()) {
                            this.f23467C.createNewFile();
                        }
                    }
                    C2384o a = C2384o.m5768a((C2374f) C2376g.m5723a(C2350a.m5601e().mo15792g()));
                    C8411l a2 = a.mo15929a(this.f23487m, "");
                    if (a2 != null) {
                        this.f23489o = a2.mo57431b();
                        if (this.f23479e != 2) {
                            this.f23479e = a2.mo57436d();
                        }
                        if (this.f23479e == 1) {
                            this.f23479e = 2;
                        }
                        this.f23486l = (long) a2.mo57435c();
                        if (a2.mo57427a() > 0) {
                            this.f23492r = a2.mo57427a();
                        }
                        if (this.f23479e == 5) {
                            if (new File(this.f23488n + this.f23497w).exists()) {
                                this.f23490p = this.f23488n + this.f23497w;
                            } else {
                                m27407o();
                            }
                        } else if (this.f23479e != 0) {
                            this.f23490p = this.f23488n + this.f23497w;
                        }
                    } else {
                        a.mo15930a(this.f23487m, this.f23492r);
                    }
                    String str4 = this.f23487m;
                    if (TextUtils.isEmpty(str4)) {
                        this.f23482h.mo58397a("VideoUrl is NULL, Please check it.", "");
                    } else if (this.f23479e == 1) {
                        C8608u.m24880a("CampaignDownLoadTask", "Run : Task is RUNNING, Will return.");
                    } else if (this.f23479e == 5) {
                        C8608u.m24880a("CampaignDownLoadTask", "Run : Video Done, Will callback.");
                        if (this.f23481g != null) {
                            this.f23481g.mo58396a(this.f23487m);
                        }
                        if (this.f23482h != null) {
                            this.f23482h.mo58396a(this.f23487m);
                        }
                        try {
                            File file3 = new File(this.f23490p);
                            if (file3.exists() && file3.isFile()) {
                                this.f23472H = true;
                                file3.setLastModified(System.currentTimeMillis());
                            }
                        } catch (Exception e) {
                            C8608u.m24884d("CampaignDownLoadTask", e.getMessage());
                        }
                    } else if (this.f23476b == 3) {
                        C8608u.m24880a("CampaignDownLoadTask", "Run : Dlnet is 3, Will callback.");
                        mo63194a(0, false);
                    } else {
                        if (this.f23483i.getReady_rate() == 0) {
                            if (this.f23481g != null) {
                                this.f23481g.mo58396a(this.f23487m);
                            }
                            if (this.f23482h != null) {
                                this.f23482h.mo58396a(this.f23487m);
                            }
                        }
                        this.f23499y = new DownloadMessage(new Object(), str4, this.f23497w, 100, DownloadResourceType.DOWNLOAD_RESOURCE_TYPE_VIDEO);
                        this.f23498x = MBDownloadManager.getInstance().download(this.f23499y).withReadTimeout((long) this.f23469E).withConnectTimeout((long) this.f23471G).withWriteTimeout((long) this.f23470F).withDownloadPriority(DownloadPriority.HIGH).withHttpRetryCounter(3).withDirectoryPathInternal(this.f23488n).withDownloadStateListener(this.f23473I).withProgressStateListener(this.f23474J).build();
                    }
                }
            } catch (Exception e2) {
                C8608u.m24882b("CampaignDownLoadTask", e2.getMessage());
            }
        }
    }

    /* renamed from: a */
    public final String mo63191a() {
        return this.f23487m;
    }

    /* renamed from: a */
    public final void mo63192a(int i) {
        this.f23476b = i;
    }

    /* renamed from: b */
    public final void mo63200b(int i) {
        this.f23477c = i;
    }

    /* renamed from: b */
    public final boolean mo63204b() {
        return this.f23496v;
    }

    /* renamed from: a */
    public final void mo63199a(boolean z) {
        this.f23496v = z;
    }

    /* renamed from: c */
    public final long mo63205c() {
        return this.f23492r;
    }

    /* renamed from: b */
    public final void mo63203b(boolean z) {
        this.f23491q = z;
    }

    /* renamed from: d */
    public final String mo63207d() {
        return this.f23490p;
    }

    /* renamed from: e */
    public final long mo63209e() {
        return this.f23486l;
    }

    /* renamed from: f */
    public final int mo63211f() {
        return this.f23479e;
    }

    /* renamed from: a */
    public final void mo63193a(int i, int i2) {
        this.f23479e = i;
        if (this.f23495u == null) {
            this.f23495u = C2384o.m5768a((C2374f) C2376g.m5723a(C2350a.m5601e().mo15792g()));
        }
        this.f23495u.mo15927a(this.f23487m, (long) i2, i);
    }

    /* renamed from: g */
    public final CampaignEx mo63212g() {
        return this.f23483i;
    }

    /* renamed from: a */
    public final void mo63195a(CampaignEx campaignEx) {
        this.f23483i = campaignEx;
    }

    /* renamed from: c */
    public final void mo63206c(int i) {
        this.f23493s = i;
    }

    /* renamed from: h */
    public final long mo63213h() {
        return this.f23489o;
    }

    /* renamed from: d */
    public final void mo63208d(int i) {
        this.f23466B = i;
    }

    /* renamed from: e */
    public final void mo63210e(int i) {
        this.f23468D = i;
    }

    /* renamed from: a */
    public final void mo63194a(long j, boolean z) {
        C2384o oVar;
        C8608u.m24884d("CampaignDownLoadTask", "setStateToDone ： mProgressSize" + this.f23489o + "  progressSize" + j + "  " + this.f23500z + "%   FileSize : " + this.f23486l + "  " + this.f23483i.getAppName());
        long j2 = 0;
        if (this.f23493s != 100 || this.f23476b == 3 || j == this.f23486l || z) {
            this.f23479e = 5;
            m27383a(1, "");
            long j3 = this.f23486l;
            if (!(j3 == 0 || (oVar = this.f23495u) == null)) {
                oVar.mo15931b(this.f23487m, j3);
            }
            this.f23475a = false;
            m27384a(j, this.f23479e);
            return;
        }
        File file = new File(this.f23490p);
        if (file.exists()) {
            j2 = file.length();
        }
        C8608u.m24884d("CampaignDownLoadTask", "progressSize = " + j + " fileSize = " + this.f23486l + " " + z + " absFileSize = " + j2);
        mo63198a("File size is not match witch download size.");
    }

    /* renamed from: a */
    public final void mo63198a(String str) {
        C9584a aVar = this.f23481g;
        if (aVar != null) {
            aVar.mo58397a(str, this.f23487m);
        }
        C9584a aVar2 = this.f23482h;
        if (aVar2 != null) {
            aVar2.mo58397a(str, this.f23487m);
        }
        C8608u.m24884d("CampaignDownLoadTask", "Video download stop : " + str);
        if (this.f23479e != 4 && this.f23479e != 2 && this.f23479e != 5) {
            this.f23479e = 4;
            CampaignEx campaignEx = this.f23483i;
            if (campaignEx == null || campaignEx.getRsIgnoreCheckRule() == null || this.f23483i.getRsIgnoreCheckRule().size() <= 0 || !this.f23483i.getRsIgnoreCheckRule().contains(0)) {
                m27384a(this.f23489o, this.f23479e);
            } else {
                C8608u.m24882b("CampaignDownLoadTask", "Is not check video download status");
            }
        }
    }

    /* renamed from: i */
    public final void mo63214i() {
        C8608u.m24884d("CampaignDownLoadTask", "start()");
        try {
            if (!TextUtils.isEmpty(this.f23487m)) {
                if (this.f23487m != null) {
                    C8608u.m24884d("CampaignDownLoadTask", new URL(this.f23487m).getPath());
                }
                if (this.f23493s == 0 && this.f23468D == 2) {
                    C8608u.m24884d("CampaignDownLoadTask", "Can not start download because readyRate is 0 and videoCtnType is 2");
                    return;
                }
                DownloadRequest downloadRequest = this.f23498x;
                if (downloadRequest != null) {
                    downloadRequest.start();
                }
            }
        } catch (Throwable unused) {
            C9584a aVar = this.f23481g;
            if (aVar != null) {
                aVar.mo58397a("VideoUrl is not illegal, Please check it.", "");
            }
            C9584a aVar2 = this.f23482h;
            if (aVar2 != null) {
                aVar2.mo58397a("VideoUrl is not illegal, Please check it.", "");
            }
        }
    }

    /* renamed from: j */
    public final void mo63215j() {
        try {
            this.f23465A = true;
            if (this.f23468D == 1) {
                C8608u.m24884d("CampaignDownLoadTask", "Can not call resume(), because videoCtnType = " + this.f23468D);
                return;
            }
            C8608u.m24884d("CampaignDownLoadTask", "resume()");
            if (this.f23499y == null) {
                this.f23499y = new DownloadMessage(new Object(), this.f23487m, this.f23497w, 100, DownloadResourceType.DOWNLOAD_RESOURCE_TYPE_VIDEO);
            }
            DownloadRequest build = MBDownloadManager.getInstance().download(this.f23499y).withReadTimeout((long) this.f23469E).withConnectTimeout((long) this.f23471G).withWriteTimeout((long) this.f23470F).withDownloadPriority(DownloadPriority.HIGH).withHttpRetryCounter(3).withDirectoryPathInternal(this.f23488n).withDownloadStateListener(this.f23473I).withProgressStateListener(this.f23474J).build();
            this.f23498x = build;
            build.start();
            m27394c(m27398f(2));
        } catch (Exception e) {
            C8608u.m24884d("CampaignDownLoadTask", e.getMessage());
        }
    }

    /* renamed from: b */
    public final void mo63202b(String str) {
        m27410p();
        m27383a(2, str);
        this.f23479e = 4;
    }

    /* renamed from: a */
    public final void mo63196a(C9557d dVar) {
        CopyOnWriteArrayList<C9557d> copyOnWriteArrayList = this.f23480f;
        if (copyOnWriteArrayList != null) {
            copyOnWriteArrayList.add(dVar);
        }
    }

    /* renamed from: k */
    public final String mo63216k() {
        String str = "";
        if (this.f23476b == 3) {
            return str;
        }
        String str2 = this.f23488n + this.f23497w;
        File file = new File(str2);
        try {
            if (!file.exists()) {
                str = "file is not exist ";
            } else if (!file.isFile()) {
                str = "file is not file ";
            } else if (!file.canRead()) {
                str = "file can not read ";
            } else if (file.length() > 0) {
                this.f23490p = str2;
            } else {
                str = "file length is 0 ";
            }
        } catch (Throwable th) {
            C8608u.m24884d("CampaignDownLoadTask", th.getMessage());
            str = th.getMessage();
        }
        if (this.f23479e == 5 && !TextUtils.isEmpty(str)) {
            m27407o();
        }
        return str;
    }

    /* renamed from: a */
    public final void mo63197a(C9584a aVar) {
        this.f23481g = aVar;
    }

    /* renamed from: b */
    public final void mo63201b(C9584a aVar) {
        this.f23482h = aVar;
    }

    /* renamed from: a */
    private void m27384a(long j, int i) {
        this.f23489o = j;
        int i2 = this.f23493s;
        if (100 * j >= ((long) i2) * this.f23486l && !this.f23494t && i != 4) {
            if (i2 != 100 || i == 5) {
                this.f23494t = true;
                C8608u.m24884d("CampaignDownLoadTask", "UpdateListener : state: " + i + " progress : " + j);
                String k = mo63216k();
                if (TextUtils.isEmpty(k)) {
                    C9584a aVar = this.f23481g;
                    if (aVar != null) {
                        aVar.mo58396a(this.f23487m);
                    }
                    C9584a aVar2 = this.f23482h;
                    if (aVar2 != null) {
                        aVar2.mo58396a(this.f23487m);
                    }
                } else {
                    C9584a aVar3 = this.f23481g;
                    if (aVar3 != null) {
                        aVar3.mo58397a("file is not effective " + k, this.f23487m);
                    }
                    C9584a aVar4 = this.f23482h;
                    if (aVar4 != null) {
                        aVar4.mo58397a("file is not effective " + k, this.f23487m);
                    }
                }
            } else {
                this.f23479e = 5;
                return;
            }
        }
        if (!this.f23475a && j > 0) {
            this.f23475a = true;
            if (this.f23495u == null) {
                this.f23495u = C2384o.m5768a((C2374f) C2376g.m5723a(C2350a.m5601e().mo15792g()));
            }
            this.f23495u.mo15927a(this.f23487m, j, this.f23479e);
        }
        CopyOnWriteArrayList<C9557d> copyOnWriteArrayList = this.f23480f;
        if (copyOnWriteArrayList != null) {
            Iterator<C9557d> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                C9557d next = it.next();
                if (next != null) {
                    next.mo63238a(j, i);
                }
            }
        }
    }

    /* renamed from: l */
    public final void mo63217l() {
        if (this.f23480f != null) {
            this.f23480f = null;
        }
    }

    /* renamed from: o */
    private void m27407o() {
        if (this.f23495u == null) {
            this.f23495u = C2384o.m5768a((C2374f) C2376g.m5723a(C2350a.m5601e().mo15792g()));
        }
        try {
            this.f23495u.mo15932b(this.f23487m);
            File file = new File(this.f23490p);
            if (file.exists() && file.isFile()) {
                file.delete();
            }
        } catch (Throwable th) {
            this.f23479e = 0;
            throw th;
        }
        this.f23479e = 0;
    }

    /* renamed from: m */
    public final void mo63218m() {
        try {
            m27407o();
            if (this.f23483i == null || this.f23483i.getPlayable_ads_without_video() != 2) {
                C9538a a = C9538a.m27238a();
                if (a != null) {
                    a.mo63082a(this.f23483i);
                }
                this.f23479e = 0;
                return;
            }
            this.f23479e = 0;
        } catch (Exception unused) {
            C8608u.m24884d("CampaignDownLoadTask", "del file is failed");
        } catch (Throwable th) {
            this.f23479e = 0;
            throw th;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: p */
    public void m27410p() {
        try {
            Class<?> cls = Class.forName("com.mbridge.msdk.reward.a.a");
            Object newInstance = cls.newInstance();
            cls.getMethod("insertExcludeId", new Class[]{String.class, CampaignEx.class}).invoke(newInstance, new Object[]{this.f23484j, this.f23483i});
            Class<?> cls2 = Class.forName("com.mbridge.msdk.mbnative.controller.NativeController");
            Object newInstance2 = cls2.newInstance();
            cls2.getMethod("insertExcludeId", new Class[]{String.class, CampaignEx.class}).invoke(newInstance2, new Object[]{this.f23484j, this.f23483i});
        } catch (Exception e) {
            C8608u.m24884d("CampaignDownLoadTask", e.getMessage());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m27383a(int i, String str) {
        C2385p a = C2385p.m5777a((C2374f) C2376g.m5723a(C2350a.m5601e().mo15792g()));
        long j = 0;
        if (this.f23492r != 0) {
            j = System.currentTimeMillis() - this.f23492r;
        }
        C8412m mVar = new C8412m(this.f23485k, this.f23483i, i, Long.toString(j), this.f23486l, this.f23466B);
        mVar.mo57469n(this.f23483i.getId());
        mVar.mo57451e(this.f23483i.getVideoUrlEncode());
        mVar.mo57473p(str);
        mVar.mo57463k(this.f23483i.getRequestId());
        mVar.mo57465l(this.f23483i.getRequestIdNotice());
        mVar.mo57467m(this.f23484j);
        a.mo15934a(mVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m27394c(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                if (C8518b.m24607a().mo57681c()) {
                    C8518b.m24607a().mo57679a(str);
                    return;
                }
                C8540a aVar = new C8540a(C2350a.m5601e().mo15792g());
                C8494d a = C8542e.m24691a(str, C2350a.m5601e().mo15792g(), this.f23484j);
                if (!(this.f23483i == null || this.f23483i.getAdType() == 42)) {
                    a.mo57606a("r_stid", C9549b.m27299a().mo63129b().mo63105a());
                }
                aVar.mo57603c(0, C8487d.m24492a().f20531a, a, (C8476e) null);
            } catch (Exception e) {
                C8608u.m24884d("CampaignDownLoadTask", e.getMessage());
            }
        }
    }

    /* renamed from: n */
    public final String mo63219n() {
        if (this.f23472H) {
            return this.f23490p;
        }
        return this.f23487m;
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public String m27398f(int i) {
        if (this.f23483i == null || TextUtils.isEmpty(this.f23484j) || TextUtils.isEmpty(this.f23483i.getRequestId()) || TextUtils.isEmpty(this.f23483i.getVideoUrlEncode())) {
            return "";
        }
        return "key=" + "2000077" + "&" + "unit_id=" + this.f23484j + "&" + "rid=" + this.f23483i.getRequestId() + "&" + "rid_n=" + this.f23483i.getRequestIdNotice() + "&" + "package_name=" + C2350a.m5601e().mo15783b() + "&" + "app_id=" + C2350a.m5601e().mo15793h() + "&" + "video_url=" + URLEncoder.encode(this.f23483i.getVideoUrlEncode()) + "&" + "process_size=" + this.f23489o + "&" + "file_size=" + this.f23486l + "&" + "ready_rate=" + this.f23493s + "&" + "cd_rate=" + this.f23477c + "&" + "cid=" + this.f23483i.getId() + "&" + "type=" + this.f23479e + "&" + "video_download_status=" + i;
    }
}

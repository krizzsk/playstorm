package com.mbridge.msdk.click;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.URLUtil;
import com.mbridge.msdk.click.C2315e;
import com.mbridge.msdk.click.C2317f;
import com.mbridge.msdk.click.CommonJumpLoader;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.p303e.C8434a;
import com.mbridge.msdk.foundation.same.p303e.C8437b;
import com.mbridge.msdk.foundation.tools.C8611x;
import java.util.concurrent.Semaphore;

/* renamed from: com.mbridge.msdk.click.g */
/* compiled from: WebViewSpiderLoader */
public final class C2324g extends C2313c implements C8434a.C8436b {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public C2314d f4817a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public CommonJumpLoader.JumpLoaderResult f4818b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public boolean f4819c = true;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public boolean f4820d;

    /* renamed from: e */
    private Context f4821e;

    /* renamed from: f */
    private C8437b f4822f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public C2315e.C2316a f4823g;

    /* renamed from: h */
    private Handler f4824h = new Handler(Looper.getMainLooper());

    public C2324g(Context context) {
        this.f4821e = context;
        this.f4822f = new C8437b(context, 2);
    }

    /* renamed from: a */
    public final void mo15706a(String str, C2314d dVar, boolean z, String str2, String str3, CampaignEx campaignEx, boolean z2, boolean z3, int i) {
        this.f4817a = dVar;
        this.f4820d = z;
        this.f4822f.mo57529a(new C2326a(this.f4821e, str, str2, str3, campaignEx, z2, z3, i), this);
    }

    /* renamed from: a */
    public final void mo15611a() {
        this.f4819c = false;
    }

    /* renamed from: com.mbridge.msdk.click.g$a */
    /* compiled from: WebViewSpiderLoader */
    private class C2326a extends C8434a {

        /* renamed from: e */
        private final Semaphore f4827e = new Semaphore(0);

        /* renamed from: f */
        private final Context f4828f;

        /* renamed from: g */
        private String f4829g;

        /* renamed from: h */
        private String f4830h;

        /* renamed from: i */
        private String f4831i;

        /* renamed from: j */
        private CampaignEx f4832j;

        /* renamed from: k */
        private boolean f4833k;

        /* renamed from: l */
        private boolean f4834l;

        /* renamed from: m */
        private int f4835m;

        /* renamed from: n */
        private C2317f.C2323a f4836n = new C2317f.C2323a() {
            /* renamed from: c */
            public final boolean mo15704c(String str) {
                return false;
            }

            /* renamed from: a */
            public final boolean mo15702a(String str) {
                boolean a = C2326a.this.m5506a(str);
                if (a) {
                    m5510a();
                }
                return a;
            }

            /* renamed from: b */
            public final boolean mo15703b(String str) {
                boolean a = C2326a.this.m5506a(str);
                if (a) {
                    m5510a();
                }
                return a;
            }

            /* renamed from: a */
            public final void mo15701a(String str, boolean z, String str2) {
                boolean unused = C2326a.this.m5506a(str);
                C2324g.this.f4818b.setContent(str2);
                m5510a();
            }

            /* renamed from: a */
            private void m5510a() {
                synchronized (C2324g.this) {
                    C2324g.this.f4818b.setSuccess(true);
                    C2326a.this.f4827e.release();
                }
            }

            /* renamed from: a */
            public final void mo15700a(int i, String str, String str2, String str3) {
                if (!TextUtils.isEmpty(str2)) {
                    C2324g.this.f4818b.setExceptionMsg(str2);
                }
                if (!TextUtils.isEmpty(str3)) {
                    C2324g.this.f4818b.setContent(str3);
                }
                boolean unused = C2326a.this.m5506a(str);
                m5510a();
            }
        };

        /* renamed from: b */
        public final void mo15709b() {
        }

        public C2326a(Context context, String str, String str2, String str3, CampaignEx campaignEx, boolean z, boolean z2, int i) {
            this.f4828f = context;
            this.f4829g = str;
            this.f4830h = str2;
            this.f4831i = str3;
            this.f4832j = campaignEx;
            this.f4833k = z;
            this.f4834l = z2;
            this.f4835m = i;
        }

        /* JADX WARNING: Removed duplicated region for block: B:21:0x005a  */
        /* JADX WARNING: Removed duplicated region for block: B:81:0x01ec A[EDGE_INSN: B:81:0x01ec->B:79:0x01ec ?: BREAK  , SYNTHETIC] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private com.mbridge.msdk.click.CommonJumpLoader.JumpLoaderResult m5503a(java.lang.String r16, boolean r17, boolean r18, com.mbridge.msdk.foundation.entity.CampaignEx r19, int r20) {
            /*
                r15 = this;
                r1 = r15
                r0 = r16
                java.lang.String r2 = ""
                com.mbridge.msdk.click.g r3 = com.mbridge.msdk.click.C2324g.this
                boolean r3 = r3.f4820d
                if (r3 == 0) goto L_0x0028
                android.content.Context r3 = r1.f4828f
                java.lang.String r3 = com.mbridge.msdk.p054c.C2278a.m5141a(r3, r0)
                boolean r4 = android.text.TextUtils.isEmpty(r3)
                if (r4 != 0) goto L_0x0028
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                r4.append(r0)
                r4.append(r3)
                java.lang.String r0 = r4.toString()
            L_0x0028:
                r3 = r0
                com.mbridge.msdk.click.CommonJumpLoader$JumpLoaderResult r4 = new com.mbridge.msdk.click.CommonJumpLoader$JumpLoaderResult
                r4.<init>()
                com.mbridge.msdk.click.e r5 = new com.mbridge.msdk.click.e
                r5.<init>()
                boolean r0 = r15.m5507b(r3)     // Catch:{ Exception -> 0x004a }
                if (r0 != 0) goto L_0x0048
                java.net.URI r0 = java.net.URI.create(r3)     // Catch:{ Exception -> 0x004a }
                java.lang.String r6 = r0.getScheme()     // Catch:{ Exception -> 0x004a }
                java.lang.String r2 = r0.getHost()     // Catch:{ Exception -> 0x0046 }
                goto L_0x004f
            L_0x0046:
                r0 = move-exception
                goto L_0x004c
            L_0x0048:
                r0 = r2
                goto L_0x0051
            L_0x004a:
                r0 = move-exception
                r6 = r2
            L_0x004c:
                r0.printStackTrace()
            L_0x004f:
                r0 = r2
                r2 = r6
            L_0x0051:
                r6 = 0
                r8 = r3
                r7 = r6
                r3 = r2
                r2 = r0
            L_0x0056:
                r0 = 10
                if (r7 >= r0) goto L_0x01ec
                com.mbridge.msdk.click.g r0 = com.mbridge.msdk.click.C2324g.this
                boolean r0 = r0.f4819c
                r9 = 0
                if (r0 != 0) goto L_0x0064
                return r9
            L_0x0064:
                com.mbridge.msdk.click.g r0 = com.mbridge.msdk.click.C2324g.this
                r12 = r17
                r13 = r18
                r10 = r19
                com.mbridge.msdk.click.e$a r11 = r5.mo15683a(r8, r12, r13, r10)
                com.mbridge.msdk.click.C2315e.C2316a unused = r0.f4823g = r11
                com.mbridge.msdk.click.g r0 = com.mbridge.msdk.click.C2324g.this
                com.mbridge.msdk.click.e$a r0 = r0.f4823g
                if (r0 != 0) goto L_0x0083
                r4.setUrl(r8)
                r4.setSuccess(r6)
                goto L_0x01ec
            L_0x0083:
                com.mbridge.msdk.click.g r0 = com.mbridge.msdk.click.C2324g.this
                com.mbridge.msdk.click.e$a r0 = r0.f4823g
                java.lang.String r0 = r0.f4786h
                boolean r0 = android.text.TextUtils.isEmpty(r0)
                r11 = 1
                if (r0 != 0) goto L_0x00d0
                r4.setUrl(r8)
                com.mbridge.msdk.click.g r0 = com.mbridge.msdk.click.C2324g.this
                com.mbridge.msdk.click.e$a r0 = r0.f4823g
                java.lang.String r0 = r0.f4786h
                r4.setExceptionMsg(r0)
                r4.setType(r11)
                com.mbridge.msdk.click.g r0 = com.mbridge.msdk.click.C2324g.this
                com.mbridge.msdk.click.e$a r0 = r0.f4823g
                java.lang.String r0 = r0.mo15684a()
                r4.setHeader(r0)
                r4.setSuccess(r6)
                if (r7 != 0) goto L_0x01ec
                com.mbridge.msdk.click.a.a r7 = com.mbridge.msdk.click.p057a.C2302a.m5402a()
                com.mbridge.msdk.click.g r0 = com.mbridge.msdk.click.C2324g.this
                com.mbridge.msdk.click.e$a r0 = r0.f4823g
                java.lang.String r9 = r0.f4786h
                java.lang.String r11 = r1.f4831i
                r10 = r19
                r12 = r17
                r13 = r18
                r14 = r20
                r7.mo15650a(r8, r9, r10, r11, r12, r13, r14)
                goto L_0x01ec
            L_0x00d0:
                r4.setSuccess(r11)
                com.mbridge.msdk.click.g r0 = com.mbridge.msdk.click.C2324g.this
                com.mbridge.msdk.click.e$a r0 = r0.f4823g
                int r0 = r0.f4784f
                r14 = 301(0x12d, float:4.22E-43)
                if (r0 == r14) goto L_0x00ea
                r14 = 302(0x12e, float:4.23E-43)
                if (r0 == r14) goto L_0x00ea
                r14 = 307(0x133, float:4.3E-43)
                if (r0 != r14) goto L_0x00e8
                goto L_0x00ea
            L_0x00e8:
                r0 = r6
                goto L_0x00eb
            L_0x00ea:
                r0 = r11
            L_0x00eb:
                if (r0 == 0) goto L_0x0197
                r4.setIs302Jump(r11)
                com.mbridge.msdk.click.g r0 = com.mbridge.msdk.click.C2324g.this
                com.mbridge.msdk.click.e$a r0 = r0.f4823g
                java.lang.String r0 = r0.f4779a
                boolean r0 = android.text.TextUtils.isEmpty(r0)
                if (r0 == 0) goto L_0x0106
                r4.setjumpDone(r11)
                r4.setUrl(r8)
                goto L_0x01ec
            L_0x0106:
                com.mbridge.msdk.click.g r0 = com.mbridge.msdk.click.C2324g.this
                com.mbridge.msdk.click.e$a r0 = r0.f4823g
                java.lang.String r8 = r0.f4779a
                boolean r0 = r15.m5507b(r8)
                if (r0 == 0) goto L_0x014a
                java.lang.String r0 = "/"
                boolean r0 = r8.startsWith(r0)
                if (r0 == 0) goto L_0x0142
                boolean r0 = android.text.TextUtils.isEmpty(r3)
                if (r0 != 0) goto L_0x0142
                boolean r0 = android.text.TextUtils.isEmpty(r2)
                if (r0 != 0) goto L_0x0142
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r3)
                java.lang.String r3 = "://"
                r0.append(r3)
                r0.append(r2)
                r0.append(r8)
                java.lang.String r8 = r0.toString()
                r2 = r9
                r3 = r2
                goto L_0x0162
            L_0x0142:
                r4.setjumpDone(r11)
                r4.setUrl(r8)
                goto L_0x01ec
            L_0x014a:
                boolean r0 = r15.m5507b(r8)
                if (r0 != 0) goto L_0x0162
                java.net.URI r0 = java.net.URI.create(r8)     // Catch:{ Exception -> 0x015e }
                java.lang.String r3 = r0.getScheme()     // Catch:{ Exception -> 0x015e }
                java.lang.String r0 = r0.getHost()     // Catch:{ Exception -> 0x015e }
                r2 = r0
                goto L_0x0162
            L_0x015e:
                r0 = move-exception
                r0.printStackTrace()
            L_0x0162:
                boolean r0 = com.mbridge.msdk.foundation.tools.C8611x.C8612a.m24906a((java.lang.String) r8)
                if (r0 == 0) goto L_0x0170
                r4.setjumpDone(r11)
                r4.setUrl(r8)
                goto L_0x01ec
            L_0x0170:
                com.mbridge.msdk.click.g r0 = com.mbridge.msdk.click.C2324g.this
                boolean r0 = r0.f4820d
                if (r0 == 0) goto L_0x0193
                android.content.Context r0 = r1.f4828f
                java.lang.String r0 = com.mbridge.msdk.p054c.C2278a.m5141a(r0, r8)
                boolean r9 = android.text.TextUtils.isEmpty(r0)
                if (r9 != 0) goto L_0x0193
                java.lang.StringBuilder r9 = new java.lang.StringBuilder
                r9.<init>()
                r9.append(r8)
                r9.append(r0)
                java.lang.String r8 = r9.toString()
            L_0x0193:
                int r7 = r7 + 1
                goto L_0x0056
            L_0x0197:
                com.mbridge.msdk.click.g r0 = com.mbridge.msdk.click.C2324g.this
                com.mbridge.msdk.click.e$a r0 = r0.f4823g
                int r0 = r0.f4784f
                r2 = 200(0xc8, float:2.8E-43)
                if (r0 != r2) goto L_0x01a5
                r0 = r11
                goto L_0x01a6
            L_0x01a5:
                r0 = r6
            L_0x01a6:
                if (r0 == 0) goto L_0x01ba
                r4.setjumpDone(r11)
                r4.setUrl(r8)
                com.mbridge.msdk.click.g r0 = com.mbridge.msdk.click.C2324g.this
                com.mbridge.msdk.click.e$a r0 = r0.f4823g
                java.lang.String r0 = r0.f4785g
                r4.setContent(r0)
                goto L_0x01ec
            L_0x01ba:
                r4.setjumpDone(r6)
                r4.setUrl(r8)
                if (r7 != 0) goto L_0x01ec
                com.mbridge.msdk.click.a.a r7 = com.mbridge.msdk.click.p057a.C2302a.m5402a()
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r2 = "error code:"
                r0.append(r2)
                com.mbridge.msdk.click.g r2 = com.mbridge.msdk.click.C2324g.this
                com.mbridge.msdk.click.e$a r2 = r2.f4823g
                int r2 = r2.f4784f
                r0.append(r2)
                java.lang.String r9 = r0.toString()
                java.lang.String r11 = r1.f4831i
                r10 = r19
                r12 = r17
                r13 = r18
                r14 = r20
                r7.mo15650a(r8, r9, r10, r11, r12, r13, r14)
            L_0x01ec:
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.click.C2324g.C2326a.m5503a(java.lang.String, boolean, boolean, com.mbridge.msdk.foundation.entity.CampaignEx, int):com.mbridge.msdk.click.CommonJumpLoader$JumpLoaderResult");
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public boolean m5506a(String str) {
            CampaignEx campaignEx = this.f4832j;
            if (campaignEx != null) {
                campaignEx.getLinkType();
            }
            if (C8611x.C8612a.m24906a(str)) {
                C2324g.this.f4818b.setCode(1);
                C2324g.this.f4818b.setUrl(str);
                C2324g.this.f4818b.setjumpDone(true);
                return true;
            }
            C2324g.this.f4818b.setCode(2);
            C2324g.this.f4818b.setUrl(str);
            return false;
        }

        /* renamed from: b */
        private boolean m5507b(String str) {
            return !URLUtil.isNetworkUrl(str);
        }

        /* renamed from: a */
        public final void mo15708a() {
            if (C2324g.this.f4817a != null) {
                C2324g.this.f4817a.mo15645a((Object) null);
            }
            CommonJumpLoader.JumpLoaderResult unused = C2324g.this.f4818b = new CommonJumpLoader.JumpLoaderResult();
            C2324g.this.f4818b.setUrl(this.f4829g);
            CommonJumpLoader.JumpLoaderResult unused2 = C2324g.this.f4818b = m5503a(this.f4829g, this.f4833k, this.f4834l, this.f4832j, this.f4835m);
            if (!TextUtils.isEmpty(C2324g.this.f4818b.getExceptionMsg())) {
                C2324g.this.f4818b.setSuccess(true);
            }
            if (C2324g.this.f4819c && C2324g.this.f4818b.isSuccess()) {
                if (C2324g.this.f4823g != null) {
                    C2324g.this.f4818b.setStatusCode(C2324g.this.f4823g.f4784f);
                }
                if (C8611x.C8612a.m24906a(C2324g.this.f4818b.getUrl()) || 200 != C2324g.this.f4823g.f4784f || TextUtils.isEmpty(C2324g.this.f4818b.getContent()) || C2324g.this.f4818b.getContent().contains("EXCEPTION_CAMPAIGN_NOT_ACTIVE")) {
                    if (C2324g.this.f4823g != null) {
                        C2324g.this.f4818b.setType(1);
                        C2324g.this.f4818b.setExceptionMsg(C2324g.this.f4823g.f4786h);
                        C2324g.this.f4818b.setStatusCode(C2324g.this.f4823g.f4784f);
                        C2324g.this.f4818b.setHeader(C2324g.this.f4823g.mo15684a());
                        C2324g.this.f4818b.setContent(C2324g.this.f4823g.f4785g);
                    }
                    m5506a(C2324g.this.f4818b.getUrl());
                    return;
                }
                C2324g.this.f4818b.setType(2);
                if (!TextUtils.isEmpty(C2324g.this.f4818b.getContent())) {
                    new C2317f().mo15687a(this.f4830h, this.f4831i, this.f4828f, C2324g.this.f4818b.getUrl(), C2324g.this.f4818b.getContent(), this.f4836n);
                } else {
                    try {
                        new C2317f().mo15686a(this.f4830h, this.f4831i, this.f4828f, C2324g.this.f4818b.getUrl(), this.f4836n);
                    } catch (Exception unused3) {
                    }
                }
                this.f4827e.acquireUninterruptibly();
            }
        }
    }

    /* renamed from: a */
    public final void mo15705a(C8434a.C8435a aVar) {
        if (aVar == C8434a.C8435a.FINISH && this.f4819c) {
            this.f4824h.post(new Runnable() {
                public final void run() {
                    if (C2324g.this.f4817a == null) {
                        return;
                    }
                    if (C2324g.this.f4818b.isSuccess()) {
                        C2324g.this.f4817a.mo15647b(C2324g.this.f4818b);
                    } else {
                        C2324g.this.f4817a.mo15646a(C2324g.this.f4818b, C2324g.this.f4818b.getMsg());
                    }
                }
            });
        }
    }
}

package com.adcolony.sdk;

import android.content.Context;
import com.adcolony.sdk.C0817e0;
import com.tapjoy.TJAdUnitConstants;
import java.io.IOException;
import java.util.regex.Matcher;
import kotlin.text.Regex;

/* renamed from: com.adcolony.sdk.e */
public final class C0815e extends C0848j {

    /* renamed from: G */
    private String f425G = "";

    /* renamed from: H */
    private String f426H = "";

    /* renamed from: com.adcolony.sdk.e$a */
    static final class C0816a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C0815e f427a;

        C0816a(C0815e eVar) {
            this.f427a = eVar;
        }

        public final void run() {
            C0815e.super.mo10609c();
        }
    }

    public C0815e(Context context, int i, C0841h0 h0Var) {
        super(context, i, h0Var);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public final void mo10607b(Exception exc) {
        new C0817e0.C0818a().mo10684a(exc.getClass().toString()).mo10684a(" during metadata injection w/ metadata = ").mo10684a(C0764c0.m336h(getInfo(), "metadata")).mo10685a(C0817e0.f434i);
        AdColonyInterstitial remove = C0714a.m136b().mo10827c().mo10661f().remove(C0764c0.m336h(getInfo(), "ad_session_id"));
        if (remove != null) {
            remove.mo10399p();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0089, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x008a, code lost:
        kotlin.p396io.CloseableKt.closeFinally(r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x008d, code lost:
        throw r2;
     */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.String m440p() {
        /*
            r8 = this;
            java.lang.String r0 = r8.f426H
            int r0 = r0.length()
            r1 = 0
            if (r0 <= 0) goto L_0x000b
            r0 = 1
            goto L_0x000c
        L_0x000b:
            r0 = r1
        L_0x000c:
            if (r0 == 0) goto L_0x0036
            kotlin.text.Regex r0 = new kotlin.text.Regex
            java.lang.String r1 = "script\\s*src\\s*=\\s*\"mraid.js\""
            r0.<init>((java.lang.String) r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "script src=\"file://"
            r1.append(r2)
            java.lang.String r2 = r8.getMraidFilepath()
            r1.append(r2)
            r2 = 34
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = r8.f426H
            java.lang.String r0 = r0.replaceFirst(r2, r1)
            goto L_0x0086
        L_0x0036:
            java.io.FileInputStream r0 = new java.io.FileInputStream
            java.lang.String r2 = r8.f425G
            r0.<init>(r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0087 }
            int r3 = r0.available()     // Catch:{ all -> 0x0087 }
            r2.<init>(r3)     // Catch:{ all -> 0x0087 }
            r3 = 1024(0x400, float:1.435E-42)
            byte[] r4 = new byte[r3]     // Catch:{ all -> 0x0087 }
        L_0x004a:
            int r5 = r0.read(r4, r1, r3)     // Catch:{ all -> 0x0087 }
            if (r5 < 0) goto L_0x005b
            java.lang.String r6 = new java.lang.String     // Catch:{ all -> 0x0087 }
            java.nio.charset.Charset r7 = kotlin.text.Charsets.UTF_8     // Catch:{ all -> 0x0087 }
            r6.<init>(r4, r1, r5, r7)     // Catch:{ all -> 0x0087 }
            r2.append(r6)     // Catch:{ all -> 0x0087 }
            goto L_0x004a
        L_0x005b:
            java.lang.String r3 = r8.f425G     // Catch:{ all -> 0x0087 }
            java.lang.String r4 = ".html"
            r5 = 2
            r6 = 0
            boolean r1 = kotlin.text.StringsKt.contains$default((java.lang.CharSequence) r3, (java.lang.CharSequence) r4, (boolean) r1, (int) r5, (java.lang.Object) r6)     // Catch:{ all -> 0x0087 }
            if (r1 == 0) goto L_0x006c
            java.lang.String r1 = r2.toString()     // Catch:{ all -> 0x0087 }
            goto L_0x0082
        L_0x006c:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0087 }
            r1.<init>()     // Catch:{ all -> 0x0087 }
            java.lang.String r3 = "<html><script>"
            r1.append(r3)     // Catch:{ all -> 0x0087 }
            r1.append(r2)     // Catch:{ all -> 0x0087 }
            java.lang.String r2 = "</script></html>"
            r1.append(r2)     // Catch:{ all -> 0x0087 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0087 }
        L_0x0082:
            kotlin.p396io.CloseableKt.closeFinally(r0, r6)
            r0 = r1
        L_0x0086:
            return r0
        L_0x0087:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0089 }
        L_0x0089:
            r2 = move-exception
            kotlin.p396io.CloseableKt.closeFinally(r0, r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adcolony.sdk.C0815e.m440p():java.lang.String");
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public /* synthetic */ String mo10610d(C0823f1 f1Var) {
        if (this.f426H.length() > 0) {
            return "";
        }
        return super.mo10610d(f1Var);
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public /* synthetic */ void mo10533i() {
        C0841h0 message = getMessage();
        C0823f1 a = message == null ? null : message.mo10772a();
        if (a == null) {
            a = C0764c0.m322b();
        }
        this.f425G = mo10608c(a);
        this.f426H = C0764c0.m336h(a, "interstitial_html");
        super.mo10533i();
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public /* synthetic */ void mo10534j() {
        try {
            C0841h0 message = getMessage();
            C0823f1 a = message == null ? null : message.mo10772a();
            if (a == null) {
                a = C0764c0.m322b();
            }
            String h = C0764c0.m336h(C0764c0.m334f(a, TJAdUnitConstants.String.VIDEO_INFO), "metadata");
            String a2 = mo10603a(m440p(), C0764c0.m336h(C0764c0.m323b(h), "iab_filepath"));
            Regex regex = new Regex("var\\s*ADC_DEVICE_INFO\\s*=\\s*null\\s*;");
            String replaceFirst = regex.replaceFirst(a2, Matcher.quoteReplacement("var ADC_DEVICE_INFO = " + h + ';'));
            String mUrl = getMUrl();
            if (mUrl.length() == 0) {
                mUrl = getBaseUrl();
            }
            loadDataWithBaseURL(mUrl, replaceFirst, "text/html", (String) null, (String) null);
        } catch (IOException e) {
            mo10607b(e);
        } catch (IllegalArgumentException e2) {
            mo10607b(e2);
        } catch (IndexOutOfBoundsException e3) {
            mo10607b(e3);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public /* synthetic */ void mo10535k() {
    }

    /* renamed from: c */
    public void mo10609c() {
        if (!getDestroyed()) {
            C1038z0.m1187a((Runnable) new C0816a(this), mo10617n() ? 1000 : 0);
        }
    }
}

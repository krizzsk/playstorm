package com.ogury.p375cm.internal;

import android.content.Context;
import com.ogury.core.OguryError;
import com.ogury.core.internal.OguryIntegrationLogger;
import com.ogury.p375cm.internal.aacab;

/* renamed from: com.ogury.cm.internal.aaabb */
public final class aaabb {

    /* renamed from: a */
    private bbbbb f25609a = new bbbbb();

    /* renamed from: b */
    private aabbc f25610b = new aabbc();

    /* renamed from: c */
    private final acbca f25611c = new acbca();
    /* access modifiers changed from: private */

    /* renamed from: d */
    public aabbb f25612d = new aabbb(this.f25615g, (abaab) null, 2, (bbabb) null);

    /* renamed from: e */
    private abacc f25613e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public abacc f25614f;

    /* renamed from: g */
    private Context f25615g;

    /* renamed from: h */
    private String f25616h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public String f25617i;

    /* renamed from: com.ogury.cm.internal.aaabb$aaaaa */
    public static final class aaaaa implements acabb {

        /* renamed from: a */
        final /* synthetic */ aaabb f25618a;

        /* renamed from: b */
        final /* synthetic */ aaacc f25619b;

        /* renamed from: com.ogury.cm.internal.aaabb$aaaaa$aaaaa  reason: collision with other inner class name */
        static final class C12478aaaaa extends bbaca implements bbaaa<babcc> {

            /* renamed from: a */
            final /* synthetic */ aaaaa f25620a;

            /* renamed from: b */
            final /* synthetic */ String f25621b;

            /* renamed from: c */
            final /* synthetic */ int f25622c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C12478aaaaa(aaaaa aaaaa, String str, int i) {
                super(0);
                this.f25620a = aaaaa;
                this.f25621b = str;
                this.f25622c = i;
            }

            /* renamed from: a */
            public final /* synthetic */ Object mo66502a() {
                aacab.aaaaa aaaaa = aacab.f25670a;
                final OguryError a = aacab.aaaaa.m30668a(this.f25621b);
                abbac abbac = abbac.f25713a;
                abbac.m30709b().mo66550a(new bbaaa<babcc>(this) {

                    /* renamed from: a */
                    final /* synthetic */ C12478aaaaa f25623a;

                    {
                        this.f25623a = r1;
                    }

                    /* renamed from: a */
                    public final /* synthetic */ Object mo66502a() {
                        int i = this.f25623a.f25622c;
                        if (400 <= i && 499 >= i) {
                            OguryIntegrationLogger.m30996d("[Consent][External] Sending failed. Servers could not process the request (error code: " + a.getErrorCode() + ", message: " + a.getMessage() + ')');
                            this.f25623a.f25620a.f25618a.f25612d.mo66532a(this.f25623a.f25620a.f25619b, false);
                        } else {
                            OguryIntegrationLogger.m30996d("[Consent][External] Sending failed (HTTP status code: " + this.f25623a.f25622c + ')');
                        }
                        OguryIntegrationLogger.m30997e("[Consent][External] Failed to pass external consent data");
                        aabca aabca = aabca.f25663a;
                        aabca.m30654a("ERROR");
                        return babcc.f25908a;
                    }
                });
                return babcc.f25908a;
            }
        }

        aaaaa(aaabb aaabb, aaacc aaacc) {
            this.f25618a = aaabb;
            this.f25619b = aaacc;
        }

        /* renamed from: a */
        public final void mo66498a(int i, String str) {
            bbabc.m30943b(str, "error");
            abbac abbac = abbac.f25713a;
            abbac.m30708a().mo66550a(new C12478aaaaa(this, str, i));
        }

        /* renamed from: a */
        public final void mo66499a(String str) {
            bbabc.m30943b(str, "response");
            OguryIntegrationLogger.m30996d("[Consent][External] Sending succeed. External consent data successfully passed!");
            this.f25618a.f25612d.mo66532a(this.f25619b, true);
            int i = aaabc.f25628a[acbca.m30845a(str).ordinal()];
            if (i == 1 || i == 2) {
                aabca aabca = aabca.f25663a;
                aabca.m30652a();
            }
            aabca aabca2 = aabca.f25663a;
            aabca.m30654a("COMPLETE");
        }
    }

    /* renamed from: com.ogury.cm.internal.aaabb$aaaab */
    static final class aaaab extends bbaca implements bbaaa<babcc> {

        /* renamed from: a */
        final /* synthetic */ aaabb f25625a;

        /* renamed from: b */
        final /* synthetic */ aaacc f25626b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        aaaab(aaabb aaabb, aaacc aaacc) {
            super(0);
            this.f25625a = aaabb;
            this.f25626b = aaacc;
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo66502a() {
            if (aaabb.m30608a(this.f25625a, this.f25626b)) {
                aabca aabca = aabca.f25663a;
                aabca.m30654a("PASSING");
                this.f25625a.f25614f.mo66550a(new bbaaa<babcc>(this) {

                    /* renamed from: a */
                    final /* synthetic */ aaaab f25627a;

                    {
                        this.f25627a = r1;
                    }

                    /* renamed from: a */
                    public final /* synthetic */ Object mo66502a() {
                        aaabb.m30607a(this.f25627a.f25625a, this.f25627a.f25625a.f25617i, this.f25627a.f25626b);
                        return babcc.f25908a;
                    }
                });
            }
            return babcc.f25908a;
        }
    }

    public aaabb(Context context, String str, String str2) {
        bbabc.m30943b(context, "context");
        bbabc.m30943b(str, "assetKey");
        bbabc.m30943b(str2, "consentToken");
        this.f25615g = context;
        this.f25616h = str;
        this.f25617i = str2;
        abbac abbac = abbac.f25713a;
        this.f25613e = abbac.m30708a();
        abbac abbac2 = abbac.f25713a;
        this.f25614f = abbac.m30709b();
    }

    /* renamed from: a */
    public static final /* synthetic */ void m30607a(aaabb aaabb, String str, aaacc aaacc) {
        OguryIntegrationLogger.m30996d("[Consent][External] Sending consent data to Ogury servers...");
        aaabb.f25610b.mo66535a(aaabb.f25615g, aaabb.f25616h, str, aaacc, new aaaaa(aaabb, aaacc));
    }

    /* renamed from: a */
    public static final /* synthetic */ boolean m30608a(aaabb aaabb, aaacc aaacc) {
        String str;
        if (!bbbbb.m30958a(aaabb.f25615g)) {
            OguryIntegrationLogger.m30997e("[Consent][External] Failed to pass external consent data (no Internet connection)");
            return false;
        }
        OguryIntegrationLogger.m30996d("[Consent][External] Internet connection is OK");
        if (!aaabb.f25612d.mo66533a(aaacc)) {
            str = "[Consent][External] This Consent data has never been passed. It can be sent.";
        } else if (aaabb.f25612d.mo66534b(aaacc)) {
            str = "[Consent][External] Consent data should be resent (cache expired)";
        } else {
            OguryIntegrationLogger.m30996d("[Consent][External] Consent data do not need to be passed (already sent)");
            return false;
        }
        OguryIntegrationLogger.m30996d(str);
        return true;
    }

    /* renamed from: a */
    public final void mo66514a(aaacc aaacc) {
        bbabc.m30943b(aaacc, "externalConsentData");
        this.f25613e.mo66550a(new aaaab(this, aaacc));
    }
}

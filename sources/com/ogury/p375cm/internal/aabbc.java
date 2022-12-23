package com.ogury.p375cm.internal;

import android.content.Context;
import androidx.browser.trusted.sharing.ShareTarget;
import com.ogury.p375cm.ConsentActivity;

/* renamed from: com.ogury.cm.internal.aabbc */
public final class aabbc {

    /* renamed from: a */
    private final abccb f25650a = new abccb();

    /* renamed from: com.ogury.cm.internal.aabbc$aaaaa */
    public static final class aaaaa implements acabb {

        /* renamed from: a */
        final /* synthetic */ acabb f25651a;

        /* renamed from: com.ogury.cm.internal.aabbc$aaaaa$aaaaa  reason: collision with other inner class name */
        static final class C12479aaaaa extends bbaca implements bbaaa<babcc> {

            /* renamed from: a */
            final /* synthetic */ aaaaa f25652a;

            /* renamed from: b */
            final /* synthetic */ String f25653b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C12479aaaaa(aaaaa aaaaa, String str) {
                super(0);
                this.f25652a = aaaaa;
                this.f25653b = str;
            }

            /* renamed from: a */
            public final /* bridge */ /* synthetic */ Object mo66502a() {
                this.f25652a.f25651a.mo66499a(this.f25653b);
                return babcc.f25908a;
            }
        }

        /* renamed from: com.ogury.cm.internal.aabbc$aaaaa$aaaab */
        static final class aaaab extends bbaca implements bbaaa<babcc> {

            /* renamed from: a */
            final /* synthetic */ aaaaa f25654a;

            /* renamed from: b */
            final /* synthetic */ int f25655b;

            /* renamed from: c */
            final /* synthetic */ String f25656c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            aaaab(aaaaa aaaaa, int i, String str) {
                super(0);
                this.f25654a = aaaaa;
                this.f25655b = i;
                this.f25656c = str;
            }

            /* renamed from: a */
            public final /* bridge */ /* synthetic */ Object mo66502a() {
                this.f25654a.f25651a.mo66498a(this.f25655b, this.f25656c);
                return babcc.f25908a;
            }
        }

        aaaaa(acabb acabb) {
            this.f25651a = acabb;
        }

        /* renamed from: a */
        public final void mo66498a(int i, String str) {
            bbabc.m30943b(str, "error");
            abbac abbac = abbac.f25713a;
            abbac.m30709b().mo66550a(new aaaab(this, i, str));
        }

        /* renamed from: a */
        public final void mo66499a(String str) {
            bbabc.m30943b(str, "response");
            abbac abbac = abbac.f25713a;
            abbac.m30709b().mo66550a(new C12479aaaaa(this, str));
        }
    }

    /* renamed from: com.ogury.cm.internal.aabbc$aaaab */
    static final class aaaab extends bbaca implements bbaaa<babcc> {

        /* renamed from: a */
        final /* synthetic */ aabbc f25657a;

        /* renamed from: b */
        final /* synthetic */ aaacc f25658b;

        /* renamed from: c */
        final /* synthetic */ Context f25659c;

        /* renamed from: d */
        final /* synthetic */ String f25660d;

        /* renamed from: e */
        final /* synthetic */ String f25661e;

        /* renamed from: f */
        final /* synthetic */ acabb f25662f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        aaaab(aabbc aabbc, aaacc aaacc, Context context, String str, String str2, acabb acabb) {
            super(0);
            this.f25657a = aabbc;
            this.f25658b = aaacc;
            this.f25659c = context;
            this.f25660d = str;
            this.f25661e = str2;
            this.f25662f = acabb;
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo66502a() {
            acabc acabc;
            String str;
            String str2;
            abcbc abcbc;
            acaba a = new acaba().mo66615a(ShareTarget.METHOD_POST);
            aaacc aaacc = this.f25658b;
            if (aaacc instanceof aabab) {
                acaca acaca = acaca.f25841a;
                acabc = acabc.EXTERNAL_TCF_CONSENT;
            } else if (aaacc instanceof aabaa) {
                acaca acaca2 = acaca.f25841a;
                acabc = acabc.EXTERNAL_BOOLEAN_CONSENT;
            } else {
                throw new babbb();
            }
            acaba c = a.mo66620c(acaca.m30828a(acabc));
            Context context = this.f25659c;
            String str3 = this.f25660d;
            String str4 = this.f25661e;
            aaacc aaacc2 = this.f25658b;
            new bacbb();
            bbabc.m30943b(context, "context");
            bbabc.m30943b(str3, "appKey");
            bbabc.m30943b(aaacc2, "externalConsentData");
            bbabc.m30943b(str4, "consentToken");
            if (aaacc2 instanceof aabab) {
                if (aaacc2 instanceof aabac) {
                    Context applicationContext = context.getApplicationContext();
                    bbabc.m30940a((Object) applicationContext, "context.applicationContext");
                    String packageName = applicationContext.getPackageName();
                    bbabc.m30940a((Object) packageName, "context.applicationContext.packageName");
                    String c2 = ConsentActivity.aaaaa.m30523c(context);
                    aabab aabab = (aabab) aaacc2;
                    String b = aabab.mo66528b();
                    Integer[] d = ((aabac) aaacc2).mo66530d();
                    String name = aabab.mo66529c().name();
                    String str5 = packageName;
                    String str6 = "3.3.0";
                    str = abcbc.mo66603a().mo66599a().toString();
                    str2 = "requestBodyBuilder.build…serializedJson.toString()";
                } else {
                    Context applicationContext2 = context.getApplicationContext();
                    bbabc.m30940a((Object) applicationContext2, "context.applicationContext");
                    String packageName2 = applicationContext2.getPackageName();
                    bbabc.m30940a((Object) packageName2, "context.applicationContext.packageName");
                    aabab aabab2 = (aabab) aaacc2;
                    new abcbc(str3, "android", packageName2, "3.3.0", ConsentActivity.aaaaa.m30523c(context), str4, (Boolean) null, aabab2.mo66528b(), (String) null, aabab2.mo66529c().name(), (Integer[]) null, 1344, (bbabb) null);
                    str = abcbc.mo66603a().mo66599a().toString();
                    str2 = "requestBodyBuilder.build…serializedJson.toString()";
                }
                bbabc.m30940a((Object) str, str2);
            } else if (aaacc2 instanceof aabaa) {
                Context applicationContext3 = context.getApplicationContext();
                bbabc.m30940a((Object) applicationContext3, "context.applicationContext");
                String packageName3 = applicationContext3.getPackageName();
                bbabc.m30940a((Object) packageName3, "context.applicationContext.packageName");
                aabaa aabaa = (aabaa) aaacc2;
                str = new abcbc(str3, "android", packageName3, "3.3.0", ConsentActivity.aaaaa.m30523c(context), str4, Boolean.valueOf(aabaa.mo66525a()), (String) null, aabaa.mo66526b(), aabba.MANUAL.name(), (Integer[]) null, 1152, (bbabb) null).mo66603a().mo66599a().toString();
                bbabc.m30940a((Object) str, "requestBodyBuilder.build…serializedJson.toString()");
            } else {
                throw new babbb();
            }
            abccb.m30804a(c.mo66618b(str).mo66614a(this.f25662f).mo66624f());
            return babcc.f25908a;
        }
    }

    /* renamed from: a */
    public final void mo66535a(Context context, String str, String str2, aaacc aaacc, acabb acabb) {
        bbabc.m30943b(context, "context");
        bbabc.m30943b(str, "assetKey");
        bbabc.m30943b(str2, "consentToken");
        bbabc.m30943b(aaacc, "externalConsentData");
        bbabc.m30943b(acabb, "requestCallback");
        abbac abbac = abbac.f25713a;
        abbac.m30708a().mo66550a(new aaaab(this, aaacc, context, str, str2, new aaaaa(acabb)));
    }
}

package p394io.presage.interstitial.p395ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.ogury.core.internal.OguryIntegrationLogger;
import com.ogury.p376ed.internal.C10318aj;
import com.ogury.p376ed.internal.C10337ap;
import com.ogury.p376ed.internal.C10427da;
import com.ogury.p376ed.internal.C10431dd;
import com.ogury.p376ed.internal.C10483eb;
import com.ogury.p376ed.internal.C10494el;
import com.ogury.p376ed.internal.C10546g;
import com.ogury.p376ed.internal.C10571gv;
import com.ogury.p376ed.internal.C10584he;
import com.ogury.p376ed.internal.C10585hf;
import com.ogury.p376ed.internal.C10586hg;
import com.ogury.p376ed.internal.C10765mq;
import com.ogury.p376ed.internal.C10771mw;
import com.ogury.p376ed.internal.C10831s;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* renamed from: io.presage.interstitial.ui.InterstitialActivity */
public class InterstitialActivity extends Activity implements C10431dd {

    /* renamed from: a */
    public static final C12363a f29347a = new C12363a((byte) 0);

    /* renamed from: b */
    private C10318aj f29348b;

    /* renamed from: c */
    private C10427da f29349c = C10427da.f26371a;

    /* renamed from: d */
    private boolean f29350d;

    /* renamed from: e */
    private boolean f29351e = true;

    /* renamed from: a */
    private static boolean m34613a(Bundle bundle) {
        return bundle != null;
    }

    /* renamed from: io.presage.interstitial.ui.InterstitialActivity$a */
    public static final class C12363a implements C10337ap {
        public /* synthetic */ C12363a(byte b) {
            this();
        }

        private C12363a() {
        }

        /* renamed from: a */
        public final void mo67081a(Context context, String str, C10483eb ebVar, List<C10483eb> list) {
            C10765mq.m32773b(context, "context");
            C10765mq.m32773b(str, "expandCacheItemId");
            C10765mq.m32773b(ebVar, "ad");
            C10765mq.m32773b(list, "notDisplayedAds");
            Intent a = m34618a(ebVar, list, context);
            a.putExtra("mode", 1);
            a.putExtra("expand_cache_item_id", str);
            context.startActivity(a);
        }

        /* renamed from: a */
        public final void mo67080a(Context context, C10483eb ebVar, List<C10483eb> list) {
            C10765mq.m32773b(context, "context");
            C10765mq.m32773b(ebVar, "ad");
            C10765mq.m32773b(list, "notDisplayedAds");
            OguryIntegrationLogger.m30996d("[Ads][Activity] Prepare and start Activity");
            context.startActivity(m34618a(ebVar, list, context));
        }

        /* renamed from: a */
        private static Intent m34618a(C10483eb ebVar, List<C10483eb> list, Context context) {
            Intent intent = new Intent(context, m34619a(ebVar));
            intent.putExtra("ad", ebVar);
            intent.putExtra("not_displayed_ads", new ArrayList(list));
            intent.addFlags(268435456);
            return intent;
        }

        /* renamed from: a */
        private static Class<?> m34619a(C10483eb ebVar) {
            if (m34620a()) {
                return InterstitialActivity.class;
            }
            return ebVar.mo67252n() ? InterstitialAndroid8TransparentActivity.class : InterstitialAndroid8RotableActivity.class;
        }

        /* renamed from: a */
        private static boolean m34620a() {
            return Build.VERSION.SDK_INT != 26;
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (m34613a(bundle)) {
            finish();
            return;
        }
        m34615c();
        try {
            List<C10483eb> b = m34614b();
            C10483eb a = m34612a();
            if (a != null) {
                this.f29350d = C10494el.m31815a(a);
                Intent intent = getIntent();
                C10765mq.m32770a((Object) intent, SDKConstants.PARAM_INTENT);
                C10571gv gvVar = new C10571gv(this, intent, a, b);
                C10546g a2 = gvVar.mo67510a();
                a2.setDisplayedInFullScreen(true);
                this.f29348b = gvVar.mo67511b();
                setContentView(a2);
                return;
            }
            throw new IllegalStateException("Ad not sent to interstitial activity");
        } catch (Throwable th) {
            OguryIntegrationLogger.m30997e(C10765mq.m32765a("[Ads][Activity] onCreate() failed (", (Object) th.getMessage()));
            this.f29351e = false;
            C10427da.m31544a(th);
            finish();
        }
    }

    /* renamed from: a */
    private final C10483eb m34612a() {
        Serializable serializableExtra = getIntent().getSerializableExtra("ad");
        if (serializableExtra instanceof C10483eb) {
            return (C10483eb) serializableExtra;
        }
        return null;
    }

    /* renamed from: b */
    private final List<C10483eb> m34614b() {
        Serializable serializableExtra = getIntent().getSerializableExtra("not_displayed_ads");
        if (serializableExtra != null) {
            return C10771mw.m32792b(serializableExtra);
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.MutableList<io.presage.common.network.models.Ad>");
    }

    /* renamed from: c */
    private final void m34615c() {
        getWindow().setFlags(16777216, 16777216);
    }

    /* renamed from: a */
    public void mo75001a(C10483eb ebVar) {
        String str = null;
        if (C10765mq.m32772a((Object) ebVar == null ? null : ebVar.mo67228d(), (Object) "landscape")) {
            setRequestedOrientation(0);
            return;
        }
        if (ebVar != null) {
            str = ebVar.mo67228d();
        }
        if (C10765mq.m32772a((Object) str, (Object) "portrait")) {
            setRequestedOrientation(1);
        }
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        if (this.f29350d) {
            C10831s sVar = C10831s.f27048a;
            C10831s.m32877b(true);
        }
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        if (this.f29350d) {
            C10831s sVar = C10831s.f27048a;
            C10831s.m32877b(false);
        }
        overridePendingTransition(0, 0);
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        C10318aj ajVar = this.f29348b;
        if (ajVar != null) {
            ajVar.mo67028a(isFinishing());
        }
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        if (this.f29351e) {
            C10318aj ajVar = this.f29348b;
            if (ajVar != null) {
                ajVar.mo67044m();
            }
        } else {
            m34616d();
        }
        this.f29348b = null;
    }

    public void onBackPressed() {
        C10318aj ajVar = this.f29348b;
        if (ajVar == null ? true : ajVar.mo67045n()) {
            super.onBackPressed();
        }
    }

    /* renamed from: d */
    private final void m34616d() {
        C10483eb a = m34612a();
        if (a != null) {
            C10586hg hgVar = C10586hg.f26712a;
            C10586hg.m32203a((C10585hf) new C10584he(a.mo67222b()));
            C10586hg hgVar2 = C10586hg.f26712a;
            C10586hg.m32204a(a.mo67222b());
        }
    }
}

package p394io.presage.mraid.browser;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.FrameLayout;
import android.widget.Toast;
import com.ogury.p376ed.internal.C10410cp;
import com.ogury.p376ed.internal.C10431dd;
import com.ogury.p376ed.internal.C10601hr;
import com.ogury.p376ed.internal.C10603hs;
import com.ogury.p376ed.internal.C10605ht;
import com.ogury.p376ed.internal.C10606hu;
import com.ogury.p376ed.internal.C10643iv;
import com.ogury.p376ed.internal.C10646ix;
import com.ogury.p376ed.internal.C10684ke;
import com.ogury.p376ed.internal.C10729lj;
import com.ogury.p376ed.internal.C10765mq;
import com.ogury.p376ed.internal.C10766mr;

/* renamed from: io.presage.mraid.browser.ShortcutActivity */
public class ShortcutActivity extends Activity implements C10431dd {

    /* renamed from: a */
    public static final C12364a f29352a = new C12364a((byte) 0);

    /* renamed from: b */
    private C10601hr.C10602a f29353b = C10601hr.f26750a;

    /* renamed from: c */
    private C10601hr f29354c;

    /* renamed from: io.presage.mraid.browser.ShortcutActivity$a */
    public static final class C12364a {
        public /* synthetic */ C12364a(byte b) {
            this();
        }

        private C12364a() {
        }

        /* renamed from: io.presage.mraid.browser.ShortcutActivity$a$a */
        static final class C12365a extends C10766mr implements C10729lj<C10684ke> {

            /* renamed from: a */
            final /* synthetic */ Context f29355a;

            /* renamed from: b */
            final /* synthetic */ C10646ix f29356b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C12365a(Context context, C10646ix ixVar) {
                super(0);
                this.f29355a = context;
                this.f29356b = ixVar;
            }

            /* renamed from: a */
            public final /* synthetic */ Object mo67074a() {
                m34625b();
                return C10684ke.f26938a;
            }

            /* renamed from: b */
            private void m34625b() {
                new C10603hs(this.f29355a, this.f29356b).mo67572a();
            }
        }

        /* renamed from: a */
        public static void m34624a(Context context, C10646ix ixVar) {
            C10765mq.m32773b(context, "context");
            C10765mq.m32773b(ixVar, "shortcutIcon");
            C10410cp.C10411a aVar = C10410cp.f26347a;
            C10410cp.C10411a.m31506a(new C12365a(context, ixVar)).mo67164a((C10729lj<C10684ke>) C12366b.f29357a);
        }

        /* renamed from: io.presage.mraid.browser.ShortcutActivity$a$b */
        static final class C12366b extends C10766mr implements C10729lj<C10684ke> {

            /* renamed from: a */
            public static final C12366b f29357a = new C12366b();

            C12366b() {
                super(0);
            }

            /* renamed from: a */
            public final /* bridge */ /* synthetic */ Object mo67074a() {
                return C10684ke.f26938a;
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        String str;
        Bundle extras;
        String string;
        Bundle extras2;
        super.onCreate(bundle);
        Context context = this;
        FrameLayout frameLayout = new FrameLayout(context);
        Intent intent = getIntent();
        String str2 = "";
        if (intent == null || (extras2 = intent.getExtras()) == null || (str = extras2.getString("args", str2)) == null) {
            str = str2;
        }
        Intent intent2 = getIntent();
        if (!(intent2 == null || (extras = intent2.getExtras()) == null || (string = extras.getString("identifier", str2)) == null)) {
            str2 = string;
        }
        Context applicationContext = getApplicationContext();
        C10765mq.m32770a((Object) applicationContext, "this.applicationContext");
        C10601hr a = C10601hr.C10602a.m32280a(new C10606hu(context), this, new C10643iv(applicationContext, new C10605ht(this), new C12367b(this)));
        this.f29354c = a;
        if (!a.mo67571a(str, str2, frameLayout)) {
            Toast.makeText(context, "Invalid shortcut", 0).show();
            finish();
            return;
        }
        setContentView(frameLayout);
    }

    /* renamed from: io.presage.mraid.browser.ShortcutActivity$b */
    static final class C12367b extends C10766mr implements C10729lj<C10684ke> {

        /* renamed from: a */
        final /* synthetic */ ShortcutActivity f29358a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C12367b(ShortcutActivity shortcutActivity) {
            super(0);
            this.f29358a = shortcutActivity;
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo67074a() {
            m34628b();
            return C10684ke.f26938a;
        }

        /* renamed from: b */
        private void m34628b() {
            this.f29358a.finish();
        }
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        C10601hr hrVar = this.f29354c;
        if (hrVar != null) {
            hrVar.mo67570a();
        }
    }
}

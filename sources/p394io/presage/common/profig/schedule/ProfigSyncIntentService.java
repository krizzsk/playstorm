package p394io.presage.common.profig.schedule;

import android.app.IntentService;
import android.content.Context;
import android.content.Intent;
import com.ogury.p376ed.internal.C10517fc;
import com.ogury.p376ed.internal.C10765mq;

/* renamed from: io.presage.common.profig.schedule.ProfigSyncIntentService */
public final class ProfigSyncIntentService extends IntentService {

    /* renamed from: a */
    public static final C12361a f29340a = new C12361a((byte) 0);

    public ProfigSyncIntentService() {
        super("ProfigService");
    }

    /* renamed from: io.presage.common.profig.schedule.ProfigSyncIntentService$a */
    public static final class C12361a {
        public /* synthetic */ C12361a(byte b) {
            this();
        }

        private C12361a() {
        }

        /* renamed from: a */
        public static void m34609a(Context context) {
            C10765mq.m32773b(context, "context");
            try {
                C10517fc.C10518a aVar = C10517fc.f26576a;
                Context applicationContext = context.getApplicationContext();
                C10765mq.m32770a((Object) applicationContext, "context.applicationContext");
                aVar.mo67367a(applicationContext).mo67366b();
            } catch (Exception unused) {
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void onHandleIntent(Intent intent) {
        Context applicationContext = getApplicationContext();
        C10765mq.m32770a((Object) applicationContext, "applicationContext");
        C12361a.m34609a(applicationContext);
    }
}

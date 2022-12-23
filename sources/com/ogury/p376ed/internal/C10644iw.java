package com.ogury.p376ed.internal;

import android.content.Context;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.mbridge.msdk.foundation.entity.RewardPlus;
import com.smaato.sdk.video.vast.model.Creative;
import com.tapjoy.TJAdUnitConstants;
import com.tapjoy.TapjoyConstants;
import java.util.Arrays;
import java.util.Map;
import p394io.presage.mraid.browser.ShortcutActivity;

/* renamed from: com.ogury.ed.internal.iw */
public final class C10644iw extends C10639it {

    /* renamed from: b */
    public static final C10645a f26861b = new C10645a((byte) 0);

    /* renamed from: c */
    private final Context f26862c;

    /* renamed from: d */
    private final C10580hb f26863d;

    /* renamed from: e */
    private final C10647iy f26864e;

    /* renamed from: f */
    private final C10577gz f26865f;

    /* renamed from: g */
    private final C10586hg f26866g;

    /* renamed from: h */
    private final C10514fa f26867h;

    /* renamed from: i */
    private final C10510ez f26868i;

    /* renamed from: j */
    private C10729lj<C10684ke> f26869j;

    /* renamed from: k */
    private ShortcutActivity.C12364a f26870k = ShortcutActivity.f29352a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10644iw(Context context, C10580hb hbVar, C10647iy iyVar, C10577gz gzVar, C10586hg hgVar, C10514fa faVar, C10510ez ezVar) {
        super(hbVar);
        C10765mq.m32773b(context, "context");
        C10765mq.m32773b(hbVar, "mraidCommandExecutor");
        C10765mq.m32773b(iyVar, "mraidViewCommands");
        C10765mq.m32773b(gzVar, "intentHandler");
        C10765mq.m32773b(hgVar, "mraidEventBus");
        C10765mq.m32773b(faVar, TapjoyConstants.TJC_APP_PLACEMENT);
        C10765mq.m32773b(ezVar, "androidDevice");
        this.f26862c = context;
        this.f26863d = hbVar;
        this.f26864e = iyVar;
        this.f26865f = gzVar;
        this.f26866g = hgVar;
        this.f26867h = faVar;
        this.f26868i = ezVar;
    }

    /* renamed from: a */
    public final void mo67657a(C10729lj<C10684ke> ljVar) {
        this.f26869j = ljVar;
    }

    /* renamed from: com.ogury.ed.internal.iw$a */
    public static final class C10645a {
        public /* synthetic */ C10645a(byte b) {
            this();
        }

        private C10645a() {
        }
    }

    /* renamed from: b */
    public final void mo67643b(boolean z) {
        if (z) {
            this.f26864e.mo67048q();
        } else {
            this.f26864e.mo67049r();
        }
    }

    /* renamed from: a */
    public final void mo67642a(boolean z) {
        this.f26864e.mo67031b(z);
    }

    /* renamed from: a */
    public final void mo67647a(String str, String str2) {
        C10765mq.m32773b(str2, Creative.AD_ID);
        C10577gz.m32145a(this.f26862c, str);
    }

    /* renamed from: b */
    public final void mo67652b(String str, String str2) {
        C10765mq.m32773b(str2, TJAdUnitConstants.String.CALLBACK_ID);
        boolean c = C10577gz.m32148c(this.f26862c, str);
        boolean z = C10510ez.m31861b() >= 30 && this.f26867h.mo67363h() >= 30;
        C10770mv mvVar = C10770mv.f27006a;
        String format = String.format("{isResolved: %s, hasLimitedPackageVisibility: %s}", Arrays.copyOf(new Object[]{Boolean.valueOf(c), Boolean.valueOf(z)}, 2));
        C10765mq.m32770a((Object) format, "java.lang.String.format(format, *args)");
        this.f26863d.mo67532b(str2, format);
    }

    /* renamed from: a */
    public final void mo67648a(String str, String str2, String str3) {
        C10765mq.m32773b(str2, TJAdUnitConstants.String.CALLBACK_ID);
        C10765mq.m32773b(str3, Creative.AD_ID);
        if (C10577gz.m32147b(this.f26862c, str)) {
            this.f26863d.mo67532b(str2, "{isStarted: true}");
            C10729lj<C10684ke> ljVar = this.f26869j;
            if (ljVar != null) {
                ljVar.mo67074a();
                return;
            }
            return;
        }
        this.f26863d.mo67532b(str2, "{isStarted: false}");
    }

    /* renamed from: a */
    public final void mo67649a(Map<String, String> map, String str) {
        C10765mq.m32773b(map, "params");
        C10765mq.m32773b(str, "args");
        boolean z = true;
        if (str.length() > 0) {
            CharSequence charSequence = map.get("name");
            if (!(charSequence == null || charSequence.length() == 0)) {
                CharSequence charSequence2 = map.get(RewardPlus.ICON);
                if (!(charSequence2 == null || charSequence2.length() == 0)) {
                    z = false;
                }
                if (!z) {
                    ShortcutActivity.C12364a.m34624a(this.f26862c, new C10646ix(String.valueOf(map.get("id")), String.valueOf(map.get("name")), String.valueOf(map.get(RewardPlus.ICON)), str));
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo67644a(C10493ek ekVar) {
        C10765mq.m32773b(ekVar, IronSourceConstants.EVENTS_AD_UNIT);
        C10586hg.m32203a((C10585hf) new C10588hi(ekVar.mo67294b(), ekVar.mo67300e()));
    }

    /* renamed from: a */
    public final void mo67646a(String str) {
        C10765mq.m32773b(str, Creative.AD_ID);
        this.f26864e.mo67027a(str);
    }

    /* renamed from: a */
    public final void mo67645a(C10648iz izVar) {
        this.f26864e.mo67026a(izVar);
    }

    /* renamed from: b */
    public final void mo67650b() {
        this.f26864e.mo67053v();
    }

    /* renamed from: c */
    public final void mo67653c() {
        this.f26864e.mo67051t();
    }

    /* renamed from: c */
    public final void mo67655c(boolean z) {
        this.f26864e.mo67033c(z);
    }

    /* renamed from: a */
    public final void mo67641a() {
        this.f26864e.mo67033c(false);
    }

    /* renamed from: b */
    public final void mo67651b(String str) {
        C10765mq.m32773b(str, Creative.AD_ID);
        C10586hg.m32203a((C10585hf) new C10579ha(str));
    }

    /* renamed from: c */
    public final void mo67654c(String str) {
        C10765mq.m32773b(str, Creative.AD_ID);
        C10586hg.m32203a(new C10585hf(str, "adImpression"));
    }
}

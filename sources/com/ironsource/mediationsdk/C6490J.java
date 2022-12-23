package com.ironsource.mediationsdk;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.ironsource.environment.C6429h;
import com.ironsource.environment.ContextProvider;
import com.ironsource.environment.p206f.C6427b;
import com.ironsource.mediationsdk.C6504O;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.adunit.data.DataKeys;
import com.ironsource.mediationsdk.adunit.p210c.C6617g;
import com.ironsource.mediationsdk.adunit.p210c.C6618h;
import com.ironsource.mediationsdk.config.ConfigFile;
import com.ironsource.mediationsdk.impressionData.C6665a;
import com.ironsource.mediationsdk.logger.C6685b;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.logger.LogListener;
import com.ironsource.mediationsdk.metadata.MetaData;
import com.ironsource.mediationsdk.metadata.MetaDataUtils;
import com.ironsource.mediationsdk.model.C6695e;
import com.ironsource.mediationsdk.model.C6696f;
import com.ironsource.mediationsdk.model.C6697g;
import com.ironsource.mediationsdk.model.C6698h;
import com.ironsource.mediationsdk.model.C6700j;
import com.ironsource.mediationsdk.model.C6706o;
import com.ironsource.mediationsdk.model.InterstitialPlacement;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.model.Placement;
import com.ironsource.mediationsdk.p207a.C6552c;
import com.ironsource.mediationsdk.p207a.C6553d;
import com.ironsource.mediationsdk.p207a.C6557h;
import com.ironsource.mediationsdk.p217c.C6652b;
import com.ironsource.mediationsdk.sdk.C6730l;
import com.ironsource.mediationsdk.sdk.ISDemandOnlyInterstitialListener;
import com.ironsource.mediationsdk.sdk.ISDemandOnlyRewardedVideoListener;
import com.ironsource.mediationsdk.sdk.InitializationListener;
import com.ironsource.mediationsdk.sdk.RewardedVideoManualListener;
import com.ironsource.mediationsdk.server.HttpFunctions;
import com.ironsource.mediationsdk.server.ServerURL;
import com.ironsource.mediationsdk.utils.C6770g;
import com.ironsource.mediationsdk.utils.C6772i;
import com.ironsource.mediationsdk.utils.C6774k;
import com.ironsource.mediationsdk.utils.C6777l;
import com.ironsource.mediationsdk.utils.C6784p;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.ironsource.mediationsdk.utils.IronSourceAES;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.ironsource.p199c.C6389a;
import com.ironsource.p200d.C6392a;
import com.ironsource.p200d.C6393b;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.mediationsdk.J */
public final class C6490J implements C6772i {

    /* renamed from: ap */
    private static boolean f16493ap = false;

    /* renamed from: A */
    C6525U f16494A;

    /* renamed from: B */
    C6515R f16495B;

    /* renamed from: C */
    C6617g f16496C;

    /* renamed from: D */
    C6618h f16497D;

    /* renamed from: E */
    boolean f16498E;

    /* renamed from: F */
    boolean f16499F;

    /* renamed from: G */
    boolean f16500G;

    /* renamed from: H */
    boolean f16501H;

    /* renamed from: I */
    boolean f16502I;

    /* renamed from: J */
    boolean f16503J;

    /* renamed from: K */
    boolean f16504K;

    /* renamed from: L */
    int f16505L;

    /* renamed from: M */
    C6762u f16506M;

    /* renamed from: N */
    C6718s f16507N;

    /* renamed from: O */
    C6665a f16508O;

    /* renamed from: P */
    private final String f16509P;

    /* renamed from: Q */
    private final String f16510Q;

    /* renamed from: R */
    private AbstractAdapter f16511R;

    /* renamed from: S */
    private AtomicBoolean f16512S;

    /* renamed from: T */
    private final Object f16513T;

    /* renamed from: U */
    private AtomicBoolean f16514U;

    /* renamed from: V */
    private boolean f16515V;

    /* renamed from: W */
    private List<IronSource.AD_UNIT> f16516W;

    /* renamed from: X */
    private Set<IronSource.AD_UNIT> f16517X;

    /* renamed from: Y */
    private Set<IronSource.AD_UNIT> f16518Y;

    /* renamed from: Z */
    private boolean f16519Z;

    /* renamed from: a */
    final String f16520a;

    /* renamed from: aa */
    private final String f16521aa;

    /* renamed from: ab */
    private boolean f16522ab;

    /* renamed from: ac */
    private boolean f16523ac;

    /* renamed from: ad */
    private Boolean f16524ad;

    /* renamed from: ae */
    private IronSourceBannerLayout f16525ae;

    /* renamed from: af */
    private String f16526af;

    /* renamed from: ag */
    private InitializationListener f16527ag;

    /* renamed from: ah */
    private AtomicBoolean f16528ah;

    /* renamed from: ai */
    private boolean f16529ai;

    /* renamed from: aj */
    private CopyOnWriteArraySet<String> f16530aj;

    /* renamed from: ak */
    private CopyOnWriteArraySet<String> f16531ak;

    /* renamed from: al */
    private CopyOnWriteArraySet<String> f16532al;

    /* renamed from: am */
    private C6787w f16533am;

    /* renamed from: an */
    private C6393b f16534an;

    /* renamed from: ao */
    private C6641ak f16535ao;

    /* renamed from: b */
    C6588ad f16536b;

    /* renamed from: c */
    C6481G f16537c;

    /* renamed from: d */
    C6514Q f16538d;

    /* renamed from: e */
    C6688m f16539e;

    /* renamed from: f */
    IronSourceLoggerManager f16540f;

    /* renamed from: g */
    C6730l f16541g;

    /* renamed from: h */
    C6685b f16542h;

    /* renamed from: i */
    C6777l f16543i;

    /* renamed from: j */
    public String f16544j;

    /* renamed from: k */
    public String f16545k;

    /* renamed from: l */
    String f16546l;

    /* renamed from: m */
    public String f16547m;

    /* renamed from: n */
    public Map<String, String> f16548n;

    /* renamed from: o */
    public String f16549o;

    /* renamed from: p */
    public String f16550p;

    /* renamed from: q */
    Context f16551q;

    /* renamed from: r */
    Boolean f16552r;

    /* renamed from: s */
    IronSourceSegment f16553s;

    /* renamed from: t */
    int f16554t;

    /* renamed from: u */
    boolean f16555u;

    /* renamed from: v */
    boolean f16556v;

    /* renamed from: w */
    boolean f16557w;

    /* renamed from: x */
    boolean f16558x;

    /* renamed from: y */
    Boolean f16559y;

    /* renamed from: z */
    C6455B f16560z;

    /* renamed from: com.ironsource.mediationsdk.J$1 */
    static /* synthetic */ class C64911 {

        /* renamed from: a */
        static final /* synthetic */ int[] f16561a;

        /* renamed from: b */
        static final /* synthetic */ int[] f16562b;

        /* JADX WARNING: Can't wrap try/catch for region: R(16:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|17|18|19|20|21|22|(3:23|24|26)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(21:0|1|2|3|(2:5|6)|7|9|10|11|13|14|15|17|18|19|20|21|22|23|24|26) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0035 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x003f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0049 */
        static {
            /*
                int[] r0 = com.ironsource.mediationsdk.utils.C6774k.C6776a.m20625a()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f16562b = r0
                r1 = 1
                int r2 = com.ironsource.mediationsdk.utils.C6774k.C6776a.f17741a     // Catch:{ NoSuchFieldError -> 0x000f }
                r2 = 0
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x000f }
            L_0x000f:
                r0 = 2
                int[] r2 = f16562b     // Catch:{ NoSuchFieldError -> 0x0016 }
                int r3 = com.ironsource.mediationsdk.utils.C6774k.C6776a.f17742b     // Catch:{ NoSuchFieldError -> 0x0016 }
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0016 }
            L_0x0016:
                r2 = 3
                int[] r3 = f16562b     // Catch:{ NoSuchFieldError -> 0x001d }
                int r4 = com.ironsource.mediationsdk.utils.C6774k.C6776a.f17743c     // Catch:{ NoSuchFieldError -> 0x001d }
                r3[r0] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r3 = 4
                int[] r4 = f16562b     // Catch:{ NoSuchFieldError -> 0x0024 }
                int r5 = com.ironsource.mediationsdk.utils.C6774k.C6776a.f17744d     // Catch:{ NoSuchFieldError -> 0x0024 }
                r4[r2] = r3     // Catch:{ NoSuchFieldError -> 0x0024 }
            L_0x0024:
                com.ironsource.mediationsdk.IronSource$AD_UNIT[] r4 = com.ironsource.mediationsdk.IronSource.AD_UNIT.values()
                int r4 = r4.length
                int[] r4 = new int[r4]
                f16561a = r4
                com.ironsource.mediationsdk.IronSource$AD_UNIT r5 = com.ironsource.mediationsdk.IronSource.AD_UNIT.REWARDED_VIDEO     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r4[r5] = r1     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                int[] r1 = f16561a     // Catch:{ NoSuchFieldError -> 0x003f }
                com.ironsource.mediationsdk.IronSource$AD_UNIT r4 = com.ironsource.mediationsdk.IronSource.AD_UNIT.INTERSTITIAL     // Catch:{ NoSuchFieldError -> 0x003f }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x003f }
                r1[r4] = r0     // Catch:{ NoSuchFieldError -> 0x003f }
            L_0x003f:
                int[] r0 = f16561a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.ironsource.mediationsdk.IronSource$AD_UNIT r1 = com.ironsource.mediationsdk.IronSource.AD_UNIT.OFFERWALL     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f16561a     // Catch:{ NoSuchFieldError -> 0x0053 }
                com.ironsource.mediationsdk.IronSource$AD_UNIT r1 = com.ironsource.mediationsdk.IronSource.AD_UNIT.BANNER     // Catch:{ NoSuchFieldError -> 0x0053 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0053 }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x0053 }
            L_0x0053:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.C6490J.C64911.<clinit>():void");
        }
    }

    /* renamed from: com.ironsource.mediationsdk.J$a */
    public interface C6492a {
        /* renamed from: a */
        void mo36174a(String str);
    }

    /* renamed from: com.ironsource.mediationsdk.J$b */
    static class C6493b {

        /* renamed from: a */
        static volatile C6490J f16563a = new C6490J((byte) 0);
    }

    private C6490J() {
        this.f16520a = getClass().getName();
        this.f16509P = "!SDK-VERSION-STRING!:com.ironsource:mediationsdk:​7.2.2.1";
        this.f16510Q = "Activity=";
        this.f16513T = new Object();
        this.f16543i = null;
        this.f16544j = null;
        this.f16545k = null;
        this.f16546l = null;
        this.f16547m = null;
        this.f16548n = null;
        this.f16549o = null;
        this.f16515V = false;
        this.f16550p = null;
        this.f16552r = null;
        this.f16519Z = true;
        this.f16521aa = IronSourceConstants.KEY_SESSION_DEPTH;
        this.f16559y = null;
        this.f16540f = IronSourceLoggerManager.getLogger(0);
        C6685b bVar = new C6685b((LogListener) null, 1);
        this.f16542h = bVar;
        this.f16540f.addLogger(bVar);
        this.f16541g = new C6730l();
        C6588ad adVar = new C6588ad();
        this.f16536b = adVar;
        adVar.f17033m = this.f16541g;
        C6481G g = new C6481G();
        this.f16537c = g;
        g.f16431m = this.f16541g;
        C6514Q q = new C6514Q();
        this.f16538d = q;
        q.f16687b = this.f16541g;
        this.f16512S = new AtomicBoolean();
        this.f16517X = new HashSet();
        this.f16518Y = new HashSet();
        this.f16556v = false;
        this.f16555u = false;
        this.f16522ab = false;
        this.f16514U = new AtomicBoolean(true);
        this.f16528ah = new AtomicBoolean(false);
        this.f16554t = 0;
        this.f16557w = false;
        this.f16558x = false;
        this.f16523ac = false;
        this.f16550p = UUID.randomUUID().toString();
        this.f16524ad = Boolean.FALSE;
        this.f16503J = false;
        this.f16526af = null;
        this.f16560z = null;
        this.f16494A = null;
        this.f16527ag = null;
        this.f16495B = null;
        this.f16498E = false;
        this.f16499F = false;
        this.f16501H = false;
        this.f16504K = false;
        this.f16530aj = new CopyOnWriteArraySet<>();
        this.f16531ak = new CopyOnWriteArraySet<>();
        this.f16532al = new CopyOnWriteArraySet<>();
        this.f16506M = null;
        this.f16533am = null;
        this.f16507N = null;
        this.f16539e = null;
        this.f16505L = 1;
        this.f16508O = new C6665a();
        this.f16534an = new C6393b();
        this.f16535ao = new C6641ak();
    }

    /* synthetic */ C6490J(byte b) {
        this();
    }

    /* renamed from: A */
    private void m19463A() {
        if (this.f16556v) {
            m19513z();
            return;
        }
        C6698h hVar = this.f16543i.f17849c.f17497b;
        this.f16501H = hVar.f17509i.f17669a;
        this.f16502I = hVar.f17509i.f17670b;
        m19492b(IronSourceConstants.TROUBLESHOOTING_IS_FORK, IronSourceUtils.getMediationAdditionalData(false, this.f16501H, 1));
        if (!this.f16501H) {
            m19512y();
        } else if (this.f16502I) {
            m19509w();
        } else {
            m19511x();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00e4, code lost:
        return;
     */
    /* renamed from: B */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m19464B() {
        /*
            r13 = this;
            boolean r0 = r13.f16522ab
            if (r0 == 0) goto L_0x0008
            r13.m19465C()
            return
        L_0x0008:
            java.lang.Boolean r0 = r13.f16524ad
            monitor-enter(r0)
            com.ironsource.mediationsdk.utils.l r1 = r13.f16543i     // Catch:{ all -> 0x00e5 }
            com.ironsource.mediationsdk.model.g r1 = r1.f17849c     // Catch:{ all -> 0x00e5 }
            com.ironsource.mediationsdk.model.e r1 = r1.f17499d     // Catch:{ all -> 0x00e5 }
            com.ironsource.mediationsdk.utils.c r1 = r1.f17494g     // Catch:{ all -> 0x00e5 }
            boolean r1 = r1.f17669a     // Catch:{ all -> 0x00e5 }
            r13.f16504K = r1     // Catch:{ all -> 0x00e5 }
            com.ironsource.mediationsdk.logger.IronLog r1 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL     // Catch:{ all -> 0x00e5 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x00e5 }
            java.lang.String r3 = "mIsBnProgrammatic = "
            r2.<init>(r3)     // Catch:{ all -> 0x00e5 }
            boolean r3 = r13.f16504K     // Catch:{ all -> 0x00e5 }
            r2.append(r3)     // Catch:{ all -> 0x00e5 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x00e5 }
            r1.verbose(r2)     // Catch:{ all -> 0x00e5 }
            com.ironsource.mediationsdk.logger.IronLog r1 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL     // Catch:{ all -> 0x00e5 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x00e5 }
            java.lang.String r3 = "mIsBnLoadBeforeInitCompleted = "
            r2.<init>(r3)     // Catch:{ all -> 0x00e5 }
            java.lang.Boolean r3 = r13.f16524ad     // Catch:{ all -> 0x00e5 }
            r2.append(r3)     // Catch:{ all -> 0x00e5 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x00e5 }
            r1.verbose(r2)     // Catch:{ all -> 0x00e5 }
            r1 = 83000(0x14438, float:1.16308E-40)
            boolean r2 = r13.f16504K     // Catch:{ all -> 0x00e5 }
            r3 = 1
            r4 = 0
            org.json.JSONObject r2 = com.ironsource.mediationsdk.utils.IronSourceUtils.getMediationAdditionalData(r4, r2, r3)     // Catch:{ all -> 0x00e5 }
            m19492b(r1, r2)     // Catch:{ all -> 0x00e5 }
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch:{ all -> 0x00e5 }
            r6.<init>()     // Catch:{ all -> 0x00e5 }
            r1 = r4
        L_0x0055:
            com.ironsource.mediationsdk.utils.l r2 = r13.f16543i     // Catch:{ all -> 0x00e5 }
            com.ironsource.mediationsdk.model.m r2 = r2.f17772a     // Catch:{ all -> 0x00e5 }
            java.util.ArrayList<java.lang.String> r2 = r2.f17538e     // Catch:{ all -> 0x00e5 }
            int r2 = r2.size()     // Catch:{ all -> 0x00e5 }
            if (r1 >= r2) goto L_0x0083
            com.ironsource.mediationsdk.utils.l r2 = r13.f16543i     // Catch:{ all -> 0x00e5 }
            com.ironsource.mediationsdk.model.m r2 = r2.f17772a     // Catch:{ all -> 0x00e5 }
            java.util.ArrayList<java.lang.String> r2 = r2.f17538e     // Catch:{ all -> 0x00e5 }
            java.lang.Object r2 = r2.get(r1)     // Catch:{ all -> 0x00e5 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x00e5 }
            boolean r5 = android.text.TextUtils.isEmpty(r2)     // Catch:{ all -> 0x00e5 }
            if (r5 != 0) goto L_0x0080
            com.ironsource.mediationsdk.utils.l r5 = r13.f16543i     // Catch:{ all -> 0x00e5 }
            com.ironsource.mediationsdk.model.n r5 = r5.f17825b     // Catch:{ all -> 0x00e5 }
            com.ironsource.mediationsdk.model.NetworkSettings r2 = r5.mo36826a((java.lang.String) r2)     // Catch:{ all -> 0x00e5 }
            if (r2 == 0) goto L_0x0080
            r6.add(r2)     // Catch:{ all -> 0x00e5 }
        L_0x0080:
            int r1 = r1 + 1
            goto L_0x0055
        L_0x0083:
            int r1 = r6.size()     // Catch:{ all -> 0x00e5 }
            if (r1 <= 0) goto L_0x00bc
            boolean r1 = r13.f16504K     // Catch:{ all -> 0x00e5 }
            if (r1 == 0) goto L_0x0092
            r13.m19485a((java.util.ArrayList<com.ironsource.mediationsdk.model.NetworkSettings>) r6)     // Catch:{ all -> 0x00e5 }
            monitor-exit(r0)     // Catch:{ all -> 0x00e5 }
            return
        L_0x0092:
            com.ironsource.mediationsdk.utils.l r1 = r13.f16543i     // Catch:{ all -> 0x00e5 }
            com.ironsource.mediationsdk.model.g r1 = r1.f17849c     // Catch:{ all -> 0x00e5 }
            com.ironsource.mediationsdk.model.e r1 = r1.f17499d     // Catch:{ all -> 0x00e5 }
            long r9 = r1.f17489b     // Catch:{ all -> 0x00e5 }
            com.ironsource.mediationsdk.utils.l r1 = r13.f16543i     // Catch:{ all -> 0x00e5 }
            com.ironsource.mediationsdk.model.g r1 = r1.f17849c     // Catch:{ all -> 0x00e5 }
            com.ironsource.mediationsdk.model.e r1 = r1.f17499d     // Catch:{ all -> 0x00e5 }
            int r11 = r1.f17492e     // Catch:{ all -> 0x00e5 }
            com.ironsource.mediationsdk.utils.l r1 = r13.f16543i     // Catch:{ all -> 0x00e5 }
            com.ironsource.mediationsdk.model.g r1 = r1.f17849c     // Catch:{ all -> 0x00e5 }
            com.ironsource.mediationsdk.model.e r1 = r1.f17499d     // Catch:{ all -> 0x00e5 }
            int r12 = r1.f17493f     // Catch:{ all -> 0x00e5 }
            com.ironsource.mediationsdk.m r1 = new com.ironsource.mediationsdk.m     // Catch:{ all -> 0x00e5 }
            java.lang.String r7 = r13.f16544j     // Catch:{ all -> 0x00e5 }
            java.lang.String r8 = com.ironsource.mediationsdk.utils.IronSourceUtils.getUserIdForNetworks()     // Catch:{ all -> 0x00e5 }
            r5 = r1
            r5.<init>(r6, r7, r8, r9, r11, r12)     // Catch:{ all -> 0x00e5 }
            r13.f16539e = r1     // Catch:{ all -> 0x00e5 }
            r13.m19466D()     // Catch:{ all -> 0x00e5 }
            goto L_0x00e3
        L_0x00bc:
            boolean r1 = r13.f16504K     // Catch:{ all -> 0x00e5 }
            org.json.JSONObject r1 = com.ironsource.mediationsdk.utils.IronSourceUtils.getMediationAdditionalData(r4, r1, r3)     // Catch:{ all -> 0x00e5 }
            java.lang.Object[][] r2 = new java.lang.Object[r3][]     // Catch:{ all -> 0x00e5 }
            r5 = 2
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch:{ all -> 0x00e5 }
            java.lang.String r6 = "errorCode"
            r5[r4] = r6     // Catch:{ all -> 0x00e5 }
            r6 = 1010(0x3f2, float:1.415E-42)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x00e5 }
            r5[r3] = r6     // Catch:{ all -> 0x00e5 }
            r2[r4] = r5     // Catch:{ all -> 0x00e5 }
            m19486a((org.json.JSONObject) r1, (java.lang.Object[][]) r2)     // Catch:{ all -> 0x00e5 }
            r2 = 83314(0x14572, float:1.16748E-40)
            m19492b(r2, r1)     // Catch:{ all -> 0x00e5 }
            com.ironsource.mediationsdk.IronSource$AD_UNIT r1 = com.ironsource.mediationsdk.IronSource.AD_UNIT.BANNER     // Catch:{ all -> 0x00e5 }
            r13.m19480a((com.ironsource.mediationsdk.IronSource.AD_UNIT) r1, (boolean) r4)     // Catch:{ all -> 0x00e5 }
        L_0x00e3:
            monitor-exit(r0)     // Catch:{ all -> 0x00e5 }
            return
        L_0x00e5:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00e5 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.C6490J.m19464B():void");
    }

    /* renamed from: C */
    private void m19465C() {
        this.f16540f.log(IronSourceLogger.IronSourceTag.INTERNAL, "Banner started in demand only mode", 0);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < this.f16543i.f17772a.f17538e.size(); i++) {
            String str = this.f16543i.f17772a.f17538e.get(i);
            if (!TextUtils.isEmpty(str)) {
                arrayList.add(this.f16543i.f17825b.mo36826a(str));
            }
        }
        if (arrayList.size() > 0) {
            synchronized (this.f16532al) {
                this.f16507N = new C6718s(arrayList, this.f16543i.f17849c.f17499d, this.f16544j, this.f16545k);
            }
            this.f16532al.clear();
            return;
        }
        JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(false, false, 1);
        m19486a(mediationAdditionalData, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1010}});
        m19492b(IronSourceConstants.TROUBLESHOOTING_BN_INIT_FAILED, mediationAdditionalData);
        m19480a(IronSource.AD_UNIT.BANNER, false);
    }

    /* renamed from: D */
    private void m19466D() {
        if (this.f16524ad.booleanValue()) {
            this.f16524ad = Boolean.FALSE;
            mo36138a(this.f16525ae, this.f16526af);
            this.f16525ae = null;
            this.f16526af = null;
        }
    }

    /* renamed from: E */
    private boolean m19467E() {
        C6777l lVar = this.f16543i;
        return (lVar == null || lVar.f17772a == null || this.f16543i.f17772a.f17534a == null || this.f16543i.f17772a.f17534a.size() <= 0) ? false : true;
    }

    /* renamed from: F */
    private boolean m19468F() {
        C6777l lVar = this.f16543i;
        return (lVar == null || lVar.f17772a == null || this.f16543i.f17772a.f17537d == null || this.f16543i.f17772a.f17537d.size() <= 0) ? false : true;
    }

    /* renamed from: G */
    private boolean m19469G() {
        C6777l lVar = this.f16543i;
        return (lVar == null || lVar.f17849c == null || this.f16543i.f17849c.f17499d == null) ? false : true;
    }

    /* renamed from: H */
    private boolean m19470H() {
        if (m19469G()) {
            C6777l lVar = this.f16543i;
            if ((lVar == null || lVar.f17772a == null || this.f16543i.f17772a.f17538e == null || this.f16543i.f17772a.f17538e.size() <= 0) ? false : true) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: I */
    private static boolean m19471I() {
        return ContextProvider.getInstance().getCurrentActiveActivity() != null;
    }

    /* renamed from: J */
    private void m19472J() {
        if (this.f16527ag != null && this.f16528ah.compareAndSet(false, true)) {
            IronLog.CALLBACK.verbose("onInitializationCompleted()");
            C6557h.m19950d().mo36371b(new C6552c(IronSourceConstants.TROUBLESHOOTING_INIT_COMPLETED, IronSourceUtils.getMediationAdditionalData(false)));
            this.f16527ag.onInitializationComplete();
        }
    }

    /* renamed from: a */
    private int m19473a(C6706o oVar) {
        return !this.f16529ai && !this.f16499F && oVar.f17554l.f17682n ? 2 : 1;
    }

    /* renamed from: a */
    public static C6490J m19474a() {
        return C6493b.f16563a;
    }

    /* renamed from: a */
    private C6777l m19475a(Context context, String str) {
        if (IronSourceUtils.isInitResponseCached(context)) {
            String cachedValueByKeyOfCachedInitResponse = IronSourceUtils.getCachedValueByKeyOfCachedInitResponse(context, "appKey");
            String cachedValueByKeyOfCachedInitResponse2 = IronSourceUtils.getCachedValueByKeyOfCachedInitResponse(context, DataKeys.USER_ID);
            String cachedValueByKeyOfCachedInitResponse3 = IronSourceUtils.getCachedValueByKeyOfCachedInitResponse(context, "response");
            String str2 = this.f16544j;
            if (str2 != null && cachedValueByKeyOfCachedInitResponse.equals(str2) && cachedValueByKeyOfCachedInitResponse2.equals(str)) {
                C6777l lVar = new C6777l(context, cachedValueByKeyOfCachedInitResponse, cachedValueByKeyOfCachedInitResponse2, cachedValueByKeyOfCachedInitResponse3);
                lVar.f17851e = C6777l.C6778a.f17874b;
                return lVar;
            }
        }
        return null;
    }

    /* renamed from: a */
    public static String m19476a(Context context) {
        String[] C = C6429h.m19297C(context);
        return (C == null || C.length != 2) ? "" : C[0];
    }

    /* renamed from: a */
    private static String m19477a(String str, int i) {
        if (i == 0) {
            return null;
        }
        int i2 = C64911.f16562b[i - 1];
        if (i2 != 1 && i2 != 2 && i2 != 3) {
            return null;
        }
        return "placement " + str + " is capped";
    }

    /* renamed from: a */
    static void m19478a(int i, JSONObject jSONObject) {
        C6557h.m19950d().mo36371b(new C6552c(i, jSONObject));
    }

    /* renamed from: a */
    private void m19479a(IronSource.AD_UNIT ad_unit) {
        String str = ad_unit + " ad unit has already been initialized";
        this.f16540f.log(IronSourceLogger.IronSourceTag.API, str, 3);
        IronSourceUtils.sendAutomationLog(str);
    }

    /* renamed from: a */
    private void m19480a(IronSource.AD_UNIT ad_unit, boolean z) {
        int i = C64911.f16561a[ad_unit.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        synchronized (this.f16524ad) {
                            if (this.f16524ad.booleanValue()) {
                                this.f16524ad = Boolean.FALSE;
                                C6682l.m20363a().mo36722a(this.f16525ae, new IronSourceError(602, "Init had failed"), false);
                                this.f16525ae = null;
                                this.f16526af = null;
                            }
                        }
                    }
                } else if (z || mo36165k() || this.f16518Y.contains(ad_unit)) {
                    this.f16541g.onOfferwallAvailable(false);
                }
            } else if (this.f16556v) {
                Iterator<String> it = this.f16530aj.iterator();
                while (it.hasNext()) {
                    C6456C.m19387a().mo36004a(it.next(), ErrorBuilder.buildInitFailedError("initISDemandOnly() had failed", IronSourceConstants.INTERSTITIAL_AD_UNIT));
                }
                this.f16530aj.clear();
            } else if (this.f16503J) {
                this.f16503J = false;
                C6716r.m20447a().mo36851a(IronSource.AD_UNIT.INTERSTITIAL, ErrorBuilder.buildInitFailedError("init() had failed", IronSourceConstants.INTERSTITIAL_AD_UNIT));
            }
        } else if (this.f16555u) {
            Iterator<String> it2 = this.f16531ak.iterator();
            while (it2.hasNext()) {
                C6561ab.m19971a().mo36407a(it2.next(), ErrorBuilder.buildInitFailedError("initISDemandOnly() had failed", IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
            }
            this.f16531ak.clear();
        } else if (this.f16499F) {
            if (this.f16500G) {
                this.f16500G = false;
                C6716r.m20447a().mo36851a(IronSource.AD_UNIT.REWARDED_VIDEO, ErrorBuilder.buildInitFailedError("init() had failed", IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
            }
        } else if (z || mo36152d() || this.f16518Y.contains(ad_unit)) {
            C6569ac.m19976a().mo36420a(false, (AdInfo) null);
        }
    }

    /* renamed from: a */
    public static void m19481a(ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListener) {
        C6456C.m19387a().f16386a = iSDemandOnlyInterstitialListener;
    }

    /* renamed from: a */
    static void m19482a(ISDemandOnlyRewardedVideoListener iSDemandOnlyRewardedVideoListener) {
        C6561ab.m19971a().f16978a = iSDemandOnlyRewardedVideoListener;
    }

    /* renamed from: a */
    static void m19483a(String str, C6392a aVar) {
        if (str != null) {
            try {
                if (str.length() > 64) {
                    aVar.mo35874a(ErrorBuilder.buildInvalidKeyValueError("segment", IronSourceConstants.SUPERSONIC_CONFIG_NAME, "segment value should not exceed 64 characters."));
                }
            } catch (Exception unused) {
                aVar.mo35874a(ErrorBuilder.buildInvalidKeyValueError("segment", IronSourceConstants.SUPERSONIC_CONFIG_NAME, "segment value should not exceed 64 characters."));
            }
        }
    }

    /* renamed from: a */
    public static void m19484a(String str, JSONObject jSONObject) {
        String str2 = "networkKey = " + str;
        if (jSONObject != null) {
            str2 = str2 + " networkData = " + jSONObject;
        }
        IronLog.API.verbose(str2);
        C6653d.m20285a().mo36665a(str, jSONObject);
    }

    /* renamed from: a */
    private void m19485a(ArrayList<NetworkSettings> arrayList) {
        this.f16540f.log(IronSourceLogger.IronSourceTag.INTERNAL, "Banner started in programmatic mode", 0);
        this.f16495B = new C6515R(arrayList, new C6652b(this.f16544j, IronSourceUtils.getUserIdForNetworks(), this.f16543i.f17849c.f17499d), C6774k.m20599a().mo36975b(), this.f16553s);
        m19466D();
    }

    /* renamed from: a */
    static void m19486a(JSONObject jSONObject, Object[][] objArr) {
        int i = 0;
        while (i <= 0) {
            try {
                Object[] objArr2 = objArr[0];
                jSONObject.put(objArr2[0].toString(), objArr2[1]);
                i++;
            } catch (Exception e) {
                IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "IronSourceObject addToDictionary: " + Log.getStackTraceString(e), 3);
                return;
            }
        }
    }

    /* renamed from: a */
    public static void m19487a(boolean z) {
        IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
        logger.log(ironSourceTag, "setAdaptersDebug : " + z, 1);
        C6653d.m20285a().mo36668b(z);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:107:0x01d9, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0050, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0115, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized void m19488a(boolean r10, com.ironsource.mediationsdk.IronSource.AD_UNIT... r11) {
        /*
            r9 = this;
            monitor-enter(r9)
            int r0 = r11.length     // Catch:{ all -> 0x01da }
            r1 = 0
            r2 = r1
        L_0x0004:
            r3 = 1
            if (r2 >= r0) goto L_0x002c
            r4 = r11[r2]     // Catch:{ all -> 0x01da }
            com.ironsource.mediationsdk.IronSource$AD_UNIT r5 = com.ironsource.mediationsdk.IronSource.AD_UNIT.INTERSTITIAL     // Catch:{ all -> 0x01da }
            boolean r5 = r4.equals(r5)     // Catch:{ all -> 0x01da }
            if (r5 == 0) goto L_0x0014
            r9.f16558x = r3     // Catch:{ all -> 0x01da }
            goto L_0x0029
        L_0x0014:
            com.ironsource.mediationsdk.IronSource$AD_UNIT r5 = com.ironsource.mediationsdk.IronSource.AD_UNIT.BANNER     // Catch:{ all -> 0x01da }
            boolean r5 = r4.equals(r5)     // Catch:{ all -> 0x01da }
            if (r5 == 0) goto L_0x001f
            r9.f16523ac = r3     // Catch:{ all -> 0x01da }
            goto L_0x0029
        L_0x001f:
            com.ironsource.mediationsdk.IronSource$AD_UNIT r5 = com.ironsource.mediationsdk.IronSource.AD_UNIT.REWARDED_VIDEO     // Catch:{ all -> 0x01da }
            boolean r4 = r4.equals(r5)     // Catch:{ all -> 0x01da }
            if (r4 == 0) goto L_0x0029
            r9.f16557w = r3     // Catch:{ all -> 0x01da }
        L_0x0029:
            int r2 = r2 + 1
            goto L_0x0004
        L_0x002c:
            com.ironsource.mediationsdk.O r0 = com.ironsource.mediationsdk.C6504O.m19641a()     // Catch:{ all -> 0x01da }
            com.ironsource.mediationsdk.O$a r0 = r0.mo36232b()     // Catch:{ all -> 0x01da }
            com.ironsource.mediationsdk.O$a r2 = com.ironsource.mediationsdk.C6504O.C6509a.INIT_FAILED     // Catch:{ all -> 0x01da }
            if (r0 != r2) goto L_0x0057
            com.ironsource.mediationsdk.sdk.l r10 = r9.f16541g     // Catch:{ Exception -> 0x0051 }
            if (r10 == 0) goto L_0x004f
            int r10 = r11.length     // Catch:{ Exception -> 0x0051 }
        L_0x003d:
            if (r1 >= r10) goto L_0x004f
            r0 = r11[r1]     // Catch:{ Exception -> 0x0051 }
            java.util.Set<com.ironsource.mediationsdk.IronSource$AD_UNIT> r2 = r9.f16517X     // Catch:{ Exception -> 0x0051 }
            boolean r2 = r2.contains(r0)     // Catch:{ Exception -> 0x0051 }
            if (r2 != 0) goto L_0x004c
            r9.m19480a((com.ironsource.mediationsdk.IronSource.AD_UNIT) r0, (boolean) r3)     // Catch:{ Exception -> 0x0051 }
        L_0x004c:
            int r1 = r1 + 1
            goto L_0x003d
        L_0x004f:
            monitor-exit(r9)
            return
        L_0x0051:
            r10 = move-exception
            r10.printStackTrace()     // Catch:{ all -> 0x01da }
            monitor-exit(r9)
            return
        L_0x0057:
            boolean r0 = r9.f16515V     // Catch:{ all -> 0x01da }
            r2 = 14
            if (r0 != 0) goto L_0x0116
            org.json.JSONObject r10 = com.ironsource.mediationsdk.utils.IronSourceUtils.getMediationAdditionalData(r10)     // Catch:{ all -> 0x01da }
            int r0 = r11.length     // Catch:{ all -> 0x01da }
            r4 = r1
        L_0x0063:
            if (r1 >= r0) goto L_0x00a3
            r5 = r11[r1]     // Catch:{ all -> 0x01da }
            java.util.Set<com.ironsource.mediationsdk.IronSource$AD_UNIT> r6 = r9.f16517X     // Catch:{ all -> 0x01da }
            boolean r6 = r6.contains(r5)     // Catch:{ all -> 0x01da }
            if (r6 != 0) goto L_0x0087
            java.util.Set<com.ironsource.mediationsdk.IronSource$AD_UNIT> r4 = r9.f16517X     // Catch:{ all -> 0x01da }
            r4.add(r5)     // Catch:{ all -> 0x01da }
            java.util.Set<com.ironsource.mediationsdk.IronSource$AD_UNIT> r4 = r9.f16518Y     // Catch:{ all -> 0x01da }
            r4.add(r5)     // Catch:{ all -> 0x01da }
            java.lang.String r4 = r5.toString()     // Catch:{ Exception -> 0x0081 }
            r10.put(r4, r3)     // Catch:{ Exception -> 0x0081 }
            goto L_0x0085
        L_0x0081:
            r4 = move-exception
            r4.printStackTrace()     // Catch:{ all -> 0x01da }
        L_0x0085:
            r4 = r3
            goto L_0x00a0
        L_0x0087:
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r6 = r9.f16540f     // Catch:{ all -> 0x01da }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r7 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API     // Catch:{ all -> 0x01da }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x01da }
            r8.<init>()     // Catch:{ all -> 0x01da }
            r8.append(r5)     // Catch:{ all -> 0x01da }
            java.lang.String r5 = " ad unit has started initializing."
            r8.append(r5)     // Catch:{ all -> 0x01da }
            java.lang.String r5 = r8.toString()     // Catch:{ all -> 0x01da }
            r8 = 3
            r6.log(r7, r5, r8)     // Catch:{ all -> 0x01da }
        L_0x00a0:
            int r1 = r1 + 1
            goto L_0x0063
        L_0x00a3:
            if (r4 == 0) goto L_0x0114
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0104 }
            r11.<init>()     // Catch:{ Exception -> 0x0104 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0104 }
            java.lang.String r1 = ",androidx="
            r0.<init>(r1)     // Catch:{ Exception -> 0x0104 }
            boolean r1 = com.ironsource.mediationsdk.utils.IronSourceUtils.isAndroidXAvailable()     // Catch:{ Exception -> 0x0104 }
            r0.append(r1)     // Catch:{ Exception -> 0x0104 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x0104 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0104 }
            java.lang.String r4 = ",Activity="
            r1.<init>(r4)     // Catch:{ Exception -> 0x0104 }
            boolean r4 = m19471I()     // Catch:{ Exception -> 0x0104 }
            r1.append(r4)     // Catch:{ Exception -> 0x0104 }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x0104 }
            boolean r4 = com.ironsource.environment.C6399a.C64001.m19227d()     // Catch:{ Exception -> 0x0104 }
            if (r4 == 0) goto L_0x00e1
            java.lang.String r4 = "appLanguage=Kotlin"
            r11.append(r4)     // Catch:{ Exception -> 0x0104 }
            java.lang.String r4 = com.ironsource.environment.C6399a.C64001.m19224c()     // Catch:{ Exception -> 0x0104 }
        L_0x00dd:
            r11.append(r4)     // Catch:{ Exception -> 0x0104 }
            goto L_0x00e4
        L_0x00e1:
            java.lang.String r4 = "appLanguage=Java"
            goto L_0x00dd
        L_0x00e4:
            r11.append(r0)     // Catch:{ Exception -> 0x0104 }
            boolean r0 = r9.mo36173o()     // Catch:{ Exception -> 0x0104 }
            if (r0 == 0) goto L_0x00f0
            r11.append(r1)     // Catch:{ Exception -> 0x0104 }
        L_0x00f0:
            java.lang.String r0 = "ext1"
            java.lang.String r11 = r11.toString()     // Catch:{ Exception -> 0x0104 }
            r10.put(r0, r11)     // Catch:{ Exception -> 0x0104 }
            java.lang.String r11 = "sessionDepth"
            int r0 = r9.f16554t     // Catch:{ Exception -> 0x0104 }
            int r0 = r0 + r3
            r9.f16554t = r0     // Catch:{ Exception -> 0x0104 }
            r10.put(r11, r0)     // Catch:{ Exception -> 0x0104 }
            goto L_0x0108
        L_0x0104:
            r11 = move-exception
            r11.printStackTrace()     // Catch:{ all -> 0x01da }
        L_0x0108:
            com.ironsource.mediationsdk.a.c r11 = new com.ironsource.mediationsdk.a.c     // Catch:{ all -> 0x01da }
            r11.<init>(r2, r10)     // Catch:{ all -> 0x01da }
            com.ironsource.mediationsdk.a.h r10 = com.ironsource.mediationsdk.p207a.C6557h.m19950d()     // Catch:{ all -> 0x01da }
            r10.mo36371b((com.ironsource.mediationsdk.p207a.C6552c) r11)     // Catch:{ all -> 0x01da }
        L_0x0114:
            monitor-exit(r9)
            return
        L_0x0116:
            com.ironsource.mediationsdk.O r0 = com.ironsource.mediationsdk.C6504O.m19641a()     // Catch:{ all -> 0x01da }
            r0.mo36233b(r10)     // Catch:{ all -> 0x01da }
            java.util.List<com.ironsource.mediationsdk.IronSource$AD_UNIT> r0 = r9.f16516W     // Catch:{ all -> 0x01da }
            if (r0 != 0) goto L_0x0123
            monitor-exit(r9)
            return
        L_0x0123:
            org.json.JSONObject r10 = com.ironsource.mediationsdk.utils.IronSourceUtils.getMediationAdditionalData(r10)     // Catch:{ all -> 0x01da }
            int r0 = r11.length     // Catch:{ all -> 0x01da }
            r4 = r1
            r5 = r4
        L_0x012a:
            if (r4 >= r0) goto L_0x0167
            r6 = r11[r4]     // Catch:{ all -> 0x01da }
            java.util.Set<com.ironsource.mediationsdk.IronSource$AD_UNIT> r7 = r9.f16517X     // Catch:{ all -> 0x01da }
            boolean r7 = r7.contains(r6)     // Catch:{ all -> 0x01da }
            if (r7 != 0) goto L_0x0161
            java.util.Set<com.ironsource.mediationsdk.IronSource$AD_UNIT> r5 = r9.f16517X     // Catch:{ all -> 0x01da }
            r5.add(r6)     // Catch:{ all -> 0x01da }
            java.util.Set<com.ironsource.mediationsdk.IronSource$AD_UNIT> r5 = r9.f16518Y     // Catch:{ all -> 0x01da }
            r5.add(r6)     // Catch:{ all -> 0x01da }
            java.lang.String r5 = r6.toString()     // Catch:{ Exception -> 0x0148 }
            r10.put(r5, r3)     // Catch:{ Exception -> 0x0148 }
            goto L_0x014c
        L_0x0148:
            r5 = move-exception
            r5.printStackTrace()     // Catch:{ all -> 0x01da }
        L_0x014c:
            java.util.List<com.ironsource.mediationsdk.IronSource$AD_UNIT> r5 = r9.f16516W     // Catch:{ all -> 0x01da }
            if (r5 == 0) goto L_0x015c
            java.util.List<com.ironsource.mediationsdk.IronSource$AD_UNIT> r5 = r9.f16516W     // Catch:{ all -> 0x01da }
            boolean r5 = r5.contains(r6)     // Catch:{ all -> 0x01da }
            if (r5 == 0) goto L_0x015c
            r9.m19493b((com.ironsource.mediationsdk.IronSource.AD_UNIT) r6)     // Catch:{ all -> 0x01da }
            goto L_0x015f
        L_0x015c:
            r9.m19480a((com.ironsource.mediationsdk.IronSource.AD_UNIT) r6, (boolean) r1)     // Catch:{ all -> 0x01da }
        L_0x015f:
            r5 = r3
            goto L_0x0164
        L_0x0161:
            r9.m19479a((com.ironsource.mediationsdk.IronSource.AD_UNIT) r6)     // Catch:{ all -> 0x01da }
        L_0x0164:
            int r4 = r4 + 1
            goto L_0x012a
        L_0x0167:
            if (r5 == 0) goto L_0x01d8
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01c8 }
            r11.<init>()     // Catch:{ Exception -> 0x01c8 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01c8 }
            java.lang.String r1 = ",androidx="
            r0.<init>(r1)     // Catch:{ Exception -> 0x01c8 }
            boolean r1 = com.ironsource.mediationsdk.utils.IronSourceUtils.isAndroidXAvailable()     // Catch:{ Exception -> 0x01c8 }
            r0.append(r1)     // Catch:{ Exception -> 0x01c8 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x01c8 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01c8 }
            java.lang.String r4 = ",Activity="
            r1.<init>(r4)     // Catch:{ Exception -> 0x01c8 }
            boolean r4 = m19471I()     // Catch:{ Exception -> 0x01c8 }
            r1.append(r4)     // Catch:{ Exception -> 0x01c8 }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x01c8 }
            boolean r4 = com.ironsource.environment.C6399a.C64001.m19227d()     // Catch:{ Exception -> 0x01c8 }
            if (r4 == 0) goto L_0x01a5
            java.lang.String r4 = "appLanguage=Kotlin"
            r11.append(r4)     // Catch:{ Exception -> 0x01c8 }
            java.lang.String r4 = com.ironsource.environment.C6399a.C64001.m19224c()     // Catch:{ Exception -> 0x01c8 }
        L_0x01a1:
            r11.append(r4)     // Catch:{ Exception -> 0x01c8 }
            goto L_0x01a8
        L_0x01a5:
            java.lang.String r4 = "appLanguage=Java"
            goto L_0x01a1
        L_0x01a8:
            r11.append(r0)     // Catch:{ Exception -> 0x01c8 }
            boolean r0 = r9.mo36173o()     // Catch:{ Exception -> 0x01c8 }
            if (r0 == 0) goto L_0x01b4
            r11.append(r1)     // Catch:{ Exception -> 0x01c8 }
        L_0x01b4:
            java.lang.String r0 = "ext1"
            java.lang.String r11 = r11.toString()     // Catch:{ Exception -> 0x01c8 }
            r10.put(r0, r11)     // Catch:{ Exception -> 0x01c8 }
            java.lang.String r11 = "sessionDepth"
            int r0 = r9.f16554t     // Catch:{ Exception -> 0x01c8 }
            int r0 = r0 + r3
            r9.f16554t = r0     // Catch:{ Exception -> 0x01c8 }
            r10.put(r11, r0)     // Catch:{ Exception -> 0x01c8 }
            goto L_0x01cc
        L_0x01c8:
            r11 = move-exception
            r11.printStackTrace()     // Catch:{ all -> 0x01da }
        L_0x01cc:
            com.ironsource.mediationsdk.a.c r11 = new com.ironsource.mediationsdk.a.c     // Catch:{ all -> 0x01da }
            r11.<init>(r2, r10)     // Catch:{ all -> 0x01da }
            com.ironsource.mediationsdk.a.h r10 = com.ironsource.mediationsdk.p207a.C6557h.m19950d()     // Catch:{ all -> 0x01da }
            r10.mo36371b((com.ironsource.mediationsdk.p207a.C6552c) r11)     // Catch:{ all -> 0x01da }
        L_0x01d8:
            monitor-exit(r9)
            return
        L_0x01da:
            r10 = move-exception
            monitor-exit(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.C6490J.m19488a(boolean, com.ironsource.mediationsdk.IronSource$AD_UNIT[]):void");
    }

    /* renamed from: a */
    private static boolean m19489a(C6642b bVar) {
        return bVar.f17250k > 0 && bVar.f17251l > 0;
    }

    /* renamed from: a */
    private static boolean m19490a(String str, int i, int i2) {
        return str != null && str.length() >= i && str.length() <= i2;
    }

    /* renamed from: b */
    private C6777l m19491b(Context context, String str, C6492a aVar) {
        C6777l lVar = null;
        if (!IronSourceUtils.isNetworkConnected(context)) {
            return null;
        }
        try {
            String a = m19476a(context);
            if (TextUtils.isEmpty(a)) {
                a = C6429h.m19349x(context);
                IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "using custom identifier", 1);
            }
            String stringFromURL = HttpFunctions.getStringFromURL(ServerURL.getCPVProvidersURL(context, this.f16544j, str, a, this.f16549o, this.f16499F, this.f16553s != null ? this.f16553s.mo36116a() : null), aVar);
            if (stringFromURL == null) {
                IronLog.INTERNAL.warning("serverResponseString is null");
                return null;
            }
            if (IronSourceUtils.getSerr() == 1) {
                IronLog.INTERNAL.verbose("encrypt");
                String optString = new JSONObject(stringFromURL).optString("response", (String) null);
                if (TextUtils.isEmpty(optString)) {
                    IronLog.INTERNAL.warning("encryptedResponse is empty - return null");
                    return null;
                }
                stringFromURL = IronSourceAES.decode(C6770g.m20577a().mo36966b(), optString);
                if (TextUtils.isEmpty(stringFromURL)) {
                    IronLog.INTERNAL.warning("encoded response invalid - return null");
                    if (!f16493ap) {
                        f16493ap = true;
                        JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(false);
                        try {
                            mediationAdditionalData.put("status", "false");
                            mediationAdditionalData.put(IronSourceConstants.EVENTS_ERROR_CODE, 1);
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                        C6557h.m19950d().mo36371b(new C6552c(114, mediationAdditionalData));
                    }
                    return null;
                }
            }
            C6777l lVar2 = new C6777l(context, this.f16544j, str, stringFromURL);
            try {
                lVar2.f17851e = C6777l.C6778a.f17875c;
                if (lVar2.mo36981b()) {
                    return lVar2;
                }
                IronLog.INTERNAL.warning("response invalid - return null");
                return null;
            } catch (Exception e2) {
                e = e2;
                lVar = lVar2;
                IronLog ironLog = IronLog.INTERNAL;
                ironLog.warning("exception = " + e);
                e.printStackTrace();
                return lVar;
            }
        } catch (Exception e3) {
            e = e3;
            IronLog ironLog2 = IronLog.INTERNAL;
            ironLog2.warning("exception = " + e);
            e.printStackTrace();
            return lVar;
        }
    }

    /* renamed from: b */
    private static void m19492b(int i, JSONObject jSONObject) {
        C6553d.m19930d().mo36371b(new C6552c(i, jSONObject));
    }

    /* renamed from: b */
    private void m19493b(IronSource.AD_UNIT ad_unit) {
        int i = C64911.f16561a[ad_unit.ordinal()];
        if (i == 1) {
            m19501s();
        } else if (i == 2) {
            m19463A();
        } else if (i == 3) {
            this.f16538d.mo36254a(this.f16544j, this.f16545k);
        } else if (i == 4) {
            m19464B();
        }
    }

    /* renamed from: p */
    private Placement m19494p(String str) {
        C6706o oVar = this.f16543i.f17849c.f17496a;
        if (oVar != null) {
            Iterator<Placement> it = oVar.f17543a.iterator();
            while (it.hasNext()) {
                Placement next = it.next();
                if (next.getPlacementName().equals(str)) {
                    return next;
                }
            }
        }
        return null;
    }

    /* JADX WARNING: type inference failed for: r0v10, types: [com.ironsource.mediationsdk.B] */
    /* JADX WARNING: type inference failed for: r4v4, types: [com.ironsource.mediationsdk.X] */
    /* JADX WARNING: type inference failed for: r4v5, types: [com.ironsource.mediationsdk.K] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m19495p() {
        /*
            r11 = this;
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r0 = r11.f16540f
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r1 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.INTERNAL
            java.lang.String r2 = "Rewarded Video started in programmatic mode"
            r3 = 0
            r0.log(r1, r2, r3)
            java.util.List r5 = r11.m19505u()
            int r0 = r5.size()
            if (r0 <= 0) goto L_0x007a
            com.ironsource.mediationsdk.utils.l r0 = r11.f16543i
            com.ironsource.mediationsdk.model.g r0 = r0.f17849c
            com.ironsource.mediationsdk.model.o r0 = r0.f17496a
            com.ironsource.mediationsdk.utils.c r0 = r0.f17554l
            boolean r0 = r0.f17682n
            if (r0 == 0) goto L_0x003d
            com.ironsource.mediationsdk.K r0 = new com.ironsource.mediationsdk.K
            com.ironsource.mediationsdk.utils.l r1 = r11.f16543i
            com.ironsource.mediationsdk.model.g r1 = r1.f17849c
            com.ironsource.mediationsdk.model.o r6 = r1.f17496a
            java.lang.String r7 = r11.f16544j
            java.lang.String r8 = com.ironsource.mediationsdk.utils.IronSourceUtils.getUserIdForNetworks()
            com.ironsource.mediationsdk.utils.k r1 = com.ironsource.mediationsdk.utils.C6774k.m20599a()
            java.util.HashSet r9 = r1.mo36975b()
            com.ironsource.mediationsdk.IronSourceSegment r10 = r11.f16553s
            r4 = r0
            r4.<init>(r5, r6, r7, r8, r9, r10)
            goto L_0x0059
        L_0x003d:
            com.ironsource.mediationsdk.X r0 = new com.ironsource.mediationsdk.X
            com.ironsource.mediationsdk.utils.l r1 = r11.f16543i
            com.ironsource.mediationsdk.model.g r1 = r1.f17849c
            com.ironsource.mediationsdk.model.o r6 = r1.f17496a
            java.lang.String r7 = r11.f16544j
            java.lang.String r8 = com.ironsource.mediationsdk.utils.IronSourceUtils.getUserIdForNetworks()
            com.ironsource.mediationsdk.utils.k r1 = com.ironsource.mediationsdk.utils.C6774k.m20599a()
            java.util.HashSet r9 = r1.mo36975b()
            com.ironsource.mediationsdk.IronSourceSegment r10 = r11.f16553s
            r4 = r0
            r4.<init>(r5, r6, r7, r8, r9, r10)
        L_0x0059:
            r11.f16560z = r0
            java.lang.Boolean r0 = r11.f16552r
            if (r0 == 0) goto L_0x00a2
            com.ironsource.mediationsdk.B r1 = r11.f16560z
            android.content.Context r2 = r11.f16551q
            boolean r0 = r0.booleanValue()
            r1.mo36001a(r2, r0)
            java.lang.Boolean r0 = r11.f16552r
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x00a2
            com.ironsource.mediationsdk.ad r0 = r11.f16536b
            android.content.Context r1 = r11.f16551q
            r0.mo36039a((android.content.Context) r1, (boolean) r3)
            return
        L_0x007a:
            int r0 = r11.f16505L
            r1 = 1
            org.json.JSONObject r0 = com.ironsource.mediationsdk.utils.IronSourceUtils.getMediationAdditionalData(r3, r1, r0)
            java.lang.Object[][] r2 = new java.lang.Object[r1][]
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.String r5 = "errorCode"
            r4[r3] = r5
            r5 = 1010(0x3f2, float:1.415E-42)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r4[r1] = r5
            r2[r3] = r4
            m19486a((org.json.JSONObject) r0, (java.lang.Object[][]) r2)
            r1 = 81314(0x13da2, float:1.13945E-40)
            m19478a((int) r1, (org.json.JSONObject) r0)
            com.ironsource.mediationsdk.IronSource$AD_UNIT r0 = com.ironsource.mediationsdk.IronSource.AD_UNIT.REWARDED_VIDEO
            r11.m19480a((com.ironsource.mediationsdk.IronSource.AD_UNIT) r0, (boolean) r3)
        L_0x00a2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.C6490J.m19495p():void");
    }

    /* renamed from: q */
    private void m19496q() {
        this.f16540f.log(IronSourceLogger.IronSourceTag.INTERNAL, "Rewarded Video started in demand only mode", 0);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < this.f16543i.f17772a.f17534a.size(); i++) {
            String str = this.f16543i.f17772a.f17534a.get(i);
            if (!TextUtils.isEmpty(str)) {
                arrayList.add(this.f16543i.f17825b.mo36826a(str));
            }
        }
        if (arrayList.size() > 0) {
            synchronized (this.f16531ak) {
                this.f16533am = new C6787w(arrayList, this.f16543i.f17849c.f17496a, this.f16544j, this.f16545k);
            }
            if (ContextProvider.getInstance().getCurrentActiveActivity() == null) {
                m19480a(IronSource.AD_UNIT.REWARDED_VIDEO, false);
                return;
            }
            Iterator<String> it = this.f16531ak.iterator();
            while (it.hasNext()) {
                this.f16533am.mo36997a(it.next(), (String) null, false);
            }
            this.f16531ak.clear();
            return;
        }
        m19480a(IronSource.AD_UNIT.REWARDED_VIDEO, false);
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0046  */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m19497q(java.lang.String r7) {
        /*
            r6 = this;
            r0 = 3
            r1 = 0
            com.ironsource.mediationsdk.model.Placement r7 = r6.m19494p(r7)     // Catch:{ Exception -> 0x0029 }
            if (r7 != 0) goto L_0x000f
            com.ironsource.mediationsdk.model.Placement r7 = r6.mo36143b()     // Catch:{ Exception -> 0x000d }
            goto L_0x000f
        L_0x000d:
            r2 = move-exception
            goto L_0x002b
        L_0x000f:
            if (r7 != 0) goto L_0x0034
            java.lang.String r2 = "showProgrammaticRewardedVideo error: empty default placement in response"
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r3 = r6.f16540f     // Catch:{ Exception -> 0x000d }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r4 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.INTERNAL     // Catch:{ Exception -> 0x000d }
            r3.log(r4, r2, r0)     // Catch:{ Exception -> 0x000d }
            com.ironsource.mediationsdk.logger.IronSourceError r3 = new com.ironsource.mediationsdk.logger.IronSourceError     // Catch:{ Exception -> 0x000d }
            r4 = 1021(0x3fd, float:1.431E-42)
            r3.<init>(r4, r2)     // Catch:{ Exception -> 0x000d }
            com.ironsource.mediationsdk.ac r2 = com.ironsource.mediationsdk.C6569ac.m19976a()     // Catch:{ Exception -> 0x000d }
            r2.mo36418a((com.ironsource.mediationsdk.logger.IronSourceError) r3, (com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo) r1)     // Catch:{ Exception -> 0x000d }
            return
        L_0x0029:
            r2 = move-exception
            r7 = r1
        L_0x002b:
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r3 = r6.f16540f
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r4 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API
            java.lang.String r5 = "showProgrammaticRewardedVideo()"
            r3.logException(r4, r5, r2)
        L_0x0034:
            com.ironsource.mediationsdk.adunit.c.h r2 = r6.f16497D
            if (r2 == 0) goto L_0x0046
            boolean r2 = r6.f16499F
            if (r2 != 0) goto L_0x0040
            boolean r2 = r6.f16529ai
            if (r2 == 0) goto L_0x0046
        L_0x0040:
            com.ironsource.mediationsdk.adunit.c.h r0 = r6.f16497D
            r0.mo36571a((com.ironsource.mediationsdk.model.Placement) r7)
            return
        L_0x0046:
            com.ironsource.mediationsdk.B r2 = r6.f16560z
            if (r2 == 0) goto L_0x004e
            r2.mo36002a(r7)
            return
        L_0x004e:
            java.lang.String r7 = "showProgrammaticRewardedVideo - show called before init completed, managers not initiated yet"
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r2 = r6.f16540f
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r3 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API
            r2.log(r3, r7, r0)
            com.ironsource.mediationsdk.logger.IronSourceError r0 = new com.ironsource.mediationsdk.logger.IronSourceError
            r2 = 1023(0x3ff, float:1.434E-42)
            r0.<init>(r2, r7)
            com.ironsource.mediationsdk.ac r7 = com.ironsource.mediationsdk.C6569ac.m19976a()
            r7.mo36418a((com.ironsource.mediationsdk.logger.IronSourceError) r0, (com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo) r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.C6490J.m19497q(java.lang.String):void");
    }

    /* renamed from: r */
    private Placement m19498r(String str) {
        Placement p = m19494p(str);
        if (p == null) {
            this.f16540f.log(IronSourceLogger.IronSourceTag.API, "Placement is not valid, please make sure you are using the right placements, using the default placement.", 3);
            p = mo36143b();
            if (p == null) {
                this.f16540f.log(IronSourceLogger.IronSourceTag.API, "Default placement was not found, please make sure you are using the right placements.", 3);
                return null;
            }
        }
        String a = m19477a(p.getPlacementName(), C6774k.m20609b(ContextProvider.getInstance().getApplicationContext(), p));
        if (TextUtils.isEmpty(a)) {
            return p;
        }
        this.f16540f.log(IronSourceLogger.IronSourceTag.API, a, 1);
        C6569ac.m19976a().mo36418a(ErrorBuilder.buildCappedPerPlacementError(a), (AdInfo) null);
        return null;
    }

    /* renamed from: r */
    private void m19499r() {
        NetworkSettings a;
        NetworkSettings a2;
        NetworkSettings a3;
        C6706o oVar = this.f16543i.f17849c.f17496a;
        int i = oVar.f17547e;
        for (int i2 = 0; i2 < this.f16543i.f17772a.f17534a.size(); i2++) {
            String str = this.f16543i.f17772a.f17534a.get(i2);
            if (!TextUtils.isEmpty(str) && (a3 = this.f16543i.f17825b.mo36826a(str)) != null) {
                C6629ae aeVar = new C6629ae(a3, i);
                if (m19489a((C6642b) aeVar)) {
                    aeVar.f17221s = this.f16536b;
                    aeVar.f17253n = i2 + 1;
                    this.f16536b.mo36349a(aeVar);
                }
            }
        }
        if (this.f16536b.f16873c.size() > 0) {
            this.f16536b.f17034n = oVar.f17544b.mo56847a();
            this.f16536b.f16872b = oVar.f17545c;
            this.f16536b.f17035o = oVar.f17550h;
            String c = this.f16543i.mo36982c();
            if (!TextUtils.isEmpty(c) && (a2 = this.f16543i.f17825b.mo36826a(c)) != null) {
                C6629ae aeVar2 = new C6629ae(a2, i);
                if (m19489a((C6642b) aeVar2)) {
                    aeVar2.f17221s = this.f16536b;
                    C6588ad adVar = this.f16536b;
                    adVar.f16878h.log(IronSourceLogger.IronSourceTag.INTERNAL, aeVar2.f17243d + " is set as backfill", 0);
                    adVar.f16874d = aeVar2;
                }
            }
            String d = this.f16543i.mo36983d();
            if (!TextUtils.isEmpty(d) && (a = this.f16543i.f17825b.mo36826a(d)) != null) {
                C6629ae aeVar3 = new C6629ae(a, i);
                if (m19489a((C6642b) aeVar3)) {
                    aeVar3.f17221s = this.f16536b;
                    C6588ad adVar2 = this.f16536b;
                    adVar2.f16878h.log(IronSourceLogger.IronSourceTag.INTERNAL, aeVar3.f17243d + " is set as premium", 0);
                    adVar2.f16875e = aeVar3;
                }
            }
            C6588ad adVar3 = this.f16536b;
            adVar3.f17036p = new C6792z(oVar.f17551i, adVar3);
            this.f16536b.mo36447a(this.f16544j, IronSourceUtils.getUserIdForNetworks());
            return;
        }
        JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(false, false, this.f16505L);
        m19486a(mediationAdditionalData, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1010}});
        m19478a((int) IronSourceConstants.TROUBLESHOOTING_RV_INIT_FAILED, mediationAdditionalData);
        m19480a(IronSource.AD_UNIT.REWARDED_VIDEO, false);
    }

    /* renamed from: s */
    private InterstitialPlacement m19500s(String str) {
        C6698h hVar = this.f16543i.f17849c.f17497b;
        if (hVar != null) {
            Iterator<InterstitialPlacement> it = hVar.f17501a.iterator();
            while (it.hasNext()) {
                InterstitialPlacement next = it.next();
                if (next.getPlacementName().equals(str)) {
                    return next;
                }
            }
        }
        return null;
    }

    /* renamed from: s */
    private void m19501s() {
        if (this.f16555u) {
            m19496q();
            return;
        }
        C6706o oVar = this.f16543i.f17849c.f17496a;
        this.f16498E = oVar.f17554l.f17669a || this.f16499F;
        this.f16529ai = oVar.f17554l.f17670b;
        int a = m19473a(oVar);
        this.f16505L = a;
        m19478a((int) IronSourceConstants.TROUBLESHOOTING_RV_FORK, IronSourceUtils.getMediationAdditionalData(false, this.f16498E, a));
        if (this.f16499F || this.f16529ai) {
            m19502t();
        } else if (this.f16498E) {
            m19495p();
        } else {
            m19499r();
        }
    }

    /* renamed from: t */
    private void m19502t() {
        IronLog.INTERNAL.verbose();
        List<NetworkSettings> u = m19505u();
        if (u.size() > 0) {
            C6618h hVar = new C6618h(u, this.f16543i.f17849c.f17496a, IronSourceUtils.getUserIdForNetworks(), this.f16499F, C6774k.m20599a().mo36975b(), this.f16553s);
            this.f16497D = hVar;
            Boolean bool = this.f16552r;
            if (bool != null) {
                hVar.mo36583b(bool.booleanValue());
            }
            if (this.f16500G && this.f16499F) {
                this.f16500G = false;
                this.f16497D.mo36584d();
                return;
            }
            return;
        }
        JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(false, true, this.f16505L);
        m19486a(mediationAdditionalData, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1010}});
        m19478a((int) IronSourceConstants.TROUBLESHOOTING_RV_INIT_FAILED, mediationAdditionalData);
        m19480a(IronSource.AD_UNIT.REWARDED_VIDEO, false);
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0045  */
    /* renamed from: t */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m19503t(java.lang.String r7) {
        /*
            r6 = this;
            r0 = 0
            com.ironsource.mediationsdk.model.InterstitialPlacement r7 = r6.m19500s(r7)     // Catch:{ Exception -> 0x0029 }
            if (r7 != 0) goto L_0x000e
            com.ironsource.mediationsdk.model.InterstitialPlacement r7 = r6.mo36156g()     // Catch:{ Exception -> 0x000c }
            goto L_0x000e
        L_0x000c:
            r0 = move-exception
            goto L_0x002d
        L_0x000e:
            if (r7 != 0) goto L_0x0036
            java.lang.String r1 = "showProgrammaticInterstitial error: empty default placement in response"
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r2 = r6.f16540f     // Catch:{ Exception -> 0x000c }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r3 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.INTERNAL     // Catch:{ Exception -> 0x000c }
            r4 = 3
            r2.log(r3, r1, r4)     // Catch:{ Exception -> 0x000c }
            com.ironsource.mediationsdk.logger.IronSourceError r2 = new com.ironsource.mediationsdk.logger.IronSourceError     // Catch:{ Exception -> 0x000c }
            r3 = 1020(0x3fc, float:1.43E-42)
            r2.<init>(r3, r1)     // Catch:{ Exception -> 0x000c }
            com.ironsource.mediationsdk.D r1 = com.ironsource.mediationsdk.C6463D.m19392a()     // Catch:{ Exception -> 0x000c }
            r1.mo36014a((com.ironsource.mediationsdk.logger.IronSourceError) r2, (com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo) r0)     // Catch:{ Exception -> 0x000c }
            return
        L_0x0029:
            r7 = move-exception
            r5 = r0
            r0 = r7
            r7 = r5
        L_0x002d:
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r1 = r6.f16540f
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r2 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API
            java.lang.String r3 = "showProgrammaticInterstitial()"
            r1.logException(r2, r3, r0)
        L_0x0036:
            boolean r0 = r6.f16502I
            if (r0 == 0) goto L_0x0045
            com.ironsource.mediationsdk.adunit.c.g r0 = r6.f16496C
            com.ironsource.mediationsdk.model.Placement r1 = new com.ironsource.mediationsdk.model.Placement
            r1.<init>(r7)
            r0.mo36571a((com.ironsource.mediationsdk.model.Placement) r1)
            return
        L_0x0045:
            com.ironsource.mediationsdk.U r0 = r6.f16494A
            java.lang.String r7 = r7.getPlacementName()
            r0.mo36304a((java.lang.String) r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.C6490J.m19503t(java.lang.String):void");
    }

    /* renamed from: u */
    private InterstitialPlacement m19504u(String str) {
        InterstitialPlacement s = m19500s(str);
        if (s == null) {
            this.f16540f.log(IronSourceLogger.IronSourceTag.API, "Placement is not valid, please make sure you are using the right placements, using the default placement.", 3);
            s = mo36156g();
            if (s == null) {
                this.f16540f.log(IronSourceLogger.IronSourceTag.API, "Default placement was not found, please make sure you are using the right placements.", 3);
                return null;
            }
        }
        String a = m19477a(s.getPlacementName(), m19508w(s.getPlacementName()));
        if (TextUtils.isEmpty(a)) {
            return s;
        }
        this.f16540f.log(IronSourceLogger.IronSourceTag.API, a, 1);
        this.f16541g.f17601e = s;
        C6463D.m19392a().mo36014a(ErrorBuilder.buildCappedPerPlacementError(a), (AdInfo) null);
        return null;
    }

    /* renamed from: u */
    private List<NetworkSettings> m19505u() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < this.f16543i.f17772a.f17534a.size(); i++) {
            String str = this.f16543i.f17772a.f17534a.get(i);
            if (!TextUtils.isEmpty(str)) {
                arrayList.add(this.f16543i.f17825b.mo36826a(str));
            }
        }
        return arrayList;
    }

    /* renamed from: v */
    private List<NetworkSettings> m19506v() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < this.f16543i.f17772a.f17537d.size(); i++) {
            String str = this.f16543i.f17772a.f17537d.get(i);
            if (!TextUtils.isEmpty(str)) {
                arrayList.add(this.f16543i.f17825b.mo36826a(str));
            }
        }
        return arrayList;
    }

    /* renamed from: v */
    private static boolean m19507v(String str) {
        if (str == null) {
            return false;
        }
        return str.matches("^[a-zA-Z0-9]*$");
    }

    /* renamed from: w */
    private int m19508w(String str) {
        C6777l lVar = this.f16543i;
        if (lVar == null || lVar.f17849c == null || this.f16543i.f17849c.f17497b == null) {
            return C6774k.C6776a.f17744d;
        }
        InterstitialPlacement interstitialPlacement = null;
        try {
            interstitialPlacement = m19500s(str);
            if (interstitialPlacement == null && (interstitialPlacement = mo36156g()) == null) {
                this.f16540f.log(IronSourceLogger.IronSourceTag.API, "Default placement was not found", 3);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return interstitialPlacement == null ? C6774k.C6776a.f17744d : C6774k.m20608b(ContextProvider.getInstance().getApplicationContext(), interstitialPlacement);
    }

    /* renamed from: w */
    private void m19509w() {
        IronLog.INTERNAL.verbose();
        List<NetworkSettings> v = m19506v();
        if (v.size() > 0) {
            C6617g gVar = new C6617g(v, this.f16543i.f17849c.f17497b, IronSourceUtils.getUserIdForNetworks(), C6774k.m20599a().mo36975b(), this.f16553s);
            this.f16496C = gVar;
            Boolean bool = this.f16552r;
            if (bool != null) {
                gVar.mo36583b(bool.booleanValue());
            }
            if (this.f16503J) {
                this.f16503J = false;
                this.f16496C.mo36584d();
                return;
            }
            return;
        }
        JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(false, true, 1);
        m19486a(mediationAdditionalData, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1010}});
        m19492b(IronSourceConstants.TROUBLESHOOTING_IS_INIT_FAILED, mediationAdditionalData);
        m19480a(IronSource.AD_UNIT.INTERSTITIAL, false);
    }

    /* renamed from: x */
    private C6696f m19510x(String str) {
        C6695e eVar = this.f16543i.f17849c.f17499d;
        if (eVar == null) {
            return null;
        }
        if (TextUtils.isEmpty(str)) {
            return eVar.mo36814a();
        }
        C6696f a = eVar.mo36815a(str);
        return a != null ? a : eVar.mo36814a();
    }

    /* renamed from: x */
    private void m19511x() {
        this.f16540f.log(IronSourceLogger.IronSourceTag.INTERNAL, "Adunit: Interstitial is now initiated - programmatic mode", 0);
        List<NetworkSettings> v = m19506v();
        if (v.size() > 0) {
            C6525U u = new C6525U(v, this.f16543i.f17849c.f17497b, this.f16544j, IronSourceUtils.getUserIdForNetworks(), this.f16543i.f17849c.f17497b.f17506f, C6774k.m20599a().mo36975b(), this.f16553s);
            this.f16494A = u;
            Boolean bool = this.f16552r;
            if (bool != null) {
                u.mo36305a(bool.booleanValue());
                if (this.f16552r.booleanValue()) {
                    this.f16537c.mo36039a(this.f16551q, false);
                }
            }
            if (this.f16503J) {
                this.f16503J = false;
                this.f16494A.mo36310e();
                return;
            }
            return;
        }
        JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(false, true, 1);
        m19486a(mediationAdditionalData, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1010}});
        m19492b(IronSourceConstants.TROUBLESHOOTING_IS_INIT_FAILED, mediationAdditionalData);
        m19480a(IronSource.AD_UNIT.INTERSTITIAL, false);
    }

    /* renamed from: y */
    private void m19512y() {
        NetworkSettings a;
        C6698h hVar = this.f16543i.f17849c.f17497b;
        int i = hVar.f17505e;
        this.f16537c.f16432n.mo36850a(IronSource.AD_UNIT.INTERSTITIAL, hVar.f17506f);
        for (int i2 = 0; i2 < this.f16543i.f17772a.f17537d.size(); i2++) {
            String str = this.f16543i.f17772a.f17537d.get(i2);
            if (!TextUtils.isEmpty(str) && (a = this.f16543i.f17825b.mo36826a(str)) != null) {
                C6482H h = new C6482H(a, i);
                if (m19489a((C6642b) h)) {
                    h.f16444s = this.f16537c;
                    h.f17253n = i2 + 1;
                    this.f16537c.mo36349a(h);
                }
            }
        }
        if (this.f16537c.f16873c.size() > 0) {
            this.f16537c.f16872b = hVar.f17503c;
            this.f16537c.mo36046a(this.f16544j, IronSourceUtils.getUserIdForNetworks());
            if (this.f16503J) {
                this.f16503J = false;
                this.f16537c.mo36050c();
                return;
            }
            return;
        }
        JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(false, false, 1);
        m19486a(mediationAdditionalData, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1010}});
        m19492b(IronSourceConstants.TROUBLESHOOTING_IS_INIT_FAILED, mediationAdditionalData);
        m19480a(IronSource.AD_UNIT.INTERSTITIAL, false);
    }

    /* renamed from: z */
    private void m19513z() {
        this.f16540f.log(IronSourceLogger.IronSourceTag.INTERNAL, "Interstitial started in demand only mode", 0);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < this.f16543i.f17772a.f17537d.size(); i++) {
            String str = this.f16543i.f17772a.f17537d.get(i);
            if (!TextUtils.isEmpty(str)) {
                arrayList.add(this.f16543i.f17825b.mo36826a(str));
            }
        }
        if (arrayList.size() > 0) {
            synchronized (this.f16530aj) {
                this.f16506M = new C6762u(arrayList, this.f16543i.f17849c.f17497b, this.f16544j, this.f16545k);
            }
            Iterator<String> it = this.f16530aj.iterator();
            while (it.hasNext()) {
                this.f16506M.mo36953a(it.next(), (String) null, false);
            }
            this.f16530aj.clear();
            return;
        }
        JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(false, false, 1);
        m19486a(mediationAdditionalData, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1010}});
        m19492b(IronSourceConstants.TROUBLESHOOTING_IS_INIT_FAILED, mediationAdditionalData);
        m19480a(IronSource.AD_UNIT.INTERSTITIAL, false);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x033b, code lost:
        return r13;
     */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x01fb  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x027f  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x030f  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.ironsource.mediationsdk.utils.C6777l mo36132a(android.content.Context r11, java.lang.String r12, com.ironsource.mediationsdk.C6490J.C6492a r13) {
        /*
            r10 = this;
            java.lang.Object r0 = r10.f16513T
            monitor-enter(r0)
            com.ironsource.mediationsdk.utils.l r1 = r10.f16543i     // Catch:{ all -> 0x033c }
            if (r1 == 0) goto L_0x0010
            com.ironsource.mediationsdk.utils.l r11 = new com.ironsource.mediationsdk.utils.l     // Catch:{ all -> 0x033c }
            com.ironsource.mediationsdk.utils.l r12 = r10.f16543i     // Catch:{ all -> 0x033c }
            r11.<init>(r12)     // Catch:{ all -> 0x033c }
            monitor-exit(r0)     // Catch:{ all -> 0x033c }
            return r11
        L_0x0010:
            com.ironsource.mediationsdk.utils.l r13 = r10.m19491b((android.content.Context) r11, (java.lang.String) r12, (com.ironsource.mediationsdk.C6490J.C6492a) r13)     // Catch:{ all -> 0x033c }
            r1 = 1
            r2 = 0
            if (r13 == 0) goto L_0x001e
            boolean r3 = r13.mo36981b()     // Catch:{ all -> 0x033c }
            if (r3 != 0) goto L_0x006a
        L_0x001e:
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r13 = com.ironsource.mediationsdk.logger.IronSourceLoggerManager.getLogger()     // Catch:{ all -> 0x033c }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r3 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.INTERNAL     // Catch:{ all -> 0x033c }
            java.lang.String r4 = "Null or invalid response. Trying to get cached response"
            r13.log(r3, r4, r2)     // Catch:{ all -> 0x033c }
            com.ironsource.mediationsdk.utils.l r13 = r10.m19475a((android.content.Context) r11, (java.lang.String) r12)     // Catch:{ all -> 0x033c }
            if (r13 == 0) goto L_0x006a
            java.lang.String r3 = r10.f16544j     // Catch:{ all -> 0x033c }
            com.ironsource.mediationsdk.logger.IronSourceError r12 = com.ironsource.mediationsdk.utils.ErrorBuilder.buildUsingCachedConfigurationError(r3, r12)     // Catch:{ all -> 0x033c }
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r3 = r10.f16540f     // Catch:{ all -> 0x033c }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r4 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.INTERNAL     // Catch:{ all -> 0x033c }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x033c }
            r5.<init>()     // Catch:{ all -> 0x033c }
            java.lang.String r12 = r12.toString()     // Catch:{ all -> 0x033c }
            r5.append(r12)     // Catch:{ all -> 0x033c }
            java.lang.String r12 = ": "
            r5.append(r12)     // Catch:{ all -> 0x033c }
            java.lang.String r12 = r13.toString()     // Catch:{ all -> 0x033c }
            r5.append(r12)     // Catch:{ all -> 0x033c }
            java.lang.String r12 = r5.toString()     // Catch:{ all -> 0x033c }
            r3.log(r4, r12, r1)     // Catch:{ all -> 0x033c }
            org.json.JSONObject r12 = com.ironsource.mediationsdk.utils.IronSourceUtils.getMediationAdditionalData(r2)     // Catch:{ all -> 0x033c }
            com.ironsource.mediationsdk.a.c r3 = new com.ironsource.mediationsdk.a.c     // Catch:{ all -> 0x033c }
            r4 = 140(0x8c, float:1.96E-43)
            r3.<init>(r4, r12)     // Catch:{ all -> 0x033c }
            com.ironsource.mediationsdk.a.h r12 = com.ironsource.mediationsdk.p207a.C6557h.m19950d()     // Catch:{ all -> 0x033c }
            r12.mo36371b((com.ironsource.mediationsdk.p207a.C6552c) r3)     // Catch:{ all -> 0x033c }
        L_0x006a:
            if (r13 == 0) goto L_0x033a
            r10.f16543i = r13     // Catch:{ all -> 0x033c }
            java.lang.String r12 = r13.toString()     // Catch:{ all -> 0x033c }
            com.ironsource.mediationsdk.utils.IronSourceUtils.saveLastResponse(r11, r12)     // Catch:{ all -> 0x033c }
            com.ironsource.mediationsdk.utils.l r12 = r10.f16543i     // Catch:{ all -> 0x033c }
            com.ironsource.mediationsdk.logger.b r3 = r10.f16542h     // Catch:{ all -> 0x033c }
            com.ironsource.mediationsdk.model.g r4 = r12.f17849c     // Catch:{ all -> 0x033c }
            com.ironsource.sdk.f.a r4 = r4.f17500e     // Catch:{ all -> 0x033c }
            com.ironsource.mediationsdk.model.d r4 = r4.mo56830a()     // Catch:{ all -> 0x033c }
            int r4 = r4.f17485a     // Catch:{ all -> 0x033c }
            r3.setDebugLevel(r4)     // Catch:{ all -> 0x033c }
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r3 = r10.f16540f     // Catch:{ all -> 0x033c }
            java.lang.String r4 = "console"
            com.ironsource.mediationsdk.model.g r5 = r12.f17849c     // Catch:{ all -> 0x033c }
            com.ironsource.sdk.f.a r5 = r5.f17500e     // Catch:{ all -> 0x033c }
            com.ironsource.mediationsdk.model.d r5 = r5.mo56830a()     // Catch:{ all -> 0x033c }
            int r5 = r5.f17486b     // Catch:{ all -> 0x033c }
            r3.setLoggerDebugLevel(r4, r5)     // Catch:{ all -> 0x033c }
            boolean r3 = r10.mo36152d()     // Catch:{ all -> 0x033c }
            if (r3 == 0) goto L_0x00a8
            com.ironsource.mediationsdk.model.g r3 = r12.f17849c     // Catch:{ all -> 0x033c }
            com.ironsource.mediationsdk.model.o r3 = r3.f17496a     // Catch:{ all -> 0x033c }
            com.ironsource.sdk.g.d r3 = r3.f17544b     // Catch:{ all -> 0x033c }
            boolean r3 = r3.mo56848b()     // Catch:{ all -> 0x033c }
            goto L_0x00a9
        L_0x00a8:
            r3 = r2
        L_0x00a9:
            boolean r4 = r10.mo36160i()     // Catch:{ all -> 0x033c }
            if (r4 == 0) goto L_0x00ba
            com.ironsource.mediationsdk.model.g r4 = r12.f17849c     // Catch:{ all -> 0x033c }
            com.ironsource.mediationsdk.model.h r4 = r4.f17497b     // Catch:{ all -> 0x033c }
            com.ironsource.sdk.g.d r4 = r4.f17502b     // Catch:{ all -> 0x033c }
            boolean r4 = r4.mo56848b()     // Catch:{ all -> 0x033c }
            goto L_0x00bb
        L_0x00ba:
            r4 = r2
        L_0x00bb:
            boolean r5 = r10.m19469G()     // Catch:{ all -> 0x033c }
            if (r5 == 0) goto L_0x00cc
            com.ironsource.mediationsdk.model.g r5 = r12.f17849c     // Catch:{ all -> 0x033c }
            com.ironsource.mediationsdk.model.e r5 = r5.f17499d     // Catch:{ all -> 0x033c }
            com.ironsource.sdk.g.d r5 = r5.f17488a     // Catch:{ all -> 0x033c }
            boolean r5 = r5.mo56848b()     // Catch:{ all -> 0x033c }
            goto L_0x00cd
        L_0x00cc:
            r5 = r2
        L_0x00cd:
            boolean r6 = r10.mo36165k()     // Catch:{ all -> 0x033c }
            if (r6 == 0) goto L_0x00de
            com.ironsource.mediationsdk.model.g r6 = r12.f17849c     // Catch:{ all -> 0x033c }
            com.ironsource.mediationsdk.model.i r6 = r6.f17498c     // Catch:{ all -> 0x033c }
            com.ironsource.sdk.g.d r6 = r6.f17513c     // Catch:{ all -> 0x033c }
            boolean r6 = r6.mo56848b()     // Catch:{ all -> 0x033c }
            goto L_0x00df
        L_0x00de:
            r6 = r2
        L_0x00df:
            com.ironsource.mediationsdk.model.g r7 = r12.f17849c     // Catch:{ all -> 0x033c }
            com.ironsource.sdk.f.a r7 = r7.f17500e     // Catch:{ all -> 0x033c }
            com.ironsource.mediationsdk.utils.j r7 = r7.mo56837h()     // Catch:{ all -> 0x033c }
            boolean r8 = r7.f17732a     // Catch:{ all -> 0x033c }
            if (r3 == 0) goto L_0x016f
            com.ironsource.mediationsdk.model.g r3 = r12.f17849c     // Catch:{ all -> 0x033c }
            com.ironsource.mediationsdk.model.o r3 = r3.f17496a     // Catch:{ all -> 0x033c }
            com.ironsource.sdk.g.d r3 = r3.f17544b     // Catch:{ all -> 0x033c }
            com.ironsource.mediationsdk.a.h r6 = com.ironsource.mediationsdk.p207a.C6557h.m19950d()     // Catch:{ all -> 0x033c }
            java.lang.String r9 = r3.mo56851e()     // Catch:{ all -> 0x033c }
            r6.mo36372b((java.lang.String) r9, (android.content.Context) r11)     // Catch:{ all -> 0x033c }
            com.ironsource.mediationsdk.a.h r6 = com.ironsource.mediationsdk.p207a.C6557h.m19950d()     // Catch:{ all -> 0x033c }
            java.lang.String r9 = r3.mo56850d()     // Catch:{ all -> 0x033c }
            r6.mo36363a((java.lang.String) r9, (android.content.Context) r11)     // Catch:{ all -> 0x033c }
            com.ironsource.mediationsdk.a.h r6 = com.ironsource.mediationsdk.p207a.C6557h.m19950d()     // Catch:{ all -> 0x033c }
            int r9 = r3.mo56853g()     // Catch:{ all -> 0x033c }
            r6.mo36370b((int) r9)     // Catch:{ all -> 0x033c }
            com.ironsource.mediationsdk.a.h r6 = com.ironsource.mediationsdk.p207a.C6557h.m19950d()     // Catch:{ all -> 0x033c }
            int r9 = r3.mo56854h()     // Catch:{ all -> 0x033c }
            r6.mo36376c((int) r9)     // Catch:{ all -> 0x033c }
            com.ironsource.mediationsdk.a.h r6 = com.ironsource.mediationsdk.p207a.C6557h.m19950d()     // Catch:{ all -> 0x033c }
            int r9 = r3.mo56852f()     // Catch:{ all -> 0x033c }
            r6.mo36360a((int) r9)     // Catch:{ all -> 0x033c }
            com.ironsource.mediationsdk.a.h r6 = com.ironsource.mediationsdk.p207a.C6557h.m19950d()     // Catch:{ all -> 0x033c }
            int[] r9 = r3.mo56855i()     // Catch:{ all -> 0x033c }
            r6.mo36366a((int[]) r9, (android.content.Context) r11)     // Catch:{ all -> 0x033c }
            com.ironsource.mediationsdk.a.h r6 = com.ironsource.mediationsdk.p207a.C6557h.m19950d()     // Catch:{ all -> 0x033c }
            int[] r9 = r3.mo56856j()     // Catch:{ all -> 0x033c }
            r6.mo36374b((int[]) r9, (android.content.Context) r11)     // Catch:{ all -> 0x033c }
            com.ironsource.mediationsdk.a.h r6 = com.ironsource.mediationsdk.p207a.C6557h.m19950d()     // Catch:{ all -> 0x033c }
            int[] r9 = r3.mo56857k()     // Catch:{ all -> 0x033c }
            r6.mo36377c(r9, r11)     // Catch:{ all -> 0x033c }
            com.ironsource.mediationsdk.a.h r6 = com.ironsource.mediationsdk.p207a.C6557h.m19950d()     // Catch:{ all -> 0x033c }
            int[] r9 = r3.mo56858l()     // Catch:{ all -> 0x033c }
            r6.mo36380d(r9, r11)     // Catch:{ all -> 0x033c }
            com.ironsource.mediationsdk.a.h r6 = com.ironsource.mediationsdk.p207a.C6557h.m19950d()     // Catch:{ all -> 0x033c }
            com.ironsource.mediationsdk.model.g r9 = r12.f17849c     // Catch:{ all -> 0x033c }
            com.ironsource.sdk.f.a r9 = r9.f17500e     // Catch:{ all -> 0x033c }
            com.ironsource.mediationsdk.model.p r9 = r9.mo56831b()     // Catch:{ all -> 0x033c }
            r6.mo36362a((com.ironsource.mediationsdk.model.C6707p) r9)     // Catch:{ all -> 0x033c }
            com.ironsource.mediationsdk.a.h r6 = com.ironsource.mediationsdk.p207a.C6557h.m19950d()     // Catch:{ all -> 0x033c }
            boolean r3 = r3.mo56849c()     // Catch:{ all -> 0x033c }
        L_0x016b:
            r6.f16912c = r3     // Catch:{ all -> 0x033c }
            goto L_0x01f9
        L_0x016f:
            if (r6 == 0) goto L_0x01f3
            com.ironsource.mediationsdk.model.g r3 = r12.f17849c     // Catch:{ all -> 0x033c }
            com.ironsource.mediationsdk.model.i r3 = r3.f17498c     // Catch:{ all -> 0x033c }
            com.ironsource.sdk.g.d r3 = r3.f17513c     // Catch:{ all -> 0x033c }
            com.ironsource.mediationsdk.a.h r6 = com.ironsource.mediationsdk.p207a.C6557h.m19950d()     // Catch:{ all -> 0x033c }
            java.lang.String r9 = r3.mo56851e()     // Catch:{ all -> 0x033c }
            r6.mo36372b((java.lang.String) r9, (android.content.Context) r11)     // Catch:{ all -> 0x033c }
            com.ironsource.mediationsdk.a.h r6 = com.ironsource.mediationsdk.p207a.C6557h.m19950d()     // Catch:{ all -> 0x033c }
            java.lang.String r9 = r3.mo56850d()     // Catch:{ all -> 0x033c }
            r6.mo36363a((java.lang.String) r9, (android.content.Context) r11)     // Catch:{ all -> 0x033c }
            com.ironsource.mediationsdk.a.h r6 = com.ironsource.mediationsdk.p207a.C6557h.m19950d()     // Catch:{ all -> 0x033c }
            int r9 = r3.mo56853g()     // Catch:{ all -> 0x033c }
            r6.mo36370b((int) r9)     // Catch:{ all -> 0x033c }
            com.ironsource.mediationsdk.a.h r6 = com.ironsource.mediationsdk.p207a.C6557h.m19950d()     // Catch:{ all -> 0x033c }
            int r9 = r3.mo56854h()     // Catch:{ all -> 0x033c }
            r6.mo36376c((int) r9)     // Catch:{ all -> 0x033c }
            com.ironsource.mediationsdk.a.h r6 = com.ironsource.mediationsdk.p207a.C6557h.m19950d()     // Catch:{ all -> 0x033c }
            int r9 = r3.mo56852f()     // Catch:{ all -> 0x033c }
            r6.mo36360a((int) r9)     // Catch:{ all -> 0x033c }
            com.ironsource.mediationsdk.a.h r6 = com.ironsource.mediationsdk.p207a.C6557h.m19950d()     // Catch:{ all -> 0x033c }
            int[] r9 = r3.mo56855i()     // Catch:{ all -> 0x033c }
            r6.mo36366a((int[]) r9, (android.content.Context) r11)     // Catch:{ all -> 0x033c }
            com.ironsource.mediationsdk.a.h r6 = com.ironsource.mediationsdk.p207a.C6557h.m19950d()     // Catch:{ all -> 0x033c }
            int[] r9 = r3.mo56856j()     // Catch:{ all -> 0x033c }
            r6.mo36374b((int[]) r9, (android.content.Context) r11)     // Catch:{ all -> 0x033c }
            com.ironsource.mediationsdk.a.h r6 = com.ironsource.mediationsdk.p207a.C6557h.m19950d()     // Catch:{ all -> 0x033c }
            int[] r9 = r3.mo56857k()     // Catch:{ all -> 0x033c }
            r6.mo36377c(r9, r11)     // Catch:{ all -> 0x033c }
            com.ironsource.mediationsdk.a.h r6 = com.ironsource.mediationsdk.p207a.C6557h.m19950d()     // Catch:{ all -> 0x033c }
            int[] r9 = r3.mo56858l()     // Catch:{ all -> 0x033c }
            r6.mo36380d(r9, r11)     // Catch:{ all -> 0x033c }
            com.ironsource.mediationsdk.a.h r6 = com.ironsource.mediationsdk.p207a.C6557h.m19950d()     // Catch:{ all -> 0x033c }
            com.ironsource.mediationsdk.model.g r9 = r12.f17849c     // Catch:{ all -> 0x033c }
            com.ironsource.sdk.f.a r9 = r9.f17500e     // Catch:{ all -> 0x033c }
            com.ironsource.mediationsdk.model.p r9 = r9.mo56831b()     // Catch:{ all -> 0x033c }
            r6.mo36362a((com.ironsource.mediationsdk.model.C6707p) r9)     // Catch:{ all -> 0x033c }
            com.ironsource.mediationsdk.a.h r6 = com.ironsource.mediationsdk.p207a.C6557h.m19950d()     // Catch:{ all -> 0x033c }
            boolean r3 = r3.mo56849c()     // Catch:{ all -> 0x033c }
            goto L_0x016b
        L_0x01f3:
            com.ironsource.mediationsdk.a.h r3 = com.ironsource.mediationsdk.p207a.C6557h.m19950d()     // Catch:{ all -> 0x033c }
            r3.f16915f = r2     // Catch:{ all -> 0x033c }
        L_0x01f9:
            if (r4 == 0) goto L_0x027f
            com.ironsource.mediationsdk.model.g r2 = r12.f17849c     // Catch:{ all -> 0x033c }
            com.ironsource.mediationsdk.model.h r2 = r2.f17497b     // Catch:{ all -> 0x033c }
            com.ironsource.sdk.g.d r2 = r2.f17502b     // Catch:{ all -> 0x033c }
            com.ironsource.mediationsdk.a.d r3 = com.ironsource.mediationsdk.p207a.C6553d.m19930d()     // Catch:{ all -> 0x033c }
            java.lang.String r4 = r2.mo56851e()     // Catch:{ all -> 0x033c }
            r3.mo36372b((java.lang.String) r4, (android.content.Context) r11)     // Catch:{ all -> 0x033c }
            com.ironsource.mediationsdk.a.d r3 = com.ironsource.mediationsdk.p207a.C6553d.m19930d()     // Catch:{ all -> 0x033c }
            java.lang.String r4 = r2.mo56850d()     // Catch:{ all -> 0x033c }
            r3.mo36363a((java.lang.String) r4, (android.content.Context) r11)     // Catch:{ all -> 0x033c }
            com.ironsource.mediationsdk.a.d r3 = com.ironsource.mediationsdk.p207a.C6553d.m19930d()     // Catch:{ all -> 0x033c }
            int r4 = r2.mo56853g()     // Catch:{ all -> 0x033c }
            r3.mo36370b((int) r4)     // Catch:{ all -> 0x033c }
            com.ironsource.mediationsdk.a.d r3 = com.ironsource.mediationsdk.p207a.C6553d.m19930d()     // Catch:{ all -> 0x033c }
            int r4 = r2.mo56854h()     // Catch:{ all -> 0x033c }
            r3.mo36376c((int) r4)     // Catch:{ all -> 0x033c }
            com.ironsource.mediationsdk.a.d r3 = com.ironsource.mediationsdk.p207a.C6553d.m19930d()     // Catch:{ all -> 0x033c }
            int r4 = r2.mo56852f()     // Catch:{ all -> 0x033c }
            r3.mo36360a((int) r4)     // Catch:{ all -> 0x033c }
            com.ironsource.mediationsdk.a.d r3 = com.ironsource.mediationsdk.p207a.C6553d.m19930d()     // Catch:{ all -> 0x033c }
            int[] r4 = r2.mo56855i()     // Catch:{ all -> 0x033c }
            r3.mo36366a((int[]) r4, (android.content.Context) r11)     // Catch:{ all -> 0x033c }
            com.ironsource.mediationsdk.a.d r3 = com.ironsource.mediationsdk.p207a.C6553d.m19930d()     // Catch:{ all -> 0x033c }
            int[] r4 = r2.mo56856j()     // Catch:{ all -> 0x033c }
            r3.mo36374b((int[]) r4, (android.content.Context) r11)     // Catch:{ all -> 0x033c }
            com.ironsource.mediationsdk.a.d r3 = com.ironsource.mediationsdk.p207a.C6553d.m19930d()     // Catch:{ all -> 0x033c }
            int[] r4 = r2.mo56857k()     // Catch:{ all -> 0x033c }
            r3.mo36377c(r4, r11)     // Catch:{ all -> 0x033c }
            com.ironsource.mediationsdk.a.d r3 = com.ironsource.mediationsdk.p207a.C6553d.m19930d()     // Catch:{ all -> 0x033c }
            int[] r4 = r2.mo56858l()     // Catch:{ all -> 0x033c }
            r3.mo36380d(r4, r11)     // Catch:{ all -> 0x033c }
            com.ironsource.mediationsdk.a.d r3 = com.ironsource.mediationsdk.p207a.C6553d.m19930d()     // Catch:{ all -> 0x033c }
            com.ironsource.mediationsdk.model.g r12 = r12.f17849c     // Catch:{ all -> 0x033c }
            com.ironsource.sdk.f.a r12 = r12.f17500e     // Catch:{ all -> 0x033c }
            com.ironsource.mediationsdk.model.p r12 = r12.mo56831b()     // Catch:{ all -> 0x033c }
            r3.mo36362a((com.ironsource.mediationsdk.model.C6707p) r12)     // Catch:{ all -> 0x033c }
            com.ironsource.mediationsdk.a.d r12 = com.ironsource.mediationsdk.p207a.C6553d.m19930d()     // Catch:{ all -> 0x033c }
            boolean r2 = r2.mo56849c()     // Catch:{ all -> 0x033c }
        L_0x027b:
            r12.f16912c = r2     // Catch:{ all -> 0x033c }
            goto L_0x0309
        L_0x027f:
            if (r5 == 0) goto L_0x0303
            com.ironsource.mediationsdk.model.g r2 = r12.f17849c     // Catch:{ all -> 0x033c }
            com.ironsource.mediationsdk.model.e r2 = r2.f17499d     // Catch:{ all -> 0x033c }
            com.ironsource.sdk.g.d r2 = r2.f17488a     // Catch:{ all -> 0x033c }
            com.ironsource.mediationsdk.a.d r3 = com.ironsource.mediationsdk.p207a.C6553d.m19930d()     // Catch:{ all -> 0x033c }
            java.lang.String r4 = r2.mo56851e()     // Catch:{ all -> 0x033c }
            r3.mo36372b((java.lang.String) r4, (android.content.Context) r11)     // Catch:{ all -> 0x033c }
            com.ironsource.mediationsdk.a.d r3 = com.ironsource.mediationsdk.p207a.C6553d.m19930d()     // Catch:{ all -> 0x033c }
            java.lang.String r4 = r2.mo56850d()     // Catch:{ all -> 0x033c }
            r3.mo36363a((java.lang.String) r4, (android.content.Context) r11)     // Catch:{ all -> 0x033c }
            com.ironsource.mediationsdk.a.d r3 = com.ironsource.mediationsdk.p207a.C6553d.m19930d()     // Catch:{ all -> 0x033c }
            int r4 = r2.mo56853g()     // Catch:{ all -> 0x033c }
            r3.mo36370b((int) r4)     // Catch:{ all -> 0x033c }
            com.ironsource.mediationsdk.a.d r3 = com.ironsource.mediationsdk.p207a.C6553d.m19930d()     // Catch:{ all -> 0x033c }
            int r4 = r2.mo56854h()     // Catch:{ all -> 0x033c }
            r3.mo36376c((int) r4)     // Catch:{ all -> 0x033c }
            com.ironsource.mediationsdk.a.d r3 = com.ironsource.mediationsdk.p207a.C6553d.m19930d()     // Catch:{ all -> 0x033c }
            int r4 = r2.mo56852f()     // Catch:{ all -> 0x033c }
            r3.mo36360a((int) r4)     // Catch:{ all -> 0x033c }
            com.ironsource.mediationsdk.a.d r3 = com.ironsource.mediationsdk.p207a.C6553d.m19930d()     // Catch:{ all -> 0x033c }
            int[] r4 = r2.mo56855i()     // Catch:{ all -> 0x033c }
            r3.mo36366a((int[]) r4, (android.content.Context) r11)     // Catch:{ all -> 0x033c }
            com.ironsource.mediationsdk.a.d r3 = com.ironsource.mediationsdk.p207a.C6553d.m19930d()     // Catch:{ all -> 0x033c }
            int[] r4 = r2.mo56856j()     // Catch:{ all -> 0x033c }
            r3.mo36374b((int[]) r4, (android.content.Context) r11)     // Catch:{ all -> 0x033c }
            com.ironsource.mediationsdk.a.d r3 = com.ironsource.mediationsdk.p207a.C6553d.m19930d()     // Catch:{ all -> 0x033c }
            int[] r4 = r2.mo56857k()     // Catch:{ all -> 0x033c }
            r3.mo36377c(r4, r11)     // Catch:{ all -> 0x033c }
            com.ironsource.mediationsdk.a.d r3 = com.ironsource.mediationsdk.p207a.C6553d.m19930d()     // Catch:{ all -> 0x033c }
            int[] r4 = r2.mo56858l()     // Catch:{ all -> 0x033c }
            r3.mo36380d(r4, r11)     // Catch:{ all -> 0x033c }
            com.ironsource.mediationsdk.a.d r3 = com.ironsource.mediationsdk.p207a.C6553d.m19930d()     // Catch:{ all -> 0x033c }
            com.ironsource.mediationsdk.model.g r12 = r12.f17849c     // Catch:{ all -> 0x033c }
            com.ironsource.sdk.f.a r12 = r12.f17500e     // Catch:{ all -> 0x033c }
            com.ironsource.mediationsdk.model.p r12 = r12.mo56831b()     // Catch:{ all -> 0x033c }
            r3.mo36362a((com.ironsource.mediationsdk.model.C6707p) r12)     // Catch:{ all -> 0x033c }
            com.ironsource.mediationsdk.a.d r12 = com.ironsource.mediationsdk.p207a.C6553d.m19930d()     // Catch:{ all -> 0x033c }
            boolean r2 = r2.mo56849c()     // Catch:{ all -> 0x033c }
            goto L_0x027b
        L_0x0303:
            com.ironsource.mediationsdk.a.d r12 = com.ironsource.mediationsdk.p207a.C6553d.m19930d()     // Catch:{ all -> 0x033c }
            r12.f16915f = r2     // Catch:{ all -> 0x033c }
        L_0x0309:
            com.ironsource.mediationsdk.a.g r12 = com.ironsource.mediationsdk.p207a.C6556g.f16963w     // Catch:{ all -> 0x033c }
            r12.f16915f = r8     // Catch:{ all -> 0x033c }
            if (r8 == 0) goto L_0x032a
            java.lang.String r12 = r7.f17733b     // Catch:{ all -> 0x033c }
            com.ironsource.mediationsdk.a.g r2 = com.ironsource.mediationsdk.p207a.C6556g.f16963w     // Catch:{ all -> 0x033c }
            r2.mo36363a((java.lang.String) r12, (android.content.Context) r11)     // Catch:{ all -> 0x033c }
            com.ironsource.mediationsdk.a.g r12 = com.ironsource.mediationsdk.p207a.C6556g.f16963w     // Catch:{ all -> 0x033c }
            int[] r2 = r7.f17735d     // Catch:{ all -> 0x033c }
            r12.mo36366a((int[]) r2, (android.content.Context) r11)     // Catch:{ all -> 0x033c }
            com.ironsource.mediationsdk.a.g r12 = com.ironsource.mediationsdk.p207a.C6556g.f16963w     // Catch:{ all -> 0x033c }
            int[] r2 = r7.f17736e     // Catch:{ all -> 0x033c }
            r12.mo36374b((int[]) r2, (android.content.Context) r11)     // Catch:{ all -> 0x033c }
            com.ironsource.mediationsdk.a.g r11 = com.ironsource.mediationsdk.p207a.C6556g.f16963w     // Catch:{ all -> 0x033c }
            boolean r12 = r7.f17734c     // Catch:{ all -> 0x033c }
            r11.f16912c = r12     // Catch:{ all -> 0x033c }
        L_0x032a:
            com.ironsource.mediationsdk.a.d r11 = com.ironsource.mediationsdk.p207a.C6553d.m19930d()     // Catch:{ all -> 0x033c }
            r11.f16910a = r1     // Catch:{ all -> 0x033c }
            com.ironsource.mediationsdk.a.h r11 = com.ironsource.mediationsdk.p207a.C6557h.m19950d()     // Catch:{ all -> 0x033c }
            r11.f16910a = r1     // Catch:{ all -> 0x033c }
            com.ironsource.mediationsdk.a.g r11 = com.ironsource.mediationsdk.p207a.C6556g.f16963w     // Catch:{ all -> 0x033c }
            r11.f16910a = r1     // Catch:{ all -> 0x033c }
        L_0x033a:
            monitor-exit(r0)     // Catch:{ all -> 0x033c }
            return r13
        L_0x033c:
            r11 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x033c }
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.C6490J.mo36132a(android.content.Context, java.lang.String, com.ironsource.mediationsdk.J$a):com.ironsource.mediationsdk.utils.l");
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        	at java.base/java.util.Objects.checkIndex(Objects.java:372)
        	at java.base/java.util.ArrayList.get(ArrayList.java:458)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* renamed from: a */
    public final synchronized void mo36133a(android.app.Activity r9, com.ironsource.mediationsdk.ISDemandOnlyBannerLayout r10, java.lang.String r11, java.lang.String r12) {
        /*
            r8 = this;
            monitor-enter(r8)
            r0 = 3
            if (r12 != 0) goto L_0x0012
            java.lang.String r9 = "adm cannot be null"
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r10 = r8.f16540f     // Catch:{ all -> 0x000f }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r11 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API     // Catch:{ all -> 0x000f }
            r10.log(r11, r9, r0)     // Catch:{ all -> 0x000f }
            monitor-exit(r8)
            return
        L_0x000f:
            r9 = move-exception
            goto L_0x0258
        L_0x0012:
            r1 = 510(0x1fe, float:7.15E-43)
            boolean r2 = r8.f16523ac     // Catch:{ all -> 0x0240 }
            if (r2 != 0) goto L_0x002b
            java.lang.String r9 = "initISDemandOnly() must be called before loadISDemandOnlyBannerWithAdm()"
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r11 = r8.f16540f     // Catch:{ all -> 0x0240 }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r12 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API     // Catch:{ all -> 0x0240 }
            r11.log(r12, r9, r0)     // Catch:{ all -> 0x0240 }
            com.ironsource.mediationsdk.logger.IronSourceError r11 = new com.ironsource.mediationsdk.logger.IronSourceError     // Catch:{ all -> 0x0240 }
            r11.<init>(r1, r9)     // Catch:{ all -> 0x0240 }
            r10.mo36087a((com.ironsource.mediationsdk.logger.IronSourceError) r11)     // Catch:{ all -> 0x0240 }
            monitor-exit(r8)
            return
        L_0x002b:
            boolean r2 = r8.f16522ab     // Catch:{ all -> 0x0240 }
            if (r2 != 0) goto L_0x0042
            java.lang.String r9 = "Banner was initialized in mediation mode. Use loadBanner instead"
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r11 = r8.f16540f     // Catch:{ all -> 0x0240 }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r12 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API     // Catch:{ all -> 0x0240 }
            r11.log(r12, r9, r0)     // Catch:{ all -> 0x0240 }
            com.ironsource.mediationsdk.logger.IronSourceError r11 = new com.ironsource.mediationsdk.logger.IronSourceError     // Catch:{ all -> 0x0240 }
            r11.<init>(r1, r9)     // Catch:{ all -> 0x0240 }
            r10.mo36087a((com.ironsource.mediationsdk.logger.IronSourceError) r11)     // Catch:{ all -> 0x0240 }
            monitor-exit(r8)
            return
        L_0x0042:
            r2 = 0
            r3 = 1
            if (r9 == 0) goto L_0x004e
            com.ironsource.environment.ContextProvider r4 = com.ironsource.environment.ContextProvider.getInstance()     // Catch:{ all -> 0x0240 }
            r4.updateActivity(r9)     // Catch:{ all -> 0x0240 }
            goto L_0x007b
        L_0x004e:
            com.ironsource.environment.ContextProvider r9 = com.ironsource.environment.ContextProvider.getInstance()     // Catch:{ all -> 0x0240 }
            android.app.Activity r9 = r9.getCurrentActiveActivity()     // Catch:{ all -> 0x0240 }
            if (r9 != 0) goto L_0x007b
            if (r12 != 0) goto L_0x005b
            goto L_0x005c
        L_0x005b:
            r2 = r3
        L_0x005c:
            org.json.JSONObject r9 = com.ironsource.mediationsdk.utils.IronSourceUtils.getMediationAdditionalData(r3, r2, r3)     // Catch:{ all -> 0x0240 }
            r11 = 83321(0x14579, float:1.16758E-40)
            m19492b(r11, r9)     // Catch:{ all -> 0x0240 }
            java.lang.String r9 = "Banner was initialized and loaded without Activity"
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r11 = r8.f16540f     // Catch:{ all -> 0x0240 }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r12 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API     // Catch:{ all -> 0x0240 }
            r11.log(r12, r9, r0)     // Catch:{ all -> 0x0240 }
            com.ironsource.mediationsdk.logger.IronSourceError r11 = new com.ironsource.mediationsdk.logger.IronSourceError     // Catch:{ all -> 0x0240 }
            r12 = 1062(0x426, float:1.488E-42)
            r11.<init>(r12, r9)     // Catch:{ all -> 0x0240 }
            r10.mo36087a((com.ironsource.mediationsdk.logger.IronSourceError) r11)     // Catch:{ all -> 0x0240 }
            monitor-exit(r8)
            return
        L_0x007b:
            com.ironsource.mediationsdk.O r9 = com.ironsource.mediationsdk.C6504O.m19641a()     // Catch:{ all -> 0x0240 }
            com.ironsource.mediationsdk.O$a r9 = r9.mo36232b()     // Catch:{ all -> 0x0240 }
            com.ironsource.mediationsdk.O$a r4 = com.ironsource.mediationsdk.C6504O.C6509a.INIT_FAILED     // Catch:{ all -> 0x0240 }
            if (r9 != r4) goto L_0x009d
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r9 = r8.f16540f     // Catch:{ all -> 0x0240 }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r11 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API     // Catch:{ all -> 0x0240 }
            java.lang.String r12 = "init() had failed"
            r9.log(r11, r12, r0)     // Catch:{ all -> 0x0240 }
            java.lang.String r9 = "init() had failed"
            java.lang.String r11 = "Banner"
            com.ironsource.mediationsdk.logger.IronSourceError r9 = com.ironsource.mediationsdk.utils.ErrorBuilder.buildInitFailedError(r9, r11)     // Catch:{ all -> 0x0240 }
            r10.mo36087a((com.ironsource.mediationsdk.logger.IronSourceError) r9)     // Catch:{ all -> 0x0240 }
            monitor-exit(r8)
            return
        L_0x009d:
            com.ironsource.mediationsdk.O$a r4 = com.ironsource.mediationsdk.C6504O.C6509a.INIT_IN_PROGRESS     // Catch:{ all -> 0x0240 }
            r5 = 83004(0x1443c, float:1.16313E-40)
            if (r9 != r4) goto L_0x00db
            com.ironsource.mediationsdk.O r9 = com.ironsource.mediationsdk.C6504O.m19641a()     // Catch:{ all -> 0x0240 }
            boolean r9 = r9.mo36234c()     // Catch:{ all -> 0x0240 }
            if (r9 == 0) goto L_0x00c4
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r9 = r8.f16540f     // Catch:{ all -> 0x0240 }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r11 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API     // Catch:{ all -> 0x0240 }
            java.lang.String r12 = "init() had failed"
            r9.log(r11, r12, r0)     // Catch:{ all -> 0x0240 }
            java.lang.String r9 = "init() had failed"
            java.lang.String r11 = "Banner"
            com.ironsource.mediationsdk.logger.IronSourceError r9 = com.ironsource.mediationsdk.utils.ErrorBuilder.buildInitFailedError(r9, r11)     // Catch:{ all -> 0x0240 }
            r10.mo36087a((com.ironsource.mediationsdk.logger.IronSourceError) r9)     // Catch:{ all -> 0x0240 }
            monitor-exit(r8)
            return
        L_0x00c4:
            java.lang.Boolean r9 = r8.f16524ad     // Catch:{ all -> 0x0240 }
            monitor-enter(r9)     // Catch:{ all -> 0x0240 }
            java.util.concurrent.CopyOnWriteArraySet<java.lang.String> r0 = r8.f16532al     // Catch:{ all -> 0x00d8 }
            r0.add(r11)     // Catch:{ all -> 0x00d8 }
            monitor-exit(r9)     // Catch:{ all -> 0x00d8 }
            if (r12 == 0) goto L_0x00d6
            org.json.JSONObject r9 = com.ironsource.mediationsdk.utils.IronSourceUtils.getMediationAdditionalData(r3, r3, r3)     // Catch:{ all -> 0x0240 }
            m19492b(r5, r9)     // Catch:{ all -> 0x0240 }
        L_0x00d6:
            monitor-exit(r8)
            return
        L_0x00d8:
            r11 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x00d8 }
            throw r11     // Catch:{ all -> 0x0240 }
        L_0x00db:
            java.util.concurrent.CopyOnWriteArraySet<java.lang.String> r9 = r8.f16532al     // Catch:{ all -> 0x0240 }
            monitor-enter(r9)     // Catch:{ all -> 0x0240 }
            com.ironsource.mediationsdk.s r4 = r8.f16507N     // Catch:{ all -> 0x023d }
            if (r4 != 0) goto L_0x00f3
            java.util.concurrent.CopyOnWriteArraySet<java.lang.String> r0 = r8.f16532al     // Catch:{ all -> 0x023d }
            r0.add(r11)     // Catch:{ all -> 0x023d }
            if (r12 == 0) goto L_0x00f0
            org.json.JSONObject r11 = com.ironsource.mediationsdk.utils.IronSourceUtils.getMediationAdditionalData(r3, r3, r3)     // Catch:{ all -> 0x023d }
            m19492b(r5, r11)     // Catch:{ all -> 0x023d }
        L_0x00f0:
            monitor-exit(r9)     // Catch:{ all -> 0x023d }
            monitor-exit(r8)
            return
        L_0x00f3:
            monitor-exit(r9)     // Catch:{ all -> 0x023d }
            boolean r9 = r8.m19470H()     // Catch:{ all -> 0x0240 }
            if (r9 != 0) goto L_0x0110
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r9 = r8.f16540f     // Catch:{ all -> 0x0240 }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r11 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API     // Catch:{ all -> 0x0240 }
            java.lang.String r12 = "No banner configurations found"
            r9.log(r11, r12, r0)     // Catch:{ all -> 0x0240 }
            java.lang.String r9 = "the server response does not contain banner data"
            java.lang.String r11 = "Banner"
            com.ironsource.mediationsdk.logger.IronSourceError r9 = com.ironsource.mediationsdk.utils.ErrorBuilder.buildInitFailedError(r9, r11)     // Catch:{ all -> 0x0240 }
            r10.mo36087a((com.ironsource.mediationsdk.logger.IronSourceError) r9)     // Catch:{ all -> 0x0240 }
            monitor-exit(r8)
            return
        L_0x0110:
            if (r12 == 0) goto L_0x0227
            com.ironsource.mediationsdk.s r9 = r8.f16507N     // Catch:{ all -> 0x0240 }
            r9.f17592b = r10     // Catch:{ all -> 0x0240 }
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.ironsource.mediationsdk.t> r0 = r9.f17593c     // Catch:{ all -> 0x0240 }
            boolean r0 = r0.containsKey(r11)     // Catch:{ all -> 0x0240 }
            if (r0 != 0) goto L_0x0134
            r12 = 3503(0xdaf, float:4.909E-42)
            com.ironsource.mediationsdk.C6718s.m20455a((int) r12, (java.lang.String) r11)     // Catch:{ all -> 0x0240 }
            java.lang.String r11 = "Banner"
            com.ironsource.mediationsdk.logger.IronSourceError r11 = com.ironsource.mediationsdk.utils.ErrorBuilder.buildNonExistentInstanceError(r11)     // Catch:{ all -> 0x0240 }
            com.ironsource.mediationsdk.ISDemandOnlyBannerLayout r12 = r9.f17592b     // Catch:{ all -> 0x0240 }
            if (r12 == 0) goto L_0x023b
            com.ironsource.mediationsdk.ISDemandOnlyBannerLayout r9 = r9.f17592b     // Catch:{ all -> 0x0240 }
        L_0x012f:
            r9.mo36087a((com.ironsource.mediationsdk.logger.IronSourceError) r11)     // Catch:{ all -> 0x0240 }
            goto L_0x023b
        L_0x0134:
            r0 = 3504(0xdb0, float:4.91E-42)
            if (r10 != 0) goto L_0x013c
        L_0x0138:
            com.ironsource.mediationsdk.C6718s.m20455a((int) r0, (java.lang.String) r11)     // Catch:{ all -> 0x0240 }
            goto L_0x0144
        L_0x013c:
            boolean r4 = r10.isDestroyed()     // Catch:{ all -> 0x0240 }
            if (r4 == 0) goto L_0x0143
            goto L_0x0138
        L_0x0143:
            r2 = r3
        L_0x0144:
            if (r2 != 0) goto L_0x0153
            java.lang.String r11 = "validateBannerLayout fail"
            com.ironsource.mediationsdk.logger.IronSourceError r11 = com.ironsource.mediationsdk.utils.ErrorBuilder.buildGenericError(r11)     // Catch:{ all -> 0x0240 }
            com.ironsource.mediationsdk.ISDemandOnlyBannerLayout r12 = r9.f17592b     // Catch:{ all -> 0x0240 }
            if (r12 == 0) goto L_0x023b
            com.ironsource.mediationsdk.ISDemandOnlyBannerLayout r9 = r9.f17592b     // Catch:{ all -> 0x0240 }
            goto L_0x012f
        L_0x0153:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.ironsource.mediationsdk.t> r0 = r9.f17593c     // Catch:{ all -> 0x0240 }
            java.lang.Object r11 = r0.get(r11)     // Catch:{ all -> 0x0240 }
            r2 = r11
            com.ironsource.mediationsdk.t r2 = (com.ironsource.mediationsdk.C6760t) r2     // Catch:{ all -> 0x0240 }
            r9.f17591a = r2     // Catch:{ all -> 0x0240 }
            if (r2 != 0) goto L_0x0176
            java.lang.String r11 = "loadISDemandOnlyBannerWithAdm smash is no exist"
            com.ironsource.mediationsdk.logger.IronSourceError r11 = com.ironsource.mediationsdk.utils.ErrorBuilder.buildLoadFailedError(r11)     // Catch:{ all -> 0x0240 }
            com.ironsource.mediationsdk.logger.IronLog r12 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL     // Catch:{ all -> 0x0240 }
            java.lang.String r0 = r11.getErrorMessage()     // Catch:{ all -> 0x0240 }
            r12.error(r0)     // Catch:{ all -> 0x0240 }
            com.ironsource.mediationsdk.ISDemandOnlyBannerLayout r12 = r9.f17592b     // Catch:{ all -> 0x0240 }
            if (r12 == 0) goto L_0x023b
            com.ironsource.mediationsdk.ISDemandOnlyBannerLayout r9 = r9.f17592b     // Catch:{ all -> 0x0240 }
            goto L_0x012f
        L_0x0176:
            boolean r11 = r2.mo37014i()     // Catch:{ all -> 0x0240 }
            r0 = 3300(0xce4, float:4.624E-42)
            if (r11 != 0) goto L_0x0198
            java.lang.String r11 = "loadISDemandOnlyBannerWithAdm in IAB flow must be called by bidder instances"
            com.ironsource.mediationsdk.logger.IronSourceError r11 = com.ironsource.mediationsdk.utils.ErrorBuilder.buildLoadFailedError(r11)     // Catch:{ all -> 0x0240 }
            com.ironsource.mediationsdk.logger.IronLog r12 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL     // Catch:{ all -> 0x0240 }
            java.lang.String r3 = r11.getErrorMessage()     // Catch:{ all -> 0x0240 }
            r12.error(r3)     // Catch:{ all -> 0x0240 }
            r12 = 0
            com.ironsource.mediationsdk.C6718s.m20454a((int) r0, (com.ironsource.mediationsdk.C6760t) r2, (java.lang.Object[][]) r12)     // Catch:{ all -> 0x0240 }
            com.ironsource.mediationsdk.ISDemandOnlyBannerLayout r12 = r9.f17592b     // Catch:{ all -> 0x0240 }
            if (r12 == 0) goto L_0x023b
            com.ironsource.mediationsdk.ISDemandOnlyBannerLayout r9 = r9.f17592b     // Catch:{ all -> 0x0240 }
            goto L_0x012f
        L_0x0198:
            com.ironsource.mediationsdk.C6656f.m20309a()     // Catch:{ all -> 0x0240 }
            org.json.JSONObject r11 = com.ironsource.mediationsdk.C6656f.m20312a((java.lang.String) r12)     // Catch:{ all -> 0x0240 }
            com.ironsource.mediationsdk.f$a r12 = new com.ironsource.mediationsdk.f$a     // Catch:{ all -> 0x0240 }
            r12.<init>()     // Catch:{ all -> 0x0240 }
            com.ironsource.mediationsdk.C6656f.m20309a()     // Catch:{ Exception -> 0x01ac }
            com.ironsource.mediationsdk.f$a r12 = com.ironsource.mediationsdk.C6656f.m20308a((org.json.JSONObject) r11)     // Catch:{ Exception -> 0x01ac }
            goto L_0x01d5
        L_0x01ac:
            r11 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0240 }
            java.lang.String r4 = "loadISDemandOnlyBannerWithAdm: unable to get auction data from response. Exception="
            r3.<init>(r4)     // Catch:{ all -> 0x0240 }
            java.lang.String r11 = r11.getLocalizedMessage()     // Catch:{ all -> 0x0240 }
            r3.append(r11)     // Catch:{ all -> 0x0240 }
            java.lang.String r11 = r3.toString()     // Catch:{ all -> 0x0240 }
            com.ironsource.mediationsdk.logger.IronSourceError r11 = com.ironsource.mediationsdk.utils.ErrorBuilder.buildLoadFailedError(r11)     // Catch:{ all -> 0x0240 }
            com.ironsource.mediationsdk.logger.IronLog r3 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL     // Catch:{ all -> 0x0240 }
            java.lang.String r4 = r11.getErrorMessage()     // Catch:{ all -> 0x0240 }
            r3.error(r4)     // Catch:{ all -> 0x0240 }
            com.ironsource.mediationsdk.ISDemandOnlyBannerLayout r3 = r9.f17592b     // Catch:{ all -> 0x0240 }
            if (r3 == 0) goto L_0x01d5
            com.ironsource.mediationsdk.ISDemandOnlyBannerLayout r3 = r9.f17592b     // Catch:{ all -> 0x0240 }
            r3.mo36087a((com.ironsource.mediationsdk.logger.IronSourceError) r11)     // Catch:{ all -> 0x0240 }
        L_0x01d5:
            com.ironsource.mediationsdk.C6656f.m20309a()     // Catch:{ all -> 0x0240 }
            java.lang.String r11 = r2.mo37009d()     // Catch:{ all -> 0x0240 }
            java.util.List<com.ironsource.mediationsdk.server.b> r3 = r12.f17300b     // Catch:{ all -> 0x0240 }
            com.ironsource.mediationsdk.server.b r11 = com.ironsource.mediationsdk.C6656f.m20310a((java.lang.String) r11, (java.util.List<com.ironsource.mediationsdk.server.C6758b>) r3)     // Catch:{ all -> 0x0240 }
            if (r11 == 0) goto L_0x020b
            java.lang.String r0 = r11.mo36940b()     // Catch:{ all -> 0x0240 }
            r2.mo37004a((java.lang.String) r0)     // Catch:{ all -> 0x0240 }
            java.lang.String r0 = r12.f17299a     // Catch:{ all -> 0x0240 }
            r2.mo37008b(r0)     // Catch:{ all -> 0x0240 }
            org.json.JSONObject r0 = r12.f17302d     // Catch:{ all -> 0x0240 }
            r2.mo37006a((org.json.JSONObject) r0)     // Catch:{ all -> 0x0240 }
            r0 = 3002(0xbba, float:4.207E-42)
            r9.mo36854a((int) r0, (com.ironsource.mediationsdk.C6760t) r2)     // Catch:{ all -> 0x0240 }
            java.lang.String r4 = r11.mo36940b()     // Catch:{ all -> 0x0240 }
            java.lang.String r5 = r12.f17299a     // Catch:{ all -> 0x0240 }
            org.json.JSONObject r6 = r12.f17302d     // Catch:{ all -> 0x0240 }
            java.util.List r7 = r11.mo36942d()     // Catch:{ all -> 0x0240 }
            r3 = r10
            r2.mo36948a(r3, r4, r5, r6, r7)     // Catch:{ all -> 0x0240 }
            goto L_0x023b
        L_0x020b:
            java.lang.String r11 = "loadISDemandOnlyBannerWithAdm invalid enriched adm"
            com.ironsource.mediationsdk.logger.IronSourceError r11 = com.ironsource.mediationsdk.utils.ErrorBuilder.buildLoadFailedError(r11)     // Catch:{ all -> 0x0240 }
            com.ironsource.mediationsdk.logger.IronLog r12 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL     // Catch:{ all -> 0x0240 }
            java.lang.String r3 = r11.getErrorMessage()     // Catch:{ all -> 0x0240 }
            r12.error(r3)     // Catch:{ all -> 0x0240 }
            r9.mo36854a((int) r0, (com.ironsource.mediationsdk.C6760t) r2)     // Catch:{ all -> 0x0240 }
            com.ironsource.mediationsdk.ISDemandOnlyBannerLayout r12 = r9.f17592b     // Catch:{ all -> 0x0240 }
            if (r12 == 0) goto L_0x0256
            com.ironsource.mediationsdk.ISDemandOnlyBannerLayout r9 = r9.f17592b     // Catch:{ all -> 0x0240 }
            r9.mo36087a((com.ironsource.mediationsdk.logger.IronSourceError) r11)     // Catch:{ all -> 0x0240 }
            goto L_0x0256
        L_0x0227:
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r9 = r8.f16540f     // Catch:{ all -> 0x0240 }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r11 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API     // Catch:{ all -> 0x0240 }
            java.lang.String r12 = "Banner support bidding mode only"
            r9.log(r11, r12, r0)     // Catch:{ all -> 0x0240 }
            java.lang.String r9 = "Banner support bidding mode only"
            java.lang.String r11 = "Banner"
            com.ironsource.mediationsdk.logger.IronSourceError r9 = com.ironsource.mediationsdk.utils.ErrorBuilder.buildInitFailedError(r9, r11)     // Catch:{ all -> 0x0240 }
            r10.mo36087a((com.ironsource.mediationsdk.logger.IronSourceError) r9)     // Catch:{ all -> 0x0240 }
        L_0x023b:
            monitor-exit(r8)
            return
        L_0x023d:
            r11 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x023d }
            throw r11     // Catch:{ all -> 0x0240 }
        L_0x0240:
            r9 = move-exception
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r11 = r8.f16540f     // Catch:{ all -> 0x000f }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r12 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API     // Catch:{ all -> 0x000f }
            java.lang.String r0 = "loadDemandOnlyBanner"
            r11.logException(r12, r0, r9)     // Catch:{ all -> 0x000f }
            com.ironsource.mediationsdk.logger.IronSourceError r11 = new com.ironsource.mediationsdk.logger.IronSourceError     // Catch:{ all -> 0x000f }
            java.lang.String r9 = r9.getMessage()     // Catch:{ all -> 0x000f }
            r11.<init>(r1, r9)     // Catch:{ all -> 0x000f }
            r10.mo36087a((com.ironsource.mediationsdk.logger.IronSourceError) r11)     // Catch:{ all -> 0x000f }
        L_0x0256:
            monitor-exit(r8)
            return
        L_0x0258:
            monitor-exit(r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.C6490J.mo36133a(android.app.Activity, com.ironsource.mediationsdk.ISDemandOnlyBannerLayout, java.lang.String, java.lang.String):void");
    }

    /* renamed from: a */
    public final synchronized void mo36134a(Activity activity, String str, String str2) {
        if (str2 == null) {
            this.f16540f.log(IronSourceLogger.IronSourceTag.API, "adm cannot be null", 3);
            C6561ab.m19971a().mo36407a(str, new IronSourceError(IronSourceError.ERROR_CODE_GENERIC, "adm cannot be null"));
            return;
        }
        mo36145b(activity, str, str2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:50:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00de  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo36135a(android.content.Context r8, java.lang.String r9, com.ironsource.mediationsdk.sdk.InitializationListener r10, com.ironsource.mediationsdk.IronSource.AD_UNIT... r11) {
        /*
            r7 = this;
            monitor-enter(r7)
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch:{ all -> 0x00f5 }
            r10.<init>()     // Catch:{ all -> 0x00f5 }
            r0 = 1
            if (r11 == 0) goto L_0x008a
            int r1 = r11.length     // Catch:{ all -> 0x00f5 }
            if (r1 != 0) goto L_0x000e
            goto L_0x008a
        L_0x000e:
            int r1 = r11.length     // Catch:{ all -> 0x00f5 }
            r2 = 0
        L_0x0010:
            if (r2 >= r1) goto L_0x00bd
            r3 = r11[r2]     // Catch:{ all -> 0x00f5 }
            com.ironsource.mediationsdk.IronSource$AD_UNIT r4 = com.ironsource.mediationsdk.IronSource.AD_UNIT.OFFERWALL     // Catch:{ all -> 0x00f5 }
            boolean r4 = r3.equals(r4)     // Catch:{ all -> 0x00f5 }
            if (r4 == 0) goto L_0x0036
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r4 = r7.f16540f     // Catch:{ all -> 0x00f5 }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r5 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API     // Catch:{ all -> 0x00f5 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x00f5 }
            r6.<init>()     // Catch:{ all -> 0x00f5 }
            r6.append(r3)     // Catch:{ all -> 0x00f5 }
            java.lang.String r3 = " ad unit cannot be initialized in demand only mode"
            r6.append(r3)     // Catch:{ all -> 0x00f5 }
            java.lang.String r3 = r6.toString()     // Catch:{ all -> 0x00f5 }
            r6 = 3
            r4.log(r5, r3, r6)     // Catch:{ all -> 0x00f5 }
            goto L_0x0087
        L_0x0036:
            com.ironsource.mediationsdk.IronSource$AD_UNIT r4 = com.ironsource.mediationsdk.IronSource.AD_UNIT.INTERSTITIAL     // Catch:{ all -> 0x00f5 }
            boolean r4 = r3.equals(r4)     // Catch:{ all -> 0x00f5 }
            if (r4 == 0) goto L_0x0051
            boolean r4 = r7.f16558x     // Catch:{ all -> 0x00f5 }
            if (r4 == 0) goto L_0x0046
            r7.m19479a((com.ironsource.mediationsdk.IronSource.AD_UNIT) r3)     // Catch:{ all -> 0x00f5 }
            goto L_0x0051
        L_0x0046:
            r7.f16556v = r0     // Catch:{ all -> 0x00f5 }
            boolean r4 = r10.contains(r3)     // Catch:{ all -> 0x00f5 }
            if (r4 != 0) goto L_0x0051
            r10.add(r3)     // Catch:{ all -> 0x00f5 }
        L_0x0051:
            com.ironsource.mediationsdk.IronSource$AD_UNIT r4 = com.ironsource.mediationsdk.IronSource.AD_UNIT.REWARDED_VIDEO     // Catch:{ all -> 0x00f5 }
            boolean r4 = r3.equals(r4)     // Catch:{ all -> 0x00f5 }
            if (r4 == 0) goto L_0x006c
            boolean r4 = r7.f16557w     // Catch:{ all -> 0x00f5 }
            if (r4 == 0) goto L_0x0061
            r7.m19479a((com.ironsource.mediationsdk.IronSource.AD_UNIT) r3)     // Catch:{ all -> 0x00f5 }
            goto L_0x006c
        L_0x0061:
            r7.f16555u = r0     // Catch:{ all -> 0x00f5 }
            boolean r4 = r10.contains(r3)     // Catch:{ all -> 0x00f5 }
            if (r4 != 0) goto L_0x006c
            r10.add(r3)     // Catch:{ all -> 0x00f5 }
        L_0x006c:
            com.ironsource.mediationsdk.IronSource$AD_UNIT r4 = com.ironsource.mediationsdk.IronSource.AD_UNIT.BANNER     // Catch:{ all -> 0x00f5 }
            boolean r4 = r3.equals(r4)     // Catch:{ all -> 0x00f5 }
            if (r4 == 0) goto L_0x0087
            boolean r4 = r7.f16523ac     // Catch:{ all -> 0x00f5 }
            if (r4 == 0) goto L_0x007c
            r7.m19479a((com.ironsource.mediationsdk.IronSource.AD_UNIT) r3)     // Catch:{ all -> 0x00f5 }
            goto L_0x0087
        L_0x007c:
            r7.f16522ab = r0     // Catch:{ all -> 0x00f5 }
            boolean r4 = r10.contains(r3)     // Catch:{ all -> 0x00f5 }
            if (r4 != 0) goto L_0x0087
            r10.add(r3)     // Catch:{ all -> 0x00f5 }
        L_0x0087:
            int r2 = r2 + 1
            goto L_0x0010
        L_0x008a:
            boolean r11 = r7.f16557w     // Catch:{ all -> 0x00f5 }
            if (r11 == 0) goto L_0x0094
            com.ironsource.mediationsdk.IronSource$AD_UNIT r11 = com.ironsource.mediationsdk.IronSource.AD_UNIT.REWARDED_VIDEO     // Catch:{ all -> 0x00f5 }
            r7.m19479a((com.ironsource.mediationsdk.IronSource.AD_UNIT) r11)     // Catch:{ all -> 0x00f5 }
            goto L_0x009b
        L_0x0094:
            r7.f16555u = r0     // Catch:{ all -> 0x00f5 }
            com.ironsource.mediationsdk.IronSource$AD_UNIT r11 = com.ironsource.mediationsdk.IronSource.AD_UNIT.REWARDED_VIDEO     // Catch:{ all -> 0x00f5 }
            r10.add(r11)     // Catch:{ all -> 0x00f5 }
        L_0x009b:
            boolean r11 = r7.f16558x     // Catch:{ all -> 0x00f5 }
            if (r11 == 0) goto L_0x00a5
            com.ironsource.mediationsdk.IronSource$AD_UNIT r11 = com.ironsource.mediationsdk.IronSource.AD_UNIT.INTERSTITIAL     // Catch:{ all -> 0x00f5 }
            r7.m19479a((com.ironsource.mediationsdk.IronSource.AD_UNIT) r11)     // Catch:{ all -> 0x00f5 }
            goto L_0x00ac
        L_0x00a5:
            r7.f16556v = r0     // Catch:{ all -> 0x00f5 }
            com.ironsource.mediationsdk.IronSource$AD_UNIT r11 = com.ironsource.mediationsdk.IronSource.AD_UNIT.INTERSTITIAL     // Catch:{ all -> 0x00f5 }
            r10.add(r11)     // Catch:{ all -> 0x00f5 }
        L_0x00ac:
            boolean r11 = r7.f16523ac     // Catch:{ all -> 0x00f5 }
            if (r11 == 0) goto L_0x00b6
            com.ironsource.mediationsdk.IronSource$AD_UNIT r11 = com.ironsource.mediationsdk.IronSource.AD_UNIT.BANNER     // Catch:{ all -> 0x00f5 }
            r7.m19479a((com.ironsource.mediationsdk.IronSource.AD_UNIT) r11)     // Catch:{ all -> 0x00f5 }
            goto L_0x00bd
        L_0x00b6:
            r7.f16522ab = r0     // Catch:{ all -> 0x00f5 }
            com.ironsource.mediationsdk.IronSource$AD_UNIT r11 = com.ironsource.mediationsdk.IronSource.AD_UNIT.BANNER     // Catch:{ all -> 0x00f5 }
            r10.add(r11)     // Catch:{ all -> 0x00f5 }
        L_0x00bd:
            if (r8 == 0) goto L_0x00d8
            boolean r11 = r8 instanceof android.app.Activity     // Catch:{ all -> 0x00f5 }
            if (r11 == 0) goto L_0x00cd
            com.ironsource.environment.ContextProvider r11 = com.ironsource.environment.ContextProvider.getInstance()     // Catch:{ all -> 0x00f5 }
            r0 = r8
            android.app.Activity r0 = (android.app.Activity) r0     // Catch:{ all -> 0x00f5 }
            r11.updateActivity(r0)     // Catch:{ all -> 0x00f5 }
        L_0x00cd:
            com.ironsource.environment.ContextProvider r11 = com.ironsource.environment.ContextProvider.getInstance()     // Catch:{ all -> 0x00f5 }
            android.content.Context r0 = r8.getApplicationContext()     // Catch:{ all -> 0x00f5 }
            r11.updateAppContext(r0)     // Catch:{ all -> 0x00f5 }
        L_0x00d8:
            int r11 = r10.size()     // Catch:{ all -> 0x00f5 }
            if (r11 <= 0) goto L_0x00f3
            int r11 = r10.size()     // Catch:{ all -> 0x00f5 }
            com.ironsource.mediationsdk.IronSource$AD_UNIT[] r11 = new com.ironsource.mediationsdk.IronSource.AD_UNIT[r11]     // Catch:{ all -> 0x00f5 }
            java.lang.Object[] r10 = r10.toArray(r11)     // Catch:{ all -> 0x00f5 }
            r5 = r10
            com.ironsource.mediationsdk.IronSource$AD_UNIT[] r5 = (com.ironsource.mediationsdk.IronSource.AD_UNIT[]) r5     // Catch:{ all -> 0x00f5 }
            r3 = 1
            r4 = 0
            r0 = r7
            r1 = r8
            r2 = r9
            r0.mo36136a(r1, r2, r3, r4, r5)     // Catch:{ all -> 0x00f5 }
        L_0x00f3:
            monitor-exit(r7)
            return
        L_0x00f5:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.C6490J.mo36135a(android.content.Context, java.lang.String, com.ironsource.mediationsdk.sdk.InitializationListener, com.ironsource.mediationsdk.IronSource$AD_UNIT[]):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:118:0x02ea, code lost:
        return;
     */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0083 A[Catch:{ Exception -> 0x0285 }] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00bd A[Catch:{ Exception -> 0x0285 }] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00e1 A[Catch:{ Exception -> 0x0285 }] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00f1 A[Catch:{ Exception -> 0x0285 }] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0135 A[Catch:{ Exception -> 0x0285 }] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0154 A[Catch:{ Exception -> 0x0285 }] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x01ab A[Catch:{ Exception -> 0x0285 }] */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x01ec A[SYNTHETIC, Splitter:B:78:0x01ec] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo36136a(android.content.Context r9, java.lang.String r10, boolean r11, com.ironsource.mediationsdk.sdk.InitializationListener r12, com.ironsource.mediationsdk.IronSource.AD_UNIT... r13) {
        /*
            r8 = this;
            monitor-enter(r8)
            com.ironsource.mediationsdk.logger.IronLog r0 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL     // Catch:{ all -> 0x02eb }
            r0.verbose()     // Catch:{ all -> 0x02eb }
            if (r12 == 0) goto L_0x000a
            r8.f16527ag = r12     // Catch:{ all -> 0x02eb }
        L_0x000a:
            java.util.concurrent.atomic.AtomicBoolean r12 = r8.f16514U     // Catch:{ all -> 0x02eb }
            if (r12 == 0) goto L_0x02c7
            java.util.concurrent.atomic.AtomicBoolean r12 = r8.f16514U     // Catch:{ all -> 0x02eb }
            r0 = 0
            r1 = 1
            boolean r12 = r12.compareAndSet(r1, r0)     // Catch:{ all -> 0x02eb }
            if (r12 == 0) goto L_0x02c7
            if (r13 == 0) goto L_0x004f
            int r12 = r13.length     // Catch:{ all -> 0x02eb }
            if (r12 != 0) goto L_0x001e
            goto L_0x004f
        L_0x001e:
            int r12 = r13.length     // Catch:{ all -> 0x02eb }
            r2 = r0
        L_0x0020:
            if (r2 >= r12) goto L_0x0067
            r3 = r13[r2]     // Catch:{ all -> 0x02eb }
            java.util.Set<com.ironsource.mediationsdk.IronSource$AD_UNIT> r4 = r8.f16517X     // Catch:{ all -> 0x02eb }
            r4.add(r3)     // Catch:{ all -> 0x02eb }
            java.util.Set<com.ironsource.mediationsdk.IronSource$AD_UNIT> r4 = r8.f16518Y     // Catch:{ all -> 0x02eb }
            r4.add(r3)     // Catch:{ all -> 0x02eb }
            com.ironsource.mediationsdk.IronSource$AD_UNIT r4 = com.ironsource.mediationsdk.IronSource.AD_UNIT.INTERSTITIAL     // Catch:{ all -> 0x02eb }
            boolean r4 = r3.equals(r4)     // Catch:{ all -> 0x02eb }
            if (r4 == 0) goto L_0x0038
            r8.f16558x = r1     // Catch:{ all -> 0x02eb }
        L_0x0038:
            com.ironsource.mediationsdk.IronSource$AD_UNIT r4 = com.ironsource.mediationsdk.IronSource.AD_UNIT.BANNER     // Catch:{ all -> 0x02eb }
            boolean r4 = r3.equals(r4)     // Catch:{ all -> 0x02eb }
            if (r4 == 0) goto L_0x0042
            r8.f16523ac = r1     // Catch:{ all -> 0x02eb }
        L_0x0042:
            com.ironsource.mediationsdk.IronSource$AD_UNIT r4 = com.ironsource.mediationsdk.IronSource.AD_UNIT.REWARDED_VIDEO     // Catch:{ all -> 0x02eb }
            boolean r3 = r3.equals(r4)     // Catch:{ all -> 0x02eb }
            if (r3 == 0) goto L_0x004c
            r8.f16557w = r1     // Catch:{ all -> 0x02eb }
        L_0x004c:
            int r2 = r2 + 1
            goto L_0x0020
        L_0x004f:
            com.ironsource.mediationsdk.IronSource$AD_UNIT[] r12 = com.ironsource.mediationsdk.IronSource.AD_UNIT.values()     // Catch:{ all -> 0x02eb }
            int r2 = r12.length     // Catch:{ all -> 0x02eb }
            r3 = r0
        L_0x0055:
            if (r3 >= r2) goto L_0x0061
            r4 = r12[r3]     // Catch:{ all -> 0x02eb }
            java.util.Set<com.ironsource.mediationsdk.IronSource$AD_UNIT> r5 = r8.f16517X     // Catch:{ all -> 0x02eb }
            r5.add(r4)     // Catch:{ all -> 0x02eb }
            int r3 = r3 + 1
            goto L_0x0055
        L_0x0061:
            r8.f16557w = r1     // Catch:{ all -> 0x02eb }
            r8.f16558x = r1     // Catch:{ all -> 0x02eb }
            r8.f16523ac = r1     // Catch:{ all -> 0x02eb }
        L_0x0067:
            com.ironsource.mediationsdk.logger.IronLog r12 = com.ironsource.mediationsdk.logger.IronLog.API     // Catch:{ all -> 0x02eb }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x02eb }
            java.lang.String r3 = "init(appKey:"
            r2.<init>(r3)     // Catch:{ all -> 0x02eb }
            r2.append(r10)     // Catch:{ all -> 0x02eb }
            java.lang.String r3 = ")"
            r2.append(r3)     // Catch:{ all -> 0x02eb }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x02eb }
            r12.info(r2)     // Catch:{ all -> 0x02eb }
            boolean r12 = r9 instanceof android.app.Activity     // Catch:{ all -> 0x02eb }
            if (r12 == 0) goto L_0x008d
            com.ironsource.environment.ContextProvider r12 = com.ironsource.environment.ContextProvider.getInstance()     // Catch:{ all -> 0x02eb }
            r2 = r9
            android.app.Activity r2 = (android.app.Activity) r2     // Catch:{ all -> 0x02eb }
            r12.updateActivity(r2)     // Catch:{ all -> 0x02eb }
        L_0x008d:
            com.ironsource.environment.ContextProvider r12 = com.ironsource.environment.ContextProvider.getInstance()     // Catch:{ all -> 0x02eb }
            android.content.Context r2 = r9.getApplicationContext()     // Catch:{ all -> 0x02eb }
            r12.updateAppContext(r2)     // Catch:{ all -> 0x02eb }
            com.ironsource.environment.C6429h.m19339q()     // Catch:{ all -> 0x02eb }
            com.ironsource.d.b r12 = r8.f16534an     // Catch:{ all -> 0x02eb }
            java.lang.String r2 = com.ironsource.mediationsdk.utils.IronSourceUtils.getSDKVersion()     // Catch:{ all -> 0x02eb }
            r12.mo35885b((java.lang.String) r2)     // Catch:{ all -> 0x02eb }
            com.ironsource.d.b r12 = r8.f16534an     // Catch:{ all -> 0x02eb }
            com.ironsource.c.b r2 = com.ironsource.p199c.C6389a.m19174a()     // Catch:{ all -> 0x02eb }
            r12.mo35880a((com.ironsource.p199c.C6391b) r2)     // Catch:{ all -> 0x02eb }
            com.ironsource.d.b r12 = r8.f16534an     // Catch:{ all -> 0x02eb }
            boolean r2 = com.ironsource.mediationsdk.utils.IronSourceUtils.isGooglePlayInstalled(r9)     // Catch:{ all -> 0x02eb }
            r12.mo35887b((boolean) r2)     // Catch:{ all -> 0x02eb }
            com.ironsource.d.a r12 = new com.ironsource.d.a     // Catch:{ all -> 0x02eb }
            r12.<init>()     // Catch:{ all -> 0x02eb }
            if (r10 == 0) goto L_0x00e1
            r2 = 5
            r3 = 10
            boolean r2 = m19490a((java.lang.String) r10, (int) r2, (int) r3)     // Catch:{ all -> 0x02eb }
            if (r2 == 0) goto L_0x00d8
            boolean r2 = m19507v(r10)     // Catch:{ all -> 0x02eb }
            if (r2 != 0) goto L_0x00eb
            java.lang.String r2 = "appKey"
            java.lang.String r3 = "should contain only english characters and numbers"
            com.ironsource.mediationsdk.logger.IronSourceError r2 = com.ironsource.mediationsdk.utils.ErrorBuilder.buildInvalidCredentialsError(r2, r10, r3)     // Catch:{ all -> 0x02eb }
        L_0x00d4:
            r12.mo35874a((com.ironsource.mediationsdk.logger.IronSourceError) r2)     // Catch:{ all -> 0x02eb }
            goto L_0x00eb
        L_0x00d8:
            java.lang.String r2 = "appKey"
            java.lang.String r3 = "length should be between 5-10 characters"
            com.ironsource.mediationsdk.logger.IronSourceError r2 = com.ironsource.mediationsdk.utils.ErrorBuilder.buildInvalidCredentialsError(r2, r10, r3)     // Catch:{ all -> 0x02eb }
            goto L_0x00d4
        L_0x00e1:
            com.ironsource.mediationsdk.logger.IronSourceError r2 = new com.ironsource.mediationsdk.logger.IronSourceError     // Catch:{ all -> 0x02eb }
            r3 = 506(0x1fa, float:7.09E-43)
            java.lang.String r4 = "Init Fail - appKey is missing"
            r2.<init>(r3, r4)     // Catch:{ all -> 0x02eb }
            goto L_0x00d4
        L_0x00eb:
            boolean r2 = r12.mo35875a()     // Catch:{ all -> 0x02eb }
            if (r2 == 0) goto L_0x00f3
            r8.f16544j = r10     // Catch:{ all -> 0x02eb }
        L_0x00f3:
            com.ironsource.environment.ContextProvider r2 = com.ironsource.environment.ContextProvider.getInstance()     // Catch:{ all -> 0x02eb }
            android.content.Context r2 = r2.getApplicationContext()     // Catch:{ all -> 0x02eb }
            boolean r3 = com.ironsource.mediationsdk.utils.IronSourceUtils.isInitResponseCached(r2)     // Catch:{ all -> 0x02eb }
            long r4 = com.ironsource.mediationsdk.utils.IronSourceUtils.getFirstSessionTimestamp(r2)     // Catch:{ all -> 0x02eb }
            if (r3 != 0) goto L_0x0125
            r6 = -1
            int r3 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r3 != 0) goto L_0x0125
            long r3 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x02eb }
            com.ironsource.mediationsdk.logger.IronLog r5 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL     // Catch:{ all -> 0x02eb }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x02eb }
            java.lang.String r7 = "get first session timestamp = "
            r6.<init>(r7)     // Catch:{ all -> 0x02eb }
            r6.append(r3)     // Catch:{ all -> 0x02eb }
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x02eb }
            r5.verbose(r6)     // Catch:{ all -> 0x02eb }
            com.ironsource.mediationsdk.utils.IronSourceUtils.saveFirstSessionTimestamp(r2, r3)     // Catch:{ all -> 0x02eb }
        L_0x0125:
            com.ironsource.environment.ContextProvider r2 = com.ironsource.environment.ContextProvider.getInstance()     // Catch:{ all -> 0x02eb }
            android.content.Context r2 = r2.getApplicationContext()     // Catch:{ all -> 0x02eb }
            java.lang.String r3 = r8.f16545k     // Catch:{ all -> 0x02eb }
            com.ironsource.mediationsdk.utils.l r2 = r8.m19475a((android.content.Context) r2, (java.lang.String) r3)     // Catch:{ all -> 0x02eb }
            if (r2 == 0) goto L_0x0144
            com.ironsource.environment.g r3 = com.ironsource.environment.C6428g.f16337a     // Catch:{ all -> 0x02eb }
            com.ironsource.mediationsdk.model.g r2 = r2.f17849c     // Catch:{ all -> 0x02eb }
            com.ironsource.sdk.f.a r2 = r2.f17500e     // Catch:{ all -> 0x02eb }
            com.ironsource.mediationsdk.utils.b r2 = r2.mo56835f()     // Catch:{ all -> 0x02eb }
            boolean r2 = r2.f17668c     // Catch:{ all -> 0x02eb }
            com.ironsource.environment.C6428g.m19291a(r2)     // Catch:{ all -> 0x02eb }
        L_0x0144:
            com.ironsource.mediationsdk.utils.k r2 = com.ironsource.mediationsdk.utils.C6774k.m20599a()     // Catch:{ all -> 0x02eb }
            java.util.concurrent.ConcurrentHashMap r2 = r2.mo36978d()     // Catch:{ all -> 0x02eb }
            java.lang.String r3 = "is_deviceid_optout"
            boolean r3 = r2.containsKey(r3)     // Catch:{ all -> 0x02eb }
            if (r3 == 0) goto L_0x0176
            java.lang.String r3 = "is_deviceid_optout"
            java.lang.Object r2 = r2.get(r3)     // Catch:{ all -> 0x02eb }
            java.util.List r2 = (java.util.List) r2     // Catch:{ all -> 0x02eb }
            java.lang.Object r2 = r2.get(r0)     // Catch:{ all -> 0x02eb }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x02eb }
            boolean r3 = android.text.TextUtils.isEmpty(r2)     // Catch:{ all -> 0x02eb }
            if (r3 != 0) goto L_0x0176
            boolean r2 = com.ironsource.mediationsdk.metadata.MetaDataUtils.getMetaDataBooleanValue(r2)     // Catch:{ all -> 0x02eb }
            if (r2 != 0) goto L_0x0170
            r2 = r1
            goto L_0x0171
        L_0x0170:
            r2 = r0
        L_0x0171:
            com.ironsource.environment.g r3 = com.ironsource.environment.C6428g.f16337a     // Catch:{ all -> 0x02eb }
            com.ironsource.environment.C6428g.m19293b(r2)     // Catch:{ all -> 0x02eb }
        L_0x0176:
            java.util.concurrent.atomic.AtomicBoolean r2 = r8.f16512S     // Catch:{ all -> 0x02eb }
            if (r2 == 0) goto L_0x01a7
            java.util.concurrent.atomic.AtomicBoolean r2 = r8.f16512S     // Catch:{ all -> 0x02eb }
            boolean r2 = r2.compareAndSet(r0, r1)     // Catch:{ all -> 0x02eb }
            if (r2 == 0) goto L_0x01a7
            com.ironsource.mediationsdk.a.i r2 = com.ironsource.mediationsdk.p207a.C6558i.m19956a()     // Catch:{ all -> 0x02eb }
            com.ironsource.mediationsdk.utils.h r3 = new com.ironsource.mediationsdk.utils.h     // Catch:{ all -> 0x02eb }
            r3.<init>(r9)     // Catch:{ all -> 0x02eb }
            r2.mo36396a(r3)     // Catch:{ all -> 0x02eb }
            com.ironsource.mediationsdk.a.d r2 = com.ironsource.mediationsdk.p207a.C6553d.m19930d()     // Catch:{ all -> 0x02eb }
            com.ironsource.mediationsdk.IronSourceSegment r3 = r8.f16553s     // Catch:{ all -> 0x02eb }
            r2.mo36361a((android.content.Context) r9, (com.ironsource.mediationsdk.IronSourceSegment) r3)     // Catch:{ all -> 0x02eb }
            com.ironsource.mediationsdk.a.h r2 = com.ironsource.mediationsdk.p207a.C6557h.m19950d()     // Catch:{ all -> 0x02eb }
            com.ironsource.mediationsdk.IronSourceSegment r3 = r8.f16553s     // Catch:{ all -> 0x02eb }
            r2.mo36361a((android.content.Context) r9, (com.ironsource.mediationsdk.IronSourceSegment) r3)     // Catch:{ all -> 0x02eb }
            com.ironsource.mediationsdk.a.g r2 = com.ironsource.mediationsdk.p207a.C6556g.f16963w     // Catch:{ all -> 0x02eb }
            com.ironsource.mediationsdk.IronSourceSegment r3 = r8.f16553s     // Catch:{ all -> 0x02eb }
            r2.mo36361a((android.content.Context) r9, (com.ironsource.mediationsdk.IronSourceSegment) r3)     // Catch:{ all -> 0x02eb }
        L_0x01a7:
            java.lang.String r2 = r8.f16544j     // Catch:{ all -> 0x02eb }
            if (r2 != 0) goto L_0x01ec
            com.ironsource.mediationsdk.O r9 = com.ironsource.mediationsdk.C6504O.m19641a()     // Catch:{ all -> 0x02eb }
            com.ironsource.mediationsdk.O$a r10 = com.ironsource.mediationsdk.C6504O.C6509a.INIT_FAILED     // Catch:{ all -> 0x02eb }
            r9.mo36229a((com.ironsource.mediationsdk.C6504O.C6509a) r10)     // Catch:{ all -> 0x02eb }
            java.util.Set<com.ironsource.mediationsdk.IronSource$AD_UNIT> r9 = r8.f16517X     // Catch:{ all -> 0x02eb }
            com.ironsource.mediationsdk.IronSource$AD_UNIT r10 = com.ironsource.mediationsdk.IronSource.AD_UNIT.REWARDED_VIDEO     // Catch:{ all -> 0x02eb }
            boolean r9 = r9.contains(r10)     // Catch:{ all -> 0x02eb }
            if (r9 == 0) goto L_0x01c6
            com.ironsource.mediationsdk.ac r9 = com.ironsource.mediationsdk.C6569ac.m19976a()     // Catch:{ all -> 0x02eb }
            r10 = 0
            r9.mo36420a((boolean) r0, (com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo) r10)     // Catch:{ all -> 0x02eb }
        L_0x01c6:
            java.util.Set<com.ironsource.mediationsdk.IronSource$AD_UNIT> r9 = r8.f16517X     // Catch:{ all -> 0x02eb }
            com.ironsource.mediationsdk.IronSource$AD_UNIT r10 = com.ironsource.mediationsdk.IronSource.AD_UNIT.OFFERWALL     // Catch:{ all -> 0x02eb }
            boolean r9 = r9.contains(r10)     // Catch:{ all -> 0x02eb }
            if (r9 == 0) goto L_0x01d9
            com.ironsource.mediationsdk.sdk.l r9 = r8.f16541g     // Catch:{ all -> 0x02eb }
            com.ironsource.mediationsdk.logger.IronSourceError r10 = r12.mo35876b()     // Catch:{ all -> 0x02eb }
            r9.mo36255a((boolean) r0, (com.ironsource.mediationsdk.logger.IronSourceError) r10)     // Catch:{ all -> 0x02eb }
        L_0x01d9:
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r9 = com.ironsource.mediationsdk.logger.IronSourceLoggerManager.getLogger()     // Catch:{ all -> 0x02eb }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r10 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API     // Catch:{ all -> 0x02eb }
            com.ironsource.mediationsdk.logger.IronSourceError r11 = r12.mo35876b()     // Catch:{ all -> 0x02eb }
            java.lang.String r11 = r11.toString()     // Catch:{ all -> 0x02eb }
            r9.log(r10, r11, r1)     // Catch:{ all -> 0x02eb }
            monitor-exit(r8)
            return
        L_0x01ec:
            com.ironsource.d.b r12 = r8.f16534an     // Catch:{ all -> 0x02eb }
            r12.mo35879a((android.content.Context) r9)     // Catch:{ all -> 0x02eb }
            com.ironsource.d.b r12 = r8.f16534an     // Catch:{ all -> 0x02eb }
            java.lang.String r2 = r8.f16544j     // Catch:{ all -> 0x02eb }
            r12.mo35882a((java.lang.String) r2)     // Catch:{ all -> 0x02eb }
            com.ironsource.d.b r12 = r8.f16534an     // Catch:{ all -> 0x02eb }
            java.lang.String r2 = r8.f16550p     // Catch:{ all -> 0x02eb }
            r12.mo35888c(r2)     // Catch:{ all -> 0x02eb }
            com.ironsource.d.b r12 = r8.f16534an     // Catch:{ all -> 0x02eb }
            com.ironsource.mediationsdk.config.ConfigFile r2 = com.ironsource.mediationsdk.config.ConfigFile.getConfigFile()     // Catch:{ all -> 0x02eb }
            java.lang.String r2 = r2.getPluginType()     // Catch:{ all -> 0x02eb }
            r12.mo35889d(r2)     // Catch:{ all -> 0x02eb }
            boolean r12 = r8.f16519Z     // Catch:{ all -> 0x02eb }
            if (r12 == 0) goto L_0x0299
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ all -> 0x02eb }
            r12.<init>()     // Catch:{ all -> 0x02eb }
            org.json.JSONObject r11 = com.ironsource.mediationsdk.utils.IronSourceUtils.getMediationAdditionalData(r11)     // Catch:{ all -> 0x02eb }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0285 }
            java.lang.String r3 = ",androidx="
            r2.<init>(r3)     // Catch:{ Exception -> 0x0285 }
            boolean r3 = com.ironsource.mediationsdk.utils.IronSourceUtils.isAndroidXAvailable()     // Catch:{ Exception -> 0x0285 }
            r2.append(r3)     // Catch:{ Exception -> 0x0285 }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x0285 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0285 }
            java.lang.String r4 = ",Activity="
            r3.<init>(r4)     // Catch:{ Exception -> 0x0285 }
            boolean r4 = m19471I()     // Catch:{ Exception -> 0x0285 }
            r3.append(r4)     // Catch:{ Exception -> 0x0285 }
            java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x0285 }
            boolean r4 = com.ironsource.environment.C6399a.C64001.m19227d()     // Catch:{ Exception -> 0x0285 }
            if (r4 == 0) goto L_0x0250
            java.lang.String r4 = "appLanguage=Kotlin"
            r12.append(r4)     // Catch:{ Exception -> 0x0285 }
            java.lang.String r4 = com.ironsource.environment.C6399a.C64001.m19224c()     // Catch:{ Exception -> 0x0285 }
        L_0x024c:
            r12.append(r4)     // Catch:{ Exception -> 0x0285 }
            goto L_0x0253
        L_0x0250:
            java.lang.String r4 = "appLanguage=Java"
            goto L_0x024c
        L_0x0253:
            r12.append(r2)     // Catch:{ Exception -> 0x0285 }
            boolean r2 = r8.mo36173o()     // Catch:{ Exception -> 0x0285 }
            if (r2 == 0) goto L_0x025f
            r12.append(r3)     // Catch:{ Exception -> 0x0285 }
        L_0x025f:
            java.lang.String r2 = "ext1"
            java.lang.String r12 = r12.toString()     // Catch:{ Exception -> 0x0285 }
            r11.put(r2, r12)     // Catch:{ Exception -> 0x0285 }
            if (r13 == 0) goto L_0x027a
            int r12 = r13.length     // Catch:{ Exception -> 0x0285 }
            r2 = r0
        L_0x026c:
            if (r2 >= r12) goto L_0x027a
            r3 = r13[r2]     // Catch:{ Exception -> 0x0285 }
            java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x0285 }
            r11.put(r3, r1)     // Catch:{ Exception -> 0x0285 }
            int r2 = r2 + 1
            goto L_0x026c
        L_0x027a:
            java.lang.String r12 = "sessionDepth"
            int r13 = r8.f16554t     // Catch:{ Exception -> 0x0285 }
            int r13 = r13 + r1
            r8.f16554t = r13     // Catch:{ Exception -> 0x0285 }
            r11.put(r12, r13)     // Catch:{ Exception -> 0x0285 }
            goto L_0x0289
        L_0x0285:
            r12 = move-exception
            r12.printStackTrace()     // Catch:{ all -> 0x02eb }
        L_0x0289:
            com.ironsource.mediationsdk.a.c r12 = new com.ironsource.mediationsdk.a.c     // Catch:{ all -> 0x02eb }
            r13 = 14
            r12.<init>(r13, r11)     // Catch:{ all -> 0x02eb }
            com.ironsource.mediationsdk.a.h r11 = com.ironsource.mediationsdk.p207a.C6557h.m19950d()     // Catch:{ all -> 0x02eb }
            r11.mo36371b((com.ironsource.mediationsdk.p207a.C6552c) r12)     // Catch:{ all -> 0x02eb }
            r8.f16519Z = r0     // Catch:{ all -> 0x02eb }
        L_0x0299:
            java.util.Set<com.ironsource.mediationsdk.IronSource$AD_UNIT> r11 = r8.f16517X     // Catch:{ all -> 0x02eb }
            com.ironsource.mediationsdk.IronSource$AD_UNIT r12 = com.ironsource.mediationsdk.IronSource.AD_UNIT.INTERSTITIAL     // Catch:{ all -> 0x02eb }
            boolean r11 = r11.contains(r12)     // Catch:{ all -> 0x02eb }
            if (r11 == 0) goto L_0x02ac
            com.ironsource.mediationsdk.O r11 = com.ironsource.mediationsdk.C6504O.m19641a()     // Catch:{ all -> 0x02eb }
            com.ironsource.mediationsdk.G r12 = r8.f16537c     // Catch:{ all -> 0x02eb }
            r11.mo36230a((com.ironsource.mediationsdk.utils.C6772i) r12)     // Catch:{ all -> 0x02eb }
        L_0x02ac:
            com.ironsource.mediationsdk.O r11 = com.ironsource.mediationsdk.C6504O.m19641a()     // Catch:{ all -> 0x02eb }
            r11.mo36230a((com.ironsource.mediationsdk.utils.C6772i) r8)     // Catch:{ all -> 0x02eb }
            com.ironsource.mediationsdk.O r11 = com.ironsource.mediationsdk.C6504O.m19641a()     // Catch:{ all -> 0x02eb }
            com.ironsource.mediationsdk.impressionData.a r12 = r8.f16508O     // Catch:{ all -> 0x02eb }
            r11.mo36230a((com.ironsource.mediationsdk.utils.C6772i) r12)     // Catch:{ all -> 0x02eb }
            com.ironsource.mediationsdk.O r11 = com.ironsource.mediationsdk.C6504O.m19641a()     // Catch:{ all -> 0x02eb }
            java.lang.String r12 = r8.f16545k     // Catch:{ all -> 0x02eb }
            r11.mo36228a(r9, r10, r12)     // Catch:{ all -> 0x02eb }
            monitor-exit(r8)
            return
        L_0x02c7:
            if (r13 == 0) goto L_0x02df
            r8.m19488a((boolean) r11, (com.ironsource.mediationsdk.IronSource.AD_UNIT[]) r13)     // Catch:{ all -> 0x02eb }
            com.ironsource.mediationsdk.O r9 = com.ironsource.mediationsdk.C6504O.m19641a()     // Catch:{ all -> 0x02eb }
            com.ironsource.mediationsdk.O$a r9 = r9.mo36232b()     // Catch:{ all -> 0x02eb }
            com.ironsource.mediationsdk.O$a r10 = com.ironsource.mediationsdk.C6504O.C6509a.INITIATED     // Catch:{ all -> 0x02eb }
            if (r9 != r10) goto L_0x02e9
            if (r11 != 0) goto L_0x02e9
            r8.m19472J()     // Catch:{ all -> 0x02eb }
            monitor-exit(r8)
            return
        L_0x02df:
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r9 = r8.f16540f     // Catch:{ all -> 0x02eb }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r10 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API     // Catch:{ all -> 0x02eb }
            java.lang.String r11 = "Multiple calls to init without ad units are not allowed"
            r12 = 3
            r9.log(r10, r11, r12)     // Catch:{ all -> 0x02eb }
        L_0x02e9:
            monitor-exit(r8)
            return
        L_0x02eb:
            r9 = move-exception
            monitor-exit(r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.C6490J.mo36136a(android.content.Context, java.lang.String, boolean, com.ironsource.mediationsdk.sdk.InitializationListener, com.ironsource.mediationsdk.IronSource$AD_UNIT[]):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized void mo36137a(AbstractAdapter abstractAdapter) {
        this.f16511R = abstractAdapter;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0102, code lost:
        if (r4.f16504K != false) goto L_0x010e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0104, code lost:
        r4.f16539e.mo36747a(r5, m19510x(r6));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x010d, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x010e, code lost:
        r4.f16495B.mo36266a(r5, m19510x(r6));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0117, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo36138a(com.ironsource.mediationsdk.IronSourceBannerLayout r5, java.lang.String r6) {
        /*
            r4 = this;
            com.ironsource.mediationsdk.logger.IronLog r0 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "placementName = "
            r1.<init>(r2)
            r1.append(r6)
            java.lang.String r1 = r1.toString()
            r0.verbose(r1)
            r0 = 0
            r1 = 3
            if (r5 == 0) goto L_0x011b
            boolean r2 = r5.isDestroyed()
            if (r2 == 0) goto L_0x001f
            goto L_0x011b
        L_0x001f:
            boolean r2 = r4.f16523ac
            if (r2 != 0) goto L_0x0038
            java.lang.String r6 = "init() must be called before loadBanner()"
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r2 = r4.f16540f
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r3 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API
            r2.log(r3, r6, r1)
            com.ironsource.mediationsdk.l r1 = com.ironsource.mediationsdk.C6682l.m20363a()
            com.ironsource.mediationsdk.logger.IronSourceError r6 = com.ironsource.mediationsdk.utils.ErrorBuilder.buildLoadFailedError(r6)
            r1.mo36722a(r5, r6, r0)
            return
        L_0x0038:
            com.ironsource.mediationsdk.ISBannerSize r2 = r5.getSize()
            java.lang.String r2 = r2.getDescription()
            java.lang.String r3 = "CUSTOM"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0073
            com.ironsource.mediationsdk.ISBannerSize r2 = r5.getSize()
            int r2 = r2.getWidth()
            if (r2 <= 0) goto L_0x005c
            com.ironsource.mediationsdk.ISBannerSize r2 = r5.getSize()
            int r2 = r2.getHeight()
            if (r2 > 0) goto L_0x0073
        L_0x005c:
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r6 = r4.f16540f
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r2 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API
            java.lang.String r3 = "loadBanner: Unsupported banner size. Height and width must be bigger than 0"
            r6.log(r2, r3, r1)
            com.ironsource.mediationsdk.l r6 = com.ironsource.mediationsdk.C6682l.m20363a()
            java.lang.String r1 = ""
            com.ironsource.mediationsdk.logger.IronSourceError r1 = com.ironsource.mediationsdk.utils.ErrorBuilder.unsupportedBannerSize(r1)
            r6.mo36722a(r5, r1, r0)
            return
        L_0x0073:
            com.ironsource.mediationsdk.O r2 = com.ironsource.mediationsdk.C6504O.m19641a()
            com.ironsource.mediationsdk.O$a r2 = r2.mo36232b()
            com.ironsource.mediationsdk.O$a r3 = com.ironsource.mediationsdk.C6504O.C6509a.INIT_FAILED
            if (r2 != r3) goto L_0x0099
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r6 = r4.f16540f
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r2 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API
            java.lang.String r3 = "init() had failed"
            r6.log(r2, r3, r1)
            com.ironsource.mediationsdk.l r6 = com.ironsource.mediationsdk.C6682l.m20363a()
            com.ironsource.mediationsdk.logger.IronSourceError r1 = new com.ironsource.mediationsdk.logger.IronSourceError
            r2 = 600(0x258, float:8.41E-43)
            java.lang.String r3 = "Init() had failed"
            r1.<init>(r2, r3)
            r6.mo36722a(r5, r1, r0)
            return
        L_0x0099:
            com.ironsource.mediationsdk.O$a r3 = com.ironsource.mediationsdk.C6504O.C6509a.INIT_IN_PROGRESS
            if (r2 != r3) goto L_0x00ca
            com.ironsource.mediationsdk.O r2 = com.ironsource.mediationsdk.C6504O.m19641a()
            boolean r2 = r2.mo36234c()
            if (r2 == 0) goto L_0x00c1
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r6 = r4.f16540f
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r2 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API
            java.lang.String r3 = "init() had failed"
            r6.log(r2, r3, r1)
            com.ironsource.mediationsdk.l r6 = com.ironsource.mediationsdk.C6682l.m20363a()
            com.ironsource.mediationsdk.logger.IronSourceError r1 = new com.ironsource.mediationsdk.logger.IronSourceError
            r2 = 601(0x259, float:8.42E-43)
            java.lang.String r3 = "Init had failed"
            r1.<init>(r2, r3)
            r6.mo36722a(r5, r1, r0)
            return
        L_0x00c1:
            r4.f16525ae = r5
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            r4.f16524ad = r5
            r4.f16526af = r6
            return
        L_0x00ca:
            boolean r2 = r4.m19470H()
            if (r2 != 0) goto L_0x00ea
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r6 = r4.f16540f
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r2 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API
            java.lang.String r3 = "No banner configurations found"
            r6.log(r2, r3, r1)
            com.ironsource.mediationsdk.l r6 = com.ironsource.mediationsdk.C6682l.m20363a()
            com.ironsource.mediationsdk.logger.IronSourceError r1 = new com.ironsource.mediationsdk.logger.IronSourceError
            r2 = 615(0x267, float:8.62E-43)
            java.lang.String r3 = "the server response does not contain banner data"
            r1.<init>(r2, r3)
            r6.mo36722a(r5, r1, r0)
            return
        L_0x00ea:
            java.lang.Boolean r2 = r4.f16524ad
            monitor-enter(r2)
            com.ironsource.mediationsdk.m r0 = r4.f16539e     // Catch:{ all -> 0x0118 }
            if (r0 != 0) goto L_0x00ff
            com.ironsource.mediationsdk.R r0 = r4.f16495B     // Catch:{ all -> 0x0118 }
            if (r0 != 0) goto L_0x00ff
            r4.f16525ae = r5     // Catch:{ all -> 0x0118 }
            java.lang.Boolean r5 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x0118 }
            r4.f16524ad = r5     // Catch:{ all -> 0x0118 }
            r4.f16526af = r6     // Catch:{ all -> 0x0118 }
            monitor-exit(r2)     // Catch:{ all -> 0x0118 }
            return
        L_0x00ff:
            monitor-exit(r2)     // Catch:{ all -> 0x0118 }
            boolean r0 = r4.f16504K
            if (r0 != 0) goto L_0x010e
            com.ironsource.mediationsdk.m r0 = r4.f16539e
            com.ironsource.mediationsdk.model.f r6 = r4.m19510x(r6)
            r0.mo36747a((com.ironsource.mediationsdk.IronSourceBannerLayout) r5, (com.ironsource.mediationsdk.model.C6696f) r6)
            return
        L_0x010e:
            com.ironsource.mediationsdk.R r0 = r4.f16495B
            com.ironsource.mediationsdk.model.f r6 = r4.m19510x(r6)
            r0.mo36266a((com.ironsource.mediationsdk.IronSourceBannerLayout) r5, (com.ironsource.mediationsdk.model.C6696f) r6)
            return
        L_0x0118:
            r5 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0118 }
            throw r5
        L_0x011b:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r2 = "loadBanner can't be called - "
            r6.<init>(r2)
            if (r5 != 0) goto L_0x0127
            java.lang.String r2 = "banner layout is null "
            goto L_0x0129
        L_0x0127:
            java.lang.String r2 = "banner layout is destroyed"
        L_0x0129:
            r6.append(r2)
            java.lang.String r6 = r6.toString()
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r2 = r4.f16540f
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r3 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API
            r2.log(r3, r6, r1)
            com.ironsource.mediationsdk.l r1 = com.ironsource.mediationsdk.C6682l.m20363a()
            com.ironsource.mediationsdk.logger.IronSourceError r6 = com.ironsource.mediationsdk.utils.ErrorBuilder.buildLoadFailedError(r6)
            r1.mo36722a(r5, r6, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.C6490J.mo36138a(com.ironsource.mediationsdk.IronSourceBannerLayout, java.lang.String):void");
    }

    /* renamed from: a */
    public final synchronized void mo36139a(RewardedVideoManualListener rewardedVideoManualListener) {
        IronLog ironLog;
        String str;
        if (rewardedVideoManualListener == null) {
            IronLog.API.info("RVListener is null");
        } else {
            IronLog.API.info();
        }
        if (!this.f16557w) {
            if (rewardedVideoManualListener == null) {
                this.f16499F = false;
                ironLog = IronLog.API;
                str = "Disabling rewarded video manual mode";
            } else {
                this.f16499F = true;
                ironLog = IronLog.API;
                str = "Enabling rewarded video manual mode";
            }
            ironLog.info(str);
        }
        this.f16541g.f17597a = rewardedVideoManualListener;
        C6569ac.m19976a().f16996a = rewardedVideoManualListener;
    }

    /* renamed from: a */
    public final void mo36045a(String str) {
        try {
            IronSourceLoggerManager ironSourceLoggerManager = this.f16540f;
            IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
            ironSourceLoggerManager.log(ironSourceTag, "onInitFailed(reason:" + str + ")", 1);
            IronSourceUtils.sendAutomationLog("Mediation init failed");
            if (this.f16541g != null) {
                for (IronSource.AD_UNIT a : this.f16517X) {
                    m19480a(a, true);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public final void mo36140a(String str, List<String> list) {
        IronLog ironLog = IronLog.API;
        ironLog.verbose("key = " + str + ", values = " + list.toString());
        String checkMetaDataKeyValidity = MetaDataUtils.checkMetaDataKeyValidity(str);
        String checkMetaDataValueValidity = MetaDataUtils.checkMetaDataValueValidity(list);
        if (checkMetaDataKeyValidity.length() > 0) {
            IronLog.API.verbose(checkMetaDataKeyValidity);
        } else if (checkMetaDataValueValidity.length() > 0) {
            IronLog.API.verbose(checkMetaDataValueValidity);
        } else {
            MetaData formatMetaData = MetaDataUtils.formatMetaData(str, list);
            String metaDataKey = formatMetaData.getMetaDataKey();
            List<String> metaDataValue = formatMetaData.getMetaDataValue();
            if (!MetaDataUtils.isMediationOnlyKey(metaDataKey)) {
                C6653d.m20285a().mo36664a(metaDataKey, metaDataValue);
            } else if (C6504O.m19641a().mo36232b() != C6504O.C6509a.INITIATED || !MetaDataUtils.isMediationKeysBeforeInit(metaDataKey)) {
                C6774k.m20599a().mo36974a(metaDataKey, metaDataValue);
            } else {
                IronLog ironLog2 = IronLog.API;
                ironLog2.error("setMetaData with key = " + metaDataKey + " must to be called before init");
            }
            try {
                ConcurrentHashMap<String, List<String>> concurrentHashMap = C6653d.m20285a().f17286c;
                concurrentHashMap.putAll(C6774k.m20599a().mo36978d());
                JSONObject jSONObject = new JSONObject();
                for (Map.Entry next : concurrentHashMap.entrySet()) {
                    jSONObject.put((String) next.getKey(), next.getValue());
                }
                this.f16534an.mo35883a(jSONObject);
            } catch (JSONException e) {
                IronLog ironLog3 = IronLog.INTERNAL;
                ironLog3.error("got the following error " + e.getMessage());
                e.printStackTrace();
            }
            C6557h.m19950d().mo36371b(new C6552c(C6504O.m19641a().mo36232b() == C6504O.C6509a.INITIATED ? 51 : 50, IronSourceUtils.getJsonForMetaData(str, list, metaDataValue)));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo36141a(String str, boolean z) {
        IronLog ironLog = IronLog.API;
        ironLog.verbose("userId = " + str + ", isFromPublisher = " + z);
        this.f16545k = str;
        if (z) {
            C6557h.m19950d().mo36371b(new C6552c(52, IronSourceUtils.getJsonForUserId(false)));
        }
    }

    /* renamed from: a */
    public final void mo36047a(List<IronSource.AD_UNIT> list, boolean z, C6697g gVar) {
        IronLog.INTERNAL.verbose();
        try {
            this.f16516W = list;
            this.f16515V = true;
            this.f16540f.log(IronSourceLogger.IronSourceTag.API, "onInitSuccess()", 1);
            IronSourceUtils.sendAutomationLog("init success");
            if (z) {
                JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(false);
                try {
                    mediationAdditionalData.put("revived", true);
                } catch (JSONException e) {
                    e.printStackTrace();
                }
                C6557h.m19950d().mo36371b(new C6552c(114, mediationAdditionalData));
            }
            Activity currentActiveActivity = ContextProvider.getInstance().getCurrentActiveActivity();
            if (currentActiveActivity != null) {
                String screenSizeParams = AdapterUtils.getScreenSizeParams(currentActiveActivity);
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put(IronSourceConstants.EVENTS_EXT1, screenSizeParams);
                } catch (JSONException e2) {
                    e2.printStackTrace();
                }
                C6553d.m19930d().mo36371b(new C6552c(IronSourceConstants.TROUBLESHOOTING_SCREEN_SIZE, jSONObject));
            }
            C6553d.m19930d().mo36375c();
            C6557h.m19950d().mo36375c();
            C6653d a = C6653d.m20285a();
            String str = this.f16544j;
            String str2 = this.f16545k;
            a.f17284a = str;
            a.f17285b = str2;
            for (IronSource.AD_UNIT ad_unit : IronSource.AD_UNIT.values()) {
                if (this.f16517X.contains(ad_unit)) {
                    if (list.contains(ad_unit)) {
                        m19493b(ad_unit);
                    } else {
                        m19480a(ad_unit, false);
                    }
                }
            }
            m19472J();
        } catch (Exception e3) {
            e3.printStackTrace();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final synchronized AbstractAdapter mo36142b(String str) {
        try {
            if (this.f16511R != null && this.f16511R.getProviderName().equals(str)) {
                return this.f16511R;
            }
        } catch (Exception e) {
            IronSourceLoggerManager ironSourceLoggerManager = this.f16540f;
            IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
            ironSourceLoggerManager.log(ironSourceTag, "getOfferwallAdapter exception: " + e, 1);
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public Placement mo36143b() {
        C6706o oVar = this.f16543i.f17849c.f17496a;
        if (oVar != null) {
            return oVar.mo36830a();
        }
        return null;
    }

    /* renamed from: b */
    public final String mo36144b(Context context) {
        String str;
        C6784p pVar;
        JSONObject jSONObject;
        m19478a((int) IronSourceConstants.TROUBLESHOOTING_DO_GET_BIDDING_DATA_CALLED, (JSONObject) null);
        if (context == null) {
            IronLog.API.error("bidding data cannot be retrieved, context required");
            return null;
        }
        C6504O.C6509a b = C6504O.m19641a().mo36232b();
        if (b == C6504O.C6509a.NOT_INIT) {
            IronLog.API.error("bidding data cannot be retrieved, SDK not initialized");
            m19478a((int) IronSourceConstants.TROUBLESHOOTING_DO_GET_BIDDING_DATA_RETURNED_NULL, (JSONObject) null);
            return null;
        } else if (b == C6504O.C6509a.INIT_FAILED) {
            IronLog.API.error("bidding data cannot be retrieved, SDK failed to initialize");
            m19478a((int) IronSourceConstants.TROUBLESHOOTING_DO_GET_BIDDING_DATA_RETURNED_NULL, (JSONObject) null);
            return null;
        } else {
            try {
                C6777l a = this.f16543i != null ? this.f16543i : C6479F.m19405a(context);
                if (b == C6504O.C6509a.NOT_INIT) {
                    this.f16534an.mo35879a(context);
                    this.f16534an.mo35885b(IronSourceUtils.getSDKVersion());
                    this.f16534an.mo35888c(this.f16550p);
                    this.f16534an.mo35889d(ConfigFile.getConfigFile().getPluginType());
                    this.f16534an.mo35880a(C6389a.m19174a());
                    this.f16534an.mo35887b(IronSourceUtils.isGooglePlayInstalled(context));
                }
                if (b != C6504O.C6509a.INITIATED) {
                    C6504O.m19641a().mo36231a(a);
                    if (a != null) {
                        C6504O.m19641a().mo36227a(context, a);
                    }
                }
                if (a == null || !a.mo36981b()) {
                    pVar = new C6784p();
                } else {
                    pVar = a.f17849c.f17500e.mo56832c();
                    if (!pVar.f17891d) {
                        pVar.f17889b = a.f17825b.mo36826a(IronSourceConstants.IRONSOURCE_CONFIG_NAME);
                    }
                }
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(pVar, "tokenSettings");
                if (pVar.f17891d) {
                    C6427b bVar = new C6427b();
                    Intrinsics.checkNotNullParameter(context, "context");
                    JSONObject a2 = C6711o.m20429a(context, bVar.f16335a);
                    Intrinsics.checkNotNullExpressionValue(a2, "mGlobalDataReader.getDat…s(context, mTokenKeyList)");
                    jSONObject = C6427b.m19289a(a2);
                } else {
                    NetworkSettings networkSettings = pVar.f17889b;
                    if (networkSettings != null) {
                        C6653d a3 = C6653d.m20285a();
                        Intrinsics.checkNotNullExpressionValue(networkSettings, "it");
                        AbstractAdapter a4 = a3.mo36662a(networkSettings, networkSettings.getApplicationSettings(), true, false);
                        if (a4 != null) {
                            jSONObject = C6656f.m20309a().mo36674a(a4.getPlayerBiddingData(), pVar.f17890c, (List<String>) pVar.f17888a);
                        }
                    }
                    jSONObject = null;
                }
                C6656f.m20309a().mo36675a(jSONObject, true);
                str = pVar.f17892e ? IronSourceAES.compressAndEncrypt(jSONObject.toString()) : IronSourceAES.encrypt(jSONObject.toString());
            } catch (Throwable th) {
                m19478a((int) IronSourceConstants.TROUBLESHOOTING_DO_GET_BIDDING_DATA_ENRICH_TOKEN_ERROR, (JSONObject) null);
                IronLog.API.error("got error during token creation: " + th.getMessage());
                str = null;
            }
            if (str == null) {
                m19478a((int) IronSourceConstants.TROUBLESHOOTING_DO_GET_BIDDING_DATA_RETURNED_NULL, (JSONObject) null);
            }
            return str;
        }
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        	at java.base/java.util.Objects.checkIndex(Objects.java:372)
        	at java.base/java.util.ArrayList.get(ArrayList.java:458)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* renamed from: b */
    public final synchronized void mo36145b(android.app.Activity r6, java.lang.String r7, java.lang.String r8) {
        /*
            r5 = this;
            monitor-enter(r5)
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r0 = r5.f16540f     // Catch:{ all -> 0x0162 }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r1 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API     // Catch:{ all -> 0x0162 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0162 }
            java.lang.String r3 = "loadISDemandOnlyRewardedVideo() instanceId="
            r2.<init>(r3)     // Catch:{ all -> 0x0162 }
            r2.append(r7)     // Catch:{ all -> 0x0162 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0162 }
            r3 = 1
            r0.log(r1, r2, r3)     // Catch:{ all -> 0x0162 }
            boolean r0 = r5.f16557w     // Catch:{ all -> 0x0144 }
            r1 = 508(0x1fc, float:7.12E-43)
            r2 = 3
            if (r0 != 0) goto L_0x0035
            java.lang.String r6 = "initISDemandOnly() must be called before loadISDemandOnlyRewardedVideo()"
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r8 = r5.f16540f     // Catch:{ all -> 0x0144 }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r0 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API     // Catch:{ all -> 0x0144 }
            r8.log(r0, r6, r2)     // Catch:{ all -> 0x0144 }
            com.ironsource.mediationsdk.ab r8 = com.ironsource.mediationsdk.C6561ab.m19971a()     // Catch:{ all -> 0x0144 }
            com.ironsource.mediationsdk.logger.IronSourceError r0 = new com.ironsource.mediationsdk.logger.IronSourceError     // Catch:{ all -> 0x0144 }
            r0.<init>(r1, r6)     // Catch:{ all -> 0x0144 }
            r8.mo36407a((java.lang.String) r7, (com.ironsource.mediationsdk.logger.IronSourceError) r0)     // Catch:{ all -> 0x0144 }
            monitor-exit(r5)
            return
        L_0x0035:
            boolean r0 = r5.f16555u     // Catch:{ all -> 0x0144 }
            if (r0 != 0) goto L_0x0050
            java.lang.String r6 = "Rewarded video was initialized in mediation mode"
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r8 = r5.f16540f     // Catch:{ all -> 0x0144 }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r0 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API     // Catch:{ all -> 0x0144 }
            r8.log(r0, r6, r2)     // Catch:{ all -> 0x0144 }
            com.ironsource.mediationsdk.ab r8 = com.ironsource.mediationsdk.C6561ab.m19971a()     // Catch:{ all -> 0x0144 }
            com.ironsource.mediationsdk.logger.IronSourceError r0 = new com.ironsource.mediationsdk.logger.IronSourceError     // Catch:{ all -> 0x0144 }
            r0.<init>(r1, r6)     // Catch:{ all -> 0x0144 }
            r8.mo36407a((java.lang.String) r7, (com.ironsource.mediationsdk.logger.IronSourceError) r0)     // Catch:{ all -> 0x0144 }
            monitor-exit(r5)
            return
        L_0x0050:
            r0 = 0
            if (r6 == 0) goto L_0x005b
            com.ironsource.environment.ContextProvider r1 = com.ironsource.environment.ContextProvider.getInstance()     // Catch:{ all -> 0x0144 }
            r1.updateActivity(r6)     // Catch:{ all -> 0x0144 }
            goto L_0x008c
        L_0x005b:
            com.ironsource.environment.ContextProvider r6 = com.ironsource.environment.ContextProvider.getInstance()     // Catch:{ all -> 0x0144 }
            android.app.Activity r6 = r6.getCurrentActiveActivity()     // Catch:{ all -> 0x0144 }
            if (r6 != 0) goto L_0x008c
            if (r8 != 0) goto L_0x0068
            goto L_0x0069
        L_0x0068:
            r0 = r3
        L_0x0069:
            org.json.JSONObject r6 = com.ironsource.mediationsdk.utils.IronSourceUtils.getMediationAdditionalData(r3, r0, r3)     // Catch:{ all -> 0x0144 }
            r8 = 81321(0x13da9, float:1.13955E-40)
            m19478a((int) r8, (org.json.JSONObject) r6)     // Catch:{ all -> 0x0144 }
            java.lang.String r6 = "Rewarded video was initialized and loaded without Activity"
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r8 = r5.f16540f     // Catch:{ all -> 0x0144 }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r0 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API     // Catch:{ all -> 0x0144 }
            r8.log(r0, r6, r2)     // Catch:{ all -> 0x0144 }
            com.ironsource.mediationsdk.ab r8 = com.ironsource.mediationsdk.C6561ab.m19971a()     // Catch:{ all -> 0x0144 }
            com.ironsource.mediationsdk.logger.IronSourceError r0 = new com.ironsource.mediationsdk.logger.IronSourceError     // Catch:{ all -> 0x0144 }
            r1 = 1060(0x424, float:1.485E-42)
            r0.<init>(r1, r6)     // Catch:{ all -> 0x0144 }
            r8.mo36407a((java.lang.String) r7, (com.ironsource.mediationsdk.logger.IronSourceError) r0)     // Catch:{ all -> 0x0144 }
            monitor-exit(r5)
            return
        L_0x008c:
            com.ironsource.mediationsdk.O r6 = com.ironsource.mediationsdk.C6504O.m19641a()     // Catch:{ all -> 0x0144 }
            com.ironsource.mediationsdk.O$a r6 = r6.mo36232b()     // Catch:{ all -> 0x0144 }
            com.ironsource.mediationsdk.O$a r1 = com.ironsource.mediationsdk.C6504O.C6509a.INIT_FAILED     // Catch:{ all -> 0x0144 }
            if (r6 != r1) goto L_0x00b2
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r6 = r5.f16540f     // Catch:{ all -> 0x0144 }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r8 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API     // Catch:{ all -> 0x0144 }
            java.lang.String r0 = "init() had failed"
            r6.log(r8, r0, r2)     // Catch:{ all -> 0x0144 }
            com.ironsource.mediationsdk.ab r6 = com.ironsource.mediationsdk.C6561ab.m19971a()     // Catch:{ all -> 0x0144 }
            java.lang.String r8 = "init() had failed"
            java.lang.String r0 = "Rewarded Video"
            com.ironsource.mediationsdk.logger.IronSourceError r8 = com.ironsource.mediationsdk.utils.ErrorBuilder.buildInitFailedError(r8, r0)     // Catch:{ all -> 0x0144 }
            r6.mo36407a((java.lang.String) r7, (com.ironsource.mediationsdk.logger.IronSourceError) r8)     // Catch:{ all -> 0x0144 }
            monitor-exit(r5)
            return
        L_0x00b2:
            com.ironsource.mediationsdk.O$a r1 = com.ironsource.mediationsdk.C6504O.C6509a.INIT_IN_PROGRESS     // Catch:{ all -> 0x0144 }
            r4 = 83002(0x1443a, float:1.1631E-40)
            if (r6 != r1) goto L_0x00f6
            com.ironsource.mediationsdk.O r6 = com.ironsource.mediationsdk.C6504O.m19641a()     // Catch:{ all -> 0x0144 }
            boolean r6 = r6.mo36234c()     // Catch:{ all -> 0x0144 }
            if (r6 == 0) goto L_0x00dd
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r6 = r5.f16540f     // Catch:{ all -> 0x0144 }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r8 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API     // Catch:{ all -> 0x0144 }
            java.lang.String r0 = "init() had failed"
            r6.log(r8, r0, r2)     // Catch:{ all -> 0x0144 }
            com.ironsource.mediationsdk.ab r6 = com.ironsource.mediationsdk.C6561ab.m19971a()     // Catch:{ all -> 0x0144 }
            java.lang.String r8 = "init() had failed"
            java.lang.String r0 = "Rewarded Video"
            com.ironsource.mediationsdk.logger.IronSourceError r8 = com.ironsource.mediationsdk.utils.ErrorBuilder.buildInitFailedError(r8, r0)     // Catch:{ all -> 0x0144 }
            r6.mo36407a((java.lang.String) r7, (com.ironsource.mediationsdk.logger.IronSourceError) r8)     // Catch:{ all -> 0x0144 }
            monitor-exit(r5)
            return
        L_0x00dd:
            java.util.concurrent.CopyOnWriteArraySet<java.lang.String> r6 = r5.f16531ak     // Catch:{ all -> 0x0144 }
            monitor-enter(r6)     // Catch:{ all -> 0x0144 }
            java.util.concurrent.CopyOnWriteArraySet<java.lang.String> r0 = r5.f16531ak     // Catch:{ all -> 0x00f3 }
            r0.add(r7)     // Catch:{ all -> 0x00f3 }
            monitor-exit(r6)     // Catch:{ all -> 0x00f3 }
            if (r8 == 0) goto L_0x00f1
            int r6 = r5.f16505L     // Catch:{ all -> 0x0144 }
            org.json.JSONObject r6 = com.ironsource.mediationsdk.utils.IronSourceUtils.getMediationAdditionalData(r3, r3, r6)     // Catch:{ all -> 0x0144 }
            m19478a((int) r4, (org.json.JSONObject) r6)     // Catch:{ all -> 0x0144 }
        L_0x00f1:
            monitor-exit(r5)
            return
        L_0x00f3:
            r8 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x00f3 }
            throw r8     // Catch:{ all -> 0x0144 }
        L_0x00f6:
            boolean r6 = r5.mo36154e()     // Catch:{ all -> 0x0144 }
            if (r6 != 0) goto L_0x0116
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r6 = r5.f16540f     // Catch:{ all -> 0x0144 }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r8 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API     // Catch:{ all -> 0x0144 }
            java.lang.String r0 = "No rewarded video configurations found"
            r6.log(r8, r0, r2)     // Catch:{ all -> 0x0144 }
            com.ironsource.mediationsdk.ab r6 = com.ironsource.mediationsdk.C6561ab.m19971a()     // Catch:{ all -> 0x0144 }
            java.lang.String r8 = "the server response does not contain rewarded video data"
            java.lang.String r0 = "Rewarded Video"
            com.ironsource.mediationsdk.logger.IronSourceError r8 = com.ironsource.mediationsdk.utils.ErrorBuilder.buildInitFailedError(r8, r0)     // Catch:{ all -> 0x0144 }
            r6.mo36407a((java.lang.String) r7, (com.ironsource.mediationsdk.logger.IronSourceError) r8)     // Catch:{ all -> 0x0144 }
            monitor-exit(r5)
            return
        L_0x0116:
            java.util.concurrent.CopyOnWriteArraySet<java.lang.String> r6 = r5.f16531ak     // Catch:{ all -> 0x0144 }
            monitor-enter(r6)     // Catch:{ all -> 0x0144 }
            com.ironsource.mediationsdk.w r1 = r5.f16533am     // Catch:{ all -> 0x0141 }
            if (r1 != 0) goto L_0x0130
            java.util.concurrent.CopyOnWriteArraySet<java.lang.String> r0 = r5.f16531ak     // Catch:{ all -> 0x0141 }
            r0.add(r7)     // Catch:{ all -> 0x0141 }
            if (r8 == 0) goto L_0x012d
            int r8 = r5.f16505L     // Catch:{ all -> 0x0141 }
            org.json.JSONObject r8 = com.ironsource.mediationsdk.utils.IronSourceUtils.getMediationAdditionalData(r3, r3, r8)     // Catch:{ all -> 0x0141 }
            m19478a((int) r4, (org.json.JSONObject) r8)     // Catch:{ all -> 0x0141 }
        L_0x012d:
            monitor-exit(r6)     // Catch:{ all -> 0x0141 }
            monitor-exit(r5)
            return
        L_0x0130:
            monitor-exit(r6)     // Catch:{ all -> 0x0141 }
            if (r8 != 0) goto L_0x013a
            com.ironsource.mediationsdk.w r6 = r5.f16533am     // Catch:{ all -> 0x0144 }
            r8 = 0
            r6.mo36997a((java.lang.String) r7, (java.lang.String) r8, (boolean) r0)     // Catch:{ all -> 0x0144 }
            goto L_0x0160
        L_0x013a:
            com.ironsource.mediationsdk.w r6 = r5.f16533am     // Catch:{ all -> 0x0144 }
            r6.mo36997a((java.lang.String) r7, (java.lang.String) r8, (boolean) r3)     // Catch:{ all -> 0x0144 }
            monitor-exit(r5)
            return
        L_0x0141:
            r8 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x0141 }
            throw r8     // Catch:{ all -> 0x0144 }
        L_0x0144:
            r6 = move-exception
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r8 = r5.f16540f     // Catch:{ all -> 0x0162 }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r0 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API     // Catch:{ all -> 0x0162 }
            java.lang.String r1 = "loadISDemandOnlyRewardedVideo"
            r8.logException(r0, r1, r6)     // Catch:{ all -> 0x0162 }
            com.ironsource.mediationsdk.ab r8 = com.ironsource.mediationsdk.C6561ab.m19971a()     // Catch:{ all -> 0x0162 }
            com.ironsource.mediationsdk.logger.IronSourceError r0 = new com.ironsource.mediationsdk.logger.IronSourceError     // Catch:{ all -> 0x0162 }
            r1 = 510(0x1fe, float:7.15E-43)
            java.lang.String r6 = r6.getMessage()     // Catch:{ all -> 0x0162 }
            r0.<init>(r1, r6)     // Catch:{ all -> 0x0162 }
            r8.mo36407a((java.lang.String) r7, (com.ironsource.mediationsdk.logger.IronSourceError) r0)     // Catch:{ all -> 0x0162 }
        L_0x0160:
            monitor-exit(r5)
            return
        L_0x0162:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.C6490J.mo36145b(android.app.Activity, java.lang.String, java.lang.String):void");
    }

    /* renamed from: b */
    public final void mo36146b(boolean z) {
        this.f16559y = Boolean.valueOf(z);
        IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
        logger.log(ironSourceTag, "setConsent : " + z, 1);
        C6653d.m20285a().mo36666a(z);
        if (this.f16511R != null) {
            IronSourceLoggerManager ironSourceLoggerManager = this.f16540f;
            IronSourceLogger.IronSourceTag ironSourceTag2 = IronSourceLogger.IronSourceTag.ADAPTER_API;
            ironSourceLoggerManager.log(ironSourceTag2, "Offerwall | setConsent(consent:" + z + ")", 1);
            this.f16511R.setConsent(z);
        }
        int i = 40;
        if (!z) {
            i = 41;
        }
        this.f16534an.mo35884a(z);
        C6557h.m19950d().mo36371b(new C6552c(i, IronSourceUtils.getMediationAdditionalData(false)));
    }

    /* renamed from: c */
    public final synchronized void mo36147c(Activity activity, String str, String str2) {
        if (str2 == null) {
            this.f16540f.log(IronSourceLogger.IronSourceTag.API, "adm cannot be null", 3);
            C6456C.m19387a().mo36004a(str, new IronSourceError(IronSourceError.ERROR_CODE_GENERIC, "adm cannot be null"));
            return;
        }
        mo36150d(activity, str, str2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002a, code lost:
        if (r9.f16560z.mo36003c() != false) goto L_0x002c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002c, code lost:
        r3 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0041, code lost:
        if (r9.f16497D.mo36572b() != false) goto L_0x002c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x004c A[Catch:{ all -> 0x008a }] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0066 A[Catch:{ all -> 0x008a }] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0069 A[Catch:{ all -> 0x008a }] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo36148c() {
        /*
            r9 = this;
            java.lang.String r0 = "isRewardedVideoAvailable():"
            r1 = 1
            r2 = 0
            boolean r3 = r9.f16555u     // Catch:{ all -> 0x008f }
            if (r3 == 0) goto L_0x0013
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r3 = r9.f16540f     // Catch:{ all -> 0x008f }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r4 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API     // Catch:{ all -> 0x008f }
            java.lang.String r5 = "Rewarded Video was initialized in demand only mode. Use isISDemandOnlyRewardedVideoAvailable instead"
            r6 = 3
            r3.log(r4, r5, r6)     // Catch:{ all -> 0x008f }
            return r2
        L_0x0013:
            boolean r3 = r9.f16499F     // Catch:{ all -> 0x008f }
            if (r3 != 0) goto L_0x0037
            boolean r3 = r9.f16529ai     // Catch:{ all -> 0x008f }
            if (r3 == 0) goto L_0x001c
            goto L_0x0037
        L_0x001c:
            boolean r3 = r9.f16498E     // Catch:{ all -> 0x008f }
            if (r3 == 0) goto L_0x0030
            com.ironsource.mediationsdk.B r3 = r9.f16560z     // Catch:{ all -> 0x008f }
            if (r3 == 0) goto L_0x002e
            com.ironsource.mediationsdk.B r3 = r9.f16560z     // Catch:{ all -> 0x008f }
            boolean r3 = r3.mo36003c()     // Catch:{ all -> 0x008f }
            if (r3 == 0) goto L_0x002e
        L_0x002c:
            r3 = r1
            goto L_0x0044
        L_0x002e:
            r3 = r2
            goto L_0x0044
        L_0x0030:
            com.ironsource.mediationsdk.ad r3 = r9.f16536b     // Catch:{ all -> 0x008f }
            boolean r3 = r3.mo36451c()     // Catch:{ all -> 0x008f }
            goto L_0x0044
        L_0x0037:
            com.ironsource.mediationsdk.adunit.c.h r3 = r9.f16497D     // Catch:{ all -> 0x008f }
            if (r3 == 0) goto L_0x002e
            com.ironsource.mediationsdk.adunit.c.h r3 = r9.f16497D     // Catch:{ all -> 0x008f }
            boolean r3 = r3.mo36572b()     // Catch:{ all -> 0x008f }
            if (r3 == 0) goto L_0x002e
            goto L_0x002c
        L_0x0044:
            org.json.JSONObject r4 = com.ironsource.mediationsdk.utils.IronSourceUtils.getMediationAdditionalData(r2)     // Catch:{ all -> 0x008a }
            boolean r5 = r9.f16498E     // Catch:{ all -> 0x008a }
            if (r5 == 0) goto L_0x0062
            java.lang.Object[][] r5 = new java.lang.Object[r1][]     // Catch:{ all -> 0x008a }
            r6 = 2
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch:{ all -> 0x008a }
            java.lang.String r7 = "programmatic"
            r6[r2] = r7     // Catch:{ all -> 0x008a }
            int r7 = r9.f16505L     // Catch:{ all -> 0x008a }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ all -> 0x008a }
            r6[r1] = r7     // Catch:{ all -> 0x008a }
            r5[r2] = r6     // Catch:{ all -> 0x008a }
            m19486a((org.json.JSONObject) r4, (java.lang.Object[][]) r5)     // Catch:{ all -> 0x008a }
        L_0x0062:
            com.ironsource.mediationsdk.a.c r5 = new com.ironsource.mediationsdk.a.c     // Catch:{ all -> 0x008a }
            if (r3 == 0) goto L_0x0069
            r6 = 1101(0x44d, float:1.543E-42)
            goto L_0x006b
        L_0x0069:
            r6 = 1102(0x44e, float:1.544E-42)
        L_0x006b:
            r5.<init>(r6, r4)     // Catch:{ all -> 0x008a }
            com.ironsource.mediationsdk.a.h r4 = com.ironsource.mediationsdk.p207a.C6557h.m19950d()     // Catch:{ all -> 0x008a }
            r4.mo36371b((com.ironsource.mediationsdk.p207a.C6552c) r5)     // Catch:{ all -> 0x008a }
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r4 = r9.f16540f     // Catch:{ all -> 0x008a }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r5 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API     // Catch:{ all -> 0x008a }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x008a }
            r6.<init>(r0)     // Catch:{ all -> 0x008a }
            r6.append(r3)     // Catch:{ all -> 0x008a }
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x008a }
            r4.log(r5, r6, r1)     // Catch:{ all -> 0x008a }
            r2 = r3
            goto L_0x00ad
        L_0x008a:
            r4 = move-exception
            r8 = r4
            r4 = r3
            r3 = r8
            goto L_0x0091
        L_0x008f:
            r3 = move-exception
            r4 = r2
        L_0x0091:
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r5 = r9.f16540f
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r6 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>(r0)
            r7.append(r4)
            java.lang.String r0 = r7.toString()
            r5.log(r6, r0, r1)
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r0 = r9.f16540f
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r1 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API
            java.lang.String r4 = "isRewardedVideoAvailable()"
            r0.logException(r1, r4, r3)
        L_0x00ad:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.C6490J.mo36148c():boolean");
    }

    /* renamed from: c */
    public final boolean mo36149c(String str) {
        try {
            this.f16540f.log(IronSourceLogger.IronSourceTag.API, this.f16520a + ":setDynamicUserId(dynamicUserId:" + str + ")", 1);
            C6392a aVar = new C6392a();
            if (!m19490a(str, 1, 128)) {
                aVar.mo35874a(ErrorBuilder.buildInvalidKeyValueError(IronSourceConstants.EVENTS_DYNAMIC_USER_ID, IronSourceConstants.SUPERSONIC_CONFIG_NAME, "dynamicUserId is invalid, should be between 1-128 chars in length."));
            }
            if (aVar.mo35875a()) {
                this.f16547m = str;
                C6557h.m19950d().mo36371b(new C6552c(52, IronSourceUtils.getJsonForUserId(true)));
                return true;
            }
            IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.API, aVar.mo35876b().toString(), 2);
            return false;
        } catch (Exception e) {
            IronSourceLoggerManager ironSourceLoggerManager = this.f16540f;
            IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
            ironSourceLoggerManager.logException(ironSourceTag, this.f16520a + ":setDynamicUserId(dynamicUserId:" + str + ")", e);
            return false;
        }
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        	at java.base/java.util.Objects.checkIndex(Objects.java:372)
        	at java.base/java.util.ArrayList.get(ArrayList.java:458)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* renamed from: d */
    public final synchronized void mo36150d(android.app.Activity r7, java.lang.String r8, java.lang.String r9) {
        /*
            r6 = this;
            monitor-enter(r6)
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r0 = r6.f16540f     // Catch:{ all -> 0x015c }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r1 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API     // Catch:{ all -> 0x015c }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x015c }
            java.lang.String r3 = "loadISDemandOnlyInterstitial() instanceId="
            r2.<init>(r3)     // Catch:{ all -> 0x015c }
            r2.append(r8)     // Catch:{ all -> 0x015c }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x015c }
            r3 = 1
            r0.log(r1, r2, r3)     // Catch:{ all -> 0x015c }
            r0 = 510(0x1fe, float:7.15E-43)
            boolean r1 = r6.f16558x     // Catch:{ all -> 0x0140 }
            r2 = 3
            if (r1 != 0) goto L_0x0035
            java.lang.String r7 = "initISDemandOnly() must be called before loadISDemandOnlyInterstitial()"
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r9 = r6.f16540f     // Catch:{ all -> 0x0140 }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r1 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API     // Catch:{ all -> 0x0140 }
            r9.log(r1, r7, r2)     // Catch:{ all -> 0x0140 }
            com.ironsource.mediationsdk.C r9 = com.ironsource.mediationsdk.C6456C.m19387a()     // Catch:{ all -> 0x0140 }
            com.ironsource.mediationsdk.logger.IronSourceError r1 = new com.ironsource.mediationsdk.logger.IronSourceError     // Catch:{ all -> 0x0140 }
            r1.<init>(r0, r7)     // Catch:{ all -> 0x0140 }
            r9.mo36004a((java.lang.String) r8, (com.ironsource.mediationsdk.logger.IronSourceError) r1)     // Catch:{ all -> 0x0140 }
            monitor-exit(r6)
            return
        L_0x0035:
            boolean r1 = r6.f16556v     // Catch:{ all -> 0x0140 }
            if (r1 != 0) goto L_0x0050
            java.lang.String r7 = "Interstitial was initialized in mediation mode. Use loadInterstitial instead"
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r9 = r6.f16540f     // Catch:{ all -> 0x0140 }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r1 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API     // Catch:{ all -> 0x0140 }
            r9.log(r1, r7, r2)     // Catch:{ all -> 0x0140 }
            com.ironsource.mediationsdk.C r9 = com.ironsource.mediationsdk.C6456C.m19387a()     // Catch:{ all -> 0x0140 }
            com.ironsource.mediationsdk.logger.IronSourceError r1 = new com.ironsource.mediationsdk.logger.IronSourceError     // Catch:{ all -> 0x0140 }
            r1.<init>(r0, r7)     // Catch:{ all -> 0x0140 }
            r9.mo36004a((java.lang.String) r8, (com.ironsource.mediationsdk.logger.IronSourceError) r1)     // Catch:{ all -> 0x0140 }
            monitor-exit(r6)
            return
        L_0x0050:
            r1 = 0
            if (r7 == 0) goto L_0x005b
            com.ironsource.environment.ContextProvider r4 = com.ironsource.environment.ContextProvider.getInstance()     // Catch:{ all -> 0x0140 }
            r4.updateActivity(r7)     // Catch:{ all -> 0x0140 }
            goto L_0x008c
        L_0x005b:
            com.ironsource.environment.ContextProvider r7 = com.ironsource.environment.ContextProvider.getInstance()     // Catch:{ all -> 0x0140 }
            android.app.Activity r7 = r7.getCurrentActiveActivity()     // Catch:{ all -> 0x0140 }
            if (r7 != 0) goto L_0x008c
            if (r9 != 0) goto L_0x0068
            goto L_0x0069
        L_0x0068:
            r1 = r3
        L_0x0069:
            org.json.JSONObject r7 = com.ironsource.mediationsdk.utils.IronSourceUtils.getMediationAdditionalData(r3, r1, r3)     // Catch:{ all -> 0x0140 }
            r9 = 82321(0x14191, float:1.15356E-40)
            m19492b(r9, r7)     // Catch:{ all -> 0x0140 }
            java.lang.String r7 = "Interstitial was initialized and loaded without Activity"
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r9 = r6.f16540f     // Catch:{ all -> 0x0140 }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r1 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API     // Catch:{ all -> 0x0140 }
            r9.log(r1, r7, r2)     // Catch:{ all -> 0x0140 }
            com.ironsource.mediationsdk.C r9 = com.ironsource.mediationsdk.C6456C.m19387a()     // Catch:{ all -> 0x0140 }
            com.ironsource.mediationsdk.logger.IronSourceError r1 = new com.ironsource.mediationsdk.logger.IronSourceError     // Catch:{ all -> 0x0140 }
            r2 = 1061(0x425, float:1.487E-42)
            r1.<init>(r2, r7)     // Catch:{ all -> 0x0140 }
            r9.mo36004a((java.lang.String) r8, (com.ironsource.mediationsdk.logger.IronSourceError) r1)     // Catch:{ all -> 0x0140 }
            monitor-exit(r6)
            return
        L_0x008c:
            com.ironsource.mediationsdk.O r7 = com.ironsource.mediationsdk.C6504O.m19641a()     // Catch:{ all -> 0x0140 }
            com.ironsource.mediationsdk.O$a r7 = r7.mo36232b()     // Catch:{ all -> 0x0140 }
            com.ironsource.mediationsdk.O$a r4 = com.ironsource.mediationsdk.C6504O.C6509a.INIT_FAILED     // Catch:{ all -> 0x0140 }
            if (r7 != r4) goto L_0x00b2
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r7 = r6.f16540f     // Catch:{ all -> 0x0140 }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r9 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API     // Catch:{ all -> 0x0140 }
            java.lang.String r1 = "init() had failed"
            r7.log(r9, r1, r2)     // Catch:{ all -> 0x0140 }
            com.ironsource.mediationsdk.C r7 = com.ironsource.mediationsdk.C6456C.m19387a()     // Catch:{ all -> 0x0140 }
            java.lang.String r9 = "init() had failed"
            java.lang.String r1 = "Interstitial"
            com.ironsource.mediationsdk.logger.IronSourceError r9 = com.ironsource.mediationsdk.utils.ErrorBuilder.buildInitFailedError(r9, r1)     // Catch:{ all -> 0x0140 }
            r7.mo36004a((java.lang.String) r8, (com.ironsource.mediationsdk.logger.IronSourceError) r9)     // Catch:{ all -> 0x0140 }
            monitor-exit(r6)
            return
        L_0x00b2:
            com.ironsource.mediationsdk.O$a r4 = com.ironsource.mediationsdk.C6504O.C6509a.INIT_IN_PROGRESS     // Catch:{ all -> 0x0140 }
            r5 = 83003(0x1443b, float:1.16312E-40)
            if (r7 != r4) goto L_0x00f4
            com.ironsource.mediationsdk.O r7 = com.ironsource.mediationsdk.C6504O.m19641a()     // Catch:{ all -> 0x0140 }
            boolean r7 = r7.mo36234c()     // Catch:{ all -> 0x0140 }
            if (r7 == 0) goto L_0x00dd
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r7 = r6.f16540f     // Catch:{ all -> 0x0140 }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r9 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API     // Catch:{ all -> 0x0140 }
            java.lang.String r1 = "init() had failed"
            r7.log(r9, r1, r2)     // Catch:{ all -> 0x0140 }
            com.ironsource.mediationsdk.C r7 = com.ironsource.mediationsdk.C6456C.m19387a()     // Catch:{ all -> 0x0140 }
            java.lang.String r9 = "init() had failed"
            java.lang.String r1 = "Interstitial"
            com.ironsource.mediationsdk.logger.IronSourceError r9 = com.ironsource.mediationsdk.utils.ErrorBuilder.buildInitFailedError(r9, r1)     // Catch:{ all -> 0x0140 }
            r7.mo36004a((java.lang.String) r8, (com.ironsource.mediationsdk.logger.IronSourceError) r9)     // Catch:{ all -> 0x0140 }
            monitor-exit(r6)
            return
        L_0x00dd:
            java.util.concurrent.CopyOnWriteArraySet<java.lang.String> r7 = r6.f16530aj     // Catch:{ all -> 0x0140 }
            monitor-enter(r7)     // Catch:{ all -> 0x0140 }
            java.util.concurrent.CopyOnWriteArraySet<java.lang.String> r1 = r6.f16530aj     // Catch:{ all -> 0x00f1 }
            r1.add(r8)     // Catch:{ all -> 0x00f1 }
            monitor-exit(r7)     // Catch:{ all -> 0x00f1 }
            if (r9 == 0) goto L_0x00ef
            org.json.JSONObject r7 = com.ironsource.mediationsdk.utils.IronSourceUtils.getMediationAdditionalData(r3, r3, r3)     // Catch:{ all -> 0x0140 }
            m19492b(r5, r7)     // Catch:{ all -> 0x0140 }
        L_0x00ef:
            monitor-exit(r6)
            return
        L_0x00f1:
            r9 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x00f1 }
            throw r9     // Catch:{ all -> 0x0140 }
        L_0x00f4:
            boolean r7 = r6.mo36163j()     // Catch:{ all -> 0x0140 }
            if (r7 != 0) goto L_0x0114
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r7 = r6.f16540f     // Catch:{ all -> 0x0140 }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r9 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API     // Catch:{ all -> 0x0140 }
            java.lang.String r1 = "No interstitial configurations found"
            r7.log(r9, r1, r2)     // Catch:{ all -> 0x0140 }
            com.ironsource.mediationsdk.C r7 = com.ironsource.mediationsdk.C6456C.m19387a()     // Catch:{ all -> 0x0140 }
            java.lang.String r9 = "the server response does not contain interstitial data"
            java.lang.String r1 = "Interstitial"
            com.ironsource.mediationsdk.logger.IronSourceError r9 = com.ironsource.mediationsdk.utils.ErrorBuilder.buildInitFailedError(r9, r1)     // Catch:{ all -> 0x0140 }
            r7.mo36004a((java.lang.String) r8, (com.ironsource.mediationsdk.logger.IronSourceError) r9)     // Catch:{ all -> 0x0140 }
            monitor-exit(r6)
            return
        L_0x0114:
            java.util.concurrent.CopyOnWriteArraySet<java.lang.String> r7 = r6.f16530aj     // Catch:{ all -> 0x0140 }
            monitor-enter(r7)     // Catch:{ all -> 0x0140 }
            com.ironsource.mediationsdk.u r2 = r6.f16506M     // Catch:{ all -> 0x013d }
            if (r2 != 0) goto L_0x012c
            java.util.concurrent.CopyOnWriteArraySet<java.lang.String> r1 = r6.f16530aj     // Catch:{ all -> 0x013d }
            r1.add(r8)     // Catch:{ all -> 0x013d }
            if (r9 == 0) goto L_0x0129
            org.json.JSONObject r9 = com.ironsource.mediationsdk.utils.IronSourceUtils.getMediationAdditionalData(r3, r3, r3)     // Catch:{ all -> 0x013d }
            m19492b(r5, r9)     // Catch:{ all -> 0x013d }
        L_0x0129:
            monitor-exit(r7)     // Catch:{ all -> 0x013d }
            monitor-exit(r6)
            return
        L_0x012c:
            monitor-exit(r7)     // Catch:{ all -> 0x013d }
            if (r9 != 0) goto L_0x0136
            com.ironsource.mediationsdk.u r7 = r6.f16506M     // Catch:{ all -> 0x0140 }
            r9 = 0
            r7.mo36953a((java.lang.String) r8, (java.lang.String) r9, (boolean) r1)     // Catch:{ all -> 0x0140 }
            goto L_0x015a
        L_0x0136:
            com.ironsource.mediationsdk.u r7 = r6.f16506M     // Catch:{ all -> 0x0140 }
            r7.mo36953a((java.lang.String) r8, (java.lang.String) r9, (boolean) r3)     // Catch:{ all -> 0x0140 }
            monitor-exit(r6)
            return
        L_0x013d:
            r9 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x013d }
            throw r9     // Catch:{ all -> 0x0140 }
        L_0x0140:
            r7 = move-exception
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r9 = r6.f16540f     // Catch:{ all -> 0x015c }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r1 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API     // Catch:{ all -> 0x015c }
            java.lang.String r2 = "loadDemandOnlyInterstitial"
            r9.logException(r1, r2, r7)     // Catch:{ all -> 0x015c }
            com.ironsource.mediationsdk.C r9 = com.ironsource.mediationsdk.C6456C.m19387a()     // Catch:{ all -> 0x015c }
            com.ironsource.mediationsdk.logger.IronSourceError r1 = new com.ironsource.mediationsdk.logger.IronSourceError     // Catch:{ all -> 0x015c }
            java.lang.String r7 = r7.getMessage()     // Catch:{ all -> 0x015c }
            r1.<init>(r0, r7)     // Catch:{ all -> 0x015c }
            r9.mo36004a((java.lang.String) r8, (com.ironsource.mediationsdk.logger.IronSourceError) r1)     // Catch:{ all -> 0x015c }
        L_0x015a:
            monitor-exit(r6)
            return
        L_0x015c:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.C6490J.mo36150d(android.app.Activity, java.lang.String, java.lang.String):void");
    }

    /* renamed from: d */
    public final void mo36151d(String str) {
        try {
            this.f16540f.log(IronSourceLogger.IronSourceTag.INTERNAL, this.f16520a + ":setMediationType(mediationType:" + str + ")", 1);
            if (!m19490a(str, 1, 64) || !m19507v(str)) {
                this.f16540f.log(IronSourceLogger.IronSourceTag.INTERNAL, " mediationType value is invalid - should be alphanumeric and 1-64 chars in length", 1);
            } else {
                this.f16549o = str;
            }
        } catch (Exception e) {
            IronSourceLoggerManager ironSourceLoggerManager = this.f16540f;
            IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
            ironSourceLoggerManager.logException(ironSourceTag, this.f16520a + ":setMediationType(mediationType:" + str + ")", e);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public boolean mo36152d() {
        C6777l lVar = this.f16543i;
        return (lVar == null || lVar.f17849c == null || this.f16543i.f17849c.f17496a == null) ? false : true;
    }

    /* renamed from: e */
    public final void mo36153e(String str) {
        String str2 = "showRewardedVideo(" + str + ")";
        this.f16540f.log(IronSourceLogger.IronSourceTag.API, str2, 1);
        try {
            if (this.f16555u) {
                this.f16540f.log(IronSourceLogger.IronSourceTag.API, "Rewarded Video was initialized in demand only mode. Use showISDemandOnlyRewardedVideo instead", 3);
                C6569ac.m19976a().mo36418a(ErrorBuilder.buildInitFailedError("Rewarded Video was initialized in demand only mode. Use showISDemandOnlyRewardedVideo instead", IronSourceConstants.REWARDED_VIDEO_AD_UNIT), (AdInfo) null);
            } else if (!mo36152d()) {
                C6569ac.m19976a().mo36418a(ErrorBuilder.buildInitFailedError("showRewardedVideo can't be called before the Rewarded Video ad unit initialization completed successfully", IronSourceConstants.REWARDED_VIDEO_AD_UNIT), (AdInfo) null);
            } else if (this.f16498E) {
                m19497q(str);
            } else {
                Placement r = m19498r(str);
                if (r != null) {
                    this.f16536b.mo36445a(r);
                    this.f16536b.mo36446a(r.getPlacementName());
                }
            }
        } catch (Exception e) {
            this.f16540f.logException(IronSourceLogger.IronSourceTag.API, str2, e);
            C6569ac.m19976a().mo36418a(new IronSourceError(IronSourceError.ERROR_CODE_GENERIC, e.getMessage()), (AdInfo) null);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public boolean mo36154e() {
        return mo36152d() && m19467E();
    }

    /* renamed from: f */
    public final void mo36056f() {
        synchronized (this.f16524ad) {
            if (this.f16524ad.booleanValue()) {
                this.f16524ad = Boolean.FALSE;
                C6682l.m20363a().mo36722a(this.f16525ae, new IronSourceError(603, "init had failed"), false);
                this.f16525ae = null;
                this.f16526af = null;
            }
        }
        if (this.f16503J) {
            this.f16503J = false;
            C6716r.m20447a().mo36851a(IronSource.AD_UNIT.INTERSTITIAL, ErrorBuilder.buildInitFailedError("init() had failed", IronSourceConstants.INTERSTITIAL_AD_UNIT));
        }
        if (this.f16500G) {
            this.f16500G = false;
            C6716r.m20447a().mo36851a(IronSource.AD_UNIT.REWARDED_VIDEO, ErrorBuilder.buildInitFailedError("init() had failed", IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
        }
        synchronized (this.f16530aj) {
            Iterator<String> it = this.f16530aj.iterator();
            while (it.hasNext()) {
                C6456C.m19387a().mo36004a(it.next(), ErrorBuilder.buildInitFailedError("init() had failed", IronSourceConstants.INTERSTITIAL_AD_UNIT));
            }
            this.f16530aj.clear();
        }
        synchronized (this.f16531ak) {
            Iterator<String> it2 = this.f16531ak.iterator();
            while (it2.hasNext()) {
                C6561ab.m19971a().mo36407a(it2.next(), ErrorBuilder.buildInitFailedError("init() had failed", IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
            }
            this.f16531ak.clear();
        }
    }

    /* renamed from: f */
    public final synchronized void mo36155f(String str) {
        IronSourceLoggerManager ironSourceLoggerManager = this.f16540f;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
        ironSourceLoggerManager.log(ironSourceTag, "showISDemandOnlyRewardedVideo() instanceId=" + str, 1);
        try {
            if (!this.f16555u) {
                this.f16540f.log(IronSourceLogger.IronSourceTag.API, "Rewarded video was initialized in mediation mode. Use showRewardedVideo instead", 3);
                C6561ab.m19971a().mo36408b(str, new IronSourceError(IronSourceError.ERROR_CODE_INIT_FAILED, "Rewarded video was initialized in mediation mode. Use showRewardedVideo instead"));
                return;
            } else if (this.f16533am == null) {
                this.f16540f.log(IronSourceLogger.IronSourceTag.API, "Rewarded video was not initiated", 3);
                C6561ab.m19971a().mo36408b(str, new IronSourceError(IronSourceError.ERROR_CODE_INIT_FAILED, "Rewarded video was not initiated"));
                return;
            } else {
                C6787w wVar = this.f16533am;
                if (!wVar.f17896a.containsKey(str)) {
                    C6787w.m20665a(1500, str);
                    C6561ab.m19971a().mo36408b(str, ErrorBuilder.buildNonExistentInstanceError(IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
                } else {
                    C6788x xVar = wVar.f17896a.get(str);
                    wVar.mo36996a((int) IronSourceConstants.RV_INSTANCE_SHOW, xVar);
                    xVar.mo36998a();
                    return;
                }
            }
        } catch (Exception e) {
            this.f16540f.logException(IronSourceLogger.IronSourceTag.API, "showISDemandOnlyRewardedVideo", e);
            C6561ab.m19971a().mo36408b(str, new IronSourceError(IronSourceError.ERROR_CODE_GENERIC, e.getMessage()));
        }
        return;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public InterstitialPlacement mo36156g() {
        C6698h hVar = this.f16543i.f17849c.f17497b;
        if (hVar != null) {
            return hVar.mo36817a();
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0039, code lost:
        return false;
     */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0036 A[DONT_GENERATE] */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean mo36157g(java.lang.String r5) {
        /*
            r4 = this;
            monitor-enter(r4)
            com.ironsource.mediationsdk.w r0 = r4.f16533am     // Catch:{ all -> 0x003a }
            r1 = 0
            if (r0 == 0) goto L_0x0038
            com.ironsource.mediationsdk.w r0 = r4.f16533am     // Catch:{ all -> 0x003a }
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.ironsource.mediationsdk.x> r2 = r0.f17896a     // Catch:{ all -> 0x003a }
            boolean r2 = r2.containsKey(r5)     // Catch:{ all -> 0x003a }
            r3 = 1
            if (r2 != 0) goto L_0x0018
            r0 = 1500(0x5dc, float:2.102E-42)
            com.ironsource.mediationsdk.C6787w.m20665a((int) r0, (java.lang.String) r5)     // Catch:{ all -> 0x003a }
        L_0x0016:
            r5 = r1
            goto L_0x0034
        L_0x0018:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.ironsource.mediationsdk.x> r0 = r0.f17896a     // Catch:{ all -> 0x003a }
            java.lang.Object r5 = r0.get(r5)     // Catch:{ all -> 0x003a }
            com.ironsource.mediationsdk.x r5 = (com.ironsource.mediationsdk.C6788x) r5     // Catch:{ all -> 0x003a }
            boolean r0 = r5.mo37000b()     // Catch:{ all -> 0x003a }
            r2 = 0
            if (r0 == 0) goto L_0x002e
            r0 = 1210(0x4ba, float:1.696E-42)
            com.ironsource.mediationsdk.C6787w.m20664a((int) r0, (com.ironsource.mediationsdk.C6788x) r5, (java.lang.Object[][]) r2)     // Catch:{ all -> 0x003a }
            r5 = r3
            goto L_0x0034
        L_0x002e:
            r0 = 1211(0x4bb, float:1.697E-42)
            com.ironsource.mediationsdk.C6787w.m20664a((int) r0, (com.ironsource.mediationsdk.C6788x) r5, (java.lang.Object[][]) r2)     // Catch:{ all -> 0x003a }
            goto L_0x0016
        L_0x0034:
            if (r5 == 0) goto L_0x0038
            monitor-exit(r4)
            return r3
        L_0x0038:
            monitor-exit(r4)
            return r1
        L_0x003a:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.C6490J.mo36157g(java.lang.String):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0070, code lost:
        if (android.text.TextUtils.isEmpty(r8) == false) goto L_0x0068;
     */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo36158h(java.lang.String r8) {
        /*
            r7 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "showInterstitial("
            r0.<init>(r1)
            r0.append(r8)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r1 = r7.f16540f
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r2 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API
            r3 = 1
            r1.log(r2, r0, r3)
            r1 = 510(0x1fe, float:7.15E-43)
            r2 = 0
            boolean r3 = r7.f16556v     // Catch:{ Exception -> 0x0095 }
            if (r3 == 0) goto L_0x0039
            java.lang.String r8 = "Interstitial was initialized in demand only mode. Use showISDemandOnlyInterstitial instead"
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r3 = r7.f16540f     // Catch:{ Exception -> 0x0095 }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r4 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API     // Catch:{ Exception -> 0x0095 }
            r5 = 3
            r3.log(r4, r8, r5)     // Catch:{ Exception -> 0x0095 }
            com.ironsource.mediationsdk.D r3 = com.ironsource.mediationsdk.C6463D.m19392a()     // Catch:{ Exception -> 0x0095 }
            com.ironsource.mediationsdk.logger.IronSourceError r4 = new com.ironsource.mediationsdk.logger.IronSourceError     // Catch:{ Exception -> 0x0095 }
            r4.<init>(r1, r8)     // Catch:{ Exception -> 0x0095 }
            r3.mo36014a((com.ironsource.mediationsdk.logger.IronSourceError) r4, (com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo) r2)     // Catch:{ Exception -> 0x0095 }
            return
        L_0x0039:
            boolean r3 = r7.mo36160i()     // Catch:{ Exception -> 0x0095 }
            if (r3 != 0) goto L_0x004f
            com.ironsource.mediationsdk.D r8 = com.ironsource.mediationsdk.C6463D.m19392a()     // Catch:{ Exception -> 0x0095 }
            java.lang.String r3 = "showInterstitial can't be called before the Interstitial ad unit initialization completed successfully"
            java.lang.String r4 = "Interstitial"
            com.ironsource.mediationsdk.logger.IronSourceError r3 = com.ironsource.mediationsdk.utils.ErrorBuilder.buildInitFailedError(r3, r4)     // Catch:{ Exception -> 0x0095 }
            r8.mo36014a((com.ironsource.mediationsdk.logger.IronSourceError) r3, (com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo) r2)     // Catch:{ Exception -> 0x0095 }
            return
        L_0x004f:
            boolean r3 = r7.f16501H     // Catch:{ Exception -> 0x0095 }
            if (r3 == 0) goto L_0x0057
            r7.m19503t(r8)     // Catch:{ Exception -> 0x0095 }
            return
        L_0x0057:
            com.ironsource.mediationsdk.model.InterstitialPlacement r3 = r7.m19504u(r8)     // Catch:{ Exception -> 0x0095 }
            r4 = 0
            org.json.JSONObject r4 = com.ironsource.mediationsdk.utils.IronSourceUtils.getMediationAdditionalData(r4)     // Catch:{ Exception -> 0x0095 }
            java.lang.String r5 = "placement"
            if (r3 == 0) goto L_0x006c
            java.lang.String r8 = r3.getPlacementName()     // Catch:{ JSONException -> 0x0073 }
        L_0x0068:
            r4.put(r5, r8)     // Catch:{ JSONException -> 0x0073 }
            goto L_0x0077
        L_0x006c:
            boolean r6 = android.text.TextUtils.isEmpty(r8)     // Catch:{ JSONException -> 0x0073 }
            if (r6 != 0) goto L_0x0077
            goto L_0x0068
        L_0x0073:
            r8 = move-exception
            r8.printStackTrace()     // Catch:{ Exception -> 0x0095 }
        L_0x0077:
            com.ironsource.mediationsdk.a.c r8 = new com.ironsource.mediationsdk.a.c     // Catch:{ Exception -> 0x0095 }
            r5 = 2100(0x834, float:2.943E-42)
            r8.<init>(r5, r4)     // Catch:{ Exception -> 0x0095 }
            com.ironsource.mediationsdk.a.d r4 = com.ironsource.mediationsdk.p207a.C6553d.m19930d()     // Catch:{ Exception -> 0x0095 }
            r4.mo36371b((com.ironsource.mediationsdk.p207a.C6552c) r8)     // Catch:{ Exception -> 0x0095 }
            if (r3 == 0) goto L_0x0094
            com.ironsource.mediationsdk.G r8 = r7.f16537c     // Catch:{ Exception -> 0x0095 }
            r8.mo36044a((com.ironsource.mediationsdk.model.InterstitialPlacement) r3)     // Catch:{ Exception -> 0x0095 }
            com.ironsource.mediationsdk.G r8 = r7.f16537c     // Catch:{ Exception -> 0x0095 }
            r3.getPlacementName()     // Catch:{ Exception -> 0x0095 }
            r8.mo36052d()     // Catch:{ Exception -> 0x0095 }
        L_0x0094:
            return
        L_0x0095:
            r8 = move-exception
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r3 = r7.f16540f
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r4 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API
            r3.logException(r4, r0, r8)
            com.ironsource.mediationsdk.D r0 = com.ironsource.mediationsdk.C6463D.m19392a()
            com.ironsource.mediationsdk.logger.IronSourceError r3 = new com.ironsource.mediationsdk.logger.IronSourceError
            java.lang.String r8 = r8.getMessage()
            r3.<init>(r1, r8)
            r0.mo36014a((com.ironsource.mediationsdk.logger.IronSourceError) r3, (com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo) r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.C6490J.mo36158h(java.lang.String):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0025, code lost:
        if (r9.f16496C.mo36572b() != false) goto L_0x0027;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0042, code lost:
        if (r9.f16537c.mo36055e() != false) goto L_0x0027;
     */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x004f A[Catch:{ all -> 0x0073 }] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0052 A[Catch:{ all -> 0x0073 }] */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo36159h() {
        /*
            r9 = this;
            java.lang.String r0 = "isInterstitialReady():"
            r1 = 1
            r2 = 0
            boolean r3 = r9.f16556v     // Catch:{ all -> 0x0078 }
            if (r3 == 0) goto L_0x0013
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r3 = r9.f16540f     // Catch:{ all -> 0x0078 }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r4 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API     // Catch:{ all -> 0x0078 }
            java.lang.String r5 = "Interstitial was initialized in demand only mode. Use isISDemandOnlyInterstitialReady instead"
            r6 = 3
            r3.log(r4, r5, r6)     // Catch:{ all -> 0x0078 }
            return r2
        L_0x0013:
            boolean r3 = r9.f16501H     // Catch:{ all -> 0x0078 }
            if (r3 == 0) goto L_0x0038
            boolean r3 = r9.f16502I     // Catch:{ all -> 0x0078 }
            if (r3 == 0) goto L_0x002b
            com.ironsource.mediationsdk.adunit.c.g r3 = r9.f16496C     // Catch:{ all -> 0x0078 }
            if (r3 == 0) goto L_0x0029
            com.ironsource.mediationsdk.adunit.c.g r3 = r9.f16496C     // Catch:{ all -> 0x0078 }
            boolean r3 = r3.mo36572b()     // Catch:{ all -> 0x0078 }
            if (r3 == 0) goto L_0x0029
        L_0x0027:
            r3 = r1
            goto L_0x0045
        L_0x0029:
            r3 = r2
            goto L_0x0045
        L_0x002b:
            com.ironsource.mediationsdk.U r3 = r9.f16494A     // Catch:{ all -> 0x0078 }
            if (r3 == 0) goto L_0x0029
            com.ironsource.mediationsdk.U r3 = r9.f16494A     // Catch:{ all -> 0x0078 }
            boolean r3 = r3.mo36313f()     // Catch:{ all -> 0x0078 }
            if (r3 == 0) goto L_0x0029
            goto L_0x0027
        L_0x0038:
            com.ironsource.mediationsdk.G r3 = r9.f16537c     // Catch:{ all -> 0x0078 }
            if (r3 == 0) goto L_0x0029
            com.ironsource.mediationsdk.G r3 = r9.f16537c     // Catch:{ all -> 0x0078 }
            boolean r3 = r3.mo36055e()     // Catch:{ all -> 0x0078 }
            if (r3 == 0) goto L_0x0029
            goto L_0x0027
        L_0x0045:
            boolean r4 = r9.f16501H     // Catch:{ all -> 0x0073 }
            org.json.JSONObject r4 = com.ironsource.mediationsdk.utils.IronSourceUtils.getMediationAdditionalData(r2, r4, r1)     // Catch:{ all -> 0x0073 }
            com.ironsource.mediationsdk.a.c r5 = new com.ironsource.mediationsdk.a.c     // Catch:{ all -> 0x0073 }
            if (r3 == 0) goto L_0x0052
            r6 = 2101(0x835, float:2.944E-42)
            goto L_0x0054
        L_0x0052:
            r6 = 2102(0x836, float:2.946E-42)
        L_0x0054:
            r5.<init>(r6, r4)     // Catch:{ all -> 0x0073 }
            com.ironsource.mediationsdk.a.d r4 = com.ironsource.mediationsdk.p207a.C6553d.m19930d()     // Catch:{ all -> 0x0073 }
            r4.mo36371b((com.ironsource.mediationsdk.p207a.C6552c) r5)     // Catch:{ all -> 0x0073 }
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r4 = r9.f16540f     // Catch:{ all -> 0x0073 }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r5 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API     // Catch:{ all -> 0x0073 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0073 }
            r6.<init>(r0)     // Catch:{ all -> 0x0073 }
            r6.append(r3)     // Catch:{ all -> 0x0073 }
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x0073 }
            r4.log(r5, r6, r1)     // Catch:{ all -> 0x0073 }
            r2 = r3
            goto L_0x0096
        L_0x0073:
            r4 = move-exception
            r8 = r4
            r4 = r3
            r3 = r8
            goto L_0x007a
        L_0x0078:
            r3 = move-exception
            r4 = r2
        L_0x007a:
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r5 = r9.f16540f
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r6 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>(r0)
            r7.append(r4)
            java.lang.String r0 = r7.toString()
            r5.log(r6, r0, r1)
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r0 = r9.f16540f
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r1 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API
            java.lang.String r4 = "isInterstitialReady()"
            r0.logException(r1, r4, r3)
        L_0x0096:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.C6490J.mo36159h():boolean");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public boolean mo36160i() {
        C6777l lVar = this.f16543i;
        return (lVar == null || lVar.f17849c == null || this.f16543i.f17849c.f17497b == null) ? false : true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0039, code lost:
        return false;
     */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0036 A[DONT_GENERATE] */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean mo36161i(java.lang.String r5) {
        /*
            r4 = this;
            monitor-enter(r4)
            com.ironsource.mediationsdk.u r0 = r4.f16506M     // Catch:{ all -> 0x003a }
            r1 = 0
            if (r0 == 0) goto L_0x0038
            com.ironsource.mediationsdk.u r0 = r4.f16506M     // Catch:{ all -> 0x003a }
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.ironsource.mediationsdk.v> r2 = r0.f17661a     // Catch:{ all -> 0x003a }
            boolean r2 = r2.containsKey(r5)     // Catch:{ all -> 0x003a }
            r3 = 1
            if (r2 != 0) goto L_0x0018
            r0 = 2500(0x9c4, float:3.503E-42)
            com.ironsource.mediationsdk.C6762u.m20546a((int) r0, (java.lang.String) r5)     // Catch:{ all -> 0x003a }
        L_0x0016:
            r5 = r1
            goto L_0x0034
        L_0x0018:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.ironsource.mediationsdk.v> r0 = r0.f17661a     // Catch:{ all -> 0x003a }
            java.lang.Object r5 = r0.get(r5)     // Catch:{ all -> 0x003a }
            com.ironsource.mediationsdk.v r5 = (com.ironsource.mediationsdk.C6785v) r5     // Catch:{ all -> 0x003a }
            boolean r0 = r5.mo36994b()     // Catch:{ all -> 0x003a }
            r2 = 0
            if (r0 == 0) goto L_0x002e
            r0 = 2211(0x8a3, float:3.098E-42)
            com.ironsource.mediationsdk.C6762u.m20545a((int) r0, (com.ironsource.mediationsdk.C6785v) r5, (java.lang.Object[][]) r2)     // Catch:{ all -> 0x003a }
            r5 = r3
            goto L_0x0034
        L_0x002e:
            r0 = 2212(0x8a4, float:3.1E-42)
            com.ironsource.mediationsdk.C6762u.m20545a((int) r0, (com.ironsource.mediationsdk.C6785v) r5, (java.lang.Object[][]) r2)     // Catch:{ all -> 0x003a }
            goto L_0x0016
        L_0x0034:
            if (r5 == 0) goto L_0x0038
            monitor-exit(r4)
            return r3
        L_0x0038:
            monitor-exit(r4)
            return r1
        L_0x003a:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.C6490J.mo36161i(java.lang.String):boolean");
    }

    /* renamed from: j */
    public final void mo36162j(String str) {
        String str2 = "showOfferwall(" + str + ")";
        this.f16540f.log(IronSourceLogger.IronSourceTag.API, str2, 1);
        try {
            if (!mo36165k()) {
                this.f16541g.onOfferwallShowFailed(ErrorBuilder.buildInitFailedError("showOfferwall can't be called before the Offerwall ad unit initialization completed successfully", IronSourceConstants.OFFERWALL_AD_UNIT));
                return;
            }
            C6700j a = this.f16543i.f17849c.f17498c.mo36819a(str);
            if (a == null) {
                this.f16540f.log(IronSourceLogger.IronSourceTag.API, "Placement is not valid, please make sure you are using the right placements, using the default placement.", 3);
                a = this.f16543i.f17849c.f17498c.mo36818a();
                if (a == null) {
                    this.f16540f.log(IronSourceLogger.IronSourceTag.API, "Default placement was not found, please make sure you are using the right placements.", 3);
                    return;
                }
            }
            this.f16538d.mo36253a(a.f17516b);
        } catch (Exception e) {
            this.f16540f.logException(IronSourceLogger.IronSourceTag.API, str2, e);
            this.f16541g.onOfferwallShowFailed(ErrorBuilder.buildInitFailedError("showOfferwall can't be called before the Offerwall ad unit initialization completed successfully", IronSourceConstants.OFFERWALL_AD_UNIT));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public boolean mo36163j() {
        return mo36160i() && m19468F();
    }

    /* renamed from: k */
    public final InterstitialPlacement mo36164k(String str) {
        try {
            InterstitialPlacement s = m19500s(str);
            if (s == null) {
                try {
                    this.f16540f.log(IronSourceLogger.IronSourceTag.API, "Placement is not valid, please make sure you are using the right placements, using the default placement.", 2);
                    s = mo36156g();
                } catch (Exception unused) {
                    return s;
                }
            }
            IronSourceLoggerManager ironSourceLoggerManager = this.f16540f;
            IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
            ironSourceLoggerManager.log(ironSourceTag, "getPlacementInfo(placement: " + str + "):" + s, 1);
            return s;
        } catch (Exception unused2) {
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public boolean mo36165k() {
        C6777l lVar = this.f16543i;
        return (lVar == null || lVar.f17849c == null || this.f16543i.f17849c.f17498c == null) ? false : true;
    }

    /* renamed from: l */
    public final Placement mo36166l(String str) {
        try {
            Placement p = m19494p(str);
            if (p == null) {
                try {
                    this.f16540f.log(IronSourceLogger.IronSourceTag.API, "Placement is not valid, please make sure you are using the right placements, using the default placement.", 2);
                    p = mo36143b();
                } catch (Exception unused) {
                    return p;
                }
            }
            IronSourceLoggerManager ironSourceLoggerManager = this.f16540f;
            IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
            ironSourceLoggerManager.log(ironSourceTag, "getPlacementInfo(placement: " + str + "):" + p, 1);
            return p;
        } catch (Exception unused2) {
            return null;
        }
    }

    /* renamed from: l */
    public final boolean mo36167l() {
        try {
            if (this.f16538d != null) {
                return this.f16538d.mo36256a();
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: m */
    public final String mo36168m() {
        return this.f16544j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public final boolean mo36169m(String str) {
        boolean z = false;
        if (this.f16556v) {
            return false;
        }
        if (m19508w(str) != C6774k.C6776a.f17744d) {
            z = true;
        }
        if (z) {
            JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(this.f16556v, this.f16501H, 1);
            try {
                mediationAdditionalData.put("placement", str);
                if (this.f16501H) {
                    mediationAdditionalData.put(IronSourceConstants.EVENTS_PROGRAMMATIC, 1);
                }
            } catch (Exception unused) {
            }
            C6553d.m19930d().mo36371b(new C6552c(IronSourceConstants.IS_CHECK_CAPPED_TRUE, mediationAdditionalData));
        }
        return z;
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x00ef  */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo36170n() {
        /*
            r8 = this;
            r0 = 83005(0x1443d, float:1.16315E-40)
            r1 = 0
            m19478a((int) r0, (org.json.JSONObject) r1)
            com.ironsource.mediationsdk.logger.IronLog r0 = com.ironsource.mediationsdk.logger.IronLog.API
            r0.info()
            com.ironsource.mediationsdk.utils.l r0 = r8.f16543i
            if (r0 != 0) goto L_0x0019
            com.ironsource.mediationsdk.logger.IronLog r0 = com.ironsource.mediationsdk.logger.IronLog.API
            java.lang.String r2 = "bidding data cannot be retrieved, SDK not initialized"
            r0.error(r2)
            goto L_0x00ec
        L_0x0019:
            com.ironsource.mediationsdk.model.n r0 = r0.f17825b
            java.lang.String r2 = "IronSource"
            com.ironsource.mediationsdk.model.NetworkSettings r0 = r0.mo36826a((java.lang.String) r2)
            if (r0 == 0) goto L_0x00ec
            org.json.JSONObject r2 = new org.json.JSONObject
            r2.<init>()
            com.ironsource.mediationsdk.d r3 = com.ironsource.mediationsdk.C6653d.m20285a()
            org.json.JSONObject r4 = r0.getApplicationSettings()
            r5 = 0
            r6 = 1
            com.ironsource.mediationsdk.AbstractAdapter r0 = r3.mo36662a(r0, r4, r6, r5)
            if (r0 == 0) goto L_0x003c
            org.json.JSONObject r2 = r0.getPlayerBiddingData()     // Catch:{ Exception -> 0x00cb }
        L_0x003c:
            com.ironsource.mediationsdk.utils.l r0 = r8.f16543i     // Catch:{ Exception -> 0x00cb }
            com.ironsource.mediationsdk.model.g r0 = r0.f17849c     // Catch:{ Exception -> 0x00cb }
            com.ironsource.sdk.f.a r0 = r0.f17500e     // Catch:{ Exception -> 0x00cb }
            com.ironsource.mediationsdk.utils.p r0 = r0.mo56832c()     // Catch:{ Exception -> 0x00cb }
            boolean r3 = r0.f17891d     // Catch:{ Exception -> 0x00cb }
            if (r3 == 0) goto L_0x005b
            com.ironsource.environment.f.b r2 = new com.ironsource.environment.f.b     // Catch:{ Exception -> 0x00cb }
            r2.<init>()     // Catch:{ Exception -> 0x00cb }
            org.json.JSONObject r2 = r2.mo35937a()     // Catch:{ Exception -> 0x00cb }
            com.ironsource.mediationsdk.f r3 = com.ironsource.mediationsdk.C6656f.m20309a()     // Catch:{ Exception -> 0x00cb }
            r3.mo36675a((org.json.JSONObject) r2, (boolean) r6)     // Catch:{ Exception -> 0x00cb }
            goto L_0x0067
        L_0x005b:
            com.ironsource.mediationsdk.f r3 = com.ironsource.mediationsdk.C6656f.m20309a()     // Catch:{ Exception -> 0x00cb }
            org.json.JSONObject r4 = r0.f17890c     // Catch:{ Exception -> 0x00cb }
            java.util.ArrayList<java.lang.String> r5 = r0.f17888a     // Catch:{ Exception -> 0x00cb }
            org.json.JSONObject r2 = r3.mo36674a((org.json.JSONObject) r2, (org.json.JSONObject) r4, (java.util.List<java.lang.String>) r5)     // Catch:{ Exception -> 0x00cb }
        L_0x0067:
            com.ironsource.mediationsdk.logger.IronLog r3 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL     // Catch:{ Exception -> 0x00cb }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00cb }
            java.lang.String r5 = "bidding data: "
            r4.<init>(r5)     // Catch:{ Exception -> 0x00cb }
            r4.append(r2)     // Catch:{ Exception -> 0x00cb }
            java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x00cb }
            r3.verbose(r4)     // Catch:{ Exception -> 0x00cb }
            if (r2 == 0) goto L_0x00ec
            com.ironsource.mediationsdk.logger.IronLog r3 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL     // Catch:{ Exception -> 0x00cb }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00cb }
            java.lang.String r5 = "raw biddingData length: "
            r4.<init>(r5)     // Catch:{ Exception -> 0x00cb }
            java.lang.String r5 = r2.toString()     // Catch:{ Exception -> 0x00cb }
            int r5 = r5.length()     // Catch:{ Exception -> 0x00cb }
            r4.append(r5)     // Catch:{ Exception -> 0x00cb }
            java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x00cb }
            r3.verbose(r4)     // Catch:{ Exception -> 0x00cb }
            boolean r0 = r0.f17892e     // Catch:{ Exception -> 0x00cb }
            if (r0 == 0) goto L_0x00a4
            java.lang.String r0 = r2.toString()     // Catch:{ Exception -> 0x00cb }
            java.lang.String r0 = com.ironsource.mediationsdk.utils.IronSourceAES.compressAndEncrypt(r0)     // Catch:{ Exception -> 0x00cb }
            goto L_0x00ac
        L_0x00a4:
            java.lang.String r0 = r2.toString()     // Catch:{ Exception -> 0x00cb }
            java.lang.String r0 = com.ironsource.mediationsdk.utils.IronSourceAES.encrypt(r0)     // Catch:{ Exception -> 0x00cb }
        L_0x00ac:
            if (r0 == 0) goto L_0x00ed
            com.ironsource.mediationsdk.logger.IronLog r2 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL     // Catch:{ Exception -> 0x00c6 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00c6 }
            java.lang.String r4 = "biddingData length: "
            r3.<init>(r4)     // Catch:{ Exception -> 0x00c6 }
            int r4 = r0.length()     // Catch:{ Exception -> 0x00c6 }
            r3.append(r4)     // Catch:{ Exception -> 0x00c6 }
            java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x00c6 }
            r2.verbose(r3)     // Catch:{ Exception -> 0x00c6 }
            goto L_0x00ed
        L_0x00c6:
            r2 = move-exception
            r7 = r2
            r2 = r0
            r0 = r7
            goto L_0x00cd
        L_0x00cb:
            r0 = move-exception
            r2 = r1
        L_0x00cd:
            r3 = 83007(0x1443f, float:1.16318E-40)
            m19478a((int) r3, (org.json.JSONObject) r1)
            com.ironsource.mediationsdk.logger.IronLog r3 = com.ironsource.mediationsdk.logger.IronLog.API
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "got error during creating the token: "
            r4.<init>(r5)
            java.lang.String r0 = r0.getMessage()
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            r3.error(r0)
            r0 = r2
            goto L_0x00ed
        L_0x00ec:
            r0 = r1
        L_0x00ed:
            if (r0 != 0) goto L_0x00f5
            r2 = 83006(0x1443e, float:1.16316E-40)
            m19478a((int) r2, (org.json.JSONObject) r1)
        L_0x00f5:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.C6490J.mo36170n():java.lang.String");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public final boolean mo36171n(String str) {
        if (!m19469G()) {
            return false;
        }
        C6696f fVar = null;
        try {
            fVar = this.f16543i.f17849c.f17499d.mo36815a(str);
            if (fVar == null && (fVar = this.f16543i.f17849c.f17499d.mo36814a()) == null) {
                this.f16540f.log(IronSourceLogger.IronSourceTag.API, "Banner default placement was not found", 3);
                return false;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (fVar == null) {
            return false;
        }
        return C6774k.m20612b(ContextProvider.getInstance().getApplicationContext(), fVar.getPlacementName());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public int mo36172o(String str) {
        C6777l lVar = this.f16543i;
        if (lVar == null || lVar.f17849c == null || this.f16543i.f17849c.f17496a == null) {
            return C6774k.C6776a.f17744d;
        }
        Placement placement = null;
        try {
            placement = m19494p(str);
            if (placement == null && (placement = mo36143b()) == null) {
                this.f16540f.log(IronSourceLogger.IronSourceTag.API, "Default placement was not found", 3);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return placement == null ? C6774k.C6776a.f17744d : C6774k.m20609b(ContextProvider.getInstance().getApplicationContext(), placement);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public final boolean mo36173o() {
        return this.f16555u || this.f16556v;
    }
}

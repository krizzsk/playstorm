package com.inmobi.unifiedId;

import com.inmobi.ads.exceptions.SdkNotInitializedException;
import com.inmobi.media.C6218hh;
import com.inmobi.media.C6227ho;
import com.inmobi.media.C6258ig;
import com.inmobi.media.C6308jj;
import com.inmobi.media.C6309jk;
import com.inmobi.media.C6310jl;
import com.inmobi.media.C6312jm;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

public final class InMobiUnifiedIdService {

    /* renamed from: a */
    private static final String f16197a = InMobiUnifiedIdService.class.getSimpleName();

    /* renamed from: b */
    private static final AtomicBoolean f16198b = new AtomicBoolean();

    private InMobiUnifiedIdService() {
    }

    public static AtomicBoolean getIsPushCalled() {
        return f16198b;
    }

    public static void push(final InMobiUserDataModel inMobiUserDataModel) {
        if (C6227ho.m18545a()) {
            C6227ho.m18543a((Runnable) new Runnable() {
                public final void run() {
                    InMobiUnifiedIdService.m19162a(InMobiUserDataModel.this);
                }
            });
            return;
        }
        throw new SdkNotInitializedException(f16197a);
    }

    public static void fetchUnifiedIds(final InMobiUnifiedIdInterface inMobiUnifiedIdInterface) {
        if (C6227ho.m18545a()) {
            C6227ho.m18543a((Runnable) new Runnable() {
                public final void run() {
                    InMobiUnifiedIdService.m19161a(InMobiUnifiedIdInterface.this);
                }
            });
            return;
        }
        throw new SdkNotInitializedException(f16197a);
    }

    /* renamed from: a */
    public static void m19161a(InMobiUnifiedIdInterface inMobiUnifiedIdInterface) {
        C6218hh.m18506a().mo35424a("FetchApiInvoked", (Map<String, Object>) new HashMap());
        if (C6310jl.m18876c()) {
            C6310jl.m18871a(inMobiUnifiedIdInterface, (JSONObject) null, new Error(InMobiUnifiedIdInterface.UNIFIED_SERVICE_IS_NOT_ENABLED));
        } else if (C6310jl.m18873b()) {
            C6310jl.m18871a(inMobiUnifiedIdInterface, (JSONObject) null, new Error(InMobiUnifiedIdInterface.USER_HAS_OPTED_OUT));
        } else if (C6258ig.m18689b()) {
            C6310jl.m18871a(inMobiUnifiedIdInterface, (JSONObject) null, new Error(InMobiUnifiedIdInterface.USER_HAS_AGE_RESTRICTION));
        } else {
            synchronized (C6312jm.class) {
                if (C6312jm.m18881c()) {
                    C6312jm.m18879a(inMobiUnifiedIdInterface);
                } else {
                    JSONObject a = C6309jk.m18862a();
                    if (!C6310jl.m18874b(a) && C6310jl.m18872a(a)) {
                        C6312jm.m18879a(inMobiUnifiedIdInterface);
                    } else if (inMobiUnifiedIdInterface != null) {
                        if (!C6310jl.m18874b(a)) {
                            C6310jl.m18871a(inMobiUnifiedIdInterface, a, (Error) null);
                        } else if (f16198b.get()) {
                            C6312jm.m18879a(inMobiUnifiedIdInterface);
                        } else {
                            C6310jl.m18871a(inMobiUnifiedIdInterface, (JSONObject) null, new Error(InMobiUnifiedIdInterface.PUSH_NEEDS_TO_BE_CALLED_FIRST));
                        }
                    }
                }
            }
        }
    }

    public static void reset() {
        if (C6227ho.m18545a()) {
            C6227ho.m18543a((Runnable) new Runnable() {
                public final void run() {
                    InMobiUnifiedIdService.m19160a();
                }
            });
            return;
        }
        throw new SdkNotInitializedException(f16197a);
    }

    /* renamed from: a */
    static /* synthetic */ void m19162a(InMobiUserDataModel inMobiUserDataModel) {
        if (!C6310jl.m18876c() && !C6310jl.m18873b() && !C6258ig.m18689b()) {
            if (!C6308jj.m18860b(inMobiUserDataModel) || !f16198b.get()) {
                C6308jj.m18858a(inMobiUserDataModel);
                f16198b.set(true);
                C6312jm.m18878a();
            }
        }
    }

    /* renamed from: a */
    static /* synthetic */ void m19160a() {
        f16198b.set(false);
        C6308jj.m18858a((InMobiUserDataModel) null);
        C6312jm.m18880b();
        C6309jk.m18867d();
    }
}

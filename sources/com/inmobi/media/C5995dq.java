package com.inmobi.media;

import android.os.Handler;
import android.os.Looper;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import com.smaato.sdk.video.vast.model.ErrorCode;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.json.JSONException;

/* renamed from: com.inmobi.media.dq */
/* compiled from: VastProcessor */
public class C5995dq {

    /* renamed from: b */
    private static final String f15246b = C5995dq.class.getSimpleName();

    /* renamed from: a */
    public ExecutorService f15247a;

    /* renamed from: c */
    private HashMap<String, List<WeakReference<C5999dr>>> f15248c;

    /* renamed from: com.inmobi.media.dq$a */
    /* compiled from: VastProcessor */
    static final class C5998a {

        /* renamed from: a */
        static final C5995dq f15258a = new C5995dq((byte) 0);
    }

    /* synthetic */ C5995dq(byte b) {
        this();
    }

    /* renamed from: a */
    public static C5995dq m17896a() {
        return C5998a.f15258a;
    }

    private C5995dq() {
        this.f15247a = Executors.newCachedThreadPool(new C6237ht(f15246b));
        this.f15248c = new HashMap<>(2);
    }

    /* renamed from: a */
    private synchronized boolean m17899a(String str, C5999dr drVar) {
        List list = this.f15248c.get(str);
        if (list != null) {
            list.add(new WeakReference(drVar));
            return false;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new WeakReference(drVar));
        this.f15248c.put(str, arrayList);
        return true;
    }

    /* renamed from: a */
    private synchronized void m17897a(C5838au auVar, boolean z, byte b) {
        List<WeakReference> remove = this.f15248c.remove(auVar.mo34733f());
        if (remove != null) {
            for (WeakReference weakReference : remove) {
                final C5999dr drVar = (C5999dr) weakReference.get();
                if (drVar != null) {
                    final C5838au auVar2 = auVar;
                    final boolean z2 = z;
                    final byte b2 = b;
                    new Handler(Looper.getMainLooper()).post(new Runnable() {
                        public final void run() {
                            drVar.mo34476a(auVar2, z2, b2);
                        }
                    });
                }
            }
        }
    }

    /* renamed from: a */
    static /* synthetic */ void m17898a(C5995dq dqVar, C5838au auVar, C6125fq fqVar, C5999dr drVar) {
        try {
            if (dqVar.m17899a(auVar.mo34733f(), drVar)) {
                C5838au a = C5843ay.m17437a(auVar, fqVar);
                if (a == null) {
                    dqVar.m17897a(auVar, false, (byte) 75);
                } else {
                    dqVar.m17897a(a, true, (byte) 0);
                }
            }
        } catch (JSONException unused) {
            dqVar.m17897a(auVar, false, (byte) 58);
        } catch (C5899br e) {
            int i = e.f14889a;
            if (i == 100) {
                e.f14890b = 59;
            } else if (i == 101) {
                e.f14890b = 69;
            } else if (i == 201) {
                e.f14890b = 71;
            } else if (i == 405) {
                e.f14890b = 66;
            } else if (i == 900) {
                e.f14890b = 70;
            } else if (i == 600) {
                e.f14890b = 61;
            } else if (i == 601) {
                e.f14890b = Ascii.ETB;
            } else if (i == 603) {
                e.f14890b = 60;
            } else if (i != 604) {
                switch (i) {
                    case 300:
                        e.f14890b = 63;
                        break;
                    case ErrorCode.WRAPPER_REQUEST_TIMEOUT_ERROR /*301*/:
                        e.f14890b = 72;
                        break;
                    case 302:
                        e.f14890b = 73;
                        break;
                    case ErrorCode.NO_VAST_AFTER_WRAPPER_ERROR /*303*/:
                        e.f14890b = 74;
                        break;
                    default:
                        switch (i) {
                            case 400:
                                e.f14890b = 62;
                                break;
                            case 401:
                                e.f14890b = SignedBytes.MAX_POWER_OF_TWO;
                                break;
                            case 402:
                                e.f14890b = 65;
                                break;
                            case 403:
                                e.f14890b = 68;
                                break;
                            default:
                                e.f14890b = 0;
                                break;
                        }
                }
            } else {
                e.f14890b = 67;
            }
            dqVar.m17897a(auVar, false, e.f14890b);
        }
    }
}

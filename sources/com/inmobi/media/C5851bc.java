package com.inmobi.media;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.common.base.Ascii;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.smaato.sdk.video.vast.model.C11286Ad;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.inmobi.media.bc */
/* compiled from: AdStore */
public class C5851bc {
    /* access modifiers changed from: private */

    /* renamed from: e */
    public static final String f14773e = C5851bc.class.getSimpleName();

    /* renamed from: a */
    public final C5856a f14774a;

    /* renamed from: b */
    public final C5846ba f14775b;

    /* renamed from: c */
    public long f14776c = 0;

    /* renamed from: d */
    public final C5871bh f14777d = new C5871bh() {
        /* renamed from: a */
        public final void mo34829a(C5841aw awVar, final byte b) {
            C5851bc.this.f14779g.mo34829a(awVar, b);
            String unused = C5851bc.f14773e;
            C5846ba unused2 = C5851bc.this.f14775b;
            new Handler(Looper.getMainLooper()).post(new Runnable() {
                public final void run() {
                    C5851bc.this.f14774a.mo34479a(C5851bc.this.f14775b, false, C5851bc.m17511a(b));
                }
            });
        }

        /* renamed from: a */
        public final void mo34828a(C5841aw awVar) {
            C5851bc.this.f14779g.mo34828a(awVar);
            String unused = C5851bc.f14773e;
            C5846ba unused2 = C5851bc.this.f14775b;
            new Handler(Looper.getMainLooper()).post(new Runnable() {
                public final void run() {
                    C5851bc.this.f14774a.mo34479a(C5851bc.this.f14775b, true, (byte) 0);
                }
            });
        }
    };
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C5896bo f14778f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final C5871bh f14779g = new C5871bh() {
        /* renamed from: a */
        public final void mo34829a(C5841aw awVar, byte b) {
            String unused = C5851bc.f14773e;
            if (awVar == null) {
            }
        }

        /* renamed from: a */
        public final void mo34828a(C5841aw awVar) {
            String unused = C5851bc.f14773e;
            if (awVar != null) {
                Set<C5895bn> set = awVar.f14733b;
                for (C5839av next : awVar.f14732a) {
                    if (!next.f14721j) {
                        String a = C5851bc.m17514a(set, next);
                        HashMap hashMap = new HashMap();
                        hashMap.put("latency", Long.valueOf(next.f14712a));
                        hashMap.put("size", Float.valueOf((((float) C6272is.m18743a(next.f14716e)) * 1.0f) / 1024.0f));
                        hashMap.put("assetType", a);
                        hashMap.put("networkType", C6251ib.m18652b());
                        hashMap.put(C11286Ad.AD_TYPE, C5851bc.this.f14775b.mo34788l());
                        C5851bc.this.f14778f.mo34502b("AssetDownloaded", hashMap);
                    }
                }
            }
            String unused2 = C5851bc.f14773e;
            C5846ba unused3 = C5851bc.this.f14775b;
        }
    };

    /* renamed from: com.inmobi.media.bc$a */
    /* compiled from: AdStore */
    public interface C5856a {
        /* renamed from: a */
        void mo34479a(C5846ba baVar, boolean z, byte b);
    }

    /* renamed from: a */
    static /* synthetic */ byte m17511a(byte b) {
        switch (b) {
            case 1:
                return 78;
            case 2:
                return 79;
            case 3:
                return 80;
            case 4:
                return 81;
            case 5:
                return 5;
            case 6:
                return 77;
            case 7:
                return Ascii.f17947US;
            case 8:
                return Ascii.ESC;
            default:
                return 82;
        }
    }

    public C5851bc(C5856a aVar, C5896bo boVar, C5846ba baVar) {
        this.f14774a = aVar;
        this.f14778f = boVar;
        this.f14775b = baVar;
    }

    /* renamed from: a */
    public final C5849bb mo34825a(C5931cn cnVar) throws C5897bp {
        try {
            return mo34826a(new JSONObject(cnVar.f15035a.mo35397b()));
        } catch (JSONException unused) {
            HashMap hashMap = new HashMap();
            hashMap.put(IronSourceConstants.EVENTS_ERROR_CODE, (byte) 3);
            mo34827a((Map<String, Object>) hashMap);
            throw new C5897bp(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), (byte) 0);
        }
    }

    /* renamed from: a */
    public final C5849bb mo34826a(JSONObject jSONObject) throws C5897bp {
        C5849bb b = m17517b(jSONObject);
        if (b != null) {
            m17518b();
            if (!b.mo34813c() || b.mo34822l() != null) {
                return b;
            }
            HashMap hashMap = new HashMap();
            hashMap.put(IronSourceConstants.EVENTS_ERROR_CODE, (byte) 3);
            mo34827a((Map<String, Object>) hashMap);
            throw new C5897bp(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), (byte) 0);
        }
        HashMap hashMap2 = new HashMap();
        hashMap2.put(IronSourceConstants.EVENTS_ERROR_CODE, (byte) 3);
        mo34827a((Map<String, Object>) hashMap2);
        throw new C5897bp(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), (byte) 0);
    }

    /* renamed from: b */
    private void m17518b() {
        HashMap hashMap = new HashMap();
        hashMap.put("latency", Long.valueOf(SystemClock.elapsedRealtime() - this.f14776c));
        hashMap.put(C11286Ad.AD_TYPE, this.f14775b.mo34788l());
        hashMap.put("networkType", C6251ib.m18652b());
        hashMap.put("plId", Long.valueOf(this.f14775b.mo34779e()));
        hashMap.put("plType", "NonAB");
        this.f14778f.mo34502b("ServerFill", hashMap);
    }

    /* renamed from: b */
    private C5849bb m17517b(JSONObject jSONObject) {
        try {
            String trim = jSONObject.optString("winningAdSetId").trim();
            JSONArray jSONArray = jSONObject.getJSONArray("adSets");
            String string = jSONObject.getString(C5849bb.KEY_REQUEST_ID);
            if (jSONArray.length() != 0) {
                C5849bb a = C5849bb.m17494a(jSONArray.getJSONObject(0), this.f14775b.mo34779e(), this.f14775b.mo34788l(), string);
                if (a != null) {
                    return a;
                }
                HashMap hashMap = new HashMap();
                hashMap.put(IronSourceConstants.EVENTS_ERROR_CODE, (byte) 3);
                mo34827a((Map<String, Object>) hashMap);
                return null;
            } else if (!TextUtils.isEmpty(trim)) {
                return null;
            } else {
                HashMap hashMap2 = new HashMap();
                hashMap2.put("latency", Long.valueOf(SystemClock.elapsedRealtime() - this.f14776c));
                hashMap2.put(C11286Ad.AD_TYPE, this.f14775b.mo34788l());
                hashMap2.put("networkType", C6251ib.m18652b());
                hashMap2.put("plId", Long.valueOf(this.f14775b.mo34779e()));
                hashMap2.put("plType", "NonAB");
                this.f14778f.mo34502b("ServerNoFill", hashMap2);
                throw new C5897bp(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.NO_FILL), (byte) 0);
            }
        } catch (JSONException unused) {
        }
    }

    /* renamed from: a */
    public final void mo34827a(Map<String, Object> map) {
        map.put("latency", Long.valueOf(SystemClock.elapsedRealtime() - this.f14776c));
        map.put(C11286Ad.AD_TYPE, this.f14775b.mo34788l());
        map.put("networkType", C6251ib.m18652b());
        map.put("plId", Long.valueOf(this.f14775b.mo34779e()));
        map.put("plType", "NonAB");
        this.f14778f.mo34502b("ServerError", map);
    }

    /* renamed from: a */
    public static void m17515a(C5930cm cmVar) {
        if (cmVar != null) {
            Map<String, String> map = cmVar.f15032d;
            if (map == null) {
                map = new HashMap<>();
            }
            cmVar.f15032d = map;
        }
    }

    /* renamed from: a */
    static /* synthetic */ String m17514a(Set set, C5839av avVar) {
        String str;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            C5895bn bnVar = (C5895bn) it.next();
            if (bnVar.f14886b.equals(avVar.f14715d)) {
                byte b = bnVar.f14885a;
                if (b == 0) {
                    str = "video";
                } else if (b == 1) {
                    str = "gif";
                } else if (b != 2) {
                    return "";
                } else {
                    str = "image";
                }
                return str;
            }
        }
        return "";
    }
}

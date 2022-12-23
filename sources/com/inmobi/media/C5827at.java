package com.inmobi.media;

import android.os.Handler;
import android.os.Looper;
import com.google.common.base.Ascii;
import com.inmobi.ads.AdMetaInfo;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.ads.controllers.PublisherCallbacks;
import com.inmobi.media.C5762ad;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.inmobi.media.at */
/* compiled from: UnifiedAdManager */
public abstract class C5827at extends C5762ad.C5780a {

    /* renamed from: a */
    public static final String f14682a = "An ad is currently being viewed by the user. Please wait for the user to close the ad before requesting for another ad for placement id: ";

    /* renamed from: b */
    public static final String f14683b = "Ad show is already called. Please wait for the the ad to be shown.";

    /* renamed from: c */
    public static final String f14684c = "preload() and load() cannot be called on the same instance, please use a different instance.";

    /* renamed from: d */
    public static final String f14685d = "Please make an ad request first in order to start loading the ad.";

    /* renamed from: e */
    public static final String f14686e = "An ad load is already in progress. Please wait for the load to complete before requesting for another ad for placement id: ";

    /* renamed from: k */
    private static final String f14687k = C5827at.class.getSimpleName();

    /* renamed from: f */
    byte f14688f = 0;

    /* renamed from: g */
    Boolean f14689g = null;

    /* renamed from: h */
    PublisherCallbacks f14690h;

    /* renamed from: i */
    final Handler f14691i = new Handler(Looper.getMainLooper());

    /* renamed from: j */
    AdMetaInfo f14692j;

    /* renamed from: m */
    public abstract C5762ad mo34645m();

    C5827at() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo34711c(final C5762ad adVar, final InMobiAdRequestStatus inMobiAdRequestStatus) {
        this.f14688f = 3;
        this.f14691i.post(new Runnable() {
            public final void run() {
                C5762ad adVar = adVar;
                if (adVar != null) {
                    adVar.mo34527f((byte) 1);
                }
                if (C5827at.this.f14690h != null) {
                    C5827at.this.f14690h.onAdLoadFailed(inMobiAdRequestStatus);
                }
            }
        });
    }

    /* renamed from: a */
    public void mo34582a(AdMetaInfo adMetaInfo) {
        this.f14688f = 7;
    }

    /* renamed from: a */
    public void mo34583a(final InMobiAdRequestStatus inMobiAdRequestStatus) {
        this.f14688f = 3;
        this.f14691i.post(new Runnable() {
            public final void run() {
                if (C5827at.this.f14690h != null) {
                    C5827at.this.f14690h.onAdFetchFailed(inMobiAdRequestStatus);
                }
            }
        });
    }

    /* renamed from: b */
    public final void mo34590b() {
        byte b = this.f14688f;
        if (b != 4 && b != 5) {
            this.f14691i.post(new Runnable() {
                public final void run() {
                    if (C5827at.this.f14690h != null) {
                        C5827at.this.f14690h.onAdWillDisplay();
                    }
                }
            });
            this.f14688f = 4;
        }
    }

    /* renamed from: c */
    public void mo34596c(final AdMetaInfo adMetaInfo) {
        if (this.f14688f != 5) {
            this.f14692j = adMetaInfo;
            this.f14691i.post(new Runnable() {
                public final void run() {
                    if (C5827at.this.f14690h != null) {
                        C5827at.this.f14690h.onAdDisplayed(adMetaInfo);
                    }
                }
            });
            this.f14688f = 5;
        }
    }

    /* renamed from: a */
    public void mo34584a(C5762ad adVar, InMobiAdRequestStatus inMobiAdRequestStatus) {
        if (!mo34712c(inMobiAdRequestStatus) || !mo34707a(adVar)) {
            mo34711c(adVar, inMobiAdRequestStatus);
        } else {
            adVar.mo34498b(inMobiAdRequestStatus);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public boolean mo34712c(InMobiAdRequestStatus inMobiAdRequestStatus) {
        return inMobiAdRequestStatus == null || InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR == inMobiAdRequestStatus.getStatusCode() || InMobiAdRequestStatus.StatusCode.AD_NO_LONGER_AVAILABLE == inMobiAdRequestStatus.getStatusCode();
    }

    /* renamed from: a */
    public void mo34587a(final Map<Object, Object> map) {
        this.f14691i.post(new Runnable() {
            public final void run() {
                if (C5827at.this.f14690h != null) {
                    C5827at.this.f14690h.onAdClicked(map);
                }
            }
        });
    }

    /* renamed from: b */
    public void mo34710b(PublisherCallbacks publisherCallbacks) {
        C5762ad m = mo34645m();
        if (m != null) {
            this.f14690h = publisherCallbacks;
            m.mo34556z();
        }
    }

    /* renamed from: a */
    public final void mo34585a(C5762ad adVar, boolean z, InMobiAdRequestStatus inMobiAdRequestStatus) {
        if (z) {
            adVar.mo34456S();
        } else {
            adVar.mo34441D();
        }
        mo34641b(adVar, z, inMobiAdRequestStatus);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo34641b(C5762ad adVar, boolean z, InMobiAdRequestStatus inMobiAdRequestStatus) {
        if (!z) {
            mo34711c(adVar, inMobiAdRequestStatus);
        }
    }

    /* renamed from: C */
    public String mo34705C() {
        AdMetaInfo adMetaInfo = this.f14692j;
        return adMetaInfo == null ? "" : adMetaInfo.getCreativeID();
    }

    /* renamed from: a */
    public void mo34638a(byte[] bArr, PublisherCallbacks publisherCallbacks) {
        Boolean bool = this.f14689g;
        if (bool == null || !bool.booleanValue()) {
            this.f14689g = Boolean.FALSE;
            this.f14688f = 1;
            C5762ad m = mo34645m();
            if (m != null) {
                this.f14690h = publisherCallbacks;
                m.mo34493a(bArr);
                return;
            }
            return;
        }
        C6238hu.m18605a((byte) 1, "InMobi", "Cannot call load(byte[]) API after load() API is called");
    }

    /* renamed from: D */
    public JSONObject mo34706D() {
        AdMetaInfo adMetaInfo = this.f14692j;
        return adMetaInfo == null ? new JSONObject() : adMetaInfo.getBidInfo();
    }

    /* renamed from: b */
    public void mo34591b(AdMetaInfo adMetaInfo) {
        this.f14692j = adMetaInfo;
        C5762ad m = mo34645m();
        if (m != null) {
            m.mo34527f((byte) 1);
        }
    }

    /* renamed from: b */
    public void mo34593b(C5762ad adVar, InMobiAdRequestStatus inMobiAdRequestStatus) {
        mo34711c(adVar, inMobiAdRequestStatus);
    }

    /* renamed from: d */
    public void mo34597d() {
        this.f14691i.post(new Runnable() {
            public final void run() {
                if (C5827at.this.f14690h != null) {
                    C5827at.this.f14690h.onUserLeftApplication();
                }
            }
        });
    }

    /* renamed from: b */
    public void mo34594b(final Map<Object, Object> map) {
        this.f14691i.post(new Runnable() {
            public final void run() {
                if (C5827at.this.f14690h != null) {
                    C5827at.this.f14690h.onRewardsUnlocked(map);
                }
            }
        });
    }

    /* renamed from: a */
    public void mo34589a(final byte[] bArr) {
        this.f14691i.post(new Runnable() {
            public final void run() {
                if (C5827at.this.f14690h != null) {
                    C5827at.this.f14690h.onRequestPayloadCreated(bArr);
                }
            }
        });
    }

    /* renamed from: b */
    public void mo34592b(final InMobiAdRequestStatus inMobiAdRequestStatus) {
        this.f14691i.post(new Runnable() {
            public final void run() {
                if (C5827at.this.f14690h != null) {
                    C5827at.this.f14690h.onRequestPayloadCreationFailed(inMobiAdRequestStatus);
                }
            }
        });
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo34709a(String str, String str2, PublisherCallbacks publisherCallbacks) {
        C5762ad m = mo34645m();
        PublisherCallbacks publisherCallbacks2 = this.f14690h;
        if (publisherCallbacks2 == null || publisherCallbacks == null || publisherCallbacks2.getType() == publisherCallbacks.getType()) {
            byte b = this.f14688f;
            if (b != 1) {
                if (b == 5) {
                    C6238hu.m18605a((byte) 1, str, f14682a.concat(String.valueOf(str2)));
                    mo34711c(mo34645m(), new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.AD_ACTIVE));
                    if (m != null) {
                        m.mo34465a((byte) Ascii.f17944SI);
                    }
                    return false;
                } else if (b != 8) {
                    return true;
                }
            }
            C6238hu.m18605a((byte) 1, str, f14686e.concat(String.valueOf(str2)));
            if (m != null) {
                m.mo34497b((byte) 53);
            }
            return false;
        }
        C6238hu.m18605a((byte) 1, f14687k, f14684c);
        if (m != null) {
            m.mo34497b((byte) 54);
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo34708a(String str, String str2) throws IllegalStateException {
        C5762ad m = mo34645m();
        byte b = this.f14688f;
        if (b != 1) {
            if (b == 5) {
                C6238hu.m18605a((byte) 1, str, f14682a.concat(String.valueOf(str2)));
                if (m != null) {
                    m.mo34465a((byte) Ascii.f17944SI);
                }
                mo34711c(m, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.AD_ACTIVE));
                return false;
            } else if (b == 7) {
                return true;
            } else {
                if (b != 8) {
                    throw new IllegalStateException(f14685d);
                }
            }
        }
        C6238hu.m18605a((byte) 1, str, f14686e.concat(String.valueOf(str2)));
        return false;
    }

    /* renamed from: c */
    public void mo34595c() {
        this.f14691i.post(new Runnable() {
            public final void run() {
                if (C5827at.this.f14690h != null) {
                    C5827at.this.f14690h.onAdDismissed();
                }
            }
        });
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo34707a(C5762ad adVar) {
        return adVar != null && !adVar.f14556v;
    }
}

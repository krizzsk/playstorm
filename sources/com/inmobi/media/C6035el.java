package com.inmobi.media;

import android.view.View;
import android.view.ViewGroup;
import com.iab.omid.library.inmobi.adsession.AdSession;
import com.iab.omid.library.inmobi.adsession.AdSessionConfiguration;
import com.iab.omid.library.inmobi.adsession.AdSessionContext;
import com.iab.omid.library.inmobi.adsession.CreativeType;
import com.iab.omid.library.inmobi.adsession.ErrorType;
import com.iab.omid.library.inmobi.adsession.FriendlyObstructionPurpose;
import com.iab.omid.library.inmobi.adsession.ImpressionType;
import com.iab.omid.library.inmobi.adsession.Owner;
import com.iab.omid.library.inmobi.adsession.media.InteractionType;
import com.iab.omid.library.inmobi.adsession.media.MediaEvents;
import com.iab.omid.library.inmobi.adsession.media.PlayerState;
import com.iab.omid.library.inmobi.adsession.media.VastProperties;
import java.util.Map;

/* renamed from: com.inmobi.media.el */
/* compiled from: OmidAdSessionManagerImpl */
public final class C6035el implements C6034ek {

    /* renamed from: a */
    private AdSessionContext f15349a;

    /* renamed from: b */
    private final boolean f15350b;

    /* renamed from: c */
    private String f15351c;

    /* renamed from: d */
    private ImpressionType f15352d;

    /* renamed from: e */
    private byte f15353e;

    /* renamed from: f */
    private AdSession f15354f;

    /* renamed from: g */
    private C6033ej f15355g;

    public C6035el(String str, ImpressionType impressionType, AdSessionContext adSessionContext) {
        this(str, impressionType, adSessionContext, false);
    }

    public C6035el(String str, ImpressionType impressionType, AdSessionContext adSessionContext, boolean z) {
        this.f15353e = 0;
        this.f15351c = str;
        this.f15352d = impressionType;
        this.f15349a = adSessionContext;
        this.f15350b = z;
    }

    /* renamed from: a */
    private static boolean m18046a(byte b, byte b2) {
        if (b == b2) {
            return true;
        }
        C6181gg a = C6181gg.m18398a();
        a.mo35357a(new C6217hg(new Exception("Omid AdSession State Error currentState :: " + b + ", expectedState :: " + b2)));
        return false;
    }

    /* renamed from: a */
    public final void mo35163a(int i, int i2, float f, VastProperties vastProperties) {
        if (m18046a(this.f15353e, (byte) 2)) {
            if (i == 0) {
                this.f15355g.mo35160a();
            } else if (i == 17) {
                ErrorType errorType = ErrorType.VIDEO;
                if (m18046a(this.f15353e, (byte) 2)) {
                    this.f15354f.error(errorType, "Unknown Player error");
                }
            }
            C6033ej ejVar = this.f15355g;
            if (ejVar.f15348b != null) {
                switch (i) {
                    case 1:
                        ejVar.f15348b.playerStateChange(PlayerState.FULLSCREEN);
                        return;
                    case 2:
                        ejVar.f15348b.playerStateChange(PlayerState.NORMAL);
                        return;
                    case 4:
                        ejVar.f15348b.adUserInteraction(InteractionType.CLICK);
                        return;
                    case 5:
                        ejVar.f15347a.loaded(vastProperties);
                        return;
                    case 6:
                        ejVar.f15348b.start((float) i2, f);
                        return;
                    case 7:
                        ejVar.f15348b.pause();
                        return;
                    case 8:
                    case 16:
                        ejVar.f15348b.resume();
                        return;
                    case 9:
                        ejVar.f15348b.firstQuartile();
                        return;
                    case 10:
                        ejVar.f15348b.midpoint();
                        return;
                    case 11:
                        ejVar.f15348b.thirdQuartile();
                        return;
                    case 12:
                        ejVar.f15348b.complete();
                        return;
                    case 13:
                    case 14:
                        MediaEvents mediaEvents = ejVar.f15348b;
                        if (13 == i) {
                            f = 0.0f;
                        }
                        mediaEvents.volumeChange(f);
                        return;
                    case 15:
                        ejVar.f15348b.skipped();
                        return;
                    case 18:
                        ejVar.f15348b.adUserInteraction(InteractionType.INVITATION_ACCEPTED);
                        return;
                    default:
                        return;
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo35162a(int i) {
        if (!m18046a(this.f15353e, (byte) 2)) {
            return;
        }
        if (i == 0) {
            this.f15355g.mo35160a();
        } else if (i == 19) {
            C6033ej ejVar = this.f15355g;
            if (ejVar.f15347a != null) {
                ejVar.f15347a.loaded();
            }
        }
    }

    /* renamed from: a */
    private void m18044a(View view, FriendlyObstructionPurpose friendlyObstructionPurpose) {
        if (m18046a(this.f15353e, (byte) 1)) {
            this.f15354f.addFriendlyObstruction(view, friendlyObstructionPurpose, (String) null);
        }
    }

    /* renamed from: a */
    public final void mo35161a() {
        this.f15354f.getAdSessionId();
        if (m18046a(this.f15353e, (byte) 2)) {
            this.f15354f.finish();
            this.f15354f = null;
            this.f15353e = 3;
        }
    }

    /* renamed from: a */
    public final void mo35165a(AdSessionContext adSessionContext) {
        if (adSessionContext != null) {
            this.f15349a = adSessionContext;
        }
    }

    /* renamed from: a */
    private void m18045a(View view, Map<View, FriendlyObstructionPurpose> map, ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (!childAt.equals(view)) {
                if (map == null || !map.containsKey(childAt)) {
                    m18044a(childAt, FriendlyObstructionPurpose.OTHER);
                }
                if (childAt instanceof ViewGroup) {
                    ViewGroup viewGroup2 = (ViewGroup) childAt;
                    if (viewGroup2.getChildCount() > 0) {
                        m18045a(view, map, viewGroup2);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo35164a(View view, Map<View, FriendlyObstructionPurpose> map, View view2) {
        if (this.f15354f == null) {
            boolean z = this.f15350b;
            Owner owner = Owner.JAVASCRIPT;
            Owner owner2 = null;
            CreativeType creativeType = CreativeType.DEFINED_BY_JAVASCRIPT;
            String str = this.f15351c;
            char c = 65535;
            switch (str.hashCode()) {
                case -2139264536:
                    if (str.equals("native_display_ad")) {
                        c = 1;
                        break;
                    }
                    break;
                case -1329992236:
                    if (str.equals("html_display_ad")) {
                        c = 3;
                        break;
                    }
                    break;
                case -1191784049:
                    if (str.equals("native_video_ad")) {
                        c = 0;
                        break;
                    }
                    break;
                case 538665083:
                    if (str.equals("html_video_ad")) {
                        c = 2;
                        break;
                    }
                    break;
            }
            if (c == 0) {
                owner = Owner.NATIVE;
                owner2 = Owner.NATIVE;
                creativeType = CreativeType.VIDEO;
            } else if (c == 1) {
                owner = Owner.NATIVE;
                owner2 = Owner.NONE;
                creativeType = CreativeType.NATIVE_DISPLAY;
            } else if (c == 2) {
                owner = Owner.JAVASCRIPT;
                owner2 = Owner.JAVASCRIPT;
                creativeType = CreativeType.VIDEO;
            } else if (c == 3) {
                owner = Owner.JAVASCRIPT;
                owner2 = Owner.NONE;
                creativeType = CreativeType.HTML_DISPLAY;
            }
            this.f15354f = AdSession.createAdSession(AdSessionConfiguration.createAdSessionConfiguration(creativeType, this.f15352d, owner, owner2, z), this.f15349a);
            this.f15355g = new C6033ej(this.f15354f, this.f15351c);
            this.f15353e = 1;
        }
        if (m18046a(this.f15353e, (byte) 1)) {
            this.f15354f.registerAdView(view);
        }
        if (map != null) {
            for (Map.Entry next : map.entrySet()) {
                m18044a((View) next.getKey(), (FriendlyObstructionPurpose) next.getValue());
            }
        }
        if (!(view2 == null || view == null || !(view2 instanceof ViewGroup))) {
            m18045a(view, map, (ViewGroup) view2);
        }
        if (m18046a(this.f15353e, (byte) 1)) {
            this.f15354f.start();
            this.f15353e = 2;
        }
        this.f15354f.getAdSessionId();
    }
}

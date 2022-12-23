package com.inmobi.media;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import com.iab.omid.library.inmobi.adsession.AdSessionContext;
import com.iab.omid.library.inmobi.adsession.FriendlyObstructionPurpose;
import com.iab.omid.library.inmobi.adsession.ImpressionType;
import com.inmobi.media.C6042er;
import java.util.Map;

/* renamed from: com.inmobi.media.eo */
/* compiled from: OmidTrackedHtmlAd */
public class C6039eo extends C6003dv {

    /* renamed from: d */
    private static final String f15364d = C6039eo.class.getSimpleName();

    /* renamed from: e */
    private final C6004dw f15365e;

    /* renamed from: f */
    private C6034ek f15366f;

    /* renamed from: a */
    public static C6034ek m18056a(String str, C6337q qVar, boolean z, String str2, byte b, String str3) {
        ImpressionType impressionType;
        AdSessionContext a = m18055a(qVar, str2, str3);
        switch (b) {
            case 1:
                impressionType = ImpressionType.DEFINED_BY_JAVASCRIPT;
                break;
            case 2:
                impressionType = ImpressionType.UNSPECIFIED;
                break;
            case 3:
                impressionType = ImpressionType.LOADED;
                break;
            case 4:
                impressionType = ImpressionType.BEGIN_TO_RENDER;
                break;
            case 5:
                impressionType = ImpressionType.ONE_PIXEL;
                break;
            case 6:
                impressionType = ImpressionType.VIEWABLE;
                break;
            case 7:
                impressionType = ImpressionType.AUDIBLE;
                break;
            default:
                impressionType = ImpressionType.OTHER;
                break;
        }
        char c = 65535;
        int hashCode = str.hashCode();
        if (hashCode != -284840886) {
            if (hashCode != 112202875) {
                if (hashCode == 1425678798 && str.equals("nonvideo")) {
                    c = 2;
                }
            } else if (str.equals("video")) {
                c = 3;
            }
        } else if (str.equals("unknown")) {
            c = 1;
        }
        if (c == 2) {
            return new C6035el("html_display_ad", impressionType, a);
        }
        if (c != 3) {
            return null;
        }
        return new C6035el("html_video_ad", impressionType, a, z);
    }

    public C6039eo(C6286j jVar, C6004dw dwVar, C6034ek ekVar) {
        super(jVar);
        this.f15365e = dwVar;
        this.f15366f = ekVar;
    }

    /* renamed from: c */
    public final View mo35121c() {
        return this.f15365e.mo35121c();
    }

    /* renamed from: a */
    public final View mo35114a(View view, ViewGroup viewGroup, boolean z) {
        return this.f15365e.mo35114a(view, viewGroup, z);
    }

    /* renamed from: b */
    public final View mo35120b() {
        return this.f15365e.mo35120b();
    }

    /* renamed from: d */
    public final void mo35122d() {
        try {
            this.f15366f.mo35161a();
        } catch (Exception unused) {
        } catch (Throwable th) {
            this.f15365e.mo35122d();
            throw th;
        }
        this.f15365e.mo35122d();
    }

    /* renamed from: a */
    public final void mo35116a(byte b) {
        this.f15365e.mo35116a(b);
    }

    /* renamed from: a */
    public final void mo35117a(Context context, byte b) {
        this.f15365e.mo35117a(context, b);
    }

    /* renamed from: e */
    public final void mo35123e() {
        super.mo35123e();
        try {
            this.f15366f = null;
        } catch (Exception unused) {
        } catch (Throwable th) {
            this.f15365e.mo35123e();
            throw th;
        }
        this.f15365e.mo35123e();
    }

    /* renamed from: a */
    public static AdSessionContext m18055a(C6337q qVar, String str, String str2) {
        if (qVar != null) {
            return C6042er.C6043a.f15376a.mo35167a((WebView) qVar, str, str2);
        }
        return null;
    }

    /* renamed from: a */
    public final void mo35119a(Map<View, FriendlyObstructionPurpose> map) {
        View view;
        try {
            if (this.f15273c.viewability.omidConfig.omidEnabled && C6042er.C6043a.f15376a.mo35170a()) {
                if (this.f15271a instanceof C6318n) {
                    C6318n nVar = (C6318n) this.f15271a;
                    view = nVar.f16019t == null ? nVar.f16020u : nVar.f16019t;
                } else {
                    view = this.f15365e.mo35120b() instanceof WebView ? (WebView) this.f15365e.mo35120b() : null;
                }
                if (view != null) {
                    this.f15366f.mo35164a(view, map, (View) null);
                }
            }
        } catch (Exception unused) {
        } catch (Throwable th) {
            this.f15365e.mo35119a(map);
            throw th;
        }
        this.f15365e.mo35119a(map);
    }
}

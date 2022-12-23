package com.inmobi.media;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.iab.omid.library.inmobi.adsession.FriendlyObstructionPurpose;
import com.iab.omid.library.inmobi.adsession.ImpressionType;
import com.iab.omid.library.inmobi.adsession.VerificationScriptResource;
import com.inmobi.media.C6042er;
import java.util.List;
import java.util.Map;

/* renamed from: com.inmobi.media.ep */
/* compiled from: OmidTrackedNativeDisplayAd */
public class C6040ep extends C6003dv {

    /* renamed from: d */
    private static final String f15367d = C6040ep.class.getSimpleName();

    /* renamed from: e */
    private final C6004dw f15368e;

    /* renamed from: f */
    private C6034ek f15369f;

    public C6040ep(C6286j jVar, C6004dw dwVar, C6034ek ekVar) {
        super(jVar);
        this.f15368e = dwVar;
        this.f15369f = ekVar;
    }

    /* renamed from: c */
    public final View mo35121c() {
        return this.f15368e.mo35121c();
    }

    /* renamed from: a */
    public final View mo35114a(View view, ViewGroup viewGroup, boolean z) {
        return this.f15368e.mo35114a(view, viewGroup, z);
    }

    /* renamed from: b */
    public final View mo35120b() {
        return this.f15368e.mo35120b();
    }

    /* renamed from: d */
    public final void mo35122d() {
        try {
            this.f15369f.mo35161a();
        } catch (Exception unused) {
        } catch (Throwable th) {
            this.f15368e.mo35122d();
            throw th;
        }
        this.f15368e.mo35122d();
    }

    /* renamed from: a */
    public final void mo35116a(byte b) {
        try {
            this.f15369f.mo35162a((int) b);
        } catch (Exception unused) {
        } catch (Throwable th) {
            this.f15368e.mo35116a(b);
            throw th;
        }
        this.f15368e.mo35116a(b);
    }

    /* renamed from: a */
    public final void mo35117a(Context context, byte b) {
        this.f15368e.mo35117a(context, b);
    }

    /* renamed from: e */
    public final void mo35123e() {
        super.mo35123e();
        try {
            this.f15369f = null;
        } catch (Exception unused) {
        } catch (Throwable th) {
            this.f15368e.mo35123e();
            throw th;
        }
        this.f15368e.mo35123e();
    }

    /* renamed from: a */
    public static C6034ek m18065a(List<VerificationScriptResource> list, String str, String str2) {
        return new C6035el("native_display_ad", ImpressionType.VIEWABLE, C6042er.C6043a.f15376a.mo35168a(list, str, str2));
    }

    /* renamed from: a */
    public final void mo35119a(Map<View, FriendlyObstructionPurpose> map) {
        View f;
        try {
            if (this.f15273c.viewability.omidConfig.omidEnabled && C6042er.C6043a.f15376a.mo35170a()) {
                if ((this.f15271a instanceof C6318n) && (f = ((C6318n) this.f15271a).mo35566f()) != null) {
                    this.f15369f.mo35164a(f, map, this.f15368e.mo35120b());
                }
                mo35116a((byte) 19);
            }
        } catch (Exception unused) {
        } catch (Throwable th) {
            this.f15368e.mo35119a(map);
            throw th;
        }
        this.f15368e.mo35119a(map);
    }
}

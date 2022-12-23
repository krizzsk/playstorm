package com.tapjoy.internal;

import android.app.Activity;
import android.content.Context;
import android.opengl.GLSurfaceView;
import com.tapjoy.TJAwardCurrencyListener;
import com.tapjoy.TJConnectListener;
import com.tapjoy.TJEarnedCurrencyListener;
import com.tapjoy.TJGetCurrencyBalanceListener;
import com.tapjoy.TJPlacement;
import com.tapjoy.TJPlacementListener;
import com.tapjoy.TJPrivacyPolicy;
import com.tapjoy.TJSetUserIDListener;
import com.tapjoy.TJSpendCurrencyListener;
import com.tapjoy.TJVideoListener;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

/* renamed from: com.tapjoy.internal.et */
public abstract class C11582et {

    /* renamed from: c */
    private static final C11582et f28000c;

    /* renamed from: d */
    private static C11582et f28001d;

    /* renamed from: a */
    protected volatile boolean f28002a = false;

    /* renamed from: b */
    protected volatile boolean f28003b = false;

    /* renamed from: a */
    public abstract TJPlacement mo72385a(String str, TJPlacementListener tJPlacementListener);

    /* renamed from: a */
    public abstract void mo72386a(float f);

    /* renamed from: a */
    public abstract void mo72387a(int i);

    /* renamed from: a */
    public abstract void mo72388a(int i, TJAwardCurrencyListener tJAwardCurrencyListener);

    /* renamed from: a */
    public abstract void mo72389a(int i, TJSpendCurrencyListener tJSpendCurrencyListener);

    /* renamed from: a */
    public abstract void mo72390a(int i, String str);

    /* renamed from: a */
    public abstract void mo72391a(Activity activity);

    /* renamed from: a */
    public abstract void mo72392a(Context context);

    /* renamed from: a */
    public abstract void mo72393a(Context context, Map<String, String> map);

    /* renamed from: a */
    public abstract void mo72394a(Context context, boolean z);

    /* renamed from: a */
    public abstract void mo72395a(GLSurfaceView gLSurfaceView);

    /* renamed from: a */
    public abstract void mo72396a(TJEarnedCurrencyListener tJEarnedCurrencyListener);

    /* renamed from: a */
    public abstract void mo72397a(TJGetCurrencyBalanceListener tJGetCurrencyBalanceListener);

    /* renamed from: a */
    public abstract void mo72398a(TJVideoListener tJVideoListener);

    /* renamed from: a */
    public abstract void mo72399a(String str);

    /* renamed from: a */
    public abstract void mo72400a(String str, long j);

    /* renamed from: a */
    public abstract void mo72401a(String str, TJSetUserIDListener tJSetUserIDListener);

    /* renamed from: a */
    public abstract void mo72402a(String str, String str2);

    /* renamed from: a */
    public abstract void mo72403a(String str, String str2, double d, String str3);

    /* renamed from: a */
    public abstract void mo72404a(String str, String str2, long j);

    /* renamed from: a */
    public abstract void mo72405a(String str, String str2, String str3, String str4);

    /* renamed from: a */
    public abstract void mo72406a(String str, String str2, String str3, String str4, long j);

    /* renamed from: a */
    public abstract void mo72407a(String str, String str2, String str3, String str4, String str5, long j);

    /* renamed from: a */
    public abstract void mo72408a(String str, String str2, String str3, String str4, String str5, long j, String str6, long j2);

    /* renamed from: a */
    public abstract void mo72409a(String str, String str2, String str3, String str4, String str5, long j, String str6, long j2, String str7, long j3);

    /* renamed from: a */
    public abstract void mo72410a(String str, String str2, String str3, String str4, Map<String, Long> map);

    /* renamed from: a */
    public abstract void mo72411a(Set<String> set);

    /* renamed from: a */
    public abstract void mo72412a(boolean z);

    /* renamed from: a */
    public abstract boolean mo72413a(Context context, String str);

    /* renamed from: a */
    public abstract boolean mo72414a(Context context, String str, TJConnectListener tJConnectListener);

    /* renamed from: a */
    public abstract boolean mo72415a(Context context, String str, Hashtable<String, ?> hashtable, TJConnectListener tJConnectListener);

    /* renamed from: b */
    public abstract TJPlacement mo72416b(String str, TJPlacementListener tJPlacementListener);

    /* renamed from: b */
    public abstract String mo72417b();

    /* renamed from: b */
    public abstract void mo72418b(int i);

    /* renamed from: b */
    public abstract void mo72419b(Activity activity);

    /* renamed from: b */
    public abstract void mo72420b(Context context, String str);

    /* renamed from: b */
    public abstract void mo72421b(String str);

    /* renamed from: b */
    public abstract void mo72422b(String str, String str2, String str3, String str4);

    /* renamed from: b */
    public abstract void mo72423b(boolean z);

    /* renamed from: c */
    public abstract float mo72424c();

    /* renamed from: c */
    public abstract void mo72425c(Activity activity);

    /* renamed from: c */
    public abstract void mo72426c(String str);

    /* renamed from: c */
    public abstract void mo72427c(boolean z);

    /* renamed from: d */
    public abstract void mo72428d();

    /* renamed from: d */
    public abstract void mo72429d(String str);

    /* renamed from: d */
    public abstract void mo72430d(boolean z);

    /* renamed from: e */
    public abstract void mo72431e();

    /* renamed from: e */
    public abstract void mo72432e(String str);

    /* renamed from: f */
    public abstract String mo72433f(String str);

    /* renamed from: f */
    public abstract Set<String> mo72434f();

    /* renamed from: g */
    public abstract void mo72435g();

    /* renamed from: g */
    public abstract void mo72436g(String str);

    /* renamed from: h */
    public abstract void mo72437h(String str);

    /* renamed from: h */
    public abstract boolean mo72438h();

    /* renamed from: i */
    public abstract void mo72439i(String str);

    /* renamed from: i */
    public abstract boolean mo72440i();

    /* renamed from: j */
    public abstract boolean mo72441j();

    /* renamed from: k */
    public abstract String mo72442k();

    /* renamed from: l */
    public abstract String mo72443l();

    /* renamed from: m */
    public abstract TJPrivacyPolicy mo72444m();

    C11582et() {
    }

    static {
        C11653fz.m33824a();
        C11642fr.m33806a();
        C11586ev evVar = new C11586ev();
        f28000c = evVar;
        f28001d = evVar;
    }

    /* renamed from: a */
    public static C11582et m33598a() {
        return f28001d;
    }
}

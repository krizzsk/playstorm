package com.applovin.impl.mediation.debugger;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import com.applovin.impl.mediation.debugger.p034b.p035a.C1655a;
import com.applovin.impl.mediation.debugger.p034b.p036b.C1661b;
import com.applovin.impl.mediation.debugger.p037c.C1666a;
import com.applovin.impl.mediation.debugger.p038ui.p040b.C1696b;
import com.applovin.impl.sdk.C1959m;
import com.applovin.impl.sdk.C2092v;
import com.applovin.impl.sdk.network.C1985b;
import com.applovin.impl.sdk.p050e.C1877a;
import com.applovin.impl.sdk.p050e.C1908o;
import com.applovin.impl.sdk.utils.C2032a;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.mediation.MaxDebuggerActivity;
import com.applovin.sdk.AppLovinSdkUtils;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.mediation.debugger.a */
public class C1646a implements C1985b.C1989c<JSONObject> {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static WeakReference<MaxDebuggerActivity> f2302a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static final AtomicBoolean f2303b = new AtomicBoolean();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C1959m f2304c;

    /* renamed from: d */
    private final C2092v f2305d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C1696b f2306e;

    /* renamed from: f */
    private final Map<String, C1661b> f2307f = new HashMap();

    /* renamed from: g */
    private final AtomicBoolean f2308g = new AtomicBoolean();

    /* renamed from: h */
    private boolean f2309h;

    /* renamed from: i */
    private int f2310i = 2;

    /* renamed from: j */
    private boolean f2311j;

    /* renamed from: k */
    private final Context f2312k;

    public C1646a(C1959m mVar) {
        this.f2304c = mVar;
        this.f2305d = mVar.mo14286A();
        this.f2312k = mVar.mo14297L();
        this.f2306e = new C1696b(this.f2312k);
    }

    /* renamed from: a */
    private List<C1661b> m3321a(JSONObject jSONObject, C1959m mVar) {
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, "networks", new JSONArray());
        ArrayList arrayList = new ArrayList(jSONArray.length());
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONArray, i, (JSONObject) null);
            if (jSONObject2 != null) {
                C1661b bVar = new C1661b(jSONObject2, mVar);
                arrayList.add(bVar);
                this.f2307f.put(bVar.mo13441m(), bVar);
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    /* renamed from: a */
    private List<C1655a> m3322a(JSONObject jSONObject, List<C1661b> list, C1959m mVar) {
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, "ad_units", new JSONArray());
        ArrayList arrayList = new ArrayList(jSONArray.length());
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONArray, i, (JSONObject) null);
            if (jSONObject2 != null) {
                arrayList.add(new C1655a(jSONObject2, this.f2307f, mVar));
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    /* renamed from: a */
    private void m3323a(List<C1661b> list) {
        boolean z;
        Iterator<C1661b> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                z = false;
                break;
            }
            C1661b next = it.next();
            if (next.mo13433e() && next.mo13428a() == C1661b.C1662a.INVALID_INTEGRATION) {
                z = true;
                break;
            }
        }
        if (z) {
            AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() {
                public void run() {
                    new AlertDialog.Builder(C1646a.this.f2304c.mo14333af().mo13822a()).setTitle("Review Integration Errors").setMessage("Looks like MAX Mediation Debugger flagged several errors in your build. Make sure to resolve these before you go live.\n\nNote that this prompt will only be shown in your development builds. Live apps will not be affected.").setPositiveButton("Show Mediation Debugger", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialogInterface, int i) {
                            C1646a.this.mo13389c();
                        }
                    }).setNegativeButton("DISMISS", (DialogInterface.OnClickListener) null).create().show();
                }
            }, TimeUnit.SECONDS.toMillis(2));
        }
    }

    /* renamed from: f */
    private void m3329f() {
        this.f2304c.mo14333af().mo13823a(new C2032a() {
            public void onActivityCreated(Activity activity, Bundle bundle) {
                if (activity instanceof MaxDebuggerActivity) {
                    C2092v.m5050f("AppLovinSdk", "Started mediation debugger");
                    if (!C1646a.this.m3330g() || C1646a.f2302a.get() != activity) {
                        MaxDebuggerActivity maxDebuggerActivity = (MaxDebuggerActivity) activity;
                        WeakReference unused = C1646a.f2302a = new WeakReference(maxDebuggerActivity);
                        maxDebuggerActivity.setListAdapter(C1646a.this.f2306e, C1646a.this.f2304c.mo14333af());
                    }
                    C1646a.f2303b.set(false);
                }
            }

            public void onActivityDestroyed(Activity activity) {
                if (activity instanceof MaxDebuggerActivity) {
                    C2092v.m5050f("AppLovinSdk", "Mediation debugger destroyed");
                    WeakReference unused = C1646a.f2302a = null;
                }
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public boolean m3330g() {
        WeakReference<MaxDebuggerActivity> weakReference = f2302a;
        return (weakReference == null || weakReference.get() == null) ? false : true;
    }

    /* renamed from: a */
    public void mo13384a() {
        if (this.f2308g.compareAndSet(false, true)) {
            this.f2304c.mo14303S().mo14206a((C1877a) new C1666a(this, this.f2304c), C1908o.C1910a.MEDIATION_MAIN);
        }
    }

    /* renamed from: a */
    public void mo13362a(int i, String str, JSONObject jSONObject) {
        C2092v vVar = this.f2305d;
        vVar.mo14793e("MediationDebuggerService", "Unable to fetch mediation debugger info: server returned " + i);
        C2092v.m5053i("AppLovinSdk", "Unable to show mediation debugger.");
        this.f2306e.mo13510a((List<C1661b>) null, (List<C1655a>) null, (String) null, (String) null, (String) null, this.f2304c);
        this.f2308g.set(false);
    }

    /* renamed from: a */
    public void mo13364a(JSONObject jSONObject, int i) {
        List<C1661b> a = m3321a(jSONObject, this.f2304c);
        List<C1655a> a2 = m3322a(jSONObject, a, this.f2304c);
        JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONObject, "alert", (JSONObject) null);
        List<C1661b> list = a;
        this.f2306e.mo13510a(list, a2, JsonUtils.getString(jSONObject2, "title", (String) null), JsonUtils.getString(jSONObject2, "message", (String) null), JsonUtils.getString(jSONObject, "account_id", (String) null), this.f2304c);
        if (mo13388b()) {
            AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() {
                public void run() {
                    C1646a.this.mo13389c();
                }
            }, TimeUnit.SECONDS.toMillis((long) this.f2310i));
        } else {
            m3323a(a);
        }
    }

    /* renamed from: a */
    public void mo13387a(boolean z, int i) {
        this.f2309h = z;
        this.f2310i = i;
    }

    /* renamed from: b */
    public boolean mo13388b() {
        return this.f2309h;
    }

    /* renamed from: c */
    public void mo13389c() {
        mo13384a();
        if (m3330g() || !f2303b.compareAndSet(false, true)) {
            C2092v.m5053i("AppLovinSdk", "Mediation debugger is already showing");
            return;
        }
        if (!this.f2311j) {
            m3329f();
            this.f2311j = true;
        }
        Intent intent = new Intent(this.f2312k, MaxDebuggerActivity.class);
        intent.setFlags(268435456);
        C2092v.m5050f("AppLovinSdk", "Starting mediation debugger...");
        this.f2312k.startActivity(intent);
    }

    public String toString() {
        return "MediationDebuggerService{, listAdapter=" + this.f2306e + "}";
    }
}

package com.p374my.tracker.obfuscated;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.p374my.tracker.obfuscated.C10123l0;
import com.p374my.tracker.obfuscated.C10126m;
import com.p374my.tracker.obfuscated.C10160p0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.my.tracker.obfuscated.p0 */
public final class C10160p0 {

    /* renamed from: a */
    final Context f25437a;

    /* renamed from: b */
    final C10126m f25438b;

    /* renamed from: c */
    final C10126m.C10128b f25439c = new C10126m.C10128b() {
        /* renamed from: a */
        public final void mo65989a(List list) {
            C10160p0.this.mo66362b(list);
        }
    };

    /* renamed from: com.my.tracker.obfuscated.p0$a */
    final class C10161a implements C10123l0.C10125b {

        /* renamed from: a */
        private final List<C10164q0> f25440a;

        C10161a(List<C10164q0> list) {
            this.f25440a = list;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public /* synthetic */ void m30387a(Map map) {
            for (C10164q0 next : this.f25440a) {
                next.mo66370a((JSONObject) map.get(next.mo66373c()));
            }
            C10160p0.this.f25438b.mo66250b(this.f25440a);
        }

        /* renamed from: a */
        public void mo66227a(int i, Map<String, JSONObject> map) {
            if (i == 1) {
                C10175u0.m30444b("PurchaseHandler error: can't retrieve information about products");
            } else {
                C10104d.m30023a(new Runnable(map) {
                    public final /* synthetic */ Map f$1;

                    {
                        this.f$1 = r2;
                    }

                    public final void run() {
                        C10160p0.C10161a.this.m30387a(this.f$1);
                    }
                });
            }
        }
    }

    private C10160p0(C10126m mVar, Context context) {
        this.f25438b = mVar;
        this.f25437a = context.getApplicationContext();
    }

    /* renamed from: a */
    public static C10160p0 m30378a(C10126m mVar, Context context) {
        return new C10160p0(mVar, context);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m30379a(String str, String str2) {
        C10164q0 a = C10164q0.m30400a(str, str2, C10173t0.m30433a());
        if (a != null) {
            this.f25438b.mo66243a((List<C10164q0>) Collections.singletonList(a), this.f25439c);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m30380a(List list) {
        C10175u0.m30440a("PurchaseHandler: iterating over unchecked list of objects");
        ArrayList arrayList = new ArrayList();
        for (Object a : list) {
            C10164q0 a2 = C10123l0.m30161a(a);
            if (a2 == null) {
                C10175u0.m30440a("PurchaseHandler: null purchase data after processing");
            } else {
                arrayList.add(a2);
            }
        }
        if (arrayList.isEmpty()) {
            C10175u0.m30440a("PurchaseHandler: skip empty purchases list");
        } else {
            this.f25438b.mo66243a((List<C10164q0>) arrayList, this.f25439c);
        }
    }

    /* renamed from: a */
    public void mo66357a() {
        this.f25438b.mo66236a(this.f25439c);
    }

    /* renamed from: a */
    public void mo66358a(int i, Intent intent) {
        if (i != -1) {
            C10175u0.m30440a("PurchaseHandler: result code isn't equal to RESULT_OK");
        } else if (intent == null) {
            C10175u0.m30440a("PurchaseHandler: empty intent has been received");
        } else {
            String stringExtra = intent.getStringExtra("INAPP_PURCHASE_DATA");
            if (TextUtils.isEmpty(stringExtra)) {
                C10175u0.m30440a("PurchaseHandler: empty purchase data in intent");
                return;
            }
            String stringExtra2 = intent.getStringExtra("INAPP_DATA_SIGNATURE");
            if (stringExtra2 == null) {
                C10175u0.m30440a("PurchaseHandler: null data signature in intent");
            } else {
                C10104d.m30023a(new Runnable(stringExtra, stringExtra2) {
                    public final /* synthetic */ String f$1;
                    public final /* synthetic */ String f$2;

                    {
                        this.f$1 = r2;
                        this.f$2 = r3;
                    }

                    public final void run() {
                        C10160p0.this.m30379a(this.f$1, this.f$2);
                    }
                });
            }
        }
    }

    /* renamed from: a */
    public void mo66359a(int i, List<Object> list) {
        if (i != 0) {
            C10175u0.m30440a("PurchaseHandler: response code isn't equal to BILLING_OK_RESPONSE_CODE");
        } else if (list == null || list.isEmpty()) {
            C10175u0.m30440a("PurchaseHandler: null or empty purchases list has been received");
        } else if (!C10123l0.f25235g.booleanValue()) {
            C10175u0.m30444b("PurchaseHandler error: classes com.android.billingclient:billing aren't found");
        } else {
            C10104d.m30023a(new Runnable(list) {
                public final /* synthetic */ List f$1;

                {
                    this.f$1 = r2;
                }

                public final void run() {
                    C10160p0.this.m30380a(this.f$1);
                }
            });
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo66360a(List<C10164q0> list, boolean z) {
        if (list.isEmpty()) {
            C10175u0.m30440a(z ? "PurchaseHandler: empty inapp raw purchases list" : "PurchaseHandler: empty subs raw purchases list");
        } else {
            C10123l0.m30164a(list, z, (C10123l0.C10125b) new C10161a(list), this.f25437a);
        }
    }

    /* renamed from: a */
    public void mo66361a(JSONObject jSONObject, JSONObject jSONObject2, String str, Map<String, String> map) {
        this.f25438b.mo66244a(jSONObject, jSONObject2, str, map);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo66362b(List<C10164q0> list) {
        C10175u0.m30440a("PurchaseHandler: processing raw purchases");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (C10164q0 next : list) {
            String c = next.mo66373c();
            if (next.mo66377g()) {
                C10175u0.m30440a("PurchaseHandler: inapp raw purchase, product id: " + c);
                arrayList2.add(next);
            } else {
                C10175u0.m30440a("PurchaseHandler: subs raw purchase, product id: " + c);
                arrayList.add(next);
            }
        }
        mo66360a((List<C10164q0>) arrayList, false);
        mo66360a((List<C10164q0>) arrayList2, true);
    }
}

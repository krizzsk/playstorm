package com.adcolony.sdk;

import com.adcolony.sdk.C0817e0;
import org.json.JSONException;

/* renamed from: com.adcolony.sdk.h0 */
class C0841h0 {

    /* renamed from: a */
    private String f479a;

    /* renamed from: b */
    private C0823f1 f480b;

    C0841h0(C0823f1 f1Var) {
        if (f1Var == null) {
            try {
                f1Var = new C0823f1();
            } catch (JSONException e) {
                new C0817e0.C0818a().mo10684a("JSON Error in ADCMessage constructor: ").mo10684a(e.toString()).mo10685a(C0817e0.f434i);
                return;
            }
        }
        this.f480b = f1Var;
        this.f479a = f1Var.mo10734e("m_type");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C0841h0 mo10773a(C0823f1 f1Var) {
        try {
            C0841h0 h0Var = new C0841h0("reply", this.f480b.mo10724b("m_origin"), f1Var);
            h0Var.f480b.mo10726b("m_id", this.f480b.mo10724b("m_id"));
            return h0Var;
        } catch (JSONException e) {
            new C0817e0.C0818a().mo10684a("JSON error in ADCMessage's createReply(): ").mo10684a(e.toString()).mo10685a(C0817e0.f434i);
            return new C0841h0("JSONException", 0);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo10775b(C0823f1 f1Var) {
        if (f1Var == null) {
            f1Var = new C0823f1();
        }
        this.f480b = f1Var;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo10776c() {
        C0714a.m134a(this.f479a, this.f480b);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public String mo10774b() {
        return this.f479a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C0823f1 mo10772a() {
        return this.f480b;
    }

    C0841h0(String str, int i) {
        try {
            this.f479a = str;
            C0823f1 f1Var = new C0823f1();
            this.f480b = f1Var;
            f1Var.mo10726b("m_target", i);
        } catch (JSONException e) {
            new C0817e0.C0818a().mo10684a("JSON Error in ADCMessage constructor: ").mo10684a(e.toString()).mo10685a(C0817e0.f434i);
        }
    }

    C0841h0(String str, int i, C0823f1 f1Var) {
        try {
            this.f479a = str;
            f1Var = f1Var == null ? new C0823f1() : f1Var;
            this.f480b = f1Var;
            f1Var.mo10726b("m_target", i);
        } catch (JSONException e) {
            new C0817e0.C0818a().mo10684a("JSON Error in ADCMessage constructor: ").mo10684a(e.toString()).mo10685a(C0817e0.f434i);
        }
    }
}

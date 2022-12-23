package com.ogury.p375cm.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.smaato.sdk.core.gdpr.CmpApiConstants;

/* renamed from: com.ogury.cm.internal.aaacb */
public final class aaacb {

    /* renamed from: a */
    private final SharedPreferences f25631a;

    /* renamed from: b */
    private SharedPreferences.OnSharedPreferenceChangeListener f25632b = new SharedPreferences.OnSharedPreferenceChangeListener(this) {

        /* renamed from: a */
        final /* synthetic */ aaacb f25634a;

        {
            this.f25634a = r1;
        }

        public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
            aaaaa a;
            if (bbabc.m30942a((Object) str, (Object) CmpApiConstants.IABTCF_TC_STRING) && (a = this.f25634a.f25633c) != null) {
                a.mo66515a();
            }
        }
    };
    /* access modifiers changed from: private */

    /* renamed from: c */
    public aaaaa f25633c;

    /* renamed from: com.ogury.cm.internal.aaacb$aaaaa */
    public interface aaaaa {
        /* renamed from: a */
        void mo66515a();
    }

    public aaacb(Context context) {
        bbabc.m30943b(context, "context");
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        bbabc.m30940a((Object) defaultSharedPreferences, "PreferenceManager.getDef…haredPreferences(context)");
        this.f25631a = defaultSharedPreferences;
    }

    /* renamed from: a */
    public final int mo66518a() {
        return this.f25631a.getInt(CmpApiConstants.IABTCF_POLICY_VERSION, 0);
    }

    /* renamed from: a */
    public final void mo66519a(aaaaa aaaaa2) {
        this.f25633c = aaaaa2;
        this.f25631a.registerOnSharedPreferenceChangeListener(this.f25632b);
    }

    /* renamed from: b */
    public final boolean mo66520b() {
        return this.f25631a.getInt(CmpApiConstants.IABTCF_GDPR_APPLIES, 0) == 1;
    }

    /* renamed from: c */
    public final boolean mo66521c() {
        return this.f25631a.contains(CmpApiConstants.IABTCF_TC_STRING);
    }

    /* renamed from: d */
    public final String mo66522d() {
        String string = this.f25631a.getString(CmpApiConstants.IABTCF_TC_STRING, "");
        bbabc.m30940a((Object) string, "sharedPreferences.getString(\"IABTCF_TCString\", \"\")");
        return string;
    }

    /* renamed from: e */
    public final int mo66523e() {
        return this.f25631a.getInt(CmpApiConstants.IABTCF_CMP_SDK_ID, 0);
    }
}

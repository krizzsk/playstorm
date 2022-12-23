package com.ogury.p375cm.internal;

import android.content.Context;
import android.content.SharedPreferences;
import com.ogury.p375cm.internal.aacaa;

/* renamed from: com.ogury.cm.internal.acccb */
public final class acccb extends accca {

    /* renamed from: b */
    public static final aaaaa f25867b = new aaaaa((bbabb) null);

    /* renamed from: c */
    private String f25868c = "cacheConsentV2";

    /* renamed from: com.ogury.cm.internal.acccb$aaaaa */
    public static final class aaaaa {
        private aaaaa() {
        }

        public /* synthetic */ aaaaa(bbabb bbabb) {
            this();
        }
    }

    /* renamed from: b */
    private static abcac m30873b() {
        abbba abbba = abbba.f25716a;
        return (abcac) abcab.m30772d();
    }

    /* renamed from: a */
    public final String mo66641a() {
        return this.f25868c;
    }

    /* renamed from: a */
    public final void mo66638a(Context context) {
        bbabc.m30943b(context, "context");
        super.mo66638a(context);
        abbba abbba = abbba.f25716a;
        if (abbba.m30729f("TCF")) {
            SharedPreferences.Editor edit = context.getSharedPreferences(this.f25868c, 0).edit();
            edit.putInt("purposes", m30873b().mo66593g());
            edit.putString("acceptedVendors", aacaa.aaaaa.m30660a(m30873b().mo66591e()));
            edit.putInt("specialFeatures", m30873b().mo66595i());
            edit.putString("vendorsLi", aacaa.aaaaa.m30660a(m30873b().mo66592f()));
            edit.putInt("purposesLi", m30873b().mo66594h());
            edit.putString("vendorPurposesAndSF", String.valueOf(m30873b().mo66597k()));
            edit.putInt("maxVendorId", m30873b().mo66598l());
            edit.apply();
        }
    }

    /* renamed from: c */
    public final void mo66640c(Context context) {
        bbabc.m30943b(context, "context");
        super.mo66640c(context);
        abbba abbba = abbba.f25716a;
        if (abbba.m30729f("TCF")) {
            SharedPreferences sharedPreferences = context.getSharedPreferences(this.f25868c, 0);
            abcac b = m30873b();
            b.mo66583a(sharedPreferences.getInt("purposes", 0));
            String string = sharedPreferences.getString("acceptedVendors", "");
            bbabc.m30940a((Object) string, "prefs.getString(ACCEPTED_VENDORS, \"\")");
            Object[] array = aacaa.aaaaa.m30661a(aacaa.aaaaa.m30664b(string)).toArray(new Integer[0]);
            if (array != null) {
                b.mo66585a((Integer[]) array);
                b.mo66589c(sharedPreferences.getInt("specialFeatures", 0));
                String string2 = sharedPreferences.getString("vendorsLi", "");
                bbabc.m30940a((Object) string2, "prefs.getString(VENDORS_LI, \"\")");
                Object[] array2 = aacaa.aaaaa.m30661a(aacaa.aaaaa.m30664b(string2)).toArray(new Integer[0]);
                if (array2 != null) {
                    b.mo66588b((Integer[]) array2);
                    b.mo66586b(sharedPreferences.getInt("purposesLi", 0));
                    String string3 = sharedPreferences.getString("vendorPurposesAndSF", "");
                    bbabc.m30940a((Object) string3, "prefs.getString(VENDOR_PURPOSES_AND_SF, \"\")");
                    b.mo66587b(aacaa.aaaaa.m30662a(string3));
                    b.mo66590d(sharedPreferences.getInt("maxVendorId", 0));
                    return;
                }
                throw new babca("null cannot be cast to non-null type kotlin.Array<T>");
            }
            throw new babca("null cannot be cast to non-null type kotlin.Array<T>");
        }
    }
}

package com.ogury.p375cm.internal;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.ads.AdRequest;
import com.ogury.p375cm.internal.aaccc;

/* renamed from: com.ogury.cm.internal.abbca */
public final class abbca {

    /* renamed from: a */
    public static final aaaaa f25733a = new aaaaa((bbabb) null);

    /* renamed from: b */
    private final SharedPreferences f25734b;

    /* renamed from: c */
    private final Context f25735c;

    /* renamed from: d */
    private final accba f25736d;

    /* renamed from: e */
    private final aabbb f25737e;

    /* renamed from: com.ogury.cm.internal.abbca$aaaaa */
    public static final class aaaaa {
        private aaaaa() {
        }

        public /* synthetic */ aaaaa(bbabb bbabb) {
            this();
        }
    }

    private abbca(Context context, accba accba, aabbb aabbb) {
        bbabc.m30943b(context, "context");
        bbabc.m30943b(accba, "sharedPrefsHandler");
        bbabc.m30943b(aabbb, "consentExternalCache");
        this.f25735c = context;
        this.f25736d = accba;
        this.f25737e = aabbb;
        SharedPreferences sharedPreferences = context.getSharedPreferences("migration", 0);
        bbabc.m30940a((Object) sharedPreferences, "context.getSharedPrefere…ME, Context.MODE_PRIVATE)");
        this.f25734b = sharedPreferences;
    }

    public /* synthetic */ abbca(Context context, accba accba, aabbb aabbb, int i, bbabb bbabb) {
        this(context, new accba((accca) null, (accbc) null, 3, (bbabb) null), new aabbb(context, abaab.f25687a));
    }

    /* renamed from: a */
    public final void mo66555a() {
        String string = this.f25734b.getString("migrated_version", AdRequest.VERSION);
        bbabc.m30940a((Object) string, "sharedPreferences.getStr…TED_VERSION_KEY, \"0.0.0\")");
        aaccc.aaaaa aaaaa2 = aaccc.f25680a;
        bbabc.m30943b(string, "version");
        bbcac b = new bbcbb("(0|[1-9]\\d*)?(?:\\.)?(0|[1-9]\\d*)?(?:\\.)?(0|[1-9]\\d*)?(?:-([\\dA-z\\-]+(?:\\.[\\dA-z\\-]+)*))?(?:\\+([\\dA-z\\-]+(?:\\.[\\dA-z\\-]+)*))?").mo66746b(string);
        if (b != null) {
            boolean z = true;
            int parseInt = b.mo66743a().get(1).length() == 0 ? 0 : Integer.parseInt(b.mo66743a().get(1));
            int parseInt2 = b.mo66743a().get(2).length() == 0 ? 0 : Integer.parseInt(b.mo66743a().get(2));
            int parseInt3 = b.mo66743a().get(3).length() == 0 ? 0 : Integer.parseInt(b.mo66743a().get(3));
            String str = b.mo66743a().get(4).length() == 0 ? null : b.mo66743a().get(4);
            if (b.mo66743a().get(5).length() != 0) {
                z = false;
            }
            aaccc aaccc = new aaccc(parseInt, parseInt2, parseInt3, str, z ? null : b.mo66743a().get(5));
            if (new aaccc(aaccc.mo66538a(), aaccc.mo66540b(), aaccc.mo66541c(), (String) null, (String) null, 24, (bbabb) null).compareTo(new aaccc(3, 3, 0, (String) null, (String) null, 24, (bbabb) null)) == -1) {
                this.f25736d.mo66637e(this.f25735c);
                this.f25737e.mo66531a();
            }
            SharedPreferences.Editor edit = this.f25734b.edit();
            edit.putString("migrated_version", "3.3.0");
            edit.apply();
            return;
        }
        throw new IllegalArgumentException("Invalid version string [" + string + ']');
    }
}

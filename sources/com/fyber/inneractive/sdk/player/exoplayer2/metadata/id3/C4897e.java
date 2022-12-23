package com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C5049u;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.e */
public final class C4897e extends C4904h {
    public static final Parcelable.Creator<C4897e> CREATOR = new C4898a();

    /* renamed from: b */
    public final String f13055b;

    /* renamed from: c */
    public final String f13056c;

    /* renamed from: d */
    public final String f13057d;

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.e$a */
    public class C4898a implements Parcelable.Creator<C4897e> {
        public Object createFromParcel(Parcel parcel) {
            return new C4897e(parcel);
        }

        public Object[] newArray(int i) {
            return new C4897e[i];
        }
    }

    public C4897e(String str, String str2, String str3) {
        super("COMM");
        this.f13055b = str;
        this.f13056c = str2;
        this.f13057d = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C4897e.class != obj.getClass()) {
            return false;
        }
        C4897e eVar = (C4897e) obj;
        if (!C5049u.m15393a((Object) this.f13056c, (Object) eVar.f13056c) || !C5049u.m15393a((Object) this.f13055b, (Object) eVar.f13055b) || !C5049u.m15393a((Object) this.f13057d, (Object) eVar.f13057d)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str = this.f13055b;
        int i = 0;
        int hashCode = ((str != null ? str.hashCode() : 0) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31;
        String str2 = this.f13056c;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f13057d;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode2 + i;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f13067a);
        parcel.writeString(this.f13055b);
        parcel.writeString(this.f13057d);
    }

    public C4897e(Parcel parcel) {
        super("COMM");
        this.f13055b = parcel.readString();
        this.f13056c = parcel.readString();
        this.f13057d = parcel.readString();
    }
}

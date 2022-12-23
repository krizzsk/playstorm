package com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C5049u;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.k */
public final class C4909k extends C4904h {
    public static final Parcelable.Creator<C4909k> CREATOR = new C4910a();

    /* renamed from: b */
    public final String f13072b;

    /* renamed from: c */
    public final String f13073c;

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.k$a */
    public class C4910a implements Parcelable.Creator<C4909k> {
        public Object createFromParcel(Parcel parcel) {
            return new C4909k(parcel);
        }

        public Object[] newArray(int i) {
            return new C4909k[i];
        }
    }

    public C4909k(String str, String str2, String str3) {
        super(str);
        this.f13072b = str2;
        this.f13073c = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C4909k.class != obj.getClass()) {
            return false;
        }
        C4909k kVar = (C4909k) obj;
        if (!this.f13067a.equals(kVar.f13067a) || !C5049u.m15393a((Object) this.f13072b, (Object) kVar.f13072b) || !C5049u.m15393a((Object) this.f13073c, (Object) kVar.f13073c)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int hashCode = (this.f13067a.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31;
        String str = this.f13072b;
        int i = 0;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f13073c;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode2 + i;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f13067a);
        parcel.writeString(this.f13072b);
        parcel.writeString(this.f13073c);
    }

    public C4909k(Parcel parcel) {
        super(parcel.readString());
        this.f13072b = parcel.readString();
        this.f13073c = parcel.readString();
    }
}

package com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C5049u;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.j */
public final class C4907j extends C4904h {
    public static final Parcelable.Creator<C4907j> CREATOR = new C4908a();

    /* renamed from: b */
    public final String f13070b;

    /* renamed from: c */
    public final String f13071c;

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.j$a */
    public class C4908a implements Parcelable.Creator<C4907j> {
        public Object createFromParcel(Parcel parcel) {
            return new C4907j(parcel);
        }

        public Object[] newArray(int i) {
            return new C4907j[i];
        }
    }

    public C4907j(String str, String str2, String str3) {
        super(str);
        this.f13070b = str2;
        this.f13071c = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C4907j.class != obj.getClass()) {
            return false;
        }
        C4907j jVar = (C4907j) obj;
        if (!this.f13067a.equals(jVar.f13067a) || !C5049u.m15393a((Object) this.f13070b, (Object) jVar.f13070b) || !C5049u.m15393a((Object) this.f13071c, (Object) jVar.f13071c)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int hashCode = (this.f13067a.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31;
        String str = this.f13070b;
        int i = 0;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f13071c;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode2 + i;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f13067a);
        parcel.writeString(this.f13070b);
        parcel.writeString(this.f13071c);
    }

    public C4907j(Parcel parcel) {
        super(parcel.readString());
        this.f13070b = parcel.readString();
        this.f13071c = parcel.readString();
    }
}

package com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C5049u;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.f */
public final class C4899f extends C4904h {
    public static final Parcelable.Creator<C4899f> CREATOR = new C4900a();

    /* renamed from: b */
    public final String f13058b;

    /* renamed from: c */
    public final String f13059c;

    /* renamed from: d */
    public final String f13060d;

    /* renamed from: e */
    public final byte[] f13061e;

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.f$a */
    public class C4900a implements Parcelable.Creator<C4899f> {
        public Object createFromParcel(Parcel parcel) {
            return new C4899f(parcel);
        }

        public Object[] newArray(int i) {
            return new C4899f[i];
        }
    }

    public C4899f(String str, String str2, String str3, byte[] bArr) {
        super("GEOB");
        this.f13058b = str;
        this.f13059c = str2;
        this.f13060d = str3;
        this.f13061e = bArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C4899f.class != obj.getClass()) {
            return false;
        }
        C4899f fVar = (C4899f) obj;
        if (!C5049u.m15393a((Object) this.f13058b, (Object) fVar.f13058b) || !C5049u.m15393a((Object) this.f13059c, (Object) fVar.f13059c) || !C5049u.m15393a((Object) this.f13060d, (Object) fVar.f13060d) || !Arrays.equals(this.f13061e, fVar.f13061e)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str = this.f13058b;
        int i = 0;
        int hashCode = ((str != null ? str.hashCode() : 0) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31;
        String str2 = this.f13059c;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f13060d;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return ((hashCode2 + i) * 31) + Arrays.hashCode(this.f13061e);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f13058b);
        parcel.writeString(this.f13059c);
        parcel.writeString(this.f13060d);
        parcel.writeByteArray(this.f13061e);
    }

    public C4899f(Parcel parcel) {
        super("GEOB");
        this.f13058b = parcel.readString();
        this.f13059c = parcel.readString();
        this.f13060d = parcel.readString();
        this.f13061e = parcel.createByteArray();
    }
}

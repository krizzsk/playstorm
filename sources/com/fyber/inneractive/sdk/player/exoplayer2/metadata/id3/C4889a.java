package com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C5049u;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.a */
public final class C4889a extends C4904h {
    public static final Parcelable.Creator<C4889a> CREATOR = new C4890a();

    /* renamed from: b */
    public final String f13039b;

    /* renamed from: c */
    public final String f13040c;

    /* renamed from: d */
    public final int f13041d;

    /* renamed from: e */
    public final byte[] f13042e;

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.a$a */
    public class C4890a implements Parcelable.Creator<C4889a> {
        public Object createFromParcel(Parcel parcel) {
            return new C4889a(parcel);
        }

        public Object[] newArray(int i) {
            return new C4889a[i];
        }
    }

    public C4889a(String str, String str2, int i, byte[] bArr) {
        super("APIC");
        this.f13039b = str;
        this.f13040c = str2;
        this.f13041d = i;
        this.f13042e = bArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C4889a.class != obj.getClass()) {
            return false;
        }
        C4889a aVar = (C4889a) obj;
        if (this.f13041d != aVar.f13041d || !C5049u.m15393a((Object) this.f13039b, (Object) aVar.f13039b) || !C5049u.m15393a((Object) this.f13040c, (Object) aVar.f13040c) || !Arrays.equals(this.f13042e, aVar.f13042e)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i = (this.f13041d + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31;
        String str = this.f13039b;
        int i2 = 0;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f13040c;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return ((hashCode + i2) * 31) + Arrays.hashCode(this.f13042e);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f13039b);
        parcel.writeString(this.f13040c);
        parcel.writeInt(this.f13041d);
        parcel.writeByteArray(this.f13042e);
    }

    public C4889a(Parcel parcel) {
        super("APIC");
        this.f13039b = parcel.readString();
        this.f13040c = parcel.readString();
        this.f13041d = parcel.readInt();
        this.f13042e = parcel.createByteArray();
    }
}

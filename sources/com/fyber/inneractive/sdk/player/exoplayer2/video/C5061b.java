package com.fyber.inneractive.sdk.player.exoplayer2.video;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.video.b */
public final class C5061b implements Parcelable {
    public static final Parcelable.Creator<C5061b> CREATOR = new C5062a();

    /* renamed from: a */
    public final int f13537a;

    /* renamed from: b */
    public final int f13538b;

    /* renamed from: c */
    public final int f13539c;

    /* renamed from: d */
    public final byte[] f13540d;

    /* renamed from: e */
    public int f13541e;

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.video.b$a */
    public class C5062a implements Parcelable.Creator<C5061b> {
        public Object createFromParcel(Parcel parcel) {
            return new C5061b(parcel);
        }

        public Object[] newArray(int i) {
            return new C5061b[0];
        }
    }

    public C5061b(int i, int i2, int i3, byte[] bArr) {
        this.f13537a = i;
        this.f13538b = i2;
        this.f13539c = i3;
        this.f13540d = bArr;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C5061b.class == obj.getClass()) {
            C5061b bVar = (C5061b) obj;
            return this.f13537a == bVar.f13537a && this.f13538b == bVar.f13538b && this.f13539c == bVar.f13539c && Arrays.equals(this.f13540d, bVar.f13540d);
        }
    }

    public int hashCode() {
        if (this.f13541e == 0) {
            this.f13541e = ((((((this.f13537a + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.f13538b) * 31) + this.f13539c) * 31) + Arrays.hashCode(this.f13540d);
        }
        return this.f13541e;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ColorInfo(");
        sb.append(this.f13537a);
        sb.append(", ");
        sb.append(this.f13538b);
        sb.append(", ");
        sb.append(this.f13539c);
        sb.append(", ");
        sb.append(this.f13540d != null);
        sb.append(")");
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f13537a);
        parcel.writeInt(this.f13538b);
        parcel.writeInt(this.f13539c);
        parcel.writeInt(this.f13540d != null ? 1 : 0);
        byte[] bArr = this.f13540d;
        if (bArr != null) {
            parcel.writeByteArray(bArr);
        }
    }

    public C5061b(Parcel parcel) {
        this.f13537a = parcel.readInt();
        this.f13538b = parcel.readInt();
        this.f13539c = parcel.readInt();
        this.f13540d = parcel.readInt() != 0 ? parcel.createByteArray() : null;
    }
}

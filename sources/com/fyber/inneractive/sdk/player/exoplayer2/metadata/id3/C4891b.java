package com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.b */
public final class C4891b extends C4904h {
    public static final Parcelable.Creator<C4891b> CREATOR = new C4892a();

    /* renamed from: b */
    public final byte[] f13043b;

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.b$a */
    public class C4892a implements Parcelable.Creator<C4891b> {
        public Object createFromParcel(Parcel parcel) {
            return new C4891b(parcel);
        }

        public Object[] newArray(int i) {
            return new C4891b[i];
        }
    }

    public C4891b(String str, byte[] bArr) {
        super(str);
        this.f13043b = bArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C4891b.class != obj.getClass()) {
            return false;
        }
        C4891b bVar = (C4891b) obj;
        if (!this.f13067a.equals(bVar.f13067a) || !Arrays.equals(this.f13043b, bVar.f13043b)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((this.f13067a.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + Arrays.hashCode(this.f13043b);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f13067a);
        parcel.writeByteArray(this.f13043b);
    }

    public C4891b(Parcel parcel) {
        super(parcel.readString());
        this.f13043b = parcel.createByteArray();
    }
}

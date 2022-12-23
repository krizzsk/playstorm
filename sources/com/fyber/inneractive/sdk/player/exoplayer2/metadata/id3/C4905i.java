package com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C5049u;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.i */
public final class C4905i extends C4904h {
    public static final Parcelable.Creator<C4905i> CREATOR = new C4906a();

    /* renamed from: b */
    public final String f13068b;

    /* renamed from: c */
    public final byte[] f13069c;

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.i$a */
    public class C4906a implements Parcelable.Creator<C4905i> {
        public Object createFromParcel(Parcel parcel) {
            return new C4905i(parcel);
        }

        public Object[] newArray(int i) {
            return new C4905i[i];
        }
    }

    public C4905i(String str, byte[] bArr) {
        super("PRIV");
        this.f13068b = str;
        this.f13069c = bArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C4905i.class != obj.getClass()) {
            return false;
        }
        C4905i iVar = (C4905i) obj;
        if (!C5049u.m15393a((Object) this.f13068b, (Object) iVar.f13068b) || !Arrays.equals(this.f13069c, iVar.f13069c)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str = this.f13068b;
        return (((str != null ? str.hashCode() : 0) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + Arrays.hashCode(this.f13069c);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f13068b);
        parcel.writeByteArray(this.f13069c);
    }

    public C4905i(Parcel parcel) {
        super("PRIV");
        this.f13068b = parcel.readString();
        this.f13069c = parcel.createByteArray();
    }
}

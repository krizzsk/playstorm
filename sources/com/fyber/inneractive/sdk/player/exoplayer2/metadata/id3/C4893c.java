package com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C5049u;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.c */
public final class C4893c extends C4904h {
    public static final Parcelable.Creator<C4893c> CREATOR = new C4894a();

    /* renamed from: b */
    public final String f13044b;

    /* renamed from: c */
    public final int f13045c;

    /* renamed from: d */
    public final int f13046d;

    /* renamed from: e */
    public final long f13047e;

    /* renamed from: f */
    public final long f13048f;

    /* renamed from: g */
    public final C4904h[] f13049g;

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.c$a */
    public class C4894a implements Parcelable.Creator<C4893c> {
        public Object createFromParcel(Parcel parcel) {
            return new C4893c(parcel);
        }

        public Object[] newArray(int i) {
            return new C4893c[i];
        }
    }

    public C4893c(String str, int i, int i2, long j, long j2, C4904h[] hVarArr) {
        super("CHAP");
        this.f13044b = str;
        this.f13045c = i;
        this.f13046d = i2;
        this.f13047e = j;
        this.f13048f = j2;
        this.f13049g = hVarArr;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C4893c.class != obj.getClass()) {
            return false;
        }
        C4893c cVar = (C4893c) obj;
        if (this.f13045c == cVar.f13045c && this.f13046d == cVar.f13046d && this.f13047e == cVar.f13047e && this.f13048f == cVar.f13048f && C5049u.m15393a((Object) this.f13044b, (Object) cVar.f13044b) && Arrays.equals(this.f13049g, cVar.f13049g)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i = (((((((this.f13045c + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.f13046d) * 31) + ((int) this.f13047e)) * 31) + ((int) this.f13048f)) * 31;
        String str = this.f13044b;
        return i + (str != null ? str.hashCode() : 0);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f13044b);
        parcel.writeInt(this.f13045c);
        parcel.writeInt(this.f13046d);
        parcel.writeLong(this.f13047e);
        parcel.writeLong(this.f13048f);
        parcel.writeInt(this.f13049g.length);
        for (C4904h writeParcelable : this.f13049g) {
            parcel.writeParcelable(writeParcelable, 0);
        }
    }

    public C4893c(Parcel parcel) {
        super("CHAP");
        this.f13044b = parcel.readString();
        this.f13045c = parcel.readInt();
        this.f13046d = parcel.readInt();
        this.f13047e = parcel.readLong();
        this.f13048f = parcel.readLong();
        int readInt = parcel.readInt();
        this.f13049g = new C4904h[readInt];
        for (int i = 0; i < readInt; i++) {
            this.f13049g[i] = (C4904h) parcel.readParcelable(C4904h.class.getClassLoader());
        }
    }
}

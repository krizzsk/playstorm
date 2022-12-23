package com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C5049u;
import java.util.Arrays;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.d */
public final class C4895d extends C4904h {
    public static final Parcelable.Creator<C4895d> CREATOR = new C4896a();

    /* renamed from: b */
    public final String f13050b;

    /* renamed from: c */
    public final boolean f13051c;

    /* renamed from: d */
    public final boolean f13052d;

    /* renamed from: e */
    public final String[] f13053e;

    /* renamed from: f */
    public final C4904h[] f13054f;

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.d$a */
    public class C4896a implements Parcelable.Creator<C4895d> {
        public Object createFromParcel(Parcel parcel) {
            return new C4895d(parcel);
        }

        public Object[] newArray(int i) {
            return new C4895d[i];
        }
    }

    public C4895d(String str, boolean z, boolean z2, String[] strArr, C4904h[] hVarArr) {
        super("CTOC");
        this.f13050b = str;
        this.f13051c = z;
        this.f13052d = z2;
        this.f13053e = strArr;
        this.f13054f = hVarArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C4895d.class != obj.getClass()) {
            return false;
        }
        C4895d dVar = (C4895d) obj;
        if (this.f13051c != dVar.f13051c || this.f13052d != dVar.f13052d || !C5049u.m15393a((Object) this.f13050b, (Object) dVar.f13050b) || !Arrays.equals(this.f13053e, dVar.f13053e) || !Arrays.equals(this.f13054f, dVar.f13054f)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i = ((((this.f13051c ? 1 : 0) + true) * 31) + (this.f13052d ? 1 : 0)) * 31;
        String str = this.f13050b;
        return i + (str != null ? str.hashCode() : 0);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f13050b);
        parcel.writeByte(this.f13051c ? (byte) 1 : 0);
        parcel.writeByte(this.f13052d ? (byte) 1 : 0);
        parcel.writeStringArray(this.f13053e);
        parcel.writeInt(this.f13054f.length);
        int i2 = 0;
        while (true) {
            C4904h[] hVarArr = this.f13054f;
            if (i2 < hVarArr.length) {
                parcel.writeParcelable(hVarArr[i2], 0);
                i2++;
            } else {
                return;
            }
        }
    }

    public C4895d(Parcel parcel) {
        super("CTOC");
        this.f13050b = parcel.readString();
        boolean z = true;
        this.f13051c = parcel.readByte() != 0;
        this.f13052d = parcel.readByte() == 0 ? false : z;
        this.f13053e = parcel.createStringArray();
        int readInt = parcel.readInt();
        this.f13054f = new C4904h[readInt];
        for (int i = 0; i < readInt; i++) {
            this.f13054f[i] = (C4904h) parcel.readParcelable(C4904h.class.getClassLoader());
        }
    }
}

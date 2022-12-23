package com.fyber.inneractive.sdk.player.exoplayer2.metadata;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.metadata.a */
public final class C4886a implements Parcelable {
    public static final Parcelable.Creator<C4886a> CREATOR = new C4887a();

    /* renamed from: a */
    public final C4888b[] f13038a;

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.metadata.a$a */
    public class C4887a implements Parcelable.Creator<C4886a> {
        public Object createFromParcel(Parcel parcel) {
            return new C4886a(parcel);
        }

        public Object[] newArray(int i) {
            return new C4886a[0];
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.metadata.a$b */
    public interface C4888b extends Parcelable {
    }

    public C4886a(List<? extends C4888b> list) {
        C4888b[] bVarArr = new C4888b[list.size()];
        this.f13038a = bVarArr;
        list.toArray(bVarArr);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C4886a.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f13038a, ((C4886a) obj).f13038a);
    }

    public int hashCode() {
        return Arrays.hashCode(this.f13038a);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f13038a.length);
        for (C4888b writeParcelable : this.f13038a) {
            parcel.writeParcelable(writeParcelable, 0);
        }
    }

    public C4886a(Parcel parcel) {
        this.f13038a = new C4888b[parcel.readInt()];
        int i = 0;
        while (true) {
            C4888b[] bVarArr = this.f13038a;
            if (i < bVarArr.length) {
                bVarArr[i] = (C4888b) parcel.readParcelable(C4888b.class.getClassLoader());
                i++;
            } else {
                return;
            }
        }
    }
}

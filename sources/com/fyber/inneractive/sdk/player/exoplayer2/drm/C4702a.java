package com.fyber.inneractive.sdk.player.exoplayer2.drm;

import android.os.Parcel;
import android.os.Parcelable;
import com.fyber.inneractive.sdk.player.exoplayer2.C4695b;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C5023a;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C5049u;
import java.util.Arrays;
import java.util.Comparator;
import java.util.UUID;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.drm.a */
public final class C4702a implements Comparator<C4704b>, Parcelable {
    public static final Parcelable.Creator<C4702a> CREATOR = new C4703a();

    /* renamed from: a */
    public final C4704b[] f11854a;

    /* renamed from: b */
    public int f11855b;

    /* renamed from: c */
    public final int f11856c;

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.drm.a$a */
    public class C4703a implements Parcelable.Creator<C4702a> {
        public Object createFromParcel(Parcel parcel) {
            return new C4702a(parcel);
        }

        public Object[] newArray(int i) {
            return new C4702a[i];
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: com.fyber.inneractive.sdk.player.exoplayer2.drm.a$b[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C4702a(boolean r4, com.fyber.inneractive.sdk.player.exoplayer2.drm.C4702a.C4704b... r5) {
        /*
            r3 = this;
            r3.<init>()
            if (r4 == 0) goto L_0x000c
            java.lang.Object r4 = r5.clone()
            r5 = r4
            com.fyber.inneractive.sdk.player.exoplayer2.drm.a$b[] r5 = (com.fyber.inneractive.sdk.player.exoplayer2.drm.C4702a.C4704b[]) r5
        L_0x000c:
            java.util.Arrays.sort(r5, r3)
            r4 = 1
        L_0x0010:
            int r0 = r5.length
            if (r4 >= r0) goto L_0x0047
            int r0 = r4 + -1
            r0 = r5[r0]
            java.util.UUID r0 = r0.f11858b
            r1 = r5[r4]
            java.util.UUID r1 = r1.f11858b
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x002a
            int r4 = r4 + 1
            goto L_0x0010
        L_0x002a:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Duplicate data for uuid: "
            r1.append(r2)
            r4 = r5[r4]
            java.util.UUID r4 = r4.f11858b
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
        L_0x0047:
            r3.f11854a = r5
            int r4 = r5.length
            r3.f11856c = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.drm.C4702a.<init>(boolean, com.fyber.inneractive.sdk.player.exoplayer2.drm.a$b[]):void");
    }

    public int compare(Object obj, Object obj2) {
        C4704b bVar = (C4704b) obj;
        C4704b bVar2 = (C4704b) obj2;
        UUID uuid = C4695b.f11831b;
        if (uuid.equals(bVar.f11858b)) {
            return uuid.equals(bVar2.f11858b) ? 0 : 1;
        }
        return bVar.f11858b.compareTo(bVar2.f11858b);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C4702a.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f11854a, ((C4702a) obj).f11854a);
    }

    public int hashCode() {
        if (this.f11855b == 0) {
            this.f11855b = Arrays.hashCode(this.f11854a);
        }
        return this.f11855b;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedArray(this.f11854a, 0);
    }

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.drm.a$b */
    public static final class C4704b implements Parcelable {
        public static final Parcelable.Creator<C4704b> CREATOR = new C4705a();

        /* renamed from: a */
        public int f11857a;

        /* renamed from: b */
        public final UUID f11858b;

        /* renamed from: c */
        public final String f11859c;

        /* renamed from: d */
        public final byte[] f11860d;

        /* renamed from: e */
        public final boolean f11861e;

        /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.drm.a$b$a */
        public class C4705a implements Parcelable.Creator<C4704b> {
            public Object createFromParcel(Parcel parcel) {
                return new C4704b(parcel);
            }

            public Object[] newArray(int i) {
                return new C4704b[i];
            }
        }

        public C4704b(UUID uuid, String str, byte[] bArr, boolean z) {
            this.f11858b = (UUID) C5023a.m15300a(uuid);
            this.f11859c = (String) C5023a.m15300a(str);
            this.f11860d = (byte[]) C5023a.m15300a(bArr);
            this.f11861e = z;
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C4704b)) {
                return false;
            }
            if (obj == this) {
                return true;
            }
            C4704b bVar = (C4704b) obj;
            if (!this.f11859c.equals(bVar.f11859c) || !C5049u.m15393a((Object) this.f11858b, (Object) bVar.f11858b) || !Arrays.equals(this.f11860d, bVar.f11860d)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            if (this.f11857a == 0) {
                this.f11857a = (((this.f11858b.hashCode() * 31) + this.f11859c.hashCode()) * 31) + Arrays.hashCode(this.f11860d);
            }
            return this.f11857a;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeLong(this.f11858b.getMostSignificantBits());
            parcel.writeLong(this.f11858b.getLeastSignificantBits());
            parcel.writeString(this.f11859c);
            parcel.writeByteArray(this.f11860d);
            parcel.writeByte(this.f11861e ? (byte) 1 : 0);
        }

        public C4704b(Parcel parcel) {
            this.f11858b = new UUID(parcel.readLong(), parcel.readLong());
            this.f11859c = parcel.readString();
            this.f11860d = parcel.createByteArray();
            this.f11861e = parcel.readByte() != 0;
        }
    }

    public C4702a(Parcel parcel) {
        C4704b[] bVarArr = (C4704b[]) parcel.createTypedArray(C4704b.CREATOR);
        this.f11854a = bVarArr;
        this.f11856c = bVarArr.length;
    }
}

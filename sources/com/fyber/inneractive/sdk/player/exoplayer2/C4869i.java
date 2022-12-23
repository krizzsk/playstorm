package com.fyber.inneractive.sdk.player.exoplayer2;

import android.media.MediaFormat;
import android.os.Parcel;
import android.os.Parcelable;
import com.fyber.inneractive.sdk.player.exoplayer2.drm.C4702a;
import com.fyber.inneractive.sdk.player.exoplayer2.metadata.C4886a;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C5049u;
import com.fyber.inneractive.sdk.player.exoplayer2.video.C5061b;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.i */
public final class C4869i implements Parcelable {
    public static final Parcelable.Creator<C4869i> CREATOR = new C4870a();

    /* renamed from: A */
    public int f12950A;

    /* renamed from: a */
    public final String f12951a;

    /* renamed from: b */
    public final int f12952b;

    /* renamed from: c */
    public final String f12953c;

    /* renamed from: d */
    public final C4886a f12954d;

    /* renamed from: e */
    public final String f12955e;

    /* renamed from: f */
    public final String f12956f;

    /* renamed from: g */
    public final int f12957g;

    /* renamed from: h */
    public final List<byte[]> f12958h;

    /* renamed from: i */
    public final C4702a f12959i;

    /* renamed from: j */
    public final int f12960j;

    /* renamed from: k */
    public final int f12961k;

    /* renamed from: l */
    public final float f12962l;

    /* renamed from: m */
    public final int f12963m;

    /* renamed from: n */
    public final float f12964n;

    /* renamed from: o */
    public final int f12965o;

    /* renamed from: p */
    public final byte[] f12966p;

    /* renamed from: q */
    public final C5061b f12967q;

    /* renamed from: r */
    public final int f12968r;

    /* renamed from: s */
    public final int f12969s;

    /* renamed from: t */
    public final int f12970t;

    /* renamed from: u */
    public final int f12971u;

    /* renamed from: v */
    public final int f12972v;

    /* renamed from: w */
    public final long f12973w;

    /* renamed from: x */
    public final int f12974x;

    /* renamed from: y */
    public final String f12975y;

    /* renamed from: z */
    public final int f12976z;

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.i$a */
    public class C4870a implements Parcelable.Creator<C4869i> {
        public Object createFromParcel(Parcel parcel) {
            return new C4869i(parcel);
        }

        public Object[] newArray(int i) {
            return new C4869i[i];
        }
    }

    public C4869i(String str, String str2, String str3, String str4, int i, int i2, int i3, int i4, float f, int i5, float f2, byte[] bArr, int i6, C5061b bVar, int i7, int i8, int i9, int i10, int i11, int i12, String str5, int i13, long j, List<byte[]> list, C4702a aVar, C4886a aVar2) {
        this.f12951a = str;
        this.f12955e = str2;
        this.f12956f = str3;
        this.f12953c = str4;
        this.f12952b = i;
        this.f12957g = i2;
        this.f12960j = i3;
        this.f12961k = i4;
        this.f12962l = f;
        this.f12963m = i5;
        this.f12964n = f2;
        this.f12966p = bArr;
        this.f12965o = i6;
        this.f12967q = bVar;
        this.f12968r = i7;
        this.f12969s = i8;
        this.f12970t = i9;
        this.f12971u = i10;
        this.f12972v = i11;
        this.f12974x = i12;
        this.f12975y = str5;
        this.f12976z = i13;
        this.f12973w = j;
        this.f12958h = list == null ? Collections.emptyList() : list;
        this.f12959i = aVar;
        this.f12954d = aVar2;
    }

    /* renamed from: a */
    public static C4869i m14972a(String str, String str2, String str3, int i, int i2, int i3, int i4, float f, List<byte[]> list, int i5, float f2, C4702a aVar) {
        return m14973a(str, str2, (String) null, i, i2, i3, i4, f, list, i5, f2, (byte[]) null, -1, (C5061b) null, (C4702a) null);
    }

    /* renamed from: b */
    public int mo25375b() {
        int i;
        int i2 = this.f12960j;
        if (i2 == -1 || (i = this.f12961k) == -1) {
            return -1;
        }
        return i2 * i;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C4869i.class == obj.getClass()) {
            C4869i iVar = (C4869i) obj;
            if (this.f12952b == iVar.f12952b && this.f12957g == iVar.f12957g && this.f12960j == iVar.f12960j && this.f12961k == iVar.f12961k && this.f12962l == iVar.f12962l && this.f12963m == iVar.f12963m && this.f12964n == iVar.f12964n && this.f12965o == iVar.f12965o && this.f12968r == iVar.f12968r && this.f12969s == iVar.f12969s && this.f12970t == iVar.f12970t && this.f12971u == iVar.f12971u && this.f12972v == iVar.f12972v && this.f12973w == iVar.f12973w && this.f12974x == iVar.f12974x && C5049u.m15393a((Object) this.f12951a, (Object) iVar.f12951a) && C5049u.m15393a((Object) this.f12975y, (Object) iVar.f12975y) && this.f12976z == iVar.f12976z && C5049u.m15393a((Object) this.f12955e, (Object) iVar.f12955e) && C5049u.m15393a((Object) this.f12956f, (Object) iVar.f12956f) && C5049u.m15393a((Object) this.f12953c, (Object) iVar.f12953c) && C5049u.m15393a((Object) this.f12959i, (Object) iVar.f12959i) && C5049u.m15393a((Object) this.f12954d, (Object) iVar.f12954d) && C5049u.m15393a((Object) this.f12967q, (Object) iVar.f12967q) && Arrays.equals(this.f12966p, iVar.f12966p) && this.f12958h.size() == iVar.f12958h.size()) {
                for (int i = 0; i < this.f12958h.size(); i++) {
                    if (!Arrays.equals(this.f12958h.get(i), iVar.f12958h.get(i))) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        if (this.f12950A == 0) {
            String str = this.f12951a;
            int i = 0;
            int hashCode = ((str == null ? 0 : str.hashCode()) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31;
            String str2 = this.f12955e;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f12956f;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.f12953c;
            int hashCode4 = (((((((((((hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31) + this.f12952b) * 31) + this.f12960j) * 31) + this.f12961k) * 31) + this.f12968r) * 31) + this.f12969s) * 31;
            String str5 = this.f12975y;
            int hashCode5 = (((hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31) + this.f12976z) * 31;
            C4702a aVar = this.f12959i;
            int hashCode6 = (hashCode5 + (aVar == null ? 0 : aVar.hashCode())) * 31;
            C4886a aVar2 = this.f12954d;
            if (aVar2 != null) {
                i = Arrays.hashCode(aVar2.f13038a);
            }
            this.f12950A = hashCode6 + i;
        }
        return this.f12950A;
    }

    public String toString() {
        return "Format(" + this.f12951a + ", " + this.f12955e + ", " + this.f12956f + ", " + this.f12952b + ", " + this.f12975y + ", [" + this.f12960j + ", " + this.f12961k + ", " + this.f12962l + "], [" + this.f12968r + ", " + this.f12969s + "])";
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f12951a);
        parcel.writeString(this.f12955e);
        parcel.writeString(this.f12956f);
        parcel.writeString(this.f12953c);
        parcel.writeInt(this.f12952b);
        parcel.writeInt(this.f12957g);
        parcel.writeInt(this.f12960j);
        parcel.writeInt(this.f12961k);
        parcel.writeFloat(this.f12962l);
        parcel.writeInt(this.f12963m);
        parcel.writeFloat(this.f12964n);
        parcel.writeInt(this.f12966p != null ? 1 : 0);
        byte[] bArr = this.f12966p;
        if (bArr != null) {
            parcel.writeByteArray(bArr);
        }
        parcel.writeInt(this.f12965o);
        parcel.writeParcelable(this.f12967q, i);
        parcel.writeInt(this.f12968r);
        parcel.writeInt(this.f12969s);
        parcel.writeInt(this.f12970t);
        parcel.writeInt(this.f12971u);
        parcel.writeInt(this.f12972v);
        parcel.writeInt(this.f12974x);
        parcel.writeString(this.f12975y);
        parcel.writeInt(this.f12976z);
        parcel.writeLong(this.f12973w);
        int size = this.f12958h.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            parcel.writeByteArray(this.f12958h.get(i2));
        }
        parcel.writeParcelable(this.f12959i, 0);
        parcel.writeParcelable(this.f12954d, 0);
    }

    /* renamed from: a */
    public static C4869i m14973a(String str, String str2, String str3, int i, int i2, int i3, int i4, float f, List<byte[]> list, int i5, float f2, byte[] bArr, int i6, C5061b bVar, C4702a aVar) {
        return new C4869i(str, (String) null, str2, str3, i, i2, i3, i4, f, i5, f2, bArr, i6, bVar, -1, -1, -1, -1, -1, 0, (String) null, -1, Long.MAX_VALUE, list, aVar, (C4886a) null);
    }

    /* renamed from: a */
    public static C4869i m14975a(String str, String str2, String str3, int i, int i2, int i3, int i4, int i5, List<byte[]> list, C4702a aVar, int i6, String str4) {
        return m14974a(str, str2, str3, i, i2, i3, i4, i5, -1, -1, list, aVar, i6, str4, (C4886a) null);
    }

    /* renamed from: a */
    public static C4869i m14974a(String str, String str2, String str3, int i, int i2, int i3, int i4, int i5, int i6, int i7, List<byte[]> list, C4702a aVar, int i8, String str4, C4886a aVar2) {
        return new C4869i(str, (String) null, str2, str3, i, i2, -1, -1, -1.0f, -1, -1.0f, (byte[]) null, -1, (C5061b) null, i3, i4, i5, i6, i7, i8, str4, -1, Long.MAX_VALUE, list, aVar, aVar2);
    }

    /* renamed from: a */
    public static C4869i m14980a(String str, String str2, String str3, String str4, int i, int i2, String str5, int i3) {
        return new C4869i(str, str2, str3, str4, i, -1, -1, -1, -1.0f, -1, -1.0f, (byte[]) null, -1, (C5061b) null, -1, -1, -1, -1, -1, i2, str5, i3, Long.MAX_VALUE, (List<byte[]>) null, (C4702a) null, (C4886a) null);
    }

    /* renamed from: a */
    public static C4869i m14977a(String str, String str2, String str3, int i, int i2, String str4, C4702a aVar) {
        return m14976a(str, str2, (String) null, i, i2, str4, -1, aVar, Long.MAX_VALUE, Collections.emptyList());
    }

    /* renamed from: a */
    public static C4869i m14976a(String str, String str2, String str3, int i, int i2, String str4, int i3, C4702a aVar, long j, List<byte[]> list) {
        return new C4869i(str, (String) null, str2, str3, i, -1, -1, -1, -1.0f, -1, -1.0f, (byte[]) null, -1, (C5061b) null, -1, -1, -1, -1, -1, i2, str4, i3, j, list, aVar, (C4886a) null);
    }

    /* renamed from: a */
    public static C4869i m14979a(String str, String str2, String str3, int i, List<byte[]> list, String str4, C4702a aVar) {
        return new C4869i(str, (String) null, str2, (String) null, i, -1, -1, -1, -1.0f, -1, -1.0f, (byte[]) null, -1, (C5061b) null, -1, -1, -1, -1, -1, 0, str4, -1, Long.MAX_VALUE, list, aVar, (C4886a) null);
    }

    /* renamed from: a */
    public static C4869i m14971a(String str, String str2, long j) {
        return new C4869i((String) null, (String) null, str2, (String) null, -1, -1, -1, -1, -1.0f, -1, -1.0f, (byte[]) null, -1, (C5061b) null, -1, -1, -1, -1, -1, 0, (String) null, -1, j, (List<byte[]>) null, (C4702a) null, (C4886a) null);
    }

    /* renamed from: a */
    public static C4869i m14978a(String str, String str2, String str3, int i, C4702a aVar) {
        return new C4869i(str, (String) null, str2, (String) null, i, -1, -1, -1, -1.0f, -1, -1.0f, (byte[]) null, -1, (C5061b) null, -1, -1, -1, -1, -1, 0, (String) null, -1, Long.MAX_VALUE, (List<byte[]>) null, aVar, (C4886a) null);
    }

    /* renamed from: a */
    public C4869i mo25374a(long j) {
        return new C4869i(this.f12951a, this.f12955e, this.f12956f, this.f12953c, this.f12952b, this.f12957g, this.f12960j, this.f12961k, this.f12962l, this.f12963m, this.f12964n, this.f12966p, this.f12965o, this.f12967q, this.f12968r, this.f12969s, this.f12970t, this.f12971u, this.f12972v, this.f12974x, this.f12975y, this.f12976z, j, this.f12958h, this.f12959i, this.f12954d);
    }

    /* renamed from: a */
    public final MediaFormat mo25373a() {
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", this.f12956f);
        String str = this.f12975y;
        if (str != null) {
            mediaFormat.setString("language", str);
        }
        m14981a(mediaFormat, "max-input-size", this.f12957g);
        m14981a(mediaFormat, "width", this.f12960j);
        m14981a(mediaFormat, "height", this.f12961k);
        float f = this.f12962l;
        if (f != -1.0f) {
            mediaFormat.setFloat("frame-rate", f);
        }
        m14981a(mediaFormat, "rotation-degrees", this.f12963m);
        m14981a(mediaFormat, "channel-count", this.f12968r);
        m14981a(mediaFormat, "sample-rate", this.f12969s);
        m14981a(mediaFormat, "encoder-delay", this.f12971u);
        m14981a(mediaFormat, "encoder-padding", this.f12972v);
        for (int i = 0; i < this.f12958h.size(); i++) {
            mediaFormat.setByteBuffer("csd-" + i, ByteBuffer.wrap(this.f12958h.get(i)));
        }
        C5061b bVar = this.f12967q;
        if (bVar != null) {
            m14981a(mediaFormat, "color-transfer", bVar.f13539c);
            m14981a(mediaFormat, "color-standard", bVar.f13537a);
            m14981a(mediaFormat, "color-range", bVar.f13538b);
            byte[] bArr = bVar.f13540d;
            if (bArr != null) {
                mediaFormat.setByteBuffer("hdr-static-info", ByteBuffer.wrap(bArr));
            }
        }
        return mediaFormat;
    }

    public C4869i(Parcel parcel) {
        this.f12951a = parcel.readString();
        this.f12955e = parcel.readString();
        this.f12956f = parcel.readString();
        this.f12953c = parcel.readString();
        this.f12952b = parcel.readInt();
        this.f12957g = parcel.readInt();
        this.f12960j = parcel.readInt();
        this.f12961k = parcel.readInt();
        this.f12962l = parcel.readFloat();
        this.f12963m = parcel.readInt();
        this.f12964n = parcel.readFloat();
        this.f12966p = parcel.readInt() != 0 ? parcel.createByteArray() : null;
        this.f12965o = parcel.readInt();
        this.f12967q = (C5061b) parcel.readParcelable(C5061b.class.getClassLoader());
        this.f12968r = parcel.readInt();
        this.f12969s = parcel.readInt();
        this.f12970t = parcel.readInt();
        this.f12971u = parcel.readInt();
        this.f12972v = parcel.readInt();
        this.f12974x = parcel.readInt();
        this.f12975y = parcel.readString();
        this.f12976z = parcel.readInt();
        this.f12973w = parcel.readLong();
        int readInt = parcel.readInt();
        this.f12958h = new ArrayList(readInt);
        for (int i = 0; i < readInt; i++) {
            this.f12958h.add(parcel.createByteArray());
        }
        this.f12959i = (C4702a) parcel.readParcelable(C4702a.class.getClassLoader());
        this.f12954d = (C4886a) parcel.readParcelable(C4886a.class.getClassLoader());
    }

    /* renamed from: a */
    public static void m14981a(MediaFormat mediaFormat, String str, int i) {
        if (i != -1) {
            mediaFormat.setInteger(str, i);
        }
    }
}

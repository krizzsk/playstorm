package com.mbridge.msdk.foundation.tools;

import com.google.common.base.Ascii;
import com.mbridge.msdk.foundation.tools.FastKV;
import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: com.mbridge.msdk.foundation.tools.ab */
/* compiled from: StringSetEncoder */
final class C8555ab implements FastKV.C8549a<Set<String>> {

    /* renamed from: a */
    static final C8555ab f20700a = new C8555ab();

    /* renamed from: a */
    public final String mo57742a() {
        return "StringSet";
    }

    /* renamed from: a */
    public final /* synthetic */ byte[] mo57743a(Object obj) {
        Set<String> set = (Set) obj;
        if (set.isEmpty()) {
            return new byte[0];
        }
        int size = set.size();
        int[] iArr = new int[size];
        String[] strArr = new String[size];
        int i = 0;
        int i2 = 0;
        for (String str : set) {
            if (str == null) {
                i += 5;
                iArr[i2] = -1;
            } else {
                int b = C8579i.m24770b(str);
                strArr[i2] = str;
                iArr[i2] = b;
                i += ((b >> 7) == 0 ? 1 : (b >> 14) == 0 ? 2 : (b >> 21) == 0 ? 3 : (b >> 28) == 0 ? 4 : 5) + b;
            }
            i2++;
        }
        C8579i iVar = new C8579i(i);
        for (int i3 = 0; i3 < size; i3++) {
            int i4 = iArr[i3];
            int i5 = iVar.f20732b;
            int i6 = i4;
            while ((i6 & -128) != 0) {
                iVar.f20731a[i5] = (byte) ((i6 & 127) | 128);
                i6 >>>= 7;
                i5++;
            }
            iVar.f20731a[i5] = (byte) i6;
            iVar.f20732b = i5 + 1;
            if (i4 >= 0) {
                iVar.mo57756a(strArr[i3]);
            }
        }
        return iVar.f20731a;
    }

    private C8555ab() {
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo57741a(byte[] bArr, int i, int i2) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (i2 > 0) {
            C8579i iVar = new C8579i(bArr, i);
            int i3 = i + i2;
            while (iVar.f20732b < i3) {
                byte[] bArr2 = iVar.f20731a;
                int i4 = iVar.f20732b;
                iVar.f20732b = i4 + 1;
                byte b = bArr2[i4];
                if ((b >> 7) != 0) {
                    byte[] bArr3 = iVar.f20731a;
                    int i5 = iVar.f20732b;
                    iVar.f20732b = i5 + 1;
                    b = (b & Byte.MAX_VALUE) | (bArr3[i5] << 7);
                    if ((b >> Ascii.f17945SO) != 0) {
                        byte[] bArr4 = iVar.f20731a;
                        int i6 = iVar.f20732b;
                        iVar.f20732b = i6 + 1;
                        b = (b & 16383) | (bArr4[i6] << Ascii.f17945SO);
                        if ((b >> Ascii.NAK) != 0) {
                            byte[] bArr5 = iVar.f20731a;
                            int i7 = iVar.f20732b;
                            iVar.f20732b = i7 + 1;
                            b = (b & 2097151) | (bArr5[i7] << Ascii.NAK);
                            if ((b >> Ascii.f17938FS) != 0) {
                                byte[] bArr6 = iVar.f20731a;
                                int i8 = iVar.f20732b;
                                iVar.f20732b = i8 + 1;
                                b = (b & 268435455) | (bArr6[i8] << Ascii.f17938FS);
                            }
                        }
                    }
                }
                linkedHashSet.add(iVar.mo57760b((int) b));
            }
            if (iVar.f20732b != i3) {
                throw new IllegalArgumentException("Invalid String set");
            }
        }
        return linkedHashSet;
    }
}

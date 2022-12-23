package p398ms.p399bd.p400o.Pgl;

import android.content.Context;
import android.os.Process;
import com.google.common.base.Ascii;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import p398ms.p399bd.p400o.Pgl.pblb;

/* renamed from: ms.bd.o.Pgl.pblo */
public abstract class pblo extends pblb.pgla {
    /* renamed from: a */
    public Object mo76450a(int i, int i2, long j, String str, Object obj) throws Throwable {
        boolean z;
        String[] strArr = {(String) pblk.m34714a(16777217, 0, 0, "ce879f", new byte[]{115, 105, 79, 81, 9, 120, 100, 10, 121, 98, 96, 106, 66, 80, Ascii.NAK, 120, 111, 74, 39, 78, 92, 83, 110, 113, 40, 84, 84})};
        try {
            Context b = pgla.m34772a().mo76482b();
            int i3 = 0;
            while (true) {
                if (i3 >= 1) {
                    z = true;
                    break;
                } else if (b.checkPermission(strArr[i3], Process.myPid(), Process.myUid()) != 0) {
                    break;
                } else {
                    i3++;
                }
            }
        } catch (Throwable unused) {
        }
        z = false;
        if (!z) {
            return null;
        }
        switch (i) {
            case 196609:
                Object[] objArr = (Object[]) obj;
                return mo76448a(str, (byte[]) objArr[0], (String) objArr[1], (String) objArr[2]);
            case 196610:
                Object[] objArr2 = (Object[]) obj;
                return mo76449b(str, (String) objArr2[0], (String) objArr2[1]);
            case 196611:
                Object[] objArr3 = (Object[]) obj;
                return mo76447a(str, (String) objArr3[0], (String) objArr3[1]);
            default:
                return super.mo76450a(i, i2, j, str, obj);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo76460a(InputStream inputStream) {
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
                String str = (String) pblk.m34714a(16777217, 0, 0, "c3cb49", new byte[]{Byte.MAX_VALUE, 50, 47, Ascii.NAK, 2});
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo76461a(OutputStream outputStream) {
        if (outputStream != null) {
            try {
                outputStream.close();
            } catch (IOException unused) {
                String str = (String) pblk.m34714a(16777217, 0, 0, "cfc1d9", new byte[]{Byte.MAX_VALUE, 103, 47, 70, 84});
            }
        }
    }

    /* renamed from: a */
    public abstract Object[] mo76447a(String str, String str2, String str3);

    /* renamed from: a */
    public abstract Object[] mo76448a(String str, byte[] bArr, String str2, String str3);

    /* renamed from: b */
    public abstract Object[] mo76449b(String str, String str2, String str3);
}

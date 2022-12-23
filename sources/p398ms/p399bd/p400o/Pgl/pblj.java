package p398ms.p399bd.p400o.Pgl;

import android.content.Context;
import com.facebook.internal.NativeProtocol;
import java.io.Closeable;
import java.io.File;
import p398ms.p399bd.p400o.Pgl.pblb;

/* renamed from: ms.bd.o.Pgl.pblj */
public final class pblj {
    /* renamed from: a */
    public static void m34711a() {
        pblb.m34700a((int) NativeProtocol.MESSAGE_GET_ACCESS_TOKEN_REPLY, (pblb.pgla) new pblc());
        pblb.m34700a((int) NativeProtocol.MESSAGE_GET_PROTOCOL_VERSIONS_REQUEST, (pblb.pgla) new pbld());
        pblb.m34700a((int) NativeProtocol.MESSAGE_GET_PROTOCOL_VERSIONS_REPLY, (pblb.pgla) new pble());
        pblb.m34700a(65540, (pblb.pgla) new pblf());
        pblb.m34700a((int) NativeProtocol.MESSAGE_GET_INSTALL_DATA_REPLY, (pblb.pgla) new pblg());
        pblb.m34700a((int) NativeProtocol.MESSAGE_GET_LIKE_STATUS_REQUEST, (pblb.pgla) new pblh());
        pblb.m34700a((int) NativeProtocol.MESSAGE_GET_LIKE_STATUS_REPLY, (pblb.pgla) new pbli());
        pblb.pgla pbla = pbly.m34765b() ? new pbla() : new pblp();
        pblb.m34700a(196609, pbla);
        pblb.m34700a(196610, pbla);
        pblb.m34700a(196611, pbla);
        pblm pbln = pbly.m34763a() ? new pbln() : new pbll();
        pblm.m34721a(pbln);
        pblb.m34700a(131073, (pblb.pgla) pbln);
        pblb.m34700a(131074, (pblb.pgla) pbln);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static boolean m34713b(Context context, String str, String str2) {
        String str3 = str;
        String str4 = str2;
        try {
            String[] list = context.getAssets().list(str3);
            if (list.length > 0) {
                new File(str4).mkdirs();
                for (String str5 : list) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(str3);
                    sb.append((String) pblk.m34714a(16777217, 0, 0, "706181", new byte[]{105}));
                    sb.append(str5);
                    String sb2 = sb.toString();
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(str4);
                    sb3.append((String) pblk.m34714a(16777217, 0, 0, "f9c19e", new byte[]{56}));
                    sb3.append(str5);
                    m34713b(context, sb2, sb3.toString());
                }
                return true;
            }
            throw null;
        } catch (Exception unused) {
            String str6 = (String) pblk.m34714a(16777217, 0, 0, "ab003d", new byte[]{115, 97, 69});
            return false;
        } catch (Throwable th) {
            Throwable th2 = th;
            pblz.m34770a((Closeable) null);
            pblz.m34770a((Closeable) null);
            throw th2;
        }
    }
}

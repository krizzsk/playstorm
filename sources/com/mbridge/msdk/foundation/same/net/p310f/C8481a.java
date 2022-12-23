package com.mbridge.msdk.foundation.same.net.p310f;

import com.mbridge.msdk.foundation.same.net.p305a.C8452a;

/* renamed from: com.mbridge.msdk.foundation.same.net.f.a */
/* compiled from: CommonHttpConfig */
public final class C8481a {
    /* renamed from: a */
    public static String m24481a(C8452a aVar) {
        String str;
        if (aVar == null) {
            return "Network error,Load failed";
        }
        try {
            int i = aVar.f20430a;
            int i2 = 0;
            if (aVar.f20431b != null) {
                i2 = aVar.f20431b.f20491a;
            }
            if (i == -2) {
                str = "Network is canceled";
            } else if (i != 1) {
                switch (i) {
                    case 3:
                        str = "Network error,timeout exception";
                        break;
                    case 4:
                        str = "Network unknown error";
                        break;
                    case 5:
                        str = "Network error，https is not work,please check your phone time";
                        break;
                    case 6:
                        if (i2 == 0) {
                            str = "Network error,please check ";
                            break;
                        } else {
                            str = "Network error,please check state code" + i2;
                            break;
                        }
                    case 7:
                        if (i2 == 0) {
                            str = "The server returns an exception ";
                            break;
                        } else {
                            str = "The server returns an exception state code " + i2;
                            break;
                        }
                    case 8:
                        str = "Cast exception, return data can't be casted correctly";
                        break;
                    case 9:
                    case 12:
                        str = "Network error,disconnected network exception";
                        break;
                    case 10:
                        str = "Network error,socket timeout exception";
                        break;
                    case 11:
                        str = "Network error，sslp exception";
                        break;
                    default:
                        str = "Network error,I/O exception";
                        break;
                }
            } else {
                return "Network error,Load failed";
            }
            return str;
        } catch (Exception e) {
            e.printStackTrace();
            return "Network error,Load failed";
        }
    }
}

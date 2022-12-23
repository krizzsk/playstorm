package com.fyber.inneractive.sdk.util;

import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.ref.Reference;
import java.nio.ByteBuffer;

/* renamed from: com.fyber.inneractive.sdk.util.s */
public class C5370s {
    /* renamed from: a */
    public static StringBuffer m16788a(InputStream inputStream, boolean z) throws IOException {
        ByteBuffer b = C5319d.f14156b.mo26442b();
        StringBuffer stringBuffer = new StringBuffer();
        C5319d.f14156b.getClass();
        byte[] array = (b == null || !b.hasArray()) ? new byte[8192] : b.array();
        int i = 0;
        while (i != -1) {
            stringBuffer.append(new String(array, 0, i));
            i = inputStream.read(array);
        }
        if (z) {
            try {
                inputStream.close();
            } catch (Throwable unused) {
            }
        }
        C5319d.f14156b.f14157a.offer(b);
        return stringBuffer;
    }

    /* renamed from: b */
    public static void m16792b(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: a */
    public static boolean m16791a(InputStream inputStream, OutputStream outputStream) throws IOException {
        if (inputStream != null) {
            byte[] bArr = new byte[65536];
            int i = 0;
            while (true) {
                int read = inputStream.read(bArr);
                if (read == -1) {
                    break;
                }
                i += read;
                outputStream.write(bArr, 0, read);
            }
            IAlog.m16699a("Copied stream content length = %d", Integer.valueOf(i));
            if (i > 0) {
                return true;
            }
            return false;
        }
        throw new IOException("Unable to copy from or to a null stream.");
    }

    /* renamed from: a */
    public static String m16787a(Throwable th) {
        try {
            StringWriter stringWriter = new StringWriter();
            th.printStackTrace(new PrintWriter(stringWriter));
            return "------\r\n" + stringWriter.toString() + "------\r\n";
        } catch (Exception unused) {
            return "bad stackToString";
        }
    }

    /* renamed from: a */
    public static void m16789a(View view) {
        if (view != null && view.getParent() != null) {
            try {
                if (view.getParent() instanceof ViewGroup) {
                    ((ViewGroup) view.getParent()).removeView(view);
                }
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    public static String m16785a(int i, int i2) {
        StringBuilder sb = new StringBuilder();
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        int i3 = i;
        while (i3 >= 0 && i3 < i + i2 && i3 < stackTrace.length) {
            sb.append(stackTrace[i3].toString());
            sb.append(",");
            i3++;
        }
        Log.d("stack trace:", sb.toString());
        return sb.toString();
    }

    /* renamed from: a */
    public static <T> T m16784a(Reference<T> reference) {
        if (reference == null) {
            return null;
        }
        return reference.get();
    }

    /* renamed from: a */
    public static int m16783a(String str, int i) {
        if (TextUtils.isEmpty(str)) {
            return i;
        }
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            return i;
        }
    }

    /* renamed from: a */
    public static void m16790a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    public static String m16786a(Long l) {
        return l == null ? "" : String.valueOf(l);
    }
}

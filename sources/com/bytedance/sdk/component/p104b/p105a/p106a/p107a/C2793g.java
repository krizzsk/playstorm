package com.bytedance.sdk.component.p104b.p105a.p106a.p107a;

import com.bytedance.sdk.component.p104b.p105a.C2821n;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;

/* renamed from: com.bytedance.sdk.component.b.a.a.a.g */
/* compiled from: NetResponseBody */
public class C2793g extends C2821n {

    /* renamed from: a */
    HttpURLConnection f6283a;

    /* renamed from: b */
    InputStream f6284b;

    C2793g(HttpURLConnection httpURLConnection) throws IOException {
        this.f6283a = httpURLConnection;
        this.f6284b = new C2791e(httpURLConnection.getInputStream(), httpURLConnection);
    }

    /* renamed from: a */
    public long mo17505a() {
        try {
            return (long) this.f6283a.getContentLength();
        } catch (Exception unused) {
            return 0;
        }
    }

    /* renamed from: b */
    public String mo17506b() {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(this.f6284b));
            StringBuffer stringBuffer = new StringBuffer();
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine != null) {
                    stringBuffer.append(readLine + "\n");
                } else {
                    String stringBuffer2 = stringBuffer.toString();
                    close();
                    return stringBuffer2;
                }
            }
        } catch (Exception unused) {
            return "";
        }
    }

    public void close() {
        try {
            this.f6284b.close();
            this.f6283a.disconnect();
        } catch (Exception unused) {
        }
    }

    /* renamed from: c */
    public InputStream mo17507c() {
        return this.f6284b;
    }

    /* renamed from: d */
    public byte[] mo17509d() {
        try {
            byte[] bArr = new byte[1024];
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            while (true) {
                int read = this.f6284b.read(bArr);
                if (read == -1) {
                    return byteArrayOutputStream.toByteArray();
                }
                byteArrayOutputStream.write(bArr, 0, read);
            }
        } catch (Exception unused) {
            return new byte[0];
        }
    }
}

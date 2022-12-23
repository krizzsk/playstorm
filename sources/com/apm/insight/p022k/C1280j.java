package com.apm.insight.p022k;

import androidx.browser.trusted.sharing.ShareTarget;
import com.apm.insight.C1240h;
import com.apm.insight.p023l.C1298i;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Map;

/* renamed from: com.apm.insight.k.j */
public class C1280j {

    /* renamed from: a */
    private final String f1262a = ("AAA" + System.currentTimeMillis() + "AAA");

    /* renamed from: b */
    private HttpURLConnection f1263b;

    /* renamed from: c */
    private String f1264c;

    /* renamed from: d */
    private boolean f1265d;

    /* renamed from: e */
    private C1273f f1266e;

    /* renamed from: f */
    private C1284m f1267f;

    public C1280j(String str, String str2, boolean z) {
        this.f1264c = str2;
        this.f1265d = z;
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        this.f1263b = httpURLConnection;
        httpURLConnection.setUseCaches(false);
        this.f1263b.setDoOutput(true);
        this.f1263b.setDoInput(true);
        this.f1263b.setRequestMethod(ShareTarget.METHOD_POST);
        HttpURLConnection httpURLConnection2 = this.f1263b;
        httpURLConnection2.setRequestProperty("Content-Type", "multipart/form-data; boundary=" + this.f1262a);
        if (z) {
            this.f1263b.setRequestProperty("Content-Encoding", "gzip");
            this.f1267f = new C1284m(this.f1263b.getOutputStream());
            return;
        }
        this.f1266e = new C1273f(this.f1263b.getOutputStream());
    }

    /* renamed from: a */
    public String mo12345a() {
        ArrayList<String> arrayList = new ArrayList<>();
        byte[] bytes = ("\r\n--" + this.f1262a + "--" + "\r\n").getBytes();
        if (this.f1265d) {
            this.f1267f.write(bytes);
            this.f1267f.mo12354b();
            this.f1267f.mo12353a();
        } else {
            this.f1266e.write(bytes);
            this.f1266e.flush();
            this.f1266e.mo12336a();
        }
        int responseCode = this.f1263b.getResponseCode();
        if (responseCode == 200) {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(this.f1263b.getInputStream()));
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                arrayList.add(readLine);
            }
            bufferedReader.close();
            this.f1263b.disconnect();
            StringBuilder sb = new StringBuilder();
            for (String append : arrayList) {
                sb.append(append);
            }
            return sb.toString();
        }
        throw new IOException("Server returned non-OK status: " + responseCode);
    }

    /* renamed from: a */
    public void mo12346a(String str, File file, Map<String, String> map) {
        String name = file.getName();
        StringBuilder sb = new StringBuilder();
        sb.append("--");
        sb.append(this.f1262a);
        sb.append("\r\n");
        sb.append("Content-Disposition: form-data; name=\"");
        sb.append(str);
        sb.append("\"; filename=\"");
        sb.append(name);
        sb.append("\"");
        for (Map.Entry next : map.entrySet()) {
            sb.append("; ");
            sb.append((String) next.getKey());
            sb.append("=\"");
            sb.append((String) next.getValue());
            sb.append("\"");
        }
        sb.append("\r\n");
        sb.append("Content-Transfer-Encoding: binary");
        sb.append("\r\n");
        sb.append("\r\n");
        if (this.f1265d) {
            this.f1267f.write(sb.toString().getBytes());
        } else {
            this.f1266e.write(sb.toString().getBytes());
        }
        FileInputStream fileInputStream = new FileInputStream(file);
        byte[] bArr = new byte[8192];
        while (true) {
            int read = fileInputStream.read(bArr);
            if (read == -1) {
                break;
            } else if (this.f1265d) {
                this.f1267f.write(bArr, 0, read);
            } else {
                this.f1266e.write(bArr, 0, read);
            }
        }
        fileInputStream.close();
        if (this.f1265d) {
            this.f1267f.write("\r\n".getBytes());
            return;
        }
        this.f1266e.write("\r\n".getBytes());
        this.f1266e.flush();
    }

    /* renamed from: a */
    public void mo12347a(String str, String str2) {
        mo12348a(str, str2, false);
    }

    /* renamed from: a */
    public void mo12348a(String str, String str2, boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append("--");
        sb.append(this.f1262a);
        sb.append("\r\n");
        sb.append("Content-Disposition: form-data; name=\"");
        sb.append(str);
        sb.append("\"");
        sb.append("\r\n");
        sb.append("Content-Type: text/plain; charset=");
        sb.append(this.f1264c);
        sb.append("\r\n");
        sb.append("\r\n");
        try {
            if (this.f1265d) {
                this.f1267f.write(sb.toString().getBytes());
            } else {
                this.f1266e.write(sb.toString().getBytes());
            }
        } catch (IOException unused) {
        }
        byte[] bytes = str2.getBytes();
        if (z) {
            bytes = C1240h.m1560i().getEncryptImpl().mo12221a(bytes);
        }
        try {
            if (this.f1265d) {
                this.f1267f.write(bytes);
                this.f1267f.write("\r\n".getBytes());
                return;
            }
            this.f1266e.write(bytes);
            this.f1266e.write("\r\n".getBytes());
        } catch (IOException unused2) {
        }
    }

    /* renamed from: a */
    public void mo12349a(String str, File... fileArr) {
        StringBuilder sb = new StringBuilder();
        sb.append("--");
        sb.append(this.f1262a);
        sb.append("\r\n");
        sb.append("Content-Disposition: form-data; name=\"");
        sb.append(str);
        sb.append("\"; filename=\"");
        sb.append(str);
        sb.append("\"");
        sb.append("\r\n");
        sb.append("Content-Transfer-Encoding: binary");
        sb.append("\r\n");
        sb.append("\r\n");
        if (this.f1265d) {
            this.f1267f.write(sb.toString().getBytes());
        } else {
            this.f1266e.write(sb.toString().getBytes());
        }
        C1298i.m1773a(this.f1265d ? this.f1267f : this.f1266e, fileArr);
        if (this.f1265d) {
            this.f1267f.write("\r\n".getBytes());
            return;
        }
        this.f1266e.write("\r\n".getBytes());
        this.f1266e.flush();
    }
}

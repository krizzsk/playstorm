package com.adcolony.sdk;

import android.content.Context;
import android.os.Build;
import android.os.StatFs;
import com.adcolony.sdk.C0817e0;
import java.io.File;

/* renamed from: com.adcolony.sdk.v0 */
class C0983v0 {

    /* renamed from: a */
    private String f820a;

    /* renamed from: b */
    private String f821b;

    /* renamed from: c */
    private String f822c;

    /* renamed from: d */
    private String f823d;

    /* renamed from: e */
    private File f824e;

    /* renamed from: f */
    private File f825f;

    /* renamed from: g */
    private File f826g;

    C0983v0() {
    }

    /* renamed from: b */
    private long m1046b(StatFs statFs) {
        return statFs.getAvailableBlocksLong();
    }

    /* renamed from: c */
    private long m1047c(StatFs statFs) {
        return Build.VERSION.SDK_INT >= 18 ? m1048d(statFs) : (long) statFs.getBlockSize();
    }

    /* renamed from: d */
    private long m1048d(StatFs statFs) {
        return statFs.getBlockSizeLong();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public double mo11090a(String str) {
        try {
            StatFs statFs = new StatFs(str);
            return (double) (m1045a(statFs) * m1047c(statFs));
        } catch (RuntimeException unused) {
            return 0.0d;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public boolean mo11096e() {
        C0857k b = C0714a.m136b();
        this.f820a = mo11097f() + "/adc3/";
        this.f821b = this.f820a + "media/";
        File file = new File(this.f821b);
        this.f824e = file;
        if (!file.isDirectory()) {
            this.f824e.delete();
            this.f824e.mkdirs();
        }
        if (!this.f824e.isDirectory()) {
            b.mo10826b(true);
            return false;
        } else if (mo11090a(this.f821b) < 2.097152E7d) {
            new C0817e0.C0818a().mo10684a("Not enough memory available at media path, disabling AdColony.").mo10685a(C0817e0.f431f);
            b.mo10826b(true);
            return false;
        } else {
            this.f822c = mo11097f() + "/adc3/data/";
            File file2 = new File(this.f822c);
            this.f825f = file2;
            if (!file2.isDirectory()) {
                this.f825f.delete();
            }
            this.f825f.mkdirs();
            this.f823d = this.f820a + "tmp/";
            File file3 = new File(this.f823d);
            this.f826g = file3;
            if (!file3.isDirectory()) {
                this.f826g.delete();
                this.f826g.mkdirs();
            }
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public String mo11097f() {
        Context a = C0714a.m129a();
        if (a == null) {
            return "";
        }
        return a.getFilesDir().getAbsolutePath();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public C0823f1 mo11098g() {
        if (!new File(mo11091a() + "AppVersion").exists()) {
            return C0764c0.m322b();
        }
        return C0764c0.m331c(mo11091a() + "AppVersion");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public boolean mo11099h() {
        File file = this.f824e;
        if (file == null || this.f825f == null || this.f826g == null) {
            return false;
        }
        if (!file.isDirectory()) {
            this.f824e.delete();
        }
        if (!this.f825f.isDirectory()) {
            this.f825f.delete();
        }
        if (!this.f826g.isDirectory()) {
            this.f826g.delete();
        }
        this.f824e.mkdirs();
        this.f825f.mkdirs();
        this.f826g.mkdirs();
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public String mo11093b() {
        return this.f822c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public String mo11094c() {
        return this.f821b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public String mo11095d() {
        return this.f823d;
    }

    /* renamed from: a */
    private long m1045a(StatFs statFs) {
        return Build.VERSION.SDK_INT >= 18 ? m1046b(statFs) : (long) statFs.getAvailableBlocks();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo11092a(C0823f1 f1Var) {
        C0764c0.m338j(f1Var, mo11091a() + "AppVersion");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public String mo11091a() {
        return this.f820a;
    }
}

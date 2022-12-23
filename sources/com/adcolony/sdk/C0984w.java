package com.adcolony.sdk;

import com.adcolony.sdk.C0817e0;
import com.google.android.exoplayer2.C5487C;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.zip.GZIPInputStream;

/* renamed from: com.adcolony.sdk.w */
class C0984w {

    /* renamed from: a */
    private LinkedList<Runnable> f827a = new LinkedList<>();

    /* renamed from: b */
    private boolean f828b;

    /* renamed from: com.adcolony.sdk.w$a */
    class C0985a implements C0856j0 {

        /* renamed from: com.adcolony.sdk.w$a$a */
        class C0986a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C0841h0 f830a;

            C0986a(C0841h0 h0Var) {
                this.f830a = h0Var;
            }

            public void run() {
                boolean unused = C0984w.this.m1078g(this.f830a);
                C0984w.this.m1059a();
            }
        }

        C0985a() {
        }

        /* renamed from: a */
        public void mo10469a(C0841h0 h0Var) {
            C0984w.this.m1062a((Runnable) new C0986a(h0Var));
        }
    }

    /* renamed from: com.adcolony.sdk.w$b */
    class C0987b implements C0856j0 {

        /* renamed from: com.adcolony.sdk.w$b$a */
        class C0988a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C0841h0 f833a;

            C0988a(C0841h0 h0Var) {
                this.f833a = h0Var;
            }

            public void run() {
                boolean unused = C0984w.this.m1064a(this.f833a, new File(C0764c0.m336h(this.f833a.mo10772a(), "filepath")));
                C0984w.this.m1059a();
            }
        }

        C0987b() {
        }

        /* renamed from: a */
        public void mo10469a(C0841h0 h0Var) {
            C0984w.this.m1062a((Runnable) new C0988a(h0Var));
        }
    }

    /* renamed from: com.adcolony.sdk.w$c */
    class C0989c implements C0856j0 {

        /* renamed from: com.adcolony.sdk.w$c$a */
        class C0990a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C0841h0 f836a;

            C0990a(C0841h0 h0Var) {
                this.f836a = h0Var;
            }

            public void run() {
                boolean unused = C0984w.this.m1073d(this.f836a);
                C0984w.this.m1059a();
            }
        }

        C0989c() {
        }

        /* renamed from: a */
        public void mo10469a(C0841h0 h0Var) {
            C0984w.this.m1062a((Runnable) new C0990a(h0Var));
        }
    }

    /* renamed from: com.adcolony.sdk.w$d */
    class C0991d implements C0856j0 {

        /* renamed from: com.adcolony.sdk.w$d$a */
        class C0992a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C0841h0 f839a;

            C0992a(C0841h0 h0Var) {
                this.f839a = h0Var;
            }

            public void run() {
                String unused = C0984w.this.m1074e(this.f839a);
                C0984w.this.m1059a();
            }
        }

        C0991d() {
        }

        /* renamed from: a */
        public void mo10469a(C0841h0 h0Var) {
            C0984w.this.m1062a((Runnable) new C0992a(h0Var));
        }
    }

    /* renamed from: com.adcolony.sdk.w$e */
    class C0993e implements C0856j0 {

        /* renamed from: com.adcolony.sdk.w$e$a */
        class C0994a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C0841h0 f842a;

            C0994a(C0841h0 h0Var) {
                this.f842a = h0Var;
            }

            public void run() {
                boolean unused = C0984w.this.m1076f(this.f842a);
                C0984w.this.m1059a();
            }
        }

        C0993e() {
        }

        /* renamed from: a */
        public void mo10469a(C0841h0 h0Var) {
            C0984w.this.m1062a((Runnable) new C0994a(h0Var));
        }
    }

    /* renamed from: com.adcolony.sdk.w$f */
    class C0995f implements C0856j0 {

        /* renamed from: com.adcolony.sdk.w$f$a */
        class C0996a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C0841h0 f845a;

            C0996a(C0841h0 h0Var) {
                this.f845a = h0Var;
            }

            public void run() {
                boolean unused = C0984w.this.m1068b(this.f845a);
                C0984w.this.m1059a();
            }
        }

        C0995f() {
        }

        /* renamed from: a */
        public void mo10469a(C0841h0 h0Var) {
            C0984w.this.m1062a((Runnable) new C0996a(h0Var));
        }
    }

    /* renamed from: com.adcolony.sdk.w$g */
    class C0997g implements C0856j0 {

        /* renamed from: com.adcolony.sdk.w$g$a */
        class C0998a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C0841h0 f848a;

            C0998a(C0841h0 h0Var) {
                this.f848a = h0Var;
            }

            public void run() {
                boolean unused = C0984w.this.m1070c(this.f848a);
                C0984w.this.m1059a();
            }
        }

        C0997g() {
        }

        /* renamed from: a */
        public void mo10469a(C0841h0 h0Var) {
            C0984w.this.m1062a((Runnable) new C0998a(h0Var));
        }
    }

    /* renamed from: com.adcolony.sdk.w$h */
    class C0999h implements C0856j0 {

        /* renamed from: com.adcolony.sdk.w$h$a */
        class C1000a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C0841h0 f851a;

            C1000a(C0841h0 h0Var) {
                this.f851a = h0Var;
            }

            public void run() {
                boolean unused = C0984w.this.m1080h(this.f851a);
                C0984w.this.m1059a();
            }
        }

        C0999h() {
        }

        /* renamed from: a */
        public void mo10469a(C0841h0 h0Var) {
            C0984w.this.m1062a((Runnable) new C1000a(h0Var));
        }
    }

    /* renamed from: com.adcolony.sdk.w$i */
    class C1001i implements C0856j0 {

        /* renamed from: com.adcolony.sdk.w$i$a */
        class C1002a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C0841h0 f854a;

            C1002a(C0841h0 h0Var) {
                this.f854a = h0Var;
            }

            public void run() {
                boolean unused = C0984w.this.m1063a(this.f854a);
                C0984w.this.m1059a();
            }
        }

        C1001i() {
        }

        /* renamed from: a */
        public void mo10469a(C0841h0 h0Var) {
            C0984w.this.m1062a((Runnable) new C1002a(h0Var));
        }
    }

    C0984w() {
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public boolean m1070c(C0841h0 h0Var) {
        C0823f1 a = h0Var.mo10772a();
        String h = C0764c0.m336h(a, "filepath");
        C0714a.m136b().mo10855z().mo11099h();
        C0823f1 b = C0764c0.m322b();
        try {
            int d = C0764c0.m332d(a, "offset");
            int d2 = C0764c0.m332d(a, "size");
            boolean b2 = C0764c0.m325b(a, "gunzip");
            String h2 = C0764c0.m336h(a, "output_filepath");
            InputStream w0Var = new C1003w0(new FileInputStream(h), d, d2);
            if (b2) {
                w0Var = new GZIPInputStream(w0Var, 1024);
            }
            if (h2.equals("")) {
                StringBuilder sb = new StringBuilder(w0Var.available());
                byte[] bArr = new byte[1024];
                while (true) {
                    int read = w0Var.read(bArr, 0, 1024);
                    if (read < 0) {
                        break;
                    }
                    sb.append(new String(bArr, 0, read, C5487C.ISO88591_NAME));
                }
                C0764c0.m326b(b, "size", sb.length());
                C0764c0.m319a(b, "data", sb.toString());
            } else {
                FileOutputStream fileOutputStream = new FileOutputStream(h2);
                byte[] bArr2 = new byte[1024];
                int i = 0;
                while (true) {
                    int read2 = w0Var.read(bArr2, 0, 1024);
                    if (read2 < 0) {
                        break;
                    }
                    fileOutputStream.write(bArr2, 0, read2);
                    i += read2;
                }
                fileOutputStream.close();
                C0764c0.m326b(b, "size", i);
            }
            w0Var.close();
            C0764c0.m328b(b, "success", true);
            h0Var.mo10773a(b).mo10776c();
            return true;
        } catch (IOException unused) {
            C0764c0.m328b(b, "success", false);
            h0Var.mo10773a(b).mo10776c();
            return false;
        } catch (OutOfMemoryError unused2) {
            new C0817e0.C0818a().mo10684a("Out of memory error - disabling AdColony.").mo10685a(C0817e0.f433h);
            C0714a.m136b().mo10826b(true);
            C0764c0.m328b(b, "success", false);
            h0Var.mo10773a(b).mo10776c();
            return false;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public boolean m1073d(C0841h0 h0Var) {
        String h = C0764c0.m336h(h0Var.mo10772a(), "filepath");
        C0714a.m136b().mo10855z().mo11099h();
        C0823f1 b = C0764c0.m322b();
        String[] list = new File(h).list();
        if (list != null) {
            C0819e1 a = C0764c0.m308a();
            for (String str : list) {
                C0823f1 b2 = C0764c0.m322b();
                C0764c0.m319a(b2, "filename", str);
                if (new File(h + str).isDirectory()) {
                    C0764c0.m328b(b2, "is_folder", true);
                } else {
                    C0764c0.m328b(b2, "is_folder", false);
                }
                C0764c0.m314a(a, b2);
            }
            C0764c0.m328b(b, "success", true);
            C0764c0.m317a(b, "entries", a);
            h0Var.mo10773a(b).mo10776c();
            return true;
        }
        C0764c0.m328b(b, "success", false);
        h0Var.mo10773a(b).mo10776c();
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public String m1074e(C0841h0 h0Var) {
        C0823f1 a = h0Var.mo10772a();
        String h = C0764c0.m336h(a, "filepath");
        String h2 = C0764c0.m336h(a, "encoding");
        boolean z = h2 != null && h2.equals("utf8");
        C0714a.m136b().mo10855z().mo11099h();
        C0823f1 b = C0764c0.m322b();
        try {
            StringBuilder a2 = mo11100a(h, z);
            C0764c0.m328b(b, "success", true);
            C0764c0.m319a(b, "data", a2.toString());
            h0Var.mo10773a(b).mo10776c();
            return a2.toString();
        } catch (IOException unused) {
            C0764c0.m328b(b, "success", false);
            h0Var.mo10773a(b).mo10776c();
            return "";
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public boolean m1076f(C0841h0 h0Var) {
        C0823f1 a = h0Var.mo10772a();
        String h = C0764c0.m336h(a, "filepath");
        String h2 = C0764c0.m336h(a, "new_filepath");
        C0714a.m136b().mo10855z().mo11099h();
        C0823f1 b = C0764c0.m322b();
        try {
            if (new File(h).renameTo(new File(h2))) {
                C0764c0.m328b(b, "success", true);
                h0Var.mo10773a(b).mo10776c();
                return true;
            }
            C0764c0.m328b(b, "success", false);
            h0Var.mo10773a(b).mo10776c();
            return false;
        } catch (Exception unused) {
            C0764c0.m328b(b, "success", false);
            h0Var.mo10773a(b).mo10776c();
            return false;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public boolean m1078g(C0841h0 h0Var) {
        C0823f1 a = h0Var.mo10772a();
        String h = C0764c0.m336h(a, "filepath");
        String h2 = C0764c0.m336h(a, "data");
        boolean equals = C0764c0.m336h(a, "encoding").equals("utf8");
        C0714a.m136b().mo10855z().mo11099h();
        C0823f1 b = C0764c0.m322b();
        try {
            mo11101a(h, h2, equals);
            C0764c0.m328b(b, "success", true);
            h0Var.mo10773a(b).mo10776c();
            return true;
        } catch (IOException unused) {
            C0764c0.m328b(b, "success", false);
            h0Var.mo10773a(b).mo10776c();
            return false;
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00fb, code lost:
        new com.adcolony.sdk.C0817e0.C0818a().mo10684a("Out of memory error - disabling AdColony.").mo10685a(com.adcolony.sdk.C0817e0.f433h);
        com.adcolony.sdk.C0714a.m136b().mo10826b(true);
        com.adcolony.sdk.C0764c0.m328b(r5, "success", false);
        r0.mo10773a(r5).mo10776c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x011e, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x011f, code lost:
        r2 = false;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:31:? A[ExcHandler: OutOfMemoryError (unused java.lang.OutOfMemoryError), SYNTHETIC, Splitter:B:1:0x0029] */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean m1080h(com.adcolony.sdk.C0841h0 r21) {
        /*
            r20 = this;
            r0 = r21
            java.lang.String r1 = "success"
            com.adcolony.sdk.f1 r2 = r21.mo10772a()
            java.lang.String r3 = "filepath"
            java.lang.String r3 = com.adcolony.sdk.C0764c0.m336h(r2, r3)
            java.lang.String r4 = "bundle_path"
            java.lang.String r4 = com.adcolony.sdk.C0764c0.m336h(r2, r4)
            java.lang.String r5 = "bundle_filenames"
            com.adcolony.sdk.e1 r2 = com.adcolony.sdk.C0764c0.m309a((com.adcolony.sdk.C0823f1) r2, (java.lang.String) r5)
            com.adcolony.sdk.k r5 = com.adcolony.sdk.C0714a.m136b()
            com.adcolony.sdk.v0 r5 = r5.mo10855z()
            r5.mo11099h()
            com.adcolony.sdk.f1 r5 = com.adcolony.sdk.C0764c0.m322b()
            java.io.File r8 = new java.io.File     // Catch:{ IOException -> 0x011f, OutOfMemoryError -> 0x00fb }
            r8.<init>(r4)     // Catch:{ IOException -> 0x011f, OutOfMemoryError -> 0x00fb }
            java.io.RandomAccessFile r9 = new java.io.RandomAccessFile     // Catch:{ IOException -> 0x011f, OutOfMemoryError -> 0x00fb }
            java.lang.String r10 = "r"
            r9.<init>(r8, r10)     // Catch:{ IOException -> 0x011f, OutOfMemoryError -> 0x00fb }
            r10 = 32
            byte[] r10 = new byte[r10]     // Catch:{ IOException -> 0x011f, OutOfMemoryError -> 0x00fb }
            r9.readInt()     // Catch:{ IOException -> 0x011f, OutOfMemoryError -> 0x00fb }
            int r11 = r9.readInt()     // Catch:{ IOException -> 0x011f, OutOfMemoryError -> 0x00fb }
            com.adcolony.sdk.e1 r12 = new com.adcolony.sdk.e1     // Catch:{ IOException -> 0x011f, OutOfMemoryError -> 0x00fb }
            r12.<init>()     // Catch:{ IOException -> 0x011f, OutOfMemoryError -> 0x00fb }
            r13 = 1024(0x400, float:1.435E-42)
            byte[] r14 = new byte[r13]     // Catch:{ IOException -> 0x011f, OutOfMemoryError -> 0x00fb }
            r15 = 0
        L_0x004a:
            if (r15 >= r11) goto L_0x00e1
            int r16 = r15 * 44
            int r6 = r16 + 8
            r17 = r8
            long r7 = (long) r6     // Catch:{ IOException -> 0x011f, OutOfMemoryError -> 0x00fb }
            r9.seek(r7)     // Catch:{ IOException -> 0x011f, OutOfMemoryError -> 0x00fb }
            r9.read(r10)     // Catch:{ IOException -> 0x011f, OutOfMemoryError -> 0x00fb }
            r9.readInt()     // Catch:{ IOException -> 0x011f, OutOfMemoryError -> 0x00fb }
            int r6 = r9.readInt()     // Catch:{ IOException -> 0x011f, OutOfMemoryError -> 0x00fb }
            int r7 = r9.readInt()     // Catch:{ IOException -> 0x011f, OutOfMemoryError -> 0x00fb }
            r12.mo10698f(r7)     // Catch:{ IOException -> 0x011f, OutOfMemoryError -> 0x00fb }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ JSONException -> 0x00b7 }
            r8.<init>()     // Catch:{ JSONException -> 0x00b7 }
            r8.append(r3)     // Catch:{ JSONException -> 0x00b7 }
            java.lang.Object r13 = r2.mo10687a((int) r15)     // Catch:{ JSONException -> 0x00b7 }
            r8.append(r13)     // Catch:{ JSONException -> 0x00b7 }
            java.lang.String r8 = r8.toString()     // Catch:{ JSONException -> 0x00b7 }
            r18 = r2
            r13 = r3
            long r2 = (long) r6
            r9.seek(r2)     // Catch:{ IOException -> 0x011f, OutOfMemoryError -> 0x00fb }
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x011f, OutOfMemoryError -> 0x00fb }
            r2.<init>(r8)     // Catch:{ IOException -> 0x011f, OutOfMemoryError -> 0x00fb }
            int r3 = r7 / 1024
            int r7 = r7 % 1024
            r6 = 0
        L_0x008b:
            if (r6 >= r3) goto L_0x009d
            r16 = r3
            r3 = 1024(0x400, float:1.435E-42)
            r8 = 0
            r9.read(r14, r8, r3)     // Catch:{ IOException -> 0x00b5, OutOfMemoryError -> 0x00fb }
            r2.write(r14, r8, r3)     // Catch:{ IOException -> 0x00b5, OutOfMemoryError -> 0x00fb }
            int r6 = r6 + 1
            r3 = r16
            goto L_0x008b
        L_0x009d:
            r3 = 1024(0x400, float:1.435E-42)
            r8 = 0
            r9.read(r14, r8, r7)     // Catch:{ IOException -> 0x00b5, OutOfMemoryError -> 0x00fb }
            r2.write(r14, r8, r7)     // Catch:{ IOException -> 0x00b5, OutOfMemoryError -> 0x00fb }
            r2.close()     // Catch:{ IOException -> 0x011f, OutOfMemoryError -> 0x00fb }
            int r15 = r15 + 1
            r8 = r17
            r2 = r18
            r19 = r13
            r13 = r3
            r3 = r19
            goto L_0x004a
        L_0x00b5:
            r2 = r8
            goto L_0x0120
        L_0x00b7:
            com.adcolony.sdk.e0$a r2 = new com.adcolony.sdk.e0$a     // Catch:{ IOException -> 0x011f, OutOfMemoryError -> 0x00fb }
            r2.<init>()     // Catch:{ IOException -> 0x011f, OutOfMemoryError -> 0x00fb }
            java.lang.String r3 = "Couldn't extract file name at index "
            com.adcolony.sdk.e0$a r2 = r2.mo10684a((java.lang.String) r3)     // Catch:{ IOException -> 0x011f, OutOfMemoryError -> 0x00fb }
            com.adcolony.sdk.e0$a r2 = r2.mo10682a((int) r15)     // Catch:{ IOException -> 0x011f, OutOfMemoryError -> 0x00fb }
            java.lang.String r3 = " unpacking ad unit bundle at "
            com.adcolony.sdk.e0$a r2 = r2.mo10684a((java.lang.String) r3)     // Catch:{ IOException -> 0x011f, OutOfMemoryError -> 0x00fb }
            com.adcolony.sdk.e0$a r2 = r2.mo10684a((java.lang.String) r4)     // Catch:{ IOException -> 0x011f, OutOfMemoryError -> 0x00fb }
            com.adcolony.sdk.e0 r3 = com.adcolony.sdk.C0817e0.f433h     // Catch:{ IOException -> 0x011f, OutOfMemoryError -> 0x00fb }
            r2.mo10685a((com.adcolony.sdk.C0817e0) r3)     // Catch:{ IOException -> 0x011f, OutOfMemoryError -> 0x00fb }
            r2 = 0
            com.adcolony.sdk.C0764c0.m328b((com.adcolony.sdk.C0823f1) r5, (java.lang.String) r1, (boolean) r2)     // Catch:{ IOException -> 0x0120, OutOfMemoryError -> 0x00fb }
            com.adcolony.sdk.h0 r3 = r0.mo10773a(r5)     // Catch:{ IOException -> 0x0120, OutOfMemoryError -> 0x00fb }
            r3.mo10776c()     // Catch:{ IOException -> 0x0120, OutOfMemoryError -> 0x00fb }
            return r2
        L_0x00e1:
            r17 = r8
            r9.close()     // Catch:{ IOException -> 0x011f, OutOfMemoryError -> 0x00fb }
            r17.delete()     // Catch:{ IOException -> 0x011f, OutOfMemoryError -> 0x00fb }
            r2 = 1
            com.adcolony.sdk.C0764c0.m328b((com.adcolony.sdk.C0823f1) r5, (java.lang.String) r1, (boolean) r2)     // Catch:{ IOException -> 0x011f, OutOfMemoryError -> 0x00fb }
            java.lang.String r2 = "file_sizes"
            com.adcolony.sdk.C0764c0.m317a((com.adcolony.sdk.C0823f1) r5, (java.lang.String) r2, (com.adcolony.sdk.C0819e1) r12)     // Catch:{ IOException -> 0x011f, OutOfMemoryError -> 0x00fb }
            com.adcolony.sdk.h0 r2 = r0.mo10773a(r5)     // Catch:{ IOException -> 0x011f, OutOfMemoryError -> 0x00fb }
            r2.mo10776c()     // Catch:{ IOException -> 0x011f, OutOfMemoryError -> 0x00fb }
            r0 = 1
            return r0
        L_0x00fb:
            com.adcolony.sdk.e0$a r2 = new com.adcolony.sdk.e0$a
            r2.<init>()
            java.lang.String r3 = "Out of memory error - disabling AdColony."
            com.adcolony.sdk.e0$a r2 = r2.mo10684a((java.lang.String) r3)
            com.adcolony.sdk.e0 r3 = com.adcolony.sdk.C0817e0.f433h
            r2.mo10685a((com.adcolony.sdk.C0817e0) r3)
            com.adcolony.sdk.k r2 = com.adcolony.sdk.C0714a.m136b()
            r3 = 1
            r2.mo10826b((boolean) r3)
            r2 = 0
            com.adcolony.sdk.C0764c0.m328b((com.adcolony.sdk.C0823f1) r5, (java.lang.String) r1, (boolean) r2)
            com.adcolony.sdk.h0 r0 = r0.mo10773a(r5)
            r0.mo10776c()
            return r2
        L_0x011f:
            r2 = 0
        L_0x0120:
            com.adcolony.sdk.e0$a r3 = new com.adcolony.sdk.e0$a
            r3.<init>()
            java.lang.String r6 = "Failed to find or open ad unit bundle at path: "
            com.adcolony.sdk.e0$a r3 = r3.mo10684a((java.lang.String) r6)
            com.adcolony.sdk.e0$a r3 = r3.mo10684a((java.lang.String) r4)
            com.adcolony.sdk.e0 r4 = com.adcolony.sdk.C0817e0.f434i
            r3.mo10685a((com.adcolony.sdk.C0817e0) r4)
            com.adcolony.sdk.C0764c0.m328b((com.adcolony.sdk.C0823f1) r5, (java.lang.String) r1, (boolean) r2)
            com.adcolony.sdk.h0 r0 = r0.mo10773a(r5)
            r0.mo10776c()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adcolony.sdk.C0984w.m1080h(com.adcolony.sdk.h0):boolean");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo11103b() {
        C0714a.m135a("FileSystem.save", (C0856j0) new C0985a());
        C0714a.m135a("FileSystem.delete", (C0856j0) new C0987b());
        C0714a.m135a("FileSystem.listing", (C0856j0) new C0989c());
        C0714a.m135a("FileSystem.load", (C0856j0) new C0991d());
        C0714a.m135a("FileSystem.rename", (C0856j0) new C0993e());
        C0714a.m135a("FileSystem.exists", (C0856j0) new C0995f());
        C0714a.m135a("FileSystem.extract", (C0856j0) new C0997g());
        C0714a.m135a("FileSystem.unpack_bundle", (C0856j0) new C0999h());
        C0714a.m135a("FileSystem.create_directory", (C0856j0) new C1001i());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo11101a(String str, String str2, boolean z) throws IOException {
        BufferedWriter bufferedWriter;
        if (z) {
            bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(str), C0840h.f478a));
        } else {
            bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(str)));
        }
        bufferedWriter.write(str2);
        bufferedWriter.flush();
        bufferedWriter.close();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public boolean m1064a(C0841h0 h0Var, File file) {
        C0714a.m136b().mo10855z().mo11099h();
        C0823f1 b = C0764c0.m322b();
        if (mo11102a(file)) {
            C0764c0.m328b(b, "success", true);
            h0Var.mo10773a(b).mo10776c();
            return true;
        }
        C0764c0.m328b(b, "success", false);
        h0Var.mo10773a(b).mo10776c();
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo11102a(File file) {
        try {
            if (!file.isDirectory()) {
                return file.delete();
            }
            if (file.list().length == 0) {
                return file.delete();
            }
            String[] list = file.list();
            if (list.length > 0) {
                return mo11102a(new File(file, list[0]));
            }
            if (file.list().length == 0) {
                return file.delete();
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public StringBuilder mo11100a(String str, boolean z) throws IOException {
        BufferedReader bufferedReader;
        File file = new File(str);
        StringBuilder sb = new StringBuilder((int) file.length());
        if (z) {
            bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file.getAbsolutePath()), C0840h.f478a));
        } else {
            bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file.getAbsolutePath())));
        }
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine != null) {
                sb.append(readLine);
                sb.append("\n");
            } else {
                bufferedReader.close();
                return sb;
            }
        }
    }

    /* renamed from: a */
    private boolean m1067a(String str) {
        return new File(str).exists();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public boolean m1063a(C0841h0 h0Var) {
        String h = C0764c0.m336h(h0Var.mo10772a(), "filepath");
        C0714a.m136b().mo10855z().mo11099h();
        C0823f1 b = C0764c0.m322b();
        try {
            if (new File(h).mkdir()) {
                C0764c0.m328b(b, "success", true);
                h0Var.mo10773a(b).mo10776c();
                return true;
            }
            C0764c0.m328b(b, "success", false);
            return false;
        } catch (Exception unused) {
            C0764c0.m328b(b, "success", false);
            h0Var.mo10773a(b).mo10776c();
            return false;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m1062a(Runnable runnable) {
        if (!this.f827a.isEmpty() || this.f828b) {
            this.f827a.push(runnable);
            return;
        }
        this.f828b = true;
        runnable.run();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m1059a() {
        this.f828b = false;
        if (!this.f827a.isEmpty()) {
            this.f828b = true;
            this.f827a.removeLast().run();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public boolean m1068b(C0841h0 h0Var) {
        String h = C0764c0.m336h(h0Var.mo10772a(), "filepath");
        C0714a.m136b().mo10855z().mo11099h();
        C0823f1 b = C0764c0.m322b();
        try {
            boolean a = m1067a(h);
            C0764c0.m328b(b, IronSourceConstants.EVENTS_RESULT, a);
            C0764c0.m328b(b, "success", true);
            h0Var.mo10773a(b).mo10776c();
            return a;
        } catch (Exception e) {
            C0764c0.m328b(b, IronSourceConstants.EVENTS_RESULT, false);
            C0764c0.m328b(b, "success", false);
            h0Var.mo10773a(b).mo10776c();
            e.printStackTrace();
            return false;
        }
    }
}

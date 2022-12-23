package com.inmobi.media;

import android.content.Context;
import androidx.browser.customtabs.CustomTabsClient;
import com.iab.omid.library.inmobi.Omid;
import com.inmobi.media.C6231hr;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.inmobi.media.jf */
/* compiled from: UnifiedSdk */
public final class C6295jf {

    /* renamed from: a */
    public static boolean f15935a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static final String f15936b = C6295jf.class.getSimpleName();

    /* renamed from: c */
    private static C6231hr.C6235c f15937c = new C6297a((byte) 0);

    /* renamed from: a */
    public static boolean m18823a() {
        try {
            CustomTabsClient.class.getName();
            Omid.class.getName();
            return false;
        } catch (NoClassDefFoundError unused) {
            return true;
        }
    }

    /* renamed from: b */
    public static void m18825b(Context context) {
        C6231hr a = C6231hr.m18586a();
        if (a != null) {
            a.mo35436a(context, f15937c);
        }
    }

    /* renamed from: com.inmobi.media.jf$a */
    /* compiled from: UnifiedSdk */
    static class C6297a implements C6231hr.C6235c {
        private C6297a() {
        }

        /* synthetic */ C6297a(byte b) {
            this();
        }

        /* renamed from: a */
        public final void mo35445a(final boolean z) {
            C6227ho.m18549b(z);
            C6227ho.m18543a((Runnable) new Runnable() {
                public final void run() {
                    if (z) {
                        C6295jf.m18828d();
                    } else {
                        C6295jf.m18824b();
                    }
                }
            });
        }
    }

    /* renamed from: c */
    public static void m18827c(final Context context) {
        if (!f15935a) {
            C6145fs.m18323a();
            C6218hh.m18506a().mo35425b();
            C6269iq.m18729a().mo35476b();
            C6227ho.m18543a((Runnable) new Runnable() {
                public final void run() {
                    if (C6228hp.m18576b(context) && C6272is.m18747b(context).isEmpty()) {
                        C6228hp.m18572a(context, false);
                    }
                    C6258ig.m18681a();
                    C6309jk.m18866c();
                    C6252ic.m18663d();
                    C6295jf.m18828d();
                    try {
                        C5861bg.m17544a().mo34835b();
                        C5861bg.m17544a().mo34837d();
                    } catch (Exception unused) {
                        String unused2 = C6295jf.f15936b;
                    }
                    C6295jf.f15935a = true;
                }
            });
        }
    }

    /* renamed from: b */
    public static void m18824b() {
        try {
            C6145fs.m18329b();
            C6218hh a = C6218hh.m18506a();
            C6218hh.f15752a.set(true);
            if (a.f15756c != null) {
                C6190gn gnVar = a.f15756c;
                if (gnVar.f15663e != null) {
                    gnVar.f15663e.shutdownNow();
                    gnVar.f15663e = null;
                }
                gnVar.f15659a.set(false);
                gnVar.f15660b.set(true);
                gnVar.f15662d.clear();
                gnVar.f15661c.clear();
                a.f15756c = null;
            }
            C6281iw.m18775a().mo35495c();
            C5861bg.m17544a().mo34836c();
        } catch (Exception unused) {
            C6238hu.m18605a((byte) 1, f15936b, "SDK encountered unexpected error while stopping internal components");
        }
    }

    /* renamed from: a */
    public static void m18822a(C6293jd jdVar) {
        ObjectOutputStream objectOutputStream;
        FileOutputStream fileOutputStream = null;
        try {
            C6227ho.m18567l();
            Context c = C6227ho.m18551c();
            if (c != null) {
                File file = new File(C6227ho.m18552c(c), "asConfigs");
                if (file.exists()) {
                    file.delete();
                }
                FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                try {
                    objectOutputStream = new ObjectOutputStream(fileOutputStream2);
                } catch (IOException unused) {
                    objectOutputStream = null;
                } catch (Throwable th) {
                    th = th;
                    objectOutputStream = null;
                    fileOutputStream = fileOutputStream2;
                    C6239hv.m18613a((Closeable) fileOutputStream);
                    C6239hv.m18613a((Closeable) objectOutputStream);
                    throw th;
                }
                try {
                    objectOutputStream.writeObject(jdVar);
                } catch (IOException unused2) {
                } catch (Throwable th2) {
                    th = th2;
                    fileOutputStream = fileOutputStream2;
                    C6239hv.m18613a((Closeable) fileOutputStream);
                    C6239hv.m18613a((Closeable) objectOutputStream);
                    throw th;
                }
                fileOutputStream = fileOutputStream2;
                C6239hv.m18613a((Closeable) fileOutputStream);
                C6239hv.m18613a((Closeable) objectOutputStream);
            }
        } catch (IOException unused3) {
        } catch (Throwable th3) {
            th = th3;
            objectOutputStream = null;
            C6239hv.m18613a((Closeable) fileOutputStream);
            C6239hv.m18613a((Closeable) objectOutputStream);
            throw th;
        }
        objectOutputStream = null;
        C6239hv.m18613a((Closeable) fileOutputStream);
        C6239hv.m18613a((Closeable) objectOutputStream);
    }

    /* renamed from: c */
    public static C6293jd m18826c() {
        FileInputStream fileInputStream;
        ObjectInputStream objectInputStream;
        Throwable th;
        C6293jd jdVar;
        FileInputStream fileInputStream2 = null;
        try {
            if (C6227ho.m18551c() != null) {
                File file = new File(C6227ho.m18552c(C6227ho.m18551c()), "asConfigs");
                if (file.exists()) {
                    fileInputStream = new FileInputStream(file);
                    try {
                        objectInputStream = new ObjectInputStream(fileInputStream);
                        try {
                            jdVar = (C6293jd) objectInputStream.readObject();
                            fileInputStream2 = fileInputStream;
                            C6239hv.m18613a((Closeable) fileInputStream2);
                            C6239hv.m18613a((Closeable) objectInputStream);
                            return jdVar;
                        } catch (IOException | ClassNotFoundException unused) {
                            C6239hv.m18613a((Closeable) fileInputStream);
                            C6239hv.m18613a((Closeable) objectInputStream);
                            return null;
                        } catch (Throwable th2) {
                            th = th2;
                            C6239hv.m18613a((Closeable) fileInputStream);
                            C6239hv.m18613a((Closeable) objectInputStream);
                            throw th;
                        }
                    } catch (IOException | ClassNotFoundException unused2) {
                        objectInputStream = null;
                        C6239hv.m18613a((Closeable) fileInputStream);
                        C6239hv.m18613a((Closeable) objectInputStream);
                        return null;
                    } catch (Throwable th3) {
                        Throwable th4 = th3;
                        objectInputStream = null;
                        th = th4;
                        C6239hv.m18613a((Closeable) fileInputStream);
                        C6239hv.m18613a((Closeable) objectInputStream);
                        throw th;
                    }
                }
            }
            objectInputStream = null;
            jdVar = null;
            C6239hv.m18613a((Closeable) fileInputStream2);
            C6239hv.m18613a((Closeable) objectInputStream);
            return jdVar;
        } catch (IOException | ClassNotFoundException unused3) {
            objectInputStream = null;
            fileInputStream = null;
            C6239hv.m18613a((Closeable) fileInputStream);
            C6239hv.m18613a((Closeable) objectInputStream);
            return null;
        } catch (Throwable th5) {
            fileInputStream = null;
            th = th5;
            objectInputStream = null;
            C6239hv.m18613a((Closeable) fileInputStream);
            C6239hv.m18613a((Closeable) objectInputStream);
            throw th;
        }
    }

    /* renamed from: a */
    public static void m18821a(Context context) {
        if (C6228hp.m18570a(context) == null || !C6228hp.m18570a(context).equals(C6228hp.m18574b())) {
            C6228hp.m18572a(context, C6272is.m18745a(context));
            C6228hp.m18571a(context, C6228hp.m18574b());
            Context applicationContext = context.getApplicationContext();
            File b = C6227ho.m18546b(applicationContext);
            File c = C6227ho.m18552c(applicationContext);
            C6227ho.m18542a(b, (String) null);
            C6227ho.m18542a(c, (String) null);
            C6227ho.m18555d(applicationContext);
            if (!b.mkdir()) {
                b.isDirectory();
            }
            if (!c.mkdir()) {
                c.isDirectory();
            }
        }
    }

    /* renamed from: d */
    static /* synthetic */ void m18828d() {
        try {
            C6269iq.m18729a().mo35476b();
            C6145fs.m18323a();
            C5874bk.m17607a().mo34848b();
            C6181gg a = C6181gg.m18398a();
            C6181gg.f15624a.set(false);
            a.f15626b = (C6162ga) C6145fs.m18321a("crashReporting", C6227ho.m18559f(), a);
            a.f15628d = a.f15626b.url;
            if (a.f15627c.mo35361a() > 0) {
                a.mo35358b();
            }
            C6218hh.m18506a().mo35425b();
            C6281iw.m18775a().mo35494b();
            C5861bg.m17544a().mo34835b();
            C6218hh.m18506a().mo35424a("SessionStarted", (Map<String, Object>) new HashMap());
        } catch (Exception unused) {
            C6238hu.m18605a((byte) 2, f15936b, "SDK encountered unexpected error while starting internal components");
        }
    }
}

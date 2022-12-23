package com.tapjoy.internal;

import android.content.Context;
import android.content.SharedPreferences;
import com.tapjoy.TapjoyUtil;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.tapjoy.internal.id */
public class C11756id {

    /* renamed from: a */
    public static final C11756id f28629a = new C11756id();

    /* renamed from: b */
    public Context f28630b;

    /* renamed from: c */
    public SharedPreferences f28631c = null;

    /* renamed from: d */
    public SharedPreferences f28632d = null;

    /* renamed from: e */
    private File f28633e;

    /* renamed from: f */
    private ExecutorService f28634f = new ThreadPoolExecutor(0, 1, 1, TimeUnit.SECONDS, new LinkedBlockingQueue());

    /* renamed from: a */
    public static boolean m34144a(long j) {
        return j >= 3600;
    }

    private C11756id() {
    }

    /* renamed from: a */
    public final void mo72686a() {
        this.f28634f.submit(new Runnable() {
            public final void run() {
                if (C11756id.this.f28630b != null) {
                    C11756id.this.m34147c();
                }
            }
        });
    }

    /* renamed from: a */
    public final File mo72685a(URL url) {
        if (this.f28630b == null) {
            return null;
        }
        synchronized (this) {
            String b = mo72689b(url);
            File a = mo72684a(b);
            if (!a.exists()) {
                return null;
            }
            long b2 = C11841u.m34410b();
            long j = this.f28631c.getLong(b, 0);
            if (j >= b2) {
                Object[] objArr = new Object[2];
                return a;
            }
            Object[] objArr2 = new Object[3];
            Long.valueOf(b2);
            Long.valueOf(j);
            if (j != 0) {
                this.f28631c.edit().remove(b).commit();
                this.f28632d.edit().remove(b).commit();
            }
            a.delete();
            return null;
        }
    }

    /* renamed from: a */
    public final void mo72687a(URL url, InputStream inputStream, long j) {
        if (this.f28630b != null) {
            final URL url2 = url;
            final InputStream inputStream2 = inputStream;
            final long j2 = j;
            this.f28634f.submit(new Runnable() {
                public final void run() {
                    try {
                        File createTempFile = File.createTempFile("tj_", (String) null, C11756id.this.mo72688b());
                        if (createTempFile == null) {
                            Class<C11756id> cls = C11756id.class;
                            Object[] objArr = new Object[1];
                            return;
                        }
                        FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
                        try {
                            C11685gn.m33919a(inputStream2, fileOutputStream);
                            fileOutputStream.close();
                            long j = j2;
                            if (j > 604800) {
                                j = 604800;
                            }
                            long b = C11841u.m34410b() + (j * 1000);
                            synchronized (C11756id.this) {
                                String b2 = C11756id.this.mo72689b(url2);
                                if (createTempFile.renameTo(C11756id.this.mo72684a(b2))) {
                                    C11756id.this.f28631c.edit().putLong(b2, b).commit();
                                    Class<C11756id> cls2 = C11756id.class;
                                    Object[] objArr2 = new Object[3];
                                } else {
                                    Class<C11756id> cls3 = C11756id.class;
                                }
                            }
                        } catch (IOException unused) {
                            Class<C11756id> cls4 = C11756id.class;
                            Object[] objArr3 = new Object[1];
                        }
                    } catch (FileNotFoundException unused2) {
                        Class<C11756id> cls5 = C11756id.class;
                        Object[] objArr4 = new Object[1];
                    } catch (IOException unused3) {
                        Class<C11756id> cls6 = C11756id.class;
                        Object[] objArr5 = new Object[1];
                    }
                }
            });
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final synchronized String mo72689b(URL url) {
        String str;
        String string;
        String url2 = url.toString();
        String convertToHex = TapjoyUtil.convertToHex(C11478cb.m33382a(url2.getBytes()));
        String string2 = this.f28632d.getString(convertToHex, (String) null);
        if (string2 == null) {
            this.f28632d.edit().putString(convertToHex, url2).commit();
            return convertToHex;
        } else if (string2.equals(url2)) {
            return convertToHex;
        } else {
            int i = 0;
            do {
                i++;
                str = convertToHex + "_" + i;
                string = this.f28632d.getString(str, (String) null);
                if (string == null || string.equals(url2)) {
                    this.f28632d.edit().putString(str, url2).commit();
                }
                i++;
                str = convertToHex + "_" + i;
                string = this.f28632d.getString(str, (String) null);
                break;
            } while (string.equals(url2));
            this.f28632d.edit().putString(str, url2).commit();
            return str;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final File mo72688b() {
        File file = this.f28633e;
        if (file == null) {
            file = new File(this.f28630b.getCacheDir(), "tapjoy_mm_cache");
            this.f28633e = file;
        }
        if (!file.isDirectory()) {
            file.delete();
        }
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final File mo72684a(String str) {
        return new File(mo72688b(), str);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public synchronized void m34147c() {
        boolean z;
        long b = C11841u.m34410b();
        File[] listFiles = mo72688b().listFiles();
        HashMap hashMap = new HashMap();
        if (listFiles != null) {
            for (File file : listFiles) {
                hashMap.put(file.getName(), file);
            }
        }
        SharedPreferences.Editor edit = this.f28631c.edit();
        SharedPreferences.Editor edit2 = this.f28632d.edit();
        HashMap hashMap2 = new HashMap(this.f28631c.getAll());
        HashMap hashMap3 = new HashMap(this.f28632d.getAll());
        Iterator it = hashMap2.entrySet().iterator();
        boolean z2 = false;
        while (true) {
            z = true;
            if (!it.hasNext()) {
                break;
            }
            String str = (String) ((Map.Entry) it.next()).getKey();
            if (!hashMap3.containsKey(str)) {
                it.remove();
                edit.remove(str);
                Object[] objArr = new Object[1];
                z2 = true;
            }
        }
        Iterator it2 = hashMap3.entrySet().iterator();
        while (it2.hasNext()) {
            String str2 = (String) ((Map.Entry) it2.next()).getKey();
            if (!hashMap2.containsKey(str2)) {
                it2.remove();
                edit2.remove(str2);
                Object[] objArr2 = new Object[1];
                z2 = true;
            }
        }
        Iterator it3 = hashMap2.entrySet().iterator();
        while (it3.hasNext()) {
            Map.Entry entry = (Map.Entry) it3.next();
            String str3 = (String) entry.getKey();
            if (((Long) entry.getValue()).longValue() < b) {
                it3.remove();
                edit.remove(str3);
                edit2.remove(str3);
                z2 = true;
            } else {
                hashMap.remove(str3);
            }
        }
        for (Map.Entry value : hashMap.entrySet()) {
            ((File) value.getValue()).delete();
            Object[] objArr3 = new Object[1];
        }
        if (hashMap2.size() > 30) {
            int size = hashMap2.size() - 30;
            LinkedList linkedList = new LinkedList(hashMap2.entrySet());
            Collections.sort(linkedList, new Comparator<Map.Entry<String, ?>>() {
                public final /* synthetic */ int compare(Object obj, Object obj2) {
                    return ((Long) ((Map.Entry) obj).getValue()).compareTo((Long) ((Map.Entry) obj2).getValue());
                }
            });
            Iterator it4 = linkedList.iterator();
            for (int i = 0; i < size && it4.hasNext(); i++) {
                Map.Entry entry2 = (Map.Entry) it4.next();
                String str4 = (String) entry2.getKey();
                Long l = (Long) entry2.getValue();
                edit.remove(str4);
                edit2.remove(str4);
                mo72684a(str4).delete();
                Object[] objArr4 = new Object[2];
            }
        } else {
            z = z2;
        }
        if (z) {
            edit.commit();
            edit2.commit();
        }
    }
}

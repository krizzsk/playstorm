package com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache;

import android.util.SparseArray;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.C4974a;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C5023a;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C5024b;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C5040o;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C5049u;
import java.io.Closeable;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Random;
import javax.crypto.Cipher;
import javax.crypto.CipherOutputStream;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.i */
public final class C4986i {

    /* renamed from: a */
    public final HashMap<String, C4985h> f13292a;

    /* renamed from: b */
    public final SparseArray<String> f13293b;

    /* renamed from: c */
    public final C5024b f13294c;

    /* renamed from: d */
    public final Cipher f13295d;

    /* renamed from: e */
    public final SecretKeySpec f13296e;

    /* renamed from: f */
    public boolean f13297f;

    /* renamed from: g */
    public C5040o f13298g;

    public C4986i(File file, byte[] bArr) {
        if (bArr != null) {
            C5023a.m15302a(bArr.length == 16);
            try {
                this.f13295d = Cipher.getInstance("AES/CBC/PKCS5PADDING");
                this.f13296e = new SecretKeySpec(bArr, "AES");
            } catch (NoSuchAlgorithmException | NoSuchPaddingException e) {
                throw new IllegalStateException(e);
            }
        } else {
            this.f13295d = null;
            this.f13296e = null;
        }
        this.f13292a = new HashMap<>();
        this.f13293b = new SparseArray<>();
        this.f13294c = new C5024b(new File(file, CachedContentIndex.FILE_NAME));
    }

    /* renamed from: a */
    public C4985h mo25535a(String str) {
        return this.f13292a.get(str);
    }

    /* renamed from: b */
    public void mo25540b(String str) {
        C4985h remove = this.f13292a.remove(str);
        if (remove != null) {
            C5023a.m15304b(remove.f13290c.isEmpty());
            this.f13293b.remove(remove.f13288a);
            this.f13297f = true;
        }
    }

    /* renamed from: c */
    public void mo25541c() throws C4974a.C4975a {
        DataOutputStream dataOutputStream;
        Throwable th;
        Throwable th2;
        IOException e;
        if (this.f13297f) {
            DataOutputStream dataOutputStream2 = null;
            try {
                OutputStream b = this.f13294c.mo25575b();
                C5040o oVar = this.f13298g;
                if (oVar == null) {
                    this.f13298g = new C5040o(b);
                } else {
                    oVar.mo25627a(b);
                }
                dataOutputStream = new DataOutputStream(this.f13298g);
                try {
                    dataOutputStream.writeInt(1);
                    dataOutputStream.writeInt(this.f13295d != null ? 1 : 0);
                    if (this.f13295d != null) {
                        byte[] bArr = new byte[16];
                        new Random().nextBytes(bArr);
                        dataOutputStream.write(bArr);
                        try {
                            this.f13295d.init(1, this.f13296e, new IvParameterSpec(bArr));
                            dataOutputStream.flush();
                            dataOutputStream2 = new DataOutputStream(new CipherOutputStream(this.f13298g, this.f13295d));
                        } catch (InvalidKeyException e2) {
                            e = e2;
                            throw new IllegalStateException(e);
                        } catch (InvalidAlgorithmParameterException e3) {
                            e = e3;
                            throw new IllegalStateException(e);
                        }
                    } else {
                        dataOutputStream2 = dataOutputStream;
                    }
                    dataOutputStream2.writeInt(this.f13292a.size());
                    int i = 0;
                    for (C4985h next : this.f13292a.values()) {
                        dataOutputStream2.writeInt(next.f13288a);
                        dataOutputStream2.writeUTF(next.f13289b);
                        dataOutputStream2.writeLong(next.f13291d);
                        i += next.mo25534a();
                    }
                    dataOutputStream2.writeInt(i);
                    C5024b bVar = this.f13294c;
                    bVar.getClass();
                    dataOutputStream2.close();
                    bVar.f13410b.delete();
                    int i2 = C5049u.f13471a;
                    this.f13297f = false;
                } catch (IOException e4) {
                    e = e4;
                    try {
                        throw new C4974a.C4975a(e);
                    } catch (Throwable th3) {
                        DataOutputStream dataOutputStream3 = dataOutputStream;
                        th2 = th3;
                        dataOutputStream2 = dataOutputStream3;
                        Throwable th4 = th2;
                        dataOutputStream = dataOutputStream2;
                        th = th4;
                        C5049u.m15391a((Closeable) dataOutputStream);
                        throw th;
                    }
                } catch (Throwable th5) {
                    th = th5;
                    C5049u.m15391a((Closeable) dataOutputStream);
                    throw th;
                }
            } catch (IOException e5) {
                IOException iOException = e5;
                dataOutputStream = dataOutputStream2;
                e = iOException;
                throw new C4974a.C4975a(e);
            } catch (Throwable th6) {
                th2 = th6;
                Throwable th42 = th2;
                dataOutputStream = dataOutputStream2;
                th = th42;
                C5049u.m15391a((Closeable) dataOutputStream);
                throw th;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:51:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00af  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo25538a() {
        /*
            r11 = this;
            r0 = 0
            r1 = 0
            java.io.BufferedInputStream r2 = new java.io.BufferedInputStream     // Catch:{ FileNotFoundException -> 0x00ac, IOException -> 0x0097 }
            com.fyber.inneractive.sdk.player.exoplayer2.util.b r3 = r11.f13294c     // Catch:{ FileNotFoundException -> 0x00ac, IOException -> 0x0097 }
            java.io.InputStream r3 = r3.mo25574a()     // Catch:{ FileNotFoundException -> 0x00ac, IOException -> 0x0097 }
            r2.<init>(r3)     // Catch:{ FileNotFoundException -> 0x00ac, IOException -> 0x0097 }
            java.io.DataInputStream r3 = new java.io.DataInputStream     // Catch:{ FileNotFoundException -> 0x00ac, IOException -> 0x0097 }
            r3.<init>(r2)     // Catch:{ FileNotFoundException -> 0x00ac, IOException -> 0x0097 }
            int r1 = r3.readInt()     // Catch:{ FileNotFoundException -> 0x00ad, IOException -> 0x0091, all -> 0x008f }
            r4 = 1
            if (r1 == r4) goto L_0x001d
            com.fyber.inneractive.sdk.player.exoplayer2.util.C5049u.m15391a((java.io.Closeable) r3)
            return r0
        L_0x001d:
            int r1 = r3.readInt()     // Catch:{ FileNotFoundException -> 0x00ad, IOException -> 0x0091, all -> 0x008f }
            r1 = r1 & r4
            if (r1 == 0) goto L_0x0056
            javax.crypto.Cipher r1 = r11.f13295d     // Catch:{ FileNotFoundException -> 0x00ad, IOException -> 0x0091, all -> 0x008f }
            if (r1 != 0) goto L_0x002c
            com.fyber.inneractive.sdk.player.exoplayer2.util.C5049u.m15391a((java.io.Closeable) r3)
            return r0
        L_0x002c:
            r1 = 16
            byte[] r1 = new byte[r1]     // Catch:{ FileNotFoundException -> 0x00ad, IOException -> 0x0091, all -> 0x008f }
            r3.readFully(r1)     // Catch:{ FileNotFoundException -> 0x00ad, IOException -> 0x0091, all -> 0x008f }
            javax.crypto.spec.IvParameterSpec r5 = new javax.crypto.spec.IvParameterSpec     // Catch:{ FileNotFoundException -> 0x00ad, IOException -> 0x0091, all -> 0x008f }
            r5.<init>(r1)     // Catch:{ FileNotFoundException -> 0x00ad, IOException -> 0x0091, all -> 0x008f }
            javax.crypto.Cipher r1 = r11.f13295d     // Catch:{ InvalidKeyException -> 0x004f, InvalidAlgorithmParameterException -> 0x004d }
            r6 = 2
            javax.crypto.spec.SecretKeySpec r7 = r11.f13296e     // Catch:{ InvalidKeyException -> 0x004f, InvalidAlgorithmParameterException -> 0x004d }
            r1.init(r6, r7, r5)     // Catch:{ InvalidKeyException -> 0x004f, InvalidAlgorithmParameterException -> 0x004d }
            java.io.DataInputStream r1 = new java.io.DataInputStream     // Catch:{ FileNotFoundException -> 0x00ad, IOException -> 0x0091, all -> 0x008f }
            javax.crypto.CipherInputStream r5 = new javax.crypto.CipherInputStream     // Catch:{ FileNotFoundException -> 0x00ad, IOException -> 0x0091, all -> 0x008f }
            javax.crypto.Cipher r6 = r11.f13295d     // Catch:{ FileNotFoundException -> 0x00ad, IOException -> 0x0091, all -> 0x008f }
            r5.<init>(r2, r6)     // Catch:{ FileNotFoundException -> 0x00ad, IOException -> 0x0091, all -> 0x008f }
            r1.<init>(r5)     // Catch:{ FileNotFoundException -> 0x00ad, IOException -> 0x0091, all -> 0x008f }
            goto L_0x005d
        L_0x004d:
            r1 = move-exception
            goto L_0x0050
        L_0x004f:
            r1 = move-exception
        L_0x0050:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException     // Catch:{ FileNotFoundException -> 0x00ad, IOException -> 0x0091, all -> 0x008f }
            r2.<init>(r1)     // Catch:{ FileNotFoundException -> 0x00ad, IOException -> 0x0091, all -> 0x008f }
            throw r2     // Catch:{ FileNotFoundException -> 0x00ad, IOException -> 0x0091, all -> 0x008f }
        L_0x0056:
            javax.crypto.Cipher r1 = r11.f13295d     // Catch:{ FileNotFoundException -> 0x00ad, IOException -> 0x0091, all -> 0x008f }
            if (r1 == 0) goto L_0x005c
            r11.f13297f = r4     // Catch:{ FileNotFoundException -> 0x00ad, IOException -> 0x0091, all -> 0x008f }
        L_0x005c:
            r1 = r3
        L_0x005d:
            int r2 = r1.readInt()     // Catch:{ FileNotFoundException -> 0x00ac, IOException -> 0x0097 }
            r3 = r0
            r5 = r3
        L_0x0063:
            if (r3 >= r2) goto L_0x0081
            com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.h r6 = new com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.h     // Catch:{ FileNotFoundException -> 0x00ac, IOException -> 0x0097 }
            int r7 = r1.readInt()     // Catch:{ FileNotFoundException -> 0x00ac, IOException -> 0x0097 }
            java.lang.String r8 = r1.readUTF()     // Catch:{ FileNotFoundException -> 0x00ac, IOException -> 0x0097 }
            long r9 = r1.readLong()     // Catch:{ FileNotFoundException -> 0x00ac, IOException -> 0x0097 }
            r6.<init>(r7, r8, r9)     // Catch:{ FileNotFoundException -> 0x00ac, IOException -> 0x0097 }
            r11.mo25537a((com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.C4985h) r6)     // Catch:{ FileNotFoundException -> 0x00ac, IOException -> 0x0097 }
            int r6 = r6.mo25534a()     // Catch:{ FileNotFoundException -> 0x00ac, IOException -> 0x0097 }
            int r5 = r5 + r6
            int r3 = r3 + 1
            goto L_0x0063
        L_0x0081:
            int r2 = r1.readInt()     // Catch:{ FileNotFoundException -> 0x00ac, IOException -> 0x0097 }
            if (r2 == r5) goto L_0x008b
            com.fyber.inneractive.sdk.player.exoplayer2.util.C5049u.m15391a((java.io.Closeable) r1)
            return r0
        L_0x008b:
            com.fyber.inneractive.sdk.player.exoplayer2.util.C5049u.m15391a((java.io.Closeable) r1)
            return r4
        L_0x008f:
            r0 = move-exception
            goto L_0x00a6
        L_0x0091:
            r1 = move-exception
            r2 = r1
            r1 = r3
            goto L_0x0098
        L_0x0095:
            r0 = move-exception
            goto L_0x00a5
        L_0x0097:
            r2 = move-exception
        L_0x0098:
            java.lang.String r3 = "CachedContentIndex"
            java.lang.String r4 = "Error reading cache content index file."
            android.util.Log.e(r3, r4, r2)     // Catch:{ all -> 0x0095 }
            if (r1 == 0) goto L_0x00a4
            com.fyber.inneractive.sdk.player.exoplayer2.util.C5049u.m15391a((java.io.Closeable) r1)
        L_0x00a4:
            return r0
        L_0x00a5:
            r3 = r1
        L_0x00a6:
            if (r3 == 0) goto L_0x00ab
            com.fyber.inneractive.sdk.player.exoplayer2.util.C5049u.m15391a((java.io.Closeable) r3)
        L_0x00ab:
            throw r0
        L_0x00ac:
            r3 = r1
        L_0x00ad:
            if (r3 == 0) goto L_0x00b2
            com.fyber.inneractive.sdk.player.exoplayer2.util.C5049u.m15391a((java.io.Closeable) r3)
        L_0x00b2:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.C4986i.mo25538a():boolean");
    }

    /* renamed from: b */
    public void mo25539b() {
        LinkedList linkedList = new LinkedList();
        for (C4985h next : this.f13292a.values()) {
            if (next.f13290c.isEmpty()) {
                linkedList.add(next.f13289b);
            }
        }
        Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            mo25540b((String) it.next());
        }
    }

    /* renamed from: a */
    public final void mo25537a(C4985h hVar) {
        this.f13292a.put(hVar.f13289b, hVar);
        this.f13293b.put(hVar.f13288a, hVar.f13289b);
    }

    /* renamed from: a */
    public final C4985h mo25536a(String str, long j) {
        int i;
        SparseArray<String> sparseArray = this.f13293b;
        int size = sparseArray.size();
        int i2 = 0;
        if (size == 0) {
            i = 0;
        } else {
            i = sparseArray.keyAt(size - 1) + 1;
        }
        if (i < 0) {
            while (i2 < size && i2 == sparseArray.keyAt(i2)) {
                i2++;
            }
            i = i2;
        }
        C4985h hVar = new C4985h(i, str, j);
        this.f13292a.put(str, hVar);
        this.f13293b.put(i, str);
        this.f13297f = true;
        return hVar;
    }
}

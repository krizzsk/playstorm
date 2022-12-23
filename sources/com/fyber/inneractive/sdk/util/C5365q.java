package com.fyber.inneractive.sdk.util;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.AsyncTask;
import com.fyber.inneractive.sdk.player.C4591c;
import com.fyber.inneractive.sdk.player.C4664d;

/* renamed from: com.fyber.inneractive.sdk.util.q */
public class C5365q extends AsyncTask<Void, Void, Bitmap> {

    /* renamed from: a */
    public Context f14233a;

    /* renamed from: b */
    public C5366a f14234b;

    /* renamed from: c */
    public String f14235c;

    /* renamed from: d */
    public String f14236d = null;

    /* renamed from: e */
    public int f14237e;

    /* renamed from: com.fyber.inneractive.sdk.util.q$a */
    public interface C5366a {
    }

    public C5365q(Context context, C5366a aVar, String str, String str2, int i) {
        this.f14233a = context;
        this.f14234b = aVar;
        this.f14235c = str;
        this.f14237e = i;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v0, resolved type: java.io.FileOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: java.io.FileOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: java.io.FileOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: java.net.HttpURLConnection} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: java.io.FileOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v6, resolved type: java.io.FileOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v7, resolved type: java.io.FileOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v6, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v16, resolved type: java.net.HttpURLConnection} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v17, resolved type: java.net.HttpURLConnection} */
    /* JADX WARNING: type inference failed for: r6v0, types: [java.net.HttpURLConnection] */
    /* JADX WARNING: type inference failed for: r6v15 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00c9 A[Catch:{ all -> 0x00e0, all -> 0x00f1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00ce A[SYNTHETIC, Splitter:B:68:0x00ce] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x00d3 A[Catch:{ all -> 0x00dc }] */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x00d8 A[Catch:{ all -> 0x00dc }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object doInBackground(java.lang.Object[] r12) {
        /*
            r11 = this;
            java.lang.Void[] r12 = (java.lang.Void[]) r12
            r12 = 8192(0x2000, float:1.14794E-41)
            byte[] r0 = new byte[r12]
            r1 = 1
            r2 = 0
            r3 = 0
            java.io.File r4 = new java.io.File     // Catch:{ all -> 0x00b5 }
            android.content.Context r5 = r11.f14233a     // Catch:{ all -> 0x00b5 }
            java.io.File r5 = r5.getFilesDir()     // Catch:{ all -> 0x00b5 }
            java.lang.String r6 = r11.f14236d     // Catch:{ all -> 0x00b5 }
            boolean r6 = android.text.TextUtils.isEmpty(r6)     // Catch:{ all -> 0x00b5 }
            if (r6 == 0) goto L_0x0033
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x00b5 }
            r6.<init>()     // Catch:{ all -> 0x00b5 }
            java.util.UUID r7 = java.util.UUID.randomUUID()     // Catch:{ all -> 0x00b5 }
            java.lang.String r7 = r7.toString()     // Catch:{ all -> 0x00b5 }
            r6.append(r7)     // Catch:{ all -> 0x00b5 }
            java.lang.String r7 = ".mp4"
            r6.append(r7)     // Catch:{ all -> 0x00b5 }
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x00b5 }
            goto L_0x0035
        L_0x0033:
            java.lang.String r6 = r11.f14236d     // Catch:{ all -> 0x00b5 }
        L_0x0035:
            r4.<init>(r5, r6)     // Catch:{ all -> 0x00b5 }
            java.io.FileOutputStream r5 = new java.io.FileOutputStream     // Catch:{ all -> 0x00b2 }
            r5.<init>(r4)     // Catch:{ all -> 0x00b2 }
            java.net.URL r6 = new java.net.URL     // Catch:{ all -> 0x00af }
            java.lang.String r7 = r11.f14235c     // Catch:{ all -> 0x00af }
            r6.<init>(r7)     // Catch:{ all -> 0x00af }
            java.net.URLConnection r6 = r6.openConnection()     // Catch:{ all -> 0x00af }
            java.net.HttpURLConnection r6 = (java.net.HttpURLConnection) r6     // Catch:{ all -> 0x00af }
            java.io.InputStream r7 = r6.getInputStream()     // Catch:{ all -> 0x00ac }
            r8 = r2
        L_0x004f:
            int r9 = r11.f14237e     // Catch:{ all -> 0x00aa }
            int r9 = r9 - r12
            if (r8 >= r9) goto L_0x0060
            int r9 = r7.read(r0, r2, r12)     // Catch:{ all -> 0x00aa }
            r10 = -1
            if (r9 <= r10) goto L_0x004f
            r5.write(r0, r2, r9)     // Catch:{ all -> 0x00aa }
            int r8 = r8 + r9
            goto L_0x004f
        L_0x0060:
            r6.disconnect()     // Catch:{ all -> 0x006c }
            r5.close()     // Catch:{ all -> 0x006c }
            if (r7 == 0) goto L_0x006f
            r7.close()     // Catch:{ all -> 0x006c }
            goto L_0x006f
        L_0x006c:
            r4.delete()
        L_0x006f:
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            android.media.MediaMetadataRetriever r5 = new android.media.MediaMetadataRetriever
            r5.<init>()
            monitor-enter(r0)     // Catch:{ Exception -> 0x0091 }
            java.lang.String r6 = r4.getPath()     // Catch:{ all -> 0x008c }
            r5.setDataSource(r6)     // Catch:{ all -> 0x008c }
            r5.extractMetadata(r12)     // Catch:{ all -> 0x008c }
            r6 = 1
            android.graphics.Bitmap r3 = r5.getFrameAtTime(r6)     // Catch:{ all -> 0x008c }
            monitor-exit(r0)     // Catch:{ all -> 0x008c }
            goto L_0x009f
        L_0x008c:
            r12 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x008c }
            throw r12     // Catch:{ Exception -> 0x0091 }
        L_0x008f:
            r12 = move-exception
            goto L_0x00a6
        L_0x0091:
            r12 = move-exception
            java.lang.String r0 = "Failed getting frame from video file%s"
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ all -> 0x008f }
            java.lang.String r12 = com.fyber.inneractive.sdk.util.C5370s.m16787a((java.lang.Throwable) r12)     // Catch:{ all -> 0x008f }
            r1[r2] = r12     // Catch:{ all -> 0x008f }
            com.fyber.inneractive.sdk.util.IAlog.m16699a(r0, r1)     // Catch:{ all -> 0x008f }
        L_0x009f:
            r5.release()     // Catch:{ all -> 0x00a2 }
        L_0x00a2:
            r4.delete()
            goto L_0x00df
        L_0x00a6:
            r5.release()     // Catch:{ all -> 0x00a9 }
        L_0x00a9:
            throw r12
        L_0x00aa:
            r12 = move-exception
            goto L_0x00ba
        L_0x00ac:
            r12 = move-exception
            r7 = r3
            goto L_0x00ba
        L_0x00af:
            r12 = move-exception
            r6 = r3
            goto L_0x00b9
        L_0x00b2:
            r12 = move-exception
            r5 = r3
            goto L_0x00b8
        L_0x00b5:
            r12 = move-exception
            r4 = r3
            r5 = r4
        L_0x00b8:
            r6 = r5
        L_0x00b9:
            r7 = r6
        L_0x00ba:
            java.lang.String r0 = "Failed getting frame from video file%s"
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ all -> 0x00e0 }
            java.lang.String r12 = com.fyber.inneractive.sdk.util.C5370s.m16787a((java.lang.Throwable) r12)     // Catch:{ all -> 0x00e0 }
            r1[r2] = r12     // Catch:{ all -> 0x00e0 }
            com.fyber.inneractive.sdk.util.IAlog.m16699a(r0, r1)     // Catch:{ all -> 0x00e0 }
            if (r4 == 0) goto L_0x00cc
            r4.delete()     // Catch:{ all -> 0x00e0 }
        L_0x00cc:
            if (r6 == 0) goto L_0x00d1
            r6.disconnect()     // Catch:{ all -> 0x00dc }
        L_0x00d1:
            if (r5 == 0) goto L_0x00d6
            r5.close()     // Catch:{ all -> 0x00dc }
        L_0x00d6:
            if (r7 == 0) goto L_0x00df
            r7.close()     // Catch:{ all -> 0x00dc }
            goto L_0x00df
        L_0x00dc:
            r4.delete()
        L_0x00df:
            return r3
        L_0x00e0:
            r12 = move-exception
            if (r6 == 0) goto L_0x00e6
            r6.disconnect()     // Catch:{ all -> 0x00f1 }
        L_0x00e6:
            if (r5 == 0) goto L_0x00eb
            r5.close()     // Catch:{ all -> 0x00f1 }
        L_0x00eb:
            if (r7 == 0) goto L_0x00f4
            r7.close()     // Catch:{ all -> 0x00f1 }
            goto L_0x00f4
        L_0x00f1:
            r4.delete()
        L_0x00f4:
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.util.C5365q.doInBackground(java.lang.Object[]):java.lang.Object");
    }

    public void onPostExecute(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        C5366a aVar = this.f14234b;
        if (aVar != null) {
            if (bitmap != null) {
                C4664d dVar = (C4664d) aVar;
                C4591c cVar = dVar.f11641a;
                if (cVar.f11418n != null) {
                    cVar.mo24789a(bitmap);
                    C4591c cVar2 = dVar.f11641a;
                    cVar2.f11417m = null;
                    cVar2.f11418n = null;
                }
                IAlog.m16699a("MediaPlayerController: fetching video frame success!", new Object[0]);
            } else {
                C4664d dVar2 = (C4664d) aVar;
                C4591c cVar3 = dVar2.f11641a;
                if (cVar3.f11418n != null) {
                    cVar3.mo24789a((Bitmap) null);
                    C4591c cVar4 = dVar2.f11641a;
                    cVar4.f11417m = null;
                    cVar4.f11418n = null;
                }
                IAlog.m16699a("MediaPlayerController: fetching video frame failed!", new Object[0]);
            }
            this.f14234b = null;
        }
    }
}

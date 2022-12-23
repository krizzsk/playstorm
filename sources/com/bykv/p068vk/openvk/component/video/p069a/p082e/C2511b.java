package com.bykv.p068vk.openvk.component.video.p069a.p082e;

import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import android.os.AsyncTask;
import com.bykv.p068vk.openvk.component.video.api.p088f.C2536c;
import java.util.HashMap;

/* renamed from: com.bykv.vk.openvk.component.video.a.e.b */
/* compiled from: MediaUtils */
public class C2511b {

    /* renamed from: com.bykv.vk.openvk.component.video.a.e.b$b */
    /* compiled from: MediaUtils */
    public interface C2513b {
        /* renamed from: a */
        void mo16319a(Bitmap bitmap);
    }

    /* renamed from: a */
    public static void m6218a(long j, String str, C2513b bVar) {
        new C2512a(bVar, j).execute(new String[]{str});
    }

    /* renamed from: com.bykv.vk.openvk.component.video.a.e.b$a */
    /* compiled from: MediaUtils */
    public static class C2512a extends AsyncTask<String, Integer, Bitmap> {

        /* renamed from: a */
        private C2513b f5364a;

        /* renamed from: b */
        private long f5365b = 0;

        public C2512a(C2513b bVar, long j) {
            this.f5364a = bVar;
            this.f5365b = j;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Bitmap doInBackground(String... strArr) {
            try {
                MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                String str = strArr[0];
                if (str.startsWith("http")) {
                    mediaMetadataRetriever.setDataSource(str, new HashMap());
                } else {
                    mediaMetadataRetriever.setDataSource(str);
                }
                Bitmap frameAtTime = mediaMetadataRetriever.getFrameAtTime(this.f5365b * 1000, 3);
                mediaMetadataRetriever.release();
                return frameAtTime;
            } catch (Throwable th) {
                C2536c.m6441c("MediaUtils", "MediaUtils doInBackground : ", th);
                return null;
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void onPostExecute(Bitmap bitmap) {
            super.onPostExecute(bitmap);
            C2513b bVar = this.f5364a;
            if (bVar != null) {
                bVar.mo16319a(bitmap);
            }
        }
    }
}

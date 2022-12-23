package com.p374my.target;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Looper;
import android.widget.ImageView;
import com.p374my.target.C9807k8;
import com.p374my.target.common.models.ImageData;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;

/* renamed from: com.my.target.k8 */
public class C9807k8 {

    /* renamed from: a */
    public static final WeakHashMap<ImageView, ImageData> f24217a = new WeakHashMap<>();

    /* renamed from: b */
    public final List<ImageData> f24218b;

    /* renamed from: c */
    public C9808a f24219c;

    /* renamed from: d */
    public boolean f24220d;

    /* renamed from: com.my.target.k8$a */
    public interface C9808a {
        /* renamed from: a */
        void mo63328a(boolean z);
    }

    public C9807k8(List<ImageData> list) {
        this.f24218b = list;
    }

    /* renamed from: a */
    public static C9807k8 m28508a(ImageData imageData) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(imageData);
        return new C9807k8(arrayList);
    }

    /* renamed from: a */
    public static C9807k8 m28509a(List<ImageData> list) {
        return new C9807k8(list);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m28510a(Context context) {
        mo64623c(context);
        mo64621a();
    }

    /* renamed from: a */
    public static void m28511a(Bitmap bitmap, ImageView imageView) {
        if (imageView instanceof C9804k6) {
            ((C9804k6) imageView).setImageBitmap(bitmap, true);
        } else {
            imageView.setImageBitmap(bitmap);
        }
    }

    /* renamed from: a */
    public static void m28512a(ImageData imageData, ImageView imageView) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            C9672e0.m27883b("[ImageLoader] method cancel called from worker thread");
            return;
        }
        WeakHashMap<ImageView, ImageData> weakHashMap = f24217a;
        if (weakHashMap.get(imageView) == imageData) {
            weakHashMap.remove(imageView);
        }
    }

    /* renamed from: a */
    public static void m28513a(ImageData imageData, ImageView imageView, C9808a aVar) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            C9672e0.m27883b("[ImageLoader] method loadAndDisplay called from worker thread");
            return;
        }
        WeakHashMap<ImageView, ImageData> weakHashMap = f24217a;
        if (weakHashMap.get(imageView) != imageData) {
            weakHashMap.remove(imageView);
            if (imageData.getBitmap() != null) {
                m28511a(imageData.getBitmap(), imageView);
                return;
            }
            weakHashMap.put(imageView, imageData);
            m28508a(imageData).mo64620a((C9808a) new C9808a(new WeakReference(imageView), imageData, aVar) {
                public final /* synthetic */ WeakReference f$0;
                public final /* synthetic */ ImageData f$1;
                public final /* synthetic */ C9807k8.C9808a f$2;

                {
                    this.f$0 = r1;
                    this.f$1 = r2;
                    this.f$2 = r3;
                }

                /* renamed from: a */
                public final void mo63328a(boolean z) {
                    C9807k8.m28514a(this.f$0, this.f$1, this.f$2, z);
                }
            }).mo64622b(imageView.getContext());
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m28514a(WeakReference weakReference, ImageData imageData, C9808a aVar, boolean z) {
        ImageView imageView = (ImageView) weakReference.get();
        if (imageView != null) {
            WeakHashMap<ImageView, ImageData> weakHashMap = f24217a;
            if (imageData == weakHashMap.get(imageView)) {
                weakHashMap.remove(imageView);
                Bitmap bitmap = imageData.getBitmap();
                if (bitmap != null) {
                    m28511a(bitmap, imageView);
                }
            }
        }
        if (aVar != null) {
            aVar.mo63328a(imageData.getBitmap() != null);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m28515b() {
        C9808a aVar = this.f24219c;
        if (aVar != null) {
            aVar.mo63328a(true);
            this.f24219c = null;
        }
    }

    /* renamed from: b */
    public static void m28516b(ImageData imageData, ImageView imageView) {
        m28513a(imageData, imageView, (C9808a) null);
    }

    /* renamed from: a */
    public C9807k8 mo64620a(C9808a aVar) {
        this.f24219c = aVar;
        return this;
    }

    /* renamed from: a */
    public final void mo64621a() {
        if (this.f24219c != null) {
            C9693f0.m27983c(new Runnable() {
                public final void run() {
                    C9807k8.this.m28515b();
                }
            });
        }
    }

    /* renamed from: b */
    public void mo64622b(Context context) {
        if (this.f24218b.isEmpty()) {
            mo64621a();
        } else {
            C9693f0.m27979a(new Runnable(context.getApplicationContext()) {
                public final /* synthetic */ Context f$1;

                {
                    this.f$1 = r2;
                }

                public final void run() {
                    C9807k8.this.m28510a(this.f$1);
                }
            });
        }
    }

    /* renamed from: c */
    public void mo64623c(Context context) {
        Bitmap bitmap;
        if (C9693f0.m27982b()) {
            C9672e0.m27883b("[ImageLoader] method loadSync called from main thread");
            return;
        }
        Context applicationContext = context.getApplicationContext();
        C9698f3 d = this.f24220d ? C9698f3.m28014d() : C9698f3.m28015e();
        for (ImageData next : this.f24218b) {
            if (next.getBitmap() == null && (bitmap = (Bitmap) d.mo64164b(next.getUrl(), (String) null, applicationContext)) != null) {
                next.setData(bitmap);
                if (next.getHeight() == 0 || next.getWidth() == 0) {
                    next.setHeight(bitmap.getHeight());
                    next.setWidth(bitmap.getWidth());
                }
            }
        }
    }
}

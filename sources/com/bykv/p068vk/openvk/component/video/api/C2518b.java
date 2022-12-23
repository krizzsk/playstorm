package com.bykv.p068vk.openvk.component.video.api;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import com.bytedance.sdk.component.p104b.p105a.C2813i;
import java.io.File;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.bykv.vk.openvk.component.video.api.b */
/* compiled from: VideoConfig */
public class C2518b {

    /* renamed from: a */
    public static boolean f5366a = false;

    /* renamed from: b */
    private static Executor f5367b = null;

    /* renamed from: c */
    private static Context f5368c = null;

    /* renamed from: d */
    private static String f5369d = null;

    /* renamed from: e */
    private static boolean f5370e = false;

    /* renamed from: f */
    private static C2813i f5371f;

    /* renamed from: g */
    private static volatile Handler f5372g;

    /* renamed from: a */
    public static Context m6270a() {
        return f5368c;
    }

    /* renamed from: b */
    public static String m6274b() {
        if (TextUtils.isEmpty(f5369d)) {
            try {
                File file = new File(m6270a().getFilesDir(), "ttad_dir");
                if (!file.exists()) {
                    file.mkdirs();
                }
                f5369d = file.getAbsolutePath();
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        return f5369d;
    }

    /* renamed from: a */
    public static void m6271a(Context context, String str, Executor executor, Handler handler) {
        f5368c = context;
        f5367b = executor;
        f5369d = str;
        f5372g = handler;
    }

    /* renamed from: c */
    public static Handler m6275c() {
        if (f5372g == null) {
            synchronized (C2518b.class) {
                if (f5372g == null) {
                    HandlerThread handlerThread = new HandlerThread("tt_pangle_thread_video_handler_thread");
                    handlerThread.start();
                    f5372g = new Handler(handlerThread.getLooper());
                }
            }
        }
        return f5372g;
    }

    /* renamed from: d */
    public static boolean m6276d() {
        return f5370e;
    }

    /* renamed from: a */
    public static void m6273a(boolean z) {
        f5370e = z;
    }

    /* renamed from: e */
    public static C2813i m6277e() {
        if (f5371f == null) {
            f5371f = new C2813i.C2814a().mo17575a(10000, TimeUnit.MILLISECONDS).mo17578b(10000, TimeUnit.MILLISECONDS).mo17579c(10000, TimeUnit.MILLISECONDS).mo17577a();
        }
        return f5371f;
    }

    /* renamed from: a */
    public static void m6272a(C2813i iVar) {
        f5371f = iVar;
    }

    /* renamed from: f */
    public static boolean m6278f() {
        return f5366a;
    }
}

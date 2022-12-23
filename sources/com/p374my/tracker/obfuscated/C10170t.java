package com.p374my.tracker.obfuscated;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.p374my.tracker.MyTrackerConfig;
import java.io.OutputStream;

/* renamed from: com.my.tracker.obfuscated.t */
public abstract class C10170t<T> {

    /* renamed from: com.my.tracker.obfuscated.t$a */
    public interface C10171a {
        /* renamed from: a */
        String mo66257a();

        /* renamed from: a */
        void mo66264a(OutputStream outputStream);
    }

    /* renamed from: com.my.tracker.obfuscated.t$b */
    public static final class C10172b<T> {

        /* renamed from: a */
        boolean f25471a;

        /* renamed from: b */
        T f25472b;

        /* renamed from: c */
        String f25473c;

        private C10172b() {
        }

        /* renamed from: c */
        static <T> C10172b<T> m30430c() {
            return new C10172b<>();
        }

        /* renamed from: a */
        public T mo66384a() {
            return this.f25472b;
        }

        /* renamed from: b */
        public boolean mo66385b() {
            return this.f25471a;
        }
    }

    /* renamed from: a */
    public static C10170t<String> m30424a(MyTrackerConfig.OkHttpClientProvider okHttpClientProvider) {
        if (okHttpClientProvider != null) {
            try {
                return new C10109f0(okHttpClientProvider);
            } catch (Throwable th) {
                C10175u0.m30441a("HttpRequest error: error while creating OkHttpPostRequest", th);
            }
        }
        return new C10165r();
    }

    /* renamed from: a */
    public static C10170t<String> m30425a(C10171a aVar, MyTrackerConfig.OkHttpClientProvider okHttpClientProvider, boolean z) {
        if (okHttpClientProvider != null) {
            try {
                return new C10111g0(aVar, okHttpClientProvider, z);
            } catch (Throwable th) {
                C10175u0.m30441a("HttpRequest error: error while creating OkHttpPostRequest", th);
            }
        }
        return new C10168s(aVar, z);
    }

    /* renamed from: a */
    public static boolean m30426a(Context context) {
        NetworkInfo activeNetworkInfo;
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null) {
            return false;
        }
        return activeNetworkInfo.isConnected();
    }

    /* renamed from: a */
    public abstract C10172b<T> mo66167a(String str);
}

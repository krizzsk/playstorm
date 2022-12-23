package com.p374my.target;

import com.p374my.target.common.models.ImageData;
import java.util.List;

/* renamed from: com.my.target.p1 */
public class C9894p1 {

    /* renamed from: a */
    public final ImageData f24468a;

    /* renamed from: b */
    public final String f24469b;

    /* renamed from: c */
    public List<C9895a> f24470c;

    /* renamed from: com.my.target.p1$a */
    public static class C9895a {

        /* renamed from: a */
        public final String f24471a;

        /* renamed from: b */
        public final String f24472b;

        /* renamed from: c */
        public final String f24473c;

        /* renamed from: d */
        public final boolean f24474d;

        public C9895a(String str, String str2, String str3, boolean z) {
            this.f24471a = str;
            this.f24472b = str2;
            this.f24473c = str3;
            this.f24474d = z;
        }

        /* renamed from: a */
        public static C9895a m28954a(String str, String str2, String str3, boolean z) {
            return new C9895a(str, str2, str3, z);
        }
    }

    public C9894p1(ImageData imageData, String str) {
        this.f24468a = imageData;
        this.f24469b = str;
    }

    /* renamed from: a */
    public static C9894p1 m28949a(ImageData imageData, String str) {
        return new C9894p1(imageData, str);
    }

    /* renamed from: a */
    public List<C9895a> mo65191a() {
        return this.f24470c;
    }

    /* renamed from: a */
    public void mo65192a(List<C9895a> list) {
        this.f24470c = list;
    }

    /* renamed from: b */
    public String mo65193b() {
        return this.f24469b;
    }

    /* renamed from: c */
    public ImageData mo65194c() {
        return this.f24468a;
    }
}

package com.bykv.p068vk.openvk.component.video.p069a.p070a.p071a;

import android.os.Build;
import android.text.TextUtils;
import com.bykv.p068vk.openvk.component.video.api.p083a.C2517a;
import com.bykv.p068vk.openvk.component.video.api.p085c.C2522c;
import com.bykv.p068vk.openvk.component.video.p069a.p070a.C2398a;
import com.bykv.p068vk.openvk.component.video.p069a.p070a.p072b.C2405b;
import com.bykv.p068vk.openvk.component.video.p069a.p070a.p072b.C2407c;
import com.bykv.p068vk.openvk.component.video.p069a.p082e.C2514c;
import java.io.File;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: com.bykv.vk.openvk.component.video.a.a.a.a */
/* compiled from: MediaCacheDirImpl */
public class C2399a implements C2517a {

    /* renamed from: a */
    private String f5053a = "video_feed";

    /* renamed from: b */
    private String f5054b = "video_reward_full";

    /* renamed from: c */
    private String f5055c = "video_brand";

    /* renamed from: d */
    private String f5056d = "video_splash";

    /* renamed from: e */
    private String f5057e = "video_default";

    /* renamed from: f */
    private String f5058f = null;

    /* renamed from: g */
    private String f5059g = null;

    /* renamed from: h */
    private String f5060h = null;

    /* renamed from: i */
    private String f5061i = null;

    /* renamed from: j */
    private String f5062j = null;

    /* renamed from: k */
    private String f5063k = null;

    /* renamed from: a */
    public void mo16069a(String str) {
        this.f5058f = str;
    }

    /* renamed from: a */
    public String mo16068a() {
        if (this.f5059g == null) {
            this.f5059g = this.f5058f + File.separator + this.f5053a;
            File file = new File(this.f5059g);
            if (!file.exists()) {
                file.mkdirs();
            }
        }
        return this.f5059g;
    }

    /* renamed from: b */
    public String mo16072b() {
        if (this.f5060h == null) {
            this.f5060h = this.f5058f + File.separator + this.f5054b;
            File file = new File(this.f5060h);
            if (!file.exists()) {
                file.mkdirs();
            }
        }
        return this.f5060h;
    }

    /* renamed from: c */
    public void mo16073c() {
        HashSet hashSet = new HashSet();
        if (Build.VERSION.SDK_INT >= 23) {
            for (C2398a next : C2398a.f5048a.values()) {
                if (!(next == null || next.mo16064a() == null)) {
                    C2522c a = next.mo16064a();
                    hashSet.add(C2514c.m6224b(a.mo16373a(), a.mo16399k()).getAbsolutePath());
                }
            }
            for (C2405b next2 : C2407c.f5084a.values()) {
                if (!(next2 == null || next2.mo16083a() == null)) {
                    C2522c a2 = next2.mo16083a();
                    hashSet.add(C2514c.m6224b(a2.mo16373a(), a2.mo16399k()).getAbsolutePath());
                }
            }
        }
        m5788a(new File(mo16068a()), 30, hashSet);
        m5788a(new File(mo16072b()), 20, hashSet);
    }

    /* renamed from: a */
    public boolean mo16070a(C2522c cVar) {
        if (TextUtils.isEmpty(cVar.mo16373a()) || TextUtils.isEmpty(cVar.mo16399k())) {
            return false;
        }
        return new File(cVar.mo16373a(), cVar.mo16399k()).exists();
    }

    /* renamed from: b */
    public long mo16071b(C2522c cVar) {
        if (TextUtils.isEmpty(cVar.mo16373a()) || TextUtils.isEmpty(cVar.mo16399k())) {
            return 0;
        }
        return C2514c.m6222a(cVar.mo16373a(), cVar.mo16399k());
    }

    /* renamed from: a */
    private static void m5788a(File file, int i, Set<String> set) {
        if (i >= 0 && file.exists() && !file.isFile()) {
            try {
                File[] listFiles = file.listFiles();
                if (listFiles != null && listFiles.length > i) {
                    List asList = Arrays.asList(listFiles);
                    Collections.sort(asList, new Comparator<File>() {
                        /* renamed from: a */
                        public int compare(File file, File file2) {
                            int i = ((file2.lastModified() - file.lastModified()) > 0 ? 1 : ((file2.lastModified() - file.lastModified()) == 0 ? 0 : -1));
                            if (i == 0) {
                                return 0;
                            }
                            return i < 0 ? -1 : 1;
                        }
                    });
                    while (i < asList.size()) {
                        File file2 = (File) asList.get(i);
                        if (set != null && !set.contains(file2.getAbsolutePath())) {
                            ((File) asList.get(i)).delete();
                        }
                        i++;
                    }
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }
}

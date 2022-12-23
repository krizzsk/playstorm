package com.ironsource.p197a;

import android.util.Pair;
import androidx.browser.trusted.sharing.ShareTarget;
import java.util.ArrayList;

/* renamed from: com.ironsource.a.a */
public final class C6375a {

    /* renamed from: a */
    String f16210a;

    /* renamed from: b */
    public boolean f16211b;

    /* renamed from: c */
    String f16212c;

    /* renamed from: d */
    C6380d f16213d;

    /* renamed from: e */
    boolean f16214e = false;

    /* renamed from: f */
    ArrayList<Pair<String, String>> f16215f;

    /* renamed from: com.ironsource.a.a$a */
    public static class C6376a {

        /* renamed from: a */
        String f16216a = "";

        /* renamed from: b */
        public boolean f16217b = false;

        /* renamed from: c */
        public String f16218c = ShareTarget.METHOD_POST;

        /* renamed from: d */
        public C6380d f16219d;

        /* renamed from: e */
        public boolean f16220e = false;

        /* renamed from: f */
        public ArrayList<Pair<String, String>> f16221f = new ArrayList<>();

        public C6376a(String str) {
            if (str != null && !str.isEmpty()) {
                this.f16216a = str;
            }
        }
    }

    public C6375a(C6376a aVar) {
        this.f16210a = aVar.f16216a;
        this.f16211b = aVar.f16217b;
        this.f16212c = aVar.f16218c;
        this.f16213d = aVar.f16219d;
        this.f16214e = aVar.f16220e;
        if (aVar.f16221f != null) {
            this.f16215f = new ArrayList<>(aVar.f16221f);
        }
    }
}

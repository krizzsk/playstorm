package com.inmobi.media;

import android.graphics.Point;
import java.util.Locale;

/* renamed from: com.inmobi.media.bu */
/* compiled from: NativeAssetStyle */
public class C5902bu {

    /* renamed from: a */
    public Point f14917a;

    /* renamed from: b */
    public Point f14918b;

    /* renamed from: c */
    public Point f14919c;

    /* renamed from: d */
    public Point f14920d;

    /* renamed from: e */
    protected String f14921e;

    /* renamed from: f */
    protected String f14922f;

    /* renamed from: g */
    protected String f14923g;

    /* renamed from: h */
    protected float f14924h;

    /* renamed from: i */
    protected String f14925i;

    /* renamed from: j */
    protected String f14926j;

    /* renamed from: k */
    protected C5916cc f14927k;

    public C5902bu() {
        this.f14917a = new Point(0, 0);
        this.f14919c = new Point(0, 0);
        this.f14918b = new Point(0, 0);
        this.f14920d = new Point(0, 0);
        this.f14921e = "none";
        this.f14922f = "straight";
        this.f14924h = 10.0f;
        this.f14925i = "#ff000000";
        this.f14926j = "#00000000";
        this.f14923g = "fill";
        this.f14927k = null;
    }

    public C5902bu(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, String str, String str2, String str3, String str4, C5916cc ccVar) {
        this(i, i2, i3, i4, i5, i6, i7, i8, "fill", str, str2, str3, str4, ccVar);
    }

    public C5902bu(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, String str, String str2, String str3, String str4, String str5, C5916cc ccVar) {
        this.f14917a = new Point(i3, i4);
        this.f14918b = new Point(i7, i8);
        this.f14919c = new Point(i, i2);
        this.f14920d = new Point(i5, i6);
        this.f14921e = str2;
        this.f14922f = str3;
        this.f14924h = 10.0f;
        this.f14923g = str;
        this.f14925i = str4.length() == 0 ? "#ff000000" : str4;
        this.f14926j = str5.length() == 0 ? "#00000000" : str5;
        this.f14927k = ccVar;
    }

    /* renamed from: a */
    public final String mo34880a() {
        return this.f14921e;
    }

    /* renamed from: b */
    public final String mo34881b() {
        return this.f14922f;
    }

    /* renamed from: c */
    public final float mo34882c() {
        return this.f14924h;
    }

    /* renamed from: d */
    public final String mo34883d() {
        return this.f14925i.toLowerCase(Locale.US);
    }

    /* renamed from: e */
    public String mo34884e() {
        return this.f14926j.toLowerCase(Locale.US);
    }

    /* renamed from: f */
    public final String mo34885f() {
        return this.f14923g;
    }

    /* renamed from: g */
    public final C5916cc mo34886g() {
        return this.f14927k;
    }
}

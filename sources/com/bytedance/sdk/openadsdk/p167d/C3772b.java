package com.bytedance.sdk.openadsdk.p167d;

import com.bytedance.sdk.component.p110d.C2896h;
import com.bytedance.sdk.component.p110d.C2906r;
import com.bytedance.sdk.component.p110d.p113c.C2836a;
import com.bytedance.sdk.component.p110d.p113c.C2860c;
import com.bytedance.sdk.component.utils.C2975l;

/* renamed from: com.bytedance.sdk.openadsdk.d.b */
/* compiled from: StepTrackImpl */
public class C3772b implements C2906r {

    /* renamed from: a */
    private static int f9819a;

    /* renamed from: b */
    private long f9820b = 0;

    /* renamed from: c */
    private long f9821c;

    /* renamed from: d */
    private boolean f9822d;

    /* renamed from: e */
    private String f9823e;

    public C3772b() {
        f9819a++;
        this.f9823e = "image_request_" + f9819a;
    }

    /* renamed from: a */
    public void mo17758a(String str, C2896h hVar) {
        if (!this.f9822d) {
            C2975l.m8384b("ImageLoaderStep", "start " + this.f9823e + " request:" + hVar.mo17681a() + ", width:" + hVar.mo17688b() + ",height:" + hVar.mo17690c());
            this.f9822d = true;
        }
        this.f9820b = System.currentTimeMillis();
        C2975l.m8384b("ImageLoaderStep", this.f9823e + " start:" + m12407c(str, hVar));
    }

    /* renamed from: b */
    public void mo17759b(String str, C2896h hVar) {
        long currentTimeMillis = System.currentTimeMillis() - this.f9820b;
        this.f9821c += currentTimeMillis;
        C2975l.m8384b("ImageLoaderStep", this.f9823e + " end:" + m12407c(str, hVar) + ",cost：" + currentTimeMillis + " ms" + "， total：" + this.f9821c + "\r\n");
    }

    /* renamed from: c */
    private String m12407c(String str, C2896h hVar) {
        C2836a o;
        String str2;
        if (str == null) {
            return str;
        }
        char c = 65535;
        switch (str.hashCode()) {
            case -1867169789:
                if (str.equals("success")) {
                    c = 8;
                    break;
                }
                break;
            case -1584526165:
                if (str.equals("raw_cache")) {
                    c = 4;
                    break;
                }
                break;
            case -1442758754:
                if (str.equals("image_type")) {
                    c = 10;
                    break;
                }
                break;
            case -1428113824:
                if (str.equals("disk_cache")) {
                    c = 5;
                    break;
                }
                break;
            case -1335717394:
                if (str.equals("decode")) {
                    c = 1;
                    break;
                }
                break;
            case -1281977283:
                if (str.equals("failed")) {
                    c = 9;
                    break;
                }
                break;
            case -1076854124:
                if (str.equals("check_duplicate")) {
                    c = 2;
                    break;
                }
                break;
            case 1017400004:
                if (str.equals("memory_cache")) {
                    c = 3;
                    break;
                }
                break;
            case 1478448621:
                if (str.equals("net_request")) {
                    c = 7;
                    break;
                }
                break;
            case 1718821013:
                if (str.equals("generate_key")) {
                    c = 6;
                    break;
                }
                break;
            case 2067979407:
                if (str.equals("cache_policy")) {
                    c = 0;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return "cache policy";
            case 1:
                return "decode";
            case 2:
                return "duplicate request";
            case 3:
                return "memory cache";
            case 4:
                return "raw cache";
            case 5:
                return "disk cache";
            case 6:
                return "generate key:" + hVar.mo17692e();
            case 7:
                return "net request";
            case 8:
                return "success";
            case 9:
                if (!(hVar instanceof C2860c) || (o = ((C2860c) hVar).mo17702o()) == null) {
                    return "fail";
                }
                Throwable c2 = o.mo17628c();
                StringBuilder sb = new StringBuilder();
                sb.append("fail：code:");
                sb.append(o.mo17626a());
                sb.append(", msg:");
                sb.append(o.mo17627b());
                sb.append(", exception:");
                if (c2 != null) {
                    str2 = c2.getMessage();
                } else {
                    str2 = "null \r\n";
                }
                sb.append(str2);
                return sb.toString();
            case 10:
                return "image type：";
            default:
                return str;
        }
    }
}

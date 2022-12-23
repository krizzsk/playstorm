package com.inmobi.media;

import android.net.Uri;
import java.io.File;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.inmobi.media.ax */
/* compiled from: AdAssetFetcher */
public final class C5842ax {

    /* renamed from: b */
    private static final String f14742b = C5842ax.class.getSimpleName();

    /* renamed from: a */
    C5860bf f14743a;

    C5842ax(C5860bf bfVar) {
        this.f14743a = bfVar;
    }

    /* renamed from: a */
    static String m17435a(C5839av avVar, File file, long j, long j2) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("url", avVar.f14715d);
            jSONObject.put("saved_url", Uri.fromFile(file));
            jSONObject.put("size_in_bytes", file.length());
            jSONObject.put("download_started_at", j);
            jSONObject.put("download_ended_at", j2);
        } catch (JSONException e) {
            C6181gg.m18398a().mo35357a(new C6217hg(e));
        }
        return jSONObject.toString().replace("\"", "\\\"");
    }

    /* renamed from: a */
    static void m17436a(long j, long j2, long j3) {
        try {
            C6279iv.m18765a().mo35491a(0);
            C6279iv.m18765a().mo35492b(j2);
            C6279iv.m18765a().mo35493c(j3 - j);
        } catch (Exception e) {
            C6181gg.m18398a().mo35357a(new C6217hg(e));
        }
    }
}

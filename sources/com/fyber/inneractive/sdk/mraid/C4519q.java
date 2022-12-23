package com.fyber.inneractive.sdk.mraid;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import com.fyber.inneractive.sdk.util.C5348k;
import com.fyber.inneractive.sdk.util.C5357n;
import com.fyber.inneractive.sdk.util.C5364p0;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.web.C5407d;
import com.fyber.inneractive.sdk.web.C5423i;
import com.fyber.inneractive.sdk.web.C5425k;
import java.util.Map;

/* renamed from: com.fyber.inneractive.sdk.mraid.q */
public class C4519q extends C4501a {
    public C4519q(Map<String, String> map, C5407d dVar, C5364p0 p0Var) {
        super(map, dVar, p0Var);
    }

    /* renamed from: a */
    public void mo24710a() {
        String str = this.f11163b.get("uri");
        if (str == null || "".equals(str)) {
            this.f11164c.mo26545a(C4508f.STORE_PICTURE, "Image can't be stored with null or empty URL");
            IAlog.m16699a("Mraid Store Picture -Invalid URI ", new Object[0]);
            return;
        }
        C5407d dVar = this.f11164c;
        Context g = dVar.mo26554g();
        if (!C5348k.m16749n()) {
            dVar.mo26545a(C4508f.STORE_PICTURE, "Error downloading file - the device does not have an SD card mounted, or the Android permission is not granted.");
            IAlog.m16699a("Error downloading file. Please check if the Android permission is not granted, or maybe the device does not have an SD card mounted? ", new Object[0]);
        } else if (g instanceof Activity) {
            new AlertDialog.Builder(dVar.mo26554g()).setTitle("Save Image").setMessage("Download image to Picture gallery?").setNegativeButton("Cancel", (DialogInterface.OnClickListener) null).setPositiveButton("Okay", new C5425k(dVar, str)).setCancelable(true).show();
        } else {
            C5357n.f14225b.post(new C5423i(dVar, "Downloading image to Picture gallery..."));
            dVar.mo26547a(str);
        }
    }

    /* renamed from: c */
    public String mo24707c() {
        return this.f11163b.get("uri");
    }
}

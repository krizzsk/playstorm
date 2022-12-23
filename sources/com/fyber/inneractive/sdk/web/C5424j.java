package com.fyber.inneractive.sdk.web;

import com.fyber.inneractive.sdk.mraid.C4508f;
import com.fyber.inneractive.sdk.util.C5357n;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.web.C5407d;

/* renamed from: com.fyber.inneractive.sdk.web.j */
public class C5424j implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C5407d.C5410c f14372a;

    public C5424j(C5407d.C5410c cVar) {
        this.f14372a = cVar;
    }

    public void run() {
        C5407d dVar = C5407d.this;
        dVar.getClass();
        C5357n.f14225b.post(new C5423i(dVar, "Image failed to download."));
        C5407d.this.mo26545a(C4508f.STORE_PICTURE, "Error downloading and saving image file.");
        IAlog.m16699a("failed to download and save the image file.", new Object[0]);
    }
}

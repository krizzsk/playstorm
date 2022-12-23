package com.fyber.inneractive.sdk.web;

import android.widget.Toast;
import com.fyber.inneractive.sdk.util.C5350l;

/* renamed from: com.fyber.inneractive.sdk.web.i */
public class C5423i implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ String f14371a;

    public C5423i(C5407d dVar, String str) {
        this.f14371a = str;
    }

    public void run() {
        Toast.makeText(C5350l.f14216a, this.f14371a, 0).show();
    }
}

package com.mbridge.msdk.mbsignalcommon.webEnvCheck;

import android.content.Context;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;
import com.mbridge.msdk.p054c.p056b.C2287b;

public class WebEnvCheckEntry {
    public void check(Context context) {
        WindVaneWebView windVaneWebView = new WindVaneWebView(context);
        windVaneWebView.loadDataWithBaseURL((String) null, "<html><script>" + C2287b.m5301a().mo15577b() + "</script></html>", "text/html", "utf-8", (String) null);
    }
}

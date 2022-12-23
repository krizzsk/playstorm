package com.ogury.p376ed.internal;

import android.app.DownloadManager;
import android.content.Context;
import android.net.Uri;
import android.os.Environment;
import android.webkit.DownloadListener;
import android.widget.Toast;
import com.vungle.warren.p393ui.JavascriptBridge;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

/* renamed from: com.ogury.ed.internal.hz */
public final class C10613hz implements DownloadListener {

    /* renamed from: a */
    private final Context f26789a;

    public C10613hz(Context context) {
        C10765mq.m32773b(context, "context");
        this.f26789a = context;
    }

    public final void onDownloadStart(String str, String str2, String str3, String str4, long j) {
        String str5;
        C10765mq.m32773b(str, "url");
        C10765mq.m32773b(str2, "userAgent");
        C10765mq.m32773b(str3, "contentDisposition");
        C10765mq.m32773b(str4, "mimetype");
        if (C10555gh.m32084a(this.f26789a, "android.permission.WRITE_EXTERNAL_STORAGE")) {
            Uri parse = Uri.parse(str);
            String path = parse.getPath();
            List<String> b = path == null ? null : new C10810ob("/").mo67884b(path);
            if (b != null && (b.isEmpty() ^ true)) {
                str5 = (String) C10692km.m32658c(b);
            } else {
                str5 = UUID.randomUUID().toString();
                C10765mq.m32770a((Object) str5, "randomUUID().toString()");
            }
            DownloadManager.Request request = new DownloadManager.Request(parse);
            request.setTitle(str5);
            request.allowScanningByMediaScanner();
            request.setNotificationVisibility(1);
            request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, JavascriptBridge.MraidHandler.DOWNLOAD_ACTION);
            Object systemService = this.f26789a.getSystemService(JavascriptBridge.MraidHandler.DOWNLOAD_ACTION);
            if (systemService != null) {
                ((DownloadManager) systemService).enqueue(request);
                Context context = this.f26789a;
                C10770mv mvVar = C10770mv.f27006a;
                String format = String.format("Start downloading %s", Arrays.copyOf(new Object[]{str5}, 1));
                C10765mq.m32770a((Object) format, "java.lang.String.format(format, *args)");
                Toast.makeText(context, format, 0).show();
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.app.DownloadManager");
        }
    }
}

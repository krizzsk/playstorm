package com.mbridge.msdk.videocommon.download;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Patterns;
import android.webkit.URLUtil;
import com.google.android.exoplayer2.audio.SilenceSkippingAudioProcessor;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.controller.C2350a;
import com.mbridge.msdk.foundation.download.DownloadError;
import com.mbridge.msdk.foundation.download.DownloadMessage;
import com.mbridge.msdk.foundation.download.DownloadPriority;
import com.mbridge.msdk.foundation.download.DownloadResourceType;
import com.mbridge.msdk.foundation.download.MBDownloadManager;
import com.mbridge.msdk.foundation.download.OnDownloadStateListener;
import com.mbridge.msdk.foundation.download.resource.MBResourceManager;
import com.mbridge.msdk.foundation.same.p300b.C8420c;
import com.mbridge.msdk.foundation.same.p300b.C8422e;
import com.mbridge.msdk.foundation.same.p303e.C8434a;
import com.mbridge.msdk.foundation.tools.C8557ad;
import com.mbridge.msdk.foundation.tools.C8608u;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.p054c.C2278a;
import com.mbridge.msdk.p054c.C2283b;
import com.mbridge.msdk.videocommon.download.C9560f;
import com.mbridge.msdk.videocommon.download.C9572h;
import java.io.IOException;
import java.net.URL;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.mbridge.msdk.videocommon.download.g */
/* compiled from: H5DownLoadManager */
public class C9563g {

    /* renamed from: c */
    private static C9563g f23520c;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public CopyOnWriteArrayList<String> f23521a;

    /* renamed from: b */
    private ConcurrentMap<String, C9555b> f23522b;

    /* renamed from: d */
    private C9578j f23523d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public C9572h f23524e;

    /* renamed from: f */
    private boolean f23525f = false;

    /* renamed from: com.mbridge.msdk.videocommon.download.g$a */
    /* compiled from: H5DownLoadManager */
    public interface C9568a {
        /* renamed from: a */
        void mo57995a(String str);

        /* renamed from: a */
        void mo57996a(String str, String str2);
    }

    /* renamed from: com.mbridge.msdk.videocommon.download.g$b */
    /* compiled from: H5DownLoadManager */
    public interface C9569b extends C9568a {
    }

    /* renamed from: com.mbridge.msdk.videocommon.download.g$c */
    /* compiled from: H5DownLoadManager */
    public interface C9570c {
        /* renamed from: a */
        void mo63220a();

        /* renamed from: a */
        void mo63222a(String str);

        /* renamed from: a */
        void mo63223a(String str, byte[] bArr, String str2);
    }

    /* renamed from: com.mbridge.msdk.videocommon.download.g$d */
    /* compiled from: H5DownLoadManager */
    public interface C9571d extends C9568a {
    }

    private C9563g() {
        try {
            this.f23523d = C9578j.m27494a();
            this.f23524e = C9572h.C9574a.f23538a;
            this.f23521a = new CopyOnWriteArrayList<>();
            this.f23522b = new ConcurrentHashMap();
            C2278a b = C2283b.m5275a().mo15563b(C2350a.m5601e().mo15793h());
            if (b != null) {
                this.f23525f = b.mo15514i(1);
            }
        } catch (Throwable th) {
            C8608u.m24881a("H5DownLoadManager", th.getMessage(), th);
        }
    }

    /* renamed from: a */
    public static synchronized C9563g m27460a() {
        C9563g gVar;
        synchronized (C9563g.class) {
            if (f23520c == null) {
                f23520c = new C9563g();
            }
            gVar = f23520c;
        }
        return gVar;
    }

    /* renamed from: a */
    public final String mo63240a(String str) {
        C9578j jVar = this.f23523d;
        if (jVar != null) {
            return jVar.mo63256a(str);
        }
        return null;
    }

    /* renamed from: a */
    public final void mo63241a(final String str, final C9568a aVar) {
        if (!this.f23525f) {
            try {
                C8608u.m24884d("H5DownLoadManager", "download url:" + str);
                if (!this.f23521a.contains(str)) {
                    this.f23521a.add(str);
                    C9560f.C9562a.f23519a.mo63239a(new C8434a() {
                        /* renamed from: b */
                        public final void mo15709b() {
                        }

                        /* renamed from: a */
                        public final void mo15708a() {
                            if (!TextUtils.isEmpty(C9563g.this.f23524e.mo63246b(str))) {
                                C9563g.this.f23521a.remove(str);
                                C9568a aVar = aVar;
                                if (aVar != null) {
                                    aVar.mo57995a(str);
                                    return;
                                }
                                return;
                            }
                            C9558e.m27456a(str, new C9570c() {
                                /* renamed from: a */
                                public final void mo63220a() {
                                }

                                /* renamed from: a */
                                public final void mo63223a(String str, byte[] bArr, String str2) {
                                    try {
                                        C9563g.this.f23521a.remove(str2);
                                        if (bArr != null && bArr.length > 0) {
                                            if (C9563g.this.f23524e.mo63245a(str2, bArr)) {
                                                if (aVar != null) {
                                                    aVar.mo57995a(str2);
                                                }
                                            } else if (aVar != null) {
                                                aVar.mo57996a(str2, "save file failed");
                                            }
                                        }
                                    } catch (Exception e) {
                                        if (MBridgeConstans.DEBUG) {
                                            e.printStackTrace();
                                        }
                                        if (aVar != null) {
                                            aVar.mo57996a(str2, e.getMessage());
                                        }
                                    }
                                }

                                /* renamed from: a */
                                public final void mo63222a(String str) {
                                    try {
                                        C9563g.this.f23521a.remove(str);
                                        if (aVar != null) {
                                            aVar.mo57996a(str, str);
                                        }
                                    } catch (Exception e) {
                                        if (MBridgeConstans.DEBUG) {
                                            e.printStackTrace();
                                        }
                                        if (aVar != null) {
                                            aVar.mo57996a(str, str);
                                        }
                                    }
                                }
                            }, true);
                        }
                    });
                }
            } catch (Throwable th) {
                if (MBridgeConstans.DEBUG) {
                    th.printStackTrace();
                }
            }
        } else if (!TextUtils.isEmpty(str)) {
            try {
                new URL(str);
                String md5 = SameMD5.getMD5(C8557ad.m24739a(str));
                MBDownloadManager.getInstance().download(new DownloadMessage(new Object(), str, md5 + ".html", 100, DownloadResourceType.DOWNLOAD_RESOURCE_TYPE_HTML)).withReadTimeout(30000).withConnectTimeout((long) SilenceSkippingAudioProcessor.DEFAULT_PADDING_SILENCE_US).withDownloadPriority(DownloadPriority.HIGH).withHttpRetryCounter(1).withDirectoryPathInternal(C8422e.m24335b(C8420c.MBRIDGE_700_HTML) + "/").withDownloadStateListener(new OnDownloadStateListener() {
                    public final void onDownloadStart(DownloadMessage downloadMessage) {
                    }

                    public final void onDownloadComplete(DownloadMessage downloadMessage) {
                        C9568a aVar = aVar;
                        if (aVar != null) {
                            aVar.mo57995a(str);
                        }
                    }

                    public final void onDownloadError(DownloadMessage downloadMessage, DownloadError downloadError) {
                        C9568a aVar = aVar;
                        if (aVar != null) {
                            aVar.mo57996a(str, downloadError.getException().getMessage());
                        }
                    }
                }).build().start();
            } catch (Exception unused) {
                if (aVar != null) {
                    aVar.mo57996a("zip url is unlawful", str);
                }
            }
        } else if (aVar != null) {
            aVar.mo57996a("zip url is null", str);
        }
    }

    /* renamed from: b */
    public final void mo63243b(String str, C9568a aVar) {
        try {
            if (Patterns.WEB_URL.matcher(str).matches() || URLUtil.isValidUrl(str)) {
                String path = Uri.parse(str).getPath();
                if (!TextUtils.isEmpty(path)) {
                    if (path.toLowerCase().endsWith(".zip")) {
                        final C9571d dVar = (C9571d) aVar;
                        if (!this.f23525f) {
                            try {
                                if (TextUtils.isEmpty(this.f23523d.mo63256a(str))) {
                                    if (this.f23522b.containsKey(str)) {
                                        C9555b bVar = (C9555b) this.f23522b.get(str);
                                        if (bVar != null) {
                                            bVar.mo63221a(dVar);
                                            return;
                                        }
                                        return;
                                    }
                                    C9555b bVar2 = new C9555b(this.f23522b, this.f23523d, dVar, str);
                                    this.f23522b.put(str, bVar2);
                                    C9558e.m27456a(str, bVar2, true);
                                    return;
                                } else if (dVar != null) {
                                    dVar.mo57995a(str);
                                    return;
                                } else {
                                    return;
                                }
                            } catch (Exception e) {
                                if (dVar != null) {
                                    dVar.mo57996a(str, "downloadzip failed");
                                }
                                if (MBridgeConstans.DEBUG) {
                                    e.printStackTrace();
                                    return;
                                }
                                return;
                            }
                        } else if (!TextUtils.isEmpty(str)) {
                            try {
                                new URL(str);
                                String b = C8422e.m24335b(C8420c.MBRIDGE_700_RES);
                                String md5 = SameMD5.getMD5(C8557ad.m24739a(str));
                                final String str2 = b + "/" + md5;
                                MBDownloadManager.getInstance().download(new DownloadMessage(new Object(), str, md5 + ".zip", 100, DownloadResourceType.DOWNLOAD_RESOURCE_TYPE_ZIP)).withReadTimeout(30000).withConnectTimeout((long) SilenceSkippingAudioProcessor.DEFAULT_PADDING_SILENCE_US).withDownloadPriority(DownloadPriority.HIGH).withHttpRetryCounter(1).withDirectoryPathInternal(b + "/").withDownloadStateListener(new OnDownloadStateListener() {
                                    public final void onDownloadStart(DownloadMessage downloadMessage) {
                                    }

                                    public final void onDownloadComplete(DownloadMessage downloadMessage) {
                                        try {
                                            if (TextUtils.isEmpty(C9578j.m27494a().mo63256a(downloadMessage.getDownloadUrl()))) {
                                                MBResourceManager.getInstance().unZip(downloadMessage.getSaveFilePath(), str2);
                                            }
                                            if (dVar != null) {
                                                dVar.mo57995a(downloadMessage.getDownloadUrl());
                                            }
                                        } catch (IOException e) {
                                            C9571d dVar = dVar;
                                            if (dVar != null) {
                                                dVar.mo57996a(downloadMessage.getDownloadUrl(), e.getMessage());
                                            }
                                        }
                                    }

                                    public final void onDownloadError(DownloadMessage downloadMessage, DownloadError downloadError) {
                                        if (!TextUtils.isEmpty(C9578j.m27494a().mo63256a(downloadMessage.getDownloadUrl()))) {
                                            C9571d dVar = dVar;
                                            if (dVar != null) {
                                                dVar.mo57995a(downloadMessage.getDownloadUrl());
                                                return;
                                            }
                                            return;
                                        }
                                        C9571d dVar2 = dVar;
                                        if (dVar2 != null) {
                                            dVar2.mo57996a(downloadMessage.getDownloadUrl(), downloadError.getException().getMessage());
                                        }
                                    }
                                }).build().start();
                                return;
                            } catch (Exception unused) {
                                if (dVar != null) {
                                    dVar.mo57996a(str, "zip url is unlawful");
                                    return;
                                }
                                return;
                            }
                        } else if (dVar != null) {
                            dVar.mo57996a(str, "zip url is null");
                            return;
                        } else {
                            return;
                        }
                    } else {
                        mo63241a(str, aVar);
                        return;
                    }
                }
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        if (aVar != null) {
            aVar.mo57996a(str, "The URL does not contain a path ");
        }
    }

    /* renamed from: b */
    public final String mo63242b(String str) {
        try {
            if (Patterns.WEB_URL.matcher(str).matches() || URLUtil.isValidUrl(str)) {
                Uri parse = Uri.parse(str);
                String path = parse.getPath();
                if (TextUtils.isEmpty(path) || !TextUtils.isEmpty(parse.getQueryParameter("urlDebug"))) {
                    return str;
                }
                if (path.toLowerCase().endsWith(".zip")) {
                    return mo63240a(str);
                }
                return this.f23524e != null ? this.f23524e.mo63244a(str) : str;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return str;
    }
}

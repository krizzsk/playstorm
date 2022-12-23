package com.inmobi.media;

import android.app.Activity;
import android.view.View;
import java.util.Map;

/* renamed from: com.inmobi.media.j */
/* compiled from: AdContainer */
public interface C6286j {

    /* renamed from: com.inmobi.media.j$a */
    /* compiled from: AdContainer */
    public interface C6287a {
        /* renamed from: a */
        void mo35510a();

        /* renamed from: a */
        void mo35511a(Object obj);

        /* renamed from: b */
        void mo35512b(Object obj);
    }

    /* renamed from: a */
    void mo35497a();

    /* renamed from: a */
    void mo35498a(byte b, Map<String, String> map);

    /* renamed from: b */
    void mo35499b();

    /* renamed from: c */
    boolean mo35500c();

    void destroy();

    C6125fq getAdConfig();

    Object getDataModel();

    C6287a getFullScreenEventsListener();

    String getMarkupType();

    byte getPlacementType();

    View getVideoContainerView();

    C6004dw getViewableAd();

    void setFullScreenActivityContext(Activity activity);
}

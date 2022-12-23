package com.fyber.inneractive.sdk.model.vast;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.measurement.C4468i;
import com.fyber.inneractive.sdk.util.C5388x0;
import com.fyber.inneractive.sdk.util.IAlog;
import com.smaato.sdk.video.vast.model.Companion;
import com.smaato.sdk.video.vast.model.Creative;
import com.smaato.sdk.video.vast.model.Extension;
import com.smaato.sdk.video.vast.model.Linear;
import com.smaato.sdk.video.vast.model.MediaFile;
import com.smaato.sdk.video.vast.model.StaticResource;
import com.smaato.sdk.video.vast.model.Tracking;
import com.smaato.sdk.video.vast.model.Verification;
import com.smaato.sdk.video.vast.model.VideoClicks;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.w3c.dom.Node;

/* renamed from: com.fyber.inneractive.sdk.model.vast.e */
public class C4481e {

    /* renamed from: a */
    public String f11080a;

    /* renamed from: b */
    public List<String> f11081b = new ArrayList();

    /* renamed from: c */
    public List<C4486j> f11082c = new ArrayList();

    /* renamed from: d */
    public List<C4468i> f11083d = new ArrayList();

    /* renamed from: a */
    public final void mo24691a(Node node) {
        C4468i iVar;
        Node d = C5388x0.m16811d(node, "AdVerifications");
        if (d != null) {
            Iterator it = ((ArrayList) C5388x0.m16810c(d, Verification.NAME)).iterator();
            while (it.hasNext()) {
                Node node2 = (Node) it.next();
                if (node2 == null) {
                    iVar = null;
                } else {
                    C4468i iVar2 = new C4468i();
                    iVar2.f11025e = C5388x0.m16809b(node2, Verification.VENDOR);
                    Node d2 = C5388x0.m16811d(node2, "JavaScriptResource");
                    if (d2 != null) {
                        iVar2.f11027g = true;
                        try {
                            iVar2.f11026f = C5388x0.m16808a(d2);
                            iVar2.f11022b = C5388x0.m16809b(d2, "apiFramework");
                            iVar2.f11021a = new URL(iVar2.f11026f);
                        } catch (MalformedURLException unused) {
                        }
                    }
                    Node d3 = C5388x0.m16811d(node2, "TrackingEvents");
                    if (d3 != null) {
                        Iterator it2 = ((ArrayList) C5388x0.m16810c(d3, Tracking.NAME)).iterator();
                        while (it2.hasNext()) {
                            Node node3 = (Node) it2.next();
                            C4492p a = C4492p.m13869a(node3);
                            if (node3 != null && a.f11127a.equalsIgnoreCase("verificationNotExecuted")) {
                                iVar2.mo24666a(C4493q.EVENT_VERIFICATION_NOT_EXECUTED, a.f11128b);
                            }
                        }
                    }
                    Node d4 = C5388x0.m16811d(node2, Verification.VERIFICATION_PARAMETERS);
                    if (d4 != null) {
                        iVar2.f11024d = C5388x0.m16808a(d4);
                    }
                    iVar = iVar2;
                }
                if (iVar != null) {
                    IAlog.m16699a("Verification Found - %s", iVar.toString());
                    this.f11083d.add(iVar);
                }
            }
        }
    }

    /* renamed from: b */
    public void mo24692b(Node node) {
        Iterator it;
        C4486j jVar;
        C4482f fVar;
        Iterator it2;
        Iterator it3;
        C4489m mVar;
        Node node2 = node;
        if (node2 != null) {
            Node d = C5388x0.m16811d(node2, "AdSystem");
            if (d != null) {
                C5388x0.m16809b(d, "version");
                C5388x0.m16808a(d);
            }
            Node d2 = C5388x0.m16811d(node2, "Error");
            if (d2 != null) {
                String a = C5388x0.m16808a(d2);
                if (!TextUtils.isEmpty(a)) {
                    this.f11080a = a;
                }
            }
            Iterator it4 = ((ArrayList) C5388x0.m16810c(node2, "Impression")).iterator();
            while (it4.hasNext()) {
                String a2 = C5388x0.m16808a((Node) it4.next());
                if (!TextUtils.isEmpty(a2)) {
                    this.f11081b.add(a2);
                }
            }
            Node d3 = C5388x0.m16811d(node2, "Creatives");
            if (d3 != null) {
                Iterator it5 = ((ArrayList) C5388x0.m16810c(d3, Creative.NAME)).iterator();
                while (it5.hasNext()) {
                    Node node3 = (Node) it5.next();
                    if (node3 == null) {
                        it = it5;
                        jVar = null;
                    } else {
                        C4486j jVar2 = new C4486j();
                        C5388x0.m16809b(node3, "AdID");
                        C5388x0.m16809b(node3, "id");
                        C5388x0.m16807a(node3, "sequence");
                        Node d4 = C5388x0.m16811d(node3, "Linear");
                        if (d4 != null) {
                            C4488l lVar = new C4488l();
                            Node d5 = C5388x0.m16811d(d4, Linear.MEDIA_FILES);
                            if (d5 != null) {
                                ArrayList arrayList = (ArrayList) C5388x0.m16810c(d5, MediaFile.NAME);
                                if (!arrayList.isEmpty()) {
                                    lVar.f11106a = new ArrayList();
                                    Iterator it6 = arrayList.iterator();
                                    while (it6.hasNext()) {
                                        Node node4 = (Node) it6.next();
                                        if (node4 == null) {
                                            it3 = it5;
                                            it2 = it6;
                                            mVar = null;
                                        } else {
                                            it3 = it5;
                                            mVar = new C4489m();
                                            it2 = it6;
                                            mVar.f11111a = C5388x0.m16809b(node4, MediaFile.DELIVERY);
                                            mVar.f11112b = C5388x0.m16807a(node4, "width");
                                            mVar.f11113c = C5388x0.m16807a(node4, "height");
                                            mVar.f11114d = C5388x0.m16809b(node4, "type");
                                            C5388x0.m16809b(node4, "id");
                                            mVar.f11116f = C5388x0.m16809b(node4, "apiFramework");
                                            mVar.f11115e = C5388x0.m16807a(node4, MediaFile.BITRATE);
                                            String b = C5388x0.m16809b(node4, MediaFile.MAINTAIN_ASPECT_RATIO);
                                            if (!TextUtils.isEmpty(b)) {
                                                try {
                                                    Boolean.valueOf(b);
                                                } catch (NumberFormatException unused) {
                                                }
                                            }
                                            String b2 = C5388x0.m16809b(node4, MediaFile.SCALABLE);
                                            if (!TextUtils.isEmpty(b2)) {
                                                try {
                                                    Boolean.valueOf(b2);
                                                } catch (NumberFormatException unused2) {
                                                }
                                            }
                                            mVar.f11117g = C5388x0.m16808a(node4);
                                        }
                                        if (mVar != null) {
                                            lVar.f11106a.add(mVar);
                                        }
                                        it5 = it3;
                                        it6 = it2;
                                    }
                                }
                            }
                            it = it5;
                            Node d6 = C5388x0.m16811d(d4, "VideoClicks");
                            if (d6 != null) {
                                lVar.f11108c = C5388x0.m16808a(C5388x0.m16811d(d6, VideoClicks.CLICK_THROUGH));
                                ArrayList arrayList2 = (ArrayList) C5388x0.m16810c(d6, VideoClicks.CLICK_TRACKING);
                                if (!arrayList2.isEmpty()) {
                                    lVar.f11109d = new ArrayList();
                                    Iterator it7 = arrayList2.iterator();
                                    while (it7.hasNext()) {
                                        String a3 = C5388x0.m16808a((Node) it7.next());
                                        if (!TextUtils.isEmpty(a3)) {
                                            lVar.f11109d.add(a3);
                                        }
                                    }
                                }
                            }
                            Node d7 = C5388x0.m16811d(d4, "TrackingEvents");
                            if (d7 != null) {
                                ArrayList arrayList3 = (ArrayList) C5388x0.m16810c(d7, Tracking.NAME);
                                if (!arrayList3.isEmpty()) {
                                    lVar.f11107b = new ArrayList();
                                    Iterator it8 = arrayList3.iterator();
                                    while (it8.hasNext()) {
                                        C4492p a4 = C4492p.m13869a((Node) it8.next());
                                        if (a4 != null) {
                                            lVar.f11107b.add(a4);
                                        }
                                    }
                                }
                            }
                            Node d8 = C5388x0.m16811d(d4, Linear.DURATION);
                            if (d8 != null) {
                                lVar.f11110e = C5388x0.m16808a(d8);
                            }
                            jVar2.f11104a = lVar;
                        } else {
                            it = it5;
                        }
                        Node d9 = C5388x0.m16811d(node3, "CompanionAds");
                        if (d9 != null) {
                            List<Node> c = C5388x0.m16810c(d9, "Companion");
                            jVar2.f11105b = new ArrayList();
                            Iterator it9 = ((ArrayList) c).iterator();
                            while (it9.hasNext()) {
                                Node node5 = (Node) it9.next();
                                if (node5 == null) {
                                    fVar = null;
                                } else {
                                    fVar = new C4482f();
                                    fVar.f11084a = C5388x0.m16807a(node5, "width");
                                    fVar.f11085b = C5388x0.m16807a(node5, "height");
                                    fVar.f11086c = C5388x0.m16809b(node5, "id");
                                    C5388x0.m16809b(node5, "apiFramework");
                                    C5388x0.m16807a(node5, Companion.EXPANDED_WIDTH);
                                    C5388x0.m16807a(node5, Companion.EXPANDED_HEIGHT);
                                    Node d10 = C5388x0.m16811d(node5, "StaticResource");
                                    if (d10 != null) {
                                        C4485i iVar = new C4485i();
                                        iVar.f11102a = C5388x0.m16809b(d10, StaticResource.CREATIVE_TYPE);
                                        iVar.f11103b = C5388x0.m16808a(d10);
                                        fVar.f11087d = iVar;
                                    }
                                    Node d11 = C5388x0.m16811d(node5, "HTMLResource");
                                    if (d11 != null) {
                                        fVar.f11089f = C5388x0.m16808a(d11);
                                    }
                                    Node d12 = C5388x0.m16811d(node5, "IFrameResource");
                                    if (d12 != null) {
                                        fVar.f11088e = C5388x0.m16808a(d12);
                                    }
                                    Node d13 = C5388x0.m16811d(node5, Companion.COMPANION_CLICK_THROUGH);
                                    if (d13 != null) {
                                        fVar.f11090g = C5388x0.m16808a(d13);
                                    }
                                    ArrayList arrayList4 = (ArrayList) C5388x0.m16810c(node5, Companion.COMPANION_CLICK_TRACKING);
                                    if (arrayList4.size() > 0) {
                                        fVar.f11091h = new ArrayList();
                                        Iterator it10 = arrayList4.iterator();
                                        while (it10.hasNext()) {
                                            String a5 = C5388x0.m16808a((Node) it10.next());
                                            if (!TextUtils.isEmpty(a5)) {
                                                fVar.f11091h.add(a5);
                                            }
                                        }
                                    }
                                    Node d14 = C5388x0.m16811d(node5, "TrackingEvents");
                                    if (d14 != null) {
                                        ArrayList arrayList5 = (ArrayList) C5388x0.m16810c(d14, Tracking.NAME);
                                        if (!arrayList5.isEmpty()) {
                                            fVar.f11093j = new ArrayList();
                                            Iterator it11 = arrayList5.iterator();
                                            while (it11.hasNext()) {
                                                C4492p a6 = C4492p.m13869a((Node) it11.next());
                                                if (a6 != null) {
                                                    fVar.f11093j.add(a6);
                                                }
                                            }
                                        }
                                    }
                                }
                                if (fVar != null) {
                                    jVar2.f11105b.add(fVar);
                                }
                            }
                        }
                        jVar = jVar2;
                    }
                    if (jVar != null) {
                        this.f11082c.add(jVar);
                    }
                    it5 = it;
                }
            }
            Node d15 = C5388x0.m16811d(node2, "Extensions");
            if (d15 != null) {
                Iterator it12 = ((ArrayList) C5388x0.m16810c(d15, Extension.NAME)).iterator();
                while (it12.hasNext()) {
                    Node node6 = (Node) it12.next();
                    if ("AdVerifications".equalsIgnoreCase(C5388x0.m16809b(node6, "type"))) {
                        mo24691a(node6);
                    }
                }
            }
            mo24691a(node);
        }
    }
}

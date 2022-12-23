package com.fyber.inneractive.sdk.response;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.config.C4345y;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.flow.vast.C4439a;
import com.fyber.inneractive.sdk.flow.vast.C4442c;
import com.fyber.inneractive.sdk.flow.vast.C4445e;
import com.fyber.inneractive.sdk.measurement.C4468i;
import com.fyber.inneractive.sdk.model.vast.C4480d;
import com.fyber.inneractive.sdk.model.vast.C4482f;
import com.fyber.inneractive.sdk.model.vast.C4489m;
import com.fyber.inneractive.sdk.model.vast.C4491o;
import com.fyber.inneractive.sdk.model.vast.C4494r;
import com.fyber.inneractive.sdk.model.vast.C4496s;
import com.fyber.inneractive.sdk.util.C5320d0;
import com.fyber.inneractive.sdk.util.C5368r;
import com.fyber.inneractive.sdk.util.IAlog;
import com.smaato.sdk.video.vast.model.VastTree;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.xml.sax.InputSource;

/* renamed from: com.fyber.inneractive.sdk.response.d */
public class C5290d extends C5288b {

    /* renamed from: e */
    public C5293g f14059e;

    /* renamed from: f */
    public C4345y f14060f;

    /* renamed from: g */
    public C4480d f14061g;

    /* renamed from: h */
    public List<C4480d> f14062h = new ArrayList();

    /* renamed from: i */
    public int f14063i;

    /* renamed from: j */
    public C4494r f14064j;

    /* renamed from: a */
    public C5291e mo24393a() {
        C5293g gVar = new C5293g();
        this.f14055a = gVar;
        this.f14059e = gVar;
        return gVar;
    }

    /* renamed from: b */
    public void mo26387b(String str) throws C4445e, Exception {
        C4491o oVar;
        try {
            String replaceFirst = str.replaceFirst("<\\?.*\\?>", "");
            DocumentBuilderFactory newInstance = DocumentBuilderFactory.newInstance();
            newInstance.setCoalescing(true);
            Document parse = newInstance.newDocumentBuilder().parse(new InputSource(new StringReader(replaceFirst)));
            if (parse != null) {
                Node firstChild = parse.getFirstChild();
                if (firstChild.getNodeName().equalsIgnoreCase(VastTree.VAST)) {
                    oVar = C4491o.m13868a(firstChild);
                } else {
                    IAlog.m16699a("XML does not contain a VAST tag as its first child!", new Object[0]);
                    throw new Exception("XML does not contain a VAST tag as its first child!");
                }
            } else {
                oVar = null;
            }
            try {
                if (this.f14064j == null) {
                    this.f14064j = new C4494r(oVar.f11125a);
                } else {
                    C4494r rVar = new C4494r(oVar.f11125a);
                    if (rVar.compareTo(this.f14064j) >= 0) {
                        this.f14064j = rVar;
                    }
                }
            } catch (C4494r.C4495a unused) {
            }
            List<C4480d> list = oVar.f11126b;
            if (list == null || list.size() == 0) {
                IAlog.m16699a("Vast response parser: no ads found in model. aborting", new Object[0]);
                throw new C4445e("ErrorNoMediaFiles", "No ads found in model. Empty Vast?");
            }
            C4480d dVar = list.get(0);
            C4496s sVar = dVar.f11078b;
            if (sVar != null) {
                IAlog.m16699a("Vast response parser: found VAST wrapper #%d", Integer.valueOf(this.f14062h.size()));
                int size = this.f14062h.size();
                int i = this.f14063i;
                if (size < i) {
                    this.f14062h.add(dVar);
                    String str2 = sVar.f11153e;
                    if (TextUtils.isEmpty(str2)) {
                        IAlog.m16699a("Vast response parser: found an empty tag uri in wrapper! aborting!", new Object[0]);
                        throw new C4445e("VastErrorInvalidFile", "No ad tag URI for wrapper");
                    } else if (C5320d0.m16722f(str2)) {
                        String a = C5368r.m16778a(str2, 3000, 5000, 5);
                        if (!TextUtils.isEmpty(a)) {
                            this.f14059e.f14098G.put(str2, a);
                            mo26387b(a);
                            return;
                        }
                        throw new C4445e("VastErrorInvalidFile", "Failed getting data from ad tag URI");
                    } else {
                        IAlog.m16699a("Vast response parser: Unsecure Wrapper URL. Aborting! url: %s", str2);
                        throw new C4445e("VastErrorUnsecure", "Unsecure ad tag URI for wrapper");
                    }
                } else {
                    IAlog.m16699a("Vast response parser: too many vast wrappers! Only %dallowed. stopping", Integer.valueOf(i));
                    throw new C4445e("VastErrorTooManyWrappers", "More than " + this.f14063i + " found");
                }
            } else if (dVar.f11079c != null) {
                this.f14061g = dVar;
            } else {
                throw new C4445e("VastErrorInvalidFile", "A top level ad with no wrapper on inline found!");
            }
        } catch (Exception e) {
            IAlog.m16699a("Failed parsing Vast file! parsing error = %s", e.getMessage());
            throw new C4445e("VastErrorInvalidFile", e.getMessage());
        }
    }

    /* renamed from: b */
    public boolean mo24395b() {
        return true;
    }

    /* renamed from: a */
    public void mo24394a(String str, C4345y yVar) throws Exception {
        this.f14060f = yVar;
        if (yVar == null || yVar.f10750f == null) {
            this.f14055a.f14074i = "ErrorConfigurationMismatch";
            return;
        }
        this.f14059e.f14093B = System.currentTimeMillis();
        this.f14063i = IAConfigManager.f10525J.f10544i.f10683c;
        this.f14059e.getClass();
        try {
            mo26387b(str);
            mo26386a(this.f14061g, this.f14062h);
        } catch (InterruptedException e) {
            throw e;
        } catch (C4445e e2) {
            this.f14059e.f14074i = e2.getMessage();
            this.f14059e.f14075j = e2.getCause().getMessage();
        } catch (Exception e3) {
            this.f14059e.f14075j = String.format("%s", new Object[]{e3.getMessage()});
            C5293g gVar = this.f14059e;
            gVar.f14074i = "VastErrorInvalidFile";
            gVar.f14089x = e3;
            if (IAlog.f14137a == 2) {
                e3.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    public void mo26386a(C4480d dVar, List<C4480d> list) throws C4445e {
        C4439a aVar = new C4439a();
        int intValue = this.f14060f.f10750f.f10572c.intValue();
        int intValue2 = this.f14060f.f10750f.f10571b.intValue();
        int intValue3 = this.f14060f.f10750f.f10576g.intValue();
        aVar.f10972a = intValue;
        aVar.f10973b = intValue2;
        aVar.f10974c = intValue3;
        if (UnitDisplayType.VERTICAL.equals(this.f14060f.f10750f.f10579j)) {
            aVar.f10975d = true;
        }
        if (this.f14060f.f10750f.f10580k.contains(2)) {
            aVar.f10976e = true;
        }
        try {
            C4494r rVar = this.f14064j;
            this.f14059e.f14094C = aVar.mo24633a(dVar, list, rVar != null ? rVar.f11152b : "");
        } catch (C4445e e) {
            C5293g gVar = this.f14059e;
            gVar.getClass();
            gVar.f14074i = e.getMessage();
        }
        C5293g gVar2 = this.f14059e;
        Map<C4489m, C4442c> map = aVar.f10977f;
        gVar2.getClass();
        if (map != null) {
            gVar2.f14095D.putAll(map);
        }
        C5293g gVar3 = this.f14059e;
        List<C4482f> list2 = aVar.f10978g;
        gVar3.getClass();
        if (list2 != null) {
            gVar3.f14096E.addAll(list2);
        }
        C5293g gVar4 = this.f14059e;
        List<C4468i> list3 = aVar.f10980i;
        gVar4.getClass();
        if (list3 != null) {
            gVar4.f14097F.addAll(list3);
        }
        if (IAlog.f14137a == 2) {
            Map<C4489m, C4442c> map2 = aVar.f10977f;
            if (map2.size() > 0) {
                IAlog.m16702d(" VParser: Unsupported media files:", new Object[0]);
                for (C4489m next : map2.keySet()) {
                    IAlog.m16702d("VParser: %s", next);
                    IAlog.m16702d("VParser: reason = %s", map2.get(next));
                }
                return;
            }
            IAlog.m16702d("VParser: Unsupported media files: none", new Object[0]);
        }
    }
}

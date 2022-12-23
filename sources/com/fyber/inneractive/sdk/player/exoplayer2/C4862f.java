package com.fyber.inneractive.sdk.player.exoplayer2;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.fyber.inneractive.sdk.player.exoplayer2.C4710e;
import com.fyber.inneractive.sdk.player.exoplayer2.C4864h;
import com.fyber.inneractive.sdk.player.exoplayer2.trackselection.C4968h;
import java.util.Iterator;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.f */
public class C4862f extends Handler {

    /* renamed from: a */
    public final /* synthetic */ C4863g f12865a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C4862f(C4863g gVar, Looper looper) {
        super(looper);
        this.f12865a = gVar;
    }

    public void handleMessage(Message message) {
        C4863g gVar = this.f12865a;
        gVar.getClass();
        boolean z = true;
        switch (message.what) {
            case 0:
                gVar.f12878m--;
                return;
            case 1:
                gVar.f12876k = message.arg1;
                Iterator<C4710e.C4711a> it = gVar.f12871f.iterator();
                while (it.hasNext()) {
                    it.next().mo24980a(gVar.f12875j, gVar.f12876k);
                }
                return;
            case 2:
                if (message.arg1 == 0) {
                    z = false;
                }
                gVar.f12879n = z;
                Iterator<C4710e.C4711a> it2 = gVar.f12871f.iterator();
                while (it2.hasNext()) {
                    it2.next().mo24979a(gVar.f12879n);
                }
                return;
            case 3:
                if (gVar.f12878m == 0) {
                    C4968h hVar = (C4968h) message.obj;
                    gVar.f12874i = true;
                    gVar.f12882q = hVar.f13235a;
                    gVar.f12883r = hVar.f13236b;
                    gVar.f12867b.mo25506a(hVar.f13237c);
                    Iterator<C4710e.C4711a> it3 = gVar.f12871f.iterator();
                    while (it3.hasNext()) {
                        it3.next().mo24978a(gVar.f12882q, gVar.f12883r);
                    }
                    return;
                }
                return;
            case 4:
                int i = gVar.f12877l - 1;
                gVar.f12877l = i;
                if (i == 0) {
                    gVar.f12885t = (C4864h.C4866b) message.obj;
                    if (message.arg1 != 0) {
                        Iterator<C4710e.C4711a> it4 = gVar.f12871f.iterator();
                        while (it4.hasNext()) {
                            it4.next().mo24974a();
                        }
                        return;
                    }
                    return;
                }
                return;
            case 5:
                if (gVar.f12877l == 0) {
                    gVar.f12885t = (C4864h.C4866b) message.obj;
                    Iterator<C4710e.C4711a> it5 = gVar.f12871f.iterator();
                    while (it5.hasNext()) {
                        it5.next().mo24974a();
                    }
                    return;
                }
                return;
            case 6:
                C4864h.C4868d dVar = (C4864h.C4868d) message.obj;
                gVar.f12877l -= dVar.f12949d;
                if (gVar.f12878m == 0) {
                    gVar.f12880o = dVar.f12946a;
                    gVar.f12881p = dVar.f12947b;
                    gVar.f12885t = dVar.f12948c;
                    Iterator<C4710e.C4711a> it6 = gVar.f12871f.iterator();
                    while (it6.hasNext()) {
                        it6.next().mo24977a(gVar.f12880o, gVar.f12881p);
                    }
                    return;
                }
                return;
            case 7:
                C4874m mVar = (C4874m) message.obj;
                if (!gVar.f12884s.equals(mVar)) {
                    gVar.f12884s = mVar;
                    Iterator<C4710e.C4711a> it7 = gVar.f12871f.iterator();
                    while (it7.hasNext()) {
                        it7.next().mo24976a(mVar);
                    }
                    return;
                }
                return;
            case 8:
                C4697d dVar2 = (C4697d) message.obj;
                Iterator<C4710e.C4711a> it8 = gVar.f12871f.iterator();
                while (it8.hasNext()) {
                    it8.next().mo24975a(dVar2);
                }
                return;
            default:
                throw new IllegalStateException();
        }
    }
}

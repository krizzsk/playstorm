package com.p374my.target;

import android.content.Context;
import com.p374my.target.common.models.ImageData;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.my.target.y */
public class C10040y extends C9653d<C10016w2> {
    /* renamed from: a */
    public static C10040y m29727a() {
        return new C10040y();
    }

    /* renamed from: a */
    public C10016w2 mo63851a(C10016w2 w2Var, C9596a aVar, Context context) {
        if (aVar.getCachePeriod() > 0 && !w2Var.mo65666m() && w2Var.mo65663j() != null) {
            C9740h8 a = C9740h8.m28156a(context);
            int slotId = aVar.getSlotId();
            if (a != null) {
                a.mo64191a(slotId, w2Var.mo65663j().toString(), false);
            } else {
                C9672e0.m27882a("unable to open disk cache and save data for slotId " + slotId);
            }
        }
        int cachePolicy = aVar.getCachePolicy();
        if (cachePolicy == 0 || cachePolicy == 1) {
            ArrayList arrayList = new ArrayList();
            for (C9795k2 next : w2Var.mo65650c()) {
                ImageData statusIcon = next.getStatusIcon();
                ImageData coinsIcon = next.getCoinsIcon();
                ImageData gotoAppIcon = next.getGotoAppIcon();
                ImageData icon = next.getIcon();
                ImageData labelIcon = next.getLabelIcon();
                ImageData bubbleIcon = next.getBubbleIcon();
                ImageData itemHighlightIcon = next.getItemHighlightIcon();
                ImageData crossNotifIcon = next.getCrossNotifIcon();
                if (statusIcon != null) {
                    arrayList.add(statusIcon);
                }
                if (coinsIcon != null) {
                    arrayList.add(coinsIcon);
                }
                if (gotoAppIcon != null) {
                    arrayList.add(gotoAppIcon);
                }
                if (icon != null) {
                    arrayList.add(icon);
                }
                if (labelIcon != null) {
                    arrayList.add(labelIcon);
                }
                if (bubbleIcon != null) {
                    arrayList.add(bubbleIcon);
                }
                if (itemHighlightIcon != null) {
                    arrayList.add(itemHighlightIcon);
                }
                if (crossNotifIcon != null) {
                    arrayList.add(crossNotifIcon);
                }
            }
            if (arrayList.size() > 0) {
                C9807k8.m28509a((List<ImageData>) arrayList).mo64623c(context);
            }
        }
        return w2Var;
    }
}

package com.mbridge.msdk.video.dynview.endcard.adapter;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.p301c.C8425b;
import com.mbridge.msdk.foundation.same.p301c.C8428c;
import com.mbridge.msdk.foundation.tools.C8594o;
import com.mbridge.msdk.video.dynview.endcard.cloudview.C9275d;
import com.mbridge.msdk.videocommon.view.RoundImageView;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.mbridge.msdk.video.dynview.endcard.adapter.a */
/* compiled from: ViewTagsAdapter */
public final class C9266a extends C9275d {

    /* renamed from: a */
    private List<CampaignEx> f22444a;

    /* renamed from: a */
    public final void mo62403a(View view, int i, float f) {
    }

    /* renamed from: a */
    public final void mo62404a(List<CampaignEx> list) {
        ArrayList arrayList = new ArrayList();
        if (list != null && list.size() > 0) {
            for (CampaignEx next : list) {
                if (!TextUtils.isEmpty(next.getIconUrl())) {
                    arrayList.add(next);
                }
            }
            this.f22444a = arrayList;
        }
    }

    /* renamed from: a */
    public final int mo62400a() {
        List<CampaignEx> list = this.f22444a;
        if (list == null || list.size() <= 0) {
            return 0;
        }
        return this.f22444a.size();
    }

    /* renamed from: a */
    public final View mo62402a(Context context, int i, ViewGroup viewGroup) {
        List<CampaignEx> list;
        View inflate = LayoutInflater.from(context).inflate(C8594o.m24812a(viewGroup.getContext(), "mbridge_reward_view_tag_item", "layout"), viewGroup, false);
        if (inflate != null) {
            final RoundImageView roundImageView = (RoundImageView) inflate.findViewById(C8594o.m24812a(context, "mbridge_tag_icon", "id"));
            if (!(roundImageView == null || (list = this.f22444a) == null || list.size() <= 0)) {
                roundImageView.setBorderRadius(2);
                C8425b.m24339a(context).mo57506a(this.f22444a.get(i).getIconUrl(), (C8428c) new C8428c() {
                    public final void onFailedLoad(String str, String str2) {
                    }

                    public final void onSuccessLoad(Bitmap bitmap, String str) {
                        RoundImageView roundImageView = roundImageView;
                        if (roundImageView != null) {
                            roundImageView.setImageBitmap(bitmap);
                        }
                    }
                });
            }
            TextView textView = (TextView) inflate.findViewById(C8594o.m24812a(context, "mbridge_tag_title", "id"));
            if (textView != null) {
                textView.setText(this.f22444a.get(i).getAppName());
            }
        }
        return inflate;
    }

    /* renamed from: a */
    public final int mo62401a(int i) {
        return i % 5;
    }
}

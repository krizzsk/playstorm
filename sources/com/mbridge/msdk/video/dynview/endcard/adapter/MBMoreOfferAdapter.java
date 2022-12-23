package com.mbridge.msdk.video.dynview.endcard.adapter;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.p301c.C8425b;
import com.mbridge.msdk.foundation.same.p301c.C8428c;
import com.mbridge.msdk.foundation.tools.C8557ad;
import com.mbridge.msdk.foundation.tools.C8594o;
import com.mbridge.msdk.system.NoProGuard;
import com.mbridge.msdk.video.dynview.moffer.C9324c;
import com.mbridge.msdk.videocommon.view.RoundImageView;
import java.util.ArrayList;
import java.util.List;

public class MBMoreOfferAdapter extends RecyclerView.Adapter<C9265b> implements NoProGuard {
    /* access modifiers changed from: private */
    public List<View> animViews = new ArrayList();
    /* access modifiers changed from: private */
    public int bitmapSuccessCount = 0;
    private List<CampaignEx> campaignExList = new ArrayList();
    /* access modifiers changed from: private */
    public boolean isShowMoreOffer;
    public C9264a listener;
    /* access modifiers changed from: private */
    public C9324c moreOfferShowCallBack;
    private String rewardEndCardurl = "";

    /* renamed from: com.mbridge.msdk.video.dynview.endcard.adapter.MBMoreOfferAdapter$a */
    public interface C9264a {
        /* renamed from: a */
        void mo62399a(int i);
    }

    static /* synthetic */ int access$008(MBMoreOfferAdapter mBMoreOfferAdapter) {
        int i = mBMoreOfferAdapter.bitmapSuccessCount;
        mBMoreOfferAdapter.bitmapSuccessCount = i + 1;
        return i;
    }

    public void setOnItemClickListener(C9264a aVar) {
        this.listener = aVar;
    }

    public void setRewardEndCardurl(String str) {
        this.rewardEndCardurl = str;
    }

    public void setMoreOfferShowCallBack(C9324c cVar) {
        this.moreOfferShowCallBack = cVar;
    }

    public C9265b onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C9265b(LayoutInflater.from(viewGroup.getContext()).inflate(C8594o.m24812a(viewGroup.getContext(), "mbridge_reward_end_card_more_offer_item", "layout"), viewGroup, false));
    }

    public void onBindViewHolder(final C9265b bVar, final int i) {
        List<CampaignEx> list = this.campaignExList;
        if (list != null && list.size() > 0) {
            if (bVar.f22442a != null) {
                bVar.f22442a.setImageDrawable((Drawable) null);
                bVar.f22442a.setTag(this.campaignExList.get(i).getIconUrl());
            }
            C8425b.m24339a(bVar.itemView.getContext()).mo57506a(this.campaignExList.get(i).getIconUrl(), (C8428c) new C8428c() {
                public final void onFailedLoad(String str, String str2) {
                }

                public final void onSuccessLoad(Bitmap bitmap, String str) {
                    if (!(bVar.f22442a == null || bVar.f22442a.getTag() == null || !bVar.f22442a.getTag().equals(str))) {
                        bVar.f22442a.setImageBitmap(bitmap);
                    }
                    MBMoreOfferAdapter.access$008(MBMoreOfferAdapter.this);
                    if (!MBMoreOfferAdapter.this.isShowMoreOffer && MBMoreOfferAdapter.this.bitmapSuccessCount >= 5 && MBMoreOfferAdapter.this.moreOfferShowCallBack != null) {
                        boolean unused = MBMoreOfferAdapter.this.isShowMoreOffer = true;
                        MBMoreOfferAdapter.this.moreOfferShowCallBack.mo62518a((List<View>) MBMoreOfferAdapter.this.animViews);
                    }
                }
            });
            if (!TextUtils.isEmpty(this.campaignExList.get(i).getAppName())) {
                String a = C8557ad.m24740a(this.rewardEndCardurl, "mof_textmod");
                if (TextUtils.isEmpty(a) || !a.equals("1")) {
                    if (bVar.f22443b != null) {
                        bVar.f22443b.setVisibility(8);
                    }
                } else if (bVar.f22443b != null) {
                    bVar.f22443b.setText(this.campaignExList.get(i).getAppName());
                }
            }
            bVar.itemView.setOnClickListener(new View.OnClickListener() {
                public final void onClick(View view) {
                    if (MBMoreOfferAdapter.this.listener != null) {
                        MBMoreOfferAdapter.this.listener.mo62399a(i);
                    }
                }
            });
        }
    }

    public int getItemCount() {
        List<CampaignEx> list = this.campaignExList;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    /* renamed from: com.mbridge.msdk.video.dynview.endcard.adapter.MBMoreOfferAdapter$b */
    static class C9265b extends RecyclerView.ViewHolder {

        /* renamed from: a */
        RoundImageView f22442a;

        /* renamed from: b */
        TextView f22443b;

        public C9265b(View view) {
            super(view);
            this.f22442a = (RoundImageView) view.findViewById(C8594o.m24812a(view.getContext(), "mbridge_reward_end_card_item_iv", "id"));
            this.f22443b = (TextView) view.findViewById(C8594o.m24812a(view.getContext(), "mbridge_reward_end_card_item_title_tv", "id"));
        }
    }

    public void setMoreOfferData(List<CampaignEx> list) {
        C9324c cVar;
        ArrayList arrayList = new ArrayList();
        if (list == null || list.size() <= 5) {
            C9324c cVar2 = this.moreOfferShowCallBack;
            if (cVar2 != null) {
                cVar2.mo62517a("Offer list is NULL or size less than 5.");
                return;
            }
            return;
        }
        int i = 0;
        for (CampaignEx next : list) {
            if (TextUtils.isEmpty(next.getIconUrl())) {
                i++;
            } else {
                arrayList.add(next);
            }
        }
        if (list.size() - i < 5 && (cVar = this.moreOfferShowCallBack) != null) {
            cVar.mo62517a("Offer icon is Null and size less than 5.");
        }
        this.campaignExList = arrayList;
    }
}

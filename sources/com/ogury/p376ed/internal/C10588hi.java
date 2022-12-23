package com.ogury.p376ed.internal;

import com.smaato.sdk.video.vast.model.Creative;
import p394io.presage.common.network.models.RewardItem;

/* renamed from: com.ogury.ed.internal.hi */
public final class C10588hi extends C10585hf {

    /* renamed from: a */
    private final RewardItem f26716a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10588hi(String str, RewardItem rewardItem) {
        super(str, rewardItem.getName());
        C10765mq.m32773b(str, Creative.AD_ID);
        C10765mq.m32773b(rewardItem, "rewardItem");
        this.f26716a = rewardItem;
    }

    /* renamed from: a */
    public final RewardItem mo67540a() {
        return this.f26716a;
    }
}

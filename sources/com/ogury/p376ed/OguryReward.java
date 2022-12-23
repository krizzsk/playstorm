package com.ogury.p376ed;

import com.ogury.p376ed.internal.C10765mq;
import java.io.Serializable;

/* renamed from: com.ogury.ed.OguryReward */
public final class OguryReward implements Serializable {

    /* renamed from: a */
    private final String f26102a;

    /* renamed from: b */
    private final String f26103b;

    public static /* synthetic */ OguryReward copy$default(OguryReward oguryReward, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = oguryReward.f26102a;
        }
        if ((i & 2) != 0) {
            str2 = oguryReward.f26103b;
        }
        return oguryReward.copy(str, str2);
    }

    public final String component1() {
        return this.f26102a;
    }

    public final String component2() {
        return this.f26103b;
    }

    public final OguryReward copy(String str, String str2) {
        C10765mq.m32773b(str, "name");
        C10765mq.m32773b(str2, "value");
        return new OguryReward(str, str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OguryReward)) {
            return false;
        }
        OguryReward oguryReward = (OguryReward) obj;
        return C10765mq.m32772a((Object) this.f26102a, (Object) oguryReward.f26102a) && C10765mq.m32772a((Object) this.f26103b, (Object) oguryReward.f26103b);
    }

    public final int hashCode() {
        return (this.f26102a.hashCode() * 31) + this.f26103b.hashCode();
    }

    public final String toString() {
        return "OguryReward(name=" + this.f26102a + ", value=" + this.f26103b + ')';
    }

    public OguryReward(String str, String str2) {
        C10765mq.m32773b(str, "name");
        C10765mq.m32773b(str2, "value");
        this.f26102a = str;
        this.f26103b = str2;
    }

    public final String getName() {
        return this.f26102a;
    }

    public final String getValue() {
        return this.f26103b;
    }
}

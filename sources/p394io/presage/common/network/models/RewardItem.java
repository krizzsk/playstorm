package p394io.presage.common.network.models;

import com.ogury.p376ed.internal.C10765mq;
import java.io.Serializable;

/* renamed from: io.presage.common.network.models.RewardItem */
public final class RewardItem implements Serializable {

    /* renamed from: a */
    private String f29338a;

    /* renamed from: b */
    private String f29339b;

    public static /* synthetic */ RewardItem copy$default(RewardItem rewardItem, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = rewardItem.f29338a;
        }
        if ((i & 2) != 0) {
            str2 = rewardItem.f29339b;
        }
        return rewardItem.copy(str, str2);
    }

    public final String component1() {
        return this.f29338a;
    }

    public final String component2() {
        return this.f29339b;
    }

    public final RewardItem copy(String str, String str2) {
        C10765mq.m32773b(str, "name");
        C10765mq.m32773b(str2, "value");
        return new RewardItem(str, str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RewardItem)) {
            return false;
        }
        RewardItem rewardItem = (RewardItem) obj;
        return C10765mq.m32772a((Object) this.f29338a, (Object) rewardItem.f29338a) && C10765mq.m32772a((Object) this.f29339b, (Object) rewardItem.f29339b);
    }

    public final int hashCode() {
        return (this.f29338a.hashCode() * 31) + this.f29339b.hashCode();
    }

    public final String toString() {
        return "RewardItem(name=" + this.f29338a + ", value=" + this.f29339b + ')';
    }

    public RewardItem(String str, String str2) {
        C10765mq.m32773b(str, "name");
        C10765mq.m32773b(str2, "value");
        this.f29338a = str;
        this.f29339b = str2;
    }

    public final String getName() {
        return this.f29338a;
    }

    public final String getValue() {
        return this.f29339b;
    }

    public final void setName(String str) {
        C10765mq.m32773b(str, "<set-?>");
        this.f29338a = str;
    }

    public final void setValue(String str) {
        C10765mq.m32773b(str, "<set-?>");
        this.f29339b = str;
    }
}

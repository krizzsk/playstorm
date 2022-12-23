package com.ironsource.environment.p201a;

import com.ironsource.environment.p203c.C6412b;
import com.ironsource.mediationsdk.C6711o;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(mo75040bv = {1, 0, 3}, mo75041d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0002J\u0006\u0010\u000b\u001a\u00020\tR\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, mo75042d2 = {"Lcom/ironsource/environment/auction/AuctionProvider;", "", "()V", "mAuctionKeyList", "Ljava/util/ArrayList;", "", "mGlobalDataReader", "Lcom/ironsource/environment/globaldata/GlobalDataReader;", "formatDataMetaData", "Lorg/json/JSONObject;", "tokenData", "getAuctionData", "environment_release"}, mo75043k = 1, mo75044mv = {1, 4, 2})
/* renamed from: com.ironsource.environment.a.b */
public final class C6404b {

    /* renamed from: a */
    private final ArrayList<String> f16291a = new ArrayList<>(new C6403a().f16290a);

    /* renamed from: b */
    private final C6711o f16292b = new C6711o();

    /* renamed from: a */
    public final JSONObject mo35915a() {
        JSONObject a = this.f16292b.mo36837a(this.f16291a);
        Intrinsics.checkNotNullExpressionValue(a, "mGlobalDataReader.getDataByKeys(mAuctionKeyList)");
        JSONObject a2 = C6412b.m19258a(a.optJSONObject("md"));
        if (a2 != null) {
            a.put("md", a2);
        }
        return a;
    }
}

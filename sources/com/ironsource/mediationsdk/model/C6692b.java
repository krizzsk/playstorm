package com.ironsource.mediationsdk.model;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo75040bv = {1, 0, 3}, mo75041d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, mo75042d2 = {"Lcom/ironsource/mediationsdk/model/ApplicationAuctionSettings;", "", "auctionData", "", "(Ljava/lang/String;)V", "getAuctionData", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "mediationsdk_release"}, mo75043k = 1, mo75044mv = {1, 4, 2})
/* renamed from: com.ironsource.mediationsdk.model.b */
public final class C6692b {

    /* renamed from: a */
    public final String f17483a;

    public C6692b() {
        this((String) null, 1);
    }

    public C6692b(String str) {
        Intrinsics.checkNotNullParameter(str, "auctionData");
        this.f17483a = str;
    }

    private /* synthetic */ C6692b(String str, int i) {
        this("");
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C6692b) && Intrinsics.areEqual((Object) this.f17483a, (Object) ((C6692b) obj).f17483a);
        }
        return true;
    }

    public final int hashCode() {
        String str = this.f17483a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "ApplicationAuctionSettings(auctionData=" + this.f17483a + ")";
    }
}

package com.ironsource.mediationsdk;

import com.ironsource.mediationsdk.adunit.data.DataKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo75040bv = {1, 0, 3}, mo75041d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, mo75042d2 = {"Lcom/ironsource/mediationsdk/InitConfig;", "", "appKey", "", "userId", "(Ljava/lang/String;Ljava/lang/String;)V", "getAppKey", "()Ljava/lang/String;", "getUserId", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "mediationsdk_release"}, mo75043k = 1, mo75044mv = {1, 4, 2})
/* renamed from: com.ironsource.mediationsdk.E */
public final class C6478E {

    /* renamed from: a */
    final String f16428a;

    /* renamed from: b */
    final String f16429b;

    public C6478E(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "appKey");
        Intrinsics.checkNotNullParameter(str2, DataKeys.USER_ID);
        this.f16428a = str;
        this.f16429b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6478E)) {
            return false;
        }
        C6478E e = (C6478E) obj;
        return Intrinsics.areEqual((Object) this.f16428a, (Object) e.f16428a) && Intrinsics.areEqual((Object) this.f16429b, (Object) e.f16429b);
    }

    public final int hashCode() {
        String str = this.f16428a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f16429b;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "InitConfig(appKey=" + this.f16428a + ", userId=" + this.f16429b + ")";
    }
}

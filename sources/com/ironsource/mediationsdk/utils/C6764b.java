package com.ironsource.mediationsdk.utils;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo75040bv = {1, 0, 3}, mo75041d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00032\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\n¨\u0006\u0015"}, mo75042d2 = {"Lcom/ironsource/mediationsdk/utils/ApplicationGeneralSettings;", "", "isExternalArmEventsEnabled", "", "externalArmEventsUrl", "", "shouldUseAppSet", "(ZLjava/lang/String;Z)V", "getExternalArmEventsUrl", "()Ljava/lang/String;", "()Z", "getShouldUseAppSet", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "mediationsdk_release"}, mo75043k = 1, mo75044mv = {1, 4, 2})
/* renamed from: com.ironsource.mediationsdk.utils.b */
public final class C6764b {

    /* renamed from: a */
    public final boolean f17666a;

    /* renamed from: b */
    public final String f17667b;

    /* renamed from: c */
    public final boolean f17668c;

    public C6764b() {
        this(false, (String) null, false, 7);
    }

    public C6764b(boolean z, String str, boolean z2) {
        Intrinsics.checkNotNullParameter(str, "externalArmEventsUrl");
        this.f17666a = z;
        this.f17667b = str;
        this.f17668c = z2;
    }

    private /* synthetic */ C6764b(boolean z, String str, boolean z2, int i) {
        this(true, "https://outcome-arm-ext-med-ext.sonic-us.supersonicads.com/aemData", true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6764b)) {
            return false;
        }
        C6764b bVar = (C6764b) obj;
        return this.f17666a == bVar.f17666a && Intrinsics.areEqual((Object) this.f17667b, (Object) bVar.f17667b) && this.f17668c == bVar.f17668c;
    }

    public final int hashCode() {
        boolean z = this.f17666a;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i = (z ? 1 : 0) * true;
        String str = this.f17667b;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        boolean z3 = this.f17668c;
        if (!z3) {
            z2 = z3;
        }
        return hashCode + (z2 ? 1 : 0);
    }

    public final String toString() {
        return "ApplicationGeneralSettings(isExternalArmEventsEnabled=" + this.f17666a + ", externalArmEventsUrl=" + this.f17667b + ", shouldUseAppSet=" + this.f17668c + ")";
    }
}

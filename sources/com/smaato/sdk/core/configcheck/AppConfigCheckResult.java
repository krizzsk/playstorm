package com.smaato.sdk.core.configcheck;

public final class AppConfigCheckResult {
    private final boolean allActivitiesDeclared;
    private final boolean allMandatoryPermissionsDeclared;

    AppConfigCheckResult(boolean z, boolean z2) {
        this.allMandatoryPermissionsDeclared = z;
        this.allActivitiesDeclared = z2;
    }

    public boolean isAppConfiguredProperly() {
        return this.allMandatoryPermissionsDeclared && this.allActivitiesDeclared;
    }

    /* access modifiers changed from: package-private */
    public boolean allMandatoryPermissionsDeclared() {
        return this.allMandatoryPermissionsDeclared;
    }

    /* access modifiers changed from: package-private */
    public boolean allActivitiesDeclared() {
        return this.allActivitiesDeclared;
    }
}

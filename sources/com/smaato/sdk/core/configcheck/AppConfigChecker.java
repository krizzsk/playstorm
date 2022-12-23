package com.smaato.sdk.core.configcheck;

import com.smaato.sdk.core.log.LogDomain;
import com.smaato.sdk.core.log.Logger;
import com.smaato.sdk.core.util.AppMetaData;
import com.smaato.sdk.core.util.Joiner;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.collections.Lists;
import com.smaato.sdk.core.util.p382fi.Predicate;
import java.util.List;

public final class AppConfigChecker {
    private final AppMetaData appMetaData;
    private final ExpectedManifestEntries expectedManifestEntries;
    private final Logger logger;

    public AppConfigChecker(Logger logger2, ExpectedManifestEntries expectedManifestEntries2, AppMetaData appMetaData2) {
        this.logger = (Logger) Objects.requireNonNull(logger2, "Parameter logger cannot be null for AppManifestConfigChecker::new");
        this.expectedManifestEntries = (ExpectedManifestEntries) Objects.requireNonNull(expectedManifestEntries2, "Parameter expectedManifestEntries cannot be null for AppManifestConfigChecker::new");
        this.appMetaData = (AppMetaData) Objects.requireNonNull(appMetaData2, "Parameter permissionChecker cannot be null for AppManifestConfigChecker::new");
    }

    public AppConfigCheckResult check() {
        return new AppConfigCheckResult(allMandatoryPermissionsDeclared(), allActivitiesDeclared());
    }

    private boolean allMandatoryPermissionsDeclared() {
        List<T> filter = Lists.filter(this.expectedManifestEntries.getPermissionsMandatory(), new Predicate() {
            public final boolean test(Object obj) {
                return AppConfigChecker.this.lambda$allMandatoryPermissionsDeclared$0$AppConfigChecker((String) obj);
            }
        });
        boolean isEmpty = filter.isEmpty();
        if (!isEmpty) {
            this.logger.error(LogDomain.CONFIG_CHECK, "Mandatory permissions are not granted: %s", Joiner.join((CharSequence) ", ", (Iterable) filter));
        }
        return isEmpty;
    }

    public /* synthetic */ boolean lambda$allMandatoryPermissionsDeclared$0$AppConfigChecker(String str) {
        return !this.appMetaData.isPermissionGranted(str);
    }

    private boolean allActivitiesDeclared() {
        List<T> filter = Lists.filter(this.expectedManifestEntries.getActivities(), new Predicate() {
            public final boolean test(Object obj) {
                return AppConfigChecker.this.lambda$allActivitiesDeclared$1$AppConfigChecker((Class) obj);
            }
        });
        boolean isEmpty = filter.isEmpty();
        if (!isEmpty) {
            this.logger.error(LogDomain.CONFIG_CHECK, "Mandatory activities are not declared in the application manifest: %s", Joiner.join((CharSequence) ", ", (Iterable) filter));
        }
        return isEmpty;
    }

    public /* synthetic */ boolean lambda$allActivitiesDeclared$1$AppConfigChecker(Class cls) {
        return !this.appMetaData.isActivityRegistered(cls);
    }
}

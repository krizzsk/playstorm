package com.smaato.sdk.core.configcheck;

import android.app.Activity;
import com.smaato.sdk.core.util.Objects;
import java.util.Collections;
import java.util.Set;

public class ExpectedManifestEntries {
    public static final ExpectedManifestEntries EMPTY = new ExpectedManifestEntries(Collections.emptySet(), Collections.emptySet());
    private final Set<Class<? extends Activity>> activities;
    private final Set<String> permissionsMandatory;

    public ExpectedManifestEntries(Set<String> set, Set<Class<? extends Activity>> set2) {
        Objects.requireNonNull(set, "Parameter permissionsMandatory cannot be null for ExpectedManifestEntries::new");
        this.permissionsMandatory = Collections.unmodifiableSet(set);
        Objects.requireNonNull(set2, "Parameter activities cannot be null for ExpectedManifestEntries::new");
        this.activities = Collections.unmodifiableSet(set2);
    }

    public Set<String> getPermissionsMandatory() {
        return this.permissionsMandatory;
    }

    public Set<Class<? extends Activity>> getActivities() {
        return this.activities;
    }
}

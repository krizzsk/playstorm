package com.smaato.sdk.core.init;

import android.util.Log;
import com.smaato.sdk.core.SmaatoSdk;
import com.smaato.sdk.core.configcheck.ExpectedManifestEntries;
import com.smaato.sdk.core.framework.ModuleInterface;
import com.smaato.sdk.core.log.LogDomain;
import com.smaato.sdk.core.p378ad.AdLoaderPlugin;
import com.smaato.sdk.core.p379di.ClassFactory;
import com.smaato.sdk.core.p379di.DiRegistry;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.collections.Lists;
import com.smaato.sdk.core.util.p382fi.Consumer;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public final class ModuleInterfaceUtils {
    private ModuleInterfaceUtils() {
    }

    public static List<ModuleInterface> getValidInitialisedModuleInterfaces(ClassLoader classLoader, Iterable<ModuleInterface> iterable) {
        ArrayList arrayList = new ArrayList();
        for (ModuleInterface next : iterable) {
            if (!next.version().equals(SmaatoSdk.getVersion())) {
                String replace = next.moduleDiName().replace("Interface", "");
                String name = LogDomain.CORE.name();
                Log.e(name, "Non-compatible version of core and " + replace);
            } else {
                next.init(classLoader);
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    public static ExpectedManifestEntries getExpectedManifestEntriesFromModules(List<ModuleInterface> list) {
        HashSet hashSet = new HashSet(CoreManifestEntries.PERMISSIONS_MANDATORY);
        HashSet hashSet2 = new HashSet(CoreManifestEntries.ACTIVITIES);
        for (ModuleInterface expectedManifestEntries : list) {
            ExpectedManifestEntries expectedManifestEntries2 = expectedManifestEntries.getExpectedManifestEntries();
            hashSet.addAll(expectedManifestEntries2.getPermissionsMandatory());
            hashSet2.addAll(expectedManifestEntries2.getActivities());
        }
        return new ExpectedManifestEntries(hashSet, hashSet2);
    }

    public static List<DiRegistry> getDiOfModules(List<ModuleInterface> list) {
        return Lists.mapLazy(list, $$Lambda$ModuleInterfaceUtils$01cV8XywGY3RdorqhN0l7NmZ4Og.INSTANCE);
    }

    /* access modifiers changed from: private */
    public static DiRegistry buildModuleRegistry(ModuleInterface moduleInterface) {
        return DiRegistry.m32956of(new Consumer() {
            public final void accept(Object obj) {
                ((DiRegistry) obj).registerFactory(ModuleInterface.this.moduleDiName(), AdLoaderPlugin.class, (ClassFactory) Objects.requireNonNull(ModuleInterface.this.getAdLoaderPluginFactory()));
            }
        }).addFrom(moduleInterface.moduleDiRegistry());
    }
}

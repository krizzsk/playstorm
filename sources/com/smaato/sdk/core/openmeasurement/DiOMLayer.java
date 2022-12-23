package com.smaato.sdk.core.openmeasurement;

import android.content.Context;
import com.smaato.sdk.core.p379di.DiRegistry;
import com.smaato.sdk.core.util.collections.Iterables;
import com.smaato.sdk.core.util.p382fi.Consumer;
import java.util.ArrayList;
import java.util.List;
import java.util.ServiceLoader;

public final class DiOMLayer {
    private DiOMLayer() {
    }

    public static DiRegistry createRegistry(Context context) {
        return DiRegistry.m32956of(new Consumer(loadAndInitPlugins(context)) {
            public final /* synthetic */ List f$0;

            {
                this.f$0 = r1;
            }

            public final void accept(Object obj) {
                Iterables.forEach(this.f$0, new Consumer() {
                    public final void accept(Object obj) {
                        DiRegistry.this.addFrom(((ViewabilityPlugin) obj).diRegistry());
                    }
                });
            }
        });
    }

    private static List<ViewabilityPlugin> loadAndInitPlugins(Context context) {
        ServiceLoader<S> load = ServiceLoader.load(ViewabilityPlugin.class, context.getClassLoader());
        ArrayList arrayList = new ArrayList();
        for (S s : load) {
            if (!s.getName().isEmpty()) {
                s.init(context);
                arrayList.add(s);
            }
        }
        return arrayList;
    }
}

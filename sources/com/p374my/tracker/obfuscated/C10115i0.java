package com.p374my.tracker.obfuscated;

import android.app.Application;
import com.p374my.tracker.plugins.MyTrackerPlugin;
import com.p374my.tracker.plugins.MyTrackerPluginConfig;
import com.p374my.tracker.plugins.PluginEventTracker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.my.tracker.obfuscated.i0 */
public final class C10115i0 {

    /* renamed from: a */
    private final List<MyTrackerPlugin> f25189a = new ArrayList();

    /* renamed from: b */
    private final AtomicBoolean f25190b = new AtomicBoolean();

    /* renamed from: c */
    private final PluginEventTracker f25191c;

    /* renamed from: d */
    private final Application f25192d;

    private C10115i0(PluginEventTracker pluginEventTracker, Application application) {
        this.f25191c = pluginEventTracker;
        this.f25192d = application;
    }

    /* renamed from: a */
    public static C10115i0 m30084a(C10126m mVar, Application application) {
        return new C10115i0(PluginEventTracker.newTracker(mVar), application);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m30085b(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            MyTrackerPluginConfig myTrackerPluginConfig = (MyTrackerPluginConfig) it.next();
            String pluginName = myTrackerPluginConfig.getPluginName();
            C10175u0.m30446c("PluginHandler: initializing plugin " + pluginName);
            try {
                MyTrackerPlugin myTrackerPlugin = (MyTrackerPlugin) Class.forName(myTrackerPluginConfig.getPluginClass()).newInstance();
                myTrackerPlugin.init(myTrackerPluginConfig, this.f25191c, this.f25192d);
                this.f25189a.add(myTrackerPlugin);
                C10175u0.m30446c("PluginHandler: plugin " + pluginName + " is initialized");
            } catch (Throwable th) {
                C10175u0.m30445b("PluginHandler: exception occurred while initialization plugin " + pluginName, th);
            }
        }
    }

    /* renamed from: a */
    public void mo66169a(List<MyTrackerPluginConfig> list) {
        if (!this.f25190b.compareAndSet(false, true)) {
            C10175u0.m30440a("PluginHandler: instance has already been initialized");
        } else {
            C10104d.m30023a(new Runnable(list) {
                public final /* synthetic */ List f$1;

                {
                    this.f$1 = r2;
                }

                public final void run() {
                    C10115i0.this.m30085b(this.f$1);
                }
            });
        }
    }
}

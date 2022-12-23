package com.mbridge.msdk.system;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.MBridgeSDK;
import com.mbridge.msdk.foundation.controller.C2350a;
import com.mbridge.msdk.foundation.controller.C2358b;
import com.mbridge.msdk.foundation.controller.authoritycontroller.AuthorityInfoBean;
import com.mbridge.msdk.foundation.controller.authoritycontroller.C2357a;
import com.mbridge.msdk.foundation.controller.authoritycontroller.CallBackForDeveloper;
import com.mbridge.msdk.foundation.download.MBDownloadConfig;
import com.mbridge.msdk.foundation.download.MBDownloadManager;
import com.mbridge.msdk.foundation.download.database.IDatabaseOpenHelper;
import com.mbridge.msdk.foundation.download.resource.ResourceConfig;
import com.mbridge.msdk.foundation.download.utils.ILogger;
import com.mbridge.msdk.foundation.p066db.C2376g;
import com.mbridge.msdk.foundation.same.net.C8507n;
import com.mbridge.msdk.foundation.same.net.p310f.C8487d;
import com.mbridge.msdk.foundation.same.report.C8518b;
import com.mbridge.msdk.foundation.same.report.C8542e;
import com.mbridge.msdk.foundation.tools.C8585m;
import com.mbridge.msdk.foundation.tools.C8608u;
import com.mbridge.msdk.out.SDKInitStatusListener;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.mbridge.msdk.system.a */
/* compiled from: MBridgeSDKImpl */
public final class C9131a implements MBridgeSDK {

    /* renamed from: a */
    public static Map<String, String> f22132a;

    /* renamed from: b */
    private volatile MBridgeSDK.PLUGIN_LOAD_STATUS f22133b = MBridgeSDK.PLUGIN_LOAD_STATUS.INITIAL;

    /* renamed from: c */
    private Context f22134c;

    /* renamed from: d */
    private SDKInitStatusListener f22135d;

    /* renamed from: e */
    private boolean f22136e = false;

    /* renamed from: f */
    private final Application.ActivityLifecycleCallbacks f22137f = new Application.ActivityLifecycleCallbacks() {
        public final void onActivityPaused(Activity activity) {
        }

        public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        public final void onActivityCreated(Activity activity, Bundle bundle) {
            C8585m.m24795a().mo57771c();
        }

        public final void onActivityStarted(Activity activity) {
            int f = C2350a.m5601e().mo15791f();
            if (f == 0) {
                C8542e.m24707a("1");
            }
            C2350a.m5601e().mo15784b(f + 1);
        }

        public final void onActivityResumed(Activity activity) {
            C2350a.m5601e().mo15778a((Context) activity);
        }

        public final void onActivityStopped(Activity activity) {
            int f = C2350a.m5601e().mo15791f();
            if (f <= 1) {
                C8542e.m24707a("2");
            }
            C2350a.m5601e().mo15784b(f - 1);
        }

        public final void onActivityDestroyed(Activity activity) {
            C8585m.m24795a().mo57772d();
            C2350a.m5601e().mo15790d();
        }
    };

    public final void setThirdPartyFeatures(Map<String, Object> map) {
    }

    public final void showUserPrivateInfoTips(Context context, CallBackForDeveloper callBackForDeveloper) {
    }

    /* renamed from: a */
    private void m26175a() {
        this.f22136e = false;
        try {
            if (this.f22134c instanceof Application) {
                ((Application) this.f22134c).registerActivityLifecycleCallbacks(this.f22137f);
            }
            C8507n.m24587a(this.f22134c);
            C2358b.m5644a().mo15826a((Map) f22132a, this.f22134c);
            this.f22133b = MBridgeSDK.PLUGIN_LOAD_STATUS.COMPLETED;
            C8487d.m24492a().mo57594c();
            HandlerThread handlerThread = new HandlerThread("mb_db_thread");
            handlerThread.start();
            Handler handler = new Handler(handlerThread.getLooper());
            MBDownloadConfig.Builder builder = new MBDownloadConfig.Builder();
            builder.setDatabaseHandler(handler);
            builder.setDatabaseOpenHelper(new IDatabaseOpenHelper() {
                public final SQLiteDatabase getReadableDatabase() {
                    return C2376g.m5723a(C2350a.m5601e().mo15792g()).mo15892a();
                }

                public final SQLiteDatabase getWritableDatabase() {
                    return C2376g.m5723a(C2350a.m5601e().mo15792g()).mo15895b();
                }
            });
            builder.setLogger(new ILogger() {
                public final void log(String str, String str2) {
                    C8608u.m24880a(str, str2);
                }

                public final void log(String str, Exception exc) {
                    C8608u.m24880a(str, exc.getMessage());
                }
            });
            MBDownloadManager.getInstance().initialize(C2350a.m5601e().mo15792g(), builder.build(), new ResourceConfig.Builder().setMaxStorageSpace(100).setMaxStorageTime(259200000).build());
            C8518b.m24607a().mo57680b();
            if (this.f22135d != null && !this.f22136e) {
                this.f22136e = true;
                this.f22135d.onInitSuccess();
            }
            try {
                C8585m.m24795a().mo57767a(this.f22134c.getApplicationContext());
            } catch (Exception e) {
                C8608u.m24881a("com.mbridge.msdk", "INIT", e);
            }
        } catch (Exception e2) {
            if (MBridgeConstans.DEBUG) {
                C8608u.m24881a("com.mbridge.msdk", "INIT FAIL", e2);
                e2.printStackTrace();
            }
            SDKInitStatusListener sDKInitStatusListener = this.f22135d;
            if (sDKInitStatusListener != null && !this.f22136e) {
                this.f22136e = true;
                sDKInitStatusListener.onInitFail(e2.getMessage());
            }
        }
    }

    public final MBridgeSDK.PLUGIN_LOAD_STATUS getStatus() {
        return this.f22133b;
    }

    public final void preload(Map<String, Object> map) {
        if (this.f22133b == MBridgeSDK.PLUGIN_LOAD_STATUS.COMPLETED) {
            C2358b.m5644a().mo15825a(map, 0);
        }
    }

    public final void setUserPrivateInfoType(Context context, String str, int i) {
        m26176a(context);
        C2357a.m5633a().mo15818a(str, i);
    }

    public final void setDoNotTrackStatus(boolean z) {
        C2357a.m5633a().mo15821b(z ? 1 : 0);
    }

    public final void setDoNotTrackStatus(Context context, boolean z) {
        m26176a(context);
        C2357a.m5633a().mo15821b(z ? 1 : 0);
    }

    public final AuthorityInfoBean userPrivateInfo(Context context) {
        m26176a(context);
        return C2357a.m5633a().mo15820b();
    }

    public final void setConsentStatus(Context context, int i) {
        m26176a(context);
        C2357a.m5633a().mo15817a(i);
    }

    public final boolean getConsentStatus(Context context) {
        m26176a(context);
        return C2357a.m5633a().mo15823d();
    }

    public final void preloadFrame(Map<String, Object> map) {
        C2358b.m5644a().mo15825a(map, 1);
    }

    public final Map<String, String> getMBConfigurationMap(String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put(MBridgeConstans.ID_MBRIDGE_APPID, str);
        hashMap.put(MBridgeConstans.ID_MBRIDGE_APPKEY, str2);
        hashMap.put(MBridgeConstans.ID_MBRIDGE_STARTUPCRASH, String.valueOf(1));
        return hashMap;
    }

    public final void release() {
        if (this.f22133b == MBridgeSDK.PLUGIN_LOAD_STATUS.COMPLETED) {
            C2358b.m5644a().mo15827b();
        }
        Context context = this.f22134c;
        if (context instanceof Application) {
            ((Application) context).unregisterActivityLifecycleCallbacks(this.f22137f);
        }
    }

    public final void init(Map<String, String> map, Application application) {
        this.f22134c = application.getApplicationContext();
        f22132a = map;
        m26175a();
    }

    public final void initAsync(Map<String, String> map, Application application) {
        this.f22134c = application.getApplicationContext();
        f22132a = map;
        m26175a();
    }

    public final void init(Map<String, String> map, Context context) {
        this.f22134c = context.getApplicationContext();
        f22132a = map;
        m26175a();
    }

    public final void initAsync(Map<String, String> map, Context context) {
        this.f22134c = context.getApplicationContext();
        f22132a = map;
        m26175a();
    }

    public final void init(Map<String, String> map, Application application, SDKInitStatusListener sDKInitStatusListener) {
        this.f22134c = application;
        this.f22135d = sDKInitStatusListener;
        f22132a = map;
        m26175a();
    }

    public final void initAsync(Map<String, String> map, Application application, SDKInitStatusListener sDKInitStatusListener) {
        this.f22134c = application;
        this.f22135d = sDKInitStatusListener;
        f22132a = map;
        m26175a();
    }

    public final void init(Map<String, String> map, Context context, SDKInitStatusListener sDKInitStatusListener) {
        this.f22134c = context.getApplicationContext();
        this.f22135d = sDKInitStatusListener;
        f22132a = map;
        m26175a();
    }

    public final void initAsync(Map<String, String> map, Context context, SDKInitStatusListener sDKInitStatusListener) {
        this.f22134c = context.getApplicationContext();
        this.f22135d = sDKInitStatusListener;
        f22132a = map;
        m26175a();
    }

    /* renamed from: a */
    private void m26176a(Context context) {
        if (C2350a.m5601e().mo15792g() == null && context != null) {
            C2350a.m5601e().mo15785b(context);
        }
    }

    public final void updateDialogWeakActivity(WeakReference<Activity> weakReference) {
        C2350a.m5601e().mo15781a(weakReference);
    }
}

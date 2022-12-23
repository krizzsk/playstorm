package com.vungle.warren.utility.platform;

import android.content.Context;
import android.media.AudioManager;
import android.os.Build;
import android.os.Environment;
import android.os.PowerManager;
import android.provider.Settings;
import android.text.TextUtils;
import android.webkit.WebSettings;
import androidx.core.util.Consumer;
import com.vungle.warren.model.Cookie;
import com.vungle.warren.persistence.DatabaseHelper;
import com.vungle.warren.persistence.Repository;
import com.vungle.warren.utility.VungleThreadPoolExecutor;

public class AndroidPlatform implements Platform {
    private final String TAG = getClass().getSimpleName();
    /* access modifiers changed from: private */
    public final Context context;
    private final PowerManager powerManager;
    private final Repository repository;
    private final VungleThreadPoolExecutor uaExecutor;

    public AndroidPlatform(Context context2, Repository repository2, VungleThreadPoolExecutor vungleThreadPoolExecutor) {
        this.context = context2;
        this.powerManager = (PowerManager) context2.getSystemService("power");
        this.repository = repository2;
        this.uaExecutor = vungleThreadPoolExecutor;
    }

    public boolean isAtLeastMinimumSDK() {
        return Build.VERSION.SDK_INT >= 21;
    }

    public boolean getIsBatterySaverEnabled() {
        if (Build.VERSION.SDK_INT >= 21) {
            return this.powerManager.isPowerSaveMode();
        }
        return false;
    }

    public boolean getIsSideloaded() {
        if (Build.VERSION.SDK_INT < 26) {
            try {
                if (Settings.Secure.getInt(this.context.getContentResolver(), "install_non_market_apps") == 1) {
                    return true;
                }
                return false;
            } catch (Settings.SettingNotFoundException unused) {
                return false;
            }
        } else if (this.context.checkCallingOrSelfPermission("android.permission.REQUEST_INSTALL_PACKAGES") == 0) {
            return this.context.getApplicationContext().getPackageManager().canRequestPackageInstalls();
        } else {
            return false;
        }
    }

    public double getVolumeLevel() {
        AudioManager audioManager = (AudioManager) this.context.getSystemService("audio");
        return ((double) audioManager.getStreamVolume(3)) / ((double) audioManager.getStreamMaxVolume(3));
    }

    public boolean getIsSoundEnabled() {
        return ((AudioManager) this.context.getSystemService("audio")).getStreamVolume(3) > 0;
    }

    public boolean getIsSDCardPresent() {
        return Environment.getExternalStorageState().equals("mounted");
    }

    public void getUserAgentLazy(final Consumer<String> consumer) {
        this.uaExecutor.execute(new Runnable() {
            public void run() {
                if (Build.VERSION.SDK_INT >= 17) {
                    String defaultUserAgent = WebSettings.getDefaultUserAgent(AndroidPlatform.this.context);
                    consumer.accept(defaultUserAgent);
                    try {
                        AndroidPlatform.this.addUserAgentInCookie(defaultUserAgent);
                    } catch (DatabaseHelper.DBException unused) {
                        consumer.accept(null);
                    }
                } else {
                    consumer.accept(null);
                }
            }
        });
    }

    /* access modifiers changed from: private */
    public void addUserAgentInCookie(String str) throws DatabaseHelper.DBException {
        Cookie cookie = new Cookie("userAgent");
        cookie.putValue("userAgent", str);
        this.repository.save(cookie);
    }

    public String getUserAgent() {
        Cookie cookie = this.repository.load("userAgent", Cookie.class).get();
        if (cookie == null) {
            return System.getProperty("http.agent");
        }
        String string = cookie.getString("userAgent");
        return TextUtils.isEmpty(string) ? System.getProperty("http.agent") : string;
    }
}

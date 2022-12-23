package p009by.saygames.screenshot;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.os.Handler;
import android.os.HandlerThread;
import android.provider.MediaStore;

/* renamed from: by.saygames.screenshot.ScreenshotHandlerManager */
public class ScreenshotHandlerManager {
    private final ContentObserver mContentObserver;
    private final ContentResolver mContentResolver;
    private final Handler mHandler = new Handler(this.mHandlerThread.getLooper());
    private final HandlerThread mHandlerThread;

    public ScreenshotHandlerManager(ContentResolver contentResolver) {
        HandlerThread handlerThread = new HandlerThread("ShotWatch");
        this.mHandlerThread = handlerThread;
        handlerThread.start();
        this.mContentResolver = contentResolver;
        this.mContentObserver = new ScreenshotObserver(this.mHandler);
    }

    public void register() {
        this.mContentResolver.registerContentObserver(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, true, this.mContentObserver);
    }

    public void unregister() {
        this.mContentResolver.unregisterContentObserver(this.mContentObserver);
    }
}

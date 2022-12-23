package p009by.saygames.screenshot;

import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
import android.provider.MediaStore;
import java.util.Calendar;
import p009by.saygames.SayKitEvents;

/* renamed from: by.saygames.screenshot.ScreenshotObserver */
public class ScreenshotObserver extends ContentObserver {
    private final String MEDIA_EXTERNAL_URI_STRING = MediaStore.Images.Media.EXTERNAL_CONTENT_URI.toString();
    private long mLastTimestamp = 0;

    public ScreenshotObserver(Handler handler) {
        super(handler);
    }

    public void onChange(boolean z) {
        super.onChange(z);
    }

    public void onChange(boolean z, Uri uri) {
        super.onChange(z, uri);
        if (isSingleImageFile(uri) && (Calendar.getInstance().getTimeInMillis() / 1000) - this.mLastTimestamp > 2) {
            SayKitEvents.track("screenshot", 0, 0, "");
            this.mLastTimestamp = Calendar.getInstance().getTimeInMillis() / 1000;
        }
    }

    private boolean isSingleImageFile(Uri uri) {
        String uri2 = uri.toString();
        return uri2.matches(this.MEDIA_EXTERNAL_URI_STRING + "/[0-9]+");
    }

    public boolean deliverSelfNotifications() {
        return super.deliverSelfNotifications();
    }
}

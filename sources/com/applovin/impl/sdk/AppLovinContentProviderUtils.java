package com.applovin.impl.sdk;

import android.database.Cursor;
import android.database.MatrixCursor;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.webkit.MimeTypeMap;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class AppLovinContentProviderUtils {

    /* renamed from: a */
    private static final String[] f2807a = {"_display_name", "_size"};

    /* renamed from: a */
    private static Uri m3732a(String str) {
        return Uri.parse("content://" + (C1959m.m4401M().getPackageName() + ".applovincontentprovider/" + str));
    }

    /* renamed from: a */
    private static File m3733a(Uri uri) {
        String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment == null) {
            return null;
        }
        return m3734b(lastPathSegment);
    }

    /* renamed from: b */
    private static File m3734b(String str) {
        File file = new File(C1959m.m4401M().getCacheDir() + File.separator + "ALContentProviderCache");
        if (!file.exists()) {
            try {
                if (!file.mkdir()) {
                    return null;
                }
            } catch (Throwable unused) {
            }
        }
        return new File(file, str);
    }

    public static Uri cacheJPEGImageWithFileName(Bitmap bitmap, String str) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(m3734b(str));
            bitmap.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
            fileOutputStream.flush();
            fileOutputStream.close();
            return m3732a(str);
        } catch (Throwable th) {
            if (!C2092v.m5047a()) {
                return null;
            }
            C2092v.m5053i("AppLovinContentProvider", "Failed to create jpeg file '" + str + "' for content provider with exception: " + th);
            return null;
        }
    }

    public static Uri cacheTextWithFileName(String str, String str2) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(m3734b(str2));
            fileOutputStream.write(str.getBytes());
            fileOutputStream.close();
            return m3732a(str2);
        } catch (Throwable th) {
            if (!C2092v.m5047a()) {
                return null;
            }
            C2092v.m5053i("AppLovinContentProvider", "Failed to create text file '" + str2 + "' for content provider with exception: " + th);
            return null;
        }
    }

    public static String getType(Uri uri) {
        File a = m3733a(uri);
        try {
            String substring = a.getName().substring(a.getName().indexOf(46) + 1);
            if (MimeTypeMap.getSingleton().hasExtension(substring)) {
                return MimeTypeMap.getSingleton().getMimeTypeFromExtension(substring);
            }
            return null;
        } catch (Throwable th) {
            if (!C2092v.m5047a()) {
                return null;
            }
            C2092v.m5049c("AppLovinContentProvider", "Failed to get file type for '" + uri.toString() + "'", th);
            return null;
        }
    }

    public static ParcelFileDescriptor openFile(Uri uri) {
        try {
            return ParcelFileDescriptor.open(m3733a(uri), 268435456);
        } catch (FileNotFoundException e) {
            if (!C2092v.m5047a()) {
                return null;
            }
            C2092v.m5049c("AppLovinContentProvider", "Failed to open file '" + uri.toString() + "'", e);
            return null;
        }
    }

    public static Cursor query(Uri uri) {
        File a = m3733a(uri);
        try {
            MatrixCursor matrixCursor = new MatrixCursor(f2807a, 1);
            matrixCursor.addRow(new Object[]{a.getName(), Long.valueOf(a.length())});
            return matrixCursor;
        } catch (Throwable th) {
            if (!C2092v.m5047a()) {
                return null;
            }
            C2092v.m5049c("AppLovinContentProvider", "Failed to query file '" + uri.toString() + "'", th);
            return null;
        }
    }
}

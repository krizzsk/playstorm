package com.tapjoy;

import android.app.UiModeManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.Handler;
import android.os.Looper;
import android.os.StatFs;
import android.provider.Settings;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import com.adjust.sdk.Constants;
import com.google.common.base.Ascii;
import com.tapjoy.TJAdUnitConstants;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.math.BigDecimal;
import java.security.MessageDigest;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import javax.xml.parsers.DocumentBuilderFactory;
import org.json.JSONObject;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class TapjoyUtil {

    /* renamed from: a */
    private static final AtomicInteger f27646a = new AtomicInteger(1);

    public static String SHA1(String str) {
        return m33200a("SHA-1", str);
    }

    public static String SHA256(String str) {
        return m33200a(Constants.SHA256, str);
    }

    /* renamed from: a */
    private static String m33200a(String str, String str2) {
        MessageDigest instance = MessageDigest.getInstance(str);
        instance.update(str2.getBytes("iso-8859-1"), 0, str2.length());
        return convertToHex(instance.digest());
    }

    public static String convertToHex(byte[] bArr) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < bArr.length; i++) {
            byte b = (bArr[i] >>> 4) & Ascii.f17944SI;
            int i2 = 0;
            while (true) {
                if (b < 0 || b > 9) {
                    stringBuffer.append((char) ((b - 10) + 97));
                } else {
                    stringBuffer.append((char) (b + 48));
                }
                b = bArr[i] & Ascii.f17944SI;
                int i3 = i2 + 1;
                if (i2 > 0) {
                    break;
                }
                i2 = i3;
            }
        }
        return stringBuffer.toString();
    }

    public static Document buildDocument(String str) {
        try {
            DocumentBuilderFactory newInstance = DocumentBuilderFactory.newInstance();
            return newInstance.newDocumentBuilder().parse(new ByteArrayInputStream(str.getBytes("UTF-8")));
        } catch (Exception e) {
            TapjoyLog.m33196e("TapjoyUtil", "buildDocument exception: " + e.toString());
            return null;
        }
    }

    public static String getNodeTrimValue(NodeList nodeList) {
        Element element = (Element) nodeList.item(0);
        if (element != null) {
            NodeList childNodes = element.getChildNodes();
            int length = childNodes.getLength();
            String str = "";
            for (int i = 0; i < length; i++) {
                Node item = childNodes.item(i);
                if (item != null) {
                    str = str + item.getNodeValue();
                }
            }
            if (str != null && !str.equals("")) {
                return str.trim();
            }
        }
        return null;
    }

    public static void deleteFileOrDirectory(File file) {
        File[] listFiles;
        if (file != null) {
            if (file.isDirectory() && (listFiles = file.listFiles()) != null && listFiles.length > 0) {
                for (File deleteFileOrDirectory : listFiles) {
                    deleteFileOrDirectory(deleteFileOrDirectory);
                }
            }
            TapjoyLog.m33194d("TapjoyUtil", "****************************************");
            TapjoyLog.m33194d("TapjoyUtil", "deleteFileOrDirectory: " + file.getAbsolutePath());
            TapjoyLog.m33194d("TapjoyUtil", "****************************************");
            file.delete();
        }
    }

    public static long fileOrDirectorySize(File file) {
        long j;
        long j2 = 0;
        for (File file2 : file.listFiles()) {
            if (file2.isFile()) {
                j = file2.length();
            } else {
                j = fileOrDirectorySize(file2);
            }
            j2 += j;
        }
        return j2;
    }

    public static void writeFileToDevice(BufferedInputStream bufferedInputStream, OutputStream outputStream) {
        byte[] bArr = new byte[1024];
        while (true) {
            int read = bufferedInputStream.read(bArr);
            if (read != -1) {
                outputStream.write(bArr, 0, read);
            } else {
                return;
            }
        }
    }

    public static Bitmap createBitmapFromView(View view) {
        Bitmap bitmap = null;
        if (view == null || view.getLayoutParams().width <= 0 || view.getLayoutParams().height <= 0) {
            return null;
        }
        try {
            bitmap = Bitmap.createBitmap(view.getLayoutParams().width, view.getLayoutParams().height, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmap);
            view.layout(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            view.draw(canvas);
            return bitmap;
        } catch (Exception e) {
            TapjoyLog.m33194d("TapjoyUtil", "error creating bitmap: " + e.toString());
            return bitmap;
        }
    }

    public static View scaleDisplayAd(View view, int i) {
        int i2 = view.getLayoutParams().width;
        int i3 = view.getLayoutParams().height;
        TapjoyLog.m33194d("TapjoyUtil", "wxh: " + i2 + "x" + i3);
        if (i2 > i) {
            int intValue = Double.valueOf((((double) i) / ((double) i2)) * 100.0d).intValue();
            WebView webView = (WebView) view;
            webView.getSettings().setSupportZoom(true);
            webView.setPadding(0, 0, 0, 0);
            webView.setVerticalScrollBarEnabled(false);
            webView.setHorizontalScrollBarEnabled(false);
            webView.setInitialScale(intValue);
            view.setLayoutParams(new ViewGroup.LayoutParams(i, (i3 * i) / i2));
        }
        return view;
    }

    public static void safePut(Map<String, String> map, String str, String str2, boolean z) {
        if (str != null && str.length() > 0 && str2 != null && str2.length() > 0) {
            if (z) {
                map.put(Uri.encode(str), Uri.encode(str2));
            } else {
                map.put(str, str2);
            }
        }
    }

    public static void safePut(Map<String, String> map, String str, Number number) {
        if (str != null && str.length() > 0 && number != null) {
            map.put(str, number.toString());
        }
    }

    public static String convertURLParams(Map<String, String> map, boolean z) {
        String str = "";
        for (Map.Entry next : map.entrySet()) {
            if (str.length() > 0) {
                str = str + "&";
            }
            if (z) {
                str = str + Uri.encode((String) next.getKey()) + "=" + Uri.encode((String) next.getValue());
            } else {
                str = str + ((String) next.getKey()) + "=" + ((String) next.getValue());
            }
        }
        return str;
    }

    public static Map<String, String> convertURLParams(String str, boolean z) {
        HashMap hashMap = new HashMap();
        int i = 0;
        boolean z2 = false;
        String str2 = "";
        String str3 = str2;
        while (i < str.length() && i != -1) {
            char charAt = str.charAt(i);
            if (z2) {
                if (z2) {
                    if (charAt == '&') {
                        if (z) {
                            str2 = Uri.decode(str2);
                        }
                        hashMap.put(str3, str2);
                        z2 = false;
                    } else {
                        str2 = str2 + charAt;
                    }
                }
                i++;
            } else if (charAt == '=') {
                if (z) {
                    str2 = Uri.decode(str2);
                }
                str3 = str2;
                z2 = true;
            } else {
                str2 = str2 + charAt;
                i++;
            }
            str2 = "";
            i++;
        }
        if (z2 && str2.length() > 0) {
            if (z) {
                str2 = Uri.decode(str2);
            }
            hashMap.put(str3, str2);
        }
        return hashMap;
    }

    public static String getRedirectDomain(String str) {
        return str != null ? str.substring(str.indexOf("//") + 2, str.lastIndexOf("/")) : "";
    }

    public static String determineMimeType(String str) {
        if (str.endsWith(".")) {
            str = str.substring(0, str.length() - 1);
        }
        String substring = str.lastIndexOf(46) != -1 ? str.substring(str.lastIndexOf(46) + 1) : "";
        if (substring.equals("css")) {
            return "text/css";
        }
        if (substring.equals("js")) {
            return "text/javascript";
        }
        return substring.equals(TJAdUnitConstants.String.HTML) ? "text/html" : "application/octet-stream";
    }

    public static Map<String, String> jsonToStringMap(JSONObject jSONObject) {
        return jSONObject != JSONObject.NULL ? toStringMap(jSONObject) : new HashMap();
    }

    public static Map<String, String> toStringMap(JSONObject jSONObject) {
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            hashMap.put(next, jSONObject.get(next).toString());
        }
        return hashMap;
    }

    public static void runOnMainThread(Runnable runnable) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            runnable.run();
        } else {
            new Handler(Looper.getMainLooper()).post(runnable);
        }
    }

    public static String getFileContents(File file) {
        FileInputStream fileInputStream = new FileInputStream(file);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream));
        StringBuilder sb = new StringBuilder();
        boolean z = false;
        while (!z) {
            String readLine = bufferedReader.readLine();
            boolean z2 = readLine == null;
            if (readLine != null) {
                sb.append(readLine);
            }
            z = z2;
        }
        bufferedReader.close();
        fileInputStream.close();
        return sb.toString();
    }

    public static int generateViewId() {
        int i;
        int i2;
        do {
            i = f27646a.get();
            i2 = i + 1;
            if (i2 > 16777215) {
                i2 = 1;
            }
        } while (!f27646a.compareAndSet(i, i2));
        return i;
    }

    public static Float getVolume(Context context) {
        if (context == null) {
            return null;
        }
        try {
            AudioManager audioManager = (AudioManager) context.getSystemService("audio");
            return Float.valueOf(new BigDecimal((double) (((float) audioManager.getStreamVolume(3)) / ((float) audioManager.getStreamMaxVolume(3)))).setScale(2, 4).floatValue());
        } catch (Exception unused) {
            TapjoyLog.m33196e("TapjoyUtil", "Unable to fetch volume");
            return null;
        }
    }

    public static String getTheme(Context context) {
        return ((UiModeManager) context.getSystemService("uimode")).getNightMode() == 2 ? TapjoyConstants.TJC_THEME_DARK : TapjoyConstants.TJC_THEME_LIGHT;
    }

    public static Float getScreenBrightness(Context context) {
        try {
            return Float.valueOf(new BigDecimal((double) (((float) Settings.System.getInt(context.getContentResolver(), "screen_brightness")) / 255.0f)).setScale(2, 4).floatValue());
        } catch (Settings.SettingNotFoundException e) {
            TapjoyLog.m33196e("TapjoyUtil", e.getLocalizedMessage());
            return null;
        }
    }

    public static Long getTotalDiskSpace() {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        if (Build.VERSION.SDK_INT >= 18) {
            return Long.valueOf(statFs.getTotalBytes() / 1000000);
        }
        return Long.valueOf((((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize())) / 1000000);
    }

    public static Long getAvailableDiskSpace() {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        if (Build.VERSION.SDK_INT >= 18) {
            return Long.valueOf(statFs.getFreeBytes() / 1000000);
        }
        return Long.valueOf((((long) statFs.getAvailableBlocks()) * ((long) statFs.getBlockSize())) / 1000000);
    }
}

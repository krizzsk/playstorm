package com.amazon.device.ads;

import com.amazon.aps.shared.APSAnalytics;
import com.amazon.aps.shared.analytics.APSEventSeverity;
import com.amazon.aps.shared.analytics.APSEventType;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Date;

class WebResourceService implements Runnable {
    private static final String LOG_TAG = WebResourceService.class.getSimpleName();
    private static final long REFRESH_INTERVAL = 86400000;
    private static final String WEB_DIR = "/mdtb_web/";
    private static boolean inProgress = false;
    private static WebResourceService theService;

    WebResourceService() {
    }

    public static void init() {
        try {
            if (!inProgress) {
                WebResourceService instance = getInstance();
                Long webResoucesLastPing = DtbSharedPreferences.getInstance().getWebResoucesLastPing();
                if (webResoucesLastPing == null || new Date().getTime() - webResoucesLastPing.longValue() > REFRESH_INTERVAL) {
                    inProgress = true;
                    DtbThreadService.getInstance().execute(instance);
                }
            }
        } catch (RuntimeException e) {
            DtbLog.error(LOG_TAG, "Fail to execute init method");
            APSAnalytics.logEvent(APSEventSeverity.ERROR, APSEventType.EXCEPTION, "Fail to execute init method", e);
        }
    }

    static WebResourceService getInstance() {
        if (theService == null) {
            theService = new WebResourceService();
        }
        return theService;
    }

    public void run() {
        try {
            createWebDirIfNeeded();
            String[] cDNResources = WebResourceOptions.getCDNResources();
            int length = cDNResources.length;
            int i = 0;
            boolean z = true;
            while (i < length) {
                String str = cDNResources[i];
                try {
                    DtbHttpClient dtbHttpClient = new DtbHttpClient(WebResourceOptions.getCDNHost(str) + str);
                    dtbHttpClient.setUseSecure(DtbDebugProperties.getIsSecure(true));
                    dtbHttpClient.executeGET(60000);
                    if (dtbHttpClient.getResponseCode() == 200) {
                        String response = dtbHttpClient.getResponse();
                        File filesDir = AdRegistration.getContext().getFilesDir();
                        File createTempFile = File.createTempFile("dtb-temp", "js", filesDir);
                        FileWriter fileWriter = new FileWriter(createTempFile);
                        fileWriter.write(response);
                        fileWriter.close();
                        renameTo(createTempFile, new File(filesDir.getAbsolutePath() + WEB_DIR + str));
                        i++;
                    } else {
                        throw new RuntimeException("resource " + str + " not available");
                    }
                } catch (Exception e) {
                    DtbLog.error("Error registering device for ads:" + e.toString());
                    z = false;
                }
            }
            if (z) {
                DtbSharedPreferences.getInstance().saveWebResoucesLastPing(new Date().getTime());
            }
            inProgress = false;
        } catch (RuntimeException e2) {
            DtbLog.error(LOG_TAG, "Fail to execute init method");
            APSAnalytics.logEvent(APSEventSeverity.ERROR, APSEventType.EXCEPTION, "Fail to execute init method", e2);
        }
    }

    private void createWebDirIfNeeded() {
        File filesDir = AdRegistration.getContext().getFilesDir();
        File file = new File(filesDir.getAbsolutePath() + WEB_DIR);
        if (!file.isDirectory() && !file.exists()) {
            file.mkdir();
        }
    }

    /* access modifiers changed from: package-private */
    public void deleteWebDirContent() {
        File filesDir = AdRegistration.getContext().getFilesDir();
        File file = new File(filesDir.getAbsolutePath() + WEB_DIR);
        if (file.exists() && file.isDirectory()) {
            for (File delete : file.listFiles()) {
                delete.delete();
            }
        }
    }

    private synchronized void renameTo(File file, File file2) {
        file.renameTo(file2);
    }

    /* access modifiers changed from: package-private */
    public synchronized String loadFile(String str) throws IOException {
        File filesDir = AdRegistration.getContext().getFilesDir();
        File file = new File(filesDir.getAbsolutePath() + WEB_DIR + str + ".js");
        if (!file.exists()) {
            return null;
        }
        FileInputStream fileInputStream = new FileInputStream(file);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream));
        StringBuilder sb = new StringBuilder();
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine == null) {
                bufferedReader.close();
                fileInputStream.close();
                return sb.toString();
            }
            sb.append(readLine.trim());
            sb.append("\n");
        }
    }
}

package com.smaato.sdk.core.util;

import android.content.Context;
import com.smaato.sdk.core.log.LogDomain;
import com.smaato.sdk.core.log.Logger;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public final class AssetUtils {
    private AssetUtils() {
    }

    public static String getFileFromAssets(Context context, Logger logger, String str) {
        BufferedReader openAssetBuffered;
        Objects.requireNonNull(context);
        Objects.requireNonNull(str);
        StringBuilder sb = new StringBuilder();
        try {
            openAssetBuffered = openAssetBuffered(context, str);
            while (true) {
                String readLine = openAssetBuffered.readLine();
                if (readLine == null) {
                    break;
                }
                sb.append(readLine);
                sb.append("\n");
            }
            openAssetBuffered.close();
        } catch (Exception e) {
            if (logger != null) {
                logger.error(LogDomain.CORE, String.format("Could not read '%s' file from assets", new Object[]{str}), e);
            }
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        return sb.toString();
        throw th;
    }

    private static BufferedReader openAssetBuffered(Context context, String str) throws IOException {
        if (context.getAssets() != null) {
            return new BufferedReader(new InputStreamReader(context.getAssets().open(str), "UTF-8"));
        }
        return new BufferedReader(new InputStreamReader(new InputStream() {
            public int read() throws IOException {
                return 0;
            }
        }));
    }
}

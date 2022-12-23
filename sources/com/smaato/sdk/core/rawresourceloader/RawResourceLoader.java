package com.smaato.sdk.core.rawresourceloader;

import android.app.Application;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RawResourceLoader {
    private final Application application;

    public RawResourceLoader(Application application2) {
        this.application = application2;
    }

    public String readRawTextFile(int i) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(this.application.getResources().openRawResource(i)));
        StringBuilder sb = new StringBuilder();
        while (true) {
            try {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    return sb.toString();
                }
                sb.append(readLine);
                sb.append(10);
            } catch (IOException unused) {
                return "";
            }
        }
    }
}

package com.saypromo.core;

import android.util.Pair;
import com.saypromo.core.properties.SdkProperties;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class FileSystemService {
    static FileSystemService instance;

    public static FileSystemService getInstance() {
        if (instance == null) {
            instance = new FileSystemService();
        }
        return instance;
    }

    public Pair<String, Integer> SaveDataToFile(String str, InputStream inputStream) {
        File file = new File(str);
        try {
            if (!file.exists()) {
                file.createNewFile();
            }
            FileOutputStream fileOutputStream = new FileOutputStream(file, false);
            byte[] bArr = new byte[8192];
            int i = 0;
            while (true) {
                int read = inputStream.read(bArr);
                if (read != -1) {
                    i += read;
                    fileOutputStream.write(bArr, 0, read);
                } else {
                    fileOutputStream.flush();
                    fileOutputStream.close();
                    return new Pair<>((Object) null, Integer.valueOf(i / 1000));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
            return new Pair<>(e.getMessage(), -1);
        }
    }

    public String getFilePath(String str) {
        return new File(fileIdToFilename(str)).exists() ? fileIdToFilename(str) : "not_found";
    }

    public String fileIdToFilename(String str) {
        return SdkProperties.getCacheDirectory() + "/" + SdkProperties.getCacheFilePrefix() + str;
    }
}

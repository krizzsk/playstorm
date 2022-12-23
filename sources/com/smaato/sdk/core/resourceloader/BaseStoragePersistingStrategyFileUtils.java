package com.smaato.sdk.core.resourceloader;

import android.content.Context;
import com.smaato.sdk.core.log.LogDomain;
import com.smaato.sdk.core.log.Logger;
import com.smaato.sdk.core.resourceloader.PersistingStrategy;
import com.smaato.sdk.core.util.Objects;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BaseStoragePersistingStrategyFileUtils {
    private final Context context;
    protected final Logger logger;

    public BaseStoragePersistingStrategyFileUtils(Logger logger2, Context context2) {
        this.logger = (Logger) Objects.requireNonNull(logger2);
        this.context = (Context) Objects.requireNonNull(context2);
    }

    public File getResourceFileFromStorage(String str, int i, String str2) {
        Objects.requireNonNull(str);
        Objects.requireNonNull(str2);
        for (File next : listResourceFiles(str, i)) {
            String name = next.getName();
            int indexOf = name.indexOf(".");
            if (indexOf == -1) {
                this.logger.info(LogDomain.RESOURCE_LOADER, "Skipping unknown file: %s", next);
            } else if (str2.equals(name.substring(0, indexOf))) {
                return next;
            }
        }
        return null;
    }

    public File getTemporaryResourceFile(File file, String str) {
        Objects.requireNonNull(file);
        Objects.requireNonNull(str);
        return new File(file, str + ".tmp");
    }

    public String getStorageResourceFullName(String str, long j) {
        Objects.requireNonNull(str);
        return str + "." + j;
    }

    public void clearExpiredResources(String str, int i) {
        Objects.requireNonNull(str);
        for (File next : listResourceFiles(str, i)) {
            String name = next.getName();
            if (System.currentTimeMillis() > Long.valueOf(name.substring(name.indexOf(".") + 1)).longValue()) {
                deleteFile(next, "expired resource file");
            }
        }
    }

    public void deleteOldCaches(String str, int i) {
        Objects.requireNonNull(str);
        File diskCachesParentDirectory = getDiskCachesParentDirectory(str);
        ArrayList arrayList = new ArrayList();
        for (File file : diskCachesParentDirectory.listFiles()) {
            if (file.isDirectory()) {
                try {
                    if (i > Integer.valueOf(file.getName()).intValue()) {
                        arrayList.add(file);
                    }
                } catch (NumberFormatException unused) {
                    arrayList.add(file);
                }
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            File file2 = (File) it.next();
            for (File deleteFile : file2.listFiles()) {
                deleteFile(deleteFile, "old resource file");
            }
            deleteFile(file2, "old resource cache directory");
        }
    }

    public List<File> listResourceFiles(String str, int i) {
        Objects.requireNonNull(str);
        ArrayList arrayList = new ArrayList();
        for (File file : getCurrentDiskCacheDirectory(str, i).listFiles()) {
            if (!file.isDirectory() && !file.getName().endsWith(".tmp")) {
                arrayList.add(file);
            }
        }
        return arrayList;
    }

    public void deleteFile(File file, String str) {
        Objects.requireNonNull(file);
        Objects.requireNonNull(str);
        if (file.delete()) {
            this.logger.debug(LogDomain.RESOURCE_LOADER, "%s successfully deleted. Filename: %s", str, file.getName());
            return;
        }
        this.logger.error(LogDomain.RESOURCE_LOADER, "Cannot delete %S. Filename: %s", str, file.getName());
    }

    public void createDirectories(File file) throws PersistingStrategyException {
        Objects.requireNonNull(file);
        if (!file.exists() && !file.mkdirs()) {
            PersistingStrategy.Error error = PersistingStrategy.Error.IO_ERROR;
            throw new PersistingStrategyException(error, new IOException("cannot create directories for file: " + file.getAbsolutePath()));
        }
    }

    public File getCurrentDiskCacheDirectory(String str, int i) {
        Objects.requireNonNull(str);
        return new File(getDiskCachesParentDirectory(str), String.valueOf(i));
    }

    public void deleteTemporaryResourceFileArtifacts(String str, int i) {
        Objects.requireNonNull(str);
        for (File deleteFile : listTemporaryResourceFiles(str, i)) {
            deleteFile(deleteFile, "temporary resource file");
        }
    }

    private List<File> listTemporaryResourceFiles(String str, int i) {
        Objects.requireNonNull(str);
        ArrayList arrayList = new ArrayList();
        for (File file : getCurrentDiskCacheDirectory(str, i).listFiles()) {
            if (!file.isDirectory() && file.getName().endsWith(".tmp")) {
                arrayList.add(file);
            }
        }
        return arrayList;
    }

    private File getDiskCachesParentDirectory(String str) {
        Objects.requireNonNull(str);
        return new File(getCacheRootDirectory(), str);
    }

    private File getCacheRootDirectory() {
        return new File(this.context.getCacheDir(), "com.smaato.sdk.cache");
    }
}

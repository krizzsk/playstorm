package com.smaato.sdk.video.resourceloader;

import android.net.Uri;
import com.smaato.sdk.core.log.Logger;
import com.smaato.sdk.core.resourceloader.BaseStoragePersistingStrategy;
import com.smaato.sdk.core.resourceloader.BaseStoragePersistingStrategyFileUtils;
import com.smaato.sdk.core.resourceloader.Md5Digester;
import com.smaato.sdk.core.util.Objects;
import java.io.File;

public final class VideoPersistingStrategy extends BaseStoragePersistingStrategy<Uri> {
    public VideoPersistingStrategy(Logger logger, String str, BaseStoragePersistingStrategyFileUtils baseStoragePersistingStrategyFileUtils, Md5Digester md5Digester) {
        super(logger, str, baseStoragePersistingStrategyFileUtils, md5Digester);
    }

    /* access modifiers changed from: protected */
    public Uri getResourceFromStorage(String str) {
        Objects.requireNonNull(str);
        File resourceFileFromStorage = this.fileUtils.getResourceFileFromStorage(this.descriptiveResourceName, version().intValue(), str);
        if (resourceFileFromStorage != null) {
            return Uri.fromFile(resourceFileFromStorage);
        }
        return null;
    }

    /* JADX WARNING: type inference failed for: r9v11, types: [java.io.OutputStream, java.io.Closeable, java.io.BufferedOutputStream] */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00ae A[Catch:{ all -> 0x00b9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00b1 A[Catch:{ all -> 0x00b9 }] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.net.Uri putResourceToStorage(java.io.File r8, java.io.InputStream r9, java.lang.String r10, long r11) throws com.smaato.sdk.core.resourceloader.PersistingStrategyException {
        /*
            r7 = this;
            java.lang.String r0 = "temporary resource file"
            com.smaato.sdk.core.util.Objects.requireNonNull(r8)
            com.smaato.sdk.core.util.Objects.requireNonNull(r9)
            com.smaato.sdk.core.util.Objects.requireNonNull(r10)
            long r1 = java.lang.System.currentTimeMillis()
            int r1 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r1 > 0) goto L_0x00c9
            com.smaato.sdk.core.resourceloader.BaseStoragePersistingStrategyFileUtils r1 = r7.fileUtils
            java.io.File r1 = r1.getTemporaryResourceFile(r8, r10)
            java.io.File r2 = new java.io.File
            r2.<init>(r8, r10)
            r8 = 0
            r10 = 0
            java.io.BufferedInputStream r3 = new java.io.BufferedInputStream     // Catch:{ Exception -> 0x0094, all -> 0x0091 }
            r4 = 16384(0x4000, float:2.2959E-41)
            r3.<init>(r9, r4)     // Catch:{ Exception -> 0x0094, all -> 0x0091 }
            java.io.BufferedOutputStream r9 = new java.io.BufferedOutputStream     // Catch:{ Exception -> 0x008c, all -> 0x008a }
            java.io.FileOutputStream r5 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x008c, all -> 0x008a }
            r5.<init>(r1)     // Catch:{ Exception -> 0x008c, all -> 0x008a }
            r9.<init>(r5, r4)     // Catch:{ Exception -> 0x008c, all -> 0x008a }
            com.smaato.sdk.core.util.IOUtils.copy(r3, r9, r4)     // Catch:{ Exception -> 0x0088, all -> 0x0086 }
            r3.close()     // Catch:{ Exception -> 0x0088, all -> 0x0086 }
            r9.flush()     // Catch:{ Exception -> 0x0088, all -> 0x0086 }
            r9.close()     // Catch:{ Exception -> 0x0088, all -> 0x0086 }
            boolean r10 = r1.renameTo(r2)     // Catch:{ Exception -> 0x0088, all -> 0x0086 }
            if (r10 == 0) goto L_0x006a
            long r4 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0088, all -> 0x0086 }
            int r10 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
            if (r10 > 0) goto L_0x005b
            android.net.Uri r8 = android.net.Uri.fromFile(r2)     // Catch:{ Exception -> 0x0088, all -> 0x0086 }
            com.smaato.sdk.core.util.IOUtils.closeSilently(r3)
            com.smaato.sdk.core.util.IOUtils.closeSilently(r9)
            com.smaato.sdk.core.resourceloader.BaseStoragePersistingStrategyFileUtils r9 = r7.fileUtils
            r9.deleteFile(r1, r0)
            return r8
        L_0x005b:
            com.smaato.sdk.core.resourceloader.PersistingStrategyException r10 = new com.smaato.sdk.core.resourceloader.PersistingStrategyException     // Catch:{ Exception -> 0x0088, all -> 0x0086 }
            com.smaato.sdk.core.resourceloader.PersistingStrategy$Error r11 = com.smaato.sdk.core.resourceloader.PersistingStrategy.Error.RESOURCE_EXPIRED     // Catch:{ Exception -> 0x0088, all -> 0x0086 }
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException     // Catch:{ Exception -> 0x0088, all -> 0x0086 }
            java.lang.String r4 = "Resource downloading took too much time. Resource expired and is being deleted"
            r12.<init>(r4)     // Catch:{ Exception -> 0x0088, all -> 0x0086 }
            r10.<init>(r11, r12)     // Catch:{ Exception -> 0x0088, all -> 0x0086 }
            throw r10     // Catch:{ Exception -> 0x0088, all -> 0x0086 }
        L_0x006a:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException     // Catch:{ Exception -> 0x0088, all -> 0x0086 }
            java.lang.String r11 = "Cannot rename temporary file. Temporary filename:%s, destination filename:%s"
            r12 = 2
            java.lang.Object[] r12 = new java.lang.Object[r12]     // Catch:{ Exception -> 0x0088, all -> 0x0086 }
            java.lang.String r4 = r1.getName()     // Catch:{ Exception -> 0x0088, all -> 0x0086 }
            r12[r8] = r4     // Catch:{ Exception -> 0x0088, all -> 0x0086 }
            r4 = 1
            java.lang.String r5 = r2.getName()     // Catch:{ Exception -> 0x0088, all -> 0x0086 }
            r12[r4] = r5     // Catch:{ Exception -> 0x0088, all -> 0x0086 }
            java.lang.String r11 = java.lang.String.format(r11, r12)     // Catch:{ Exception -> 0x0088, all -> 0x0086 }
            r10.<init>(r11)     // Catch:{ Exception -> 0x0088, all -> 0x0086 }
            throw r10     // Catch:{ Exception -> 0x0088, all -> 0x0086 }
        L_0x0086:
            r8 = move-exception
            goto L_0x00bc
        L_0x0088:
            r10 = move-exception
            goto L_0x0098
        L_0x008a:
            r8 = move-exception
            goto L_0x00bd
        L_0x008c:
            r9 = move-exception
            r6 = r10
            r10 = r9
            r9 = r6
            goto L_0x0098
        L_0x0091:
            r8 = move-exception
            r9 = r10
            goto L_0x00bb
        L_0x0094:
            r9 = move-exception
            r3 = r10
            r10 = r9
            r9 = r3
        L_0x0098:
            com.smaato.sdk.core.log.Logger r11 = r7.logger     // Catch:{ all -> 0x00b9 }
            com.smaato.sdk.core.log.LogDomain r12 = com.smaato.sdk.core.log.LogDomain.RESOURCE_LOADER     // Catch:{ all -> 0x00b9 }
            java.lang.String r4 = "Resource persisting failed"
            java.lang.Object[] r8 = new java.lang.Object[r8]     // Catch:{ all -> 0x00b9 }
            r11.error(r12, r10, r4, r8)     // Catch:{ all -> 0x00b9 }
            com.smaato.sdk.core.resourceloader.BaseStoragePersistingStrategyFileUtils r8 = r7.fileUtils     // Catch:{ all -> 0x00b9 }
            java.lang.String r11 = "resource file"
            r8.deleteFile(r2, r11)     // Catch:{ all -> 0x00b9 }
            boolean r8 = r10 instanceof com.smaato.sdk.core.resourceloader.PersistingStrategyException     // Catch:{ all -> 0x00b9 }
            if (r8 == 0) goto L_0x00b1
            com.smaato.sdk.core.resourceloader.PersistingStrategyException r10 = (com.smaato.sdk.core.resourceloader.PersistingStrategyException) r10     // Catch:{ all -> 0x00b9 }
            throw r10     // Catch:{ all -> 0x00b9 }
        L_0x00b1:
            com.smaato.sdk.core.resourceloader.PersistingStrategyException r8 = new com.smaato.sdk.core.resourceloader.PersistingStrategyException     // Catch:{ all -> 0x00b9 }
            com.smaato.sdk.core.resourceloader.PersistingStrategy$Error r11 = com.smaato.sdk.core.resourceloader.PersistingStrategy.Error.IO_ERROR     // Catch:{ all -> 0x00b9 }
            r8.<init>(r11, r10)     // Catch:{ all -> 0x00b9 }
            throw r8     // Catch:{ all -> 0x00b9 }
        L_0x00b9:
            r8 = move-exception
            r10 = r3
        L_0x00bb:
            r3 = r10
        L_0x00bc:
            r10 = r9
        L_0x00bd:
            com.smaato.sdk.core.util.IOUtils.closeSilently(r3)
            com.smaato.sdk.core.util.IOUtils.closeSilently(r10)
            com.smaato.sdk.core.resourceloader.BaseStoragePersistingStrategyFileUtils r9 = r7.fileUtils
            r9.deleteFile(r1, r0)
            throw r8
        L_0x00c9:
            com.smaato.sdk.core.resourceloader.PersistingStrategyException r8 = new com.smaato.sdk.core.resourceloader.PersistingStrategyException
            com.smaato.sdk.core.resourceloader.PersistingStrategy$Error r9 = com.smaato.sdk.core.resourceloader.PersistingStrategy.Error.RESOURCE_EXPIRED
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "Resource already expired"
            r10.<init>(r11)
            r8.<init>(r9, r10)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.smaato.sdk.video.resourceloader.VideoPersistingStrategy.putResourceToStorage(java.io.File, java.io.InputStream, java.lang.String, long):android.net.Uri");
    }

    /* access modifiers changed from: protected */
    public Integer version() {
        return 1;
    }
}

package com.smaato.sdk.core.resourceloader;

import com.smaato.sdk.core.log.LogDomain;
import com.smaato.sdk.core.log.Logger;
import com.smaato.sdk.core.resourceloader.PersistingStrategy;
import com.smaato.sdk.core.util.Objects;
import java.io.File;
import java.io.InputStream;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public abstract class BaseStoragePersistingStrategy<OutputResourceType> implements PersistingStrategy<OutputResourceType> {
    protected final String descriptiveResourceName;
    protected final BaseStoragePersistingStrategyFileUtils fileUtils;
    private boolean initialized;
    protected final Logger logger;
    private final Md5Digester md5Digester;
    private final Map<String, ReadWriteLock> writeLocksMap = new HashMap();

    /* access modifiers changed from: protected */
    public abstract OutputResourceType getResourceFromStorage(String str) throws PersistingStrategyException;

    /* access modifiers changed from: protected */
    public abstract OutputResourceType putResourceToStorage(File file, InputStream inputStream, String str, long j) throws PersistingStrategyException;

    /* access modifiers changed from: protected */
    public abstract Integer version();

    public BaseStoragePersistingStrategy(Logger logger2, String str, BaseStoragePersistingStrategyFileUtils baseStoragePersistingStrategyFileUtils, Md5Digester md5Digester2) {
        this.logger = (Logger) Objects.requireNonNull(logger2);
        this.descriptiveResourceName = (String) Objects.requireNonNull(str);
        this.fileUtils = (BaseStoragePersistingStrategyFileUtils) Objects.requireNonNull(baseStoragePersistingStrategyFileUtils);
        this.md5Digester = (Md5Digester) Objects.requireNonNull(md5Digester2);
    }

    public final OutputResourceType get(String str) throws PersistingStrategyException {
        Objects.requireNonNull(str);
        Lock readLock = getReadWriteLock(str).readLock();
        readLock.lock();
        try {
            initIfNeeded();
            this.fileUtils.clearExpiredResources(this.descriptiveResourceName, version().intValue());
            String md5Hex = this.md5Digester.md5Hex(str);
            this.fileUtils.createDirectories(this.fileUtils.getCurrentDiskCacheDirectory(this.descriptiveResourceName, version().intValue()));
            OutputResourceType resourceFromStorage = getResourceFromStorage(md5Hex);
            if (resourceFromStorage != null) {
                this.logger.debug(LogDomain.RESOURCE_LOADER, "Resource with name %s found in cache", str);
            } else {
                this.logger.debug(LogDomain.RESOURCE_LOADER, "Resource with name %s NOT found in cache", str);
            }
            readLock.unlock();
            return resourceFromStorage;
        } catch (NoSuchAlgorithmException e) {
            this.logger.error(LogDomain.RESOURCE_LOADER, e, "Cannot generate a Md5 hash for a resource name", new Object[0]);
            throw new PersistingStrategyException(PersistingStrategy.Error.GENERIC, e);
        } catch (Throwable th) {
            readLock.unlock();
            throw th;
        }
    }

    public final OutputResourceType put(InputStream inputStream, String str, long j) throws PersistingStrategyException {
        Objects.requireNonNull(inputStream);
        Objects.requireNonNull(str);
        Lock writeLock = getReadWriteLock(str).writeLock();
        writeLock.lock();
        try {
            initIfNeeded();
            this.fileUtils.clearExpiredResources(this.descriptiveResourceName, version().intValue());
            String storageResourceFullName = this.fileUtils.getStorageResourceFullName(this.md5Digester.md5Hex(str), j);
            File currentDiskCacheDirectory = this.fileUtils.getCurrentDiskCacheDirectory(this.descriptiveResourceName, version().intValue());
            this.fileUtils.createDirectories(currentDiskCacheDirectory);
            OutputResourceType putResourceToStorage = putResourceToStorage(currentDiskCacheDirectory, inputStream, storageResourceFullName, j);
            writeLock.unlock();
            return putResourceToStorage;
        } catch (NoSuchAlgorithmException e) {
            this.logger.error(LogDomain.RESOURCE_LOADER, e, "Cannot generate a Md5 hash for a resource name", new Object[0]);
            throw new PersistingStrategyException(PersistingStrategy.Error.GENERIC, e);
        } catch (Throwable th) {
            writeLock.unlock();
            throw th;
        }
    }

    private synchronized ReadWriteLock getReadWriteLock(String str) {
        ReadWriteLock readWriteLock;
        readWriteLock = this.writeLocksMap.get(str);
        if (readWriteLock == null) {
            readWriteLock = new ReentrantReadWriteLock();
            this.writeLocksMap.put(str, readWriteLock);
        }
        return readWriteLock;
    }

    private void initIfNeeded() throws PersistingStrategyException {
        if (!this.initialized) {
            this.fileUtils.createDirectories(this.fileUtils.getCurrentDiskCacheDirectory(this.descriptiveResourceName, version().intValue()));
            this.fileUtils.deleteOldCaches(this.descriptiveResourceName, version().intValue());
            this.fileUtils.deleteTemporaryResourceFileArtifacts(this.descriptiveResourceName, version().intValue());
            this.initialized = true;
        }
    }
}

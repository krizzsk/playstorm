package com.mbridge.msdk.foundation.tools;

import android.os.Build;
import com.google.common.primitives.SignedBytes;
import com.mbridge.msdk.foundation.tools.C8562b;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import kotlin.UShort;

public class FastKV {
    static final int ASYNC_BLOCKING = 1;
    private static final String A_SUFFIX = ".kva";
    private static final int BASE_GC_BYTES_THRESHOLD = 4096;
    private static final int BASE_GC_KEYS_THRESHOLD = 80;
    private static final String BOTH_FILES_ERROR = "both files error";
    private static final String B_SUFFIX = ".kvb";
    private static final String C_SUFFIX = ".kvc";
    private static final int DATA_SIZE_LIMIT = 536870912;
    private static final int DATA_START = 12;
    private static final int DOUBLE_LIMIT;
    private static final byte[] EMPTY_ARRAY = new byte[0];
    static final String GC_FINISH = "gc finish";
    private static final int INTERNAL_LIMIT = 2048;
    private static final String MAP_FAILED = "map failed";
    static final int NON_BLOCKING = 0;
    private static final String OPEN_FILE_FAILED = "open file failed";
    private static final int PAGE_SIZE;
    private static final String PARSE_DATA_FAILED = "parse dara failed";
    static final int SYNC_BLOCKING = 2;
    private static final String TEMP_SUFFIX = ".tmp";
    static final String TRUNCATE_FINISH = "truncate finish";
    private static final int TRUNCATE_THRESHOLD;
    private static final int[] TYPE_SIZE = {0, 1, 4, 4, 8, 8};
    private MappedByteBuffer aBuffer;
    private FileChannel aChannel;
    private boolean autoCommit;
    private MappedByteBuffer bBuffer;
    private FileChannel bChannel;
    private long checksum;
    private final Map<String, C8562b.C8564b> data = new HashMap();
    private int dataEnd;
    private final Map<String, C8549a> encoderMap;
    private final Executor executor;
    private C8579i fastBuffer;
    private int invalidBytes;
    private final ArrayList<C8551c> invalids;
    private final C8550b logger = C8580j.f20734a;
    private final String name;
    private final String path;
    private int removeStart;
    private boolean sizeChanged;
    private boolean startLoading;
    private String tempExternalName;
    private int updateSize;
    private int updateStart;
    private int writingMode;

    /* renamed from: com.mbridge.msdk.foundation.tools.FastKV$a */
    public interface C8549a<T> {
        /* renamed from: a */
        T mo57741a(byte[] bArr, int i, int i2);

        /* renamed from: a */
        String mo57742a();

        /* renamed from: a */
        byte[] mo57743a(T t);
    }

    /* renamed from: com.mbridge.msdk.foundation.tools.FastKV$b */
    public interface C8550b {
        /* renamed from: a */
        void mo57744a(String str, Exception exc);

        /* renamed from: a */
        void mo57745a(String str, String str2);

        /* renamed from: b */
        void mo57746b(String str, Exception exc);
    }

    private long shiftCheckSum(long j, int i) {
        int i2 = (i & 7) << 3;
        return (j >>> (64 - i2)) | (j << i2);
    }

    static {
        int b = C8558ae.m24747b();
        PAGE_SIZE = b;
        int max = Math.max(b << 1, 16384);
        DOUBLE_LIMIT = max;
        TRUNCATE_THRESHOLD = max << 1;
    }

    FastKV(String str, String str2, C8549a[] aVarArr, int i) {
        this.startLoading = false;
        this.invalids = new ArrayList<>();
        this.autoCommit = true;
        this.executor = new C8583l();
        this.path = str;
        this.name = str2;
        this.writingMode = i;
        HashMap hashMap = new HashMap();
        hashMap.put("StringSet", C8555ab.f20700a);
        if (aVarArr != null && aVarArr.length > 0) {
            for (C8549a aVar : aVarArr) {
                String a = aVar.mo57742a();
                if (hashMap.containsKey(a)) {
                    error("duplicate encoder tag:" + a);
                } else {
                    hashMap.put(a, aVar);
                }
            }
        }
        this.encoderMap = hashMap;
        synchronized (this.data) {
            C8580j.m24786a().execute(new Runnable() {
                public final void run() {
                    FastKV.this.loadData();
                }
            });
            while (!this.startLoading) {
                try {
                    this.data.wait();
                } catch (InterruptedException unused) {
                }
            }
        }
    }

    /* access modifiers changed from: private */
    public synchronized void loadData() {
        synchronized (this.data) {
            this.startLoading = true;
            this.data.notify();
        }
        long nanoTime = System.nanoTime();
        if (!loadFromCFile() && this.writingMode == 0) {
            loadFromABFile();
        }
        if (this.fastBuffer == null) {
            this.fastBuffer = new C8579i(PAGE_SIZE);
        }
        if (this.logger != null) {
            info("loading finish, data len:" + this.dataEnd + ", get keys:" + this.data.size() + ", use time:" + ((System.nanoTime() - nanoTime) / 1000000) + " ms");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x010a A[Catch:{ Exception -> 0x01b4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0129 A[ADDED_TO_REGION, Catch:{ Exception -> 0x01b4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0192 A[Catch:{ Exception -> 0x01b4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void loadFromABFile() {
        /*
            r21 = this;
            r1 = r21
            java.lang.String r0 = "rw"
            java.io.File r2 = new java.io.File
            java.lang.String r3 = r1.path
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = r1.name
            r4.append(r5)
            java.lang.String r5 = ".kva"
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            r2.<init>(r3, r4)
            java.io.File r3 = new java.io.File
            java.lang.String r4 = r1.path
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = r1.name
            r5.append(r6)
            java.lang.String r6 = ".kvb"
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            r3.<init>(r4, r5)
            boolean r4 = com.mbridge.msdk.foundation.tools.C8558ae.m24745a((java.io.File) r2)     // Catch:{ Exception -> 0x01b4 }
            if (r4 == 0) goto L_0x01a6
            boolean r4 = com.mbridge.msdk.foundation.tools.C8558ae.m24745a((java.io.File) r3)     // Catch:{ Exception -> 0x01b4 }
            if (r4 != 0) goto L_0x0046
            goto L_0x01a6
        L_0x0046:
            java.io.RandomAccessFile r4 = new java.io.RandomAccessFile     // Catch:{ Exception -> 0x01b4 }
            r4.<init>(r2, r0)     // Catch:{ Exception -> 0x01b4 }
            java.io.RandomAccessFile r5 = new java.io.RandomAccessFile     // Catch:{ Exception -> 0x01b4 }
            r5.<init>(r3, r0)     // Catch:{ Exception -> 0x01b4 }
            long r6 = r4.length()     // Catch:{ Exception -> 0x01b4 }
            long r8 = r5.length()     // Catch:{ Exception -> 0x01b4 }
            java.nio.channels.FileChannel r0 = r4.getChannel()     // Catch:{ Exception -> 0x01b4 }
            r1.aChannel = r0     // Catch:{ Exception -> 0x01b4 }
            java.nio.channels.FileChannel r0 = r5.getChannel()     // Catch:{ Exception -> 0x01b4 }
            r1.bChannel = r0     // Catch:{ Exception -> 0x01b4 }
            java.nio.channels.FileChannel r10 = r1.aChannel     // Catch:{ IOException -> 0x019b }
            java.nio.channels.FileChannel$MapMode r11 = java.nio.channels.FileChannel.MapMode.READ_WRITE     // Catch:{ IOException -> 0x019b }
            r12 = 0
            r4 = 0
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x0072
            r14 = r6
            goto L_0x0075
        L_0x0072:
            int r14 = PAGE_SIZE     // Catch:{ IOException -> 0x019b }
            long r14 = (long) r14     // Catch:{ IOException -> 0x019b }
        L_0x0075:
            java.nio.MappedByteBuffer r10 = r10.map(r11, r12, r14)     // Catch:{ IOException -> 0x019b }
            r1.aBuffer = r10     // Catch:{ IOException -> 0x019b }
            java.nio.ByteOrder r11 = java.nio.ByteOrder.LITTLE_ENDIAN     // Catch:{ IOException -> 0x019b }
            r10.order(r11)     // Catch:{ IOException -> 0x019b }
            java.nio.channels.FileChannel r12 = r1.bChannel     // Catch:{ IOException -> 0x019b }
            java.nio.channels.FileChannel$MapMode r13 = java.nio.channels.FileChannel.MapMode.READ_WRITE     // Catch:{ IOException -> 0x019b }
            r14 = 0
            int r4 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r4 <= 0) goto L_0x008d
            r16 = r8
            goto L_0x0092
        L_0x008d:
            int r5 = PAGE_SIZE     // Catch:{ IOException -> 0x019b }
            long r10 = (long) r5     // Catch:{ IOException -> 0x019b }
            r16 = r10
        L_0x0092:
            java.nio.MappedByteBuffer r5 = r12.map(r13, r14, r16)     // Catch:{ IOException -> 0x019b }
            r1.bBuffer = r5     // Catch:{ IOException -> 0x019b }
            java.nio.ByteOrder r10 = java.nio.ByteOrder.LITTLE_ENDIAN     // Catch:{ IOException -> 0x019b }
            r5.order(r10)     // Catch:{ IOException -> 0x019b }
            com.mbridge.msdk.foundation.tools.i r2 = new com.mbridge.msdk.foundation.tools.i     // Catch:{ Exception -> 0x01b4 }
            java.nio.MappedByteBuffer r3 = r1.aBuffer     // Catch:{ Exception -> 0x01b4 }
            int r3 = r3.capacity()     // Catch:{ Exception -> 0x01b4 }
            r2.<init>((int) r3)     // Catch:{ Exception -> 0x01b4 }
            r1.fastBuffer = r2     // Catch:{ Exception -> 0x01b4 }
            r2 = 12
            if (r0 != 0) goto L_0x00b4
            if (r4 != 0) goto L_0x00b4
            r1.dataEnd = r2     // Catch:{ Exception -> 0x01b4 }
            goto L_0x01be
        L_0x00b4:
            java.nio.MappedByteBuffer r0 = r1.aBuffer     // Catch:{ Exception -> 0x01b4 }
            int r0 = r0.getInt()     // Catch:{ Exception -> 0x01b4 }
            java.nio.MappedByteBuffer r3 = r1.aBuffer     // Catch:{ Exception -> 0x01b4 }
            long r3 = r3.getLong()     // Catch:{ Exception -> 0x01b4 }
            java.nio.MappedByteBuffer r5 = r1.bBuffer     // Catch:{ Exception -> 0x01b4 }
            int r5 = r5.getInt()     // Catch:{ Exception -> 0x01b4 }
            java.nio.MappedByteBuffer r10 = r1.bBuffer     // Catch:{ Exception -> 0x01b4 }
            long r10 = r10.getLong()     // Catch:{ Exception -> 0x01b4 }
            r12 = 1
            r13 = 12
            r15 = 0
            if (r0 < 0) goto L_0x0107
            r17 = r3
            long r2 = (long) r0     // Catch:{ Exception -> 0x01b4 }
            long r19 = r6 - r13
            int r2 = (r2 > r19 ? 1 : (r2 == r19 ? 0 : -1))
            if (r2 > 0) goto L_0x0107
            int r2 = r0 + 12
            r1.dataEnd = r2     // Catch:{ Exception -> 0x01b4 }
            java.nio.MappedByteBuffer r2 = r1.aBuffer     // Catch:{ Exception -> 0x01b4 }
            r2.rewind()     // Catch:{ Exception -> 0x01b4 }
            java.nio.MappedByteBuffer r2 = r1.aBuffer     // Catch:{ Exception -> 0x01b4 }
            com.mbridge.msdk.foundation.tools.i r3 = r1.fastBuffer     // Catch:{ Exception -> 0x01b4 }
            byte[] r3 = r3.f20731a     // Catch:{ Exception -> 0x01b4 }
            int r4 = r1.dataEnd     // Catch:{ Exception -> 0x01b4 }
            r2.get(r3, r15, r4)     // Catch:{ Exception -> 0x01b4 }
            com.mbridge.msdk.foundation.tools.i r2 = r1.fastBuffer     // Catch:{ Exception -> 0x01b4 }
            r3 = 12
            long r19 = r2.mo57759b(r3, r0)     // Catch:{ Exception -> 0x01b4 }
            int r0 = (r17 > r19 ? 1 : (r17 == r19 ? 0 : -1))
            if (r0 != 0) goto L_0x0107
            int r0 = r21.parseData()     // Catch:{ Exception -> 0x01b4 }
            if (r0 != 0) goto L_0x0107
            r2 = r17
            r1.checksum = r2     // Catch:{ Exception -> 0x01b4 }
            r0 = r12
            goto L_0x0108
        L_0x0107:
            r0 = r15
        L_0x0108:
            if (r0 == 0) goto L_0x0129
            int r0 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r0 != 0) goto L_0x0114
            boolean r0 = r21.isABFileEqual()     // Catch:{ Exception -> 0x01b4 }
            if (r0 != 0) goto L_0x01be
        L_0x0114:
            java.lang.Exception r0 = new java.lang.Exception     // Catch:{ Exception -> 0x01b4 }
            java.lang.String r2 = "B file error"
            r0.<init>(r2)     // Catch:{ Exception -> 0x01b4 }
            r1.warning(r0)     // Catch:{ Exception -> 0x01b4 }
            java.nio.MappedByteBuffer r0 = r1.aBuffer     // Catch:{ Exception -> 0x01b4 }
            java.nio.MappedByteBuffer r2 = r1.bBuffer     // Catch:{ Exception -> 0x01b4 }
            int r3 = r1.dataEnd     // Catch:{ Exception -> 0x01b4 }
            r1.copyBuffer(r0, r2, r3)     // Catch:{ Exception -> 0x01b4 }
            goto L_0x01be
        L_0x0129:
            if (r5 < 0) goto L_0x018f
            long r2 = (long) r5     // Catch:{ Exception -> 0x01b4 }
            long r8 = r8 - r13
            int r0 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r0 > 0) goto L_0x018f
            java.util.Map<java.lang.String, com.mbridge.msdk.foundation.tools.b$b> r0 = r1.data     // Catch:{ Exception -> 0x01b4 }
            r0.clear()     // Catch:{ Exception -> 0x01b4 }
            r21.clearInvalid()     // Catch:{ Exception -> 0x01b4 }
            int r0 = r5 + 12
            r1.dataEnd = r0     // Catch:{ Exception -> 0x01b4 }
            com.mbridge.msdk.foundation.tools.i r0 = r1.fastBuffer     // Catch:{ Exception -> 0x01b4 }
            byte[] r0 = r0.f20731a     // Catch:{ Exception -> 0x01b4 }
            int r0 = r0.length     // Catch:{ Exception -> 0x01b4 }
            java.nio.MappedByteBuffer r2 = r1.bBuffer     // Catch:{ Exception -> 0x01b4 }
            int r2 = r2.capacity()     // Catch:{ Exception -> 0x01b4 }
            if (r0 == r2) goto L_0x0157
            com.mbridge.msdk.foundation.tools.i r0 = new com.mbridge.msdk.foundation.tools.i     // Catch:{ Exception -> 0x01b4 }
            java.nio.MappedByteBuffer r2 = r1.bBuffer     // Catch:{ Exception -> 0x01b4 }
            int r2 = r2.capacity()     // Catch:{ Exception -> 0x01b4 }
            r0.<init>((int) r2)     // Catch:{ Exception -> 0x01b4 }
            r1.fastBuffer = r0     // Catch:{ Exception -> 0x01b4 }
        L_0x0157:
            java.nio.MappedByteBuffer r0 = r1.bBuffer     // Catch:{ Exception -> 0x01b4 }
            r0.rewind()     // Catch:{ Exception -> 0x01b4 }
            java.nio.MappedByteBuffer r0 = r1.bBuffer     // Catch:{ Exception -> 0x01b4 }
            com.mbridge.msdk.foundation.tools.i r2 = r1.fastBuffer     // Catch:{ Exception -> 0x01b4 }
            byte[] r2 = r2.f20731a     // Catch:{ Exception -> 0x01b4 }
            int r3 = r1.dataEnd     // Catch:{ Exception -> 0x01b4 }
            r0.get(r2, r15, r3)     // Catch:{ Exception -> 0x01b4 }
            com.mbridge.msdk.foundation.tools.i r0 = r1.fastBuffer     // Catch:{ Exception -> 0x01b4 }
            r2 = 12
            long r2 = r0.mo57759b(r2, r5)     // Catch:{ Exception -> 0x01b4 }
            int r0 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r0 != 0) goto L_0x018f
            int r0 = r21.parseData()     // Catch:{ Exception -> 0x01b4 }
            if (r0 != 0) goto L_0x018f
            java.lang.Exception r0 = new java.lang.Exception     // Catch:{ Exception -> 0x01b4 }
            java.lang.String r2 = "A file error"
            r0.<init>(r2)     // Catch:{ Exception -> 0x01b4 }
            r1.warning(r0)     // Catch:{ Exception -> 0x01b4 }
            java.nio.MappedByteBuffer r0 = r1.bBuffer     // Catch:{ Exception -> 0x01b4 }
            java.nio.MappedByteBuffer r2 = r1.aBuffer     // Catch:{ Exception -> 0x01b4 }
            int r3 = r1.dataEnd     // Catch:{ Exception -> 0x01b4 }
            r1.copyBuffer(r0, r2, r3)     // Catch:{ Exception -> 0x01b4 }
            r1.checksum = r10     // Catch:{ Exception -> 0x01b4 }
            goto L_0x0190
        L_0x018f:
            r12 = r15
        L_0x0190:
            if (r12 != 0) goto L_0x01be
            java.lang.String r0 = "both files error"
            r1.error((java.lang.String) r0)     // Catch:{ Exception -> 0x01b4 }
            r21.resetData()     // Catch:{ Exception -> 0x01b4 }
            goto L_0x01be
        L_0x019b:
            r0 = move-exception
            r1.error((java.lang.Exception) r0)     // Catch:{ Exception -> 0x01b4 }
            r21.toBlockingMode()     // Catch:{ Exception -> 0x01b4 }
            r1.tryBlockingIO(r2, r3)     // Catch:{ Exception -> 0x01b4 }
            return
        L_0x01a6:
            java.lang.Exception r0 = new java.lang.Exception     // Catch:{ Exception -> 0x01b4 }
            java.lang.String r2 = "open file failed"
            r0.<init>(r2)     // Catch:{ Exception -> 0x01b4 }
            r1.error((java.lang.Exception) r0)     // Catch:{ Exception -> 0x01b4 }
            r21.toBlockingMode()     // Catch:{ Exception -> 0x01b4 }
            return
        L_0x01b4:
            r0 = move-exception
            r1.error((java.lang.Exception) r0)
            r21.clearData()
            r21.toBlockingMode()
        L_0x01be:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.tools.FastKV.loadFromABFile():void");
    }

    private void tryBlockingIO(File file, File file2) {
        try {
            if (loadWithBlockingIO(file)) {
                return;
            }
        } catch (IOException e) {
            warning(e);
        }
        clearData();
        try {
            if (loadWithBlockingIO(file2)) {
                return;
            }
        } catch (IOException e2) {
            warning(e2);
        }
        clearData();
    }

    private boolean isABFileEqual() {
        C8579i iVar = new C8579i(this.dataEnd);
        this.bBuffer.rewind();
        this.bBuffer.get(iVar.f20731a, 0, this.dataEnd);
        byte[] bArr = this.fastBuffer.f20731a;
        byte[] bArr2 = iVar.f20731a;
        for (int i = 0; i < this.dataEnd; i++) {
            if (bArr[i] != bArr2[i]) {
                return false;
            }
        }
        return true;
    }

    private boolean loadFromCFile() {
        File file = new File(this.path, this.name + C_SUFFIX);
        File file2 = new File(this.path, this.name + TEMP_SUFFIX);
        boolean z = true;
        try {
            if (!file.exists()) {
                file = file2.exists() ? file2 : null;
            }
            if (file != null) {
                if (!loadWithBlockingIO(file)) {
                    clearData();
                    deleteCFiles();
                } else if (this.writingMode == 0) {
                    if (writeToABFile(this.fastBuffer)) {
                        info("recover from c file");
                        try {
                            deleteCFiles();
                            return true;
                        } catch (Exception e) {
                            e = e;
                        }
                    } else {
                        this.writingMode = 1;
                    }
                }
            } else if (this.writingMode != 0) {
                File file3 = new File(this.path, this.name + A_SUFFIX);
                File file4 = new File(this.path, this.name + B_SUFFIX);
                if (file3.exists() && file4.exists()) {
                    tryBlockingIO(file3, file4);
                }
            }
            return false;
        } catch (Exception e2) {
            e = e2;
            z = false;
            error(e);
            return z;
        }
    }

    private boolean loadWithBlockingIO(File file) throws IOException {
        C8579i iVar;
        long length = file.length();
        if (length != 0 && length <= 536870912) {
            int i = (int) length;
            int newCapacity = getNewCapacity(PAGE_SIZE, i);
            C8579i iVar2 = this.fastBuffer;
            if (iVar2 == null || iVar2.f20731a.length != newCapacity) {
                C8579i iVar3 = new C8579i(new byte[newCapacity]);
                this.fastBuffer = iVar3;
                iVar = iVar3;
            } else {
                iVar = this.fastBuffer;
                iVar.f20732b = 0;
            }
            C8558ae.m24744a(file, iVar.f20731a, i);
            int c = iVar.mo57762c();
            long d = iVar.mo57763d();
            this.dataEnd = c + 12;
            if (c >= 0 && c <= i - 12 && d == iVar.mo57759b(12, c) && parseData() == 0) {
                this.checksum = d;
                return true;
            }
        }
        return false;
    }

    private boolean writeToABFile(C8579i iVar) {
        int length = iVar.f20731a.length;
        String str = this.path;
        File file = new File(str, this.name + A_SUFFIX);
        String str2 = this.path;
        File file2 = new File(str2, this.name + B_SUFFIX);
        try {
            if (!C8558ae.m24745a(file) || !C8558ae.m24745a(file2)) {
                throw new Exception(OPEN_FILE_FAILED);
            }
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
            RandomAccessFile randomAccessFile2 = new RandomAccessFile(file2, "rw");
            long j = (long) length;
            randomAccessFile.setLength(j);
            randomAccessFile2.setLength(j);
            this.aChannel = randomAccessFile.getChannel();
            this.bChannel = randomAccessFile2.getChannel();
            MappedByteBuffer map = this.aChannel.map(FileChannel.MapMode.READ_WRITE, 0, j);
            this.aBuffer = map;
            map.order(ByteOrder.LITTLE_ENDIAN);
            MappedByteBuffer map2 = this.bChannel.map(FileChannel.MapMode.READ_WRITE, 0, j);
            this.bBuffer = map2;
            map2.order(ByteOrder.LITTLE_ENDIAN);
            this.aBuffer.put(iVar.f20731a, 0, this.dataEnd);
            this.bBuffer.put(iVar.f20731a, 0, this.dataEnd);
            return true;
        } catch (Exception e) {
            error(e);
            return false;
        }
    }

    private void checkValueSize(int i, boolean z) {
        if (z) {
            if (i != 32) {
                throw new IllegalStateException("name size not match");
            }
        } else if (i < 0 || i >= 2048) {
            throw new IllegalStateException("value size out of bound");
        }
    }

    private void copyBuffer(MappedByteBuffer mappedByteBuffer, MappedByteBuffer mappedByteBuffer2, int i) {
        if (mappedByteBuffer.capacity() != mappedByteBuffer2.capacity()) {
            try {
                MappedByteBuffer map = (mappedByteBuffer2 == this.bBuffer ? this.bChannel : this.aChannel).map(FileChannel.MapMode.READ_WRITE, 0, (long) mappedByteBuffer.capacity());
                map.order(ByteOrder.LITTLE_ENDIAN);
                if (mappedByteBuffer2 == this.bBuffer) {
                    this.bBuffer = map;
                } else {
                    this.aBuffer = map;
                }
                mappedByteBuffer2 = map;
            } catch (IOException e) {
                error((Exception) e);
                toBlockingMode();
                return;
            }
        }
        mappedByteBuffer.rewind();
        mappedByteBuffer2.rewind();
        mappedByteBuffer.limit(i);
        mappedByteBuffer2.put(mappedByteBuffer);
        mappedByteBuffer.limit(mappedByteBuffer.capacity());
    }

    private int parseData() {
        Object obj;
        C8579i iVar = this.fastBuffer;
        iVar.f20732b = 12;
        while (true) {
            try {
                boolean z = false;
                if (iVar.f20732b < this.dataEnd) {
                    int i = iVar.f20732b;
                    byte a = iVar.mo57750a();
                    byte b = (byte) (a & 63);
                    if (b >= 1 && b <= 8) {
                        byte a2 = iVar.mo57750a() & 255;
                        if (a < 0) {
                            iVar.f20732b += a2;
                            int b2 = b <= 5 ? TYPE_SIZE[b] : iVar.mo57761b() & UShort.MAX_VALUE;
                            this.fastBuffer.f20732b += b2;
                            countInvalid(i, this.fastBuffer.f20732b);
                        } else {
                            String b3 = iVar.mo57760b((int) a2);
                            int i2 = iVar.f20732b;
                            if (b > 5) {
                                int b4 = iVar.mo57761b() & UShort.MAX_VALUE;
                                boolean z2 = (a & SignedBytes.MAX_POWER_OF_TWO) != 0;
                                checkValueSize(b4, z2);
                                if (b == 6) {
                                    this.data.put(b3, new C8562b.C8571i(i, i2 + 2, iVar.mo57760b(b4), b4, z2));
                                } else if (b == 7) {
                                    if (z2) {
                                        obj = iVar.mo57760b(b4);
                                    } else {
                                        obj = new byte[b4];
                                        System.arraycopy(iVar.f20731a, iVar.f20732b, obj, 0, b4);
                                        iVar.f20732b += b4;
                                    }
                                    this.data.put(b3, new C8562b.C8563a(i, i2 + 2, obj, b4, z2));
                                } else if (z2) {
                                    this.data.put(b3, new C8562b.C8570h(i, i2 + 2, iVar.mo57760b(b4), b4, true));
                                } else {
                                    byte a3 = iVar.mo57750a() & 255;
                                    String b5 = iVar.mo57760b((int) a3);
                                    C8549a aVar = this.encoderMap.get(b5);
                                    int i3 = b4 - (a3 + 1);
                                    if (i3 >= 0) {
                                        if (aVar != null) {
                                            try {
                                                Object a4 = aVar.mo57741a(iVar.f20731a, iVar.f20732b, i3);
                                                if (a4 != null) {
                                                    this.data.put(b3, new C8562b.C8570h(i, i2 + 2, a4, b4, false));
                                                }
                                            } catch (Exception e) {
                                                error(e);
                                            }
                                        } else {
                                            error("object with tag: " + b5 + " without encoder");
                                        }
                                        iVar.f20732b += i3;
                                    } else {
                                        throw new Exception(PARSE_DATA_FAILED);
                                    }
                                }
                            } else if (b == 1) {
                                Map<String, C8562b.C8564b> map = this.data;
                                if (iVar.mo57750a() == 1) {
                                    z = true;
                                }
                                map.put(b3, new C8562b.C8565c(i2, z));
                            } else if (b == 2) {
                                this.data.put(b3, new C8562b.C8568f(i2, iVar.mo57762c()));
                            } else if (b == 3) {
                                this.data.put(b3, new C8562b.C8567e(i2, Float.intBitsToFloat(iVar.mo57762c())));
                            } else if (b != 4) {
                                this.data.put(b3, new C8562b.C8566d(i2, Double.longBitsToDouble(iVar.mo57763d())));
                            } else {
                                this.data.put(b3, new C8562b.C8569g(i2, iVar.mo57763d()));
                            }
                        }
                    }
                } else if (iVar.f20732b == this.dataEnd) {
                    return 0;
                } else {
                    warning(new Exception(PARSE_DATA_FAILED));
                    return -1;
                }
            } catch (Exception e2) {
                warning(e2);
                return -1;
            }
        }
        throw new Exception(PARSE_DATA_FAILED);
    }

    public synchronized boolean contains(String str) {
        return this.data.containsKey(str);
    }

    public synchronized boolean getBoolean(String str) {
        return getBoolean(str, false);
    }

    public synchronized boolean getBoolean(String str, boolean z) {
        C8562b.C8565c cVar = (C8562b.C8565c) this.data.get(str);
        if (cVar != null) {
            z = cVar.f20705b;
        }
        return z;
    }

    public int getInt(String str) {
        return getInt(str, 0);
    }

    public synchronized int getInt(String str, int i) {
        C8562b.C8568f fVar = (C8562b.C8568f) this.data.get(str);
        if (fVar != null) {
            i = fVar.f20708b;
        }
        return i;
    }

    public float getFloat(String str) {
        return getFloat(str, 0.0f);
    }

    public synchronized float getFloat(String str, float f) {
        C8562b.C8567e eVar = (C8562b.C8567e) this.data.get(str);
        if (eVar != null) {
            f = eVar.f20707b;
        }
        return f;
    }

    public synchronized long getLong(String str) {
        long j;
        C8562b.C8569g gVar = (C8562b.C8569g) this.data.get(str);
        if (gVar == null) {
            j = 0;
        } else {
            j = gVar.f20709b;
        }
        return j;
    }

    public synchronized long getLong(String str, long j) {
        C8562b.C8569g gVar = (C8562b.C8569g) this.data.get(str);
        if (gVar != null) {
            j = gVar.f20709b;
        }
        return j;
    }

    public double getDouble(String str) {
        return getDouble(str, 0.0d);
    }

    public synchronized double getDouble(String str, double d) {
        C8562b.C8566d dVar = (C8562b.C8566d) this.data.get(str);
        if (dVar != null) {
            d = dVar.f20706b;
        }
        return d;
    }

    public String getString(String str) {
        return getString(str, "");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0019, code lost:
        return r2.f20713e ? getStringFromFile(r2) : (java.lang.String) r2.f20710b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized java.lang.String getString(java.lang.String r2, java.lang.String r3) {
        /*
            r1 = this;
            monitor-enter(r1)
            java.util.Map<java.lang.String, com.mbridge.msdk.foundation.tools.b$b> r0 = r1.data     // Catch:{ all -> 0x001c }
            java.lang.Object r2 = r0.get(r2)     // Catch:{ all -> 0x001c }
            com.mbridge.msdk.foundation.tools.b$i r2 = (com.mbridge.msdk.foundation.tools.C8562b.C8571i) r2     // Catch:{ all -> 0x001c }
            if (r2 == 0) goto L_0x001a
            boolean r3 = r2.f20713e     // Catch:{ all -> 0x001c }
            if (r3 == 0) goto L_0x0014
            java.lang.String r2 = r1.getStringFromFile(r2)     // Catch:{ all -> 0x001c }
            goto L_0x0018
        L_0x0014:
            java.lang.Object r2 = r2.f20710b     // Catch:{ all -> 0x001c }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x001c }
        L_0x0018:
            monitor-exit(r1)
            return r2
        L_0x001a:
            monitor-exit(r1)
            return r3
        L_0x001c:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.tools.FastKV.getString(java.lang.String, java.lang.String):java.lang.String");
    }

    private String getStringFromFile(C8562b.C8571i iVar) {
        try {
            byte[] b = C8558ae.m24748b(new File(this.path + this.name, (String) iVar.f20710b));
            if (b != null) {
                if (Build.VERSION.SDK_INT >= 19) {
                    if (b.length == 0) {
                        return "";
                    }
                    return new String(b, StandardCharsets.UTF_8);
                } else if (b.length == 0) {
                    return "";
                } else {
                    return new String(b);
                }
            }
        } catch (Exception e) {
            error(e);
        }
        return "";
    }

    public byte[] getArray(String str) {
        return getArray(str, EMPTY_ARRAY);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001b, code lost:
        return r2.f20713e ? getArrayFromFile(r2) : (byte[]) r2.f20710b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized byte[] getArray(java.lang.String r2, byte[] r3) {
        /*
            r1 = this;
            monitor-enter(r1)
            java.util.Map<java.lang.String, com.mbridge.msdk.foundation.tools.b$b> r0 = r1.data     // Catch:{ all -> 0x001e }
            java.lang.Object r2 = r0.get(r2)     // Catch:{ all -> 0x001e }
            com.mbridge.msdk.foundation.tools.b$a r2 = (com.mbridge.msdk.foundation.tools.C8562b.C8563a) r2     // Catch:{ all -> 0x001e }
            if (r2 == 0) goto L_0x001c
            boolean r3 = r2.f20713e     // Catch:{ all -> 0x001e }
            if (r3 == 0) goto L_0x0014
            byte[] r2 = r1.getArrayFromFile(r2)     // Catch:{ all -> 0x001e }
            goto L_0x001a
        L_0x0014:
            java.lang.Object r2 = r2.f20710b     // Catch:{ all -> 0x001e }
            byte[] r2 = (byte[]) r2     // Catch:{ all -> 0x001e }
            byte[] r2 = (byte[]) r2     // Catch:{ all -> 0x001e }
        L_0x001a:
            monitor-exit(r1)
            return r2
        L_0x001c:
            monitor-exit(r1)
            return r3
        L_0x001e:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.tools.FastKV.getArray(java.lang.String, byte[]):byte[]");
    }

    private byte[] getArrayFromFile(C8562b.C8563a aVar) {
        try {
            byte[] b = C8558ae.m24748b(new File(this.path + this.name, (String) aVar.f20710b));
            return b != null ? b : EMPTY_ARRAY;
        } catch (Exception e) {
            error(e);
            return EMPTY_ARRAY;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0017, code lost:
        return r2.f20713e ? getObjectFromFile(r2) : r2.f20710b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized <T> T getObject(java.lang.String r2) {
        /*
            r1 = this;
            monitor-enter(r1)
            java.util.Map<java.lang.String, com.mbridge.msdk.foundation.tools.b$b> r0 = r1.data     // Catch:{ all -> 0x001b }
            java.lang.Object r2 = r0.get(r2)     // Catch:{ all -> 0x001b }
            com.mbridge.msdk.foundation.tools.b$h r2 = (com.mbridge.msdk.foundation.tools.C8562b.C8570h) r2     // Catch:{ all -> 0x001b }
            if (r2 == 0) goto L_0x0018
            boolean r0 = r2.f20713e     // Catch:{ all -> 0x001b }
            if (r0 == 0) goto L_0x0014
            java.lang.Object r2 = r1.getObjectFromFile(r2)     // Catch:{ all -> 0x001b }
            goto L_0x0016
        L_0x0014:
            java.lang.Object r2 = r2.f20710b     // Catch:{ all -> 0x001b }
        L_0x0016:
            monitor-exit(r1)
            return r2
        L_0x0018:
            r2 = 0
            monitor-exit(r1)
            return r2
        L_0x001b:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.tools.FastKV.getObject(java.lang.String):java.lang.Object");
    }

    private Object getObjectFromFile(C8562b.C8570h hVar) {
        String str;
        try {
            byte[] b = C8558ae.m24748b(new File(this.path + this.name, (String) hVar.f20710b));
            if (b != null) {
                byte b2 = b[0] & 255;
                if (Build.VERSION.SDK_INT >= 19) {
                    str = new String(b, 1, b2, StandardCharsets.UTF_8);
                } else {
                    str = new String(b, 1, b2);
                }
                C8549a aVar = this.encoderMap.get(str);
                if (aVar != null) {
                    int i = b2 + 1;
                    return aVar.mo57741a(b, i, b.length - i);
                }
                warning(new Exception("No encoder for tag:" + str));
                return null;
            }
            warning(new Exception("Read object data failed"));
            return null;
        } catch (Exception e) {
            error(e);
            return null;
        }
    }

    public synchronized Set<String> getStringSet(String str) {
        return (Set) getObject(str);
    }

    public synchronized void putBoolean(String str, boolean z) {
        checkKey(str);
        C8562b.C8565c cVar = (C8562b.C8565c) this.data.get(str);
        int i = 0;
        if (cVar == null) {
            wrapHeader(str, (byte) 1);
            int i2 = this.fastBuffer.f20732b;
            C8579i iVar = this.fastBuffer;
            if (z) {
                i = 1;
            }
            iVar.mo57751a((byte) i);
            updateChange();
            this.data.put(str, new C8562b.C8565c(i2, z));
            checkIfCommit();
        } else if (cVar.f20705b != z) {
            cVar.f20705b = z;
            if (z) {
                i = 1;
            }
            updateBoolean((byte) i, cVar.f20704a);
            checkIfCommit();
        }
    }

    public synchronized void putInt(String str, int i) {
        checkKey(str);
        C8562b.C8568f fVar = (C8562b.C8568f) this.data.get(str);
        if (fVar == null) {
            wrapHeader(str, (byte) 2);
            int i2 = this.fastBuffer.f20732b;
            this.fastBuffer.mo57752a(i);
            updateChange();
            this.data.put(str, new C8562b.C8568f(i2, i));
            checkIfCommit();
        } else if (fVar.f20708b != i) {
            fVar.f20708b = i;
            updateInt32(i, ((long) (fVar.f20708b ^ i)) & 4294967295L, fVar.f20704a);
            checkIfCommit();
        }
    }

    public synchronized void putFloat(String str, float f) {
        checkKey(str);
        C8562b.C8567e eVar = (C8562b.C8567e) this.data.get(str);
        if (eVar == null) {
            wrapHeader(str, (byte) 3);
            int i = this.fastBuffer.f20732b;
            this.fastBuffer.mo57752a(Float.floatToRawIntBits(f));
            updateChange();
            this.data.put(str, new C8562b.C8567e(i, f));
            checkIfCommit();
        } else if (eVar.f20707b != f) {
            int floatToRawIntBits = Float.floatToRawIntBits(f);
            eVar.f20707b = f;
            updateInt32(floatToRawIntBits, ((long) (Float.floatToRawIntBits(eVar.f20707b) ^ floatToRawIntBits)) & 4294967295L, eVar.f20704a);
            checkIfCommit();
        }
    }

    public synchronized void putLong(String str, long j) {
        checkKey(str);
        C8562b.C8569g gVar = (C8562b.C8569g) this.data.get(str);
        if (gVar == null) {
            wrapHeader(str, (byte) 4);
            int i = this.fastBuffer.f20732b;
            this.fastBuffer.mo57755a(j);
            updateChange();
            this.data.put(str, new C8562b.C8569g(i, j));
            checkIfCommit();
        } else if (gVar.f20709b != j) {
            gVar.f20709b = j;
            updateInt64(j, j ^ gVar.f20709b, gVar.f20704a);
            checkIfCommit();
        }
    }

    public synchronized void putDouble(String str, double d) {
        checkKey(str);
        C8562b.C8566d dVar = (C8562b.C8566d) this.data.get(str);
        if (dVar == null) {
            wrapHeader(str, (byte) 5);
            int i = this.fastBuffer.f20732b;
            this.fastBuffer.mo57755a(Double.doubleToRawLongBits(d));
            updateChange();
            this.data.put(str, new C8562b.C8566d(i, d));
            checkIfCommit();
        } else if (dVar.f20706b != d) {
            long doubleToRawLongBits = Double.doubleToRawLongBits(d);
            dVar.f20706b = d;
            updateInt64(doubleToRawLongBits, Double.doubleToRawLongBits(dVar.f20706b) ^ doubleToRawLongBits, dVar.f20704a);
            checkIfCommit();
        }
    }

    public synchronized void putString(String str, String str2) {
        byte[] bArr;
        checkKey(str);
        if (str2 == null) {
            remove(str);
        } else {
            C8562b.C8571i iVar = (C8562b.C8571i) this.data.get(str);
            if (str2.length() * 3 < 2048) {
                fastPutString(str, str2, iVar);
            } else {
                if (Build.VERSION.SDK_INT >= 19) {
                    bArr = str2.isEmpty() ? EMPTY_ARRAY : str2.getBytes(StandardCharsets.UTF_8);
                } else {
                    bArr = str2.isEmpty() ? EMPTY_ARRAY : str2.getBytes();
                }
                addOrUpdate(str, str2, bArr, iVar, (byte) 6);
            }
        }
    }

    public synchronized void putArray(String str, byte[] bArr) {
        checkKey(str);
        if (bArr == null) {
            remove(str);
        } else {
            addOrUpdate(str, bArr, bArr, (C8562b.C8563a) this.data.get(str), (byte) 7);
        }
    }

    public synchronized <T> void putObject(String str, T t, C8549a<T> aVar) {
        checkKey(str);
        if (aVar != null) {
            String a = aVar.mo57742a();
            if (a == null || a.isEmpty() || a.length() > 50) {
                throw new IllegalArgumentException("Invalid encoder tag:" + a);
            } else if (!this.encoderMap.containsKey(a)) {
                throw new IllegalArgumentException("Encoder hasn't been registered");
            } else if (t == null) {
                remove(str);
            } else {
                byte[] bArr = null;
                try {
                    bArr = aVar.mo57743a(t);
                } catch (Exception e) {
                    error(e);
                }
                if (bArr == null) {
                    remove(str);
                    return;
                }
                int b = C8579i.m24770b(a);
                C8579i iVar = new C8579i(b + 1 + bArr.length);
                iVar.mo57751a((byte) b);
                iVar.mo57756a(a);
                iVar.mo57758a(bArr);
                addOrUpdate(str, t, iVar.f20731a, (C8562b.C8570h) this.data.get(str), (byte) 8);
            }
        } else {
            throw new IllegalArgumentException("Encoder is null");
        }
    }

    public synchronized void putStringSet(String str, Set<String> set) {
        if (set == null) {
            remove(str);
        } else {
            putObject(str, set, C8555ab.f20700a);
        }
    }

    public synchronized void remove(String str) {
        C8562b.C8564b bVar = this.data.get(str);
        if (bVar != null) {
            this.data.remove(str);
            byte a = bVar.mo57748a();
            String str2 = null;
            if (a <= 5) {
                remove(a, bVar.f20704a - (C8579i.m24770b(str) + 2), bVar.f20704a + TYPE_SIZE[a]);
            } else {
                C8562b.C8572j jVar = (C8562b.C8572j) bVar;
                remove(a, jVar.f20711c, jVar.f20704a + jVar.f20712d);
                if (jVar.f20713e) {
                    str2 = (String) jVar.f20710b;
                }
            }
            byte b = (byte) (a | Byte.MIN_VALUE);
            if (this.writingMode == 0) {
                this.aBuffer.putLong(4, this.checksum);
                this.aBuffer.put(this.removeStart, b);
                this.bBuffer.putLong(4, this.checksum);
                this.bBuffer.put(this.removeStart, b);
            } else {
                this.fastBuffer.mo57754a(4, this.checksum);
            }
            this.removeStart = 0;
            if (str2 != null) {
                C8558ae.m24749c(new File(this.path + this.name, str2));
            }
            checkGC();
            checkIfCommit();
        }
    }

    public synchronized void clear() {
        resetData();
        if (this.writingMode != 0) {
            deleteCFiles();
        }
    }

    public synchronized Map<String, Object> getAll() {
        Object valueOf;
        int size = this.data.size();
        if (size == 0) {
            return new HashMap();
        }
        HashMap hashMap = new HashMap(((size * 4) / 3) + 1);
        for (Map.Entry next : this.data.entrySet()) {
            String str = (String) next.getKey();
            C8562b.C8564b bVar = (C8562b.C8564b) next.getValue();
            Object obj = null;
            switch (bVar.mo57748a()) {
                case 1:
                    valueOf = Boolean.valueOf(((C8562b.C8565c) bVar).f20705b);
                    break;
                case 2:
                    valueOf = Integer.valueOf(((C8562b.C8568f) bVar).f20708b);
                    break;
                case 3:
                    valueOf = Float.valueOf(((C8562b.C8567e) bVar).f20707b);
                    break;
                case 4:
                    valueOf = Long.valueOf(((C8562b.C8569g) bVar).f20709b);
                    break;
                case 5:
                    valueOf = Double.valueOf(((C8562b.C8566d) bVar).f20706b);
                    break;
                case 6:
                    C8562b.C8571i iVar = (C8562b.C8571i) bVar;
                    if (!iVar.f20713e) {
                        valueOf = iVar.f20710b;
                        break;
                    } else {
                        valueOf = getStringFromFile(iVar);
                        break;
                    }
                case 7:
                    C8562b.C8563a aVar = (C8562b.C8563a) bVar;
                    if (!aVar.f20713e) {
                        valueOf = aVar.f20710b;
                        break;
                    } else {
                        valueOf = getArrayFromFile(aVar);
                        break;
                    }
                case 8:
                    C8562b.C8570h hVar = (C8562b.C8570h) bVar;
                    if (!hVar.f20713e) {
                        valueOf = ((C8562b.C8570h) bVar).f20710b;
                        break;
                    } else {
                        valueOf = getObjectFromFile(hVar);
                        break;
                    }
                default:
                    continue;
            }
            obj = valueOf;
            hashMap.put(str, obj);
        }
        return hashMap;
    }

    public void putAll(Map<String, Object> map) {
        putAll(map, (Map<Class, C8549a>) null);
    }

    public synchronized void putAll(Map<String, Object> map, Map<Class, C8549a> map2) {
        for (Map.Entry next : map.entrySet()) {
            String str = (String) next.getKey();
            Object value = next.getValue();
            if (str != null && !str.isEmpty()) {
                if (value instanceof String) {
                    putString(str, (String) value);
                } else if (value instanceof Boolean) {
                    putBoolean(str, ((Boolean) value).booleanValue());
                } else if (value instanceof Integer) {
                    putInt(str, ((Integer) value).intValue());
                } else if (value instanceof Long) {
                    putLong(str, ((Long) value).longValue());
                } else if (value instanceof Float) {
                    putFloat(str, ((Float) value).floatValue());
                } else if (value instanceof Double) {
                    putDouble(str, ((Double) value).doubleValue());
                } else if (value instanceof Set) {
                    Set set = (Set) value;
                    if (!set.isEmpty() && (set.iterator().next() instanceof String)) {
                        putStringSet(str, (Set) value);
                    }
                } else if (value instanceof byte[]) {
                    putArray(str, (byte[]) value);
                } else if (map2 != null) {
                    C8549a aVar = map2.get(value.getClass());
                    if (aVar != null) {
                        putObject(str, value, aVar);
                    } else {
                        warning(new Exception("missing encoder for type:" + value.getClass()));
                    }
                } else {
                    warning(new Exception("missing encoders"));
                }
            }
        }
    }

    public synchronized void force() {
        if (this.writingMode == 0) {
            this.aBuffer.force();
            this.bBuffer.force();
        }
    }

    public synchronized void disableAutoCommit() {
        this.autoCommit = false;
    }

    public synchronized boolean commit() {
        this.autoCommit = true;
        return commitToCFile();
    }

    private void checkIfCommit() {
        if (this.writingMode != 0 && this.autoCommit) {
            commitToCFile();
        }
    }

    private boolean commitToCFile() {
        int i = this.writingMode;
        if (i == 1) {
            this.executor.execute(new Runnable() {
                public final void run() {
                    boolean unused = FastKV.this.writeToCFile();
                }
            });
        } else if (i == 2) {
            return writeToCFile();
        }
        return true;
    }

    /* access modifiers changed from: private */
    public synchronized boolean writeToCFile() {
        try {
            String str = this.path;
            File file = new File(str, this.name + TEMP_SUFFIX);
            if (C8558ae.m24745a(file)) {
                RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
                randomAccessFile.setLength((long) this.dataEnd);
                randomAccessFile.write(this.fastBuffer.f20731a, 0, this.dataEnd);
                randomAccessFile.close();
                String str2 = this.path;
                File file2 = new File(str2, this.name + C_SUFFIX);
                if (!file2.exists() || file2.delete()) {
                    if (file.renameTo(file2)) {
                        return true;
                    }
                    warning(new Exception("rename failed"));
                }
            }
        } catch (Exception e) {
            error(e);
        }
        return false;
    }

    private void deleteCFiles() {
        try {
            String str = this.path;
            C8558ae.m24749c(new File(str, this.name + C_SUFFIX));
            String str2 = this.path;
            C8558ae.m24749c(new File(str2, this.name + TEMP_SUFFIX));
        } catch (Exception e) {
            error(e);
        }
    }

    private void toBlockingMode() {
        this.writingMode = 1;
        C8558ae.m24743a((Closeable) this.aChannel);
        C8558ae.m24743a((Closeable) this.bChannel);
        this.aChannel = null;
        this.bChannel = null;
        this.aBuffer = null;
        this.bBuffer = null;
    }

    private void resetData() {
        if (this.writingMode == 0) {
            try {
                resetBuffer(this.aBuffer);
                resetBuffer(this.bBuffer);
            } catch (IOException unused) {
                toBlockingMode();
            }
        }
        clearData();
        C8558ae.m24749c(new File(this.path + this.name));
    }

    private void resetBuffer(MappedByteBuffer mappedByteBuffer) throws IOException {
        if (mappedByteBuffer.capacity() != PAGE_SIZE) {
            FileChannel fileChannel = mappedByteBuffer == this.aBuffer ? this.aChannel : this.bChannel;
            fileChannel.truncate((long) PAGE_SIZE);
            MappedByteBuffer map = fileChannel.map(FileChannel.MapMode.READ_WRITE, 0, (long) PAGE_SIZE);
            map.order(ByteOrder.LITTLE_ENDIAN);
            if (mappedByteBuffer == this.aBuffer) {
                this.aBuffer = map;
            } else {
                this.bBuffer = map;
            }
            mappedByteBuffer = map;
        }
        mappedByteBuffer.putInt(0, 0);
        mappedByteBuffer.putLong(4, 0);
    }

    private void clearData() {
        this.dataEnd = 12;
        this.checksum = 0;
        clearInvalid();
        this.data.clear();
        C8579i iVar = this.fastBuffer;
        if (iVar == null || iVar.f20731a.length != PAGE_SIZE) {
            this.fastBuffer = new C8579i(PAGE_SIZE);
            return;
        }
        this.fastBuffer.mo57753a(0, 0);
        this.fastBuffer.mo57754a(4, 0);
    }

    private void checkKey(String str) {
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("key is empty");
        }
    }

    private void checkKeySize(int i) {
        if (i > 255) {
            throw new IllegalArgumentException("key's length must less than 256");
        }
    }

    private void wrapHeader(String str, byte b) {
        wrapHeader(str, b, TYPE_SIZE[b]);
    }

    private void wrapHeader(String str, byte b, int i) {
        int b2 = C8579i.m24770b(str);
        checkKeySize(b2);
        this.updateSize = b2 + 2 + i;
        preparePutBytes();
        this.fastBuffer.mo57751a(b);
        putKey(str, b2);
    }

    private void updateChange() {
        this.checksum ^= this.fastBuffer.mo57759b(this.updateStart, this.updateSize);
        if (this.writingMode == 0) {
            this.aBuffer.putInt(0, -1);
            syncABBuffer(this.aBuffer);
            this.aBuffer.putInt(0, this.dataEnd - 12);
            syncABBuffer(this.bBuffer);
        } else {
            if (this.sizeChanged) {
                this.fastBuffer.mo57753a(0, this.dataEnd - 12);
            }
            this.fastBuffer.mo57754a(4, this.checksum);
        }
        this.sizeChanged = false;
        this.removeStart = 0;
        this.updateSize = 0;
    }

    private void syncABBuffer(MappedByteBuffer mappedByteBuffer) {
        if (this.sizeChanged && mappedByteBuffer != this.aBuffer) {
            mappedByteBuffer.putInt(0, this.dataEnd - 12);
        }
        mappedByteBuffer.putLong(4, this.checksum);
        int i = this.removeStart;
        if (i != 0) {
            mappedByteBuffer.put(i, this.fastBuffer.f20731a[this.removeStart]);
        }
        if (this.updateSize != 0) {
            mappedByteBuffer.position(this.updateStart);
            mappedByteBuffer.put(this.fastBuffer.f20731a, this.updateStart, this.updateSize);
        }
    }

    private int bytesThreshold() {
        int i = this.dataEnd;
        if (i <= 16384) {
            return 4096;
        }
        return i <= 65536 ? 8192 : 16384;
    }

    private void ensureSize(int i) {
        int length = this.fastBuffer.f20731a.length;
        int i2 = this.dataEnd + i;
        if (i2 >= length) {
            int i3 = this.invalidBytes;
            if (i3 <= i || i3 <= bytesThreshold()) {
                int newCapacity = getNewCapacity(length, i2);
                byte[] bArr = new byte[newCapacity];
                System.arraycopy(this.fastBuffer.f20731a, 0, bArr, 0, this.dataEnd);
                this.fastBuffer.f20731a = bArr;
                if (this.writingMode == 0) {
                    try {
                        long j = (long) newCapacity;
                        MappedByteBuffer map = this.aChannel.map(FileChannel.MapMode.READ_WRITE, 0, j);
                        this.aBuffer = map;
                        map.order(ByteOrder.LITTLE_ENDIAN);
                        MappedByteBuffer map2 = this.bChannel.map(FileChannel.MapMode.READ_WRITE, 0, j);
                        this.bBuffer = map2;
                        map2.order(ByteOrder.LITTLE_ENDIAN);
                    } catch (IOException e) {
                        error(new Exception(MAP_FAILED, e));
                        this.fastBuffer.mo57753a(0, this.dataEnd - 12);
                        this.fastBuffer.mo57754a(4, this.checksum);
                        toBlockingMode();
                    }
                }
            } else {
                mo57704gc(i);
            }
        }
    }

    private void updateBoolean(byte b, int i) {
        long shiftCheckSum = this.checksum ^ shiftCheckSum(1, i);
        this.checksum = shiftCheckSum;
        if (this.writingMode == 0) {
            this.aBuffer.putLong(4, shiftCheckSum);
            this.aBuffer.put(i, b);
            this.bBuffer.putLong(4, this.checksum);
            this.bBuffer.put(i, b);
        } else {
            this.fastBuffer.mo57754a(4, shiftCheckSum);
        }
        this.fastBuffer.f20731a[i] = b;
    }

    private void updateInt32(int i, long j, int i2) {
        long shiftCheckSum = shiftCheckSum(j, i2) ^ this.checksum;
        this.checksum = shiftCheckSum;
        if (this.writingMode == 0) {
            this.aBuffer.putLong(4, shiftCheckSum);
            this.aBuffer.putInt(i2, i);
            this.bBuffer.putLong(4, this.checksum);
            this.bBuffer.putInt(i2, i);
        } else {
            this.fastBuffer.mo57754a(4, shiftCheckSum);
        }
        this.fastBuffer.mo57753a(i2, i);
    }

    private void updateInt64(long j, long j2, int i) {
        long shiftCheckSum = shiftCheckSum(j2, i) ^ this.checksum;
        this.checksum = shiftCheckSum;
        if (this.writingMode == 0) {
            this.aBuffer.putLong(4, shiftCheckSum);
            this.aBuffer.putLong(i, j);
            this.bBuffer.putLong(4, this.checksum);
            this.bBuffer.putLong(i, j);
        } else {
            this.fastBuffer.mo57754a(4, shiftCheckSum);
        }
        this.fastBuffer.mo57754a(i, j);
    }

    private void updateBytes(int i, byte[] bArr) {
        int length = bArr.length;
        this.checksum ^= this.fastBuffer.mo57759b(i, length);
        this.fastBuffer.f20732b = i;
        this.fastBuffer.mo57758a(bArr);
        long b = this.checksum ^ this.fastBuffer.mo57759b(i, length);
        this.checksum = b;
        if (this.writingMode == 0) {
            this.aBuffer.putInt(0, -1);
            this.aBuffer.putLong(4, this.checksum);
            this.aBuffer.position(i);
            this.aBuffer.put(bArr);
            this.aBuffer.putInt(0, this.dataEnd - 12);
            this.bBuffer.putLong(4, this.checksum);
            this.bBuffer.position(i);
            this.bBuffer.put(bArr);
            return;
        }
        this.fastBuffer.mo57754a(4, b);
    }

    private void preparePutBytes() {
        ensureSize(this.updateSize);
        int i = this.dataEnd;
        this.updateStart = i;
        this.dataEnd = this.updateSize + i;
        this.fastBuffer.f20732b = i;
        this.sizeChanged = true;
    }

    private void putKey(String str, int i) {
        this.fastBuffer.mo57751a((byte) i);
        if (i == str.length()) {
            str.getBytes(0, i, this.fastBuffer.f20731a, this.fastBuffer.f20732b);
            this.fastBuffer.f20732b += i;
            return;
        }
        this.fastBuffer.mo57756a(str);
    }

    private void putStringValue(String str, int i) {
        this.fastBuffer.mo57757a((short) i);
        if (i == str.length()) {
            str.getBytes(0, i, this.fastBuffer.f20731a, this.fastBuffer.f20732b);
        } else {
            this.fastBuffer.mo57756a(str);
        }
    }

    private void fastPutString(String str, String str2, C8562b.C8571i iVar) {
        int b = C8579i.m24770b(str2);
        if (iVar == null) {
            int b2 = C8579i.m24770b(str);
            checkKeySize(b2);
            int i = b2 + 4;
            this.updateSize = i + b;
            preparePutBytes();
            this.fastBuffer.mo57751a((byte) 6);
            putKey(str, b2);
            putStringValue(str2, b);
            Map<String, C8562b.C8564b> map = this.data;
            int i2 = this.updateStart;
            map.put(str, new C8562b.C8571i(i2, i2 + i, str2, b, false));
            updateChange();
        } else {
            String str3 = null;
            int i3 = iVar.f20704a - iVar.f20711c;
            boolean z = true;
            if (iVar.f20712d == b) {
                this.checksum ^= this.fastBuffer.mo57759b(iVar.f20704a, iVar.f20712d);
                if (b == str2.length()) {
                    str2.getBytes(0, b, this.fastBuffer.f20731a, iVar.f20704a);
                } else {
                    this.fastBuffer.f20732b = iVar.f20704a;
                    this.fastBuffer.mo57756a(str2);
                }
                this.updateStart = iVar.f20704a;
                this.updateSize = b;
                z = false;
            } else {
                this.updateSize = i3 + b;
                preparePutBytes();
                this.fastBuffer.mo57751a((byte) 6);
                int i4 = i3 - 3;
                System.arraycopy(this.fastBuffer.f20731a, iVar.f20711c + 1, this.fastBuffer.f20731a, this.fastBuffer.f20732b, i4);
                this.fastBuffer.f20732b += i4;
                putStringValue(str2, b);
                remove((byte) 6, iVar.f20711c, iVar.f20704a + iVar.f20712d);
                if (iVar.f20713e) {
                    str3 = (String) iVar.f20710b;
                }
                iVar.f20713e = false;
                iVar.f20711c = this.updateStart;
                iVar.f20704a = this.updateStart + i3;
                iVar.f20712d = b;
            }
            iVar.f20710b = str2;
            updateChange();
            if (z) {
                checkGC();
            }
            if (str3 != null) {
                C8558ae.m24749c(new File(this.path + this.name, str3));
            }
        }
        checkIfCommit();
    }

    private void addOrUpdate(String str, Object obj, byte[] bArr, C8562b.C8572j jVar, byte b) {
        if (jVar == null) {
            addObject(str, obj, bArr, b);
        } else if (jVar.f20713e || jVar.f20712d != bArr.length) {
            updateObject(str, obj, bArr, jVar);
        } else {
            updateBytes(jVar.f20704a, bArr);
            jVar.f20710b = obj;
        }
        checkIfCommit();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r0v8, types: [com.mbridge.msdk.foundation.tools.b$h] */
    /* JADX WARNING: type inference failed for: r0v9, types: [com.mbridge.msdk.foundation.tools.b$a] */
    /* JADX WARNING: type inference failed for: r0v10, types: [com.mbridge.msdk.foundation.tools.b$i] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void addObject(java.lang.String r7, java.lang.Object r8, byte[] r9, byte r10) {
        /*
            r6 = this;
            int r2 = r6.saveArray(r7, r9, r10)
            if (r2 == 0) goto L_0x0047
            java.lang.String r0 = r6.tempExternalName
            if (r0 == 0) goto L_0x000c
            r0 = 1
            goto L_0x000d
        L_0x000c:
            r0 = 0
        L_0x000d:
            r5 = r0
            if (r5 == 0) goto L_0x001a
            r8 = 32
            java.lang.String r9 = r6.tempExternalName
            r0 = 0
            r6.tempExternalName = r0
            r4 = r8
            r3 = r9
            goto L_0x001d
        L_0x001a:
            int r9 = r9.length
            r3 = r8
            r4 = r9
        L_0x001d:
            r8 = 6
            if (r10 != r8) goto L_0x002b
            com.mbridge.msdk.foundation.tools.b$i r8 = new com.mbridge.msdk.foundation.tools.b$i
            int r1 = r6.updateStart
            java.lang.String r3 = (java.lang.String) r3
            r0 = r8
            r0.<init>(r1, r2, r3, r4, r5)
            goto L_0x003f
        L_0x002b:
            r8 = 7
            if (r10 != r8) goto L_0x0037
            com.mbridge.msdk.foundation.tools.b$a r8 = new com.mbridge.msdk.foundation.tools.b$a
            int r1 = r6.updateStart
            r0 = r8
            r0.<init>(r1, r2, r3, r4, r5)
            goto L_0x003f
        L_0x0037:
            com.mbridge.msdk.foundation.tools.b$h r8 = new com.mbridge.msdk.foundation.tools.b$h
            int r1 = r6.updateStart
            r0 = r8
            r0.<init>(r1, r2, r3, r4, r5)
        L_0x003f:
            java.util.Map<java.lang.String, com.mbridge.msdk.foundation.tools.b$b> r9 = r6.data
            r9.put(r7, r8)
            r6.updateChange()
        L_0x0047:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.tools.FastKV.addObject(java.lang.String, java.lang.Object, byte[], byte):void");
    }

    private void updateObject(String str, Object obj, byte[] bArr, C8562b.C8572j jVar) {
        int saveArray = saveArray(str, bArr, jVar.mo57748a());
        if (saveArray != 0) {
            String str2 = jVar.f20713e ? (String) jVar.f20710b : null;
            remove(jVar.mo57748a(), jVar.f20711c, jVar.f20704a + jVar.f20712d);
            boolean z = this.tempExternalName != null;
            jVar.f20711c = this.updateStart;
            jVar.f20704a = saveArray;
            jVar.f20713e = z;
            if (z) {
                jVar.f20710b = this.tempExternalName;
                jVar.f20712d = 32;
                this.tempExternalName = null;
            } else {
                jVar.f20710b = obj;
                jVar.f20712d = bArr.length;
            }
            updateChange();
            checkGC();
            if (str2 != null) {
                C8558ae.m24749c(new File(this.path + this.name, str2));
            }
        }
    }

    private int saveArray(String str, byte[] bArr, byte b) {
        this.tempExternalName = null;
        if (bArr.length < 2048) {
            return wrapArray(str, bArr, b);
        }
        info("large value, key: " + str + ", size: " + bArr.length);
        String a = C8558ae.m24742a();
        if (C8558ae.m24746a(new File(this.path + this.name, a), bArr)) {
            this.tempExternalName = a;
            byte[] bArr2 = new byte[32];
            a.getBytes(0, 32, bArr2, 0);
            return wrapArray(str, bArr2, (byte) (b | SignedBytes.MAX_POWER_OF_TWO));
        }
        error("save large value failed");
        return 0;
    }

    private int wrapArray(String str, byte[] bArr, byte b) {
        wrapHeader(str, b, bArr.length + 2);
        this.fastBuffer.mo57757a((short) bArr.length);
        int i = this.fastBuffer.f20732b;
        this.fastBuffer.mo57758a(bArr);
        return i;
    }

    private void remove(byte b, int i, int i2) {
        countInvalid(i, i2);
        byte b2 = (byte) (b | Byte.MIN_VALUE);
        this.checksum ^= (((long) (this.fastBuffer.f20731a[i] ^ b2)) & 255) << ((i & 7) << 3);
        this.fastBuffer.f20731a[i] = b2;
        this.removeStart = i;
    }

    private void checkGC() {
        if (this.invalidBytes < (bytesThreshold() << 1)) {
            if (this.invalids.size() < (this.dataEnd < 16384 ? 80 : 160)) {
                return;
            }
        }
        mo57704gc(0);
    }

    private void mergeInvalids() {
        int size = this.invalids.size() - 1;
        C8551c cVar = this.invalids.get(size);
        while (size > 0) {
            size--;
            C8551c cVar2 = this.invalids.get(size);
            if (cVar.f20695a == cVar2.f20696b) {
                cVar2.f20696b = cVar.f20696b;
                this.invalids.remove(size + 1);
            }
            cVar = cVar2;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: gc */
    public void mo57704gc(int i) {
        Collections.sort(this.invalids);
        mergeInvalids();
        C8551c cVar = this.invalids.get(0);
        int i2 = cVar.f20695a;
        int i3 = this.dataEnd;
        int i4 = i3 - this.invalidBytes;
        int i5 = i4 - 12;
        int i6 = i4 - i2;
        int i7 = i3 - i2;
        boolean z = i5 < i7 + i6;
        if (!z) {
            this.checksum ^= this.fastBuffer.mo57759b(i2, i7);
        }
        int size = this.invalids.size();
        int i8 = size - 1;
        int i9 = this.dataEnd - this.invalids.get(i8).f20696b;
        int[] iArr = new int[((i9 > 0 ? size : i8) << 1)];
        int i10 = cVar.f20695a;
        int i11 = cVar.f20696b;
        int i12 = 1;
        while (i12 < size) {
            C8551c cVar2 = this.invalids.get(i12);
            int i13 = cVar2.f20695a - i11;
            int i14 = size;
            System.arraycopy(this.fastBuffer.f20731a, i11, this.fastBuffer.f20731a, i10, i13);
            int i15 = (i12 - 1) << 1;
            iArr[i15] = i11;
            iArr[i15 + 1] = i11 - i10;
            i10 += i13;
            i11 = cVar2.f20696b;
            i12++;
            size = i14;
        }
        if (i9 > 0) {
            System.arraycopy(this.fastBuffer.f20731a, i11, this.fastBuffer.f20731a, i10, i9);
            int i16 = i8 << 1;
            iArr[i16] = i11;
            iArr[i16 + 1] = i11 - i10;
        }
        clearInvalid();
        if (z) {
            this.checksum = this.fastBuffer.mo57759b(12, i5);
        } else {
            this.checksum ^= this.fastBuffer.mo57759b(i2, i6);
        }
        this.dataEnd = i4;
        if (this.writingMode == 0) {
            this.aBuffer.putInt(0, -1);
            this.aBuffer.putLong(4, this.checksum);
            this.aBuffer.position(i2);
            this.aBuffer.put(this.fastBuffer.f20731a, i2, i6);
            this.aBuffer.putInt(0, i5);
            this.bBuffer.putInt(0, i5);
            this.bBuffer.putLong(4, this.checksum);
            this.bBuffer.position(i2);
            this.bBuffer.put(this.fastBuffer.f20731a, i2, i6);
        } else {
            this.fastBuffer.mo57753a(0, i5);
            this.fastBuffer.mo57754a(4, this.checksum);
        }
        updateOffset(i2, iArr);
        int i17 = i4 + i;
        if (this.fastBuffer.f20731a.length - i17 > TRUNCATE_THRESHOLD) {
            truncate(i17);
        }
        info(GC_FINISH);
    }

    private void updateOffset(int i, int[] iArr) {
        for (C8562b.C8564b next : this.data.values()) {
            if (next.f20704a > i) {
                int i2 = next.f20704a;
                int i3 = 0;
                int length = (iArr.length >> 1) - 1;
                while (true) {
                    if (i3 > length) {
                        break;
                    }
                    int i4 = (i3 + length) >>> 1;
                    int i5 = iArr[i4 << 1];
                    if (i5 >= i2) {
                        if (i5 <= i2) {
                            length = i4;
                            break;
                        }
                        length = i4 - 1;
                    } else {
                        i3 = i4 + 1;
                    }
                }
                int i6 = iArr[(length << 1) + 1];
                next.f20704a -= i6;
                if (next.mo57748a() >= 6) {
                    ((C8562b.C8572j) next).f20711c -= i6;
                }
            }
        }
    }

    private void truncate(int i) {
        int i2 = PAGE_SIZE;
        int newCapacity = getNewCapacity(i2, i + i2);
        if (newCapacity < this.fastBuffer.f20731a.length) {
            byte[] bArr = new byte[newCapacity];
            System.arraycopy(this.fastBuffer.f20731a, 0, bArr, 0, this.dataEnd);
            this.fastBuffer.f20731a = bArr;
            if (this.writingMode == 0) {
                try {
                    long j = (long) newCapacity;
                    this.aChannel.truncate(j);
                    MappedByteBuffer map = this.aChannel.map(FileChannel.MapMode.READ_WRITE, 0, j);
                    this.aBuffer = map;
                    map.order(ByteOrder.LITTLE_ENDIAN);
                    this.bChannel.truncate(j);
                    MappedByteBuffer map2 = this.bChannel.map(FileChannel.MapMode.READ_WRITE, 0, j);
                    this.bBuffer = map2;
                    map2.order(ByteOrder.LITTLE_ENDIAN);
                } catch (IOException e) {
                    error(new Exception(MAP_FAILED, e));
                    toBlockingMode();
                }
            }
            info(TRUNCATE_FINISH);
        }
    }

    private int getNewCapacity(int i, int i2) {
        if (i2 <= 536870912) {
            int i3 = PAGE_SIZE;
            if (i2 <= i3) {
                return i3;
            }
            while (i < i2) {
                int i4 = DOUBLE_LIMIT;
                i = i <= i4 ? i << 1 : i + i4;
            }
            return i;
        }
        throw new IllegalStateException("data size out of limit");
    }

    private void countInvalid(int i, int i2) {
        this.invalidBytes += i2 - i;
        this.invalids.add(new C8551c(i, i2));
    }

    private void clearInvalid() {
        this.invalidBytes = 0;
        this.invalids.clear();
    }

    /* renamed from: com.mbridge.msdk.foundation.tools.FastKV$c */
    private static class C8551c implements Comparable<C8551c> {

        /* renamed from: a */
        int f20695a;

        /* renamed from: b */
        int f20696b;

        public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
            return this.f20695a - ((C8551c) obj).f20695a;
        }

        C8551c(int i, int i2) {
            this.f20695a = i;
            this.f20696b = i2;
        }
    }

    private void error(String str) {
        C8550b bVar = this.logger;
        if (bVar != null) {
            bVar.mo57746b(this.name, new Exception(str));
        }
    }

    private void error(Exception exc) {
        C8550b bVar = this.logger;
        if (bVar != null) {
            bVar.mo57746b(this.name, exc);
        }
    }

    private void warning(Exception exc) {
        C8550b bVar = this.logger;
        if (bVar != null) {
            bVar.mo57744a(this.name, exc);
        }
    }

    private void info(String str) {
        C8550b bVar = this.logger;
        if (bVar != null) {
            bVar.mo57745a(this.name, str);
        }
    }

    public static class Builder {
        private static final Map<String, FastKV> INSTANCE_MAP = new ConcurrentHashMap();
        private C8549a[] encoders;
        private final String name;
        private final String path;
        private int writingMode = 0;

        public Builder(String str, String str2) {
            if (str == null || str.isEmpty()) {
                throw new IllegalArgumentException("path is empty");
            } else if (str2 == null || str2.isEmpty()) {
                throw new IllegalArgumentException("name is empty");
            } else {
                if (!str.endsWith("/")) {
                    str = str + '/';
                }
                this.path = str;
                this.name = str2;
            }
        }

        public Builder encoder(C8549a[] aVarArr) {
            this.encoders = aVarArr;
            return this;
        }

        public Builder blocking() {
            this.writingMode = 2;
            return this;
        }

        public Builder asyncBlocking() {
            this.writingMode = 1;
            return this;
        }

        public FastKV build() {
            String str = this.path + this.name;
            FastKV fastKV = INSTANCE_MAP.get(str);
            if (fastKV == null) {
                synchronized (Builder.class) {
                    fastKV = INSTANCE_MAP.get(str);
                    if (fastKV == null) {
                        fastKV = new FastKV(this.path, this.name, this.encoders, this.writingMode);
                        INSTANCE_MAP.put(str, fastKV);
                    }
                }
            }
            return fastKV;
        }
    }

    public synchronized String toString() {
        return "FastKV: path:" + this.path + " name:" + this.name;
    }
}

package com.google.android.play.core.internal;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* compiled from: com.google.android.play:core@@1.10.3 */
public final class zzcl {
    public static long zza(zzcm zzcm, InputStream inputStream, OutputStream outputStream, long j) throws IOException {
        String str;
        byte[] bArr = new byte[16384];
        InputStream inputStream2 = inputStream;
        DataInputStream dataInputStream = new DataInputStream(new BufferedInputStream(inputStream, 4096));
        int readInt = dataInputStream.readInt();
        if (readInt != -771763713) {
            String valueOf = String.valueOf(String.format("%x", new Object[]{Integer.valueOf(readInt)}));
            if (valueOf.length() != 0) {
                str = "Unexpected magic=".concat(valueOf);
            } else {
                str = new String("Unexpected magic=");
            }
            throw new zzck(str);
        }
        int read = dataInputStream.read();
        if (read == 4) {
            long j2 = 0;
            while (true) {
                long j3 = j - j2;
                try {
                    int read2 = dataInputStream.read();
                    if (read2 == -1) {
                        throw new IOException("Patch file overrun");
                    } else if (read2 == 0) {
                        return j2;
                    } else {
                        switch (read2) {
                            case 247:
                                read2 = dataInputStream.readUnsignedShort();
                                zzc(bArr, dataInputStream, outputStream, read2, j3);
                                break;
                            case 248:
                                read2 = dataInputStream.readInt();
                                zzc(bArr, dataInputStream, outputStream, read2, j3);
                                break;
                            case 249:
                                long readUnsignedShort = (long) dataInputStream.readUnsignedShort();
                                read2 = dataInputStream.read();
                                if (read2 != -1) {
                                    zzb(bArr, zzcm, outputStream, readUnsignedShort, read2, j3);
                                    break;
                                } else {
                                    throw new IOException("Unexpected end of patch");
                                }
                            case 250:
                                long readUnsignedShort2 = (long) dataInputStream.readUnsignedShort();
                                read2 = dataInputStream.readUnsignedShort();
                                zzb(bArr, zzcm, outputStream, readUnsignedShort2, read2, j3);
                                break;
                            case 251:
                                long readUnsignedShort3 = (long) dataInputStream.readUnsignedShort();
                                read2 = dataInputStream.readInt();
                                zzb(bArr, zzcm, outputStream, readUnsignedShort3, read2, j3);
                                break;
                            case 252:
                                long readInt2 = (long) dataInputStream.readInt();
                                read2 = dataInputStream.read();
                                if (read2 != -1) {
                                    zzb(bArr, zzcm, outputStream, readInt2, read2, j3);
                                    break;
                                } else {
                                    throw new IOException("Unexpected end of patch");
                                }
                            case 253:
                                long readInt3 = (long) dataInputStream.readInt();
                                read2 = dataInputStream.readUnsignedShort();
                                zzb(bArr, zzcm, outputStream, readInt3, read2, j3);
                                break;
                            case 254:
                                long readInt4 = (long) dataInputStream.readInt();
                                read2 = dataInputStream.readInt();
                                zzb(bArr, zzcm, outputStream, readInt4, read2, j3);
                                break;
                            case 255:
                                long readLong = dataInputStream.readLong();
                                read2 = dataInputStream.readInt();
                                zzb(bArr, zzcm, outputStream, readLong, read2, j3);
                                break;
                            default:
                                zzc(bArr, dataInputStream, outputStream, read2, j3);
                                break;
                        }
                        j2 += (long) read2;
                    }
                } finally {
                    outputStream.flush();
                }
            }
        } else {
            StringBuilder sb = new StringBuilder(30);
            sb.append("Unexpected version=");
            sb.append(read);
            throw new zzck(sb.toString());
        }
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:22:0x0041 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void zzb(byte[] r7, com.google.android.play.core.internal.zzcm r8, java.io.OutputStream r9, long r10, int r12, long r13) throws java.io.IOException {
        /*
            if (r12 < 0) goto L_0x005f
            r0 = 0
            int r0 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x0057
            long r5 = (long) r12
            int r13 = (r5 > r13 ? 1 : (r5 == r13 ? 0 : -1))
            if (r13 > 0) goto L_0x004f
            com.google.android.play.core.internal.zzcn r13 = new com.google.android.play.core.internal.zzcn     // Catch:{ EOFException -> 0x0046 }
            r1 = r13
            r2 = r8
            r3 = r10
            r1.<init>(r2, r3, r5)     // Catch:{ EOFException -> 0x0046 }
            java.io.InputStream r8 = r13.zzc()     // Catch:{ EOFException -> 0x0046 }
        L_0x0019:
            if (r12 <= 0) goto L_0x0042
            r10 = 16384(0x4000, float:2.2959E-41)
            int r10 = java.lang.Math.min(r12, r10)     // Catch:{ all -> 0x003d }
            r11 = 0
            r13 = r11
        L_0x0023:
            if (r13 >= r10) goto L_0x0038
            int r14 = r10 - r13
            int r14 = r8.read(r7, r13, r14)     // Catch:{ all -> 0x003d }
            r0 = -1
            if (r14 == r0) goto L_0x0030
            int r13 = r13 + r14
            goto L_0x0023
        L_0x0030:
            java.io.IOException r7 = new java.io.IOException     // Catch:{ all -> 0x003d }
            java.lang.String r9 = "truncated input stream"
            r7.<init>(r9)     // Catch:{ all -> 0x003d }
            throw r7     // Catch:{ all -> 0x003d }
        L_0x0038:
            r9.write(r7, r11, r10)     // Catch:{ all -> 0x003d }
            int r12 = r12 - r10
            goto L_0x0019
        L_0x003d:
            r7 = move-exception
            r8.close()     // Catch:{ all -> 0x0041 }
        L_0x0041:
            throw r7     // Catch:{ EOFException -> 0x0046 }
        L_0x0042:
            r8.close()     // Catch:{ EOFException -> 0x0046 }
            return
        L_0x0046:
            r7 = move-exception
            java.io.IOException r8 = new java.io.IOException
            java.lang.String r9 = "patch underrun"
            r8.<init>(r9, r7)
            throw r8
        L_0x004f:
            java.io.IOException r7 = new java.io.IOException
            java.lang.String r8 = "Output length overrun"
            r7.<init>(r8)
            throw r7
        L_0x0057:
            java.io.IOException r7 = new java.io.IOException
            java.lang.String r8 = "inputOffset negative"
            r7.<init>(r8)
            throw r7
        L_0x005f:
            java.io.IOException r7 = new java.io.IOException
            java.lang.String r8 = "copyLength negative"
            r7.<init>(r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.internal.zzcl.zzb(byte[], com.google.android.play.core.internal.zzcm, java.io.OutputStream, long, int, long):void");
    }

    private static void zzc(byte[] bArr, DataInputStream dataInputStream, OutputStream outputStream, int i, long j) throws IOException {
        if (i < 0) {
            throw new IOException("copyLength negative");
        } else if (((long) i) <= j) {
            while (i > 0) {
                try {
                    int min = Math.min(i, 16384);
                    dataInputStream.readFully(bArr, 0, min);
                    outputStream.write(bArr, 0, min);
                    i -= min;
                } catch (EOFException unused) {
                    throw new IOException("patch underrun");
                }
            }
        } else {
            throw new IOException("Output length overrun");
        }
    }
}

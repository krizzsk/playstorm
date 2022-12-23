package com.google.android.exoplayer2.upstream;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import com.facebook.internal.security.CertificateUtil;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.FileChannel;

public final class RawResourceDataSource extends BaseDataSource {
    public static final String RAW_RESOURCE_SCHEME = "rawresource";
    private AssetFileDescriptor assetFileDescriptor;
    private long bytesRemaining;
    private InputStream inputStream;
    private boolean opened;
    private final String packageName;
    private final Resources resources;
    private Uri uri;

    public static class RawResourceDataSourceException extends DataSourceException {
        @Deprecated
        public RawResourceDataSourceException(String str) {
            super(str, (Throwable) null, 2000);
        }

        @Deprecated
        public RawResourceDataSourceException(Throwable th) {
            super(th, 2000);
        }

        public RawResourceDataSourceException(String str, Throwable th, int i) {
            super(str, th, i);
        }
    }

    public static Uri buildRawResourceUri(int i) {
        StringBuilder sb = new StringBuilder(26);
        sb.append("rawresource:///");
        sb.append(i);
        return Uri.parse(sb.toString());
    }

    public RawResourceDataSource(Context context) {
        super(false);
        this.resources = context.getResources();
        this.packageName = context.getPackageName();
    }

    public long open(DataSpec dataSpec) throws RawResourceDataSourceException {
        int i;
        DataSpec dataSpec2 = dataSpec;
        Uri uri2 = dataSpec2.uri;
        this.uri = uri2;
        if (TextUtils.equals("rawresource", uri2.getScheme()) || (TextUtils.equals("android.resource", uri2.getScheme()) && uri2.getPathSegments().size() == 1 && ((String) Assertions.checkNotNull(uri2.getLastPathSegment())).matches("\\d+"))) {
            try {
                i = Integer.parseInt((String) Assertions.checkNotNull(uri2.getLastPathSegment()));
            } catch (NumberFormatException unused) {
                throw new RawResourceDataSourceException("Resource identifier must be an integer.", (Throwable) null, 1004);
            }
        } else if (TextUtils.equals("android.resource", uri2.getScheme())) {
            String str = (String) Assertions.checkNotNull(uri2.getPath());
            if (str.startsWith("/")) {
                str = str.substring(1);
            }
            String host = uri2.getHost();
            String valueOf = String.valueOf(TextUtils.isEmpty(host) ? "" : String.valueOf(host).concat(CertificateUtil.DELIMITER));
            String valueOf2 = String.valueOf(str);
            i = this.resources.getIdentifier(valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf), "raw", this.packageName);
            if (i == 0) {
                throw new RawResourceDataSourceException("Resource not found.", (Throwable) null, 2005);
            }
        } else {
            throw new RawResourceDataSourceException("URI must either use scheme rawresource or android.resource", (Throwable) null, 1004);
        }
        transferInitializing(dataSpec);
        try {
            AssetFileDescriptor openRawResourceFd = this.resources.openRawResourceFd(i);
            this.assetFileDescriptor = openRawResourceFd;
            if (openRawResourceFd != null) {
                long length = openRawResourceFd.getLength();
                FileInputStream fileInputStream = new FileInputStream(openRawResourceFd.getFileDescriptor());
                this.inputStream = fileInputStream;
                int i2 = (length > -1 ? 1 : (length == -1 ? 0 : -1));
                if (i2 != 0) {
                    try {
                        if (dataSpec2.position > length) {
                            throw new RawResourceDataSourceException((String) null, (Throwable) null, 2008);
                        }
                    } catch (RawResourceDataSourceException e) {
                        throw e;
                    } catch (IOException e2) {
                        throw new RawResourceDataSourceException((String) null, e2, 2000);
                    }
                }
                long startOffset = openRawResourceFd.getStartOffset();
                long skip = fileInputStream.skip(dataSpec2.position + startOffset) - startOffset;
                if (skip == dataSpec2.position) {
                    if (i2 == 0) {
                        FileChannel channel = fileInputStream.getChannel();
                        if (channel.size() == 0) {
                            this.bytesRemaining = -1;
                        } else {
                            long size = channel.size() - channel.position();
                            this.bytesRemaining = size;
                            if (size < 0) {
                                throw new RawResourceDataSourceException((String) null, (Throwable) null, 2008);
                            }
                        }
                    } else {
                        long j = length - skip;
                        this.bytesRemaining = j;
                        if (j < 0) {
                            throw new DataSourceException(2008);
                        }
                    }
                    if (dataSpec2.length != -1) {
                        long j2 = this.bytesRemaining;
                        this.bytesRemaining = j2 == -1 ? dataSpec2.length : Math.min(j2, dataSpec2.length);
                    }
                    this.opened = true;
                    transferStarted(dataSpec);
                    return dataSpec2.length != -1 ? dataSpec2.length : this.bytesRemaining;
                }
                throw new RawResourceDataSourceException((String) null, (Throwable) null, 2008);
            }
            String valueOf3 = String.valueOf(uri2);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf3).length() + 24);
            sb.append("Resource is compressed: ");
            sb.append(valueOf3);
            throw new RawResourceDataSourceException(sb.toString(), (Throwable) null, 2000);
        } catch (Resources.NotFoundException e3) {
            throw new RawResourceDataSourceException((String) null, e3, 2005);
        }
    }

    public int read(byte[] bArr, int i, int i2) throws RawResourceDataSourceException {
        if (i2 == 0) {
            return 0;
        }
        long j = this.bytesRemaining;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            try {
                i2 = (int) Math.min(j, (long) i2);
            } catch (IOException e) {
                throw new RawResourceDataSourceException((String) null, e, 2000);
            }
        }
        int read = ((InputStream) Util.castNonNull(this.inputStream)).read(bArr, i, i2);
        if (read != -1) {
            long j2 = this.bytesRemaining;
            if (j2 != -1) {
                this.bytesRemaining = j2 - ((long) read);
            }
            bytesTransferred(read);
            return read;
        } else if (this.bytesRemaining == -1) {
            return -1;
        } else {
            throw new RawResourceDataSourceException("End of stream reached having not read sufficient data.", new EOFException(), 2000);
        }
    }

    public Uri getUri() {
        return this.uri;
    }

    public void close() throws RawResourceDataSourceException {
        this.uri = null;
        try {
            if (this.inputStream != null) {
                this.inputStream.close();
            }
            this.inputStream = null;
            try {
                if (this.assetFileDescriptor != null) {
                    this.assetFileDescriptor.close();
                }
                this.assetFileDescriptor = null;
                if (this.opened) {
                    this.opened = false;
                    transferEnded();
                }
            } catch (IOException e) {
                throw new RawResourceDataSourceException((String) null, e, 2000);
            } catch (Throwable th) {
                this.assetFileDescriptor = null;
                if (this.opened) {
                    this.opened = false;
                    transferEnded();
                }
                throw th;
            }
        } catch (IOException e2) {
            throw new RawResourceDataSourceException((String) null, e2, 2000);
        } catch (Throwable th2) {
            this.inputStream = null;
            try {
                if (this.assetFileDescriptor != null) {
                    this.assetFileDescriptor.close();
                }
                this.assetFileDescriptor = null;
                if (this.opened) {
                    this.opened = false;
                    transferEnded();
                }
                throw th2;
            } catch (IOException e3) {
                throw new RawResourceDataSourceException((String) null, e3, 2000);
            } catch (Throwable th3) {
                this.assetFileDescriptor = null;
                if (this.opened) {
                    this.opened = false;
                    transferEnded();
                }
                throw th3;
            }
        }
    }
}

package com.smaato.sdk.core.resourceloader;

import com.mbridge.msdk.foundation.tools.SameMD5;
import com.smaato.sdk.core.util.Objects;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Md5Digester {
    private final Charset charset;
    private final HexEncoder hexEncoder;

    public Md5Digester(Charset charset2, HexEncoder hexEncoder2) {
        this.charset = (Charset) Objects.requireNonNull(charset2);
        this.hexEncoder = (HexEncoder) Objects.requireNonNull(hexEncoder2);
    }

    public String md5Hex(String str) throws NoSuchAlgorithmException {
        Objects.requireNonNull(str);
        return this.hexEncoder.encodeHexString(getMd5Digest().digest(str.getBytes(this.charset)));
    }

    private synchronized MessageDigest getMd5Digest() throws NoSuchAlgorithmException {
        return MessageDigest.getInstance(SameMD5.TAG);
    }
}

package com.google.android.gms.internal.ads;

import java.security.interfaces.ECPublicKey;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzghn {
    private final ECPublicKey zza;

    public zzghn(ECPublicKey eCPublicKey) {
        this.zza = eCPublicKey;
    }

    /* JADX WARNING: Removed duplicated region for block: B:100:0x0323  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0205 A[Catch:{ IllegalStateException -> 0x033b }] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0232  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x028c  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x02cc  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.zzghm zza(java.lang.String r17, byte[] r18, byte[] r19, int r20, int r21) throws java.security.GeneralSecurityException {
        /*
            r16 = this;
            r1 = r16
            r0 = r17
            r2 = r18
            r3 = r20
            java.security.interfaces.ECPublicKey r4 = r1.zza
            java.security.spec.ECParameterSpec r4 = r4.getParams()
            java.security.KeyPair r4 = com.google.android.gms.internal.ads.zzgho.zzb(r4)
            java.security.PublicKey r5 = r4.getPublic()
            java.security.interfaces.ECPublicKey r5 = (java.security.interfaces.ECPublicKey) r5
            java.security.PrivateKey r4 = r4.getPrivate()
            java.security.interfaces.ECPrivateKey r4 = (java.security.interfaces.ECPrivateKey) r4
            java.security.interfaces.ECPublicKey r6 = r1.zza
            java.security.spec.ECParameterSpec r7 = r6.getParams()     // Catch:{ IllegalArgumentException -> 0x0350, NullPointerException -> 0x034e }
            java.security.spec.ECParameterSpec r8 = r4.getParams()     // Catch:{ IllegalArgumentException -> 0x0350, NullPointerException -> 0x034e }
            java.security.spec.EllipticCurve r9 = r7.getCurve()     // Catch:{ IllegalArgumentException -> 0x0350, NullPointerException -> 0x034e }
            java.security.spec.EllipticCurve r10 = r8.getCurve()     // Catch:{ IllegalArgumentException -> 0x0350, NullPointerException -> 0x034e }
            boolean r9 = r9.equals(r10)     // Catch:{ IllegalArgumentException -> 0x0350, NullPointerException -> 0x034e }
            if (r9 == 0) goto L_0x0346
            java.security.spec.ECPoint r9 = r7.getGenerator()     // Catch:{ IllegalArgumentException -> 0x0350, NullPointerException -> 0x034e }
            java.security.spec.ECPoint r10 = r8.getGenerator()     // Catch:{ IllegalArgumentException -> 0x0350, NullPointerException -> 0x034e }
            boolean r9 = r9.equals(r10)     // Catch:{ IllegalArgumentException -> 0x0350, NullPointerException -> 0x034e }
            if (r9 == 0) goto L_0x0346
            java.math.BigInteger r9 = r7.getOrder()     // Catch:{ IllegalArgumentException -> 0x0350, NullPointerException -> 0x034e }
            java.math.BigInteger r10 = r8.getOrder()     // Catch:{ IllegalArgumentException -> 0x0350, NullPointerException -> 0x034e }
            boolean r9 = r9.equals(r10)     // Catch:{ IllegalArgumentException -> 0x0350, NullPointerException -> 0x034e }
            if (r9 == 0) goto L_0x0346
            int r7 = r7.getCofactor()     // Catch:{ IllegalArgumentException -> 0x0350, NullPointerException -> 0x034e }
            int r8 = r8.getCofactor()     // Catch:{ IllegalArgumentException -> 0x0350, NullPointerException -> 0x034e }
            if (r7 != r8) goto L_0x0346
            java.security.spec.ECPoint r6 = r6.getW()
            java.security.spec.ECParameterSpec r7 = r4.getParams()
            java.security.spec.EllipticCurve r7 = r7.getCurve()
            com.google.android.gms.internal.ads.zzgho.zzc(r6, r7)
            java.security.spec.ECParameterSpec r7 = r4.getParams()
            java.security.spec.ECPublicKeySpec r8 = new java.security.spec.ECPublicKeySpec
            r8.<init>(r6, r7)
            com.google.android.gms.internal.ads.zzghq r6 = com.google.android.gms.internal.ads.zzghq.zzg
            java.lang.String r7 = "EC"
            java.lang.Object r6 = r6.zza(r7)
            java.security.KeyFactory r6 = (java.security.KeyFactory) r6
            java.security.PublicKey r6 = r6.generatePublic(r8)
            com.google.android.gms.internal.ads.zzghq r7 = com.google.android.gms.internal.ads.zzghq.zze
            java.lang.String r8 = "ECDH"
            java.lang.Object r7 = r7.zza(r8)
            javax.crypto.KeyAgreement r7 = (javax.crypto.KeyAgreement) r7
            r7.init(r4)
            r8 = 1
            r7.doPhase(r6, r8)     // Catch:{ IllegalStateException -> 0x033b }
            byte[] r6 = r7.generateSecret()     // Catch:{ IllegalStateException -> 0x033b }
            java.security.spec.ECParameterSpec r4 = r4.getParams()     // Catch:{ IllegalStateException -> 0x033b }
            java.security.spec.EllipticCurve r4 = r4.getCurve()     // Catch:{ IllegalStateException -> 0x033b }
            java.math.BigInteger r7 = new java.math.BigInteger     // Catch:{ IllegalStateException -> 0x033b }
            r7.<init>(r8, r6)     // Catch:{ IllegalStateException -> 0x033b }
            int r9 = r7.signum()     // Catch:{ IllegalStateException -> 0x033b }
            r10 = -1
            if (r9 == r10) goto L_0x0333
            java.math.BigInteger r9 = com.google.android.gms.internal.ads.zzgho.zza(r4)     // Catch:{ IllegalStateException -> 0x033b }
            int r9 = r7.compareTo(r9)     // Catch:{ IllegalStateException -> 0x033b }
            if (r9 >= 0) goto L_0x0333
            java.math.BigInteger r9 = com.google.android.gms.internal.ads.zzgho.zza(r4)     // Catch:{ IllegalStateException -> 0x033b }
            java.math.BigInteger r11 = r4.getA()     // Catch:{ IllegalStateException -> 0x033b }
            java.math.BigInteger r4 = r4.getB()     // Catch:{ IllegalStateException -> 0x033b }
            java.math.BigInteger r12 = r7.multiply(r7)     // Catch:{ IllegalStateException -> 0x033b }
            java.math.BigInteger r11 = r12.add(r11)     // Catch:{ IllegalStateException -> 0x033b }
            java.math.BigInteger r7 = r11.multiply(r7)     // Catch:{ IllegalStateException -> 0x033b }
            java.math.BigInteger r4 = r7.add(r4)     // Catch:{ IllegalStateException -> 0x033b }
            java.math.BigInteger r4 = r4.mod(r9)     // Catch:{ IllegalStateException -> 0x033b }
            int r7 = r9.signum()     // Catch:{ IllegalStateException -> 0x033b }
            if (r7 != r8) goto L_0x032b
            java.math.BigInteger r4 = r4.mod(r9)     // Catch:{ IllegalStateException -> 0x033b }
            java.math.BigInteger r7 = java.math.BigInteger.ZERO     // Catch:{ IllegalStateException -> 0x033b }
            boolean r7 = r4.equals(r7)     // Catch:{ IllegalStateException -> 0x033b }
            r11 = 2
            r12 = 0
            if (r7 == 0) goto L_0x00ee
            java.math.BigInteger r4 = java.math.BigInteger.ZERO     // Catch:{ IllegalStateException -> 0x033b }
        L_0x00eb:
            r7 = r12
            goto L_0x01fe
        L_0x00ee:
            boolean r7 = r9.testBit(r12)     // Catch:{ IllegalStateException -> 0x033b }
            r13 = 0
            if (r7 == 0) goto L_0x010c
            boolean r7 = r9.testBit(r8)     // Catch:{ IllegalStateException -> 0x033b }
            if (r7 == 0) goto L_0x010c
            java.math.BigInteger r7 = java.math.BigInteger.ONE     // Catch:{ IllegalStateException -> 0x033b }
            java.math.BigInteger r7 = r9.add(r7)     // Catch:{ IllegalStateException -> 0x033b }
            java.math.BigInteger r7 = r7.shiftRight(r11)     // Catch:{ IllegalStateException -> 0x033b }
            java.math.BigInteger r7 = r4.modPow(r7, r9)     // Catch:{ IllegalStateException -> 0x033b }
            r13 = r7
            goto L_0x01e3
        L_0x010c:
            boolean r7 = r9.testBit(r12)     // Catch:{ IllegalStateException -> 0x033b }
            if (r7 == 0) goto L_0x01e3
            boolean r7 = r9.testBit(r8)     // Catch:{ IllegalStateException -> 0x033b }
            if (r7 != 0) goto L_0x01e3
            java.math.BigInteger r7 = java.math.BigInteger.ONE     // Catch:{ IllegalStateException -> 0x033b }
            java.math.BigInteger r13 = java.math.BigInteger.ONE     // Catch:{ IllegalStateException -> 0x033b }
            java.math.BigInteger r13 = r9.subtract(r13)     // Catch:{ IllegalStateException -> 0x033b }
            java.math.BigInteger r13 = r13.shiftRight(r8)     // Catch:{ IllegalStateException -> 0x033b }
            r14 = r12
        L_0x0125:
            java.math.BigInteger r15 = r7.multiply(r7)     // Catch:{ IllegalStateException -> 0x033b }
            java.math.BigInteger r15 = r15.subtract(r4)     // Catch:{ IllegalStateException -> 0x033b }
            java.math.BigInteger r15 = r15.mod(r9)     // Catch:{ IllegalStateException -> 0x033b }
            java.math.BigInteger r11 = java.math.BigInteger.ZERO     // Catch:{ IllegalStateException -> 0x033b }
            boolean r11 = r15.equals(r11)     // Catch:{ IllegalStateException -> 0x033b }
            if (r11 != 0) goto L_0x01e0
            java.math.BigInteger r11 = r15.modPow(r13, r9)     // Catch:{ IllegalStateException -> 0x033b }
            java.math.BigInteger r10 = java.math.BigInteger.ONE     // Catch:{ IllegalStateException -> 0x033b }
            java.math.BigInteger r10 = r11.add(r10)     // Catch:{ IllegalStateException -> 0x033b }
            boolean r10 = r10.equals(r9)     // Catch:{ IllegalStateException -> 0x033b }
            if (r10 == 0) goto L_0x01af
            java.math.BigInteger r10 = java.math.BigInteger.ONE     // Catch:{ IllegalStateException -> 0x033b }
            java.math.BigInteger r10 = r9.add(r10)     // Catch:{ IllegalStateException -> 0x033b }
            java.math.BigInteger r10 = r10.shiftRight(r8)     // Catch:{ IllegalStateException -> 0x033b }
            java.math.BigInteger r11 = java.math.BigInteger.ONE     // Catch:{ IllegalStateException -> 0x033b }
            int r13 = r10.bitLength()     // Catch:{ IllegalStateException -> 0x033b }
            int r13 = r13 + -2
            r14 = r7
        L_0x015c:
            if (r13 < 0) goto L_0x01ad
            java.math.BigInteger r12 = r14.multiply(r11)     // Catch:{ IllegalStateException -> 0x033b }
            java.math.BigInteger r14 = r14.multiply(r14)     // Catch:{ IllegalStateException -> 0x033b }
            java.math.BigInteger r11 = r11.multiply(r11)     // Catch:{ IllegalStateException -> 0x033b }
            java.math.BigInteger r11 = r11.mod(r9)     // Catch:{ IllegalStateException -> 0x033b }
            java.math.BigInteger r11 = r11.multiply(r15)     // Catch:{ IllegalStateException -> 0x033b }
            java.math.BigInteger r11 = r14.add(r11)     // Catch:{ IllegalStateException -> 0x033b }
            java.math.BigInteger r11 = r11.mod(r9)     // Catch:{ IllegalStateException -> 0x033b }
            java.math.BigInteger r12 = r12.add(r12)     // Catch:{ IllegalStateException -> 0x033b }
            java.math.BigInteger r12 = r12.mod(r9)     // Catch:{ IllegalStateException -> 0x033b }
            boolean r14 = r10.testBit(r13)     // Catch:{ IllegalStateException -> 0x033b }
            if (r14 == 0) goto L_0x01a6
            java.math.BigInteger r14 = r11.multiply(r7)     // Catch:{ IllegalStateException -> 0x033b }
            java.math.BigInteger r8 = r12.multiply(r15)     // Catch:{ IllegalStateException -> 0x033b }
            java.math.BigInteger r8 = r14.add(r8)     // Catch:{ IllegalStateException -> 0x033b }
            java.math.BigInteger r8 = r8.mod(r9)     // Catch:{ IllegalStateException -> 0x033b }
            java.math.BigInteger r12 = r7.multiply(r12)     // Catch:{ IllegalStateException -> 0x033b }
            java.math.BigInteger r11 = r12.add(r11)     // Catch:{ IllegalStateException -> 0x033b }
            java.math.BigInteger r11 = r11.mod(r9)     // Catch:{ IllegalStateException -> 0x033b }
            r14 = r8
            goto L_0x01a8
        L_0x01a6:
            r14 = r11
            r11 = r12
        L_0x01a8:
            int r13 = r13 + -1
            r8 = 1
            r12 = 0
            goto L_0x015c
        L_0x01ad:
            r13 = r14
            goto L_0x01e3
        L_0x01af:
            java.math.BigInteger r8 = java.math.BigInteger.ONE     // Catch:{ IllegalStateException -> 0x033b }
            boolean r8 = r11.equals(r8)     // Catch:{ IllegalStateException -> 0x033b }
            java.lang.String r10 = "p is not prime"
            if (r8 == 0) goto L_0x01da
            java.math.BigInteger r8 = java.math.BigInteger.ONE     // Catch:{ IllegalStateException -> 0x033b }
            java.math.BigInteger r7 = r7.add(r8)     // Catch:{ IllegalStateException -> 0x033b }
            r8 = 1
            int r14 = r14 + r8
            r8 = 128(0x80, float:1.794E-43)
            if (r14 != r8) goto L_0x01d4
            r8 = 80
            boolean r8 = r9.isProbablePrime(r8)     // Catch:{ IllegalStateException -> 0x033b }
            if (r8 == 0) goto L_0x01ce
            goto L_0x01d4
        L_0x01ce:
            java.security.InvalidAlgorithmParameterException r0 = new java.security.InvalidAlgorithmParameterException     // Catch:{ IllegalStateException -> 0x033b }
            r0.<init>(r10)     // Catch:{ IllegalStateException -> 0x033b }
            throw r0     // Catch:{ IllegalStateException -> 0x033b }
        L_0x01d4:
            r8 = 1
            r10 = -1
            r11 = 2
            r12 = 0
            goto L_0x0125
        L_0x01da:
            java.security.InvalidAlgorithmParameterException r0 = new java.security.InvalidAlgorithmParameterException     // Catch:{ IllegalStateException -> 0x033b }
            r0.<init>(r10)     // Catch:{ IllegalStateException -> 0x033b }
            throw r0     // Catch:{ IllegalStateException -> 0x033b }
        L_0x01e0:
            r4 = r7
            goto L_0x00eb
        L_0x01e3:
            if (r13 == 0) goto L_0x01fc
            java.math.BigInteger r7 = r13.multiply(r13)     // Catch:{ IllegalStateException -> 0x033b }
            java.math.BigInteger r7 = r7.mod(r9)     // Catch:{ IllegalStateException -> 0x033b }
            int r4 = r7.compareTo(r4)     // Catch:{ IllegalStateException -> 0x033b }
            if (r4 != 0) goto L_0x01f4
            goto L_0x01fc
        L_0x01f4:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException     // Catch:{ IllegalStateException -> 0x033b }
            java.lang.String r2 = "Could not find a modular square root"
            r0.<init>(r2)     // Catch:{ IllegalStateException -> 0x033b }
            throw r0     // Catch:{ IllegalStateException -> 0x033b }
        L_0x01fc:
            r4 = r13
            r7 = 0
        L_0x01fe:
            boolean r8 = r4.testBit(r7)     // Catch:{ IllegalStateException -> 0x033b }
            r7 = 1
            if (r8 == r7) goto L_0x020c
            java.math.BigInteger r4 = r9.subtract(r4)     // Catch:{ IllegalStateException -> 0x033b }
            r4.mod(r9)     // Catch:{ IllegalStateException -> 0x033b }
        L_0x020c:
            java.security.spec.ECParameterSpec r4 = r5.getParams()
            java.security.spec.EllipticCurve r4 = r4.getCurve()
            java.security.spec.ECPoint r5 = r5.getW()
            com.google.android.gms.internal.ads.zzgho.zzc(r5, r4)
            java.math.BigInteger r4 = com.google.android.gms.internal.ads.zzgho.zza(r4)
            java.math.BigInteger r7 = java.math.BigInteger.ONE
            java.math.BigInteger r4 = r4.subtract(r7)
            int r4 = r4.bitLength()
            int r4 = r4 + 7
            int r4 = r4 / 8
            r7 = -1
            int r7 = r21 + -1
            if (r7 == 0) goto L_0x028c
            r8 = 2
            if (r7 == r8) goto L_0x0257
            r7 = 1
            int r4 = r4 + r7
            byte[] r8 = new byte[r4]
            java.math.BigInteger r9 = r5.getAffineX()
            byte[] r9 = r9.toByteArray()
            int r10 = r9.length
            int r4 = r4 - r10
            r11 = 0
            java.lang.System.arraycopy(r9, r11, r8, r4, r10)
            java.math.BigInteger r4 = r5.getAffineY()
            boolean r4 = r4.testBit(r11)
            if (r7 == r4) goto L_0x0253
            r4 = 2
            goto L_0x0254
        L_0x0253:
            r4 = 3
        L_0x0254:
            r8[r11] = r4
            goto L_0x0288
        L_0x0257:
            int r7 = r4 + r4
            byte[] r8 = new byte[r7]
            java.math.BigInteger r9 = r5.getAffineX()
            byte[] r9 = r9.toByteArray()
            int r10 = r9.length
            if (r10 <= r4) goto L_0x026c
            int r11 = r10 - r4
            byte[] r9 = java.util.Arrays.copyOfRange(r9, r11, r10)
        L_0x026c:
            java.math.BigInteger r5 = r5.getAffineY()
            byte[] r5 = r5.toByteArray()
            int r10 = r5.length
            if (r10 <= r4) goto L_0x027d
            int r11 = r10 - r4
            byte[] r5 = java.util.Arrays.copyOfRange(r5, r11, r10)
        L_0x027d:
            int r10 = r5.length
            int r7 = r7 - r10
            r11 = 0
            java.lang.System.arraycopy(r5, r11, r8, r7, r10)
            int r5 = r9.length
            int r4 = r4 - r5
            java.lang.System.arraycopy(r9, r11, r8, r4, r5)
        L_0x0288:
            r9 = r8
            r4 = 2
            r8 = 1
            goto L_0x02b2
        L_0x028c:
            r11 = 0
            int r7 = r4 + r4
            r8 = 1
            int r7 = r7 + r8
            byte[] r9 = new byte[r7]
            java.math.BigInteger r10 = r5.getAffineX()
            byte[] r10 = r10.toByteArray()
            java.math.BigInteger r5 = r5.getAffineY()
            byte[] r5 = r5.toByteArray()
            int r12 = r5.length
            int r7 = r7 - r12
            java.lang.System.arraycopy(r5, r11, r9, r7, r12)
            int r5 = r10.length
            int r4 = r4 + r8
            int r4 = r4 - r5
            java.lang.System.arraycopy(r10, r11, r9, r4, r5)
            r4 = 4
            r9[r11] = r4
            r4 = 2
        L_0x02b2:
            byte[][] r4 = new byte[r4][]
            r4[r11] = r9
            r4[r8] = r6
            byte[] r4 = com.google.android.gms.internal.ads.zzghf.zzc(r4)
            com.google.android.gms.internal.ads.zzghq r5 = com.google.android.gms.internal.ads.zzghq.zzb
            java.lang.Object r5 = r5.zza(r0)
            javax.crypto.Mac r5 = (javax.crypto.Mac) r5
            int r6 = r5.getMacLength()
            int r6 = r6 * 255
            if (r3 > r6) goto L_0x0323
            if (r2 == 0) goto L_0x02db
            int r6 = r2.length
            if (r6 != 0) goto L_0x02d2
            goto L_0x02db
        L_0x02d2:
            javax.crypto.spec.SecretKeySpec r6 = new javax.crypto.spec.SecretKeySpec
            r6.<init>(r2, r0)
            r5.init(r6)
            goto L_0x02e9
        L_0x02db:
            javax.crypto.spec.SecretKeySpec r2 = new javax.crypto.spec.SecretKeySpec
            int r6 = r5.getMacLength()
            byte[] r6 = new byte[r6]
            r2.<init>(r6, r0)
            r5.init(r2)
        L_0x02e9:
            byte[] r2 = r5.doFinal(r4)
            byte[] r4 = new byte[r3]
            javax.crypto.spec.SecretKeySpec r6 = new javax.crypto.spec.SecretKeySpec
            r6.<init>(r2, r0)
            r5.init(r6)
            r7 = 0
            byte[] r0 = new byte[r7]
            r2 = r7
        L_0x02fb:
            r5.update(r0)
            r0 = r19
            r5.update(r0)
            byte r6 = (byte) r8
            r5.update(r6)
            byte[] r6 = r5.doFinal()
            int r10 = r6.length
            int r11 = r2 + r10
            if (r11 >= r3) goto L_0x0318
            java.lang.System.arraycopy(r6, r7, r4, r2, r10)
            int r8 = r8 + 1
            r0 = r6
            r2 = r11
            goto L_0x02fb
        L_0x0318:
            int r0 = r3 - r2
            java.lang.System.arraycopy(r6, r7, r4, r2, r0)
            com.google.android.gms.internal.ads.zzghm r0 = new com.google.android.gms.internal.ads.zzghm
            r0.<init>(r9, r4)
            return r0
        L_0x0323:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.String r2 = "size too large"
            r0.<init>(r2)
            throw r0
        L_0x032b:
            java.security.InvalidAlgorithmParameterException r0 = new java.security.InvalidAlgorithmParameterException     // Catch:{ IllegalStateException -> 0x033b }
            java.lang.String r2 = "p must be positive"
            r0.<init>(r2)     // Catch:{ IllegalStateException -> 0x033b }
            throw r0     // Catch:{ IllegalStateException -> 0x033b }
        L_0x0333:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException     // Catch:{ IllegalStateException -> 0x033b }
            java.lang.String r2 = "shared secret is out of range"
            r0.<init>(r2)     // Catch:{ IllegalStateException -> 0x033b }
            throw r0     // Catch:{ IllegalStateException -> 0x033b }
        L_0x033b:
            r0 = move-exception
            java.security.GeneralSecurityException r2 = new java.security.GeneralSecurityException
            java.lang.String r0 = r0.toString()
            r2.<init>(r0)
            throw r2
        L_0x0346:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException     // Catch:{ IllegalArgumentException -> 0x0350, NullPointerException -> 0x034e }
            java.lang.String r2 = "invalid public key spec"
            r0.<init>(r2)     // Catch:{ IllegalArgumentException -> 0x0350, NullPointerException -> 0x034e }
            throw r0     // Catch:{ IllegalArgumentException -> 0x0350, NullPointerException -> 0x034e }
        L_0x034e:
            r0 = move-exception
            goto L_0x0351
        L_0x0350:
            r0 = move-exception
        L_0x0351:
            java.security.GeneralSecurityException r2 = new java.security.GeneralSecurityException
            java.lang.String r0 = r0.toString()
            r2.<init>(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzghn.zza(java.lang.String, byte[], byte[], int, int):com.google.android.gms.internal.ads.zzghm");
    }
}

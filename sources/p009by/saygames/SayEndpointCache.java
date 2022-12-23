package p009by.saygames;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Base64;
import android.util.Log;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.SameMD5;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.HashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import p009by.saygames.SayEndpoint;

/* renamed from: by.saygames.SayEndpointCache */
public class SayEndpointCache {
    private static final String TAG = "SayKit";
    private final HashMap<String, SayEndpoint.IBatching> _batchingMap = new HashMap<>();
    private final Context _context;
    private C0667DB _db = null;
    private final String _name;
    private SQLiteDatabase _rw;
    private final SecureRandom _secureRandom = new SecureRandom();

    /* renamed from: by.saygames.SayEndpointCache$DB */
    private static class C0667DB extends SQLiteOpenHelper {
        private static final String CREATE_KV_INT_SQL = "CREATE TABLE IF NOT EXISTS kv_int ( k TEXT PRIMARY KEY, v INTEGER )";
        private static final String CREATE_SQL = "CREATE TABLE IF NOT EXISTS requests ( ordering INTEGER PRIMARY KEY, body BLOB, batching TEXT, priority INTEGER )";
        public static final int DB_VERSION = 1;

        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        }

        public C0667DB(Context context, String str) {
            super(context, SayEndpointCache.obfuscatedDbName(str), (SQLiteDatabase.CursorFactory) null, 1);
        }

        public void onCreate(SQLiteDatabase sQLiteDatabase) {
            sQLiteDatabase.execSQL(CREATE_SQL);
        }

        public void onOpen(SQLiteDatabase sQLiteDatabase) {
            super.onOpen(sQLiteDatabase);
            sQLiteDatabase.execSQL(CREATE_SQL);
            sQLiteDatabase.execSQL(CREATE_KV_INT_SQL);
        }
    }

    public SayEndpointCache(Context context, String str) {
        this._context = context;
        this._name = str;
        newDbInstance();
    }

    private void newDbInstance() {
        try {
            this._db = new C0667DB(this._context, this._name);
        } catch (Exception e) {
            Log.e(TAG, "Can't create SayEndpointCache", e);
            FirebaseCrashlytics.getInstance().recordException(e);
        }
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [java.lang.String[], android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r2v1, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r2v3 */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x004c, code lost:
        if (r2 != null) goto L_0x0060;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x005e, code lost:
        if (r2 == 0) goto L_0x0063;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0060, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0063, code lost:
        return r1;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List<p009by.saygames.SayEndpoint.StringRequestData> open() {
        /*
            r9 = this;
            java.lang.String r0 = "SayKit"
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r2 = 0
            by.saygames.SayEndpointCache$DB r3 = r9._db     // Catch:{ Exception -> 0x0051 }
            android.database.sqlite.SQLiteDatabase r3 = r3.getWritableDatabase()     // Catch:{ Exception -> 0x0051 }
            r9._rw = r3     // Catch:{ Exception -> 0x0051 }
            java.lang.String r4 = "SELECT ordering, body, batching, priority FROM requests ORDER BY ordering"
            android.database.Cursor r2 = r3.rawQuery(r4, r2)     // Catch:{ Exception -> 0x0051 }
        L_0x0016:
            boolean r3 = r2.moveToNext()     // Catch:{ Exception -> 0x0051 }
            if (r3 == 0) goto L_0x004c
            r3 = 0
            int r4 = r2.getInt(r3)     // Catch:{ Exception -> 0x0051 }
            r5 = 1
            byte[] r6 = r2.getBlob(r5)     // Catch:{ Exception -> 0x0051 }
            java.lang.String r6 = r9.decipher(r6)     // Catch:{ Exception -> 0x0051 }
            if (r6 != 0) goto L_0x0032
            java.lang.String r3 = "Can't decipher request body"
            android.util.Log.e(r0, r3)     // Catch:{ Exception -> 0x0051 }
            goto L_0x0016
        L_0x0032:
            r7 = 2
            java.lang.String r7 = r2.getString(r7)     // Catch:{ Exception -> 0x0051 }
            r8 = 3
            int r8 = r2.getInt(r8)     // Catch:{ Exception -> 0x0051 }
            if (r8 <= 0) goto L_0x003f
            r3 = r5
        L_0x003f:
            by.saygames.SayEndpoint$IBatching r5 = r9.getBatching((java.lang.String) r7)     // Catch:{ Exception -> 0x0051 }
            by.saygames.SayEndpoint$StringRequestData r7 = new by.saygames.SayEndpoint$StringRequestData     // Catch:{ Exception -> 0x0051 }
            r7.<init>(r6, r5, r4, r3)     // Catch:{ Exception -> 0x0051 }
            r1.add(r7)     // Catch:{ Exception -> 0x0051 }
            goto L_0x0016
        L_0x004c:
            if (r2 == 0) goto L_0x0063
            goto L_0x0060
        L_0x004f:
            r0 = move-exception
            goto L_0x0064
        L_0x0051:
            r3 = move-exception
            java.lang.String r4 = "Failed to open endpoint db"
            android.util.Log.e(r0, r4, r3)     // Catch:{ all -> 0x004f }
            com.google.firebase.crashlytics.FirebaseCrashlytics r0 = com.google.firebase.crashlytics.FirebaseCrashlytics.getInstance()     // Catch:{ all -> 0x004f }
            r0.recordException(r3)     // Catch:{ all -> 0x004f }
            if (r2 == 0) goto L_0x0063
        L_0x0060:
            r2.close()
        L_0x0063:
            return r1
        L_0x0064:
            if (r2 == 0) goto L_0x0069
            r2.close()
        L_0x0069:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p009by.saygames.SayEndpointCache.open():java.util.List");
    }

    private SayEndpoint.IBatching getBatching(String str) {
        SayEndpoint.IBatching iBatching = null;
        if (str != null && !str.isEmpty()) {
            if (this._batchingMap.containsKey(str)) {
                return this._batchingMap.get(str);
            }
            try {
                iBatching = (SayEndpoint.IBatching) Class.forName("by.saygames.SayEndpoint$AppendWithNewLineBatchingNoPin".equals(str) ? "by.saygames.SayEndpoint$AppendWithNewLineBatching" : str).getConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (Exception e) {
                Log.w(TAG, "Can't get create instance of " + str, e);
            }
            this._batchingMap.put(str, iBatching);
        }
        return iBatching;
    }

    public void cacheRequest(SayEndpoint.StringRequestData stringRequestData) {
        if (this._rw == null) {
            Log.e(TAG, "SayEndpointCache is not opened");
            return;
        }
        try {
            byte[] cipher = cipher(stringRequestData.getBody());
            ContentValues contentValues = new ContentValues();
            contentValues.put("ordering", Integer.valueOf(stringRequestData.getOrder()));
            contentValues.put("body", cipher);
            contentValues.put("batching", getBatching(stringRequestData));
            contentValues.put("priority", Integer.valueOf(stringRequestData.isPriority() ? 1 : 0));
            this._rw.insertOrThrow("requests", (String) null, contentValues);
        } catch (Exception e) {
            Log.e(TAG, "SayEndpointCache.cacheRequest error", e);
            FirebaseCrashlytics.getInstance().recordException(e);
        }
    }

    private static SecretKeySpec key(String str, String str2) {
        byte[] bytes = str.getBytes();
        byte[] bytes2 = str2.getBytes();
        for (int i = 0; i < bytes.length; i++) {
            bytes[i] = (byte) (bytes[i] ^ bytes2[i]);
        }
        return new SecretKeySpec(bytes, "AES");
    }

    private byte[] cipher(String str) throws GeneralSecurityException, UnsupportedEncodingException {
        byte[] bytes = str.getBytes("UTF-8");
        byte[] bArr = new byte[12];
        this._secureRandom.nextBytes(bArr);
        Cipher instance = Cipher.getInstance("AES/GCM/NoPadding");
        instance.init(1, key("\"E#&@p,<,u+eE(]r(:(c`&h[88Z'u$4;", "p'N[)sy3Vh9h4K(VazA7_w#BmA?e!D4j"), new IvParameterSpec(bArr));
        byte[] doFinal = instance.doFinal(str.getBytes("UTF-8"));
        ByteBuffer allocate = ByteBuffer.allocate(32 + doFinal.length);
        allocate.put(getMd5Digest(bytes));
        allocate.putInt(12);
        allocate.put(bArr);
        allocate.put(doFinal);
        return allocate.array();
    }

    private String decipher(byte[] bArr) {
        try {
            ByteBuffer wrap = ByteBuffer.wrap(bArr);
            byte[] bArr2 = new byte[16];
            wrap.get(bArr2);
            int i = wrap.getInt();
            if (i < 12 || i >= 16) {
                throw new IllegalArgumentException("invalid iv length");
            }
            byte[] bArr3 = new byte[i];
            wrap.get(bArr3);
            byte[] bArr4 = new byte[wrap.remaining()];
            wrap.get(bArr4);
            Cipher instance = Cipher.getInstance("AES/GCM/NoPadding");
            instance.init(2, key("\"E#&@p,<,u+eE(]r(:(c`&h[88Z'u$4;", "p'N[)sy3Vh9h4K(VazA7_w#BmA?e!D4j"), new IvParameterSpec(bArr3));
            byte[] doFinal = instance.doFinal(bArr4);
            if (Arrays.equals(bArr2, getMd5Digest(doFinal))) {
                return new String(doFinal);
            }
            throw new Exception("Body digests are not equal");
        } catch (Exception e) {
            Log.e(TAG, "Can't decipher request body", e);
            FirebaseCrashlytics.getInstance().recordException(e);
            return null;
        }
    }

    /* access modifiers changed from: private */
    public static String obfuscatedDbName(String str) {
        try {
            return Base64.encodeToString(("sayendpoint_" + str).getBytes("UTF-8"), 11) + ".db";
        } catch (UnsupportedEncodingException e) {
            FirebaseCrashlytics.getInstance().recordException(e);
            return Base64.encodeToString(("sayendpoint_" + str).getBytes(), 11) + ".db";
        }
    }

    private static byte[] getMd5Digest(byte[] bArr) throws NoSuchAlgorithmException {
        MessageDigest instance = MessageDigest.getInstance(SameMD5.TAG);
        instance.update(bArr);
        return instance.digest();
    }

    private String getBatching(SayEndpoint.StringRequestData stringRequestData) {
        SayEndpoint.IBatching batching = stringRequestData.getBatching();
        if (batching == null) {
            return null;
        }
        return batching.getClass().getName();
    }

    public void removeRequestsLessOrEqual(int i) {
        SQLiteDatabase sQLiteDatabase = this._rw;
        if (sQLiteDatabase == null) {
            Log.e(TAG, "SayEndpointCache is not opened");
            return;
        }
        try {
            int delete = sQLiteDatabase.delete("requests", "ordering <= ?", new String[]{Integer.toString(i)});
            Log.d(TAG, delete + "  requests were sent successfully and removed from db");
        } catch (Exception e) {
            purgeDb();
            Log.e(TAG, "SayEndpointCache.removeRequestsLessOrEqual error", e);
            FirebaseCrashlytics.getInstance().recordException(e);
        }
    }

    public void removeRequest(SayEndpoint.StringRequestData stringRequestData) {
        SQLiteDatabase sQLiteDatabase = this._rw;
        if (sQLiteDatabase == null) {
            Log.e(TAG, "SayEndpointCache is not opened");
            return;
        }
        try {
            sQLiteDatabase.delete("requests", "ordering = ?", new String[]{Integer.toString(stringRequestData.getOrder())});
        } catch (Exception e) {
            purgeDb();
            Log.e(TAG, "SayEndpointCache.removeRequestsLessOrEqual error", e);
            FirebaseCrashlytics.getInstance().recordException(e);
        }
    }

    private void purgeDb() {
        if (this._db != null) {
            close();
            try {
                this._context.deleteDatabase(obfuscatedDbName(this._name));
            } catch (Exception e) {
                Log.e(TAG, "SayEndpointCache.purgeDb error", e);
                FirebaseCrashlytics.getInstance().recordException(e);
            }
            newDbInstance();
            prepareDb();
        }
    }

    private void prepareDb() {
        try {
            this._rw = this._db.getWritableDatabase();
        } catch (Exception e) {
            Log.e(TAG, "SayEndpointCache.prepareDb error", e);
            FirebaseCrashlytics.getInstance().recordException(e);
        }
    }

    private void close() {
        try {
            if (this._rw != null) {
                this._rw.close();
            }
            this._db.close();
        } catch (Exception e) {
            Log.e(TAG, "SayEndpointCache.removeRequestsLessOrEqual error", e);
        }
        this._db = null;
        this._rw = null;
    }

    public void setRequestingOrder(int i) {
        if (this._rw == null) {
            Log.e(TAG, "SayEndpointCache is not opened");
            return;
        }
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put(CampaignEx.JSON_KEY_AD_K, "requestingOrder");
            contentValues.put("v", Integer.valueOf(i));
            this._rw.insertWithOnConflict("kv_int", (String) null, contentValues, 5);
        } catch (Exception e) {
            Log.e(TAG, "SayEndpointCache.setRequestingOrder error", e);
            FirebaseCrashlytics.getInstance().recordException(e);
        }
    }

    public void removeRequestingOrder() {
        SQLiteDatabase sQLiteDatabase = this._rw;
        if (sQLiteDatabase == null) {
            Log.e(TAG, "SayEndpointCache is not opened");
            return;
        }
        try {
            sQLiteDatabase.delete("kv_int", "k = ?", new String[]{"requestingOrder"});
        } catch (Exception e) {
            Log.e(TAG, "SayEndpointCache.removeRequestingOrder error", e);
            FirebaseCrashlytics.getInstance().recordException(e);
        }
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [java.lang.String[], android.database.Cursor] */
    public int getRequestingOrder() {
        SQLiteDatabase sQLiteDatabase = this._rw;
        if (sQLiteDatabase == null) {
            Log.e(TAG, "SayEndpointCache is not opened");
            return -1;
        }
        ? r3 = 0;
        try {
            Cursor rawQuery = sQLiteDatabase.rawQuery("SELECT v FROM kv_int WHERE k = 'requestingOrder'", r3);
            if (rawQuery.moveToNext()) {
                int i = rawQuery.getInt(0);
                if (rawQuery != null) {
                    try {
                        rawQuery.close();
                    } catch (Exception e) {
                        FirebaseCrashlytics.getInstance().recordException(e);
                    }
                }
                return i;
            }
            if (rawQuery != null) {
                try {
                    rawQuery.close();
                } catch (Exception e2) {
                    FirebaseCrashlytics.getInstance().recordException(e2);
                }
            }
            return -1;
        } catch (Exception e3) {
            Log.e(TAG, "SayEndpointCache.getRequestingOrder error", e3);
            FirebaseCrashlytics.getInstance().recordException(e3);
            if (r3 != 0) {
                r3.close();
            }
        } catch (Throwable th) {
            if (r3 != 0) {
                try {
                    r3.close();
                } catch (Exception e4) {
                    FirebaseCrashlytics.getInstance().recordException(e4);
                }
            }
            throw th;
        }
    }
}

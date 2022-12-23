package com.smaato.sdk.core.util;

import android.net.UrlQuerySanitizer;
import com.smaato.sdk.core.util.collections.Maps;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import org.json.JSONException;
import org.json.JSONObject;

public final class TextUtils {
    private TextUtils() {
    }

    public static boolean isEmpty(CharSequence charSequence) {
        return charSequence == null || charSequence.length() == 0;
    }

    public static byte[] getByteArray(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[1024];
        while (true) {
            int read = inputStream.read(bArr, 0, 1024);
            if (read == -1) {
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr, 0, read);
        }
    }

    public static Map<String, String> parseQuery(String str) {
        if (isEmpty(str)) {
            return Collections.emptyMap();
        }
        UrlQuerySanitizer urlQuerySanitizer = new UrlQuerySanitizer();
        urlQuerySanitizer.setAllowUnregisteredParamaters(true);
        urlQuerySanitizer.parseQuery(str);
        return Maps.toMap(urlQuerySanitizer.getParameterList(), $$Lambda$TextUtils$uBZsZNS31BJTNOBVGEvOoRDftk0.INSTANCE, $$Lambda$TextUtils$ilKaRWQlnzCUc2uUVhO9CJV8DOE.INSTANCE);
    }

    public static Map<String, String> convertJsonStringToMap(String str) {
        if (isEmpty(str)) {
            return Collections.emptyMap();
        }
        try {
            HashMap hashMap = new HashMap();
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                hashMap.put(next, jSONObject.getString(next));
            }
            return hashMap;
        } catch (JSONException unused) {
            return Collections.emptyMap();
        }
    }

    public static TreeMap<String, String> parseQueryToCaseInsensitiveMap(String str) {
        TreeMap<String, String> treeMap = new TreeMap<>(String.CASE_INSENSITIVE_ORDER);
        treeMap.putAll(parseQuery(str));
        return treeMap;
    }
}

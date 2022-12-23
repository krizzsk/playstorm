package com.smaato.sdk.core;

import android.util.Log;
import com.smaato.sdk.core.util.Joiner;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.TextUtils;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public final class KeyValuePairs implements Cloneable {
    private static final String LOG_TAG = KeyValuePairs.class.getSimpleName();
    private final Map<String, Set<String>> keyValuePairsMap = Collections.synchronizedMap(new LinkedHashMap(7));

    public void addTargetingValue(String str, String str2) {
        if (isKeyAndValueValid(str, str2)) {
            Set set = this.keyValuePairsMap.get(str);
            if (set == null) {
                setNewValues(str, str2);
            } else if (set.size() >= 7) {
                Log.e(LOG_TAG, String.format("%s values limit has been reached.", new Object[]{str}));
            } else if (!set.add(str2)) {
                Log.e(LOG_TAG, String.format("%s value is already presents for the %s key.", new Object[]{str2, str}));
            }
        }
    }

    public void setTargetingValue(String str, String str2) {
        if (isKeyAndValueValid(str, str2)) {
            setNewValues(str, str2);
        }
    }

    public void setTargetingValues(String str, String... strArr) {
        if (isKeyAndValueValid(str, strArr)) {
            setNewValues(str, strArr);
        }
    }

    public void removeAllKeyValuePairs() {
        this.keyValuePairsMap.clear();
    }

    public void removeKeyValuePair(String str) {
        this.keyValuePairsMap.remove(str);
    }

    private void setNewValues(String str, String... strArr) {
        Objects.requireNonNull(strArr);
        int i = 7;
        LinkedHashSet linkedHashSet = new LinkedHashSet(7);
        if (strArr.length > 7) {
            String[] strArr2 = new String[(strArr.length - 7)];
            System.arraycopy(strArr, 7, strArr2, 0, strArr.length - 7);
            Log.e(LOG_TAG, String.format("Amount of adding values (%s) exceeds maximal capacity (%s);\nSkipped values: %s", new Object[]{Integer.valueOf(strArr.length), 7, Joiner.join((CharSequence) ", ", (Object[]) strArr2)}));
        } else {
            i = strArr.length;
        }
        linkedHashSet.addAll(Arrays.asList(strArr).subList(0, i));
        this.keyValuePairsMap.put(str, Collections.synchronizedSet(linkedHashSet));
    }

    public Map<String, Set<String>> getAllKeyValuePairs() {
        Set<Map.Entry<String, Set<String>>> entrySet = this.keyValuePairsMap.entrySet();
        LinkedHashMap linkedHashMap = new LinkedHashMap(entrySet.size());
        for (Map.Entry next : entrySet) {
            linkedHashMap.put((String) next.getKey(), new LinkedHashSet((Collection) next.getValue()));
        }
        return linkedHashMap;
    }

    private boolean isKeyAndValueValid(String str, String... strArr) {
        if (TextUtils.isEmpty(str)) {
            Log.e(LOG_TAG, "key can not be null or empty.");
            return false;
        } else if (strArr == null || strArr.length == 0) {
            Log.e(LOG_TAG, "values can not be null or empty.");
            return false;
        } else {
            for (String isEmpty : strArr) {
                if (TextUtils.isEmpty(isEmpty)) {
                    Log.e(LOG_TAG, "value can not be null or empty.");
                    return false;
                }
            }
            return true;
        }
    }

    public KeyValuePairs clone() {
        KeyValuePairs keyValuePairs = new KeyValuePairs();
        synchronized (this.keyValuePairsMap) {
            for (Map.Entry next : this.keyValuePairsMap.entrySet()) {
                Set set = (Set) next.getValue();
                keyValuePairs.setNewValues((String) next.getKey(), (String[]) set.toArray(new String[set.size()]));
            }
        }
        return keyValuePairs;
    }
}

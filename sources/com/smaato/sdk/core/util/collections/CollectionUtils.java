package com.smaato.sdk.core.util.collections;

import java.util.Collection;
import java.util.HashMap;

public final class CollectionUtils {
    private CollectionUtils() {
    }

    public static boolean equalsByElements(Collection<?> collection, Collection<?> collection2) {
        if (collection.size() != collection2.size()) {
            return false;
        }
        HashMap hashMap = new HashMap();
        for (Object next : collection) {
            Integer num = (Integer) hashMap.get(next);
            if (num == null) {
                num = 0;
            }
            hashMap.put(next, Integer.valueOf(num.intValue() + 1));
        }
        for (Object next2 : collection2) {
            Integer num2 = (Integer) hashMap.get(next2);
            if (num2 == null) {
                return false;
            }
            Integer valueOf = Integer.valueOf(num2.intValue() - 1);
            if (valueOf.intValue() == 0) {
                hashMap.remove(next2);
            } else {
                hashMap.put(next2, Integer.valueOf(valueOf.intValue() - 1));
            }
        }
        return hashMap.isEmpty();
    }
}

package com.smaato.sdk.core.util;

import com.google.common.net.HttpHeaders;
import java.util.List;
import java.util.Map;

public final class HeaderUtils {
    public List<String> extractHeaderValueList(Map<String, List<String>> map, String str) {
        Objects.requireNonNull(map);
        Objects.requireNonNull(str);
        return map.get(str);
    }

    public String extractHeaderMultiValue(Map<String, List<String>> map, String str) {
        Objects.requireNonNull(map);
        Objects.requireNonNull(str);
        List list = map.get(str);
        if (list != null) {
            return Joiner.join((CharSequence) "", (Iterable) list);
        }
        return null;
    }

    public String extractHeaderSingleValue(Map<String, List<String>> map, String str) {
        Objects.requireNonNull(map);
        Objects.requireNonNull(str);
        List list = map.get(str);
        if (list == null || list.isEmpty()) {
            return null;
        }
        return (String) list.get(0);
    }

    public boolean isChunkedTransferEncoding(Map<String, List<String>> map) {
        List<String> list;
        Objects.requireNonNull(map);
        for (String next : map.keySet()) {
            if (HttpHeaders.TRANSFER_ENCODING.equalsIgnoreCase(next) && (list = map.get(next)) != null) {
                for (String equalsIgnoreCase : list) {
                    if ("chunked".equalsIgnoreCase(equalsIgnoreCase)) {
                        return true;
                    }
                }
                continue;
            }
        }
        return false;
    }
}

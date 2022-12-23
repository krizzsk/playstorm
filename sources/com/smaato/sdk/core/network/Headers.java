package com.smaato.sdk.core.network;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public abstract class Headers implements Iterable<Map.Entry<String, List<String>>> {
    public abstract Map<String, List<String>> headers();

    public static Builder builder() {
        return new Builder(Collections.emptyMap());
    }

    /* renamed from: of */
    public static Headers m32962of(Map<String, List<String>> map) {
        return new Builder(map).build();
    }

    public static Headers empty() {
        return new AutoValue_Headers(Collections.emptyMap());
    }

    public Set<String> names() {
        return headers().keySet();
    }

    public List<String> values(String str) {
        List<String> list = headers().get(str);
        return list == null ? Collections.emptyList() : list;
    }

    public int size() {
        return headers().size();
    }

    public Builder buildUpon() {
        return new Builder(headers());
    }

    public Iterator<Map.Entry<String, List<String>>> iterator() {
        return headers().entrySet().iterator();
    }

    public static class Builder {
        private final Map<String, List<String>> headers = new TreeMap(String.CASE_INSENSITIVE_ORDER);

        Builder(Map<String, List<String>> map) {
            for (Map.Entry next : map.entrySet()) {
                if (next.getKey() != null) {
                    this.headers.put((String) next.getKey(), (List) next.getValue());
                }
            }
        }

        public Builder put(String str, String str2) {
            List list = this.headers.get(str);
            if (list == null) {
                list = new ArrayList();
                this.headers.put(str, list);
            }
            list.add(str2);
            return this;
        }

        /* access modifiers changed from: package-private */
        public Builder remove(String str) {
            this.headers.remove(str);
            return this;
        }

        /* access modifiers changed from: package-private */
        public Builder removeAll() {
            this.headers.clear();
            return this;
        }

        public Headers build() {
            return new AutoValue_Headers(Collections.unmodifiableMap(this.headers));
        }
    }
}

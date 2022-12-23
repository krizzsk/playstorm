package com.smaato.sdk.core.p379di;

/* renamed from: com.smaato.sdk.core.di.DiKey */
final class DiKey {
    private Class clazz;
    private String name;

    DiKey(String str, Class cls) {
        this.name = str;
        this.clazz = cls;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || DiKey.class != obj.getClass()) {
            return false;
        }
        DiKey diKey = (DiKey) obj;
        String str = this.name;
        if (str == null ? diKey.name == null : str.equals(diKey.name)) {
            return this.clazz.equals(diKey.clazz);
        }
        return false;
    }

    public int hashCode() {
        String str = this.name;
        return ((str != null ? str.hashCode() : 0) * 31) + this.clazz.hashCode();
    }

    public String toString() {
        return "DiKey{name='" + this.name + '\'' + ", clazz=" + this.clazz + '}';
    }
}

package com.ironsource.mediationsdk.metadata;

import java.util.ArrayList;
import java.util.List;

public class MetaData {

    /* renamed from: a */
    private String f17449a;

    /* renamed from: b */
    private List<String> f17450b;

    /* renamed from: c */
    private List<MetaDataValueTypes> f17451c;

    public enum MetaDataValueTypes {
        META_DATA_VALUE_STRING,
        META_DATA_VALUE_BOOLEAN,
        META_DATA_VALUE_INT,
        META_DATA_VALUE_LONG,
        META_DATA_VALUE_DOUBLE,
        META_DATA_VALUE_FLOAT
    }

    public MetaData(String str, List<String> list) {
        this.f17449a = str;
        this.f17450b = list;
        this.f17451c = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            this.f17451c.add(MetaDataValueTypes.META_DATA_VALUE_STRING);
        }
    }

    public MetaData(String str, List<String> list, List<MetaDataValueTypes> list2) {
        this.f17449a = str;
        this.f17450b = list;
        this.f17451c = list2;
    }

    public String getMetaDataKey() {
        return this.f17449a;
    }

    public List<String> getMetaDataValue() {
        return this.f17450b;
    }

    public List<MetaDataValueTypes> getMetaDataValueType() {
        return this.f17451c;
    }
}

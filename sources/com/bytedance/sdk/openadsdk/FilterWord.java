package com.bytedance.sdk.openadsdk;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

public class FilterWord {

    /* renamed from: a */
    private String f6838a;

    /* renamed from: b */
    private String f6839b;

    /* renamed from: c */
    private boolean f6840c;

    /* renamed from: d */
    private List<FilterWord> f6841d;

    public FilterWord(String str, String str2) {
        this.f6838a = str;
        this.f6839b = str2;
    }

    public FilterWord() {
    }

    public String getId() {
        return this.f6838a;
    }

    public void setId(String str) {
        this.f6838a = str;
    }

    public String getName() {
        return this.f6839b;
    }

    public void setName(String str) {
        this.f6839b = str;
    }

    public boolean getIsSelected() {
        return this.f6840c;
    }

    public void setIsSelected(boolean z) {
        this.f6840c = z;
    }

    public List<FilterWord> getOptions() {
        return this.f6841d;
    }

    public void addOption(FilterWord filterWord) {
        if (filterWord != null) {
            if (this.f6841d == null) {
                this.f6841d = new ArrayList();
            }
            this.f6841d.add(filterWord);
        }
    }

    public boolean isValid() {
        return !TextUtils.isEmpty(this.f6838a) && !TextUtils.isEmpty(this.f6839b);
    }

    public boolean hasSecondOptions() {
        List<FilterWord> list = this.f6841d;
        return list != null && !list.isEmpty();
    }
}

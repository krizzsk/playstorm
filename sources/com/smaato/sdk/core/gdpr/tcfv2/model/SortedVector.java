package com.smaato.sdk.core.gdpr.tcfv2.model;

import com.smaato.sdk.core.util.Objects;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedVector {
    private int bitLength;
    private SortedSet<Integer> set;

    public SortedVector(int i, SortedSet<Integer> sortedSet) {
        this.bitLength = i;
        this.set = (SortedSet) Objects.requireNonNull(sortedSet);
    }

    public SortedVector() {
        this.bitLength = 0;
        this.set = new TreeSet($$Lambda$SortedVector$z2iQcJBaH2wozktMqWRhygfCQJo.INSTANCE);
    }

    static /* synthetic */ int lambda$new$0(Integer num, Integer num2) {
        return num2.intValue() - num.intValue();
    }

    public int getBitLength() {
        return this.bitLength;
    }

    public void setBitLength(int i) {
        this.bitLength = i;
    }

    public SortedSet<Integer> getSet() {
        return this.set;
    }

    public void setSet(SortedSet<Integer> sortedSet) {
        this.set = (SortedSet) Objects.requireNonNull(sortedSet);
    }

    public String toString() {
        Integer first;
        if (this.set.isEmpty() || (first = this.set.first()) == null || first.intValue() == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= first.intValue(); i++) {
            if (this.set.contains(Integer.valueOf(i))) {
                sb.append("1");
            } else {
                sb.append("0");
            }
        }
        return sb.toString();
    }
}

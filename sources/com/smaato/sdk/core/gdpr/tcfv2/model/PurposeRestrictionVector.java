package com.smaato.sdk.core.gdpr.tcfv2.model;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

public class PurposeRestrictionVector {
    private int bitLength = 0;
    private Map<String, TreeSet<Integer>> map = new HashMap();

    public void add(int i, PurposeRestriction purposeRestriction) {
        if (purposeRestriction != null) {
            String hash = purposeRestriction.getHash();
            if (!containsKey(hash)) {
                this.map.put(hash, new TreeSet());
                this.bitLength = 0;
            }
            this.map.get(hash).add(Integer.valueOf(i));
        }
    }

    public void remove(int i, PurposeRestriction purposeRestriction) {
        String hash = purposeRestriction.getHash();
        TreeSet treeSet = this.map.get(hash);
        if (treeSet != null) {
            treeSet.remove(Integer.valueOf(i));
            if (treeSet.isEmpty()) {
                this.map.remove(hash);
                this.bitLength = 0;
            }
        }
    }

    public int getBitLength() {
        return this.bitLength;
    }

    public void setBitLength(int i) {
        this.bitLength = i;
    }

    public boolean containsKey(String str) {
        return this.map.containsKey(str);
    }

    public boolean containsValue(String str, Integer num) {
        if (this.map.containsKey(str)) {
            return this.map.get(str).contains(num);
        }
        return false;
    }
}

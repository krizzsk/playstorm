package com.smaato.sdk.core.util.notifier;

class UniqueValueChangeSender<T> extends StandardChangeSender<T> {
    UniqueValueChangeSender(T t) {
        super(t);
    }

    public void newValue(T t) {
        if (!t.equals(getValue())) {
            super.newValue(t);
        }
    }
}

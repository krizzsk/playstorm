package com.smaato.sdk.core.util.notifier;

public interface ChangeSender<T> extends ChangeNotifier<T> {
    T getValue();

    void newValue(T t);
}

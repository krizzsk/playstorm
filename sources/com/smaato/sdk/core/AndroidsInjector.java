package com.smaato.sdk.core;

import android.app.Activity;
import android.app.Fragment;
import android.util.Log;
import android.view.View;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.diinjection.Inject;
import com.smaato.sdk.core.util.diinjection.Named;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.HashSet;
import java.util.Set;

public final class AndroidsInjector {
    private AndroidsInjector() {
    }

    public static void inject(View view) {
        Objects.requireNonNull(view, "Parameter view cannot be null for AndroidsInjector::inject");
        injectFieldValues(view);
    }

    public static void inject(Activity activity) {
        Objects.requireNonNull(activity, "Parameter activity cannot be null for AndroidsInjector::inject");
        injectFieldValues(activity);
    }

    public static void inject(Fragment fragment) {
        Objects.requireNonNull(fragment, "Parameter fragment cannot be null for AndroidsInjector::inject");
        injectFieldValues(fragment);
    }

    public static void injectStatic(Class cls) {
        Objects.requireNonNull(cls, "Parameter clazz cannot be null for AndroidsInjector::inject");
        injectStaticFieldValues(cls);
    }

    private static void injectStaticFieldValues(Class cls) {
        injectFieldValues(cls, findFields(cls, Inject.class));
    }

    private static void injectFieldValues(Object obj) {
        injectFieldValues(obj, findFields(obj.getClass(), Inject.class));
    }

    private static void injectFieldValues(Object obj, Set<Field> set) {
        for (Field next : set) {
            String value = next.isAnnotationPresent(Named.class) ? ((Named) next.getAnnotation(Named.class)).value() : null;
            next.setAccessible(true);
            try {
                Field[] declaredFields = SmaatoSdk.class.getDeclaredFields();
                int length = declaredFields.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        break;
                    }
                    Field field = declaredFields[i];
                    if (field.getType() == SmaatoInstance.class) {
                        field.setAccessible(true);
                        next.set(obj, ((SmaatoInstance) field.get((Object) null)).getDiConstructor().get(value, next.getType()));
                        break;
                    }
                    i++;
                }
            } catch (Exception e) {
                Log.e("Injector", "Unknown injector error", e);
            }
        }
    }

    private static Set<Field> findFields(Class<?> cls, Class<? extends Annotation> cls2) {
        HashSet hashSet = new HashSet();
        String canonicalName = cls.getCanonicalName();
        Class<? super Object> cls3 = cls;
        while (canonicalName != null && canonicalName.startsWith("com.smaato")) {
            for (Field field : cls3.getDeclaredFields()) {
                if (field.isAnnotationPresent(cls2)) {
                    hashSet.add(field);
                }
            }
            Class<? super Object> superclass = cls3.getSuperclass();
            canonicalName = superclass.getCanonicalName();
            cls3 = superclass;
        }
        return hashSet;
    }
}

package com.mbridge.msdk.foundation.tools;

import com.google.android.exoplayer2.C5487C;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/* renamed from: com.mbridge.msdk.foundation.tools.z */
/* compiled from: SerializeTools */
public final class C8614z {
    /* renamed from: a */
    public static String m24961a(Object obj) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            objectOutputStream.writeObject(obj);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            objectOutputStream.flush();
            objectOutputStream.close();
            return new String(byteArray, C5487C.ISO88591_NAME);
        } catch (IOException e) {
            C8608u.m24881a("SerializeTools", "IOException", e);
            return "";
        }
    }

    /* renamed from: a */
    public static Object m24960a(String str) {
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(str.getBytes(C5487C.ISO88591_NAME));
            ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
            Object readObject = objectInputStream.readObject();
            objectInputStream.close();
            byteArrayInputStream.close();
            return readObject;
        } catch (Exception e) {
            C8608u.m24881a("SerializeTools", "Exception", e);
            return null;
        }
    }
}

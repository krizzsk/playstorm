package com.mbridge.msdk.foundation.tools;

import android.text.TextUtils;
import com.google.common.base.Ascii;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.mbridge.msdk.foundation.tools.p */
/* compiled from: SameBase64Tool */
public class C8595p {

    /* renamed from: a */
    private static final String f20765a = C8595p.class.getSimpleName();

    /* renamed from: b */
    private static Map<Character, Character> f20766b;

    /* renamed from: c */
    private static Map<Character, Character> f20767c;

    /* renamed from: d */
    private static char[] f20768d = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/'};

    /* renamed from: e */
    private static byte[] f20769e = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, -1, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, Ascii.f17948VT, Ascii.f17937FF, Ascii.f17935CR, Ascii.f17945SO, Ascii.f17944SI, Ascii.DLE, 17, Ascii.DC2, 19, Ascii.DC4, Ascii.NAK, Ascii.SYN, Ascii.ETB, Ascii.CAN, Ascii.f17936EM, -1, -1, -1, -1, -1, -1, Ascii.SUB, Ascii.ESC, Ascii.f17938FS, Ascii.f17939GS, Ascii.f17943RS, Ascii.f17947US, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1};

    static {
        f20766b = null;
        f20767c = null;
        HashMap hashMap = new HashMap();
        f20767c = hashMap;
        hashMap.put('v', 'A');
        f20767c.put('S', 'B');
        f20767c.put('o', 'C');
        f20767c.put('a', 'D');
        f20767c.put('j', 'E');
        f20767c.put('c', 'F');
        f20767c.put('7', 'G');
        f20767c.put('d', 'H');
        f20767c.put('R', 'I');
        f20767c.put('z', 'J');
        f20767c.put('p', 'K');
        f20767c.put('W', 'L');
        f20767c.put('i', 'M');
        f20767c.put('f', 'N');
        f20767c.put('G', 'O');
        f20767c.put('y', 'P');
        f20767c.put('N', 'Q');
        f20767c.put('x', 'R');
        f20767c.put('Z', 'S');
        f20767c.put('n', 'T');
        f20767c.put('V', 'U');
        f20767c.put('5', 'V');
        f20767c.put('k', 'W');
        f20767c.put('+', 'X');
        f20767c.put('D', 'Y');
        f20767c.put('H', 'Z');
        f20767c.put('L', 'a');
        f20767c.put('Y', 'b');
        f20767c.put('h', 'c');
        f20767c.put('J', 'd');
        f20767c.put('4', 'e');
        f20767c.put('6', 'f');
        f20767c.put('l', 'g');
        f20767c.put('t', 'h');
        f20767c.put('0', 'i');
        f20767c.put('U', 'j');
        f20767c.put('3', 'k');
        f20767c.put('Q', 'l');
        f20767c.put('r', 'm');
        f20767c.put('g', 'n');
        f20767c.put('E', 'o');
        f20767c.put('u', 'p');
        f20767c.put('q', 'q');
        f20767c.put('8', 'r');
        f20767c.put('s', 's');
        f20767c.put('w', 't');
        f20767c.put('/', 'u');
        f20767c.put('X', 'v');
        f20767c.put('M', 'w');
        f20767c.put('e', 'x');
        f20767c.put('B', 'y');
        f20767c.put('A', 'z');
        f20767c.put('T', '0');
        f20767c.put('2', '1');
        f20767c.put('F', '2');
        f20767c.put('b', '3');
        f20767c.put('9', '4');
        f20767c.put('P', '5');
        f20767c.put('1', '6');
        f20767c.put('O', 55);
        f20767c.put('I', '8');
        f20767c.put('K', '9');
        f20767c.put('m', '+');
        f20767c.put(67, '/');
        HashMap hashMap2 = new HashMap();
        f20766b = hashMap2;
        hashMap2.put('A', 'v');
        f20766b.put('B', 'S');
        f20766b.put(67, 'o');
        f20766b.put('D', 'a');
        f20766b.put('E', 'j');
        f20766b.put('F', 'c');
        f20766b.put(71, 55);
        f20766b.put('H', 'd');
        f20766b.put('I', 'R');
        f20766b.put('J', 'z');
        f20766b.put('K', 'p');
        f20766b.put('L', 'W');
        f20766b.put('M', 'i');
        f20766b.put('N', 'f');
        f20766b.put('O', 71);
        f20766b.put('P', 'y');
        f20766b.put('Q', 'N');
        f20766b.put('R', 'x');
        f20766b.put('S', 'Z');
        f20766b.put('T', 'n');
        f20766b.put('U', 'V');
        f20766b.put('V', '5');
        f20766b.put('W', 'k');
        f20766b.put('X', '+');
        f20766b.put('Y', 'D');
        f20766b.put('Z', 'H');
        f20766b.put('a', 'L');
        f20766b.put('b', 'Y');
        f20766b.put('c', 'h');
        f20766b.put('d', 'J');
        f20766b.put('e', '4');
        f20766b.put('f', '6');
        f20766b.put('g', 'l');
        f20766b.put('h', 't');
        f20766b.put('i', '0');
        f20766b.put('j', 'U');
        f20766b.put('k', '3');
        f20766b.put('l', 'Q');
        f20766b.put('m', 'r');
        f20766b.put('n', 'g');
        f20766b.put('o', 'E');
        f20766b.put('p', 'u');
        f20766b.put('q', 'q');
        f20766b.put('r', '8');
        f20766b.put('s', 's');
        f20766b.put('t', 'w');
        f20766b.put('u', '/');
        f20766b.put('v', 'X');
        f20766b.put('w', 'M');
        f20766b.put('x', 'e');
        f20766b.put('y', 'B');
        f20766b.put('z', 'A');
        f20766b.put('0', 'T');
        f20766b.put('1', '2');
        f20766b.put('2', 70);
        f20766b.put('3', 'b');
        f20766b.put('4', '9');
        f20766b.put('5', 'P');
        f20766b.put('6', '1');
        f20766b.put(55, 'O');
        f20766b.put('8', 'I');
        f20766b.put('9', 'K');
        f20766b.put('+', 'm');
        f20766b.put('/', 67);
    }

    private C8595p() {
    }

    /* renamed from: a */
    public static String m24814a(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        return C8609v.m24888b(str);
    }

    /* renamed from: b */
    public static String m24815b(String str) {
        return C8609v.m24886a(str);
    }
}

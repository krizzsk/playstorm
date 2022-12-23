package p009by.saygames;

import android.util.Log;

/* renamed from: by.saygames.SayKitLog */
public class SayKitLog {
    private static Boolean _debugFlag = false;

    public static void SetDebugFlag(int i) {
        if (i == 0) {
            _debugFlag = false;
        } else {
            _debugFlag = true;
        }
    }

    public static void Log(String str, String str2, String str3) {
        if (_debugFlag.booleanValue()) {
            char c = 65535;
            int hashCode = str.hashCode();
            if (hashCode != 100) {
                if (hashCode != 101) {
                    if (hashCode != 105) {
                        if (hashCode == 119 && str.equals("w")) {
                            c = 1;
                        }
                    } else if (str.equals("i")) {
                        c = 0;
                    }
                } else if (str.equals("e")) {
                    c = 2;
                }
            } else if (str.equals("d")) {
                c = 3;
            }
            if (c == 0) {
                Log.i(str2, str3);
            } else if (c == 1) {
                Log.w(str2, str3);
            } else if (c == 2) {
                Log.e(str2, str3);
            } else if (c != 3) {
                Log.v(str2, str3);
            } else {
                Log.d(str2, str3);
            }
        }
    }

    public static void Log(String str, String str2, String str3, Throwable th) {
        if (_debugFlag.booleanValue()) {
            char c = 65535;
            int hashCode = str.hashCode();
            if (hashCode != 100) {
                if (hashCode != 101) {
                    if (hashCode != 105) {
                        if (hashCode == 119 && str.equals("w")) {
                            c = 1;
                        }
                    } else if (str.equals("i")) {
                        c = 0;
                    }
                } else if (str.equals("e")) {
                    c = 2;
                }
            } else if (str.equals("d")) {
                c = 3;
            }
            if (c == 0) {
                Log.i(str2, str3, th);
            } else if (c == 1) {
                Log.w(str2, str3, th);
            } else if (c == 2) {
                Log.e(str2, str3, th);
            } else if (c != 3) {
                Log.v(str2, str3, th);
            } else {
                Log.d(str2, str3, th);
            }
        }
    }
}

package com.google.android.exoplayer2.text.ssa;

import android.graphics.Color;
import android.graphics.PointF;
import android.text.TextUtils;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.Util;
import com.google.common.primitives.Ints;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

final class SsaStyle {
    public static final int SSA_ALIGNMENT_BOTTOM_CENTER = 2;
    public static final int SSA_ALIGNMENT_BOTTOM_LEFT = 1;
    public static final int SSA_ALIGNMENT_BOTTOM_RIGHT = 3;
    public static final int SSA_ALIGNMENT_MIDDLE_CENTER = 5;
    public static final int SSA_ALIGNMENT_MIDDLE_LEFT = 4;
    public static final int SSA_ALIGNMENT_MIDDLE_RIGHT = 6;
    public static final int SSA_ALIGNMENT_TOP_CENTER = 8;
    public static final int SSA_ALIGNMENT_TOP_LEFT = 7;
    public static final int SSA_ALIGNMENT_TOP_RIGHT = 9;
    public static final int SSA_ALIGNMENT_UNKNOWN = -1;
    private static final String TAG = "SsaStyle";
    public final int alignment;
    public final boolean bold;
    public final float fontSize;
    public final boolean italic;
    public final String name;
    public final Integer primaryColor;
    public final boolean strikeout;
    public final boolean underline;

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface SsaAlignment {
    }

    private static boolean isValidAlignment(int i) {
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                return true;
            default:
                return false;
        }
    }

    private SsaStyle(String str, int i, Integer num, float f, boolean z, boolean z2, boolean z3, boolean z4) {
        this.name = str;
        this.alignment = i;
        this.primaryColor = num;
        this.fontSize = f;
        this.bold = z;
        this.italic = z2;
        this.underline = z3;
        this.strikeout = z4;
    }

    public static SsaStyle fromStyleLine(String str, Format format) {
        String str2 = str;
        Format format2 = format;
        Assertions.checkArgument(str2.startsWith("Style:"));
        String[] split = TextUtils.split(str2.substring(6), ",");
        if (split.length != format2.length) {
            Log.m16949w(TAG, Util.formatInvariant("Skipping malformed 'Style:' line (expected %s values, found %s): '%s'", Integer.valueOf(format2.length), Integer.valueOf(split.length), str2));
            return null;
        }
        try {
            return new SsaStyle(split[format2.nameIndex].trim(), format2.alignmentIndex != -1 ? parseAlignment(split[format2.alignmentIndex].trim()) : -1, format2.primaryColorIndex != -1 ? parseColor(split[format2.primaryColorIndex].trim()) : null, format2.fontSizeIndex != -1 ? parseFontSize(split[format2.fontSizeIndex].trim()) : -3.4028235E38f, format2.boldIndex != -1 && parseBooleanValue(split[format2.boldIndex].trim()), format2.italicIndex != -1 && parseBooleanValue(split[format2.italicIndex].trim()), format2.underlineIndex != -1 && parseBooleanValue(split[format2.underlineIndex].trim()), format2.strikeoutIndex != -1 && parseBooleanValue(split[format2.strikeoutIndex].trim()));
        } catch (RuntimeException e) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 36);
            sb.append("Skipping malformed 'Style:' line: '");
            sb.append(str2);
            sb.append("'");
            Log.m16950w(TAG, sb.toString(), e);
            return null;
        }
    }

    /* access modifiers changed from: private */
    public static int parseAlignment(String str) {
        try {
            int parseInt = Integer.parseInt(str.trim());
            if (isValidAlignment(parseInt)) {
                return parseInt;
            }
        } catch (NumberFormatException unused) {
        }
        String valueOf = String.valueOf(str);
        Log.m16949w(TAG, valueOf.length() != 0 ? "Ignoring unknown alignment: ".concat(valueOf) : new String("Ignoring unknown alignment: "));
        return -1;
    }

    public static Integer parseColor(String str) {
        long j;
        try {
            if (str.startsWith("&H")) {
                j = Long.parseLong(str.substring(2), 16);
            } else {
                j = Long.parseLong(str);
            }
            Assertions.checkArgument(j <= 4294967295L);
            return Integer.valueOf(Color.argb(Ints.checkedCast(((j >> 24) & 255) ^ 255), Ints.checkedCast(j & 255), Ints.checkedCast((j >> 8) & 255), Ints.checkedCast((j >> 16) & 255)));
        } catch (IllegalArgumentException e) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 36);
            sb.append("Failed to parse color expression: '");
            sb.append(str);
            sb.append("'");
            Log.m16950w(TAG, sb.toString(), e);
            return null;
        }
    }

    private static float parseFontSize(String str) {
        try {
            return Float.parseFloat(str);
        } catch (NumberFormatException e) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 29);
            sb.append("Failed to parse font size: '");
            sb.append(str);
            sb.append("'");
            Log.m16950w(TAG, sb.toString(), e);
            return -3.4028235E38f;
        }
    }

    private static boolean parseBooleanValue(String str) {
        try {
            int parseInt = Integer.parseInt(str);
            return parseInt == 1 || parseInt == -1;
        } catch (NumberFormatException e) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 33);
            sb.append("Failed to parse boolean value: '");
            sb.append(str);
            sb.append("'");
            Log.m16950w(TAG, sb.toString(), e);
            return false;
        }
    }

    static final class Format {
        public final int alignmentIndex;
        public final int boldIndex;
        public final int fontSizeIndex;
        public final int italicIndex;
        public final int length;
        public final int nameIndex;
        public final int primaryColorIndex;
        public final int strikeoutIndex;
        public final int underlineIndex;

        private Format(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
            this.nameIndex = i;
            this.alignmentIndex = i2;
            this.primaryColorIndex = i3;
            this.fontSizeIndex = i4;
            this.boldIndex = i5;
            this.italicIndex = i6;
            this.underlineIndex = i7;
            this.strikeoutIndex = i8;
            this.length = i9;
        }

        /* JADX WARNING: Can't fix incorrect switch cases order */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static com.google.android.exoplayer2.text.ssa.SsaStyle.Format fromFormatLine(java.lang.String r14) {
            /*
                r0 = 7
                java.lang.String r14 = r14.substring(r0)
                java.lang.String r1 = ","
                java.lang.String[] r14 = android.text.TextUtils.split(r14, r1)
                r1 = 0
                r2 = -1
                r3 = r1
                r5 = r2
                r6 = r5
                r7 = r6
                r8 = r7
                r9 = r8
                r10 = r9
                r11 = r10
                r12 = r11
            L_0x0016:
                int r4 = r14.length
                if (r3 >= r4) goto L_0x0092
                r4 = r14[r3]
                java.lang.String r4 = r4.trim()
                java.lang.String r4 = com.google.common.base.Ascii.toLowerCase((java.lang.String) r4)
                int r13 = r4.hashCode()
                switch(r13) {
                    case -1178781136: goto L_0x0071;
                    case -1026963764: goto L_0x0067;
                    case -192095652: goto L_0x005d;
                    case -70925746: goto L_0x0053;
                    case 3029637: goto L_0x0049;
                    case 3373707: goto L_0x003f;
                    case 366554320: goto L_0x0035;
                    case 1767875043: goto L_0x002b;
                    default: goto L_0x002a;
                }
            L_0x002a:
                goto L_0x007b
            L_0x002b:
                java.lang.String r13 = "alignment"
                boolean r4 = r4.equals(r13)
                if (r4 == 0) goto L_0x007b
                r4 = 1
                goto L_0x007c
            L_0x0035:
                java.lang.String r13 = "fontsize"
                boolean r4 = r4.equals(r13)
                if (r4 == 0) goto L_0x007b
                r4 = 3
                goto L_0x007c
            L_0x003f:
                java.lang.String r13 = "name"
                boolean r4 = r4.equals(r13)
                if (r4 == 0) goto L_0x007b
                r4 = r1
                goto L_0x007c
            L_0x0049:
                java.lang.String r13 = "bold"
                boolean r4 = r4.equals(r13)
                if (r4 == 0) goto L_0x007b
                r4 = 4
                goto L_0x007c
            L_0x0053:
                java.lang.String r13 = "primarycolour"
                boolean r4 = r4.equals(r13)
                if (r4 == 0) goto L_0x007b
                r4 = 2
                goto L_0x007c
            L_0x005d:
                java.lang.String r13 = "strikeout"
                boolean r4 = r4.equals(r13)
                if (r4 == 0) goto L_0x007b
                r4 = r0
                goto L_0x007c
            L_0x0067:
                java.lang.String r13 = "underline"
                boolean r4 = r4.equals(r13)
                if (r4 == 0) goto L_0x007b
                r4 = 6
                goto L_0x007c
            L_0x0071:
                java.lang.String r13 = "italic"
                boolean r4 = r4.equals(r13)
                if (r4 == 0) goto L_0x007b
                r4 = 5
                goto L_0x007c
            L_0x007b:
                r4 = r2
            L_0x007c:
                switch(r4) {
                    case 0: goto L_0x008e;
                    case 1: goto L_0x008c;
                    case 2: goto L_0x008a;
                    case 3: goto L_0x0088;
                    case 4: goto L_0x0086;
                    case 5: goto L_0x0084;
                    case 6: goto L_0x0082;
                    case 7: goto L_0x0080;
                    default: goto L_0x007f;
                }
            L_0x007f:
                goto L_0x008f
            L_0x0080:
                r12 = r3
                goto L_0x008f
            L_0x0082:
                r11 = r3
                goto L_0x008f
            L_0x0084:
                r10 = r3
                goto L_0x008f
            L_0x0086:
                r9 = r3
                goto L_0x008f
            L_0x0088:
                r8 = r3
                goto L_0x008f
            L_0x008a:
                r7 = r3
                goto L_0x008f
            L_0x008c:
                r6 = r3
                goto L_0x008f
            L_0x008e:
                r5 = r3
            L_0x008f:
                int r3 = r3 + 1
                goto L_0x0016
            L_0x0092:
                if (r5 == r2) goto L_0x009c
                com.google.android.exoplayer2.text.ssa.SsaStyle$Format r0 = new com.google.android.exoplayer2.text.ssa.SsaStyle$Format
                int r13 = r14.length
                r4 = r0
                r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13)
                goto L_0x009d
            L_0x009c:
                r0 = 0
            L_0x009d:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.text.ssa.SsaStyle.Format.fromFormatLine(java.lang.String):com.google.android.exoplayer2.text.ssa.SsaStyle$Format");
        }
    }

    static final class Overrides {
        private static final Pattern ALIGNMENT_OVERRIDE_PATTERN = Pattern.compile("\\\\an(\\d+)");
        private static final Pattern BRACES_PATTERN = Pattern.compile("\\{([^}]*)\\}");
        private static final Pattern MOVE_PATTERN = Pattern.compile(Util.formatInvariant("\\\\move\\(%1$s,%1$s,(%1$s),(%1$s)(?:,%1$s,%1$s)?\\)", PADDED_DECIMAL_PATTERN));
        private static final String PADDED_DECIMAL_PATTERN = "\\s*\\d+(?:\\.\\d+)?\\s*";
        private static final Pattern POSITION_PATTERN = Pattern.compile(Util.formatInvariant("\\\\pos\\((%1$s),(%1$s)\\)", PADDED_DECIMAL_PATTERN));
        private static final String TAG = "SsaStyle.Overrides";
        public final int alignment;
        public final PointF position;

        private Overrides(int i, PointF pointF) {
            this.alignment = i;
            this.position = pointF;
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(9:4|5|6|(1:8)|9|10|(2:12|18)(1:17)|15|1) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0021 */
        /* JADX WARNING: Removed duplicated region for block: B:12:0x0027  */
        /* JADX WARNING: Removed duplicated region for block: B:17:0x0009 A[SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static com.google.android.exoplayer2.text.ssa.SsaStyle.Overrides parseFromDialogue(java.lang.String r5) {
            /*
                java.util.regex.Pattern r0 = BRACES_PATTERN
                java.util.regex.Matcher r5 = r0.matcher(r5)
                r0 = -1
                r1 = 0
                r2 = r0
            L_0x0009:
                boolean r3 = r5.find()
                if (r3 == 0) goto L_0x0029
                r3 = 1
                java.lang.String r3 = r5.group(r3)
                java.lang.Object r3 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r3)
                java.lang.String r3 = (java.lang.String) r3
                android.graphics.PointF r4 = parsePosition(r3)     // Catch:{ RuntimeException -> 0x0021 }
                if (r4 == 0) goto L_0x0021
                r1 = r4
            L_0x0021:
                int r3 = parseAlignmentOverride(r3)     // Catch:{ RuntimeException -> 0x0009 }
                if (r3 == r0) goto L_0x0009
                r2 = r3
                goto L_0x0009
            L_0x0029:
                com.google.android.exoplayer2.text.ssa.SsaStyle$Overrides r5 = new com.google.android.exoplayer2.text.ssa.SsaStyle$Overrides
                r5.<init>(r2, r1)
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.text.ssa.SsaStyle.Overrides.parseFromDialogue(java.lang.String):com.google.android.exoplayer2.text.ssa.SsaStyle$Overrides");
        }

        public static String stripStyleOverrides(String str) {
            return BRACES_PATTERN.matcher(str).replaceAll("");
        }

        private static PointF parsePosition(String str) {
            String str2;
            String str3;
            Matcher matcher = POSITION_PATTERN.matcher(str);
            Matcher matcher2 = MOVE_PATTERN.matcher(str);
            boolean find = matcher.find();
            boolean find2 = matcher2.find();
            if (find) {
                if (find2) {
                    StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 82);
                    sb.append("Override has both \\pos(x,y) and \\move(x1,y1,x2,y2); using \\pos values. override='");
                    sb.append(str);
                    sb.append("'");
                    Log.m16947i(TAG, sb.toString());
                }
                str2 = matcher.group(1);
                str3 = matcher.group(2);
            } else if (!find2) {
                return null;
            } else {
                str2 = matcher2.group(1);
                str3 = matcher2.group(2);
            }
            return new PointF(Float.parseFloat(((String) Assertions.checkNotNull(str2)).trim()), Float.parseFloat(((String) Assertions.checkNotNull(str3)).trim()));
        }

        private static int parseAlignmentOverride(String str) {
            Matcher matcher = ALIGNMENT_OVERRIDE_PATTERN.matcher(str);
            if (matcher.find()) {
                return SsaStyle.parseAlignment((String) Assertions.checkNotNull(matcher.group(1)));
            }
            return -1;
        }
    }
}

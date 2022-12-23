package com.smaato.sdk.video.utils;

import java.util.Random;

public class RandomUtils {
    public String random8DigitNumber() {
        return String.valueOf(randomNumberBetweenMinAndMax(10000000, 99999999));
    }

    public int randomNumberBetweenMinAndMax(int i, int i2) throws IllegalArgumentException {
        return new Random().nextInt((i2 - i) + 1) + i;
    }
}

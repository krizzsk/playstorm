package com.smaato.sdk.core.util;

public final class Either<Left, Right> {
    private final Left left;
    private final Right right;

    Either(Left left2, Right right2) {
        if (left2 == null && right2 == null) {
            throw new IllegalArgumentException("Both parameters are null. Either left or right parameter should be not null");
        } else if (left2 == null || right2 == null) {
            this.left = left2;
            this.right = right2;
        } else {
            throw new IllegalArgumentException("Both parameters are not null. Either left or right parameter should be null");
        }
    }

    public Left left() {
        return this.left;
    }

    public Right right() {
        return this.right;
    }

    public static <Left, Right> Either<Left, Right> left(Left left2) {
        return new Either<>(left2, (Object) null);
    }

    public static <Left, Right> Either<Left, Right> right(Right right2) {
        return new Either<>((Object) null, right2);
    }
}

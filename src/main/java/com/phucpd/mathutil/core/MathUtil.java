package com.phucpd.mathutil.core;

public class MathUtil {

    public static long getFactorial(int n) {

        if (n < 0 || n > 20) {
            throw new IllegalArgumentException(
                    "Invalid parameter. n must be between 0 and 20"
            );
        }

        if (n == 0) {
            return 1;
        }

        long result = 1;

        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        return result;
    }
}
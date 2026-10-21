package com.phucpd.mathutil;

import com.phucpd.mathutil.core.MathUtil;

public class Main {
    static void main() {
        testFactorialGivenValidN5RunWells();
        testFactorialGivenValidN6RunWells();
    }

    // test case #1 check the getFactorial method with valid n, n = 5
    public static void testFactorialGivenValidN5RunWells() {
        int n = 5;                  // tui muốn tính 5!
        long expectedValue = 120;   // hy vọng 5! trả về 120
        long actualValue = MathUtil.getFactorial(n);
        System.out.println("5! =");
        System.out.println("Expected: " + expectedValue);
        System.out.println("Actual: " + actualValue);
    }

    // test case #2 check the getFactorial method with valid n, n = 6
    public static void testFactorialGivenValidN6RunWells() {
        int n = 6;                  // tui muốn tính 5!
        long expectedValue = 720;   // hy vọng 5! trả về 120
        long actualValue = MathUtil.getFactorial(n);
        System.out.println("6! =");
        System.out.println("Expected: " + expectedValue);
        System.out.println("Actual: " + actualValue);
    }
}

package com.phucpd.mathutil.core;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class MathUtilTest {
    @Test
    void testFactorialGivenValidN6ReturnsWell720() {
        int n = 6;
        long expected = 720;
        long actual = MathUtil.getFactorial(n);

        //so sánh bằng cơm hay bằng framework
        //bằng cơm, in log file, đã chơi và nay ko chơi, xem bên main()

        //so sánh bằng tool xanh đỏ
        assertEquals(expected, actual);

    }
    // test case 3: n =0!, expected = 1 =hàm phải ném ra ngoại lệ thì moiwslaf hàm
    //đúng  vị dự kiển -1 phải ném ra ngoại lệ
    // thấy ngoại lệ là thấy màu xanh
    // ngoại lệ là thứ ko thể
    @Test
    void testFactorialGivenValidN0ReturnsWell1() {
        int n = 0;
        long expected = 1;
        long actual = MathUtil.getFactorial(n);

        //so sánh bằng cơm hay bằng framework
        //bằng cơm, in log file, đã chơi và nay ko chơi, xem bên main()

        //so sánh bằng tool xanh đỏ
        assertEquals(expected, actual);

    }
    // Test case #1: n = 5!, expected = 120
    @Test
    void testFactorialGivenValidN5ReturnsWell120() {

        int n = 5;
        long expected = 120;

        long actual = MathUtil.getFactorial(n);

        assertEquals(expected, actual);
    }

    // Test case #4: n = -1
    // Expected: hàm phải ném ra ngoại lệ
    @Test
    void testFactorialGivenInvalidNMinus1ThrowsException() {

        int invalidN = -1;

        assertThrows(
                IllegalArgumentException.class,
                () -> {
                    MathUtil.getFactorial(invalidN);
                }
        );
    }
}
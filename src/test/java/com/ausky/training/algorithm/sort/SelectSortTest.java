package com.ausky.training.algorithm.sort;

import com.ausky.training.algorithm.sort.select.SelectSort;
import org.testng.annotations.Test;

import java.util.UUID;

import static com.ausky.training.algorithm.sort.util.Printer.print;

@Test
public class SelectSortTest {

    @Test
    public void testNormalSort() {
        int[] values = new int[]{1, 3, 2, 9, 7, 56, 11, 34};
        print(values);

        print(new SelectSort().sort(values));
    }


    @Test
    public void testRandom() {
        for (int i = 0; i < 10; i++) {
//            Gen
        }
    }

    @Test
    public void test() {
        long result = 5;
        for (int i = 0; i < 18; i++) {
            result = result * 10 + 9;
            System.out.println(result);
            System.out.println((result + "").length());

            System.out.println(Long.toHexString(result));
            System.out.println(Long.toHexString(result).length());
        }
        System.out.println(result);

        System.out.println((Long.MAX_VALUE + ""));
        System.out.println((Long.MAX_VALUE + "").length());
    }

    @Test
    public void test2() {
//        System.out.println(Long.parseLong("0x123ace"));
        System.out.println(Long.toHexString(4435274));
        System.out.println(UUID.randomUUID().toString().replaceAll("-", "").length());
    }
}

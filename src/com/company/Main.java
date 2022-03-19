package com.company;

import javax.sql.rowset.spi.SyncFactory;
import java.awt.*;

public class Main<arr> {

    public static void main(String[] args) {
        int[] arr = generateRandomArray();
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        int minArr = 0;
        int maxArr = 0;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
            sum = sum + arr[i];
            if (i == arr.length - 1) {
                System.out.println("Сумма трат за месяц составила " + sum + " рублей");
            }
        }
            return arr;
        }
    }




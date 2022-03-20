package com.company;


public class Main {
    public static void main(String[] args) {
        generateRandomArray();
        task1();
    }

    int[] arr = generateRandomArray();

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        //№1
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");
        //№2
        int minArr = 100000;
        int maxArr = -1;
        for (int i : arr) {
            if (i > maxArr) {
                maxArr = i;
            } else {
                minArr = i;
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + minArr + " рублей." + " Максимальная сумма трат за день составила " + maxArr + " рублей");
        //№3
        double days = 30;
        int result = 0;
        for (int i : arr) {
            result += i;
        }
        System.out.println("Средняя сумма трат за месяц составила " + result / days + " рублей");
        return arr;
    }

    public static void task1() {
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}


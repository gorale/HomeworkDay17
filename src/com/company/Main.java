package com.company;

public class Main {

    public static int remainder(int num,int k){
        return remainder(num)%k;
    }

    public static  int remainder(int num){
        int sum =0;
        while (true){
            if(num == 0){
                break;
            }
            sum +=num%10;
            num/=10;

        }
        return sum;
    }



    /**
     * Task 09.
     * Celsius and Fahrenheit
     *
     * @param fahrenheit
     * @param choice
     */
    public static void celsiusFahrenheit(int choice, float fahrenheit) {

        if (choice == 1) {
            System.out.println((fahrenheit - 32) * 5 / 9);
        }

    }

    public static void celsiusFahrenheit(float celsius, int choice) {

        if (choice == 0) {
            System.out.println((int) (celsius * 9 / 5 + 32));
        } else if (choice == 1) {
            System.out.println((double) (celsius * 9 / 5 + 32));
        } else {
            System.out.println("illegal argument");
        }

    }

    /**
     * Task 08.
     *
     * @param x1
     * @param y1
     * @param x2
     * @param y2
     * @return
     */
    public static double distance(int x1, int y1, int x2, int y2) {

        return Math.sqrt(Math.pow(Math.abs(x1 - x2), 2) + Math.pow(Math.abs(y1 - y2), 2));
    }

    public static double distance(int x1, int y1) {
        return Math.sqrt(Math.pow(x1 - 0.0, 2) + Math.pow(y1 - 0.0, 2));
    }


    /**
     * Task 07.
     *
     * @param a
     * @param b
     * @param c
     * @param d
     * @return
     */
    public static int max(int a, int b, int c, int d) {
        if (d > max(a, b, c)) {
            return d;
        } else {
            return max(a, b, c);
        }
    }

    public static int max(int a, int b, int c) {
        if (c > max(a, b)) {
            return c;
        } else {
            return max(a, b);
        }
    }

    public static int max(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    /**
     * Task 06.
     *
     * @param a
     * @param b
     * @return
     */
    public static int square(int a, int b) {

        return a * b;
    }

    public static float square(float a) {
        float s = a * a;
        return s;
    }

    public static float square(int a) {
        float pi = 3.14f;
        return pi * a * a;
    }


    /**
     * Task 05.
     *
     * @param array
     * @param a
     * @return
     */

    public static boolean search(int[] array, int a, int index) {
        boolean k = false;
        for (int i = 0; i < search(array); i++) {
            if (array[i] == a && i == index) {
                k = true;
            }
        }
        return k;

    }

    public static int search(int[] array, int a) {
        int k = 0;
        for (int i = 0; i < search(array); i++) {
            if (array[i] == a) {
                k = i;
            }
        }
        return k;
    }


    public static int search(int[] array) {
        return array.length;
    }


    /**
     * Task 04.
     *
     * @param arr1
     */
    private static void arr(double[] arr1) {

        System.out.print("[");
        for (int i = 0; i < arr1.length; i++) {
            if (i == arr1.length - 1) {
                System.out.print(arr1[i] + "]");
                break;
            }
            System.out.print(arr1[i] + ",");
        }


    }

    private static void arr(float[] arr1) {

        System.out.print("[");
        for (int i = 0; i < arr1.length; i++) {
            if (i == arr1.length - 1) {
                System.out.print(arr1[i] + "]");
                break;
            }
            System.out.print(arr1[i] + ",");
        }


    }

    private static void arr(int[] arr1) {

        System.out.print("[");
        for (int i = 0; i < arr1.length; i++) {
            if (i == arr1.length - 1) {
                System.out.print(arr1[i] + "]");
                break;
            }
            System.out.print(arr1[i] + ",");
        }


    }

    /**
     * Task 02.Write 2 functions where first returns float second returns int,
     * and they have the same parameters for input.
     *
     * @param n
     * @param m
     * @return
     */
    public static double sum(float n, float m) {
        double s = n + m;
        return s;
    }

    public static int sum(int n, int m) {
        int s = n + m;
        return s;
    }

    /**
     * Task 01.Write a function add with these 3 types of overloading.
     * static void add();
     * Which prints which method is called and result
     *
     * @param n
     * @param m
     */
    public static void add(int n, int m) {
        System.out.println("add(int int)" + " " + n + " " + m);
    }

    public static void add(int n) {
        System.out.println("add(int)" + " " + n);
    }

    public static void add(int n, float m) {
        System.out.println("add(int float)" + " " + n + " " + m);
    }

    public static void main(String[] args) {

//        add(4);
//        add(3,5);
//        add(3,4f);
//        sum(10,10);
//        sum(10,30);

//        int[] arr1 = {1,2,3,4,5,6};
//        float[] arr2 = {1,2,3,4,3};
//        double[] arr3 = {2,3,3,3,3,3,3};
//        arr(arr3);

//        int[] array = {1,2,32,32,4,5,6,2,5};
//        System.out.println(search(array));
//        System.out.println(search(array,4));
//        System.out.println(search(array,4,5));

//        System.out.println(square(5));
//        System.out.println(square(5,6));
//        System.out.println(square(5.6f));

//        System.out.println(max(8,7));
//        System.out.println(max(8,7,4));
//        System.out.println(max(8,7,9,-1));

//        System.out.println(distance(15,7));
//        System.out.println(distance(15,7,4,5));


//        celsiusFahrenheit(3f, 4);
//        celsiusFahrenheit(1,32.3f);

        System.out.println(remainder(444));
        System.out.println(remainder(444,5));


    }


}

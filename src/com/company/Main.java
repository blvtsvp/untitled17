package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int z = in.nextInt();
        int[] a = new int[n];
        int sum = 0;
        for(int i = 0; i < n;i++){
            a[i] = in.nextInt();
            if(a[i] > z) {
                a[i] = z;
                sum++;
            }
        }
        System.out.println("Колличество элементов больше данного числа " + z +" равна " + sum);
    }
}

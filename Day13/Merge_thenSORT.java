package com.souvik.Day13;

import java.util.Arrays;
import java.util.Scanner;

public class Merge_thenSORT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in first array : ");
        int n = sc.nextInt();
        System.out.println("Enter the number of elements in the secon array : ");
        int n1= sc.nextInt();
        int[] arr = new int[n+n1];
        int[] arr2 =new int[n1];
        System.out.println("Enter elements in the array 1 : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter elements in the array 2 : ");
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = sc.nextInt();
        }
        mergethenSort(arr,arr2, n , n1);
        System.out.println("after merging : " + Arrays.toString(arr) );
        /*System.out.println("after merging : " );
        for (int i = 0; i < arr.length; i++) {

            System.out.print(arr[i] + " ");
        }*/

    }

    private static void mergethenSort(int[] arr, int[] arr2, int size1 ,int size2) {
        for (int i = 0; i < size1;  i++) {
            for (int j = 0; j < size2; j++) {
                arr[size1+j]=arr2[j];
            }
        }
    }
}

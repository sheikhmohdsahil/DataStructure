package DataStructure;

import java.util.Scanner;

public class BubbleSort {
    public static void bubble(int[] a) {
        int temp=0;
        for (int i = 0; i < a.length-1; i++) {
            for (int j = 0; j < a.length-1-i; j++) {
                if(a[j]>a[j+1]) {
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int []a=new int[scan.nextInt()];
        for (int i = 0; i < a.length; i++) {
            a[i]=scan.nextInt();
        }
        bubble(a);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]+" ");
        }
    }

}

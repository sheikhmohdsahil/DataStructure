package DataStructure;

import java.util.Scanner;

public class BinarySearch {
    public static int binary(int []a,int key ) {

        int low=0,high=a.length-1,mid=0;
        while(low<=high) {
            mid=(low+high)/2;
            if(key==a[mid]) {
                return mid;
            }
            else if(key<a[mid]) {
                high=mid-1;
                low=low;
            }
            else {

                low=mid+1;
                high=high;
            }

        }

        return -1;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n=scan.nextInt();

//		int[]a= {10,20,30,40,50}
        int[] a=new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i]=scan.nextInt();

        }int temp=0;
        for (int i = 0; i < a.length-1; i++) {
            for (int j = 0; j < a.length-1-i; j++) {
                if(a[j]>a[j+1]) {
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
        System.out.println();
        int key=scan.nextInt();
        System.out.println(binary(a,key));

    }

}

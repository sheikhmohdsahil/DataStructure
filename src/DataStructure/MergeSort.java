package DataStructure;

import java.util.Iterator;
import java.util.Scanner;

public class MergeSort {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n=scan.nextInt();

        int a[] =new int[n];
        System.out.println("enter the array elements");
        for (int i = 0; i < n; i++) {
            a[i] = scan.nextInt();

        }

        msort(a,0,a.length-1);
        for(int x:a) {
            System.out.println(x);
        }
    }
    private static void msort(int[] a, int i, int j) {
        if(i<j) {
            int mid=(i+j)/2;
            msort(a,i,mid);
            msort(a,mid+1,j);
            merge(a,i,mid,j);
        }

    }
    private static void merge(int[] a, int low, int mid, int high) {
        int i=low;
        int j=mid+1;
        int k=low;

        int []b =new int[a.length];
        while(i<=mid && j<=high) {
            if(a[i]<a[j]) {
                b[k]=a[i];
                i++;
                j++;

            }
            else {
                b[k]=a[j];
                j++;
                k++;

            }

        }
        while (i<=mid) {
            b[k]=a[i];
            i++;
            k++;

        }
        while(j<=high) {
            b[k]=a[j];
            j++;
            k++;
        }
        for( i=low;i<=high;i++) {
            a[i]=b[i];
        }



    }}

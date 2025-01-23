package Sort;

import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
//        int [] arr={23,12,45,9};

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array");
        int n= sc.nextInt();
        System.out.println("enter the elements");
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-1;j++){ // 2nd loop will be one less as we are comparing two elements
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];  // swapping
                    arr[j+1]=temp;
                }
            }
        }



  // printing sorted array
        for (int i : arr){
            System.out.print(i+" ");
        }
    }
}

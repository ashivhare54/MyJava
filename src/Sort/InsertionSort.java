package Sort;

public class InsertionSort {
    public static void main(String[] args) {

        int []arr={8,9,2,3,5};
        // we make two parts sorted and unsorted

        for(int i=1;i<arr.length;i++){
            int current=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>current ){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=current;
        }
        for (int i:arr){System.out.print(i);}
    }
}

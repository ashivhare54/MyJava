package Sort;

public class SelectionSort {
    public static void main(String[] args) {
        int [] arr ={12,5,7,23};
        for(int i=0;i<arr.length-1;i++){
            int small=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[small]>arr[j]){
                    small=j;
                }
            }
            int temp=arr[small];
            arr[small]=arr[i];
            arr[i]=temp;
        }
        for(int i : arr){System.out.println(i);}

    }

}


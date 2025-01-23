import java.util.Arrays;

public class Median {
    static int[] arr={1,2,3,4,5,6};
    static int l=arr.length;
    public static void main(String[] args){
        int median=median();
        System.out.print(median);
    }

    public static int median(){
        Arrays.sort(arr);
        if(l%2==0){
           return (arr[l/2]+arr[l/2-1])/2;
        }
        else{
            return arr[l/2];
        }
    }
}

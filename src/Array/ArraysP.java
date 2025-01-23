package Array;

public class ArraysP{
    public static void main(String[] args){

   // get the index of element passed 15
        int[] arr=new int[2];
        arr[0]=15;
        arr[1]=12;
        int index=-1;
        for (int i=0;i<arr.length;i++) {
            if (arr[i] == 15) {
                index =i;
                break;
            }
        }
        // enhanced for loop

        int counter=0,in=-1;
        for(int i : arr){
            if (i==15){
                in=counter;
                break;
            }
            counter++;
        }
        System.out.println(index+""+in);
//--------------------------------------------------------
        int [] ar={23,12,45,9,-4};
        //  int [] ar1=[2,3];  incorrect way instaed
        int arr1[] = new int[]{2}; // Correct

        int [] arr2= new int[]{}; // empty array
        arr2[0]=1;//Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0

    }
}

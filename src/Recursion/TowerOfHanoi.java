package Recursion;

public class TowerOfHanoi {
    public static void main(String[] args) {
        towerOfHanoi(2,"src","helper","des");
    }

    public static void towerOfHanoi(int n,String s,String h,String d){
        if(n==1) { System.out.println("transfer "+n+ " from " +s+" to "+d);return;}

        towerOfHanoi(n-1,"s","d","h");
        System.out.println("transfer "+n+ " from " +s+" to "+d);
        towerOfHanoi(n-1,"h","s","d");
    }
}

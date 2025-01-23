public class StringCompare {

    public static boolean compareObj(String s1, String s2){
        if(s1.length()==s2.length()){ System.out.println("Strings are equal in length"); return true;}
        return false;

    }
    public static void main(String[] args) {
        compareObj("maan","naam");
    }
}

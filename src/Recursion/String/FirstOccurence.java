package Recursion.String;

public class FirstOccurence {
    public static void main(String[] args) {
        String x = "baabba";
        firstOccurence('a', x);            // Original method
        firstOccurenceOptimized('a', x);   // Optimized method
    }

    public static void firstOccurence(char a, String x) {
        for (char i : x.toCharArray()) {
            if (i == a) {
                System.out.println(x.indexOf(i));
                break;
            }
        }
    }

    public static void firstOccurenceOptimized(char a, String x) {
        int index = x.indexOf(a);  // Corrected to find the index of the character
        if (index != -1) {
            System.out.println(index);  // Print the index if found
        }
    }
}

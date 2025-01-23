package java8;

import java.util.function.Function;

 class Lambda {

    public static void main(String[] args) {
        Lambda lambda = new Lambda();

        // java8.Lambda expression that converts a String to its length
        Function<String, Integer> stringLength = (String str) -> str.length();

        // Call the lambdaMethod with a sample input and the lambda expression
        lambda.lambdaMethod("Hello World", stringLength);
    }

    public void lambdaMethod(String input, Function<String, Integer> action) {
        // Apply the lambda function on the input string and print the result
        Integer result = action.apply(input);
        System.out.println("The result is: " + result);
    }
}

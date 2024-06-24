package lambda;

import java.util.function.BiFunction;
import java.util.function.Function;

/**
 * This class demonstrates various uses of lambda expressions in Java.
 */
public class LambdaExamples {
    public static void main(String[] args) {
        // Example 1: Simple lambda with one argument
        // If a lambda has only one argument, the parentheses are optional
        Function<Integer, Integer> adder1 = x -> x + 1;

        // Example 2: Lambda with explicit type declaration
        // Type inference allows the compiler to determine types, but we can also declare them explicitly
        Function<Integer, Integer> mult2 = (Integer x) -> x * 2;

        // Example 3: Lambda with multiple statements
        // For multiple statements, we use curly braces and an explicit return statement
        Function<Integer, Integer> adder5 = (x) -> {
            x += 2;
            x += 3;
            return x;
        };

        // Example 4: BiFunction lambda with two arguments
        // This lambda takes two integers and returns a boolean
        BiFunction<Integer, Integer, Boolean> isDivisible = (x, y) -> x % y == 0;

        // Test the lambda functions
        System.out.println("adder1 result: " + adder1.apply(5));  // Should print 6
        System.out.println("mult2 result: " + mult2.apply(5));    // Should print 10
        System.out.println("adder5 result: " + adder5.apply(5));  // Should print 10
        System.out.println("isDivisible: " + isDivisible.apply(4, 2));  // Should print true
    }
}
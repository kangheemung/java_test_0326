public class Kadai {
    public static void main(String[] args) {
        int number1 = 5;
        boolean boolValue = true; // You can set this to true or false

        int result = getResult(number1, boolValue);

        System.out.println(result); // Output the result (should be 6)
    }

    // Method to conditionally add or subtract from the number based on the boolean value
    public static int getResult(int number, boolean isAdd) {
        // Method 1: Using if-else statement
        /*
        if (isAdd) {
            return number + 1;
        } else {
            return number - 1;
        }
        */

        // Method 2: Using ternary operator
        // return isAdd ? number + 1 : number - 1;

        // Method 3: Using bitwise XOR operator
        // return number + (isAdd ? 1 : -1);

        // Method 4: Using arithmetic operations
        // return number + (isAdd ? 1 : -1);

        return 0; // Placeholder to avoid compilation error, uncomment one of the above return statements
    }
}
// s
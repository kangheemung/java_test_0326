public class kadai {
    public static void main(String[] args) {
        int number1 = 5;
        int number2 = 3;
        String text = "あああああ";
        boolean boolValue = true;

        // Calling the isEven method with number1 and number2 as arguments
        boolean result = isEven(number1, number2);

        System.out.println(result);
    }

    // Method to check if the difference between minuend and subtrahend is even
    public static boolean isEven(int minuend, int subtrahend) {
        int diff = minuend - subtrahend;
        
        // Check if the difference is even
        if (diff % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
}

public class re_turn {
    public static void main(String[] args) {
        int menseki1 = getShikaku(3, 5);
        // Output: 15
        System.out.print(menseki1);

        int menseki2 = getShikaku(6, 5);
        // Output: 30
        System.out.print(menseki2);
    }

    // Defined as a function that returns an integer value
    public static int getShikaku(int tate, int yoko) {
        // Returns the result of tate * yoko to the caller
        return tate * yoko;
    }

    // Function that takes an integer and a double as input and returns a double
    public static double keisan(int num, double fact) {
        double kekka = num * fact;
        // If the calculation result is greater than 0, return the result and exit the function
        if (kekka > 0) {
            return kekka;
        }
        // If the calculation result is 0 or less, return 0
        return 0;
    }
}

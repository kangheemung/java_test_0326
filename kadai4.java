class Sample4 {
    public static void main(String[] args) {
        int number1 = 5;
        int number2 = 3;
        String text = "あああああ";
        boolean boolValue = true;

        text = concat(number1, text);
        System.out.print(text);
    }

    public static String concat(int firstValue, String secondValue) {
        return firstValue + ": " + secondValue;
    }
}
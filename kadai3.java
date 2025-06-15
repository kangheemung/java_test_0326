class Sample3 {
    public static void main(String[] args) {
        int number1 = 5;
        int number2 = 3;
        String text = "あああああ";
        boolean boolValue = true;
        boolValue = reverse(boolValue);
        System.out.print(boolValue);
    }

    public static boolean reverse(boolean boolValue) {
        return !boolValue;
    }
}
class java_0622_1 {
    public static void main(String[] args) {
        int loopCount = 5;
        String text = "あああああ";
        repeat(loopCount, text);
    }
    public static void repeat(int loopCount, String text) {
        if (loopCount <= 0 || loopCount > 10) {
            System.out.println("範囲外の入力値です");
            return;
        } for (int i = 0; i < loopCount; i++) {
            System.out.println(text);
        }
    }
}
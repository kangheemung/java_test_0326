class Sample5 {
    public static void main(String[] args) {
        int number1 = 5;
        int number2 = 3;
        String text = "あああああ";
        boolean boolValue = true;

        int num = getResult(number1, boolValue);
        System.out.print(num);
    }

    /**
     * isAddの値によって自動で加算か減算を行い返却する
     */
    public static int getResult(int number, boolean isAdd) {
        if (isAdd) {
            // isAddがtrueのときは加算
            number++;
            // 以下の記述でも可
            // ++number;
            // number += 1;
            // number = number + 1;
        } else {
            // isAddがfalseのときは減算
            number--;
            // 以下の記述でも可
            // --number;
            // number -= 1;
            // number = number - 1;
        }
        return number;
    }
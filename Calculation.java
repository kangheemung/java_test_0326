// 解答欄の初期値に記載されているプログラムを確認して追記しなさい。

// Executionクラスのmainメソッド内でCalculationクラスに定義されたフィールドにアクセスし、出力例の通りに出力しなさい。

// フィールドに定義されているものは、必ずフィールドにアクセスして出力すること。
// 出力結果

// 10 + 5 = 15
class Calculation {
    public String operator = "+";
    public int num1 = 10;
    public int num2 = 5;
    public int answer = num1 + num2;
}

class Execution {
    public static void main(String[] args) {
        Calculation calc = new Calculation();
        System.out.println(calc.num1 + " " + calc.operator + " " + calc.num2 + " = " + calc.answer);
    }
}


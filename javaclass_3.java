class Calculation {
    public String operator = "+";
    public int num1 = 10;
    public int num2 = 5;
}

class javaclass_3 {
    public static void main(String[] args) {
        // Application クラスのインスタンス作成
        Application app = new Application();
        // 出力処理
        System.out.println(app.msg);
        System.out.println(app.calc.num1 + " " + app.calc.operator + " "
                + app.calc.num2 + " = " + (app.calc.num1 + app.calc.num2));
    }
}

// Application クラス
class Application {
    public Calculation calc = new Calculation();
    public String msg = "計算結果表示";
}

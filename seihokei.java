class Sample {
    // String[] argsは、文字列型の配列を受け取ることが出来る
    public static void main(String[] args) {
        // 配列を繰り返し出力する処理を定義しておきます
        for (int i = 0; i < args.length; i++) {
            System.out.println(i + "番目の要素: " + args[i]);
        }
    }
        public static void main(String[] args) {
        // コマンドライン引数が2つであれば処理を行います
        if (args.length == 2) {
            // args[0], args[1]が整数値でないと実行時にエラー
            int sum = Integer.parseInt(args[0]) + Integer.parseInt(args[1]);
            System.out.println("変数sum: " + sum);
        } else {
            System.out.println("引数を２つセットしてください");
        }
    }

    public static void seihoukei(int side) {
        System.out.println("四角形の面積: " + side * side);
    }

    public static void shikaku(int length, int width) {
        System.out.println("長方形の面積: " + length * width);
    }
}
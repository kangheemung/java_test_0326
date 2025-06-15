class Sample {
    // String[] argsは、文字列型の配列を受け取ることが出来る
    public static void main(String[] args) {
        // 配列を繰り返し出力する処理を定義しておきます
        for (int i = 0; i < args.length; i++) {
            System.out.println(i + "番目の要素: " + args[i]);
        }
    }
    public static void main1s(String[] args) {
        seihoukei(5); // 出力結果) 25
        shikaku(3, 5); // 出力結果 15
        // seihoukei(); // 引数不足コンパイルエラー
        // shikaku(3); // 引数不足コンパイルエラー
    }
    public static void seihoukei(int side) {
        System.out.println("四角形の面積: " + side * side);
    }

    public static void shikaku(int length, int width) {
        System.out.println("長方形の面積: " + length * width);
    }
}
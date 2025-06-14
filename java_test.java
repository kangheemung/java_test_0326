public static void main(String[] args) {
    int menseki1 = getShikaku(3, 5);
    // 出力結果) 15
    System.out.print(menseki1);
    int menseki2 = getShikaku(6, 5);
    // 出力結果) 30
    System.out.print(menseki2);
}

// int型の値を返す関数として定義しました
public static int getShikaku(int tate, int yoko) {
    // tate * yokoの計算結果を呼び出し元に返します。
    return tate * yoko;
}
// public static int 関数名() { /* 処理 */ } // int
// public static int[] 関数名() { /* 処理 */ } // intの配列
// public static String 関数名() { /* 処理 */ } // String
// public static String[] 関数名() { /* 処理 */ } // Stringの配列
// public static boolean 関数名() { /* 処理 */ } // boolean
public static void main(String[] args) {
    keisan(10, 1.1); // 11.0
    keisan(10, -1); // 0
}

public static double keisan(int num, double fact) {
    double kekka = num * fact;
    // 計算結果が0より大きければ計算結果を返却し、関数を終了します
    if (kekka > 0) {
        return kekka;
    }
    // 計算結果が0以下なら0を返すことにします
    return 0;
}
// public static void main(String[] args) {
    sayWhat(""); // 空文字でした
    sayWhat("Hello"); // Hello
}

public static void sayWhat(String str) {
    // str.isEmpty ... 空文字("")かどうかチェック
    if (str.isEmpty()) {
        System.out.print("空文字でした");
        // 空文字ならここで関数を修了
        return;
    }
    System.out.print(str);
}
public static void something() {
    return 1;
    int num = 2; // ここに処理が行きつかないためコンパイルエラー
}
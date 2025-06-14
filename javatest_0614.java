class Sample{
    public static void main(String[] args) {
        for (int i=0; i< args.length; i++)
            System.out.println(i+"番目の要素"+ args[i]);
        }

     // 一辺の長さより正方形の面積を求めて画面出力する関数
// int henが仮引数です
public static void seihoukei(int hen) {
    System.out.println(hen * hen);
}   
public static void shikaku(int tate, int yoko) {
    System.out.println(tate * yoko);
}
//関数名(実引数 [, 実引数...]);
public static void main(String[] args) {
    seihoukei(5); // 出力結果) 25
    shikaku(3, 5); // 出力結果 15
    seihoukei(); // 引数不足コンパイルエラー
    shikaku(3); // 引数不足コンパイルエラー
}
 public static void main(String[] args) {
        // 配列を繰り返し出力する処理を定義しておきます
        for (int i = 0; i < args.length; i++) {
            System.out.println(i + "番目の要素: " + args[i]);
        }
    }

    }

関数を呼び出す時に値を変えられたら...それを実現するのが「引数」
 ブックマーク
目次

引数とは
仮引数
実引数
mainメソッドの引数をあつかってみよう
引数とは
引数(ひきすう・argument)は関数内を呼び出す際に渡せる変数です。

引数を設定することにより関数内で任意の値を利用した処理を実装することが可能となります。

仮引数
関数定義側に設定する変数です。

呼び出し時に引き渡された値はこの仮引数に対して引き渡されます。

基本構文
仮引数は関数の右側の( )内に型とセットで定義します。

カンマ区切りで複数設定することができます。

複数の仮引数を設定した場合、左の仮引数から順に第一引数、第二引数という風に呼びます。

Java
public [static] void 関数名(型 仮引数 [, 型 仮引数 ...]) {
    // 処理
}
例文
Java
// 一辺の長さより正方形の面積を求めて画面出力する関数
// int henが仮引数です
public static void seihoukei(int hen) {
    System.out.println(hen * hen);
}
引数を複数設定する際にも忘れずに型を指定しましょう。

Java
// 縦横の長さより四角形の面積を求めて画面出力する関数
public static void shikaku(int tate, int yoko) {
    System.out.println(tate * yoko);
}
実引数
関数の呼び出し時に引き渡す値を実引数と言います。

ここに記述した値を仮引数へ引き渡します。

基本構文
実引数は関数呼び出し時の( )内に値をセットします。

実引数は関数の定義に合わせて型と順番、数を必ず遵守して渡さなければなりません。

Java
関数名(実引数 [, 実引数...]);
例文
先ほど定義したseihoukeiとshikakuを呼び出してみましょう。

shikakuには2つの仮引数が設定されていますが、shikaku(3);のように呼び出してしまうと、引数不足でコンパイルエラーが起きます。

Java
public static void main(String[] args) {
    seihoukei(5); // 出力結果) 25
    shikaku(3, 5); // 出力結果 15
    seihoukei(); // 引数不足コンパイルエラー
    shikaku(3); // 引数不足コンパイルエラー
}
mainメソッドの引数をあつかってみよう
序盤から利用してきたmainメソッドには、String[] argsという仮引数が定義されています。

次のソースコードを用意してみましょう。

Java
class Sample {
    // String[] argsは、文字列型の配列を受け取ることが出来る
    public static void main(String[] args) {
        // 配列を繰り返し出力する処理を定義しておきます
        for (int i = 0; i < args.length; i++) {
            System.out.println(i + "番目の要素: " + args[i]);
        }
    }
}
// mainメソッドに渡す引数をコマンドライン引数と呼びます。

// ここではコマンドライン引数の設定方法について説明します。

// 基本構文

// javaコマンドの実行時に実引数を渡します。

// String[] argsは配列ですので、スペース区切りで値を複数渡すことが可能です。

// PlainText
// java クラス名 引数1 引数2 引数3 ...
// 実行例

// javaコマンドを実行してみましょう。

// abc、100、2.0、trueの4つの値を引数として渡します。

// PlainText
// java Sample abc 100 2.0 true
// 実引数を渡されたString[] argsの中身は次のような配列になります。

// (100や2.0、trueも文字列であることに注意しましょう)

// PlainText
// {"abc", "100", "2.0", "true"}
// 実行結果は次のようになります。


class Sample1 {
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
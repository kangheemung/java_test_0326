public class Main {
    public static void main(String... args) {
        System.out.println(3 - 5);
        
    }
}
///＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝

public class Main {
    public static void main(String... args) {
        System.out.println(3 * 5);
        
    }
}
///＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝

public class Main {
    public static void main(String... args) {
        System.out.println(6/4 );
        
    }
}
///＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝


public class Main {
    public static void main(String... args) {
        System.out.println(6.0 / 4 );
        
    }
}

//  期待する出力値

// 1.5
//==============あまり計算

public class Main {
    public static void main(String... args) {
        System.out.println(5 % 3 );
    }
}

//================================出力Hellow100world
public class Main {
    public static void main(String... args) {
        System.out.println("Hellow"+ 100 +"world");
    }
}


//================================私の名前は、霧島です。
public class Main {
    public static void main(String... args) {
        System.out.println("私の名前は、"+"霧島です。");
    }
}

//==========================

public class Main {
    public static void main(String... args) {
        System.out.println((4 + 6 )/ 5);
    }
}
//================
public class Main {
    public static void main(String... args) {
        String text = "paiza";
        System.out.println(text);
    }
}
//================

public class Main {
    public static void main(String... args) {
        String text;
        text="paiza";
        System.out.println(text);
    }
}

//==========================
import java.util.*;

public class Main {
    public static void main(String... args) {
        System.out.println("こんにちは");
        
    }
}


//==========================
public class Main {
    public static void main(String... args) {
        String greeting;
        // 以下にコードを追加
       greeting ="こんばんは";
        System.out.println(greeting);
    }
} 
//============================

public class Main {
    public static void main(String... args) {
        String iff;
        
    }
}
//============================データ型
String company = "paiza";
Integer number = 20;
//============================データ型
//Character型         String型
//1文字を表す              文字列(０文字以上文字の集まりを表す)
//シングルクオーテーション   ダブルクオーテーション

Character paizaRank= 'S';
String name= "なんとか";

//=====================データ
// integer型＋ー21億範囲
Integer money= 10000;
// Long 型 ＋ー900京の範囲
//大きな整数
Long population= 12560000L;
// Short 型
// 約＋ー3.2万の範囲の整数を表す
// 小さな整数
Short age = 20;
// Byte 型
// 約＋ー128の範囲の整数を表す
// とても小さい整数
Byte month=  4;
// Double型
// 約＋ー1.8X10＾308〜約＋ー4.9X10＾324の範囲の小数を表す
// とても小さい整数
Double pi=3.14159265359;
//Float型
// 約＋ー3.4.8X10＾38〜約＋ー1.4X10＾-45の範囲の小数を表す
// とても小さい整数
Float height=173.5F;
// 少し曖昧でも良い小数
// 末尾にFまた（f）をつける
// Boolean型
// 真偽値を表す。
Boolean result = true;

Boolean isEmpty = false;




public class Main {
    public static void main(String... args) {
        final Integer money = 1000;
        money = 20;
        System.out.println(money);
    }
}
// :finalを使った定数の宣言
// Main.java:4: error: cannot assign a value to final variable money
//         money=20;
//         ^
// 1 error
// public class Main {
//     public static void main(String... args) {
//         Integer x = 10 + 10;
//         System.out.println(x);
        
//     }
// }
public class Main {
    public static void main(String... args) {
        Integer x = 10 + 10;
        System.out.println(x);
        
        String w = "こんにちは" + "世界";
        System.out.println(w);
    }
}

public class Main {
    public static void main(String... args) {
        Integer price = 200;
         Integer total=price *5;
         System.out.println(total);

    }
}

public class Main {
    public static void main(String... args) {
        Integer price = 200;
         Integer total=price *5;
         System.out.println(total);
        String priduct="りんご";
        System.out.println(priduct+"です");
        System.out.println(priduct+"値段は"+ total +"です");
        
    }
}
public class Main {
    public static void main(String... args) {
        final Double tax = 1.1; // 消費税率を10%に設定
        Integer applePrice = 100; // リンゴ1個の価格を設定
        Integer numOfApples = 5; // 購入するリンゴの個数を設定

        Double totalPrice = (applePrice * numOfApples) *  tax; // 税込価格を計算

        System.out.println(totalPrice);
    }
}


public class Main {
    public static void main(String... args) {
        final Double tax = 1.1;
        Integer book = 1000;
      System.out.println("本の定価は"+book+"円です");
     System.out.println("本の税込価格は"+(book*tax)+"円です");


    }
}
public class Main {
    public static void main(String... args) {
        Integer i = 1;
        System.out.println(i);
        Integer q = 2;
        System.out.println(q);
        // 以下にコードを追加
    }
}
public class Main {
    public static void main(String... args) {
        Integer x = 1;

        System.out.println(x);
    }
}
public class Main {
    public static void main(String... args) {
        Integer x = 1;
            x  +=3;//x=x+3;と同じ複合代入演算子
        System.out.println(x);
    }
}

public class Main {
    public static void main(String... args) {
        String w = "paiza";
        System.out.println(w);
        String s = "paiza";
        s += "learning";
        System.out.println(s);
        // 以下にコードを追加
    }
}

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String... args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(8);
        numbers.add(1);
        numbers.add(3);
        // 以下にコードを追加
        Collections.sort(numbers);
        Collections.reverse(numbers);
        
        System.out.println(numbers);
    }
}


import java.util.ArrayList;

public class Main {
    public static void main(String... args) {
        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("apple");
        fruits.add("orange");
        fruits.add("lemon");

        System.out.println("fruits：" + fruits);
        ArrayList<String>fruits_copy = new ArrayList<>(fruits);
    }
}



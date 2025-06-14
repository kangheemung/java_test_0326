package jp.paiza.test;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Appのテストクラス
 */
class AppTest {
    private App app;
     @BeforeEach
     void setup() {
        app = new App();
    }
    //全て小文字ケース
    @Test
    void testA() {
        assertEquals("ABC", app.insert("abc"), () -> "結果が異なります");
    }
    //全て小文字ケース
    @Test
    void testB() {
        assertEquals("abc", app.insert("ABC"), () -> "結果が異なります");
    }
    //大文字と小文字が混ざってるケース
     @Test
        void testC() {
            assertEquals("AbC", app.insert("aBc"), () -> "結果が異なります");
        }
        //空文字
         @Test
    void testD() {
        assertEquals("", app.insert(""), () -> "結果が異なります");
    }
    //引き数がnull
      @Test
    void testE() {
        assertThrows(
            IllegalArgumentException.class,
            () -> app.insert(null),
            () -> "結果が異なります");
    }
}
=============================================

// package jp.paiza.test;

// /**
//  * テスト対象クラス
//  */
// public class App {
//     /**
//      * 引数で渡された文字列について、小文字を全て大文字に、
//      * 大文字を全て小文字にした文字列を返します.
//      *
//      * @param input 変換対象
//      * @return 変換後文字列
//      * @throws IllegalArgumentException 引数がnullの場合
//      */
//     public String insert(String input) throws IllegalArgumentException {
//          if (input == null) {
//             throw new IllegalArgumentException("引数がnullです");
//         }
//         var chars = input.toCharArray();
//         var answer = new StringBuilder();
//          for (var c : chars) {
//             if (Character.isUpperCase(c)) {
//                 answer.append(Character.toLowerCase(c));
//             } else {
//                 answer.append(Character.toUpperCase(c));
//             }
//         }
//         return answer.toString();
//     }
// }
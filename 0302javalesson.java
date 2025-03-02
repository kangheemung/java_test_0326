import java.util.*;

public class Main {
    public static void main(String... args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("apple");
        fruits.add("orange");
        fruits.add("lemon");
        System.out.println(fruits.get(0));
        System.out.println(fruits.get(0));
    }
}
//======================================
import java.util.*;

public class Main {
    public static void main(String... args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("apple");
        fruits.add("orange");
        fruits.add("lemon");

        fruits.forEach((String fruit)->{
            System.out.println(fruit);
        });
    }
}
//======================================

import java.util.ArrayList;

public class Main {
    public static void main(String... args) {
        ArrayList<String> users = new ArrayList<>();

        users.add("kirishima");
        users.add("rokumura");
        users.add("midorikawa");
    users.forEach((String user)->{
            System.out.println(user);
    });
    }
}


//======================================処理だでの記述
import java.util.ArrayList;

public class Main {
    public static void main(String... args) {
        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("apple");
        fruits.add("orange");
        fruits.add("lemon");

        fruits.forEach(x-> System.out.println(x));

    }
}
//======================================処理だでの記述


import java.util.ArrayList;

public class Main {
    public static void main(String... args) {
        ArrayList<String> animals = new ArrayList<>();

        animals.add("dog");
        animals.add("cat");
        animals.add("panda");
     animals.forEach(x-> System.out.println(x));
    }
}


//======================================処理だでの記述

import java.util.ArrayList;

public class Main {
    public static void main(String... args) {
        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("apple");
        fruits.add("orange");
        fruits.add("lemon");
 fruits.forEach(x-> System.out.println(x));
    }
}
//======================================処理だでの記述

import java.util.ArrayList;

public class Main {
    public static void main(String... args) {
        ArrayList<String> users = new ArrayList<>();

        users.add("kirishima");
        users.add("rokumura");
        users.add("midorikawa");
        users.forEach(x->System.out.println(x));

    }
}

//============================= 全部大文字に変える

import java.util.ArrayList;

public class Main {
    public static void main(String... args) {
        ArrayList<String> users = new ArrayList<>();

        users.add("kirishima");
        users.add("rokumura");
        users.add("midorikawa");
    users.forEach(user->{
      String userUpper = user.toUpperCase();
      System.out.println(userUpper);
    });
  } 
}



//============================= for==================
import java.util.ArrayList;

public class Main {
    public static void main(String... args) {
        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("apple");
        fruits.add("orange");
        fruits.add("lemon");
        
        for (String fruit : fruits){
            System.out.printLn(fruit);
        }
    }
}


import java.util.ArrayList;

public class Main {
    public static void main(String... args) {
        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("apple");
        fruits.add("orange");
        fruits.add("lemon");
        
        for (String fruit : fruits){
            String delicious = fruit + "が美味しい";
            System.out.println(delicious);
        }
    }
}


//============================= appleが美味しい
//=============================orangeが美味しい
//=============================lemonが美味しいr==================

//===================条件=========================
import java.util.ArrayList;

public class Main {
    public static void main(String... args) {
       Integer i=0;
       if(i == 0){
           System.out.println("iは0です。");
       }
    }
}

//===================条件=========================
public class Main {
    public static void main(String... args) {
        Integer i = 5;

        if (i == 5) {
            System.out.println("iは5");
        }
    }
}
//===================条件=========================
public class Main {
    public static void main(String... args) {
        Integer i = 10;

        if (i == 10) {
            System.out.println("iは10");

      }
    }
}

//===================条件==else=======================
public class Main {
    public static void main(String... args) {

        Integer i = 0;

        if (i == 0) {
            System.out.println("iは0です");
        }else{
           System.out.println("iは0ではないです");
            
        }
    }
}


//===================条件==else=======================
public class Main {
    public static void main(String... args) {
        Integer i = 7;

        if (i == 5) {
            System.out.println("iは5");
        }else{
              System.out.println("iは5ではない");
        }
    }
}

//===================条件==else=======================
public class Main {
    public static void main(String... args) {

        Integer i = 1;

        if (i == 0) {
            System.out.println("iは0です");
        } else if(i == 1){
                System.out.println("iは1です");
        }
          else{
                System.out.println("iは1でも0でもありません");
        }
      }
}


//===================条件==else=======================
public class Main {
    public static void main(String... args) {
        Integer i = 2;

        if (i == 1) {
            System.out.println("1位です");
        } else if(i == 2){
            System.out.println("2位です");
        }else{
            System.out.println("最下位です");
        }
    }
}





//===================条件==else=======================
import java.util.ArrayList;

public class Main {
    public static void main(String... args) {
        ArrayList<Integer> scores =new ArrayList<>();
        scores.add(1);
        scores.add(2);
        scores.add(3);
        scores.add(4);
        scores.add(5);
        
        scores.forEach(score -> {
            if (score % 2 == 0){
                System.out.println(score +"は偶数");
            }else{ 
                System.out.println(score +"は奇襲");
                
            }
        });
        
    }
}

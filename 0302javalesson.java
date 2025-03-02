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

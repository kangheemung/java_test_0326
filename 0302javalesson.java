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

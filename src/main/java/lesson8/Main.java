package lesson8;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ChainingHashMap<Integer, String> map = new ChainingHashMap<>();
        map.put(1, "one");
        map.put(8, "one");
        map.put(2, "two");
        map.put(3, "three");
        map.put(4, "four");
        map.put(5, "five");

        System.out.println(map);
        map.remove(8);
        System.out.println(map);

    }


}

package lesson_20220901.hash_map;

import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args) {

        HashMap<String, String> cars = new HashMap<>();

        cars.put("name1", "BMW");
        cars.put("name2", "Audi");
        cars.put("name2", "Opel");
        cars.put("name3", "Duster");
        System.out.println(cars);

        cars.remove("name2", "Opel");
        System.out.println(cars);

        cars.replace("name3", "Duster", "updatedDuster");
        System.out.println(cars);
    }
}

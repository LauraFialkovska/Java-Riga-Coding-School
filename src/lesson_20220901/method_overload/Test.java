package lesson_20220901.method_overload;

public class Test {
    // Metožu overloading

    public void hello() {
        System.out.println("Hello!");
    }

    public String hello(String name) {
        System.out.println(name);
        return name;
    }

    public int hello(int year) {
        System.out.println(year);
        return year;
    }
}

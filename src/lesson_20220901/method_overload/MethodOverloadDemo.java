package lesson_20220901.method_overload;

public class MethodOverloadDemo {
    public static void main(String[] args) {

        Test test = new Test();

        test.hello();
        test.hello("Fizik");
        test.hello(20);
    }
}

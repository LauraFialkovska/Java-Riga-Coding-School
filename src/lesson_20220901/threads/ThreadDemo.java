package lesson_20220901.threads;

public class ThreadDemo {
    public static void main(String[] args) {
        Test test1 = new Test();
        Test test2 = new Test();

        // Izpildas sicigi
//        test1.run();
//        test2.run();

        // Izpildas paralleli
        test1.start();
        test2.start();
    }
}

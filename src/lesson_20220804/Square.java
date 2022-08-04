package lesson_20220804;

public class Square implements Shape {

    @Override
    public int area(int borderSize) {
        return borderSize * borderSize;
    }

    @Override
    public int perimeter(int borderSize) {
        return borderSize * 4;
    }
}

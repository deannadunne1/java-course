package abstraction;

public class ShapeTester {

    public static void main(String[] args) {
        Shape rectangle = new Rectangle(28, 34);
        rectangle.print();
        System.out.println(rectangle.calculateArea());
    }
}

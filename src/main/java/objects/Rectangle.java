package objects;

public class Rectangle {
    private double length;
    private double width;
    private int sides = 4;

    public Rectangle(){
        setLength(0); // or this.length = 0
        setWidth(0); // calling setter methods is preferred if they exist
    }

    public Rectangle(double length, double width){
        setLength(length); // or this.length = 0
        setWidth(width); // calling setter methods is preferred if they exist
    }

    public double calculatePerimeter(){
        return (2*length) + (2*width);
    }

    public double calculateArea(){
        return length * width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public int getSides() {
        return sides;
    }

    public void setSides(int sides) {
        this.sides = sides;
    }
}

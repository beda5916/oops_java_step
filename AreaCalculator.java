/*/*Problem Statement: Area Calculator using Method Overloading
Write a Java program to demonstrate method overloading by calculating the area of different shapes.
Create methods named area() to find:
Area of a square (side × side)
Area of a rectangle (length × breadth)
Area of a circle (π × radius × radius)
In the main() method, create an object and call each method. */
public class AreaCalculator {

    void area(int side) {
        System.out.println("Area of Square: " + (side * side));
    }

    void area(int length, int breadth) {
        System.out.println("Area of Rectangle: " + (length * breadth));
    }

    void area(double radius) {
        System.out.println("Area of Circle: " + (Math.PI * radius * radius));
    }

    public static void main(String[] args) {
        AreaCalculator obj = new AreaCalculator();

        obj.area(5); // Area of Square
        obj.area(10, 20); // Area of Rectangle
        obj.area(7.5); // Area of Circle
    }
}
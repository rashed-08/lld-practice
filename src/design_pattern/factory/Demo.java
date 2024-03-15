package design_pattern.factory;

public class Demo {
    public static void main(String[] args) {
        ShapeFactory factory = new ShapeFactory();
        Shape circle = factory.getShape("CIRCLE");
        circle.draw();
        Shape rectangle = factory.getShape("rectangle");
        rectangle.draw();
    }
}

package design_pattern.factory;

public class ShapeFactory {
    Shape shapeFactory;

    public Shape getShape(String type) {
        if (type == null) {
            return null;
        }

        if (type.equalsIgnoreCase("circle")) {
            return new Circle();
        } else if (type.equalsIgnoreCase("rectangle")) {
            return new Rectangle();
        } else if (type.equalsIgnoreCase("square")) {
            return new Square();
        }
        return null;
    }
}

public class Test {

    public static void main(String[] args) {

        Shape circle = new Shape(5.0);
        Shape square = new Shape(4, 3.0);
        Shape rectangle = new Shape(4, 4.0, 6.0);
        Shape triangle = new Shape(3, 3.0, 4.0, 5.0);
        Shape undefinedShape = new Shape();
        
        String circleDetails = circle.getShapeDetails();
        String squareDetails = square.getShapeDetails();
        String rectangleDetails = rectangle.getShapeDetails();
        String triangleDetails = triangle.getShapeDetails();
        String undefinedShapeDetails = undefinedShape.getShapeDetails();

        System.out.println("Circle Details:\n" + circleDetails + "\n");
        System.out.println("Square Details:\n" + squareDetails + "\n");
        System.out.println("Rectangle Details:\n" + rectangleDetails + "\n");
        System.out.println("Triangle Details:\n" + triangleDetails + "\n");
        System.out.println("Undefined Shape Details:\n" + undefinedShapeDetails);
    }
}


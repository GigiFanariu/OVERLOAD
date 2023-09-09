public class Shape {

    private String shapeName;
    private int numberOfEdges;

    public Shape() {
        System.out.println("Shape object created.");
        shapeName = "Undefined shape";
    }

    public Shape(double radius) {
        System.out.println("Circle object created.");
        shapeName = "Circle";
        numberOfEdges = 0; // Circles have 0 edges
    }

    public Shape(int edges, double edgeLength) {
        System.out.println("Square object created.");
        shapeName = "Square";
        numberOfEdges = edges;
    }

    public Shape(int edges, double e1, double e2) {
        System.out.println("Rectangle object created.");
        shapeName = "Rectangle";
        numberOfEdges = edges;
    }

    public Shape(int edges, double e1, double e2, double e3) {
        System.out.println("Triangle object created.");
        shapeName = "Triangle";
        numberOfEdges = edges;
    }

    public String getShapeDetails() {
        return "Shape Name: " + shapeName + "\nNumber of Edges: " + numberOfEdges;
    }
}

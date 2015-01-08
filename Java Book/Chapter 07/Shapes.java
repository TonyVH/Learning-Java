// A simple class hierarchy.

// A class for two-dimentional objects.
class TwoDShape {
    private double width;
    private double height;

    TwoDShape() {
        width = height = 0.0;
    }

    TwoDShape(double w, double h) {
        width = w;
        height = h;
    }

    TwoDShape(double x) {
        width = height = x;
    }

    TwoDShape(TwoDShape ob) {
        width = ob.width;
        height = ob.height;
    }

    // Accessor methods for width and height.
    double getWidth() {
        return width;
    }

    double getHeight() {
        return height;
    }

    void setWidth(double w) {
        width = w;
    }

    void setHeight(double h) {
        height = h;
    }

    void showDim() {
        System.out.println("Width and height are " +
                           width + " and " + height);
    }
}

// A subclass of TwoDShape for Rectangles.
class Rectangle extends TwoDShape {

    Rectangle() {
        super();
    }

    Rectangle(double w, double h) {
        super(w, h);
    }

    Rectangle(double x) {
        super(x);
    }

    boolean isSquare() {
        return getWidth() == getHeight();
    }

    double area() {
        return getWidth() * getHeight();
    }
}

// A subclass of TwoDShape for Triangles.
class Triangle extends TwoDShape {
    private String style;

    Triangle() {
        super();
        style = "none";
    }

    Triangle(String s, double w, double h) {
        super(w, h);
        style = s;
    }

    Triangle(double x) {
        super(x);
        style = "filled";
    }

    Triangle(Triangle ob) {
        super(ob);
        style = ob.style;
    }

    double area() {
        return getWidth() * getHeight() / 2;
    }

    void showStyle() {
        System.out.println("Triangle is " + style);
    }
}

class ColorTriangle extends Triangle {
    private String color;

    ColorTriangle (String c, String s,
                   double w, double h) {
        super(s, w, h);
        color = c;
    }

    ColorTriangle(ColorTriangle ob) {
        super(ob);
        color = ob.color;
    }

    String getColor() {
        return color;
    }

    void setColor(String c) {
        color = c;
    }

    void showColor() {
        System.out.println("Color is: " + color);
    }
}

class Shapes {
    public static void main(String args[]) {
        Triangle t1 = new Triangle("outlined", 8.0, 12.0);
        Triangle t2 = new Triangle(t1);


        System.out.println("Info for t1: ");
        t1.showStyle();
        t1.showDim();
        System.out.println("Area is " + t1.area());

        System.out.println();

        System.out.println("Info for t2: ");
        t2.showStyle();
        t2.showDim();
        System.out.println("Area is " + t2.area());

        System.out.println();
    }
}

package ThucHanh;

public class HeDoiTuongHinhHoc {
    public static void main(String[] args) {
        // circle
        Circle circle = new Circle();
        System.out.println(circle);

        circle = new Circle(3.5);
        System.out.println(circle);

        circle = new Circle("red", true, 3.5);
        System.out.println(circle);

        double area = circle.getArea();
        System.out.println(area);

        double primeter = circle.getPrimeter();
        System.out.println(primeter);


        //Rectangle
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);

        rectangle = new Rectangle(1.2,3.5);
        System.out.println(rectangle);

        rectangle = new Rectangle("red",true,2.3,3.8);
        System.out.println(rectangle);

        double areaOrectangle = rectangle.getArea();
        System.out.println(areaOrectangle);

        double primeterOrectangle = rectangle.getPrimeter();
        System.out.println(primeterOrectangle);

        //Square
        Square square = new Square();
        System.out.println(square);

        square = new Square(5);
        System.out.println(square);

        square = new Square(3, "red", true);
        System.out.println(square);

        double areaOsuare = square.getArea();
        System.out.println(areaOsuare);
        double primeterOfsquare = square.getPrimeter();
        System.out.println(primeterOfsquare);
    }
}

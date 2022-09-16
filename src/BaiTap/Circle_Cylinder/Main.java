package BaiTap.Circle_Cylinder;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(12,"black");
        System.out.println(circle);
        System.out.println(circle.DienTich());

        Cylinder cylinder = new Cylinder(21,"red",10);
        System.out.println(cylinder);
        System.out.println(cylinder.thetich());
    }
}

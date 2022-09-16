package BaiTap.Circle_Cylinder;

public class Cylinder extends Circle{
    private double chieucao;

    public Cylinder() {
    }

    public Cylinder(double chieucao) {
        this.chieucao = chieucao;
    }

    public Cylinder(double radius, String color, double chieucao) {
        super(radius, color);
        this.chieucao = chieucao;
    }

    public double getChieucao() {
        return chieucao;
    }

    public void setChieucao(double chieucao) {
        this.chieucao = chieucao;
    }

    public double thetich(){
        return Math.PI*getRadius()*getRadius()*chieucao;
    }

    @Override
    public String toString() {
        return super.toString() +
                "chieucao=" + chieucao ;
    }
}

package HinhTron;

public class Circle {
    private double radius;
   public Circle(){
       this.radius=0;
   }
    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(){
       return Math.PI*radius*radius;
    }
    public double getPrimeter(){
       return 2*Math.PI*radius;
    }
}


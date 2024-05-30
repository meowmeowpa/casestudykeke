public class hinhtron {
    double radius;
    String color;

    hinhtron(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return 3.14 * radius * radius;
    }

    public static void main(String[] args) {
        hinhtron hinhtron1 = new hinhtron(5);
        System.out.println(hinhtron1.getArea());
    }
}

package HinhTron;

public class main {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0);
        System.out.println("Bán kính:" + circle.getRadius());
        System.out.println("Diên tích:" + circle.getArea());
        System.out.println("Chu vi :" + circle.getPrimeter());
    }

}
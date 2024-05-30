package AdamEva;

public class main {
    public static void main(String[] args) {
        Human adam= new Human("adam",true,100);
        Human eva= new Human("Eva",false,16);
        Apple apple= new Apple();
        adam.say("ăn k");
        eva.say("có");
        adam.eat(apple);
        eva.eat(apple);
        System.out.println("khối lượng của adam :"+adam.getWeight());
    }
}

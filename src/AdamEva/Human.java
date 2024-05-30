package AdamEva;

public class Human {
    private  String name;
    private boolean gender;
    private int weight;
    public Human(){}

    public Human(String name, boolean gender, int weight) {
        this.name = name;
        this.gender = gender;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
    public void say(String word){
        System.out.println(word);
    }
    public void eat(Apple apple){
        if (apple.isEmpty()){
            System.out.println(name+"đã ăn");
            apple.decrease();
            weight++;
        }else {
            System.out.println("đã ăn hết");
        }
    }
}

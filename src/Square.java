public class Square {
    public int size;
    public Square(int size ){
        this.size=size;

    }
    public int getArea(){
        return this.size*2;
    }
    public int getPerimeter(){
        return  this.size*4;
    }
}

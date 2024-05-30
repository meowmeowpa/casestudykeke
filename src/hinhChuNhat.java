public class hinhChuNhat {
    double leng;
    double weight;


    public hinhChuNhat(double leng, double weight) {
        this.leng = leng;
        this.weight = weight;
    }

    public hinhChuNhat() {
    }



    public double dienTich(){
        return  this.leng*this.weight;
    }




}
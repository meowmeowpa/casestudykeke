package nhietd0;

public class ChuyenNhietDo {//danh tu
    double degree;//private

    public ChuyenNhietDo(double degree) {
        this.degree = degree;
    }

    public ChuyenNhietDo() {
    }
    public double doF(){
        return (this.degree*9/5)+ 32;
    }
    public double kevin(){//dong tu
        return (this.degree+273.15);
    }
}

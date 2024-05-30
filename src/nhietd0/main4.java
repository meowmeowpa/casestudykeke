package nhietd0;

import nhietd0.ChuyenNhietDo;

public class main4 {//viet hoa
    public static void main(String[] args) {
        ChuyenNhietDo ChuyenNhiet= new ChuyenNhietDo(24);
        System.out.println(" do C sang do F la :" + ChuyenNhiet.doF());
        System.out.println(" do C sang do Kevin la : "+ ChuyenNhiet.kevin());
    }
}

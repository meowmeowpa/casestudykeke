package BaiTapThayNhat;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("Moi nhap san pham can them.");
            String sanPham = scanner.nextLine();
            System.out.println("Moi nhap gia cua san pham nay.");
            double giaSanPham = new Scanner(System.in).nextDouble();
            System.out.println("Moi nhap so luong san pham con ton.");
            int soLuongSanPham = new Scanner(System.in).nextInt();
//
            Product product = new Product(sanPham, giaSanPham, soLuongSanPham);
            Shop shop = new Shop();
            shop.addProduct(product);



            System.out.println("cua hang dang co sp sau:");
            shop.show();

        }

    }


}

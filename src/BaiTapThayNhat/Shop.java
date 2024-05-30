package BaiTapThayNhat;

import java.util.Arrays;

public class Shop {
    Product[] product = new Product[0];


    public Product[] addProduct(Product newProduct){
        Product[] newArrayProduct = new Product[product.length + 1];
        newArrayProduct[0] = newProduct;
        System.arraycopy(product, 0, newArrayProduct, 1, product.length);
        product = newArrayProduct;
        return product;
    }

    public Product[] searchPro(String produo) {
        for (int i = 0; i < product.length; i++) {
            if (product.equals(produo)) {
                System.out.println("co trong danh sach");
            } else {
                return null;
            }
        }
        return null;
    }

    public void show() {
        for (Product pro : product) {
            System.out.println(pro.toString());
        }
    }
}

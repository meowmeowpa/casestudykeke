package Phone;

public class Main {
    public static void main(String[] args) {
        Phone iphone14= new Phone("Iphone 14",13.33,4);
        Phone samsungS23Ultra= new Phone("Samsung S23 Ultra", 3.66,3);
        Phone xiaomiK15Pro= new Phone("xiaomi", 2.55,4);


        ManagerPhone managerPhone= new ManagerPhone();

        managerPhone.addPhone(iphone14);
        managerPhone.addPhone(samsungS23Ultra);
        managerPhone.addPhone(xiaomiK15Pro);

//        managerPhone.displayListPhone();
//  
//        System.out.println(" giá của sản phẩm : "+ managerPhone.findPricePhoneWithPhoneName("Iphone14"));
//        managerPhone.removePhoneWithPhoneName("Iphone14");
//        managerPhone.displayListPhone();

//        if (managerPhone.removePhoneWithPhoneName("Iphone14")){
//            System.out.println("da xoa dien thoai thanh cong ");
//            System.out.println("danh sach dien thoai hien tai la");
//            managerPhone.displayListPhone();
//        };
        managerPhone.sortPhoneWithPrice(false);
        managerPhone.displayListPhone();
        System.out.println("tong gia tri cua hang la" + managerPhone.calculateTotalPrice());
    }
}

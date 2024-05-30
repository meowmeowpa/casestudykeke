package ThucHanh1;

public class Student {
    private int roll;
    private String name;
    private static String college="BBDIT";
    //hàm tạo để khởi tạo biến


    public Student(int roll, String name) {
        this.roll = roll;
        this.name = name;
    }
    //phương thức tĩnh để thay đổi giá trị của biến tĩnh
    static void change(){
        college="Hello";
    }
    //phương thức hiển thị gía trị
    void display(){
        System.out.println(roll+" "+ name+ " " + college+" ");
    }
}

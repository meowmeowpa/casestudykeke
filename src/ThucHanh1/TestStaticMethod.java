package ThucHanh1;

public class TestStaticMethod {
    public static void main(String[] args) {
        Student.change();
        Student s1= new Student(123,"Phương Anh");
        Student s2 = new Student(345,"Ánh Phương");
        Student s3=new Student(567,"Lin phương");


        s1.display();
        s2.display();
        s3.display();
    }

}

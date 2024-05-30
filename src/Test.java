public class Test {
    public class Person {
        private String name;
        private int age;

        public int getAge() {
            return this.age;
        }

        public void setAge(int newAge){
            this.age = newAge;
        }

        public void move(){
            System.out.println("dang di");
        }

        public void setName(String newName) {
            this.name = newName;
        }

        public String getName(){
            return this.name;
        }

        public Person() {
        }

        public Person(String name) {
            this.name = name;
        }

        public Person(int age) {
            this.age = age;
        }


        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public void fight(){
            System.out.println("danh nguoi");
        }
    }
}

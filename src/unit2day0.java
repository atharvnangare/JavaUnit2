package Unit2;

class Student {
    int roll_no;
    int phone_no;
    char gender;
    String name;
    String email;

    public Student(int roll_no, String email, String name, char gender, int phone_no) {
        this.roll_no = roll_no;
        this.email = email;
        this.name = name;
        this.gender = gender;
        this.phone_no = phone_no;
    }

    public Student() {
        System.out.println("Default Constructor");
    }
}

public class unit2day0 {
    public static void main(String[] args) {
        System.out.println("hello");
        Student Atharv = new Student();
        Atharv.roll_no = 26;
        Atharv.phone_no = 1234;
        Atharv.gender = 'm';
        Atharv.name = "Atharv";
        Atharv.email = "atharv@gmail.com";

        System.out.println(Atharv.roll_no);
        System.out.println(Atharv.email);


        Student obj = new Student(26, "atharv@gmail.com", "Atharv", 'M', 9699);
        System.out.println(obj.roll_no);
    }
}

package Unit2;

class sample{
    public void print(int a){
        System.out.println("int -" + a);
    }
    public void print(double a){
        System.out.println("double -" + a);
    }
    public void print(String a){
        System.out.println("String -" + a);
    }

}
public class overloading {
    public static void main(String[] args) {
        sample obj = new sample();
        obj.print(10);
        obj.print(10.2);
        obj.print("abc");
    }
}

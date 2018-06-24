package chapter5;

public class Task14 {
    static String str = "string";
    static int k;
    static{
        k = 10;
    }

    public static void main(String[] args) {
        print();
    }

    static void print(){
        System.out.println("field str = " + str);
        System.out.println("field k = " + k);
    }
}

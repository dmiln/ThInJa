package chapter5;

public class T20 {

    public static void main(String... args) {
        for (String a : args){
            System.out.println(a + " ");
        }
    }

    public static class TestT20{
        public static void main(String[] args) {
            T20.main("f","t","p");
            T20.main("3","23","1");
        }
    }
}

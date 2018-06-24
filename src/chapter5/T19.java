package chapter5;

public class T19 {

    public static void main(String[] args) {
        new T19().run();
    }

    private void run(){
        String[] str = new String[]{"third", "second", "first"};
        testString("first","second");
        testString(str);
        testString();
    }

    private void testString(String... strings){
        for(String s : strings) {
            System.out.print(s + " ");
        }
        if (strings.length > 0) {
            System.out.println();
        }
    }
}

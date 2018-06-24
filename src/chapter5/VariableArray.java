package chapter5;

public class VariableArray {

    public static void main(String[] args) {
        new VariableArray().run();
    }

    private void run() {
        printArray(1, "first");
        printArray(2, "first second");
        printArray(5);

        f(1, 2, 10);
        f(1, 10);
        f();
        f();
    }

    private void printArray(int i, String... strings) {
        System.out.print("necessary: " + i);
        for (String s : strings) {
            System.out.print(", unnecessary: ");
            System.out.println(" " + s);
        }
    }

    private void f(Integer... args) {
        System.out.print("f(");
        for (Integer ints : args) {
            System.out.print(" " + ints + "");
        }
        System.out.println(")");
    }
}

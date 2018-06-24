package chapter5;

import java.util.Random;

public class T17 {
    private T17(String s){
        System.out.println("str = " + s);
    }

    private static class TestT17{
        public static void main(String[] args) {
            T17[]  ar = new T17[5];

            for (T17 t : ar){
                t = new T17(new Random().nextInt(15) + "");
            }
        }
    }
}

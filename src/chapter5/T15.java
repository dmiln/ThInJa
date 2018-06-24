package chapter5;

import java.util.Arrays;
import java.util.Random;

public class T15{

    public static void main(String[] args) {
        new T15().run();
    }

    private void run(){
        int[] a = new int[new Random().nextInt(20)];
        System.out.println("length a = " + a.length);
        for (int i = 0; i < a.length; i++){
            Random r = new Random();
            a[i] = r.nextInt(100);
        }
        System.out.println(Arrays.toString(a));
    }
}

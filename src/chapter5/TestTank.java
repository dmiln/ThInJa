package chapter5;

public class TestTank {
    public static void main(String[] args) {
        new TestTank().run();
    }

    private void run(){
        Tank t1 = new Tank(2);
        Tank t2 = new Tank(5);
        Tank t3 = new Tank(20);
        Tank t4 = new Tank(0);

        new Tank(5);
        new Tank(15);
        new Tank(0);
        new Tank(10).freeTank();

        t1 = t2;

        t1.freeTank();
        t3.freeTank();

        System.gc();
    }
}

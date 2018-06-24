package chapter5;

public class Tank {

    private int capacity = 0;

    Tank(int capacity){
        this.capacity = capacity;
    }

    void freeTank(){
        capacity = 0;
    }

    public void finalize(){
        if(capacity > 0){
            System.out.println("Error: capacity ");
        }
    }
}

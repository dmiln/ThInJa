package chapter5;

public class Task10_11 {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++){
            new UseFialize();
        }
        System.gc();
    }


    protected static class UseFialize{
        static int id = 1;
        int objId;

        UseFialize(){
            System.out.println("obj " + id);
            this.objId = id;
            id++;
        }

        public void finalize(){
            System.out.println("finalize method for obj" + objId);
        }
    }
}

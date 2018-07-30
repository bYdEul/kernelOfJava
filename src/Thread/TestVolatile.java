package Thread;

import testStatic.Test;

import java.util.concurrent.ThreadLocalRandom;

public class TestVolatile extends Thread {
     volatile boolean status = false;

     public void changeStatus(){
         status = true;
     }

     public void run(){
         if(status)
             //System.out.println(status);
             System.out.println("running...");
     }

    public static void main(String[] args) {
        TestVolatile t1 = new TestVolatile();
        TestVolatile t2 = new TestVolatile();
        TestVolatile t3 = new TestVolatile();
        t1.setPriority(MAX_PRIORITY);
        t1.changeStatus();
        t1.start();
        t2.start();
        t3.start();
    }
}

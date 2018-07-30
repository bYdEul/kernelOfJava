package Thread;

import java.util.concurrent.CountDownLatch;

public class Counter {
//    public static int num =0;
    public volatile static int num = 0;
    static CountDownLatch countDownLatch = new CountDownLatch(30);
    static {
        System.out.println("hello I'm static");
    }
    {
        System.out.println("hello 我是构造语句块");
    }

    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 1000; i++) {
            new Thread(() -> {
                for (int j = 0; j < 10000; j++) {
                    //System.out.println(num++);
                    num++;
                }
                countDownLatch.countDown();
            }).start();
        }
        countDownLatch.await();
        System.out.println(num);
        System.out.println("bYd");
        System.out.println("5"+2);
        {
            System.out.println("hello 构造语句块");;
        }
    }
}

//package Thread;
//
//public class ContextSwitchTest { //核心线程上下文切换
//    private static final long count = 10000;
//
//    public static void main(String[] args) {
//        concurrency();
//        serial();
//
//
//    }
//
//    private static void concurrency() throws InterruptedException
//    {
//        long start = System.currentTimeMillis();
//        Thread thread = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                int a = 0;
//                for(int i=0; i<count; i++) {
//                    a += 5;
//                }
//            }
//        });
//        thread.start();
//
//        int b = 0;
//        for(long i = 0;i < count; i++) {
//            b--;
//        }
//        thread.join();
//        long time = System.currentTimeMillis() - start;
//        System.out.println("Concurrency:"+time+"ms, b="+b);
//    }
//
//    public static void serial(){
//        long start = System.currentTimeMillis();
//        int a = 0;
//        for(long i=0; i<count; i++) {
//            a += 5;
//        }
//        int b = 0;
//        for(int i=0; i < count; i++){
//            b --;
//        }
//        long time = System.currentTimeMillis() - start;
//        System.out.println("Serial:"+time+"ms, b="+b+",a="+a);
//    }
//}

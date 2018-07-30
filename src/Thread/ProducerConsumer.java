package Thread;

public class ProducerConsumer {
    static final int N=100;
    static producer p = new producer();
    static consumer c = new consumer();
    static our_monitor mon = new our_monitor();

    public static void main(String[] args) {
        p.start();
        c.start();
    }

    static class producer extends Thread{
        public void run(){
            int item;
            while(true){
                item = produce_item();
                mon.insert(item);
            }
        }
        private int produce_item(){
            //item ++;
            System.out.println("producing");
            return 0;}
    }

    static class consumer extends Thread{
        public void run(){
            int item;
            while(true){
                item = mon.remove();
                consume_item(item);
            }
        }
        private void consume_item(int item){
            item --;
            System.out.println(item+"is being cosuming");
        }
    }

    static class our_monitor{
        private int buffer[] = new int[N];
        private int count = 0, lo = 0, hi = 0;

        public synchronized void insert(int val){
            if(count == N) go_to_sleep();
            buffer[hi] = val;
            hi = (hi+1)%N;
            count = count + 1;
            if(count == 1) notify();     //sychronnized means all resources[buffer[],count,lo,hi] is used,so another thread fails
        }

        public synchronized int remove(){
            int val;
            if(count == 0) go_to_sleep();
            val = buffer[lo];
            lo = (lo+1)%N;
            count = count - 1;
            if(count == N-1) notify();
            return val;
        }

        private void go_to_sleep(){
            try{
                wait();                     //difference between wait() and sleep();
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}

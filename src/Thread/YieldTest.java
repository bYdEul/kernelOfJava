package Thread;

import javax.sound.midi.MidiChannel;

public class YieldTest extends Thread {
    public YieldTest(String nme){
        super(nme);
        //this.nme = nme;
    }

    public void run(){
        for(int i=0;i<50;i++)
        {
            System.out.println(" "+this.getName()+" "+"num="+i);
            if(i==30)
                this.yield();
        }
    }

    public static void main(String[] args) {
        YieldTest bYd = new YieldTest("bYd");
        YieldTest YYf = new YieldTest("YYf");
        YieldTest FYY = new YieldTest("FYY");
        bYd.setPriority(MAX_PRIORITY);
        bYd.start();

        YYf.setPriority(MIN_PRIORITY);
        YYf.start();

        FYY.setPriority(MIN_PRIORITY);
        FYY.start();
    }
}

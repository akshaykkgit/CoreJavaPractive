package akshay.thread;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class CyclickBarrierTest {
	
	public static void main(String args[]) throws InterruptedException, BrokenBarrierException {
        CyclicBarrier barrier = new CyclicBarrier(5);
        Party first = new Party(1000, barrier, "PARTY-1");
        Party second = new Party(2000, barrier, "PARTY-2");
        Party third = new Party(3000, barrier, "PARTY-3");
        Party fourth = new Party(4000, barrier, "PARTY-4");
        Party fifth = new Party(3000, barrier, "PARTY-5");
        Party sixth = new Party(4000, barrier, "PARTY-6");
        first.start();
        second.start();
        third.start();
        fourth.start();
        fifth.start();
        sixth.start();
        System.out.println(Thread.currentThread().getName() + " has finished");


}
}

class Party extends Thread {
    private int duration;
    private CyclicBarrier barrier;
    public Party(int duration, CyclicBarrier barrier, String name) {
        super(name);
        this.duration = duration;
        this.barrier = barrier;
    }
    @Override public void run() {
        try {
            Thread.sleep(duration);
           // barrier.reset();
            System.out.println(Thread.currentThread().getName() + " is calling await()");
            barrier.await();
            System.out.println(Thread.currentThread().getName() + " has started running again");
        } catch (InterruptedException | BrokenBarrierException e) {
            e.printStackTrace();
        }
    }
}

package Thread;

import java.lang.management.ThreadInfo;

public class ThreadDemo {
    public static void main(String[] args) {
        System.out.println("Starting Thread " + Thread.currentThread().getName());
        Thread.currentThread().setName("Pookie");
        System.out.println("Starting Thread " + Thread.currentThread().getName());
        Thread myThread = new Thread();
        myThread.start();
        myThread.setName("Pookie2");
        System.out.println("Active Threads " + Thread.activeCount());
        System.out.println("Waiting for " + myThread.getName() + " to finish");
        for (Thread t : Thread.getAllStackTraces().keySet()) {
            System.out.println(t.getName() + ", " + t.isDaemon() + ", " + t.getState()+ " , "+ t.getClass());
        }
    }
}

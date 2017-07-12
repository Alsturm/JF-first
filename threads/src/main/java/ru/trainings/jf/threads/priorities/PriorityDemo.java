package ru.trainings.jf.threads.priorities;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class PriorityDemo {
    public static void main(String args[]) {

        Thread.currentThread().setPriority(Thread.MAX_PRIORITY);

        Clicker hi = new Clicker();
        Clicker lo = new Clicker();

        hi.setPriority(Thread.MAX_PRIORITY);
        lo.setPriority(Thread.MIN_PRIORITY);

        lo.start();
        hi.start();

        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
            log.info("Main thread interrupted.");
        }

        lo.stopClick();
        hi.stopClick();

        try {
            hi.join();
            lo.join();
        } catch (InterruptedException e) {
            log.info("InterruptedException caught");
        }
        log.info("Low-priority thread: {}", lo.click);
        log.info("High-priority thread {}", hi.click);
    }

}

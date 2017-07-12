package ru.trainings.jf.threads;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class GetStateDemo implements Runnable {

    @Override
    public void run() {
        log.info("{} {}",
                Thread.currentThread().getName(),
                Thread.currentThread().getState());
    }

    public static void main(String... args) throws InterruptedException {
        Thread th1 = new Thread(new GetStateDemo());
        th1.start();
        Thread.sleep(1_000);
        Thread.State state = th1.getState();
        log.info("{} {}", th1.getName(), state);
    }
}
